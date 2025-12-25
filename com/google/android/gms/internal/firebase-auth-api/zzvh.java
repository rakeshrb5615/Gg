package com.google.android.gms.internal.firebase-auth-api;
public final class zzvh extends com.google.android.gms.internal.firebase-auth-api.zzalf implements com.google.android.gms.internal.firebase-auth-api.zzamo {
    private static final com.google.android.gms.internal.firebase-auth-api.zzvh zzc;
    private static volatile com.google.android.gms.internal.firebase-auth-api.zzamv zzd;
    private int zze;
    private com.google.android.gms.internal.firebase-auth-api.zzvk zzf;

    static zzvh()
    {
        com.google.android.gms.internal.firebase-auth-api.zzvh v0_1 = new com.google.android.gms.internal.firebase-auth-api.zzvh();
        com.google.android.gms.internal.firebase-auth-api.zzvh.zzc = v0_1;
        com.google.android.gms.internal.firebase-auth-api.zzalf.zza(com.google.android.gms.internal.firebase-auth-api.zzvh, v0_1);
        return;
    }

    private zzvh()
    {
        return;
    }

    public static com.google.android.gms.internal.firebase-auth-api.zzvh$zza zza()
    {
        return ((com.google.android.gms.internal.firebase-auth-api.zzvh$zza) com.google.android.gms.internal.firebase-auth-api.zzvh.zzc.zzm());
    }

    public static com.google.android.gms.internal.firebase-auth-api.zzvh zza(com.google.android.gms.internal.firebase-auth-api.zzajv p1, com.google.android.gms.internal.firebase-auth-api.zzaku p2)
    {
        return ((com.google.android.gms.internal.firebase-auth-api.zzvh) com.google.android.gms.internal.firebase-auth-api.zzalf.zza(com.google.android.gms.internal.firebase-auth-api.zzvh.zzc, p1, p2));
    }

    public static synthetic void zza(com.google.android.gms.internal.firebase-auth-api.zzvh p0, com.google.android.gms.internal.firebase-auth-api.zzvk p1)
    {
        p1.getClass();
        p0.zzf = p1;
        p0.zze = (p0.zze | 1);
        return;
    }

    public static bridge synthetic com.google.android.gms.internal.firebase-auth-api.zzvh zzb()
    {
        return com.google.android.gms.internal.firebase-auth-api.zzvh.zzc;
    }

    public final Object zza(int p1, Object p2, Object p3)
    {
        switch (com.google.android.gms.internal.firebase-auth-api.zzvg.zza[(p1 - 1)]) {
            case 1:
                return new com.google.android.gms.internal.firebase-auth-api.zzvh();
            case 2:
                return new com.google.android.gms.internal.firebase-auth-api.zzvh$zza(0);
            case 3:
                return com.google.android.gms.internal.firebase-auth-api.zzalf.zza(com.google.android.gms.internal.firebase-auth-api.zzvh.zzc, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1009\u0000", new Object[] {"zze", "zzf"}));
            case 4:
                return com.google.android.gms.internal.firebase-auth-api.zzvh.zzc;
            case 5:
                com.google.android.gms.internal.firebase-auth-api.zzalf$zza v1_15 = com.google.android.gms.internal.firebase-auth-api.zzvh.zzd;
                if (v1_15 != null) {
                    return v1_15;
                } else {
                    com.google.android.gms.internal.firebase-auth-api.zzalf$zza v1_1 = com.google.android.gms.internal.firebase-auth-api.zzvh.zzd;
                    if (v1_1 == null) {
                        v1_1 = new com.google.android.gms.internal.firebase-auth-api.zzalf$zza(com.google.android.gms.internal.firebase-auth-api.zzvh.zzc);
                        com.google.android.gms.internal.firebase-auth-api.zzvh.zzd = v1_1;
                    }
                    return v1_1;
                }
            case 6:
                return Byte.valueOf(1);
            default:
                throw 0;
        }
    }

    public final com.google.android.gms.internal.firebase-auth-api.zzvk zzc()
    {
        com.google.android.gms.internal.firebase-auth-api.zzvk v0 = this.zzf;
        if (v0 == null) {
            v0 = com.google.android.gms.internal.firebase-auth-api.zzvk.zze();
        }
        return v0;
    }
}
