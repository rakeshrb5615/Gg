package com.google.android.gms.internal.firebase-auth-api;
public abstract class zzakn extends com.google.android.gms.internal.firebase-auth-api.zzajw {
    private static final java.util.logging.Logger zzb;
    private static final boolean zzc;
    com.google.android.gms.internal.firebase-auth-api.zzakp zza;

    static zzakn()
    {
        com.google.android.gms.internal.firebase-auth-api.zzakn.zzb = java.util.logging.Logger.getLogger(com.google.android.gms.internal.firebase-auth-api.zzakn.getName());
        com.google.android.gms.internal.firebase-auth-api.zzakn.zzc = com.google.android.gms.internal.firebase-auth-api.zzanz.zzc();
        return;
    }

    private zzakn()
    {
        return;
    }

    public synthetic zzakn(com.google.android.gms.internal.firebase-auth-api.zzakq p1)
    {
        return;
    }

    public static int zza(double p0)
    {
        return 8;
    }

    public static int zza(float p0)
    {
        return 4;
    }

    public static int zza(int p2)
    {
        return com.google.android.gms.internal.firebase-auth-api.zzakn.zze(((long) p2));
    }

    public static int zza(int p0, double p1)
    {
        return (com.google.android.gms.internal.firebase-auth-api.zzakn.zzi((p0 << 3)) + 8);
    }

    public static int zza(int p0, float p1)
    {
        return (com.google.android.gms.internal.firebase-auth-api.zzakn.zzi((p0 << 3)) + 4);
    }

    public static int zza(int p2, int p3)
    {
        return (com.google.android.gms.internal.firebase-auth-api.zzakn.zze(((long) p3)) + com.google.android.gms.internal.firebase-auth-api.zzakn.zzi((p2 << 3)));
    }

    public static int zza(int p0, long p1)
    {
        return (com.google.android.gms.internal.firebase-auth-api.zzakn.zzi((p0 << 3)) + 8);
    }

    public static int zza(int p1, com.google.android.gms.internal.firebase-auth-api.zzajv p2)
    {
        int v1_2 = com.google.android.gms.internal.firebase-auth-api.zzakn.zzi((p1 << 3));
        int v2_1 = p2.zzb();
        return ((com.google.android.gms.internal.firebase-auth-api.zzakn.zzi(v2_1) + v2_1) + v1_2);
    }

    public static int zza(int p2, com.google.android.gms.internal.firebase-auth-api.zzalu p3)
    {
        return (com.google.android.gms.internal.firebase-auth-api.zzakn.zzb(3, p3) + (com.google.android.gms.internal.firebase-auth-api.zzakn.zzf(2, p2) + (com.google.android.gms.internal.firebase-auth-api.zzakn.zzi(8) << 1)));
    }

    public static int zza(int p2, com.google.android.gms.internal.firebase-auth-api.zzamm p3)
    {
        return ((com.google.android.gms.internal.firebase-auth-api.zzakn.zza(p3) + com.google.android.gms.internal.firebase-auth-api.zzakn.zzi(24)) + (com.google.android.gms.internal.firebase-auth-api.zzakn.zzf(2, p2) + (com.google.android.gms.internal.firebase-auth-api.zzakn.zzi(8) << 1)));
    }

    public static int zza(int p0, String p1)
    {
        return (com.google.android.gms.internal.firebase-auth-api.zzakn.zza(p1) + com.google.android.gms.internal.firebase-auth-api.zzakn.zzi((p0 << 3)));
    }

    public static int zza(int p0, boolean p1)
    {
        return (com.google.android.gms.internal.firebase-auth-api.zzakn.zzi((p0 << 3)) + 1);
    }

    public static int zza(long p0)
    {
        return 8;
    }

    public static int zza(com.google.android.gms.internal.firebase-auth-api.zzajv p1)
    {
        int v1_1 = p1.zzb();
        return (com.google.android.gms.internal.firebase-auth-api.zzakn.zzi(v1_1) + v1_1);
    }

    public static int zza(com.google.android.gms.internal.firebase-auth-api.zzalu p1)
    {
        int v1_1 = p1.zza();
        return (com.google.android.gms.internal.firebase-auth-api.zzakn.zzi(v1_1) + v1_1);
    }

    public static int zza(com.google.android.gms.internal.firebase-auth-api.zzamm p1)
    {
        int v1_1 = p1.zzl();
        return (com.google.android.gms.internal.firebase-auth-api.zzakn.zzi(v1_1) + v1_1);
    }

