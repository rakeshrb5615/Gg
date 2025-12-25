package com.google.android.gms.internal.fido;
public final class zzdm extends com.google.android.gms.internal.fido.zzdr {
    private final long zza;

    public zzdm(long p1)
    {
        this.zza = p1;
        return;
    }

    public final bridge synthetic int compareTo(Object p5)
    {
        if (this.zza() == ((com.google.android.gms.internal.fido.zzdr) p5).zza()) {
            int v5_2 = Math.abs(this.zza) cmp Math.abs(((com.google.android.gms.internal.fido.zzdm) ((com.google.android.gms.internal.fido.zzdr) p5)).zza);
            if (v5_2 >= 0) {
                if (v5_2 <= 0) {
                    return 0;
                } else {
                    return 1;
                }
            } else {
                return -1;
            }
        } else {
            return (this.zza() - ((com.google.android.gms.internal.fido.zzdr) p5).zza());
        }
    }

    public final boolean equals(Object p7)
    {
        if (this != p7) {
            if (p7 != 0) {
                if (com.google.android.gms.internal.fido.zzdm == p7.getClass()) {
                    if (this.zza != ((com.google.android.gms.internal.fido.zzdm) p7).zza) {
                        return 0;
                    } else {
                        return 1;
                    }
                } else {
                    return 0;
                }
            } else {
                return 0;
            }
        } else {
            return 1;
        }
    }

    public final int hashCode()
    {
        return java.util.Arrays.hashCode(new Object[] {Integer.valueOf(this.zza()), Long.valueOf(this.zza)}));
    }

    public final String toString()
    {
        return Long.toString(this.zza);
    }

    public final int zza()
    {
        int v0_2;
        if (this.zza < 0) {
            v0_2 = 32;
        } else {
            v0_2 = 0;
        }
        return com.google.android.gms.internal.fido.zzdr.zzd(v0_2);
    }

    public final long zzc()
    {
        return this.zza;
    }
}
