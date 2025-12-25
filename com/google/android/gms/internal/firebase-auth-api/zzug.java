package com.google.android.gms.internal.firebase-auth-api;
public final class zzug extends com.google.android.gms.internal.firebase-auth-api.zzalf implements com.google.android.gms.internal.firebase-auth-api.zzamo {
    private static final com.google.android.gms.internal.firebase-auth-api.zzug zzc;
    private static volatile com.google.android.gms.internal.firebase-auth-api.zzamv zzd;
    private int zze;
    private int zzf;

    static zzug()
    {
        com.google.android.gms.internal.firebase-auth-api.zzug v0_1 = new com.google.android.gms.internal.firebase-auth-api.zzug();
        com.google.android.gms.internal.firebase-auth-api.zzug.zzc = v0_1;
        com.google.android.gms.internal.firebase-auth-api.zzalf.zza(com.google.android.gms.internal.firebase-auth-api.zzug, v0_1);
        return;
    }

    private zzug()
    {
        return;
    }

    public static com.google.android.gms.internal.firebase-auth-api.zzug zza(com.google.android.gms.internal.firebase-auth-api.zzajv p1, com.google.android.gms.internal.firebase-auth-api.zzaku p2)
    {
        return ((com.google.android.gms.internal.firebase-auth-api.zzug) com.google.android.gms.internal.firebase-auth-api.zzalf.zza(com.google.android.gms.internal.firebase-auth-api.zzug.zzc, p1, p2));
    }

    public static synthetic void zza(com.google.android.gms.internal.firebase-auth-api.zzug p0, int p1)
    {
        p0.zze = p1;
        return;
    }

    public static com.google.android.gms.internal.firebase-auth-api.zzug$zza zzc()
    {
        return ((com.google.android.gms.internal.firebase-auth-api.zzug$zza) com.google.android.gms.internal.firebase-auth-api.zzug.zzc.zzm());
    }

    public static bridge synthetic com.google.android.gms.internal.firebase-auth-api.zzug zzd()
    {
        return com.google.android.gms.internal.firebase-auth-api.zzug.zzc;
    }

    public final int zza()
    {
        return this.zze;
    }

    public final Object zza(int p1, Object p2, Object p3)
    {
        switch (com.google.android.gms.internal.firebase-auth-api.zzui.zza[(p1 - 1)]) {
            case 1:
                return new com.google.android.gms.internal.firebase-auth-api.zzug();
            case 2:
                return new com.google.android.gms.internal.firebase-auth-api.zzug$zza(0);
            case 3:
                return com.google.android.gms.internal.firebase-auth-api.zzalf.zza(com.google.android.gms.internal.firebase-auth-api.zzug.zzc, "\u0000\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0000\u0000\u0002\u000b\u0003\u000b", new Object[] {"zze", "zzf"}));
            case 4:
                return com.google.android.gms.internal.firebase-auth-api.zzug.zzc;
            case 5:
                com.google.android.gms.internal.firebase-auth-api.zzalf$zza v1_15 = com.google.android.gms.internal.firebase-auth-api.zzug.zzd;
                if (v1_15 != null) {
                    return v1_15;
                } else {
                    com.google.android.gms.internal.firebase-auth-api.zzalf$zza v1_1 = com.google.android.gms.internal.firebase-auth-api.zzug.zzd;
                    if (v1_1 == null) {
                        v1_1 = new com.google.android.gms.internal.firebase-auth-api.zzalf$zza(com.google.android.gms.internal.firebase-auth-api.zzug.zzc);
                        com.google.android.gms.internal.firebase-auth-api.zzug.zzd = v1_1;
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
