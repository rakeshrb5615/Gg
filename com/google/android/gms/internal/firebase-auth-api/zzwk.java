package com.google.android.gms.internal.firebase-auth-api;
public final enum class zzwk extends java.lang.Enum implements com.google.android.gms.internal.firebase-auth-api.zzalk {
    public static final enum com.google.android.gms.internal.firebase-auth-api.zzwk zza;
    public static final enum com.google.android.gms.internal.firebase-auth-api.zzwk zzb;
    public static final enum com.google.android.gms.internal.firebase-auth-api.zzwk zzc;
    public static final enum com.google.android.gms.internal.firebase-auth-api.zzwk zzd;
    private static final enum com.google.android.gms.internal.firebase-auth-api.zzwk zze;
    private static final synthetic com.google.android.gms.internal.firebase-auth-api.zzwk[] zzf;
    private final int zzg;

    static zzwk()
    {
        com.google.android.gms.internal.firebase-auth-api.zzwk[] v0_2 = new com.google.android.gms.internal.firebase-auth-api.zzwk("AEAD_UNKNOWN", 0, 0);
        com.google.android.gms.internal.firebase-auth-api.zzwk.zze = v0_2;
        com.google.android.gms.internal.firebase-auth-api.zzwk v1_2 = new com.google.android.gms.internal.firebase-auth-api.zzwk("AES_128_GCM", 1, 1);
        com.google.android.gms.internal.firebase-auth-api.zzwk.zza = v1_2;
        com.google.android.gms.internal.firebase-auth-api.zzwk v2_1 = new com.google.android.gms.internal.firebase-auth-api.zzwk("AES_256_GCM", 2, 2);
        com.google.android.gms.internal.firebase-auth-api.zzwk.zzb = v2_1;
        com.google.android.gms.internal.firebase-auth-api.zzwk v3_2 = new com.google.android.gms.internal.firebase-auth-api.zzwk("CHACHA20_POLY1305", 3, 3);
        com.google.android.gms.internal.firebase-auth-api.zzwk.zzc = v3_2;
        com.google.android.gms.internal.firebase-auth-api.zzwk v4_3 = new com.google.android.gms.internal.firebase-auth-api.zzwk("UNRECOGNIZED", 4, -1);
        com.google.android.gms.internal.firebase-auth-api.zzwk.zzd = v4_3;
        com.google.android.gms.internal.firebase-auth-api.zzwk.zzf = new com.google.android.gms.internal.firebase-auth-api.zzwk[] {v0_2, v1_2, v2_1, v3_2, v4_3});
        return;
    }

    private zzwk(String p1, int p2, int p3)
    {
        super(p1, p2);
        super.zzg = p3;
        return;
    }

    public static com.google.android.gms.internal.firebase-auth-api.zzwk[] values()
    {
        return ((com.google.android.gms.internal.firebase-auth-api.zzwk[]) com.google.android.gms.internal.firebase-auth-api.zzwk.zzf.clone());
    }

    public static com.google.android.gms.internal.firebase-auth-api.zzwk zza(int p1)
    {
        if (p1 == null) {
            return com.google.android.gms.internal.firebase-auth-api.zzwk.zze;
        } else {
            if (p1 == 1) {
                return com.google.android.gms.internal.firebase-auth-api.zzwk.zza;
            } else {
                if (p1 == 2) {
                    return com.google.android.gms.internal.firebase-auth-api.zzwk.zzb;
                } else {
                    if (p1 == 3) {
                        return com.google.android.gms.internal.firebase-auth-api.zzwk.zzc;
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
        v0_1.append(com.google.android.gms.internal.firebase-auth-api.zzwk.getName());
        v0_1.append(64);
        v0_1.append(Integer.toHexString(System.identityHashCode(this)));
        if (this != com.google.android.gms.internal.firebase-auth-api.zzwk.zzd) {
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
        if (this == com.google.android.gms.internal.firebase-auth-api.zzwk.zzd) {
            throw new IllegalArgumentException("Can\'t get the number of an unknown enum value.");
        } else {
            return this.zzg;
        }
    }
}
