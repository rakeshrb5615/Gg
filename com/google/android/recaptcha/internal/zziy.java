package com.google.android.recaptcha.internal;
final class zziy extends n7.i implements u7.p {
    Object zza;
    Object zzb;
    Object zzc;
    Object zzd;
    int zze;
    final synthetic com.google.android.recaptcha.internal.zzja zzf;
    final synthetic com.google.android.recaptcha.internal.zzen zzg;

    public zziy(com.google.android.recaptcha.internal.zzja p1, com.google.android.recaptcha.internal.zzen p2, l7.c p3)
    {
        this.zzf = p1;
        this.zzg = p2;
        super(2, p3);
        return;
    }

    public final l7.c create(Object p3, l7.c p4)
    {
        return new com.google.android.recaptcha.internal.zziy(this.zzf, this.zzg, p4);
    }

    public final bridge synthetic Object invoke(Object p1, Object p2)
    {
        return ((com.google.android.recaptcha.internal.zziy) this.create(((d8.c0) p1), ((l7.c) p2))).invokeSuspend(h7.l.a);
    }

    public final Object invokeSuspend(Object p9)
    {
        Object v4_0;
        com.google.android.recaptcha.internal.zzja v7_2;
        com.google.android.recaptcha.internal.zzja v6_1;
        com.google.android.recaptcha.internal.zzcg v1_6;
        m7.a v0 = m7.a.a;
        com.google.android.recaptcha.internal.zzcg v1_0 = this.zze;
        if (v1_0 == null) {
            c4.b.e0(p9);
            v6_1 = this.zzf;
            h7.l v9_1 = com.google.android.recaptcha.internal.zzja.zzs(v6_1);
            if (v9_1 == null) {
                v9_1 = 0;
            }
            com.google.android.recaptcha.internal.zzcg v1_2 = com.google.android.recaptcha.internal.zzja.zzs(this.zzf);
            if (v1_2 == null) {
                v1_2 = 0;
            }
            com.google.android.recaptcha.internal.zzja v7_1 = new com.google.android.recaptcha.internal.zzcg(v1_2.zzf());
            com.google.android.recaptcha.internal.zzcg v1_4 = this.zzf;
            this.zza = v6_1;
            this.zzb = v6_1;
            this.zzc = v9_1;
            this.zzd = v7_1;
            this.zze = 1;
            com.google.android.recaptcha.internal.zzcg v1_5 = v1_4.zzw(this);
            if (v1_5 != v0) {
                v4_0 = v9_1;
                p9 = v1_5;
                v1_6 = v7_1;
                v7_2 = v6_1;
                v7_2.zzb = v6_1.zzC(v4_0, v1_6, ((android.webkit.WebView) p9));
                n7.f.a(this.zzf.zzA().hashCode());
                com.google.android.recaptcha.internal.zzja.zzr(this.zzf).zzd();
                com.google.android.recaptcha.internal.zzja.zzr(this.zzf).zze();
                h7.l v9_14 = this.zzf;
                com.google.android.recaptcha.internal.zzcg v1_8 = com.google.android.recaptcha.internal.zzja.zzs(v9_14);
                if (v1_8 == null) {
                    v1_8 = 0;
                }
                this.zza = 0;
                this.zzb = 0;
                this.zzc = 0;
                this.zzd = 0;
                this.zze = 2;
                if (com.google.android.recaptcha.internal.zzja.zzt(v9_14, v1_8, this) != v0) {
                    n7.f.a(this.zzf.zzA().hashCode());
                    h7.l v9_20 = this.zzf.zzA();
                    this.zze = 3;
                    if (((d8.u) v9_20).h(this) != v0) {
                        h7.l v9_24 = this.zzf.zzm();
                        this.zze = 4;
                        if (v9_24.zzc(com.google.android.recaptcha.internal.zzje.zzc, this) != v0) {
                            this.zzg.zza();
                            return h7.l.a;
                        }
                    }
                }
            }
        } else {
            if (v1_0 == 1) {
                v1_6 = ((com.google.android.recaptcha.internal.zzcg) this.zzd);
                v4_0 = ((com.google.android.recaptcha.internal.zzsc) this.zzc);
                v6_1 = ((com.google.android.recaptcha.internal.zzja) this.zzb);
                v7_2 = ((com.google.android.recaptcha.internal.zzja) this.zza);
                c4.b.e0(p9);
            } else {
                c4.b.e0(p9);
                if (v1_0 == 2) {
                } else {
                    if (v1_0 == 3) {
                    }
                }
            }
        }
        return v0;
    }
}
