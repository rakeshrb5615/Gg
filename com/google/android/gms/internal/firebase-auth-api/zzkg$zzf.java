package com.google.android.gms.internal.firebase-auth-api;
public final class zzkg$zzf extends com.google.android.gms.internal.firebase-auth-api.zzkg$zza {
    public static final com.google.android.gms.internal.firebase-auth-api.zzkg$zzf zza;
    public static final com.google.android.gms.internal.firebase-auth-api.zzkg$zzf zzb;
    public static final com.google.android.gms.internal.firebase-auth-api.zzkg$zzf zzc;
    public static final com.google.android.gms.internal.firebase-auth-api.zzkg$zzf zzd;

    static zzkg$zzf()
    {
        com.google.android.gms.internal.firebase-auth-api.zzkg$zzf.zza = new com.google.android.gms.internal.firebase-auth-api.zzkg$zzf("DHKEM_P256_HKDF_SHA256", 16);
        com.google.android.gms.internal.firebase-auth-api.zzkg$zzf.zzb = new com.google.android.gms.internal.firebase-auth-api.zzkg$zzf("DHKEM_P384_HKDF_SHA384", 17);
        com.google.android.gms.internal.firebase-auth-api.zzkg$zzf.zzc = new com.google.android.gms.internal.firebase-auth-api.zzkg$zzf("DHKEM_P521_HKDF_SHA512", 18);
        com.google.android.gms.internal.firebase-auth-api.zzkg$zzf.zzd = new com.google.android.gms.internal.firebase-auth-api.zzkg$zzf("DHKEM_X25519_HKDF_SHA256", 32);
        return;
    }

    private zzkg$zzf(String p2, int p3)
    {
        super(p2, p3, 0);
        return;
    }

    public final bridge synthetic String toString()
    {
        return super.toString();
    }
}
