package com.google.android.recaptcha.internal;
final class zzr extends n7.i implements u7.p {
    int zza;
    final synthetic com.google.android.recaptcha.internal.zzy zzb;
    final synthetic String zzc;
    final synthetic java.util.List zzd;

    public zzr(com.google.android.recaptcha.internal.zzy p1, String p2, java.util.List p3, l7.c p4)
    {
        this.zzb = p1;
        this.zzc = p2;
        this.zzd = p3;
        super(2, p4);
        return;
    }

    public final l7.c create(Object p4, l7.c p5)
    {
        return new com.google.android.recaptcha.internal.zzr(this.zzb, this.zzc, this.zzd, p5);
    }

    public final bridge synthetic Object invoke(Object p1, Object p2)
    {
        return ((com.google.android.recaptcha.internal.zzr) this.create(((d8.c0) p1), ((l7.c) p2))).invokeSuspend(h7.l.a);
    }

    public final Object invokeSuspend(Object p4)
    {
        java.util.List v0_0 = m7.a.a;
        String v1_0 = this.zza;
        c4.b.e0(p4);
        if (v1_0 == null) {
            h7.l v4_3 = this.zzb;
            String v1_1 = this.zzc;
            this.zza = 1;
            p4 = v4_3.zzc(v1_1, this);
            if (p4 == v0_0) {
                return v0_0;
            }
        }
        this.zzd.add(((com.google.android.recaptcha.internal.zzaa) p4));
        return h7.l.a;
    }
}
