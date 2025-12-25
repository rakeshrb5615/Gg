package com.google.android.gms.internal.measurement;
public final class zzh {

    public static void zza(String p2, int p3, java.util.List p4)
    {
        if (p4.size() != p3) {
            int v4_1 = p4.size();
            StringBuilder v1_1 = new StringBuilder();
            v1_1.append(p2);
            v1_1.append(" operation requires ");
            v1_1.append(p3);
            v1_1.append(" parameters found ");
            v1_1.append(v4_1);
            throw new IllegalArgumentException(v1_1.toString());
        } else {
            return;
        }
    }

    public static void zzb(String p2, int p3, java.util.List p4)
    {
        if (p4.size() < p3) {
            int v4_1 = p4.size();
            StringBuilder v1_1 = new StringBuilder();
            v1_1.append(p2);
            v1_1.append(" operation requires at least ");
            v1_1.append(p3);
            v1_1.append(" parameters found ");
            v1_1.append(v4_1);
            throw new IllegalArgumentException(v1_1.toString());
        } else {
            return;
        }
    }

    public static void zzc(String p2, int p3, java.util.List p4)
    {
        if (p4.size() > p3) {
            int v4_1 = p4.size();
            StringBuilder v1_1 = new StringBuilder();
            v1_1.append(p2);
            v1_1.append(" operation requires at most ");
            v1_1.append(p3);
            v1_1.append(" parameters found ");
            v1_1.append(v4_1);
            throw new IllegalArgumentException(v1_1.toString());
        } else {
            return;
        }
    }

    public static boolean zzd(com.google.android.gms.internal.measurement.zzao p5)
    {
        if (p5 != 0) {
            int v5_3 = p5.zzd();
            if ((v5_3.isNaN()) || ((v5_3.doubleValue() < 0) || (!v5_3.equals(Double.valueOf(Math.floor(v5_3.doubleValue())))))) {
                return 0;
            } else {
                return 1;
            }
        } else {
            return 0;
        }
    }

    public static com.google.android.gms.internal.measurement.zzbk zze(String p2)
    {
        IllegalArgumentException v0_0 = 0;
        if ((p2 != null) && (!p2.isEmpty())) {
            v0_0 = com.google.android.gms.internal.measurement.zzbk.zza(Integer.parseInt(p2));
        }
        if (v0_0 == null) {
            throw new IllegalArgumentException(g2.g.l("Unsupported commandId ", p2));
        } else {
            return v0_0;
        }
    }

    public static boolean zzf(com.google.android.gms.internal.measurement.zzao p4, com.google.android.gms.internal.measurement.zzao p5)
    {
        if (p4.getClass().equals(p5.getClass())) {
            if ((!(p4 instanceof com.google.android.gms.internal.measurement.zzat)) && (!(p4 instanceof com.google.android.gms.internal.measurement.zzam))) {
                if (!(p4 instanceof com.google.android.gms.internal.measurement.zzah)) {
                    if (!(p4 instanceof com.google.android.gms.internal.measurement.zzas)) {
                        if (!(p4 instanceof com.google.android.gms.internal.measurement.zzaf)) {
                            if (p4 != p5) {
                                return 0;
                            } else {
                                return 1;
                            }
                        } else {
                            return p4.zze().equals(p5.zze());
                        }
                    } else {
                        return p4.zzc().equals(p5.zzc());
                    }
                } else {
                    if ((!Double.isNaN(p4.zzd().doubleValue())) && (!Double.isNaN(p5.zzd().doubleValue()))) {
                        return p4.zzd().equals(p5.zzd());
                    } else {
                        return 0;
                    }
                }
            } else {
                return 1;
            }
        } else {
            return 0;
        }
    }

    public static int zzg(double p2)
    {
        if ((!Double.isNaN(p2)) && (!Double.isInfinite(p2))) {
            double v0_7 = p2 cmp 0;
            if (v0_7 != 0) {
                double v0_1;
                if (v0_7 <= 0) {
                    v0_1 = -1;
                } else {
                    v0_1 = 1;
                }
                return ((int) ((long) ((((double) v0_1) * Math.floor(Math.abs(p2))) % 4751297606875873280)));
            }
        }
        return 0;
    }

    public static long zzh(double p2)
    {
        return (((long) com.google.android.gms.internal.measurement.zzh.zzg(p2)) & 4294967295);
    }

    public static double zzi(double p3)
    {
        if (!Double.isNaN(p3)) {
            if (!Double.isInfinite(p3)) {
                double v0_5 = p3 cmp 0;
                if ((v0_5 != 0) && (v0_5 != 0)) {
                    double v0_1;
                    if (v0_5 <= 0) {
                        v0_1 = -1;
                    } else {
                        v0_1 = 1;
                    }
                    return (((double) v0_1) * Math.floor(Math.abs(p3)));
                }
            }
            return p3;
        } else {
            return 0;
        }
    }

    public static Object zzj(com.google.android.gms.internal.measurement.zzao p2)
    {
        if (!com.google.android.gms.internal.measurement.zzao.zzg.equals(p2)) {
            if (!com.google.android.gms.internal.measurement.zzao.zzf.equals(p2)) {
                if (!(p2 instanceof com.google.android.gms.internal.measurement.zzal)) {
                    if (!(p2 instanceof com.google.android.gms.internal.measurement.zzae)) {
                        if (p2.zzd().isNaN()) {
                            return p2.zzc();
                        } else {
                            return p2.zzd();
                        }
                    } else {
                        boolean v0_6 = new java.util.ArrayList();
                        String v2_4 = ((com.google.android.gms.internal.measurement.zzae) p2).iterator();
                        while (v2_4.hasNext()) {
                            Object v1_3 = com.google.android.gms.internal.measurement.zzh.zzj(((com.google.android.gms.internal.measurement.zzao) v2_4.next()));
                            if (v1_3 != null) {
                                v0_6.add(v1_3);
                            }
                        }
                        return v0_6;
                    }
                } else {
                    return com.google.android.gms.internal.measurement.zzh.zzk(((com.google.android.gms.internal.measurement.zzal) p2));
                }
            } else {
                return "";
            }
        } else {
            return 0;
        }
    }

    public static java.util.Map zzk(com.google.android.gms.internal.measurement.zzal p4)
    {
        java.util.HashMap v0_1 = new java.util.HashMap();
        java.util.Iterator v1_1 = p4.zzb().iterator();
        while (v1_1.hasNext()) {
            String v2_1 = ((String) v1_1.next());
            Object v3_1 = com.google.android.gms.internal.measurement.zzh.zzj(p4.zzk(v2_1));
            if (v3_1 != null) {
                v0_1.put(v2_1, v3_1);
            }
        }
        return v0_1;
    }

    public static int zzl(com.google.android.gms.internal.measurement.zzg p5)
    {
        int v1_0 = com.google.android.gms.internal.measurement.zzh.zzg((p5.zzh("runtime.counter").zzd().doubleValue() + 4607182418800017408));
        if (v1_0 > 1000000) {
            throw new IllegalStateException("Instructions allowed exceeded");
        } else {
            p5.zze("runtime.counter", new com.google.android.gms.internal.measurement.zzah(Double.valueOf(((double) v1_0))));
            return v1_0;
        }
    }
}
