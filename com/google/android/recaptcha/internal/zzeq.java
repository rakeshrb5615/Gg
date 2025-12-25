package com.google.android.recaptcha.internal;
final class zzeq extends n7.i implements u7.p {
    final synthetic com.google.android.recaptcha.internal.zzes zza;

    public zzeq(com.google.android.recaptcha.internal.zzes p1, l7.c p2)
    {
        this.zza = p1;
        super(2, p2);
        return;
    }

    public final l7.c create(Object p2, l7.c p3)
    {
        return new com.google.android.recaptcha.internal.zzeq(this.zza, p3);
    }

    public final bridge synthetic Object invoke(Object p1, Object p2)
    {
        return ((com.google.android.recaptcha.internal.zzeq) this.create(((d8.c0) p1), ((l7.c) p2))).invokeSuspend(h7.l.a);
    }

    public final Object invokeSuspend(Object p3)
    {
        c4.b.e0(p3);
        h7.l v3_3 = this.zza;
        int v1_2 = com.google.android.recaptcha.internal.zzes.zzb(v3_3);
        if ((v1_2 != 0) && (v1_2.zzb() == 0)) {
            int v1_0 = com.google.android.recaptcha.internal.zzes.zzc();
            if (v1_0 != 0) {
                v1_0.cancel();
            }
            com.google.android.recaptcha.internal.zzes.zzf(0);
        }
        com.google.android.recaptcha.internal.zzes.zze(v3_3);
        return h7.l.a;
    }
}
