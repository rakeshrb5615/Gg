package com.google.android.recaptcha.internal;
public final class zzgy implements com.google.android.recaptcha.internal.zzgx {
    public static final com.google.android.recaptcha.internal.zzgy zza;

    static zzgy()
    {
        com.google.android.recaptcha.internal.zzgy.zza = new com.google.android.recaptcha.internal.zzgy();
        return;
    }

    private zzgy()
    {
        return;
    }

    private static final java.util.List zzc(Object p6)
    {
        int v1_0 = i7.n.a;
        int v3 = 0;
        if (!(p6 instanceof byte[])) {
            if (!(p6 instanceof short[])) {
                if (!(p6 instanceof int[])) {
                    if (!(p6 instanceof long[])) {
                        if (!(p6 instanceof float[])) {
                            if ((p6 instanceof double[])) {
                                java.util.List v0_7 = ((double[]) p6).length;
                                if (v0_7 == null) {
                                    return v1_0;
                                } else {
                                    if (v0_7 == 1) {
                                        return a.a.G(Double.valueOf(((double[]) p6)[0]));
                                    } else {
                                        java.util.List v0_10 = new java.util.ArrayList(((double[]) p6).length);
                                        int v1_5 = ((double[]) p6).length;
                                        while (v3 < v1_5) {
                                            v0_10.add(Double.valueOf(((double[]) p6)[v3]));
                                            v3++;
                                        }
                                        return v0_10;
                                    }
                                }
                            } else {
                                return 0;
                            }
                        } else {
                            java.util.List v0_11 = ((float[]) p6).length;
                            if (v0_11 == null) {
                                return v1_0;
                            } else {
                                if (v0_11 == 1) {
                                    return a.a.G(Float.valueOf(((float[]) p6)[0]));
                                } else {
                                    java.util.List v0_14 = new java.util.ArrayList(((float[]) p6).length);
                                    int v1_7 = ((float[]) p6).length;
                                    while (v3 < v1_7) {
                                        v0_14.add(Float.valueOf(((float[]) p6)[v3]));
                                        v3++;
                                    }
                                    return v0_14;
                                }
                            }
                        }
                    } else {
                        return i7.h.h0(((long[]) p6));
                    }
                } else {
                    java.util.List v0_15 = ((int[]) p6).length;
                    if (v0_15 == null) {
                        return v1_0;
                    } else {
                        if (v0_15 == 1) {
                            return a.a.G(Integer.valueOf(((int[]) p6)[0]));
                        } else {
                            java.util.List v0_18 = new java.util.ArrayList(((int[]) p6).length);
                            int v1_9 = ((int[]) p6).length;
                            while (v3 < v1_9) {
                                v0_18.add(Integer.valueOf(((int[]) p6)[v3]));
                                v3++;
                            }
                            return v0_18;
                        }
                    }
                }
            } else {
                java.util.List v0_19 = ((short[]) p6).length;
                if (v0_19 == null) {
                    return v1_0;
                } else {
                    if (v0_19 == 1) {
                        return a.a.G(Short.valueOf(((short[]) p6)[0]));
                    } else {
                        java.util.List v0_1 = new java.util.ArrayList(((short[]) p6).length);
                        int v1_1 = ((short[]) p6).length;
                        while (v3 < v1_1) {
                            v0_1.add(Short.valueOf(((short[]) p6)[v3]));
                            v3++;
                        }
                        return v0_1;
                    }
                }
            }
        } else {
            java.util.List v0_3 = ((byte[]) p6).length;
            if (v0_3 == null) {
                return v1_0;
            } else {
                if (v0_3 == 1) {
                    return a.a.G(Byte.valueOf(((byte[]) p6)[0]));
                } else {
                    java.util.List v0_5 = new java.util.ArrayList(((byte[]) p6).length);
                    int v1_3 = ((byte[]) p6).length;
                    while (v3 < v1_3) {
                        v0_5.add(Byte.valueOf(((byte[]) p6)[v3]));
                        v3++;
                    }
                    return v0_5;
                }
            }
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
                Object v9_2 = p8.zzc().zza(p9[1]);
                if (1 != java.util.Objects.nonNull(v9_2)) {
                    v9_2 = 0;
                }
                if (v9_2 == null) {
                    throw new com.google.android.recaptcha.internal.zzce(4, 5, 0);
                } else {
                    p8.zzc().zze(p7, this.zzb(v0_2, v9_2));
                    return;
                }
            }
        }
    }

    public final Object zzb(Object p8, Object p9)
    {
        int v0_0 = com.google.android.recaptcha.internal.zzgy.zzc(p8);
        Double v1_2 = com.google.android.recaptcha.internal.zzgy.zzc(p9);
        int v4 = 0;
        if ((p8 instanceof Number)) {
            if (!(p9 instanceof Number)) {
                if (v1_2 != null) {
                    Double[] v9_7 = new java.util.ArrayList(i7.j.X(v1_2, 10));
                    int v0_5 = v1_2.iterator();
                    while (v0_5.hasNext()) {
                        v9_7.add(Double.valueOf(Math.pow(((Number) v0_5.next()).doubleValue(), ((Number) p8).doubleValue())));
                    }
                    Object[] v8_13 = new Double[0];
                    return v9_7.toArray(v8_13);
                }
            } else {
                return Double.valueOf(Math.pow(((Number) p8).doubleValue(), ((Number) p9).doubleValue()));
            }
        }
        if ((v0_0 == 0) || (!(p9 instanceof Number))) {
            if ((v0_0 == 0) || (v1_2 == null)) {
                throw new com.google.android.recaptcha.internal.zzce(4, 5, 0);
            } else {
                com.google.android.recaptcha.internal.zzgw.zza(this, v0_0.size(), v1_2.size());
                Object[] v8_9 = v0_0.size();
                Double[] v9_4 = new Double[v8_9];
                while (v4 < v8_9) {
                    v9_4[v4] = Double.valueOf(Math.pow(((Number) v0_0.get(v4)).doubleValue(), ((Number) v1_2.get(v4)).doubleValue()));
                    v4++;
                }
                return v9_4;
            }
        } else {
            Object[] v8_11 = new java.util.ArrayList(i7.j.X(v0_0, 10));
            int v0_3 = v0_0.iterator();
            while (v0_3.hasNext()) {
                v8_11.add(Double.valueOf(Math.pow(((Number) v0_3.next()).doubleValue(), ((Number) p9).doubleValue())));
            }
            Double[] v9_5 = new Double[0];
            return v8_11.toArray(v9_5);
        }
    }
}
