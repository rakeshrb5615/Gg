package com.android.billingclient.api;
public class ProxyBillingActivityV2 extends c.n {
    private e.c zza;
    private e.c zzb;
    private e.c zzc;
    private android.os.ResultReceiver zzd;
    private android.os.ResultReceiver zze;
    private android.os.ResultReceiver zzf;

    public ProxyBillingActivityV2()
    {
        return;
    }

    public final void onCreate(android.os.Bundle p9)
    {
        super.onCreate(p9);
        this.zza = this.registerForActivityResult(new androidx.fragment.app.x0(4), new com.android.billingclient.api.zzct(this));
        this.zzb = this.registerForActivityResult(new androidx.fragment.app.x0(4), new com.android.billingclient.api.zzcu(this));
        this.zzc = this.registerForActivityResult(new androidx.fragment.app.x0(4), new com.android.billingclient.api.zzcv(this));
        if (p9 != null) {
            if (p9.containsKey("alternative_billing_only_dialog_result_receiver")) {
                this.zzd = ((android.os.ResultReceiver) p9.getParcelable("alternative_billing_only_dialog_result_receiver"));
            }
            if (p9.containsKey("external_payment_dialog_result_receiver")) {
                this.zze = ((android.os.ResultReceiver) p9.getParcelable("external_payment_dialog_result_receiver"));
            }
            if (p9.containsKey("external_offer_flow_result_receiver")) {
                this.zzf = ((android.os.ResultReceiver) p9.getParcelable("external_offer_flow_result_receiver"));
            }
        } else {
            com.google.android.gms.internal.play_billing.zzc.zzm("ProxyBillingActivityV2", "Launching Play Store billing dialog");
            if (!this.getIntent().hasExtra("ALTERNATIVE_BILLING_ONLY_DIALOG_INTENT")) {
                if (!this.getIntent().hasExtra("external_payment_dialog_pending_intent")) {
                    if (this.getIntent().hasExtra("external_offer_flow_pending_intent")) {
                        android.os.ResultReceiver v9_18 = ((android.app.PendingIntent) this.getIntent().getParcelableExtra("external_offer_flow_pending_intent"));
                        this.zzf = ((android.os.ResultReceiver) this.getIntent().getParcelableExtra("external_offer_flow_result_receiver"));
                        e.c v0_19 = this.zzc;
                        kotlin.jvm.internal.j.e(v9_18, "pendingIntent");
                        android.os.ResultReceiver v9_19 = v9_18.getIntentSender();
                        kotlin.jvm.internal.j.d(v9_19, "getIntentSender(...)");
                        v0_19.a(new e.k(v9_19, 0, 0, 0));
                        return;
                    }
                } else {
                    android.os.ResultReceiver v9_1 = ((android.app.PendingIntent) this.getIntent().getParcelableExtra("external_payment_dialog_pending_intent"));
                    this.zze = ((android.os.ResultReceiver) this.getIntent().getParcelableExtra("external_payment_dialog_result_receiver"));
                    e.c v0_4 = this.zzb;
                    kotlin.jvm.internal.j.e(v9_1, "pendingIntent");
                    android.os.ResultReceiver v9_2 = v9_1.getIntentSender();
                    kotlin.jvm.internal.j.d(v9_2, "getIntentSender(...)");
                    v0_4.a(new e.k(v9_2, 0, 0, 0));
                    return;
                }
            } else {
                android.os.ResultReceiver v9_5 = ((android.app.PendingIntent) this.getIntent().getParcelableExtra("ALTERNATIVE_BILLING_ONLY_DIALOG_INTENT"));
                this.zzd = ((android.os.ResultReceiver) this.getIntent().getParcelableExtra("alternative_billing_only_dialog_result_receiver"));
                e.c v0_9 = this.zza;
                kotlin.jvm.internal.j.e(v9_5, "pendingIntent");
                android.os.ResultReceiver v9_6 = v9_5.getIntentSender();
                kotlin.jvm.internal.j.d(v9_6, "getIntentSender(...)");
                v0_9.a(new e.k(v9_6, 0, 0, 0));
                return;
            }
        }
        return;
    }

