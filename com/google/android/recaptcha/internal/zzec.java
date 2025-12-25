package com.google.android.recaptcha.internal;
public final class zzec implements com.google.android.recaptcha.internal.zzcn {
    private final com.google.android.recaptcha.internal.zzdt zza;
    private final com.google.android.recaptcha.internal.zzek zzb;
    private d8.t zzc;
    private com.google.android.recaptcha.internal.zzbd zzd;
    private com.google.android.recaptcha.internal.zzsc zze;
    private com.google.android.recaptcha.internal.zzcm zzf;
    private final com.google.android.recaptcha.internal.zzbi zzg;

    public zzec(com.google.android.recaptcha.internal.zzdt p1, com.google.android.recaptcha.internal.zzbi p2, com.google.android.recaptcha.internal.zzek p3, com.google.android.recaptcha.internal.zzbo p4)
    {
        this.zza = p1;
        this.zzg = p2;
        this.zzb = p3;
        this.zzc = d8.f0.a();
        this.zzf = com.google.android.recaptcha.internal.zzcm.zzd();
        return;
    }

    public static final synthetic com.google.android.recaptcha.internal.zzdt zzc(com.google.android.recaptcha.internal.zzec p0)
    {
        return p0.zza;
    }

    public static final synthetic com.google.android.recaptcha.internal.zzek zzd(com.google.android.recaptcha.internal.zzec p0)
    {
        return p0.zzb;
    }

    public static final synthetic Object zze(com.google.android.recaptcha.internal.zzec p0, u7.l p1, l7.c p2)
    {
        return p0.zzl(0, p2);
    }

    public static final synthetic Object zzf(com.google.android.recaptcha.internal.zzec p0, long p1, l7.c p3)
    {
        return p0.zzm(0, p3);
    }

    public static final synthetic d8.t zzg(com.google.android.recaptcha.internal.zzec p0)
    {
        return p0.zzc;
    }

    public static final synthetic void zzh(com.google.android.recaptcha.internal.zzec p0, com.google.android.recaptcha.internal.zzsc p1)
    {
        p0.zze = p1;
        return;
    }

    public static final synthetic void zzi(com.google.android.recaptcha.internal.zzec p0, com.google.android.recaptcha.internal.zzbd p1)
    {
        p0.zzd = p1;
        return;
    }

    public static final synthetic void zzj(com.google.android.recaptcha.internal.zzec p0, com.google.android.recaptcha.internal.zzcm p1)
    {
        p0.zzf = p1;
        return;
    }

    public static final synthetic boolean zzk(com.google.android.recaptcha.internal.zzec p0, Exception p1)
    {
        return com.google.android.recaptcha.internal.zzec.zzo(p1);
    }

    private final Object zzl(u7.l p5, l7.c p6)
    {
        Long v0_2;
        if (!(p6 instanceof com.google.android.recaptcha.internal.zzdv)) {
            v0_2 = new com.google.android.recaptcha.internal.zzdv(this, p6);
        } else {
            v0_2 = ((com.google.android.recaptcha.internal.zzdv) p6);
            m7.a v1_2 = ((com.google.android.recaptcha.internal.zzdv) p6).zzc;
            if ((v1_2 & -2147483648) == 0) {
            } else {
                ((com.google.android.recaptcha.internal.zzdv) p6).zzc = (v1_2 - -2147483648);
            }
        }
        long v5_2;
        java.util.concurrent.TimeUnit v6_1 = v0_2.zza;
        m7.a v1_1 = m7.a.a;
        int v2_0 = v0_2.zzc;
        if (v2_0 == 0) {
            c4.b.e0(v6_1);
            java.util.concurrent.TimeUnit v6_3 = new com.google.android.recaptcha.internal.zzbn();
            v0_2.zzd = v6_3;
            v0_2.zzc = 1;
            if (p5.invoke(v0_2) == v1_1) {
                return v1_1;
            } else {
                v5_2 = v6_3;
            }
        } else {
            if (v2_0 != 1) {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            } else {
                v5_2 = v0_2.zzd;
                c4.b.e0(v6_1);
            }
        }
        v5_2.zzc();
        return new Long(v5_2.zza(java.util.concurrent.TimeUnit.MILLISECONDS));
    }

