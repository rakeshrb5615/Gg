package com.google.android.recaptcha.internal;
public abstract class zzln extends com.google.android.recaptcha.internal.zzkw {
    private static final java.util.logging.Logger zzb;
    private static final boolean zzc;
    com.google.android.recaptcha.internal.zzlo zza;

    static zzln()
    {
        com.google.android.recaptcha.internal.zzln.zzb = java.util.logging.Logger.getLogger(com.google.android.recaptcha.internal.zzln.getName());
        com.google.android.recaptcha.internal.zzln.zzc = com.google.android.recaptcha.internal.zzps.zzx();
        return;
    }

    private zzln()
    {
        throw 0;
    }

    public synthetic zzln(com.google.android.recaptcha.internal.zzlm p1)
    {
        return;
    }

    public static int zzA(int p0)
    {
        return ((352 - (Integer.numberOfLeadingZeros(p0) * 9)) >> 6);
    }

    public static int zzB(long p0)
    {
        return ((640 - (Long.numberOfLeadingZeros(p0) * 9)) >> 6);
    }

    public static bridge synthetic boolean zzE()
    {
        return com.google.android.recaptcha.internal.zzln.zzc;
    }

    public static int zzw(int p0, com.google.android.recaptcha.internal.zzoi p1, com.google.android.recaptcha.internal.zzow p2)
    {
        return (((com.google.android.recaptcha.internal.zzko) p1).zza(p2) + (com.google.android.recaptcha.internal.zzln.zzA((p0 << 3)) + com.google.android.recaptcha.internal.zzln.zzA((p0 << 3))));
    }

    public static int zzx(com.google.android.recaptcha.internal.zzoi p1)
    {
        int v1_1 = p1.zzo();
        return (com.google.android.recaptcha.internal.zzln.zzA(v1_1) + v1_1);
    }

    public static int zzy(com.google.android.recaptcha.internal.zzoi p0, com.google.android.recaptcha.internal.zzow p1)
    {
        int v0_2 = ((com.google.android.recaptcha.internal.zzko) p0).zza(p1);
        return (com.google.android.recaptcha.internal.zzln.zzA(v0_2) + v0_2);
    }

    public static int zzz(String p1)
    {
        try {
            int v1_1 = com.google.android.recaptcha.internal.zzpv.zzc(p1);
        } catch (com.google.android.recaptcha.internal.zzpu) {
            v1_1 = v1_1.getBytes(com.google.android.recaptcha.internal.zznl.zza).length;
        }
        return (com.google.android.recaptcha.internal.zzln.zzA(v1_1) + v1_1);
    }

    public final void zzC()
    {
        if (this.zza() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        } else {
            return;
        }
    }

    public final void zzD(String p7, com.google.android.recaptcha.internal.zzpu p8)
    {
        com.google.android.recaptcha.internal.zzln.zzb.logp(java.util.logging.Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", p8);
        IndexOutOfBoundsException v7_2 = p7.getBytes(com.google.android.recaptcha.internal.zznl.zza);
        try {
            com.google.android.recaptcha.internal.zzll v8_1 = v7_2.length;
            this.zzt(v8_1);
            this.zzl(v7_2, 0, v8_1);
            return;
        } catch (IndexOutOfBoundsException v0_2) {
            throw new com.google.android.recaptcha.internal.zzll(v0_2);
        }
    }

    public abstract int zza();

    public abstract void zzb();

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

    public abstract void zzr();

    public abstract void zzs();

    public abstract void zzt();

    public abstract void zzu();

    public abstract void zzv();
}
