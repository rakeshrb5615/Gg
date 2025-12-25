package com.google.android.gms.cloudmessaging;
public abstract class CloudMessagingReceiver extends android.content.BroadcastReceiver {
    private static ref.SoftReference zza;
    private static ref.SoftReference zzb;

    public CloudMessagingReceiver()
    {
        return;
    }

    private final int zzb(android.content.Context p4, android.content.Intent p5)
    {
        android.os.Bundle v1_3 = ((android.app.PendingIntent) p5.getParcelableExtra("pending_intent"));
        if (v1_3 != null) {
            try {
                v1_3.send();
            } catch (android.app.PendingIntent$CanceledException) {
                android.util.Log.e("CloudMessagingReceiver", "Notification pending intent canceled");
            }
        }
        android.os.Bundle v1_0 = p5.getExtras();
        if (v1_0 == null) {
            v1_0 = new android.os.Bundle();
        } else {
            v1_0.remove("pending_intent");
        }
        if (!java.util.Objects.equals(p5.getAction(), "com.google.firebase.messaging.NOTIFICATION_DISMISS")) {
            android.util.Log.e("CloudMessagingReceiver", "Unknown notification action");
            return 500;
        } else {
            this.onNotificationDismissed(p4, v1_0);
            return -1;
        }
    }

    public java.util.concurrent.Executor getBroadcastExecutor()
    {
        java.util.concurrent.ExecutorService v1_3;
        java.util.concurrent.ExecutorService v1_0 = com.google.android.gms.cloudmessaging.CloudMessagingReceiver.zza;
        if (v1_0 == null) {
            v1_3 = 0;
        } else {
            v1_3 = ((java.util.concurrent.ExecutorService) v1_0.get());
        }
        if (v1_3 == null) {
            com.google.android.gms.internal.cloudmessaging.zze.zza();
            v1_3 = java.util.concurrent.Executors.unconfigurableExecutorService(java.util.concurrent.Executors.newCachedThreadPool(new com.google.android.gms.common.util.concurrent.NamedThreadFactory("firebase-iid-executor")));
            com.google.android.gms.cloudmessaging.CloudMessagingReceiver.zza = new ref.SoftReference(v1_3);
        }
        return v1_3;
    }

    public abstract int onMessageReceive();

    public void onNotificationDismissed(android.content.Context p1, android.os.Bundle p2)
    {
        return;
    }

    public final void onReceive(android.content.Context p8, android.content.Intent p9)
    {
        if (p9 != null) {
            this.getBroadcastExecutor().execute(new com.google.android.gms.cloudmessaging.zzh(this, p9, p8, this.isOrderedBroadcast(), this.goAsync()));
            return;
        } else {
            return;
        }
    }

    public final synthetic void zza(android.content.Intent p17, android.content.Context p18, boolean p19, android.content.BroadcastReceiver$PendingResult p20)
    {
        String v4_0;
        String v4_7 = p17.getParcelableExtra("wrapped_intent");
        java.util.concurrent.TimeUnit v6_1 = 0;
        if (!(v4_7 instanceof android.content.Intent)) {
            v4_0 = 0;
        } else {
            v4_0 = ((android.content.Intent) v4_7);
        }
        String v0_9;
        if (v4_0 == null) {
            if (p17.getExtras() != null) {
                String v4_3 = new com.google.android.gms.cloudmessaging.CloudMessage(p17);
                String v0_2 = new java.util.concurrent.CountDownLatch(1);
                java.util.concurrent.ThreadPoolExecutor v8_0 = com.google.android.gms.cloudmessaging.CloudMessagingReceiver.zzb;
                if (v8_0 != null) {
                    v6_1 = ((java.util.concurrent.Executor) v8_0.get());
                }
                if (v6_1 == null) {
                    com.google.android.gms.internal.cloudmessaging.zze.zza();
                    java.util.concurrent.ThreadPoolExecutor v8_2 = new java.util.concurrent.ThreadPoolExecutor(1, 1, 60, java.util.concurrent.TimeUnit.SECONDS, new java.util.concurrent.LinkedBlockingQueue(), new com.google.android.gms.common.util.concurrent.NamedThreadFactory("pscm-ack-executor"));
                    v8_2.allowCoreThreadTimeOut(1);
                    v6_1 = java.util.concurrent.Executors.unconfigurableExecutorService(v8_2);
                    com.google.android.gms.cloudmessaging.CloudMessagingReceiver.zzb = new ref.SoftReference(v6_1);
                }
                v6_1.execute(new com.google.android.gms.cloudmessaging.zzg(p18, v4_3, v0_2));
                int v2_1 = this.onMessageReceive(p18, v4_3);
                try {
                    if (!v0_2.await(java.util.concurrent.TimeUnit.SECONDS.toMillis(1), java.util.concurrent.TimeUnit.MILLISECONDS)) {
                        android.util.Log.w("CloudMessagingReceiver", "Message ack timed out");
                    }
                } catch (String v0_5) {
                    android.util.Log.w("CloudMessagingReceiver", "Message ack failed: ".concat(v0_5.toString()));
                }
                v0_9 = v2_1;
            } else {
                v0_9 = 500;
            }
        } else {
            v0_9 = this.zzb(p18, v4_0);
        }
        if ((p19) && (p20 != null)) {
            p20.setResultCode(v0_9);
        }
        if (p20 != null) {
            p20.finish();
        }
        return;
    }
}
