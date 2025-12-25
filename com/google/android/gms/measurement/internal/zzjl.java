package com.google.android.gms.measurement.internal;
public final class zzjl {
    public static final com.google.android.gms.measurement.internal.zzjl zza;
    private final java.util.EnumMap zzb;
    private final int zzc;

    static zzjl()
    {
        com.google.android.gms.measurement.internal.zzjl.zza = new com.google.android.gms.measurement.internal.zzjl(0, 0, 100);
        return;
    }

    public zzjl(Boolean p3, Boolean p4, int p5)
    {
        java.util.EnumMap v3_1 = new java.util.EnumMap(com.google.android.gms.measurement.internal.zzjk);
        this.zzb = v3_1;
        v3_1.put(com.google.android.gms.measurement.internal.zzjk.zza, com.google.android.gms.measurement.internal.zzjl.zzh(0));
        v3_1.put(com.google.android.gms.measurement.internal.zzjk.zzb, com.google.android.gms.measurement.internal.zzjl.zzh(0));
        this.zzc = p5;
        return;
    }

    private zzjl(java.util.EnumMap p3, int p4)
    {
        java.util.EnumMap v0_1 = new java.util.EnumMap(com.google.android.gms.measurement.internal.zzjk);
        this.zzb = v0_1;
        v0_1.putAll(p3);
        this.zzc = p4;
        return;
    }

    public static com.google.android.gms.measurement.internal.zzjl zza(com.google.android.gms.measurement.internal.zzji p1, com.google.android.gms.measurement.internal.zzji p2, int p3)
    {
        java.util.EnumMap v3_1 = new java.util.EnumMap(com.google.android.gms.measurement.internal.zzjk);
        v3_1.put(com.google.android.gms.measurement.internal.zzjk.zza, p1);
        v3_1.put(com.google.android.gms.measurement.internal.zzjk.zzb, p2);
        return new com.google.android.gms.measurement.internal.zzjl(v3_1, -10);
    }

