package com.google.android.gms.internal.firebase-auth-api;
public final class zzkg$zzb extends com.google.android.gms.internal.firebase-auth-api.zzkg$zza {
    public static final com.google.android.gms.internal.firebase-auth-api.zzkg$zzb zza;
    public static final com.google.android.gms.internal.firebase-auth-api.zzkg$zzb zzb;
    public static final com.google.android.gms.internal.firebase-auth-api.zzkg$zzb zzc;

    static zzkg$zzb()
    {
        com.google.android.gms.internal.firebase-auth-api.zzkg$zzb.zza = new com.google.android.gms.internal.firebase-auth-api.zzkg$zzb("AES_128_GCM", 1);
        com.google.android.gms.internal.firebase-auth-api.zzkg$zzb.zzb = new com.google.android.gms.internal.firebase-auth-api.zzkg$zzb("AES_256_GCM", 2);
        com.google.android.gms.internal.firebase-auth-api.zzkg$zzb.zzc = new com.google.android.gms.internal.firebase-auth-api.zzkg$zzb("CHACHA20_POLY1305", 3);
        return;
    }

    private zzkg$zzb(String p2, int p3)
    {
        super(p2, p3, 0);
        return;
    }

    public final bridge synthetic String toString()
    {
        return super.toString();
    }
}
