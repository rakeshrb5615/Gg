package com.google.android.recaptcha.internal;
public final class zzdt {
    private final String zza;
    private final com.google.android.recaptcha.internal.zzek zzb;
    private final com.google.android.recaptcha.internal.zzl zzc;
    private final h7.d zzd;
    private final h7.d zze;
    private final h7.d zzf;
    private final h7.d zzg;
    private final h7.d zzh;
    private final com.google.android.recaptcha.internal.zzbi zzi;

    public zzdt(String p1, com.google.android.recaptcha.internal.zzbi p2, com.google.android.recaptcha.internal.zzek p3, com.google.android.recaptcha.internal.zzl p4)
    {
        this.zza = p1;
        this.zzi = p2;
        this.zzb = p3;
        this.zzc = p4;
        this.zzd = a.a.F(com.google.android.recaptcha.internal.zzdm.zza);
        this.zze = a.a.F(com.google.android.recaptcha.internal.zzdn.zza);
        this.zzf = a.a.F(com.google.android.recaptcha.internal.zzdo.zza);
        this.zzg = a.a.F(com.google.android.recaptcha.internal.zzdp.zza);
        this.zzh = a.a.F(com.google.android.recaptcha.internal.zzdq.zza);
        return;
    }

    public static final synthetic android.app.Application zza(com.google.android.recaptcha.internal.zzdt p0)
    {
        return p0.zzr();
    }

    public static final synthetic com.google.android.recaptcha.internal.zzbd zzb(com.google.android.recaptcha.internal.zzdt p0, Exception p1, com.google.android.recaptcha.internal.zzbd p2)
    {
        return p0.zzs(p1, p2);
    }

    public static final synthetic com.google.android.recaptcha.internal.zzbf zzc(com.google.android.recaptcha.internal.zzdt p0)
    {
        return p0.zzt();
    }

    public static final synthetic com.google.android.recaptcha.internal.zzbr zzd(com.google.android.recaptcha.internal.zzdt p0)
    {
        return ((com.google.android.recaptcha.internal.zzbr) p0.zze.getValue());
    }

    public static final synthetic com.google.android.recaptcha.internal.zzek zze(com.google.android.recaptcha.internal.zzdt p0)
    {
        return p0.zzb;
    }

    public static final synthetic com.google.android.recaptcha.internal.zzek zzf(com.google.android.recaptcha.internal.zzdt p0, String p1)
    {
        return p0.zzu(p1);
    }

    public static final synthetic com.google.android.recaptcha.internal.zzff zzg(com.google.android.recaptcha.internal.zzdt p0)
    {
        return ((com.google.android.recaptcha.internal.zzff) p0.zzd.getValue());
    }

    public static final synthetic com.google.android.recaptcha.internal.zzfj zzh(com.google.android.recaptcha.internal.zzdt p0)
    {
        return ((com.google.android.recaptcha.internal.zzfj) p0.zzg.getValue());
    }

    public static final synthetic Object zzj(com.google.android.recaptcha.internal.zzdt p3, l7.c p4)
    {
        return d8.f0.x(p3.zzi.zza().a(), new com.google.android.recaptcha.internal.zzdh(p3, 0), p4);
    }

    public static final synthetic Object zzk(com.google.android.recaptcha.internal.zzdt p0, com.google.android.recaptcha.internal.zzsc p1, long p2, l7.c p4)
    {
        return p0.zzv(p1, p2, p4);
    }

    public static final synthetic String zzp(com.google.android.recaptcha.internal.zzdt p0)
    {
        return p0.zza;
    }

    private final android.app.Application zzr()
    {
        return ((android.app.Application) this.zzh.getValue());
    }

    private final com.google.android.recaptcha.internal.zzbd zzs(Exception p3, com.google.android.recaptcha.internal.zzbd p4)
    {
        if (!this.zzx()) {
            p4 = new com.google.android.recaptcha.internal.zzbd(com.google.android.recaptcha.internal.zzbb.zzc, com.google.android.recaptcha.internal.zzba.zzao, p3.getMessage());
        }
        return p4;
    }

    private final com.google.android.recaptcha.internal.zzbf zzt()
    {
        return ((com.google.android.recaptcha.internal.zzbf) this.zzf.getValue());
    }

