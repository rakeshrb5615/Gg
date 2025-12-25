package com.google.android.recaptcha.internal;
final class zzos {
    public static final synthetic int zza;
    private static final com.google.android.recaptcha.internal.zzos zzb;
    private final com.google.android.recaptcha.internal.zzox zzc;
    private final java.util.concurrent.ConcurrentMap zzd;

    static zzos()
    {
        com.google.android.recaptcha.internal.zzos.zzb = new com.google.android.recaptcha.internal.zzos();
        return;
    }

    private zzos()
    {
        this.zzd = new java.util.concurrent.ConcurrentHashMap();
        this.zzc = new com.google.android.recaptcha.internal.zzoa();
        return;
    }

    public static com.google.android.recaptcha.internal.zzos zza()
    {
        return com.google.android.recaptcha.internal.zzos.zzb;
    }

    public final com.google.android.recaptcha.internal.zzow zzb(Class p3)
    {
        com.google.android.recaptcha.internal.zznl.zzc(p3, "messageType");
        com.google.android.recaptcha.internal.zzow v1_3 = ((com.google.android.recaptcha.internal.zzow) this.zzd.get(p3));
        if (v1_3 != null) {
            return v1_3;
        } else {
            com.google.android.recaptcha.internal.zzow v1_0 = this.zzc.zza(p3);
            com.google.android.recaptcha.internal.zznl.zzc(p3, "messageType");
            com.google.android.recaptcha.internal.zzow v3_2 = ((com.google.android.recaptcha.internal.zzow) this.zzd.putIfAbsent(p3, v1_0));
            if (v3_2 != null) {
                return v3_2;
            } else {
                return v1_0;
            }
        }
    }
}
