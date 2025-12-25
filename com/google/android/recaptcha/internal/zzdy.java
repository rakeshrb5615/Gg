package com.google.android.recaptcha.internal;
final class zzdy extends n7.i implements u7.l {
    int zza;
    final synthetic long zzb;
    final synthetic com.google.android.recaptcha.internal.zzec zzc;

    public zzdy(long p1, com.google.android.recaptcha.internal.zzec p3, l7.c p4)
    {
        this.zzb = p1;
        this.zzc = p3;
        super(1, p4);
        return;
    }

    public final l7.c create(l7.c p5)
    {
        return new com.google.android.recaptcha.internal.zzdy(this.zzb, this.zzc, p5);
    }

    public final bridge synthetic Object invoke(Object p2)
    {
        return ((com.google.android.recaptcha.internal.zzdy) this.create(((l7.c) p2))).invokeSuspend(h7.l.a);
    }

    public final Object invokeSuspend(Object p6)
    {
        m7.a v0 = m7.a.a;
        long v1_0 = this.zza;
        c4.b.e0(p6);
        if (v1_0 == 0) {
            long v1_1 = this.zzb;
            com.google.android.recaptcha.internal.zzdx v3_1 = new com.google.android.recaptcha.internal.zzdx(this.zzc, 0);
            this.zza = 1;
            if (d8.f0.y(v1_1, v3_1, this) == v0) {
                return v0;
            }
        }
        return h7.l.a;
    }
}