    private final com.google.android.recaptcha.internal.zzek zzu(String p2)
    {
        com.google.android.recaptcha.internal.zzek v0_1 = this.zzb.zza();
        v0_1.zzc(p2);
        return v0_1;
    }

    private final Object zzv(com.google.android.recaptcha.internal.zzsc p10, long p11, l7.c p13)
    {
        m7.a v1_1;
        d8.b0 v0 = d8.b0.b;
        if (!(p13 instanceof com.google.android.recaptcha.internal.zzdj)) {
            v1_1 = new com.google.android.recaptcha.internal.zzdj(this, p13);
        } else {
            v1_1 = ((com.google.android.recaptcha.internal.zzdj) p13);
            int v2_8 = ((com.google.android.recaptcha.internal.zzdj) p13).zzd;
            if ((v2_8 & -2147483648) == 0) {
            } else {
                ((com.google.android.recaptcha.internal.zzdj) p13).zzd = (v2_8 - -2147483648);
            }
        }
        IllegalStateException v10_7;
        IllegalStateException v11_2;
        IllegalStateException v10_2;
        com.google.android.recaptcha.internal.zzdj v7 = v1_1;
        d8.e1 v13_3 = v7.zzb;
        m7.a v1_2 = m7.a.a;
        int v2_2 = v7.zzd;
        if (v2_2 == 0) {
            c4.b.e0(v13_3);
            com.google.android.recaptcha.internal.zzdt.zzy(p10.zzO());
            d8.e1 v13_6 = this.zzw().iterator();
            while (v13_6.hasNext()) {
                this.zzc.zzf(new com.google.android.recaptcha.internal.zze[] {((com.google.android.recaptcha.internal.zze) v13_6.next())}));
            }
            int v2_4 = this.zzc;
            com.google.android.recaptcha.internal.zzek v6 = this.zzb;
            v7.zza = this;
            v7.zzd = 1;
            v11_2 = v2_4.zzc(p11, p10, v6, v7);
            if (v11_2 != v1_2) {
                v10_7 = this;
                IllegalStateException v11_3 = h7.h.a(v11_2);
                if (v11_3 != null) {
                    StringBuilder v12_4 = ((d8.e1) v10_7.zzi.zzd().a().get(v0));
                    if (v12_4 != null) {
                        StringBuilder v12_5 = v12_4.getChildren();
                        if (v12_5 != null) {
                            StringBuilder v12_6 = v12_5.iterator();
                            while (v12_6.hasNext()) {
                                ((d8.e1) v12_6.next()).cancel(0);
                            }
                        }
                    }
                    IllegalStateException v10_11 = v10_7.zzi.zzd().a();
                    StringBuilder v12_8 = ((d8.e1) v10_11.get(v0));
                    if (v12_8 == null) {
                        StringBuilder v12_10 = new StringBuilder("Current context doesn\'t contain Job in it: ");
                        v12_10.append(v10_11);
                        throw new IllegalStateException(v12_10.toString().toString());
                    } else {
                        IllegalStateException v10_15 = a8.h.X(v12_8.getChildren());
                        v7.zza = v11_3;
                        v7.zzd = 2;
                        if (d8.f0.n(v10_15, v7) != v1_2) {
                            v10_2 = v11_3;
                        } else {
                            return v1_2;
                        }
                    }
                } else {
                    return h7.l.a;
                }
            }
        } else {
            if (v2_2 == 1) {
                v10_7 = ((com.google.android.recaptcha.internal.zzdt) v7.zza);
                c4.b.e0(v13_3);
                v11_2 = ((h7.h) v13_3).a;
            } else {
                if (v2_2 == 2) {
                    v10_2 = ((Throwable) v7.zza);
                    c4.b.e0(v13_3);
                } else {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
            }
        }
        throw v10_2;
    }

    private final java.util.List zzw()
    {
        java.util.List v0_1 = new java.util.ArrayList();
        v0_1.add(new com.google.android.recaptcha.internal.zzv(this.zzr(), this.zzb.zza(), this.zzi, 0, 8, 0));
        v0_1.add(new com.google.android.recaptcha.internal.zzja(this.zzb, this.zzi));
        return i7.i.j0(v0_1);
    }

