package com.google.android.gms.internal.firebase-auth-api;
public final class zzto extends com.google.android.gms.internal.firebase-auth-api.zzalf implements com.google.android.gms.internal.firebase-auth-api.zzamo {
    private static final com.google.android.gms.internal.firebase-auth-api.zzto zzc;
    private static volatile com.google.android.gms.internal.firebase-auth-api.zzamv zzd;
    private int zze;
    private com.google.android.gms.internal.firebase-auth-api.zztr zzf;
    private int zzg;

    static zzto()
    {
        com.google.android.gms.internal.firebase-auth-api.zzto v0_1 = new com.google.android.gms.internal.firebase-auth-api.zzto();
        com.google.android.gms.internal.firebase-auth-api.zzto.zzc = v0_1;
        com.google.android.gms.internal.firebase-auth-api.zzalf.zza(com.google.android.gms.internal.firebase-auth-api.zzto, v0_1);
        return;
    }

    private zzto()
    {
        return;
    }

    public static synthetic void zza(com.google.android.gms.internal.firebase-auth-api.zzto p0, int p1)
    {
        p0.zzg = p1;
        return;
    }

    public static synthetic void zza(com.google.android.gms.internal.firebase-auth-api.zzto p0, com.google.android.gms.internal.firebase-auth-api.zztr p1)
    {
        p1.getClass();
        p0.zzf = p1;
        p0.zze = (p0.zze | 1);
        return;
    }

    public static com.google.android.gms.internal.firebase-auth-api.zzto$zza zzb()
    {
        return ((com.google.android.gms.internal.firebase-auth-api.zzto$zza) com.google.android.gms.internal.firebase-auth-api.zzto.zzc.zzm());
    }

    public static bridge synthetic com.google.android.gms.internal.firebase-auth-api.zzto zzc()
    {
        return com.google.android.gms.internal.firebase-auth-api.zzto.zzc;
    }

    public static com.google.android.gms.internal.firebase-auth-api.zzto zzd()
    {
        return com.google.android.gms.internal.firebase-auth-api.zzto.zzc;
    }

    public final int zza()
    {
        return this.zzg;
    }

    public final Object zza(int p1, Object p2, Object p3)
    {
        switch (com.google.android.gms.internal.firebase-auth-api.zztq.zza[(p1 - 1)]) {
            case 1:
                return new com.google.android.gms.internal.firebase-auth-api.zzto();
            case 2:
                return new com.google.android.gms.internal.firebase-auth-api.zzto$zza(0);
            case 3:
                return com.google.android.gms.internal.firebase-auth-api.zzalf.zza(com.google.android.gms.internal.firebase-auth-api.zzto.zzc, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1009\u0000\u0002\u000b", new Object[] {"zze", "zzf", "zzg"}));
            case 4:
                return com.google.android.gms.internal.firebase-auth-api.zzto.zzc;
            case 5:
                com.google.android.gms.internal.firebase-auth-api.zzalf$zza v1_15 = com.google.android.gms.internal.firebase-auth-api.zzto.zzd;
                if (v1_15 != null) {
                    return v1_15;
                } else {
                    com.google.android.gms.internal.firebase-auth-api.zzalf$zza v1_1 = com.google.android.gms.internal.firebase-auth-api.zzto.zzd;
                    if (v1_1 == null) {
                        v1_1 = new com.google.android.gms.internal.firebase-auth-api.zzalf$zza(com.google.android.gms.internal.firebase-auth-api.zzto.zzc);
                        com.google.android.gms.internal.firebase-auth-api.zzto.zzd = v1_1;
                    }
                    return v1_1;
                }
            case 6:
                return Byte.valueOf(1);
            default:
                throw 0;
        }
    }

    public final com.google.android.gms.internal.firebase-auth-api.zztr zze()
    {
        com.google.android.gms.internal.firebase-auth-api.zztr v0 = this.zzf;
        if (v0 == null) {
            v0 = com.google.android.gms.internal.firebase-auth-api.zztr.zzd();
        }
        return v0;
    }
}
