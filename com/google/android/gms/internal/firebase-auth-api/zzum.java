package com.google.android.gms.internal.firebase-auth-api;
public final class zzum extends com.google.android.gms.internal.firebase-auth-api.zzalf implements com.google.android.gms.internal.firebase-auth-api.zzamo {
    private static final com.google.android.gms.internal.firebase-auth-api.zzum zzc;
    private static volatile com.google.android.gms.internal.firebase-auth-api.zzamv zzd;
    private int zze;
    private int zzf;

    static zzum()
    {
        com.google.android.gms.internal.firebase-auth-api.zzum v0_1 = new com.google.android.gms.internal.firebase-auth-api.zzum();
        com.google.android.gms.internal.firebase-auth-api.zzum.zzc = v0_1;
        com.google.android.gms.internal.firebase-auth-api.zzalf.zza(com.google.android.gms.internal.firebase-auth-api.zzum, v0_1);
        return;
    }

    private zzum()
    {
        return;
    }

    public static com.google.android.gms.internal.firebase-auth-api.zzum zza(com.google.android.gms.internal.firebase-auth-api.zzajv p1, com.google.android.gms.internal.firebase-auth-api.zzaku p2)
    {
        return ((com.google.android.gms.internal.firebase-auth-api.zzum) com.google.android.gms.internal.firebase-auth-api.zzalf.zza(com.google.android.gms.internal.firebase-auth-api.zzum.zzc, p1, p2));
    }

    public static synthetic void zza(com.google.android.gms.internal.firebase-auth-api.zzum p0, int p1)
    {
        p0.zze = p1;
        return;
    }

    public static com.google.android.gms.internal.firebase-auth-api.zzum$zza zzc()
    {
        return ((com.google.android.gms.internal.firebase-auth-api.zzum$zza) com.google.android.gms.internal.firebase-auth-api.zzum.zzc.zzm());
    }

    public static bridge synthetic com.google.android.gms.internal.firebase-auth-api.zzum zzd()
    {
        return com.google.android.gms.internal.firebase-auth-api.zzum.zzc;
    }

    public final int zza()
    {
        return this.zze;
    }

    public final Object zza(int p1, Object p2, Object p3)
    {
        switch (com.google.android.gms.internal.firebase-auth-api.zzuo.zza[(p1 - 1)]) {
            case 1:
                return new com.google.android.gms.internal.firebase-auth-api.zzum();
            case 2:
                return new com.google.android.gms.internal.firebase-auth-api.zzum$zza(0);
            case 3:
                return com.google.android.gms.internal.firebase-auth-api.zzalf.zza(com.google.android.gms.internal.firebase-auth-api.zzum.zzc, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\u000b", new Object[] {"zzf", "zze"}));
            case 4:
                return com.google.android.gms.internal.firebase-auth-api.zzum.zzc;
            case 5:
                com.google.android.gms.internal.firebase-auth-api.zzalf$zza v1_15 = com.google.android.gms.internal.firebase-auth-api.zzum.zzd;
                if (v1_15 != null) {
                    return v1_15;
                } else {
                    com.google.android.gms.internal.firebase-auth-api.zzalf$zza v1_1 = com.google.android.gms.internal.firebase-auth-api.zzum.zzd;
                    if (v1_1 == null) {
                        v1_1 = new com.google.android.gms.internal.firebase-auth-api.zzalf$zza(com.google.android.gms.internal.firebase-auth-api.zzum.zzc);
                        com.google.android.gms.internal.firebase-auth-api.zzum.zzd = v1_1;
                    }
                    return v1_1;
                }
            case 6:
                return Byte.valueOf(1);
            default:
                throw 0;
        }
    }

    public final int zzb()
    {
        return this.zzf;
    }
}
