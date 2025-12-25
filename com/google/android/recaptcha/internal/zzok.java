package com.google.android.recaptcha.internal;
final class zzok {
    private static final char[] zza;

    static zzok()
    {
        char[] v0_1 = new char[80];
        com.google.android.recaptcha.internal.zzok.zza = v0_1;
        java.util.Arrays.fill(v0_1, 32);
        return;
    }

    public static String zza(com.google.android.recaptcha.internal.zzoi p2, String p3)
    {
        StringBuilder v0_1 = new StringBuilder();
        v0_1.append("# ");
        v0_1.append(p3);
        com.google.android.recaptcha.internal.zzok.zzd(p2, v0_1, 0);
        return v0_1.toString();
    }

    public static void zzb(StringBuilder p4, int p5, String p6, Object p7)
    {
        if (!(p7 instanceof java.util.List)) {
            if (!(p7 instanceof java.util.Map)) {
                p4.append(10);
                com.google.android.recaptcha.internal.zzok.zzc(p5, p4);
                if (!p6.isEmpty()) {
                    String v0_5 = new StringBuilder();
                    v0_5.append(Character.toLowerCase(p6.charAt(0)));
                    int v1_3 = 1;
                    while (v1_3 < p6.length()) {
                        String v2_4 = p6.charAt(v1_3);
                        if (Character.isUpperCase(v2_4)) {
                            v0_5.append("_");
                        }
                        v0_5.append(Character.toLowerCase(v2_4));
                        v1_3++;
                    }
                    p6 = v0_5.toString();
                }
                p4.append(p6);
                if (!(p7 instanceof String)) {
                    if (!(p7 instanceof com.google.android.recaptcha.internal.zzle)) {
                        if (!(p7 instanceof com.google.android.recaptcha.internal.zznd)) {
                            if (!(p7 instanceof java.util.Map$Entry)) {
                                p4.append(": ");
                                p4.append(p7);
                                return;
                            } else {
                                int v6_5 = (p5 + 2);
                                p4.append(" {");
                                com.google.android.recaptcha.internal.zzok.zzb(p4, v6_5, "key", ((java.util.Map$Entry) p7).getKey());
                                com.google.android.recaptcha.internal.zzok.zzb(p4, v6_5, "value", ((java.util.Map$Entry) p7).getValue());
                                p4.append("\n");
                                com.google.android.recaptcha.internal.zzok.zzc(p5, p4);
                                p4.append("}");
                                return;
                            }
                        } else {
                            int v6_6 = (p5 + 2);
                            p4.append(" {");
                            com.google.android.recaptcha.internal.zzok.zzd(((com.google.android.recaptcha.internal.zznd) p7), p4, v6_6);
                            p4.append("\n");
                            com.google.android.recaptcha.internal.zzok.zzc(p5, p4);
                            p4.append("}");
                            return;
                        }
                    } else {
                        p4.append(": \"");
                        p4.append(com.google.android.recaptcha.internal.zzpg.zza(((com.google.android.recaptcha.internal.zzle) p7)));
                        p4.append(34);
                        return;
                    }
                } else {
                    p4.append(": \"");
                    p4.append(com.google.android.recaptcha.internal.zzpg.zza(new com.google.android.recaptcha.internal.zzlc(((String) p7).getBytes(com.google.android.recaptcha.internal.zznl.zza))));
                    p4.append(34);
                    return;
                }
            } else {
                Object v7_10 = ((java.util.Map) p7).entrySet().iterator();
                while (v7_10.hasNext()) {
                    com.google.android.recaptcha.internal.zzok.zzb(p4, p5, p6, ((java.util.Map$Entry) v7_10.next()));
                }
            }
        } else {
            Object v7_2 = ((java.util.List) p7).iterator();
            while (v7_2.hasNext()) {
                com.google.android.recaptcha.internal.zzok.zzb(p4, p5, p6, v7_2.next());
            }
        }
        return;
    }

    private static void zzc(int p3, StringBuilder p4)
    {
        while (p3 > 0) {
            int v0 = 80;
            if (p3 <= 80) {
                v0 = p3;
            }
            p4.append(com.google.android.recaptcha.internal.zzok.zza, 0, v0);
            p3 -= v0;
        }
        return;
    }

