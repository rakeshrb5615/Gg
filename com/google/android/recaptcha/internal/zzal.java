package com.google.android.recaptcha.internal;
final class zzal extends n7.i implements u7.p {
    long zza;
    boolean zzb;
    int zzc;
    final synthetic com.google.android.recaptcha.internal.zzan zzd;
    final synthetic com.google.android.recaptcha.internal.zzen zze;
    final synthetic kotlin.jvm.internal.r zzf;

    public zzal(com.google.android.recaptcha.internal.zzan p1, com.google.android.recaptcha.internal.zzen p2, kotlin.jvm.internal.r p3, l7.c p4)
    {
        this.zzd = p1;
        this.zze = p2;
        this.zzf = p3;
        super(2, p4);
        return;
    }

    public final l7.c create(Object p4, l7.c p5)
    {
        return new com.google.android.recaptcha.internal.zzal(this.zzd, this.zze, this.zzf, p5);
    }

    public final bridge synthetic Object invoke(Object p1, Object p2)
    {
        return ((com.google.android.recaptcha.internal.zzal) this.create(((d8.c0) p1), ((l7.c) p2))).invokeSuspend(h7.l.a);
    }

    public final Object invokeSuspend(Object p8)
    {
        Object v8_1;
        long v4;
        m7.a v0 = m7.a.a;
        int v1_0 = this.zzc;
        try {
            if (v1_0 == 0) {
                c4.b.e0(p8);
                v4 = 1000;
                v8_1 = 1;
                if (v8_1 == null) {
                    return h7.l.a;
                } else {
                    Object v8_3 = this.zzd;
                    this.zza = v4;
                    this.zzc = 1;
                    p8 = com.google.android.recaptcha.internal.zzan.zza(v8_3, this);
                    if (p8 == v0) {
                        return v0;
                    }
                }
            } else {
                if (v1_0 == 1) {
                    v4 = this.zza;
                    c4.b.e0(p8);
                } else {
                    int v1_1 = this.zzb;
                    v4 = this.zza;
                    c4.b.e0(p8);
                    v8_1 = v1_1;
                    v4 += v4;
                }
            }
        } catch (Object v8_4) {
            this.zzf.a = v8_4;
            if (!(v8_4 instanceof com.google.android.play.core.integrity.StandardIntegrityException)) {
                v1_1 = 0;
            } else {
                int v1_6 = ((com.google.android.play.core.integrity.StandardIntegrityException) v8_4).getErrorCode();
                if (v1_6 != -100) {
                    if (v1_6 != -18) {
                        if (v1_6 != -12) {
                            if (v1_6 != -8) {
                                if (v1_6 != -3) {
                                }
                            }
                        }
                    }
                }
                v1_1 = 1;
            }
            if (v1_1 == 0) {
                throw v8_4;
            } else {
                this.zza = v4;
                this.zzb = 1;
                this.zzc = 2;
                if (d8.f0.f(v4, this) == v0) {
                    return v0;
                }
            }
        }
        ((d8.u) this.zzd.zzf()).A(((com.google.android.play.core.integrity.StandardIntegrityManager$StandardIntegrityTokenProvider) p8));
        com.google.android.recaptcha.internal.zzan.zzh(this.zzd, com.google.android.recaptcha.internal.zzao.zzc);
        this.zze.zza();
        v8_1 = 0;
    }
}
