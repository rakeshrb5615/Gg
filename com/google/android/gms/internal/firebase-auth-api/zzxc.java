package com.google.android.gms.internal.firebase-auth-api;
public final enum class zzxc extends java.lang.Enum implements com.google.android.gms.internal.firebase-auth-api.zzalk {
    public static final enum com.google.android.gms.internal.firebase-auth-api.zzxc zza;
    public static final enum com.google.android.gms.internal.firebase-auth-api.zzxc zzb;
    public static final enum com.google.android.gms.internal.firebase-auth-api.zzxc zzc;
    public static final enum com.google.android.gms.internal.firebase-auth-api.zzxc zzd;
    public static final enum com.google.android.gms.internal.firebase-auth-api.zzxc zze;
    private static final synthetic com.google.android.gms.internal.firebase-auth-api.zzxc[] zzf;
    private final int zzg;

    static zzxc()
    {
        com.google.android.gms.internal.firebase-auth-api.zzxc[] v0_2 = new com.google.android.gms.internal.firebase-auth-api.zzxc("UNKNOWN_STATUS", 0, 0);
        com.google.android.gms.internal.firebase-auth-api.zzxc.zza = v0_2;
        com.google.android.gms.internal.firebase-auth-api.zzxc v1_2 = new com.google.android.gms.internal.firebase-auth-api.zzxc("ENABLED", 1, 1);
        com.google.android.gms.internal.firebase-auth-api.zzxc.zzb = v1_2;
        com.google.android.gms.internal.firebase-auth-api.zzxc v2_1 = new com.google.android.gms.internal.firebase-auth-api.zzxc("DISABLED", 2, 2);
        com.google.android.gms.internal.firebase-auth-api.zzxc.zzc = v2_1;
        com.google.android.gms.internal.firebase-auth-api.zzxc v3_2 = new com.google.android.gms.internal.firebase-auth-api.zzxc("DESTROYED", 3, 3);
        com.google.android.gms.internal.firebase-auth-api.zzxc.zzd = v3_2;
        com.google.android.gms.internal.firebase-auth-api.zzxc v4_3 = new com.google.android.gms.internal.firebase-auth-api.zzxc("UNRECOGNIZED", 4, -1);
        com.google.android.gms.internal.firebase-auth-api.zzxc.zze = v4_3;
        com.google.android.gms.internal.firebase-auth-api.zzxc.zzf = new com.google.android.gms.internal.firebase-auth-api.zzxc[] {v0_2, v1_2, v2_1, v3_2, v4_3});
        return;
    }

    private zzxc(String p1, int p2, int p3)
    {
        super(p1, p2);
        super.zzg = p3;
        return;
    }

    public static com.google.android.gms.internal.firebase-auth-api.zzxc[] values()
    {
        return ((com.google.android.gms.internal.firebase-auth-api.zzxc[]) com.google.android.gms.internal.firebase-auth-api.zzxc.zzf.clone());
    }

    public static com.google.android.gms.internal.firebase-auth-api.zzxc zza(int p1)
    {
        if (p1 == null) {
            return com.google.android.gms.internal.firebase-auth-api.zzxc.zza;
        } else {
            if (p1 == 1) {
                return com.google.android.gms.internal.firebase-auth-api.zzxc.zzb;
            } else {
                if (p1 == 2) {
                    return com.google.android.gms.internal.firebase-auth-api.zzxc.zzc;
                } else {
                    if (p1 == 3) {
                        return com.google.android.gms.internal.firebase-auth-api.zzxc.zzd;
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
        v0_1.append(com.google.android.gms.internal.firebase-auth-api.zzxc.getName());
        v0_1.append(64);
        v0_1.append(Integer.toHexString(System.identityHashCode(this)));
        if (this != com.google.android.gms.internal.firebase-auth-api.zzxc.zze) {
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
        if (this == com.google.android.gms.internal.firebase-auth-api.zzxc.zze) {
            throw new IllegalArgumentException("Can\'t get the number of an unknown enum value.");
        } else {
            return this.zzg;
        }
    }
}
