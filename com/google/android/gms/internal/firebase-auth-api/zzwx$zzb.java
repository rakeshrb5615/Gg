package com.google.android.gms.internal.firebase-auth-api;
public final enum class zzwx$zzb extends java.lang.Enum implements com.google.android.gms.internal.firebase-auth-api.zzalk {
    public static final enum com.google.android.gms.internal.firebase-auth-api.zzwx$zzb zza;
    public static final enum com.google.android.gms.internal.firebase-auth-api.zzwx$zzb zzb;
    public static final enum com.google.android.gms.internal.firebase-auth-api.zzwx$zzb zzc;
    public static final enum com.google.android.gms.internal.firebase-auth-api.zzwx$zzb zzd;
    public static final enum com.google.android.gms.internal.firebase-auth-api.zzwx$zzb zze;
    public static final enum com.google.android.gms.internal.firebase-auth-api.zzwx$zzb zzf;
    private static final synthetic com.google.android.gms.internal.firebase-auth-api.zzwx$zzb[] zzg;
    private final int zzh;

    static zzwx$zzb()
    {
        com.google.android.gms.internal.firebase-auth-api.zzwx$zzb[] v0_1 = new com.google.android.gms.internal.firebase-auth-api.zzwx$zzb("UNKNOWN_KEYMATERIAL", 0, 0);
        com.google.android.gms.internal.firebase-auth-api.zzwx$zzb.zza = v0_1;
        com.google.android.gms.internal.firebase-auth-api.zzwx$zzb.zzb = new com.google.android.gms.internal.firebase-auth-api.zzwx$zzb("SYMMETRIC", 1, 1);
        com.google.android.gms.internal.firebase-auth-api.zzwx$zzb.zzc = new com.google.android.gms.internal.firebase-auth-api.zzwx$zzb("ASYMMETRIC_PRIVATE", 2, 2);
        com.google.android.gms.internal.firebase-auth-api.zzwx$zzb.zzd = new com.google.android.gms.internal.firebase-auth-api.zzwx$zzb("ASYMMETRIC_PUBLIC", 3, 3);
        com.google.android.gms.internal.firebase-auth-api.zzwx$zzb.zze = new com.google.android.gms.internal.firebase-auth-api.zzwx$zzb("REMOTE", 4, 4);
        com.google.android.gms.internal.firebase-auth-api.zzwx$zzb v5_3 = new com.google.android.gms.internal.firebase-auth-api.zzwx$zzb("UNRECOGNIZED", 5, -1);
        com.google.android.gms.internal.firebase-auth-api.zzwx$zzb.zzf = v5_3;
        com.google.android.gms.internal.firebase-auth-api.zzwx$zzb.zzg = new com.google.android.gms.internal.firebase-auth-api.zzwx$zzb[] {v0_1, v5_3});
        return;
    }

    private zzwx$zzb(String p1, int p2, int p3)
    {
        super(p1, p2);
        super.zzh = p3;
        return;
    }

    public static com.google.android.gms.internal.firebase-auth-api.zzwx$zzb[] values()
    {
        return ((com.google.android.gms.internal.firebase-auth-api.zzwx$zzb[]) com.google.android.gms.internal.firebase-auth-api.zzwx$zzb.zzg.clone());
    }

    public static com.google.android.gms.internal.firebase-auth-api.zzwx$zzb zza(int p1)
    {
        if (p1 == null) {
            return com.google.android.gms.internal.firebase-auth-api.zzwx$zzb.zza;
        } else {
            if (p1 == 1) {
                return com.google.android.gms.internal.firebase-auth-api.zzwx$zzb.zzb;
            } else {
                if (p1 == 2) {
                    return com.google.android.gms.internal.firebase-auth-api.zzwx$zzb.zzc;
                } else {
                    if (p1 == 3) {
                        return com.google.android.gms.internal.firebase-auth-api.zzwx$zzb.zzd;
                    } else {
                        if (p1 == 4) {
                            return com.google.android.gms.internal.firebase-auth-api.zzwx$zzb.zze;
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
        v0_1.append(com.google.android.gms.internal.firebase-auth-api.zzwx$zzb.getName());
        v0_1.append(64);
        v0_1.append(Integer.toHexString(System.identityHashCode(this)));
        if (this != com.google.android.gms.internal.firebase-auth-api.zzwx$zzb.zzf) {
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
        if (this == com.google.android.gms.internal.firebase-auth-api.zzwx$zzb.zzf) {
            throw new IllegalArgumentException("Can\'t get the number of an unknown enum value.");
        } else {
            return this.zzh;
        }
    }
}
