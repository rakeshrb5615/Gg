package com.google.android.gms.internal.measurement;
public final class zzhs extends com.google.android.gms.internal.measurement.zzmf implements com.google.android.gms.internal.measurement.zznn {
    private static final com.google.android.gms.internal.measurement.zzhs zzj;
    private int zzb;
    private com.google.android.gms.internal.measurement.zzmo zzd;
    private String zze;
    private long zzf;
    private long zzg;
    private int zzh;
    private long zzi;

    static zzhs()
    {
        com.google.android.gms.internal.measurement.zzhs v0_1 = new com.google.android.gms.internal.measurement.zzhs();
        com.google.android.gms.internal.measurement.zzhs.zzj = v0_1;
        com.google.android.gms.internal.measurement.zzmf.zzcp(com.google.android.gms.internal.measurement.zzhs, v0_1);
        return;
    }

    private zzhs()
    {
        this.zzd = com.google.android.gms.internal.measurement.zzmf.zzcv();
        this.zze = "";
        return;
    }

    public static com.google.android.gms.internal.measurement.zzhr zzk()
    {
        return ((com.google.android.gms.internal.measurement.zzhr) com.google.android.gms.internal.measurement.zzhs.zzj.zzck());
    }

    public static synthetic com.google.android.gms.internal.measurement.zzhs zzv()
    {
        return com.google.android.gms.internal.measurement.zzhs.zzj;
    }

    private final void zzw()
    {
        com.google.android.gms.internal.measurement.zzmo v0_0 = this.zzd;
        if (!v0_0.zza()) {
            this.zzd = com.google.android.gms.internal.measurement.zzmf.zzcw(v0_0);
        }
        return;
    }

    public final java.util.List zza()
    {
        return this.zzd;
    }

    public final int zzb()
    {
        return this.zzd.size();
    }

    public final com.google.android.gms.internal.measurement.zzhw zzc(int p2)
    {
        return ((com.google.android.gms.internal.measurement.zzhw) this.zzd.get(p2));
    }

    public final String zzd()
    {
        return this.zze;
    }

    public final boolean zze()
    {
        if ((this.zzb & 2) == 0) {
            return 0;
        } else {
            return 1;
        }
    }

    public final long zzf()
    {
        return this.zzf;
    }

    public final boolean zzg()
    {
        if ((this.zzb & 4) == 0) {
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
        if ((this.zzb & 8) == 0) {
            return 0;
        } else {
            return 1;
        }
    }

    public final int zzj()
    {
        return this.zzh;
    }

    public final Object zzl(int p9, Object p10, Object p11)
    {
        com.google.android.gms.internal.measurement.zzhs v9_1 = (p9 - 1);
        if (v9_1 == null) {
            return Byte.valueOf(1);
        } else {
            if (v9_1 == 2) {
                Class v2 = com.google.android.gms.internal.measurement.zzhw;
                String v4 = "zzf";
                return com.google.android.gms.internal.measurement.zzmf.zzcq(com.google.android.gms.internal.measurement.zzhs.zzj, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001\u001b\u0002\u1008\u0000\u0003\u1002\u0001\u0004\u1002\u0002\u0005\u1004\u0003\u0006\u1002\u0004", new Object[] {"zzb", "zzi"}));
            } else {
                if (v9_1 == 3) {
                    return new com.google.android.gms.internal.measurement.zzhs();
                } else {
                    if (v9_1 == 4) {
                        return new com.google.android.gms.internal.measurement.zzhr(0);
                    } else {
                        if (v9_1 != 5) {
                            throw 0;
                        } else {
                            return com.google.android.gms.internal.measurement.zzhs.zzj;
                        }
                    }
                }
            }
        }
    }

    public final synthetic void zzm(int p2, com.google.android.gms.internal.measurement.zzhw p3)
    {
        p3.getClass();
        this.zzw();
        this.zzd.set(p2, p3);
        return;
    }

    public final synthetic void zzn(com.google.android.gms.internal.measurement.zzhw p2)
    {
        p2.getClass();
        this.zzw();
        this.zzd.add(p2);
        return;
    }

    public final synthetic void zzo(Iterable p2)
    {
        this.zzw();
        com.google.android.gms.internal.measurement.zzks.zzce(p2, this.zzd);
        return;
    }

    public final synthetic void zzp()
    {
        this.zzd = com.google.android.gms.internal.measurement.zzmf.zzcv();
        return;
    }

    public final synthetic void zzq(int p2)
    {
        this.zzw();
        this.zzd.remove(p2);
        return;
    }

    public final synthetic void zzr(String p2)
    {
        p2.getClass();
        this.zzb = (this.zzb | 1);
        this.zze = p2;
        return;
    }

    public final synthetic void zzs(long p2)
    {
        this.zzb = (this.zzb | 2);
        this.zzf = p2;
        return;
    }

    public final synthetic void zzt(long p2)
    {
        this.zzb = (this.zzb | 4);
        this.zzg = p2;
        return;
    }

    public final synthetic void zzu(long p2)
    {
        this.zzb = (this.zzb | 16);
        this.zzi = p2;
        return;
    }
}
