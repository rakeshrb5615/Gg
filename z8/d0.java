package z8;
public final class d0 extends z8.z0 {
    public final synthetic int d;
    public final reflect.Method e;
    public final int f;
    public final boolean g;

    public synthetic d0(reflect.Method p1, int p2, boolean p3, int p4)
    {
        this.d = p4;
        this.e = p1;
        this.f = p2;
        this.g = p3;
        return;
    }

    public final void a(z8.n0 p8, Object p9)
    {
        switch (this.d) {
            case 0:
                int v1_2 = this.f;
                reflect.Method v2_2 = this.e;
                if (((java.util.Map) p9) == null) {
                    Object[] v9_22 = new Object[0];
                    throw z8.z0.n(v2_2, v1_2, "Field map was null.", v9_22);
                } else {
                    Object[] v9_24 = ((java.util.Map) p9).entrySet().iterator();
                    while (v9_24.hasNext()) {
                        boolean v3_13 = ((java.util.Map$Entry) v9_24.next());
                        String v4_5 = ((String) v3_13.getKey());
                        if (v4_5 == null) {
                            Object[] v9_25 = new Object[0];
                            throw z8.z0.n(v2_2, v1_2, "Field map contained null key.", v9_25);
                        } else {
                            boolean v3_14 = v3_13.getValue();
                            if (!v3_14) {
                                Object[] v9_27 = new Object[0];
                                throw z8.z0.n(v2_2, v1_2, v1.a.l("Field map contained null value for key \'", v4_5, "\'."), v9_27);
                            } else {
                                String v6_1 = v3_14.toString();
                                if (v6_1 == null) {
                                    IllegalArgumentException v8_29 = new StringBuilder("Field map value \'");
                                    v8_29.append(v3_14);
                                    v8_29.append("\' converted to null by ");
                                    v8_29.append(z8.a.getName());
                                    v8_29.append(" for key \'");
                                    v8_29.append(v4_5);
                                    v8_29.append("\'.");
                                    Object[] v9_2 = new Object[0];
                                    throw z8.z0.n(v2_2, v1_2, v8_29.toString(), v9_2);
                                } else {
                                    p8.a(v4_5, v6_1, this.g);
                                }
                            }
                        }
                    }
                    return;
                }
            case 1:
                int v1_1 = this.f;
                reflect.Method v2_1 = this.e;
                if (((java.util.Map) p9) == null) {
                    Object[] v9_26 = new Object[0];
                    throw z8.z0.n(v2_1, v1_1, "Header map was null.", v9_26);
                } else {
                    Object[] v9_9 = ((java.util.Map) p9).entrySet().iterator();
                    while (v9_9.hasNext()) {
                        boolean v3_8 = ((java.util.Map$Entry) v9_9.next());
                        String v4_3 = ((String) v3_8.getKey());
                        if (v4_3 == null) {
                            Object[] v9_18 = new Object[0];
                            throw z8.z0.n(v2_1, v1_1, "Header map contained null key.", v9_18);
                        } else {
                            boolean v3_9 = v3_8.getValue();
                            if (!v3_9) {
                                Object[] v9_20 = new Object[0];
                                throw z8.z0.n(v2_1, v1_1, v1.a.l("Header map contained null value for key \'", v4_3, "\'."), v9_20);
                            } else {
                                p8.b(v4_3, v3_9.toString(), this.g);
                            }
                        }
                    }
                    return;
                }
            default:
                int v1_0 = this.f;
                reflect.Method v2_0 = this.e;
                if (((java.util.Map) p9) == null) {
                    Object[] v9_4 = new Object[0];
                    throw z8.z0.n(v2_0, v1_0, "Query map was null", v9_4);
                } else {
                    Object[] v9_6 = ((java.util.Map) p9).entrySet().iterator();
                    while (v9_6.hasNext()) {
                        boolean v3_3 = ((java.util.Map$Entry) v9_6.next());
                        String v4_1 = ((String) v3_3.getKey());
                        if (v4_1 == null) {
                            Object[] v9_8 = new Object[0];
                            throw z8.z0.n(v2_0, v1_0, "Query map contained null key.", v9_8);
                        } else {
                            boolean v3_4 = v3_3.getValue();
                            if (!v3_4) {
                                Object[] v9_10 = new Object[0];
                                throw z8.z0.n(v2_0, v1_0, v1.a.l("Query map contained null value for key \'", v4_1, "\'."), v9_10);
                            } else {
                                String v6_0 = v3_4.toString();
                                if (v6_0 == null) {
                                    IllegalArgumentException v8_12 = new StringBuilder("Query map value \'");
                                    v8_12.append(v3_4);
                                    v8_12.append("\' converted to null by ");
                                    v8_12.append(z8.a.getName());
                                    v8_12.append(" for key \'");
                                    v8_12.append(v4_1);
                                    v8_12.append("\'.");
                                    Object[] v9_16 = new Object[0];
                                    throw z8.z0.n(v2_0, v1_0, v8_12.toString(), v9_16);
                                } else {
                                    p8.d(v4_1, v6_0, this.g);
                                }
                            }
                        }
                    }
                    return;
                }
        }
    }
}
