package com.google.android.recaptcha.internal;
public final class zzdc implements com.google.android.recaptcha.RecaptchaClient, com.google.android.recaptcha.RecaptchaTasksClient {
    private static final b8.h zza;
    private final com.google.android.recaptcha.internal.zzcn zzb;
    private final String zzc;
    private final com.google.android.recaptcha.internal.zzek zzd;
    private final com.google.android.recaptcha.internal.zzbi zze;

    static zzdc()
    {
        com.google.android.recaptcha.internal.zzdc.zza = new b8.h("^[a-zA-Z0-9/_]{0,100}$");
        return;
    }

    public zzdc(com.google.android.recaptcha.internal.zzcn p1, String p2, com.google.android.recaptcha.internal.zzbi p3, com.google.android.recaptcha.internal.zzek p4)
    {
        this.zzb = p1;
        this.zzc = p2;
        this.zze = p3;
        this.zzd = p4;
        return;
    }

    public static final synthetic com.google.android.recaptcha.internal.zzcn zza(com.google.android.recaptcha.internal.zzdc p0)
    {
        return p0.zzb;
    }

    public static final synthetic Object zzb(com.google.android.recaptcha.internal.zzdc p0, com.google.android.recaptcha.RecaptchaAction p1, long p2, l7.c p4)
    {
        return p0.zzf(p1, p2, p4);
    }

    public static final synthetic Object zzc(com.google.android.recaptcha.internal.zzdc p0, String p1, u7.p p2, l7.c p3)
    {
        return p0.zzg(0, 0, p3);
    }

    public static final void zze(com.google.android.recaptcha.internal.zzdc p2, long p3, com.google.android.recaptcha.RecaptchaAction p5)
    {
        com.google.android.recaptcha.internal.zzbd v2_2;
        com.google.android.recaptcha.internal.zzbd v2_0 = com.google.android.recaptcha.internal.zzdc.zza;
        int v5_2 = p5.getAction();
        v2_0.getClass();
        kotlin.jvm.internal.j.e(v5_2, "input");
        if (v2_0.a.matcher(v5_2).matches()) {
            v2_2 = 0;
        } else {
            v2_2 = new com.google.android.recaptcha.internal.zzbd(com.google.android.recaptcha.internal.zzbb.zzg, com.google.android.recaptcha.internal.zzba.zzh, 0);
        }
        if (p3 < 5000) {
            v2_2 = new com.google.android.recaptcha.internal.zzbd(com.google.android.recaptcha.internal.zzbb.zzb, com.google.android.recaptcha.internal.zzba.zzI, 0);
        }
        if (v2_2 != null) {
            throw v2_2;
        } else {
            return;
        }
    }

    private final Object zzf(com.google.android.recaptcha.RecaptchaAction p12, long p13, l7.c p15)
    {
        com.google.android.recaptcha.internal.zzbd v0_3;
        if (!(p15 instanceof com.google.android.recaptcha.internal.zzcy)) {
            v0_3 = new com.google.android.recaptcha.internal.zzcy(this, p15);
        } else {
            v0_3 = ((com.google.android.recaptcha.internal.zzcy) p15);
            m7.a v1_2 = ((com.google.android.recaptcha.internal.zzcy) p15).zzc;
            if ((v1_2 & -2147483648) == 0) {
            } else {
                ((com.google.android.recaptcha.internal.zzcy) p15).zzc = (v1_2 - -2147483648);
            }
        }
        Object v15_1 = v0_3.zza;
        m7.a v1_1 = m7.a.a;
        int v2_0 = v0_3.zzc;
        if (v2_0 == 0) {
            c4.b.e0(v15_1);
            try {
                String v9 = java.util.UUID.randomUUID().toString();
                try {
                    com.google.android.recaptcha.internal.zzcz v4_1 = new com.google.android.recaptcha.internal.zzcz(this, p13, p12, v9, 0);
                    v0_3.zzc = 1;
                    v15_1 = this.zzg(v9, v4_1, v0_3);
                } catch (com.google.android.recaptcha.internal.zzbd v0_2) {
                    com.google.android.recaptcha.internal.zzbd v12_1 = v0_2;
                    return c4.b.p(v12_1.zzc());
                }
                if (v15_1 == v1_1) {
                    return v1_1;
                }
            } catch (com.google.android.recaptcha.internal.zzbd v0_2) {
            }
        } else {
            if (v2_0 != 1) {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            } else {
                try {
                    c4.b.e0(v15_1);
                } catch (com.google.android.recaptcha.internal.zzbd v0_4) {
                    v12_1 = v0_4;
                    return c4.b.p(v12_1.zzc());
                }
            }
        }
        return ((h7.h) v15_1).a;
    }

