package com.google.android.recaptcha.internal;
public abstract class zzli {
    public static final synthetic int zzd = 0;
    private static volatile int zze = 100;
    int zza;
    final int zzb;
    com.google.android.recaptcha.internal.zzlj zzc;

    private zzli()
    {
        this.zzb = com.google.android.recaptcha.internal.zzli.zze;
        return;
    }

    public synthetic zzli(com.google.android.recaptcha.internal.zzlh p1)
    {
        this.zzb = com.google.android.recaptcha.internal.zzli.zze;
        return;
    }

    public static int zzF(int p1)
    {
        return ((p1 >> 1) ^ (- (p1 & 1)));
    }

    public static long zzG(long p3)
    {
        return ((p3 >> 1) ^ (- (1 & p3)));
    }

    public static com.google.android.recaptcha.internal.zzli zzH(byte[] p6, int p7, int p8, boolean p9)
    {
        com.google.android.recaptcha.internal.zznn v0_2 = new com.google.android.recaptcha.internal.zzlf(p6, 0, 0, 0, 0);
        try {
            v0_2.zze(0);
            return v0_2;
        } catch (com.google.android.recaptcha.internal.zznn v0_1) {
            throw new IllegalArgumentException(v0_1);
        }
    }

    public abstract void zzA();

    public abstract boolean zzC();

    public abstract boolean zzD();

    public abstract boolean zzE();

    public final void zzI()
    {
        do {
            com.google.android.recaptcha.internal.zznn v0_0 = this.zzm();
            if (v0_0 == null) {
                break;
            }
            String v1_3 = this.zza;
            if (v1_3 >= this.zzb) {
                throw new com.google.android.recaptcha.internal.zznn("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
            } else {
                this.zza = (v1_3 + 1);
                com.google.android.recaptcha.internal.zznn v0_1 = this.zzE(v0_0);
                this.zza = (this.zza - 1);
            }
        } while(v0_1 != null);
        return;
    }

    public abstract double zzb();

    public abstract float zzc();

    public abstract int zzd();

    public abstract int zze();

    public abstract int zzf();

    public abstract int zzg();

    public abstract int zzh();

    public abstract int zzk();

    public abstract int zzl();

    public abstract int zzm();

    public abstract int zzn();

    public abstract long zzo();

    public abstract long zzp();

    public abstract long zzt();

    public abstract long zzu();

    public abstract long zzv();

    public abstract com.google.android.recaptcha.internal.zzle zzw();

    public abstract String zzx();

    public abstract String zzy();

    public abstract void zzz();
}
