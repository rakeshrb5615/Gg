package com.google.android.gms.cloudmessaging;
public class Rpc {
    private static int zza;
    private static android.app.PendingIntent zzb;
    private static final java.util.concurrent.Executor zzc;
    private static final java.util.regex.Pattern zzd;
    private final r.j zze;
    private final android.content.Context zzf;
    private final com.google.android.gms.cloudmessaging.zzw zzg;
    private final java.util.concurrent.ScheduledExecutorService zzh;
    private final android.os.Messenger zzi;
    private android.os.Messenger zzj;
    private com.google.android.gms.cloudmessaging.zzd zzk;

    static Rpc()
    {
        com.google.android.gms.cloudmessaging.Rpc.zzc = com.google.android.gms.cloudmessaging.zzy.zza;
        com.google.android.gms.cloudmessaging.Rpc.zzd = java.util.regex.Pattern.compile("\\|ID\\|([^|]+)\\|:?+(.*)");
        return;
    }

    public Rpc(android.content.Context p5)
    {
        this.zze = new r.j(0);
        this.zzf = p5;
        this.zzg = new com.google.android.gms.cloudmessaging.zzw(p5);
        this.zzi = new android.os.Messenger(new com.google.android.gms.cloudmessaging.zzae(this, android.os.Looper.getMainLooper()));
        java.util.concurrent.ScheduledThreadPoolExecutor v5_3 = new java.util.concurrent.ScheduledThreadPoolExecutor(1);
        v5_3.setKeepAliveTime(60, java.util.concurrent.TimeUnit.SECONDS);
        v5_3.allowCoreThreadTimeOut(1);
        this.zzh = v5_3;
        return;
    }

    public static synthetic com.google.android.gms.tasks.Task zza(android.os.Bundle p1)
    {
        if (!com.google.android.gms.cloudmessaging.Rpc.zzi(p1)) {
            return com.google.android.gms.tasks.Tasks.forResult(p1);
        } else {
            return com.google.android.gms.tasks.Tasks.forResult(0);
        }
    }

    public static void zzc(com.google.android.gms.cloudmessaging.Rpc p7, android.os.Message p8)
    {
        if (p8 != null) {
            int v0_0 = p8.obj;
            if ((v0_0 instanceof android.content.Intent)) {
                int v0_14 = ((android.content.Intent) v0_0);
                v0_14.setExtrasClassLoader(new com.google.android.gms.cloudmessaging.zzc());
                if (v0_14.hasExtra("google.messenger")) {
                    int v0_5 = v0_14.getParcelableExtra("google.messenger");
                    if ((v0_5 instanceof com.google.android.gms.cloudmessaging.zzd)) {
                        p7.zzk = ((com.google.android.gms.cloudmessaging.zzd) v0_5);
                    }
                    if ((v0_5 instanceof android.os.Messenger)) {
                        p7.zzj = ((android.os.Messenger) v0_5);
                    }
                }
                android.os.Bundle v8_7 = ((android.content.Intent) p8.obj);
                int v0_7 = v8_7.getAction();
                if (java.util.Objects.equals(v0_7, "com.google.android.c2dm.intent.REGISTRATION")) {
                    int v0_9 = v8_7.getStringExtra("registration_id");
                    if (v0_9 == 0) {
                        v0_9 = v8_7.getStringExtra("unregistered");
                    }
                    if (v0_9 != 0) {
                        r.j v4_3 = com.google.android.gms.cloudmessaging.Rpc.zzd.matcher(v0_9);
                        if (v4_3.matches()) {
                            int v0_11 = v4_3.group(1);
                            String v1_13 = v4_3.group(2);
                            if (v0_11 != 0) {
                                android.os.Bundle v8_9 = v8_7.getExtras();
                                v8_9.putString("registration_id", v1_13);
                                p7.zzh(v0_11, v8_9);
                            }
                        } else {
                            if (android.util.Log.isLoggable("Rpc", 3)) {
                                android.util.Log.d("Rpc", "Unexpected response string: ".concat(v0_9));
                                return;
                            }
                        }
                    } else {
                        int v0_13 = v8_7.getStringExtra("error");
                        if (v0_13 != 0) {
                            if (android.util.Log.isLoggable("Rpc", 3)) {
                                android.util.Log.d("Rpc", "Received InstanceID error ".concat(v0_13));
                            }
                            if (!v0_13.startsWith("|")) {
                                int v0_1 = 0;
                                while(true) {
                                    String v1_15 = p7.zze;
                                    if (v0_1 >= v1_15.c) {
                                        break;
                                    }
                                    p7 = p7.zzh(((String) v1_15.g(v0_1)), v8_7.getExtras());
                                    v0_1++;
                                }
                                return;
                            } else {
                                r.j v4_1 = v0_13.split("\\|");
                                if ((v4_1.length > 2) && (java.util.Objects.equals(v4_1[1], "ID"))) {
                                    int v0_2 = v4_1[2];
                                    String v1_1 = v4_1[3];
                                    if (v1_1.startsWith(":")) {
                                        v1_1 = v1_1.substring(1);
                                    }
                                    p7.zzh(v0_2, v8_7.putExtra("error", v1_1).getExtras());
                                    return;
                                } else {
                                    android.util.Log.w("Rpc", "Unexpected structured response ".concat(v0_13));
                                    return;
                                }
                            }
                        } else {
                            android.util.Log.w("Rpc", "Unexpected response, no error or registration id ".concat(String.valueOf(v8_7.getExtras())));
                            return;
                        }
                    }
                } else {
                    if (android.util.Log.isLoggable("Rpc", 3)) {
                        android.util.Log.d("Rpc", "Unexpected response action: ".concat(String.valueOf(v0_7)));
                        return;
                    }
                }
                return;
            }
        }
        android.util.Log.w("Rpc", "Dropping invalid message");
        return;
    }

