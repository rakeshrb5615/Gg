package com.google.android.gms.measurement.internal;
final class zzan {
    private final java.util.EnumMap zza;

    public zzan()
    {
        this.zza = new java.util.EnumMap(com.google.android.gms.measurement.internal.zzjk);
        return;
    }

    private zzan(java.util.EnumMap p3)
    {
        java.util.EnumMap v0_1 = new java.util.EnumMap(com.google.android.gms.measurement.internal.zzjk);
        this.zza = v0_1;
        v0_1.putAll(p3);
        return;
    }

    public static com.google.android.gms.measurement.internal.zzan zzd(String p7)
    {
        java.util.EnumMap v0_1 = new java.util.EnumMap(com.google.android.gms.measurement.internal.zzjk);
        if (p7.length() >= com.google.android.gms.measurement.internal.zzjk.values().length) {
            int v1_1 = 0;
            if (p7.charAt(0) == 49) {
                com.google.android.gms.measurement.internal.zzjk[] v2_1 = com.google.android.gms.measurement.internal.zzjk.values();
                int v3_1 = v2_1.length;
                int v4_0 = 1;
                while (v1_1 < v3_1) {
                    int v6 = (v4_0 + 1);
                    v0_1.put(v2_1[v1_1], com.google.android.gms.measurement.internal.zzam.zza(p7.charAt(v4_0)));
                    v1_1++;
                    v4_0 = v6;
                }
                return new com.google.android.gms.measurement.internal.zzan(v0_1);
            }
        }
        return new com.google.android.gms.measurement.internal.zzan();
    }

    public final String toString()
    {
        String v0_1 = new StringBuilder("1");
        com.google.android.gms.measurement.internal.zzjk[] v1_1 = com.google.android.gms.measurement.internal.zzjk.values();
        int v2 = v1_1.length;
        int v3 = 0;
        while (v3 < v2) {
            char v4_2 = ((com.google.android.gms.measurement.internal.zzam) this.zza.get(v1_1[v3]));
            if (v4_2 == 0) {
                v4_2 = com.google.android.gms.measurement.internal.zzam.zza;
            }
            v0_1.append(v4_2.zzb());
            v3++;
        }
        return v0_1.toString();
    }

    public final com.google.android.gms.measurement.internal.zzam zza(com.google.android.gms.measurement.internal.zzjk p2)
    {
        com.google.android.gms.measurement.internal.zzam v2_2 = ((com.google.android.gms.measurement.internal.zzam) this.zza.get(p2));
        if (v2_2 == null) {
            v2_2 = com.google.android.gms.measurement.internal.zzam.zza;
        }
        return v2_2;
    }

    public final void zzb(com.google.android.gms.measurement.internal.zzjk p3, int p4)
    {
        com.google.android.gms.measurement.internal.zzam v0 = com.google.android.gms.measurement.internal.zzam.zza;
        if (p4 == -30) {
            v0 = com.google.android.gms.measurement.internal.zzam.zzh;
        } else {
            if (p4 != -20) {
                if (p4 == -10) {
                    v0 = com.google.android.gms.measurement.internal.zzam.zzd;
                    this.zza.put(p3, v0);
                    return;
                } else {
                    if (p4 != null) {
                        if (p4 == 30) {
                            v0 = com.google.android.gms.measurement.internal.zzam.zze;
                        }
                        this.zza.put(p3, v0);
                        return;
                    }
                }
            }
            v0 = com.google.android.gms.measurement.internal.zzam.zzf;
        }
        this.zza.put(p3, v0);
        return;
    }

    public final void zzc(com.google.android.gms.measurement.internal.zzjk p2, com.google.android.gms.measurement.internal.zzam p3)
    {
        this.zza.put(p2, p3);
        return;
    }
}
