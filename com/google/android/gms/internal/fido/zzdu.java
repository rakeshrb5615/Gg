package com.google.android.gms.internal.fido;
public final class zzdu implements java.io.Closeable {
    private final java.io.InputStream zza;
    private com.google.android.gms.internal.fido.zzdt zzb;
    private final byte[] zzc;
    private final com.google.android.gms.internal.fido.zzdv zzd;

    public zzdu(java.io.InputStream p2)
    {
        com.google.android.gms.internal.fido.zzdv v0_1 = new byte[8];
        this.zzc = v0_1;
        this.zzd = com.google.android.gms.internal.fido.zzdv.zza();
        this.zza = p2;
        return;
    }

    private final long zzh()
    {
        if (this.zzb.zza() >= 24) {
            String v4_0 = 255;
            if (this.zzb.zza() != 24) {
                if (this.zzb.zza() != 25) {
                    if (this.zzb.zza() != 26) {
                        if (this.zzb.zza() != 27) {
                            throw new java.io.IOException(v1.a.i("invalid additional information ", this.zzb.zza(), this.zzb.zzc(), " for major type "));
                        } else {
                            java.io.IOException v1_33 = this.zzk(this.zzc, 8).zzc;
                            return ((((long) v1_33[7]) & 255) | (((((((((long) v1_33[2]) & 255) << 40) | (((((long) v1_33[0]) & 255) << 56) | ((((long) v1_33[1]) & 255) << 48))) | ((((long) v1_33[3]) & 255) << 32)) | ((((long) v1_33[4]) & 255) << 24)) | ((((long) v1_33[5]) & 255) << 16)) | ((((long) v1_33[6]) & 255) << 8)));
                        }
                    } else {
                        java.io.IOException v1_4 = this.zzk(this.zzc, 4).zzc;
                        return ((((long) v1_4[3]) & 255) | ((((((long) v1_4[1]) & 255) << 16) | ((((long) v1_4[0]) & 255) << 24)) | ((((long) v1_4[2]) & 255) << 8)));
                    }
                } else {
                    java.io.IOException v1_11 = this.zzk(this.zzc, 2).zzc;
                    return (((((long) v1_11[0]) & v4_0) << 8) | (((long) v1_11[1]) & v4_0));
                }
            } else {
                java.io.IOException v1_18 = this.zza.read();
                if (v1_18 == -1) {
                    throw new java.io.EOFException();
                } else {
                    this.zzb = 0;
                    return (((long) v1_18) & 255);
                }
            }
        } else {
            int v3_4 = ((long) this.zzb.zza());
            this.zzb = 0;
            return v3_4;
        }
    }

    private final void zzi()
    {
        this.zzd();
        if (this.zzb.zza() == 31) {
            throw new IllegalStateException(g2.g.c(this.zzb.zza(), "expected definite length but found "));
        } else {
            return;
        }
    }

    private final void zzj(byte p5)
    {
        this.zzd();
        if (this.zzb.zzb() != p5) {
            throw new IllegalStateException(v1.a.i("expected major type ", ((p5 >> 5) & 7), this.zzb.zzc(), " but found "));
        } else {
            return;
        }
    }

    private final void zzk(byte[] p4, int p5)
    {
        int v0 = 0;
        while (v0 != p5) {
            int v1_1 = this.zza.read(p4, v0, (p5 - v0));
            if (v1_1 == -1) {
                throw new java.io.EOFException();
            } else {
                v0 += v1_1;
            }
        }
        this.zzb = 0;
        return;
    }

    private final byte[] zzl()
    {
        this.zzi();
        java.io.EOFException v0_2 = this.zzh();
        if ((v0_2 < 0) || (v0_2 > 2147483647)) {
            throw new UnsupportedOperationException("the maximum supported byte/text string length is 2147483647 bytes");
        } else {
            if (((long) this.zza.available()) < v0_2) {
                throw new java.io.EOFException();
            } else {
                java.io.EOFException v0_4 = ((int) v0_2);
                byte[] v1_1 = new byte[v0_4];
                this.zzk(v1_1, v0_4);
                return v1_1;
            }
        }
    }

