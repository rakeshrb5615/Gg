package com.google.android.gms.internal.firebase-auth-api;
public final enum class zzxz extends java.lang.Enum implements com.google.android.gms.internal.firebase-auth-api.zzalk {
    public static final enum com.google.android.gms.internal.firebase-auth-api.zzxz zza;
    public static final enum com.google.android.gms.internal.firebase-auth-api.zzxz zzb;
    public static final enum com.google.android.gms.internal.firebase-auth-api.zzxz zzc;
    public static final enum com.google.android.gms.internal.firebase-auth-api.zzxz zzd;
    public static final enum com.google.android.gms.internal.firebase-auth-api.zzxz zze;
    public static final enum com.google.android.gms.internal.firebase-auth-api.zzxz zzf;
    private static final enum com.google.android.gms.internal.firebase-auth-api.zzxz zzg;
    private static final synthetic com.google.android.gms.internal.firebase-auth-api.zzxz[] zzh;
    private final int zzi;

    static zzxz()
    {
        com.google.android.gms.internal.firebase-auth-api.zzxz[] v0_1 = new com.google.android.gms.internal.firebase-auth-api.zzxz("UNKNOWN_PREFIX", 0, 0);
        com.google.android.gms.internal.firebase-auth-api.zzxz.zza = v0_1;
        com.google.android.gms.internal.firebase-auth-api.zzxz.zzb = new com.google.android.gms.internal.firebase-auth-api.zzxz("TINK", 1, 1);
        com.google.android.gms.internal.firebase-auth-api.zzxz.zzc = new com.google.android.gms.internal.firebase-auth-api.zzxz("LEGACY", 2, 2);
        com.google.android.gms.internal.firebase-auth-api.zzxz.zzd = new com.google.android.gms.internal.firebase-auth-api.zzxz("RAW", 3, 3);
        com.google.android.gms.internal.firebase-auth-api.zzxz.zze = new com.google.android.gms.internal.firebase-auth-api.zzxz("CRUNCHY", 4, 4);
        com.google.android.gms.internal.firebase-auth-api.zzxz.zzg = new com.google.android.gms.internal.firebase-auth-api.zzxz("WITH_ID_REQUIREMENT", 5, 5);
        com.google.android.gms.internal.firebase-auth-api.zzxz v6_3 = new com.google.android.gms.internal.firebase-auth-api.zzxz("UNRECOGNIZED", 6, -1);
        com.google.android.gms.internal.firebase-auth-api.zzxz.zzf = v6_3;
        com.google.android.gms.internal.firebase-auth-api.zzxz.zzh = new com.google.android.gms.internal.firebase-auth-api.zzxz[] {v0_1, v6_3});
        return;
    }

    private zzxz(String p1, int p2, int p3)
    {
        super(p1, p2);
        super.zzi = p3;
        return;
    }

    public static com.google.android.gms.internal.firebase-auth-api.zzxz[] values()
    {
        return ((com.google.android.gms.internal.firebase-auth-api.zzxz[]) com.google.android.gms.internal.firebase-auth-api.zzxz.zzh.clone());
    }

    public static com.google.android.gms.internal.firebase-auth-api.zzxz zza(int p1)
    {
        if (p1 == null) {
            return com.google.android.gms.internal.firebase-auth-api.zzxz.zza;
        } else {
            if (p1 == 1) {
                return com.google.android.gms.internal.firebase-auth-api.zzxz.zzb;
            } else {
                if (p1 == 2) {
                    return com.google.android.gms.internal.firebase-auth-api.zzxz.zzc;
                } else {
                    if (p1 == 3) {
                        return com.google.android.gms.internal.firebase-auth-api.zzxz.zzd;
                    } else {
                        if (p1 == 4) {
                            return com.google.android.gms.internal.firebase-auth-api.zzxz.zze;
                        } else {
                            if (p1 == 5) {
                                return com.google.android.gms.internal.firebase-auth-api.zzxz.zzg;
                            } else {
                                return 0;
                            }
                        }
                    }
                }
            }
        }
    }

    public final String toString()
    {
        String v0_1 = new StringBuilder("<");
        v0_1.append(com.google.android.gms.internal.firebase-auth-api.zzxz.getName());
        v0_1.append(64);
        v0_1.append(Integer.toHexString(System.identityHashCode(this)));
        if (this != com.google.android.gms.internal.firebase-auth-api.zzxz.zzf) {
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
        if (this == com.google.android.gms.internal.firebase-auth-api.zzxz.zzf) {
            throw new IllegalArgumentException("Can\'t get the number of an unknown enum value.");
        } else {
            return this.zzi;
        }
    }
}
