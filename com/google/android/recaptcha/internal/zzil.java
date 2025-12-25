package com.google.android.recaptcha.internal;
final class zzil extends n7.i implements u7.p {
    Object zza;
    int zzb;
    final synthetic com.google.android.recaptcha.internal.zzja zzc;

    public zzil(com.google.android.recaptcha.internal.zzja p1, l7.c p2)
    {
        this.zzc = p1;
        super(2, p2);
        return;
    }

    public final l7.c create(Object p2, l7.c p3)
    {
        return new com.google.android.recaptcha.internal.zzil(this.zzc, p3);
    }

    public final bridge synthetic Object invoke(Object p1, Object p2)
    {
        return ((com.google.android.recaptcha.internal.zzil) this.create(((d8.c0) p1), ((l7.c) p2))).invokeSuspend(h7.l.a);
    }

    public final Object invokeSuspend(Object p7)
    {
        com.google.android.recaptcha.internal.zzja v0_0 = m7.a.a;
        com.google.android.recaptcha.internal.zzik v1_0 = this.zzb;
        if (v1_0 == null) {
            c4.b.e0(p7);
            h7.l v7_10 = this.zzc;
            this.zzb = 1;
            p7 = v7_10.zzw(this);
            if (p7 != v0_0) {
                ((android.webkit.WebView) p7).removeJavascriptInterface("RN");
                h7.l v7_2 = this.zzc;
                this.zza = v7_2;
                this.zzb = 2;
                p7 = v7_2.zzw(this);
                if (p7 != v0_0) {
                    ((android.webkit.WebView) p7).getSettings().setJavaScriptEnabled(1);
                    h7.l v7_5 = this.zzc;
                    this.zza = 0;
                    this.zzb = 3;
                    p7 = v7_5.zzw(this);
                    if (p7 != v0_0) {
                        ((android.webkit.WebView) p7).addJavascriptInterface(this.zzc.zzq(), "RN");
                        h7.l v7_7 = this.zzc;
                        this.zzb = 4;
                        p7 = v7_7.zzw(this);
                        if (p7 != v0_0) {
                            ((android.webkit.WebView) p7).setWebViewClient(new com.google.android.recaptcha.internal.zzik(this.zzc));
                            return h7.l.a;
                        }
                    }
                }
            }
        } else {
            if (v1_0 == 1) {
                c4.b.e0(p7);
            } else {
                if (v1_0 == 2) {
                    c4.b.e0(p7);
                } else {
                    c4.b.e0(p7);
                    if (v1_0 == 3) {
                    }
                }
            }
        }
        return v0_0;
    }
}
