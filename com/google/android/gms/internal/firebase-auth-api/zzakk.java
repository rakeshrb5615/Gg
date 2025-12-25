package com.google.android.gms.internal.firebase-auth-api;
final class zzakk extends com.google.android.gms.internal.firebase-auth-api.zzakh {
    private final byte[] zzd;
    private int zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private int zzi;
    private int zzj;

    private zzakk(byte[] p1, int p2, int p3, boolean p4)
    {
        super(0);
        super.zzj = 2147483647;
        super.zzd = p1;
        super.zze = (p3 + p2);
        super.zzg = p2;
        super.zzh = p2;
        return;
    }

    public synthetic zzakk(byte[] p1, int p2, int p3, boolean p4, com.google.android.gms.internal.firebase-auth-api.zzakm p5)
    {
        this(p1, p2, p3, p4);
        return;
    }

    private final int zzaa()
    {
        byte v0_0 = this.zzg;
        int v1_0 = this.zze;
        if (v1_0 != v0_0) {
            byte v2_0 = this.zzd;
            byte v3_6 = (v0_0 + 1);
            int v4_5 = v2_0[v0_0];
            if (v4_5 < 0) {
                if ((v1_0 - v3_6) >= 9) {
                    byte v0_1;
                    int v1_1 = (v0_0 + 2);
                    byte v3_2 = ((v2_0[v3_6] << 7) ^ v4_5);
                    if (v3_2 >= 0) {
                        int v4_0 = (v0_0 + 3);
                        int v1_4 = ((v2_0[v1_1] << 14) ^ v3_2);
                        if (v1_4 < 0) {
                            byte v3_3 = (v0_0 + 4);
                            int v1_5 = (v1_4 ^ (v2_0[v4_0] << 21));
                            if (v1_5 >= 0) {
                                v4_0 = (v0_0 + 5);
                                byte v3_4 = v2_0[v3_3];
                                int v1_7 = ((v1_5 ^ (v3_4 << 28)) ^ 266354560);
                                if (v3_4 < 0) {
                                    v3_3 = (v0_0 + 6);
                                    if (v2_0[v4_0] < 0) {
                                        v4_0 = (v0_0 + 7);
                                        if (v2_0[v3_3] >= 0) {
                                            v0_1 = v1_7;
                                            v1_1 = v4_0;
                                            this.zzg = v1_1;
                                            return v0_1;
                                        } else {
                                            v3_3 = (v0_0 + 8);
                                            if (v2_0[v4_0] < 0) {
                                                v4_0 = (v0_0 + 9);
                                                if (v2_0[v3_3] >= 0) {
                                                } else {
                                                    if (v2_0[v4_0] < 0) {
                                                        return ((int) this.zzm());
                                                    } else {
                                                        v1_1 = (v0_0 + 10);
                                                        v0_1 = v1_7;
                                                        this.zzg = v1_1;
                                                        return v0_1;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    v0_1 = v1_7;
                                    v1_1 = v3_3;
                                    this.zzg = v1_1;
                                    return v0_1;
                                }
                            } else {
                                v0_1 = (-2080896 ^ v1_5);
                            }
                        } else {
                            v0_1 = (v1_4 ^ 16256);
                        }
                    } else {
                        v0_1 = (v3_2 ^ -128);
                    }
                    this.zzg = v1_1;
                    return v0_1;
                }
            } else {
                this.zzg = v3_6;
                return v4_5;
            }
        }
        return ((int) this.zzm());
    }

    private final long zzab()
    {
        com.google.android.gms.internal.firebase-auth-api.zzall v0_0 = this.zzg;
        if ((this.zze - v0_0) < 8) {
            throw com.google.android.gms.internal.firebase-auth-api.zzall.zzj();
        } else {
            byte[] v1_2 = this.zzd;
            this.zzg = (v0_0 + 8);
            return (((((long) v1_2[(v0_0 + 7)]) & 255) << 56) | (((((((((long) v1_2[v0_0]) & 255) | ((((long) v1_2[(v0_0 + 1)]) & 255) << 8)) | ((((long) v1_2[(v0_0 + 2)]) & 255) << 16)) | ((((long) v1_2[(v0_0 + 3)]) & 255) << 24)) | ((((long) v1_2[(v0_0 + 4)]) & 255) << 32)) | ((((long) v1_2[(v0_0 + 5)]) & 255) << 40)) | ((((long) v1_2[(v0_0 + 6)]) & 255) << 48)));
        }
    }

    private final long zzac()
    {
        int v0_0 = this.zzg;
        int v1_0 = this.zze;
        if (v1_0 != v0_0) {
            long v2_0 = this.zzd;
            long v3_7 = (v0_0 + 1);
            long v4_4 = v2_0[v0_0];
            if (v4_4 < 0) {
                if ((v1_0 - v3_7) >= 9) {
                    long v2_1;
                    int v1_1 = (v0_0 + 2);
                    long v3_2 = ((v2_0[v3_7] << 7) ^ v4_4);
                    if (v3_2 >= 0) {
                        long v4_0 = (v0_0 + 3);
                        int v1_4 = ((v2_0[v1_1] << 14) ^ v3_2);
                        if (v1_4 < 0) {
                            long v3_3 = (v0_0 + 4);
                            int v1_5 = (v1_4 ^ (v2_0[v4_0] << 21));
                            if (v1_5 >= 0) {
                                long v5_2;
                                v1_1 = (v0_0 + 5);
                                long v3_6 = (((long) v1_5) ^ (((long) v2_0[v3_3]) << 28));
                                if (v3_6 < 0) {
                                    int v0_4;
                                    long v7_1 = (v0_0 + 6);
                                    long v3_8 = (v3_6 ^ (((long) v2_0[v1_1]) << 35));
                                    if (v3_8 >= 0) {
                                        v1_1 = (v0_0 + 7);
                                        v3_6 = (v3_8 ^ (((long) v2_0[v7_1]) << 42));
                                        if (v3_6 < 0) {
                                            v7_1 = (v0_0 + 8);
                                            v3_8 = (v3_6 ^ (((long) v2_0[v1_1]) << 49));
                                            if (v3_8 >= 0) {
                                                v1_1 = (v0_0 + 9);
                                                long v3_10 = ((v3_8 ^ (((long) v2_0[v7_1]) << 56)) ^ 71499008037633920);
                                                if (v3_10 < 0) {
                                                    if (((long) v2_0[v1_1]) < 0) {
                                                        return this.zzm();
                                                    } else {
                                                        v1_1 = (v0_0 + 10);
                                                    }
                                                }
                                                v2_1 = v3_10;
                                                this.zzg = v1_1;
                                                return v2_1;
                                            } else {
                                                v0_4 = -558586000294016;
                                            }
                                        } else {
                                            v5_2 = 4363953127296;
                                            v2_1 = (v3_6 ^ v5_2);
                                            this.zzg = v1_1;
                                            return v2_1;
                                        }
                                    } else {
                                        v0_4 = -34093383808;
                                    }
                                    v2_1 = (v3_8 ^ v0_4);
                                    v1_1 = v7_1;
                                    this.zzg = v1_1;
                                    return v2_1;
                                } else {
                                    v5_2 = 266354560;
                                }
                            } else {
                                v1_1 = v3_3;
                                v2_1 = ((long) (-2080896 ^ v1_5));
                            }
                        } else {
                            v2_1 = ((long) (v1_4 ^ 16256));
                            v1_1 = v4_0;
                        }
                    } else {
                        v2_1 = ((long) (v3_2 ^ -128));
                    }
                    this.zzg = v1_1;
                    return v2_1;
                }
            } else {
                this.zzg = v3_7;
                return ((long) v4_4);
            }
        }
        return this.zzm();
    }

    private final void zzad()
    {
        int v0_2 = (this.zze + this.zzf);
        this.zze = v0_2;
        int v1_3 = (v0_2 - this.zzh);
        int v2 = this.zzj;
        if (v1_3 <= v2) {
            this.zzf = 0;
            return;
        } else {
            int v1_1 = (v1_3 - v2);
            this.zzf = v1_1;
            this.zze = (v0_2 - v1_1);
            return;
        }
    }

    private final void zzf(int p3)
    {
        if (p3 >= null) {
            int v1_1 = this.zzg;
            if (p3 <= (this.zze - v1_1)) {
                this.zzg = (v1_1 + p3);
                return;
            }
        }
        if (p3 >= null) {
            throw com.google.android.gms.internal.firebase-auth-api.zzall.zzj();
        } else {
            throw com.google.android.gms.internal.firebase-auth-api.zzall.zzf();
        }
    }

    private final byte zzy()
    {
        com.google.android.gms.internal.firebase-auth-api.zzall v0_0 = this.zzg;
        if (v0_0 == this.zze) {
            throw com.google.android.gms.internal.firebase-auth-api.zzall.zzj();
        } else {
            byte[] v1_1 = this.zzd;
            this.zzg = (v0_0 + 1);
            return v1_1[v0_0];
        }
    }

    private final int zzz()
    {
        com.google.android.gms.internal.firebase-auth-api.zzall v0_0 = this.zzg;
        if ((this.zze - v0_0) < 4) {
            throw com.google.android.gms.internal.firebase-auth-api.zzall.zzj();
        } else {
            byte[] v1_2 = this.zzd;
            this.zzg = (v0_0 + 4);
            return (((v1_2[(v0_0 + 3)] & 255) << 24) | (((v1_2[v0_0] & 255) | ((v1_2[(v0_0 + 1)] & 255) << 8)) | ((v1_2[(v0_0 + 2)] & 255) << 16)));
        }
    }

    public final double zza()
    {
        return Double.longBitsToDouble(this.zzab());
    }

    public final float zzb()
    {
        return Float.intBitsToFloat(this.zzz());
    }

    public final int zzb(int p2)
    {
        if (p2 < null) {
            throw com.google.android.gms.internal.firebase-auth-api.zzall.zzf();
        } else {
            com.google.android.gms.internal.firebase-auth-api.zzall v2_3 = (p2 + this.zzc());
            if (v2_3 < null) {
                throw com.google.android.gms.internal.firebase-auth-api.zzall.zzi();
            } else {
                int v0_0 = this.zzj;
                if (v2_3 > v0_0) {
                    throw com.google.android.gms.internal.firebase-auth-api.zzall.zzj();
                } else {
                    this.zzj = v2_3;
                    this.zzad();
                    return v0_0;
                }
            }
        }
    }

    public final int zzc()
    {
        return (this.zzg - this.zzh);
    }

    public final void zzc(int p2)
    {
        if (this.zzi != p2) {
            throw com.google.android.gms.internal.firebase-auth-api.zzall.zzb();
        } else {
            return;
        }
    }

    public final int zzd()
    {
        return this.zzaa();
    }

    public final void zzd(int p1)
    {
        this.zzj = p1;
        this.zzad();
        return;
    }

    public final int zze()
    {
        return this.zzz();
    }

    public final boolean zze(int p6)
    {
        int v0_0 = (p6 & 7);
        int v1 = 0;
        if (v0_0 == 0) {
            if ((this.zze - this.zzg) < 10) {
                while (v1 < 10) {
                    if (this.zzy() < 0) {
                        v1++;
                    }
                }
                throw com.google.android.gms.internal.firebase-auth-api.zzall.zze();
            } else {
                while (v1 < 10) {
                    com.google.android.gms.internal.firebase-auth-api.zzalo v6_4 = this.zzd;
                    int v3_0 = this.zzg;
                    this.zzg = (v3_0 + 1);
                    if (v6_4[v3_0] < null) {
                        v1++;
                    }
                }
                throw com.google.android.gms.internal.firebase-auth-api.zzall.zze();
            }
            return 1;
        } else {
            if (v0_0 == 1) {
                this.zzf(8);
                return 1;
            } else {
                if (v0_0 == 2) {
                    this.zzf(this.zzaa());
                    return 1;
                } else {
                    if (v0_0 == 3) {
                        this.zzv();
                        this.zzc((((p6 >> 3) << 3) | 4));
                        return 1;
                    } else {
                        if (v0_0 == 4) {
                            this.zzu();
                            return 0;
                        } else {
                            if (v0_0 != 5) {
                                throw com.google.android.gms.internal.firebase-auth-api.zzall.zza();
                            } else {
                                this.zzf(4);
                                return 1;
                            }
                        }
                    }
                }
            }
        }
    }

    public final int zzf()
    {
        return this.zzaa();
    }

    public final int zzg()
    {
        return this.zzz();
    }

    public final int zzh()
    {
        return com.google.android.gms.internal.firebase-auth-api.zzakh.zza(this.zzaa());
    }

    public final int zzi()
    {
        if (!this.zzw()) {
            com.google.android.gms.internal.firebase-auth-api.zzall v0_2 = this.zzaa();
            this.zzi = v0_2;
            if ((v0_2 >> 3) == 0) {
                throw com.google.android.gms.internal.firebase-auth-api.zzall.zzc();
            } else {
                return v0_2;
            }
        } else {
            this.zzi = 0;
            return 0;
        }
    }

    public final int zzj()
    {
        return this.zzaa();
    }

    public final long zzk()
    {
        return this.zzab();
    }

    public final long zzl()
    {
        return this.zzac();
    }

    public final long zzm()
    {
        com.google.android.gms.internal.firebase-auth-api.zzall v0_0 = 0;
        int v2 = 0;
        while (v2 < 64) {
            int v3_2 = this.zzy();
            v0_0 |= (((long) (v3_2 & 127)) << v2);
            if ((v3_2 & 128) != 0) {
                v2 += 7;
            } else {
                return v0_0;
            }
        }
        throw com.google.android.gms.internal.firebase-auth-api.zzall.zze();
    }

    public final long zzn()
    {
        return this.zzab();
    }

    public final long zzo()
    {
        return com.google.android.gms.internal.firebase-auth-api.zzakh.zza(this.zzac());
    }

    public final long zzp()
    {
        return this.zzac();
    }

    public final com.google.android.gms.internal.firebase-auth-api.zzajv zzq()
    {
        com.google.android.gms.internal.firebase-auth-api.zzall v0_0 = this.zzaa();
        if (v0_0 > null) {
            int v2_3 = this.zzg;
            if (v0_0 <= (this.zze - v2_3)) {
                byte[] v1_4 = com.google.android.gms.internal.firebase-auth-api.zzajv.zza(this.zzd, v2_3, v0_0);
                this.zzg = (this.zzg + v0_0);
                return v1_4;
            }
        }
        if (v0_0 != null) {
            com.google.android.gms.internal.firebase-auth-api.zzall v0_3;
            if (v0_0 <= null) {
                if (v0_0 > null) {
                    throw com.google.android.gms.internal.firebase-auth-api.zzall.zzj();
                } else {
                    if (v0_0 != null) {
                        throw com.google.android.gms.internal.firebase-auth-api.zzall.zzf();
                    } else {
                        v0_3 = com.google.android.gms.internal.firebase-auth-api.zzalh.zzb;
                    }
                }
            } else {
                int v2_0 = this.zzg;
                if (v0_0 > (this.zze - v2_0)) {
                } else {
                    com.google.android.gms.internal.firebase-auth-api.zzall v0_4 = (v0_0 + v2_0);
                    this.zzg = v0_4;
                    v0_3 = java.util.Arrays.copyOfRange(this.zzd, v2_0, v0_4);
                }
            }
            return com.google.android.gms.internal.firebase-auth-api.zzajv.zzb(v0_3);
        } else {
            return com.google.android.gms.internal.firebase-auth-api.zzajv.zza;
        }
    }

    public final String zzr()
    {
        com.google.android.gms.internal.firebase-auth-api.zzall v0_0 = this.zzaa();
        if (v0_0 > null) {
            int v2_2 = this.zzg;
            if (v0_0 <= (this.zze - v2_2)) {
                String v1_1 = new String(this.zzd, v2_2, v0_0, com.google.android.gms.internal.firebase-auth-api.zzalh.zza);
                this.zzg = (this.zzg + v0_0);
                return v1_1;
            }
        }
        if (v0_0 != null) {
            if (v0_0 >= null) {
                throw com.google.android.gms.internal.firebase-auth-api.zzall.zzj();
            } else {
                throw com.google.android.gms.internal.firebase-auth-api.zzall.zzf();
            }
        } else {
            return "";
        }
    }

    public final String zzs()
    {
        com.google.android.gms.internal.firebase-auth-api.zzall v0_0 = this.zzaa();
        if (v0_0 > null) {
            int v2_2 = this.zzg;
            if (v0_0 <= (this.zze - v2_2)) {
                String v1_1 = com.google.android.gms.internal.firebase-auth-api.zzaoa.zzb(this.zzd, v2_2, v0_0);
                this.zzg = (this.zzg + v0_0);
                return v1_1;
            }
        }
        if (v0_0 != null) {
            if (v0_0 > null) {
                throw com.google.android.gms.internal.firebase-auth-api.zzall.zzj();
            } else {
                throw com.google.android.gms.internal.firebase-auth-api.zzall.zzf();
            }
        } else {
            return "";
        }
    }

    public final boolean zzw()
    {
        if (this.zzg != this.zze) {
            return 0;
        } else {
            return 1;
        }
    }

    public final boolean zzx()
    {
        if (this.zzac() == 0) {
            return 0;
        } else {
            return 1;
        }
    }
}