    public static int zza(String p1)
    {
        try {
            int v1_1 = com.google.android.gms.internal.firebase-auth-api.zzaoa.zza(p1);
        } catch (com.google.android.gms.internal.firebase-auth-api.zzaod) {
            v1_1 = v1_1.getBytes(com.google.android.gms.internal.firebase-auth-api.zzalh.zza).length;
        }
        return (com.google.android.gms.internal.firebase-auth-api.zzakn.zzi(v1_1) + v1_1);
    }

    public static int zza(boolean p0)
    {
        return 1;
    }

    public static int zza(byte[] p1)
    {
        int v1_1 = p1.length;
        return (com.google.android.gms.internal.firebase-auth-api.zzakn.zzi(v1_1) + v1_1);
    }

    public static com.google.android.gms.internal.firebase-auth-api.zzakn zza(java.io.OutputStream p1, int p2)
    {
        return new com.google.android.gms.internal.firebase-auth-api.zzakn$zzc(p1, p2);
    }

    public static int zzb(int p0)
    {
        return 4;
    }

    public static int zzb(int p0, int p1)
    {
        return (com.google.android.gms.internal.firebase-auth-api.zzakn.zzi((p0 << 3)) + 4);
    }

    public static int zzb(int p0, long p1)
    {
        return (com.google.android.gms.internal.firebase-auth-api.zzakn.zze(p1) + com.google.android.gms.internal.firebase-auth-api.zzakn.zzi((p0 << 3)));
    }

    public static int zzb(int p2, com.google.android.gms.internal.firebase-auth-api.zzajv p3)
    {
        return (com.google.android.gms.internal.firebase-auth-api.zzakn.zza(3, p3) + (com.google.android.gms.internal.firebase-auth-api.zzakn.zzf(2, p2) + (com.google.android.gms.internal.firebase-auth-api.zzakn.zzi(8) << 1)));
    }

    public static int zzb(int p1, com.google.android.gms.internal.firebase-auth-api.zzalu p2)
    {
        int v1_2 = com.google.android.gms.internal.firebase-auth-api.zzakn.zzi((p1 << 3));
        int v2_1 = p2.zza();
        return ((com.google.android.gms.internal.firebase-auth-api.zzakn.zzi(v2_1) + v2_1) + v1_2);
    }

    public static int zzb(long p0)
    {
        return com.google.android.gms.internal.firebase-auth-api.zzakn.zze(p0);
    }

    public static com.google.android.gms.internal.firebase-auth-api.zzakn zzb(byte[] p3)
    {
        return new com.google.android.gms.internal.firebase-auth-api.zzakn$zza(p3, 0, p3.length);
    }

    public static int zzc(int p2)
    {
        return com.google.android.gms.internal.firebase-auth-api.zzakn.zze(((long) p2));
    }

    public static int zzc(int p2, int p3)
    {
        return (com.google.android.gms.internal.firebase-auth-api.zzakn.zze(((long) p3)) + com.google.android.gms.internal.firebase-auth-api.zzakn.zzi((p2 << 3)));
    }

    public static int zzc(int p0, long p1)
    {
        return (com.google.android.gms.internal.firebase-auth-api.zzakn.zzi((p0 << 3)) + 8);
    }

    public static int zzc(long p0)
    {
        return 8;
    }

    public static int zzd(int p1)
    {
        return (com.google.android.gms.internal.firebase-auth-api.zzakn.zzi(p1) + p1);
    }

    public static int zzd(int p0, int p1)
    {
        return (com.google.android.gms.internal.firebase-auth-api.zzakn.zzi((p0 << 3)) + 4);
    }

    public static int zzd(int p0, long p1)
    {
        return (com.google.android.gms.internal.firebase-auth-api.zzakn.zze(com.google.android.gms.internal.firebase-auth-api.zzakn.zzi(p1)) + com.google.android.gms.internal.firebase-auth-api.zzakn.zzi((p0 << 3)));
    }

    public static int zzd(long p0)
    {
        return com.google.android.gms.internal.firebase-auth-api.zzakn.zze(com.google.android.gms.internal.firebase-auth-api.zzakn.zzi(p0));
    }

    public static bridge synthetic boolean zzd()
    {
        return com.google.android.gms.internal.firebase-auth-api.zzakn.zzc;
    }

    public static int zze(int p1)
    {
        if (p1 <= 4096) {
            return p1;
        } else {
            return 4096;
        }
    }

