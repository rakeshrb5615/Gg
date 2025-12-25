package com.google.android.recaptcha.internal;
final class zzk extends n7.i implements u7.p {
    int zza;
    final synthetic com.google.android.recaptcha.internal.zzl zzb;
    final synthetic com.google.android.recaptcha.internal.zzek zzc;
    final synthetic long zzd;
    final synthetic com.google.android.recaptcha.internal.zzsc zze;
    private synthetic Object zzf;

    public zzk(com.google.android.recaptcha.internal.zzl p1, com.google.android.recaptcha.internal.zzek p2, long p3, com.google.android.recaptcha.internal.zzsc p5, l7.c p6)
    {
        this.zzb = p1;
        this.zzc = p2;
        this.zzd = p3;
        this.zze = p5;
        super(2, p6);
        return;
    }

    public final l7.c create(Object p8, l7.c p9)
    {
        com.google.android.recaptcha.internal.zzk v0_1 = new com.google.android.recaptcha.internal.zzk(this.zzb, this.zzc, this.zzd, this.zze, p9);
        v0_1.zzf = p8;
        return v0_1;
    }

    public final bridge synthetic Object invoke(Object p1, Object p2)
    {
        return ((com.google.android.recaptcha.internal.zzk) this.create(((d8.c0) p1), ((l7.c) p2))).invokeSuspend(h7.l.a);
    }

    public final Object invokeSuspend(Object p12)
    {
        h7.h v0_1;
        h7.h v0_0 = m7.a.a;
        if (this.zza == 0) {
            c4.b.e0(p12);
            h7.l v12_8 = ((d8.c0) this.zzf);
            com.google.android.recaptcha.internal.zzl.zze(this.zzb, this.zzc);
            boolean v1_10 = this.zzc;
            v1_10.zzc(v1_10.zzd());
            boolean v1_1 = v1_10.zzf(30);
            com.google.android.recaptcha.internal.zzba v2_3 = new java.util.ArrayList();
            int v3_2 = this.zzb.zzd().iterator();
            while (v3_2.hasNext()) {
                v2_3.add(d8.f0.c(v12_8, new com.google.android.recaptcha.internal.zzj(((com.google.android.recaptcha.internal.zze) v3_2.next()), this.zzd, this.zze, 0)));
            }
            h7.l v12_2 = new d8.i0[0];
            h7.l v12_4 = ((d8.i0[]) v2_3.toArray(v12_2));
            h7.l v12_6 = ((d8.i0[]) java.util.Arrays.copyOf(v12_4, v12_4.length));
            this.zzf = v1_1;
            this.zza = 1;
            p12 = d8.f0.d(v12_6, this);
            if (p12 != v0_0) {
                v0_1 = v1_1;
                if ((((java.util.List) p12) == null) || (!((java.util.List) p12).isEmpty())) {
                    h7.l v12_10 = ((java.util.List) p12).iterator();
                    while (v12_10.hasNext()) {
                        if (!(((h7.h) v12_10.next()).a instanceof h7.g)) {
                            v0_1.zza();
                            h7.l v12_11 = h7.l.a;
                        }
                    }
                    h7.l v12_13 = new com.google.android.recaptcha.internal.zzbd(com.google.android.recaptcha.internal.zzbb.zzb, com.google.android.recaptcha.internal.zzba.zzY, 0);
                    v0_1.zzb(v12_13);
                    v12_11 = c4.b.p(v12_13);
                }
                v0_0 = new h7.h(v12_11);
            }
        } else {
            v0_1 = ((com.google.android.recaptcha.internal.zzen) this.zzf);
            c4.b.e0(p12);
        }
        return v0_0;
    }
}
