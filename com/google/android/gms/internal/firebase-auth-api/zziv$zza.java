package com.google.android.gms.internal.firebase-auth-api;
public abstract enum class zziv$zza extends java.lang.Enum {
    public static final enum com.google.android.gms.internal.firebase-auth-api.zziv$zza zza;
    public static final enum com.google.android.gms.internal.firebase-auth-api.zziv$zza zzb;
    private static final synthetic com.google.android.gms.internal.firebase-auth-api.zziv$zza[] zzc;

    static zziv$zza()
    {
        com.google.android.gms.internal.firebase-auth-api.zzix v0_1 = new com.google.android.gms.internal.firebase-auth-api.zzix("ALGORITHM_NOT_FIPS", 0, 0);
        com.google.android.gms.internal.firebase-auth-api.zziv$zza.zza = v0_1;
        com.google.android.gms.internal.firebase-auth-api.zziz v1_2 = new com.google.android.gms.internal.firebase-auth-api.zziz("ALGORITHM_REQUIRES_BORINGCRYPTO", 1, 0);
        com.google.android.gms.internal.firebase-auth-api.zziv$zza.zzb = v1_2;
        com.google.android.gms.internal.firebase-auth-api.zziv$zza[] v3_1 = new com.google.android.gms.internal.firebase-auth-api.zziv$zza[2];
        v3_1[0] = v0_1;
        v3_1[1] = v1_2;
        com.google.android.gms.internal.firebase-auth-api.zziv$zza.zzc = v3_1;
        return;
    }

    private zziv$zza(String p1, int p2)
    {
        super(p1, p2);
        return;
    }

    public synthetic zziv$zza(String p1, int p2, com.google.android.gms.internal.firebase-auth-api.zziy p3)
    {
        this(p1, p2);
        return;
    }

    public static com.google.android.gms.internal.firebase-auth-api.zziv$zza[] values()
    {
        return ((com.google.android.gms.internal.firebase-auth-api.zziv$zza[]) com.google.android.gms.internal.firebase-auth-api.zziv$zza.zzc.clone());
    }

    public abstract boolean zza();
}
