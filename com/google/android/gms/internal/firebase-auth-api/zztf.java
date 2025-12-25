package com.google.android.gms.internal.firebase-auth-api;
public final class zztf extends com.google.android.gms.internal.firebase-auth-api.zzalf implements com.google.android.gms.internal.firebase-auth-api.zzamo {
    private static final com.google.android.gms.internal.firebase-auth-api.zztf zzc;
    private static volatile com.google.android.gms.internal.firebase-auth-api.zzamv zzd;
    private int zze;
    private int zzf;
    private com.google.android.gms.internal.firebase-auth-api.zztl zzg;
    private com.google.android.gms.internal.firebase-auth-api.zzwb zzh;

    static zztf()
    {
        com.google.android.gms.internal.firebase-auth-api.zztf v0_1 = new com.google.android.gms.internal.firebase-auth-api.zztf();
        com.google.android.gms.internal.firebase-auth-api.zztf.zzc = v0_1;
        com.google.android.gms.internal.firebase-auth-api.zzalf.zza(com.google.android.gms.internal.firebase-auth-api.zztf, v0_1);
        return;
    }

    private zztf()
    {
        return;
    }

    public static com.google.android.gms.internal.firebase-auth-api.zztf zza(com.google.android.gms.internal.firebase-auth-api.zzajv p1, com.google.android.gms.internal.firebase-auth-api.zzaku p2)
    {
        return ((com.google.android.gms.internal.firebase-auth-api.zztf) com.google.android.gms.internal.firebase-auth-api.zzalf.zza(com.google.android.gms.internal.firebase-auth-api.zztf.zzc, p1, p2));
    }

    public static synthetic void zza(com.google.android.gms.internal.firebase-auth-api.zztf p0, com.google.android.gms.internal.firebase-auth-api.zztl p1)
    {
        p1.getClass();
        p0.zzg = p1;
        p0.zze = (p0.zze | 1);
        return;
    }

    public static synthetic void zza(com.google.android.gms.internal.firebase-auth-api.zztf p0, com.google.android.gms.internal.firebase-auth-api.zzwb p1)
    {
        p1.getClass();
        p0.zzh = p1;
        p0.zze = (p0.zze | 2);
        return;
    }

    public static com.google.android.gms.internal.firebase-auth-api.zztf$zza zzb()
    {
        return ((com.google.android.gms.internal.firebase-auth-api.zztf$zza) com.google.android.gms.internal.firebase-auth-api.zztf.zzc.zzm());
    }

    public static bridge synthetic com.google.android.gms.internal.firebase-auth-api.zztf zzc()
    {
        return com.google.android.gms.internal.firebase-auth-api.zztf.zzc;
    }

    public static com.google.android.gms.internal.firebase-auth-api.zzamv zzf()
    {
        return ((com.google.android.gms.internal.firebase-auth-api.zzamv) com.google.android.gms.internal.firebase-auth-api.zztf.zzc.zza(com.google.android.gms.internal.firebase-auth-api.zzalf$zze.zzg, 0, 0));
    }

    public final int zza()
    {
        return this.zzf;
    }

    public final Object zza(int p2, Object p3, Object p4)
    {
        switch (com.google.android.gms.internal.firebase-auth-api.zzth.zza[(p2 - 1)]) {
            case 1:
                return new com.google.android.gms.internal.firebase-auth-api.zztf();
            case 2:
                return new com.google.android.gms.internal.firebase-auth-api.zztf$zza(0);
            case 3:
                return com.google.android.gms.internal.firebase-auth-api.zzalf.zza(com.google.android.gms.internal.firebase-auth-api.zztf.zzc, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\u1009\u0000\u0003\u1009\u0001", new Object[] {"zze", "zzf", "zzg", "zzh"}));
            case 4:
                return com.google.android.gms.internal.firebase-auth-api.zztf.zzc;
            case 5:
                com.google.android.gms.internal.firebase-auth-api.zzalf$zza v2_15 = com.google.android.gms.internal.firebase-auth-api.zztf.zzd;
                if (v2_15 != null) {
                    return v2_15;
                } else {
                    com.google.android.gms.internal.firebase-auth-api.zzalf$zza v2_1 = com.google.android.gms.internal.firebase-auth-api.zztf.zzd;
                    if (v2_1 == null) {
                        v2_1 = new com.google.android.gms.internal.firebase-auth-api.zzalf$zza(com.google.android.gms.internal.firebase-auth-api.zztf.zzc);
                        com.google.android.gms.internal.firebase-auth-api.zztf.zzd = v2_1;
                    }
                    return v2_1;
                }
            case 6:
                return Byte.valueOf(1);
            default:
                throw 0;
        }
    }

    public final com.google.android.gms.internal.firebase-auth-api.zztl zzd()
    {
        com.google.android.gms.internal.firebase-auth-api.zztl v0 = this.zzg;
        if (v0 == null) {
            v0 = com.google.android.gms.internal.firebase-auth-api.zztl.zzd();
        }
        return v0;
    }

    public final com.google.android.gms.internal.firebase-auth-api.zzwb zze()
    {
        com.google.android.gms.internal.firebase-auth-api.zzwb v0 = this.zzh;
        if (v0 == null) {
            v0 = com.google.android.gms.internal.firebase-auth-api.zzwb.zzd();
        }
        return v0;
    }
}
