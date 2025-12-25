package com.google.android.gms.measurement.internal;
public final class zzaz {
    public static final com.google.android.gms.measurement.internal.zzaz zza;
    private final int zzb;
    private final String zzc;
    private final Boolean zzd;
    private final String zze;
    private final java.util.EnumMap zzf;

    static zzaz()
    {
        com.google.android.gms.measurement.internal.zzaz.zza = new com.google.android.gms.measurement.internal.zzaz(0, 100, 0, 0);
        return;
    }

    public zzaz(Boolean p3, int p4, Boolean p5, String p6)
    {
        java.util.EnumMap v0_1 = new java.util.EnumMap(com.google.android.gms.measurement.internal.zzjk);
        this.zzf = v0_1;
        v0_1.put(com.google.android.gms.measurement.internal.zzjk.zzc, com.google.android.gms.measurement.internal.zzjl.zzh(p3));
        this.zzb = p4;
        this.zzc = this.zzl();
        this.zzd = p5;
        this.zze = p6;
        return;
    }

    private zzaz(java.util.EnumMap p3, int p4, Boolean p5, String p6)
    {
        java.util.EnumMap v0_1 = new java.util.EnumMap(com.google.android.gms.measurement.internal.zzjk);
        this.zzf = v0_1;
        v0_1.putAll(p3);
        this.zzb = p4;
        this.zzc = this.zzl();
        this.zzd = p5;
        this.zze = p6;
        return;
    }

    public static com.google.android.gms.measurement.internal.zzaz zza(com.google.android.gms.measurement.internal.zzji p2, int p3)
    {
        java.util.EnumMap v3_1 = new java.util.EnumMap(com.google.android.gms.measurement.internal.zzjk);
        v3_1.put(com.google.android.gms.measurement.internal.zzjk.zzc, p2);
        return new com.google.android.gms.measurement.internal.zzaz(v3_1, -10, 0, 0);
    }

    public static com.google.android.gms.measurement.internal.zzaz zzg(String p9)
    {
        if ((p9 != null) && (p9.length() > 0)) {
            com.google.android.gms.measurement.internal.zzaz v9_4 = p9.split(":");
            int v1_0 = Integer.parseInt(v9_4[0]);
            java.util.EnumMap v2_1 = new java.util.EnumMap(com.google.android.gms.measurement.internal.zzjk);
            com.google.android.gms.measurement.internal.zzjk[] v3_2 = com.google.android.gms.measurement.internal.zzjj.zzb.zza();
            int v4 = v3_2.length;
            int v5_0 = 1;
            int v6 = 0;
            while (v6 < v4) {
                int v8 = (v5_0 + 1);
                v2_1.put(v3_2[v6], com.google.android.gms.measurement.internal.zzjl.zzj(v9_4[v5_0].charAt(0)));
                v6++;
                v5_0 = v8;
            }
            return new com.google.android.gms.measurement.internal.zzaz(v2_1, v1_0, 0, 0);
        } else {
            return com.google.android.gms.measurement.internal.zzaz.zza;
        }
    }

    public static com.google.android.gms.measurement.internal.zzaz zzh(android.os.Bundle p7, int p8)
    {
        Boolean v0_0 = 0;
        if (p7 != null) {
            java.util.EnumMap v1_1 = new java.util.EnumMap(com.google.android.gms.measurement.internal.zzjk);
            com.google.android.gms.measurement.internal.zzaz v2_4 = com.google.android.gms.measurement.internal.zzjj.zzb.zza();
            String v3_2 = v2_4.length;
            boolean v4_1 = 0;
            while (v4_1 < v3_2) {
                com.google.android.gms.measurement.internal.zzjk v5 = v2_4[v4_1];
                v1_1.put(v5, com.google.android.gms.measurement.internal.zzjl.zzg(p7.getString(v5.zze)));
                v4_1++;
            }
            if (p7.containsKey("is_dma_region")) {
                v0_0 = Boolean.valueOf(p7.getString("is_dma_region"));
            }
            return new com.google.android.gms.measurement.internal.zzaz(v1_1, p8, v0_0, p7.getString("cps_display_str"));
        } else {
            return new com.google.android.gms.measurement.internal.zzaz(0, p8, 0, 0);
        }
    }

    public static Boolean zzi(android.os.Bundle p1)
    {
        if (p1 != null) {
            Boolean v1_5 = com.google.android.gms.measurement.internal.zzjl.zzg(p1.getString("ad_personalization"));
            if (v1_5 != null) {
                Boolean v1_6 = v1_5.ordinal();
                if (v1_6 == 2) {
                    return Boolean.FALSE;
                } else {
                    if (v1_6 == 3) {
                        return Boolean.TRUE;
                    }
                }
            }
        }
        return 0;
    }

