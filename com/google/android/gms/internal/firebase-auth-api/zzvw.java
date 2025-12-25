package com.google.android.gms.internal.firebase-auth-api;
public final enum class zzvw extends java.lang.Enum implements com.google.android.gms.internal.firebase-auth-api.zzalk {
    public static final enum com.google.android.gms.internal.firebase-auth-api.zzvw zza;
    public static final enum com.google.android.gms.internal.firebase-auth-api.zzvw zzb;
    public static final enum com.google.android.gms.internal.firebase-auth-api.zzvw zzc;
    public static final enum com.google.android.gms.internal.firebase-auth-api.zzvw zzd;
    public static final enum com.google.android.gms.internal.firebase-auth-api.zzvw zze;
    private static final enum com.google.android.gms.internal.firebase-auth-api.zzvw zzf;
    private static final synthetic com.google.android.gms.internal.firebase-auth-api.zzvw[] zzg;
    private final int zzh;

    static zzvw()
    {
        com.google.android.gms.internal.firebase-auth-api.zzvw[] v0_1 = new com.google.android.gms.internal.firebase-auth-api.zzvw("UNKNOWN_CURVE", 0, 0);
        com.google.android.gms.internal.firebase-auth-api.zzvw.zzf = v0_1;
        com.google.android.gms.internal.firebase-auth-api.zzvw.zza = new com.google.android.gms.internal.firebase-auth-api.zzvw("NIST_P256", 1, 2);
        com.google.android.gms.internal.firebase-auth-api.zzvw.zzb = new com.google.android.gms.internal.firebase-auth-api.zzvw("NIST_P384", 2, 3);
        com.google.android.gms.internal.firebase-auth-api.zzvw.zzc = new com.google.android.gms.internal.firebase-auth-api.zzvw("NIST_P521", 3, 4);
        com.google.android.gms.internal.firebase-auth-api.zzvw.zzd = new com.google.android.gms.internal.firebase-auth-api.zzvw("CURVE25519", 4, 5);
        com.google.android.gms.internal.firebase-auth-api.zzvw v5_3 = new com.google.android.gms.internal.firebase-auth-api.zzvw("UNRECOGNIZED", 5, -1);
        com.google.android.gms.internal.firebase-auth-api.zzvw.zze = v5_3;
        com.google.android.gms.internal.firebase-auth-api.zzvw.zzg = new com.google.android.gms.internal.firebase-auth-api.zzvw[] {v0_1, v5_3});
        return;
    }

    private zzvw(String p1, int p2, int p3)
    {
        super(p1, p2);
        super.zzh = p3;
        return;
    }

    public static com.google.android.gms.internal.firebase-auth-api.zzvw[] values()
    {
        return ((com.google.android.gms.internal.firebase-auth-api.zzvw[]) com.google.android.gms.internal.firebase-auth-api.zzvw.zzg.clone());
    }

    public static com.google.android.gms.internal.firebase-auth-api.zzvw zza(int p1)
    {
        if (p1 == null) {
            return com.google.android.gms.internal.firebase-auth-api.zzvw.zzf;
        } else {
            if (p1 == 2) {
                return com.google.android.gms.internal.firebase-auth-api.zzvw.zza;
            } else {
                if (p1 == 3) {
                    return com.google.android.gms.internal.firebase-auth-api.zzvw.zzb;
                } else {
                    if (p1 == 4) {
                        return com.google.android.gms.internal.firebase-auth-api.zzvw.zzc;
                    } else {
                        if (p1 == 5) {
                            return com.google.android.gms.internal.firebase-auth-api.zzvw.zzd;
                        } else {
                            return 0;
                        }
                    }
                }
            }
        }
    }

    public final String toString()
    {
        String v0_1 = new StringBuilder("<");
        v0_1.append(com.google.android.gms.internal.firebase-auth-api.zzvw.getName());
        v0_1.append(64);
        v0_1.append(Integer.toHexString(System.identityHashCode(this)));
        if (this != com.google.android.gms.internal.firebase-auth-api.zzvw.zze) {
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
        if (this == com.google.android.gms.internal.firebase-auth-api.zzvw.zze) {
            throw new IllegalArgumentException("Can\'t get the number of an unknown enum value.");
        } else {
            return this.zzh;
        }
    }
}
