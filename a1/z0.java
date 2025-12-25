package a1;
public final class z0 implements a1.s0 {
    public final l7.h a;
    public final java.io.File b;
    public final g8.b c;
    public final String d;
    public final String e;
    public final String f;
    public final m8.c g;
    public final h7.j h;
    public final h7.j i;

    static z0()
    {
        return;
    }

    public z0(l7.h p8, java.io.File p9)
    {
        kotlin.jvm.internal.j.e(p8, "context");
        kotlin.jvm.internal.j.e(p9, "file");
        this.a = p8;
        this.b = p9;
        this.c = new g8.b(new a1.t(p9, 0, 2), l7.i.a, -2, f8.a.a, 0);
        this.d = ".lock";
        this.e = ".version";
        this.f = "fcntl failed: EAGAIN";
        this.g = m8.d.a();
        this.h = a.a.F(new a1.w0(this, 2));
        this.i = a.a.F(new a1.w0(this, 1));
        return;
    }

    public static final void f(a1.z0 p2, java.io.File p3)
    {
        java.io.IOException v2_3 = p3.getCanonicalFile().getParentFile();
        if (v2_3 != null) {
            v2_3.mkdirs();
            if (!v2_3.isDirectory()) {
                StringBuilder v0_1 = new StringBuilder("Unable to create parent directories of ");
                v0_1.append(p3);
                throw new java.io.IOException(v0_1.toString());
            }
        }
        if (!p3.exists()) {
            p3.createNewFile();
        }
        return;
    }

    public final Object a(u7.l p9, n7.c p10)
    {
        Throwable v0_6;
        if (!(p10 instanceof a1.x0)) {
            v0_6 = new a1.x0(this, p10);
        } else {
            v0_6 = ((a1.x0) p10);
            Throwable v1_3 = ((a1.x0) p10).f;
            if ((v1_3 & -2147483648) == 0) {
            } else {
                ((a1.x0) p10).f = (v1_3 - -2147483648);
            }
        }
        Throwable v9_6;
        Throwable v4_2;
        Throwable v1_1;
        Throwable v9_8;
        Throwable v0_2;
        Throwable v10_2;
        java.io.File v5_1;
        Throwable v2_7;
        Throwable v10_3 = v0_6.d;
        Throwable v1_2 = m7.a.a;
        Throwable v2_0 = v0_6.f;
        try {
            if (v2_0 == null) {
                c4.b.e0(v10_3);
                v0_6.a = this;
                v0_6.b = p9;
                v10_2 = this.g;
                v0_6.c = v10_2;
                v0_6.f = 1;
                if (v10_2.d(v0_6) != v1_2) {
                    v5_1 = this;
                    Throwable v2_5 = new java.io.FileOutputStream(((java.io.File) v5_1.h.getValue()));
                    try {
                        v0_6.a = p9;
                        v0_6.b = v10_2;
                        v0_6.c = v2_5;
                        v0_6.f = 2;
                        Throwable v4_1 = a1.o1.a(v2_5, v0_6);
                    } catch (Throwable v9_5) {
                        v0_2 = v10_2;
                        v1_1 = v2_5;
                        Throwable v10_1 = v9_5;
                        v9_8 = 0;
                        if (v9_8 != null) {
                            v9_8.release();
                        }
                        throw v10_1;
                    }
                    if (v4_1 != v1_2) {
                        v4_2 = p9;
                        v9_6 = v2_5;
                        v2_7 = v10_2;
                        v10_3 = v4_1;
                        Throwable v10_5 = ((java.nio.channels.FileLock) v10_3);
                        try {
                            v0_6.a = v2_7;
                            v0_6.b = v9_6;
                            v0_6.c = v10_5;
                            v0_6.f = 3;
                            Throwable v0_8 = v4_2.invoke(v0_6);
                        } catch (Throwable v0_9) {
                            v1_1 = v9_6;
                            v9_8 = v10_5;
                            v10_1 = v0_9;
                            v0_2 = v2_7;
                        }
                        if (v0_8 != v1_2) {
                            v1_1 = v9_6;
                            v9_8 = v10_5;
                            v10_3 = v0_8;
                            v0_2 = v2_7;
                            if (v9_8 != null) {
                                v9_8.release();
                            }
                            try {
                                j5.t1.f(v1_1, 0);
                                Throwable v0_4 = ((m8.c) v0_2);
                                v0_4.f(0);
                                return v10_3;
                            } catch (Throwable v9_2) {
                                v10_2 = v0_4;
                            }
                        } else {
                            return v1_2;
                        }
                    }
                }
            } else {
                if (v2_0 == 1) {
                    Throwable v9_4 = ((m8.a) v0_6.c);
                    Throwable v2_3 = ((u7.l) v0_6.b);
                    v5_1 = ((a1.z0) v0_6.a);
                    c4.b.e0(v10_3);
                    v10_2 = v9_4;
                    p9 = v2_3;
                } else {
                    if (v2_0 == 2) {
                        v9_6 = ((java.io.Closeable) v0_6.c);
                        v2_7 = ((m8.a) v0_6.b);
                        v4_2 = ((u7.l) v0_6.a);
                        c4.b.e0(v10_3);
                    } else {
                        if (v2_0 != 3) {
                            throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                        } else {
                            v9_8 = ((java.nio.channels.FileLock) v0_6.c);
                            v1_1 = ((java.io.Closeable) v0_6.b);
                            v0_2 = ((m8.a) v0_6.a);
                            try {
                                c4.b.e0(v10_3);
                            } catch (Throwable v10_1) {
                            }
                        }
                    }
                }
            }
        } catch (Throwable v9_2) {
        } catch (Throwable v10_1) {
            v1_1 = v9_6;
            v0_2 = v2_7;
        } catch (Throwable v9_1) {
            v10_2 = v0_2;
            try {
                throw v9_1;
            } catch (Throwable v0_3) {
                j5.t1.f(v1_1, v9_1);
                throw v0_3;
            }
        }
        ((m8.c) v10_2).f(0);
        throw v9_2;
    }

