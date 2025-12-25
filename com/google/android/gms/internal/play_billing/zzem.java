package com.google.android.gms.internal.play_billing;
final class zzem extends com.google.android.gms.internal.play_billing.zzep {
    private final byte[] zzc;
    private final int zzd;
    private int zze;

    public zzem(byte[] p3, int p4, int p5)
    {
        super(0);
        String v4_2 = p3.length;
        if (((v4_2 - p5) | p5) < 0) {
            throw new IllegalArgumentException(v1.a.i("Array range is invalid. Buffer.length=", v4_2, p5, ", offset=0, length="));
        } else {
            super.zzc = p3;
            super.zze = 0;
            super.zzd = p5;
            return;
        }
    }

    public final int zza()
    {
        return (this.zzd - this.zze);
    }

    public final void zzb(byte p10)
    {
        int v1 = this.zze;
        try {
            com.google.android.gms.internal.play_billing.zzen v2_2 = (v1 + 1);
            try {
                this.zzc[v1] = p10;
                this.zze = v2_2;
                return;
            } catch (IndexOutOfBoundsException v0_1) {
                v1 = v2_2;
                throw new com.google.android.gms.internal.play_billing.zzen(((long) v1), ((long) this.zzd), 1, v0_1);
            }
        } catch (IndexOutOfBoundsException v0_1) {
        }
        this.zzc[v1] = p10;
        this.zze = v2_2;
        return;
    }

    public final void zzc(byte[] p8, int p9, int p10)
    {
        try {
            System.arraycopy(p8, 0, this.zzc, this.zze, p10);
            this.zze = (this.zze + p10);
            return;
        } catch (com.google.android.gms.internal.play_billing.zzen v0_3) {
            throw new com.google.android.gms.internal.play_billing.zzen(((long) this.zze), ((long) this.zzd), p10, v0_3);
        }
    }

    public final void zzd(int p1, boolean p2)
    {
        this.zzv((p1 << 3));
        this.zzb(p2);
        return;
    }

    public final void zze(int p1, com.google.android.gms.internal.play_billing.zzei p2)
    {
        this.zzv(((p1 << 3) | 2));
        this.zzf(p2);
        return;
    }

    public final void zzf(com.google.android.gms.internal.play_billing.zzei p2)
    {
        this.zzv(p2.zzd());
        p2.zzg(this);
        return;
    }

    public final void zzg(int p1, int p2)
    {
        this.zzv(((p1 << 3) | 5));
        this.zzh(p2);
        return;
    }

    public final void zzh(int p10)
    {
        int v1_0 = this.zze;
        try {
            IndexOutOfBoundsException v0_0 = this.zzc;
            v0_0[v1_0] = ((byte) p10);
            v0_0[(v1_0 + 1)] = ((byte) (p10 >> 8));
            v0_0[(v1_0 + 2)] = ((byte) (p10 >> 16));
            v0_0[(v1_0 + 3)] = ((byte) (p10 >> 24));
            int v1_1 = (v1_0 + 4);
            this.zze = v1_1;
            return;
        } catch (IndexOutOfBoundsException v0_1) {
            throw new com.google.android.gms.internal.play_billing.zzen(((long) v1_1), ((long) this.zzd), 4, v0_1);
        }
    }

    public final void zzi(int p1, long p2)
    {
        this.zzv(((p1 << 3) | 1));
        this.zzj(p2);
        return;
    }

    public final void zzj(long p10)
    {
        int v1_0 = this.zze;
        try {
            IndexOutOfBoundsException v0_0 = this.zzc;
            v0_0[v1_0] = ((byte) ((int) p10));
            v0_0[(v1_0 + 1)] = ((byte) ((int) (p10 >> 8)));
            v0_0[(v1_0 + 2)] = ((byte) ((int) (p10 >> 16)));
            v0_0[(v1_0 + 3)] = ((byte) ((int) (p10 >> 24)));
            v0_0[(v1_0 + 4)] = ((byte) ((int) (p10 >> 32)));
            v0_0[(v1_0 + 5)] = ((byte) ((int) (p10 >> 40)));
            v0_0[(v1_0 + 6)] = ((byte) ((int) (p10 >> 48)));
            v0_0[(v1_0 + 7)] = ((byte) ((int) (p10 >> 56)));
            int v1_1 = (v1_0 + 8);
            this.zze = v1_1;
            return;
        } catch (IndexOutOfBoundsException v0_1) {
            throw new com.google.android.gms.internal.play_billing.zzen(((long) v1_1), ((long) this.zzd), 8, v0_1);
        }
    }

    public final void zzk(int p1, int p2)
    {
        this.zzv((p1 << 3));
        this.zzl(p2);
        return;
    }

    public final void zzl(int p3)
    {
        if (p3 < 0) {
            this.zzx(((long) p3));
            return;
        } else {
            this.zzv(p3);
            return;
        }
    }

    public final void zzm(byte[] p1, int p2, int p3)
    {
        this.zzc(p1, 0, p3);
        return;
    }