    private final com.google.android.gms.tasks.Task zze(android.os.Bundle p8)
    {
        String v0 = com.google.android.gms.cloudmessaging.Rpc.zzf();
        com.google.android.gms.tasks.TaskCompletionSource v1_1 = new com.google.android.gms.tasks.TaskCompletionSource();
        this.zze.put(v0, v1_1);
        com.google.android.gms.tasks.Task v2_1 = new android.content.Intent();
        v2_1.setPackage("com.google.android.gms");
        if (this.zzg.zzb() != 2) {
            v2_1.setAction("com.google.android.c2dm.intent.REGISTER");
        } else {
            v2_1.setAction("com.google.iid.TOKEN_REQUEST");
        }
        v2_1.putExtras(p8);
        com.google.android.gms.cloudmessaging.Rpc.zzg(this.zzf, v2_1);
        String v8_4 = new StringBuilder("|ID|");
        v8_4.append(v0);
        v8_4.append("|");
        v2_1.putExtra("kid", v8_4.toString());
        if (android.util.Log.isLoggable("Rpc", 3)) {
            android.util.Log.d("Rpc", "Sending ".concat(String.valueOf(v2_1.getExtras())));
        }
        v2_1.putExtra("google.messenger", this.zzi);
        if ((this.zzj == null) && (this.zzk == null)) {
            if (this.zzg.zzb() != 2) {
                this.zzf.startService(v2_1);
            } else {
                this.zzf.sendBroadcast(v2_1);
            }
        } else {
            String v8_14 = android.os.Message.obtain();
            v8_14.obj = v2_1;
            try {
                java.util.concurrent.TimeUnit v5_2 = this.zzj;
            } catch (android.os.RemoteException) {
                if (!android.util.Log.isLoggable("Rpc", 3)) {
                } else {
                    android.util.Log.d("Rpc", "Messenger failed, fallback to startService");
                }
            }
            if (v5_2 == null) {
                this.zzk.zzb(v8_14);
            } else {
                v5_2.send(v8_14);
            }
        }
        v1_1.getTask().addOnCompleteListener(com.google.android.gms.cloudmessaging.Rpc.zzc, new com.google.android.gms.cloudmessaging.zzad(this, v0, this.zzh.schedule(new com.google.android.gms.cloudmessaging.zzac(v1_1), 30, java.util.concurrent.TimeUnit.SECONDS)));
        return v1_1.getTask();
    }

    private static declared_synchronized String zzf()
    {
        Throwable v1_0 = com.google.android.gms.cloudmessaging.Rpc.zza;
        com.google.android.gms.cloudmessaging.Rpc.zza = (v1_0 + 1);
        return Integer.toString(v1_0);
    }

