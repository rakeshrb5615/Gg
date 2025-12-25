package com.google.android.recaptcha.internal;
public final class zzav {
    public static final synthetic int zza;
    private static com.google.android.recaptcha.internal.zzav zzb;
    private static final java.util.Map zzc;
    private static final u7.a zzd;
    private final java.util.Map zze;

    static zzav()
    {
        com.google.android.recaptcha.internal.zzav.zzc = new java.util.LinkedHashMap();
        com.google.android.recaptcha.internal.zzav.zzd = com.google.android.recaptcha.internal.zzat.zza;
        return;
    }

    public synthetic zzav(java.util.Map p1, kotlin.jvm.internal.f p2)
    {
        this.zze = p1;
        return;
    }

    public static final synthetic com.google.android.recaptcha.internal.zzav zza()
    {
        return com.google.android.recaptcha.internal.zzav.zzb;
    }

    public static final synthetic java.util.Map zzc()
    {
        return com.google.android.recaptcha.internal.zzav.zzc;
    }

    public static final synthetic u7.a zzd()
    {
        return com.google.android.recaptcha.internal.zzav.zzd;
    }

    public static final synthetic void zze(com.google.android.recaptcha.internal.zzav p0)
    {
        com.google.android.recaptcha.internal.zzav.zzb = p0;
        return;
    }

    public final Object zzb(int p2)
    {
        return this.zze.get(Integer.valueOf(p2));
    }
}
