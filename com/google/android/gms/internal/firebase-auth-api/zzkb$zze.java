package com.google.android.gms.internal.firebase-auth-api;
public final class zzkb$zze {
    public static final com.google.android.gms.internal.firebase-auth-api.zzkb$zze zza;
    public static final com.google.android.gms.internal.firebase-auth-api.zzkb$zze zzb;
    public static final com.google.android.gms.internal.firebase-auth-api.zzkb$zze zzc;
    private final String zzd;

    static zzkb$zze()
    {
        com.google.android.gms.internal.firebase-auth-api.zzkb$zze.zza = new com.google.android.gms.internal.firebase-auth-api.zzkb$zze("COMPRESSED");
        com.google.android.gms.internal.firebase-auth-api.zzkb$zze.zzb = new com.google.android.gms.internal.firebase-auth-api.zzkb$zze("UNCOMPRESSED");
        com.google.android.gms.internal.firebase-auth-api.zzkb$zze.zzc = new com.google.android.gms.internal.firebase-auth-api.zzkb$zze("LEGACY_UNCOMPRESSED");
        return;
    }

    private zzkb$zze(String p1)
    {
        this.zzd = p1;
        return;
    }

    public final String toString()
    {
        return this.zzd;
    }
}
