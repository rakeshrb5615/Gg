package com.google.android.recaptcha.internal;
final class zzlg extends com.google.android.recaptcha.internal.zzli {
    private final java.io.InputStream zze;
    private final byte[] zzf;
    private int zzg;
    private int zzh;
    private int zzi;
    private int zzj;
    private int zzk;
    private int zzl;

    public synthetic zzlg(java.io.InputStream p1, int p2, com.google.android.recaptcha.internal.zzlh p3)
    {
        super(0);
        super.zzl = 2147483647;
        super.zze = p1;
        int v1_2 = new byte[4096];
        super.zzf = v1_2;
        super.zzg = 0;
        super.zzi = 0;
        super.zzk = 0;
        return;
    }

    private final java.util.List zzJ(int p7)
    {
        String v0_1 = new java.util.ArrayList();
        while (p7 > null) {
            int v1_1 = Math.min(p7, 4096);
            byte[] v2 = new byte[v1_1];
            int v3 = 0;
            while (v3 < v1_1) {
                int v4_1 = this.zze.read(v2, v3, (v1_1 - v3));
                if (v4_1 == -1) {
                    throw new com.google.android.recaptcha.internal.zznn("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                } else {
                    this.zzk = (this.zzk + v4_1);
                    v3 += v4_1;
                }
            }
            p7 -= v1_1;
            v0_1.add(v2);
        }
        return v0_1;
    }

    private final void zzK()
    {
        int v0_2 = (this.zzg + this.zzh);
        this.zzg = v0_2;
        int v1_3 = (this.zzk + v0_2);
        int v2 = this.zzl;
        if (v1_3 <= v2) {
            this.zzh = 0;
            return;
        } else {
            int v1_1 = (v1_3 - v2);
            this.zzh = v1_1;
            this.zzg = (v0_2 - v1_1);
            return;
        }
    }

    private final void zzL(int p3)
    {
        if (this.zzM(p3)) {
            return;
        } else {
            if (p3 <= ((2147483647 - this.zzk) - this.zzi)) {
                throw new com.google.android.recaptcha.internal.zznn("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            } else {
                throw new com.google.android.recaptcha.internal.zznn("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
            }
        }
    }

    private final boolean zzM(int p8)
    {
        int v0_0 = this.zzi;
        StringBuilder v2_0 = this.zzg;
        if ((v0_0 + p8) <= v2_0) {
            throw new IllegalStateException(v1.a.j("refillBuffer() called when ", p8, " bytes were already available in buffer"));
        } else {
            int v1_1 = this.zzk;
            if (p8 <= ((2147483647 - v1_1) - v0_0)) {
                if (((v1_1 + v0_0) + p8) <= this.zzl) {
                    if (v0_0 > 0) {
                        if (v2_0 > v0_0) {
                            System.arraycopy(this.zzf, v0_0, this.zzf, 0, (v2_0 - v0_0));
                        }
                        v1_1 = (this.zzk + v0_0);
                        this.zzk = v1_1;
                        v2_0 = (this.zzg - v0_0);
                        this.zzg = v2_0;
                        this.zzi = 0;
                    }
                    try {
                        int v0_3 = this.zze.read(this.zzf, v2_0, Math.min((4096 - v2_0), ((2147483647 - v1_1) - v2_0)));
                    } catch (boolean v8_1) {
                        v8_1.zza();
                        throw v8_1;
                    }
                    if ((v0_3 == 0) || ((v0_3 < -1) || (v0_3 > 4096))) {
                        boolean v8_4 = String.valueOf(this.zze.getClass());
                        StringBuilder v2_4 = new StringBuilder();
                        v2_4.append(v8_4);
                        v2_4.append("#read(byte[]) returned invalid result: ");
                        v2_4.append(v0_3);
                        v2_4.append("\nThe InputStream implementation is buggy.");
                        throw new IllegalStateException(v2_4.toString());
                    } else {
                        if (v0_3 <= 0) {
                            return 0;
                        } else {
                            this.zzg = (this.zzg + v0_3);
                            this.zzK();
                            if (this.zzg < p8) {
                                return this.zzM(p8);
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

    private final byte[] zzN(int p5, boolean p6)
    {
        java.util.Iterator v6_0 = this.zzO(p5);
        if (v6_0 == null) {
            java.util.Iterator v6_2 = this.zzi;
            int v0_0 = this.zzg;
            int v1 = (v0_0 - v6_2);
            this.zzk = (this.zzk + v0_0);
            this.zzi = 0;
            this.zzg = 0;
            byte[] v2_1 = this.zzJ((p5 - v1));
            byte[] v5_1 = new byte[p5];
            System.arraycopy(this.zzf, v6_2, v5_1, 0, v1);
            java.util.Iterator v6_1 = v2_1.iterator();
            while (v6_1.hasNext()) {
                byte[] v2_4 = ((byte[]) v6_1.next());
                int v3_1 = v2_4.length;
                System.arraycopy(v2_4, 0, v5_1, v1, v3_1);
                v1 += v3_1;
            }
            return v5_1;
        } else {
            return v6_0;
        }
    }

    private final byte[] zzO(int p7)
    {
        if (p7 != null) {
            int v0_0 = this.zzk;
            byte[] v1_0 = this.zzi;
            int v2_5 = ((v0_0 + v1_0) + p7);
            if ((-2147483647 + v2_5) > 0) {
                throw new com.google.android.recaptcha.internal.zznn("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
            } else {
                int v3_0 = this.zzl;
                if (v2_5 > v3_0) {
                    this.zzB(((v3_0 - v0_0) - v1_0));
                    throw new com.google.android.recaptcha.internal.zznn("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                } else {
                    int v0_2 = (this.zzg - v1_0);
                    byte[] v1_1 = (p7 - v0_2);
                    try {
                        if ((v1_1 >= 4096) && (v1_1 > this.zze.available())) {
                            return 0;
                        } else {
                            byte[] v1_2 = new byte[p7];
                            System.arraycopy(this.zzf, this.zzi, v1_2, 0, v0_2);
                            this.zzk = (this.zzk + this.zzg);
                            this.zzi = 0;
                            this.zzg = 0;
                            while (v0_2 < p7) {
                                try {
                                    int v2_9 = this.zze.read(v1_2, v0_2, (p7 - v0_2));
                                } catch (com.google.android.recaptcha.internal.zznn v7_6) {
                                    v7_6.zza();
                                    throw v7_6;
                                }
                                if (v2_9 == -1) {
                                    throw new com.google.android.recaptcha.internal.zznn("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                } else {
                                    this.zzk = (this.zzk + v2_9);
                                    v0_2 += v2_9;
                                }
                            }
                            return v1_2;
                        }
                    } catch (com.google.android.recaptcha.internal.zznn v7_4) {
                        v7_4.zza();
                        throw v7_4;
                    }
                }
            }
        } else {
            return com.google.android.recaptcha.internal.zznl.zzb;
        }
    }

    public final void zzA(int p1)
    {
        this.zzl = p1;
        this.zzK();
        return;
    }

    public final void zzB(int p9)
    {
        int v1_0 = this.zzi;
        int v0_2 = (this.zzg - v1_0);
        if ((p9 <= v0_2) && (p9 >= null)) {
            this.zzi = (v1_0 + p9);
            return;
        } else {
            if (p9 < null) {
                throw new com.google.android.recaptcha.internal.zznn("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            } else {
                int v2_0 = this.zzk;
                int v3_0 = (v2_0 + v1_0);
                long v4_0 = this.zzl;
                if ((v3_0 + p9) > v4_0) {
                    this.zzB(((v4_0 - v2_0) - v1_0));
                    throw new com.google.android.recaptcha.internal.zznn("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                } else {
                    this.zzk = v3_0;
                    this.zzg = 0;
                    this.zzi = 0;
                    while (v0_2 < p9) {
                        int v2_2 = ((long) (p9 - v0_2));
                        long v4_3 = this.zze.skip(v2_2);
                        int v1_3 = v4_3 cmp 0;
                        if ((v1_3 < 0) || (v4_3 > v2_2)) {
                            int v1_6 = String.valueOf(this.zze.getClass());
                            int v2_5 = new StringBuilder();
                            v2_5.append(v1_6);
                            v2_5.append("#skip returned invalid result: ");
                            v2_5.append(v4_3);
                            v2_5.append("\nThe InputStream implementation is buggy.");
                            throw new IllegalStateException(v2_5.toString());
                        } else {
                            if (v1_3 == 0) {
                                break;
                            }
                            v0_2 += ((int) v4_3);
                        }
                    }
                    this.zzk = (this.zzk + v0_2);
                    this.zzK();
                    if (v0_2 < p9) {
                        int v0_4 = this.zzg;
                        int v1_17 = (v0_4 - this.zzi);
                        this.zzi = v0_4;
                        this.zzL(1);
                        while(true) {
                            int v2_6 = (p9 - v1_17);
                            int v3_1 = this.zzg;
                            if (v2_6 <= v3_1) {
                                break;
                            }
                            v1_17 += v3_1;
                            this.zzi = v3_1;
                            this.zzL(1);
                        }
                        this.zzi = v2_6;
                    }
                    return;
                }
            }
        }
    }

    public final boolean zzC()
    {
        if ((this.zzi != this.zzg) || (this.zzM(1))) {
            return 0;
        } else {
            return 1;
        }
    }

    public final boolean zzD()
    {
        if (this.zzr() == 0) {
            return 0;
        } else {
            return 1;
        }
    }

    public final boolean zzE(int p7)
    {
        String v0_0 = (p7 & 7);
        int v1 = 0;
        if (v0_0 == null) {
            if ((this.zzg - this.zzi) < 10) {
                while (v1 < 10) {
                    if (this.zza() < 0) {
                        v1++;
                    }
                }
                throw new com.google.android.recaptcha.internal.zznn("CodedInputStream encountered a malformed varint.");
            } else {
                while (v1 < 10) {
                    com.google.android.recaptcha.internal.zznm v7_6 = this.zzf;
                    int v4_0 = this.zzi;
                    this.zzi = (v4_0 + 1);
                    if (v7_6[v4_0] < null) {
                        v1++;
                    }
                }
                throw new com.google.android.recaptcha.internal.zznn("CodedInputStream encountered a malformed varint.");
            }
            return 1;
        } else {
            if (v0_0 == 1) {
                this.zzB(8);
                return 1;
            } else {
                if (v0_0 == 2) {
                    this.zzB(this.zzj());
                    return 1;
                } else {
                    if (v0_0 == 3) {
                        this.zzI();
                        this.zzz((((p7 >> 3) << 3) | 4));
                        return 1;
                    } else {
                        if (v0_0 == 4) {
                            return 0;
                        } else {
                            if (v0_0 != 5) {
                                throw new com.google.android.recaptcha.internal.zznm("Protocol message tag had invalid wire type.");
                            } else {
                                this.zzB(4);
                                return 1;
                            }
                        }
                    }
                }
            }
        }
    }

    public final byte zza()
    {
        if (this.zzi == this.zzg) {
            this.zzL(1);
        }
        byte v0_2 = this.zzf;
        int v1_1 = this.zzi;
        this.zzi = (v1_1 + 1);
        return v0_2[v1_1];
    }

    public final double zzb()
    {
        return Double.longBitsToDouble(this.zzq());
    }

    public final float zzc()
    {
        return Float.intBitsToFloat(this.zzi());
    }

    public final int zzd()
    {
        return (this.zzk + this.zzi);
    }

    public final int zze(int p3)
    {
        if (p3 < null) {
            throw new com.google.android.recaptcha.internal.zznn("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        } else {
            String v0_5 = ((this.zzk + this.zzi) + p3);
            if (v0_5 < null) {
                throw new com.google.android.recaptcha.internal.zznn("Failed to parse the message.");
            } else {
                com.google.android.recaptcha.internal.zznn v3_4 = this.zzl;
                if (v0_5 > v3_4) {
                    throw new com.google.android.recaptcha.internal.zznn("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                } else {
                    this.zzl = v0_5;
                    this.zzK();
                    return v3_4;
                }
            }
        }
    }

    public final int zzf()
    {
        return this.zzj();
    }

    public final int zzg()
    {
        return this.zzi();
    }

    public final int zzh()
    {
        return this.zzj();
    }

    public final int zzi()
    {
        int v0_0 = this.zzi;
        if ((this.zzg - v0_0) < 4) {
            this.zzL(4);
            v0_0 = this.zzi;
        }
        int v1_5 = this.zzf;
        this.zzi = (v0_0 + 4);
        return (((v1_5[(v0_0 + 3)] & 255) << 24) | ((((v1_5[(v0_0 + 1)] & 255) << 8) | (v1_5[v0_0] & 255)) | ((v1_5[(v0_0 + 2)] & 255) << 16)));
    }

    public final int zzj()
    {
        byte v0_0 = this.zzi;
        int v1_0 = this.zzg;
        if (v1_0 != v0_0) {
            byte v2_0 = this.zzf;
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
                                            this.zzi = v1_1;
                                            return v0_1;
                                        } else {
                                            v3_3 = (v0_0 + 8);
                                            if (v2_0[v4_0] < 0) {
                                                v4_0 = (v0_0 + 9);
                                                if (v2_0[v3_3] >= 0) {
                                                } else {
                                                    if (v2_0[v4_0] >= 0) {
                                                        v1_1 = (v0_0 + 10);
                                                        v0_1 = v1_7;
                                                        this.zzi = v1_1;
                                                        return v0_1;
                                                    } else {
                                                        return ((int) this.zzs());
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    v0_1 = v1_7;
                                    v1_1 = v3_3;
                                    this.zzi = v1_1;
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
                    this.zzi = v1_1;
                    return v0_1;
                }
            } else {
                this.zzi = v3_6;
                return v4_5;
            }
        }
        return ((int) this.zzs());
    }

    public final int zzk()
    {
        return this.zzi();
    }

    public final int zzl()
    {
        return com.google.android.recaptcha.internal.zzli.zzF(this.zzj());
    }

    public final int zzm()
    {
        if (!this.zzC()) {
            com.google.android.recaptcha.internal.zznn v0_3 = this.zzj();
            this.zzj = v0_3;
            if ((v0_3 >> 3) == 0) {
                throw new com.google.android.recaptcha.internal.zznn("Protocol message contained an invalid tag (zero).");
            } else {
                return v0_3;
            }
        } else {
            this.zzj = 0;
            return 0;
        }
    }

    public final int zzn()
    {
        return this.zzj();
    }

    public final long zzo()
    {
        return this.zzq();
    }

    public final long zzp()
    {
        return this.zzr();
    }

    public final long zzq()
    {
        long v0_0 = this;
        int v1 = this.zzi;
        if ((this.zzg - v1) < 8) {
            v0_0 = this.zzL(8);
            v1 = v0_0.zzi;
        }
        long v2_6 = v0_0.zzf;
        v0_0.zzi = (v1 + 8);
        return ((((((long) v2_6[(v1 + 6)]) & 255) << 48) | ((((((((long) v2_6[v1]) & 255) | ((((long) v2_6[(v1 + 1)]) & 255) << 8)) | ((((long) v2_6[(v1 + 2)]) & 255) << 16)) | ((((long) v2_6[(v1 + 3)]) & 255) << 24)) | ((((long) v2_6[(v1 + 4)]) & 255) << 32)) | ((((long) v2_6[(v1 + 5)]) & 255) << 40))) | ((((long) v2_6[(v1 + 7)]) & 255) << 56));
    }

    public final long zzr()
    {
        long v0_0 = this.zzi;
        int v1_0 = this.zzg;
        if (v1_0 != v0_0) {
            long v2_0 = this.zzf;
            long v3_8 = (v0_0 + 1);
            int v4_3 = v2_0[v0_0];
            if (v4_3 < 0) {
                if ((v1_0 - v3_8) >= 9) {
                    long v2_1;
                    int v1_1 = (v0_0 + 2);
                    long v3_2 = ((v2_0[v3_8] << 7) ^ v4_3);
                    if (v3_2 >= 0) {
                        int v4_0 = (v0_0 + 3);
                        int v1_4 = ((v2_0[v1_1] << 14) ^ v3_2);
                        if (v1_4 < 0) {
                            long v3_3 = (v0_0 + 4);
                            int v1_5 = (v1_4 ^ (v2_0[v4_0] << 21));
                            if (v1_5 >= 0) {
                                v4_0 = (v0_0 + 5);
                                long v5_2 = ((((long) v2_0[v3_3]) << 28) ^ ((long) v1_5));
                                if (v5_2 < 0) {
                                    long v5_10;
                                    v1_1 = (v0_0 + 6);
                                    long v3_9 = ((((long) v2_0[v4_0]) << 35) ^ v5_2);
                                    if (v3_9 >= 0) {
                                        long v5_4 = (v0_0 + 7);
                                        long v3_10 = (v3_9 ^ (((long) v2_0[v1_1]) << 42));
                                        if (v3_10 < 0) {
                                            v1_1 = (v0_0 + 8);
                                            v3_9 = (v3_10 ^ (((long) v2_0[v5_4]) << 49));
                                            if (v3_9 >= 0) {
                                                v5_4 = (v0_0 + 9);
                                                long v3_12 = ((v3_9 ^ (((long) v2_0[v1_1]) << 56)) ^ 71499008037633920);
                                                if (v3_12 >= 0) {
                                                    v2_1 = v3_12;
                                                } else {
                                                    v1_1 = (v0_0 + 10);
                                                    if (((long) v2_0[v5_4]) < 0) {
                                                        return this.zzs();
                                                    } else {
                                                        v2_1 = v3_12;
                                                        this.zzi = v1_1;
                                                        return v2_1;
                                                    }
                                                }
                                            } else {
                                                v5_10 = -558586000294016;
                                                v2_1 = (v3_9 ^ v5_10);
                                                this.zzi = v1_1;
                                                return v2_1;
                                            }
                                        } else {
                                            v2_1 = (v3_10 ^ 4363953127296);
                                        }
                                        v1_1 = v5_4;
                                        this.zzi = v1_1;
                                        return v2_1;
                                    } else {
                                        v5_10 = -34093383808;
                                    }
                                } else {
                                    v2_1 = (v5_2 ^ 266354560);
                                }
                            } else {
                                v1_1 = v3_3;
                                v2_1 = ((long) (-2080896 ^ v1_5));
                                this.zzi = v1_1;
                                return v2_1;
                            }
                        } else {
                            v2_1 = ((long) (v1_4 ^ 16256));
                        }
                        v1_1 = v4_0;
                    } else {
                        v2_1 = ((long) (v3_2 ^ -128));
                    }
                    this.zzi = v1_1;
                    return v2_1;
                }
            } else {
                this.zzi = v3_8;
                return ((long) v4_3);
            }
        }
        return this.zzs();
    }

    public final long zzs()
    {
        int v0_0 = 0;
        String v1_0 = 0;
        while (v0_0 < 64) {
            int v3_2 = this.zza();
            v1_0 |= (((long) (v3_2 & 127)) << v0_0);
            if ((v3_2 & 128) != 0) {
                v0_0 += 7;
            } else {
                return v1_0;
            }
        }
        throw new com.google.android.recaptcha.internal.zznn("CodedInputStream encountered a malformed varint.");
    }

    public final long zzt()
    {
        return this.zzq();
    }

    public final long zzu()
    {
        return com.google.android.recaptcha.internal.zzli.zzG(this.zzr());
    }

    public final long zzv()
    {
        return this.zzr();
    }

    public final com.google.android.recaptcha.internal.zzle zzw()
    {
        byte[] v0_0 = this.zzj();
        int v2_3 = this.zzi;
        if ((v0_0 <= (this.zzg - v2_3)) && (v0_0 > null)) {
            com.google.android.recaptcha.internal.zzlc v1_9 = com.google.android.recaptcha.internal.zzle.zzk(this.zzf, v2_3, v0_0);
            this.zzi = (this.zzi + v0_0);
            return v1_9;
        } else {
            if (v0_0 != null) {
                if (v0_0 < null) {
                    throw new com.google.android.recaptcha.internal.zznn("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                } else {
                    com.google.android.recaptcha.internal.zzlc v1_2 = this.zzO(v0_0);
                    if (v1_2 == null) {
                        com.google.android.recaptcha.internal.zzlc v1_3 = this.zzi;
                        byte[] v3_0 = this.zzg;
                        int v4 = (v3_0 - v1_3);
                        this.zzk = (this.zzk + v3_0);
                        this.zzi = 0;
                        this.zzg = 0;
                        byte[] v3_2 = this.zzJ((v0_0 - v4));
                        byte[] v0_3 = new byte[v0_0];
                        System.arraycopy(this.zzf, v1_3, v0_3, 0, v4);
                        com.google.android.recaptcha.internal.zzlc v1_4 = v3_2.iterator();
                        while (v1_4.hasNext()) {
                            byte[] v3_5 = ((byte[]) v1_4.next());
                            int v5_3 = v3_5.length;
                            System.arraycopy(v3_5, 0, v0_3, v4, v5_3);
                            v4 += v5_3;
                        }
                        return new com.google.android.recaptcha.internal.zzlc(v0_3);
                    } else {
                        return com.google.android.recaptcha.internal.zzle.zzk(v1_2, 0, v1_2.length);
                    }
                }
            } else {
                return com.google.android.recaptcha.internal.zzle.zzb;
            }
        }
    }

    public final String zzx()
    {
        byte[] v0_0 = this.zzj();
        if (v0_0 > null) {
            java.nio.charset.Charset v2_4 = this.zzi;
            if (v0_0 <= (this.zzg - v2_4)) {
                int v3_0 = new String(this.zzf, v2_4, v0_0, com.google.android.recaptcha.internal.zznl.zza);
                this.zzi = (this.zzi + v0_0);
                return v3_0;
            }
        }
        if (v0_0 != null) {
            if (v0_0 < null) {
                throw new com.google.android.recaptcha.internal.zznn("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            } else {
                if (v0_0 > this.zzg) {
                    return new String(this.zzN(v0_0, 0), com.google.android.recaptcha.internal.zznl.zza);
                } else {
                    this.zzL(v0_0);
                    java.nio.charset.Charset v2_3 = new String(this.zzf, this.zzi, v0_0, com.google.android.recaptcha.internal.zznl.zza);
                    this.zzi = (this.zzi + v0_0);
                    return v2_3;
                }
            }
        } else {
            return "";
        }
    }

    public final String zzy()
    {
        byte[] v2_0;
        com.google.android.recaptcha.internal.zznn v0_0 = this.zzj();
        String v1_1 = this.zzi;
        byte[] v2_1 = this.zzg;
        if ((v0_0 > (v2_1 - v1_1)) || (v0_0 <= null)) {
            if (v0_0 != null) {
                if (v0_0 < null) {
                    throw new com.google.android.recaptcha.internal.zznn("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                } else {
                    v1_1 = 0;
                    if (v0_0 > v2_1) {
                        v2_0 = this.zzN(v0_0, 0);
                    } else {
                        this.zzL(v0_0);
                        v2_0 = this.zzf;
                        this.zzi = v0_0;
                    }
                }
            } else {
                return "";
            }
        } else {
            v2_0 = this.zzf;
            this.zzi = (v1_1 + v0_0);
        }
        return com.google.android.recaptcha.internal.zzpv.zzd(v2_0, v1_1, v0_0);
    }

    public final void zzz(int p2)
    {
        if (this.zzj != p2) {
            throw new com.google.android.recaptcha.internal.zznn("Protocol message end-group tag did not match expected tag.");
        } else {
            return;
        }
    }
}
