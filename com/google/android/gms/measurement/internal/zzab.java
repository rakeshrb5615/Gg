package com.google.android.gms.measurement.internal;
abstract class zzab {
    final String zzb;
    final int zzc;
    Boolean zzd;
    Boolean zze;
    Long zzf;
    Long zzg;

    public zzab(String p1, int p2)
    {
        this.zzb = p1;
        this.zzc = p2;
        return;
    }

    private static Boolean zzd(String p2, int p3, boolean p4, String p5, java.util.List p6, String p7, com.google.android.gms.measurement.internal.zzgu p8)
    {
        if (p3 != 7) {
            if (p5 == null) {
                return 0;
            }
        } else {
            if ((p6 == null) || (p6.isEmpty())) {
                return 0;
            }
        }
        if ((!p4) && (p3 != 2)) {
            p2 = p2.toUpperCase(java.util.Locale.ENGLISH);
        }
        switch ((p3 - 1)) {
            case 1:
                if (p7 != null) {
                    String v3_3;
                    if (1 == p4) {
                        v3_3 = 0;
                    } else {
                        v3_3 = 66;
                    }
                    try {
                        return Boolean.valueOf(java.util.regex.Pattern.compile(p7, v3_3).matcher(p2).matches());
                    } catch (java.util.regex.PatternSyntaxException) {
                        if (p8 != null) {
                            p8.zze().zzb("Invalid regular expression in REGEXP audience filter. expression", p7);
                        }
                        return 0;
                    }
                } else {
                    return 0;
                }
            case 2:
                return Boolean.valueOf(p2.startsWith(p5));
            case 3:
                return Boolean.valueOf(p2.endsWith(p5));
            case 4:
                return Boolean.valueOf(p2.contains(p5));
            case 5:
                return Boolean.valueOf(p2.equals(p5));
            case 6:
                if (p6 != null) {
                    return Boolean.valueOf(p6.contains(p2));
                } else {
                    return 0;
                }
            default:
                return 0;
        }
    }

    public static Boolean zze(Boolean p0, boolean p1)
    {
        if (p0 != null) {
            Boolean v0_2;
            if (p0.booleanValue() == p1) {
                v0_2 = 0;
            } else {
                v0_2 = 1;
            }
            return Boolean.valueOf(v0_2);
        } else {
            return 0;
        }
    }