    public final void onSaveInstanceState(android.os.Bundle p3)
    {
        super.onSaveInstanceState(p3);
        android.os.ResultReceiver v0_0 = this.zzd;
        if (v0_0 != null) {
            p3.putParcelable("alternative_billing_only_dialog_result_receiver", v0_0);
        }
        android.os.ResultReceiver v0_1 = this.zze;
        if (v0_1 != null) {
            p3.putParcelable("external_payment_dialog_result_receiver", v0_1);
        }
        android.os.ResultReceiver v0_2 = this.zzf;
        if (v0_2 != null) {
            p3.putParcelable("external_offer_flow_result_receiver", v0_2);
        }
        return;
    }

    public final void zza(e.a p5)
    {
        StringBuilder v0_0 = p5.b;
        int v2_1 = com.google.android.gms.internal.play_billing.zzc.zzh(v0_0, "ProxyBillingActivityV2").getResponseCode();
        String v3_1 = this.zzd;
        if (v3_1 != null) {
            StringBuilder v0_1;
            if (v0_0 != null) {
                v0_1 = v0_0.getExtras();
            } else {
                v0_1 = 0;
            }
            v3_1.send(v2_1, v0_1);
        }
        String v5_1 = p5.a;
        if ((v5_1 != -1) || (v2_1 != 0)) {
            StringBuilder v0_4 = new StringBuilder("Alternative billing only dialog finished with resultCode ");
            v0_4.append(v5_1);
            v0_4.append(" and billing\'s responseCode: ");
            v0_4.append(v2_1);
            com.google.android.gms.internal.play_billing.zzc.zzn("ProxyBillingActivityV2", v0_4.toString());
        }
        this.finish();
        return;
    }

    public final void zzb(e.a p5)
    {
        StringBuilder v0_0 = p5.b;
        int v2_1 = com.google.android.gms.internal.play_billing.zzc.zzh(v0_0, "ProxyBillingActivityV2").getResponseCode();
        String v3_1 = this.zze;
        if (v3_1 != null) {
            StringBuilder v0_1;
            if (v0_0 != null) {
                v0_1 = v0_0.getExtras();
            } else {
                v0_1 = 0;
            }
            v3_1.send(v2_1, v0_1);
        }
        String v5_1 = p5.a;
        if ((v5_1 != -1) || (v2_1 != 0)) {
            StringBuilder v0_4 = new StringBuilder("External offer dialog finished with resultCode: ");
            v0_4.append(v5_1);
            v0_4.append(" and billing\'s responseCode: ");
            v0_4.append(v2_1);
            com.google.android.gms.internal.play_billing.zzc.zzn("ProxyBillingActivityV2", v0_4.toString());
        }
        this.finish();
        return;
    }

    public final void zzc(e.a p6)
    {
        String v1_1;
        StringBuilder v0_0 = p6.b;
        String v6_1 = p6.a;
        if (v0_0 != null) {
            v1_1 = v0_0.getExtras();
        } else {
            v1_1 = 0;
        }
        if (v6_1 != -1) {
            if (v1_1 == null) {
                v1_1 = new android.os.Bundle();
            }
            String v2_1 = new StringBuilder("External offer flow finished with resultCode: ");
            v2_1.append(v6_1);
            com.google.android.gms.internal.play_billing.zzc.zzn("ProxyBillingActivityV2", v2_1.toString());
            v1_1.putInt("INTERNAL_LOG_ERROR_REASON", com.google.android.gms.internal.play_billing.zzie.zzbv.zza());
            String v2_6 = new StringBuilder("External offer flow finished with error resultCode: ");
            v2_6.append(v6_1);
            v1_1.putString("INTERNAL_LOG_ERROR_ADDITIONAL_DETAILS", v2_6.toString());
        }
        String v6_4 = com.google.android.gms.internal.play_billing.zzc.zzh(v0_0, "ProxyBillingActivityV2").getResponseCode();
        StringBuilder v0_1 = this.zzf;
        if (v0_1 == null) {
            com.google.android.gms.internal.play_billing.zzc.zzn("ProxyBillingActivityV2", "External offer flow result receiver is null");
        } else {
            v0_1.send(v6_4, v1_1);
        }
        if (v6_4 != null) {
            StringBuilder v0_4 = new StringBuilder("External offer flow finished with billing responseCode: ");
            v0_4.append(v6_4);
            com.google.android.gms.internal.play_billing.zzc.zzn("ProxyBillingActivityV2", v0_4.toString());
        }
        this.finish();
        return;
    }
}
