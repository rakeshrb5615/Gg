package com.google.android.recaptcha.internal;
public final class zzp implements com.google.android.recaptcha.internal.zzy {
    private final com.google.android.recaptcha.internal.zzek zza;
    private final h7.d zzb;
    private boolean zzc;

    public zzp(com.google.android.recaptcha.internal.zzek p1)
    {
        this.zza = p1;
        this.zzb = a.a.F(com.google.android.recaptcha.internal.zzo.zza);
        this.zzc = 1;
        return;
    }

    private final com.google.android.recaptcha.internal.zzbf zzg()
    {
        return ((com.google.android.recaptcha.internal.zzbf) this.zzb.getValue());
    }

    public final int zza()
    {
        return 25;
    }

    public final com.google.android.recaptcha.internal.zzek zzb()
    {
        return this.zza;
    }

    public final Object zzc(String p2, l7.c p3)
    {
        com.google.android.recaptcha.internal.zzaa v2_1 = com.google.android.recaptcha.internal.zzz.zzb(this, p2);
        java.util.List v3_3 = this.zzg().zza();
        v2_1.zza();
        com.google.android.recaptcha.internal.zzaa v2_5 = com.google.android.recaptcha.internal.zzti.zzf();
        com.google.android.recaptcha.internal.zztg v0 = com.google.android.recaptcha.internal.zzth.zzf();
        v0.zzw(v3_3);
        v2_5.zze(a.a.G(v0.zzi()));
        return com.google.android.recaptcha.internal.zzz.zza(this, ((com.google.android.recaptcha.internal.zzti) v2_5.zzi()));
    }

    public final Object zzd(com.google.android.recaptcha.internal.zzse p5, l7.c p6)
    {
        p6 = com.google.android.recaptcha.internal.zzz.zzc(this);
        h7.l v1 = h7.l.a;
        if (p5.zzl().length() != 0) {
            this.zzg().zzb(i7.r.m0(new h7.f("_GRECAPTCHA_KC", p5.zzl())));
            p6.zza();
            return v1;
        } else {
            this.zzc = 0;
            p6.zzb(new com.google.android.recaptcha.internal.zzbd(com.google.android.recaptcha.internal.zzbb.zzb, com.google.android.recaptcha.internal.zzba.zzab, 0));
            return v1;
        }
    }

    public final void zze(com.google.android.recaptcha.internal.zzsr p1)
    {
        return;
    }

    public final boolean zzf()
    {
        return this.zzc;
    }
}
