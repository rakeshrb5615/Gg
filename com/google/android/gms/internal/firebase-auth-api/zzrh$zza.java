package com.google.android.gms.internal.firebase-auth-api;
public final class zzrh$zza {
    public static final com.google.android.gms.internal.firebase-auth-api.zzrh$zza zza;
    public static final com.google.android.gms.internal.firebase-auth-api.zzrh$zza zzb;
    public static final com.google.android.gms.internal.firebase-auth-api.zzrh$zza zzc;
    public static final com.google.android.gms.internal.firebase-auth-api.zzrh$zza zzd;
    public static final com.google.android.gms.internal.firebase-auth-api.zzrh$zza zze;
    private final String zzf;

    static zzrh$zza()
    {
        com.google.android.gms.internal.firebase-auth-api.zzrh$zza.zza = new com.google.android.gms.internal.firebase-auth-api.zzrh$zza("SHA1");
        com.google.android.gms.internal.firebase-auth-api.zzrh$zza.zzb = new com.google.android.gms.internal.firebase-auth-api.zzrh$zza("SHA224");
        com.google.android.gms.internal.firebase-auth-api.zzrh$zza.zzc = new com.google.android.gms.internal.firebase-auth-api.zzrh$zza("SHA256");
        com.google.android.gms.internal.firebase-auth-api.zzrh$zza.zzd = new com.google.android.gms.internal.firebase-auth-api.zzrh$zza("SHA384");
        com.google.android.gms.internal.firebase-auth-api.zzrh$zza.zze = new com.google.android.gms.internal.firebase-auth-api.zzrh$zza("SHA512");
        return;
    }

    private zzrh$zza(String p1)
    {
        this.zzf = p1;
        return;
    }

    public final String toString()
    {
        return this.zzf;
    }
}
