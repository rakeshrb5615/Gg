package com.google.android.recaptcha.internal;
final class zzs extends n7.i implements u7.p {
    int zza;
    final synthetic com.google.android.recaptcha.internal.zzv zzb;
    final synthetic String zzc;
    private synthetic Object zzd;

    public zzs(com.google.android.recaptcha.internal.zzv p1, String p2, l7.c p3)
    {
        this.zzb = p1;
        this.zzc = p2;
        super(2, p3);
        return;
    }

    public final l7.c create(Object p4, l7.c p5)
    {
        com.google.android.recaptcha.internal.zzs v0_1 = new com.google.android.recaptcha.internal.zzs(this.zzb, this.zzc, p5);
        v0_1.zzd = p4;
        return v0_1;
    }

    public final bridge synthetic Object invoke(Object p1, Object p2)
    {
        return ((com.google.android.recaptcha.internal.zzs) this.create(((d8.c0) p1), ((l7.c) p2))).invokeSuspend(h7.l.a);
    }

    public final Object invokeSuspend(Object p12)
    {
        h7.h v0_0 = m7.a.a;
        int v1_0 = this.zza;
        c4.b.e0(p12);
        if (v1_0 == 0) {
            Object v12_8 = ((d8.c0) this.zzd);
            int v1_4 = new java.util.ArrayList();
            this.zzb.zzo().put(this.zzc, v1_4);
            java.util.ArrayList v2_2 = new java.util.ArrayList();
            int v3_1 = com.google.android.recaptcha.internal.zzv.zzn(this.zzb);
            java.util.ArrayList v4_1 = new java.util.ArrayList();
            int v3_2 = v3_1.iterator();
            while (v3_2.hasNext()) {
                int v5_2 = v3_2.next();
                if (((com.google.android.recaptcha.internal.zzy) v5_2).zzf()) {
                    v4_1.add(v5_2);
                }
            }
            int v3_3 = v4_1.size();
            int v6_0 = 0;
            while (v6_0 < v3_3) {
                d8.w1 v7_0 = v4_1.get(v6_0);
                v6_0++;
                v2_2.add(d8.f0.p(v12_8, new com.google.android.recaptcha.internal.zzr(((com.google.android.recaptcha.internal.zzy) v7_0), this.zzc, v1_4, 0)));
            }
            Object v12_1 = new d8.e1[0];
            Object v12_3 = ((d8.e1[]) v2_2.toArray(v12_1));
            Object v12_5 = ((d8.e1[]) java.util.Arrays.copyOf(v12_3, v12_3.length));
            this.zza = 1;
            if (d8.f0.o(v12_5, this) == v0_0) {
                return v0_0;
            }
        }
        return new h7.h(com.google.android.recaptcha.internal.zzv.zzm(this.zzb, this.zzc));
    }
}
