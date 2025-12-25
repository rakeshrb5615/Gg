package com.google.android.gms.internal.firebase-auth-api;
public final enum class zzvb extends java.lang.Enum implements com.google.android.gms.internal.firebase-auth-api.zzalk {
    public static final enum com.google.android.gms.internal.firebase-auth-api.zzvb zza;
    public static final enum com.google.android.gms.internal.firebase-auth-api.zzvb zzb;
    public static final enum com.google.android.gms.internal.firebase-auth-api.zzvb zzc;
    public static final enum com.google.android.gms.internal.firebase-auth-api.zzvb zzd;
    private static final enum com.google.android.gms.internal.firebase-auth-api.zzvb zze;
    private static final synthetic com.google.android.gms.internal.firebase-auth-api.zzvb[] zzf;
    private final int zzg;

    static zzvb()
    {
        com.google.android.gms.internal.firebase-auth-api.zzvb[] v0_2 = new com.google.android.gms.internal.firebase-auth-api.zzvb("UNKNOWN_FORMAT", 0, 0);
        com.google.android.gms.internal.firebase-auth-api.zzvb.zze = v0_2;
        com.google.android.gms.internal.firebase-auth-api.zzvb v1_2 = new com.google.android.gms.internal.firebase-auth-api.zzvb("UNCOMPRESSED", 1, 1);
        com.google.android.gms.internal.firebase-auth-api.zzvb.zza = v1_2;
        com.google.android.gms.internal.firebase-auth-api.zzvb v2_1 = new com.google.android.gms.internal.firebase-auth-api.zzvb("COMPRESSED", 2, 2);
        com.google.android.gms.internal.firebase-auth-api.zzvb.zzb = v2_1;
        com.google.android.gms.internal.firebase-auth-api.zzvb v3_2 = new com.google.android.gms.internal.firebase-auth-api.zzvb("DO_NOT_USE_CRUNCHY_UNCOMPRESSED", 3, 3);
        com.google.android.gms.internal.firebase-auth-api.zzvb.zzc = v3_2;
        com.google.android.gms.internal.firebase-auth-api.zzvb v4_3 = new com.google.android.gms.internal.firebase-auth-api.zzvb("UNRECOGNIZED", 4, -1);
        com.google.android.gms.internal.firebase-auth-api.zzvb.zzd = v4_3;
        com.google.android.gms.internal.firebase-auth-api.zzvb.zzf = new com.google.android.gms.internal.firebase-auth-api.zzvb[] {v0_2, v1_2, v2_1, v3_2, v4_3});
        return;
    }

    private zzvb(String p1, int p2, int p3)
    {
        super(p1, p2);
        super.zzg = p3;
        return;
    }

    public static com.google.android.gms.internal.firebase-auth-api.zzvb[] values()
    {
        return ((com.google.android.gms.internal.firebase-auth-api.zzvb[]) com.google.android.gms.internal.firebase-auth-api.zzvb.zzf.clone());
    }

    public static com.google.android.gms.internal.firebase-auth-api.zzvb zza(int p1)
    {
        if (p1 == null) {
            return com.google.android.gms.internal.firebase-auth-api.zzvb.zze;
        } else {
            if (p1 == 1) {
                return com.google.android.gms.internal.firebase-auth-api.zzvb.zza;
            } else {
                if (p1 == 2) {
                    return com.google.android.gms.internal.firebase-auth-api.zzvb.zzb;
                } else {
                    if (p1 == 3) {
                        return com.google.android.gms.internal.firebase-auth-api.zzvb.zzc;
                    } else {
                        return 0;
                    }
                }
            }
        }
    }

    public final String toString()
    {
        String v0_1 = new StringBuilder("<");
        v0_1.append(com.google.android.gms.internal.firebase-auth-api.zzvb.getName());
        v0_1.append(64);
        v0_1.append(Integer.toHexString(System.identityHashCode(this)));
        if (this != com.google.android.gms.internal.firebase-auth-api.zzvb.zzd) {
            v0_1.append(" number=");
            v0_1.append(this.zza());
        }
        v0_1.append(" name=");
        v0_1.append(this.name());
        v0_1.append(62);
        return v0_1.toString();
    }

    public final int zza()
    {
        if (this == com.google.android.gms.internal.firebase-auth-api.zzvb.zzd) {
            throw new IllegalArgumentException("Can\'t get the number of an unknown enum value.");
        } else {
            return this.zzg;
        }
    }
}
