package com.google.android.gms.internal.measurement;
final class zznw implements com.google.android.gms.internal.measurement.zznj {
    private final com.google.android.gms.internal.measurement.zznm zza;
    private final String zzb;
    private final Object[] zzc;
    private final int zzd;

    public zznw(com.google.android.gms.internal.measurement.zznm p4, String p5, Object[] p6)
    {
        this.zza = p4;
        this.zzb = p5;
        this.zzc = p6;
        int v4_4 = p5.charAt(0);
        if (v4_4 >= 55296) {
            int v4_2 = (v4_4 & 8191);
            int v0_0 = 1;
            int v1 = 13;
            while(true) {
                int v2 = (v0_0 + 1);
                int v0_1 = p5.charAt(v0_0);
                if (v0_1 < 55296) {
                    break;
                }
                v4_2 |= ((v0_1 & 8191) << v1);
                v1 += 13;
                v0_0 = v2;
            }
            this.zzd = (v4_2 | (v0_1 << v1));
            return;
        } else {
            this.zzd = v4_4;
            return;
        }
    }

    public final boolean zza()
    {
        if ((this.zzd & 2) != 2) {
            return 0;
        } else {
            return 1;
        }
    }

    public final com.google.android.gms.internal.measurement.zznm zzb()
    {
        return this.zza;
    }

    public final int zzc()
    {
        int v0_0 = this.zzd;
        if ((v0_0 & 1) == 0) {
            if ((v0_0 & 4) != 4) {
                return 2;
            } else {
                return 3;
            }
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
