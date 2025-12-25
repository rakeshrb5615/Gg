package com.google.android.gms.internal.play_billing;
public final enum class zzil extends java.lang.Enum implements com.google.android.gms.internal.play_billing.zzfk {
    public static final enum com.google.android.gms.internal.play_billing.zzil zza;
    public static final enum com.google.android.gms.internal.play_billing.zzil zzb;
    public static final enum com.google.android.gms.internal.play_billing.zzil zzc;
    public static final enum com.google.android.gms.internal.play_billing.zzil zzd;
    private static final synthetic com.google.android.gms.internal.play_billing.zzil[] zze;
    private final int zzf;

    static zzil()
    {
        com.google.android.gms.internal.play_billing.zzil[] v0_2 = new com.google.android.gms.internal.play_billing.zzil("BROADCAST_ACTION_UNSPECIFIED", 0, 0);
        com.google.android.gms.internal.play_billing.zzil.zza = v0_2;
        com.google.android.gms.internal.play_billing.zzil v1_2 = new com.google.android.gms.internal.play_billing.zzil("PURCHASES_UPDATED_ACTION", 1, 1);
        com.google.android.gms.internal.play_billing.zzil.zzb = v1_2;
        com.google.android.gms.internal.play_billing.zzil v2_1 = new com.google.android.gms.internal.play_billing.zzil("LOCAL_PURCHASES_UPDATED_ACTION", 2, 2);
        com.google.android.gms.internal.play_billing.zzil.zzc = v2_1;
        com.google.android.gms.internal.play_billing.zzil v3_2 = new com.google.android.gms.internal.play_billing.zzil("ALTERNATIVE_BILLING_ACTION", 3, 3);
        com.google.android.gms.internal.play_billing.zzil.zzd = v3_2;
        com.google.android.gms.internal.play_billing.zzil.zze = new com.google.android.gms.internal.play_billing.zzil[] {v0_2, v1_2, v2_1, v3_2});
        return;
    }

    private zzil(String p1, int p2, int p3)
    {
        super(p1, p2);
        super.zzf = p3;
        return;
    }

    public static com.google.android.gms.internal.play_billing.zzil[] values()
    {
        return ((com.google.android.gms.internal.play_billing.zzil[]) com.google.android.gms.internal.play_billing.zzil.zze.clone());
    }

    public final String toString()
    {
        return Integer.toString(this.zzf);
    }

    public final int zza()
    {
        return this.zzf;
    }
}
