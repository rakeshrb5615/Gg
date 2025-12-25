package com.google.android.gms.internal.measurement;
public final class zzfl extends com.google.android.gms.internal.measurement.zzmf implements com.google.android.gms.internal.measurement.zznn {
    private static final com.google.android.gms.internal.measurement.zzfl zzi;
    private int zzb;
    private int zzd;
    private boolean zze;
    private String zzf;
    private String zzg;
    private String zzh;

    static zzfl()
    {
        com.google.android.gms.internal.measurement.zzfl v0_1 = new com.google.android.gms.internal.measurement.zzfl();
        com.google.android.gms.internal.measurement.zzfl.zzi = v0_1;
        com.google.android.gms.internal.measurement.zzmf.zzcp(com.google.android.gms.internal.measurement.zzfl, v0_1);
        return;
    }

    private zzfl()
    {
        this.zzf = "";
        this.zzg = "";
        this.zzh = "";
        return;
    }

    public static com.google.android.gms.internal.measurement.zzfl zzj()
    {
        return com.google.android.gms.internal.measurement.zzfl.zzi;
    }

    public static synthetic com.google.android.gms.internal.measurement.zzfl zzk()
    {
        return com.google.android.gms.internal.measurement.zzfl.zzi;
    }

    public final boolean zza()
    {
        if ((this.zzb & 1) == 0) {
            return 0;
        } else {
            return 1;
        }
    }

    public final boolean zzb()
    {
        if ((this.zzb & 2) == 0) {
            return 0;
        } else {
            return 1;
        }
    }

    public final boolean zzc()
    {
        return this.zze;
    }

    public final boolean zzd()
    {
        if ((this.zzb & 4) == 0) {
            return 0;
        } else {
            return 1;
        }
    }

    public final String zze()
    {
        return this.zzf;
    }

    public final boolean zzf()
    {
        if ((this.zzb & 8) == 0) {
            return 0;
        } else {
            return 1;
        }
    }

    public final String zzg()
    {
        return this.zzg;
    }

    public final boolean zzh()
    {
        if ((this.zzb & 16) == 0) {
            return 0;
        } else {
            return 1;
        }
    }

    public final String zzi()
    {
        return this.zzh;
    }

    public final Object zzl(int p8, Object p9, Object p10)
    {
        com.google.android.gms.internal.measurement.zzfl v8_1 = (p8 - 1);
        if (v8_1 == null) {
            return Byte.valueOf(1);
        } else {
            if (v8_1 == 2) {
                String v5 = "zzg";
                String v3 = "zze";
                return com.google.android.gms.internal.measurement.zzmf.zzcq(com.google.android.gms.internal.measurement.zzfl.zzi, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001\u180c\u0000\u0002\u1007\u0001\u0003\u1008\u0002\u0004\u1008\u0003\u0005\u1008\u0004", new Object[] {"zzb", "zzh"}));
            } else {
                if (v8_1 == 3) {
                    return new com.google.android.gms.internal.measurement.zzfl();
                } else {
                    if (v8_1 == 4) {
                        return new com.google.android.gms.internal.measurement.zzfi(0);
                    } else {
                        if (v8_1 != 5) {
                            throw 0;
                        } else {
                            return com.google.android.gms.internal.measurement.zzfl.zzi;
                        }
                    }
                }
            }
        }
    }

    public final int zzm()
    {
        int v0_1 = com.google.android.gms.internal.measurement.zzfk.zza(this.zzd);
        if (v0_1 == 0) {
            v0_1 = 1;
        }
        return v0_1;
    }
}
