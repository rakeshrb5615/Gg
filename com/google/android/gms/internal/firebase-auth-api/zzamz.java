package com.google.android.gms.internal.firebase-auth-api;
final class zzamz implements com.google.android.gms.internal.firebase-auth-api.zzamk {
    private final com.google.android.gms.internal.firebase-auth-api.zzamm zza;
    private final String zzb;
    private final Object[] zzc;
    private final int zzd;

    public zzamz(com.google.android.gms.internal.firebase-auth-api.zzamm p4, String p5, Object[] p6)
    {
        this.zza = p4;
        this.zzb = p5;
        this.zzc = p6;
        int v4_4 = p5.charAt(0);
        if (v4_4 >= 55296) {
            int v4_2 = (v4_4 & 8191);
            int v0 = 13;
            int v1_0 = 1;
            while(true) {
                int v2 = (v1_0 + 1);
                int v1_1 = p5.charAt(v1_0);
                if (v1_1 < 55296) {
                    break;
                }
                v4_2 |= ((v1_1 & 8191) << v0);
                v0 += 13;
                v1_0 = v2;
            }
            this.zzd = (v4_2 | (v1_1 << v0));
            return;
        } else {
            this.zzd = v4_4;
            return;
        }
    }

    public final com.google.android.gms.internal.firebase-auth-api.zzamm zza()
    {
        return this.zza;
    }

    public final com.google.android.gms.internal.firebase-auth-api.zzamy zzb()
    {
        com.google.android.gms.internal.firebase-auth-api.zzamy v0_0 = this.zzd;
        if ((v0_0 & 1) == 0) {
            if ((v0_0 & 4) != 4) {
                return com.google.android.gms.internal.firebase-auth-api.zzamy.zzb;
            } else {
                return com.google.android.gms.internal.firebase-auth-api.zzamy.zzc;
            }
        } else {
            return com.google.android.gms.internal.firebase-auth-api.zzamy.zza;
        }
    }

    public final boolean zzc()
    {
        if ((this.zzd & 2) != 2) {
            return 0;
        } else {
            return 1;
        }
    }

    public final String zzd()
    {
        return this.zzb;
    }

    public final Object[] zze()
    {
        return this.zzc;
    }
}
