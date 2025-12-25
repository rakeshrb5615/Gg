package com.google.android.gms.internal.firebase-auth-api;
final class zzakj extends com.google.android.gms.internal.firebase-auth-api.zzakh {
    private final java.io.InputStream zzd;
    private final byte[] zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private int zzi;
    private int zzj;
    private int zzk;

    private zzakj(java.io.InputStream p1, int p2)
    {
        super(0);
        super.zzk = 2147483647;
        com.google.android.gms.internal.firebase-auth-api.zzalh.zza(p1, "input");
        super.zzd = p1;
        int v1_3 = new byte[4096];
        super.zze = v1_3;
        super.zzf = 0;
        super.zzh = 0;
        super.zzj = 0;
        return;
    }

    public synthetic zzakj(java.io.InputStream p1, int p2, com.google.android.gms.internal.firebase-auth-api.zzakm p3)
    {
        this(p1, 4096);
        return;
    }

    private static int zza(java.io.InputStream p0)
    {
        try {
            return p0.available();
        } catch (com.google.android.gms.internal.firebase-auth-api.zzall v0_2) {
            v0_2.zzk();
            throw v0_2;
        }
    }

    private static int zza(java.io.InputStream p0, byte[] p1, int p2, int p3)
    {
        try {
            return p0.read(p1, p2, p3);
        } catch (com.google.android.gms.internal.firebase-auth-api.zzall v0_2) {
            v0_2.zzk();
            throw v0_2;
        }
    }

    private static long zza(java.io.InputStream p0, long p1)
    {
        try {
            return p0.skip(p1);
        } catch (com.google.android.gms.internal.firebase-auth-api.zzall v0_2) {
            v0_2.zzk();
            throw v0_2;
        }
    }

    private final byte[] zza(int p5, boolean p6)
    {
        java.util.Iterator v6_0 = this.zzj(p5);
        if (v6_0 == null) {
            java.util.Iterator v6_2 = this.zzh;
            int v0_0 = this.zzf;
            int v1 = (v0_0 - v6_2);
            this.zzj = (this.zzj + v0_0);
            this.zzh = 0;
            this.zzf = 0;
            int v2_1 = this.zzf((p5 - v1));
            byte[] v5_1 = new byte[p5];
            System.arraycopy(this.zze, v6_2, v5_1, 0, v1);
            java.util.Iterator v6_1 = v2_1.iterator();
            while (v6_1.hasNext()) {
                int v2_4 = ((byte[]) v6_1.next());
                System.arraycopy(v2_4, 0, v5_1, v1, v2_4.length);
                v1 += v2_4.length;
            }
            return v5_1;
        } else {
            return v6_0;
        }
    }

