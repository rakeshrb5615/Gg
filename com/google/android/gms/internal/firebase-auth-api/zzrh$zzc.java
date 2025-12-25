package com.google.android.gms.internal.firebase-auth-api;
public final class zzrh$zzc {
    public static final com.google.android.gms.internal.firebase-auth-api.zzrh$zzc zza;
    public static final com.google.android.gms.internal.firebase-auth-api.zzrh$zzc zzb;
    public static final com.google.android.gms.internal.firebase-auth-api.zzrh$zzc zzc;
    public static final com.google.android.gms.internal.firebase-auth-api.zzrh$zzc zzd;
    private final String zze;

    static zzrh$zzc()
    {
        com.google.android.gms.internal.firebase-auth-api.zzrh$zzc.zza = new com.google.android.gms.internal.firebase-auth-api.zzrh$zzc("TINK");
        com.google.android.gms.internal.firebase-auth-api.zzrh$zzc.zzb = new com.google.android.gms.internal.firebase-auth-api.zzrh$zzc("CRUNCHY");
        com.google.android.gms.internal.firebase-auth-api.zzrh$zzc.zzc = new com.google.android.gms.internal.firebase-auth-api.zzrh$zzc("LEGACY");
        com.google.android.gms.internal.firebase-auth-api.zzrh$zzc.zzd = new com.google.android.gms.internal.firebase-auth-api.zzrh$zzc("NO_PREFIX");
        return;
    }

    private zzrh$zzc(String p1)
    {
        this.zze = p1;
        return;
    }

    public final String toString()
    {
        return this.zze;
    }
}