    private final boolean zzx()
    {
        a.a.F(com.google.android.recaptcha.internal.zzdi.zza).getValue();
        try {
            int v0_1 = this.zzr().getSystemService("connectivity");
            kotlin.jvm.internal.j.c(v0_1, "null cannot be cast to non-null type android.net.ConnectivityManager");
            int v0_2 = ((android.net.ConnectivityManager) v0_1);
            int v1_1 = v0_2.getActiveNetwork();
        } catch (Exception) {
            return 0;
        }
        if (v1_1 != 0) {
            int v0_3 = v0_2.getNetworkCapabilities(v1_1);
            if (v0_3 != 0) {
                if (v0_3.hasCapability(16)) {
                    return 1;
                } else {
                    return 0;
                }
            } else {
                return 0;
            }
        } else {
            return 0;
        }
    }

    private static final void zzy(String p3)
    {
        try {
            ((com.google.android.recaptcha.internal.zzfu) a.a.F(com.google.android.recaptcha.internal.zzde.zza).getValue()).zza(com.google.android.recaptcha.internal.zzrv.zzj(com.google.android.recaptcha.internal.zzbt.zza(p3)));
            return;
        } catch (String v3_2) {
            throw new com.google.android.recaptcha.internal.zzbd(com.google.android.recaptcha.internal.zzbb.zzl, com.google.android.recaptcha.internal.zzba.zzan, v3_2.getMessage());
        }
    }

    public final com.google.android.recaptcha.internal.zzsp zzi(com.google.android.recaptcha.RecaptchaAction p3, com.google.android.recaptcha.internal.zzsi p4, com.google.android.recaptcha.internal.zzsc p5)
    {
        com.google.android.recaptcha.internal.zzso v0 = com.google.android.recaptcha.internal.zzsp.zzf();
        v0.zzs(this.zza);
        v0.zze(p3.getAction());
        v0.zzf(p5.zzN());
        v0.zzq(p5.zzM());
        v0.zzr(p4);
        return ((com.google.android.recaptcha.internal.zzsp) v0.zzi());
    }

