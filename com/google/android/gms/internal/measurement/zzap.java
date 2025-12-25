package com.google.android.gms.internal.measurement;
public final class zzap implements com.google.android.gms.internal.measurement.zzao {
    private final String zza;
    private final java.util.ArrayList zzb;

    public zzap(String p1, java.util.List p2)
    {
        this.zza = p1;
        java.util.ArrayList v1_2 = new java.util.ArrayList();
        this.zzb = v1_2;
        v1_2.addAll(p2);
        return;
    }

    public final boolean equals(Object p4)
    {
        if (this != p4) {
            if ((p4 instanceof com.google.android.gms.internal.measurement.zzap)) {
                java.util.ArrayList v0_3 = this.zza;
                if (v0_3 == null) {
                    if (((com.google.android.gms.internal.measurement.zzap) p4).zza != null) {
                        return 0;
                    }
                } else {
                    if (!v0_3.equals(((com.google.android.gms.internal.measurement.zzap) p4).zza)) {
                        return 0;
                    }
                }
                return this.zzb.equals(((com.google.android.gms.internal.measurement.zzap) p4).zzb);
            } else {
                return 0;
            }
        } else {
            return 1;
        }
    }

    public final int hashCode()
    {
        int v0_1;
        int v0_0 = this.zza;
        if (v0_0 == 0) {
            v0_1 = 0;
        } else {
            v0_1 = v0_0.hashCode();
        }
        return (this.zzb.hashCode() + (v0_1 * 31));
    }

    public final String zzb()
    {
        return this.zza;
    }

    public final String zzc()
    {
        throw new IllegalStateException("Statement cannot be cast as String");
    }

    public final com.google.android.gms.internal.measurement.zzao zzcA(String p1, com.google.android.gms.internal.measurement.zzg p2, java.util.List p3)
    {
        throw new IllegalStateException("Statement is not an evaluated entity");
    }

    public final Double zzd()
    {
        throw new IllegalStateException("Statement cannot be cast as Double");
    }

    public final Boolean zze()
    {
        throw new IllegalStateException("Statement cannot be cast as Boolean");
    }

    public final java.util.Iterator zzf()
    {
        return 0;
    }

    public final java.util.ArrayList zzg()
    {
        return this.zzb;
    }

    public final com.google.android.gms.internal.measurement.zzao zzt()
    {
        return this;
    }
}
