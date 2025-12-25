package com.google.android.gms.internal.measurement;
public class zzal implements com.google.android.gms.internal.measurement.zzao, com.google.android.gms.internal.measurement.zzak {
    final java.util.Map zza;

    public zzal()
    {
        this.zza = new java.util.HashMap();
        return;
    }

    public final boolean equals(Object p2)
    {
        if (this != p2) {
            if ((p2 instanceof com.google.android.gms.internal.measurement.zzal)) {
                return this.zza.equals(((com.google.android.gms.internal.measurement.zzal) p2).zza);
            } else {
                return 0;
            }
        } else {
            return 1;
        }
    }

    public final int hashCode()
    {
        return this.zza.hashCode();
    }

    public final String toString()
    {
        String v0_1 = new StringBuilder("{");
        int v1_4 = this.zza;
        if (!v1_4.isEmpty()) {
            java.util.Iterator v2_0 = v1_4.keySet().iterator();
            while (v2_0.hasNext()) {
                String v3_2 = ((String) v2_0.next());
                v0_1.append(String.format("%s: %s,", new Object[] {v3_2, v1_4.get(v3_2)})));
            }
            v0_1.deleteCharAt(v0_1.lastIndexOf(","));
        }
        v0_1.append("}");
        return v0_1.toString();
    }

    public final java.util.List zzb()
    {
        return new java.util.ArrayList(this.zza.keySet());
    }

    public final String zzc()
    {
        return "[object Object]";
    }

    public com.google.android.gms.internal.measurement.zzao zzcA(String p2, com.google.android.gms.internal.measurement.zzg p3, java.util.List p4)
    {
        if (!"toString".equals(p2)) {
            return com.google.android.gms.internal.measurement.zzak.zzu(this, new com.google.android.gms.internal.measurement.zzas(p2), p3, p4);
        } else {
            return new com.google.android.gms.internal.measurement.zzas(this.toString());
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
        return com.google.android.gms.internal.measurement.zzak.zzv(this.zza);
    }

    public final boolean zzj(String p2)
    {
        return this.zza.containsKey(p2);
    }

    public final com.google.android.gms.internal.measurement.zzao zzk(String p3)
    {
        java.util.Map v0 = this.zza;
        if (!v0.containsKey(p3)) {
            return com.google.android.gms.internal.measurement.zzao.zzf;
        } else {
            return ((com.google.android.gms.internal.measurement.zzao) v0.get(p3));
        }
    }

    public final void zzm(String p2, com.google.android.gms.internal.measurement.zzao p3)
    {
        if (p3 != null) {
            this.zza.put(p2, p3);
            return;
        } else {
            this.zza.remove(p2);
            return;
        }
    }

    public final com.google.android.gms.internal.measurement.zzao zzt()
    {
        com.google.android.gms.internal.measurement.zzal v0_1 = new com.google.android.gms.internal.measurement.zzal();
        java.util.Iterator v1_2 = this.zza.entrySet().iterator();
        while (v1_2.hasNext()) {
            com.google.android.gms.internal.measurement.zzao v2_1 = ((java.util.Map$Entry) v1_2.next());
            if (!(v2_1.getValue() instanceof com.google.android.gms.internal.measurement.zzak)) {
                v0_1.zza.put(((String) v2_1.getKey()), ((com.google.android.gms.internal.measurement.zzao) v2_1.getValue()).zzt());
            } else {
                v0_1.zza.put(((String) v2_1.getKey()), ((com.google.android.gms.internal.measurement.zzao) v2_1.getValue()));
            }
        }
        return v0_1;
    }
}
