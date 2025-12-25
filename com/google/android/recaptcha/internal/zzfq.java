package com.google.android.recaptcha.internal;
final class zzfq extends n7.i implements u7.p {
    int zza;
    final synthetic com.google.android.recaptcha.internal.zzgd zzb;
    final synthetic java.util.List zzc;
    final synthetic com.google.android.recaptcha.internal.zzft zzd;
    private synthetic Object zze;

    public zzfq(com.google.android.recaptcha.internal.zzgd p1, java.util.List p2, com.google.android.recaptcha.internal.zzft p3, l7.c p4)
    {
        this.zzb = p1;
        this.zzc = p2;
        this.zzd = p3;
        super(2, p4);
        return;
    }

    public final l7.c create(Object p5, l7.c p6)
    {
        com.google.android.recaptcha.internal.zzfq v0_1 = new com.google.android.recaptcha.internal.zzfq(this.zzb, this.zzc, this.zzd, p6);
        v0_1.zze = p5;
        return v0_1;
    }

    public final bridge synthetic Object invoke(Object p1, Object p2)
    {
        return ((com.google.android.recaptcha.internal.zzfq) this.create(((d8.c0) p1), ((l7.c) p2))).invokeSuspend(h7.l.a);
    }

    public final Object invokeSuspend(Object p12)
    {
        m7.a v1 = m7.a.a;
        com.google.android.recaptcha.internal.zzft v0_0 = this.zza;
        h7.l v2 = h7.l.a;
        c4.b.e0(p12);
        if (v0_0 == null) {
            Object v12_3 = ((d8.c0) this.zze);
            while(true) {
                com.google.android.recaptcha.internal.zzft v0_13 = this.zzb;
                if ((v0_13.zza() < 0) || (v0_13.zza() >= this.zzc.size())) {
                    break;
                }
                com.google.android.recaptcha.internal.zzft v0_5;
                com.google.android.recaptcha.internal.zzft v0_4 = ((d8.e1) v12_3.a().get(d8.b0.b));
                if (v0_4 == null) {
                    v0_5 = 1;
                } else {
                    v0_5 = v0_4.isActive();
                }
                if (v0_5 == null) {
                    break;
                }
                com.google.android.recaptcha.internal.zzgd v4_3 = ((com.google.android.recaptcha.internal.zzuf) this.zzc.get(this.zzb.zza()));
                try {
                    com.google.android.recaptcha.internal.zzft.zzf(this.zzd, v4_3, this.zzb);
                } catch (com.google.android.recaptcha.internal.zzft v0_9) {
                    Object v12_1 = v0_9;
                    v4_3.zzk();
                    n7.f.a(v4_3.zzg());
                    i7.i.c0(v4_3.zzj(), 0, 0, 0, new com.google.android.recaptcha.internal.zzfp(this.zzd), 31);
                    com.google.android.recaptcha.internal.zzft v0_12 = this.zzd;
                    com.google.android.recaptcha.internal.zzgd v4_4 = this.zzb;
                    this.zza = 1;
                    if (com.google.android.recaptcha.internal.zzft.zzd(v0_12, v12_1, v4_4, this) != v1) {
                        break;
                    }
                    return v1;
                }
            }
            return v2;
        } else {
            return v2;
        }
    }
}
