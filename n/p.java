package n;
public final class p {
    public int a;
    public final Object b;
    public final Object c;
    public Object d;
    public Object e;
    public Object f;

    public p(android.view.View p2)
    {
        this.a = -1;
        this.b = p2;
        this.c = n.u.a();
        return;
    }

    public p(t8.b p2, u8.k p3, a2.d p4, q8.d p5)
    {
        u8.f v2_3;
        kotlin.jvm.internal.j.e(p5, "descriptor");
        this.b = p2;
        this.c = p3;
        this.d = p4;
        this.a = -1;
        u8.f v2_4 = p2.a;
        this.e = v2_4;
        if (!v2_4.a) {
            v2_3 = new u8.f(p5);
        } else {
            v2_3 = 0;
        }
        this.f = v2_3;
        return;
    }

    public void a()
    {
        int[] v0_1 = ((android.view.View) this.b);
        android.graphics.drawable.Drawable v1 = v0_1.getBackground();
        if (v1 != null) {
            if (((n.v2) this.d) != null) {
                if (((n.v2) this.f) == null) {
                    this.f = new n.v2();
                }
                n.v2 v2_3 = ((n.v2) this.f);
                v2_3.a = 0;
                v2_3.d = 0;
                v2_3.b = 0;
                v2_3.c = 0;
                boolean v3_1 = q0.i0.c(v0_1);
                if (v3_1) {
                    v2_3.d = 1;
                    v2_3.a = v3_1;
                }
                boolean v3_2 = q0.i0.d(v0_1);
                if (v3_2) {
                    v2_3.c = 1;
                    v2_3.b = v3_2;
                }
                if ((v2_3.d) || (v2_3.c)) {
                    n.u.e(v1, v2_3, v0_1.getDrawableState());
                    return;
                }
            }
            n.v2 v2_5 = ((n.v2) this.e);
            if (v2_5 == null) {
                n.v2 v2_7 = ((n.v2) this.d);
                if (v2_7 != null) {
                    n.u.e(v1, v2_7, v0_1.getDrawableState());
                }
            } else {
                n.u.e(v1, v2_5, v0_1.getDrawableState());
                return;
            }
        }
        return;
    }

    public n.p b(q8.d p10)
    {
        kotlin.jvm.internal.j.e(p10, "descriptor");
        int v0_2 = ((t8.b) this.b);
        String v1_0 = u8.g.f(p10, v0_2);
        a2.d v2_1 = ((a2.d) this.d);
        n.p v3_16 = ((g0.d) v2_1.c);
        int v4_1 = (v3_16.b + 1);
        v3_16.b = v4_1;
        char v6_1 = ((Object[]) v3_16.c);
        if (v4_1 == v6_1.length) {
            byte v7_1 = (v4_1 * 2);
            char v6_2 = java.util.Arrays.copyOf(v6_1, v7_1);
            kotlin.jvm.internal.j.d(v6_2, "copyOf(...)");
            v3_16.c = v6_2;
            char v6_5 = java.util.Arrays.copyOf(((int[]) v3_16.d), v7_1);
            kotlin.jvm.internal.j.d(v6_5, "copyOf(...)");
            v3_16.d = v6_5;
        }
        ((Object[]) v3_16.c)[v4_1] = p10;
        v2_1.g(v1_0.a);
        n.p v3_4 = ((String) v2_1.f);
        int v4_2 = v2_1.b;
        while(true) {
            int v4_3 = v2_1.w(v4_2);
            byte v7_2 = 10;
            if (v4_3 == -1) {
                v2_1.b = v4_3;
            } else {
                char v6_7 = v3_4.charAt(v4_3);
                if ((v6_7 != 9) && ((v6_7 != 10) && ((v6_7 != 13) && (v6_7 != 32)))) {
                    break;
                }
                v4_2 = (v4_3 + 1);
            }
            if (v7_2 == 4) {
                a2.d.n(v2_1, "Unexpected leading comma", 0, 6);
                throw 0;
            } else {
                n.p v3_6 = v1_0.ordinal();
                if ((v3_6 == 1) || ((v3_6 == 2) || (v3_6 == 3))) {
                    return new n.p(v0_2, v1_0, v2_1, p10);
                } else {
                    if ((((u8.k) this.c) != v1_0) || (!v0_2.a.a)) {
                        return new n.p(v0_2, v1_0, v2_1, p10);
                    } else {
                        return this;
                    }
                }
            }
        }
        v2_1.b = v4_3;
        v7_2 = u8.g.b(v6_7);
    }

