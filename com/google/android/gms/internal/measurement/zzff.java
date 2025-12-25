package com.google.android.gms.internal.measurement;
public final class zzff extends com.google.android.gms.internal.measurement.zzmf implements com.google.android.gms.internal.measurement.zznn {
    private static final com.google.android.gms.internal.measurement.zzff zzl;
    private int zzb;
    private int zzd;
    private String zze;
    private com.google.android.gms.internal.measurement.zzmo zzf;
    private boolean zzg;
    private com.google.android.gms.internal.measurement.zzfl zzh;
    private boolean zzi;
    private boolean zzj;
    private boolean zzk;

    static zzff()
    {
        com.google.android.gms.internal.measurement.zzff v0_1 = new com.google.android.gms.internal.measurement.zzff();
        com.google.android.gms.internal.measurement.zzff.zzl = v0_1;
        com.google.android.gms.internal.measurement.zzmf.zzcp(com.google.android.gms.internal.measurement.zzff, v0_1);
        return;
    }

    private zzff()
    {
        this.zze = "";
        this.zzf = com.google.android.gms.internal.measurement.zzmf.zzcv();
        return;
    }

    public static com.google.android.gms.internal.measurement.zzfe zzn()
    {
        return ((com.google.android.gms.internal.measurement.zzfe) com.google.android.gms.internal.measurement.zzff.zzl.zzck());
    }

    public static synthetic com.google.android.gms.internal.measurement.zzff zzq()
    {
        return com.google.android.gms.internal.measurement.zzff.zzl;
    }

    public final boolean zza()
    {
        if ((this.zzb & 1) == 0) {
            return 0;
        } else {
            return 1;
        }
    }

    public final int zzb()
    {
        return this.zzd;
    }

    public final String zzc()
    {
        return this.zze;
    }

    public final java.util.List zzd()
    {
        return this.zzf;
    }

    public final int zze()
    {
        return this.zzf.size();
    }

    public final com.google.android.gms.internal.measurement.zzfh zzf(int p2)
    {
        return ((com.google.android.gms.internal.measurement.zzfh) this.zzf.get(p2));
    }

    public final boolean zzg()
    {
        if ((this.zzb & 8) == 0) {
            return 0;
        } else {
            return 1;
        }
    }

    public final com.google.android.gms.internal.measurement.zzfl zzh()
    {
        com.google.android.gms.internal.measurement.zzfl v0 = this.zzh;
        if (v0 == null) {
            v0 = com.google.android.gms.internal.measurement.zzfl.zzj();
        }
        return v0;
    }

    public final boolean zzi()
    {
        return this.zzi;
    }

    public final boolean zzj()
    {
        return this.zzj;
    }

    public final boolean zzk()
    {
        if ((this.zzb & 64) == 0) {
            return 0;
        } else {
            return 1;
        }
    }

    public final Object zzl(int p11, Object p12, Object p13)
    {
        com.google.android.gms.internal.measurement.zzff v11_1 = (p11 - 1);
        if (v11_1 == null) {
            return Byte.valueOf(1);
        } else {
            if (v11_1 == 2) {
                String v2 = "zze";
                Class v4 = com.google.android.gms.internal.measurement.zzfh;
                String v6 = "zzh";
                return com.google.android.gms.internal.measurement.zzmf.zzcq(com.google.android.gms.internal.measurement.zzff.zzl, "\u0004\u0008\u0000\u0001\u0001\u0008\u0008\u0000\u0001\u0000\u0001\u1004\u0000\u0002\u1008\u0001\u0003\u001b\u0004\u1007\u0002\u0005\u1009\u0003\u0006\u1007\u0004\u0007\u1007\u0005\u0008\u1007\u0006", new Object[] {"zzb", "zzk"}));
            } else {
                if (v11_1 == 3) {
                    return new com.google.android.gms.internal.measurement.zzff();
                } else {
                    if (v11_1 == 4) {
                        return new com.google.android.gms.internal.measurement.zzfe(0);
                    } else {
                        if (v11_1 != 5) {
                            throw 0;
                        } else {
                            return com.google.android.gms.internal.measurement.zzff.zzl;
                        }
                    }
                }
            }
        }
    }

    public final boolean zzm()
    {
        return this.zzk;
    }

    public final synthetic void zzo(String p2)
    {
        this.zzb = (this.zzb | 2);
        this.zze = p2;
        return;
    }

    public final synthetic void zzp(int p3, com.google.android.gms.internal.measurement.zzfh p4)
    {
        p4.getClass();
        com.google.android.gms.internal.measurement.zzmo v0_0 = this.zzf;
        if (!v0_0.zza()) {
            this.zzf = com.google.android.gms.internal.measurement.zzmf.zzcw(v0_0);
        }
        this.zzf.set(p3, p4);
        return;
    }
}
