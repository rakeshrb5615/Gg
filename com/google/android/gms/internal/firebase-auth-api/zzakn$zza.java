package com.google.android.gms.internal.firebase-auth-api;
final class zzakn$zza extends com.google.android.gms.internal.firebase-auth-api.zzakn {
    private final byte[] zzb;
    private final int zzc;
    private int zzd;

    public zzakn$zza(byte[] p3, int p4, int p5)
    {
        super(0);
        if (p3 == null) {
            throw new NullPointerException("buffer");
        } else {
            if (((p3.length - p5) | p5) < 0) {
                throw new IllegalArgumentException(v1.a.i("Array range is invalid. Buffer.length=", p3.length, p5, ", offset=0, length="));
            } else {
                super.zzb = p3;
                super.zzd = 0;
                super.zzc = p5;
                return;
            }
        }
    }

    private final void zzc(byte[] p3, int p4, int p5)
    {
        try {
            System.arraycopy(p3, p4, this.zzb, this.zzd, p5);
            this.zzd = (this.zzd + p5);
            return;
        } catch (IndexOutOfBoundsException v3_3) {
            throw new com.google.android.gms.internal.firebase-auth-api.zzakn$zzd(this.zzd, this.zzc, p5, v3_3);
        }
    }

    public final int zza()
    {
        return (this.zzc - this.zzd);
    }

    public final void zza(byte p5)
    {
        int v0 = this.zzd;
        try {
            int v2_1 = (v0 + 1);
            try {
                this.zzb[v0] = p5;
                this.zzd = v2_1;
                return;
            } catch (IndexOutOfBoundsException v5_1) {
                v0 = v2_1;
                throw new com.google.android.gms.internal.firebase-auth-api.zzakn$zzd(v0, this.zzc, 1, v5_1);
            }
        } catch (IndexOutOfBoundsException v5_1) {
        }
        this.zzb[v0] = p5;
        this.zzd = v2_1;
        return;
    }

    public final void zza(byte[] p1, int p2, int p3)
    {
        this.zzc(p1, p2, p3);
        return;
    }

    public final void zzb(int p4, com.google.android.gms.internal.firebase-auth-api.zzamm p5)
    {
        this.zzj(1, 3);
        this.zzk(2, p4);
        this.zzj(3, 2);
        this.zzb(p5);
        this.zzj(1, 4);
        return;
    }

    public final void zzb(int p2, String p3)
    {
        this.zzj(p2, 2);
        this.zzb(p3);
        return;
    }

    public final void zzb(int p2, boolean p3)
    {
        this.zzj(p2, 0);
        this.zza(((byte) p3));
        return;
    }

    public final void zzb(com.google.android.gms.internal.firebase-auth-api.zzajv p2)
    {
        this.zzm(p2.zzb());
        p2.zza(this);
        return;
    }

    public final void zzb(com.google.android.gms.internal.firebase-auth-api.zzamm p2)
    {
        this.zzm(p2.zzl());
        p2.zza(this);
        return;
    }

    public final void zzb(String p6)
    {
        com.google.android.gms.internal.firebase-auth-api.zzakn$zzd v0_0 = this.zzd;
        int v1_8 = com.google.android.gms.internal.firebase-auth-api.zzakn.zzi((p6.length() * 3));
        int v2_2 = com.google.android.gms.internal.firebase-auth-api.zzakn.zzi(p6.length());
        if (v2_2 != v1_8) {
            this.zzm(com.google.android.gms.internal.firebase-auth-api.zzaoa.zza(p6));
            this.zzd = com.google.android.gms.internal.firebase-auth-api.zzaoa.zza(p6, this.zzb, this.zzd, this.zza());
            return;
        } else {
            int v1_4 = (v0_0 + v2_2);
            this.zzd = v1_4;
            int v1_5 = com.google.android.gms.internal.firebase-auth-api.zzaoa.zza(p6, this.zzb, v1_4, this.zza());
            this.zzd = v0_0;
            this.zzm(((v1_5 - v0_0) - v2_2));
            this.zzd = v1_5;
            return;
        }
    }

    public final void zzb(byte[] p1, int p2, int p3)
    {
        this.zzm(p3);
        this.zzc(p1, 0, p3);
        return;
    }

    public final void zzc()
    {
        return;
    }

    public final void zzc(int p2, com.google.android.gms.internal.firebase-auth-api.zzajv p3)
    {
        this.zzj(p2, 2);
        this.zzb(p3);
        return;
    }

    public final void zzd(int p4, com.google.android.gms.internal.firebase-auth-api.zzajv p5)
    {
        this.zzj(1, 3);
        this.zzk(2, p4);
        this.zzc(3, p5);
        this.zzj(1, 4);
        return;
    }

    public final void zzf(int p2, long p3)
    {
        this.zzj(p2, 1);
        this.zzf(p3);
        return;
    }

