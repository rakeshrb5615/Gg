package com.google.android.gms.internal.firebase-auth-api;
public final enum class zzzi extends java.lang.Enum {
    public static final enum com.google.android.gms.internal.firebase-auth-api.zzzi zza;
    public static final enum com.google.android.gms.internal.firebase-auth-api.zzzi zzb;
    public static final enum com.google.android.gms.internal.firebase-auth-api.zzzi zzc;
    private static final synthetic com.google.android.gms.internal.firebase-auth-api.zzzi[] zzd;

    static zzzi()
    {
        com.google.android.gms.internal.firebase-auth-api.zzzi[] v0_2 = new com.google.android.gms.internal.firebase-auth-api.zzzi("NIST_P256", 0);
        com.google.android.gms.internal.firebase-auth-api.zzzi.zza = v0_2;
        com.google.android.gms.internal.firebase-auth-api.zzzi v1_2 = new com.google.android.gms.internal.firebase-auth-api.zzzi("NIST_P384", 1);
        com.google.android.gms.internal.firebase-auth-api.zzzi.zzb = v1_2;
        com.google.android.gms.internal.firebase-auth-api.zzzi v2_1 = new com.google.android.gms.internal.firebase-auth-api.zzzi("NIST_P521", 2);
        com.google.android.gms.internal.firebase-auth-api.zzzi.zzc = v2_1;
        com.google.android.gms.internal.firebase-auth-api.zzzi.zzd = new com.google.android.gms.internal.firebase-auth-api.zzzi[] {v0_2, v1_2, v2_1});
        return;
    }

    private zzzi(String p1, int p2)
    {
        super(p1, p2);
        return;
    }

    public static com.google.android.gms.internal.firebase-auth-api.zzzi[] values()
    {
        return ((com.google.android.gms.internal.firebase-auth-api.zzzi[]) com.google.android.gms.internal.firebase-auth-api.zzzi.zzd.clone());
    }
}