    private final int zzaa()
    {
        byte v0_0 = this.zzh;
        int v1_0 = this.zzf;
        if (v1_0 != v0_0) {
            byte v2_0 = this.zze;
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
                                            this.zzh = v1_1;
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
                                                        this.zzh = v1_1;
                                                        return v0_1;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    v0_1 = v1_7;
                                    v1_1 = v3_3;
                                    this.zzh = v1_1;
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
                    this.zzh = v1_1;
                    return v0_1;
                }
            } else {
                this.zzh = v3_6;
                return v4_5;
            }
        }
        return ((int) this.zzm());
    }

    private final long zzab()
    {
        long v0_0 = this.zzh;
        if ((this.zzf - v0_0) < 8) {
            this.zzg(8);
            v0_0 = this.zzh;
        }
        byte[] v1_2 = this.zze;
        this.zzh = (v0_0 + 8);
        return (((((long) v1_2[(v0_0 + 7)]) & 255) << 56) | (((((((((long) v1_2[v0_0]) & 255) | ((((long) v1_2[(v0_0 + 1)]) & 255) << 8)) | ((((long) v1_2[(v0_0 + 2)]) & 255) << 16)) | ((((long) v1_2[(v0_0 + 3)]) & 255) << 24)) | ((((long) v1_2[(v0_0 + 4)]) & 255) << 32)) | ((((long) v1_2[(v0_0 + 5)]) & 255) << 40)) | ((((long) v1_2[(v0_0 + 6)]) & 255) << 48)));
    }

    private final long zzac()
    {
        int v0_0 = this.zzh;
        int v1_0 = this.zzf;
        if (v1_0 != v0_0) {
            long v2_0 = this.zze;
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
                                                this.zzh = v1_1;
                                                return v2_1;
                                            } else {
                                                v0_4 = -558586000294016;
                                            }
                                        } else {
                                            v5_2 = 4363953127296;
                                            v2_1 = (v3_6 ^ v5_2);
                                            this.zzh = v1_1;
                                            return v2_1;
                                        }
                                    } else {
                                        v0_4 = -34093383808;
                                    }
                                    v2_1 = (v3_8 ^ v0_4);
                                    v1_1 = v7_1;
                                    this.zzh = v1_1;
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
                    this.zzh = v1_1;
                    return v2_1;
                }
            } else {
                this.zzh = v3_7;
                return ((long) v4_4);
            }
        }
        return this.zzm();
    }

    private final void zzad()
    {
        int v0_2 = (this.zzf + this.zzg);
        this.zzf = v0_2;
        int v1_3 = (this.zzj + v0_2);
        int v2 = this.zzk;
        if (v1_3 <= v2) {
            this.zzg = 0;
            return;
        } else {
            int v1_1 = (v1_3 - v2);
            this.zzg = v1_1;
            this.zzf = (v0_2 - v1_1);
            return;
        }
    }

    private final java.util.List zzf(int p7)
    {
        java.util.ArrayList v0_1 = new java.util.ArrayList();
        while (p7 > null) {
            int v1_1 = Math.min(p7, 4096);
            byte[] v2 = new byte[v1_1];
            int v3 = 0;
            while (v3 < v1_1) {
                int v4_1 = this.zzd.read(v2, v3, (v1_1 - v3));
                if (v4_1 == -1) {
                    throw com.google.android.gms.internal.firebase-auth-api.zzall.zzj();
                } else {
                    this.zzj = (this.zzj + v4_1);
                    v3 += v4_1;
                }
            }
            p7 -= v1_1;
            v0_1.add(v2);
        }
        return v0_1;
    }

    private final void zzg(int p3)
    {
        if (this.zzi(p3)) {
            return;
        } else {
            if (p3 <= ((this.zzb - this.zzj) - this.zzh)) {
                throw com.google.android.gms.internal.firebase-auth-api.zzall.zzj();
            } else {
                throw com.google.android.gms.internal.firebase-auth-api.zzall.zzi();
            }
        }
    }

    private final void zzh(int p8)
    {
        int v0_0 = this.zzf;
        int v1_0 = this.zzh;
        if ((p8 > (v0_0 - v1_0)) || (p8 < null)) {
            if (p8 < null) {
                throw com.google.android.gms.internal.firebase-auth-api.zzall.zzf();
            } else {
                int v2_4 = this.zzj;
                StringBuilder v4_0 = this.zzk;
                if (((v2_4 + v1_0) + p8) > v4_0) {
                    this.zzh(((v4_0 - v2_4) - v1_0));
                    throw com.google.android.gms.internal.firebase-auth-api.zzall.zzj();
                } else {
                    this.zzj = (v2_4 + v1_0);
                    int v0_1 = (v0_0 - v1_0);
                    this.zzf = 0;
                    this.zzh = 0;
                    while (v0_1 < p8) {
                        try {
                            int v3_2 = ((long) (p8 - v0_1));
                            int v1_3 = com.google.android.gms.internal.firebase-auth-api.zzakj.zza(this.zzd, v3_2);
                            long v5_1 = v1_3 cmp 0;
                        } catch (IllegalStateException v8_5) {
                            this.zzj = (this.zzj + v0_1);
                            this.zzad();
                            throw v8_5;
                        }
                        if ((v5_1 < 0) || (v1_3 > v3_2)) {
                            int v3_6 = String.valueOf(this.zzd.getClass());
                            StringBuilder v4_4 = new StringBuilder();
                            v4_4.append(v3_6);
                            v4_4.append("#skip returned invalid result: ");
                            v4_4.append(v1_3);
                            v4_4.append("\nThe InputStream implementation is buggy.");
                            throw new IllegalStateException(v4_4.toString());
                        } else {
                            if (v5_1 == 0) {
                                break;
                            }
                            v0_1 += ((int) v1_3);
                        }
                    }
                    this.zzj = (this.zzj + v0_1);
                    this.zzad();
                    if (v0_1 < p8) {
                        int v0_2 = this.zzf;
                        int v1_9 = (v0_2 - this.zzh);
                        this.zzh = v0_2;
                        this.zzg(1);
                        while(true) {
                            int v2_3 = (p8 - v1_9);
                            int v3_8 = this.zzf;
                            if (v2_3 <= v3_8) {
                                break;
                            }
                            v1_9 += v3_8;
                            this.zzh = v3_8;
                            this.zzg(1);
                        }
                        this.zzh = v2_3;
                    }
                    return;
                }
            }
        } else {
            this.zzh = (v1_0 + p8);
            return;
        }
    }

    private final boolean zzi(int p8)
    {
        int v0_0 = this.zzh;
        StringBuilder v2_0 = this.zzf;
        if ((v0_0 + p8) <= v2_0) {
            throw new IllegalStateException(v1.a.j("refillBuffer() called when ", p8, " bytes were already available in buffer"));
        } else {
            int v3_0 = this.zzj;
            if (p8 <= ((this.zzb - v3_0) - v0_0)) {
                if (((v3_0 + v0_0) + p8) <= this.zzk) {
                    if (v0_0 > 0) {
                        if (v2_0 > v0_0) {
                            System.arraycopy(this.zze, v0_0, this.zze, 0, (v2_0 - v0_0));
                        }
                        this.zzj = (this.zzj + v0_0);
                        this.zzf = (this.zzf - v0_0);
                        this.zzh = 0;
                    }
                    int v1_10 = this.zze;
                    StringBuilder v2_2 = this.zzf;
                    int v0_3 = com.google.android.gms.internal.firebase-auth-api.zzakj.zza(this.zzd, v1_10, v2_2, Math.min((v1_10.length - v2_2), ((this.zzb - this.zzj) - v2_2)));
                    if ((v0_3 == 0) || ((v0_3 < -1) || (v0_3 > this.zze.length))) {
                        int v1_17 = String.valueOf(this.zzd.getClass());
                        StringBuilder v2_4 = new StringBuilder();
                        v2_4.append(v1_17);
                        v2_4.append("#read(byte[]) returned invalid result: ");
                        v2_4.append(v0_3);
                        v2_4.append("\nThe InputStream implementation is buggy.");
                        throw new IllegalStateException(v2_4.toString());
                    } else {
                        if (v0_3 <= 0) {
                            return 0;
                        } else {
                            this.zzf = (this.zzf + v0_3);
                            this.zzad();
                            if ((this.zzf < p8) && (!this.zzi(p8))) {
                                return 0;
                            } else {
                                return 1;
                            }
                        }
                    }
                } else {
                    return 0;
                }
            } else {
                return 0;
            }
        }
    }

    private final byte[] zzj(int p6)
    {
        if (p6 != null) {
            if (p6 < null) {
                throw com.google.android.gms.internal.firebase-auth-api.zzall.zzf();
            } else {
                int v0_2 = this.zzj;
                byte[] v1_2 = this.zzh;
                int v2_9 = ((v0_2 + v1_2) + p6);
                if ((v2_9 - this.zzb) > 0) {
                    throw com.google.android.gms.internal.firebase-auth-api.zzall.zzi();
                } else {
                    int v3_1 = this.zzk;
                    if (v2_9 > v3_1) {
                        this.zzh(((v3_1 - v0_2) - v1_2));
                        throw com.google.android.gms.internal.firebase-auth-api.zzall.zzj();
                    } else {
                        int v0_1 = (this.zzf - v1_2);
                        byte[] v1_0 = (p6 - v0_1);
                        if ((v1_0 >= 4096) && (v1_0 > com.google.android.gms.internal.firebase-auth-api.zzakj.zza(this.zzd))) {
                            return 0;
                        } else {
                            byte[] v1_1 = new byte[p6];
                            System.arraycopy(this.zze, this.zzh, v1_1, 0, v0_1);
                            this.zzj = (this.zzj + this.zzf);
                            this.zzh = 0;
                            this.zzf = 0;
                            while (v0_1 < p6) {
                                int v2_7 = com.google.android.gms.internal.firebase-auth-api.zzakj.zza(this.zzd, v1_1, v0_1, (p6 - v0_1));
                                if (v2_7 == -1) {
                                    throw com.google.android.gms.internal.firebase-auth-api.zzall.zzj();
                                } else {
                                    this.zzj = (this.zzj + v2_7);
                                    v0_1 += v2_7;
                                }
                            }
                            return v1_1;
                        }
                    }
                }
            }
        } else {
            return com.google.android.gms.internal.firebase-auth-api.zzalh.zzb;
        }
    }

    private final byte zzy()
    {
        if (this.zzh == this.zzf) {
            this.zzg(1);
        }
        byte v0_2 = this.zze;
        int v1_1 = this.zzh;
        this.zzh = (v1_1 + 1);
        return v0_2[v1_1];
    }

    private final int zzz()
    {
        int v0_0 = this.zzh;
        if ((this.zzf - v0_0) < 4) {
            this.zzg(4);
            v0_0 = this.zzh;
        }
        byte[] v1_2 = this.zze;
        this.zzh = (v0_0 + 4);
        return (((v1_2[(v0_0 + 3)] & 255) << 24) | (((v1_2[v0_0] & 255) | ((v1_2[(v0_0 + 1)] & 255) << 8)) | ((v1_2[(v0_0 + 2)] & 255) << 16)));
    }

    public final double zza()
    {
        return Double.longBitsToDouble(this.zzab());
    }

    public final float zzb()
    {
        return Float.intBitsToFloat(this.zzz());
    }

    public final int zzb(int p3)
    {
        if (p3 < null) {
            throw com.google.android.gms.internal.firebase-auth-api.zzall.zzf();
        } else {
            int v0_2 = ((this.zzj + this.zzh) + p3);
            if (v0_2 < 0) {
                throw com.google.android.gms.internal.firebase-auth-api.zzall.zzi();
            } else {
                com.google.android.gms.internal.firebase-auth-api.zzall v3_2 = this.zzk;
                if (v0_2 > v3_2) {
                    throw com.google.android.gms.internal.firebase-auth-api.zzall.zzj();
                } else {
                    this.zzk = v0_2;
                    this.zzad();
                    return v3_2;
                }
            }
        }
    }

    public final int zzc()
    {
        return (this.zzj + this.zzh);
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
        this.zzk = p1;
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
            if ((this.zzf - this.zzh) < 10) {
                while (v1 < 10) {
                    if (this.zzy() < 0) {
                        v1++;
                    }
                }
                throw com.google.android.gms.internal.firebase-auth-api.zzall.zze();
            } else {
                while (v1 < 10) {
                    com.google.android.gms.internal.firebase-auth-api.zzalo v6_4 = this.zze;
                    int v3_0 = this.zzh;
                    this.zzh = (v3_0 + 1);
                    if (v6_4[v3_0] < null) {
                        v1++;
                    }
                }
                throw com.google.android.gms.internal.firebase-auth-api.zzall.zze();
            }
            return 1;
        } else {
            if (v0_0 == 1) {
                this.zzh(8);
                return 1;
            } else {
                if (v0_0 == 2) {
                    this.zzh(this.zzaa());
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
                                this.zzh(4);
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
        com.google.android.gms.internal.firebase-auth-api.zzajv v0_0 = this.zzaa();
        int v2_2 = this.zzh;
        if ((v0_0 > (this.zzf - v2_2)) || (v0_0 <= null)) {
            if (v0_0 != null) {
                if (v0_0 < null) {
                    throw com.google.android.gms.internal.firebase-auth-api.zzall.zzf();
                } else {
                    java.util.Iterator v1_0 = this.zzj(v0_0);
                    if (v1_0 == null) {
                        java.util.Iterator v1_1 = this.zzh;
                        int v2_0 = this.zzf;
                        int v3 = (v2_0 - v1_1);
                        this.zzj = (this.zzj + v2_0);
                        this.zzh = 0;
                        this.zzf = 0;
                        int v4_3 = this.zzf((v0_0 - v3));
                        com.google.android.gms.internal.firebase-auth-api.zzajv v0_2 = new byte[v0_0];
                        System.arraycopy(this.zze, v1_1, v0_2, 0, v3);
                        java.util.Iterator v1_3 = v4_3.iterator();
                        while (v1_3.hasNext()) {
                            int v4_6 = ((byte[]) v1_3.next());
                            System.arraycopy(v4_6, 0, v0_2, v3, v4_6.length);
                            v3 += v4_6.length;
                        }
                        return com.google.android.gms.internal.firebase-auth-api.zzajv.zzb(v0_2);
                    } else {
                        return com.google.android.gms.internal.firebase-auth-api.zzajv.zza(v1_0);
                    }
                }
            } else {
                return com.google.android.gms.internal.firebase-auth-api.zzajv.zza;
            }
        } else {
            java.util.Iterator v1_6 = com.google.android.gms.internal.firebase-auth-api.zzajv.zza(this.zze, v2_2, v0_0);
            this.zzh = (this.zzh + v0_0);
            return v1_6;
        }
    }

    public final String zzr()
    {
        byte[] v0_0 = this.zzaa();
        if (v0_0 > null) {
            java.nio.charset.Charset v2_7 = this.zzh;
            if (v0_0 <= (this.zzf - v2_7)) {
                String v1_7 = new String(this.zze, v2_7, v0_0, com.google.android.gms.internal.firebase-auth-api.zzalh.zza);
                this.zzh = (this.zzh + v0_0);
                return v1_7;
            }
        }
        if (v0_0 != null) {
            if (v0_0 < null) {
                throw com.google.android.gms.internal.firebase-auth-api.zzall.zzf();
            } else {
                if (v0_0 > this.zzf) {
                    return new String(this.zza(v0_0, 0), com.google.android.gms.internal.firebase-auth-api.zzalh.zza);
                } else {
                    this.zzg(v0_0);
                    String v1_4 = new String(this.zze, this.zzh, v0_0, com.google.android.gms.internal.firebase-auth-api.zzalh.zza);
                    this.zzh = (this.zzh + v0_0);
                    return v1_4;
                }
            }
        } else {
            return "";
        }
    }

    public final String zzs()
    {
        byte[] v2_0;
        com.google.android.gms.internal.firebase-auth-api.zzall v0_0 = this.zzaa();
        int v1 = this.zzh;
        byte[] v2_1 = this.zzf;
        if ((v0_0 > (v2_1 - v1)) || (v0_0 <= null)) {
            if (v0_0 != null) {
                if (v0_0 < null) {
                    throw com.google.android.gms.internal.firebase-auth-api.zzall.zzf();
                } else {
                    v1 = 0;
                    if (v0_0 > v2_1) {
                        v2_0 = this.zza(v0_0, 0);
                    } else {
                        this.zzg(v0_0);
                        v2_0 = this.zze;
                        this.zzh = v0_0;
                    }
                }
            } else {
                return "";
            }
        } else {
            v2_0 = this.zze;
            this.zzh = (v1 + v0_0);
        }
        return com.google.android.gms.internal.firebase-auth-api.zzaoa.zzb(v2_0, v1, v0_0);
    }

    public final boolean zzw()
    {
        if ((this.zzh != this.zzf) || (this.zzi(1))) {
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