    private final Object zzg(String p5, u7.p p6, l7.c p7)
    {
        com.google.android.recaptcha.internal.zzbb v0_2;
        if (!(p7 instanceof com.google.android.recaptcha.internal.zzdb)) {
            v0_2 = new com.google.android.recaptcha.internal.zzdb(this, p7);
        } else {
            v0_2 = ((com.google.android.recaptcha.internal.zzdb) p7);
            com.google.android.recaptcha.internal.zzba v1_2 = ((com.google.android.recaptcha.internal.zzdb) p7).zzc;
            if ((v1_2 & -2147483648) == 0) {
            } else {
                ((com.google.android.recaptcha.internal.zzdb) p7).zzc = (v1_2 - -2147483648);
            }
        }
        IllegalStateException v5_2;
        com.google.android.recaptcha.internal.zzbd v7_1 = v0_2.zza;
        com.google.android.recaptcha.internal.zzba v1_1 = m7.a.a;
        int v2_0 = v0_2.zzc;
        try {
            if (v2_0 == 0) {
                c4.b.e0(v7_1);
                com.google.android.recaptcha.internal.zzbd v7_3 = this.zzd.zza();
                v7_3.zzc(p5);
                v5_2 = v7_3.zzf(9);
                v0_2.zzd = v5_2;
                v0_2.zzc = 1;
                v7_1 = p6.invoke(v7_3, v0_2);
                if (v7_1 == v1_1) {
                    return v1_1;
                }
            } else {
                if (v2_0 != 1) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                } else {
                    v5_2 = v0_2.zzd;
                    c4.b.e0(v7_1);
                }
            }
        } catch (String v6_4) {
            v5_2.zzb(v6_4);
            throw v6_4;
        } catch (String v6_2) {
            com.google.android.recaptcha.internal.zzbd v7_5 = new com.google.android.recaptcha.internal.zzbd(com.google.android.recaptcha.internal.zzbb.zzb, com.google.android.recaptcha.internal.zzba.zzX, v6_2.getMessage());
            v5_2.zzb(v7_5);
            throw v7_5;
        }
        v5_2.zza();
        return v7_1;
    }

    public final Object execute-0E7RQCE(com.google.android.recaptcha.RecaptchaAction p5, long p6, l7.c p8)
    {
        com.google.android.recaptcha.internal.zzcw v0_2;
        if (!(p8 instanceof com.google.android.recaptcha.internal.zzcw)) {
            v0_2 = new com.google.android.recaptcha.internal.zzcw(this, p8);
        } else {
            v0_2 = ((com.google.android.recaptcha.internal.zzcw) p8);
            m7.a v1_2 = ((com.google.android.recaptcha.internal.zzcw) p8).zzc;
            if ((v1_2 & -2147483648) == 0) {
            } else {
                ((com.google.android.recaptcha.internal.zzcw) p8).zzc = (v1_2 - -2147483648);
            }
        }
        h7.h v8_1 = v0_2.zza;
        m7.a v1_1 = m7.a.a;
        int v2_0 = v0_2.zzc;
        if (v2_0 == 0) {
            c4.b.e0(v8_1);
            v0_2.zzc = 1;
            IllegalStateException v5_1 = this.zzf(p5, p6, v0_2);
            if (v5_1 != v1_1) {
                return v5_1;
            } else {
                return v1_1;
            }
        } else {
            if (v2_0 != 1) {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            } else {
                c4.b.e0(v8_1);
                return ((h7.h) v8_1).a;
            }
        }
    }

    public final Object execute-gIAlu-s(com.google.android.recaptcha.RecaptchaAction p5, l7.c p6)
    {
        com.google.android.recaptcha.internal.zzcx v0_2;
        if (!(p6 instanceof com.google.android.recaptcha.internal.zzcx)) {
            v0_2 = new com.google.android.recaptcha.internal.zzcx(this, p6);
        } else {
            v0_2 = ((com.google.android.recaptcha.internal.zzcx) p6);
            m7.a v1_2 = ((com.google.android.recaptcha.internal.zzcx) p6).zzc;
            if ((v1_2 & -2147483648) == 0) {
            } else {
                ((com.google.android.recaptcha.internal.zzcx) p6).zzc = (v1_2 - -2147483648);
            }
        }
        String v6_1 = v0_2.zza;
        m7.a v1_1 = m7.a.a;
        long v2_0 = v0_2.zzc;
        if (v2_0 == 0) {
            c4.b.e0(v6_1);
            v0_2.zzc = 1;
            IllegalStateException v5_1 = this.execute-0E7RQCE(p5, 10000, v0_2);
            if (v5_1 != v1_1) {
                return v5_1;
            } else {
                return v1_1;
            }
        } else {
            if (v2_0 != 1) {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            } else {
                c4.b.e0(v6_1);
                return ((h7.h) v6_1).a;
            }
        }
    }

    public final com.google.android.gms.tasks.Task executeTask(com.google.android.recaptcha.RecaptchaAction p8)
    {
        return com.google.android.recaptcha.internal.zzas.zza(d8.f0.c(this.zze.zzb(), new com.google.android.recaptcha.internal.zzda(this, p8, 10000, 0)));
    }

    public final com.google.android.gms.tasks.Task executeTask(com.google.android.recaptcha.RecaptchaAction p8, long p9)
    {
        return com.google.android.recaptcha.internal.zzas.zza(d8.f0.c(this.zze.zzb(), new com.google.android.recaptcha.internal.zzda(this, p8, p9, 0)));
    }

    public final String zzd()
    {
        return this.zzc;
    }
}
