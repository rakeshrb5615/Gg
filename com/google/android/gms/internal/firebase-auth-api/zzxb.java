package com.google.android.gms.internal.firebase-auth-api;
public final class zzxb extends com.google.android.gms.internal.firebase-auth-api.zzalf implements com.google.android.gms.internal.firebase-auth-api.zzamo {
    private static final com.google.android.gms.internal.firebase-auth-api.zzxb zzc;
    private static volatile com.google.android.gms.internal.firebase-auth-api.zzamv zzd;
    private String zze;
    private com.google.android.gms.internal.firebase-auth-api.zzajv zzf;
    private int zzg;

    static zzxb()
    {
        com.google.android.gms.internal.firebase-auth-api.zzxb v0_1 = new com.google.android.gms.internal.firebase-auth-api.zzxb();
        com.google.android.gms.internal.firebase-auth-api.zzxb.zzc = v0_1;
        com.google.android.gms.internal.firebase-auth-api.zzalf.zza(com.google.android.gms.internal.firebase-auth-api.zzxb, v0_1);
        return;
    }

    private zzxb()
    {
        this.zze = "";
        this.zzf = com.google.android.gms.internal.firebase-auth-api.zzajv.zza;
        return;
    }

    public static com.google.android.gms.internal.firebase-auth-api.zzxb$zza zza()
    {
        return ((com.google.android.gms.internal.firebase-auth-api.zzxb$zza) com.google.android.gms.internal.firebase-auth-api.zzxb.zzc.zzm());
    }

    public static com.google.android.gms.internal.firebase-auth-api.zzxb$zza zza(com.google.android.gms.internal.firebase-auth-api.zzxb p1)
    {
        return ((com.google.android.gms.internal.firebase-auth-api.zzxb$zza) com.google.android.gms.internal.firebase-auth-api.zzxb.zzc.zzm().zza(p1));
    }

    public static com.google.android.gms.internal.firebase-auth-api.zzxb zza(byte[] p1, com.google.android.gms.internal.firebase-auth-api.zzaku p2)
    {
        return ((com.google.android.gms.internal.firebase-auth-api.zzxb) com.google.android.gms.internal.firebase-auth-api.zzalf.zza(com.google.android.gms.internal.firebase-auth-api.zzxb.zzc, p1, p2));
    }

    public static synthetic void zza(com.google.android.gms.internal.firebase-auth-api.zzxb p0, com.google.android.gms.internal.firebase-auth-api.zzajv p1)
    {
        p1.getClass();
        p0.zzf = p1;
        return;
    }

    public static synthetic void zza(com.google.android.gms.internal.firebase-auth-api.zzxb p0, com.google.android.gms.internal.firebase-auth-api.zzxz p1)
    {
        p0.zzg = p1.zza();
        return;
    }

    public static synthetic void zza(com.google.android.gms.internal.firebase-auth-api.zzxb p0, String p1)
    {
        p1.getClass();
        p0.zze = p1;
        return;
    }

    public static bridge synthetic com.google.android.gms.internal.firebase-auth-api.zzxb zzb()
    {
        return com.google.android.gms.internal.firebase-auth-api.zzxb.zzc;
    }

    public static com.google.android.gms.internal.firebase-auth-api.zzxb zzc()
    {
        return com.google.android.gms.internal.firebase-auth-api.zzxb.zzc;
    }

    public final Object zza(int p1, Object p2, Object p3)
    {
        switch (com.google.android.gms.internal.firebase-auth-api.zzxd.zza[(p1 - 1)]) {
            case 1:
                return new com.google.android.gms.internal.firebase-auth-api.zzxb();
            case 2:
                return new com.google.android.gms.internal.firebase-auth-api.zzxb$zza(0);
            case 3:
                return com.google.android.gms.internal.firebase-auth-api.zzalf.zza(com.google.android.gms.internal.firebase-auth-api.zzxb.zzc, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0208\u0002\n\u0003\u000c", new Object[] {"zze", "zzf", "zzg"}));
            case 4:
                return com.google.android.gms.internal.firebase-auth-api.zzxb.zzc;
            case 5:
                com.google.android.gms.internal.firebase-auth-api.zzalf$zza v1_15 = com.google.android.gms.internal.firebase-auth-api.zzxb.zzd;
                if (v1_15 != null) {
                    return v1_15;
                } else {
                    com.google.android.gms.internal.firebase-auth-api.zzalf$zza v1_1 = com.google.android.gms.internal.firebase-auth-api.zzxb.zzd;
                    if (v1_1 == null) {
                        v1_1 = new com.google.android.gms.internal.firebase-auth-api.zzalf$zza(com.google.android.gms.internal.firebase-auth-api.zzxb.zzc);
                        com.google.android.gms.internal.firebase-auth-api.zzxb.zzd = v1_1;
                    }
                    return v1_1;
                }
            case 6:
                return Byte.valueOf(1);
            default:
                throw 0;
        }
    }

    public final com.google.android.gms.internal.firebase-auth-api.zzxz zzd()
    {
        com.google.android.gms.internal.firebase-auth-api.zzxz v0_1 = com.google.android.gms.internal.firebase-auth-api.zzxz.zza(this.zzg);
        if (v0_1 == null) {
            v0_1 = com.google.android.gms.internal.firebase-auth-api.zzxz.zzf;
        }
        return v0_1;
    }

    public final com.google.android.gms.internal.firebase-auth-api.zzajv zze()
    {
        return this.zzf;
    }

    public final String zzf()
    {
        return this.zze;
    }
}
