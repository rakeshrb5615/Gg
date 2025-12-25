package z8;
public final class z implements z8.d {
    public final z8.p0 a;
    public final Object b;
    public final Object[] c;
    public final okhttp3.Call$Factory d;
    public final z8.m e;
    public volatile boolean f;
    public okhttp3.Call m;
    public Throwable n;
    public boolean o;

    public z(z8.p0 p1, Object p2, Object[] p3, okhttp3.Call$Factory p4, z8.m p5)
    {
        this.a = p1;
        this.b = p2;
        this.c = p3;
        this.d = p4;
        this.e = p5;
        return;
    }

    public final okhttp3.Call a()
    {
        IllegalStateException v0_0 = this.a;
        String v1_0 = v0_0.j;
        okhttp3.RequestBody$Companion$toRequestBody$3 v2_4 = this.c;
        okhttp3.RequestBody$Companion$toRequestBody$3 v3_4 = v2_4.length;
        if (v3_4 != v1_0.length) {
            okhttp3.RequestBody$Companion$toRequestBody$3 v2_0 = v1.a.p("Argument count (", v3_4, ") doesn\'t match expected count (");
            v2_0.append(v1_0.length);
            v2_0.append(")");
            throw new IllegalArgumentException(v2_0.toString());
        } else {
            z8.n0 v5_1 = new z8.n0(v0_0.c, v0_0.b, v0_0.d, v0_0.e, v0_0.f, v0_0.g, v0_0.h, v0_0.i);
            if (v0_0.k) {
                v3_4--;
            }
            java.util.ArrayList v4_2 = new java.util.ArrayList(v3_4);
            long v7_3 = 0;
            while (v7_3 < v3_4) {
                v4_2.add(v2_4[v7_3]);
                v1_0[v7_3].a(v5_1, v2_4[v7_3]);
                v7_3++;
            }
            String v1_13;
            String v1_10 = v5_1.d;
            if (v1_10 == null) {
                String v1_11 = v5_1.c;
                okhttp3.RequestBody$Companion$toRequestBody$3 v2_5 = v5_1.b;
                v2_5.getClass();
                kotlin.jvm.internal.j.e(v1_11, "link");
                String v1_12 = v2_5.f(v1_11);
                if (v1_12 == null) {
                    v1_13 = 0;
                } else {
                    v1_13 = v1_12.a();
                }
                if (v1_13 == null) {
                    String v1_15 = new StringBuilder("Malformed URL. Base: ");
                    v1_15.append(v2_5);
                    v1_15.append(", Relative: ");
                    v1_15.append(v5_1.c);
                    throw new IllegalArgumentException(v1_15.toString());
                }
            } else {
                v1_13 = v1_10.a();
            }
            okhttp3.RequestBody$Companion$toRequestBody$3 v2_1 = v5_1.k;
            if (v2_1 == null) {
                okhttp3.RequestBody$Companion$toRequestBody$3 v3_7 = v5_1.j;
                if (v3_7 == null) {
                    okhttp3.RequestBody$Companion$toRequestBody$3 v3_8 = v5_1.i;
                    if (v3_8 == null) {
                        if (v5_1.h) {
                            okhttp3.RequestBody$Companion$toRequestBody$3 v2_9 = new byte[0];
                            okhttp3.RequestBody.a.getClass();
                            long v7_5 = ((long) 0);
                            okhttp3.internal._UtilCommonKt.a(v7_5, v7_5, v7_5);
                            v2_1 = new okhttp3.RequestBody$Companion$toRequestBody$3(0, v2_9);
                        }
                    } else {
                        okhttp3.RequestBody$Companion$toRequestBody$3 v2_10 = v3_8.c;
                        if (v2_10.isEmpty()) {
                            throw new IllegalStateException("Multipart body must have at least one part.");
                        } else {
                            v2_1 = new okhttp3.MultipartBody(v3_8.a, v3_8.b, okhttp3.internal._UtilJvmKt.i(v2_10));
                        }
                    }
                } else {
                    v2_1 = new okhttp3.FormBody(v3_7.a, v3_7.b);
                }
            }
            okhttp3.RequestBody$Companion$toRequestBody$3 v3_1 = v5_1.g;
            okhttp3.MultipartBody v6_1 = v5_1.f;
            if (v3_1 != null) {
                if (v2_1 == null) {
                    v6_1.a("Content-Type", v3_1.a);
                } else {
                    v2_1 = new z8.m0(v2_1, v3_1);
                }
            }
            okhttp3.RequestBody$Companion$toRequestBody$3 v3_3 = v5_1.e;
            v3_3.getClass();
            v3_3.a = v1_13;
            v3_3.c = v6_1.c().d();
            v3_3.b(v5_1.a, v2_1);
            v3_3.e = v3_3.e.b(kotlin.jvm.internal.s.a(z8.t), new z8.t(this.b, v0_0.a, v4_2));
            return this.d.a(new okhttp3.Request(v3_3));
        }
    }

