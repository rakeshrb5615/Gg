package com.google.android.recaptcha.internal;
public final class zzhh implements com.google.android.recaptcha.internal.zzgx {
    public static final com.google.android.recaptcha.internal.zzhh zza;

    static zzhh()
    {
        com.google.android.recaptcha.internal.zzhh.zza = new com.google.android.recaptcha.internal.zzhh();
        return;
    }

    private zzhh()
    {
        return;
    }

    private final Object zzb(Object p9, Object p10)
    {
        java.util.Iterator v0_0 = (p9 instanceof Byte);
        if ((v0_0 == null) || (!(p10 instanceof Byte))) {
            java.util.ArrayList v1_33 = (p9 instanceof Short);
            if ((v1_33 == null) || (!(p10 instanceof Short))) {
                Double v2_58 = (p9 instanceof Integer);
                if ((v2_58 == null) || (!(p10 instanceof Integer))) {
                    double v3_2 = (p9 instanceof Long);
                    if ((v3_2 == 0) || (!(p10 instanceof Long))) {
                        float v4_1 = (p9 instanceof Float);
                        if ((v4_1 == 0) || (!(p10 instanceof Float))) {
                            double v5_3 = (p9 instanceof Double);
                            if ((v5_3 == 0) || (!(p10 instanceof Double))) {
                                int v7 = 0;
                                if ((p9 instanceof String)) {
                                    if (!(p10 instanceof Byte)) {
                                        if ((p10 instanceof Integer)) {
                                            Object[] v9_48 = ((String) p9).toCharArray();
                                            java.util.ArrayList v1_45 = v9_48.length;
                                            java.util.Iterator v0_38 = new java.util.ArrayList(v1_45);
                                            while (v7 < v1_45) {
                                                v0_38.add(Integer.valueOf((v9_48[v7] % ((Number) p10).intValue())));
                                                v7++;
                                            }
                                            return i7.i.i0(v0_38);
                                        }
                                    } else {
                                        Object[] v9_51 = ((String) p9).getBytes(b8.a.a);
                                        java.util.ArrayList v1_47 = v9_51.length;
                                        java.util.Iterator v0_41 = new java.util.ArrayList(v1_47);
                                        while (v7 < v1_47) {
                                            v0_41.add(Byte.valueOf(((byte) (v9_51[v7] % ((Number) p10).intValue()))));
                                            v7++;
                                        }
                                        return new String(i7.i.g0(v0_41), b8.a.a);
                                    }
                                }
                                if ((v0_0 == null) || (!(p10 instanceof byte[]))) {
                                    if ((v1_33 == null) || (!(p10 instanceof short[]))) {
                                        if ((v2_58 == null) || (!(p10 instanceof int[]))) {
                                            if ((v3_2 == 0) || (!(p10 instanceof long[]))) {
                                                if ((v4_1 == 0) || (!(p10 instanceof float[]))) {
                                                    if ((v5_3 == 0) || (!(p10 instanceof double[]))) {
                                                        java.util.Iterator v0_35 = (p9 instanceof byte[]);
                                                        if ((v0_35 == null) || (!(p10 instanceof Byte))) {
                                                            java.util.ArrayList v1_46 = (p9 instanceof short[]);
                                                            if ((v1_46 == null) || (!(p10 instanceof Short))) {
                                                                Double v2_56 = (p9 instanceof int[]);
                                                                if ((v2_56 == null) || (!(p10 instanceof Integer))) {
                                                                    double v3_63 = (p9 instanceof long[]);
                                                                    if ((v3_63 == 0) || (!(p10 instanceof Long))) {
                                                                        float v4_24 = (p9 instanceof float[]);
                                                                        if ((v4_24 == 0) || (!(p10 instanceof Float))) {
                                                                            double v5_17 = (p9 instanceof double[]);
                                                                            if ((v5_17 == 0) || (!(p10 instanceof Double))) {
                                                                                if ((v0_35 == null) || (!(p10 instanceof byte[]))) {
                                                                                    if ((v1_46 == null) || (!(p10 instanceof short[]))) {
                                                                                        if ((v2_56 == null) || (!(p10 instanceof int[]))) {
                                                                                            if ((v3_63 == 0) || (!(p10 instanceof long[]))) {
                                                                                                if ((v4_24 == 0) || (!(p10 instanceof float[]))) {
                                                                                                    if ((v5_17 == 0) || (!(p10 instanceof double[]))) {
                                                                                                        throw new com.google.android.recaptcha.internal.zzce(4, 5, 0);
                                                                                                    } else {
                                                                                                        java.util.Iterator v0_54 = ((double[]) p9).length;
                                                                                                        com.google.android.recaptcha.internal.zzgw.zza(this, v0_54, ((double[]) p10).length);
                                                                                                        java.util.Iterator v0_1 = w3.a.f(0, v0_54);
                                                                                                        java.util.ArrayList v1_2 = new java.util.ArrayList(i7.j.X(v0_1, 10));
                                                                                                        java.util.Iterator v0_2 = v0_1.iterator();
                                                                                                        while(true) {
                                                                                                            Double v2_2 = ((y7.b) v0_2);
                                                                                                            if (!v2_2.d) {
                                                                                                                break;
                                                                                                            }
                                                                                                            Double v2_3 = v2_2.nextInt();
                                                                                                            v1_2.add(Double.valueOf((((double[]) p9)[v2_3] % ((double[]) p10)[v2_3])));
                                                                                                        }
                                                                                                        Object[] v9_1 = new Double[0];
                                                                                                        return v1_2.toArray(v9_1);
                                                                                                    }
                                                                                                } else {
                                                                                                    java.util.Iterator v0_3 = ((float[]) p9).length;
                                                                                                    com.google.android.recaptcha.internal.zzgw.zza(this, v0_3, ((float[]) p10).length);
                                                                                                    java.util.Iterator v0_4 = w3.a.f(0, v0_3);
                                                                                                    java.util.ArrayList v1_5 = new java.util.ArrayList(i7.j.X(v0_4, 10));
                                                                                                    java.util.Iterator v0_5 = v0_4.iterator();
                                                                                                    while(true) {
                                                                                                        Double v2_7 = ((y7.b) v0_5);
                                                                                                        if (!v2_7.d) {
                                                                                                            break;
                                                                                                        }
                                                                                                        Double v2_8 = v2_7.nextInt();
                                                                                                        v1_5.add(Float.valueOf((((float[]) p9)[v2_8] % ((float[]) p10)[v2_8])));
                                                                                                    }
                                                                                                    Object[] v9_4 = new Float[0];
                                                                                                    return v1_5.toArray(v9_4);
                                                                                                }
                                                                                            } else {
                                                                                                java.util.Iterator v0_6 = ((long[]) p9).length;
                                                                                                com.google.android.recaptcha.internal.zzgw.zza(this, v0_6, ((long[]) p10).length);
                                                                                                java.util.Iterator v0_7 = w3.a.f(0, v0_6);
                                                                                                java.util.ArrayList v1_8 = new java.util.ArrayList(i7.j.X(v0_7, 10));
                                                                                                java.util.Iterator v0_8 = v0_7.iterator();
                                                                                                while(true) {
                                                                                                    Double v2_13 = ((y7.b) v0_8);
                                                                                                    if (!v2_13.d) {
                                                                                                        break;
                                                                                                    }
                                                                                                    Double v2_14 = v2_13.nextInt();
                                                                                                    v1_8.add(Long.valueOf((((long[]) p9)[v2_14] % ((long[]) p10)[v2_14])));
                                                                                                }
                                                                                                Object[] v9_7 = new Long[0];
                                                                                                return v1_8.toArray(v9_7);
                                                                                            }
                                                                                        } else {
                                                                                            java.util.Iterator v0_9 = ((int[]) p9).length;
                                                                                            com.google.android.recaptcha.internal.zzgw.zza(this, v0_9, ((int[]) p10).length);
                                                                                            java.util.Iterator v0_10 = w3.a.f(0, v0_9);
                                                                                            java.util.ArrayList v1_11 = new java.util.ArrayList(i7.j.X(v0_10, 10));
                                                                                            java.util.Iterator v0_11 = v0_10.iterator();
                                                                                            while(true) {
                                                                                                Double v2_18 = ((y7.b) v0_11);
                                                                                                if (!v2_18.d) {
                                                                                                    break;
                                                                                                }
                                                                                                Double v2_19 = v2_18.nextInt();
                                                                                                v1_11.add(Integer.valueOf((((int[]) p9)[v2_19] % ((int[]) p10)[v2_19])));
                                                                                            }
                                                                                            Object[] v9_10 = new Integer[0];
                                                                                            return v1_11.toArray(v9_10);
                                                                                        }
                                                                                    } else {
                                                                                        java.util.Iterator v0_12 = ((short[]) p9).length;
                                                                                        com.google.android.recaptcha.internal.zzgw.zza(this, v0_12, ((short[]) p10).length);
                                                                                        java.util.Iterator v0_13 = w3.a.f(0, v0_12);
                                                                                        java.util.ArrayList v1_15 = new java.util.ArrayList(i7.j.X(v0_13, 10));
                                                                                        java.util.Iterator v0_14 = v0_13.iterator();
                                                                                        while(true) {
                                                                                            Double v2_24 = ((y7.b) v0_14);
                                                                                            if (!v2_24.d) {
                                                                                                break;
                                                                                            }
                                                                                            Double v2_25 = v2_24.nextInt();
                                                                                            v1_15.add(Integer.valueOf((((short[]) p9)[v2_25] % ((short[]) p10)[v2_25])));
                                                                                        }
                                                                                        Object[] v9_13 = new Integer[0];
                                                                                        return v1_15.toArray(v9_13);
                                                                                    }
                                                                                } else {
                                                                                    java.util.Iterator v0_15 = ((byte[]) p9).length;
                                                                                    com.google.android.recaptcha.internal.zzgw.zza(this, v0_15, ((byte[]) p10).length);
                                                                                    java.util.Iterator v0_16 = w3.a.f(0, v0_15);
                                                                                    java.util.ArrayList v1_18 = new java.util.ArrayList(i7.j.X(v0_16, 10));
                                                                                    java.util.Iterator v0_17 = v0_16.iterator();
                                                                                    while(true) {
                                                                                        Double v2_30 = ((y7.b) v0_17);
                                                                                        if (!v2_30.d) {
                                                                                            break;
                                                                                        }
                                                                                        Double v2_31 = v2_30.nextInt();
                                                                                        v1_18.add(Integer.valueOf((((byte[]) p9)[v2_31] % ((byte[]) p10)[v2_31])));
                                                                                    }
                                                                                    Object[] v9_16 = new Integer[0];
                                                                                    return v1_18.toArray(v9_16);
                                                                                }
                                                                            } else {
                                                                                java.util.Iterator v0_18 = ((double[]) p9).length;
                                                                                java.util.ArrayList v1_20 = new java.util.ArrayList(v0_18);
                                                                                Double v2_34 = 0;
                                                                                while (v2_34 < v0_18) {
                                                                                    v1_20.add(Double.valueOf((((double[]) p9)[v2_34] % ((Number) p10).doubleValue())));
                                                                                    v2_34++;
                                                                                }
                                                                                Object[] v9_19 = new Double[0];
                                                                                return v1_20.toArray(v9_19);
                                                                            }
                                                                        } else {
                                                                            java.util.Iterator v0_19 = ((float[]) p9).length;
                                                                            java.util.ArrayList v1_22 = new java.util.ArrayList(v0_19);
                                                                            Double v2_35 = 0;
                                                                            while (v2_35 < v0_19) {
                                                                                v1_22.add(Float.valueOf((((float[]) p9)[v2_35] % ((Number) p10).floatValue())));
                                                                                v2_35++;
                                                                            }
                                                                            Object[] v9_22 = new Float[0];
                                                                            return v1_22.toArray(v9_22);
                                                                        }
                                                                    } else {
                                                                        java.util.Iterator v0_20 = ((long[]) p9).length;
                                                                        java.util.ArrayList v1_24 = new java.util.ArrayList(v0_20);
                                                                        Double v2_36 = 0;
                                                                        while (v2_36 < v0_20) {
                                                                            v1_24.add(Long.valueOf((((long[]) p9)[v2_36] % ((Number) p10).longValue())));
                                                                            v2_36++;
                                                                        }
                                                                        Object[] v9_25 = new Long[0];
                                                                        return v1_24.toArray(v9_25);
                                                                    }
                                                                } else {
                                                                    java.util.Iterator v0_22 = ((int[]) p9).length;
                                                                    java.util.ArrayList v1_26 = new java.util.ArrayList(v0_22);
                                                                    while (v7 < v0_22) {
                                                                        v1_26.add(Integer.valueOf((((int[]) p9)[v7] % ((Number) p10).intValue())));
                                                                        v7++;
                                                                    }
                                                                    return i7.i.i0(v1_26);
                                                                }
                                                            } else {
                                                                java.util.Iterator v0_24 = ((short[]) p9).length;
                                                                java.util.ArrayList v1_28 = new java.util.ArrayList(v0_24);
                                                                Double v2_40 = 0;
                                                                while (v2_40 < v0_24) {
                                                                    v1_28.add(Integer.valueOf((((short[]) p9)[v2_40] % ((Number) p10).intValue())));
                                                                    v2_40++;
                                                                }
                                                                Object[] v9_30 = new Integer[0];
                                                                return v1_28.toArray(v9_30);
                                                            }
                                                        } else {
                                                            java.util.Iterator v0_25 = ((byte[]) p9).length;
                                                            java.util.ArrayList v1_30 = new java.util.ArrayList(v0_25);
                                                            Double v2_41 = 0;
                                                            while (v2_41 < v0_25) {
                                                                v1_30.add(Integer.valueOf((((byte[]) p9)[v2_41] % ((Number) p10).intValue())));
                                                                v2_41++;
                                                            }
                                                            Object[] v9_33 = new Integer[0];
                                                            return v1_30.toArray(v9_33);
                                                        }
                                                    } else {
                                                        java.util.Iterator v0_27 = ((double[]) p10).length;
                                                        java.util.ArrayList v1_32 = new java.util.ArrayList(v0_27);
                                                        Double v2_42 = 0;
                                                        while (v2_42 < v0_27) {
                                                            v1_32.add(Double.valueOf((((double[]) p10)[v2_42] % ((Number) p9).doubleValue())));
                                                            v2_42++;
                                                        }
                                                        Object[] v9_35 = new Double[0];
                                                        return v1_32.toArray(v9_35);
                                                    }
                                                } else {
                                                    java.util.Iterator v0_29 = ((float[]) p10).length;
                                                    java.util.ArrayList v1_35 = new java.util.ArrayList(v0_29);
                                                    Double v2_43 = 0;
                                                    while (v2_43 < v0_29) {
                                                        v1_35.add(Float.valueOf((((float[]) p10)[v2_43] % ((Number) p9).floatValue())));
                                                        v2_43++;
                                                    }
                                                    Object[] v9_37 = new Float[0];
                                                    return v1_35.toArray(v9_37);
                                                }
                                            } else {
                                                java.util.Iterator v0_30 = ((long[]) p10).length;
                                                java.util.ArrayList v1_37 = new java.util.ArrayList(v0_30);
                                                Double v2_44 = 0;
                                                while (v2_44 < v0_30) {
                                                    v1_37.add(Long.valueOf((((long[]) p10)[v2_44] % ((Number) p9).longValue())));
                                                    v2_44++;
                                                }
                                                Object[] v9_39 = new Long[0];
                                                return v1_37.toArray(v9_39);
                                            }
                                        } else {
                                            java.util.Iterator v0_32 = ((int[]) p10).length;
                                            java.util.ArrayList v1_39 = new java.util.ArrayList(v0_32);
                                            Double v2_45 = 0;
                                            while (v2_45 < v0_32) {
                                                v1_39.add(Integer.valueOf((((int[]) p10)[v2_45] % ((Number) p9).intValue())));
                                                v2_45++;
                                            }
                                            Object[] v9_41 = new Integer[0];
                                            return v1_39.toArray(v9_41);
                                        }
                                    } else {
                                        java.util.Iterator v0_34 = ((short[]) p10).length;
                                        java.util.ArrayList v1_41 = new java.util.ArrayList(v0_34);
                                        Double v2_46 = 0;
                                        while (v2_46 < v0_34) {
                                            v1_41.add(Integer.valueOf((((short[]) p10)[v2_46] % ((Number) p9).intValue())));
                                            v2_46++;
                                        }
                                        Object[] v9_43 = new Integer[0];
                                        return v1_41.toArray(v9_43);
                                    }
                                } else {
                                    java.util.Iterator v0_36 = ((byte[]) p10).length;
                                    java.util.ArrayList v1_43 = new java.util.ArrayList(v0_36);
                                    Double v2_47 = 0;
                                    while (v2_47 < v0_36) {
                                        v1_43.add(Integer.valueOf((((byte[]) p10)[v2_47] % ((Number) p9).intValue())));
                                        v2_47++;
                                    }
                                    Object[] v9_45 = new Integer[0];
                                    return v1_43.toArray(v9_45);
                                }
                            } else {
                                return Double.valueOf((((Number) p9).doubleValue() % ((Number) p10).doubleValue()));
                            }
                        } else {
                            return Float.valueOf((((Number) p9).floatValue() % ((Number) p10).floatValue()));
                        }
                    } else {
                        return Long.valueOf((((Number) p9).longValue() % ((Number) p10).longValue()));
                    }
                } else {
                    return Integer.valueOf((((Number) p9).intValue() % ((Number) p10).intValue()));
                }
            } else {
                return Integer.valueOf((((Number) p9).intValue() % ((Number) p10).intValue()));
            }
        } else {
            return Integer.valueOf((((Number) p9).intValue() % ((Number) p10).intValue()));
        }
    }

    public final varargs void zza(int p7, com.google.android.recaptcha.internal.zzgd p8, com.google.android.recaptcha.internal.zzue[] p9)
    {
        if (p9.length != 2) {
            throw new com.google.android.recaptcha.internal.zzce(4, 3, 0);
        } else {
            int v0_2 = p8.zzc().zza(p9[0]);
            if (1 != java.util.Objects.nonNull(v0_2)) {
                v0_2 = 0;
            }
            if (v0_2 == 0) {
                throw new com.google.android.recaptcha.internal.zzce(4, 5, 0);
            } else {
                int v9_2 = p8.zzc().zza(p9[1]);
                if (1 != java.util.Objects.nonNull(v9_2)) {
                    v9_2 = 0;
                }
                if (v9_2 == 0) {
                    throw new com.google.android.recaptcha.internal.zzce(4, 5, 0);
                } else {
                    try {
                        p8.zzc().zze(p7, this.zzb(v0_2, v9_2));
                        return;
                    } catch (ArithmeticException v7_5) {
                        throw new com.google.android.recaptcha.internal.zzce(4, 6, v7_5);
                    }
                }
            }
        }
    }
}
