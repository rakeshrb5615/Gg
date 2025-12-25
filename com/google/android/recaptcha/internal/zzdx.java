package com.google.android.recaptcha.internal;
final class zzdx extends n7.i implements u7.p {
    int zza;
    final synthetic com.google.android.recaptcha.internal.zzec zzb;

    public zzdx(com.google.android.recaptcha.internal.zzec p1, l7.c p2)
    {
        this.zzb = p1;
        super(2, p2);
        return;
    }

    public final l7.c create(Object p2, l7.c p3)
    {
        return new com.google.android.recaptcha.internal.zzdx(this.zzb, p3);
    }

    public final bridge synthetic Object invoke(Object p1, Object p2)
    {
        return ((com.google.android.recaptcha.internal.zzdx) this.create(((d8.c0) p1), ((l7.c) p2))).invokeSuspend(h7.l.a);
    }

    public final Object invokeSuspend(Object p3)
    {
        m7.a v0 = m7.a.a;
        int v1_0 = this.zza;
        c4.b.e0(p3);
        if (v1_0 == 0) {
            h7.l v3_4 = com.google.android.recaptcha.internal.zzec.zzg(this.zzb);
            this.zza = 1;
            if (((d8.u) v3_4).h(this) == v0) {
                return v0;
            }
        }
        return h7.l.a;
    }
}