    private static void zzd(com.google.android.recaptcha.internal.zzoi p18, StringBuilder p19, int p20)
    {
        java.util.Iterator v3_6 = new java.util.HashSet();
        Object v4_5 = new java.util.HashMap();
        String v5_5 = new java.util.TreeMap();
        String v6_1 = p18.getClass().getDeclaredMethods();
        String v7_0 = v6_1.length;
        Object v9_0 = 0;
        while(true) {
            int v13_36 = 3;
            if (v9_0 >= v7_0) {
                break;
            }
            Object[] v14_7 = v6_1[v9_0];
            if ((!reflect.Modifier.isStatic(v14_7.getModifiers())) && (v14_7.getName().length() >= 3)) {
                if (!v14_7.getName().startsWith("set")) {
                    if ((reflect.Modifier.isPublic(v14_7.getModifiers())) && (v14_7.getParameterTypes().length == 0)) {
                        if (!v14_7.getName().startsWith("has")) {
                            if (v14_7.getName().startsWith("get")) {
                                v5_5.put(v14_7.getName(), v14_7);
                            }
                        } else {
                            v4_5.put(v14_7.getName(), v14_7);
                        }
                    }
                } else {
                    v3_6.add(v14_7.getName());
                }
            }
            v9_0++;
        }
        String v6_3 = v5_5.entrySet().iterator();
        while (v6_3.hasNext()) {
            String v7_13 = ((java.util.Map$Entry) v6_3.next());
            Object v9_7 = ((String) v7_13.getKey()).substring(v13_36);
            if ((!v9_7.endsWith("List")) || ((v9_7.endsWith("OrBuilderList")) || (v9_7.equals("List")))) {
                if ((v9_7.endsWith("Map")) && (!v9_7.equals("Map"))) {
                    int v13_55 = ((reflect.Method) v7_13.getValue());
                    if ((v13_55 != 0) && ((v13_55.getReturnType().equals(java.util.Map)) && ((!v13_55.isAnnotationPresent(Deprecated)) && (reflect.Modifier.isPublic(v13_55.getModifiers()))))) {
                        Object v9_1 = new Object[0];
                        com.google.android.recaptcha.internal.zzok.zzb(p19, p20, v9_7.substring(0, (v9_7.length() - 3)), com.google.android.recaptcha.internal.zznd.zzE(v13_55, p18, v9_1));
                        v13_36 = 3;
                    }
                }
                if ((v3_6.contains("set".concat(v9_7))) && ((!v9_7.endsWith("Bytes")) || (!v5_5.containsKey("get".concat(String.valueOf(v9_7.substring(0, (v9_7.length() - 5)))))))) {
                    String v7_2 = ((reflect.Method) v7_13.getValue());
                    int v13_12 = ((reflect.Method) v4_5.get("has".concat(v9_7)));
                    if (v7_2 != null) {
                        Object[] v14_5 = new Object[0];
                        String v7_3 = com.google.android.recaptcha.internal.zznd.zzE(v7_2, p18, v14_5);
                        if (v13_12 != 0) {
                            Object[] v14_6 = new Object[0];
                            if (!((Boolean) com.google.android.recaptcha.internal.zznd.zzE(v13_12, p18, v14_6)).booleanValue()) {
                            }
                        } else {
                            if (!(v7_3 instanceof Boolean)) {
                                if (!(v7_3 instanceof Integer)) {
                                    if (!(v7_3 instanceof Float)) {
                                        if (!(v7_3 instanceof Double)) {
                                            int v13_31;
                                            if (!(v7_3 instanceof String)) {
                                                if (!(v7_3 instanceof com.google.android.recaptcha.internal.zzle)) {
                                                    if (!(v7_3 instanceof com.google.android.recaptcha.internal.zzoi)) {
                                                        if (((v7_3 instanceof Enum)) && (((Enum) v7_3).ordinal() == 0)) {
                                                        } else {
                                                            com.google.android.recaptcha.internal.zzok.zzb(p19, p20, v9_7, v7_3);
                                                        }
                                                    } else {
                                                        if (v7_3 == ((com.google.android.recaptcha.internal.zzoi) v7_3).zzm()) {
                                                        }
                                                    }
                                                } else {
                                                    v13_31 = v7_3.equals(com.google.android.recaptcha.internal.zzle.zzb);
                                                }
                                            } else {
                                                v13_31 = v7_3.equals("");
                                            }
                                            if (v13_31 != 0) {
                                            }
                                        } else {
                                            if (Double.doubleToRawLongBits(((Double) v7_3).doubleValue()) == 0) {
                                            }
                                        }
                                    } else {
                                        if (Float.floatToRawIntBits(((Float) v7_3).floatValue()) == 0) {
                                        }
                                    }
                                } else {
                                    if (((Integer) v7_3).intValue() == 0) {
                                    }
                                }
                            } else {
                                if (!((Boolean) v7_3).booleanValue()) {
                                }
                            }
                        }
                    }
                }
            } else {
                Object[] v14_11 = ((reflect.Method) v7_13.getValue());
                if ((v14_11 == null) || (!v14_11.getReturnType().equals(java.util.List))) {
                } else {
                    Object v9_3 = new Object[0];
                    com.google.android.recaptcha.internal.zzok.zzb(p19, p20, v9_7.substring(0, (v9_7.length() - 4)), com.google.android.recaptcha.internal.zznd.zzE(v14_11, p18, v9_3));
                }
            }
        }
        if ((p18 instanceof com.google.android.recaptcha.internal.zzna)) {
            java.util.Iterator v3_5 = ((com.google.android.recaptcha.internal.zzna) p18).zzb.zzf();
            while (v3_5.hasNext()) {
                Object v4_2 = ((java.util.Map$Entry) v3_5.next());
                com.google.android.recaptcha.internal.zzok.zzb(p19, p20, v1.a.j("[", ((com.google.android.recaptcha.internal.zznb) v4_2.getKey()).zza, "]"), v4_2.getValue());
            }
        }
        com.google.android.recaptcha.internal.zzpm v0_2 = ((com.google.android.recaptcha.internal.zznd) p18).zzc;
        if (v0_2 != null) {
            v0_2.zzi(p19, p20);
        }
        return;
    }
}
