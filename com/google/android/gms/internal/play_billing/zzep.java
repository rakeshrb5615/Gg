package com.google.android.gms.internal.play_billing;
public abstract class zzep extends com.google.android.gms.internal.play_billing.zzdz {
    public static final synthetic int zzb;
    private static final java.util.logging.Logger zzc;
    private static final boolean zzd;
    com.google.android.gms.internal.play_billing.zzeq zza;

    static zzep()
    {
        com.google.android.gms.internal.play_billing.zzep.zzc = java.util.logging.Logger.getLogger(com.google.android.gms.internal.play_billing.zzep.getName());
        com.google.android.gms.internal.play_billing.zzep.zzd = com.google.android.gms.internal.play_billing.zzho.zzx();
        return;
    }

    private zzep()
    {
        throw 0;
    }

    public synthetic zzep(com.google.android.gms.internal.play_billing.zzeo p1)
    {
        return;
    }

    public static int zzA(com.google.android.gms.internal.play_billing.zzgl p0, com.google.android.gms.internal.play_billing.zzgv p1)
    {
        int v0_2 = ((com.google.android.gms.internal.play_billing.zzds) p0).zze(p1);
        return (com.google.android.gms.internal.play_billing.zzep.zzC(v0_2) + v0_2);
    }

    public static int zzB(String p1)
    {
        try {
            int v1_1 = com.google.android.gms.internal.play_billing.zzhr.zzc(p1);
        } catch (com.google.android.gms.internal.play_billing.zzhq) {
            v1_1 = v1_1.getBytes(com.google.android.gms.internal.play_billing.zzfo.zza).length;
        }
        return (com.google.android.gms.internal.play_billing.zzep.zzC(v1_1) + v1_1);
    }

    public static int zzC(int p0)
    {
        return ((352 - (Integer.numberOfLeadingZeros(p0) * 9)) >> 6);
    }

    public static int zzD(long p0)
    {
        return ((640 - (Long.numberOfLeadingZeros(p0) * 9)) >> 6);
    }

    public static bridge synthetic boolean zzG()
    {
        return com.google.android.gms.internal.play_billing.zzep.zzd;
    }

    public static int zzy(int p0, com.google.android.gms.internal.play_billing.zzgl p1, com.google.android.gms.internal.play_billing.zzgv p2)
    {
        return (((com.google.android.gms.internal.play_billing.zzds) p1).zze(p2) + (com.google.android.gms.internal.play_billing.zzep.zzC((p0 << 3)) + com.google.android.gms.internal.play_billing.zzep.zzC((p0 << 3))));
    }

    public static int zzz(com.google.android.gms.internal.play_billing.zzgl p1)
    {
        int v1_1 = p1.zzj();
        return (com.google.android.gms.internal.play_billing.zzep.zzC(v1_1) + v1_1);
    }

    public final void zzE()
    {
        if (this.zza() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        } else {
            return;
        }
    }

    public final void zzF(String p7, com.google.android.gms.internal.play_billing.zzhq p8)
    {
        com.google.android.gms.internal.play_billing.zzep.zzc.logp(java.util.logging.Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", p8);
        IndexOutOfBoundsException v7_2 = p7.getBytes(com.google.android.gms.internal.play_billing.zzfo.zza);
        try {
            com.google.android.gms.internal.play_billing.zzen v8_1 = v7_2.length;
            this.zzv(v8_1);
            this.zzm(v7_2, 0, v8_1);
            return;
        } catch (IndexOutOfBoundsException v0_2) {
            throw new com.google.android.gms.internal.play_billing.zzen(v0_2);
        }
    }

    public abstract int zza();

    public abstract void zzb();

    public abstract void zzd();

    public abstract void zze();

    public abstract void zzg();

    public abstract void zzh();

    public abstract void zzi();

    public abstract void zzj();

    public abstract void zzk();

    public abstract void zzl();

    public abstract void zzm();

    public abstract void zzn();

    public abstract void zzp();

    public abstract void zzq();

    public abstract void zzr();

    public abstract void zzt();

    public abstract void zzu();

    public abstract void zzv();

    public abstract void zzw();

    public abstract void zzx();
}
