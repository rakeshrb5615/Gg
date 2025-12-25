package com.google.android.gms.internal.firebase-auth-api;
public final class zzvk extends com.google.android.gms.internal.firebase-auth-api.zzalf implements com.google.android.gms.internal.firebase-auth-api.zzamo {
    private static final com.google.android.gms.internal.firebase-auth-api.zzvk zzc;
    private static volatile com.google.android.gms.internal.firebase-auth-api.zzamv zzd;
    private int zze;
    private com.google.android.gms.internal.firebase-auth-api.zzvt zzf;
    private com.google.android.gms.internal.firebase-auth-api.zzve zzg;
    private int zzh;

    static zzvk()
    {
        com.google.android.gms.internal.firebase-auth-api.zzvk v0_1 = new com.google.android.gms.internal.firebase-auth-api.zzvk();
        com.google.android.gms.internal.firebase-auth-api.zzvk.zzc = v0_1;
        com.google.android.gms.internal.firebase-auth-api.zzalf.zza(com.google.android.gms.internal.firebase-auth-api.zzvk, v0_1);
        return;
    }

    private zzvk()
    {
        return;
    }

    public static synthetic void zza(com.google.android.gms.internal.firebase-auth-api.zzvk p0, com.google.android.gms.internal.firebase-auth-api.zzvb p1)
    {
        p0.zzh = p1.zza();
        return;
    }

    public static synthetic void zza(com.google.android.gms.internal.firebase-auth-api.zzvk p0, com.google.android.gms.internal.firebase-auth-api.zzve p1)
    {
        p1.getClass();
        p0.zzg = p1;
        p0.zze = (p0.zze | 2);
        return;
    }

    public static synthetic void zza(com.google.android.gms.internal.firebase-auth-api.zzvk p0, com.google.android.gms.internal.firebase-auth-api.zzvt p1)
    {
        p1.getClass();
        p0.zzf = p1;
        p0.zze = (p0.zze | 1);
        return;
    }

    public static com.google.android.gms.internal.firebase-auth-api.zzvk$zza zzc()
    {
        return ((com.google.android.gms.internal.firebase-auth-api.zzvk$zza) com.google.android.gms.internal.firebase-auth-api.zzvk.zzc.zzm());
    }

    public static bridge synthetic com.google.android.gms.internal.firebase-auth-api.zzvk zzd()
    {
        return com.google.android.gms.internal.firebase-auth-api.zzvk.zzc;
    }

    public static com.google.android.gms.internal.firebase-auth-api.zzvk zze()
    {
        return com.google.android.gms.internal.firebase-auth-api.zzvk.zzc;
    }

    public final com.google.android.gms.internal.firebase-auth-api.zzvb zza()
    {
        com.google.android.gms.internal.firebase-auth-api.zzvb v0_1 = com.google.android.gms.internal.firebase-auth-api.zzvb.zza(this.zzh);
        if (v0_1 == null) {
            v0_1 = com.google.android.gms.internal.firebase-auth-api.zzvb.zzd;
        }
        return v0_1;
    }

    public final Object zza(int p2, Object p3, Object p4)
    {
        switch (com.google.android.gms.internal.firebase-auth-api.zzvj.zza[(p2 - 1)]) {
            case 1:
                return new com.google.android.gms.internal.firebase-auth-api.zzvk();
            case 2:
                return new com.google.android.gms.internal.firebase-auth-api.zzvk$zza(0);
            case 3:
                return com.google.android.gms.internal.firebase-auth-api.zzalf.zza(com.google.android.gms.internal.firebase-auth-api.zzvk.zzc, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u1009\u0000\u0002\u1009\u0001\u0003\u000c", new Object[] {"zze", "zzf", "zzg", "zzh"}));
            case 4:
                return com.google.android.gms.internal.firebase-auth-api.zzvk.zzc;
            case 5:
                com.google.android.gms.internal.firebase-auth-api.zzalf$zza v2_15 = com.google.android.gms.internal.firebase-auth-api.zzvk.zzd;
                if (v2_15 != null) {
                    return v2_15;
                } else {
                    com.google.android.gms.internal.firebase-auth-api.zzalf$zza v2_1 = com.google.android.gms.internal.firebase-auth-api.zzvk.zzd;
                    if (v2_1 == null) {
                        v2_1 = new com.google.android.gms.internal.firebase-auth-api.zzalf$zza(com.google.android.gms.internal.firebase-auth-api.zzvk.zzc);
                        com.google.android.gms.internal.firebase-auth-api.zzvk.zzd = v2_1;
                    }
                    return v2_1;
                }
            case 6:
                return Byte.valueOf(1);
            default:
                throw 0;
        }
    }

    public final com.google.android.gms.internal.firebase-auth-api.zzve zzb()
    {
        com.google.android.gms.internal.firebase-auth-api.zzve v0 = this.zzg;
        if (v0 == null) {
            v0 = com.google.android.gms.internal.firebase-auth-api.zzve.zzc();
        }
        return v0;
    }

    public final com.google.android.gms.internal.firebase-auth-api.zzvt zzf()
    {
        com.google.android.gms.internal.firebase-auth-api.zzvt v0 = this.zzf;
        if (v0 == null) {
            v0 = com.google.android.gms.internal.firebase-auth-api.zzvt.zzc();
        }
        return v0;
    }
}
