package androidx.datastore.preferences.protobuf;
public abstract class l0 {
    public static final char[] a;

    static l0()
    {
        char[] v0_1 = new char[80];
        androidx.datastore.preferences.protobuf.l0.a = v0_1;
        java.util.Arrays.fill(v0_1, 32);
        return;
    }

    public static void a(int p3, StringBuilder p4)
    {
        while (p3 > 0) {
            int v0 = 80;
            if (p3 <= 80) {
                v0 = p3;
            }
            p4.append(androidx.datastore.preferences.protobuf.l0.a, 0, v0);
            p3 -= v0;
        }
        return;
    }

    public static void b(StringBuilder p4, int p5, String p6, Object p7)
    {
        if (!(p7 instanceof java.util.List)) {
            if (!(p7 instanceof java.util.Map)) {
                p4.append(10);
                androidx.datastore.preferences.protobuf.l0.a(p5, p4);
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
                    if (!(p7 instanceof androidx.datastore.preferences.protobuf.g)) {
                        if (!(p7 instanceof androidx.datastore.preferences.protobuf.v)) {
                            if (!(p7 instanceof java.util.Map$Entry)) {
                                p4.append(": ");
                                p4.append(p7);
                                return;
                            } else {
                                p4.append(" {");
                                int v6_5 = (p5 + 2);
                                androidx.datastore.preferences.protobuf.l0.b(p4, v6_5, "key", ((java.util.Map$Entry) p7).getKey());
                                androidx.datastore.preferences.protobuf.l0.b(p4, v6_5, "value", ((java.util.Map$Entry) p7).getValue());
                                p4.append("\n");
                                androidx.datastore.preferences.protobuf.l0.a(p5, p4);
                                p4.append("}");
                                return;
                            }
                        } else {
                            p4.append(" {");
                            androidx.datastore.preferences.protobuf.l0.c(((androidx.datastore.preferences.protobuf.v) p7), p4, (p5 + 2));
                            p4.append("\n");
                            androidx.datastore.preferences.protobuf.l0.a(p5, p4);
                            p4.append("}");
                            return;
                        }
                    } else {
                        p4.append(": \"");
                        p4.append(j5.t1.q(((androidx.datastore.preferences.protobuf.g) p7)));
                        p4.append(34);
                        return;
                    }
                } else {
                    p4.append(": \"");
                    p4.append(j5.t1.q(new androidx.datastore.preferences.protobuf.g(((String) p7).getBytes(androidx.datastore.preferences.protobuf.x.a))));
                    p4.append(34);
                    return;
                }
            } else {
                Object v7_1 = ((java.util.Map) p7).entrySet().iterator();
                while (v7_1.hasNext()) {
                    androidx.datastore.preferences.protobuf.l0.b(p4, p5, p6, ((java.util.Map$Entry) v7_1.next()));
                }
            }
        } else {
            Object v7_3 = ((java.util.List) p7).iterator();
            while (v7_3.hasNext()) {
                androidx.datastore.preferences.protobuf.l0.b(p4, p5, p6, v7_3.next());
            }
        }
        return;
    }

    public static void c(androidx.datastore.preferences.protobuf.v p21, StringBuilder p22, int p23)
    {
        String v3_6 = new java.util.HashSet();
        Object v4_3 = new java.util.HashMap();
        java.util.TreeMap v5_1 = new java.util.TreeMap();
        java.util.Iterator v6_1 = p21.getClass().getDeclaredMethods();
        String v7_2 = v6_1.length;
        int v8 = 0;
        Object v9_0 = 0;
        while(true) {
            int v13_38 = 3;
            if (v9_0 >= v7_2) {
                break;
            }
            int v14_6 = v6_1[v9_0];
            if ((!reflect.Modifier.isStatic(v14_6.getModifiers())) && (v14_6.getName().length() >= 3)) {
                if (!v14_6.getName().startsWith("set")) {
                    if ((reflect.Modifier.isPublic(v14_6.getModifiers())) && (v14_6.getParameterTypes().length == 0)) {
                        if (!v14_6.getName().startsWith("has")) {
                            if (v14_6.getName().startsWith("get")) {
                                v5_1.put(v14_6.getName(), v14_6);
                            }
                        } else {
                            v4_3.put(v14_6.getName(), v14_6);
                        }
                    }
                } else {
                    v3_6.add(v14_6.getName());
                }
            }
            v9_0++;
        }
        java.util.Iterator v6_3 = v5_1.entrySet().iterator();
        while (v6_3.hasNext()) {
            boolean v16;
            String v7_12 = ((java.util.Map$Entry) v6_3.next());
            Object v9_7 = ((String) v7_12.getKey()).substring(v13_38);
            if ((!v9_7.endsWith("List")) || ((v9_7.endsWith("OrBuilderList")) || (v9_7.equals("List")))) {
                v16 = v13_38;
                if ((v9_7.endsWith("Map")) && (!v9_7.equals("Map"))) {
                    int v13_52 = ((reflect.Method) v7_12.getValue());
                    if ((v13_52 != 0) && ((v13_52.getReturnType().equals(java.util.Map)) && ((!v13_52.isAnnotationPresent(Deprecated)) && (reflect.Modifier.isPublic(v13_52.getModifiers()))))) {
                        Object v9_1 = new Object[0];
                        androidx.datastore.preferences.protobuf.l0.b(p22, p23, v9_7.substring(0, (v9_7.length() - 3)), androidx.datastore.preferences.protobuf.v.e(v13_52, p21, v9_1));
                        v13_38 = v16;
                    }
                }
                if (v3_6.contains("set".concat(v9_7))) {
                    if (v9_7.endsWith("Bytes")) {
                        int v13_5 = new StringBuilder("get");
                        v13_5.append(v9_7.substring(0, (v9_7.length() - 5)));
                        if (v5_1.containsKey(v13_5.toString())) {
                        }
                    }
                    String v7_1 = ((reflect.Method) v7_12.getValue());
                    int v13_10 = ((reflect.Method) v4_3.get("has".concat(v9_7)));
                    if (v7_1 != null) {
                        int v14_5;
                        int v14_3 = new Object[0];
                        String v7_3 = androidx.datastore.preferences.protobuf.v.e(v7_1, p21, v14_3);
                        if (v13_10 != 0) {
                            int v14_4 = new Object[0];
                            v14_5 = ((Boolean) androidx.datastore.preferences.protobuf.v.e(v13_10, p21, v14_4)).booleanValue();
                        } else {
                            int v13_30;
                            v14_5 = 1;
                            if (!(v7_3 instanceof Boolean)) {
                                if (!(v7_3 instanceof Integer)) {
                                    if (!(v7_3 instanceof Float)) {
                                        if (!(v7_3 instanceof Double)) {
                                            if (!(v7_3 instanceof String)) {
                                                if (!(v7_3 instanceof androidx.datastore.preferences.protobuf.g)) {
                                                    if (!(v7_3 instanceof androidx.datastore.preferences.protobuf.a)) {
                                                        if ((!(v7_3 instanceof Enum)) || (((Enum) v7_3).ordinal() != 0)) {
                                                            v13_30 = 0;
                                                            if (v13_30 != 0) {
                                                                v14_5 = 0;
                                                            }
                                                            if (v14_5 != 0) {
                                                                androidx.datastore.preferences.protobuf.l0.b(p22, p23, v9_7, v7_3);
                                                            }
                                                        }
                                                    } else {
                                                        if (v7_3 != ((androidx.datastore.preferences.protobuf.v) ((androidx.datastore.preferences.protobuf.v) ((androidx.datastore.preferences.protobuf.a) v7_3)).c(6))) {
                                                        }
                                                    }
                                                } else {
                                                    v13_30 = v7_3.equals(androidx.datastore.preferences.protobuf.g.c);
                                                }
                                            } else {
                                                v13_30 = v7_3.equals("");
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
                                v13_30 = 1;
                            } else {
                                v13_30 = (((Boolean) v7_3).booleanValue() ^ 1);
                            }
                        }
                    }
                }
            } else {
                int v14_10 = ((reflect.Method) v7_12.getValue());
                if (v14_10 == 0) {
                } else {
                    v16 = v13_38;
                    if (!v14_10.getReturnType().equals(java.util.List)) {
                    } else {
                        Object v9_3 = new Object[0];
                        androidx.datastore.preferences.protobuf.l0.b(p22, p23, v9_7.substring(0, (v9_7.length() - 4)), androidx.datastore.preferences.protobuf.v.e(v14_10, p21, v9_3));
                    }
                }
            }
        }
        androidx.datastore.preferences.protobuf.b1 v0_1 = p21.unknownFields;
        if (v0_1 != null) {
            while (v8 < v0_1.a) {
                androidx.datastore.preferences.protobuf.l0.b(p22, p23, String.valueOf((v0_1.b[v8] >> 3)), v0_1.c[v8]);
                v8++;
            }
        }
        return;
    }
}
