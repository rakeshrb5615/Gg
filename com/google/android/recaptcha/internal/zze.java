package com.google.android.recaptcha.internal;
public abstract class zze {
    private boolean zza;

    public zze()
    {
        return;
    }

    public com.google.android.recaptcha.internal.zzen zza(String p1)
    {
        throw 0;
    }

    public com.google.android.recaptcha.internal.zzen zzb()
    {
        throw 0;
    }

    public final Object zzc(String p19, long p20, l7.c p22)
    {
        m7.a v5_1;
        com.google.android.recaptcha.internal.zze v2_0 = p19;
        com.google.android.recaptcha.internal.zze v3_0 = p20;
        if (!(p22 instanceof com.google.android.recaptcha.internal.zza)) {
            v5_1 = new com.google.android.recaptcha.internal.zza(this, p22);
        } else {
            v5_1 = ((com.google.android.recaptcha.internal.zza) p22);
            com.google.android.recaptcha.internal.zze v6_5 = ((com.google.android.recaptcha.internal.zza) p22).zze;
            if ((v6_5 & -2147483648) == 0) {
            } else {
                ((com.google.android.recaptcha.internal.zza) p22).zze = (v6_5 - -2147483648);
            }
        }
        com.google.android.recaptcha.internal.zze v6_2;
        String v8_3;
        com.google.android.recaptcha.internal.zza v11 = v5_1;
        Object v0_3 = v11.zzc;
        m7.a v5_2 = m7.a.a;
        com.google.android.recaptcha.internal.zze v6_1 = v11.zze;
        if (v6_1 == null) {
            c4.b.e0(v0_3);
            v6_2 = this.zza(p19);
            try {
                Object v0_5 = new com.google.android.recaptcha.internal.zzb(this, p19, 0);
                v11.zza = this;
                v11.zzf = p19;
                v11.zzg = v6_2;
                v11.zzb = p20;
                v11.zze = 1;
                v0_3 = d8.f0.y(p20, v0_5, v11);
            } catch (Object v0_7) {
                com.google.android.recaptcha.internal.zzbd v10 = v0_7;
                String v8_2 = p20;
                com.google.android.recaptcha.internal.zze v4 = v6_2;
                com.google.android.recaptcha.internal.zze v6_3 = this;
                com.google.android.recaptcha.internal.zzbd vtmp5 = com.google.android.recaptcha.internal.zzf.zza(v10, new com.google.android.recaptcha.internal.zzbd(com.google.android.recaptcha.internal.zzbb.zzb, com.google.android.recaptcha.internal.zzba.zzaa, v10.getMessage()));
                if (v4 != null) {
                    v4.zzb(vtmp5);
                }
                v11.zza = v6_3;
                v11.zzf = v2_0;
                v11.zzg = 0;
                v11.zze = 2;
                com.google.android.recaptcha.internal.zze v7_1 = v2_0;
                if (v6_3.zzi(v7_1, v8_2, v10, v11) != v5_2) {
                    com.google.android.recaptcha.internal.zze v3_2 = v6_3;
                    com.google.android.recaptcha.internal.zze v2_3 = v7_1;
                    v11.zza = 0;
                    v11.zzf = 0;
                    v11.zze = 3;
                    Object v0_0 = v3_2.zzd(v2_3, v11);
                    if (v0_0 != v5_2) {
                        return v0_0;
                    }
                }
            }
            if (v0_3 != v5_2) {
                v8_3 = this;
                try {
                    Object v0_10 = ((h7.h) v0_3).a;
                    c4.b.e0(v0_10);
                    Object v0_11 = ((com.google.android.recaptcha.internal.zzsi) v0_10);
                } catch (Object v0_8) {
                    com.google.android.recaptcha.internal.zzbb v16_1 = v3_0;
                    v4 = v6_2;
                    v6_3 = v8_3;
                    v8_2 = v16_1;
                    v10 = v0_8;
                }
                if (v6_2 == null) {
                    return v0_11;
                } else {
                    v6_2.zza();
                    return v0_11;
                }
            }
        } else {
            if (v6_1 == 1) {
                com.google.android.recaptcha.internal.zze v2_2 = v11.zzb;
                v4 = v11.zzg;
                com.google.android.recaptcha.internal.zze v6_4 = v11.zzf;
                v8_3 = ((com.google.android.recaptcha.internal.zze) v11.zza);
                try {
                    c4.b.e0(v0_3);
                    v6_2 = v4;
                    v3_0 = v2_2;
                    v2_0 = v6_4;
                } catch (Object v0_8) {
                    v16_1 = v2_0;
                    v2_0 = v6_2;
                }
            } else {
                if (v6_1 == 2) {
                    v2_3 = v11.zzf;
                    v3_2 = ((com.google.android.recaptcha.internal.zze) v11.zza);
                    c4.b.e0(v0_3);
                } else {
                    if (v6_1 != 3) {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    } else {
                        c4.b.e0(v0_3);
                        return v0_3;
                    }
                }
            }
        }
        return v5_2;
    }

