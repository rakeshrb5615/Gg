package com.google.android.gms.internal.firebase-auth-api;
public final class zzxk$zzb extends com.google.android.gms.internal.firebase-auth-api.zzalf implements com.google.android.gms.internal.firebase-auth-api.zzamo {
    private static final com.google.android.gms.internal.firebase-auth-api.zzxk$zzb zzc;
    private static volatile com.google.android.gms.internal.firebase-auth-api.zzamv zzd;
    private String zze;
    private int zzf;
    private int zzg;
    private int zzh;

    static zzxk$zzb()
    {
        com.google.android.gms.internal.firebase-auth-api.zzxk$zzb v0_1 = new com.google.android.gms.internal.firebase-auth-api.zzxk$zzb();
        com.google.android.gms.internal.firebase-auth-api.zzxk$zzb.zzc = v0_1;
        com.google.android.gms.internal.firebase-auth-api.zzalf.zza(com.google.android.gms.internal.firebase-auth-api.zzxk$zzb, v0_1);
        return;
    }

    private zzxk$zzb()
    {
        this.zze = "";
        return;
    }

    public static com.google.android.gms.internal.firebase-auth-api.zzxk$zzb$zza zza()
    {
        return ((com.google.android.gms.internal.firebase-auth-api.zzxk$zzb$zza) com.google.android.gms.internal.firebase-auth-api.zzxk$zzb.zzc.zzm());
    }

    public static synthetic void zza(com.google.android.gms.internal.firebase-auth-api.zzxk$zzb p0, int p1)
    {
        p0.zzg = p1;
        return;
    }

    public static synthetic void zza(com.google.android.gms.internal.firebase-auth-api.zzxk$zzb p0, com.google.android.gms.internal.firebase-auth-api.zzxc p1)
    {
        p0.zzf = p1.zza();
        return;
    }

    public static synthetic void zza(com.google.android.gms.internal.firebase-auth-api.zzxk$zzb p0, com.google.android.gms.internal.firebase-auth-api.zzxz p1)
    {
        p0.zzh = p1.zza();
        return;
    }

    public static synthetic void zza(com.google.android.gms.internal.firebase-auth-api.zzxk$zzb p0, String p1)
    {
        p1.getClass();
        p0.zze = p1;
        return;
    }

    public static bridge synthetic com.google.android.gms.internal.firebase-auth-api.zzxk$zzb zzb()
    {
        return com.google.android.gms.internal.firebase-auth-api.zzxk$zzb.zzc;
    }

    public final Object zza(int p2, Object p3, Object p4)
    {
        switch (com.google.android.gms.internal.firebase-auth-api.zzxm.zza[(p2 - 1)]) {
            case 1:
                return new com.google.android.gms.internal.firebase-auth-api.zzxk$zzb();
            case 2:
                return new com.google.android.gms.internal.firebase-auth-api.zzxk$zzb$zza(0);
            case 3:
                return com.google.android.gms.internal.firebase-auth-api.zzalf.zza(com.google.android.gms.internal.firebase-auth-api.zzxk$zzb.zzc, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0208\u0002\u000c\u0003\u000b\u0004\u000c", new Object[] {"zze", "zzf", "zzg", "zzh"}));
            case 4:
                return com.google.android.gms.internal.firebase-auth-api.zzxk$zzb.zzc;
            case 5:
                com.google.android.gms.internal.firebase-auth-api.zzalf$zza v2_15 = com.google.android.gms.internal.firebase-auth-api.zzxk$zzb.zzd;
                if (v2_15 != null) {
                    return v2_15;
                } else {
                    com.google.android.gms.internal.firebase-auth-api.zzalf$zza v2_1 = com.google.android.gms.internal.firebase-auth-api.zzxk$zzb.zzd;
                    if (v2_1 == null) {
                        v2_1 = new com.google.android.gms.internal.firebase-auth-api.zzalf$zza(com.google.android.gms.internal.firebase-auth-api.zzxk$zzb.zzc);
                        com.google.android.gms.internal.firebase-auth-api.zzxk$zzb.zzd = v2_1;
                    }
                    return v2_1;
                }
            case 6:
                return Byte.valueOf(1);
            default:
                throw 0;
        }
    }
}
