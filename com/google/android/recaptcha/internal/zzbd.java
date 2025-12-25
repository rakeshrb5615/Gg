package com.google.android.recaptcha.internal;
public final class zzbd extends java.lang.Exception {
    public static final synthetic int zza;
    private static final java.util.Map zzb;
    private final com.google.android.recaptcha.internal.zzbb zzc;
    private final com.google.android.recaptcha.internal.zzba zzd;
    private final String zze;
    private final java.util.Map zzf;

    static zzbd()
    {
        h7.f v5_1 = new h7.f(com.google.android.recaptcha.internal.zztv.zzc, new com.google.android.recaptcha.internal.zzbd(com.google.android.recaptcha.internal.zzbb.zzc, com.google.android.recaptcha.internal.zzba.zzd, 0));
        com.google.android.recaptcha.internal.zzbb v2_0 = com.google.android.recaptcha.internal.zzbb.zzb;
        new h7.f(com.google.android.recaptcha.internal.zztv.zzd, new com.google.android.recaptcha.internal.zzbd(v2_0, com.google.android.recaptcha.internal.zzba.zzc, 0));
        new h7.f(com.google.android.recaptcha.internal.zztv.zze, new com.google.android.recaptcha.internal.zzbd(com.google.android.recaptcha.internal.zzbb.zzd, com.google.android.recaptcha.internal.zzba.zze, 0));
        new h7.f(com.google.android.recaptcha.internal.zztv.zzf, new com.google.android.recaptcha.internal.zzbd(com.google.android.recaptcha.internal.zzbb.zze, com.google.android.recaptcha.internal.zzba.zzf, 0));
        new h7.f(com.google.android.recaptcha.internal.zztv.zzi, new com.google.android.recaptcha.internal.zzbd(com.google.android.recaptcha.internal.zzbb.zzf, com.google.android.recaptcha.internal.zzba.zzg, 0));
        new h7.f(com.google.android.recaptcha.internal.zztv.zzh, new com.google.android.recaptcha.internal.zzbd(com.google.android.recaptcha.internal.zzbb.zzg, com.google.android.recaptcha.internal.zzba.zzh, 0));
        com.google.android.recaptcha.internal.zzbd.zzb = i7.r.n0(new h7.f[] {v5_1, new h7.f(com.google.android.recaptcha.internal.zztv.zzj, new com.google.android.recaptcha.internal.zzbd(v2_0, com.google.android.recaptcha.internal.zzba.zzj, 0))}));
        return;
    }

    public zzbd(com.google.android.recaptcha.internal.zzbb p12, com.google.android.recaptcha.internal.zzba p13, String p14)
    {
        this.zzc = p12;
        this.zzd = p13;
        this.zze = p14;
        com.google.android.recaptcha.RecaptchaErrorCode v14_7 = com.google.android.recaptcha.RecaptchaErrorCode.NETWORK_ERROR;
        h7.f v2_1 = new h7.f(com.google.android.recaptcha.internal.zzbb.zzc, new com.google.android.recaptcha.RecaptchaException(v14_7, 0, 2, 0));
        new h7.f(com.google.android.recaptcha.internal.zzbb.zzh, new com.google.android.recaptcha.RecaptchaException(v14_7, 0, 2, 0));
        new h7.f(com.google.android.recaptcha.internal.zzbb.zzi, new com.google.android.recaptcha.RecaptchaException(v14_7, 0, 2, 0));
        new h7.f(com.google.android.recaptcha.internal.zzbb.zzd, new com.google.android.recaptcha.RecaptchaException(com.google.android.recaptcha.RecaptchaErrorCode.INVALID_SITEKEY, 0, 2, 0));
        new h7.f(com.google.android.recaptcha.internal.zzbb.zze, new com.google.android.recaptcha.RecaptchaException(com.google.android.recaptcha.RecaptchaErrorCode.INVALID_KEYTYPE, 0, 2, 0));
        new h7.f(com.google.android.recaptcha.internal.zzbb.zzf, new com.google.android.recaptcha.RecaptchaException(com.google.android.recaptcha.RecaptchaErrorCode.INVALID_PACKAGE_NAME, 0, 2, 0));
        new h7.f(com.google.android.recaptcha.internal.zzbb.zzg, new com.google.android.recaptcha.RecaptchaException(com.google.android.recaptcha.RecaptchaErrorCode.INVALID_ACTION, 0, 2, 0));
        new h7.f(com.google.android.recaptcha.internal.zzbb.zzb, new com.google.android.recaptcha.RecaptchaException(com.google.android.recaptcha.RecaptchaErrorCode.INTERNAL_ERROR, 0, 2, 0));
        this.zzf = i7.r.n0(new h7.f[] {v2_1, new h7.f(com.google.android.recaptcha.internal.zzbb.zzj, new com.google.android.recaptcha.RecaptchaException(com.google.android.recaptcha.RecaptchaErrorCode.INVALID_TIMEOUT, 0, 2, 0))}));
        return;
    }

    public static final synthetic java.util.Map zze()
    {
        return com.google.android.recaptcha.internal.zzbd.zzb;
    }

    public final com.google.android.recaptcha.internal.zzba zza()
    {
        return this.zzd;
    }

    public final com.google.android.recaptcha.internal.zzbb zzb()
    {
        return this.zzc;
    }

    public final com.google.android.recaptcha.RecaptchaException zzc()
    {
        com.google.android.recaptcha.RecaptchaException v0_0 = this.zzd;
        if (!kotlin.jvm.internal.j.a(v0_0, com.google.android.recaptcha.internal.zzba.zzI)) {
            if (!kotlin.jvm.internal.j.a(v0_0, com.google.android.recaptcha.internal.zzba.zzao)) {
                com.google.android.recaptcha.RecaptchaException v0_3 = ((com.google.android.recaptcha.RecaptchaException) this.zzf.get(this.zzc));
                if (v0_3 == null) {
                    v0_3 = new com.google.android.recaptcha.RecaptchaException(com.google.android.recaptcha.RecaptchaErrorCode.INTERNAL_ERROR, 0, 2, 0);
                }
                return v0_3;
            } else {
                return new com.google.android.recaptcha.RecaptchaException(com.google.android.recaptcha.RecaptchaErrorCode.NO_NETWORK_FOUND, 0, 2, 0);
            }
        } else {
            return new com.google.android.recaptcha.RecaptchaException(com.google.android.recaptcha.RecaptchaErrorCode.INVALID_TIMEOUT, 0, 2, 0);
        }
    }

    public final String zzd()
    {
        return this.zze;
    }
}
