package com.google.android.gms.internal.firebase-auth-api;
public final class zzfc$zza {
    public static final com.google.android.gms.internal.firebase-auth-api.zzfc$zza zza;
    public static final com.google.android.gms.internal.firebase-auth-api.zzfc$zza zzb;
    public static final com.google.android.gms.internal.firebase-auth-api.zzfc$zza zzc;
    public static final com.google.android.gms.internal.firebase-auth-api.zzfc$zza zzd;
    public static final com.google.android.gms.internal.firebase-auth-api.zzfc$zza zze;
    public static final com.google.android.gms.internal.firebase-auth-api.zzfc$zza zzf;
    private final String zzg;

    static zzfc$zza()
    {
        com.google.android.gms.internal.firebase-auth-api.zzfc$zza.zza = new com.google.android.gms.internal.firebase-auth-api.zzfc$zza("ASSUME_AES_GCM");
        com.google.android.gms.internal.firebase-auth-api.zzfc$zza.zzb = new com.google.android.gms.internal.firebase-auth-api.zzfc$zza("ASSUME_XCHACHA20POLY1305");
        com.google.android.gms.internal.firebase-auth-api.zzfc$zza.zzc = new com.google.android.gms.internal.firebase-auth-api.zzfc$zza("ASSUME_CHACHA20POLY1305");
        com.google.android.gms.internal.firebase-auth-api.zzfc$zza.zzd = new com.google.android.gms.internal.firebase-auth-api.zzfc$zza("ASSUME_AES_CTR_HMAC");
        com.google.android.gms.internal.firebase-auth-api.zzfc$zza.zze = new com.google.android.gms.internal.firebase-auth-api.zzfc$zza("ASSUME_AES_EAX");
        com.google.android.gms.internal.firebase-auth-api.zzfc$zza.zzf = new com.google.android.gms.internal.firebase-auth-api.zzfc$zza("ASSUME_AES_GCM_SIV");
        return;
    }

    private zzfc$zza(String p1)
    {
        this.zzg = p1;
        return;
    }

    public final String toString()
    {
        return this.zzg;
    }
}