    public final Object b(u7.p p18, n7.c p19)
    {
        boolean v3_2;
        if (!(p19 instanceof a1.y0)) {
            v3_2 = new a1.y0(this, p19);
        } else {
            v3_2 = ((a1.y0) p19);
            boolean v4_4 = ((a1.y0) p19).m;
            if ((v4_4 & -2147483648) == 0) {
            } else {
                ((a1.y0) p19).m = (v4_4 - -2147483648);
            }
        }
        boolean v3_1;
        java.io.FileInputStream v2_2;
        java.io.FileInputStream v5_0;
        boolean v4_0;
        Throwable v0_6 = v3_2.e;
        boolean v4_3 = m7.a.a;
        java.io.FileInputStream v5_1 = v3_2.m;
        int v7 = 1;
        try {
            if (v5_1 == null) {
                c4.b.e0(v0_6);
                java.io.FileInputStream v5_2 = this.g;
                boolean v9 = v5_2.e();
                try {
                    if (v9) {
                        java.io.FileInputStream v10_1 = new java.io.FileInputStream(((java.io.File) this.h.getValue()));
                        try {
                            int v11_1 = v10_1.getChannel().tryLock(0, 9223372036854775807, 1);
                        } catch (Throwable v0_12) {
                            int v11_2 = v0_12.getMessage();
                            if (v11_2 == 0) {
                                int v11_4 = v0_12.getMessage();
                                if (v11_4 != 0) {
                                    if (b8.p.p0(v11_4, "Resource deadlock would occur") == 1) {
                                        v11_1 = 0;
                                    }
                                }
                                throw v0_12;
                            } else {
                                if (b8.p.p0(v11_2, this.f) != 1) {
                                } else {
                                }
                            }
                        } catch (Throwable v0_2) {
                            v3_1 = v5_2;
                            v4_0 = 0;
                            v2_2 = v9;
                            v5_0 = v10_1;
                            if (v4_0) {
                                v4_0.release();
                            }
                            throw v0_2;
                        }
                        if (v11_1 == 0) {
                            v7 = 0;
                        }
                        try {
                            Throwable v0_13 = Boolean.valueOf(v7);
                            v3_2.a = v5_2;
                            v3_2.b = v10_1;
                            v3_2.c = v11_1;
                            v3_2.d = v9;
                            v3_2.m = 2;
                            v0_6 = p18.invoke(v0_13, v3_2);
                        } catch (Throwable v0_2) {
                            v3_1 = v5_2;
                            v2_2 = v9;
                            v5_0 = v10_1;
                            v4_0 = v11_1;
                        }
                        if (v0_6 != v4_3) {
                            v3_1 = v5_2;
                            v2_2 = v9;
                            v5_0 = v10_1;
                            v4_0 = v11_1;
                            if (v4_0) {
                                v4_0.release();
                            }
                            j5.t1.f(v5_0, 0);
                            if (v2_2 != null) {
                                v3_1.f(0);
                            }
                            return v0_6;
                        }
                    } else {
                        v3_2.a = v5_2;
                        v3_2.d = v9;
                        v3_2.m = 1;
                        v0_6 = p18.invoke(Boolean.FALSE, v3_2);
                        if (v0_6 != v4_3) {
                            v3_1 = v5_2;
                            v2_2 = v9;
                            if (v2_2 != null) {
                                v3_1.f(0);
                            }
                            return v0_6;
                        }
                    }
                } catch (Throwable v0_5) {
                    v3_1 = v5_2;
                    v2_2 = v9;
                }
                return v4_3;
            } else {
                if (v5_1 == 1) {
                    v2_2 = v3_2.d;
                    v3_1 = v3_2.a;
                    c4.b.e0(v0_6);
                } else {
                    if (v5_1 != 2) {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    } else {
                        v2_2 = v3_2.d;
                        v4_0 = v3_2.c;
                        v5_0 = v3_2.b;
                        v3_1 = v3_2.a;
                        try {
                            c4.b.e0(v0_6);
                        } catch (Throwable v0_2) {
                        }
                    }
                }
            }
        } catch (Throwable v0_5) {
        } catch (Throwable v0_3) {
            boolean v4_1 = v3_1;
            boolean v3_3 = v2_2;
            java.io.FileInputStream v2_3 = v0_3;
            try {
                throw v2_3;
            } catch (Throwable v0_4) {
                try {
                    j5.t1.f(v5_0, v2_3);
                    throw v0_4;
                } catch (Throwable v0_5) {
                    v2_2 = v3_3;
                    v3_1 = v4_1;
                    if (v2_2 != null) {
                        v3_1.f(0);
                    }
                    throw v0_5;
                }
            }
        }
    }

    public final Object c(a1.f0 p5)
    {
        if (this.i.b == h7.k.a) {
            return d8.f0.x(this.a, new a1.v0(this, 0, 1), p5);
        } else {
            return new Integer(a1.g1.b.nativeIncrementAndGetCounterValue(((a1.g1) this.i.getValue()).a));
        }
    }

    public final g8.c d()
    {
        return this.c;
    }

    public final Object e(n7.c p5)
    {
        if (this.i.b == h7.k.a) {
            return d8.f0.x(this.a, new a1.v0(this, 0, 0), p5);
        } else {
            return new Integer(a1.g1.b.nativeGetCounterValue(((a1.g1) this.i.getValue()).a));
        }
    }
}
