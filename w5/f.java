package w5;
public final class f implements t5.e {
    public static final java.nio.charset.Charset f;
    public static final t5.c g;
    public static final t5.c h;
    public static final v5.a i;
    public java.io.OutputStream a;
    public final java.util.HashMap b;
    public final java.util.HashMap c;
    public final t5.d d;
    public final w5.h e;

    static f()
    {
        w5.f.f = java.nio.charset.Charset.forName("UTF-8");
        w5.f.g = new t5.c("key", g2.g.i(g2.g.h(w5.e, new w5.a(1))));
        w5.f.h = new t5.c("value", g2.g.i(g2.g.h(w5.e, new w5.a(2))));
        w5.f.i = new v5.a(1);
        return;
    }

    public f(java.io.ByteArrayOutputStream p2, java.util.HashMap p3, java.util.HashMap p4, t5.d p5)
    {
        this.e = new w5.h(this);
        this.a = p2;
        this.b = p3;
        this.c = p4;
        this.d = p5;
        return;
    }

    public static int j(t5.c p1)
    {
        t5.b v1_6 = ((w5.e) ((otation.Annotation) p1.b.get(w5.e)));
        if (v1_6 == null) {
            throw new t5.b("Field has no @Protobuf config");
        } else {
            return ((w5.a) v1_6).a;
        }
    }

    public final t5.e a(t5.c p2, boolean p3)
    {
        this.g(p2, p3, 1);
        return this;
    }

    public final t5.e b(t5.c p2, double p3)
    {
        this.e(p2, p3, 1);
        return this;
    }

    public final t5.e c(t5.c p3, long p4)
    {
        if (p4 != 0) {
            t5.b v3_9 = ((w5.e) ((otation.Annotation) p3.b.get(w5.e)));
            if (v3_9 == null) {
                throw new t5.b("Field has no @Protobuf config");
            } else {
                this.k((((w5.a) v3_9).a << 3));
                this.l(p4);
                return this;
            }
        } else {
            return this;
        }
    }

    public final t5.e d(t5.c p2, int p3)
    {
        this.g(p2, p3, 1);
        return this;
    }

    public final void e(t5.c p3, double p4, boolean p6)
    {
        if ((p6 == null) || (p4 != 0)) {
            this.k(((w5.f.j(p3) << 3) | 1));
            this.a.write(java.nio.ByteBuffer.allocate(8).order(java.nio.ByteOrder.LITTLE_ENDIAN).putDouble(p4).array());
            return;
        } else {
            return;
        }
    }

    public final t5.e f(t5.c p2, Object p3)
    {
        this.h(p2, p3, 1);
        return this;
    }

    public final void g(t5.c p1, int p2, boolean p3)
    {
        if ((p3 == null) || (p2 != null)) {
            t5.b v1_8 = ((w5.e) ((otation.Annotation) p1.b.get(w5.e)));
            if (v1_8 == null) {
                throw new t5.b("Field has no @Protobuf config");
            } else {
                this.k((((w5.a) v1_8).a << 3));
                this.k(p2);
                return;
            }
        } else {
            return;
        }
    }

