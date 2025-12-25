package com.google.android.gms.internal.fido;
 class zzcw extends com.google.android.gms.internal.fido.zzcv {
    protected final byte[] zza;

    public zzcw(byte[] p1)
    {
        p1.getClass();
        this.zza = p1;
        return;
    }

    public final boolean equals(Object p9)
    {
        if (p9 != this) {
            if ((p9 instanceof com.google.android.gms.internal.fido.zzcz)) {
                if (this.zzd() == ((com.google.android.gms.internal.fido.zzcz) p9).zzd()) {
                    if (this.zzd() != 0) {
                        if (!(p9 instanceof com.google.android.gms.internal.fido.zzcw)) {
                            return p9.equals(this);
                        } else {
                            int v1_3 = this.zzk();
                            String v3_1 = ((com.google.android.gms.internal.fido.zzcw) p9).zzk();
                            if ((v1_3 != 0) && ((v3_1 != null) && (v1_3 != v3_1))) {
                                return 0;
                            } else {
                                int v1_4 = this.zzd();
                                if (v1_4 > ((com.google.android.gms.internal.fido.zzcw) p9).zzd()) {
                                    IllegalArgumentException v0_1 = this.zzd();
                                    String v2_2 = new StringBuilder("Length too large: ");
                                    v2_2.append(v1_4);
                                    v2_2.append(v0_1);
                                    throw new IllegalArgumentException(v2_2.toString());
                                } else {
                                    if (v1_4 > ((com.google.android.gms.internal.fido.zzcw) p9).zzd()) {
                                        throw new IllegalArgumentException(v1.a.i("Ran off end of other: 0, ", v1_4, ((com.google.android.gms.internal.fido.zzcw) p9).zzd(), ", "));
                                    } else {
                                        String v3_6 = this.zza;
                                        byte[] v4 = ((com.google.android.gms.internal.fido.zzcw) p9).zza;
                                        int v5_1 = (this.zzc() + v1_4);
                                        int v1_6 = this.zzc();
                                        int v9_7 = ((com.google.android.gms.internal.fido.zzcw) p9).zzc();
                                        while (v1_6 < v5_1) {
                                            if (v3_6[v1_6] == v4[v9_7]) {
                                                v1_6++;
                                                v9_7++;
                                            } else {
                                                return 0;
                                            }
                                        }
                                        return 1;
                                    }
                                }
                            }
                        }
                    } else {
                        return 1;
                    }
                } else {
                    return 0;
                }
            } else {
                return 0;
            }
        } else {
            return 1;
        }
    }

    public byte zza(int p2)
    {
        return this.zza[p2];
    }

    public byte zzb(int p2)
    {
        return this.zza[p2];
    }

    public int zzc()
    {
        return 0;
    }

    public int zzd()
    {
        return this.zza.length;
    }

    public void zze(byte[] p1, int p2, int p3, int p4)
    {
        System.arraycopy(this.zza, 0, p1, 0, p4);
        return;
    }

    public final int zzf(int p4, int p5, int p6)
    {
        p5 = this.zza;
        int v0 = this.zzc();
        int v1 = v0;
        while (v1 < (v0 + p6)) {
            p4 = ((p4 * 31) + p5[v1]);
            v1++;
        }
        return p4;
    }

    public final com.google.android.gms.internal.fido.zzcz zzg(int p4, int p5)
    {
        int v5_1 = com.google.android.gms.internal.fido.zzcz.zzj(p4, p5, this.zzd());
        if (v5_1 != 0) {
            return new com.google.android.gms.internal.fido.zzct(this.zza, (this.zzc() + p4), v5_1);
        } else {
            return com.google.android.gms.internal.fido.zzcz.zzb;
        }
    }

    public final java.io.InputStream zzh()
    {
        return new java.io.ByteArrayInputStream(this.zza, this.zzc(), this.zzd());
    }

    public final java.nio.ByteBuffer zzi()
    {
        return java.nio.ByteBuffer.wrap(this.zza, this.zzc(), this.zzd()).asReadOnlyBuffer();
    }
}
