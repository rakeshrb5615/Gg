package com.google.android.recaptcha.internal;
public final class zzan {
    public d8.t zza;
    private final d8.c0 zzb;
    private final com.google.android.recaptcha.internal.zzek zzc;
    private final com.google.android.play.core.integrity.StandardIntegrityManager zzd;
    private com.google.android.recaptcha.internal.zzao zze;
    private long zzf;
    private final m8.a zzg;
    private boolean zzh;

    public zzan(android.content.Context p1, d8.c0 p2, com.google.android.recaptcha.internal.zzek p3, com.google.android.play.core.integrity.StandardIntegrityManager p4, long p5)
    {
        this.zzb = p2;
        this.zzc = p3;
        this.zzd = p4;
        this.zze = com.google.android.recaptcha.internal.zzao.zza;
        this.zzg = m8.d.a();
        return;
    }

    public static final synthetic Object zza(com.google.android.recaptcha.internal.zzan p0, l7.c p1)
    {
        return p0.zzi(p1);
    }

    public static final synthetic Object zzb(com.google.android.recaptcha.internal.zzan p0, String p1, l7.c p2)
    {
        return p0.zzj(0, p2);
    }

    public static final synthetic d8.c0 zzg(com.google.android.recaptcha.internal.zzan p0)
    {
        return p0.zzb;
    }

    public static final synthetic void zzh(com.google.android.recaptcha.internal.zzan p0, com.google.android.recaptcha.internal.zzao p1)
    {
        p0.zze = p1;
        return;
    }

    private final Object zzi(l7.c p7)
    {
        String v0_2;
        if (!(p7 instanceof com.google.android.recaptcha.internal.zzag)) {
            v0_2 = new com.google.android.recaptcha.internal.zzag(this, p7);
        } else {
            v0_2 = ((com.google.android.recaptcha.internal.zzag) p7);
            m7.a v1_2 = ((com.google.android.recaptcha.internal.zzag) p7).zzc;
            if ((v1_2 & -2147483648) == 0) {
            } else {
                ((com.google.android.recaptcha.internal.zzag) p7).zzc = (v1_2 - -2147483648);
            }
        }
        IllegalStateException v7_1 = v0_2.zza;
        m7.a v1_1 = m7.a.a;
        com.google.android.play.core.integrity.StandardIntegrityManager v2_0 = v0_2.zzc;
        if (v2_0 == null) {
            c4.b.e0(v7_1);
            IllegalStateException v7_6 = com.google.android.recaptcha.internal.zzbx.zza(this.zzd.prepareIntegrityToken(com.google.android.play.core.integrity.StandardIntegrityManager$PrepareIntegrityTokenRequest.builder().setCloudProjectNumber(this.zzf).build()));
            v0_2.zzc = 1;
            IllegalStateException v7_7 = v7_6.await(v0_2);
            if (v7_7 != v1_1) {
                return v7_7;
            } else {
                return v1_1;
            }
        } else {
            if (v2_0 != 1) {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            } else {
                c4.b.e0(v7_1);
                return v7_1;
            }
        }
    }

