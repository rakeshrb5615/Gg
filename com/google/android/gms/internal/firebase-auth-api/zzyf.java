package com.google.android.gms.internal.firebase-auth-api;
public final class zzyf extends com.google.android.gms.internal.firebase-auth-api.zzalf implements com.google.android.gms.internal.firebase-auth-api.zzamo {
    private static final com.google.android.gms.internal.firebase-auth-api.zzyf zzc;
    private static volatile com.google.android.gms.internal.firebase-auth-api.zzamv zzd;
    private int zze;
    private int zzf;
    private com.google.android.gms.internal.firebase-auth-api.zzyl zzg;
    private com.google.android.gms.internal.firebase-auth-api.zzajv zzh;

    static zzyf()
    {
        com.google.android.gms.internal.firebase-auth-api.zzyf v0_1 = new com.google.android.gms.internal.firebase-auth-api.zzyf();
        com.google.android.gms.internal.firebase-auth-api.zzyf.zzc = v0_1;
        com.google.android.gms.internal.firebase-auth-api.zzalf.zza(com.google.android.gms.internal.firebase-auth-api.zzyf, v0_1);
        return;
    }

    private zzyf()
    {
        this.zzh = com.google.android.gms.internal.firebase-auth-api.zzajv.zza;
        return;
    }

    public static com.google.android.gms.internal.firebase-auth-api.zzyf zza(com.google.android.gms.internal.firebase-auth-api.zzajv p1, com.google.android.gms.internal.firebase-auth-api.zzaku p2)
    {
        return ((com.google.android.gms.internal.firebase-auth-api.zzyf) com.google.android.gms.internal.firebase-auth-api.zzalf.zza(com.google.android.gms.internal.firebase-auth-api.zzyf.zzc, p1, p2));
    }

    public static synthetic void zza(com.google.android.gms.internal.firebase-auth-api.zzyf p0, com.google.android.gms.internal.firebase-auth-api.zzajv p1)
    {
        p1.getClass();
        p0.zzh = p1;
        return;
    }

    public static synthetic void zza(com.google.android.gms.internal.firebase-auth-api.zzyf p0, com.google.android.gms.internal.firebase-auth-api.zzyl p1)
    {
        p1.getClass();
        p0.zzg = p1;
        p0.zze = (p0.zze | 1);
        return;
    }

    public static com.google.android.gms.internal.firebase-auth-api.zzyf$zza zzb()
    {
        return ((com.google.android.gms.internal.firebase-auth-api.zzyf$zza) com.google.android.gms.internal.firebase-auth-api.zzyf.zzc.zzm());
    }

    public static bridge synthetic com.google.android.gms.internal.firebase-auth-api.zzyf zzc()
    {
        return com.google.android.gms.internal.firebase-auth-api.zzyf.zzc;
    }

    public final int zza()
    {
        return this.zzf;
    }

    public final Object zza(int p2, Object p3, Object p4)
    {
        switch (com.google.android.gms.internal.firebase-auth-api.zzye.zza[(p2 - 1)]) {
            case 1:
                return new com.google.android.gms.internal.firebase-auth-api.zzyf();
            case 2:
                return new com.google.android.gms.internal.firebase-auth-api.zzyf$zza(0);
            case 3:
                return com.google.android.gms.internal.firebase-auth-api.zzalf.zza(com.google.android.gms.internal.firebase-auth-api.zzyf.zzc, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\u1009\u0000\u0003\n", new Object[] {"zze", "zzf", "zzg", "zzh"}));
            case 4:
                return com.google.android.gms.internal.firebase-auth-api.zzyf.zzc;
            case 5:
                com.google.android.gms.internal.firebase-auth-api.zzalf$zza v2_15 = com.google.android.gms.internal.firebase-auth-api.zzyf.zzd;
                if (v2_15 != null) {
                    return v2_15;
                } else {
                    com.google.android.gms.internal.firebase-auth-api.zzalf$zza v2_1 = com.google.android.gms.internal.firebase-auth-api.zzyf.zzd;
                    if (v2_1 == null) {
                        v2_1 = new com.google.android.gms.internal.firebase-auth-api.zzalf$zza(com.google.android.gms.internal.firebase-auth-api.zzyf.zzc);
                        com.google.android.gms.internal.firebase-auth-api.zzyf.zzd = v2_1;
                    }
                    return v2_1;
                }
            case 6:
                return Byte.valueOf(1);
            default:
                throw 0;
        }
    }

    public final com.google.android.gms.internal.firebase-auth-api.zzyl zzd()
    {
        com.google.android.gms.internal.firebase-auth-api.zzyl v0 = this.zzg;
        if (v0 == null) {
            v0 = com.google.android.gms.internal.firebase-auth-api.zzyl.zzd();
        }
        return v0;
    }

    public final com.google.android.gms.internal.firebase-auth-api.zzajv zze()
    {
        return this.zzh;
    }
}
