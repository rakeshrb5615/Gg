package com.google.android.recaptcha.internal;
public final class zzgp implements com.google.android.recaptcha.internal.zzgx {
    public static final com.google.android.recaptcha.internal.zzgp zza;

    static zzgp()
    {
        com.google.android.recaptcha.internal.zzgp.zza = new com.google.android.recaptcha.internal.zzgp();
        return;
    }

    private zzgp()
    {
        return;
    }

    public final varargs void zza(int p12, com.google.android.recaptcha.internal.zzgd p13, com.google.android.recaptcha.internal.zzue[] p14)
    {
        if (p14.length != 1) {
            throw new com.google.android.recaptcha.internal.zzce(4, 3, 0);
        } else {
            Iterable v4_0 = 0;
            String v14_5 = p13.zzc().zza(p14[0]);
            if (1 != java.util.Objects.nonNull(v14_5)) {
                v14_5 = 0;
            }
            if (v14_5 == null) {
                throw new com.google.android.recaptcha.internal.zzce(4, 5, 0);
            } else {
                String v14_1;
                if (!(v14_5 instanceof int[])) {
                    String v0_7;
                    if (!(v14_5 instanceof byte[])) {
                        if (!(v14_5 instanceof long[])) {
                            if (!(v14_5 instanceof short[])) {
                                if (!(v14_5 instanceof float[])) {
                                    if (!(v14_5 instanceof double[])) {
                                        if (!(v14_5 instanceof char[])) {
                                            if (!(v14_5 instanceof Object[])) {
                                                if (!(v14_5 instanceof java.util.Collection)) {
                                                    throw new com.google.android.recaptcha.internal.zzce(4, 5, 0);
                                                } else {
                                                    v14_1 = i7.i.c0(((Iterable) v14_5), ",", "[", "]", 0, 56);
                                                    p13.zzc().zze(p12, v14_1);
                                                    return;
                                                }
                                            } else {
                                                v14_1 = i7.h.g0(((Object[]) v14_5));
                                                p13.zzc().zze(p12, v14_1);
                                                return;
                                            }
                                        } else {
                                            v0_7 = new String(((char[]) v14_5));
                                        }
                                    } else {
                                        String v14_9 = ((double[]) v14_5);
                                        String v0_14 = new StringBuilder();
                                        v0_14.append("[");
                                        int v1_5 = v14_9.length;
                                        int v2_4 = 0;
                                        while (v4_0 < v1_5) {
                                            int v9_2 = v14_9[v4_0];
                                            v2_4++;
                                            if (v2_4 > 1) {
                                                v0_14.append(",");
                                            }
                                            v0_14.append(String.valueOf(v9_2));
                                            v4_0++;
                                        }
                                        v0_14.append("]");
                                        v14_1 = v0_14.toString();
                                        p13.zzc().zze(p12, v14_1);
                                        return;
                                    }
                                } else {
                                    String v14_10 = ((float[]) v14_5);
                                    String v0_16 = new StringBuilder();
                                    v0_16.append("[");
                                    int v1_6 = v14_10.length;
                                    int v2_5 = 0;
                                    while (v4_0 < v1_6) {
                                        String v5_13 = v14_10[v4_0];
                                        v2_5++;
                                        if (v2_5 > 1) {
                                            v0_16.append(",");
                                        }
                                        v0_16.append(String.valueOf(v5_13));
                                        v4_0++;
                                    }
                                    v0_16.append("]");
                                    v14_1 = v0_16.toString();
                                    p13.zzc().zze(p12, v14_1);
                                    return;
                                }
                            } else {
                                String v14_11 = ((short[]) v14_5);
                                String v0_3 = new StringBuilder();
                                v0_3.append("[");
                                int v1_1 = v14_11.length;
                                int v2_0 = 0;
                                while (v4_0 < v1_1) {
                                    String v5_0 = v14_11[v4_0];
                                    v2_0++;
                                    if (v2_0 > 1) {
                                        v0_3.append(",");
                                    }
                                    v0_3.append(String.valueOf(v5_0));
                                    v4_0++;
                                }
                                v0_3.append("]");
                                v14_1 = v0_3.toString();
                                p13.zzc().zze(p12, v14_1);
                                return;
                            }
                        } else {
                            String v14_2 = ((long[]) v14_5);
                            String v0_5 = new StringBuilder();
                            v0_5.append("[");
                            int v1_2 = v14_2.length;
                            int v2_1 = 0;
                            while (v4_0 < v1_2) {
                                int v9_0 = v14_2[v4_0];
                                v2_1++;
                                if (v2_1 > 1) {
                                    v0_5.append(",");
                                }
                                v0_5.append(String.valueOf(v9_0));
                                v4_0++;
                            }
                            v0_5.append("]");
                            v14_1 = v0_5.toString();
                            p13.zzc().zze(p12, v14_1);
                            return;
                        }
                    } else {
                        v0_7 = new String(((byte[]) v14_5), b8.a.a);
                    }
                    v14_1 = v0_7;
                } else {
                    String v14_6 = ((int[]) v14_5);
                    String v0_9 = new StringBuilder();
                    v0_9.append("[");
                    int v1_4 = v14_6.length;
                    int v2_2 = 0;
                    while (v4_0 < v1_4) {
                        String v5_3 = v14_6[v4_0];
                        v2_2++;
                        if (v2_2 > 1) {
                            v0_9.append(",");
                        }
                        v0_9.append(String.valueOf(v5_3));
                        v4_0++;
                    }
                    v0_9.append("]");
                    v14_1 = v0_9.toString();
                }
                p13.zzc().zze(p12, v14_1);
                return;
            }
        }
    }
}
