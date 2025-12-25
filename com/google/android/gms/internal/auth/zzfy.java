package com.google.android.gms.internal.auth;
final class zzfy {

    public static String zza(com.google.android.gms.internal.auth.zzfw p2, String p3)
    {
        StringBuilder v0_1 = new StringBuilder();
        v0_1.append("# ");
        v0_1.append(p3);
        com.google.android.gms.internal.auth.zzfy.zzd(p2, v0_1, 0);
        return v0_1.toString();
    }

    public static final void zzb(StringBuilder p6, int p7, String p8, Object p9)
    {
        if (!(p9 instanceof java.util.List)) {
            if (!(p9 instanceof java.util.Map)) {
                p6.append(10);
                int v0_3 = 0;
                String v1_2 = 0;
                while (v1_2 < p7) {
                    p6.append(32);
                    v1_2++;
                }
                p6.append(p8);
                if (!(p9 instanceof String)) {
                    if (!(p9 instanceof com.google.android.gms.internal.auth.zzee)) {
                        if (!(p9 instanceof com.google.android.gms.internal.auth.zzeu)) {
                            if (!(p9 instanceof java.util.Map$Entry)) {
                                p6.append(": ");
                                p6.append(p9);
                                return;
                            } else {
                                p6.append(" {");
                                int v8_5 = (p7 + 2);
                                com.google.android.gms.internal.auth.zzfy.zzb(p6, v8_5, "key", ((java.util.Map$Entry) p9).getKey());
                                com.google.android.gms.internal.auth.zzfy.zzb(p6, v8_5, "value", ((java.util.Map$Entry) p9).getValue());
                                p6.append("\n");
                                while (v0_3 < p7) {
                                    p6.append(32);
                                    v0_3++;
                                }
                                p6.append("}");
                                return;
                            }
                        } else {
                            p6.append(" {");
                            com.google.android.gms.internal.auth.zzfy.zzd(((com.google.android.gms.internal.auth.zzeu) p9), p6, (p7 + 2));
                            p6.append("\n");
                            while (v0_3 < p7) {
                                p6.append(32);
                                v0_3++;
                            }
                            p6.append("}");
                            return;
                        }
                    } else {
                        p6.append(": \"");
                        p6.append(com.google.android.gms.internal.auth.zzgw.zza(((com.google.android.gms.internal.auth.zzee) p9)));
                        p6.append(34);
                        return;
                    }
                } else {
                    p6.append(": \"");
                    p6.append(com.google.android.gms.internal.auth.zzgw.zza(com.google.android.gms.internal.auth.zzee.zzl(((String) p9))));
                    p6.append(34);
                    return;
                }
            } else {
                Object v9_8 = ((java.util.Map) p9).entrySet().iterator();
                while (v9_8.hasNext()) {
                    com.google.android.gms.internal.auth.zzfy.zzb(p6, p7, p8, ((java.util.Map$Entry) v9_8.next()));
                }
            }
        } else {
            Object v9_10 = ((java.util.List) p9).iterator();
            while (v9_10.hasNext()) {
                com.google.android.gms.internal.auth.zzfy.zzb(p6, p7, p8, v9_10.next());
            }
        }
        return;
    }

    private static final String zzc(String p4)
    {
        StringBuilder v0_1 = new StringBuilder();
        int v1 = 0;
        while (v1 < p4.length()) {
            char v2_0 = p4.charAt(v1);
            if (Character.isUpperCase(v2_0)) {
                v0_1.append("_");
            }
            v0_1.append(Character.toLowerCase(v2_0));
            v1++;
        }
        return v0_1.toString();
    }

