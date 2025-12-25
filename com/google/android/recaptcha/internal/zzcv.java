package com.google.android.recaptcha.internal;
public final class zzcv {
    private final android.app.Application zza;
    private final m8.a zzb;
    private com.google.android.recaptcha.internal.zzdc zzc;
    private final String zzd;
    private final com.google.android.recaptcha.internal.zzl zze;
    private com.google.android.recaptcha.internal.zzbi zzf;

    public zzcv(android.app.Application p19)
    {
        com.google.android.recaptcha.internal.zzcv v0_1 = ;
v0_1.zza = p19;
        v0_1.zzb = m8.d.a();
        v0_1.zzd = java.util.UUID.randomUUID().toString();
        v0_1.zzf = new com.google.android.recaptcha.internal.zzbi();
        v0_1.zze = new com.google.android.recaptcha.internal.zzl(0, 1, 0);
        Integer v5_3 = new com.google.android.recaptcha.internal.zzaw(915034652, new com.google.android.recaptcha.internal.zzaz(0, 1, 0));
        new com.google.android.recaptcha.internal.zzaw(915034802, new com.google.android.recaptcha.internal.zzfu());
        new com.google.android.recaptcha.internal.zzaw(915034662, new com.google.android.recaptcha.internal.zzbe());
        new com.google.android.recaptcha.internal.zzaw(915034909, new com.google.android.recaptcha.internal.zzjd());
        new com.google.android.recaptcha.internal.zzaw(915034675, new com.google.android.recaptcha.internal.zzbr("https://www.recaptcha.net/recaptcha/api3"));
        new com.google.android.recaptcha.internal.zzaw(915034774, new com.google.android.recaptcha.internal.zzex(0, 1, 0));
        new com.google.android.recaptcha.internal.zzaw(915034792, new com.google.android.recaptcha.internal.zzfk(1));
        new com.google.android.recaptcha.internal.zzaw(735120228, p19);
        new com.google.android.recaptcha.internal.zzaw(915034663, new com.google.android.recaptcha.internal.zzbf(p19));
        new com.google.android.recaptcha.internal.zzaw(915034791, new com.google.android.recaptcha.internal.zzfj());
        new com.google.android.recaptcha.internal.zzaw(915034643, new com.google.android.recaptcha.internal.zzbm(p19));
        new com.google.android.recaptcha.internal.zzaw(915034775, new com.google.android.recaptcha.internal.zzfa());
        com.google.android.recaptcha.internal.zzaw[] v1_6 = new com.google.android.recaptcha.internal.zzaw[] {v5_3, new com.google.android.recaptcha.internal.zzaw(915034787, new com.google.android.recaptcha.internal.zzff())});
        int v2_1 = 0;
        while (v2_1 < 13) {
            com.google.android.recaptcha.internal.zzaw v3_9 = v1_6[v2_1];
            if (!com.google.android.recaptcha.internal.zzav.zzc().containsKey(Integer.valueOf(v3_9.zza()))) {
                com.google.android.recaptcha.internal.zzav.zzc().put(Integer.valueOf(v3_9.zza()), v3_9);
            }
            v2_1++;
        }
        return;
    }

    public static final synthetic com.google.android.recaptcha.internal.zzdc zza(com.google.android.recaptcha.internal.zzcv p2, String p3)
    {
        com.google.android.recaptcha.internal.zzbd v2_1 = p2.zzc;
        if (v2_1 == null) {
            return 0;
        } else {
            if (!kotlin.jvm.internal.j.a(v2_1.zzd(), p3)) {
                throw new com.google.android.recaptcha.internal.zzbd(com.google.android.recaptcha.internal.zzbb.zzd, com.google.android.recaptcha.internal.zzba.zzam, 0);
            } else {
                return v2_1;
            }
        }
    }

    public static final synthetic void zzb(com.google.android.recaptcha.internal.zzcv p0, com.google.android.recaptcha.internal.zzdc p1)
    {
        p0.zzc = p1;
        return;
    }

    public static final synthetic void zzc(com.google.android.recaptcha.internal.zzcv p2, long p3)
    {
        if (p3 < 5000) {
            throw new com.google.android.recaptcha.internal.zzbd(com.google.android.recaptcha.internal.zzbb.zzj, com.google.android.recaptcha.internal.zzba.zzI, 0);
        } else {
            if (e0.c.checkSelfPermission(p2.zza, "android.permission.INTERNET") != 0) {
                throw new com.google.android.recaptcha.internal.zzbd(com.google.android.recaptcha.internal.zzbb.zzc, com.google.android.recaptcha.internal.zzba.zzao, 0);
            } else {
                return;
            }
        }
    }

    public static final synthetic com.google.android.recaptcha.internal.zzcn zze(com.google.android.recaptcha.internal.zzcv p1, String p2, com.google.android.recaptcha.internal.zzbi p3, com.google.android.recaptcha.internal.zzch p4, com.google.android.recaptcha.internal.zzek p5)
    {
        com.google.android.recaptcha.internal.zzdt v0_1 = new com.google.android.recaptcha.internal.zzdt(p2, p3, p5, p1.zze);
        if (!kotlin.jvm.internal.j.a(p4, com.google.android.recaptcha.internal.zzch.zza)) {
            return new com.google.android.recaptcha.internal.zzec(v0_1, p3, p5, new com.google.android.recaptcha.internal.zzbo());
        } else {
            return new com.google.android.recaptcha.internal.zzef(v0_1);
        }
    }

    public static synthetic Object zzf(com.google.android.recaptcha.internal.zzcv p10, String p11, com.google.android.recaptcha.internal.zzcn p12, com.google.android.recaptcha.internal.zzbi p13, l7.c p14, int p15, Object p16)
    {
        return com.google.android.recaptcha.internal.zzcv.zzh(p10, p11, 0, 0, p10.zzf, com.google.android.recaptcha.internal.zzch.zzb, p14, 2, 0);
    }

    public static synthetic Object zzh(com.google.android.recaptcha.internal.zzcv p8, String p9, long p10, com.google.android.recaptcha.internal.zzcn p12, com.google.android.recaptcha.internal.zzbi p13, com.google.android.recaptcha.internal.zzch p14, l7.c p15, int p16, Object p17)
    {
        if ((p16 & 8) != 0) {
            p13 = p8.zzf;
        }
        if ((p16 & 16) != 0) {
            p14 = com.google.android.recaptcha.internal.zzch.zza;
        }
        if ((p16 & 2) != 0) {
            p10 = 10000;
        }
        return p8.zzg(p9, p10, 0, p13, p14, p15);
    }

    public static final synthetic Object zzi(com.google.android.recaptcha.internal.zzcv p0, String p1, int p2, u7.p p3, l7.c p4)
    {
        return p0.zzj(0, 0, 0, p4);
    }

    private final Object zzj(String p6, int p7, u7.p p8, l7.c p9)
    {
        com.google.android.recaptcha.internal.zzba v0_2;
        if (!(p9 instanceof com.google.android.recaptcha.internal.zzcu)) {
            v0_2 = new com.google.android.recaptcha.internal.zzcu(this, p9);
        } else {
            v0_2 = ((com.google.android.recaptcha.internal.zzcu) p9);
            m7.a v1_2 = ((com.google.android.recaptcha.internal.zzcu) p9).zzc;
            if ((v1_2 & -2147483648) == 0) {
            } else {
                ((com.google.android.recaptcha.internal.zzcu) p9).zzc = (v1_2 - -2147483648);
            }
        }
        com.google.android.recaptcha.RecaptchaException v6_3;
        com.google.android.recaptcha.internal.zzbb v9_1 = v0_2.zza;
        m7.a v1_1 = m7.a.a;
        int v2_0 = v0_2.zzc;
        try {
            if (v2_0 == 0) {
                c4.b.e0(v9_1);
                com.google.android.recaptcha.RecaptchaException v6_1 = this.zzk(p6, this.zzf, p7);
                String v7_2 = v6_1.zzf(6);
                try {
                    v0_2.zzd = v7_2;
                    v0_2.zzc = 1;
                    v9_1 = p8.invoke(v6_1, v0_2);
                } catch (com.google.android.recaptcha.RecaptchaException v6_4) {
                    String v7_4 = v6_4;
                    v6_3 = v7_2;
                } catch (com.google.android.recaptcha.RecaptchaException v6_2) {
                    String v7_3 = v6_2;
                    v6_3 = v7_2;
                    com.google.android.recaptcha.internal.zzbd v8_2 = new com.google.android.recaptcha.internal.zzbd(com.google.android.recaptcha.internal.zzbb.zzb, com.google.android.recaptcha.internal.zzba.zza, v7_3.getMessage());
                    v6_3.zzb(v8_2);
                    throw v8_2.zzc();
                }
                if (v9_1 == v1_1) {
                    return v1_1;
                } else {
                    v6_3 = v7_2;
                    v6_3.zza();
                    return v9_1;
                }
            } else {
                if (v2_0 != 1) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                } else {
                    v6_3 = v0_2.zzd;
                    c4.b.e0(v9_1);
                    v6_3.zza();
                    return v9_1;
                }
            }
        } catch (String v7_4) {
        } catch (String v7_3) {
        }
        v6_3.zzb(v7_4);
        throw v7_4.zzc();
    }

    private final com.google.android.recaptcha.internal.zzek zzk(String p10, com.google.android.recaptcha.internal.zzbi p11, int p12)
    {
        String v4 = java.util.UUID.randomUUID().toString();
        com.google.android.recaptcha.internal.zzek v1_1 = new com.google.android.recaptcha.internal.zzek(p10, this.zzd, v4, p12, this.zza, new com.google.android.recaptcha.internal.zzes(this.zza, new com.google.android.recaptcha.internal.zzeu(((com.google.android.recaptcha.internal.zzbr) a.a.F(com.google.android.recaptcha.internal.zzcr.zza).getValue()).zzc()), p11.zza()), 0);
        v1_1.zzc(v4);
        return v1_1;
    }

    public final com.google.android.recaptcha.internal.zzbi zzd()
    {
        return this.zzf;
    }

    public final Object zzg(String p18, long p19, com.google.android.recaptcha.internal.zzcn p21, com.google.android.recaptcha.internal.zzbi p22, com.google.android.recaptcha.internal.zzch p23, l7.c p24)
    {
        m8.c v2_2;
        if (!(p24 instanceof com.google.android.recaptcha.internal.zzcs)) {
            v2_2 = new com.google.android.recaptcha.internal.zzcs(this, p24);
        } else {
            v2_2 = ((com.google.android.recaptcha.internal.zzcs) p24);
            m7.a v3_2 = ((com.google.android.recaptcha.internal.zzcs) p24).zzg;
            if ((v3_2 & -2147483648) == 0) {
            } else {
                ((com.google.android.recaptcha.internal.zzcs) p24).zzg = (v3_2 - -2147483648);
            }
        }
        com.google.android.recaptcha.internal.zzcv v9_1;
        m8.a v10_1;
        m8.c v2_5;
        String v11_0;
        com.google.android.recaptcha.internal.zzcv v15;
        m8.c v4_2;
        m8.a v14;
        int v0_2 = v2_2.zze;
        m7.a v3_1 = m7.a.a;
        m8.c v4_0 = v2_2.zzg;
        try {
            if (v4_0 == null) {
                c4.b.e0(v0_2);
                int v0_3 = this.zzb;
                v2_2.zza = this;
                v2_2.zzh = p18;
                v2_2.zzb = 0;
                v2_2.zzj = p22;
                v2_2.zzi = p23;
                v2_2.zzc = v0_3;
                v2_2.zzd = p19;
                v2_2.zzg = 1;
                int v0_4 = ((m8.c) v0_3);
                if (v0_4.d(v2_2) == v3_1) {
                    return v3_1;
                } else {
                    v14 = p22;
                    v15 = p23;
                    v11_0 = p19;
                    v9_1 = this;
                    v10_1 = p18;
                    v4_2 = v0_4;
                    try {
                        int v0_9;
                        if (!kotlin.jvm.internal.j.a(v15, com.google.android.recaptcha.internal.zzch.zza)) {
                            if (!kotlin.jvm.internal.j.a(v15, com.google.android.recaptcha.internal.zzch.zzb)) {
                                v0_9 = 2;
                            } else {
                                v0_9 = 4;
                            }
                        } else {
                            v0_9 = 3;
                        }
                    } catch (int v0_1) {
                        v2_5 = v4_2;
                    }
                    com.google.android.recaptcha.internal.zzct v8_4 = new com.google.android.recaptcha.internal.zzct(v9_1, v10_1, v11_0, 0, v14, v15, 0);
                    v2_2.zza = v4_2;
                    v2_2.zzh = 0;
                    v2_2.zzb = 0;
                    v2_2.zzj = 0;
                    v2_2.zzi = 0;
                    v2_2.zzc = 0;
                    v2_2.zzg = 2;
                    v0_2 = v9_1.zzj(v10_1, v0_9, v8_4, v2_2);
                    if (v0_2 == v3_1) {
                        return v3_1;
                    } else {
                        v2_5 = v4_2;
                        int v0_12 = ((com.google.android.recaptcha.internal.zzdc) v0_2);
                        v2_5 = ((m8.c) v2_5);
                        v2_5.f(0);
                        return v0_12;
                    }
                }
            } else {
                if (v4_0 == 1) {
                    m8.c v4_3 = v2_2.zzd;
                    com.google.android.recaptcha.internal.zzct v8_2 = ((m8.a) v2_2.zzc);
                    com.google.android.recaptcha.internal.zzcv v9_2 = v2_2.zzi;
                    m8.a v10_2 = v2_2.zzj;
                    String v11_1 = v2_2.zzh;
                    com.google.android.recaptcha.internal.zzcv v12_1 = ((com.google.android.recaptcha.internal.zzcv) v2_2.zza);
                    c4.b.e0(v0_2);
                    v15 = v9_2;
                    v14 = v10_2;
                    v10_1 = v11_1;
                    v9_1 = v12_1;
                    v11_0 = v4_3;
                    v4_2 = v8_2;
                } else {
                    if (v4_0 != 2) {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    } else {
                        v2_5 = ((m8.a) v2_2.zza);
                        c4.b.e0(v0_2);
                        v0_12 = ((com.google.android.recaptcha.internal.zzdc) v0_2);
                        v2_5 = ((m8.c) v2_5);
                        v2_5.f(0);
                        return v0_12;
                    }
                }
            }
        } catch (int v0_1) {
        }
        ((m8.c) v2_5).f(0);
        throw v0_1;
    }
}
