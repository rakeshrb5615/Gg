package com.google.android.gms.internal.firebase-auth-api;
public final class zzxt extends com.google.android.gms.internal.firebase-auth-api.zzalf implements com.google.android.gms.internal.firebase-auth-api.zzamo {
    private static final com.google.android.gms.internal.firebase-auth-api.zzxt zzc;
    private static volatile com.google.android.gms.internal.firebase-auth-api.zzamv zzd;
    private int zze;
    private int zzf;
    private com.google.android.gms.internal.firebase-auth-api.zzxw zzg;

    static zzxt()
    {
        com.google.android.gms.internal.firebase-auth-api.zzxt v0_1 = new com.google.android.gms.internal.firebase-auth-api.zzxt();
        com.google.android.gms.internal.firebase-auth-api.zzxt.zzc = v0_1;
        com.google.android.gms.internal.firebase-auth-api.zzalf.zza(com.google.android.gms.internal.firebase-auth-api.zzxt, v0_1);
        return;
    }

    private zzxt()
    {
        return;
    }

    public static com.google.android.gms.internal.firebase-auth-api.zzxt zza(com.google.android.gms.internal.firebase-auth-api.zzajv p1, com.google.android.gms.internal.firebase-auth-api.zzaku p2)
    {
        return ((com.google.android.gms.internal.firebase-auth-api.zzxt) com.google.android.gms.internal.firebase-auth-api.zzalf.zza(com.google.android.gms.internal.firebase-auth-api.zzxt.zzc, p1, p2));
    }

    public static synthetic void zza(com.google.android.gms.internal.firebase-auth-api.zzxt p0, com.google.android.gms.internal.firebase-auth-api.zzxw p1)
    {
        p1.getClass();
        p0.zzg = p1;
        p0.zze = (p0.zze | 1);
        return;
    }

    public static com.google.android.gms.internal.firebase-auth-api.zzxt$zza zzb()
    {
        return ((com.google.android.gms.internal.firebase-auth-api.zzxt$zza) com.google.android.gms.internal.firebase-auth-api.zzxt.zzc.zzm());
    }

    public static bridge synthetic com.google.android.gms.internal.firebase-auth-api.zzxt zzc()
    {
        return com.google.android.gms.internal.firebase-auth-api.zzxt.zzc;
    }

    public static com.google.android.gms.internal.firebase-auth-api.zzamv zze()
    {
        return ((com.google.android.gms.internal.firebase-auth-api.zzamv) com.google.android.gms.internal.firebase-auth-api.zzxt.zzc.zza(com.google.android.gms.internal.firebase-auth-api.zzalf$zze.zzg, 0, 0));
    }

    public final int zza()
    {
        return this.zzf;
    }

    public final Object zza(int p1, Object p2, Object p3)
    {
        switch (com.google.android.gms.internal.firebase-auth-api.zzxv.zza[(p1 - 1)]) {
            case 1:
                return new com.google.android.gms.internal.firebase-auth-api.zzxt();
            case 2:
                return new com.google.android.gms.internal.firebase-auth-api.zzxt$zza(0);
            case 3:
                return com.google.android.gms.internal.firebase-auth-api.zzalf.zza(com.google.android.gms.internal.firebase-auth-api.zzxt.zzc, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\u1009\u0000", new Object[] {"zze", "zzf", "zzg"}));
            case 4:
                return com.google.android.gms.internal.firebase-auth-api.zzxt.zzc;
            case 5:
                com.google.android.gms.internal.firebase-auth-api.zzalf$zza v1_15 = com.google.android.gms.internal.firebase-auth-api.zzxt.zzd;
                if (v1_15 != null) {
                    return v1_15;
                } else {
                    com.google.android.gms.internal.firebase-auth-api.zzalf$zza v1_1 = com.google.android.gms.internal.firebase-auth-api.zzxt.zzd;
                    if (v1_1 == null) {
                        v1_1 = new com.google.android.gms.internal.firebase-auth-api.zzalf$zza(com.google.android.gms.internal.firebase-auth-api.zzxt.zzc);
                        com.google.android.gms.internal.firebase-auth-api.zzxt.zzd = v1_1;
                    }
                    return v1_1;
                }
            case 6:
                return Byte.valueOf(1);
            default:
                throw 0;
        }
    }

    public final com.google.android.gms.internal.firebase-auth-api.zzxw zzd()
    {
        com.google.android.gms.internal.firebase-auth-api.zzxw v0 = this.zzg;
        if (v0 == null) {
            v0 = com.google.android.gms.internal.firebase-auth-api.zzxw.zzd();
        }
        return v0;
    }
}
