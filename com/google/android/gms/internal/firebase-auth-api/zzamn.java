package com.google.android.gms.internal.firebase-auth-api;
final class zzamn {
    private static final char[] zza;

    static zzamn()
    {
        char[] v0_1 = new char[80];
        com.google.android.gms.internal.firebase-auth-api.zzamn.zza = v0_1;
        java.util.Arrays.fill(v0_1, 32);
        return;
    }

    public static String zza(com.google.android.gms.internal.firebase-auth-api.zzamm p2, String p3)
    {
        StringBuilder v0_1 = new StringBuilder();
        v0_1.append("# ");
        v0_1.append(p3);
        com.google.android.gms.internal.firebase-auth-api.zzamn.zza(p2, v0_1, 0);
        return v0_1.toString();
    }

    private static void zza(int p3, StringBuilder p4)
    {
        while (p3 > 0) {
            int v1_1;
            char[] v0 = com.google.android.gms.internal.firebase-auth-api.zzamn.zza;
            if (p3 <= v0.length) {
                v1_1 = p3;
            } else {
                v1_1 = v0.length;
            }
            p4.append(v0, 0, v1_1);
            p3 -= v1_1;
        }
        return;
    }

    private static void zza(com.google.android.gms.internal.firebase-auth-api.zzamm p21, StringBuilder p22, int p23)
    {
        java.util.Iterator v3_6 = new java.util.HashSet();
        boolean v4_2 = new java.util.HashMap();
        java.util.TreeMap v5_1 = new java.util.TreeMap();
        java.util.Iterator v6_1 = p21.getClass().getDeclaredMethods();
        String v7_0 = v6_1.length;
        Object v9_0 = 0;
        while(true) {
            int v13_33 = 3;
            if (v9_0 >= v7_0) {
                break;
            }
            int v14_9 = v6_1[v9_0];
            if ((!reflect.Modifier.isStatic(v14_9.getModifiers())) && (v14_9.getName().length() >= 3)) {
                if (!v14_9.getName().startsWith("set")) {
                    if ((reflect.Modifier.isPublic(v14_9.getModifiers())) && (v14_9.getParameterTypes().length == 0)) {
                        if (!v14_9.getName().startsWith("has")) {
                            if (v14_9.getName().startsWith("get")) {
                                v5_1.put(v14_9.getName(), v14_9);
                            }
                        } else {
                            v4_2.put(v14_9.getName(), v14_9);
                        }
                    }
                } else {
                    v3_6.add(v14_9.getName());
                }
            }
            v9_0++;
        }
        java.util.Iterator v6_3 = v5_1.entrySet().iterator();
        while (v6_3.hasNext()) {
            boolean v16;
            String v7_12 = ((java.util.Map$Entry) v6_3.next());
            Object v9_7 = ((String) v7_12.getKey()).substring(v13_33);
            if ((!v9_7.endsWith("List")) || ((v9_7.endsWith("OrBuilderList")) || (v9_7.equals("List")))) {
                v16 = v13_33;
                if ((v9_7.endsWith("Map")) && (!v9_7.equals("Map"))) {
                    int v13_51 = ((reflect.Method) v7_12.getValue());
                    if ((v13_51 != 0) && ((v13_51.getReturnType().equals(java.util.Map)) && ((!v13_51.isAnnotationPresent(Deprecated)) && (reflect.Modifier.isPublic(v13_51.getModifiers()))))) {
                        Object v9_1 = new Object[0];
                        com.google.android.gms.internal.firebase-auth-api.zzamn.zza(p22, p23, v9_7.substring(0, (v9_7.length() - 3)), com.google.android.gms.internal.firebase-auth-api.zzalf.zza(v13_51, p21, v9_1));
                        v13_33 = v16;
                    }
                }
                if (v3_6.contains("set".concat(v9_7))) {
                    if (v9_7.endsWith("Bytes")) {
                        int v13_6 = v9_7.substring(0, (v9_7.length() - 5));
                        int v14_5 = new StringBuilder("get");
                        v14_5.append(v13_6);
                        if (v5_1.containsKey(v14_5.toString())) {
                        }
                    }
                    String v7_2 = ((reflect.Method) v7_12.getValue());
                    int v13_11 = ((reflect.Method) v4_2.get("has".concat(v9_7)));
                    if (v7_2 != null) {
                        int v14_8;
                        int v14_6 = new Object[0];
                        String v7_3 = com.google.android.gms.internal.firebase-auth-api.zzalf.zza(v7_2, p21, v14_6);
                        if (v13_11 != 0) {
                            int v14_7 = new Object[0];
                            v14_8 = ((Boolean) com.google.android.gms.internal.firebase-auth-api.zzalf.zza(v13_11, p21, v14_7)).booleanValue();
                        } else {
                            int v13_29;
                            v14_8 = 1;
                            if (!(v7_3 instanceof Boolean)) {
                                if (!(v7_3 instanceof Integer)) {
                                    if (!(v7_3 instanceof Float)) {
                                        if (!(v7_3 instanceof Double)) {
                                            if (!(v7_3 instanceof String)) {
                                                if (!(v7_3 instanceof com.google.android.gms.internal.firebase-auth-api.zzajv)) {
                                                    if (!(v7_3 instanceof com.google.android.gms.internal.firebase-auth-api.zzamm)) {
                                                        if ((!(v7_3 instanceof Enum)) || (((Enum) v7_3).ordinal() != 0)) {
                                                            v13_29 = 0;
                                                        } else {
                                                            v13_29 = 1;
                                                        }
                                                    } else {
                                                        if (v7_3 != ((com.google.android.gms.internal.firebase-auth-api.zzamm) v7_3).zzs()) {
                                                        }
                                                    }
                                                } else {
                                                    v13_29 = v7_3.equals(com.google.android.gms.internal.firebase-auth-api.zzajv.zza);
                                                }
                                            } else {
                                                v13_29 = v7_3.equals("");
                                            }
                                        } else {
                                            if (Double.doubleToRawLongBits(((Double) v7_3).doubleValue()) != 0) {
                                            }
                                        }
                                    } else {
                                        if (Float.floatToRawIntBits(((Float) v7_3).floatValue()) != 0) {
                                        }
                                    }
                                } else {
                                    if (((Integer) v7_3).intValue() != 0) {
                                    }
                                }
                            } else {
                                if (((Boolean) v7_3).booleanValue()) {
                                }
                            }
                            if (v13_29 != 0) {
                                v14_8 = 0;
                            }
                        }
                        if (v14_8 != 0) {
                            com.google.android.gms.internal.firebase-auth-api.zzamn.zza(p22, p23, v9_7, v7_3);
                        }
                    }
                }
            } else {
                int v14_13 = ((reflect.Method) v7_12.getValue());
                if (v14_13 == 0) {
                } else {
                    v16 = v13_33;
                    if (!v14_13.getReturnType().equals(java.util.List)) {
                    } else {
                        Object v9_3 = new Object[0];
                        com.google.android.gms.internal.firebase-auth-api.zzamn.zza(p22, p23, v9_7.substring(0, (v9_7.length() - 4)), com.google.android.gms.internal.firebase-auth-api.zzalf.zza(v14_13, p21, v9_3));
                    }
                }
            }
        }
        if ((p21 instanceof com.google.android.gms.internal.firebase-auth-api.zzalf$zzd)) {
            java.util.Iterator v3_5 = ((com.google.android.gms.internal.firebase-auth-api.zzalf$zzd) p21).zzc.zzd();
            if (v3_5.hasNext()) {
                ((java.util.Map$Entry) v3_5.next()).getKey();
                throw new NoSuchMethodError();
            }
        }
        NoSuchMethodError v0_7 = ((com.google.android.gms.internal.firebase-auth-api.zzalf) p21).zzb;
        if (v0_7 != null) {
            v0_7.zza(p22, p23);
        }
        return;
    }