    public static int zze(int p0, int p1)
    {
        return (com.google.android.gms.internal.firebase-auth-api.zzakn.zzi(com.google.android.gms.internal.firebase-auth-api.zzakn.zzn(p1)) + com.google.android.gms.internal.firebase-auth-api.zzakn.zzi((p0 << 3)));
    }

    public static int zze(int p0, long p1)
    {
        return (com.google.android.gms.internal.firebase-auth-api.zzakn.zze(p1) + com.google.android.gms.internal.firebase-auth-api.zzakn.zzi((p0 << 3)));
    }

    public static int zze(long p0)
    {
        return ((640 - (Long.numberOfLeadingZeros(p0) * 9)) >> 6);
    }

    public static int zzf(int p0)
    {
        return 4;
    }

    public static int zzf(int p0, int p1)
    {
        return (com.google.android.gms.internal.firebase-auth-api.zzakn.zzi(p1) + com.google.android.gms.internal.firebase-auth-api.zzakn.zzi((p0 << 3)));
    }

    public static int zzg(int p0)
    {
        return com.google.android.gms.internal.firebase-auth-api.zzakn.zzi(com.google.android.gms.internal.firebase-auth-api.zzakn.zzn(p0));
    }

    public static int zzh(int p0)
    {
        return com.google.android.gms.internal.firebase-auth-api.zzakn.zzi((p0 << 3));
    }

    public static int zzi(int p0)
    {
        return ((352 - (Integer.numberOfLeadingZeros(p0) * 9)) >> 6);
    }

    private static long zzi(long p3)
    {
        return ((p3 >> 63) ^ (p3 << 1));
    }

    private static int zzn(int p1)
    {
        return ((p1 >> 31) ^ (p1 << 1));
    }

    public abstract int zza();

    public abstract void zza();

    public final void zza(String p7, com.google.android.gms.internal.firebase-auth-api.zzaod p8)
    {
        com.google.android.gms.internal.firebase-auth-api.zzakn.zzb.logp(java.util.logging.Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", p8);
        IndexOutOfBoundsException v7_2 = p7.getBytes(com.google.android.gms.internal.firebase-auth-api.zzalh.zza);
        try {
            this.zzm(v7_2.length);
            this.zza(v7_2, 0, v7_2.length);
            return;
        } catch (IndexOutOfBoundsException v0_2) {
            throw new com.google.android.gms.internal.firebase-auth-api.zzakn$zzd(v0_2);
        }
    }

    public final void zzb()
    {
        if (this.zza() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        } else {
            return;
        }
    }

    public final void zzb(double p1)
    {
        this.zzf(Double.doubleToRawLongBits(p1));
        return;
    }

    public final void zzb(float p1)
    {
        this.zzj(Float.floatToRawIntBits(p1));
        return;
    }

    public final void zzb(int p1, double p2)
    {
        this.zzf(p1, Double.doubleToRawLongBits(p2));
        return;
    }

    public final void zzb(int p1, float p2)
    {
        this.zzg(p1, Float.floatToRawIntBits(p2));
        return;
    }

    public abstract void zzb();

    public abstract void zzb();

    public abstract void zzb();

    public abstract void zzb();

    public abstract void zzb();

    public abstract void zzb();

    public final void zzb(boolean p1)
    {
        this.zza(((byte) p1));
        return;
    }

    public abstract void zzb();

    public abstract void zzc();

    public abstract void zzc();

    public abstract void zzd();

    public abstract void zzf();

    public abstract void zzf();

    public abstract void zzg();

    public final void zzg(int p1, long p2)
    {
        this.zzh(p1, com.google.android.gms.internal.firebase-auth-api.zzakn.zzi(p2));
        return;
    }

    public final void zzg(long p1)
    {
        this.zzh(com.google.android.gms.internal.firebase-auth-api.zzakn.zzi(p1));
        return;
    }

    public abstract void zzh();

    public abstract void zzh();

    public abstract void zzh();

    public final void zzi(int p1, int p2)
    {
        this.zzk(p1, com.google.android.gms.internal.firebase-auth-api.zzakn.zzn(p2));
        return;
    }

    public abstract void zzj();

    public abstract void zzj();

    public abstract void zzk();

    public abstract void zzk();

    public final void zzl(int p1)
    {
        this.zzm(com.google.android.gms.internal.firebase-auth-api.zzakn.zzn(p1));
        return;
    }

    public abstract void zzm();
}
