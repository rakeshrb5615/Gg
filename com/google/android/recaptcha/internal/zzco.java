package com.google.android.recaptcha.internal;
final class zzco extends n7.i implements u7.p {
    int zza;
    final synthetic android.app.Application zzb;
    final synthetic String zzc;
    final synthetic long zzd;

    public zzco(android.app.Application p1, String p2, long p3, l7.c p5)
    {
        this.zzb = p1;
        this.zzc = p2;
        this.zzd = p3;
        super(2, p5);
        return;
    }

    public final l7.c create(Object p7, l7.c p8)
    {
        return new com.google.android.recaptcha.internal.zzco(this.zzb, this.zzc, this.zzd, p8);
    }

    public final bridge synthetic Object invoke(Object p1, Object p2)
    {
        return ((com.google.android.recaptcha.internal.zzco) this.create(((d8.c0) p1), ((l7.c) p2))).invokeSuspend(h7.l.a);
    }

    public final Object invokeSuspend(Object p6)
    {
        m7.a v0 = m7.a.a;
        String v1_0 = this.zza;
        c4.b.e0(p6);
        if (v1_0 == null) {
            Object v6_2 = this.zzb;
            String v1_1 = this.zzc;
            long v2 = this.zzd;
            this.zza = 1;
            Object v6_1 = com.google.android.recaptcha.internal.zzcq.zzb(v6_2, v1_1, v2, this);
            if (v6_1 != v0) {
                return v6_1;
            } else {
                return v0;
            }
        } else {
            return p6;
        }
    }
}
