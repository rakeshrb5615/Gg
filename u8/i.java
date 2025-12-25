package u8;
public final class i {
    public String a;
    public boolean b;
    public final Object c;
    public final Object d;
    public final java.io.Serializable e;
    public final java.io.Serializable f;
    public Object g;
    public java.io.Serializable h;

    public i(android.content.res.AssetManager p1, java.util.concurrent.Executor p2, y1.b p3, String p4, java.io.File p5)
    {
        byte[] v1_1;
        this.b = 0;
        this.c = p2;
        this.d = p3;
        this.a = p4;
        this.f = p5;
        byte[] v1_2 = android.os.Build$VERSION.SDK_INT;
        if (v1_2 < 31) {
            switch (v1_2) {
                case 26:
                    v1_1 = y1.c.g;
                    break;
                case 27:
                    v1_1 = y1.c.f;
                    break;
                case 28:
                case 29:
                case 30:
                    v1_1 = y1.c.e;
                    break;
                default:
                    v1_1 = 0;
            }
        } else {
            v1_1 = y1.c.d;
        }
        this.e = v1_1;
        return;
    }

    public i(i2.m p2, t8.b p3, u8.k p4, u8.i[] p5)
    {
        kotlin.jvm.internal.j.e(p2, "composer");
        this.c = p2;
        this.d = p3;
        this.e = p4;
        this.f = p5;
        this.g = p3.a;
        int v2_1 = p4.ordinal();
        if (p5 != null) {
            u8.i v3_1 = p5[v2_1];
            if ((v3_1 != null) || (v3_1 != this)) {
                p5[v2_1] = this;
            }
        }
        return;
    }

    public u8.i a(q8.d p7)
    {
        u8.i[] v0_1 = ((u8.i[]) this.f);
        kotlin.jvm.internal.j.e(p7, "descriptor");
        t8.b v1_2 = ((t8.b) this.d);
        u8.k v2 = u8.g.f(p7, v1_2);
        i2.m v4_0 = ((i2.m) this.c);
        v4_0.j(v2.a);
        v4_0.a = 1;
        String v3_1 = this.a;
        if (v3_1 != null) {
            String v5_1 = ((String) this.h);
            if (v5_1 == null) {
                v5_1 = p7.b();
            }
            v4_0.i();
            this.j(v3_1);
            v4_0.j(58);
            this.j(v5_1);
            this.a = 0;
            this.h = 0;
        }
        if (((u8.k) this.e) != v2) {
            if (v0_1 != null) {
                u8.i v7_6 = v0_1[v2.ordinal()];
                if (v7_6 != null) {
                    return v7_6;
                }
            }
            return new u8.i(v4_0, v1_2, v2, v0_1);
        } else {
            return this;
        }
    }

    public void b(q8.d p8, int p9)
    {
        i2.m v0_1 = ((i2.m) this.c);
        kotlin.jvm.internal.j.e(p8, "descriptor");
        t8.b v1_6 = ((u8.k) this.e).ordinal();
        int v3 = 1;
        if (v1_6 == 1) {
            if (!v0_1.a) {
                v0_1.j(44);
            }
            v0_1.i();
            return;
        } else {
            if (v1_6 == 2) {
                if (v0_1.a) {
                    this.b = 1;
                    v0_1.i();
                    return;
                } else {
                    if ((p9 % 2) != 0) {
                        v0_1.j(58);
                        v0_1.k();
                        v3 = 0;
                    } else {
                        v0_1.j(44);
                        v0_1.i();
                    }
                    this.b = v3;
                    return;
                }
            } else {
                if (v1_6 == 3) {
                    if (p9 == 0) {
                        this.b = 1;
                    }
                    if (p9 == 1) {
                        v0_1.j(44);
                        v0_1.k();
                        this.b = 0;
                    }
                    return;
                } else {
                    if (!v0_1.a) {
                        v0_1.j(44);
                    }
                    v0_1.i();
                    u8.g.e(p8, ((t8.b) this.d));
                    this.j(p8.e(p9));
                    v0_1.j(58);
                    v0_1.k();
                    return;
                }
            }
        }
    }

    public void c(int p4)
    {
        if (!this.b) {
            ((h.f) ((i2.m) this.c).b).i(String.valueOf(((long) p4)));
            return;
        } else {
            this.j(String.valueOf(p4));
            return;
        }
    }

    public void d(long p2)
    {
        if (!this.b) {
            ((h.f) ((i2.m) this.c).b).i(String.valueOf(p2));
            return;
        } else {
            this.j(String.valueOf(p2));
            return;
        }
    }

    public void e(q8.d p2, int p3, long p4)
    {
        kotlin.jvm.internal.j.e(p2, "descriptor");
        this.b(p2, p3);
        this.d(p4);
        return;
    }

    public void f()
    {
        h.f v0_1 = ((i2.m) this.c);
        v0_1.getClass();
        kotlin.jvm.internal.j.e("null", "v");
        ((h.f) v0_1.b).i("null");
        return;
    }

    public void g(q8.d p2, int p3, o8.a p4, Object p5)
    {
        kotlin.jvm.internal.j.e(p2, "descriptor");
        kotlin.jvm.internal.j.e(p4, "serializer");
        if ((p5 == null) && (!((t8.d) this.g).a)) {
            return;
        } else {
            kotlin.jvm.internal.j.e(p2, "descriptor");
            kotlin.jvm.internal.j.e(p4, "serializer");
            this.b(p2, p3);
            if (!p4.d().g()) {
                if (p5 != null) {
                    this.i(p4, p5);
                } else {
                    this.f();
                }
            } else {
                this.i(p4, p5);
            }
            return;
        }
    }