    public int c(q8.d p22)
    {
        java.util.concurrent.ConcurrentHashMap v2_24 = ((t8.b) this.b);
        String v3_6 = v2_24.a;
        a2.d v4_1 = ((a2.d) this.d);
        kotlin.jvm.internal.j.e(p22, "descriptor");
        String v5_0 = ((u8.k) this.c);
        long v6_0 = v5_0.ordinal();
        java.util.Map v10 = 0;
        n.p v12 = -1;
        if (v6_0 == 0) {
            long v6_5 = ((u8.f) this.f);
            long v13_3 = ((t8.d) this.e);
            java.util.Map v14_2 = v4_1.y();
            if (!v4_1.d()) {
                if (v14_2 != null) {
                    v3_6.getClass();
                    u8.g.c(v4_1, "object");
                    throw 0;
                } else {
                    if (v6_5 != 0) {
                        boolean v1_23 = v6_5.a;
                        java.util.concurrent.ConcurrentHashMap v2_25 = v1_23.b;
                        String v3_5 = v1_23.a;
                        long v6_6 = v3_5.d();
                        do {
                            long v13_4 = v1_23.c;
                            if (v13_4 == -1) {
                                if (v6_6 > 64) {
                                    boolean v1_24 = v1_23.d;
                                    long v6_7 = v1_24.length;
                                    while (v10 < v6_7) {
                                        java.util.Map v7_10 = (v10 + 1);
                                        int v8_3 = (v7_10 * 64);
                                        long v13_5 = v1_24[v10];
                                        while (v13_5 != -1) {
                                            boolean v9_7 = v1_24;
                                            n.p v0_6 = Long.numberOfTrailingZeros((~ v13_5));
                                            v13_5 |= (1 << v0_6);
                                            n.p v0_7 = (v0_6 + v8_3);
                                            if (!((Boolean) v2_25.invoke(v3_5, Integer.valueOf(v0_7))).booleanValue()) {
                                                v1_24 = v9_7;
                                            } else {
                                                v9_7[v10] = v13_5;
                                                v12 = v0_7;
                                            }
                                        }
                                        v1_24[v10] = v13_5;
                                        v10 = v7_10;
                                    }
                                }
                            } else {
                                java.util.Map v7_11 = Long.numberOfTrailingZeros((~ v13_4));
                                v1_23.c = (v1_23.c | (1 << v7_11));
                            }
                        } while(!((Boolean) v2_25.invoke(v3_5, Integer.valueOf(v7_11))).booleanValue());
                        v12 = v7_11;
                    }
                }
            } else {
                v13_3.getClass();
                String v3_7 = v4_1.f();
                v4_1.g(58);
                kotlin.jvm.internal.j.e(p22, "<this>");
                kotlin.jvm.internal.j.e(v2_24, "json");
                kotlin.jvm.internal.j.e(v3_7, "name");
                java.util.Map v7_2 = v2_24.a;
                v7_2.getClass();
                u8.g.e(p22, v2_24);
                boolean v9_0 = p22.a(v3_7);
                v12 = -3;
                if ((v9_0 == -3) && (v7_2.d)) {
                    java.util.concurrent.ConcurrentHashMap v2_5;
                    java.util.Map v7_4 = v2_24.c;
                    boolean v9_2 = new okhttp3.internal.http2.g(3, p22, v2_24);
                    v7_4.getClass();
                    v7_4.getClass();
                    kotlin.jvm.internal.j.e(p22, "descriptor");
                    java.util.concurrent.ConcurrentHashMap v2_4 = ((java.util.Map) ((java.util.concurrent.ConcurrentHashMap) v7_4.b).get(p22));
                    long v13_1 = u8.g.a;
                    java.util.Map v14_0 = 0;
                    if (v2_4 == null) {
                        v2_5 = 0;
                    } else {
                        v2_5 = v2_4.get(v13_1);
                    }
                    if (v2_5 != null) {
                        v14_0 = v2_5;
                    }
                    if (v14_0 == null) {
                        v14_0 = v9_2.invoke();
                        java.util.concurrent.ConcurrentHashMap v2_7 = ((java.util.concurrent.ConcurrentHashMap) v7_4.b);
                        java.util.Map v7_6 = v2_7.get(p22);
                        if (v7_6 == null) {
                            v7_6 = new java.util.concurrent.ConcurrentHashMap(2);
                            v2_7.put(p22, v7_6);
                        }
                        ((java.util.Map) v7_6).put(v13_1, v14_0);
                    }
                    boolean v1_2 = ((Integer) ((java.util.Map) v14_0).get(v3_7));
                    if (v1_2) {
                        v12 = v1_2.intValue();
                    }
                } else {
                    v12 = v9_0;
                }
                if (v12 == -3) {
                    boolean v1_8 = b8.i.A0(((String) v4_1.f).subSequence(0, v4_1.b).toString(), v3_7);
                    java.util.concurrent.ConcurrentHashMap v2_11 = new StringBuilder("Encountered an unknown key \'");
                    v2_11.append(v3_7);
                    v2_11.append(39);
                    v4_1.m(v2_11.toString(), v1_8, "Use \'ignoreUnknownKeys = true\' in \'Json {}\' builder to ignore unknown keys.");
                    throw 0;
                } else {
                    if (v6_5 != 0) {
                        boolean v1_9 = v6_5.a;
                        if (v12 >= 64) {
                            java.util.concurrent.ConcurrentHashMap v2_14 = ((v12 >> 6) - 1);
                            boolean v1_10 = v1_9.d;
                            v1_10[v2_14] = (v1_10[v2_14] | (1 << (v12 & 63)));
                        } else {
                            v1_9.c = (v1_9.c | (1 << v12));
                        }
                    }
                }
            }
        } else {
            if (v6_0 == 2) {
                java.util.concurrent.ConcurrentHashMap v2_18;
                boolean v1_12 = this.a;
                if ((v1_12 % 2) == 0) {
                    v2_18 = 0;
                } else {
                    v2_18 = 1;
                }
                if (v2_18 == null) {
                    v4_1.g(58);
                } else {
                    if (v1_12 != -1) {
                        v10 = v4_1.y();
                    }
                }
                if (!v4_1.d()) {
                    if (v10 != null) {
                        v3_6.getClass();
                        u8.g.c(v4_1, "object");
                        throw 0;
                    }
                } else {
                    if (v2_18 != null) {
                        if (this.a != -1) {
                            if (v10 == null) {
                                a2.d.n(v4_1, "Expected comma after the key-value pair", v4_1.b, 4);
                                throw 0;
                            }
                        } else {
                            if (v10 != null) {
                                a2.d.n(v4_1, "Unexpected leading comma", v4_1.b, 4);
                                throw 0;
                            }
                        }
                    }
                    v12 = (this.a + 1);
                    this.a = v12;
                }
            } else {
                boolean v1_18 = v4_1.y();
                if (!v4_1.d()) {
                    if (v1_18) {
                        v3_6.getClass();
                        u8.g.c(v4_1, "array");
                        throw 0;
                    }
                } else {
                    java.util.concurrent.ConcurrentHashMap v2_22 = this.a;
                    if ((v2_22 != -1) && (!v1_18)) {
                        a2.d.n(v4_1, "Expected end of the array or comma", 0, 6);
                        throw 0;
                    } else {
                        v12 = (v2_22 + 1);
                        this.a = v12;
                    }
                }
            }
        }
        if (v5_0 != u8.k.e) {
            n.p v0_3 = ((g0.d) v4_1.c);
            ((int[]) v0_3.d)[v0_3.b] = v12;
        }
        return v12;
    }

