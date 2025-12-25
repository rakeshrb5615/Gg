package com.google.android.gms.internal.measurement;
public final class zzha extends com.google.android.gms.internal.measurement.zzmf implements com.google.android.gms.internal.measurement.zznn {
    private static final com.google.android.gms.internal.measurement.zzha zzn;
    private int zzb;
    private String zzd;
    private String zze;
    private String zzf;
    private long zzg;
    private String zzh;
    private String zzi;
    private String zzj;
    private long zzk;
    private com.google.android.gms.internal.measurement.zzng zzl;
    private com.google.android.gms.internal.measurement.zzng zzm;

    static zzha()
    {
        com.google.android.gms.internal.measurement.zzha v0_1 = new com.google.android.gms.internal.measurement.zzha();
        com.google.android.gms.internal.measurement.zzha.zzn = v0_1;
        com.google.android.gms.internal.measurement.zzmf.zzcp(com.google.android.gms.internal.measurement.zzha, v0_1);
        return;
    }

    private zzha()
    {
        this.zzl = com.google.android.gms.internal.measurement.zzng.zza();
        this.zzm = com.google.android.gms.internal.measurement.zzng.zza();
        this.zzd = "";
        this.zze = "";
        this.zzf = "";
        this.zzh = "";
        this.zzi = "";
        this.zzj = "";
        return;
    }

    public static synthetic com.google.android.gms.internal.measurement.zzha zzJ()
    {
        return com.google.android.gms.internal.measurement.zzha.zzn;
    }

    public static com.google.android.gms.internal.measurement.zzgx zzr()
    {
        return ((com.google.android.gms.internal.measurement.zzgx) com.google.android.gms.internal.measurement.zzha.zzn.zzck());
    }

    public static com.google.android.gms.internal.measurement.zzha zzs()
    {
        return com.google.android.gms.internal.measurement.zzha.zzn;
    }

    public final synthetic void zzA(String p2)
    {
        this.zzb = (this.zzb | 16);
        this.zzh = p2;
        return;
    }

    public final synthetic void zzB()
    {
        this.zzb = (this.zzb & -17);
        this.zzh = com.google.android.gms.internal.measurement.zzha.zzn.zzh;
        return;
    }

    public final synthetic void zzC(String p2)
    {
        this.zzb = (this.zzb | 32);
        this.zzi = p2;
        return;
    }

    public final synthetic void zzD()
    {
        this.zzb = (this.zzb & -33);
        this.zzi = com.google.android.gms.internal.measurement.zzha.zzn.zzi;
        return;
    }

    public final synthetic void zzE(String p2)
    {
        this.zzb = (this.zzb | 64);
        this.zzj = p2;
        return;
    }

    public final synthetic void zzF()
    {
        this.zzb = (this.zzb & -65);
        this.zzj = com.google.android.gms.internal.measurement.zzha.zzn.zzj;
        return;
    }

    public final synthetic void zzG(long p2)
    {
        this.zzb = (this.zzb | 128);
        this.zzk = p2;
        return;
    }

    public final synthetic java.util.Map zzH()
    {
        if (!this.zzl.zze()) {
            this.zzl = this.zzl.zzc();
        }
        return this.zzl;
    }

    public final synthetic java.util.Map zzI()
    {
        if (!this.zzm.zze()) {
            this.zzm = this.zzm.zzc();
        }
        return this.zzm;
    }

    public final boolean zza()
    {
        if ((this.zzb & 1) == 0) {
            return 0;
        } else {
            return 1;
        }
    }

    public final String zzb()
    {
        return this.zzd;
    }

    public final boolean zzc()
    {
        if ((this.zzb & 2) == 0) {
            return 0;
        } else {
            return 1;
        }
    }

    public final String zzd()
    {
        return this.zze;
    }

    public final boolean zze()
    {
        if ((this.zzb & 4) == 0) {
            return 0;
        } else {
            return 1;
        }
    }

    public final String zzf()
    {
        return this.zzf;
    }

    public final boolean zzg()
    {
        if ((this.zzb & 8) == 0) {
            return 0;
        } else {
            return 1;
        }
    }

    public final long zzh()
    {
        return this.zzg;
    }

    public final boolean zzi()
    {
        if ((this.zzb & 16) == 0) {
            return 0;
        } else {
            return 1;
        }
    }

    public final String zzj()
    {
        return this.zzh;
    }

    public final boolean zzk()
    {
        if ((this.zzb & 32) == 0) {
            return 0;
        } else {
            return 1;
        }
    }

    public final Object zzl(int p14, Object p15, Object p16)
    {
        com.google.android.gms.internal.measurement.zzha v14_1 = (p14 - 1);
        if (v14_1 == null) {
            return Byte.valueOf(1);
        } else {
            if (v14_1 == 2) {
                String v11 = "zzm";
                String v2 = "zze";
                String v4 = "zzg";
                String v6 = "zzi";
                String v8 = "zzk";
                return com.google.android.gms.internal.measurement.zzmf.zzcq(com.google.android.gms.internal.measurement.zzha.zzn, "\u0004\n\u0000\u0001\u0001\n\n\u0002\u0000\u0000\u0001\u1008\u0000\u0002\u1008\u0001\u0003\u1008\u0002\u0004\u1002\u0003\u0005\u1008\u0004\u0006\u1008\u0005\u0007\u1008\u0006\u0008\u1002\u0007\t2\n2", new Object[] {"zzb", com.google.android.gms.internal.measurement.zzgz.zza}));
            } else {
                if (v14_1 == 3) {
                    return new com.google.android.gms.internal.measurement.zzha();
                } else {
                    if (v14_1 == 4) {
                        return new com.google.android.gms.internal.measurement.zzgx(0);
                    } else {
                        if (v14_1 != 5) {
                            throw 0;
                        } else {
                            return com.google.android.gms.internal.measurement.zzha.zzn;
                        }
                    }
                }
            }
        }
    }

    public final String zzm()
    {
        return this.zzi;
    }

    public final boolean zzn()
    {
        if ((this.zzb & 64) == 0) {
            return 0;
        } else {
            return 1;
        }
    }

    public final String zzo()
    {
        return this.zzj;
    }

    public final boolean zzp()
    {
        if ((this.zzb & 128) == 0) {
            return 0;
        } else {
            return 1;
        }
    }

    public final long zzq()
    {
        return this.zzk;
    }

    public final synthetic void zzt(String p2)
    {
        this.zzb = (this.zzb | 1);
        this.zzd = p2;
        return;
    }

    public final synthetic void zzu()
    {
        this.zzb = (this.zzb & -2);
        this.zzd = com.google.android.gms.internal.measurement.zzha.zzn.zzd;
        return;
    }

    public final synthetic void zzv(String p2)
    {
        this.zzb = (this.zzb | 2);
        this.zze = p2;
        return;
    }

    public final synthetic void zzw()
    {
        this.zzb = (this.zzb & -3);
        this.zze = com.google.android.gms.internal.measurement.zzha.zzn.zze;
        return;
    }

    public final synthetic void zzx(String p2)
    {
        this.zzb = (this.zzb | 4);
        this.zzf = p2;
        return;
    }

    public final synthetic void zzy()
    {
        this.zzb = (this.zzb & -5);
        this.zzf = com.google.android.gms.internal.measurement.zzha.zzn.zzf;
        return;
    }

    public final synthetic void zzz(long p2)
    {
        this.zzb = (this.zzb | 8);
        this.zzg = p2;
        return;
    }
}
