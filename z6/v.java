package z6;
public final class v implements w6.a0 {
    public final y6.c a;
    public final w6.h b;
    public final y6.e c;
    public final z6.k d;
    public final java.util.List e;

    public v(y6.c p2, w6.h p3, y6.e p4, z6.k p5)
    {
        this.a = p2;
        this.b = p3;
        this.c = p4;
        this.d = p5;
        this.e = java.util.Collections.EMPTY_LIST;
        return;
    }

    public static void b(Class p3, String p4, reflect.Field p5, reflect.Field p6)
    {
        StringBuilder v1_1 = new StringBuilder("Class ");
        v1_1.append(p3.getName());
        v1_1.append(" declares multiple JSON fields named \'");
        v1_1.append(p4);
        v1_1.append("\'; conflict is caused by fields ");
        v1_1.append(b7.c.c(p5));
        v1_1.append(" and ");
        v1_1.append(b7.c.c(p6));
        v1_1.append("\nSee ");
        v1_1.append("https://github.com/google/gson/blob/main/Troubleshooting.md#".concat("duplicate-fields"));
        throw new IllegalArgumentException(v1_1.toString());
    }

    public final w6.z a(w6.m p5, d7.a p6)
    {
        Class v0 = p6.a;
        if (Object.isAssignableFrom(v0)) {
            if ((reflect.Modifier.isStatic(v0.getModifiers())) || ((!v0.isAnonymousClass()) && (!v0.isLocalClass()))) {
                y6.i.e();
                if (!b7.c.a.E(v0)) {
                    return new z6.s(this.a.b(p6, 1), this.c(p5, p6, v0, 0));
                } else {
                    return new z6.u(v0, this.c(p5, p6, v0, 1));
                }
            } else {
                return new w6.j(2);
            }
        } else {
            return 0;
        }
    }

