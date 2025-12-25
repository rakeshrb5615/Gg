package com.google.android.gms.internal.firebase-auth-api;
final class zzams implements com.google.android.gms.internal.firebase-auth-api.zzanb {
    private final com.google.android.gms.internal.firebase-auth-api.zzamm zza;
    private final com.google.android.gms.internal.firebase-auth-api.zzanu zzb;
    private final boolean zzc;
    private final com.google.android.gms.internal.firebase-auth-api.zzakw zzd;

    private zzams(com.google.android.gms.internal.firebase-auth-api.zzanu p1, com.google.android.gms.internal.firebase-auth-api.zzakw p2, com.google.android.gms.internal.firebase-auth-api.zzamm p3)
    {
        this.zzb = p1;
        this.zzc = p2.zza(p3);
        this.zzd = p2;
        this.zza = p3;
        return;
    }

    public static com.google.android.gms.internal.firebase-auth-api.zzams zza(com.google.android.gms.internal.firebase-auth-api.zzanu p1, com.google.android.gms.internal.firebase-auth-api.zzakw p2, com.google.android.gms.internal.firebase-auth-api.zzamm p3)
    {
        return new com.google.android.gms.internal.firebase-auth-api.zzams(p1, p2, p3);
    }

    public final int zza(Object p3)
    {
        int v0_0 = this.zzb;
        int v0_1 = v0_0.zzb(v0_0.zzd(p3));
        if (this.zzc) {
            v0_1 += this.zzd.zza(p3).zza();
        }
        return v0_1;
    }

    public final Object zza()
    {
        com.google.android.gms.internal.firebase-auth-api.zzamm v0_0 = this.zza;
        if (!(v0_0 instanceof com.google.android.gms.internal.firebase-auth-api.zzalf)) {
            return v0_0.zzq().zzf();
        } else {
            return ((com.google.android.gms.internal.firebase-auth-api.zzalf) v0_0).zzo();
        }
    }

    public final void zza(Object p12, com.google.android.gms.internal.firebase-auth-api.zzanc p13, com.google.android.gms.internal.firebase-auth-api.zzaku p14)
    {
        com.google.android.gms.internal.firebase-auth-api.zzanu v0 = this.zzb;
        com.google.android.gms.internal.firebase-auth-api.zzakw v1 = this.zzd;
        Object v2 = v0.zzc(p12);
        com.google.android.gms.internal.firebase-auth-api.zzakx v3 = v1.zzb(p12);
        while (p13.zzc() != 2147483647) {
            Object v4_3;
            Object v4_0 = p13.zzd();
            int v7 = 0;
            if (v4_0 == 11) {
                Object v4_1 = 0;
                com.google.android.gms.internal.firebase-auth-api.zzajv v6_1 = 0;
                while (p13.zzc() != 2147483647) {
                    boolean v8_1 = p13.zzd();
                    if (v8_1 != 16) {
                        if (v8_1 != 26) {
                            if ((v8_1 == 12) || (!p13.zzt())) {
                                break;
                            }
                        } else {
                            if (v4_1 == null) {
                                v6_1 = p13.zzp();
                            } else {
                                v1.zza(p13, v4_1, p14, v3);
                            }
                        }
                    } else {
                        v7 = p13.zzj();
                        v4_1 = v1.zza(p14, this.zza, v7);
                    }
                }
                if (p13.zzd() != 12) {
                    throw com.google.android.gms.internal.firebase-auth-api.zzall.zzb();
                } else {
                    if (v6_1 == null) {
                        v4_3 = 1;
                    } else {
                        if (v4_1 == null) {
                            v0.zza(v2, v7, v6_1);
                        } else {
                            v1.zza(v6_1, v4_1, p14, v3);
                        }
                    }
                }
            } else {
                if ((v4_0 & 7) != 2) {
                    v4_3 = p13.zzt();
                } else {
                    Object v4_5 = v1.zza(p14, this.zza, (v4_0 >> 3));
                    if (v4_5 == null) {
                        v4_3 = v0.zza(v2, p13, 0);
                    } else {
                        v1.zza(p13, v4_5, p14, v3);
                    }
                }
            }
            if (v4_3 == null) {
                v0.zzb(p12, v2);
                return;
            }
        }
        v0.zzb(p12, v2);
        return;
    }