    public int d()
    {
        int v0_1 = ((a2.d) this.d);
        String v1_2 = v0_1.h();
        int v3_2 = ((int) v1_2);
        if (v1_2 != ((long) v3_2)) {
            int v3_0 = new StringBuilder("Failed to parse int for input \'");
            v3_0.append(v1_2);
            v3_0.append(39);
            a2.d.n(v0_1, v3_0.toString(), 0, 6);
            throw 0;
        } else {
            return v3_2;
        }
    }

    public int e(q8.d p1, int p2)
    {
        kotlin.jvm.internal.j.e(p1, "descriptor");
        return this.d();
    }

    public long f()
    {
        return ((a2.d) this.d).h();
    }

    public long g(q8.d p1, int p2)
    {
        kotlin.jvm.internal.j.e(p1, "descriptor");
        return this.f();
    }

    public boolean h()
    {
        a2.d v0_2;
        a2.d v0_1 = ((u8.f) this.f);
        if (v0_1 == null) {
            v0_2 = 0;
        } else {
            v0_2 = v0_1.b;
        }
        if (v0_2 == null) {
            a2.d v0_4 = ((a2.d) this.d);
            int v2_1 = v0_4.w(v0_4.x());
            byte v3_1 = ((String) v0_4.f);
            int v4_1 = (v3_1.length() - v2_1);
            int v6 = 0;
            if ((v4_1 >= 4) && (v2_1 != -1)) {
                int v8_1 = 0;
                while (v8_1 < 4) {
                    if ("null".charAt(v8_1) == v3_1.charAt((v2_1 + v8_1))) {
                        v8_1++;
                    }
                }
                if ((v4_1 <= 4) || (u8.g.b(v3_1.charAt((v2_1 + 4))) != 0)) {
                    v6 = 1;
                    v0_4.b = (v2_1 + 4);
                }
            }
            if (v6 == 0) {
                return 1;
            }
        }
        return 0;
    }

