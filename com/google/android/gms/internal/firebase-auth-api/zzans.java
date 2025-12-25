package com.google.android.gms.internal.firebase-auth-api;
public final class zzans extends com.google.android.gms.internal.firebase-auth-api.zzalf implements com.google.android.gms.internal.firebase-auth-api.zzamo {
    private static final com.google.android.gms.internal.firebase-auth-api.zzans zzc;
    private static volatile com.google.android.gms.internal.firebase-auth-api.zzamv zzd;
    private long zze;
    private int zzf;

    static zzans()
    {
        com.google.android.gms.internal.firebase-auth-api.zzans v0_1 = new com.google.android.gms.internal.firebase-auth-api.zzans();
        com.google.android.gms.internal.firebase-auth-api.zzans.zzc = v0_1;
        com.google.android.gms.internal.firebase-auth-api.zzalf.zza(com.google.android.gms.internal.firebase-auth-api.zzans, v0_1);
        return;
    }

    private zzans()
    {
        return;
    }

    public static synthetic void zza(com.google.android.gms.internal.firebase-auth-api.zzans p0, int p1)
    {
        p0.zzf = p1;
        return;
    }

    public static synthetic void zza(com.google.android.gms.internal.firebase-auth-api.zzans p0, long p1)
    {
        p0.zze = p1;
        return;
    }

    public static com.google.android.gms.internal.firebase-auth-api.zzans$zza zzc()
    {
        return ((com.google.android.gms.internal.firebase-auth-api.zzans$zza) com.google.android.gms.internal.firebase-auth-api.zzans.zzc.zzm());
    }

    public static bridge synthetic com.google.android.gms.internal.firebase-auth-api.zzans zzd()
    {
        return com.google.android.gms.internal.firebase-auth-api.zzans.zzc;
    }

    public final int zza()
    {
        return this.zzf;
    }

    public final Object zza(int p1, Object p2, Object p3)
    {
        switch (com.google.android.gms.internal.firebase-auth-api.zzanr.zza[(p1 - 1)]) {
            case 1:
                return new com.google.android.gms.internal.firebase-auth-api.zzans();
            case 2:
                return new com.google.android.gms.internal.firebase-auth-api.zzans$zza(0);
            case 3:
                return com.google.android.gms.internal.firebase-auth-api.zzalf.zza(com.google.android.gms.internal.firebase-auth-api.zzans.zzc, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0002\u0002\u0004", new Object[] {"zze", "zzf"}));
            case 4:
                return com.google.android.gms.internal.firebase-auth-api.zzans.zzc;
            case 5:
                com.google.android.gms.internal.firebase-auth-api.zzalf$zza v1_15 = com.google.android.gms.internal.firebase-auth-api.zzans.zzd;
                if (v1_15 != null) {
                    return v1_15;
                } else {
                    com.google.android.gms.internal.firebase-auth-api.zzalf$zza v1_1 = com.google.android.gms.internal.firebase-auth-api.zzans.zzd;
                    if (v1_1 == null) {
                        v1_1 = new com.google.android.gms.internal.firebase-auth-api.zzalf$zza(com.google.android.gms.internal.firebase-auth-api.zzans.zzc);
                        com.google.android.gms.internal.firebase-auth-api.zzans.zzd = v1_1;
                    }
                    return v1_1;
                }
            case 6:
                return Byte.valueOf(1);
            default:
                throw 0;
        }
    }

    public final long zzb()
    {
        return this.zze;
    }
}
