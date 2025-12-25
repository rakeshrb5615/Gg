package com.google.android.gms.internal.firebase-auth-api;
abstract class zzakn$zzb extends com.google.android.gms.internal.firebase-auth-api.zzakn {
    final byte[] zzb;
    final int zzc;
    int zzd;
    int zze;

    public zzakn$zzb(int p2)
    {
        super(0);
        if (p2 < null) {
            throw new IllegalArgumentException("bufferSize must be >= 0");
        } else {
            IllegalArgumentException v2_1 = new byte[Math.max(p2, 20)];
            super.zzb = v2_1;
            super.zzc = v2_1.length;
            return;
        }
    }

    public final int zza()
    {
        throw new UnsupportedOperationException("spaceLeft() can only be called on CodedOutputStreams that are writing to a flat array or ByteBuffer.");
    }

    public final void zzb(byte p3)
    {
        int v0_0 = this.zzd;
        this.zzb[v0_0] = p3;
        this.zzd = (v0_0 + 1);
        this.zze = (this.zze + 1);
        return;
    }

    public final void zzi(long p8)
    {
        int v0_0 = this.zzd;
        byte[] v1 = this.zzb;
        int v2_1 = (v0_0 + 1);
        v1[v0_0] = ((byte) ((int) p8));
        int v3_5 = (v0_0 + 2);
        v1[v2_1] = ((byte) ((int) (p8 >> 8)));
        int v2_0 = (v0_0 + 3);
        v1[v3_5] = ((byte) ((int) (p8 >> 16)));
        int v3_0 = (v0_0 + 4);
        v1[v2_0] = ((byte) ((int) (p8 >> 24)));
        int v2_2 = (v0_0 + 5);
        v1[v3_0] = ((byte) ((int) (p8 >> 32)));
        int v3_2 = (v0_0 + 6);
        v1[v2_2] = ((byte) ((int) (p8 >> 40)));
        int v2_3 = (v0_0 + 7);
        v1[v3_2] = ((byte) ((int) (p8 >> 48)));
        int v0_1 = (v0_0 + 8);
        v1[v2_3] = ((byte) ((int) (p8 >> 56)));
        this.zzd = v0_1;
        this.zze = (this.zze + 8);
        return;
    }

    public final void zzj(long p12)
    {
        if (com.google.android.gms.internal.firebase-auth-api.zzakn.zzd()) {
            int v6_1 = ((long) this.zzd);
            while ((p12 & -128) != 0) {
                byte[] v0_6 = this.zzb;
                long v8_1 = this.zzd;
                this.zzd = (v8_1 + 1);
                com.google.android.gms.internal.firebase-auth-api.zzanz.zza(v0_6, ((long) v8_1), ((byte) (((int) p12) | 128)));
                p12 >>= 7;
            }
            byte[] v0_7 = this.zzb;
            long v1_2 = this.zzd;
            this.zzd = (v1_2 + 1);
            com.google.android.gms.internal.firebase-auth-api.zzanz.zza(v0_7, ((long) v1_2), ((byte) ((int) p12)));
            this.zze = (this.zze + ((int) (((long) this.zzd) - v6_1)));
            return;
        }
        while ((p12 & -128) != 0) {
            byte[] v0_9 = this.zzb;
            int v6_0 = this.zzd;
            this.zzd = (v6_0 + 1);
            v0_9[v6_0] = ((byte) (((int) p12) | 128));
            this.zze = (this.zze + 1);
            p12 >>= 7;
        }
        byte[] v0_3 = this.zzb;
        long v1_1 = this.zzd;
        this.zzd = (v1_1 + 1);
        v0_3[v1_1] = ((byte) ((int) p12));
        this.zze = (this.zze + 1);
        return;
    }

    public final void zzl(int p1, int p2)
    {
        this.zzo(((p1 << 3) | p2));
        return;
    }

    public final void zzn(int p6)
    {
        int v0_0 = this.zzd;
        byte[] v1 = this.zzb;
        int v2_0 = (v0_0 + 1);
        v1[v0_0] = ((byte) p6);
        int v3_1 = (v0_0 + 2);
        v1[v2_0] = ((byte) (p6 >> 8));
        int v2_1 = (v0_0 + 3);
        v1[v3_1] = ((byte) (p6 >> 16));
        int v0_1 = (v0_0 + 4);
        v1[v2_1] = (p6 >> 24);
        this.zzd = v0_1;
        this.zze = (this.zze + 4);
        return;
    }

    public final void zzo(int p7)
    {
        if (com.google.android.gms.internal.firebase-auth-api.zzakn.zzd()) {
            int v0_5 = ((long) this.zzd);
            while ((p7 & -128) != 0) {
                byte[] v2_3 = this.zzb;
                long v3_0 = this.zzd;
                this.zzd = (v3_0 + 1);
                com.google.android.gms.internal.firebase-auth-api.zzanz.zza(v2_3, ((long) v3_0), ((byte) (p7 | 128)));
                p7 >>= 7;
            }
            byte[] v2_4 = this.zzb;
            long v3_2 = this.zzd;
            this.zzd = (v3_2 + 1);
            com.google.android.gms.internal.firebase-auth-api.zzanz.zza(v2_4, ((long) v3_2), ((byte) p7));
            this.zze = (this.zze + ((int) (((long) this.zzd) - v0_5)));
            return;
        }
        while ((p7 & -128) != 0) {
            int v0_7 = this.zzb;
            int v1_1 = this.zzd;
            this.zzd = (v1_1 + 1);
            v0_7[v1_1] = ((byte) (p7 | 128));
            this.zze = (this.zze + 1);
            p7 >>= 7;
        }
        int v0_3 = this.zzb;
        int v1_0 = this.zzd;
        this.zzd = (v1_0 + 1);
        v0_3[v1_0] = ((byte) p7);
        this.zze = (this.zze + 1);
        return;
    }
}
