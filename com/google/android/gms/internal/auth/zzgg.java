package com.google.android.gms.internal.auth;
final class zzgg implements com.google.android.gms.internal.auth.zzft {
    private final com.google.android.gms.internal.auth.zzfw zza;
    private final String zzb;
    private final Object[] zzc;
    private final int zzd;

    public zzgg(com.google.android.gms.internal.auth.zzfw p4, String p5, Object[] p6)
    {
        this.zza = p4;
        this.zzb = "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a";
        this.zzc = p6;
        int v5_2 = "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a".charAt(0);
        if (v5_2 >= 55296) {
            int v5_0 = (v5_2 & 8191);
            int v0 = 13;
            int v1_0 = 1;
            while(true) {
                int v2 = (v1_0 + 1);
                int v1_1 = "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a".charAt(v1_0);
                if (v1_1 < 55296) {
                    break;
                }
                v5_0 |= ((v1_1 & 8191) << v0);
                v0 += 13;
                v1_0 = v2;
            }
            this.zzd = ((v1_1 << v0) | v5_0);
            return;
        } else {
            this.zzd = v5_2;
            return;
        }
    }

    public final com.google.android.gms.internal.auth.zzfw zza()
    {
        return this.zza;
    }

    public final boolean zzb()
    {
        if ((this.zzd & 2) != 2) {
            return 0;
        } else {
            return 1;
        }
    }

    public final int zzc()
    {
        if ((this.zzd & 1) != 1) {
            return 2;
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
