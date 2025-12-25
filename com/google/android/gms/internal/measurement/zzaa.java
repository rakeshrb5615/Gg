package com.google.android.gms.internal.measurement;
public final class zzaa {
    private static final m4.g zza;
    private String zzb;
    private final long zzc;
    private final java.util.Map zzd;

    static zzaa()
    {
        com.google.android.gms.internal.measurement.zzaa.zza = m4.g.g(3, new Object[] {"_syn", "_err", "_el"}));
        return;
    }

    public zzaa(String p1, long p2, java.util.Map p4)
    {
        this.zzb = p1;
        this.zzc = p2;
        java.util.HashMap v1_2 = new java.util.HashMap();
        this.zzd = v1_2;
        if (p4 != null) {
            v1_2.putAll(p4);
        }
        return;
    }

    public static Object zzh(String p1, Object p2, Object p3)
    {
        if ((com.google.android.gms.internal.measurement.zzaa.zza.contains(p1)) && ((p3 instanceof Double))) {
            return Long.valueOf(Math.round(((Double) p3).doubleValue()));
        } else {
            if (!p1.startsWith("_")) {
                if (!(p2 instanceof Double)) {
                    if (!(p2 instanceof Long)) {
                        if ((p2 instanceof String)) {
                            return p3.toString();
                        }
                    } else {
                        return Long.valueOf(Math.round(((Double) p3).doubleValue()));
                    }
                }
            } else {
                if (!(p2 instanceof String)) {
                    if (p2 != null) {
                        return p2;
                    }
                } else {
                    return p3;
                }
            }
            return p3;
        }
    }

    public final bridge synthetic Object clone()
    {
        return this.zzg();
    }

    public final boolean equals(Object p7)
    {
        if (this != p7) {
            if ((p7 instanceof com.google.android.gms.internal.measurement.zzaa)) {
                if (this.zzc == ((com.google.android.gms.internal.measurement.zzaa) p7).zzc) {
                    if (this.zzb.equals(((com.google.android.gms.internal.measurement.zzaa) p7).zzb)) {
                        return this.zzd.equals(((com.google.android.gms.internal.measurement.zzaa) p7).zzd);
                    } else {
                        return 0;
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
        int v1_2 = this.zzc;
        return (this.zzd.hashCode() + (((this.zzb.hashCode() * 31) + ((int) (v1_2 ^ (v1_2 >> 32)))) * 31));
    }

    public final String toString()
    {
        String v0_0 = this.zzb;
        String v1_1 = this.zzd.toString();
        long v3 = this.zzc;
        StringBuilder v5_3 = new StringBuilder((((((String.valueOf(v0_0).length() + 25) + String.valueOf(v3).length()) + 9) + v1_1.length()) + 1));
        v5_3.append("Event{name=\'");
        v5_3.append(v0_0);
        v5_3.append("\', timestamp=");
        v5_3.append(v3);
        v5_3.append(", params=");
        v5_3.append(v1_1);
        v5_3.append("}");
        return v5_3.toString();
    }

    public final long zza()
    {
        return this.zzc;
    }

    public final String zzb()
    {
        return this.zzb;
    }

    public final void zzc(String p1)
    {
        this.zzb = p1;
        return;
    }

    public final void zzd(String p3, Object p4)
    {
        if (p4 != null) {
            java.util.Map v0 = this.zzd;
            v0.put(p3, com.google.android.gms.internal.measurement.zzaa.zzh(p3, v0.get(p3), p4));
            return;
        } else {
            this.zzd.remove(p3);
            return;
        }
    }

    public final Object zze(String p3)
    {
        java.util.Map v0 = this.zzd;
        if (!v0.containsKey(p3)) {
            return 0;
        } else {
            return v0.get(p3);
        }
    }

    public final java.util.Map zzf()
    {
        return this.zzd;
    }

    public final com.google.android.gms.internal.measurement.zzaa zzg()
    {
        return new com.google.android.gms.internal.measurement.zzaa(this.zzb, this.zzc, new java.util.HashMap(this.zzd));
    }
}