    public final void zza(Object p6, com.google.android.gms.internal.firebase-auth-api.zzaol p7)
    {
        com.google.android.gms.internal.firebase-auth-api.zzanu v0_2 = this.zzd.zza(p6).zzd();
        while (v0_2.hasNext()) {
            Object v1_1 = ((java.util.Map$Entry) v0_2.next());
            int v2_1 = ((com.google.android.gms.internal.firebase-auth-api.zzakz) v1_1.getKey());
            if ((v2_1.zzc() != com.google.android.gms.internal.firebase-auth-api.zzaoj.zzi) || ((v2_1.zze()) || (v2_1.zzd()))) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            } else {
                if (!(v1_1 instanceof com.google.android.gms.internal.firebase-auth-api.zzalp)) {
                    p7.zza(v2_1.zza(), v1_1.getValue());
                } else {
                    p7.zza(v2_1.zza(), ((com.google.android.gms.internal.firebase-auth-api.zzalp) v1_1).zza().zzb());
                }
            }
        }
        com.google.android.gms.internal.firebase-auth-api.zzanu v0_3 = this.zzb;
        v0_3.zza(v0_3.zzd(p6), p7);
        return;
    }

    public final void zza(Object p2, Object p3)
    {
        com.google.android.gms.internal.firebase-auth-api.zzand.zza(this.zzb, p2, p3);
        if (this.zzc) {
            com.google.android.gms.internal.firebase-auth-api.zzand.zza(this.zzd, p2, p3);
        }
        return;
    }

    public final void zza(Object p10, byte[] p11, int p12, int p13, com.google.android.gms.internal.firebase-auth-api.zzaju p14)
    {
        com.google.android.gms.internal.firebase-auth-api.zzamm v1_0 = ((com.google.android.gms.internal.firebase-auth-api.zzalf) p10).zzb;
        if (v1_0 == com.google.android.gms.internal.firebase-auth-api.zzanx.zzc()) {
            v1_0 = com.google.android.gms.internal.firebase-auth-api.zzanx.zzd();
            ((com.google.android.gms.internal.firebase-auth-api.zzalf) p10).zzb = v1_0;
        }
        com.google.android.gms.internal.firebase-auth-api.zzanx v6 = v1_0;
        ((com.google.android.gms.internal.firebase-auth-api.zzalf$zzd) p10).zza();
        com.google.android.gms.internal.firebase-auth-api.zzalf$zzf v0_2 = 0;
        while (p12 < p13) {
            int v4_0 = com.google.android.gms.internal.firebase-auth-api.zzajr.zzc(p11, p12, p14);
            int v2_0 = p14.zza;
            if (v2_0 == 11) {
                int v11_1 = 0;
                com.google.android.gms.internal.firebase-auth-api.zzajv v12_2 = 0;
                while (v4_0 < p13) {
                    int v13_1 = com.google.android.gms.internal.firebase-auth-api.zzajr.zzc(p11, v4_0, p14);
                    com.google.android.gms.internal.firebase-auth-api.zzaju v14_1 = p14.zza;
                    int v2_1 = (v14_1 >> 3);
                    int v4_1 = (v14_1 & 7);
                    if (v2_1 == 2) {
                        if (v4_1 == 0) {
                            v4_0 = com.google.android.gms.internal.firebase-auth-api.zzajr.zzc(p11, v13_1, p14);
                            v11_1 = p14.zza;
                            v0_2 = ((com.google.android.gms.internal.firebase-auth-api.zzalf$zzf) this.zzd.zza(p14.zzd, this.zza, v11_1));
                        }
                    } else {
                        if (v2_1 == 3) {
                            if (v0_2 != null) {
                                com.google.android.gms.internal.firebase-auth-api.zzamx.zza();
                                throw new NoSuchMethodError();
                            } else {
                                if (v4_1 == 2) {
                                    v4_0 = com.google.android.gms.internal.firebase-auth-api.zzajr.zza(p11, v13_1, p14);
                                    v12_2 = ((com.google.android.gms.internal.firebase-auth-api.zzajv) p14.zzc);
                                }
                            }
                        }
                    }
                    if (v14_1 != 12) {
                        v4_0 = com.google.android.gms.internal.firebase-auth-api.zzajr.zza(v14_1, p11, v13_1, p13, p14);
                    }
                    if (v12_2 != null) {
                        v6.zza(((v11_1 << 3) | 2), v12_2);
                    }
                    p12 = v13_1;
                }
                v13_1 = v4_0;
            } else {
                if ((v2_0 & 7) != 2) {
                    p12 = com.google.android.gms.internal.firebase-auth-api.zzajr.zza(v2_0, p11, v4_0, p13, p14);
                } else {
                    v0_2 = ((com.google.android.gms.internal.firebase-auth-api.zzalf$zzf) this.zzd.zza(p14.zzd, this.zza, (v2_0 >> 3)));
                    if (v0_2 != null) {
                        com.google.android.gms.internal.firebase-auth-api.zzamx.zza();
                        throw new NoSuchMethodError();
                    } else {
                        p12 = com.google.android.gms.internal.firebase-auth-api.zzajr.zza(v2_0, p11, v4_0, p13, v6, p14);
                    }
                }
            }
        }
        if (p12 != p13) {
            throw com.google.android.gms.internal.firebase-auth-api.zzall.zzg();
        } else {
            return;
        }
    }

    public final int zzb(Object p3)
    {
        int v0_2 = this.zzb.zzd(p3).hashCode();
        if (this.zzc) {
            v0_2 = ((v0_2 * 53) + this.zzd.zza(p3).hashCode());
        }
        return v0_2;
    }

    public final boolean zzb(Object p3, Object p4)
    {
        if (this.zzb.zzd(p3).equals(this.zzb.zzd(p4))) {
            if (!this.zzc) {
                return 1;
            } else {
                return this.zzd.zza(p3).equals(this.zzd.zza(p4));
            }
        } else {
            return 0;
        }
    }

    public final void zzd(Object p2)
    {
        this.zzb.zzf(p2);
        this.zzd.zzc(p2);
        return;
    }

    public final boolean zze(Object p2)
    {
        return this.zzd.zza(p2).zzg();
    }
}
