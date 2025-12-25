package com.google.android.recaptcha.internal;
public final class zzv extends com.google.android.recaptcha.internal.zze {
    private final com.google.android.recaptcha.internal.zzek zza;
    private final java.util.List zzb;
    private com.google.android.recaptcha.internal.zzle zzc;
    private final java.util.Map zzd;

    public synthetic zzv(android.content.Context p14, com.google.android.recaptcha.internal.zzek p15, com.google.android.recaptcha.internal.zzbi p16, java.util.List p17, int p18, kotlin.jvm.internal.f p19)
    {
        int v0_1 = new com.google.android.recaptcha.internal.zzab(p15.zza());
        com.google.android.recaptcha.internal.zzp v1_2 = new com.google.android.recaptcha.internal.zzp(p15.zza());
        com.google.android.recaptcha.internal.zzm v2_0 = new com.google.android.recaptcha.internal.zzm(p15.zza(), p14.getContentResolver());
        com.google.android.recaptcha.internal.zzn v3_2 = new com.google.android.recaptcha.internal.zzn(p15.zza());
        com.google.android.recaptcha.internal.zzan v9_0 = p15.zza();
        d8.c0 v8 = p16.zzc();
        com.google.android.recaptcha.internal.zzae v5_1 = new com.google.android.recaptcha.internal.zzae(v9_0, p14, v8, new com.google.android.recaptcha.internal.zzan(p14, v8, v9_0, com.google.android.play.core.integrity.IntegrityManagerFactory.createStandard(p14), 28800000), new com.google.android.recaptcha.internal.zzbs(com.google.android.gms.common.GoogleApiAvailabilityLight.getInstance()));
        java.util.LinkedHashMap v14_2 = new com.google.android.recaptcha.internal.zzy[5];
        v14_2[0] = v0_1;
        v14_2[1] = v1_2;
        v14_2[2] = v2_0;
        v14_2[3] = v3_2;
        v14_2[4] = v5_1;
        java.util.LinkedHashMap v14_3 = a.a.H(v14_2);
        this.zza = p15;
        this.zzb = v14_3;
        this.zzd = new java.util.LinkedHashMap();
        return;
    }

    public static final synthetic com.google.android.recaptcha.internal.zzsi zzm(com.google.android.recaptcha.internal.zzv p0, String p1)
    {
        return p0.zzq(p1);
    }

    public static final synthetic java.util.List zzn(com.google.android.recaptcha.internal.zzv p0)
    {
        return p0.zzb;
    }

    public static final synthetic void zzp(com.google.android.recaptcha.internal.zzv p0, com.google.android.recaptcha.internal.zzle p1)
    {
        p0.zzc = p1;
        return;
    }

    private final com.google.android.recaptcha.internal.zzsi zzq(String p6)
    {
        int v2_2;
        String v0_5 = ((java.util.List) this.zzd.remove(p6));
        if (v0_5 == null) {
            v2_2 = i7.o.a;
        } else {
            com.google.android.recaptcha.internal.zzaa v1_0 = i7.r.l0(i7.j.X(v0_5, 10));
            if (v1_0 < 16) {
                v1_0 = 16;
            }
            v2_2 = new java.util.LinkedHashMap(v1_0);
            String v0_1 = v0_5.iterator();
            while (v0_1.hasNext()) {
                com.google.android.recaptcha.internal.zzaa v1_4 = ((com.google.android.recaptcha.internal.zzaa) v0_1.next());
                v2_2.put(Integer.valueOf(v1_4.zzb()), v1_4);
            }
        }
        String v0_3 = this.zzs(v2_2, p6);
        com.google.android.recaptcha.internal.zzaa v1_2 = com.google.android.recaptcha.internal.zzsi.zzf();
        v1_2.zze(p6);
        com.google.android.recaptcha.internal.zzsi v6_1 = com.google.android.recaptcha.internal.zzsg.zzf();
        String v0_4 = v0_3.zzd();
        v6_1.zze(com.google.android.recaptcha.internal.zzkh.zzh().zzi(v0_4, 0, v0_4.length));
        v1_2.zzf(v6_1);
        return ((com.google.android.recaptcha.internal.zzsi) v1_2.zzi());
    }

