package com.google.android.recaptcha.internal;
final class zzin extends n7.i implements u7.p {
    int zza;
    final synthetic com.google.android.recaptcha.internal.zzja zzb;
    final synthetic String zzc;

    public zzin(com.google.android.recaptcha.internal.zzja p1, String p2, l7.c p3)
    {
        this.zzb = p1;
        this.zzc = p2;
        super(2, p3);
        return;
    }

    public final l7.c create(Object p3, l7.c p4)
    {
        return new com.google.android.recaptcha.internal.zzin(this.zzb, this.zzc, p4);
    }

    public final bridge synthetic Object invoke(Object p1, Object p2)
    {
        return ((com.google.android.recaptcha.internal.zzin) this.create(((d8.c0) p1), ((l7.c) p2))).invokeSuspend(h7.l.a);
    }

    public final Object invokeSuspend(Object p4)
    {
        m7.a v0 = m7.a.a;
        String v1_0 = this.zza;
        c4.b.e0(p4);
        if (v1_0 == null) {
            h7.l v4_5 = this.zzb;
            this.zza = 1;
            p4 = v4_5.zzw(this);
            if (p4 == v0) {
                return v0;
            } else {
                ((android.webkit.WebView) p4).clearCache(1);
                h7.l v4_2 = this.zzb;
                String v1_1 = this.zzc;
                this.zza = 2;
                if (com.google.android.recaptcha.internal.zzja.zzu(v4_2, v1_1, this) == v0) {
                    return v0;
                }
            }
        } else {
            if (v1_0 == 1) {
            }
        }
        return h7.l.a;
    }
}