    private static void zzd(com.google.android.gms.internal.auth.zzfw p12, StringBuilder p13, int p14)
    {
        boolean v0_1 = new java.util.HashMap();
        java.util.HashMap v1_1 = new java.util.HashMap();
        java.util.Iterator v2_2 = new java.util.TreeSet();
        String v3_25 = p12.getClass().getDeclaredMethods();
        int v4_0 = v3_25.length;
        Object[] v6_0 = 0;
        while (v6_0 < v4_0) {
            long v8_11 = v3_25[v6_0];
            v1_1.put(v8_11.getName(), v8_11);
            if (v8_11.getParameterTypes().length == 0) {
                v0_1.put(v8_11.getName(), v8_11);
                if (v8_11.getName().startsWith("get")) {
                    v2_2.add(v8_11.getName());
                }
            }
            v6_0++;
        }
        java.util.Iterator v2_0 = v2_2.iterator();
        while (v2_0.hasNext()) {
            int v4_41;
            String v3_23 = ((String) v2_0.next());
            if (!v3_23.startsWith("get")) {
                v4_41 = v3_23;
            } else {
                v4_41 = v3_23.substring(3);
            }
            if ((v4_41.endsWith("List")) && ((!v4_41.endsWith("OrBuilderList")) && (!v4_41.equals("List")))) {
                String vtmp30 = String.valueOf(v4_41.substring(0, 1).toLowerCase()).concat(String.valueOf(v4_41.substring(1, (v4_41.length() - 4))));
                long v8_20 = ((reflect.Method) v0_1.get(v3_23));
                if ((v8_20 != 0) && (v8_20.getReturnType().equals(java.util.List))) {
                    int v4_38 = new Object[0];
                    com.google.android.gms.internal.auth.zzfy.zzb(p13, p14, com.google.android.gms.internal.auth.zzfy.zzc(vtmp30), com.google.android.gms.internal.auth.zzeu.zze(v8_20, p12, v4_38));
                }
            }
            if ((v4_41.endsWith("Map")) && (!v4_41.equals("Map"))) {
                String vtmp38 = String.valueOf(v4_41.substring(0, 1).toLowerCase()).concat(String.valueOf(v4_41.substring(1, (v4_41.length() - 3))));
                String v3_1 = ((reflect.Method) v0_1.get(v3_23));
                if ((v3_1 != null) && ((v3_1.getReturnType().equals(java.util.Map)) && ((!v3_1.isAnnotationPresent(Deprecated)) && (reflect.Modifier.isPublic(v3_1.getModifiers()))))) {
                    Object[] v6_7 = new Object[0];
                    com.google.android.gms.internal.auth.zzfy.zzb(p13, p14, com.google.android.gms.internal.auth.zzfy.zzc(vtmp38), com.google.android.gms.internal.auth.zzeu.zze(v3_1, p12, v6_7));
                }
            }
            if ((((reflect.Method) v1_1.get("set".concat(v4_41))) != null) && ((!v4_41.endsWith("Bytes")) || (!v0_1.containsKey("get".concat(String.valueOf(v4_41.substring(0, (v4_41.length() - 5)))))))) {
                String v3_17 = String.valueOf(v4_41.substring(0, 1).toLowerCase()).concat(String.valueOf(v4_41.substring(1)));
                Object[] v6_5 = ((reflect.Method) v0_1.get("get".concat(v4_41)));
                int v4_3 = ((reflect.Method) v0_1.get("has".concat(v4_41)));
                if (v6_5 != null) {
                    long v8_7 = new Object[0];
                    Object[] v6_6 = com.google.android.gms.internal.auth.zzeu.zze(v6_5, p12, v8_7);
                    if (v4_3 != 0) {
                        long v8_8 = new Object[0];
                        if (((Boolean) com.google.android.gms.internal.auth.zzeu.zze(v4_3, p12, v8_8)).booleanValue()) {
                        }
                    } else {
                        if (!(v6_6 instanceof Boolean)) {
                            if (!(v6_6 instanceof Integer)) {
                                if (!(v6_6 instanceof Float)) {
                                    if (!(v6_6 instanceof Double)) {
                                        int v4_22;
                                        if (!(v6_6 instanceof String)) {
                                            if (!(v6_6 instanceof com.google.android.gms.internal.auth.zzee)) {
                                                if (!(v6_6 instanceof com.google.android.gms.internal.auth.zzfw)) {
                                                    if ((!(v6_6 instanceof Enum)) || (((Enum) v6_6).ordinal() != 0)) {
                                                        com.google.android.gms.internal.auth.zzfy.zzb(p13, p14, com.google.android.gms.internal.auth.zzfy.zzc(v3_17), v6_6);
                                                    }
                                                } else {
                                                    if (v6_6 != ((com.google.android.gms.internal.auth.zzfw) v6_6).zzh()) {
                                                    }
                                                }
                                            } else {
                                                v4_22 = v6_6.equals(com.google.android.gms.internal.auth.zzee.zzb);
                                            }
                                        } else {
                                            v4_22 = v6_6.equals("");
                                        }
                                        if (v4_22 == 0) {
                                        }
                                    } else {
                                        if (Double.doubleToRawLongBits(((Double) v6_6).doubleValue()) != 0) {
                                        }
                                    }
                                } else {
                                    if (Float.floatToRawIntBits(((Float) v6_6).floatValue()) != 0) {
                                    }
                                }
                            } else {
                                if (((Integer) v6_6).intValue() != 0) {
                                }
                            }
                        } else {
                            if (((Boolean) v6_6).booleanValue()) {
                            }
                        }
                    }
                }
            }
        }
        if ((p12 instanceof com.google.android.gms.internal.auth.zzet)) {
            throw 0;
        } else {
            int v12_3 = ((com.google.android.gms.internal.auth.zzeu) p12).zzc;
            if (v12_3 != 0) {
                v12_3.zze(p13, p14);
            }
            return;
        }
    }
}