    private static declared_synchronized void zzg(android.content.Context p4, android.content.Intent p5)
    {
        if (com.google.android.gms.cloudmessaging.Rpc.zzb == null) {
            android.app.PendingIntent v1_3 = new android.content.Intent();
            v1_3.setPackage("com.google.example.invalidpackage");
            com.google.android.gms.cloudmessaging.Rpc.zzb = android.app.PendingIntent.getBroadcast(p4, 0, v1_3, com.google.android.gms.internal.cloudmessaging.zza.zza);
        }
        p5.putExtra("app", com.google.android.gms.cloudmessaging.Rpc.zzb);
        return;
    }

    private final void zzh(String p4, android.os.Bundle p5)
    {
        StringBuilder v2_4 = ((com.google.android.gms.tasks.TaskCompletionSource) this.zze.remove(p4));
        if (v2_4 != null) {
            v2_4.setResult(p5);
            return;
        } else {
            StringBuilder v2_1 = new StringBuilder("Missing callback for ");
            v2_1.append(p4);
            android.util.Log.w("Rpc", v2_1.toString());
            return;
        }
    }

    private static boolean zzi(android.os.Bundle p1)
    {
        if ((p1 == 0) || (!p1.containsKey("google.messenger"))) {
            return 0;
        } else {
            return 1;
        }
    }

    public com.google.android.gms.tasks.Task getProxiedNotificationData()
    {
        if (this.zzg.zza() < 241100000) {
            return com.google.android.gms.tasks.Tasks.forException(new java.io.IOException("SERVICE_NOT_AVAILABLE"));
        } else {
            return com.google.android.gms.cloudmessaging.zzv.zzb(this.zzf).zzd(5, android.os.Bundle.EMPTY).continueWith(com.google.android.gms.cloudmessaging.Rpc.zzc, com.google.android.gms.cloudmessaging.zzab.zza);
        }
    }

    public com.google.android.gms.tasks.Task messageHandled(com.google.android.gms.cloudmessaging.CloudMessage p4)
    {
        if (this.zzg.zza() < 233700000) {
            return com.google.android.gms.tasks.Tasks.forException(new java.io.IOException("SERVICE_NOT_AVAILABLE"));
        } else {
            String v0_2 = new android.os.Bundle();
            v0_2.putString("google.message_id", p4.getMessageId());
            com.google.android.gms.tasks.Task v4_1 = p4.zza();
            if (v4_1 != null) {
                v0_2.putInt("google.product_id", v4_1.intValue());
            }
            return com.google.android.gms.cloudmessaging.zzv.zzb(this.zzf).zzc(3, v0_2);
        }
    }

    public com.google.android.gms.tasks.Task send(android.os.Bundle p4)
    {
        if (this.zzg.zza() >= 12000000) {
            return com.google.android.gms.cloudmessaging.zzv.zzb(this.zzf).zzd(1, p4).continueWith(com.google.android.gms.cloudmessaging.Rpc.zzc, com.google.android.gms.cloudmessaging.zzaa.zza);
        } else {
            if (this.zzg.zzb() == 0) {
                return com.google.android.gms.tasks.Tasks.forException(new java.io.IOException("MISSING_INSTANCEID_SERVICE"));
            } else {
                return this.zze(p4).continueWithTask(com.google.android.gms.cloudmessaging.Rpc.zzc, new com.google.android.gms.cloudmessaging.zzz(this, p4));
            }
        }
    }

    public com.google.android.gms.tasks.Task setRetainProxiedNotifications(boolean p3)
    {
        if (this.zzg.zza() < 241100000) {
            return com.google.android.gms.tasks.Tasks.forException(new java.io.IOException("SERVICE_NOT_AVAILABLE"));
        } else {
            String v0_2 = new android.os.Bundle();
            v0_2.putBoolean("proxy_retention", p3);
            return com.google.android.gms.cloudmessaging.zzv.zzb(this.zzf).zzc(4, v0_2);
        }
    }

    public final synthetic com.google.android.gms.tasks.Task zzb(android.os.Bundle p2, com.google.android.gms.tasks.Task p3)
    {
        if ((!p3.isSuccessful()) || (!com.google.android.gms.cloudmessaging.Rpc.zzi(((android.os.Bundle) p3.getResult())))) {
            return p3;
        } else {
            return this.zze(p2).onSuccessTask(com.google.android.gms.cloudmessaging.Rpc.zzc, com.google.android.gms.cloudmessaging.zzx.zza);
        }
    }

    public final synthetic void zzd(String p2, java.util.concurrent.ScheduledFuture p3, com.google.android.gms.tasks.Task p4)
    {
        this.zze.remove(p2);
        p3.cancel(0);
        return;
    }
}
