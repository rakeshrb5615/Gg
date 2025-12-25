package com.google.android.recaptcha.internal;
public final class zzej {
    private final String zza;
    private final long zzb;
    private final int zzc;

    public zzej(String p1, long p2, int p4)
    {
        this.zza = p1;
        this.zzb = p2;
        this.zzc = p4;
        return;
    }

    public final boolean equals(Object p5)
    {
        if ((!(p5 instanceof com.google.android.recaptcha.internal.zzej)) || ((!kotlin.jvm.internal.j.a(((com.google.android.recaptcha.internal.zzej) p5).zza, this.zza)) || ((((com.google.android.recaptcha.internal.zzej) p5).zzb != this.zzb) || (((com.google.android.recaptcha.internal.zzej) p5).zzc != this.zzc)))) {
            return 0;
        } else {
            return 1;
        }
    }

    public final int zza()
    {
        return this.zzc;
    }

    public final long zzb()
    {
        return this.zzb;
    }

    public final String zzc()
    {
        return this.zza;
    }
}
