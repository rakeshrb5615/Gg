package com.google.android.gms.internal.firebase-auth-api;
public final enum class zzwm extends java.lang.Enum implements com.google.android.gms.internal.firebase-auth-api.zzalk {
    public static final enum com.google.android.gms.internal.firebase-auth-api.zzwm zza;
    public static final enum com.google.android.gms.internal.firebase-auth-api.zzwm zzb;
    public static final enum com.google.android.gms.internal.firebase-auth-api.zzwm zzc;
    public static final enum com.google.android.gms.internal.firebase-auth-api.zzwm zzd;
    public static final enum com.google.android.gms.internal.firebase-auth-api.zzwm zze;
    private static final enum com.google.android.gms.internal.firebase-auth-api.zzwm zzf;
    private static final synthetic com.google.android.gms.internal.firebase-auth-api.zzwm[] zzg;
    private final int zzh;

    static zzwm()
    {
        com.google.android.gms.internal.firebase-auth-api.zzwm[] v0_1 = new com.google.android.gms.internal.firebase-auth-api.zzwm("KEM_UNKNOWN", 0, 0);
        com.google.android.gms.internal.firebase-auth-api.zzwm.zzf = v0_1;
        com.google.android.gms.internal.firebase-auth-api.zzwm.zza = new com.google.android.gms.internal.firebase-auth-api.zzwm("DHKEM_X25519_HKDF_SHA256", 1, 1);
        com.google.android.gms.internal.firebase-auth-api.zzwm.zzb = new com.google.android.gms.internal.firebase-auth-api.zzwm("DHKEM_P256_HKDF_SHA256", 2, 2);
        com.google.android.gms.internal.firebase-auth-api.zzwm.zzc = new com.google.android.gms.internal.firebase-auth-api.zzwm("DHKEM_P384_HKDF_SHA384", 3, 3);
        com.google.android.gms.internal.firebase-auth-api.zzwm.zzd = new com.google.android.gms.internal.firebase-auth-api.zzwm("DHKEM_P521_HKDF_SHA512", 4, 4);
        com.google.android.gms.internal.firebase-auth-api.zzwm v5_3 = new com.google.android.gms.internal.firebase-auth-api.zzwm("UNRECOGNIZED", 5, -1);
        com.google.android.gms.internal.firebase-auth-api.zzwm.zze = v5_3;
        com.google.android.gms.internal.firebase-auth-api.zzwm.zzg = new com.google.android.gms.internal.firebase-auth-api.zzwm[] {v0_1, v5_3});
        return;
    }

    private zzwm(String p1, int p2, int p3)
    {
        super(p1, p2);
        super.zzh = p3;
        return;
    }

    public static com.google.android.gms.internal.firebase-auth-api.zzwm[] values()
    {
        return ((com.google.android.gms.internal.firebase-auth-api.zzwm[]) com.google.android.gms.internal.firebase-auth-api.zzwm.zzg.clone());
    }

    public static com.google.android.gms.internal.firebase-auth-api.zzwm zza(int p1)
    {
        if (p1 == null) {
            return com.google.android.gms.internal.firebase-auth-api.zzwm.zzf;
        } else {
            if (p1 == 1) {
                return com.google.android.gms.internal.firebase-auth-api.zzwm.zza;
            } else {
                if (p1 == 2) {
                    return com.google.android.gms.internal.firebase-auth-api.zzwm.zzb;
                } else {
                    if (p1 == 3) {
                        return com.google.android.gms.internal.firebase-auth-api.zzwm.zzc;
                    } else {
                        if (p1 == 4) {
                            return com.google.android.gms.internal.firebase-auth-api.zzwm.zzd;
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
        v0_1.append(com.google.android.gms.internal.firebase-auth-api.zzwm.getName());
        v0_1.append(64);
        v0_1.append(Integer.toHexString(System.identityHashCode(this)));
        if (this != com.google.android.gms.internal.firebase-auth-api.zzwm.zze) {
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
        if (this == com.google.android.gms.internal.firebase-auth-api.zzwm.zze) {
            throw new IllegalArgumentException("Can\'t get the number of an unknown enum value.");
        } else {
            return this.zzh;
        }
    }
}