    private final String zzl()
    {
        String v0_1 = new StringBuilder();
        v0_1.append(this.zzb);
        com.google.android.gms.measurement.internal.zzjk[] v1_2 = com.google.android.gms.measurement.internal.zzjj.zzb.zza();
        int v2 = v1_2.length;
        int v3 = 0;
        while (v3 < v2) {
            char v4_0 = v1_2[v3];
            v0_1.append(":");
            v0_1.append(com.google.android.gms.measurement.internal.zzjl.zzm(((com.google.android.gms.measurement.internal.zzji) this.zzf.get(v4_0))));
            v3++;
        }
        return v0_1.toString();
    }

    public final boolean equals(Object p3)
    {
        if ((!(p3 instanceof com.google.android.gms.measurement.internal.zzaz)) || ((!this.zzc.equalsIgnoreCase(((com.google.android.gms.measurement.internal.zzaz) p3).zzc)) || (!java.util.Objects.equals(this.zzd, ((com.google.android.gms.measurement.internal.zzaz) p3).zzd)))) {
            return 0;
        } else {
            return java.util.Objects.equals(this.zze, ((com.google.android.gms.measurement.internal.zzaz) p3).zze);
        }
    }

    public final int hashCode()
    {
        int v0_3;
        int v0_0 = this.zzd;
        if (v0_0 != 0) {
            if (1 == v0_0.booleanValue()) {
                v0_3 = 7;
            } else {
                v0_3 = 13;
            }
        } else {
            v0_3 = 3;
        }
        int v1_0;
        int v1_4 = this.zze;
        if (v1_4 != 0) {
            v1_0 = v1_4.hashCode();
        } else {
            v1_0 = 17;
        }
        return ((v1_0 * 137) + (this.zzc.hashCode() + (v0_3 * 29)));
    }

    public final String toString()
    {
        String v0_1 = new StringBuilder("source=");
        v0_1.append(com.google.android.gms.measurement.internal.zzjl.zzd(this.zzb));
        String v1_6 = com.google.android.gms.measurement.internal.zzjj.zzb.zza();
        String v2_0 = v1_6.length;
        int v3 = 0;
        while (v3 < v2_0) {
            String v4_0 = v1_6[v3];
            v0_1.append(",");
            v0_1.append(v4_0.zze);
            v0_1.append("=");
            String v4_2 = ((com.google.android.gms.measurement.internal.zzji) this.zzf.get(v4_0));
            if (v4_2 != null) {
                String v4_3 = v4_2.ordinal();
                if (v4_3 == null) {
                    v0_1.append("uninitialized");
                } else {
                    if (v4_3 == 1) {
                        v0_1.append("eu_consent_policy");
                    } else {
                        if (v4_3 == 2) {
                            v0_1.append("denied");
                        } else {
                            if (v4_3 == 3) {
                                v0_1.append("granted");
                            }
                        }
                    }
                }
            } else {
                v0_1.append("uninitialized");
            }
            v3++;
        }
        String v1_1 = this.zzd;
        if (v1_1 != null) {
            v0_1.append(",isDmaRegion=");
            v0_1.append(v1_1);
        }
        String v1_2 = this.zze;
        if (v1_2 != null) {
            v0_1.append(",cpsDisplayStr=");
            v0_1.append(v1_2);
        }
        return v0_1.toString();
    }

    public final int zzb()
    {
        return this.zzb;
    }

    public final com.google.android.gms.measurement.internal.zzji zzc()
    {
        com.google.android.gms.measurement.internal.zzji v0_2 = ((com.google.android.gms.measurement.internal.zzji) this.zzf.get(com.google.android.gms.measurement.internal.zzjk.zzc));
        if (v0_2 == null) {
            v0_2 = com.google.android.gms.measurement.internal.zzji.zza;
        }
        return v0_2;
    }

    public final boolean zzd()
    {
        int v0_3 = this.zzf.values().iterator();
        while (v0_3.hasNext()) {
            if (((com.google.android.gms.measurement.internal.zzji) v0_3.next()) != com.google.android.gms.measurement.internal.zzji.zza) {
                return 1;
            }
        }
        return 0;
    }

    public final String zze()
    {
        return this.zzc;
    }

    public final android.os.Bundle zzf()
    {
        android.os.Bundle v0_1 = new android.os.Bundle();
        String v1_5 = this.zzf.entrySet().iterator();
        while (v1_5.hasNext()) {
            String v2_3 = ((java.util.Map$Entry) v1_5.next());
            String v3_2 = com.google.android.gms.measurement.internal.zzjl.zzi(((com.google.android.gms.measurement.internal.zzji) v2_3.getValue()));
            if (v3_2 != null) {
                v0_1.putString(((com.google.android.gms.measurement.internal.zzjk) v2_3.getKey()).zze, v3_2);
            }
        }
        String v1_0 = this.zzd;
        if (v1_0 != null) {
            v0_1.putString("is_dma_region", v1_0.toString());
        }
        String v1_2 = this.zze;
        if (v1_2 != null) {
            v0_1.putString("cps_display_str", v1_2);
        }
        return v0_1;
    }

    public final Boolean zzj()
    {
        return this.zzd;
    }

    public final String zzk()
    {
        return this.zze;
    }
}
