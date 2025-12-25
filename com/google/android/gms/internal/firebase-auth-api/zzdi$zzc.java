package com.google.android.gms.internal.firebase-auth-api;
public final class zzdi$zzc {
    public static final com.google.android.gms.internal.firebase-auth-api.zzdi$zzc zza;
    public static final com.google.android.gms.internal.firebase-auth-api.zzdi$zzc zzb;
    public static final com.google.android.gms.internal.firebase-auth-api.zzdi$zzc zzc;
    private final String zzd;

    static zzdi$zzc()
    {
        com.google.android.gms.internal.firebase-auth-api.zzdi$zzc.zza = new com.google.android.gms.internal.firebase-auth-api.zzdi$zzc("TINK");
        com.google.android.gms.internal.firebase-auth-api.zzdi$zzc.zzb = new com.google.android.gms.internal.firebase-auth-api.zzdi$zzc("CRUNCHY");
        com.google.android.gms.internal.firebase-auth-api.zzdi$zzc.zzc = new com.google.android.gms.internal.firebase-auth-api.zzdi$zzc("NO_PREFIX");
        return;
    }

    private zzdi$zzc(String p1)
    {
        this.zzd = p1;
        return;
    }

    public final String toString()
    {
        return this.zzd;
    }
}
