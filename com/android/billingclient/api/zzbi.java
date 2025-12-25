package com.android.billingclient.api;
final class zzbi extends com.google.android.gms.internal.play_billing.zzaa {
    final ref.WeakReference zza;
    final android.os.ResultReceiver zzb;

    public synthetic zzbi(ref.WeakReference p1, android.os.ResultReceiver p2, com.android.billingclient.api.zzbp p3)
    {
        this.zza = p1;
        this.zzb = p2;
        return;
    }

    public final void zza(android.os.Bundle p9)
    {
        if (p9 != null) {
            if (p9.containsKey("RESPONSE_CODE")) {
                android.os.Bundle v2_5 = com.google.android.gms.internal.play_billing.zzc.zzb(p9, "BillingClient");
                if (v2_5 == null) {
                    android.app.PendingIntent v4_1 = ((android.app.PendingIntent) p9.getParcelable("ALTERNATIVE_BILLING_ONLY_DIALOG_INTENT"));
                    if (v4_1 != null) {
                        try {
                            android.os.ResultReceiver v9_3 = ((android.app.Activity) this.zza.get());
                            android.content.Intent v5_1 = new android.content.Intent(v9_3, com.android.billingclient.api.ProxyBillingActivityV2);
                            v5_1.putExtra("alternative_billing_only_dialog_result_receiver", this.zzb);
                            v5_1.putExtra("ALTERNATIVE_BILLING_ONLY_DIALOG_INTENT", v4_1);
                            v9_3.startActivity(v5_1);
                            return;
                        } catch (android.os.ResultReceiver v9_4) {
                            com.google.android.gms.internal.play_billing.zzc.zzo("BillingClient", "Runtime error while launching intent for alternative billing only dialog.", v9_4);
                            android.os.Bundle v2_3 = new android.os.Bundle();
                            v2_3.putInt("RESPONSE_CODE", 6);
                            v2_3.putString("DEBUG_MESSAGE", "An internal error occurred.");
                            v2_3.putInt("INTERNAL_LOG_ERROR_REASON", com.google.android.gms.internal.play_billing.zzie.zzax.zza());
                            String v1_5 = v9_4.getClass().getName();
                            android.os.ResultReceiver v9_6 = com.google.android.gms.internal.play_billing.zzbj.zzb(v9_4.getMessage());
                            StringBuilder v3_4 = new StringBuilder();
                            v3_4.append(v1_5);
                            v3_4.append(": ");
                            v3_4.append(v9_6);
                            v2_3.putString("INTERNAL_LOG_ERROR_ADDITIONAL_DETAILS", v3_4.toString());
                            this.zzb.send(6, v2_3);
                            return;
                        }
                    } else {
                        com.google.android.gms.internal.play_billing.zzc.zzm("BillingClient", "User has acknowledged the alternative billing only dialog before.");
                        this.zzb.send(0, p9);
                        return;
                    }
                } else {
                    android.os.ResultReceiver v0_4 = new StringBuilder("Unable to launch intent for alternative billing only dialog");
                    v0_4.append(v2_5);
                    com.google.android.gms.internal.play_billing.zzc.zzn("BillingClient", v0_4.toString());
                    this.zzb.send(v2_5, p9);
                    return;
                }
            } else {
                com.google.android.gms.internal.play_billing.zzc.zzn("BillingClient", "Response bundle doesn\'t contain a response code");
                this.zzb.send(6, p9);
                return;
            }
        } else {
            this.zzb.send(6, 0);
            return;
        }
    }
}