    public final void zzf(long p7)
    {
        int v0_0 = this.zzd;
        try {
            int v2_0 = this.zzb;
            v2_0[v0_0] = ((byte) ((int) p7));
            v2_0[(v0_0 + 1)] = ((byte) ((int) (p7 >> 8)));
            v2_0[(v0_0 + 2)] = ((byte) ((int) (p7 >> 16)));
            v2_0[(v0_0 + 3)] = ((byte) ((int) (p7 >> 24)));
            v2_0[(v0_0 + 4)] = ((byte) ((int) (p7 >> 32)));
            v2_0[(v0_0 + 5)] = ((byte) ((int) (p7 >> 40)));
            v2_0[(v0_0 + 6)] = ((byte) ((int) (p7 >> 48)));
            v2_0[(v0_0 + 7)] = ((byte) ((int) (p7 >> 56)));
            int v0_1 = (v0_0 + 8);
            this.zzd = v0_1;
            return;
        } catch (IndexOutOfBoundsException v7_4) {
            throw new com.google.android.gms.internal.firebase-auth-api.zzakn$zzd(v0_1, this.zzc, 8, v7_4);
        }
    }

    public final void zzg(int p2, int p3)
    {
        this.zzj(p2, 5);
        this.zzj(p3);
        return;
    }

    public final void zzh(int p2, int p3)
    {
        this.zzj(p2, 0);
        this.zzk(p3);
        return;
    }

    public final void zzh(int p2, long p3)
    {
        this.zzj(p2, 0);
        this.zzh(p3);
        return;
    }

    public final void zzh(long p11)
    {
        int v2_0;
        int v0_0 = this.zzd;
        if ((!com.google.android.gms.internal.firebase-auth-api.zzakn.zzd()) || (this.zza() < 10)) {
            try {
                while ((p11 & -128) != 0) {
                    int v7_1 = (v0_0 + 1);
                    try {
                        this.zzb[v0_0] = ((byte) (((int) p11) | 128));
                        p11 >>= 7;
                        v0_0 = v7_1;
                    } catch (IndexOutOfBoundsException v11_1) {
                        v0_0 = v7_1;
                        throw new com.google.android.gms.internal.firebase-auth-api.zzakn$zzd(v0_0, this.zzc, 1, v11_1);
                    }
                }
            } catch (IndexOutOfBoundsException v11_1) {
            }
            v2_0 = (v0_0 + 1);
            try {
                this.zzb[v0_0] = ((byte) ((int) p11));
            } catch (IndexOutOfBoundsException v11_1) {
                v0_0 = v2_0;
            }
        } else {
            while ((p11 & -128) != 0) {
                int v7_3 = (v0_0 + 1);
                com.google.android.gms.internal.firebase-auth-api.zzanz.zza(this.zzb, ((long) v0_0), ((byte) (((int) p11) | 128)));
                p11 >>= 7;
                v0_0 = v7_3;
            }
            v2_0 = (v0_0 + 1);
            com.google.android.gms.internal.firebase-auth-api.zzanz.zza(this.zzb, ((long) v0_0), ((byte) ((int) p11)));
        }
        this.zzd = v2_0;
        return;
    }

    public final void zzj(int p6)
    {
        int v0_0 = this.zzd;
        try {
            com.google.android.gms.internal.firebase-auth-api.zzakn$zzd v2_0 = this.zzb;
            v2_0[v0_0] = ((byte) p6);
            v2_0[(v0_0 + 1)] = ((byte) (p6 >> 8));
            v2_0[(v0_0 + 2)] = ((byte) (p6 >> 16));
            v2_0[(v0_0 + 3)] = (p6 >> 24);
            int v0_1 = (v0_0 + 4);
            this.zzd = v0_1;
            return;
        } catch (IndexOutOfBoundsException v6_2) {
            throw new com.google.android.gms.internal.firebase-auth-api.zzakn$zzd(v0_1, this.zzc, 4, v6_2);
        }
    }

    public final void zzj(int p1, int p2)
    {
        this.zzm(((p1 << 3) | p2));
        return;
    }

    public final void zzk(int p3)
    {
        if (p3 < 0) {
            this.zzh(((long) p3));
            return;
        } else {
            this.zzm(p3);
            return;
        }
    }

    public final void zzk(int p2, int p3)
    {
        this.zzj(p2, 0);
        this.zzm(p3);
        return;
    }

    public final void zzm(int p5)
    {
        int v0 = this.zzd;
        try {
            while ((p5 & -128) != 0) {
                int v2_0 = (v0 + 1);
                this.zzb[v0] = ((byte) (p5 | 128));
                p5 >>= 7;
                v0 = v2_0;
            }
        } catch (IndexOutOfBoundsException v5_2) {
            throw new com.google.android.gms.internal.firebase-auth-api.zzakn$zzd(v0, this.zzc, 1, v5_2);
        } catch (IndexOutOfBoundsException v5_2) {
            v0 = v2_0;
        }
        v2_0 = (v0 + 1);
        this.zzb[v0] = ((byte) p5);
        this.zzd = v2_0;
        return;
    }
}
