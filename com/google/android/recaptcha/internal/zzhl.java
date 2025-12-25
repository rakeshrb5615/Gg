package com.google.android.recaptcha.internal;
public final class zzhl implements com.google.android.recaptcha.internal.zzgx {
    public static final com.google.android.recaptcha.internal.zzhl zza;

    static zzhl()
    {
        com.google.android.recaptcha.internal.zzhl.zza = new com.google.android.recaptcha.internal.zzhl();
        return;
    }

    private zzhl()
    {
        return;
    }

    public final varargs void zza(int p3, com.google.android.recaptcha.internal.zzgd p4, com.google.android.recaptcha.internal.zzue[] p5)
    {
        if (p5.length != 1) {
            throw new com.google.android.recaptcha.internal.zzce(4, 3, 0);
        } else {
            p4.zzc().zze(p3, p4.zzc().zza(p5[0]));
            return;
        }
    }
}
