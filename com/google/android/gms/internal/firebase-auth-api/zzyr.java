package com.google.android.gms.internal.firebase-auth-api;
public final class zzyr extends com.google.android.gms.internal.firebase-auth-api.zzalf implements com.google.android.gms.internal.firebase-auth-api.zzamo {
    private static final com.google.android.gms.internal.firebase-auth-api.zzyr zzc;
    private static volatile com.google.android.gms.internal.firebase-auth-api.zzamv zzd;
    private int zze;

    static zzyr()
    {
        com.google.android.gms.internal.firebase-auth-api.zzyr v0_1 = new com.google.android.gms.internal.firebase-auth-api.zzyr();
        com.google.android.gms.internal.firebase-auth-api.zzyr.zzc = v0_1;
        com.google.android.gms.internal.firebase-auth-api.zzalf.zza(com.google.android.gms.internal.firebase-auth-api.zzyr, v0_1);
        return;
    }

    private zzyr()
    {
        return;
    }

    public static com.google.android.gms.internal.firebase-auth-api.zzyr zza(com.google.android.gms.internal.firebase-auth-api.zzajv p1, com.google.android.gms.internal.firebase-auth-api.zzaku p2)
    {
        return ((com.google.android.gms.internal.firebase-auth-api.zzyr) com.google.android.gms.internal.firebase-auth-api.zzalf.zza(com.google.android.gms.internal.firebase-auth-api.zzyr.zzc, p1, p2));
    }

    public static bridge synthetic com.google.android.gms.internal.firebase-auth-api.zzyr zzb()
    {
        return com.google.android.gms.internal.firebase-auth-api.zzyr.zzc;
    }

    public static com.google.android.gms.internal.firebase-auth-api.zzyr zzc()
    {
        return com.google.android.gms.internal.firebase-auth-api.zzyr.zzc;
    }

    public final int zza()
    {
        return this.zze;
    }

    public final Object zza(int p1, Object p2, Object p3)
    {
        switch (com.google.android.gms.internal.firebase-auth-api.zzyq.zza[(p1 - 1)]) {
            case 1:
                return new com.google.android.gms.internal.firebase-auth-api.zzyr();
            case 2:
                return new com.google.android.gms.internal.firebase-auth-api.zzyr$zza(0);
            case 3:
                return com.google.android.gms.internal.firebase-auth-api.zzalf.zza(com.google.android.gms.internal.firebase-auth-api.zzyr.zzc, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[] {"zze"}));
            case 4:
                return com.google.android.gms.internal.firebase-auth-api.zzyr.zzc;
            case 5:
                com.google.android.gms.internal.firebase-auth-api.zzalf$zza v1_15 = com.google.android.gms.internal.firebase-auth-api.zzyr.zzd;
                if (v1_15 != null) {
                    return v1_15;
                } else {
                    com.google.android.gms.internal.firebase-auth-api.zzalf$zza v1_1 = com.google.android.gms.internal.firebase-auth-api.zzyr.zzd;
                    if (v1_1 == null) {
                        v1_1 = new com.google.android.gms.internal.firebase-auth-api.zzalf$zza(com.google.android.gms.internal.firebase-auth-api.zzyr.zzc);
                        com.google.android.gms.internal.firebase-auth-api.zzyr.zzd = v1_1;
                    }
                    return v1_1;
                }
            case 6:
                return Byte.valueOf(1);
            default:
                throw 0;
        }
    }
}
