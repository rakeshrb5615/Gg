package com.google.android.recaptcha.internal;
final class zzfb extends n7.i implements u7.p {
    final synthetic com.google.android.recaptcha.internal.zzff zza;
    final synthetic String zzb;
    final synthetic com.google.android.recaptcha.internal.zzto zzc;

    public zzfb(com.google.android.recaptcha.internal.zzff p1, String p2, com.google.android.recaptcha.internal.zzto p3, l7.c p4)
    {
        this.zza = p1;
        this.zzb = p2;
        this.zzc = p3;
        super(2, p4);
        return;
    }

    public final l7.c create(Object p4, l7.c p5)
    {
        return new com.google.android.recaptcha.internal.zzfb(this.zza, this.zzb, this.zzc, p5);
    }

    public final bridge synthetic Object invoke(Object p1, Object p2)
    {
        return ((com.google.android.recaptcha.internal.zzfb) this.create(((d8.c0) p1), ((l7.c) p2))).invokeSuspend(h7.l.a);
    }

    public final Object invokeSuspend(Object p4)
    {
        c4.b.e0(p4);
        if (!com.google.android.recaptcha.internal.zzff.zzb(this.zza).zzb(this.zzb)) {
            throw new com.google.android.recaptcha.internal.zzbd(com.google.android.recaptcha.internal.zzbb.zzc, com.google.android.recaptcha.internal.zzba.zzQ, 0);
        } else {
            return com.google.android.recaptcha.internal.zzff.zza(this.zza).zza(this.zzb, this.zzc);
        }
    }
}
