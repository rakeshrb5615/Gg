package com.google.android.recaptcha.internal;
final class zzcp extends n7.i implements u7.p {
    int zza;
    final synthetic android.app.Application zzb;
    final synthetic String zzc;

    public zzcp(android.app.Application p1, String p2, l7.c p3)
    {
        this.zzb = p1;
        this.zzc = p2;
        super(2, p3);
        return;
    }

    public final l7.c create(Object p3, l7.c p4)
    {
        return new com.google.android.recaptcha.internal.zzcp(this.zzb, this.zzc, p4);
    }

    public final bridge synthetic Object invoke(Object p1, Object p2)
    {
        return ((com.google.android.recaptcha.internal.zzcp) this.create(((d8.c0) p1), ((l7.c) p2))).invokeSuspend(h7.l.a);
    }

    public final Object invokeSuspend(Object p4)
    {
        m7.a v0 = m7.a.a;
        String v1_0 = this.zza;
        c4.b.e0(p4);
        if (v1_0 == null) {
            Object v4_1 = this.zzb;
            String v1_1 = this.zzc;
            this.zza = 1;
            Object v4_2 = com.google.android.recaptcha.internal.zzcq.zzd(v4_1, v1_1, this);
            if (v4_2 != v0) {
                return v4_2;
            } else {
                return v0;
            }
        } else {
            return p4;
        }
    }
}
