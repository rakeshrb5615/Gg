package com.google.android.gms.internal.measurement;
public final class zzgl extends com.google.android.gms.internal.measurement.zzmf implements com.google.android.gms.internal.measurement.zznn {
    private static final com.google.android.gms.internal.measurement.zzgl zzu;
    private int zzb;
    private long zzd;
    private String zze;
    private int zzf;
    private com.google.android.gms.internal.measurement.zzmo zzg;
    private com.google.android.gms.internal.measurement.zzmo zzh;
    private com.google.android.gms.internal.measurement.zzmo zzi;
    private String zzj;
    private boolean zzk;
    private com.google.android.gms.internal.measurement.zzmo zzl;
    private com.google.android.gms.internal.measurement.zzmo zzm;
    private String zzn;
    private String zzo;
    private com.google.android.gms.internal.measurement.zzgf zzp;
    private com.google.android.gms.internal.measurement.zzgp zzq;
    private com.google.android.gms.internal.measurement.zzgv zzr;
    private com.google.android.gms.internal.measurement.zzgr zzs;
    private com.google.android.gms.internal.measurement.zzgn zzt;

    static zzgl()
    {
        com.google.android.gms.internal.measurement.zzgl v0_1 = new com.google.android.gms.internal.measurement.zzgl();
        com.google.android.gms.internal.measurement.zzgl.zzu = v0_1;
        com.google.android.gms.internal.measurement.zzmf.zzcp(com.google.android.gms.internal.measurement.zzgl, v0_1);
        return;
    }

    private zzgl()
    {
        this.zze = "";
        this.zzg = com.google.android.gms.internal.measurement.zzmf.zzcv();
        this.zzh = com.google.android.gms.internal.measurement.zzmf.zzcv();
        this.zzi = com.google.android.gms.internal.measurement.zzmf.zzcv();
        this.zzj = "";
        this.zzl = com.google.android.gms.internal.measurement.zzmf.zzcv();
        this.zzm = com.google.android.gms.internal.measurement.zzmf.zzcv();
        this.zzn = "";
        this.zzo = "";
        return;
    }

    public static com.google.android.gms.internal.measurement.zzgk zzr()
    {
        return ((com.google.android.gms.internal.measurement.zzgk) com.google.android.gms.internal.measurement.zzgl.zzu.zzck());
    }

    public static com.google.android.gms.internal.measurement.zzgl zzs()
    {
        return com.google.android.gms.internal.measurement.zzgl.zzu;
    }

    public static synthetic com.google.android.gms.internal.measurement.zzgl zzw()
    {
        return com.google.android.gms.internal.measurement.zzgl.zzu;
    }

    public final boolean zza()
    {
        if ((this.zzb & 1) == 0) {
            return 0;
        } else {
            return 1;
        }
    }

    public final long zzb()
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

    public final java.util.List zze()
    {
        return this.zzg;
    }

    public final int zzf()
    {
        return this.zzh.size();
    }

    public final com.google.android.gms.internal.measurement.zzgj zzg(int p2)
    {
        return ((com.google.android.gms.internal.measurement.zzgj) this.zzh.get(p2));
    }

    public final java.util.List zzh()
    {
        return this.zzi;
    }

    public final java.util.List zzi()
    {
        return this.zzl;
    }

    public final int zzj()
    {
        return this.zzl.size();
    }

    public final java.util.List zzk()
    {
        return this.zzm;
    }

    public final Object zzl(int p25, Object p26, Object p27)
    {
        com.google.android.gms.internal.measurement.zzgl v0_0 = (p25 - 1);
        if (v0_0 == null) {
            return Byte.valueOf(1);
        } else {
            if (v0_0 == 2) {
                String v3 = "zze";
                String v5 = "zzg";
                String v7 = "zzh";
                String v9 = "zzi";
                String v11 = "zzj";
                String v13 = "zzl";
                String v15 = "zzm";
                String v17 = "zzn";
                String v19 = "zzp";
                String v21 = "zzr";
                return com.google.android.gms.internal.measurement.zzmf.zzcq(com.google.android.gms.internal.measurement.zzgl.zzu, "\u0004\u0011\u0000\u0001\u0001\u0013\u0011\u0000\u0005\u0000\u0001\u1002\u0000\u0002\u1008\u0001\u0003\u1004\u0002\u0004\u001b\u0005\u001b\u0006\u001b\u0007\u1008\u0003\u0008\u1007\u0004\t\u001b\n\u001b\u000b\u1008\u0005\u000e\u1008\u0006\u000f\u1009\u0007\u0010\u1009\u0008\u0011\u1009\t\u0012\u1009\n\u0013\u1009\u000b", new Object[] {"zzb", "zzt"}));
            } else {
                if (v0_0 == 3) {
                    return new com.google.android.gms.internal.measurement.zzgl();
                } else {
                    if (v0_0 == 4) {
                        return new com.google.android.gms.internal.measurement.zzgk(0);
                    } else {
                        if (v0_0 != 5) {
                            throw 0;
                        } else {
                            return com.google.android.gms.internal.measurement.zzgl.zzu;
                        }
                    }
                }
            }
        }
    }

    public final String zzm()
    {
        return this.zzn;
    }

    public final boolean zzn()
    {
        if ((this.zzb & 128) == 0) {
            return 0;
        } else {
            return 1;
        }
    }

    public final com.google.android.gms.internal.measurement.zzgf zzo()
    {
        com.google.android.gms.internal.measurement.zzgf v0 = this.zzp;
        if (v0 == null) {
            v0 = com.google.android.gms.internal.measurement.zzgf.zzg();
        }
        return v0;
    }

    public final boolean zzp()
    {
        if ((this.zzb & 512) == 0) {
            return 0;
        } else {
            return 1;
        }
    }

    public final com.google.android.gms.internal.measurement.zzgv zzq()
    {
        com.google.android.gms.internal.measurement.zzgv v0 = this.zzr;
        if (v0 == null) {
            v0 = com.google.android.gms.internal.measurement.zzgv.zze();
        }
        return v0;
    }

    public final synthetic void zzt(int p3, com.google.android.gms.internal.measurement.zzgj p4)
    {
        p4.getClass();
        com.google.android.gms.internal.measurement.zzmo v0_0 = this.zzh;
        if (!v0_0.zza()) {
            this.zzh = com.google.android.gms.internal.measurement.zzmf.zzcw(v0_0);
        }
        this.zzh.set(p3, p4);
        return;
    }

    public final synthetic void zzu()
    {
        this.zzi = com.google.android.gms.internal.measurement.zzmf.zzcv();
        return;
    }

    public final synthetic void zzv()
    {
        this.zzl = com.google.android.gms.internal.measurement.zzmf.zzcv();
        return;
    }
}
