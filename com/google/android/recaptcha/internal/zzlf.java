package com.google.android.recaptcha.internal;
final class zzlf extends com.google.android.recaptcha.internal.zzli {
    private final byte[] zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private int zzi;
    private int zzj;

    public synthetic zzlf(byte[] p1, int p2, int p3, boolean p4, com.google.android.recaptcha.internal.zzlh p5)
    {
        super(0);
        super.zzj = 2147483647;
        super.zze = p1;
        super.zzf = 0;
        super.zzh = 0;
        return;
    }

    private final void zzJ()
    {
        int v0_2 = (this.zzf + this.zzg);
        this.zzf = v0_2;
        int v1_1 = this.zzj;
        if (v0_2 <= v1_1) {
            this.zzg = 0;
            return;
        } else {
            int v1_2 = (v0_2 - v1_1);
            this.zzg = v1_2;
            this.zzf = (v0_2 - v1_2);
            return;
        }
    }

    public final void zzA(int p1)
    {
        this.zzj = p1;
        this.zzJ();
        return;
    }

    public final void zzB(int p3)
    {
        if (p3 >= null) {
            int v1_0 = this.zzh;
            if (p3 <= (this.zzf - v1_0)) {
                this.zzh = (v1_0 + p3);
                return;
            }
        }
        if (p3 >= null) {
            throw new com.google.android.recaptcha.internal.zznn("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        } else {
            throw new com.google.android.recaptcha.internal.zznn("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
    }

    public final boolean zzC()
    {
        if (this.zzh != this.zzf) {
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
            if ((this.zzf - this.zzh) < 10) {
                while (v1 < 10) {
                    if (this.zza() < 0) {
                        v1++;
                    }
                }
                throw new com.google.android.recaptcha.internal.zznn("CodedInputStream encountered a malformed varint.");
            } else {
                while (v1 < 10) {
                    com.google.android.recaptcha.internal.zznm v7_6 = this.zze;
                    int v4_0 = this.zzh;
                    this.zzh = (v4_0 + 1);
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
        com.google.android.recaptcha.internal.zznn v0_0 = this.zzh;
        if (v0_0 == this.zzf) {
            throw new com.google.android.recaptcha.internal.zznn("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        } else {
            String v1_2 = this.zze;
            this.zzh = (v0_0 + 1);
            return v1_2[v0_0];
        }
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
        return this.zzh;
    }

    public final int zze(int p2)
    {
        if (p2 < null) {
            throw new com.google.android.recaptcha.internal.zznn("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        } else {
            com.google.android.recaptcha.internal.zznn v2_6 = (p2 + this.zzh);
            if (v2_6 < null) {
                throw new com.google.android.recaptcha.internal.zznn("Failed to parse the message.");
            } else {
                String v0_0 = this.zzj;
                if (v2_6 > v0_0) {
                    throw new com.google.android.recaptcha.internal.zznn("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                } else {
                    this.zzj = v2_6;
                    this.zzJ();
                    return v0_0;
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
        com.google.android.recaptcha.internal.zznn v0_0 = this.zzh;
        if ((this.zzf - v0_0) < 4) {
            throw new com.google.android.recaptcha.internal.zznn("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        } else {
            String v1_6 = this.zze;
            this.zzh = (v0_0 + 4);
            return (((v1_6[(v0_0 + 3)] & 255) << 24) | ((((v1_6[(v0_0 + 1)] & 255) << 8) | (v1_6[v0_0] & 255)) | ((v1_6[(v0_0 + 2)] & 255) << 16)));
        }
    }

    public final int zzj()
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
                                                    if (v2_0[v4_0] >= 0) {
                                                        v1_1 = (v0_0 + 10);
                                                        v0_1 = v1_7;
                                                        this.zzh = v1_1;
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
            this.zzi = v0_3;
            if ((v0_3 >> 3) == 0) {
                throw new com.google.android.recaptcha.internal.zznn("Protocol message contained an invalid tag (zero).");
            } else {
                return v0_3;
            }
        } else {
            this.zzi = 0;
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
        String v1_0 = this.zzh;
        if ((this.zzf - v1_0) < 8) {
            throw new com.google.android.recaptcha.internal.zznn("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        } else {
            long v2_0 = this.zze;
            this.zzh = (v1_0 + 8);
            return ((((((long) v2_0[(v1_0 + 6)]) & 255) << 48) | ((((((((long) v2_0[v1_0]) & 255) | ((((long) v2_0[(v1_0 + 1)]) & 255) << 8)) | ((((long) v2_0[(v1_0 + 2)]) & 255) << 16)) | ((((long) v2_0[(v1_0 + 3)]) & 255) << 24)) | ((((long) v2_0[(v1_0 + 4)]) & 255) << 32)) | ((((long) v2_0[(v1_0 + 5)]) & 255) << 40))) | ((((long) v2_0[(v1_0 + 7)]) & 255) << 56));
        }
    }

    public final long zzr()
    {
        long v0_0 = this.zzh;
        int v1_0 = this.zzf;
        if (v1_0 != v0_0) {
            long v2_0 = this.zze;
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
                                                        this.zzh = v1_1;
                                                        return v2_1;
                                                    }
                                                }
                                            } else {
                                                v5_10 = -558586000294016;
                                                v2_1 = (v3_9 ^ v5_10);
                                                this.zzh = v1_1;
                                                return v2_1;
                                            }
                                        } else {
                                            v2_1 = (v3_10 ^ 4363953127296);
                                        }
                                        v1_1 = v5_4;
                                        this.zzh = v1_1;
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
                                this.zzh = v1_1;
                                return v2_1;
                            }
                        } else {
                            v2_1 = ((long) (v1_4 ^ 16256));
                        }
                        v1_1 = v4_0;
                    } else {
                        v2_1 = ((long) (v3_2 ^ -128));
                    }
                    this.zzh = v1_1;
                    return v2_1;
                }
            } else {
                this.zzh = v3_8;
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
        com.google.android.recaptcha.internal.zznn v0_0 = this.zzj();
        if (v0_0 > null) {
            int v2_3 = this.zzh;
            if (v0_0 <= (this.zzf - v2_3)) {
                String v1_10 = com.google.android.recaptcha.internal.zzle.zzk(this.zze, v2_3, v0_0);
                this.zzh = (this.zzh + v0_0);
                return v1_10;
            }
        }
        if (v0_0 == null) {
            return com.google.android.recaptcha.internal.zzle.zzb;
        } else {
            if (v0_0 > null) {
                int v2_2 = this.zzh;
                if (v0_0 <= (this.zzf - v2_2)) {
                    com.google.android.recaptcha.internal.zznn v0_2 = (v0_0 + v2_2);
                    this.zzh = v0_2;
                    return new com.google.android.recaptcha.internal.zzlc(java.util.Arrays.copyOfRange(this.zze, v2_2, v0_2));
                }
            }
            if (v0_0 > null) {
                throw new com.google.android.recaptcha.internal.zznn("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            } else {
                throw new com.google.android.recaptcha.internal.zznn("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            }
        }
    }

    public final String zzx()
    {
        com.google.android.recaptcha.internal.zznn v0_0 = this.zzj();
        if (v0_0 > null) {
            int v2 = this.zzh;
            if (v0_0 <= (this.zzf - v2)) {
                String v3_0 = new String(this.zze, v2, v0_0, com.google.android.recaptcha.internal.zznl.zza);
                this.zzh = (this.zzh + v0_0);
                return v3_0;
            }
        }
        if (v0_0 != null) {
            if (v0_0 >= null) {
                throw new com.google.android.recaptcha.internal.zznn("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            } else {
                throw new com.google.android.recaptcha.internal.zznn("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            }
        } else {
            return "";
        }
    }

    public final String zzy()
    {
        com.google.android.recaptcha.internal.zznn v0_0 = this.zzj();
        if (v0_0 > null) {
            int v2_2 = this.zzh;
            if (v0_0 <= (this.zzf - v2_2)) {
                String v1_5 = com.google.android.recaptcha.internal.zzpv.zzd(this.zze, v2_2, v0_0);
                this.zzh = (this.zzh + v0_0);
                return v1_5;
            }
        }
        if (v0_0 != null) {
            if (v0_0 > null) {
                throw new com.google.android.recaptcha.internal.zznn("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            } else {
                throw new com.google.android.recaptcha.internal.zznn("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            }
        } else {
            return "";
        }
    }

    public final void zzz(int p2)
    {
        if (this.zzi != p2) {
            throw new com.google.android.recaptcha.internal.zznn("Protocol message end-group tag did not match expected tag.");
        } else {
            return;
        }
    }
}
