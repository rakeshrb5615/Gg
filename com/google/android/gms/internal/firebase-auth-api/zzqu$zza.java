package com.google.android.gms.internal.firebase-auth-api;
public final class zzqu$zza {
    public static final com.google.android.gms.internal.firebase-auth-api.zzqu$zza zza;
    public static final com.google.android.gms.internal.firebase-auth-api.zzqu$zza zzb;
    public static final com.google.android.gms.internal.firebase-auth-api.zzqu$zza zzc;
    public static final com.google.android.gms.internal.firebase-auth-api.zzqu$zza zzd;
    private final String zze;

    static zzqu$zza()
    {
        com.google.android.gms.internal.firebase-auth-api.zzqu$zza.zza = new com.google.android.gms.internal.firebase-auth-api.zzqu$zza("TINK");
        com.google.android.gms.internal.firebase-auth-api.zzqu$zza.zzb = new com.google.android.gms.internal.firebase-auth-api.zzqu$zza("CRUNCHY");
        com.google.android.gms.internal.firebase-auth-api.zzqu$zza.zzc = new com.google.android.gms.internal.firebase-auth-api.zzqu$zza("LEGACY");
        com.google.android.gms.internal.firebase-auth-api.zzqu$zza.zzd = new com.google.android.gms.internal.firebase-auth-api.zzqu$zza("NO_PREFIX");
        return;
    }

    private zzqu$zza(String p1)
    {
        this.zze = p1;
        return;
    }

    public final String toString()
    {
        return this.zze;
    }
}
