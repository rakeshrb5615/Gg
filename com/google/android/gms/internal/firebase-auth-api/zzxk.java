package com.google.android.gms.internal.firebase-auth-api;
public final class zzxk extends com.google.android.gms.internal.firebase-auth-api.zzalf implements com.google.android.gms.internal.firebase-auth-api.zzamo {
    private static final com.google.android.gms.internal.firebase-auth-api.zzxk zzc;
    private static volatile com.google.android.gms.internal.firebase-auth-api.zzamv zzd;
    private int zze;
    private com.google.android.gms.internal.firebase-auth-api.zzalm zzf;

    static zzxk()
    {
        com.google.android.gms.internal.firebase-auth-api.zzxk v0_1 = new com.google.android.gms.internal.firebase-auth-api.zzxk();
        com.google.android.gms.internal.firebase-auth-api.zzxk.zzc = v0_1;
        com.google.android.gms.internal.firebase-auth-api.zzalf.zza(com.google.android.gms.internal.firebase-auth-api.zzxk, v0_1);
        return;
    }

    private zzxk()
    {
        this.zzf = com.google.android.gms.internal.firebase-auth-api.zzalf.zzp();
        return;
    }

    public static com.google.android.gms.internal.firebase-auth-api.zzxk$zza zza()
    {
        return ((com.google.android.gms.internal.firebase-auth-api.zzxk$zza) com.google.android.gms.internal.firebase-auth-api.zzxk.zzc.zzm());
    }

    public static synthetic void zza(com.google.android.gms.internal.firebase-auth-api.zzxk p0, int p1)
    {
        p0.zze = p1;
        return;
    }

    public static synthetic void zza(com.google.android.gms.internal.firebase-auth-api.zzxk p2, com.google.android.gms.internal.firebase-auth-api.zzxk$zzb p3)
    {
        p3.getClass();
        com.google.android.gms.internal.firebase-auth-api.zzalm v0_0 = p2.zzf;
        if (!v0_0.zzc()) {
            p2.zzf = com.google.android.gms.internal.firebase-auth-api.zzalf.zza(v0_0);
        }
        p2.zzf.add(p3);
        return;
    }

    public static bridge synthetic com.google.android.gms.internal.firebase-auth-api.zzxk zzb()
    {
        return com.google.android.gms.internal.firebase-auth-api.zzxk.zzc;
    }

    public final Object zza(int p1, Object p2, Object p3)
    {
        switch (com.google.android.gms.internal.firebase-auth-api.zzxm.zza[(p1 - 1)]) {
            case 1:
                return new com.google.android.gms.internal.firebase-auth-api.zzxk();
            case 2:
                return new com.google.android.gms.internal.firebase-auth-api.zzxk$zza(0);
            case 3:
                return com.google.android.gms.internal.firebase-auth-api.zzalf.zza(com.google.android.gms.internal.firebase-auth-api.zzxk.zzc, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[] {"zze", "zzf", com.google.android.gms.internal.firebase-auth-api.zzxk$zzb}));
            case 4:
                return com.google.android.gms.internal.firebase-auth-api.zzxk.zzc;
            case 5:
                com.google.android.gms.internal.firebase-auth-api.zzalf$zza v1_15 = com.google.android.gms.internal.firebase-auth-api.zzxk.zzd;
                if (v1_15 != null) {
                    return v1_15;
                } else {
                    com.google.android.gms.internal.firebase-auth-api.zzalf$zza v1_1 = com.google.android.gms.internal.firebase-auth-api.zzxk.zzd;
                    if (v1_1 == null) {
                        v1_1 = new com.google.android.gms.internal.firebase-auth-api.zzalf$zza(com.google.android.gms.internal.firebase-auth-api.zzxk.zzc);
                        com.google.android.gms.internal.firebase-auth-api.zzxk.zzd = v1_1;
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