    public Object i(q8.d p1, int p2, o8.a p3, Object p4)
    {
        kotlin.jvm.internal.j.e(p1, "descriptor");
        kotlin.jvm.internal.j.e(p3, "deserializer");
        if ((!p3.d().g()) && (!this.h())) {
            return 0;
        } else {
            return this.k(p3);
        }
    }

    public Object j(q8.d p6, int p7, o8.a p8, Object p9)
    {
        int[] v7_2;
        g0.d v9_3 = ((g0.d) ((a2.d) this.d).c);
        kotlin.jvm.internal.j.e(p6, "descriptor");
        kotlin.jvm.internal.j.e(p8, "deserializer");
        if ((((u8.k) this.c) != u8.k.e) || ((p7 & 1) != 0)) {
            v7_2 = 0;
        } else {
            v7_2 = 1;
        }
        if (v7_2 != null) {
            int v3 = v9_3.b;
            if (((int[]) v9_3.d)[v3] == -2) {
                ((Object[]) v9_3.c)[v3] = u8.h.a;
            }
        }
        kotlin.jvm.internal.j.e(p6, "descriptor");
        kotlin.jvm.internal.j.e(p8, "deserializer");
        Object v6_2 = this.k(p8);
        if (v7_2 != null) {
            int v8_1 = v9_3.b;
            if (((int[]) v9_3.d)[v8_1] != -2) {
                int v8_2 = (v8_1 + 1);
                v9_3.b = v8_2;
                int[] v7_7 = ((Object[]) v9_3.c);
                if (v8_2 == v7_7.length) {
                    int v8_3 = (v8_2 * 2);
                    int[] v7_8 = java.util.Arrays.copyOf(v7_7, v8_3);
                    kotlin.jvm.internal.j.d(v7_8, "copyOf(...)");
                    v9_3.c = v7_8;
                    int[] v7_11 = java.util.Arrays.copyOf(((int[]) v9_3.d), v8_3);
                    kotlin.jvm.internal.j.d(v7_11, "copyOf(...)");
                    v9_3.d = v7_11;
                }
            }
            int v8_4 = v9_3.b;
            ((Object[]) v9_3.c)[v8_4] = v6_2;
            ((int[]) v9_3.d)[v8_4] = -2;
        }
        return v6_2;
    }

    public Object k(o8.a p4)
    {
        kotlin.jvm.internal.j.e(p4, "deserializer");
        try {
            return p4.c(this);
        } catch (o8.b v4_2) {
            o8.b v0_4 = v4_2.getMessage();
            kotlin.jvm.internal.j.b(v0_4);
            if (!b8.i.s0(v0_4, "at path")) {
                String v1_1 = new StringBuilder();
                v1_1.append(v4_2.getMessage());
                v1_1.append(" at path: ");
                v1_1.append(((g0.d) ((a2.d) this.d).c).d());
                throw new o8.b(v4_2.a, v1_1.toString(), v4_2);
            } else {
                throw v4_2;
            }
        }
    }

