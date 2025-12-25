package com.google.android.gms.internal.firebase-auth-api;
public final enum class zzwj extends java.lang.Enum implements com.google.android.gms.internal.firebase-auth-api.zzalk {
    public static final enum com.google.android.gms.internal.firebase-auth-api.zzwj zza;
    public static final enum com.google.android.gms.internal.firebase-auth-api.zzwj zzb;
    public static final enum com.google.android.gms.internal.firebase-auth-api.zzwj zzc;
    public static final enum com.google.android.gms.internal.firebase-auth-api.zzwj zzd;
    private static final enum com.google.android.gms.internal.firebase-auth-api.zzwj zze;
    private static final synthetic com.google.android.gms.internal.firebase-auth-api.zzwj[] zzf;
    private final int zzg;

    static zzwj()
    {
        com.google.android.gms.internal.firebase-auth-api.zzwj[] v0_2 = new com.google.android.gms.internal.firebase-auth-api.zzwj("KDF_UNKNOWN", 0, 0);
        com.google.android.gms.internal.firebase-auth-api.zzwj.zze = v0_2;
        com.google.android.gms.internal.firebase-auth-api.zzwj v1_2 = new com.google.android.gms.internal.firebase-auth-api.zzwj("HKDF_SHA256", 1, 1);
        com.google.android.gms.internal.firebase-auth-api.zzwj.zza = v1_2;
        com.google.android.gms.internal.firebase-auth-api.zzwj v2_1 = new com.google.android.gms.internal.firebase-auth-api.zzwj("HKDF_SHA384", 2, 2);
        com.google.android.gms.internal.firebase-auth-api.zzwj.zzb = v2_1;
        com.google.android.gms.internal.firebase-auth-api.zzwj v3_2 = new com.google.android.gms.internal.firebase-auth-api.zzwj("HKDF_SHA512", 3, 3);
        com.google.android.gms.internal.firebase-auth-api.zzwj.zzc = v3_2;
        com.google.android.gms.internal.firebase-auth-api.zzwj v4_3 = new com.google.android.gms.internal.firebase-auth-api.zzwj("UNRECOGNIZED", 4, -1);
        com.google.android.gms.internal.firebase-auth-api.zzwj.zzd = v4_3;
        com.google.android.gms.internal.firebase-auth-api.zzwj.zzf = new com.google.android.gms.internal.firebase-auth-api.zzwj[] {v0_2, v1_2, v2_1, v3_2, v4_3});
        return;
    }

    private zzwj(String p1, int p2, int p3)
    {
        super(p1, p2);
        super.zzg = p3;
        return;
    }

    public static com.google.android.gms.internal.firebase-auth-api.zzwj[] values()
    {
        return ((com.google.android.gms.internal.firebase-auth-api.zzwj[]) com.google.android.gms.internal.firebase-auth-api.zzwj.zzf.clone());
    }

    public static com.google.android.gms.internal.firebase-auth-api.zzwj zza(int p1)
    {
        if (p1 == null) {
            return com.google.android.gms.internal.firebase-auth-api.zzwj.zze;
        } else {
            if (p1 == 1) {
                return com.google.android.gms.internal.firebase-auth-api.zzwj.zza;
            } else {
                if (p1 == 2) {
                    return com.google.android.gms.internal.firebase-auth-api.zzwj.zzb;
                } else {
                    if (p1 == 3) {
                        return com.google.android.gms.internal.firebase-auth-api.zzwj.zzc;
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
        v0_1.append(com.google.android.gms.internal.firebase-auth-api.zzwj.getName());
        v0_1.append(64);
        v0_1.append(Integer.toHexString(System.identityHashCode(this)));
        if (this != com.google.android.gms.internal.firebase-auth-api.zzwj.zzd) {
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
        if (this == com.google.android.gms.internal.firebase-auth-api.zzwj.zzd) {
            throw new IllegalArgumentException("Can\'t get the number of an unknown enum value.");
        } else {
            return this.zzg;
        }
    }
}