    public abstract Object zzd();

    public final Object zze(long p9, com.google.android.recaptcha.internal.zzsc p11, l7.c p12)
    {
        com.google.android.recaptcha.internal.zzc v0_2;
        if (!(p12 instanceof com.google.android.recaptcha.internal.zzc)) {
            v0_2 = new com.google.android.recaptcha.internal.zzc(this, p12);
        } else {
            v0_2 = ((com.google.android.recaptcha.internal.zzc) p12);
            m7.a v1_2 = ((com.google.android.recaptcha.internal.zzc) p12).zzd;
            if ((v1_2 & -2147483648) == 0) {
            } else {
                ((com.google.android.recaptcha.internal.zzc) p12).zzd = (v1_2 - -2147483648);
            }
        }
        Object v9_3;
        Object v9_5;
        String v10_0;
        Object v12_1 = v0_2.zzb;
        m7.a v1_1 = m7.a.a;
        com.google.android.recaptcha.internal.zzd v2_0 = v0_2.zzd;
        h7.l v4 = h7.l.a;
        try {
            if (v2_0 == null) {
                c4.b.e0(v12_1);
                Object v12_2 = this.zzb();
                if (!this.zza) {
                    try {
                        com.google.android.recaptcha.internal.zzd v2_3 = new com.google.android.recaptcha.internal.zzd(this, p11, 0);
                        v0_2.zza = this;
                        v0_2.zze = v12_2;
                        v0_2.zzd = 1;
                        Object v9_1 = d8.f0.y(p9, v2_3, v0_2);
                    } catch (Object v9_2) {
                        Object v11_1 = v9_2;
                        v10_0 = this;
                        v9_3 = v12_2;
                        v10_0.zza = 0;
                        v0_2.zza = v10_0;
                        v0_2.zze = v9_3;
                        v0_2.zzd = 2;
                        v12_1 = v10_0.zzj(v11_1, v0_2);
                        if (v12_1 == v1_1) {
                            return v1_1;
                        } else {
                            Object v11_4 = ((com.google.android.recaptcha.internal.zzbd) v12_1);
                            if (v9_3 != null) {
                                v9_3.zzb(v11_4);
                            }
                            v0_2.zza = v11_4;
                            v0_2.zze = 0;
                            v0_2.zzd = 3;
                            if (v10_0.zzg(v11_4, v0_2) == v1_1) {
                                return v1_1;
                            } else {
                                v9_5 = v11_4;
                            }
                            return c4.b.p(v9_5);
                        }
                        return v4;
                    }
                    if (v9_1 == v1_1) {
                        return v1_1;
                    } else {
                        v12_1 = v9_1;
                        v9_3 = v12_2;
                        v10_0 = this;
                        c4.b.e0(((h7.h) v12_1).a);
                        v10_0.zza = 1;
                        if (v9_3 != null) {
                            v9_3.zza();
                        }
                        return v4;
                    }
                } else {
                    v12_2.zza();
                    return v4;
                }
            } else {
                if (v2_0 == 1) {
                    v9_3 = v0_2.zze;
                    v10_0 = ((com.google.android.recaptcha.internal.zze) v0_2.zza);
                    c4.b.e0(v12_1);
                } else {
                    if (v2_0 == 2) {
                        v9_3 = v0_2.zze;
                        v10_0 = ((com.google.android.recaptcha.internal.zze) v0_2.zza);
                        c4.b.e0(v12_1);
                    } else {
                        if (v2_0 != 3) {
                            throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                        } else {
                            v9_5 = ((com.google.android.recaptcha.internal.zzbd) v0_2.zza);
                            c4.b.e0(v12_1);
                        }
                    }
                }
            }
        } catch (Object v11_1) {
        }
        return c4.b.p(v9_5);
    }

    public abstract Object zzf();

    public Object zzg(com.google.android.recaptcha.internal.zzbd p1, l7.c p2)
    {
        return h7.l.a;
    }

    public abstract Object zzh();

    public Object zzi(String p1, long p2, Exception p4, l7.c p5)
    {
        return h7.l.a;
    }

    public Object zzj(Exception p4, l7.c p5)
    {
        return com.google.android.recaptcha.internal.zzf.zza(p4, new com.google.android.recaptcha.internal.zzbd(com.google.android.recaptcha.internal.zzbb.zzb, com.google.android.recaptcha.internal.zzba.zzap, p4.getMessage()));
    }

    public void zzk(com.google.android.recaptcha.internal.zzsr p1)
    {
        return;
    }

    public final boolean zzl()
    {
        return this.zza;
    }
}
