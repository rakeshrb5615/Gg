package com.google.android.gms.internal.measurement;
public final class zzag implements com.google.android.gms.internal.measurement.zzao {
    private final com.google.android.gms.internal.measurement.zzao zza;
    private final String zzb;

    public zzag()
    {
        this.zza = com.google.android.gms.internal.measurement.zzao.zzf;
        this.zzb = "return";
        return;
    }

    public zzag(String p2)
    {
        this.zza = com.google.android.gms.internal.measurement.zzao.zzf;
        this.zzb = p2;
        return;
    }

    public zzag(String p1, com.google.android.gms.internal.measurement.zzao p2)
    {
        this.zza = p2;
        this.zzb = p1;
        return;
    }

    public final boolean equals(Object p5)
    {
        if (p5 != this) {
            if ((p5 instanceof com.google.android.gms.internal.measurement.zzag)) {
                if ((!this.zzb.equals(((com.google.android.gms.internal.measurement.zzag) p5).zzb)) || (!this.zza.equals(((com.google.android.gms.internal.measurement.zzag) p5).zza))) {
                    return 0;
                } else {
                    return 1;
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
        return (this.zza.hashCode() + (this.zzb.hashCode() * 31));
    }

    public final com.google.android.gms.internal.measurement.zzao zzb()
    {
        return this.zza;
    }

    public final String zzc()
    {
        throw new IllegalStateException("Control is not a String");
    }

    public final com.google.android.gms.internal.measurement.zzao zzcA(String p1, com.google.android.gms.internal.measurement.zzg p2, java.util.List p3)
    {
        throw new IllegalStateException("Control does not have functions");
    }

    public final Double zzd()
    {
        throw new IllegalStateException("Control is not a double");
    }

    public final Boolean zze()
    {
        throw new IllegalStateException("Control is not a boolean");
    }

    public final java.util.Iterator zzf()
    {
        return 0;
    }

    public final String zzg()
    {
        return this.zzb;
    }

    public final com.google.android.gms.internal.measurement.zzao zzt()
    {
        return new com.google.android.gms.internal.measurement.zzag(this.zzb, this.zza.zzt());
    }
}