    public final void zzn(int p1, com.google.android.gms.internal.play_billing.zzgl p2, com.google.android.gms.internal.play_billing.zzgv p3)
    {
        this.zzv(((p1 << 3) | 2));
        this.zzv(((com.google.android.gms.internal.play_billing.zzds) p2).zze(p3));
        p3.zzi(p2, this.zza);
        return;
    }

    public final void zzo(com.google.android.gms.internal.play_billing.zzgl p2)
    {
        this.zzv(p2.zzj());
        p2.zzL(this);
        return;
    }

    public final void zzp(int p2, com.google.android.gms.internal.play_billing.zzgl p3)
    {
        this.zzv(11);
        this.zzu(2, p2);
        this.zzv(26);
        this.zzo(p3);
        this.zzv(12);
        return;
    }

    public final void zzq(int p2, com.google.android.gms.internal.play_billing.zzei p3)
    {
        this.zzv(11);
        this.zzu(2, p2);
        this.zze(3, p3);
        this.zzv(12);
        return;
    }

    public final void zzr(int p1, String p2)
    {
        this.zzv(((p1 << 3) | 2));
        this.zzs(p2);
        return;
    }

    public final void zzs(String p6)
    {
        com.google.android.gms.internal.play_billing.zzen v0_0 = this.zze;
        int v1_8 = com.google.android.gms.internal.play_billing.zzep.zzC((p6.length() * 3));
        int v2_2 = com.google.android.gms.internal.play_billing.zzep.zzC(p6.length());
        if (v2_2 != v1_8) {
            this.zzv(com.google.android.gms.internal.play_billing.zzhr.zzc(p6));
            int v2_0 = this.zze;
            this.zze = com.google.android.gms.internal.play_billing.zzhr.zzb(p6, this.zzc, v2_0, (this.zzd - v2_0));
            return;
        } else {
            int v1_4 = (v0_0 + v2_2);
            this.zze = v1_4;
            int v1_5 = com.google.android.gms.internal.play_billing.zzhr.zzb(p6, this.zzc, v1_4, (this.zzd - v1_4));
            this.zze = v0_0;
            this.zzv(((v1_5 - v0_0) - v2_2));
            this.zze = v1_5;
            return;
        }
    }

    public final void zzt(int p1, int p2)
    {
        this.zzv(((p1 << 3) | p2));
        return;
    }

    public final void zzu(int p1, int p2)
    {
        this.zzv((p1 << 3));
        this.zzv(p2);
        return;
    }

    public final void zzv(int p10)
    {
        int v1 = this.zze;
        try {
            while ((p10 & -128) != 0) {
                com.google.android.gms.internal.play_billing.zzen v2_0 = (v1 + 1);
                this.zzc[v1] = ((byte) (p10 | 128));
                p10 >>= 7;
                v1 = v2_0;
            }
        } catch (IndexOutOfBoundsException v0_2) {
            IndexOutOfBoundsException v8 = v0_2;
            throw new com.google.android.gms.internal.play_billing.zzen(((long) v1), ((long) this.zzd), 1, v8);
        } catch (IndexOutOfBoundsException v0_4) {
            v8 = v0_4;
            v1 = v2_0;
        }
        v2_0 = (v1 + 1);
        this.zzc[v1] = ((byte) p10);
        this.zze = v2_0;
        return;
    }

    public final void zzw(int p1, long p2)
    {
        this.zzv((p1 << 3));
        this.zzx(p2);
        return;
    }

    public final void zzx(long p11)
    {
        com.google.android.gms.internal.play_billing.zzen v2_0;
        IndexOutOfBoundsException v0_0 = this.zze;
        if ((!com.google.android.gms.internal.play_billing.zzep.zzG()) || ((this.zzd - v0_0) < 10)) {
            int v1_0 = v0_0;
            try {
                while ((p11 & -128) != 0) {
                    int v7_1 = (v1_0 + 1);
                    try {
                        this.zzc[v1_0] = ((byte) (((int) p11) | 128));
                        p11 >>= 7;
                        v1_0 = v7_1;
                    } catch (IndexOutOfBoundsException v0_3) {
                        IndexOutOfBoundsException v8_3 = v0_3;
                        v1_0 = v7_1;
                        throw new com.google.android.gms.internal.play_billing.zzen(((long) v1_0), ((long) this.zzd), 1, v8_3);
                    }
                }
            } catch (IndexOutOfBoundsException v0_5) {
                v8_3 = v0_5;
            }
            v2_0 = (v1_0 + 1);
            try {
                this.zzc[v1_0] = ((byte) ((int) p11));
            } catch (IndexOutOfBoundsException v0_6) {
                v8_3 = v0_6;
                v1_0 = v2_0;
            }
        } else {
            while ((p11 & -128) != 0) {
                int v7_4 = (v0_0 + 1);
                com.google.android.gms.internal.play_billing.zzho.zzn(this.zzc, ((long) v0_0), ((byte) (((int) p11) | 128)));
                p11 >>= 7;
                v0_0 = v7_4;
            }
            v2_0 = (v0_0 + 1);
            com.google.android.gms.internal.play_billing.zzho.zzn(this.zzc, ((long) v0_0), ((byte) ((int) p11)));
        }
        this.zze = v2_0;
        return;
    }
}