    private final Object zzm(long p7, l7.c p9)
    {
        com.google.android.recaptcha.internal.zzec v0_2;
        if (!(p9 instanceof com.google.android.recaptcha.internal.zzdw)) {
            v0_2 = new com.google.android.recaptcha.internal.zzdw(this, p9);
        } else {
            v0_2 = ((com.google.android.recaptcha.internal.zzdw) p9);
            long v1_2 = ((com.google.android.recaptcha.internal.zzdw) p9).zzd;
            if ((v1_2 & -2147483648) == 0) {
            } else {
                ((com.google.android.recaptcha.internal.zzdw) p9).zzd = (v1_2 - -2147483648);
            }
        }
        com.google.android.recaptcha.internal.zzec v2_1;
        com.google.android.recaptcha.internal.zzec v0_3;
        com.google.android.recaptcha.internal.zzba v9_1 = v0_2.zzb;
        long v1_1 = m7.a.a;
        com.google.android.recaptcha.internal.zzec v2_0 = v0_2.zzd;
        com.google.android.recaptcha.internal.zzbd v5_0 = 0;
        try {
            if (v2_0 == null) {
                c4.b.e0(v9_1);
                v0_2.zze = this;
                v0_2.zza = p7;
                v0_2.zzd = 1;
                if (this.zzn(p7, v0_2) == v1_1) {
                    return v1_1;
                } else {
                    v2_1 = this;
                    try {
                        com.google.android.recaptcha.internal.zzba v9_4 = new com.google.android.recaptcha.internal.zzdy(p7, v2_1, 0);
                        v0_2.zze = v2_1;
                        v0_2.zza = p7;
                        v0_2.zzd = 2;
                        v9_1 = v2_1.zzl(v9_4, v0_2);
                    } catch (com.google.android.recaptcha.internal.zzbd v7_1) {
                        v0_3 = v2_1;
                    }
                    if (v9_1 == v1_1) {
                        return v1_1;
                    } else {
                        v0_3 = v2_1;
                        com.google.android.recaptcha.internal.zzbd v7_4 = (p7 - ((Number) v9_1).longValue());
                        if (v7_4 < 500) {
                            throw new com.google.android.recaptcha.internal.zzbd(com.google.android.recaptcha.internal.zzbb.zzc, com.google.android.recaptcha.internal.zzba.zzar, 0);
                        } else {
                            return new Long(v7_4);
                        }
                    }
                }
            } else {
                if (v2_0 == 1) {
                    p7 = v0_2.zza;
                    v2_1 = v0_2.zze;
                    c4.b.e0(v9_1);
                } else {
                    if (v2_0 != 2) {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    } else {
                        p7 = v0_2.zza;
                        v0_3 = v0_2.zze;
                        c4.b.e0(v9_1);
                    }
                }
            }
        } catch (com.google.android.recaptcha.internal.zzbd v7_1) {
        }
        if ((v7_1 instanceof com.google.android.recaptcha.internal.zzbd)) {
            v5_0 = ((com.google.android.recaptcha.internal.zzbd) v7_1);
        }
        if (v5_0 == null) {
            v5_0 = new com.google.android.recaptcha.internal.zzbd(com.google.android.recaptcha.internal.zzbb.zzc, com.google.android.recaptcha.internal.zzba.zzar, v7_1.getMessage());
        }
        if (!kotlin.jvm.internal.j.a(v0_3.zzf, com.google.android.recaptcha.internal.zzcm.zza())) {
            if (!kotlin.jvm.internal.j.a(v0_3.zzf, com.google.android.recaptcha.internal.zzcm.zzc())) {
                throw v5_0;
            }
        }
        com.google.android.recaptcha.internal.zzbd v7_12 = v0_3.zzd;
        if (v7_12 != null) {
            v5_0 = v7_12;
        }
        throw v5_0;
    }

    private final Object zzn(long p8, l7.c p10)
    {
        if ((!kotlin.jvm.internal.j.a(this.zzf, com.google.android.recaptcha.internal.zzcm.zzb())) && ((!kotlin.jvm.internal.j.a(this.zzf, com.google.android.recaptcha.internal.zzcm.zzc())) && ((!kotlin.jvm.internal.j.a(this.zzf, com.google.android.recaptcha.internal.zzcm.zza())) || (com.google.android.recaptcha.internal.zzec.zzo(this.zzd))))) {
            this.zzf = com.google.android.recaptcha.internal.zzcm.zzc();
            d8.u v3 = d8.f0.a();
            this.zzc = v3;
            d8.f0.p(this.zzg.zza(), new com.google.android.recaptcha.internal.zzeb(this, v3, p8, 0));
        }
        return h7.l.a;
    }

    private static final boolean zzo(Exception p3)
    {
        if (!(p3 instanceof com.google.android.recaptcha.internal.zzbd)) {
            return 1;
        } else {
            if ((kotlin.jvm.internal.j.a(((com.google.android.recaptcha.internal.zzbd) p3).zzb(), com.google.android.recaptcha.internal.zzbb.zzd)) || ((kotlin.jvm.internal.j.a(((com.google.android.recaptcha.internal.zzbd) p3).zzb(), com.google.android.recaptcha.internal.zzbb.zze)) || (kotlin.jvm.internal.j.a(((com.google.android.recaptcha.internal.zzbd) p3).zzb(), com.google.android.recaptcha.internal.zzbb.zzf)))) {
                return 0;
            } else {
                return 1;
            }
        }
    }

