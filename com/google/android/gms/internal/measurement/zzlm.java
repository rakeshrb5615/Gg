package com.google.android.gms.internal.measurement;
public abstract class zzlm extends com.google.android.gms.internal.measurement.zzkz {
    public static final synthetic int zzb;
    private static final java.util.logging.Logger zzc;
    private static final boolean zzd;
    com.google.android.gms.internal.measurement.zzln zza;

    static zzlm()
    {
        com.google.android.gms.internal.measurement.zzlm.zzc = java.util.logging.Logger.getLogger(com.google.android.gms.internal.measurement.zzlm.getName());
        com.google.android.gms.internal.measurement.zzlm.zzd = com.google.android.gms.internal.measurement.zzop.zza();
        return;
    }

    private zzlm()
    {
        throw 0;
    }

    public synthetic zzlm(byte[] p1)
    {
        return;
    }

    public static int zzA(long p0)
    {
        return ((640 - (Long.numberOfLeadingZeros(p0) * 9)) >> 6);
    }

    public static int zzB(String p1)
    {
        try {
            int v1_1 = com.google.android.gms.internal.measurement.zzos.zzb(p1);
        } catch (com.google.android.gms.internal.measurement.zzor) {
            v1_1 = v1_1.getBytes(com.google.android.gms.internal.measurement.zzmp.zza).length;
        }
        return (com.google.android.gms.internal.measurement.zzlm.zzz(v1_1) + v1_1);
    }

    public static int zzC(com.google.android.gms.internal.measurement.zznm p1)
    {
        int v1_1 = p1.zzcn();
        return (com.google.android.gms.internal.measurement.zzlm.zzz(v1_1) + v1_1);
    }

    public static int zzD(com.google.android.gms.internal.measurement.zznm p0, com.google.android.gms.internal.measurement.zznx p1)
    {
        int v0_2 = ((com.google.android.gms.internal.measurement.zzks) p0).zzcd(p1);
        return (com.google.android.gms.internal.measurement.zzlm.zzz(v0_2) + v0_2);
    }

    public static int zzG(int p0, com.google.android.gms.internal.measurement.zznm p1, com.google.android.gms.internal.measurement.zznx p2)
    {
        return (((com.google.android.gms.internal.measurement.zzks) p1).zzcd(p2) + (com.google.android.gms.internal.measurement.zzlm.zzz((p0 << 3)) + com.google.android.gms.internal.measurement.zzlm.zzz((p0 << 3))));
    }

    public static synthetic boolean zzH()
    {
        return com.google.android.gms.internal.measurement.zzlm.zzd;
    }

    public static int zzz(int p0)
    {
        return ((352 - (Integer.numberOfLeadingZeros(p0) * 9)) >> 6);
    }

    public final void zzE()
    {
        if (this.zzy() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        } else {
            return;
        }
    }

    public final void zzF(String p7, com.google.android.gms.internal.measurement.zzor p8)
    {
        com.google.android.gms.internal.measurement.zzlm.zzc.logp(java.util.logging.Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", p8);
        IndexOutOfBoundsException v7_2 = p7.getBytes(com.google.android.gms.internal.measurement.zzmp.zza);
        try {
            com.google.android.gms.internal.measurement.zzll v8_1 = v7_2.length;
            this.zzr(v8_1);
            this.zzw(v7_2, 0, v8_1);
            return;
        } catch (IndexOutOfBoundsException v0_2) {
            throw new com.google.android.gms.internal.measurement.zzll(v0_2);
        }
    }

    public abstract void zza();

    public abstract void zzb();

    public abstract void zzc();

    public abstract void zzd();

    public abstract void zze();

    public abstract void zzf();

    public abstract void zzg();

    public abstract void zzh();

    public abstract void zzi();

    public abstract void zzj();

    public abstract void zzk();

    public abstract void zzl();

    public abstract void zzm();

    public abstract void zzn();

    public abstract void zzo();

    public abstract void zzp();

    public abstract void zzq();

    public abstract void zzr();

    public abstract void zzs();

    public abstract void zzt();

    public abstract void zzu();

    public abstract void zzw();

    public abstract void zzx();

    public abstract int zzy();
}
