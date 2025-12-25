package com.google.android.gms.internal.play_billing;
final enum class zzb extends java.lang.Enum {
    public static final enum com.google.android.gms.internal.play_billing.zzb zza;
    public static final enum com.google.android.gms.internal.play_billing.zzb zzb;
    public static final enum com.google.android.gms.internal.play_billing.zzb zzc;
    public static final enum com.google.android.gms.internal.play_billing.zzb zzd;
    public static final enum com.google.android.gms.internal.play_billing.zzb zze;
    public static final enum com.google.android.gms.internal.play_billing.zzb zzf;
    public static final enum com.google.android.gms.internal.play_billing.zzb zzg;
    public static final enum com.google.android.gms.internal.play_billing.zzb zzh;
    public static final enum com.google.android.gms.internal.play_billing.zzb zzi;
    public static final enum com.google.android.gms.internal.play_billing.zzb zzj;
    public static final enum com.google.android.gms.internal.play_billing.zzb zzk;
    public static final enum com.google.android.gms.internal.play_billing.zzb zzl;
    public static final enum com.google.android.gms.internal.play_billing.zzb zzm;
    public static final enum com.google.android.gms.internal.play_billing.zzb zzn;
    public static final enum com.google.android.gms.internal.play_billing.zzb zzo;
    private static final com.google.android.gms.internal.play_billing.zzbw zzp;
    private static final synthetic com.google.android.gms.internal.play_billing.zzb[] zzq;
    private final int zzr;

    static zzb()
    {
        com.google.android.gms.internal.play_billing.zzbw v0_1 = new com.google.android.gms.internal.play_billing.zzb("RESPONSE_CODE_UNSPECIFIED", 0, -999);
        com.google.android.gms.internal.play_billing.zzb.zza = v0_1;
        com.google.android.gms.internal.play_billing.zzb.zzb = new com.google.android.gms.internal.play_billing.zzb("SERVICE_TIMEOUT", 1, -3);
        com.google.android.gms.internal.play_billing.zzb.zzc = new com.google.android.gms.internal.play_billing.zzb("FEATURE_NOT_SUPPORTED", 2, -2);
        com.google.android.gms.internal.play_billing.zzb.zzd = new com.google.android.gms.internal.play_billing.zzb("SERVICE_DISCONNECTED", 3, -1);
        com.google.android.gms.internal.play_billing.zzb v5_3 = new com.google.android.gms.internal.play_billing.zzb("OK", 4, 0);
        com.google.android.gms.internal.play_billing.zzb.zze = v5_3;
        com.google.android.gms.internal.play_billing.zzb v7_2 = v5_3;
        com.google.android.gms.internal.play_billing.zzb.zzf = new com.google.android.gms.internal.play_billing.zzb("USER_CANCELED", 5, 1);
        com.google.android.gms.internal.play_billing.zzb.zzg = new com.google.android.gms.internal.play_billing.zzb("SERVICE_UNAVAILABLE", 6, 2);
        Integer v4 = v7_2;
        com.google.android.gms.internal.play_billing.zzb.zzh = new com.google.android.gms.internal.play_billing.zzb("BILLING_UNAVAILABLE", 7, 3);
        com.google.android.gms.internal.play_billing.zzb.zzi = new com.google.android.gms.internal.play_billing.zzb("ITEM_UNAVAILABLE", 8, 4);
        com.google.android.gms.internal.play_billing.zzb.zzj = new com.google.android.gms.internal.play_billing.zzb("DEVELOPER_ERROR", 9, 5);
        com.google.android.gms.internal.play_billing.zzb.zzk = new com.google.android.gms.internal.play_billing.zzb("ERROR", 10, 6);
        com.google.android.gms.internal.play_billing.zzb.zzl = new com.google.android.gms.internal.play_billing.zzb("ITEM_ALREADY_OWNED", 11, 7);
        com.google.android.gms.internal.play_billing.zzb.zzm = new com.google.android.gms.internal.play_billing.zzb("ITEM_NOT_OWNED", 12, 8);
        com.google.android.gms.internal.play_billing.zzb v17 = v0_1;
        com.google.android.gms.internal.play_billing.zzb.zzn = new com.google.android.gms.internal.play_billing.zzb("EXPIRED_OFFER_TOKEN", 13, 11);
        com.google.android.gms.internal.play_billing.zzb v14_3 = new com.google.android.gms.internal.play_billing.zzb("NETWORK_ERROR", 14, 12);
        com.google.android.gms.internal.play_billing.zzb.zzo = v14_3;
        com.google.android.gms.internal.play_billing.zzb.zzq = new com.google.android.gms.internal.play_billing.zzb[] {v17, v14_3});
        com.google.android.gms.internal.play_billing.zzbw v0_7 = new com.google.android.gms.internal.play_billing.zzbv();
        com.google.android.gms.internal.play_billing.zzb[] v1_4 = com.google.android.gms.internal.play_billing.zzb.values();
        int v2_4 = v1_4.length;
        int v15_0 = 0;
        while (v15_0 < v2_4) {
            com.google.android.gms.internal.play_billing.zzb v3_0 = v1_4[v15_0];
            v0_7.zza(Integer.valueOf(v3_0.zzr), v3_0);
            v15_0++;
        }
        com.google.android.gms.internal.play_billing.zzb.zzp = v0_7.zzb();
        return;
    }

    private zzb(String p1, int p2, int p3)
    {
        super(p1, p2);
        super.zzr = p3;
        return;
    }

    public static com.google.android.gms.internal.play_billing.zzb[] values()
    {
        return ((com.google.android.gms.internal.play_billing.zzb[]) com.google.android.gms.internal.play_billing.zzb.zzq.clone());
    }

    public static com.google.android.gms.internal.play_billing.zzb zza(int p2)
    {
        com.google.android.gms.internal.play_billing.zzbw v0 = com.google.android.gms.internal.play_billing.zzb.zzp;
        com.google.android.gms.internal.play_billing.zzb v2_2 = Integer.valueOf(p2);
        if (v0.containsKey(v2_2)) {
            return ((com.google.android.gms.internal.play_billing.zzb) v0.get(v2_2));
        } else {
            return com.google.android.gms.internal.play_billing.zzb.zza;
        }
    }
}