    public final Object zza(String p18, com.google.android.recaptcha.RecaptchaAction p19, long p20, l7.c p22)
    {
        com.google.android.recaptcha.internal.zzsi v2_4;
        if (!(p22 instanceof com.google.android.recaptcha.internal.zzdu)) {
            v2_4 = new com.google.android.recaptcha.internal.zzdu(this, p22);
        } else {
            v2_4 = ((com.google.android.recaptcha.internal.zzdu) p22);
            com.google.android.recaptcha.internal.zzec v3_6 = ((com.google.android.recaptcha.internal.zzdu) p22).zzd;
            if ((v3_6 & -2147483648) == 0) {
            } else {
                ((com.google.android.recaptcha.internal.zzdu) p22).zzd = (v3_6 - -2147483648);
            }
        }
        com.google.android.recaptcha.internal.zzsi v2_1;
        com.google.android.recaptcha.internal.zzec v3_0;
        com.google.android.recaptcha.internal.zzec v3_5;
        com.google.android.recaptcha.internal.zzsi v7_1;
        com.google.android.recaptcha.internal.zzec v9_3;
        Object v0_7;
        com.google.android.recaptcha.internal.zzsi v7_0;
        com.google.android.recaptcha.internal.zzsi v5_2;
        long v6_2;
        com.google.android.recaptcha.internal.zzdu v8 = v2_4;
        Object v0_6 = v8.zzb;
        com.google.android.recaptcha.internal.zzsi v2_5 = m7.a.a;
        com.google.android.recaptcha.internal.zzec v3_4 = v8.zzd;
        try {
            if (v3_4 == null) {
                c4.b.e0(v0_6);
                v8.zze = this;
                v0_7 = p18;
                v8.zzf = p18;
                v3_5 = p19;
                v8.zzg = p19;
                v8.zzd = 1;
                v6_2 = this.zzm(p20, v8);
                if (v6_2 != v2_5) {
                    v7_0 = this;
                    com.google.android.recaptcha.internal.zzec v9_1 = ((double) ((Number) v6_2).longValue());
                    long v6_5 = v7_0.zza;
                    int v11_1 = (4601778099247172813 * v9_1);
                    v8.zze = v7_0;
                    v8.zzf = v0_7;
                    v8.zzg = v3_5;
                    com.google.android.recaptcha.internal.zzec v9_2 = (v9_1 * 4603129179135383962);
                    v8.zza = v9_2;
                    v8.zzd = 2;
                    com.google.android.recaptcha.internal.zzsi v5_1 = v6_5.zzl(v0_7, ((long) v11_1), v8);
                    if (v5_1 == v2_5) {
                        return v2_5;
                    } else {
                        v7_1 = v0_7;
                        v0_6 = v5_1;
                        v5_2 = v9_2;
                        v9_3 = v7_0;
                        int v11_3 = v9_3.zze;
                        if (v11_3 == 0) {
                            v11_3 = 0;
                        }
                        Object v0_9 = v9_3.zza.zzi(v3_5, ((com.google.android.recaptcha.internal.zzsi) v0_6), v11_3);
                        com.google.android.recaptcha.internal.zzec v3_7 = v9_3.zza;
                        com.google.android.recaptcha.internal.zzsi v5_4 = ((long) v5_2);
                        v8.zze = v9_3;
                        v8.zzf = v7_1;
                        v8.zzg = 0;
                        v8.zzd = 3;
                        com.google.android.recaptcha.internal.zzsi v5_5 = v7_1;
                        v0_6 = v3_7.zzm(v0_9, v5_5, v5_4, v8);
                        if (v0_6 == v2_5) {
                            return v2_5;
                        } else {
                            v2_1 = v5_5;
                            v3_0 = v9_3;
                        }
                    }
                } else {
                    return v2_5;
                }
            } else {
                if (v3_4 == 1) {
                    v3_5 = v8.zzg;
                    long v6_3 = v8.zzf;
                    v7_0 = v8.zze;
                    c4.b.e0(v0_6);
                    v6_2 = v0_6;
                    v0_7 = v6_3;
                } else {
                    if (v3_4 == 2) {
                        v5_2 = v8.zza;
                        v3_5 = v8.zzg;
                        v7_1 = v8.zzf;
                        v9_3 = v8.zze;
                        c4.b.e0(v0_6);
                    } else {
                        if (v3_4 != 3) {
                            throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                        } else {
                            v2_1 = v8.zzf;
                            v3_0 = v8.zze;
                            c4.b.e0(v0_6);
                        }
                    }
                }
            }
        } catch (Object v0_3) {
            throw v0_3;
        } catch (Object v0_1) {
            throw new com.google.android.recaptcha.internal.zzbd(com.google.android.recaptcha.internal.zzbb.zzb, com.google.android.recaptcha.internal.zzba.zzay, v0_1.getMessage());
        }
        Object v0_4 = ((com.google.android.recaptcha.internal.zzsr) v0_6);
        v3_0.zza.zzq(v2_1, v0_4);
        return v0_4.zzj();
    }

    public final Object zzb(long p1, l7.c p3)
    {
        h7.l v1_1 = this.zzn(p1, p3);
        if (v1_1 != m7.a.a) {
            return h7.l.a;
        } else {
            return v1_1;
        }
    }
}
