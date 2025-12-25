package com.google.android.recaptcha.internal;
final class zziq extends n7.i implements u7.p {
    int zza;
    final synthetic com.google.android.recaptcha.internal.zzja zzb;
    final synthetic String zzc;

    public zziq(com.google.android.recaptcha.internal.zzja p1, String p2, l7.c p3)
    {
        this.zzb = p1;
        this.zzc = p2;
        super(2, p3);
        return;
    }

    public final l7.c create(Object p3, l7.c p4)
    {
        return new com.google.android.recaptcha.internal.zziq(this.zzb, this.zzc, p4);
    }

    public final bridge synthetic Object invoke(Object p1, Object p2)
    {
        return ((com.google.android.recaptcha.internal.zziq) this.create(((d8.c0) p1), ((l7.c) p2))).invokeSuspend(h7.l.a);
    }

    public final Object invokeSuspend(Object p4)
    {
        String v0_0 = m7.a.a;
        int v1_0 = this.zza;
        c4.b.e0(p4);
        if (v1_0 == 0) {
            h7.l v4_3 = this.zzb;
            this.zza = 1;
            p4 = v4_3.zzw(this);
            if (p4 == v0_0) {
                return v0_0;
            }
        }
        String v0_1 = this.zzc;
        int v1_2 = new StringBuilder("recaptcha.m.Main.execute(\"");
        v1_2.append(v0_1);
        v1_2.append("\")");
        ((android.webkit.WebView) p4).evaluateJavascript(v1_2.toString(), 0);
        return h7.l.a;
    }
}