    public String l()
    {
        String v0_1 = ((a2.d) this.d);
        ((t8.d) this.e).getClass();
        return v0_1.i();
    }

    public String m(q8.d p1, int p2)
    {
        kotlin.jvm.internal.j.e(p1, "descriptor");
        return this.l();
    }

    public void n(q8.d p6)
    {
        int v0_1 = ((a2.d) this.d);
        kotlin.jvm.internal.j.e(p6, "descriptor");
        int v6_10 = ((t8.b) this.b).a;
        v6_10.getClass();
        if (v0_1.y()) {
            v6_10.getClass();
            u8.g.c(v0_1, "");
            throw 0;
        } else {
            v0_1.g(((u8.k) this.c).b);
            int v6_7 = ((g0.d) v0_1.c);
            int v0_2 = v6_7.b;
            int[] v1_2 = ((int[]) v6_7.d);
            if (v1_2[v0_2] == -2) {
                v1_2[v0_2] = -1;
                v6_7.b = (v0_2 + -1);
            }
            int v0_4 = v6_7.b;
            if (v0_4 != -1) {
                v6_7.b = (v0_4 + -1);
            }
            return;
        }
    }

    public android.content.res.ColorStateList o()
    {
        int v0_1 = ((n.v2) this.e);
        if (v0_1 == 0) {
            return 0;
        } else {
            return v0_1.a;
        }
    }

    public android.graphics.PorterDuff$Mode p()
    {
        int v0_1 = ((n.v2) this.e);
        if (v0_1 == 0) {
            return 0;
        } else {
            return v0_1.b;
        }
    }

    public void q(android.util.AttributeSet p10, int p11)
    {
        Throwable v0_1 = ((android.view.View) this.b);
        n.n2 v4_1 = g.a.z;
        b8.g v1_1 = b8.g.p(v0_1.getContext(), p10, v4_1, p11);
        android.content.res.TypedArray v8_1 = ((android.content.res.TypedArray) v1_1.c);
        int v2_1 = ((android.view.View) this.b);
        q0.q0.m(v2_1, v2_1.getContext(), v4_1, p10, ((android.content.res.TypedArray) v1_1.c), p11);
        try {
            if (v8_1.hasValue(0)) {
                this.a = v8_1.getResourceId(0, -1);
                int v11_3 = ((n.u) this.c).a.f(v0_1.getContext(), this.a);
                if (v11_3 != 0) {
                    this.t(v11_3);
                }
            }
        } catch (Throwable v0_3) {
            android.graphics.PorterDuff$Mode v10_10 = v0_3;
            v1_1.r();
            throw v10_10;
        }
        if (v8_1.hasValue(1)) {
            q0.i0.g(v0_1, v1_1.h(1));
        }
        if (v8_1.hasValue(2)) {
            q0.i0.h(v0_1, n.n1.c(v8_1.getInt(2, -1), 0));
        }
        v1_1.r();
        return;
    }

    public void r()
    {
        this.a = -1;
        this.t(0);
        this.a();
        return;
    }

    public void s(int p4)
    {
        Throwable v4_1;
        this.a = p4;
        n.u v0_1 = ((n.u) this.c);
        if (v0_1 == null) {
            v4_1 = 0;
        } else {
            v4_1 = v0_1.a.f(((android.view.View) this.b).getContext(), p4);
        }
        this.t(v4_1);
        this.a();
        return;
    }

    public void t(android.content.res.ColorStateList p2)
    {
        if (p2 == 0) {
            this.d = 0;
        } else {
            if (((n.v2) this.d) == null) {
                this.d = new n.v2();
            }
            n.v2 v0_0 = ((n.v2) this.d);
            v0_0.a = p2;
            v0_0.d = 1;
        }
        this.a();
        return;
    }

    public void u(android.content.res.ColorStateList p2)
    {
        if (((n.v2) this.e) == null) {
            this.e = new n.v2();
        }
        n.v2 v0_5 = ((n.v2) this.e);
        v0_5.a = p2;
        v0_5.d = 1;
        this.a();
        return;
    }

    public void v(android.graphics.PorterDuff$Mode p2)
    {
        if (((n.v2) this.e) == null) {
            this.e = new n.v2();
        }
        n.v2 v0_5 = ((n.v2) this.e);
        v0_5.b = p2;
        v0_5.c = 1;
        this.a();
        return;
    }
}
