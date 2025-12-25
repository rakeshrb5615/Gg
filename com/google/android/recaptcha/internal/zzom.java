package com.google.android.recaptcha.internal;
final class zzom implements com.google.android.recaptcha.internal.zzow {
    private final com.google.android.recaptcha.internal.zzoi zza;
    private final com.google.android.recaptcha.internal.zzpl zzb;
    private final boolean zzc;
    private final com.google.android.recaptcha.internal.zzmp zzd;

    private zzom(com.google.android.recaptcha.internal.zzpl p1, com.google.android.recaptcha.internal.zzmp p2, com.google.android.recaptcha.internal.zzoi p3)
    {
        this.zzb = p1;
        this.zzc = (p3 instanceof com.google.android.recaptcha.internal.zzna);
        this.zzd = p2;
        this.zza = p3;
        return;
    }

    public static com.google.android.recaptcha.internal.zzom zzc(com.google.android.recaptcha.internal.zzpl p1, com.google.android.recaptcha.internal.zzmp p2, com.google.android.recaptcha.internal.zzoi p3)
    {
        return new com.google.android.recaptcha.internal.zzom(p1, p2, p3);
    }

    public final int zza(Object p3)
    {
        int v0_2 = ((com.google.android.recaptcha.internal.zznd) p3).zzc.zzb();
        if (this.zzc) {
            v0_2 += ((com.google.android.recaptcha.internal.zzna) p3).zzb.zzb();
        }
        return v0_2;
    }

    public final int zzb(Object p3)
    {
        int v0_2 = ((com.google.android.recaptcha.internal.zznd) p3).zzc.hashCode();
        if (this.zzc) {
            v0_2 = ((v0_2 * 53) + ((com.google.android.recaptcha.internal.zzna) p3).zzb.zza.hashCode());
        }
        return v0_2;
    }

    public final Object zze()
    {
        com.google.android.recaptcha.internal.zzoi v0_0 = this.zza;
        if (!(v0_0 instanceof com.google.android.recaptcha.internal.zznd)) {
            return v0_0.zzad().zzl();
        } else {
            return ((com.google.android.recaptcha.internal.zznd) v0_0).zzv();
        }
    }

    public final void zzf(Object p2)
    {
        this.zzb.zzi(p2);
        this.zzd.zza(p2);
        return;
    }

    public final void zzg(Object p2, Object p3)
    {
        com.google.android.recaptcha.internal.zzoy.zzq(this.zzb, p2, p3);
        if (this.zzc) {
            com.google.android.recaptcha.internal.zzoy.zzp(this.zzd, p2, p3);
        }
        return;
    }

    public final void zzh(Object p10, com.google.android.recaptcha.internal.zzov p11, com.google.android.recaptcha.internal.zzmo p12)
    {
        com.google.android.recaptcha.internal.zzpl v0 = this.zzb;
        Object v1 = v0.zza(p10);
        ((com.google.android.recaptcha.internal.zzna) p10).zzi();
        while (p11.zzc() != 2147483647) {
            com.google.android.recaptcha.internal.zznc v2_0 = p11.zzd();
            int v5 = 0;
            if (v2_0 == 11) {
                com.google.android.recaptcha.internal.zznc v2_1 = 0;
                com.google.android.recaptcha.internal.zzle v4_1 = 0;
                while (p11.zzc() != 2147483647) {
                    boolean v7_1 = p11.zzd();
                    if (v7_1 != 16) {
                        if (v7_1 != 26) {
                            if (!p11.zzO()) {
                            }
                        } else {
                            if (v2_1 != null) {
                                throw 0;
                            } else {
                                v4_1 = p11.zzp();
                            }
                        }
                    } else {
                        v5 = p11.zzj();
                        v2_1 = p12.zza(this.zza, v5);
                    }
                    if (p11.zzd() != 12) {
                        throw new com.google.android.recaptcha.internal.zznn("Protocol message end-group tag did not match expected tag.");
                    } else {
                        if (v4_1 != null) {
                            if (v2_1 != null) {
                                throw 0;
                            } else {
                                v0.zzg(v1, v5, v4_1);
                            }
                        }
                    }
                }
            } else {
                com.google.android.recaptcha.internal.zznc v2_5;
                if ((v2_0 & 7) != 2) {
                    v2_5 = p11.zzO();
                } else {
                    if (p12.zza(this.zza, (v2_0 >> 3)) != null) {
                        throw 0;
                    } else {
                        v2_5 = v0.zzk(v1, p11, 0);
                    }
                }
                if (v2_5 != null) {
                }
            }
            v0.zzj(p10, v1);
            return;
        }
        v0.zzj(p10, v1);
        return;
    }

