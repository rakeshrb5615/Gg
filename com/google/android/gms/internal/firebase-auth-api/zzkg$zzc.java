package com.google.android.gms.internal.firebase-auth-api;
public final class zzkg$zzc extends com.google.android.gms.internal.firebase-auth-api.zzkg$zza {
    public static final com.google.android.gms.internal.firebase-auth-api.zzkg$zzc zza;
    public static final com.google.android.gms.internal.firebase-auth-api.zzkg$zzc zzb;
    public static final com.google.android.gms.internal.firebase-auth-api.zzkg$zzc zzc;

    static zzkg$zzc()
    {
        com.google.android.gms.internal.firebase-auth-api.zzkg$zzc.zza = new com.google.android.gms.internal.firebase-auth-api.zzkg$zzc("HKDF_SHA256", 1);
        com.google.android.gms.internal.firebase-auth-api.zzkg$zzc.zzb = new com.google.android.gms.internal.firebase-auth-api.zzkg$zzc("HKDF_SHA384", 2);
        com.google.android.gms.internal.firebase-auth-api.zzkg$zzc.zzc = new com.google.android.gms.internal.firebase-auth-api.zzkg$zzc("HKDF_SHA512", 3);
        return;
    }

    private zzkg$zzc(String p2, int p3)
    {
        super(p2, p3, 0);
        return;
    }

    public final bridge synthetic String toString()
    {
        return super.toString();
    }
}
