package a1;
public final class o0 implements a1.a {
    public final java.io.File a;
    public final a1.f1 b;
    public final a1.s0 c;
    public final a1.k0 d;
    public final java.util.concurrent.atomic.AtomicBoolean e;
    public final m8.c f;

    public o0(java.io.File p2, a1.f1 p3, a1.s0 p4, a1.k0 p5)
    {
        kotlin.jvm.internal.j.e(p3, "serializer");
        kotlin.jvm.internal.j.e(p4, "coordinator");
        this.a = p2;
        this.b = p3;
        this.c = p4;
        this.d = p5;
        this.e = new java.util.concurrent.atomic.AtomicBoolean(0);
        this.f = m8.d.a();
        return;
    }

    public final Object a(a1.q p8, n7.c p9)
    {
        a1.o0 v0_2;
        if (!(p9 instanceof a1.m0)) {
            v0_2 = new a1.m0(this, p9);
        } else {
            v0_2 = ((a1.m0) p9);
            Throwable v1_2 = ((a1.m0) p9).f;
            if ((v1_2 & -2147483648) == 0) {
            } else {
                ((a1.m0) p9).f = (v1_2 - -2147483648);
            }
        }
        Throwable v1_3;
        m8.c v8_4;
        a1.o0 v0_4;
        Throwable v9_1 = v0_2.d;
        Throwable v1_1 = m7.a.a;
        a1.i0 v2_0 = v0_2.f;
        try {
            if (v2_0 == null) {
                c4.b.e0(v9_1);
                if (this.e.get()) {
                    throw new IllegalStateException("StorageConnection has already been disposed.");
                } else {
                    Throwable v9_6 = this.f.e();
                    try {
                        a1.i0 v2_2 = new a1.i0(this.a, this.b);
                        try {
                            Boolean v5_1 = Boolean.valueOf(v9_6);
                            v0_2.a = this;
                            v0_2.b = v2_2;
                            v0_2.c = v9_6;
                            v0_2.f = 1;
                            m8.c v8_5 = p8.b(v2_2, v5_1, v0_2);
                        } catch (m8.c v8_6) {
                            Throwable v9_8 = v8_6;
                            v8_4 = v9_6;
                            v0_4 = this;
                            v1_3 = v2_2;
                            try {
                                v1_3.close();
                            } catch (Throwable v1_4) {
                                q4.b.a(v9_8, v1_4);
                            }
                            throw v9_8;
                        }
                        if (v8_5 != v1_1) {
                            v9_1 = v8_5;
                            v8_4 = v9_6;
                            v0_4 = this;
                            v1_3 = v2_2;
                            try {
                                v1_3.close();
                                Throwable v1_5 = 0;
                            } catch (Throwable v1_5) {
                            }
                            if (v1_5 != null) {
                                throw v1_5;
                            } else {
                                if (v8_4 != null) {
                                    v0_4.f.f(0);
                                }
                                return v9_1;
                            }
                        } else {
                            return v1_1;
                        }
                    } catch (m8.c v8_3) {
                        Throwable v9_7 = v8_3;
                        v8_4 = v9_6;
                        v0_4 = this;
                    }
                }
            } else {
                if (v2_0 != 1) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                } else {
                    v8_4 = v0_2.c;
                    v1_3 = v0_2.b;
                    v0_4 = v0_2.a;
                    try {
                        c4.b.e0(v9_1);
                    } catch (Throwable v9_8) {
                    }
                }
            }
        } catch (Throwable v9_7) {
        }
        if (v8_4 != null) {
            v0_4.f.f(0);
        }
        throw v9_7;
    }

    public final Object b(a1.f0 p13, n7.c p14)
    {
        a1.o0 v1_1;
        if (!(p14 instanceof a1.n0)) {
            v1_1 = new a1.n0(this, p14);
        } else {
            v1_1 = ((a1.n0) p14);
            Throwable v2_4 = ((a1.n0) p14).m;
            if ((v2_4 & -2147483648) == 0) {
            } else {
                ((a1.n0) p14).m = (v2_4 - -2147483648);
            }
        }
        java.io.IOException v13_1;
        m8.c v3_1;
        java.nio.file.CopyOption[] v7_1;
        Throwable v2_1;
        a1.o0 v1_2;
        String v14_4 = v1_1.e;
        Throwable v2_3 = m7.a.a;
        m8.c v3_2 = v1_1.m;
        int v5 = 1;
        try {
            if (v3_2 == null) {
                c4.b.e0(v14_4);
                if (this.e.get()) {
                    throw new IllegalStateException("StorageConnection has already been disposed.");
                } else {
                    String v14_12 = this.a;
                    m8.c v3_6 = v14_12.getCanonicalFile().getParentFile();
                    if (v3_6 != null) {
                        v3_6.mkdirs();
                        if (!v3_6.isDirectory()) {
                            String v0_6 = new StringBuilder("Unable to create parent directories of ");
                            v0_6.append(v14_12);
                            throw new java.io.IOException(v0_6.toString());
                        }
                    }
                    v1_1.a = this;
                    v1_1.b = p13;
                    String v14_14 = this.f;
                    v1_1.c = v14_14;
                    v1_1.m = 1;
                    if (v14_14.d(v1_1) != v2_3) {
                        v7_1 = this;
                        v3_1 = v14_14;
                        java.nio.file.StandardCopyOption v8_2 = new StringBuilder();
                        v8_2.append(v7_1.a.getAbsolutePath());
                        v8_2.append(".tmp");
                        String v14_8 = new java.io.File(v8_2.toString());
                        try {
                            a1.f1 v9_3 = v7_1.b;
                            kotlin.jvm.internal.j.e(v9_3, "serializer");
                            java.nio.file.StandardCopyOption v8_5 = new a1.q0(v14_8, v9_3);
                            try {
                                v1_1.a = v7_1;
                                v1_1.b = v3_1;
                                v1_1.c = v14_8;
                                v1_1.d = v8_5;
                                v1_1.m = 2;
                            } catch (java.io.IOException v13_21) {
                                v2_1 = v14_8;
                                String v14_2 = v13_21;
                                v13_1 = v8_5;
                                try {
                                    v13_1.close();
                                } catch (java.io.IOException v13_4) {
                                    q4.b.a(v14_2, v13_4);
                                }
                                throw v14_2;
                            }
                            if (p13.invoke(v8_5, v1_1) != v2_3) {
                                v2_1 = v14_8;
                                v1_2 = v7_1;
                                v13_1 = v8_5;
                                try {
                                    v13_1.close();
                                    java.io.IOException v13_5 = 0;
                                } catch (java.io.IOException v13_5) {
                                }
                                if (v13_5 != null) {
                                    throw v13_5;
                                } else {
                                    if (v2_1.exists()) {
                                        java.io.IOException v13_7 = v1_2.a;
                                        try {
                                            java.nio.file.Path v4_0 = v2_1.toPath();
                                            java.io.IOException v13_8 = v13_7.toPath();
                                            java.nio.file.CopyOption[] v7_0 = new java.nio.file.CopyOption[1];
                                            v7_0[0] = java.nio.file.StandardCopyOption.REPLACE_EXISTING;
                                            java.nio.file.Files.move(v4_0, v13_8, v7_0);
                                        } catch (java.io.IOException) {
                                            v5 = 0;
                                        }
                                        if (v5 == 0) {
                                            String v14_6 = new StringBuilder("Unable to rename ");
                                            v14_6.append(v2_1);
                                            v14_6.append(" to ");
                                            v14_6.append(v1_2.a);
                                            v14_6.append(". This likely means that there are multiple instances of DataStore for this file. Ensure that you are only creating a single instance of datastore for this file.");
                                            throw new java.io.IOException(v14_6.toString());
                                        }
                                    }
                                    ((m8.c) v3_1).f(0);
                                    return h7.l.a;
                                }
                            } else {
                                return v2_3;
                            }
                        } catch (java.io.IOException v13_11) {
                        }
                    }
                }
            } else {
                if (v3_2 == 1) {
                    java.io.IOException v13_19 = ((m8.a) v1_1.c);
                    m8.c v3_11 = ((u7.p) v1_1.b);
                    v7_1 = v1_1.a;
                    c4.b.e0(v14_4);
                    v3_1 = v13_19;
                    p13 = v3_11;
                } else {
                    if (v3_2 != 2) {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    } else {
                        v13_1 = v1_1.d;
                        v2_1 = ((java.io.File) v1_1.c);
                        v3_1 = ((m8.a) v1_1.b);
                        v1_2 = v1_1.a;
                        try {
                            c4.b.e0(v14_4);
                        } catch (String v14_2) {
                        }
                    }
                }
            }
        } catch (java.io.IOException v13_12) {
            ((m8.c) v3_1).f(0);
            throw v13_12;
        } catch (java.io.IOException v13_11) {
            v14_8 = v2_1;
        }
        if (v14_8.exists()) {
            v14_8.delete();
        }
        throw v13_11;
    }

    public final void close()
    {
        this.e.set(1);
        this.d.invoke();
        return;
    }
}