    private final com.google.android.recaptcha.internal.zzsx zzr(com.google.android.recaptcha.internal.zzaa p6)
    {
        com.google.android.recaptcha.internal.zzsv v0 = com.google.android.recaptcha.internal.zzsx.zzf();
        v0.zzq(3);
        int v3 = 0;
        if (!(p6 instanceof com.google.android.recaptcha.internal.zzx)) {
            if (!(p6 instanceof com.google.android.recaptcha.internal.zzw)) {
                throw new a5.o();
            } else {
                com.google.android.recaptcha.internal.zzte vtmp4 = ((com.google.android.recaptcha.internal.zzw) p6).zza();
                int v1_0 = this.zzc;
                if (v1_0 != 0) {
                    v3 = v1_0;
                }
                String v6_5 = vtmp4.zzd();
                v0.zze(com.google.android.recaptcha.internal.zzcf.zza(com.google.android.recaptcha.internal.zzkh.zzh().zzi(v6_5, 0, v6_5.length), v3));
            }
        } else {
            com.google.android.recaptcha.internal.zzti vtmp3 = ((com.google.android.recaptcha.internal.zzx) p6).zza();
            int v1_3 = this.zzc;
            if (v1_3 != 0) {
                v3 = v1_3;
            }
            String v6_10 = vtmp3.zzd();
            v0.zzf(com.google.android.recaptcha.internal.zzcf.zza(com.google.android.recaptcha.internal.zzkh.zzh().zzi(v6_10, 0, v6_10.length), v3));
        }
        return ((com.google.android.recaptcha.internal.zzsx) v0.zzi());
    }

    private final com.google.android.recaptcha.internal.zzsz zzs(java.util.Map p8, String p9)
    {
        com.google.android.recaptcha.internal.zzsy v0 = com.google.android.recaptcha.internal.zzsz.zzf();
        v0.zzq(p9);
        java.util.ArrayList v9_4 = this.zzb;
        com.google.android.recaptcha.internal.zzsx v1_7 = new java.util.ArrayList();
        java.util.ArrayList v9_5 = v9_4.iterator();
        while (v9_5.hasNext()) {
            int v2_1 = v9_5.next();
            if (((com.google.android.recaptcha.internal.zzy) v2_1).zzf()) {
                v1_7.add(v2_1);
            }
        }
        java.util.ArrayList v9_1 = v1_7.size();
        int v2_0 = 0;
        while (v2_0 < v9_1) {
            com.google.android.recaptcha.internal.zzsx v3_0 = v1_7.get(v2_0);
            v2_0++;
            com.google.android.recaptcha.internal.zzsx v3_1 = ((com.google.android.recaptcha.internal.zzy) v3_0);
            if (!p8.containsKey(Integer.valueOf(v3_1.zza()))) {
                com.google.android.recaptcha.internal.zzsx v3_2 = v3_1.zza();
                com.google.android.recaptcha.internal.zzte v5_0 = com.google.android.recaptcha.internal.zzte.zzf();
                v5_0.zzf(v3_2);
                v5_0.zzr(13);
                v5_0.zzq(27);
                v0.zzf(this.zzr(new com.google.android.recaptcha.internal.zzw(v3_2, ((com.google.android.recaptcha.internal.zzte) v5_0.zzi()))));
            }
        }
        com.google.android.recaptcha.internal.zzsz v8_1 = p8.values();
        java.util.ArrayList v9_3 = new java.util.ArrayList(i7.j.X(v8_1, 10));
        com.google.android.recaptcha.internal.zzsz v8_2 = v8_1.iterator();
        while (v8_2.hasNext()) {
            v9_3.add(this.zzr(((com.google.android.recaptcha.internal.zzaa) v8_2.next())));
        }
        v0.zze(v9_3);
        return ((com.google.android.recaptcha.internal.zzsz) v0.zzi());
    }

