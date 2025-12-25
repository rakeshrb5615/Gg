package s1;
public final class f {
    public final g8.y a;
    public final g8.y b;
    public final g8.v c;
    public final i7.g d;
    public final i7.g e;
    public c.r f;
    public int g;
    public s1.e h;
    public final java.util.LinkedHashSet i;
    public final java.util.LinkedHashSet j;
    public final java.util.LinkedHashSet k;
    public boolean l;
    public boolean m;
    public boolean n;

    public f()
    {
        this.a = new g8.y(s1.g.b);
        g8.y v1_2 = new g8.y(new s1.d());
        this.b = v1_2;
        this.c = new g8.v(v1_2);
        this.d = new i7.g();
        this.e = new i7.g();
        this.i = new java.util.LinkedHashSet();
        this.j = new java.util.LinkedHashSet();
        this.k = new java.util.LinkedHashSet();
        return;
    }

    public final void a(s1.c p3, s1.e p4, int p5)
    {
        kotlin.jvm.internal.j.e(p3, "dispatcher");
        if (p4.a != null) {
            boolean v3_9 = new StringBuilder("Input \'");
            v3_9.append(p4);
            v3_9.append("\' is already added to dispatcher ");
            v3_9.append(p4.a);
            v3_9.append(46);
            throw new IllegalArgumentException(v3_9.toString().toString());
        } else {
            String v1_0;
            if (p5 == null) {
                v1_0 = this.k;
            } else {
                if (p5 == 1) {
                    v1_0 = this.j;
                } else {
                    v1_0 = this.i;
                }
            }
            boolean v3_7;
            v1_0.add(p4);
            p4.a = p3;
            kotlin.jvm.internal.j.e(((s1.d) this.c.a.b()), "history");
            if (p5 == null) {
                v3_7 = this.m;
            } else {
                if (p5 == 1) {
                    v3_7 = this.l;
                } else {
                    v3_7 = this.n;
                }
            }
            p4.b(v3_7);
            return;
        }
    }

    public final void b()
    {
        s1.d v3_6;
        i7.n v2_6 = this.d;
        if ((v2_6 == null) || (!v2_6.isEmpty())) {
            s1.d v3_9 = v2_6.iterator();
            while (v3_9.hasNext()) {
                if (((c.r) v3_9.next()).b) {
                    v3_6 = 1;
                }
            }
            v3_6 = 0;
        }
        int v5_3;
        j7.c v4_6 = this.e;
        if ((v4_6 == null) || (!v4_6.isEmpty())) {
            int v5_2 = v4_6.iterator();
            while (v5_2.hasNext()) {
                if (((c.r) v5_2.next()).b) {
                    v5_3 = 1;
                }
            }
            v5_3 = 0;
        }
        if ((v3_6 == null) && (v5_3 == 0)) {
            int v6_4 = 0;
        } else {
            v6_4 = 1;
        }
        java.util.LinkedHashSet v7_1;
        if (this.m == v3_6) {
            v7_1 = 0;
        } else {
            v7_1 = 1;
        }
        java.util.LinkedHashSet v8_1;
        if (this.l == v5_3) {
            v8_1 = 0;
        } else {
            v8_1 = 1;
        }
        java.util.Iterator v9_1;
        if (this.n == v6_4) {
            v9_1 = 0;
        } else {
            v9_1 = 1;
        }
        java.util.LinkedHashSet v10 = this.k;
        if (v7_1 != null) {
            java.util.LinkedHashSet v7_2 = v10.iterator();
            while (v7_2.hasNext()) {
                ((s1.e) v7_2.next()).b(v3_6);
            }
        }
        java.util.LinkedHashSet v7_3 = this.j;
        if (v8_1 != null) {
            java.util.LinkedHashSet v8_2 = v7_3.iterator();
            while (v8_2.hasNext()) {
                ((s1.e) v8_2.next()).b(v5_3);
            }
        }
        java.util.LinkedHashSet v8_3 = this.i;
        if (v9_1 != null) {
            java.util.Iterator v9_2 = v8_3.iterator();
            while (v9_2.hasNext()) {
                ((s1.e) v9_2.next()).b(v6_4);
            }
        }
        this.m = v3_6;
        this.l = v5_3;
        this.n = v6_4;
        s1.d v3_8 = this.f;
        if (v3_8 == null) {
            v3_8 = this.c(0);
        }
        int v5_4 = this.f;
        if (v5_4 == 0) {
            v5_4 = this.c(0);
        }
        if (kotlin.jvm.internal.j.a(v5_4, v3_8)) {
            s1.d v0_3;
            if (v5_4 != 0) {
                s1.e v1_13 = new java.util.ArrayList();
                i7.n v2_7 = v2_6.iterator();
                while (v2_7.hasNext()) {
                    ((c.r) v2_7.next()).getClass();
                }
                i7.n v2_8 = v4_6.iterator();
                while (v2_8.hasNext()) {
                    ((c.r) v2_8.next()).getClass();
                }
                i7.n v2_0 = v5_4.a;
                j7.c v4_2 = new j7.c(10);
                i7.i.Y(v1_13, v4_2);
                v4_2.add(v2_0);
                i7.i.Y(i7.n.a, v4_2);
                v4_2.g();
                v4_2.c = 1;
                if (v4_2.b <= 0) {
                    v4_2 = j7.c.d;
                }
                v0_3 = new s1.d(v4_2, v1_13.size());
            } else {
                v0_3 = new s1.d();
            }
            s1.e v1_1 = this.b;
            if (!kotlin.jvm.internal.j.a(((s1.d) v1_1.b()), v0_3)) {
                v1_1.e(0, v0_3);
                s1.d v0_5 = v10.iterator();
                while (v0_5.hasNext()) {
                    ((s1.e) v0_5.next()).getClass();
                }
                s1.d v0_6 = v7_3.iterator();
                while (v0_6.hasNext()) {
                    ((s1.e) v0_6.next()).getClass();
                }
                s1.d v0_7 = v8_3.iterator();
                while (v0_7.hasNext()) {
                    ((s1.e) v0_7.next()).getClass();
                }
            }
        }
        return;
    }

