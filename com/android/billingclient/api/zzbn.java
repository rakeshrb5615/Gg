package com.android.billingclient.api;
final class zzbn extends com.google.android.gms.internal.play_billing.zzan {
    final ref.WeakReference zza;
    final android.os.ResultReceiver zzb;

    public synthetic zzbn(ref.WeakReference p1, android.os.ResultReceiver p2, com.android.billingclient.api.zzbp p3)
    {
        this.zza = p1;
        this.zzb = p2;
        return;
    }

    public final void zza(android.os.Bundle p8)
    {
        String v0_0 = this.zzb;
        if (v0_0 != null) {
            if (p8 != null) {
                android.app.Activity v4_2 = ((android.app.Activity) this.zza.get());
                java.util.concurrent.CancellationException v8_2 = ((android.app.PendingIntent) p8.getParcelable("KEY_LAUNCH_INTENT"));
                if ((v4_2 != null) && (v8_2 != null)) {
                    try {
                        android.content.Intent v5_2 = new android.content.Intent(v4_2, com.android.billingclient.api.ProxyBillingActivity);
                        v5_2.putExtra("in_app_message_result_receiver", v0_0);
                        v5_2.putExtra("IN_APP_MESSAGE_INTENT", v8_2);
                        v4_2.startActivity(v5_2);
                        return;
                    } catch (java.util.concurrent.CancellationException v8_3) {
                        this.zzb.send(0, 0);
                        com.google.android.gms.internal.play_billing.zzc.zzo("BillingClient", "Exception caught while launching intent for in-app messaging.", v8_3);
                        return;
                    }
                } else {
                    v0_0.send(0, 0);
                    com.google.android.gms.internal.play_billing.zzc.zzn("BillingClient", "Unable to launch intent for in-app messaging");
                    return;
                }
            } else {
                v0_0.send(0, 0);
                return;
            }
        } else {
            com.google.android.gms.internal.play_billing.zzc.zzn("BillingClient", "Unable to send result for in-app messaging");
            return;
        }
    }
}
