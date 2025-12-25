package com.google.android.recaptcha.internal;
final class zzh extends n7.i implements u7.p {
    int zza;
    final synthetic com.google.android.recaptcha.internal.zzl zzb;
    final synthetic String zzc;
    final synthetic long zzd;
    private synthetic Object zze;

    public zzh(com.google.android.recaptcha.internal.zzl p1, String p2, long p3, l7.c p5)
    {
        this.zzb = p1;
        this.zzc = p2;
        this.zzd = p3;
        super(2, p5);
        return;
    }

    public final l7.c create(Object p7, l7.c p8)
    {
        com.google.android.recaptcha.internal.zzh v0_1 = new com.google.android.recaptcha.internal.zzh(this.zzb, this.zzc, this.zzd, p8);
        v0_1.zze = p7;
        return v0_1;
    }

    public final bridge synthetic Object invoke(Object p1, Object p2)
    {
        return ((com.google.android.recaptcha.internal.zzh) this.create(((d8.c0) p1), ((l7.c) p2))).invokeSuspend(h7.l.a);
    }

    public final Object invokeSuspend(Object p12)
    {
        com.google.android.recaptcha.internal.zzsi v0_1;
        com.google.android.recaptcha.internal.zzsi v0_0 = m7.a.a;
        if (this.zza == 0) {
            com.google.android.recaptcha.internal.zzsi v1_1;
            c4.b.e0(p12);
            Object v12_8 = ((d8.c0) this.zze);
            com.google.android.recaptcha.internal.zzsi v1_7 = com.google.android.recaptcha.internal.zzl.zza(this.zzb);
            if (v1_7 == null) {
                v1_1 = 0;
            } else {
                v1_7.zzc(this.zzc);
                v1_1 = v1_7.zzf(31);
            }
            int v2_3 = new java.util.ArrayList();
            boolean v3_2 = this.zzb.zzd().iterator();
            while (v3_2.hasNext()) {
                com.google.android.recaptcha.internal.zze v6_1 = ((com.google.android.recaptcha.internal.zze) v3_2.next());
                if (v6_1.zzl()) {
                    v2_3.add(d8.f0.c(v12_8, new com.google.android.recaptcha.internal.zzg(v6_1, this.zzc, this.zzd, 0)));
                }
            }
            Object v12_2 = new d8.i0[0];
            Object v12_4 = ((d8.i0[]) v2_3.toArray(v12_2));
            Object v12_6 = ((d8.i0[]) java.util.Arrays.copyOf(v12_4, v12_4.length));
            this.zze = v1_1;
            this.zza = 1;
            p12 = d8.f0.d(v12_6, this);
            if (p12 == v0_0) {
                return v0_0;
            } else {
                v0_1 = v1_1;
            }
        } else {
            v0_1 = ((com.google.android.recaptcha.internal.zzen) this.zze);
            c4.b.e0(p12);
        }
        com.google.android.recaptcha.internal.zzsi v1_3 = this.zzc;
        int v2_6 = com.google.android.recaptcha.internal.zzsi.zzf();
        v2_6.zze(v1_3);
        Object v12_10 = ((java.util.List) p12).iterator();
        while (v12_10.hasNext()) {
            com.google.android.recaptcha.internal.zzsi v1_8 = ((h7.h) v12_10.next()).a;
            if (!(v1_8 instanceof h7.g)) {
                v2_6.zzh(((com.google.android.recaptcha.internal.zzsi) v1_8));
            }
        }
        Object v12_12 = ((com.google.android.recaptcha.internal.zzsi) v2_6.zzi());
        if (v0_1 != null) {
            v0_1.zza();
        }
        return v12_12;
    }
}