    public void h(q8.d p2, int p3, o8.a p4, Object p5)
    {
        kotlin.jvm.internal.j.e(p2, "descriptor");
        kotlin.jvm.internal.j.e(p4, "serializer");
        this.b(p2, p3);
        this.i(p4, p5);
        return;
    }

    public void i(o8.a p5, Object p6)
    {
        String v0_3;
        kotlin.jvm.internal.j.e(p5, "serializer");
        String v0_4 = ((t8.b) this.d).a;
        v0_4.getClass();
        String v1_9 = v0_4.e.ordinal();
        if (v1_9 == null) {
            v0_3 = 0;
        } else {
            if (v1_9 == 1) {
                String v1_1 = p5.d().c();
                if ((!kotlin.jvm.internal.j.a(v1_1, q8.f.f)) && (!kotlin.jvm.internal.j.a(v1_1, q8.f.i))) {
                } else {
                    String v1_3 = p5.d();
                    kotlin.jvm.internal.j.e(v1_3, "<this>");
                    String v1_5 = v1_3.getAnnotations().iterator();
                    while (v1_5.hasNext()) {
                        t8.c v2_7 = ((otation.Annotation) v1_5.next());
                        if ((v2_7 instanceof t8.c)) {
                            v0_3 = ((t8.c) v2_7).discriminator();
                        }
                    }
                    v0_3 = v0_4.c;
                }
            } else {
                if (v1_9 != 2) {
                    throw new a5.o();
                }
            }
        }
        if (v0_3 != null) {
            String v1_7 = p5.d().b();
            this.a = v0_3;
            this.h = v1_7;
        }
        p5.b(this, p6);
        return;
    }

    public void j(String p12)
    {
        kotlin.jvm.internal.j.e(p12, "value");
        h.f v0_2 = ((i2.m) this.c);
        v0_2.getClass();
        kotlin.jvm.internal.j.e(p12, "value");
        h.f v0_4 = ((h.f) v0_2.b);
        v0_4.c(v0_4.b, (p12.length() + 2));
        int v1_3 = ((char[]) v0_4.c);
        int v3_1 = v0_4.b;
        char[] v4_0 = (v3_1 + 1);
        v1_3[v3_1] = 34;
        int v3_2 = p12.length();
        p12.getChars(0, v3_2, v1_3, v4_0);
        int v3_3 = (v3_2 + v4_0);
        int v7 = v4_0;
        while (v7 < v3_3) {
            int v8_0 = v1_3[v7];
            char v9_0 = u8.j.b;
            if ((v8_0 >= v9_0.length) || (v9_0[v8_0] == 0)) {
                v7++;
            } else {
                int v1_4 = (v7 - v4_0);
                int v3_4 = p12.length();
                while (v1_4 < v3_4) {
                    char v9_2;
                    v0_4.c(v7, 2);
                    int v8_2 = p12.charAt(v1_4);
                    char v9_1 = u8.j.b;
                    if (v8_2 >= v9_1.length) {
                        v9_2 = (v7 + 1);
                        ((char[]) v0_4.c)[v7] = ((char) v8_2);
                        v7 = v9_2;
                    } else {
                        char v9_3 = v9_1[v8_2];
                        if (v9_3 != 0) {
                            if (v9_3 != 1) {
                                char[] v4_5 = ((char[]) v0_4.c);
                                v4_5[v7] = 92;
                                v4_5[(v7 + 1)] = ((char) v9_3);
                                v7 += 2;
                                v0_4.b = v7;
                            } else {
                                char[] v4_7 = u8.j.a[v8_2];
                                kotlin.jvm.internal.j.b(v4_7);
                                v0_4.c(v7, v4_7.length());
                                v4_7.getChars(0, v4_7.length(), ((char[]) v0_4.c), v7);
                                char[] v4_9 = (v4_7.length() + v7);
                                v0_4.b = v4_9;
                                v7 = v4_9;
                            }
                        } else {
                            v9_2 = (v7 + 1);
                            ((char[]) v0_4.c)[v7] = ((char) v8_2);
                        }
                    }
                    v1_4++;
                }
                v0_4.c(v7, 1);
                int v1_5 = (v7 + 1);
                ((char[]) v0_4.c)[v7] = 34;
                v0_4.b = v1_5;
            }
            return;
        }
        char[] v12_1 = (v3_3 + 1);
        v1_3[v3_3] = 34;
        v0_4.b = v12_1;
        return;
    }

    public void k(q8.d p2, int p3, String p4)
    {
        kotlin.jvm.internal.j.e(p2, "descriptor");
        kotlin.jvm.internal.j.e(p4, "value");
        this.b(p2, p3);
        this.j(p4);
        return;
    }

    public void l(q8.d p3)
    {
        kotlin.jvm.internal.j.e(p3, "descriptor");
        char v3_2 = ((u8.k) this.e);
        i2.m v0_2 = ((i2.m) this.c);
        v0_2.getClass();
        v0_2.a = 0;
        v0_2.j(v3_2.b);
        return;
    }

    public java.io.FileInputStream m(android.content.res.AssetManager p1, String p2)
    {
        try {
            return p1.openFd(p2).createInputStream();
        } catch (y1.b v1_7) {
            y1.b v1_8 = v1_7.getMessage();
            if (v1_8 != null) {
                if (v1_8.contains("compressed")) {
                    ((y1.b) this.d).i();
                }
            }
            return 0;
        }
    }

    public void n(int p4, java.io.Serializable p5)
    {
        ((java.util.concurrent.Executor) this.c).execute(new c.l(this, p4, 3, p5));
        return;
    }

    public boolean o(q8.d p1)
    {
        ((t8.d) this.g).getClass();
        return 0;
    }
}