    public final void h(t5.c p4, Object p5, boolean p6)
    {
        if (p5 != 0) {
            if (!(p5 instanceof CharSequence)) {
                if (!(p5 instanceof java.util.Collection)) {
                    if (!(p5 instanceof java.util.Map)) {
                        if (!(p5 instanceof Double)) {
                            if (!(p5 instanceof Float)) {
                                if (!(p5 instanceof Number)) {
                                    if (!(p5 instanceof Boolean)) {
                                        if (!(p5 instanceof byte[])) {
                                            t5.d v0_10 = ((t5.d) this.b.get(p5.getClass()));
                                            if (v0_10 == null) {
                                                t5.d v0_14 = ((t5.f) this.c.get(p5.getClass()));
                                                if (v0_14 == null) {
                                                    if (!(p5 instanceof w5.c)) {
                                                        if (!(p5 instanceof Enum)) {
                                                            this.i(this.d, p4, p5, p6);
                                                            return;
                                                        } else {
                                                            this.g(p4, ((Enum) p5).ordinal(), 1);
                                                            return;
                                                        }
                                                    } else {
                                                        this.g(p4, ((w5.c) p5).a(), 1);
                                                        return;
                                                    }
                                                } else {
                                                    w5.h v2_2 = this.e;
                                                    v2_2.a = 0;
                                                    v2_2.c = p4;
                                                    v2_2.b = p6;
                                                    v0_14.a(p5, v2_2);
                                                    return;
                                                }
                                            } else {
                                                this.i(v0_10, p4, p5, p6);
                                                return;
                                            }
                                        } else {
                                            if ((p6 == 0) || (((byte[]) p5).length != 0)) {
                                                this.k(((w5.f.j(p4) << 3) | 2));
                                                this.k(((byte[]) p5).length);
                                                this.a.write(((byte[]) p5));
                                                return;
                                            }
                                        }
                                    } else {
                                        this.g(p4, ((Boolean) p5).booleanValue(), p6);
                                        return;
                                    }
                                } else {
                                    t5.d v0_19 = ((Number) p5).longValue();
                                    if ((p6 == 0) || (v0_19 != 0)) {
                                        java.io.OutputStream v4_18 = ((w5.e) ((otation.Annotation) p4.b.get(w5.e)));
                                        if (v4_18 == null) {
                                            throw new t5.b("Field has no @Protobuf config");
                                        } else {
                                            this.k((((w5.a) v4_18).a << 3));
                                            this.l(v0_19);
                                            return;
                                        }
                                    }
                                }
                            } else {
                                int v5_2 = ((Float) p5).floatValue();
                                if ((p6 == 0) || (v5_2 != 0)) {
                                    this.k(((w5.f.j(p4) << 3) | 5));
                                    this.a.write(java.nio.ByteBuffer.allocate(4).order(java.nio.ByteOrder.LITTLE_ENDIAN).putFloat(v5_2).array());
                                    return;
                                }
                            }
                        } else {
                            this.e(p4, ((Double) p5).doubleValue(), p6);
                            return;
                        }
                    } else {
                        int v5_8 = ((java.util.Map) p5).entrySet().iterator();
                        while (v5_8.hasNext()) {
                            this.i(w5.f.i, p4, ((java.util.Map$Entry) v5_8.next()), 0);
                        }
                    }
                } else {
                    int v5_10 = ((java.util.Collection) p5).iterator();
                    while (v5_10.hasNext()) {
                        this.h(p4, v5_10.next(), 0);
                    }
                }
            } else {
                if ((p6 == 0) || (((CharSequence) p5).length() != 0)) {
                    this.k(((w5.f.j(p4) << 3) | 2));
                    java.io.OutputStream v4_9 = ((CharSequence) p5).toString().getBytes(w5.f.f);
                    this.k(v4_9.length);
                    this.a.write(v4_9);
                    return;
                }
            }
        }
        return;
    }

    public final void i(t5.d p6, t5.c p7, Object p8, boolean p9)
    {
        w5.b v0_1 = new w5.b();
        v0_1.a = 0;
        try {
            long v3_1 = this.a;
            this.a = v0_1;
            try {
                p6.a(p8, this);
            } catch (Throwable v6_2) {
                this.a = v3_1;
                throw v6_2;
            }
            this.a = v3_1;
            long v3_0 = v0_1.a;
            v0_1.close();
            if ((p9 == 0) || (v3_0 != 0)) {
                this.k(((w5.f.j(p7) << 3) | 2));
                this.l(v3_0);
                p6.a(p8, this);
                return;
            } else {
                return;
            }
        } catch (Throwable v6_1) {
            try {
                v0_1.close();
            } catch (int v7_1) {
                v6_1.addSuppressed(v7_1);
            }
            throw v6_1;
        }
    }

    public final void k(int p5)
    {
        while (((long) (p5 & -128)) != 0) {
            this.a.write(((p5 & 127) | 128));
            p5 >>= 7;
        }
        this.a.write((p5 & 127));
        return;
    }

    public final void l(long p5)
    {
        while ((-128 & p5) != 0) {
            this.a.write(((((int) p5) & 127) | 128));
            p5 >>= 7;
        }
        this.a.write((((int) p5) & 127));
        return;
    }
}