    public final okhttp3.Call b()
    {
        Error v0_0 = this.m;
        if (v0_0 == null) {
            Error v0_3 = this.n;
            if (v0_3 == null) {
                try {
                    Error v0_6 = this.a();
                    this.m = v0_6;
                    return v0_6;
                } catch (Error v0_1) {
                    z8.z0.r(v0_1);
                    this.n = v0_1;
                    throw v0_1;
                } catch (Error v0_1) {
                } catch (Error v0_1) {
                }
            } else {
                if ((v0_3 instanceof java.io.IOException)) {
                    throw ((java.io.IOException) v0_3);
                } else {
                    if (!(v0_3 instanceof RuntimeException)) {
                        throw ((Error) v0_3);
                    } else {
                        throw ((RuntimeException) v0_3);
                    }
                }
            }
        } else {
            return v0_0;
        }
    }

    public final declared_synchronized okhttp3.Request c()
    {
        try {
            return this.b().c();
        } catch (Throwable v0_3) {
            throw new RuntimeException("Unable to create request.", v0_3);
        } catch (Throwable v0_1) {
            throw v0_1;
        }
    }

    public final void cancel()
    {
        this.f = 1;
        Throwable v0_1 = this.m;
        if (v0_1 != null) {
            v0_1.cancel();
        }
        return;
    }

    public final Object clone()
    {
        return new z8.z(this.a, this.b, this.c, this.d, this.e);
    }

    public final z8.d clone()
    {
        return new z8.z(this.a, this.b, this.c, this.d, this.e);
    }

    public final z8.q0 d(okhttp3.Response p9)
    {
        java.io.IOException v0_0 = p9.m;
        IllegalArgumentException v9_2 = p9.c();
        v9_2.g = new z8.y(v0_0.f(), v0_0.c());
        IllegalArgumentException v9_1 = v9_2.a();
        z8.q0 v1_0 = v9_1.v;
        z8.x v2_0 = v9_1.d;
        if ((v2_0 >= 200) && (v2_0 < 300)) {
            if ((v2_0 != 204) && (v2_0 != 205)) {
                z8.x v2_2 = new z8.x(v0_0);
                try {
                    Object vtmp10 = this.e.e(v2_2);
                } catch (IllegalArgumentException v9_5) {
                    java.io.IOException v0_3 = v2_2.f;
                    if (v0_3 != null) {
                        throw v0_3;
                    } else {
                        throw v9_5;
                    }
                }
                if (v1_0 == null) {
                    throw new IllegalArgumentException("rawResponse must be successful response");
                } else {
                    return new z8.q0(v9_1, vtmp10, 0);
                }
            } else {
                v0_0.close();
                if (v1_0 == null) {
                    throw new IllegalArgumentException("rawResponse must be successful response");
                } else {
                    return new z8.q0(v9_1, 0, 0);
                }
            }
        } else {
            try {
                z8.x v2_5 = new x8.g();
                v0_0.i().p(v2_5);
                int v3_5 = v0_0.f();
                String v5_1 = v0_0.c();
                okhttp3.ResponseBody.b.getClass();
                okhttp3.ResponseBody$Companion$asResponseBody$1 v7_2 = new okhttp3.ResponseBody$Companion$asResponseBody$1(v3_5, v5_1, v2_5);
            } catch (IllegalArgumentException v9_10) {
                v0_0.close();
                throw v9_10;
            }
            if (v1_0 != null) {
                throw new IllegalArgumentException("rawResponse should not be successful response");
            } else {
                z8.q0 v1_6 = new z8.q0(v9_1, 0, v7_2);
                v0_0.close();
                return v1_6;
            }
        }
    }

    public final void f(z8.g p5)
    {
        if (this.o) {
            throw new IllegalStateException("Already executed.");
        } else {
            this.o = 1;
            okhttp3.Call v0_1 = this.m;
            n0.a v1_0 = this.n;
            if ((v0_1 == null) && (v1_0 == null)) {
                try {
                    int v2_0 = this.a();
                    this.m = v2_0;
                    v0_1 = v2_0;
                } catch (n0.a v1_0) {
                    z8.z0.r(v1_0);
                    this.n = v1_0;
                }
            }
            if (v1_0 == null) {
                if (this.f) {
                    v0_1.cancel();
                }
                v0_1.i(new n0.a(this, p5, 18, 0));
                return;
            } else {
                p5.b(this, v1_0);
                return;
            }
        }
    }

    public final boolean isCanceled()
    {
        int v1 = 1;
        if (!this.f) {
            boolean v0_2 = this.m;
            if ((!v0_2) || (!v0_2.isCanceled())) {
                v1 = 0;
            } else {
            }
            return v1;
        } else {
            return 1;
        }
    }
}
