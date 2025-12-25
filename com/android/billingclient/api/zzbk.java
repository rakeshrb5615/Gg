package com.android.billingclient.api;
final class zzbk extends com.google.android.gms.internal.play_billing.zzae {
    final ref.WeakReference zza;
    final android.os.ResultReceiver zzb;

    public synthetic zzbk(ref.WeakReference p1, android.os.ResultReceiver p2, com.android.billingclient.api.zzbp p3)
    {
        this.zza = p1;
        this.zzb = p2;
        return;
    }

    public final void zza(android.os.Bundle p10)
    {
        if (p10 != null) {
            if (p10.containsKey("RESPONSE_CODE")) {
                StringBuilder v2_6 = com.google.android.gms.internal.play_billing.zzc.zzb(p10, "BillingClient");
                if (v2_6 == null) {
                    android.os.ResultReceiver v10_2 = ((android.app.PendingIntent) p10.getParcelable("EXTERNAL_PAYMENT_DIALOG_INTENT"));
                    if (v10_2 != null) {
                        try {
                            String v5_2 = ((android.app.Activity) this.zza.get());
                            android.content.Intent v6_1 = new android.content.Intent(v5_2, com.android.billingclient.api.ProxyBillingActivityV2);
                            v6_1.putExtra("external_payment_dialog_result_receiver", this.zzb);
                            v6_1.putExtra("external_payment_dialog_pending_intent", v10_2);
                            v5_2.startActivity(v6_1);
                            return;
                        } catch (android.os.ResultReceiver v10_3) {
                            com.google.android.gms.internal.play_billing.zzc.zzo("BillingClient", "Runtime error while launching intent for the external offer dialog.", v10_3);
                            android.os.Bundle v3_1 = new android.os.Bundle();
                            v3_1.putInt("RESPONSE_CODE", 6);
                            v3_1.putString("DEBUG_MESSAGE", "An internal error occurred.");
                            v3_1.putInt("INTERNAL_LOG_ERROR_REASON", com.google.android.gms.internal.play_billing.zzie.zzaK.zza());
                            String v1_4 = v10_3.getClass().getName();
                            android.os.ResultReceiver v10_5 = com.google.android.gms.internal.play_billing.zzbj.zzb(v10_3.getMessage());
                            StringBuilder v2_5 = new StringBuilder();
                            v2_5.append(v1_4);
                            v2_5.append(": ");
                            v2_5.append(v10_5);
                            v3_1.putString("INTERNAL_LOG_ERROR_ADDITIONAL_DETAILS", v2_5.toString());
                            this.zzb.send(6, v3_1);
                            return;
                        }
                    } else {
                        com.google.android.gms.internal.play_billing.zzc.zzn("BillingClient", "The PendingIntent for the external offer dialog is null");
                        android.os.ResultReceiver v10_10 = new android.os.Bundle();
                        v10_10.putInt("RESPONSE_CODE", 6);
                        v10_10.putString("DEBUG_MESSAGE", "An internal error occurred.");
                        this.zzb.send(6, v10_10);
                        return;
                    }
                } else {
                    android.os.ResultReceiver v0_2 = new StringBuilder("Unable to launch intent for external offer dialog");
                    v0_2.append(v2_6);
                    com.google.android.gms.internal.play_billing.zzc.zzn("BillingClient", v0_2.toString());
                    this.zzb.send(v2_6, p10);
                    return;
                }
            } else {
                com.google.android.gms.internal.play_billing.zzc.zzn("BillingClient", "Response bundle doesn\'t contain a response code");
                this.zzb.send(6, p10);
                return;
            }
        } else {
            this.zzb.send(6, 0);
            return;
        }
    }
}