    private final Object zzj(String p6, l7.c p7)
    {
        com.google.android.recaptcha.internal.zzah v0_2;
        if (!(p7 instanceof com.google.android.recaptcha.internal.zzah)) {
            v0_2 = new com.google.android.recaptcha.internal.zzah(this, p7);
        } else {
            v0_2 = ((com.google.android.recaptcha.internal.zzah) p7);
            m7.a v1_2 = ((com.google.android.recaptcha.internal.zzah) p7).zzc;
            if ((v1_2 & -2147483648) == 0) {
            } else {
                ((com.google.android.recaptcha.internal.zzah) p7).zzc = (v1_2 - -2147483648);
            }
        }
        com.google.android.play.core.integrity.StandardIntegrityManager$StandardIntegrityToken v7_1 = v0_2.zza;
        m7.a v1_1 = m7.a.a;
        com.google.android.play.core.integrity.StandardIntegrityManager$StandardIntegrityTokenRequest$Builder v2_0 = v0_2.zzc;
        if (v2_0 == null) {
            c4.b.e0(v7_1);
            com.google.android.play.core.integrity.StandardIntegrityManager$StandardIntegrityToken v7_2 = this.zzf();
            v0_2.zzd = p6;
            v0_2.zzc = 1;
            v7_1 = ((d8.u) v7_2).h(v0_2);
            if (v7_1 == v1_1) {
                return v1_1;
            } else {
                String v6_4 = com.google.android.recaptcha.internal.zzbx.zza(((com.google.android.play.core.integrity.StandardIntegrityManager$StandardIntegrityTokenProvider) v7_1).request(com.google.android.play.core.integrity.StandardIntegrityManager$StandardIntegrityTokenRequest.builder().setRequestHash(p6).build()));
                v0_2.zzd = 0;
                v0_2.zzc = 2;
                v7_1 = v6_4.await(v0_2);
                if (v7_1 == v1_1) {
                    return v1_1;
                }
            }
        } else {
            if (v2_0 == 1) {
                p6 = v0_2.zzd;
                c4.b.e0(v7_1);
            } else {
                if (v2_0 != 2) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                } else {
                    c4.b.e0(v7_1);
                }
            }
        }
        return ((com.google.android.play.core.integrity.StandardIntegrityManager$StandardIntegrityToken) v7_1).token();
    }

    public final Object zzc(String p7, l7.c p8)
    {
        com.google.android.recaptcha.internal.zzaf v0_2;
        if (!(p8 instanceof com.google.android.recaptcha.internal.zzaf)) {
            v0_2 = new com.google.android.recaptcha.internal.zzaf(this, p8);
        } else {
            v0_2 = ((com.google.android.recaptcha.internal.zzaf) p8);
            m7.a v1_2 = ((com.google.android.recaptcha.internal.zzaf) p8).zzc;
            if ((v1_2 & -2147483648) == 0) {
            } else {
                ((com.google.android.recaptcha.internal.zzaf) p8).zzc = (v1_2 - -2147483648);
            }
        }
        com.google.android.recaptcha.internal.zzan v2_1;
        String v8_1 = v0_2.zza;
        m7.a v1_1 = m7.a.a;
        com.google.android.recaptcha.internal.zzan v2_0 = v0_2.zzc;
        try {
            if (v2_0 == null) {
                c4.b.e0(v8_1);
                try {
                    v0_2.zzd = this;
                    v0_2.zze = p7;
                    v0_2.zzc = 1;
                    v8_1 = this.zzj(p7, v0_2);
                } catch (Exception) {
                    v2_1 = this;
                    v0_2.zzd = v2_1;
                    v0_2.zze = p7;
                    v0_2.zzc = 2;
                    if (v2_1.zze(v0_2) != v1_1) {
                        v0_2.zzd = 0;
                        v0_2.zze = 0;
                        v0_2.zzc = 3;
                        v8_1 = v2_1.zzj(p7, v0_2);
                        if (v8_1 == v1_1) {
                            return v1_1;
                        }
                    }
                }
                if (v8_1 != v1_1) {
                    v2_1 = this;
                    return ((String) v8_1);
                }
            } else {
                if (v2_0 == 1) {
                    p7 = v0_2.zze;
                    v2_1 = v0_2.zzd;
                    c4.b.e0(v8_1);
                    return ((String) v8_1);
                } else {
                    if (v2_0 == 2) {
                        p7 = v0_2.zze;
                        v2_1 = v0_2.zzd;
                        c4.b.e0(v8_1);
                    } else {
                        if (v2_0 != 3) {
                            throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                        } else {
                            c4.b.e0(v8_1);
                        }
                    }
                }
            }
        } catch (Exception) {
        }
        return ((String) v8_1);
    }

    public final Object zzd(long p1, l7.c p3)
    {
        this.zzf = p1;
        return h7.l.a;
    }

    public final Object zze(l7.c p14)
    {
        Throwable v0_2;
        if (!(p14 instanceof com.google.android.recaptcha.internal.zzak)) {
            v0_2 = new com.google.android.recaptcha.internal.zzak(this, p14);
        } else {
            v0_2 = ((com.google.android.recaptcha.internal.zzak) p14);
            m7.a v1_2 = ((com.google.android.recaptcha.internal.zzak) p14).zzd;
            if ((v1_2 & -2147483648) == 0) {
            } else {
                ((com.google.android.recaptcha.internal.zzak) p14).zzd = (v1_2 - -2147483648);
            }
        }
        com.google.android.recaptcha.internal.zzen v2_2;
        com.google.android.recaptcha.internal.zzan v6;
        boolean v14_1 = v0_2.zzb;
        m7.a v1_1 = m7.a.a;
        com.google.android.recaptcha.internal.zzen v2_0 = v0_2.zzd;
        h7.l v3_0 = h7.l.a;
        if (v2_0 == null) {
            c4.b.e0(v14_1);
            boolean v14_2 = this.zzg;
            v0_2.zze = this;
            v0_2.zza = v14_2;
            v0_2.zzd = 1;
            v2_2 = ((m8.c) v14_2);
            if (v2_2.d(v0_2) != v1_1) {
                v6 = this;
                boolean v14_4 = 0;
                try {
                    if (kotlin.jvm.internal.j.a(v6.zze, com.google.android.recaptcha.internal.zzao.zza)) {
                        v6.zze = com.google.android.recaptcha.internal.zzao.zzb;
                        ((m8.c) v2_2).f(0);
                        com.google.android.recaptcha.internal.zzen v2_5 = v6.zzc;
                        v2_5.zzc(v2_5.zzd());
                        v2_5.zzb(2);
                        v2_2 = v2_5.zzf(38);
                        v6.zza = d8.f0.a();
                        d8.f0.p(v6.zzb, new com.google.android.recaptcha.internal.zzam(v6, v2_2, 0));
                        v0_2.zze = 0;
                        v0_2.zza = 0;
                        v0_2.zzd = 2;
                        v14_4 = v6.zzh;
                        if (!v14_4) {
                            new java.util.Timer().schedule(new com.google.android.recaptcha.internal.zzai(v6), 28800000, 28800000);
                            v6.zzh = 1;
                        }
                        if (v3_0 != v1_1) {
                            return v3_0;
                        }
                    } else {
                        ((m8.c) v2_2).f(0);
                        return v3_0;
                    }
                } catch (Throwable v0_3) {
                    ((m8.c) v2_2).f(v14_4);
                    throw v0_3;
                }
            }
        } else {
            if (v2_0 == 1) {
                v2_2 = ((m8.a) v0_2.zza);
                v6 = v0_2.zze;
                c4.b.e0(v14_1);
            } else {
                if (v2_0 != 2) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                } else {
                    c4.b.e0(v14_1);
                    return v3_0;
                }
            }
        }
        return v1_1;
    }

    public final d8.t zzf()
    {
        int v0_0 = this.zza;
        if (v0_0 == 0) {
            return 0;
        } else {
            return v0_0;
        }
    }
}