    public static void zza(StringBuilder p4, int p5, String p6, Object p7)
    {
        if (!(p7 instanceof java.util.List)) {
            if (!(p7 instanceof java.util.Map)) {
                p4.append(10);
                com.google.android.gms.internal.firebase-auth-api.zzamn.zza(p5, p4);
                if (!p6.isEmpty()) {
                    String v0_5 = new StringBuilder();
                    v0_5.append(Character.toLowerCase(p6.charAt(0)));
                    int v1_3 = 1;
                    while (v1_3 < p6.length()) {
                        String v2_1 = p6.charAt(v1_3);
                        if (Character.isUpperCase(v2_1)) {
                            v0_5.append("_");
                        }
                        v0_5.append(Character.toLowerCase(v2_1));
                        v1_3++;
                    }
                    p6 = v0_5.toString();
                }
                p4.append(p6);
                if (!(p7 instanceof String)) {
                    if (!(p7 instanceof com.google.android.gms.internal.firebase-auth-api.zzajv)) {
                        if (!(p7 instanceof com.google.android.gms.internal.firebase-auth-api.zzalf)) {
                            if (!(p7 instanceof java.util.Map$Entry)) {
                                p4.append(": ");
                                p4.append(p7);
                                return;
                            } else {
                                p4.append(" {");
                                int v6_5 = (p5 + 2);
                                com.google.android.gms.internal.firebase-auth-api.zzamn.zza(p4, v6_5, "key", ((java.util.Map$Entry) p7).getKey());
                                com.google.android.gms.internal.firebase-auth-api.zzamn.zza(p4, v6_5, "value", ((java.util.Map$Entry) p7).getValue());
                                p4.append("\n");
                                com.google.android.gms.internal.firebase-auth-api.zzamn.zza(p5, p4);
                                p4.append("}");
                                return;
                            }
                        } else {
                            p4.append(" {");
                            com.google.android.gms.internal.firebase-auth-api.zzamn.zza(((com.google.android.gms.internal.firebase-auth-api.zzalf) p7), p4, (p5 + 2));
                            p4.append("\n");
                            com.google.android.gms.internal.firebase-auth-api.zzamn.zza(p5, p4);
                            p4.append("}");
                            return;
                        }
                    } else {
                        p4.append(": \"");
                        p4.append(com.google.android.gms.internal.firebase-auth-api.zzann.zza(((com.google.android.gms.internal.firebase-auth-api.zzajv) p7)));
                        p4.append(34);
                        return;
                    }
                } else {
                    p4.append(": \"");
                    p4.append(com.google.android.gms.internal.firebase-auth-api.zzann.zza(com.google.android.gms.internal.firebase-auth-api.zzajv.zza(((String) p7))));
                    p4.append(34);
                    return;
                }
            } else {
                Object v7_10 = ((java.util.Map) p7).entrySet().iterator();
                while (v7_10.hasNext()) {
                    com.google.android.gms.internal.firebase-auth-api.zzamn.zza(p4, p5, p6, ((java.util.Map$Entry) v7_10.next()));
                }
            }
        } else {
            Object v7_2 = ((java.util.List) p7).iterator();
            while (v7_2.hasNext()) {
                com.google.android.gms.internal.firebase-auth-api.zzamn.zza(p4, p5, p6, v7_2.next());
            }
        }
        return;
    }
}
