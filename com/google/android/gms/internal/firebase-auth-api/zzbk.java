package com.google.android.gms.internal.firebase-auth-api;
public final class zzbk {
    public static final com.google.android.gms.internal.firebase-auth-api.zzbk zza;
    public static final com.google.android.gms.internal.firebase-auth-api.zzbk zzb;
    public static final com.google.android.gms.internal.firebase-auth-api.zzbk zzc;
    private final String zzd;

    static zzbk()
    {
        com.google.android.gms.internal.firebase-auth-api.zzbk.zza = new com.google.android.gms.internal.firebase-auth-api.zzbk("ENABLED");
        com.google.android.gms.internal.firebase-auth-api.zzbk.zzb = new com.google.android.gms.internal.firebase-auth-api.zzbk("DISABLED");
        com.google.android.gms.internal.firebase-auth-api.zzbk.zzc = new com.google.android.gms.internal.firebase-auth-api.zzbk("DESTROYED");
        return;
    }

    private zzbk(String p1)
    {
        this.zzd = p1;
        return;
    }

    public final String toString()
    {
        return this.zzd;
    }
}
