package a1;
public class i0 implements a1.a {
    public final java.io.File a;
    public final a1.f1 b;
    public final java.util.concurrent.atomic.AtomicBoolean c;

    public i0(java.io.File p2, a1.f1 p3)
    {
        kotlin.jvm.internal.j.e(p3, "serializer");
        this.a = p2;
        this.b = p3;
        this.c = new java.util.concurrent.atomic.AtomicBoolean(0);
        return;
    }

    public static Object a(a1.i0 p7, n7.c p8)
    {
        Throwable v0_2;
        if (!(p8 instanceof a1.h0)) {
            v0_2 = new a1.h0(p7, p8);
        } else {
            v0_2 = ((a1.h0) p8);
            m7.a v1_2 = ((a1.h0) p8).e;
            if ((v1_2 & -2147483648) == 0) {
            } else {
                ((a1.h0) p8).e = (v1_2 - -2147483648);
            }
        }
        java.io.FileInputStream v2_5;
        Throwable v7_3;
        Throwable v8_1 = v0_2.c;
        m7.a v1_1 = m7.a.a;
        java.io.FileInputStream v2_0 = v0_2.e;
        try {
            if (v2_0 == null) {
                c4.b.e0(v8_1);
                if (p7.c.get()) {
                    throw new IllegalStateException("This scope has already been closed.");
                } else {
                    Throwable v8_6 = new java.io.FileInputStream(p7.a);
                    try {
                        java.io.FileInputStream v2_2 = p7.b;
                        v0_2.a = p7;
                        v0_2.b = v8_6;
                        v0_2.e = 1;
                        java.io.FileInputStream v2_3 = v2_2.c(v8_6);
                    } catch (java.io.FileInputStream v2_4) {
                        v2_5 = p7;
                        v7_3 = v8_6;
                        Throwable v8_7 = v2_4;
                        try {
                            throw v8_7;
                        } catch (Throwable v4_1) {
                            j5.t1.f(v7_3, v8_7);
                            throw v4_1;
                        }
                    }
                    if (v2_3 != v1_1) {
                        v2_5 = p7;
                        v7_3 = v8_6;
                        v8_1 = v2_3;
                        j5.t1.f(v7_3, 0);
                        return v8_1;
                    } else {
                        return v1_1;
                    }
                }
            } else {
                if (v2_0 == 1) {
                    v7_3 = v0_2.b;
                    v2_5 = ((a1.i0) v0_2.a);
                    try {
                        c4.b.e0(v8_1);
                    } catch (Throwable v8_7) {
                    }
                    j5.t1.f(v7_3, 0);
                    return v8_1;
                } else {
                    if (v2_0 != 2) {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    } else {
                        Throwable v7_8 = ((java.io.Closeable) v0_2.a);
                        try {
                            c4.b.e0(v8_1);
                        } catch (Throwable v8_12) {
                            try {
                                throw v8_12;
                            } catch (Throwable v0_4) {
                                j5.t1.f(v7_8, v8_12);
                                throw v0_4;
                            }
                        }
                    }
                }
            }
        } catch (java.io.FileNotFoundException) {
            p7 = v2_5;
            java.io.FileInputStream v2_8 = p7.b;
            if (!p7.a.exists()) {
                return v2_8.b();
            } else {
                Throwable v8_11 = new java.io.FileInputStream(p7.a);
                try {
                    v0_2.a = v8_11;
                    v0_2.b = 0;
                    v0_2.e = 2;
                    Throwable v7_6 = v2_8.c(v8_11);
                } catch (Throwable v7_7) {
                    v8_12 = v7_7;
                    v7_8 = v8_11;
                }
                if (v7_6 != v1_1) {
                    v8_1 = v7_6;
                    v7_8 = v8_11;
                }
            }
        } catch (java.io.FileNotFoundException) {
        }
        j5.t1.f(v7_8, 0);
        return v8_1;
    }

    public final void close()
    {
        this.c.set(1);
        return;
    }
}