    public final void close()
    {
        this.zza.close();
        this.zzd.zzb();
        return;
    }

    public final long zza()
    {
        this.zzj(-128);
        this.zzi();
        UnsupportedOperationException v0_2 = this.zzh();
        com.google.android.gms.internal.fido.zzdv v2_2 = v0_2 cmp 0;
        if (v2_2 < null) {
            throw new UnsupportedOperationException("the maximum supported array length is 9223372036854775807");
        } else {
            if (v2_2 > null) {
                this.zzd.zzg(v0_2);
            }
            return v0_2;
        }
    }

    public final long zzb()
    {
        String v0_3;
        this.zzd();
        if (this.zzb.zzb() != 0) {
            if (this.zzb.zzb() != 32) {
                throw new IllegalStateException(g2.g.c(this.zzb.zzc(), "expected major type 0 or 1 but found "));
            } else {
                v0_3 = 0;
            }
        } else {
            v0_3 = 1;
        }
        String v1_3 = this.zzh();
        if (v1_3 < 0) {
            throw new UnsupportedOperationException("the maximum supported unsigned/negative integer is 9223372036854775807");
        } else {
            if (v0_3 == null) {
                return (~ v1_3);
            } else {
                return v1_3;
            }
        }
    }

    public final long zzc()
    {
        this.zzj(-96);
        this.zzi();
        UnsupportedOperationException v0_3 = this.zzh();
        com.google.android.gms.internal.fido.zzdv v2_2 = v0_3 cmp 0;
        if ((v2_2 < null) || (v0_3 > 4611686018427387903)) {
            throw new UnsupportedOperationException("the maximum supported map length is 4611686018427387903L");
        } else {
            if (v2_2 > null) {
                this.zzd.zzg((v0_3 + v0_3));
            }
            return v0_3;
        }
    }

    public final com.google.android.gms.internal.fido.zzdt zzd()
    {
        if (this.zzb == null) {
            IllegalStateException v0_9 = this.zza.read();
            if (v0_9 != -1) {
                String v1_15 = new com.google.android.gms.internal.fido.zzdt(v0_9);
                this.zzb = v1_15;
                IllegalStateException v0_1 = v1_15.zzb();
                if ((v0_1 == -128) || ((v0_1 == -96) || (v0_1 == -64))) {
                    this.zzd.zzd();
                } else {
                    if (v0_1 == -32) {
                        if (this.zzb.zza() != 31) {
                        } else {
                            this.zzd.zzc();
                            return this.zzb;
                        }
                    } else {
                        if ((v0_1 == null) || (v0_1 == 32)) {
                        } else {
                            if (v0_1 == 64) {
                                this.zzd.zze(-1);
                            } else {
                                if (v0_1 != 96) {
                                    throw new IllegalStateException(g2.g.c(this.zzb.zzc(), "invalid major type: "));
                                } else {
                                    this.zzd.zze(-2);
                                }
                            }
                        }
                    }
                }
                this.zzd.zzf();
            } else {
                this.zzd.zzb();
                return 0;
            }
        }
        return this.zzb;
    }

    public final String zze()
    {
        this.zzj(96);
        return new String(this.zzl(), java.nio.charset.StandardCharsets.UTF_8);
    }

    public final boolean zzf()
    {
        this.zzj(-32);
        if (this.zzb.zza() > 24) {
            throw new IllegalStateException("expected simple value");
        } else {
            IllegalStateException v0_2 = ((int) this.zzh());
            if (v0_2 != 20) {
                if (v0_2 != 21) {
                    throw new IllegalStateException("expected FALSE or TRUE");
                } else {
                    return 1;
                }
            } else {
                return 0;
            }
        }
    }

    public final byte[] zzg()
    {
        this.zzj(64);
        return this.zzl();
    }
}
