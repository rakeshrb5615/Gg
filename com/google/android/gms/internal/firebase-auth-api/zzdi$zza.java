package com.google.android.gms.internal.firebase-auth-api;
public final class zzdi$zza {
    public static final com.google.android.gms.internal.firebase-auth-api.zzdi$zza zza;
    public static final com.google.android.gms.internal.firebase-auth-api.zzdi$zza zzb;
    public static final com.google.android.gms.internal.firebase-auth-api.zzdi$zza zzc;
    public static final com.google.android.gms.internal.firebase-auth-api.zzdi$zza zzd;
    public static final com.google.android.gms.internal.firebase-auth-api.zzdi$zza zze;
    private final String zzf;

    static zzdi$zza()
    {
        com.google.android.gms.internal.firebase-auth-api.zzdi$zza.zza = new com.google.android.gms.internal.firebase-auth-api.zzdi$zza("SHA1");
        com.google.android.gms.internal.firebase-auth-api.zzdi$zza.zzb = new com.google.android.gms.internal.firebase-auth-api.zzdi$zza("SHA224");
        com.google.android.gms.internal.firebase-auth-api.zzdi$zza.zzc = new com.google.android.gms.internal.firebase-auth-api.zzdi$zza("SHA256");
        com.google.android.gms.internal.firebase-auth-api.zzdi$zza.zzd = new com.google.android.gms.internal.firebase-auth-api.zzdi$zza("SHA384");
        com.google.android.gms.internal.firebase-auth-api.zzdi$zza.zze = new com.google.android.gms.internal.firebase-auth-api.zzdi$zza("SHA512");
        return;
    }

    private zzdi$zza(String p1)
    {
        this.zzf = p1;
        return;
    }

    public final String toString()
    {
        return this.zzf;
    }
}
