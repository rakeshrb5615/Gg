package com.google.android.recaptcha.internal;
public final class zzht implements com.google.android.recaptcha.internal.zzgx {
    public static final com.google.android.recaptcha.internal.zzht zza;

    static zzht()
    {
        com.google.android.recaptcha.internal.zzht.zza = new com.google.android.recaptcha.internal.zzht();
        return;
    }

    private zzht()
    {
        return;
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

    public final Object zzb(Object p9, Object p10)
    {
        java.util.Iterator v0_0 = (p9 instanceof Byte);
        if ((v0_0 == null) || (!(p10 instanceof Byte))) {
            java.util.ArrayList v1_30 = (p9 instanceof Short);
            if ((v1_30 == null) || (!(p10 instanceof Short))) {
                Long v2_42 = (p9 instanceof Integer);
                if ((v2_42 == null) || (!(p10 instanceof Integer))) {
                    Object v3_2 = (p9 instanceof Long);
                    if ((v3_2 == null) || (!(p10 instanceof Long))) {
                        int v5 = 0;
                        if ((p9 instanceof String)) {
                            if (!(p10 instanceof Byte)) {
                                if ((p10 instanceof Integer)) {
                                    Object[] v9_30 = ((String) p9).toCharArray();
                                    java.util.ArrayList v1_26 = v9_30.length;
                                    java.util.Iterator v0_24 = new java.util.ArrayList(v1_26);
                                    while (v5 < v1_26) {
                                        v0_24.add(Integer.valueOf((v9_30[v5] ^ ((Number) p10).intValue())));
                                        v5++;
                                    }
                                    return i7.i.i0(v0_24);
                                }
                            } else {
                                Object[] v9_33 = ((String) p9).getBytes(b8.a.a);
                                java.util.ArrayList v1_28 = v9_33.length;
                                java.util.Iterator v0_27 = new java.util.ArrayList(v1_28);
                                while (v5 < v1_28) {
                                    v0_27.add(Byte.valueOf(((byte) (v9_33[v5] ^ ((Number) p10).byteValue()))));
                                    v5++;
                                }
                                return i7.i.g0(v0_27);
                            }
                        }
                        if ((v0_0 == null) || (!(p10 instanceof byte[]))) {
                            if ((v1_30 == null) || (!(p10 instanceof short[]))) {
                                if ((v2_42 == null) || (!(p10 instanceof int[]))) {
                                    if ((v3_2 == null) || (!(p10 instanceof long[]))) {
                                        java.util.Iterator v0_22 = (p9 instanceof byte[]);
                                        if ((v0_22 == null) || (!(p10 instanceof Byte))) {
                                            java.util.ArrayList v1_29 = (p9 instanceof short[]);
                                            if ((v1_29 == null) || (!(p10 instanceof Short))) {
                                                Long v2_39 = (p9 instanceof int[]);
                                                if ((v2_39 == null) || (!(p10 instanceof Integer))) {
                                                    Object v3_43 = (p9 instanceof long[]);
                                                    if ((v3_43 == null) || (!(p10 instanceof Long))) {
                                                        if ((v0_22 == null) || (!(p10 instanceof byte[]))) {
                                                            if ((v1_29 == null) || (!(p10 instanceof short[]))) {
                                                                if ((v2_39 == null) || (!(p10 instanceof int[]))) {
                                                                    if ((v3_43 == null) || (!(p10 instanceof long[]))) {
                                                                        throw new com.google.android.recaptcha.internal.zzce(4, 5, 0);
                                                                    } else {
                                                                        java.util.Iterator v0_34 = ((long[]) p9).length;
                                                                        com.google.android.recaptcha.internal.zzgw.zza(this, v0_34, ((long[]) p10).length);
                                                                        java.util.Iterator v0_35 = w3.a.f(0, v0_34);
                                                                        java.util.ArrayList v1_34 = new java.util.ArrayList(i7.j.X(v0_35, 10));
                                                                        java.util.Iterator v0_36 = v0_35.iterator();
                                                                        while(true) {
                                                                            Long v2_44 = ((y7.b) v0_36);
                                                                            if (!v2_44.d) {
                                                                                break;
                                                                            }
                                                                            Long v2_45 = v2_44.nextInt();
                                                                            v1_34.add(Long.valueOf((((long[]) p9)[v2_45] ^ ((long[]) p10)[v2_45])));
                                                                        }
                                                                        Object[] v9_56 = new Long[0];
                                                                        return v1_34.toArray(v9_56);
                                                                    }
                                                                } else {
                                                                    java.util.Iterator v0_1 = ((int[]) p9).length;
                                                                    com.google.android.recaptcha.internal.zzgw.zza(this, v0_1, ((int[]) p10).length);
                                                                    java.util.Iterator v0_2 = w3.a.f(0, v0_1);
                                                                    java.util.ArrayList v1_2 = new java.util.ArrayList(i7.j.X(v0_2, 10));
                                                                    java.util.Iterator v0_3 = v0_2.iterator();
                                                                    while(true) {
                                                                        Long v2_2 = ((y7.b) v0_3);
                                                                        if (!v2_2.d) {
                                                                            break;
                                                                        }
                                                                        Long v2_3 = v2_2.nextInt();
                                                                        v1_2.add(Integer.valueOf((((int[]) p10)[v2_3] ^ ((int[]) p9)[v2_3])));
                                                                    }
                                                                    Object[] v9_1 = new Integer[0];
                                                                    return v1_2.toArray(v9_1);
                                                                }
                                                            } else {
                                                                java.util.Iterator v0_4 = ((short[]) p9).length;
                                                                com.google.android.recaptcha.internal.zzgw.zza(this, v0_4, ((short[]) p10).length);
                                                                java.util.Iterator v0_5 = w3.a.f(0, v0_4);
                                                                java.util.ArrayList v1_5 = new java.util.ArrayList(i7.j.X(v0_5, 10));
                                                                java.util.Iterator v0_6 = v0_5.iterator();
                                                                while(true) {
                                                                    Long v2_9 = ((y7.b) v0_6);
                                                                    if (!v2_9.d) {
                                                                        break;
                                                                    }
                                                                    Long v2_10 = v2_9.nextInt();
                                                                    v1_5.add(Short.valueOf(((short) (((short[]) p10)[v2_10] ^ ((short[]) p9)[v2_10]))));
                                                                }
                                                                Object[] v9_4 = new Short[0];
                                                                return v1_5.toArray(v9_4);
                                                            }
                                                        } else {
                                                            java.util.Iterator v0_7 = ((byte[]) p9).length;
                                                            com.google.android.recaptcha.internal.zzgw.zza(this, v0_7, ((byte[]) p10).length);
                                                            java.util.Iterator v0_8 = w3.a.f(0, v0_7);
                                                            java.util.ArrayList v1_8 = new java.util.ArrayList(i7.j.X(v0_8, 10));
                                                            java.util.Iterator v0_9 = v0_8.iterator();
                                                            while(true) {
                                                                Long v2_17 = ((y7.b) v0_9);
                                                                if (!v2_17.d) {
                                                                    break;
                                                                }
                                                                Long v2_18 = v2_17.nextInt();
                                                                v1_8.add(Byte.valueOf(((byte) (((byte[]) p10)[v2_18] ^ ((byte[]) p9)[v2_18]))));
                                                            }
                                                            Object[] v9_7 = new Byte[0];
                                                            return v1_8.toArray(v9_7);
                                                        }
                                                    } else {
                                                        java.util.Iterator v0_10 = ((long[]) p9).length;
                                                        java.util.ArrayList v1_10 = new java.util.ArrayList(v0_10);
                                                        Long v2_23 = 0;
                                                        while (v2_23 < v0_10) {
                                                            v1_10.add(Long.valueOf((((long[]) p9)[v2_23] ^ ((Number) p10).longValue())));
                                                            v2_23++;
                                                        }
                                                        Object[] v9_10 = new Long[0];
                                                        return v1_10.toArray(v9_10);
                                                    }
                                                } else {
                                                    java.util.Iterator v0_11 = ((int[]) p9).length;
                                                    java.util.ArrayList v1_13 = new java.util.ArrayList(v0_11);
                                                    Long v2_24 = 0;
                                                    while (v2_24 < v0_11) {
                                                        v1_13.add(Integer.valueOf((((int[]) p9)[v2_24] ^ ((Number) p10).intValue())));
                                                        v2_24++;
                                                    }
                                                    Object[] v9_13 = new Integer[0];
                                                    return v1_13.toArray(v9_13);
                                                }
                                            } else {
                                                java.util.Iterator v0_12 = ((short[]) p9).length;
                                                java.util.ArrayList v1_15 = new java.util.ArrayList(v0_12);
                                                Long v2_25 = 0;
                                                while (v2_25 < v0_12) {
                                                    v1_15.add(Short.valueOf(((short) (((short[]) p9)[v2_25] ^ ((Number) p10).shortValue()))));
                                                    v2_25++;
                                                }
                                                Object[] v9_16 = new Short[0];
                                                return v1_15.toArray(v9_16);
                                            }
                                        } else {
                                            java.util.Iterator v0_14 = ((byte[]) p9).length;
                                            java.util.ArrayList v1_17 = new java.util.ArrayList(v0_14);
                                            Long v2_26 = 0;
                                            while (v2_26 < v0_14) {
                                                v1_17.add(Byte.valueOf(((byte) (((byte[]) p9)[v2_26] ^ ((Number) p10).byteValue()))));
                                                v2_26++;
                                            }
                                            Object[] v9_19 = new Byte[0];
                                            return v1_17.toArray(v9_19);
                                        }
                                    } else {
                                        java.util.Iterator v0_16 = ((long[]) p10).length;
                                        java.util.ArrayList v1_19 = new java.util.ArrayList(v0_16);
                                        Long v2_27 = 0;
                                        while (v2_27 < v0_16) {
                                            v1_19.add(Long.valueOf((((long[]) p10)[v2_27] ^ ((Number) p9).longValue())));
                                            v2_27++;
                                        }
                                        Object[] v9_21 = new Long[0];
                                        return v1_19.toArray(v9_21);
                                    }
                                } else {
                                    java.util.Iterator v0_17 = ((int[]) p10).length;
                                    java.util.ArrayList v1_21 = new java.util.ArrayList(v0_17);
                                    Long v2_28 = 0;
                                    while (v2_28 < v0_17) {
                                        v1_21.add(Integer.valueOf((((int[]) p10)[v2_28] ^ ((Number) p9).intValue())));
                                        v2_28++;
                                    }
                                    Object[] v9_23 = new Integer[0];
                                    return v1_21.toArray(v9_23);
                                }
                            } else {
                                java.util.Iterator v0_19 = ((short[]) p10).length;
                                java.util.ArrayList v1_23 = new java.util.ArrayList(v0_19);
                                Long v2_29 = 0;
                                while (v2_29 < v0_19) {
                                    v1_23.add(Short.valueOf(((short) (((short[]) p10)[v2_29] ^ ((Number) p9).shortValue()))));
                                    v2_29++;
                                }
                                Object[] v9_25 = new Short[0];
                                return v1_23.toArray(v9_25);
                            }
                        } else {
                            java.util.Iterator v0_21 = ((byte[]) p10).length;
                            java.util.ArrayList v1_25 = new java.util.ArrayList(v0_21);
                            Long v2_30 = 0;
                            while (v2_30 < v0_21) {
                                v1_25.add(Byte.valueOf(((byte) (((byte[]) p10)[v2_30] ^ ((Number) p9).byteValue()))));
                                v2_30++;
                            }
                            Object[] v9_27 = new Byte[0];
                            return v1_25.toArray(v9_27);
                        }
                    } else {
                        return Long.valueOf((((Number) p10).longValue() ^ ((Number) p9).longValue()));
                    }
                } else {
                    return Integer.valueOf((((Number) p9).intValue() ^ ((Number) p10).intValue()));
                }
            } else {
                return Short.valueOf(((short) (((Number) p9).shortValue() ^ ((Number) p10).shortValue())));
            }
        } else {
            return Byte.valueOf(((byte) (((Number) p9).byteValue() ^ ((Number) p10).byteValue())));
        }
    }
}
