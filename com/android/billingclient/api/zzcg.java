package com.android.billingclient.api;
public final synthetic class zzcg {
    public static final synthetic int zza;

    static zzcg()
    {
        return;
    }

    public static String zza(Exception p3)
    {
        if (p3 != null) {
            try {
                String v1_5 = p3.getClass().getSimpleName();
                String v3_5 = com.google.android.gms.internal.play_billing.zzbj.zzb(p3.getMessage());
                String v2_1 = new StringBuilder();
                v2_1.append(v1_5);
                v2_1.append(":");
                v2_1.append(v3_5);
                String v3_1 = v2_1.toString();
            } catch (String v3_2) {
                com.google.android.gms.internal.play_billing.zzc.zzo("BillingLogger", "Unable to get truncated exception info", v3_2);
                return 0;
            }
            if (v3_1.length() <= 40) {
                return v3_1;
            } else {
                return v3_1.substring(0, 40);
            }
        } else {
            return 0;
        }
    }

    public static com.google.android.gms.internal.play_billing.zzhx zzb(com.google.android.gms.internal.play_billing.zzie p2, int p3, com.android.billingclient.api.BillingResult p4, String p5, com.google.android.gms.internal.play_billing.zzil p6)
    {
        try {
            com.google.android.gms.internal.play_billing.zzic v0 = com.google.android.gms.internal.play_billing.zzig.zzc();
            v0.zzo(p4.getResponseCode());
            v0.zzl(p4.getDebugMessage());
        } catch (com.google.android.gms.internal.play_billing.zzhx v2_2) {
            com.google.android.gms.internal.play_billing.zzc.zzo("BillingLogger", "Unable to create logging payload", v2_2);
            return 0;
        }
        if (p4.getOnPurchasesUpdatedSubResponseCode() != 0) {
            v0.zzm(p4.getOnPurchasesUpdatedSubResponseCode());
        }
        if (p2 != null) {
            v0.zzn(p2);
        }
        if (p5 != null) {
            v0.zza(p5);
        }
        com.google.android.gms.internal.play_billing.zzhx v2_1 = com.google.android.gms.internal.play_billing.zzhx.zzc();
        v2_1.zzl(v0);
        v2_1.zzp(p3);
        if (!p6.equals(com.google.android.gms.internal.play_billing.zzil.zza)) {
            v2_1.zza(p6);
        }
        return ((com.google.android.gms.internal.play_billing.zzhx) v2_1.zze());
    }

    public static com.google.android.gms.internal.play_billing.zzib zzc(int p1, com.google.android.gms.internal.play_billing.zzil p2)
    {
        try {
            String v0_0 = com.google.android.gms.internal.play_billing.zzib.zzc();
            v0_0.zzo(p1);
        } catch (com.google.android.gms.internal.play_billing.zzib v1_6) {
            com.google.android.gms.internal.play_billing.zzc.zzo("BillingLogger", "Unable to create logging payload", v1_6);
            return 0;
        }
        if (!p2.equals(com.google.android.gms.internal.play_billing.zzil.zza)) {
            v0_0.zza(p2);
        }
        return ((com.google.android.gms.internal.play_billing.zzib) v0_0.zze());
    }
}