    public final void zzi(Object p10, byte[] p11, int p12, int p13, com.google.android.recaptcha.internal.zzkt p14)
    {
        int v1_0 = ((com.google.android.recaptcha.internal.zznd) p10).zzc;
        if (v1_0 == com.google.android.recaptcha.internal.zzpm.zzc()) {
            v1_0 = com.google.android.recaptcha.internal.zzpm.zzf();
            ((com.google.android.recaptcha.internal.zznd) p10).zzc = v1_0;
        }
        com.google.android.recaptcha.internal.zzpm v6 = v1_0;
        ((com.google.android.recaptcha.internal.zzna) p10).zzi();
        com.google.android.recaptcha.internal.zznc v0_2 = 0;
        while (p12 < p13) {
            int v4_0 = com.google.android.recaptcha.internal.zzku.zzi(p11, p12, p14);
            int v2_0 = p14.zza;
            if (v2_0 == 11) {
                int v11_2 = 0;
                com.google.android.recaptcha.internal.zzle v12_2 = 0;
                while (v4_0 < p13) {
                    int v13_1 = com.google.android.recaptcha.internal.zzku.zzi(p11, v4_0, p14);
                    com.google.android.recaptcha.internal.zzkt v14_1 = p14.zza;
                    int v2_1 = (v14_1 >> 3);
                    int v4_1 = (v14_1 & 7);
                    if (v2_1 == 2) {
                        if (v4_1 == 0) {
                            v4_0 = com.google.android.recaptcha.internal.zzku.zzi(p11, v13_1, p14);
                            v11_2 = p14.zza;
                            v0_2 = p14.zzd.zza(this.zza, v11_2);
                        }
                    } else {
                        if (v2_1 == 3) {
                            if (v0_2 != null) {
                                throw 0;
                            } else {
                                if (v4_1 == 2) {
                                    v4_0 = com.google.android.recaptcha.internal.zzku.zza(p11, v13_1, p14);
                                    v12_2 = ((com.google.android.recaptcha.internal.zzle) p14.zzc);
                                }
                            }
                        }
                    }
                    if (v14_1 != 12) {
                        v4_0 = com.google.android.recaptcha.internal.zzku.zzo(v14_1, p11, v13_1, p13, p14);
                    }
                    if (v12_2 != null) {
                        v6.zzj(((v11_2 << 3) | 2), v12_2);
                    }
                    p12 = v13_1;
                }
                v13_1 = v4_0;
            } else {
                if ((v2_0 & 7) != 2) {
                    p12 = com.google.android.recaptcha.internal.zzku.zzo(v2_0, p11, v4_0, p13, p14);
                } else {
                    v0_2 = p14.zzd.zza(this.zza, (v2_0 >> 3));
                    if (v0_2 != null) {
                        throw 0;
                    } else {
                        p12 = com.google.android.recaptcha.internal.zzku.zzh(v2_0, p11, v4_0, p13, v6, p14);
                    }
                }
            }
        }
        if (p12 != p13) {
            throw new com.google.android.recaptcha.internal.zznn("Failed to parse the message.");
        } else {
            return;
        }
    }

    public final void zzj(Object p6, com.google.android.recaptcha.internal.zzpy p7)
    {
        java.util.Iterator v0_3 = ((com.google.android.recaptcha.internal.zzna) p6).zzb.zzf();
        while (v0_3.hasNext()) {
            Object v1_1 = ((java.util.Map$Entry) v0_3.next());
            int v2_1 = ((com.google.android.recaptcha.internal.zzms) v1_1.getKey());
            if (v2_1.zze() != com.google.android.recaptcha.internal.zzpx.zzi) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            } else {
                v2_1.zzg();
                v2_1.zzf();
                if (!(v1_1 instanceof com.google.android.recaptcha.internal.zznp)) {
                    p7.zzw(v2_1.zza(), v1_1.getValue());
                } else {
                    p7.zzw(v2_1.zza(), ((com.google.android.recaptcha.internal.zznp) v1_1).zza().zzb());
                }
            }
        }
        ((com.google.android.recaptcha.internal.zznd) p6).zzc.zzk(p7);
        return;
    }

    public final boolean zzk(Object p3, Object p4)
    {
        if (((com.google.android.recaptcha.internal.zznd) p3).zzc.equals(((com.google.android.recaptcha.internal.zznd) p4).zzc)) {
            if (!this.zzc) {
                return 1;
            } else {
                return ((com.google.android.recaptcha.internal.zzna) p3).zzb.equals(((com.google.android.recaptcha.internal.zzna) p4).zzb);
            }
        } else {
            return 0;
        }
    }

    public final boolean zzl(Object p1)
    {
        return ((com.google.android.recaptcha.internal.zzna) p1).zzb.zzk();
    }
}
