package com.google.android.gms.internal.firebase-auth-api;
public final class zztl extends com.google.android.gms.internal.firebase-auth-api.zzalf implements com.google.android.gms.internal.firebase-auth-api.zzamo {
    private static final com.google.android.gms.internal.firebase-auth-api.zztl zzc;
    private static volatile com.google.android.gms.internal.firebase-auth-api.zzamv zzd;
    private int zze;
    private int zzf;
    private com.google.android.gms.internal.firebase-auth-api.zztr zzg;
    private com.google.android.gms.internal.firebase-auth-api.zzajv zzh;

    static zztl()
    {
        com.google.android.gms.internal.firebase-auth-api.zztl v0_1 = new com.google.android.gms.internal.firebase-auth-api.zztl();
        com.google.android.gms.internal.firebase-auth-api.zztl.zzc = v0_1;
        com.google.android.gms.internal.firebase-auth-api.zzalf.zza(com.google.android.gms.internal.firebase-auth-api.zztl, v0_1);
        return;
    }

    private zztl()
    {
        this.zzh = com.google.android.gms.internal.firebase-auth-api.zzajv.zza;
        return;
    }

    public static synthetic void zza(com.google.android.gms.internal.firebase-auth-api.zztl p0, com.google.android.gms.internal.firebase-auth-api.zzajv p1)
    {
        p1.getClass();
        p0.zzh = p1;
        return;
    }

    public static synthetic void zza(com.google.android.gms.internal.firebase-auth-api.zztl p0, com.google.android.gms.internal.firebase-auth-api.zztr p1)
    {
        p1.getClass();
        p0.zzg = p1;
        p0.zze = (p0.zze | 1);
        return;
    }

    public static com.google.android.gms.internal.firebase-auth-api.zztl$zza zzb()
    {
        return ((com.google.android.gms.internal.firebase-auth-api.zztl$zza) com.google.android.gms.internal.firebase-auth-api.zztl.zzc.zzm());
    }

    public static bridge synthetic com.google.android.gms.internal.firebase-auth-api.zztl zzc()
    {
        return com.google.android.gms.internal.firebase-auth-api.zztl.zzc;
    }

    public static com.google.android.gms.internal.firebase-auth-api.zztl zzd()
    {
        return com.google.android.gms.internal.firebase-auth-api.zztl.zzc;
    }

    public final int zza()
    {
        return this.zzf;
    }

    public final Object zza(int p2, Object p3, Object p4)
    {
        switch (com.google.android.gms.internal.firebase-auth-api.zztn.zza[(p2 - 1)]) {
            case 1:
                return new com.google.android.gms.internal.firebase-auth-api.zztl();
            case 2:
                return new com.google.android.gms.internal.firebase-auth-api.zztl$zza(0);
            case 3:
                return com.google.android.gms.internal.firebase-auth-api.zzalf.zza(com.google.android.gms.internal.firebase-auth-api.zztl.zzc, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\u1009\u0000\u0003\n", new Object[] {"zze", "zzf", "zzg", "zzh"}));
            case 4:
                return com.google.android.gms.internal.firebase-auth-api.zztl.zzc;
            case 5:
                com.google.android.gms.internal.firebase-auth-api.zzalf$zza v2_15 = com.google.android.gms.internal.firebase-auth-api.zztl.zzd;
                if (v2_15 != null) {
                    return v2_15;
                } else {
                    com.google.android.gms.internal.firebase-auth-api.zzalf$zza v2_1 = com.google.android.gms.internal.firebase-auth-api.zztl.zzd;
                    if (v2_1 == null) {
                        v2_1 = new com.google.android.gms.internal.firebase-auth-api.zzalf$zza(com.google.android.gms.internal.firebase-auth-api.zztl.zzc);
                        com.google.android.gms.internal.firebase-auth-api.zztl.zzd = v2_1;
                    }
                    return v2_1;
                }
            case 6:
                return Byte.valueOf(1);
            default:
                throw 0;
        }
    }

    public final com.google.android.gms.internal.firebase-auth-api.zztr zze()
    {
        com.google.android.gms.internal.firebase-auth-api.zztr v0 = this.zzg;
        if (v0 == null) {
            v0 = com.google.android.gms.internal.firebase-auth-api.zztr.zzd();
        }
        return v0;
    }

    public final com.google.android.gms.internal.firebase-auth-api.zzajv zzf()
    {
        return this.zzh;
    }
}