    public static Boolean zzf(String p10, com.google.android.gms.internal.measurement.zzfr p11, com.google.android.gms.measurement.internal.zzgu p12)
    {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p11);
        if ((p10 != null) && ((p11.zza()) && (p11.zzj() != 1))) {
            if (p11.zzj() != 7) {
                if (!p11.zzb()) {
                    return 0;
                }
            } else {
                if (p11.zzg() == 0) {
                    return 0;
                }
            }
            java.util.ArrayList v2_2;
            int v4 = p11.zzj();
            boolean v5 = p11.zze();
            if ((!v5) && ((v4 != 2) && (v4 != 7))) {
                v2_2 = p11.zzc().toUpperCase(java.util.Locale.ENGLISH);
            } else {
                v2_2 = p11.zzc();
            }
            String v6 = v2_2;
            java.util.Locale v7_0;
            if (p11.zzg() != 0) {
                java.util.List v11_1 = p11.zzf();
                if (!v5) {
                    java.util.ArrayList v2_5 = new java.util.ArrayList(v11_1.size());
                    java.util.List v11_2 = v11_1.iterator();
                    while (v11_2.hasNext()) {
                        v2_5.add(((String) v11_2.next()).toUpperCase(java.util.Locale.ENGLISH));
                    }
                    v11_1 = java.util.Collections.unmodifiableList(v2_5);
                }
                v7_0 = v11_1;
            } else {
                v7_0 = 0;
            }
            int v8;
            if (v4 != 2) {
                v8 = 0;
            } else {
                v8 = v6;
            }
            return com.google.android.gms.measurement.internal.zzab.zzd(p10, v4, v5, v6, v7_0, v8, p12);
        }
        return 0;
    }

    public static Boolean zzg(long p1, com.google.android.gms.internal.measurement.zzfl p3)
    {
        try {
            return com.google.android.gms.measurement.internal.zzab.zzj(new java.math.BigDecimal(p1), p3, 0);
        } catch (NumberFormatException) {
            return 0;
        }
    }

    public static Boolean zzh(double p1, com.google.android.gms.internal.measurement.zzfl p3)
    {
        try {
            return com.google.android.gms.measurement.internal.zzab.zzj(new java.math.BigDecimal(p1), p3, Math.ulp(p1));
        } catch (NumberFormatException) {
            return 0;
        }
    }

    public static Boolean zzi(String p4, com.google.android.gms.internal.measurement.zzfl p5)
    {
        if (com.google.android.gms.measurement.internal.zzpk.zzm(p4)) {
            try {
                return com.google.android.gms.measurement.internal.zzab.zzj(new java.math.BigDecimal(p4), p5, 0);
            } catch (NumberFormatException) {
                return 0;
            }
        } else {
            return 0;
        }
    }

    public static Boolean zzj(java.math.BigDecimal p8, com.google.android.gms.internal.measurement.zzfl p9, double p10)
    {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p9);
        try {
            if (p9.zza()) {
                int v2 = 1;
                if (p9.zzm() != 1) {
                    if (p9.zzm() != 5) {
                        if (!p9.zzd()) {
                            return 0;
                        }
                    } else {
                        if ((!p9.zzf()) || (!p9.zzh())) {
                            return 0;
                        }
                    }
                    java.math.BigDecimal v5_0;
                    java.math.BigDecimal v9_12;
                    int v4_4;
                    java.math.BigDecimal v0_7 = p9.zzm();
                    if (p9.zzm() != 5) {
                        if (com.google.android.gms.measurement.internal.zzpk.zzm(p9.zze())) {
                            v4_4 = new java.math.BigDecimal(p9.zze());
                            v9_12 = 0;
                            v5_0 = 0;
                        } else {
                            return 0;
                        }
                    } else {
                        try {
                            if ((com.google.android.gms.measurement.internal.zzpk.zzm(p9.zzg())) && (com.google.android.gms.measurement.internal.zzpk.zzm(p9.zzi()))) {
                                int v4_10 = new java.math.BigDecimal(p9.zzg());
                                v5_0 = new java.math.BigDecimal(p9.zzi());
                                v9_12 = v4_10;
                                v4_4 = 0;
                            } else {
                                return 0;
                            }
                        } catch (NumberFormatException) {
                            return 0;
                        }
                    }
                    if (v0_7 != 5) {
                        if (v4_4 == 0) {
                            return 0;
                        }
                    } else {
                        if (v9_12 == null) {
                            return 0;
                        }
                    }
                    java.math.BigDecimal v0_9 = (v0_7 - 1);
                    if (v0_9 == 1) {
                        if (v4_4 != 0) {
                            if (p8.compareTo(v4_4) >= 0) {
                                v2 = 0;
                            }
                            return Boolean.valueOf(v2);
                        } else {
                            return 0;
                        }
                    } else {
                        if (v0_9 == 2) {
                            if (v4_4 != 0) {
                                if (p8.compareTo(v4_4) <= 0) {
                                    v2 = 0;
                                }
                                return Boolean.valueOf(v2);
                            } else {
                                return 0;
                            }
                        } else {
                            if (v0_9 == 3) {
                                if (v4_4 != 0) {
                                    if (p10 == 0) {
                                        if (p8.compareTo(v4_4) != 0) {
                                            v2 = 0;
                                        }
                                        return Boolean.valueOf(v2);
                                    } else {
                                        if ((p8.compareTo(v4_4.subtract(new java.math.BigDecimal(p10).multiply(new java.math.BigDecimal(2)))) <= 0) || (p8.compareTo(v4_4.add(new java.math.BigDecimal(p10).multiply(new java.math.BigDecimal(2)))) >= 0)) {
                                            v2 = 0;
                                        }
                                        return Boolean.valueOf(v2);
                                    }
                                } else {
                                    return 0;
                                }
                            } else {
                                if (v0_9 == 4) {
                                    if (v9_12 == null) {
                                        return 0;
                                    } else {
                                        if ((p8.compareTo(v9_12) < 0) || (p8.compareTo(v5_0) > 0)) {
                                            v2 = 0;
                                        }
                                        return Boolean.valueOf(v2);
                                    }
                                } else {
                                    return 0;
                                }
                            }
                        }
                    }
                }
            }
        } catch (NumberFormatException) {
        }
        return 0;
    }

    public abstract int zza();

    public abstract boolean zzb();

    public abstract boolean zzc();
}
