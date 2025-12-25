package com.google.android.gms.internal.firebase-auth-api;
final class zzakn$zzc extends com.google.android.gms.internal.firebase-auth-api.zzakn$zzb {
    private final java.io.OutputStream zzf;

    public zzakn$zzc(java.io.OutputStream p1, int p2)
    {
        super(p2);
        if (p1 == null) {
            throw new NullPointerException("out");
        } else {
            super.zzf = p1;
            return;
        }
    }

    private final void zzc(byte[] p4, int p5, int p6)
    {
        java.io.OutputStream v0_0 = this.zzc;
        int v1_0 = this.zzd;
        if ((v0_0 - v1_0) < p6) {
            java.io.OutputStream v0_5 = (v0_0 - v1_0);
            System.arraycopy(p4, p5, this.zzb, v1_0, v0_5);
            int v5_1 = (p5 + v0_5);
            p6 -= v0_5;
            this.zzd = this.zzc;
            this.zze = (this.zze + v0_5);
            this.zze();
            if (p6 > this.zzc) {
                this.zzf.write(p4, v5_1, p6);
            } else {
                System.arraycopy(p4, v5_1, this.zzb, 0, p6);
                this.zzd = p6;
            }
        } else {
            System.arraycopy(p4, p5, this.zzb, v1_0, p6);
            this.zzd = (this.zzd + p6);
        }
        this.zze = (this.zze + p6);
        return;
    }

    private final void zze()
    {
        this.zzf.write(this.zzb, 0, this.zzd);
        this.zzd = 0;
        return;
    }

    private final void zzp(int p3)
    {
        if ((this.zzc - this.zzd) < p3) {
            this.zze();
        }
        return;
    }

    public final void zza(byte p3)
    {
        if (this.zzd == this.zzc) {
            this.zze();
        }
        this.zzb(p3);
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
        this.zzp(11);
        this.zzl(p2, 0);
        this.zzb(((byte) p3));
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
        int v0_3 = (p6.length() * 3);
        com.google.android.gms.internal.firebase-auth-api.zzakn$zzd v1_3 = com.google.android.gms.internal.firebase-auth-api.zzakn.zzi(v0_3);
        int v2_1 = (v1_3 + v0_3);
        int v3_5 = this.zzc;
        if (v2_1 <= v3_5) {
            if (v2_1 > (v3_5 - this.zzd)) {
                this.zze();
            }
            int v3_0;
            int v0_2 = com.google.android.gms.internal.firebase-auth-api.zzakn.zzi(p6.length());
            int v2_0 = this.zzd;
            if (v0_2 != v1_3) {
                v3_0 = com.google.android.gms.internal.firebase-auth-api.zzaoa.zza(p6);
                this.zzo(v3_0);
                this.zzd = com.google.android.gms.internal.firebase-auth-api.zzaoa.zza(p6, this.zzb, this.zzd, v3_0);
            } else {
                com.google.android.gms.internal.firebase-auth-api.zzakn$zzd v1_1 = (v2_0 + v0_2);
                this.zzd = v1_1;
                com.google.android.gms.internal.firebase-auth-api.zzakn$zzd v1_2 = com.google.android.gms.internal.firebase-auth-api.zzaoa.zza(p6, this.zzb, v1_1, (this.zzc - v1_1));
                this.zzd = v2_0;
                v3_0 = ((v1_2 - v2_0) - v0_2);
                this.zzo(v3_0);
                this.zzd = v1_2;
            }
            this.zze = (this.zze + v3_0);
            return;
        } else {
            com.google.android.gms.internal.firebase-auth-api.zzakn$zzd v1_8 = new byte[v0_3];
            int v0_10 = com.google.android.gms.internal.firebase-auth-api.zzaoa.zza(p6, v1_8, 0, v0_3);
            this.zzm(v0_10);
            this.zza(v1_8, 0, v0_10);
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
        if (this.zzd > 0) {
            this.zze();
        }
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
        this.zzp(18);
        this.zzl(p2, 1);
        this.zzi(p3);
        return;
    }

    public final void zzf(long p2)
    {
        this.zzp(8);
        this.zzi(p2);
        return;
    }

    public final void zzg(int p2, int p3)
    {
        this.zzp(14);
        this.zzl(p2, 5);
        this.zzn(p3);
        return;
    }

    public final void zzh(int p2, int p3)
    {
        this.zzp(20);
        this.zzl(p2, 0);
        if (p3 < 0) {
            this.zzj(((long) p3));
            return;
        } else {
            this.zzo(p3);
            return;
        }
    }

    public final void zzh(int p2, long p3)
    {
        this.zzp(20);
        this.zzl(p2, 0);
        this.zzj(p3);
        return;
    }

    public final void zzh(long p2)
    {
        this.zzp(10);
        this.zzj(p2);
        return;
    }

    public final void zzj(int p2)
    {
        this.zzp(4);
        this.zzn(p2);
        return;
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
        this.zzp(20);
        this.zzl(p2, 0);
        this.zzo(p3);
        return;
    }

    public final void zzm(int p2)
    {
        this.zzp(5);
        this.zzo(p2);
        return;
    }
}
