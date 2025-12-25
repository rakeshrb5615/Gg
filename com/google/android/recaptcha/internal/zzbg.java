package com.google.android.recaptcha.internal;
final class zzbg extends n7.i implements u7.p {

    public zzbg(l7.c p2)
    {
        super(2, p2);
        return;
    }

    public final l7.c create(Object p1, l7.c p2)
    {
        return new com.google.android.recaptcha.internal.zzbg(p2);
    }

    public final bridge synthetic Object invoke(Object p1, Object p2)
    {
        return ((com.google.android.recaptcha.internal.zzbg) this.create(((d8.c0) p1), ((l7.c) p2))).invokeSuspend(h7.l.a);
    }

    public final Object invokeSuspend(Object p2)
    {
        c4.b.e0(p2);
        Thread.currentThread().setPriority(8);
        return h7.l.a;
    }
}
