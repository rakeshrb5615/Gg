package com.google.android.gms.internal.firebase-auth-api;
public final class zzxh$zzb extends com.google.android.gms.internal.firebase-auth-api.zzalf implements com.google.android.gms.internal.firebase-auth-api.zzamo {
    private static final com.google.android.gms.internal.firebase-auth-api.zzxh$zzb zzc;
    private static volatile com.google.android.gms.internal.firebase-auth-api.zzamv zzd;
    private int zze;
    private com.google.android.gms.internal.firebase-auth-api.zzwx zzf;
    private int zzg;
    private int zzh;
    private int zzi;

    static zzxh$zzb()
    {
        com.google.android.gms.internal.firebase-auth-api.zzxh$zzb v0_1 = new com.google.android.gms.internal.firebase-auth-api.zzxh$zzb();
        com.google.android.gms.internal.firebase-auth-api.zzxh$zzb.zzc = v0_1;
        com.google.android.gms.internal.firebase-auth-api.zzalf.zza(com.google.android.gms.internal.firebase-auth-api.zzxh$zzb, v0_1);
        return;
    }

    private zzxh$zzb()
    {
        return;
    }

    public static synthetic void zza(com.google.android.gms.internal.firebase-auth-api.zzxh$zzb p0, int p1)
    {
        p0.zzh = p1;
        return;
    }

    public static synthetic void zza(com.google.android.gms.internal.firebase-auth-api.zzxh$zzb p0, com.google.android.gms.internal.firebase-auth-api.zzwx p1)
    {
        p1.getClass();
        p0.zzf = p1;
        p0.zze = (p0.zze | 1);
        return;
    }

    public static synthetic void zza(com.google.android.gms.internal.firebase-auth-api.zzxh$zzb p0, com.google.android.gms.internal.firebase-auth-api.zzxc p1)
    {
        p0.zzg = p1.zza();
        return;
    }

    public static synthetic void zza(com.google.android.gms.internal.firebase-auth-api.zzxh$zzb p0, com.google.android.gms.internal.firebase-auth-api.zzxz p1)
    {
        p0.zzi = p1.zza();
        return;
    }

    public static com.google.android.gms.internal.firebase-auth-api.zzxh$zzb$zza zzd()
    {
        return ((com.google.android.gms.internal.firebase-auth-api.zzxh$zzb$zza) com.google.android.gms.internal.firebase-auth-api.zzxh$zzb.zzc.zzm());
    }

    public static bridge synthetic com.google.android.gms.internal.firebase-auth-api.zzxh$zzb zze()
    {
        return com.google.android.gms.internal.firebase-auth-api.zzxh$zzb.zzc;
    }

    public final int zza()
    {
        return this.zzh;
    }

    public final Object zza(int p3, Object p4, Object p5)
    {
        switch (com.google.android.gms.internal.firebase-auth-api.zzxj.zza[(p3 - 1)]) {
            case 1:
                return new com.google.android.gms.internal.firebase-auth-api.zzxh$zzb();
            case 2:
                return new com.google.android.gms.internal.firebase-auth-api.zzxh$zzb$zza(0);
            case 3:
                return com.google.android.gms.internal.firebase-auth-api.zzalf.zza(com.google.android.gms.internal.firebase-auth-api.zzxh$zzb.zzc, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u1009\u0000\u0002\u000c\u0003\u000b\u0004\u000c", new Object[] {"zze", "zzf", "zzg", "zzh", "zzi"}));
            case 4:
                return com.google.android.gms.internal.firebase-auth-api.zzxh$zzb.zzc;
            case 5:
                com.google.android.gms.internal.firebase-auth-api.zzalf$zza v3_15 = com.google.android.gms.internal.firebase-auth-api.zzxh$zzb.zzd;
                if (v3_15 != null) {
                    return v3_15;
                } else {
                    com.google.android.gms.internal.firebase-auth-api.zzalf$zza v3_1 = com.google.android.gms.internal.firebase-auth-api.zzxh$zzb.zzd;
                    if (v3_1 == null) {
                        v3_1 = new com.google.android.gms.internal.firebase-auth-api.zzalf$zza(com.google.android.gms.internal.firebase-auth-api.zzxh$zzb.zzc);
                        com.google.android.gms.internal.firebase-auth-api.zzxh$zzb.zzd = v3_1;
                    }
                    return v3_1;
                }
            case 6:
                return Byte.valueOf(1);
            default:
                throw 0;
        }
    }

    public final com.google.android.gms.internal.firebase-auth-api.zzwx zzb()
    {
        com.google.android.gms.internal.firebase-auth-api.zzwx v0 = this.zzf;
        if (v0 == null) {
            v0 = com.google.android.gms.internal.firebase-auth-api.zzwx.zzd();
        }
        return v0;
    }

    public final com.google.android.gms.internal.firebase-auth-api.zzxc zzc()
    {
        com.google.android.gms.internal.firebase-auth-api.zzxc v0_1 = com.google.android.gms.internal.firebase-auth-api.zzxc.zza(this.zzg);
        if (v0_1 == null) {
            v0_1 = com.google.android.gms.internal.firebase-auth-api.zzxc.zze;
        }
        return v0_1;
    }

    public final com.google.android.gms.internal.firebase-auth-api.zzxz zzf()
    {
        com.google.android.gms.internal.firebase-auth-api.zzxz v0_1 = com.google.android.gms.internal.firebase-auth-api.zzxz.zza(this.zzi);
        if (v0_1 == null) {
            v0_1 = com.google.android.gms.internal.firebase-auth-api.zzxz.zzf;
        }
        return v0_1;
    }

    public final boolean zzg()
    {
        if ((this.zze & 1) == 0) {
            return 0;
        } else {
            return 1;
        }
    }
}
