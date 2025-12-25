package com.google.android.gms.internal.firebase-auth-api;
public final class zzkb$zzc {
    public static final com.google.android.gms.internal.firebase-auth-api.zzkb$zzc zza;
    public static final com.google.android.gms.internal.firebase-auth-api.zzkb$zzc zzb;
    public static final com.google.android.gms.internal.firebase-auth-api.zzkb$zzc zzc;
    public static final com.google.android.gms.internal.firebase-auth-api.zzkb$zzc zzd;
    private final String zze;

    static zzkb$zzc()
    {
        com.google.android.gms.internal.firebase-auth-api.zzkb$zzc.zza = new com.google.android.gms.internal.firebase-auth-api.zzkb$zzc("NIST_P256");
        com.google.android.gms.internal.firebase-auth-api.zzkb$zzc.zzb = new com.google.android.gms.internal.firebase-auth-api.zzkb$zzc("NIST_P384");
        com.google.android.gms.internal.firebase-auth-api.zzkb$zzc.zzc = new com.google.android.gms.internal.firebase-auth-api.zzkb$zzc("NIST_P521");
        com.google.android.gms.internal.firebase-auth-api.zzkb$zzc.zzd = new com.google.android.gms.internal.firebase-auth-api.zzkb$zzc("X25519");
        return;
    }

    private zzkb$zzc(String p1)
    {
        this.zze = p1;
        return;
    }

    public final String toString()
    {
        return this.zze;
    }
}
