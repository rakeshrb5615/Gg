package com.google.android.gms.internal.fido;
public final class zzdj extends com.google.android.gms.internal.fido.zzdr {
    private final boolean zza;

    public zzdj(boolean p1)
    {
        this.zza = p1;
        return;
    }

    public final bridge synthetic int compareTo(Object p5)
    {
        if (com.google.android.gms.internal.fido.zzdr.zzd(-32) == ((com.google.android.gms.internal.fido.zzdr) p5).zza()) {
            int v0_0;
            int v1_0 = 21;
            if (1 == this.zza) {
                v0_0 = 21;
            } else {
                v0_0 = 20;
            }
            if (1 != ((com.google.android.gms.internal.fido.zzdj) ((com.google.android.gms.internal.fido.zzdr) p5)).zza) {
                v1_0 = 20;
            }
            return (v0_0 - v1_0);
        } else {
            return (com.google.android.gms.internal.fido.zzdr.zzd(-32) - ((com.google.android.gms.internal.fido.zzdr) p5).zza());
        }
    }

    public final boolean equals(Object p5)
    {
        if (this != p5) {
            if (p5) {
                if (com.google.android.gms.internal.fido.zzdj == p5.getClass()) {
                    if (this.zza != ((com.google.android.gms.internal.fido.zzdj) p5).zza) {
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
        return java.util.Arrays.hashCode(new Object[] {Integer.valueOf(com.google.android.gms.internal.fido.zzdr.zzd(-32)), Boolean.valueOf(this.zza)}));
    }

    public final String toString()
    {
        return Boolean.toString(this.zza);
    }

    public final int zza()
    {
        return com.google.android.gms.internal.fido.zzdr.zzd(-32);
    }
}