    public final Object zzl(String p6, long p7, l7.c p9)
    {
        com.google.android.recaptcha.internal.zzba v0_2;
        if (!(p9 instanceof com.google.android.recaptcha.internal.zzdd)) {
            v0_2 = new com.google.android.recaptcha.internal.zzdd(this, p9);
        } else {
            v0_2 = ((com.google.android.recaptcha.internal.zzdd) p9);
            m7.a v1_2 = ((com.google.android.recaptcha.internal.zzdd) p9).zzc;
            if ((v1_2 & -2147483648) == 0) {
            } else {
                ((com.google.android.recaptcha.internal.zzdd) p9).zzc = (v1_2 - -2147483648);
            }
        }
        com.google.android.recaptcha.internal.zzsi v6_3;
        com.google.android.recaptcha.internal.zzbb v9_1 = v0_2.zza;
        m7.a v1_1 = m7.a.a;
        com.google.android.recaptcha.internal.zzl v2_0 = v0_2.zzc;
        try {
            if (v2_0 == null) {
                c4.b.e0(v9_1);
                com.google.android.recaptcha.internal.zzbb v9_3 = this.zzu(p6).zzf(27);
                try {
                    com.google.android.recaptcha.internal.zzl v2_2 = this.zzc;
                    v0_2.zzd = v9_3;
                    v0_2.zzc = 1;
                    com.google.android.recaptcha.internal.zzsi v6_1 = v2_2.zzb(p6, p7, v0_2);
                } catch (com.google.android.recaptcha.internal.zzsi v6_5) {
                    String v7_3 = v6_5;
                    v6_3 = v9_3;
                } catch (com.google.android.recaptcha.internal.zzsi v6_4) {
                    String v7_2 = v6_4;
                    v6_3 = v9_3;
                    com.google.android.recaptcha.internal.zzbd v8_3 = new com.google.android.recaptcha.internal.zzbd(com.google.android.recaptcha.internal.zzbb.zzb, com.google.android.recaptcha.internal.zzba.zzb, v7_2.getMessage());
                    v6_3.zzb(v8_3);
                    throw v8_3;
                } catch (com.google.android.recaptcha.internal.zzsi v6_2) {
                    String v7_1 = v6_2;
                    v6_3 = v9_3;
                    com.google.android.recaptcha.internal.zzbd v8_1 = new com.google.android.recaptcha.internal.zzbd(com.google.android.recaptcha.internal.zzbb.zzb, com.google.android.recaptcha.internal.zzba.zzaa, v7_1.getMessage());
                    v6_3.zzb(v8_1);
                    throw v8_1;
                }
                if (v6_1 == v1_1) {
                    return v1_1;
                } else {
                    v9_1 = v6_1;
                    v6_3 = v9_3;
                    com.google.android.recaptcha.internal.zzbb v9_4 = ((com.google.android.recaptcha.internal.zzsi) v9_1);
                    v6_3.zza();
                    return v9_4;
                }
            } else {
                if (v2_0 != 1) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                } else {
                    v6_3 = v0_2.zzd;
                    c4.b.e0(v9_1);
                    v9_4 = ((com.google.android.recaptcha.internal.zzsi) v9_1);
                    v6_3.zza();
                    return v9_4;
                }
            }
        } catch (String v7_3) {
        } catch (String v7_2) {
        } catch (String v7_1) {
        }
        v6_3.zzb(v7_3);
        throw v7_3;
    }

    public final Object zzm(com.google.android.recaptcha.internal.zzsp p9, String p10, long p11, l7.c p13)
    {
        return d8.f0.x(this.zzi.zza().a(), new com.google.android.recaptcha.internal.zzdg(this, p10, p11, p9, 0), p13);
    }

    public final Object zzn(com.google.android.recaptcha.internal.zzsc p11, long p12, l7.c p14)
    {
        Exception v0_2;
        if (!(p14 instanceof com.google.android.recaptcha.internal.zzdk)) {
            v0_2 = new com.google.android.recaptcha.internal.zzdk(this, p14);
        } else {
            v0_2 = ((com.google.android.recaptcha.internal.zzdk) p14);
            m7.a v1_2 = ((com.google.android.recaptcha.internal.zzdk) p14).zzc;
            if ((v1_2 & -2147483648) == 0) {
            } else {
                ((com.google.android.recaptcha.internal.zzdk) p14).zzc = (v1_2 - -2147483648);
            }
        }
        com.google.android.recaptcha.internal.zzba v14_1 = v0_2.zza;
        m7.a v1_1 = m7.a.a;
        int v2_0 = v0_2.zzc;
        try {
            if (v2_0 == 0) {
                c4.b.e0(v14_1);
                com.google.android.recaptcha.internal.zzdl v4_1 = new com.google.android.recaptcha.internal.zzdl(this, p11, p12, 0);
                v0_2.zzc = 1;
                if (d8.f0.y(p12, v4_1, v0_2) == v1_1) {
                    return v1_1;
                }
            } else {
                if (v2_0 != 1) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                } else {
                    c4.b.e0(v14_1);
                }
            }
        } catch (Exception v0_5) {
            throw v0_5;
        } catch (Exception v0_4) {
            throw new com.google.android.recaptcha.internal.zzbd(com.google.android.recaptcha.internal.zzbb.zzb, com.google.android.recaptcha.internal.zzba.zzb, v0_4.getMessage());
        } catch (Exception v0_3) {
            throw new com.google.android.recaptcha.internal.zzbd(com.google.android.recaptcha.internal.zzbb.zzb, com.google.android.recaptcha.internal.zzba.zzap, v0_3.getMessage());
        }
        return h7.l.a;
    }

    public final Object zzo(long p6, l7.c p8)
    {
        com.google.android.recaptcha.internal.zzbd v0_2;
        if (!(p8 instanceof com.google.android.recaptcha.internal.zzdr)) {
            v0_2 = new com.google.android.recaptcha.internal.zzdr(this, p8);
        } else {
            v0_2 = ((com.google.android.recaptcha.internal.zzdr) p8);
            com.google.android.recaptcha.internal.zzbb v1_2 = ((com.google.android.recaptcha.internal.zzdr) p8).zzc;
            if ((v1_2 & -2147483648) == 0) {
            } else {
                ((com.google.android.recaptcha.internal.zzdr) p8).zzc = (v1_2 - -2147483648);
            }
        }
        com.google.android.recaptcha.internal.zzsc v6_3;
        com.google.android.recaptcha.internal.zzbd v7_1;
        com.google.android.recaptcha.internal.zzbd v8_1 = v0_2.zza;
        com.google.android.recaptcha.internal.zzbb v1_1 = m7.a.a;
        com.google.android.recaptcha.internal.zzba v2_0 = v0_2.zzc;
        try {
            if (v2_0 == null) {
                c4.b.e0(v8_1);
                com.google.android.recaptcha.internal.zzbd v8_3 = this.zzb.zzf(22);
                try {
                    com.google.android.recaptcha.internal.zzba v2_3 = new com.google.android.recaptcha.internal.zzds(this, v8_3, 0);
                    v0_2.zzd = this;
                    v0_2.zze = v8_3;
                    v0_2.zzc = 1;
                    com.google.android.recaptcha.internal.zzsc v6_1 = d8.f0.y(p6, v2_3, v0_2);
                } catch (com.google.android.recaptcha.internal.zzsc v6_5) {
                    com.google.android.recaptcha.internal.zzbd v8_6 = v6_5;
                    v6_3 = v8_3;
                    v7_1 = this;
                } catch (com.google.android.recaptcha.internal.zzsc v6_4) {
                    com.google.android.recaptcha.internal.zzbd v8_5 = v6_4;
                    v6_3 = v8_3;
                    v7_1 = this;
                    com.google.android.recaptcha.internal.zzbd v7_7 = v7_1.zzs(v8_5, new com.google.android.recaptcha.internal.zzbd(com.google.android.recaptcha.internal.zzbb.zzc, com.google.android.recaptcha.internal.zzba.zzb, v8_5.getMessage()));
                    v6_3.zzb(v7_7);
                    throw v7_7;
                } catch (com.google.android.recaptcha.internal.zzsc v6_2) {
                    com.google.android.recaptcha.internal.zzbd v8_4 = v6_2;
                    v6_3 = v8_3;
                    v7_1 = this;
                    com.google.android.recaptcha.internal.zzbd v7_6 = v7_1.zzs(v8_4, new com.google.android.recaptcha.internal.zzbd(com.google.android.recaptcha.internal.zzbb.zzc, com.google.android.recaptcha.internal.zzba.zzaw, v8_4.getMessage()));
                    v6_3.zzb(v7_6);
                    throw v7_6;
                }
                if (v6_1 == v1_1) {
                    return v1_1;
                } else {
                    v8_1 = v6_1;
                    v6_3 = v8_3;
                    v7_1 = this;
                    return ((com.google.android.recaptcha.internal.zzsc) v8_1);
                }
            } else {
                if (v2_0 != 1) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                } else {
                    v6_3 = v0_2.zze;
                    v7_1 = v0_2.zzd;
                    c4.b.e0(v8_1);
                    return ((com.google.android.recaptcha.internal.zzsc) v8_1);
                }
            }
        } catch (com.google.android.recaptcha.internal.zzbd v8_6) {
        } catch (com.google.android.recaptcha.internal.zzbd v8_5) {
        } catch (com.google.android.recaptcha.internal.zzbd v8_4) {
        }
        if (kotlin.jvm.internal.j.a(v8_6.zzb(), com.google.android.recaptcha.internal.zzbb.zzc)) {
            v8_6 = v7_1.zzs(v8_6, v8_6);
        }
        v6_3.zzb(v8_6);
        throw v8_6;
    }

    public final void zzq(String p5, com.google.android.recaptcha.internal.zzsr p6)
    {
        com.google.android.recaptcha.internal.zzen v5_2 = this.zzu(p5).zzf(29);
        com.google.android.recaptcha.internal.zzl v0_6 = p6.zzk();
        String v1_0 = i7.r.l0(i7.j.X(v0_6, 10));
        if (v1_0 < 16) {
            v1_0 = 16;
        }
        com.google.android.recaptcha.internal.zzba v2_2 = new java.util.LinkedHashMap(v1_0);
        com.google.android.recaptcha.internal.zzl v0_0 = v0_6.iterator();
        while (v0_0.hasNext()) {
            String v1_3 = ((com.google.android.recaptcha.internal.zzst) v0_0.next());
            v2_2.put(v1_3.zzg(), v1_3.zzi());
        }
        this.zzt().zzb(v2_2);
        this.zzc.zzg(p6);
        v5_2.zza();
        return;
    }
}
