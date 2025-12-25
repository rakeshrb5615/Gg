package com.google.android.gms.internal.measurement;
public final class zzaf implements com.google.android.gms.internal.measurement.zzao {
    private final boolean zza;

    public zzaf(Boolean p1)
    {
        boolean v1_1;
        if (p1) {
            v1_1 = p1.booleanValue();
        } else {
            v1_1 = 0;
        }
        this.zza = v1_1;
        return;
    }

    public final boolean equals(Object p4)
    {
        if (this != p4) {
            if ((p4 instanceof com.google.android.gms.internal.measurement.zzaf)) {
                if (this.zza != ((com.google.android.gms.internal.measurement.zzaf) p4).zza) {
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
        return Boolean.valueOf(this.zza).hashCode();
    }

    public final String toString()
    {
        return String.valueOf(this.zza);
    }

    public final String zzc()
    {
        return Boolean.toString(this.zza);
    }

    public final com.google.android.gms.internal.measurement.zzao zzcA(String p2, com.google.android.gms.internal.measurement.zzg p3, java.util.List p4)
    {
        if (!"toString".equals(p2)) {
            String v3_6 = Boolean.toString(this.zza);
            StringBuilder v0_1 = new StringBuilder();
            v0_1.append(v3_6);
            v0_1.append(".");
            v0_1.append(p2);
            v0_1.append(" is not a function.");
            throw new IllegalArgumentException(v0_1.toString());
        } else {
            return new com.google.android.gms.internal.measurement.zzas(Boolean.toString(this.zza));
        }
    }

    public final Double zzd()
    {
        Double v0_1;
        if (1 == this.zza) {
            v0_1 = 4607182418800017408;
        } else {
            v0_1 = 0;
        }
        return Double.valueOf(v0_1);
    }

    public final Boolean zze()
    {
        return Boolean.valueOf(this.zza);
    }

    public final java.util.Iterator zzf()
    {
        return 0;
    }

    public final com.google.android.gms.internal.measurement.zzao zzt()
    {
        return new com.google.android.gms.internal.measurement.zzaf(Boolean.valueOf(this.zza));
    }
}