    public final com.google.android.recaptcha.internal.zzen zza(String p2)
    {
        com.google.android.recaptcha.internal.zzek v0 = this.zza;
        v0.zzc(p2);
        return v0.zzf(35);
    }

    public final com.google.android.recaptcha.internal.zzen zzb()
    {
        com.google.android.recaptcha.internal.zzen v0_0 = this.zza;
        v0_0.zzc(v0_0.zzd());
        return v0_0.zzf(34);
    }

    public final Object zzd(String p1, l7.c p2)
    {
        return this.zzq(p1);
    }

    public final Object zzf(String p5, l7.c p6)
    {
        com.google.android.recaptcha.internal.zzq v0_2;
        if (!(p6 instanceof com.google.android.recaptcha.internal.zzq)) {
            v0_2 = new com.google.android.recaptcha.internal.zzq(this, p6);
        } else {
            v0_2 = ((com.google.android.recaptcha.internal.zzq) p6);
            m7.a v1_2 = ((com.google.android.recaptcha.internal.zzq) p6).zzc;
            if ((v1_2 & -2147483648) == 0) {
            } else {
                ((com.google.android.recaptcha.internal.zzq) p6).zzc = (v1_2 - -2147483648);
            }
        }
        h7.h v6_1 = v0_2.zza;
        m7.a v1_1 = m7.a.a;
        int v2_0 = v0_2.zzc;
        if (v2_0 == 0) {
            c4.b.e0(v6_1);
            h7.h v6_3 = new com.google.android.recaptcha.internal.zzs(this, p5, 0);
            v0_2.zzc = 1;
            v6_1 = d8.f0.e(v6_3, v0_2);
            if (v6_1 == v1_1) {
                return v1_1;
            }
        } else {
            if (v2_0 != 1) {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            } else {
                c4.b.e0(v6_1);
            }
        }
        return ((h7.h) v6_1).a;
    }

    public final Object zzh(com.google.android.recaptcha.internal.zzsc p5, l7.c p6)
    {
        com.google.android.recaptcha.internal.zzt v0_2;
        if (!(p6 instanceof com.google.android.recaptcha.internal.zzt)) {
            v0_2 = new com.google.android.recaptcha.internal.zzt(this, p6);
        } else {
            v0_2 = ((com.google.android.recaptcha.internal.zzt) p6);
            m7.a v1_2 = ((com.google.android.recaptcha.internal.zzt) p6).zzc;
            if ((v1_2 & -2147483648) == 0) {
            } else {
                ((com.google.android.recaptcha.internal.zzt) p6).zzc = (v1_2 - -2147483648);
            }
        }
        h7.h v6_1 = v0_2.zza;
        m7.a v1_1 = m7.a.a;
        int v2_0 = v0_2.zzc;
        if (v2_0 == 0) {
            c4.b.e0(v6_1);
            h7.h v6_3 = new com.google.android.recaptcha.internal.zzu(p5, this, 0);
            v0_2.zzc = 1;
            v6_1 = d8.f0.e(v6_3, v0_2);
            if (v6_1 == v1_1) {
                return v1_1;
            }
        } else {
            if (v2_0 != 1) {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            } else {
                c4.b.e0(v6_1);
            }
        }
        return ((h7.h) v6_1).a;
    }

    public final void zzk(com.google.android.recaptcha.internal.zzsr p3)
    {
        java.util.Iterator v0_1 = this.zzb.iterator();
        while (v0_1.hasNext()) {
            ((com.google.android.recaptcha.internal.zzy) v0_1.next()).zze(p3);
        }
        return;
    }

    public final java.util.Map zzo()
    {
        return this.zzd;
    }
}
