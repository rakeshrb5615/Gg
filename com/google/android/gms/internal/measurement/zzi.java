package com.google.android.gms.internal.measurement;
public final class zzi {

    public static com.google.android.gms.internal.measurement.zzao zza(Object p5)
    {
        if (p5 != null) {
            if (!(p5 instanceof String)) {
                if (!(p5 instanceof Double)) {
                    if (!(p5 instanceof Long)) {
                        if (!(p5 instanceof Integer)) {
                            if (!(p5 instanceof Boolean)) {
                                if (!(p5 instanceof java.util.Map)) {
                                    if (!(p5 instanceof java.util.List)) {
                                        throw new IllegalArgumentException("Invalid value type");
                                    } else {
                                        String v0_5 = new com.google.android.gms.internal.measurement.zzae();
                                        IllegalArgumentException v5_4 = ((java.util.List) p5).iterator();
                                        while (v5_4.hasNext()) {
                                            v0_5.zzn(v0_5.zzh(), com.google.android.gms.internal.measurement.zzi.zza(v5_4.next()));
                                        }
                                        return v0_5;
                                    }
                                } else {
                                    String v0_8 = new com.google.android.gms.internal.measurement.zzal();
                                    com.google.android.gms.internal.measurement.zzao v1_4 = ((java.util.Map) p5).keySet().iterator();
                                    while (v1_4.hasNext()) {
                                        String v2_2 = v1_4.next();
                                        com.google.android.gms.internal.measurement.zzao v3_1 = com.google.android.gms.internal.measurement.zzi.zza(((java.util.Map) p5).get(v2_2));
                                        if (v2_2 != null) {
                                            if (!(v2_2 instanceof String)) {
                                                v2_2 = v2_2.toString();
                                            }
                                            v0_8.zzm(((String) v2_2), v3_1);
                                        }
                                    }
                                    return v0_8;
                                }
                            } else {
                                return new com.google.android.gms.internal.measurement.zzaf(((Boolean) p5));
                            }
                        } else {
                            return new com.google.android.gms.internal.measurement.zzah(Double.valueOf(((Integer) p5).doubleValue()));
                        }
                    } else {
                        return new com.google.android.gms.internal.measurement.zzah(Double.valueOf(((Long) p5).doubleValue()));
                    }
                } else {
                    return new com.google.android.gms.internal.measurement.zzah(((Double) p5));
                }
            } else {
                return new com.google.android.gms.internal.measurement.zzas(((String) p5));
            }
        } else {
            return com.google.android.gms.internal.measurement.zzao.zzg;
        }
    }

    public static com.google.android.gms.internal.measurement.zzao zzb(com.google.android.gms.internal.measurement.zzje p3)
    {
        if (p3 != null) {
            com.google.android.gms.internal.measurement.zzap v0_5 = (p3.zzj() - 1);
            if (v0_5 == 1) {
                if (!p3.zzc()) {
                    return com.google.android.gms.internal.measurement.zzao.zzm;
                } else {
                    return new com.google.android.gms.internal.measurement.zzas(p3.zzd());
                }
            } else {
                if (v0_5 == 2) {
                    if (!p3.zzg()) {
                        return new com.google.android.gms.internal.measurement.zzah(0);
                    } else {
                        return new com.google.android.gms.internal.measurement.zzah(Double.valueOf(p3.zzh()));
                    }
                } else {
                    if (v0_5 == 3) {
                        if (!p3.zze()) {
                            return new com.google.android.gms.internal.measurement.zzaf(0);
                        } else {
                            return new com.google.android.gms.internal.measurement.zzaf(Boolean.valueOf(p3.zzf()));
                        }
                    } else {
                        if (v0_5 != 4) {
                            throw new IllegalArgumentException("Unknown type found. Cannot convert entity");
                        } else {
                            com.google.android.gms.internal.measurement.zzap v0_11 = p3.zza();
                            java.util.ArrayList v1_6 = new java.util.ArrayList();
                            com.google.android.gms.internal.measurement.zzap v0_12 = v0_11.iterator();
                            while (v0_12.hasNext()) {
                                v1_6.add(com.google.android.gms.internal.measurement.zzi.zzb(((com.google.android.gms.internal.measurement.zzje) v0_12.next())));
                            }
                            return new com.google.android.gms.internal.measurement.zzap(p3.zzb(), v1_6);
                        }
                    }
                }
            }
        } else {
            return com.google.android.gms.internal.measurement.zzao.zzf;
        }
    }
}
