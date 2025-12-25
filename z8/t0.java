package z8;
public abstract class t0 {

    public static z8.s a(z8.s0 p27, reflect.Method p28)
    {
        Object[] v2_49 = new z8.o0(p27, p28);
        String v3_14 = v2_49.c;
        int v4_56 = v3_14.length;
        boolean v5_14 = 0;
        boolean v6_21 = 0;
        while(true) {
            reflect.Type v7_2 = "HEAD";
            String v8_10 = 1;
            reflect.Type v9_0 = 0;
            if (v6_21 >= v4_56) {
                if (v2_49.n == null) {
                    Object[] v2_35 = new Object[0];
                    throw z8.z0.m(p28, 0, "HTTP method annotation is required (e.g., @GET, @POST, etc.).", v2_35);
                } else {
                    if (!v2_49.o) {
                        if (v2_49.q) {
                            Object[] v2_47 = new Object[0];
                            throw z8.z0.m(p28, 0, "Multipart can only be specified on HTTP methods with request body (e.g., @POST).", v2_47);
                        } else {
                            if (v2_49.p) {
                                Object[] v2_51 = new Object[0];
                                throw z8.z0.m(p28, 0, "FormUrlEncoded can only be specified on HTTP methods with request body (e.g., @POST).", v2_51);
                            }
                        }
                    }
                    int v4_35 = v2_49.d;
                    boolean v6_14 = v4_35.length;
                    String v8_22 = new z8.z0[v6_14];
                    v2_49.v = v8_22;
                    String v8_2 = (v6_14 - 1);
                    Class v10_17 = 0;
                    while (v10_17 < v6_14) {
                        Class v14_1;
                        int v11_7 = v2_49.v;
                        int v12_4 = v2_49.e[v10_17];
                        int v13_1 = v4_35[v10_17];
                        if (v10_17 != v8_2) {
                            v14_1 = v5_14;
                        } else {
                            v14_1 = 1;
                        }
                        boolean v17;
                        if (v13_1 == 0) {
                            v17 = 0;
                        } else {
                            int v15_2 = v13_1.length;
                            v17 = v9_0;
                            reflect.Type v9_3 = v5_14;
                            while (v9_3 < v15_2) {
                                int v19_0;
                                int v4_7;
                                int v23;
                                int v24_0;
                                reflect.Type v21_0;
                                int v25;
                                int v22_0;
                                boolean v5_15 = v13_1[v9_3];
                                boolean v18_1 = v4_35;
                                int v20_1 = v6_14;
                                if (!(v5_15 instanceof b9.y)) {
                                    v19_0 = v8_2;
                                    String v8_21 = v2_49.a;
                                    if (!(v5_15 instanceof b9.s)) {
                                        boolean v5_1;
                                        v23 = v9_3;
                                        v24_0 = v11_7;
                                        if (!(v5_15 instanceof b9.t)) {
                                            v21_0 = v14_1;
                                            v25 = v15_2;
                                            if (!(v5_15 instanceof b9.v)) {
                                                if (!(v5_15 instanceof b9.u)) {
                                                    boolean v5_29;
                                                    v22_0 = v7_2;
                                                    if (!(v5_15 instanceof b9.i)) {
                                                        if (!(v5_15 instanceof b9.j)) {
                                                            if (!(v5_15 instanceof b9.c)) {
                                                                if (!(v5_15 instanceof b9.d)) {
                                                                    if (!(v5_15 instanceof b9.q)) {
                                                                        if (!(v5_15 instanceof b9.r)) {
                                                                            if (!(v5_15 instanceof b9.a)) {
                                                                                if (!(v5_15 instanceof b9.x)) {
                                                                                    v4_7 = 0;
                                                                                    if (v4_7 != 0) {
                                                                                        if (v17) {
                                                                                            Object[] v2_30 = new Object[0];
                                                                                            throw z8.z0.n(p28, v10_17, "Multiple Retrofit annotations found, only one allowed.", v2_30);
                                                                                        } else {
                                                                                            v17 = v4_7;
                                                                                        }
                                                                                    }
                                                                                    v9_3 = (v23 + 1);
                                                                                    v4_35 = v18_1;
                                                                                    v8_2 = v19_0;
                                                                                    v6_14 = v20_1;
                                                                                    v14_1 = v21_0;
                                                                                    v7_2 = v22_0;
                                                                                    v11_7 = v24_0;
                                                                                    v15_2 = v25;
                                                                                } else {
                                                                                    v2_49.c(v10_17, v12_4);
                                                                                    IllegalArgumentException v0_83 = z8.o0.a(z8.z0.h(v12_4));
                                                                                    int v4_50 = (v10_17 - 1);
                                                                                    while (v4_50 >= 0) {
                                                                                        boolean v5_17 = v2_49.v[v4_50];
                                                                                        if (((v5_17 instanceof z8.j0)) && (((z8.j0) v5_17).d.equals(v0_83))) {
                                                                                            Object[] v2_53 = new StringBuilder("@Tag type ");
                                                                                            v2_53.append(v0_83.getName());
                                                                                            v2_53.append(" is duplicate of ");
                                                                                            v2_53.append(z8.k0.b.c(p28, v4_50));
                                                                                            v2_53.append(" and would always overwrite its value.");
                                                                                            Object[] v2_54 = new Object[0];
                                                                                            throw z8.z0.n(p28, v10_17, v2_53.toString(), v2_54);
                                                                                        } else {
                                                                                            v4_50--;
                                                                                        }
                                                                                    }
                                                                                    v4_7 = new z8.j0(v0_83);
                                                                                }
                                                                            } else {
                                                                                v2_49.c(v10_17, v12_4);
                                                                                if ((v2_49.p) || (v2_49.q)) {
                                                                                    Object[] v2_55 = new Object[0];
                                                                                    throw z8.z0.n(p28, v10_17, "@Body parameters cannot be used with form or multi-part encoding.", v2_55);
                                                                                } else {
                                                                                    if (v2_49.h) {
                                                                                        Object[] v2_56 = new Object[0];
                                                                                        throw z8.z0.n(p28, v10_17, "Multiple @Body method annotations found.", v2_56);
                                                                                    } else {
                                                                                        try {
                                                                                            IllegalArgumentException v0_98 = v8_21.b(v12_4, v13_1, v3_14);
                                                                                            v2_49.h = 1;
                                                                                            v4_7 = new z8.b0(p28, v10_17, v0_98);
                                                                                        } catch (IllegalArgumentException v0_99) {
                                                                                            throw z8.z0.o(p28, v0_99, v10_17, "Unable to create @Body converter for %s", new Object[] {v12_4}));
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        } else {
                                                                            v2_49.c(v10_17, v12_4);
                                                                            if (!v2_49.q) {
                                                                                Object[] v2_58 = new Object[0];
                                                                                throw z8.z0.n(p28, v10_17, "@PartMap parameters can only be used with multipart encoding.", v2_58);
                                                                            } else {
                                                                                v2_49.g = 1;
                                                                                IllegalArgumentException v0_105 = z8.z0.h(v12_4);
                                                                                if (!java.util.Map.isAssignableFrom(v0_105)) {
                                                                                    Object[] v2_59 = new Object[0];
                                                                                    throw z8.z0.n(p28, v10_17, "@PartMap parameter type must be Map.", v2_59);
                                                                                } else {
                                                                                    IllegalArgumentException v0_108 = z8.z0.i(v12_4, v0_105);
                                                                                    if (!(v0_108 instanceof reflect.ParameterizedType)) {
                                                                                        IllegalArgumentException v0_109 = new Object[0];
                                                                                        throw z8.z0.n(p28, v10_17, "Map must include generic types (e.g., Map<String, String>)", v0_109);
                                                                                    } else {
                                                                                        IllegalArgumentException v0_112 = ((reflect.ParameterizedType) v0_108);
                                                                                        reflect.Type v9_13 = z8.z0.g(0, v0_112);
                                                                                        if (String != v9_13) {
                                                                                            IllegalArgumentException v0_114 = new StringBuilder("@PartMap keys must be of type String: ");
                                                                                            v0_114.append(v9_13);
                                                                                            Object[] v2_61 = new Object[0];
                                                                                            throw z8.z0.n(p28, v10_17, v0_114.toString(), v2_61);
                                                                                        } else {
                                                                                            IllegalArgumentException v0_118 = z8.z0.g(1, v0_112);
                                                                                            if (okhttp3.MultipartBody$Part.isAssignableFrom(z8.z0.h(v0_118))) {
                                                                                                Object[] v2_62 = new Object[0];
                                                                                                throw z8.z0.n(p28, v10_17, "@PartMap values cannot be MultipartBody.Part. Use @Part List<Part> or a different value type instead.", v2_62);
                                                                                            } else {
                                                                                                v4_7 = new z8.f0(p28, v10_17, v8_21.b(v0_118, v13_1, v3_14), ((b9.r) v5_15).encoding());
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                        v22_0 = v7_2;
                                                                    } else {
                                                                        v2_49.c(v10_17, v12_4);
                                                                        if (!v2_49.q) {
                                                                            Object[] v2_63 = new Object[0];
                                                                            throw z8.z0.n(p28, v10_17, "@Part parameters can only be used with multipart encoding.", v2_63);
                                                                        } else {
                                                                            boolean v5_23 = ((b9.q) v5_15);
                                                                            v2_49.g = 1;
                                                                            boolean v6_33 = v5_23.value();
                                                                            Class v14_8 = z8.z0.h(v12_4);
                                                                            if (!v6_33.isEmpty()) {
                                                                                IllegalArgumentException v0_135;
                                                                                IllegalArgumentException v0_126 = new String[] {"Content-Disposition", v1.a.l("form-data; name=\"", v6_33, "\""), "Content-Transfer-Encoding", v5_23.encoding()});
                                                                                okhttp3.Headers.b.getClass();
                                                                                IllegalArgumentException v0_127 = okhttp3.Headers$Companion.a(v0_126);
                                                                                if (!Iterable.isAssignableFrom(v14_8)) {
                                                                                    if (!v14_8.isArray()) {
                                                                                        if (okhttp3.MultipartBody$Part.isAssignableFrom(v14_8)) {
                                                                                            IllegalArgumentException v0_129 = new Object[0];
                                                                                            throw z8.z0.n(p28, v10_17, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", v0_129);
                                                                                        } else {
                                                                                            v5_29 = new z8.f0(p28, v10_17, v0_127, v8_21.b(v12_4, v13_1, v3_14));
                                                                                            v4_7 = v5_29;
                                                                                        }
                                                                                    } else {
                                                                                        int v4_62 = z8.o0.a(v14_8.getComponentType());
                                                                                        if (okhttp3.MultipartBody$Part.isAssignableFrom(v4_62)) {
                                                                                            IllegalArgumentException v0_132 = new Object[0];
                                                                                            throw z8.z0.n(p28, v10_17, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", v0_132);
                                                                                        } else {
                                                                                            v0_135 = new z8.a0(new z8.f0(p28, v10_17, v0_127, v8_21.b(v4_62, v13_1, v3_14)), 1);
                                                                                        }
                                                                                    }
                                                                                } else {
                                                                                    if (!(v12_4 instanceof reflect.ParameterizedType)) {
                                                                                        IllegalArgumentException v0_137 = new StringBuilder();
                                                                                        v0_137.append(v14_8.getSimpleName());
                                                                                        v0_137.append(" must include generic type (e.g., ");
                                                                                        v0_137.append(v14_8.getSimpleName());
                                                                                        v0_137.append("<String>)");
                                                                                        Object[] v2_67 = new Object[0];
                                                                                        throw z8.z0.n(p28, v10_17, v0_137.toString(), v2_67);
                                                                                    } else {
                                                                                        int v4_66 = z8.z0.g(0, ((reflect.ParameterizedType) v12_4));
                                                                                        if (okhttp3.MultipartBody$Part.isAssignableFrom(z8.z0.h(v4_66))) {
                                                                                            IllegalArgumentException v0_140 = new Object[0];
                                                                                            throw z8.z0.n(p28, v10_17, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", v0_140);
                                                                                        } else {
                                                                                            v0_135 = new z8.a0(new z8.f0(p28, v10_17, v0_127, v8_21.b(v4_66, v13_1, v3_14)), 0);
                                                                                        }
                                                                                    }
                                                                                }
                                                                                v4_7 = v0_135;
                                                                            } else {
                                                                                boolean v6_36 = z8.i0.d;
                                                                                if (!Iterable.isAssignableFrom(v14_8)) {
                                                                                    if (!v14_8.isArray()) {
                                                                                        if (!okhttp3.MultipartBody$Part.isAssignableFrom(v14_8)) {
                                                                                            IllegalArgumentException v0_143 = new Object[0];
                                                                                            throw z8.z0.n(p28, v10_17, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", v0_143);
                                                                                        } else {
                                                                                            v4_7 = v6_36;
                                                                                        }
                                                                                    } else {
                                                                                        if (!okhttp3.MultipartBody$Part.isAssignableFrom(v14_8.getComponentType())) {
                                                                                            IllegalArgumentException v0_145 = new Object[0];
                                                                                            throw z8.z0.n(p28, v10_17, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", v0_145);
                                                                                        } else {
                                                                                            v4_7 = new z8.a0(v6_36, 1);
                                                                                        }
                                                                                    }
                                                                                } else {
                                                                                    if (!(v12_4 instanceof reflect.ParameterizedType)) {
                                                                                        IllegalArgumentException v0_149 = new StringBuilder();
                                                                                        v0_149.append(v14_8.getSimpleName());
                                                                                        v0_149.append(" must include generic type (e.g., ");
                                                                                        v0_149.append(v14_8.getSimpleName());
                                                                                        v0_149.append("<String>)");
                                                                                        Object[] v2_70 = new Object[0];
                                                                                        throw z8.z0.n(p28, v10_17, v0_149.toString(), v2_70);
                                                                                    } else {
                                                                                        if (!okhttp3.MultipartBody$Part.isAssignableFrom(z8.z0.h(z8.z0.g(0, ((reflect.ParameterizedType) v12_4))))) {
                                                                                            IllegalArgumentException v0_152 = new Object[0];
                                                                                            throw z8.z0.n(p28, v10_17, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", v0_152);
                                                                                        } else {
                                                                                            v4_7 = new z8.a0(v6_36, 0);
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                } else {
                                                                    v2_49.c(v10_17, v12_4);
                                                                    if (!v2_49.p) {
                                                                        Object[] v2_72 = new Object[0];
                                                                        throw z8.z0.n(p28, v10_17, "@FieldMap parameters can only be used with form encoding.", v2_72);
                                                                    } else {
                                                                        int v4_80 = z8.z0.h(v12_4);
                                                                        if (!java.util.Map.isAssignableFrom(v4_80)) {
                                                                            Object[] v2_73 = new Object[0];
                                                                            throw z8.z0.n(p28, v10_17, "@FieldMap parameter type must be Map.", v2_73);
                                                                        } else {
                                                                            int v4_81 = z8.z0.i(v12_4, v4_80);
                                                                            if (!(v4_81 instanceof reflect.ParameterizedType)) {
                                                                                IllegalArgumentException v0_159 = new Object[0];
                                                                                throw z8.z0.n(p28, v10_17, "Map must include generic types (e.g., Map<String, String>)", v0_159);
                                                                            } else {
                                                                                int v4_82 = ((reflect.ParameterizedType) v4_81);
                                                                                reflect.Type v7_37 = z8.z0.g(0, v4_82);
                                                                                if (String != v7_37) {
                                                                                    IllegalArgumentException v0_162 = new StringBuilder("@FieldMap keys must be of type String: ");
                                                                                    v0_162.append(v7_37);
                                                                                    Object[] v2_75 = new Object[0];
                                                                                    throw z8.z0.n(p28, v10_17, v0_162.toString(), v2_75);
                                                                                } else {
                                                                                    v8_21.d(z8.z0.g(1, v4_82), v13_1);
                                                                                    v2_49.f = 1;
                                                                                    v4_7 = new z8.d0(p28, v10_17, ((b9.d) v5_15).encoded(), 0);
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            } else {
                                                                v2_49.c(v10_17, v12_4);
                                                                if (!v2_49.p) {
                                                                    Object[] v2_76 = new Object[0];
                                                                    throw z8.z0.n(p28, v10_17, "@Field parameters can only be used with form encoding.", v2_76);
                                                                } else {
                                                                    boolean v5_42 = ((b9.c) v5_15);
                                                                    boolean v6_38 = v5_42.value();
                                                                    boolean v5_43 = v5_42.encoded();
                                                                    v2_49.f = 1;
                                                                    reflect.Type v7_38 = z8.z0.h(v12_4);
                                                                    if (!Iterable.isAssignableFrom(v7_38)) {
                                                                        if (!v7_38.isArray()) {
                                                                            v8_21.d(v12_4, v13_1);
                                                                            v4_7 = new z8.c0(v6_38, 0, v5_43);
                                                                        } else {
                                                                            v8_21.d(z8.o0.a(v7_38.getComponentType()), v13_1);
                                                                            v5_29 = new z8.a0(new z8.c0(v6_38, 0, v5_43), 1);
                                                                        }
                                                                    } else {
                                                                        if (!(v12_4 instanceof reflect.ParameterizedType)) {
                                                                            IllegalArgumentException v0_170 = new StringBuilder();
                                                                            v0_170.append(v7_38.getSimpleName());
                                                                            v0_170.append(" must include generic type (e.g., ");
                                                                            v0_170.append(v7_38.getSimpleName());
                                                                            v0_170.append("<String>)");
                                                                            Object[] v2_80 = new Object[0];
                                                                            throw z8.z0.n(p28, v10_17, v0_170.toString(), v2_80);
                                                                        } else {
                                                                            v8_21.d(z8.z0.g(0, ((reflect.ParameterizedType) v12_4)), v13_1);
                                                                            v5_29 = new z8.a0(new z8.c0(v6_38, 0, v5_43), 0);
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        } else {
                                                            if (v12_4 != okhttp3.Headers) {
                                                                v2_49.c(v10_17, v12_4);
                                                                int v4_97 = z8.z0.h(v12_4);
                                                                if (!java.util.Map.isAssignableFrom(v4_97)) {
                                                                    Object[] v2_81 = new Object[0];
                                                                    throw z8.z0.n(p28, v10_17, "@HeaderMap parameter type must be Map or Headers.", v2_81);
                                                                } else {
                                                                    int v4_98 = z8.z0.i(v12_4, v4_97);
                                                                    if (!(v4_98 instanceof reflect.ParameterizedType)) {
                                                                        IllegalArgumentException v0_177 = new Object[0];
                                                                        throw z8.z0.n(p28, v10_17, "Map must include generic types (e.g., Map<String, String>)", v0_177);
                                                                    } else {
                                                                        int v4_99 = ((reflect.ParameterizedType) v4_98);
                                                                        reflect.Type v7_41 = z8.z0.g(0, v4_99);
                                                                        if (String != v7_41) {
                                                                            IllegalArgumentException v0_180 = new StringBuilder("@HeaderMap keys must be of type String: ");
                                                                            v0_180.append(v7_41);
                                                                            Object[] v2_83 = new Object[0];
                                                                            throw z8.z0.n(p28, v10_17, v0_180.toString(), v2_83);
                                                                        } else {
                                                                            v8_21.d(z8.z0.g(1, v4_99), v13_1);
                                                                            v4_7 = new z8.d0(p28, v10_17, ((b9.j) v5_15).allowUnsafeNonAsciiValues(), 1);
                                                                        }
                                                                    }
                                                                }
                                                            } else {
                                                                v4_7 = new z8.e0(p28, v10_17, 0);
                                                            }
                                                        }
                                                    } else {
                                                        v2_49.c(v10_17, v12_4);
                                                        boolean v5_48 = ((b9.i) v5_15);
                                                        boolean v6_39 = v5_48.value();
                                                        reflect.Type v7_42 = z8.z0.h(v12_4);
                                                        if (!Iterable.isAssignableFrom(v7_42)) {
                                                            if (!v7_42.isArray()) {
                                                                v8_21.d(v12_4, v13_1);
                                                                v4_7 = new z8.c0(v6_39, 1, v5_48.allowUnsafeNonAsciiValues());
                                                            } else {
                                                                v8_21.d(z8.o0.a(v7_42.getComponentType()), v13_1);
                                                                v5_29 = new z8.a0(new z8.c0(v6_39, 1, v5_48.allowUnsafeNonAsciiValues()), 1);
                                                            }
                                                        } else {
                                                            if (!(v12_4 instanceof reflect.ParameterizedType)) {
                                                                IllegalArgumentException v0_186 = new StringBuilder();
                                                                v0_186.append(v7_42.getSimpleName());
                                                                v0_186.append(" must include generic type (e.g., ");
                                                                v0_186.append(v7_42.getSimpleName());
                                                                v0_186.append("<String>)");
                                                                Object[] v2_87 = new Object[0];
                                                                throw z8.z0.n(p28, v10_17, v0_186.toString(), v2_87);
                                                            } else {
                                                                v8_21.d(z8.z0.g(0, ((reflect.ParameterizedType) v12_4)), v13_1);
                                                                v5_29 = new z8.a0(new z8.c0(v6_39, 1, v5_48.allowUnsafeNonAsciiValues()), 0);
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    v2_49.c(v10_17, v12_4);
                                                    int v4_114 = z8.z0.h(v12_4);
                                                    v2_49.l = 1;
                                                    if (!java.util.Map.isAssignableFrom(v4_114)) {
                                                        Object[] v2_89 = new Object[0];
                                                        throw z8.z0.n(p28, v10_17, "@QueryMap parameter type must be Map.", v2_89);
                                                    } else {
                                                        int v4_115 = z8.z0.i(v12_4, v4_114);
                                                        if (!(v4_115 instanceof reflect.ParameterizedType)) {
                                                            IllegalArgumentException v0_194 = new Object[0];
                                                            throw z8.z0.n(p28, v10_17, "Map must include generic types (e.g., Map<String, String>)", v0_194);
                                                        } else {
                                                            int v4_116 = ((reflect.ParameterizedType) v4_115);
                                                            Class v14_9 = z8.z0.g(0, v4_116);
                                                            if (String != v14_9) {
                                                                IllegalArgumentException v0_197 = new StringBuilder("@QueryMap keys must be of type String: ");
                                                                v0_197.append(v14_9);
                                                                Object[] v2_94 = new Object[0];
                                                                throw z8.z0.n(p28, v10_17, v0_197.toString(), v2_94);
                                                            } else {
                                                                v8_21.d(z8.z0.g(1, v4_116), v13_1);
                                                                v4_7 = new z8.d0(p28, v10_17, ((b9.u) v5_15).encoded(), 2);
                                                            }
                                                        }
                                                    }
                                                }
                                            } else {
                                                v2_49.c(v10_17, v12_4);
                                                boolean v5_57 = ((b9.v) v5_15).encoded();
                                                boolean v6_40 = z8.z0.h(v12_4);
                                                v2_49.k = 1;
                                                if (!Iterable.isAssignableFrom(v6_40)) {
                                                    if (!v6_40.isArray()) {
                                                        v8_21.d(v12_4, v13_1);
                                                        v4_7 = new z8.h0(v5_57);
                                                    } else {
                                                        v8_21.d(z8.o0.a(v6_40.getComponentType()), v13_1);
                                                        v5_1 = new z8.a0(new z8.h0(v5_57), 1);
                                                        v4_7 = v5_1;
                                                    }
                                                } else {
                                                    if (!(v12_4 instanceof reflect.ParameterizedType)) {
                                                        IllegalArgumentException v0_202 = new StringBuilder();
                                                        v0_202.append(v6_40.getSimpleName());
                                                        v0_202.append(" must include generic type (e.g., ");
                                                        v0_202.append(v6_40.getSimpleName());
                                                        v0_202.append("<String>)");
                                                        Object[] v2_1 = new Object[0];
                                                        throw z8.z0.n(p28, v10_17, v0_202.toString(), v2_1);
                                                    } else {
                                                        v8_21.d(z8.z0.g(0, ((reflect.ParameterizedType) v12_4)), v13_1);
                                                        v5_1 = new z8.a0(new z8.h0(v5_57), 0);
                                                    }
                                                }
                                            }
                                        } else {
                                            v2_49.c(v10_17, v12_4);
                                            boolean v5_2 = ((b9.t) v5_15);
                                            boolean v6_0 = v5_2.value();
                                            boolean v5_3 = v5_2.encoded();
                                            v21_0 = v14_1;
                                            Class v14_0 = z8.z0.h(v12_4);
                                            v25 = v15_2;
                                            v2_49.j = 1;
                                            if (!Iterable.isAssignableFrom(v14_0)) {
                                                if (!v14_0.isArray()) {
                                                    v8_21.d(v12_4, v13_1);
                                                    v4_7 = new z8.c0(v6_0, 2, v5_3);
                                                } else {
                                                    v8_21.d(z8.o0.a(v14_0.getComponentType()), v13_1);
                                                    v5_1 = new z8.a0(new z8.c0(v6_0, 2, v5_3), 1);
                                                }
                                            } else {
                                                if (!(v12_4 instanceof reflect.ParameterizedType)) {
                                                    IllegalArgumentException v0_5 = new StringBuilder();
                                                    v0_5.append(v14_0.getSimpleName());
                                                    v0_5.append(" must include generic type (e.g., ");
                                                    v0_5.append(v14_0.getSimpleName());
                                                    v0_5.append("<String>)");
                                                    Object[] v2_5 = new Object[0];
                                                    throw z8.z0.n(p28, v10_17, v0_5.toString(), v2_5);
                                                } else {
                                                    v8_21.d(z8.z0.g(0, ((reflect.ParameterizedType) v12_4)), v13_1);
                                                    v5_1 = new z8.a0(new z8.c0(v6_0, 2, v5_3), 0);
                                                }
                                            }
                                        }
                                    } else {
                                        v2_49.c(v10_17, v12_4);
                                        if (v2_49.j) {
                                            Object[] v2_7 = new Object[0];
                                            throw z8.z0.n(p28, v10_17, "A @Path parameter must not come after a @Query.", v2_7);
                                        } else {
                                            if (v2_49.k) {
                                                Object[] v2_10 = new Object[0];
                                                throw z8.z0.n(p28, v10_17, "A @Path parameter must not come after a @QueryName.", v2_10);
                                            } else {
                                                if (v2_49.l) {
                                                    Object[] v2_12 = new Object[0];
                                                    throw z8.z0.n(p28, v10_17, "A @Path parameter must not come after a @QueryMap.", v2_12);
                                                } else {
                                                    if (v2_49.m) {
                                                        IllegalArgumentException v0_15 = new Object[0];
                                                        throw z8.z0.n(p28, v10_17, "@Path parameters may not be used with @Url.", v0_15);
                                                    } else {
                                                        if (v2_49.r == null) {
                                                            throw z8.z0.n(p28, v10_17, "@Path can only be used with relative url on @%s", new Object[] {v2_49.n}));
                                                        } else {
                                                            v2_49.i = 1;
                                                            boolean v5_6 = ((b9.s) v5_15);
                                                            int v4_19 = v5_6.value();
                                                            if (!z8.o0.y.matcher(v4_19).matches()) {
                                                                throw z8.z0.n(p28, v10_17, "@Path parameter name must match %s. Found: %s", new Object[] {z8.o0.x.pattern(), v4_19}));
                                                            } else {
                                                                if (!v2_49.u.contains(v4_19)) {
                                                                    throw z8.z0.n(p28, v10_17, "URL \"%s\" does not contain \"{%s}\".", new Object[] {v2_49.r, v4_19}));
                                                                } else {
                                                                    v8_21.d(v12_4, v13_1);
                                                                    v4_7 = new z8.g0(v2_49.b, v10_17, v4_19, v5_6.encoded());
                                                                    v22_0 = v7_2;
                                                                    v23 = v9_3;
                                                                    v24_0 = v11_7;
                                                                    v21_0 = v14_1;
                                                                    v25 = v15_2;
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    v2_49.c(v10_17, v12_4);
                                    if (v2_49.m) {
                                        Object[] v2_19 = new Object[0];
                                        throw z8.z0.n(p28, v10_17, "Multiple @Url method annotations found.", v2_19);
                                    } else {
                                        if (v2_49.i) {
                                            IllegalArgumentException v0_30 = new Object[0];
                                            throw z8.z0.n(p28, v10_17, "@Path parameters may not be used with @Url.", v0_30);
                                        } else {
                                            if (v2_49.j) {
                                                Object[] v2_22 = new Object[0];
                                                throw z8.z0.n(p28, v10_17, "A @Url parameter must not come after a @Query.", v2_22);
                                            } else {
                                                if (v2_49.k) {
                                                    Object[] v2_24 = new Object[0];
                                                    throw z8.z0.n(p28, v10_17, "A @Url parameter must not come after a @QueryName.", v2_24);
                                                } else {
                                                    if (v2_49.l) {
                                                        Object[] v2_26 = new Object[0];
                                                        throw z8.z0.n(p28, v10_17, "A @Url parameter must not come after a @QueryMap.", v2_26);
                                                    } else {
                                                        if (v2_49.r != null) {
                                                            throw z8.z0.n(p28, v10_17, "@Url cannot be used with @%s URL", new Object[] {v2_49.n}));
                                                        } else {
                                                            v2_49.m = 1;
                                                            if ((v12_4 != okhttp3.HttpUrl) && ((v12_4 != String) && ((v12_4 != java.net.URI) && ((!(v12_4 instanceof Class)) || (!"android.net.Uri".equals(((Class) v12_4).getName())))))) {
                                                                Object[] v2_29 = new Object[0];
                                                                throw z8.z0.n(p28, v10_17, "@Url must be okhttp3.HttpUrl, String, java.net.URI, or android.net.Uri type.", v2_29);
                                                            } else {
                                                                v4_7 = new z8.e0(p28, v10_17, 1);
                                                                v22_0 = v7_2;
                                                                v19_0 = v8_2;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        boolean v18_0 = v4_35;
                        int v20_0 = v6_14;
                        int v22_1 = v7_2;
                        int v19_1 = v8_2;
                        int v24_1 = v11_7;
                        if (!v17) {
                            try {
                                if ((v14_1 == null) || (z8.z0.h(v12_4) != l7.c)) {
                                    Object[] v2_50 = new Object[0];
                                    throw z8.z0.n(p28, v10_17, "No Retrofit annotation found.", v2_50);
                                } else {
                                    v2_49.w = 1;
                                    v17 = 0;
                                }
                            } catch (NoClassDefFoundError) {
                            }
                        }
                        v24_1[v10_17] = v17;
                        v10_17++;
                        v4_35 = v18_0;
                        v8_2 = v19_1;
                        v6_14 = v20_0;
                        v7_2 = v22_1;
                        v5_14 = 0;
                        v9_0 = 0;
                    }
                    int v22_2 = v7_2;
                    if ((v2_49.r == null) && (!v2_49.m)) {
                        throw z8.z0.m(p28, 0, "Missing either @%s URL or @Url parameter.", new Object[] {v2_49.n}));
                    } else {
                        IllegalArgumentException v0_131 = v2_49.p;
                        if ((v0_131 == null) && ((!v2_49.q) && ((!v2_49.o) && (v2_49.h)))) {
                            Object[] v2_71 = new Object[0];
                            throw z8.z0.m(p28, 0, "Non-body HTTP method cannot contain @Body.", v2_71);
                        } else {
                            if ((v0_131 != null) && (!v2_49.f)) {
                                Object[] v2_77 = new Object[0];
                                throw z8.z0.m(p28, 0, "Form-encoded method must contain at least one @Field.", v2_77);
                            } else {
                                if ((v2_49.q) && (!v2_49.g)) {
                                    Object[] v2_84 = new Object[0];
                                    throw z8.z0.m(p28, 0, "Multipart method must contain at least one @Part.", v2_84);
                                } else {
                                    IllegalArgumentException v0_191 = new z8.p0(v2_49);
                                    Object[] v2_91 = p28.getGenericReturnType();
                                    if (z8.z0.j(v2_91)) {
                                        throw z8.z0.m(p28, 0, "Method return type must not include a type variable or wildcard: %s", new Object[] {v2_91}));
                                    } else {
                                        if (v2_91 == Void.TYPE) {
                                            Object[] v2_9 = new Object[0];
                                            throw z8.z0.m(p28, 0, "Service methods cannot return void.", v2_9);
                                        } else {
                                            boolean v6_12;
                                            reflect.Type v7_0;
                                            Class v10_0;
                                            Object[] v2_16 = p28.getAnnotations();
                                            boolean v5_10 = v0_191.k;
                                            if (!v5_10) {
                                                v10_0 = p28.getGenericReturnType();
                                                v6_12 = 0;
                                                v7_0 = 0;
                                            } else {
                                                boolean v6_13 = p28.getGenericParameterTypes();
                                                boolean v6_18 = ((reflect.ParameterizedType) v6_13[(v6_13.length - 1)]).getActualTypeArguments()[0];
                                                if ((v6_18 instanceof reflect.WildcardType)) {
                                                    v6_18 = ((reflect.WildcardType) v6_18).getLowerBounds()[0];
                                                }
                                                if ((z8.z0.h(v6_18) != z8.q0) || (!(v6_18 instanceof reflect.ParameterizedType))) {
                                                    if (z8.z0.h(v6_18) == z8.d) {
                                                        throw z8.z0.m(p28, 0, "Suspend functions should not return Call, as they already execute asynchronously.\nChange its return type to %s", new Object[] {z8.z0.g(0, ((reflect.ParameterizedType) v6_18))}));
                                                    } else {
                                                        if ((!z8.z0.b) || (v6_18 != h7.l)) {
                                                            reflect.Type v7_28 = 0;
                                                        } else {
                                                            v7_28 = 1;
                                                        }
                                                        reflect.Type v9_8 = v7_28;
                                                        v7_0 = 0;
                                                    }
                                                } else {
                                                    v6_18 = z8.z0.g(0, ((reflect.ParameterizedType) v6_18));
                                                    v7_0 = 1;
                                                    v9_8 = 0;
                                                }
                                                int v11_16 = new reflect.Type[1];
                                                v11_16[0] = v6_18;
                                                v10_0 = new z8.x0(0, z8.d, v11_16);
                                                if (!z8.z0.l(v2_16, z8.u0)) {
                                                    boolean v6_29 = new otation.Annotation[(v2_16.length + 1)];
                                                    v6_29[0] = z8.v0.a;
                                                    System.arraycopy(v2_16, 0, v6_29, 1, v2_16.length);
                                                    v2_16 = v6_29;
                                                }
                                                v6_12 = v9_8;
                                            }
                                            try {
                                                Object[] v2_36 = p27.a(v10_0, v2_16);
                                                reflect.Type v9_9 = v2_36.c();
                                            } catch (IllegalArgumentException v0_60) {
                                                throw z8.z0.m(p28, v0_60, "Unable to create call adapter for %s", new Object[] {okhttp3.Response}));
                                            }
                                            if (v9_9 == okhttp3.Response) {
                                                IllegalArgumentException v0_63 = new StringBuilder("\'");
                                                v0_63.append(z8.z0.h(v9_9).getName());
                                                v0_63.append("\' is not a valid response body type. Did you mean ResponseBody?");
                                                Object[] v2_43 = new Object[0];
                                                throw z8.z0.m(p28, 0, v0_63.toString(), v2_43);
                                            } else {
                                                if (v9_9 == z8.q0) {
                                                    Object[] v2_44 = new Object[0];
                                                    throw z8.z0.m(p28, 0, "Response must include generic type (e.g., Response<String>)", v2_44);
                                                } else {
                                                    if ((v0_191.c.equals(v22_2)) && ((!Void.equals(v9_9)) && ((!z8.z0.b) || (v9_9 != h7.l)))) {
                                                        Object[] v2_45 = new Object[0];
                                                        throw z8.z0.m(p28, 0, "HEAD method must use Void or Unit as response type.", v2_45);
                                                    } else {
                                                        try {
                                                            int v4_43 = p27.c(v9_9, p28.getAnnotations());
                                                            String v3_11 = p27.b;
                                                        } catch (IllegalArgumentException v0_71) {
                                                            throw z8.z0.m(p28, v0_71, "Unable to create converter for %s", new Object[] {v9_9}));
                                                        }
                                                        if (v5_10) {
                                                            if (v7_0 == null) {
                                                                return new z8.q(v0_191, v3_11, v4_43, v2_36, v6_12);
                                                            } else {
                                                                return new z8.r(v0_191, v3_11, v4_43, v2_36);
                                                            }
                                                        } else {
                                                            return new z8.p(v0_191, v3_11, v4_43, v2_36);
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            } else {
                Class v10_1 = v3_14[v6_21];
                if (!(v10_1 instanceof b9.b)) {
                    if (!(v10_1 instanceof b9.f)) {
                        if (!(v10_1 instanceof b9.g)) {
                            if (!(v10_1 instanceof b9.n)) {
                                if (!(v10_1 instanceof b9.o)) {
                                    if (!(v10_1 instanceof b9.p)) {
                                        if (!(v10_1 instanceof b9.m)) {
                                            if (!(v10_1 instanceof b9.h)) {
                                                if (!(v10_1 instanceof b9.k)) {
                                                    if (!(v10_1 instanceof b9.l)) {
                                                        if ((v10_1 instanceof b9.e)) {
                                                            if (v2_49.q) {
                                                                IllegalArgumentException v0_45 = new Object[0];
                                                                throw z8.z0.m(p28, 0, "Only one encoding annotation is allowed.", v0_45);
                                                            } else {
                                                                v2_49.p = 1;
                                                            }
                                                        }
                                                    } else {
                                                        if (v2_49.p) {
                                                            IllegalArgumentException v0_47 = new Object[0];
                                                            throw z8.z0.m(p28, 0, "Only one encoding annotation is allowed.", v0_47);
                                                        } else {
                                                            v2_49.q = 1;
                                                        }
                                                    }
                                                } else {
                                                    Class v10_4 = ((b9.k) v10_1);
                                                    reflect.Type v7_14 = v10_4.value();
                                                    if (v7_14.length == 0) {
                                                        break;
                                                    }
                                                    Class v10_5 = v10_4.allowUnsafeNonAsciiValues();
                                                    int v11_13 = new okhttp3.Headers$Builder();
                                                    int v12_0 = v7_14.length;
                                                    int v13_0 = 0;
                                                    while (v13_0 < v12_0) {
                                                        Class v14_2 = v7_14[v13_0];
                                                        int v15_4 = v14_2.indexOf(58);
                                                        int v16_1 = v8_10;
                                                        if ((v15_4 == -1) || ((v15_4 == 0) || (v15_4 == (v14_2.length() - 1)))) {
                                                            throw z8.z0.m(p28, 0, "@Headers value must be in the form \"Name: Value\". Found: \"%s\"", new Object[] {v14_2}));
                                                        } else {
                                                            String v8_7 = v14_2.substring(0, v15_4);
                                                            Class v14_4 = v14_2.substring((v15_4 + 1)).trim();
                                                            if (!"Content-Type".equalsIgnoreCase(v8_7)) {
                                                                if (v10_5 == null) {
                                                                    v11_13.a(v8_7, v14_4);
                                                                } else {
                                                                    kotlin.jvm.internal.j.e(v8_7, "name");
                                                                    kotlin.jvm.internal.j.e(v14_4, "value");
                                                                    okhttp3.internal._HeadersCommonKt.b(v8_7);
                                                                    v11_13.b(v8_7, v14_4);
                                                                }
                                                            } else {
                                                                try {
                                                                    okhttp3.MediaType.e.getClass();
                                                                    v2_49.t = okhttp3.MediaType$Companion.a(v14_4);
                                                                } catch (IllegalArgumentException v0_53) {
                                                                    throw z8.z0.m(p28, v0_53, "Malformed content type: %s", new Object[] {v14_4}));
                                                                }
                                                            }
                                                            v13_0++;
                                                            v8_10 = v16_1;
                                                        }
                                                    }
                                                    v2_49.s = v11_13.c();
                                                }
                                            } else {
                                                Class v10_6 = ((b9.h) v10_1);
                                                v2_49.b(v10_6.method(), v10_6.path(), v10_6.hasBody());
                                            }
                                        } else {
                                            v2_49.b("OPTIONS", ((b9.m) v10_1).value(), 0);
                                        }
                                    } else {
                                        v2_49.b("PUT", ((b9.p) v10_1).value(), 1);
                                    }
                                } else {
                                    v2_49.b("POST", ((b9.o) v10_1).value(), 1);
                                }
                            } else {
                                v2_49.b("PATCH", ((b9.n) v10_1).value(), 1);
                            }
                        } else {
                            v2_49.b("HEAD", ((b9.g) v10_1).value(), 0);
                        }
                    } else {
                        v2_49.b("GET", ((b9.f) v10_1).value(), 0);
                    }
                } else {
                    v2_49.b("DELETE", ((b9.b) v10_1).value(), 0);
                }
                v6_21++;
            }
        }
        Object[] v2_31 = new Object[0];
        throw z8.z0.m(p28, 0, "@Headers annotation is empty.", v2_31);
    }
}
