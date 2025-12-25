package com.google.android.gms.internal.firebase-auth-api;
public final class zzacq extends com.google.android.gms.internal.firebase-auth-api.zzafo {

    public zzacq(q4.f p2, java.util.concurrent.Executor p3, java.util.concurrent.ScheduledExecutorService p4)
    {
        this.zza = new com.google.android.gms.internal.firebase-auth-api.zzaeo(p2, p4);
        this.zzb = p3;
        return;
    }

    public static z4.e zza(q4.f p7, com.google.android.gms.internal.firebase-auth-api.zzahk p8)
    {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p7);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p8);
        java.util.ArrayList v0_1 = new java.util.ArrayList();
        z4.e v1_4 = new z4.c();
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p8);
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty("firebase");
        v1_4.a = com.google.android.gms.common.internal.Preconditions.checkNotEmpty(p8.zzi());
        v1_4.b = "firebase";
        v1_4.e = p8.zzh();
        v1_4.c = p8.zzg();
        int v2_2 = p8.zzc();
        if (v2_2 != 0) {
            v1_4.d = v2_2.toString();
        }
        v1_4.m = p8.zzm();
        v1_4.n = 0;
        v1_4.f = p8.zzj();
        v0_1.add(v1_4);
        z4.e v1_0 = p8.zzl();
        if ((v1_0 != null) && (!v1_0.isEmpty())) {
            int v3_1 = 0;
            while (v3_1 < v1_0.size()) {
                String v5_2 = ((com.google.android.gms.internal.firebase-auth-api.zzaib) v1_0.get(v3_1));
                z4.c v4_3 = new z4.c();
                com.google.android.gms.common.internal.Preconditions.checkNotNull(v5_2);
                v4_3.a = v5_2.zzd();
                v4_3.b = com.google.android.gms.common.internal.Preconditions.checkNotEmpty(v5_2.zzf());
                v4_3.c = v5_2.zzb();
                String v6_5 = v5_2.zza();
                if (v6_5 != null) {
                    v4_3.d = v6_5.toString();
                }
                v4_3.e = v5_2.zzc();
                v4_3.f = v5_2.zze();
                v4_3.m = 0;
                v4_3.n = v5_2.zzg();
                v0_1.add(v4_3);
                v3_1++;
            }
        }
        z4.e v1_3 = new z4.e(p7, v0_1);
        v1_3.o = new z4.f(p8.zzb(), p8.zza());
        v1_3.p = p8.zzn();
        v1_3.q = p8.zze();
        v1_3.A(w3.a.h(p8.zzk()));
        java.util.ArrayList v7_7 = p8.zzd();
        if (v7_7 == null) {
            v7_7 = new java.util.ArrayList();
        }
        v1_3.s = v7_7;
        return v1_3;
    }

    public final com.google.android.gms.tasks.Task zza()
    {
        return this.zza(new com.google.android.gms.internal.firebase-auth-api.zzada());
    }

    public final com.google.android.gms.tasks.Task zza(String p2)
    {
        return this.zza(new com.google.android.gms.internal.firebase-auth-api.zzads(p2));
    }

    public final com.google.android.gms.tasks.Task zza(String p2, String p3)
    {
        return this.zza(new com.google.android.gms.internal.firebase-auth-api.zzacz(p2, p3));
    }

    public final com.google.android.gms.tasks.Task zza(String p2, String p3, String p4, String p5)
    {
        return this.zza(new com.google.android.gms.internal.firebase-auth-api.zzadn(p2, p3, p4, p5));
    }

    public final com.google.android.gms.tasks.Task zza(String p2, String p3, y4.a p4)
    {
        p4.o = 7;
        return this.zza(new com.google.android.gms.internal.firebase-auth-api.zzaeh(p2, p3, p4));
    }

    public final com.google.android.gms.tasks.Task zza(q4.f p2, String p3, String p4)
    {
        return this.zza(((com.google.android.gms.internal.firebase-auth-api.zzacp) new com.google.android.gms.internal.firebase-auth-api.zzacp(p3, p4).zza(p2)));
    }

    public final com.google.android.gms.tasks.Task zza(q4.f p2, String p3, String p4, String p5)
    {
        return this.zza(((com.google.android.gms.internal.firebase-auth-api.zzacr) new com.google.android.gms.internal.firebase-auth-api.zzacr(p3, p4, p5).zza(p2)));
    }

    public final com.google.android.gms.tasks.Task zza(q4.f p2, String p3, String p4, String p5, String p6, z4.y p7)
    {
        return this.zza(((com.google.android.gms.internal.firebase-auth-api.zzacu) new com.google.android.gms.internal.firebase-auth-api.zzacu(p3, p4, p5, p6).zza(p2).zza(p7)));
    }

    public final com.google.android.gms.tasks.Task zza(q4.f p2, String p3, String p4, z4.y p5)
    {
        return this.zza(((com.google.android.gms.internal.firebase-auth-api.zzadt) new com.google.android.gms.internal.firebase-auth-api.zzadt(p3, p4).zza(p2).zza(p5)));
    }

    public final com.google.android.gms.tasks.Task zza(q4.f p8, String p9, y4.a p10, String p11, String p12)
    {
        p10.o = 1;
        return this.zza(((com.google.android.gms.internal.firebase-auth-api.zzadp) new com.google.android.gms.internal.firebase-auth-api.zzadp(p9, p10, p11, p12, "sendPasswordResetEmail").zza(p8)));
    }

    public final com.google.android.gms.tasks.Task zza(q4.f p2, y4.a p3, String p4)
    {
        return this.zza(((com.google.android.gms.internal.firebase-auth-api.zzadq) new com.google.android.gms.internal.firebase-auth-api.zzadq(p4, p3).zza(p2)));
    }

    public final com.google.android.gms.tasks.Task zza(q4.f p2, y4.c p3, String p4, z4.y p5)
    {
        return this.zza(((com.google.android.gms.internal.firebase-auth-api.zzadu) new com.google.android.gms.internal.firebase-auth-api.zzadu(p3, p4).zza(p2).zza(p5)));
    }

    public final com.google.android.gms.tasks.Task zza(q4.f p2, y4.d p3, String p4, z4.y p5)
    {
        return this.zza(((com.google.android.gms.internal.firebase-auth-api.zzadv) new com.google.android.gms.internal.firebase-auth-api.zzadv(p3, p4).zza(p2).zza(p5)));
    }

    public final com.google.android.gms.tasks.Task zza(q4.f p2, y4.l p3, String p4, String p5, String p6, String p7, z4.w p8)
    {
        return this.zza(((com.google.android.gms.internal.firebase-auth-api.zzadk) new com.google.android.gms.internal.firebase-auth-api.zzadk(p4, p5, p6, p7).zza(p2).zza(p3).zza(p8).zza(p8)));
    }

    public final com.google.android.gms.tasks.Task zza(q4.f p3, y4.l p4, String p5, String p6, z4.w p7)
    {
        return this.zza(((com.google.android.gms.internal.firebase-auth-api.zzaec) new com.google.android.gms.internal.firebase-auth-api.zzaec(((z4.e) p4).a.zzf(), p5, p6).zza(p3).zza(p4).zza(p7).zza(p7)));
    }

    public final com.google.android.gms.tasks.Task zza(q4.f p2, y4.l p3, String p4, z4.w p5)
    {
        return this.zza(((com.google.android.gms.internal.firebase-auth-api.zzacx) new com.google.android.gms.internal.firebase-auth-api.zzacx(p4).zza(p2).zza(p3).zza(p5).zza(p5)));
    }

    public final com.google.android.gms.tasks.Task zza(q4.f p2, y4.l p3, y4.c0 p4, z4.w p5)
    {
        return this.zza(((com.google.android.gms.internal.firebase-auth-api.zzaei) new com.google.android.gms.internal.firebase-auth-api.zzaei(p4).zza(p2).zza(p3).zza(p5).zza(p5)));
    }

    public final com.google.android.gms.tasks.Task zza(q4.f p3, y4.l p4, y4.c p5, String p6, z4.w p7)
    {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p3);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p5);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p4);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p7);
        com.google.android.gms.internal.firebase-auth-api.zzadc v0_6 = ((z4.e) p4).f;
        if ((v0_6 == null) || (!v0_6.contains(p5.x()))) {
            if (!(p5 instanceof y4.d)) {
                if (!(p5 instanceof y4.s)) {
                    com.google.android.gms.common.internal.Preconditions.checkNotNull(p3);
                    com.google.android.gms.common.internal.Preconditions.checkNotNull(p5);
                    com.google.android.gms.common.internal.Preconditions.checkNotNull(p4);
                    com.google.android.gms.common.internal.Preconditions.checkNotNull(p7);
                    return this.zza(((com.google.android.gms.internal.firebase-auth-api.zzadb) new com.google.android.gms.internal.firebase-auth-api.zzadb(p5).zza(p3).zza(p4).zza(p7).zza(p7)));
                } else {
                    com.google.android.gms.internal.firebase-auth-api.zzagb.zza();
                    return this.zza(((com.google.android.gms.internal.firebase-auth-api.zzade) new com.google.android.gms.internal.firebase-auth-api.zzade(((y4.s) p5)).zza(p3).zza(p4).zza(p7).zza(p7)));
                }
            } else {
                if (!android.text.TextUtils.isEmpty(((y4.d) p5).c)) {
                    return this.zza(((com.google.android.gms.internal.firebase-auth-api.zzadd) new com.google.android.gms.internal.firebase-auth-api.zzadd(((y4.d) p5)).zza(p3).zza(p4).zza(p7).zza(p7)));
                } else {
                    return this.zza(((com.google.android.gms.internal.firebase-auth-api.zzadc) new com.google.android.gms.internal.firebase-auth-api.zzadc(((y4.d) p5), p6).zza(p3).zza(p4).zza(p7).zza(p7)));
                }
            }
        } else {
            return com.google.android.gms.tasks.Tasks.forException(com.google.android.gms.internal.firebase-auth-api.zzaen.zza(new com.google.android.gms.common.api.Status(17015)));
        }
    }

    public final com.google.android.gms.tasks.Task zza(q4.f p2, y4.l p3, y4.d p4, String p5, z4.w p6)
    {
        return this.zza(((com.google.android.gms.internal.firebase-auth-api.zzadi) new com.google.android.gms.internal.firebase-auth-api.zzadi(p4, p5).zza(p2).zza(p3).zza(p6).zza(p6)));
    }

    public final com.google.android.gms.tasks.Task zza(q4.f p2, y4.l p3, y4.s p4, String p5, z4.w p6)
    {
        com.google.android.gms.internal.firebase-auth-api.zzagb.zza();
        return this.zza(((com.google.android.gms.internal.firebase-auth-api.zzadm) new com.google.android.gms.internal.firebase-auth-api.zzadm(p4, p5).zza(p2).zza(p3).zza(p6).zza(p6)));
    }

    public final com.google.android.gms.tasks.Task zza(q4.f p2, y4.l p3, y4.s p4, z4.w p5)
    {
        com.google.android.gms.internal.firebase-auth-api.zzagb.zza();
        return this.zza(((com.google.android.gms.internal.firebase-auth-api.zzaef) new com.google.android.gms.internal.firebase-auth-api.zzaef(p4).zza(p2).zza(p3).zza(p5).zza(p5)));
    }

    public final com.google.android.gms.tasks.Task zza(q4.f p3, y4.l p4, y4.v p5, String p6, z4.y p7)
    {
        com.google.android.gms.internal.firebase-auth-api.zzagb.zza();
        com.google.android.gms.internal.firebase-auth-api.zzacy v0_1 = new com.google.android.gms.internal.firebase-auth-api.zzacy(p5, p6, 0);
        v0_1.zza(p3).zza(p7);
        if (p4 != null) {
            v0_1.zza(p4);
        }
        return this.zza(v0_1);
    }

    public final com.google.android.gms.tasks.Task zza(q4.f p2, y4.l p3, y4.y p4, String p5, String p6, z4.y p7)
    {
        com.google.android.gms.internal.firebase-auth-api.zzacy v0_1 = new com.google.android.gms.internal.firebase-auth-api.zzacy(p4, p5, p6);
        v0_1.zza(p2).zza(p7);
        if (p3 != null) {
            v0_1.zza(p3);
        }
        return this.zza(v0_1);
    }

    public final com.google.android.gms.tasks.Task zza(q4.f p2, y4.l p3, z4.w p4)
    {
        return this.zza(((com.google.android.gms.internal.firebase-auth-api.zzado) new com.google.android.gms.internal.firebase-auth-api.zzado().zza(p2).zza(p3).zza(p4).zza(p4)));
    }

    public final com.google.android.gms.tasks.Task zza(q4.f p2, y4.s p3, String p4, z4.y p5)
    {
        com.google.android.gms.internal.firebase-auth-api.zzagb.zza();
        return this.zza(((com.google.android.gms.internal.firebase-auth-api.zzady) new com.google.android.gms.internal.firebase-auth-api.zzady(p3, p4).zza(p2).zza(p5)));
    }

    public final com.google.android.gms.tasks.Task zza(q4.f p3, y4.v p4, y4.l p5, String p6, z4.y p7)
    {
        com.google.android.gms.internal.firebase-auth-api.zzagb.zza();
        com.google.android.gms.internal.firebase-auth-api.zzacv v0_1 = new com.google.android.gms.internal.firebase-auth-api.zzacv(p4, ((z4.e) p5).a.zzf(), p6, 0);
        v0_1.zza(p3).zza(p7);
        return this.zza(v0_1);
    }

    public final com.google.android.gms.tasks.Task zza(q4.f p2, y4.y p3, y4.l p4, String p5, String p6, z4.y p7)
    {
        com.google.android.gms.internal.firebase-auth-api.zzacv v0_1 = new com.google.android.gms.internal.firebase-auth-api.zzacv(p3, ((z4.e) p4).a.zzf(), p5, p6);
        v0_1.zza(p2).zza(p7);
        return this.zza(v0_1);
    }

    public final com.google.android.gms.tasks.Task zza(q4.f p2, z4.y p3, String p4)
    {
        return this.zza(((com.google.android.gms.internal.firebase-auth-api.zzadr) new com.google.android.gms.internal.firebase-auth-api.zzadr(p4).zza(p2).zza(p3)));
    }

    public final com.google.android.gms.tasks.Task zza(y4.l p2, z4.k p3)
    {
        return this.zza(((com.google.android.gms.internal.firebase-auth-api.zzact) new com.google.android.gms.internal.firebase-auth-api.zzact().zza(p2).zza(p3).zza(p3)));
    }

    public final com.google.android.gms.tasks.Task zza(z4.h p2, String p3)
    {
        return this.zza(new com.google.android.gms.internal.firebase-auth-api.zzaea(p2, p3));
    }

    public final com.google.android.gms.tasks.Task zza(z4.h p13, String p14, String p15, long p16, boolean p18, boolean p19, String p20, String p21, String p22, boolean p23, y4.u p24, java.util.concurrent.Executor p25, android.app.Activity p26)
    {
        com.google.android.gms.internal.firebase-auth-api.zzadx v1_1 = new com.google.android.gms.internal.firebase-auth-api.zzadx(p13, p14, p15, p16, p18, p19, p20, p21, p22, p23);
        v1_1.zza(p24, p26, p25, p14);
        return this.zza(v1_1);
    }

    public final com.google.android.gms.tasks.Task zza(z4.h p13, y4.w p14, String p15, long p16, boolean p18, boolean p19, String p20, String p21, String p22, boolean p23, y4.u p24, java.util.concurrent.Executor p25, android.app.Activity p26)
    {
        com.google.android.gms.internal.firebase-auth-api.zzadz v0_1 = new com.google.android.gms.internal.firebase-auth-api.zzadz(p14, com.google.android.gms.common.internal.Preconditions.checkNotEmpty(p13.b), p15, p16, p18, p19, p20, p21, p22, p23);
        v0_1.zza(p24, p26, p25, p14.a);
        return this.zza(v0_1);
    }

    public final void zza(q4.f p2, com.google.android.gms.internal.firebase-auth-api.zzaij p3, y4.u p4, android.app.Activity p5, java.util.concurrent.Executor p6)
    {
        this.zza(((com.google.android.gms.internal.firebase-auth-api.zzaej) new com.google.android.gms.internal.firebase-auth-api.zzaej(p3).zza(p2).zza(p4, p5, p6, p3.zzd())));
        return;
    }

    public final com.google.android.gms.tasks.Task zzb(q4.f p2, String p3, String p4)
    {
        return this.zza(((com.google.android.gms.internal.firebase-auth-api.zzacs) new com.google.android.gms.internal.firebase-auth-api.zzacs(p3, p4).zza(p2)));
    }

    public final com.google.android.gms.tasks.Task zzb(q4.f p2, String p3, String p4, String p5, String p6, z4.y p7)
    {
        return this.zza(((com.google.android.gms.internal.firebase-auth-api.zzadw) new com.google.android.gms.internal.firebase-auth-api.zzadw(p3, p4, p5, p6).zza(p2).zza(p7)));
    }

    public final com.google.android.gms.tasks.Task zzb(q4.f p8, String p9, y4.a p10, String p11, String p12)
    {
        p10.o = 6;
        return this.zza(((com.google.android.gms.internal.firebase-auth-api.zzadp) new com.google.android.gms.internal.firebase-auth-api.zzadp(p9, p10, p11, p12, "sendSignInLinkToEmail").zza(p8)));
    }

    public final com.google.android.gms.tasks.Task zzb(q4.f p2, y4.l p3, String p4, String p5, String p6, String p7, z4.w p8)
    {
        return this.zza(((com.google.android.gms.internal.firebase-auth-api.zzadj) new com.google.android.gms.internal.firebase-auth-api.zzadj(p4, p5, p6, p7).zza(p2).zza(p3).zza(p8).zza(p8)));
    }

    public final com.google.android.gms.tasks.Task zzb(q4.f p2, y4.l p3, String p4, z4.w p5)
    {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p2);
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(p4);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p3);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p5);
        com.google.android.gms.internal.firebase-auth-api.zzaee v0_7 = ((z4.e) p3).f;
        if (((v0_7 == null) || (v0_7.contains(p4))) && (!p3.y())) {
            p4.getClass();
            if (p4.equals("password")) {
                return this.zza(((com.google.android.gms.internal.firebase-auth-api.zzaeb) new com.google.android.gms.internal.firebase-auth-api.zzaeb().zza(p2).zza(p3).zza(p5).zza(p5)));
            } else {
                return this.zza(((com.google.android.gms.internal.firebase-auth-api.zzaee) new com.google.android.gms.internal.firebase-auth-api.zzaee(p4).zza(p2).zza(p3).zza(p5).zza(p5)));
            }
        } else {
            return com.google.android.gms.tasks.Tasks.forException(com.google.android.gms.internal.firebase-auth-api.zzaen.zza(new com.google.android.gms.common.api.Status(17016, p4)));
        }
    }

    public final com.google.android.gms.tasks.Task zzb(q4.f p2, y4.l p3, y4.c p4, String p5, z4.w p6)
    {
        return this.zza(((com.google.android.gms.internal.firebase-auth-api.zzadg) new com.google.android.gms.internal.firebase-auth-api.zzadg(p4, p5).zza(p2).zza(p3).zza(p6).zza(p6)));
    }

    public final com.google.android.gms.tasks.Task zzb(q4.f p2, y4.l p3, y4.d p4, String p5, z4.w p6)
    {
        return this.zza(((com.google.android.gms.internal.firebase-auth-api.zzadh) new com.google.android.gms.internal.firebase-auth-api.zzadh(p4, p5).zza(p2).zza(p3).zza(p6).zza(p6)));
    }

    public final com.google.android.gms.tasks.Task zzb(q4.f p2, y4.l p3, y4.s p4, String p5, z4.w p6)
    {
        com.google.android.gms.internal.firebase-auth-api.zzagb.zza();
        return this.zza(((com.google.android.gms.internal.firebase-auth-api.zzadl) new com.google.android.gms.internal.firebase-auth-api.zzadl(p4, p5).zza(p2).zza(p3).zza(p6).zza(p6)));
    }

    public final com.google.android.gms.tasks.Task zzc(q4.f p2, String p3, String p4)
    {
        return this.zza(((com.google.android.gms.internal.firebase-auth-api.zzacw) new com.google.android.gms.internal.firebase-auth-api.zzacw(p3, p4).zza(p2)));
    }

    public final com.google.android.gms.tasks.Task zzc(q4.f p2, y4.l p3, String p4, z4.w p5)
    {
        return this.zza(((com.google.android.gms.internal.firebase-auth-api.zzaed) new com.google.android.gms.internal.firebase-auth-api.zzaed(p4).zza(p2).zza(p3).zza(p5).zza(p5)));
    }

    public final com.google.android.gms.tasks.Task zzc(q4.f p2, y4.l p3, y4.c p4, String p5, z4.w p6)
    {
        return this.zza(((com.google.android.gms.internal.firebase-auth-api.zzadf) new com.google.android.gms.internal.firebase-auth-api.zzadf(p4, p5).zza(p2).zza(p3).zza(p6).zza(p6)));
    }

    public final com.google.android.gms.tasks.Task zzd(q4.f p2, String p3, String p4)
    {
        return this.zza(((com.google.android.gms.internal.firebase-auth-api.zzaek) new com.google.android.gms.internal.firebase-auth-api.zzaek(p3, p4).zza(p2)));
    }

    public final com.google.android.gms.tasks.Task zzd(q4.f p2, y4.l p3, String p4, z4.w p5)
    {
        return this.zza(((com.google.android.gms.internal.firebase-auth-api.zzaeg) new com.google.android.gms.internal.firebase-auth-api.zzaeg(p4).zza(p2).zza(p3).zza(p5).zza(p5)));
    }
}
