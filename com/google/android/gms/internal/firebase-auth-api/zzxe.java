package com.google.android.gms.internal.firebase-auth-api;
public final class zzxe extends com.google.android.gms.internal.firebase-auth-api.zzalf implements com.google.android.gms.internal.firebase-auth-api.zzamo {
    private static final com.google.android.gms.internal.firebase-auth-api.zzxe zzc;
    private static volatile com.google.android.gms.internal.firebase-auth-api.zzamv zzd;
    private String zze;
    private String zzf;
    private int zzg;
    private boolean zzh;
    private String zzi;

    static zzxe()
    {
        com.google.android.gms.internal.firebase-auth-api.zzxe v0_1 = new com.google.android.gms.internal.firebase-auth-api.zzxe();
        com.google.android.gms.internal.firebase-auth-api.zzxe.zzc = v0_1;
        com.google.android.gms.internal.firebase-auth-api.zzalf.zza(com.google.android.gms.internal.firebase-auth-api.zzxe, v0_1);
        return;
    }

    private zzxe()
    {
        this.zze = "";
        this.zzf = "";
        this.zzi = "";
        return;
    }

    public static bridge synthetic com.google.android.gms.internal.firebase-auth-api.zzxe zza()
    {
        return com.google.android.gms.internal.firebase-auth-api.zzxe.zzc;
    }

    public final Object zza(int p3, Object p4, Object p5)
    {
        switch (com.google.android.gms.internal.firebase-auth-api.zzxg.zza[(p3 - 1)]) {
            case 1:
                return new com.google.android.gms.internal.firebase-auth-api.zzxe();
            case 2:
                return new com.google.android.gms.internal.firebase-auth-api.zzxe$zza(0);
            case 3:
                return com.google.android.gms.internal.firebase-auth-api.zzalf.zza(com.google.android.gms.internal.firebase-auth-api.zzxe.zzc, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001\u0208\u0002\u0208\u0003\u000b\u0004\u0007\u0005\u0208", new Object[] {"zze", "zzf", "zzg", "zzh", "zzi"}));
            case 4:
                return com.google.android.gms.internal.firebase-auth-api.zzxe.zzc;
            case 5:
                com.google.android.gms.internal.firebase-auth-api.zzalf$zza v3_15 = com.google.android.gms.internal.firebase-auth-api.zzxe.zzd;
                if (v3_15 != null) {
                    return v3_15;
                } else {
                    com.google.android.gms.internal.firebase-auth-api.zzalf$zza v3_1 = com.google.android.gms.internal.firebase-auth-api.zzxe.zzd;
                    if (v3_1 == null) {
                        v3_1 = new com.google.android.gms.internal.firebase-auth-api.zzalf$zza(com.google.android.gms.internal.firebase-auth-api.zzxe.zzc);
                        com.google.android.gms.internal.firebase-auth-api.zzxe.zzd = v3_1;
                    }
                    return v3_1;
                }
            case 6:
                return Byte.valueOf(1);
            default:
                throw 0;
        }
    }
}