    public final z6.t c(w6.m p30, d7.a p31, Class p32, boolean p33)
    {
        if (!p32.isInterface()) {
            java.util.LinkedHashMap v8_1 = new java.util.LinkedHashMap();
            java.util.LinkedHashMap v9_1 = new java.util.LinkedHashMap();
            w6.z v1_11 = p31;
            Class v10 = p32;
            do {
                reflect.Type v11 = v1_11.b;
                if (v10 == Object) {
                    return new z6.t(v8_1, new java.util.ArrayList(v9_1.values()));
                } else {
                    reflect.Field[] v12 = v10.getDeclaredFields();
                    if ((v10 != p32) && (v12.length > 0)) {
                        y6.i.e();
                    }
                    int v13 = v12.length;
                    int v14_2 = 0;
                    int v15 = 0;
                    while (v15 < v13) {
                        w6.z v1_12 = v12[v15];
                        boolean v24 = this.d(v1_12, 1);
                        w6.m v3_9 = this.d(v1_12, v14_2);
                    }
                    reflect.Field v2_16 = new d7.a(y6.i.j(v11, v10, v10.getGenericSuperclass(), new java.util.HashMap()));
                    v10 = v2_16.a;
                    v1_11 = v2_16;
                }
            } while((v24) || (v3_9 != null));
            w6.m v26;
            reflect.Method v19;
            if (!p33) {
                v26 = v3_9;
                v19 = 0;
            } else {
                if (!reflect.Modifier.isStatic(v1_12.getModifiers())) {
                    java.util.Iterator v5_8 = b7.c.a.s(v10, v1_12);
                    b7.c.f(v5_8);
                    if ((v5_8.getAnnotation(x6.b) != null) && (v1_12.getAnnotation(x6.b) == null)) {
                        throw new w6.p(v1.a.l("@SerializedName on ", b7.c.d(v5_8, v14_2), " is not supported"));
                    } else {
                        v26 = v3_9;
                        v19 = v5_8;
                    }
                } else {
                    v26 = v14_2;
                }
            }
            if (v19 == null) {
                b7.c.f(v1_12);
            }
            java.util.Iterator v5_0;
            String v4_1;
            w6.m v3_12 = y6.i.j(v11, v10, v1_12.getGenericType(), new java.util.HashMap());
            String v4_12 = ((x6.b) v1_12.getAnnotation(x6.b));
            if (v4_12 != null) {
                v5_0 = java.util.Arrays.asList(v4_12.alternate());
                v4_1 = v4_12.value();
            } else {
                v4_1 = this.b.b(v1_12);
                v5_0 = java.util.Collections.EMPTY_LIST;
            }
            reflect.Field v2_1;
            java.util.List v31_1;
            if (!v5_0.isEmpty()) {
                v31_1 = 1;
                String v6_2 = new java.util.ArrayList((v5_0.size() + 1));
                v6_2.add(v4_1);
                v6_2.addAll(v5_0);
                v2_1 = v6_2;
            } else {
                v31_1 = 1;
                v2_1 = java.util.Collections.singletonList(v4_1);
            }
            java.util.List v22;
            String v17_1 = ((String) v2_1.get(v14_2));
            String v4_6 = new d7.a(v3_12);
            w6.m v3_0 = v4_6.a;
            if ((v3_0 == null) || (!v3_0.isPrimitive())) {
                v22 = v14_2;
            } else {
                v22 = v31_1;
            }
            java.util.List v23;
            w6.m v3_2 = v1_12.getModifiers();
            if ((!reflect.Modifier.isStatic(v3_2)) || (!reflect.Modifier.isFinal(v3_2))) {
                v23 = v14_2;
            } else {
                v23 = v31_1;
            }
            w6.z v1_2;
            w6.m v3_6;
            Object v16_1;
            y6.c v27;
            w6.z v18;
            java.util.Iterator v5_3 = ((x6.a) v1_12.getAnnotation(x6.a));
            if (v5_3 == null) {
                v3_6 = p30;
                v16_1 = v31_1;
                v18 = v1_12;
                v27 = v2_1;
                v1_2 = 0;
            } else {
                v18 = v1_12;
                v16_1 = v31_1;
                v27 = v2_1;
                v3_6 = p30;
                v1_2 = this.d.b(this.a, p30, v4_6, v5_3, 0);
            }
            reflect.Field v2_4;
            if (v1_2 == null) {
                v2_4 = v14_2;
            } else {
                v2_4 = v16_1;
            }
            if (v1_2 == null) {
                v1_2 = v3_6.b(v4_6);
            }
            z6.q v20;
            if (!v24) {
                v20 = v1_2;
            } else {
                reflect.Field v2_7;
                if (v2_4 == null) {
                    v2_7 = new z6.m(v3_6, v1_2, v4_6.b);
                } else {
                    v2_7 = v1_2;
                }
                v20 = v2_7;
            }
            reflect.Field v2_8 = new z6.q(v17_1, v18, v19, v20, v1_2, v22, v23);
            String v4_8 = v17_1;
            w6.z v1_4 = v18;
            if (v26 != null) {
                java.util.Iterator v5_4 = v27.iterator();
                while (v5_4.hasNext()) {
                    String v6_7 = ((String) v5_4.next());
                    int v14_1 = ((z6.q) v8_1.put(v6_7, v2_8));
                    if (v14_1 != 0) {
                        z6.v.b(p32, v6_7, v14_1.b, v1_4);
                        throw 0;
                    }
                }
            }
            if (v24) {
                reflect.Field v2_10 = ((z6.q) v9_1.put(v4_8, v2_8));
                if (v2_10 != null) {
                    z6.v.b(p32, v4_8, v2_10.b, v1_4);
                    throw 0;
                }
            }
            v15++;
            v14_2 = 0;
        } else {
            return z6.t.c;
        }
    }

    public final boolean d(reflect.Field p4, boolean p5)
    {
        ClassCastException v4_6;
        y6.e v0 = this.c;
        v0.getClass();
        if (((136 & p4.getModifiers()) == 0) && ((!p4.isSynthetic()) && (!v0.b(p4.getType(), p5)))) {
            ClassCastException v4_3;
            if (!p5) {
                v4_3 = v0.b;
            } else {
                v4_3 = v0.a;
            }
            if (!v4_3.isEmpty()) {
                ClassCastException v4_4 = v4_3.iterator();
                if (v4_4.hasNext()) {
                    throw v1.a.e(v4_4);
                }
            }
            v4_6 = 0;
        } else {
            v4_6 = 1;
        }
        return (v4_6 ^ 1);
    }
}
