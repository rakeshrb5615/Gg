package com.google.android.gms.internal.firebase-auth-api;
public final enum class zzvy extends java.lang.Enum implements com.google.android.gms.internal.firebase-auth-api.zzalk {
    public static final enum com.google.android.gms.internal.firebase-auth-api.zzvy zza;
    public static final enum com.google.android.gms.internal.firebase-auth-api.zzvy zzb;
    public static final enum com.google.android.gms.internal.firebase-auth-api.zzvy zzc;
    public static final enum com.google.android.gms.internal.firebase-auth-api.zzvy zzd;
    public static final enum com.google.android.gms.internal.firebase-auth-api.zzvy zze;
    public static final enum com.google.android.gms.internal.firebase-auth-api.zzvy zzf;
    private static final enum com.google.android.gms.internal.firebase-auth-api.zzvy zzg;
    private static final synthetic com.google.android.gms.internal.firebase-auth-api.zzvy[] zzh;
    private final int zzi;

    static zzvy()
    {
        com.google.android.gms.internal.firebase-auth-api.zzvy[] v0_1 = new com.google.android.gms.internal.firebase-auth-api.zzvy("UNKNOWN_HASH", 0, 0);
        com.google.android.gms.internal.firebase-auth-api.zzvy.zzg = v0_1;
        com.google.android.gms.internal.firebase-auth-api.zzvy.zza = new com.google.android.gms.internal.firebase-auth-api.zzvy("SHA1", 1, 1);
        com.google.android.gms.internal.firebase-auth-api.zzvy.zzb = new com.google.android.gms.internal.firebase-auth-api.zzvy("SHA384", 2, 2);
        com.google.android.gms.internal.firebase-auth-api.zzvy.zzc = new com.google.android.gms.internal.firebase-auth-api.zzvy("SHA256", 3, 3);
        com.google.android.gms.internal.firebase-auth-api.zzvy.zzd = new com.google.android.gms.internal.firebase-auth-api.zzvy("SHA512", 4, 4);
        com.google.android.gms.internal.firebase-auth-api.zzvy.zze = new com.google.android.gms.internal.firebase-auth-api.zzvy("SHA224", 5, 5);
        com.google.android.gms.internal.firebase-auth-api.zzvy v6_3 = new com.google.android.gms.internal.firebase-auth-api.zzvy("UNRECOGNIZED", 6, -1);
        com.google.android.gms.internal.firebase-auth-api.zzvy.zzf = v6_3;
        com.google.android.gms.internal.firebase-auth-api.zzvy.zzh = new com.google.android.gms.internal.firebase-auth-api.zzvy[] {v0_1, v6_3});
        return;
    }

    private zzvy(String p1, int p2, int p3)
    {
        super(p1, p2);
        super.zzi = p3;
        return;
    }

    public static com.google.android.gms.internal.firebase-auth-api.zzvy[] values()
    {
        return ((com.google.android.gms.internal.firebase-auth-api.zzvy[]) com.google.android.gms.internal.firebase-auth-api.zzvy.zzh.clone());
    }

    public static com.google.android.gms.internal.firebase-auth-api.zzvy zza(int p1)
    {
        if (p1 == null) {
            return com.google.android.gms.internal.firebase-auth-api.zzvy.zzg;
        } else {
            if (p1 == 1) {
                return com.google.android.gms.internal.firebase-auth-api.zzvy.zza;
            } else {
                if (p1 == 2) {
                    return com.google.android.gms.internal.firebase-auth-api.zzvy.zzb;
                } else {
                    if (p1 == 3) {
                        return com.google.android.gms.internal.firebase-auth-api.zzvy.zzc;
                    } else {
                        if (p1 == 4) {
                            return com.google.android.gms.internal.firebase-auth-api.zzvy.zzd;
                        } else {
                            if (p1 == 5) {
                                return com.google.android.gms.internal.firebase-auth-api.zzvy.zze;
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
        v0_1.append(com.google.android.gms.internal.firebase-auth-api.zzvy.getName());
        v0_1.append(64);
        v0_1.append(Integer.toHexString(System.identityHashCode(this)));
        if (this != com.google.android.gms.internal.firebase-auth-api.zzvy.zzf) {
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
        if (this == com.google.android.gms.internal.firebase-auth-api.zzvy.zzf) {
            throw new IllegalArgumentException("Can\'t get the number of an unknown enum value.");
        } else {
            return this.zzi;
        }
    }
}
