package com.google.android.gms.internal.measurement;
public abstract class zzai implements com.google.android.gms.internal.measurement.zzao, com.google.android.gms.internal.measurement.zzak {
    protected final String zzd;
    protected final java.util.Map zze;

    public zzai(String p2)
    {
        this.zze = new java.util.HashMap();
        this.zzd = p2;
        return;
    }

    public final boolean equals(Object p3)
    {
        if (this != p3) {
            if ((p3 instanceof com.google.android.gms.internal.measurement.zzai)) {
                String v0_1 = this.zzd;
                if (v0_1 == null) {
                    return 0;
                } else {
                    return v0_1.equals(((com.google.android.gms.internal.measurement.zzai) p3).zzd);
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
        int v0_0 = this.zzd;
        if (v0_0 == 0) {
            return 0;
        } else {
            return v0_0.hashCode();
        }
    }

    public abstract com.google.android.gms.internal.measurement.zzao zza();

    public final String zzc()
    {
        return this.zzd;
    }

    public final com.google.android.gms.internal.measurement.zzao zzcA(String p2, com.google.android.gms.internal.measurement.zzg p3, java.util.List p4)
    {
        if (!"toString".equals(p2)) {
            return com.google.android.gms.internal.measurement.zzak.zzu(this, new com.google.android.gms.internal.measurement.zzas(p2), p3, p4);
        } else {
            return new com.google.android.gms.internal.measurement.zzas(this.zzd);
        }
    }

    public final Double zzd()
    {
        return Double.valueOf(9221120237041090560);
    }

    public final Boolean zze()
    {
        return Boolean.TRUE;
    }

    public final java.util.Iterator zzf()
    {
        return com.google.android.gms.internal.measurement.zzak.zzv(this.zze);
    }

    public final String zzg()
    {
        return this.zzd;
    }

    public final boolean zzj(String p2)
    {
        return this.zze.containsKey(p2);
    }

    public final com.google.android.gms.internal.measurement.zzao zzk(String p3)
    {
        java.util.Map v0 = this.zze;
        if (!v0.containsKey(p3)) {
            return com.google.android.gms.internal.measurement.zzao.zzf;
        } else {
            return ((com.google.android.gms.internal.measurement.zzao) v0.get(p3));
        }
    }

    public final void zzm(String p2, com.google.android.gms.internal.measurement.zzao p3)
    {
        if (p3 != null) {
            this.zze.put(p2, p3);
            return;
        } else {
            this.zze.remove(p2);
            return;
        }
    }

    public com.google.android.gms.internal.measurement.zzao zzt()
    {
        return this;
    }
}