    public static String zzd(int p1)
    {
        if (p1 == -30) {
            return "TCF";
        } else {
            if (p1 == -20) {
                return "API";
            } else {
                if (p1 == -10) {
                    return "MANIFEST";
                } else {
                    if (p1 == null) {
                        return "1P_API";
                    } else {
                        if (p1 == 30) {
                            return "1P_INIT";
                        } else {
                            if (p1 == 90) {
                                return "REMOTE_CONFIG";
                            } else {
                                if (p1 == 100) {
                                    return "UNKNOWN";
                                } else {
                                    return "OTHER";
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public static com.google.android.gms.measurement.internal.zzjl zze(android.os.Bundle p6, int p7)
    {
        if (p6 != null) {
            java.util.EnumMap v0_2 = new java.util.EnumMap(com.google.android.gms.measurement.internal.zzjk);
            com.google.android.gms.measurement.internal.zzjk[] v1_2 = com.google.android.gms.measurement.internal.zzjj.zza.zzb();
            int v2 = v1_2.length;
            int v3 = 0;
            while (v3 < v2) {
                com.google.android.gms.measurement.internal.zzjk v4 = v1_2[v3];
                v0_2.put(v4, com.google.android.gms.measurement.internal.zzjl.zzg(p6.getString(v4.zze)));
                v3++;
            }
            return new com.google.android.gms.measurement.internal.zzjl(v0_2, p7);
        } else {
            return new com.google.android.gms.measurement.internal.zzjl(0, 0, p7);
        }
    }

    public static com.google.android.gms.measurement.internal.zzjl zzf(String p7, int p8)
    {
        java.util.EnumMap v0_1 = new java.util.EnumMap(com.google.android.gms.measurement.internal.zzjk);
        com.google.android.gms.measurement.internal.zzjk[] v1_2 = com.google.android.gms.measurement.internal.zzjj.zza.zza();
        int v2 = 0;
        while (v2 < v1_2.length) {
            com.google.android.gms.measurement.internal.zzji v3_0;
            if (p7 != null) {
                v3_0 = p7;
            } else {
                v3_0 = "";
            }
            com.google.android.gms.measurement.internal.zzjk v4 = v1_2[v2];
            int v5 = (v2 + 2);
            if (v5 >= v3_0.length()) {
                v0_1.put(v4, com.google.android.gms.measurement.internal.zzji.zza);
            } else {
                v0_1.put(v4, com.google.android.gms.measurement.internal.zzjl.zzj(v3_0.charAt(v5)));
            }
            v2++;
        }
        return new com.google.android.gms.measurement.internal.zzjl(v0_1, p8);
    }

    public static com.google.android.gms.measurement.internal.zzji zzg(String p1)
    {
        if (p1 != null) {
            if (!p1.equals("granted")) {
                if (!p1.equals("denied")) {
                    return com.google.android.gms.measurement.internal.zzji.zza;
                } else {
                    return com.google.android.gms.measurement.internal.zzji.zzc;
                }
            } else {
                return com.google.android.gms.measurement.internal.zzji.zzd;
            }
        } else {
            return com.google.android.gms.measurement.internal.zzji.zza;
        }
    }

    public static com.google.android.gms.measurement.internal.zzji zzh(Boolean p0)
    {
        if (p0 != null) {
            if (!p0.booleanValue()) {
                return com.google.android.gms.measurement.internal.zzji.zzc;
            } else {
                return com.google.android.gms.measurement.internal.zzji.zzd;
            }
        } else {
            return com.google.android.gms.measurement.internal.zzji.zza;
        }
    }

    public static String zzi(com.google.android.gms.measurement.internal.zzji p1)
    {
        String v1_1 = p1.ordinal();
        if (v1_1 == 2) {
            return "denied";
        } else {
            if (v1_1 == 3) {
                return "granted";
            } else {
                return 0;
            }
        }
    }

    public static com.google.android.gms.measurement.internal.zzji zzj(char p1)
    {
        if (p1 == 43) {
            return com.google.android.gms.measurement.internal.zzji.zzb;
        } else {
            if (p1 == 48) {
                return com.google.android.gms.measurement.internal.zzji.zzc;
            } else {
                if (p1 == 49) {
                    return com.google.android.gms.measurement.internal.zzji.zzd;
                } else {
                    return com.google.android.gms.measurement.internal.zzji.zza;
                }
            }
        }
    }

    public static char zzm(com.google.android.gms.measurement.internal.zzji p1)
    {
        if (p1 != 0) {
            int v1_3 = p1.ordinal();
            if (v1_3 == 1) {
                return 43;
            } else {
                if (v1_3 == 2) {
                    return 48;
                } else {
                    if (v1_3 == 3) {
                        return 49;
                    }
                }
            }
        }
        return 45;
    }

    public static boolean zzu(int p2, int p3)
    {
        int v0 = -30;
        if (p2 != -20) {
            if (p2 != -30) {
                v0 = p2;
            } else {
                if (p3 == -20) {
                    return 1;
                }
            }
            if ((v0 != p3) && (p2 >= p3)) {
                return 0;
            }
        } else {
            if (p3 != -30) {
                p2 = -20;
            }
        }
        return 1;
    }

    public final boolean equals(Object p8)
    {
        if ((p8 instanceof com.google.android.gms.measurement.internal.zzjl)) {
            int v0_3 = com.google.android.gms.measurement.internal.zzjj.zza.zzb();
            int v3 = 0;
            while (v3 < v0_3.length) {
                Object v4_0 = v0_3[v3];
                if (this.zzb.get(v4_0) == ((com.google.android.gms.measurement.internal.zzjl) p8).zzb.get(v4_0)) {
                    v3++;
                } else {
                    return 0;
                }
            }
            if (this.zzc != ((com.google.android.gms.measurement.internal.zzjl) p8).zzc) {
                return 0;
            } else {
                return 1;
            }
        } else {
            return 0;
        }
    }

    public final int hashCode()
    {
        java.util.Iterator v0_2 = this.zzb.values().iterator();
        int v1_1 = (this.zzc * 17);
        while (v0_2.hasNext()) {
            v1_1 = ((v1_1 * 31) + ((com.google.android.gms.measurement.internal.zzji) v0_2.next()).hashCode());
        }
        return v1_1;
    }

    public final String toString()
    {
        String v0_2 = new StringBuilder("source=");
        v0_2.append(com.google.android.gms.measurement.internal.zzjl.zzd(this.zzc));
        com.google.android.gms.measurement.internal.zzjk[] v1_4 = com.google.android.gms.measurement.internal.zzjj.zza.zzb();
        int v2 = v1_4.length;
        int v3 = 0;
        while (v3 < v2) {
            com.google.android.gms.measurement.internal.zzji v4_0 = v1_4[v3];
            v0_2.append(",");
            v0_2.append(v4_0.zze);
            v0_2.append("=");
            com.google.android.gms.measurement.internal.zzji v4_2 = ((com.google.android.gms.measurement.internal.zzji) this.zzb.get(v4_0));
            if (v4_2 == null) {
                v4_2 = com.google.android.gms.measurement.internal.zzji.zza;
            }
            v0_2.append(v4_2);
            v3++;
        }
        return v0_2.toString();
    }

    public final int zzb()
    {
        return this.zzc;
    }

    public final boolean zzc()
    {
        int v0_3 = this.zzb.values().iterator();
        while (v0_3.hasNext()) {
            if (((com.google.android.gms.measurement.internal.zzji) v0_3.next()) != com.google.android.gms.measurement.internal.zzji.zza) {
                return 1;
            }
        }
        return 0;
    }

    public final String zzk()
    {
        String v0_2 = new StringBuilder("G1");
        com.google.android.gms.measurement.internal.zzjk[] v1_2 = com.google.android.gms.measurement.internal.zzjj.zza.zza();
        int v2 = v1_2.length;
        int v3 = 0;
        while (v3 < v2) {
            int v4_2 = ((com.google.android.gms.measurement.internal.zzji) this.zzb.get(v1_2[v3]));
            int v5_1 = 45;
            if (v4_2 != 0) {
                int v4_3 = v4_2.ordinal();
                if (v4_3 != 0) {
                    if (v4_3 != 1) {
                        if (v4_3 == 2) {
                            v5_1 = 48;
                            v0_2.append(v5_1);
                            v3++;
                        } else {
                            if (v4_3 != 3) {
                            }
                        }
                    }
                    v5_1 = 49;
                }
            }
        }
        return v0_2.toString();
    }

    public final String zzl()
    {
        String v0_2 = new StringBuilder("G1");
        com.google.android.gms.measurement.internal.zzjk[] v1_2 = com.google.android.gms.measurement.internal.zzjj.zza.zza();
        int v2 = v1_2.length;
        int v3 = 0;
        while (v3 < v2) {
            v0_2.append(com.google.android.gms.measurement.internal.zzjl.zzm(((com.google.android.gms.measurement.internal.zzji) this.zzb.get(v1_2[v3]))));
            v3++;
        }
        return v0_2.toString();
    }

    public final android.os.Bundle zzn()
    {
        android.os.Bundle v0_1 = new android.os.Bundle();
        java.util.Iterator v1_2 = this.zzb.entrySet().iterator();
        while (v1_2.hasNext()) {
            String v2_1 = ((java.util.Map$Entry) v1_2.next());
            String v3_2 = com.google.android.gms.measurement.internal.zzjl.zzi(((com.google.android.gms.measurement.internal.zzji) v2_1.getValue()));
            if (v3_2 != null) {
                v0_1.putString(((com.google.android.gms.measurement.internal.zzjk) v2_1.getKey()).zze, v3_2);
            }
        }
        return v0_1;
    }

    public final boolean zzo(com.google.android.gms.measurement.internal.zzjk p2)
    {
        if (((com.google.android.gms.measurement.internal.zzji) this.zzb.get(p2)) != com.google.android.gms.measurement.internal.zzji.zzc) {
            return 1;
        } else {
            return 0;
        }
    }

    public final com.google.android.gms.measurement.internal.zzji zzp()
    {
        com.google.android.gms.measurement.internal.zzji v0_2 = ((com.google.android.gms.measurement.internal.zzji) this.zzb.get(com.google.android.gms.measurement.internal.zzjk.zza));
        if (v0_2 == null) {
            v0_2 = com.google.android.gms.measurement.internal.zzji.zza;
        }
        return v0_2;
    }

    public final com.google.android.gms.measurement.internal.zzji zzq()
    {
        com.google.android.gms.measurement.internal.zzji v0_2 = ((com.google.android.gms.measurement.internal.zzji) this.zzb.get(com.google.android.gms.measurement.internal.zzjk.zzb));
        if (v0_2 == null) {
            v0_2 = com.google.android.gms.measurement.internal.zzji.zza;
        }
        return v0_2;
    }

    public final boolean zzr(com.google.android.gms.measurement.internal.zzjl p9)
    {
        java.util.EnumMap v0 = this.zzb;
        int v3_0 = new com.google.android.gms.measurement.internal.zzjk[0];
        com.google.android.gms.measurement.internal.zzjk[] v1_2 = ((com.google.android.gms.measurement.internal.zzjk[]) v0.keySet().toArray(v3_0));
        int v3_1 = v1_2.length;
        int v4 = 0;
        while (v4 < v3_1) {
            com.google.android.gms.measurement.internal.zzji v5_0 = v1_2[v4];
            com.google.android.gms.measurement.internal.zzji v6_1 = ((com.google.android.gms.measurement.internal.zzji) v0.get(v5_0));
            Object vtmp4 = p9.zzb.get(v5_0);
            com.google.android.gms.measurement.internal.zzji v7_1 = com.google.android.gms.measurement.internal.zzji.zzc;
            if ((v6_1 != v7_1) || (((com.google.android.gms.measurement.internal.zzji) vtmp4) == v7_1)) {
                v4++;
            } else {
                return 1;
            }
        }
        return 0;
    }

    public final com.google.android.gms.measurement.internal.zzjl zzs(com.google.android.gms.measurement.internal.zzjl p9)
    {
        java.util.EnumMap v0_1 = new java.util.EnumMap(com.google.android.gms.measurement.internal.zzjk);
        int v1_3 = com.google.android.gms.measurement.internal.zzjj.zza.zzb();
        int v2 = v1_3.length;
        int v3 = 0;
        while (v3 < v2) {
            com.google.android.gms.measurement.internal.zzjk v4 = v1_3[v3];
            com.google.android.gms.measurement.internal.zzji v5_2 = ((com.google.android.gms.measurement.internal.zzji) this.zzb.get(v4));
            com.google.android.gms.measurement.internal.zzji v6_2 = ((com.google.android.gms.measurement.internal.zzji) p9.zzb.get(v4));
            if (v5_2 != null) {
                if (v6_2 != null) {
                    com.google.android.gms.measurement.internal.zzji v7_0 = com.google.android.gms.measurement.internal.zzji.zza;
                    if (v5_2 != v7_0) {
                        if (v6_2 != v7_0) {
                            com.google.android.gms.measurement.internal.zzji v7_1 = com.google.android.gms.measurement.internal.zzji.zzb;
                            if (v5_2 != v7_1) {
                                if (v6_2 != v7_1) {
                                    com.google.android.gms.measurement.internal.zzji v7_2 = com.google.android.gms.measurement.internal.zzji.zzc;
                                    if ((v5_2 != v7_2) && (v6_2 != v7_2)) {
                                        v5_2 = com.google.android.gms.measurement.internal.zzji.zzd;
                                    } else {
                                        v5_2 = v7_2;
                                    }
                                }
                            } else {
                                v5_2 = v6_2;
                            }
                        }
                    }
                }
            }
            if (v5_2 != null) {
                v0_1.put(v4, v5_2);
            }
            v3++;
        }
        return new com.google.android.gms.measurement.internal.zzjl(v0_1, 100);
    }

    public final com.google.android.gms.measurement.internal.zzjl zzt(com.google.android.gms.measurement.internal.zzjl p8)
    {
        java.util.EnumMap v0_1 = new java.util.EnumMap(com.google.android.gms.measurement.internal.zzjk);
        com.google.android.gms.measurement.internal.zzjl v1_4 = com.google.android.gms.measurement.internal.zzjj.zza.zzb();
        int v2 = v1_4.length;
        int v3 = 0;
        while (v3 < v2) {
            com.google.android.gms.measurement.internal.zzjk v4 = v1_4[v3];
            com.google.android.gms.measurement.internal.zzji v5_2 = ((com.google.android.gms.measurement.internal.zzji) this.zzb.get(v4));
            if (v5_2 == com.google.android.gms.measurement.internal.zzji.zza) {
                v5_2 = ((com.google.android.gms.measurement.internal.zzji) p8.zzb.get(v4));
            }
            if (v5_2 != null) {
                v0_1.put(v4, v5_2);
            }
            v3++;
        }
        return new com.google.android.gms.measurement.internal.zzjl(v0_1, this.zzc);
    }
}
