package com.google.android.recaptcha.internal;
final class zzeb extends n7.i implements u7.p {
    int zza;
    final synthetic com.google.android.recaptcha.internal.zzec zzb;
    final synthetic d8.t zzc;
    final synthetic long zzd;

    public zzeb(com.google.android.recaptcha.internal.zzec p1, d8.t p2, long p3, l7.c p5)
    {
        this.zzb = p1;
        this.zzc = p2;
        this.zzd = p3;
        super(2, p5);
        return;
    }

    public final l7.c create(Object p7, l7.c p8)
    {
        return new com.google.android.recaptcha.internal.zzeb(this.zzb, this.zzc, this.zzd, p8);
    }

    public final bridge synthetic Object invoke(Object p1, Object p2)
    {
        return ((com.google.android.recaptcha.internal.zzeb) this.create(((d8.c0) p1), ((l7.c) p2))).invokeSuspend(h7.l.a);
    }

    public final Object invokeSuspend(Object p12)
    {
        com.google.android.recaptcha.internal.zzbd v0_0 = m7.a.a;
        if (this.zza == 0) {
            c4.b.e0(p12);
            try {
                com.google.android.recaptcha.internal.zzdz v2_1 = new com.google.android.recaptcha.internal.zzdz(this.zzb);
                long v3_0 = new com.google.android.recaptcha.internal.zzea(this.zzb, this.zzd, this.zzc, 0);
                this.zza = 1;
                com.google.android.recaptcha.internal.zzeb v10 = this;
                try {
                    p12 = com.google.android.recaptcha.internal.zzbq.zza.zza(v2_1, 100, 1000, 4611686018427387904, v3_0, this);
                } catch (com.google.android.recaptcha.internal.zzbd v0_1) {
                    com.google.android.recaptcha.internal.zzbd v12_2 = v0_1;
                    com.google.android.recaptcha.internal.zzec.zzj(v10.zzb, com.google.android.recaptcha.internal.zzcm.zza());
                    ((d8.u) v10.zzc).O(v12_2);
                }
                if (p12 != v0_0) {
                    ((Boolean) p12).getClass();
                } else {
                    return v0_0;
                }
            } catch (com.google.android.recaptcha.internal.zzbd v0_1) {
                v10 = this;
            }
        } else {
            try {
                c4.b.e0(p12);
            } catch (com.google.android.recaptcha.internal.zzbd v0_2) {
                v12_2 = v0_2;
                v10 = this;
            }
        }
        return h7.l.a;
    }
}
