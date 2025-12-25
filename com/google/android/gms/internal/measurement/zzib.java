package com.google.android.gms.internal.measurement;
public final class zzib extends com.google.android.gms.internal.measurement.zzmf implements com.google.android.gms.internal.measurement.zznn {
    private static final com.google.android.gms.internal.measurement.zzib zzh;
    private int zzb;
    private com.google.android.gms.internal.measurement.zzmo zzd;
    private String zze;
    private String zzf;
    private int zzg;

    static zzib()
    {
        com.google.android.gms.internal.measurement.zzib v0_1 = new com.google.android.gms.internal.measurement.zzib();
        com.google.android.gms.internal.measurement.zzib.zzh = v0_1;
        com.google.android.gms.internal.measurement.zzmf.zzcp(com.google.android.gms.internal.measurement.zzib, v0_1);
        return;
    }

    private zzib()
    {
        this.zzd = com.google.android.gms.internal.measurement.zzmf.zzcv();
        this.zze = "";
        this.zzf = "";
        return;
    }

    public static com.google.android.gms.internal.measurement.zzhz zzh()
    {
        return ((com.google.android.gms.internal.measurement.zzhz) com.google.android.gms.internal.measurement.zzib.zzh.zzck());
    }

    public static com.google.android.gms.internal.measurement.zzhz zzi(com.google.android.gms.internal.measurement.zzib p1)
    {
        com.google.android.gms.internal.measurement.zzhz v0_1 = com.google.android.gms.internal.measurement.zzib.zzh.zzck();
        v0_1.zzbd(p1);
        return ((com.google.android.gms.internal.measurement.zzhz) v0_1);
    }

    public static synthetic com.google.android.gms.internal.measurement.zzib zzq()
    {
        return com.google.android.gms.internal.measurement.zzib.zzh;
    }

    private final void zzr()
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

    public final com.google.android.gms.internal.measurement.zzid zzc(int p2)
    {
        return ((com.google.android.gms.internal.measurement.zzid) this.zzd.get(p2));
    }

    public final boolean zzd()
    {
        if ((this.zzb & 1) == 0) {
            return 0;
        } else {
            return 1;
        }
    }

    public final String zze()
    {
        return this.zze;
    }

    public final boolean zzf()
    {
        if ((this.zzb & 2) == 0) {
            return 0;
        } else {
            return 1;
        }
    }

    public final String zzg()
    {
        return this.zzf;
    }

    public final synthetic void zzj(int p2, com.google.android.gms.internal.measurement.zzid p3)
    {
        p3.getClass();
        this.zzr();
        this.zzd.set(p2, p3);
        return;
    }

    public final synthetic void zzk(com.google.android.gms.internal.measurement.zzid p2)
    {
        p2.getClass();
        this.zzr();
        this.zzd.add(p2);
        return;
    }

    public final Object zzl(int p8, Object p9, Object p10)
    {
        com.google.android.gms.internal.measurement.zzib v8_1 = (p8 - 1);
        if (v8_1 == null) {
            return Byte.valueOf(1);
        } else {
            if (v8_1 == 2) {
                Class v2 = com.google.android.gms.internal.measurement.zzid;
                String v4 = "zzf";
                return com.google.android.gms.internal.measurement.zzmf.zzcq(com.google.android.gms.internal.measurement.zzib.zzh, "\u0004\u0004\u0000\u0001\u0001\t\u0004\u0000\u0001\u0000\u0001\u001b\u0007\u1008\u0000\u0008\u1008\u0001\t\u180c\u0002", new Object[] {"zzb", com.google.android.gms.internal.measurement.zzia.zza}));
            } else {
                if (v8_1 == 3) {
                    return new com.google.android.gms.internal.measurement.zzib();
                } else {
                    if (v8_1 == 4) {
                        return new com.google.android.gms.internal.measurement.zzhz(0);
                    } else {
                        if (v8_1 != 5) {
                            throw 0;
                        } else {
                            return com.google.android.gms.internal.measurement.zzib.zzh;
                        }
                    }
                }
            }
        }
    }

    public final synthetic void zzm(Iterable p2)
    {
        this.zzr();
        com.google.android.gms.internal.measurement.zzks.zzce(p2, this.zzd);
        return;
    }

    public final synthetic void zzn()
    {
        this.zzd = com.google.android.gms.internal.measurement.zzmf.zzcv();
        return;
    }

    public final synthetic void zzo(String p2)
    {
        p2.getClass();
        this.zzb = (this.zzb | 1);
        this.zze = p2;
        return;
    }

    public final synthetic void zzp(String p2)
    {
        p2.getClass();
        this.zzb = (this.zzb | 2);
        this.zzf = p2;
        return;
    }
}
