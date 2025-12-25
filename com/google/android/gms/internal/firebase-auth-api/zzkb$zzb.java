package com.google.android.gms.internal.firebase-auth-api;
public final class zzkb$zzb {
    public static final com.google.android.gms.internal.firebase-auth-api.zzkb$zzb zza;
    public static final com.google.android.gms.internal.firebase-auth-api.zzkb$zzb zzb;
    public static final com.google.android.gms.internal.firebase-auth-api.zzkb$zzb zzc;
    public static final com.google.android.gms.internal.firebase-auth-api.zzkb$zzb zzd;
    public static final com.google.android.gms.internal.firebase-auth-api.zzkb$zzb zze;
    private final String zzf;

    static zzkb$zzb()
    {
        com.google.android.gms.internal.firebase-auth-api.zzkb$zzb.zza = new com.google.android.gms.internal.firebase-auth-api.zzkb$zzb("SHA1");
        com.google.android.gms.internal.firebase-auth-api.zzkb$zzb.zzb = new com.google.android.gms.internal.firebase-auth-api.zzkb$zzb("SHA224");
        com.google.android.gms.internal.firebase-auth-api.zzkb$zzb.zzc = new com.google.android.gms.internal.firebase-auth-api.zzkb$zzb("SHA256");
        com.google.android.gms.internal.firebase-auth-api.zzkb$zzb.zzd = new com.google.android.gms.internal.firebase-auth-api.zzkb$zzb("SHA384");
        com.google.android.gms.internal.firebase-auth-api.zzkb$zzb.zze = new com.google.android.gms.internal.firebase-auth-api.zzkb$zzb("SHA512");
        return;
    }

    private zzkb$zzb(String p1)
    {
        this.zzf = p1;
        return;
    }

    public final String toString()
    {
        return this.zzf;
    }
}
