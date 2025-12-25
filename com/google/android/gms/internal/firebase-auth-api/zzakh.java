package com.google.android.gms.internal.firebase-auth-api;
public abstract class zzakh {
    private static volatile int zzd = 100;
    int zza;
    int zzb;
    com.google.android.gms.internal.firebase-auth-api.zzakl zzc;
    private int zze;
    private int zzf;

    private zzakh()
    {
        this.zzf = com.google.android.gms.internal.firebase-auth-api.zzakh.zzd;
        this.zzb = 2147483647;
        return;
    }

    public synthetic zzakh(com.google.android.gms.internal.firebase-auth-api.zzakm p1)
    {
        return;
    }

    public static int zza(int p1)
    {
        return ((- (p1 & 1)) ^ (p1 >> 1));
    }

    public static long zza(long p4)
    {
        return ((- (p4 & 1)) ^ (p4 >> 1));
    }

    public static com.google.android.gms.internal.firebase-auth-api.zzakh zza(byte[] p6, int p7, int p8, boolean p9)
    {
        com.google.android.gms.internal.firebase-auth-api.zzall v0_1 = new com.google.android.gms.internal.firebase-auth-api.zzakk(p6, p7, p8, p9, 0);
        try {
            v0_1.zzb(p8);
            return v0_1;
        } catch (com.google.android.gms.internal.firebase-auth-api.zzall v0_2) {
            throw new IllegalArgumentException(v0_2);
        }
    }

    public abstract double zza();

    public abstract float zzb();

    public abstract int zzb();

    public abstract int zzc();

    public abstract void zzc();

    public abstract int zzd();

    public abstract void zzd();

    public abstract int zze();

    public abstract boolean zze();

    public abstract int zzf();

    public abstract int zzg();

    public abstract int zzh();

    public abstract int zzi();

    public abstract int zzj();

    public abstract long zzk();

    public abstract long zzl();

    public abstract long zzm();

    public abstract long zzn();

    public abstract long zzo();

    public abstract long zzp();

    public abstract com.google.android.gms.internal.firebase-auth-api.zzajv zzq();

    public abstract String zzr();

    public abstract String zzs();

    public final void zzt()
    {
        if ((this.zza + this.zze) >= this.zzf) {
            throw com.google.android.gms.internal.firebase-auth-api.zzall.zzh();
        } else {
            return;
        }
    }

    public final void zzu()
    {
        if (this.zze == 0) {
            this.zzc(0);
        }
        return;
    }

    public final void zzv()
    {
        do {
            boolean v0_0 = this.zzi();
            if (!v0_0) {
                break;
            }
            this.zzt();
            this.zze = (this.zze + 1);
            boolean v0_1 = this.zze(v0_0);
            this.zze = (this.zze - 1);
        } while(v0_1);
        return;
    }

    public abstract boolean zzw();

    public abstract boolean zzx();
}
