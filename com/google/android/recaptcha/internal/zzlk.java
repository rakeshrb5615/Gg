package com.google.android.recaptcha.internal;
final class zzlk extends com.google.android.recaptcha.internal.zzln {
    private final byte[] zzb;
    private final int zzc;
    private int zzd;

    public zzlk(byte[] p3, int p4, int p5)
    {
        super(0);
        String v4_3 = p3.length;
        if (((v4_3 - p5) | p5) < 0) {
            throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", new Object[] {Integer.valueOf(v4_3), Integer.valueOf(0), Integer.valueOf(p5)})));
        } else {
            super.zzb = p3;
            super.zzd = 0;
            super.zzc = p5;
            return;
        }
    }

    public final int zza()
    {
        return (this.zzc - this.zzd);
    }

    public final void zzb(byte p5)
    {
        try {
            com.google.android.recaptcha.internal.zzll v0_0 = this.zzb;
            String v1_0 = this.zzd;
            this.zzd = (v1_0 + 1);
            v0_0[v1_0] = p5;
            return;
        } catch (IndexOutOfBoundsException v5_1) {
            throw new com.google.android.recaptcha.internal.zzll(String.format("Pos: %d, limit: %d, len: %d", new Object[] {Integer.valueOf(this.zzd), Integer.valueOf(this.zzc), Integer.valueOf(1)})), v5_1);
        }
    }

    public final void zzc(byte[] p3, int p4, int p5)
    {
        try {
            System.arraycopy(p3, 0, this.zzb, this.zzd, p5);
            this.zzd = (this.zzd + p5);
            return;
        } catch (IndexOutOfBoundsException v3_3) {
            throw new com.google.android.recaptcha.internal.zzll(String.format("Pos: %d, limit: %d, len: %d", new Object[] {Integer.valueOf(this.zzd), Integer.valueOf(this.zzc), Integer.valueOf(p5)})), v3_3);
        }
    }

    public final void zzd(int p1, boolean p2)
    {
        this.zzt((p1 << 3));
        this.zzb(p2);
        return;
    }

    public final void zze(int p1, com.google.android.recaptcha.internal.zzle p2)
    {
        this.zzt(((p1 << 3) | 2));
        this.zzt(p2.zzd());
        p2.zzh(this);
        return;
    }

    public final void zzf(int p1, int p2)
    {
        this.zzt(((p1 << 3) | 5));
        this.zzg(p2);
        return;
    }

    public final void zzg(int p6)
    {
        try {
            com.google.android.recaptcha.internal.zzll v0_0 = this.zzb;
            String v1_0 = this.zzd;
            String v2_1 = (v1_0 + 1);
            this.zzd = v2_1;
            v0_0[v1_0] = ((byte) (p6 & 255));
            Integer v3_4 = (v1_0 + 2);
            this.zzd = v3_4;
            v0_0[v2_1] = ((byte) ((p6 >> 8) & 255));
            String v2_0 = (v1_0 + 3);
            this.zzd = v2_0;
            v0_0[v3_4] = ((byte) ((p6 >> 16) & 255));
            this.zzd = (v1_0 + 4);
            v0_0[v2_0] = ((byte) ((p6 >> 24) & 255));
            return;
        } catch (IndexOutOfBoundsException v6_4) {
            throw new com.google.android.recaptcha.internal.zzll(String.format("Pos: %d, limit: %d, len: %d", new Object[] {Integer.valueOf(this.zzd), Integer.valueOf(this.zzc), Integer.valueOf(1)})), v6_4);
        }
    }

    public final void zzh(int p1, long p2)
    {
        this.zzt(((p1 << 3) | 1));
        this.zzi(p2);
        return;
    }

    public final void zzi(long p8)
    {
        try {
            String v0_0 = this.zzb;
            String v1_0 = this.zzd;
            Integer v2_1 = (v1_0 + 1);
            this.zzd = v2_1;
            v0_0[v1_0] = ((byte) (((int) p8) & 255));
            int v3_5 = (v1_0 + 2);
            this.zzd = v3_5;
            v0_0[v2_1] = ((byte) (((int) (p8 >> 8)) & 255));
            Integer v2_0 = (v1_0 + 3);
            this.zzd = v2_0;
            v0_0[v3_5] = ((byte) (((int) (p8 >> 16)) & 255));
            int v3_0 = (v1_0 + 4);
            this.zzd = v3_0;
            v0_0[v2_0] = ((byte) (((int) (p8 >> 24)) & 255));
            Integer v2_2 = (v1_0 + 5);
            this.zzd = v2_2;
            v0_0[v3_0] = ((byte) (((int) (p8 >> 32)) & 255));
            int v3_2 = (v1_0 + 6);
            this.zzd = v3_2;
            v0_0[v2_2] = ((byte) (((int) (p8 >> 40)) & 255));
            Integer v2_3 = (v1_0 + 7);
            this.zzd = v2_3;
            v0_0[v3_2] = ((byte) (((int) (p8 >> 48)) & 255));
            this.zzd = (v1_0 + 8);
            v0_0[v2_3] = ((byte) (((int) (p8 >> 56)) & 255));
            return;
        } catch (IndexOutOfBoundsException v8_5) {
            throw new com.google.android.recaptcha.internal.zzll(String.format("Pos: %d, limit: %d, len: %d", new Object[] {Integer.valueOf(this.zzd), Integer.valueOf(this.zzc), Integer.valueOf(1)})), v8_5);
        }
    }

    public final void zzj(int p1, int p2)
    {
        this.zzt((p1 << 3));
        this.zzk(p2);
        return;
    }

    public final void zzk(int p3)
    {
        if (p3 < 0) {
            this.zzv(((long) p3));
            return;
        } else {
            this.zzt(p3);
            return;
        }
    }

    public final void zzl(byte[] p1, int p2, int p3)
    {
        this.zzc(p1, 0, p3);
        return;
    }

    public final void zzm(int p1, com.google.android.recaptcha.internal.zzoi p2, com.google.android.recaptcha.internal.zzow p3)
    {
        this.zzt(((p1 << 3) | 2));
        this.zzt(((com.google.android.recaptcha.internal.zzko) p2).zza(p3));
        p3.zzj(p2, this.zza);
        return;
    }

    public final void zzn(int p2, com.google.android.recaptcha.internal.zzoi p3)
    {
        this.zzt(11);
        this.zzs(2, p2);
        this.zzt(26);
        this.zzt(p3.zzo());
        p3.zze(this);
        this.zzt(12);
        return;
    }

    public final void zzo(int p2, com.google.android.recaptcha.internal.zzle p3)
    {
        this.zzt(11);
        this.zzs(2, p2);
        this.zze(3, p3);
        this.zzt(12);
        return;
    }

    public final void zzp(int p1, String p2)
    {
        this.zzt(((p1 << 3) | 2));
        this.zzq(p2);
        return;
    }

    public final void zzq(String p6)
    {
        com.google.android.recaptcha.internal.zzll v0_0 = this.zzd;
        int v1_8 = com.google.android.recaptcha.internal.zzln.zzA((p6.length() * 3));
        int v2_2 = com.google.android.recaptcha.internal.zzln.zzA(p6.length());
        if (v2_2 != v1_8) {
            this.zzt(com.google.android.recaptcha.internal.zzpv.zzc(p6));
            int v2_0 = this.zzd;
            this.zzd = com.google.android.recaptcha.internal.zzpv.zzb(p6, this.zzb, v2_0, (this.zzc - v2_0));
            return;
        } else {
            int v1_4 = (v0_0 + v2_2);
            this.zzd = v1_4;
            int v1_5 = com.google.android.recaptcha.internal.zzpv.zzb(p6, this.zzb, v1_4, (this.zzc - v1_4));
            this.zzd = v0_0;
            this.zzt(((v1_5 - v0_0) - v2_2));
            this.zzd = v1_5;
            return;
        }
    }

    public final void zzr(int p1, int p2)
    {
        this.zzt(((p1 << 3) | p2));
        return;
    }

    public final void zzs(int p1, int p2)
    {
        this.zzt((p1 << 3));
        this.zzt(p2);
        return;
    }

    public final void zzt(int p5)
    {
        while ((p5 & -128) == 0) {
            com.google.android.recaptcha.internal.zzll v0_1 = this.zzb;
            String v1_0 = this.zzd;
            this.zzd = (v1_0 + 1);
            v0_1[v1_0] = ((byte) p5);
            return;
        }
        com.google.android.recaptcha.internal.zzll v0_3 = this.zzb;
        String v1_3 = this.zzd;
        this.zzd = (v1_3 + 1);
        v0_3[v1_3] = ((byte) ((p5 | 128) & 255));
        p5 >>= 7;
    }

    public final void zzu(int p1, long p2)
    {
        this.zzt((p1 << 3));
        this.zzv(p2);
        return;
    }

    public final void zzv(long p10)
    {
        if ((!com.google.android.recaptcha.internal.zzln.zzE()) || ((this.zzc - this.zzd) < 10)) {
            while ((p10 & -128) != 0) {
                String v0_2 = this.zzb;
                byte v6_1 = this.zzd;
                this.zzd = (v6_1 + 1);
                v0_2[v6_1] = ((byte) ((((int) p10) | 128) & 255));
                p10 >>= 7;
            }
            String v0_3 = this.zzb;
            String v1_1 = this.zzd;
            this.zzd = (v1_1 + 1);
            v0_3[v1_1] = ((byte) ((int) p10));
            return;
        }
        while ((p10 & -128) != 0) {
            String v0_9 = this.zzb;
            long v7_5 = this.zzd;
            this.zzd = (v7_5 + 1);
            com.google.android.recaptcha.internal.zzps.zzn(v0_9, ((long) v7_5), ((byte) ((((int) p10) | 128) & 255)));
            p10 >>= 7;
        }
        IndexOutOfBoundsException v10_4 = this.zzb;
        com.google.android.recaptcha.internal.zzll v11_2 = this.zzd;
        this.zzd = (v11_2 + 1);
        com.google.android.recaptcha.internal.zzps.zzn(v10_4, ((long) v11_2), ((byte) ((int) p10)));
        return;
    }
}