    public final c.r c(int p5)
    {
        boolean v1_0 = this.e;
        boolean v2_3 = this.d;
        Object v3_0 = 0;
        if (p5 == -1) {
            java.util.Iterator v5_4 = v2_3.iterator();
            while (v5_4.hasNext()) {
                Object v0_1 = v5_4.next();
                if (((c.r) v0_1).b) {
                }
                Object v0_2 = ((c.r) v0_1);
                if (v0_2 != null) {
                    return v0_2;
                } else {
                    java.util.Iterator v5_1 = v1_0.iterator();
                    while (v5_1.hasNext()) {
                        Object v0_4 = v5_1.next();
                        if (((c.r) v0_4).b) {
                            v3_0 = v0_4;
                            break;
                        }
                    }
                    return ((c.r) v3_0);
                }
            }
            v0_1 = 0;
        } else {
            if (p5 == null) {
                java.util.Iterator v5_2 = v2_3.iterator();
                while (v5_2.hasNext()) {
                    Object v0_6 = v5_2.next();
                    if (!((c.r) v0_6).b) {
                    }
                    Object v0_7 = ((c.r) v0_6);
                    if (v0_7 != null) {
                        return v0_7;
                    } else {
                        java.util.Iterator v5_3 = v1_0.iterator();
                        while (v5_3.hasNext()) {
                            Object v0_9 = v5_3.next();
                            if (((c.r) v0_9).b) {
                                v3_0 = v0_9;
                                break;
                            }
                        }
                        return ((c.r) v3_0);
                    }
                }
                v0_6 = 0;
            } else {
                if (p5 != 1) {
                    boolean v1_8 = new StringBuilder("Unsupported direction: \'");
                    v1_8.append(p5);
                    v1_8.append("\'.");
                    throw new IllegalStateException(v1_8.toString().toString());
                } else {
                    java.util.Iterator v5_8 = v2_3.iterator();
                    while (v5_8.hasNext()) {
                        ((c.r) v5_8.next()).getClass();
                    }
                    java.util.Iterator v5_9 = v1_0.iterator();
                    while (v5_9.hasNext()) {
                        ((c.r) v5_9.next()).getClass();
                    }
                    return 0;
                }
            }
        }
    }
}
