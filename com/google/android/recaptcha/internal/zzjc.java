package com.google.android.recaptcha.internal;
final class zzjc extends n7.i implements u7.p {
    final synthetic com.google.android.recaptcha.internal.zzjd zza;
    final synthetic android.content.Context zzb;

    public zzjc(com.google.android.recaptcha.internal.zzjd p1, android.content.Context p2, l7.c p3)
    {
        this.zza = p1;
        this.zzb = p2;
        super(2, p3);
        return;
    }

    public final l7.c create(Object p3, l7.c p4)
    {
        return new com.google.android.recaptcha.internal.zzjc(this.zza, this.zzb, p4);
    }

    public final bridge synthetic Object invoke(Object p1, Object p2)
    {
        return ((com.google.android.recaptcha.internal.zzjc) this.create(((d8.c0) p1), ((l7.c) p2))).invokeSuspend(h7.l.a);
    }

    public final Object invokeSuspend(Object p2)
    {
        c4.b.e0(p2);
        android.webkit.WebView v2_2 = com.google.android.recaptcha.internal.zzjd.zza(this.zza);
        if (v2_2 == null) {
            v2_2 = new android.webkit.WebView(this.zzb);
        }
        com.google.android.recaptcha.internal.zzjd.zzb(this.zza, v2_2);
        return v2_2;
    }
}
