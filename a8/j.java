package a8;
public final synthetic class j implements u7.a {
    public final synthetic int a;
    public final synthetic Object b;

    public synthetic j(Object p1, int p2)
    {
        this.a = p2;
        this.b = p1;
        return;
    }

    public final Object invoke()
    {
        StringBuilder v2_2 = h7.l.a;
        h7.f v4_11 = 0;
        java.util.ArrayList v5_7 = this.b;
        switch (this.a) {
            case 0:
                return v5_7;
            case 1:
                return androidx.lifecycle.q0.e(((androidx.lifecycle.b1) v5_7));
            case 2:
                java.util.ArrayList v5_4 = ((b2.g) v5_7);
                v5_4.getLifecycle().a(new b2.b(v5_4, 0));
                return v2_2;
            case 3:
                try {
                    Throwable v0_42 = ((java.util.List) ((u7.a) v5_7).invoke());
                } catch (javax.net.ssl.SSLPeerUnverifiedException) {
                    v0_42 = i7.n.a;
                }
                return v0_42;
            case 4:
                return ((java.util.List) v5_7);
            case 5:
                java.util.ArrayList v5_1 = ((okhttp3.internal.http2.Http2Connection) v5_7);
                Class vtmp6 = v5_1.getClass();
                try {
                    v5_1.C.y(2, 0, 0);
                } catch (Throwable v0_25) {
                    v5_1.c(okhttp3.internal.http2.ErrorCode.d, okhttp3.internal.http2.ErrorCode.d, v0_25);
                }
                return v2_2;
            case 6:
                ((r6.h1) v5_7).getClass();
                Throwable v0_1 = java.util.UUID.randomUUID();
                kotlin.jvm.internal.j.d(v0_1, "randomUUID(...)");
                Throwable v0_7 = v0_1.toString();
                kotlin.jvm.internal.j.d(v0_7, "toString(...)");
                return v0_7;
            default:
                java.util.ArrayList v5_6 = ((y8.h) v5_7);
                Throwable v0_52 = v5_6.c;
                StringBuilder v2_9 = v5_6.d;
                java.util.ArrayList v5_9 = v0_52.getResources("");
                kotlin.jvm.internal.j.d(v5_9, "getResources(...)");
                java.util.ArrayList v5_10 = java.util.Collections.list(v5_9);
                kotlin.jvm.internal.j.d(v5_10, "list(...)");
                java.util.ArrayList v8_1 = new java.util.ArrayList();
                x8.y v9_2 = v5_10.size();
                x8.u v10_2 = 0;
                while (v10_2 < v9_2) {
                    x8.b0 v11_18;
                    long v12_14 = v5_10.get(v10_2);
                    v10_2++;
                    long v12_15 = ((java.net.URL) v12_14);
                    kotlin.jvm.internal.j.b(v12_15);
                    if (kotlin.jvm.internal.j.a(v12_15.getProtocol(), "file")) {
                        x8.b0 v11_16 = new java.io.File(v12_15.toURI()).toString();
                        kotlin.jvm.internal.j.d(v11_16, "toString(...)");
                        v11_18 = new h7.f(v2_9, a6.e.d(v11_16));
                    } else {
                        v11_18 = 0;
                    }
                    if (v11_18 != null) {
                        v8_1.add(v11_18);
                    }
                }
                Throwable v0_53 = v0_52.getResources("META-INF/MANIFEST.MF");
                kotlin.jvm.internal.j.d(v0_53, "getResources(...)");
                java.util.ArrayList v5_0 = java.util.Collections.list(v0_53);
                kotlin.jvm.internal.j.d(v5_0, "list(...)");
                java.util.ArrayList v6_2 = new java.util.ArrayList();
                int v7_1 = v5_0.size();
                while (v4_11 < v7_1) {
                    y8.f v18_5;
                    Throwable v19_3;
                    h7.f v4_0 = (v4_11 + 1);
                    Throwable v0_56 = ((java.net.URL) v5_0.get(v4_11));
                    kotlin.jvm.internal.j.b(v0_56);
                    Throwable v0_57 = v0_56.toString();
                    kotlin.jvm.internal.j.d(v0_57, "toString(...)");
                    if (b8.p.p0(v0_57, "jar:file:")) {
                        x8.y v9_6 = b8.i.A0(v0_57, "!");
                        if (v9_6 != -1) {
                            Throwable v0_2 = v0_57.substring(4, v9_6);
                            kotlin.jvm.internal.j.d(v0_2, "substring(...)");
                            Throwable v0_4 = new java.io.File(java.net.URI.create(v0_2)).toString();
                            kotlin.jvm.internal.j.d(v0_4, "toString(...)");
                            x8.y v9_1 = a6.e.d(v0_4);
                            x8.u v10_1 = v2_9.c(v9_1);
                            long v12_2 = (v10_1.size() - ((long) 22));
                            if (v12_2 < 0) {
                                StringBuilder v2_1 = new StringBuilder("not a zip: size=");
                                v2_1.append(v10_1.size());
                                throw new java.io.IOException(v2_1.toString());
                            } else {
                                y8.f v18_0 = v12_2;
                                x8.b0 v11_1 = Math.max((v18_0 - 65536), 0);
                                long v14_3 = v18_0;
                                while(true) {
                                    String v13_0 = x8.b.c(v10_1.c(v14_3));
                                    if (v13_0.f() == 101010256) {
                                        break;
                                    }
                                    Throwable v19_0 = v4_0;
                                    y8.f v18_1 = v5_0;
                                    v13_0.close();
                                    v14_3 += -1;
                                    if (v14_3 < v11_1) {
                                        throw new java.io.IOException("not a zip: end of central directory signature not found");
                                    } else {
                                        v5_0 = v18_1;
                                        v4_0 = v19_0;
                                    }
                                }
                                Throwable v0_15 = (v13_0.s() & 65535);
                                x8.b0 v11_3 = (v13_0.s() & 65535);
                                StringBuilder v24 = v2_9;
                                long v20 = ((long) (v13_0.s() & 65535));
                                if ((v20 != ((long) (v13_0.s() & 65535))) || ((v0_15 != null) || (v11_3 != null))) {
                                    throw new java.io.IOException("unsupported zip: spanned");
                                } else {
                                    v13_0.skip(4);
                                    int v21 = (v13_0.s() & 65535);
                                    y8.f v18_4 = new y8.f(v20, v21, (((long) v13_0.f()) & 4294967295));
                                    Throwable v0_23 = v21;
                                    v13_0.x(((long) v0_23));
                                    v13_0.close();
                                    long v14_4 = (v14_3 - ((long) 20));
                                    if (v14_4 > 0) {
                                        StringBuilder v2_6 = x8.b.c(v10_1.c(v14_4));
                                        if (v2_6.f() != 117853008) {
                                            try {
                                                v2_6.close();
                                                Throwable v0_37 = 0;
                                            } catch (Throwable v0_37) {
                                            }
                                        } else {
                                            x8.b0 v11_9 = v2_6.f();
                                            long v12_8 = v2_6.i();
                                            if ((v2_6.f() != 1) || (v11_9 != null)) {
                                                throw new java.io.IOException("unsupported zip: spanned");
                                            } else {
                                                x8.b0 v11_11 = x8.b.c(v10_1.c(v12_8));
                                                long v12_9 = v11_11.f();
                                                if (v12_9 != 101075792) {
                                                    x8.k0 v1_12 = new StringBuilder();
                                                    v1_12.append("bad zip: expected ");
                                                    v1_12.append(y8.b.c(101075792));
                                                    v1_12.append(" but was ");
                                                    v1_12.append(y8.b.c(v12_9));
                                                    throw new java.io.IOException(v1_12.toString());
                                                } else {
                                                    v11_11.skip(12);
                                                    long v12_12 = v11_11.f();
                                                    String v13_4 = v11_11.f();
                                                    long v26 = v11_11.i();
                                                    if ((v26 != v11_11.i()) || ((v12_12 != 0) || (v13_4 != null))) {
                                                        throw new java.io.IOException("unsupported zip: spanned");
                                                    } else {
                                                        v11_11.skip(8);
                                                        y8.f v25_1 = new y8.f(v26, v0_23, v11_11.i());
                                                        try {
                                                            v11_11.close();
                                                            Throwable v0_34 = 0;
                                                        } catch (Throwable v0_34) {
                                                        }
                                                        v18_4 = v25_1;
                                                        if (v0_34 != null) {
                                                            throw v0_34;
                                                        } else {
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        if (v0_37 != null) {
                                            throw v0_37;
                                        }
                                    }
                                    Throwable v0_38 = v18_4;
                                    x8.k0 v1_17 = new java.util.ArrayList();
                                    StringBuilder v2_8 = x8.b.c(v10_1.c(v0_38.b));
                                    try {
                                        x8.b0 v11_13 = v0_38.a;
                                        long v14_9 = 0;
                                    } catch (Throwable v0_40) {
                                        v19_3 = v4_0;
                                        v18_5 = v5_0;
                                        h7.f v4_8 = v0_40;
                                        try {
                                            v2_8.close();
                                        } catch (Throwable v0_45) {
                                            q4.b.a(v4_8, v0_45);
                                        }
                                        Throwable v0_41 = v4_8;
                                        if (v0_41 != null) {
                                            throw v0_41;
                                        } else {
                                            v2_9 = v24;
                                            x8.k0 v1_19 = new x8.k0(v9_1, v2_9, y8.b.b(v1_17));
                                            try {
                                                v10_1.close();
                                            } catch (Throwable) {
                                            }
                                            h7.f v4_10 = new h7.f(v1_19, y8.h.f);
                                        }
                                    }
                                    while (v14_9 < v11_13) {
                                        String v13_6 = y8.b.d(v2_8);
                                        v19_3 = v4_0;
                                        v18_5 = v5_0;
                                        if (v13_6.h >= v0_38.b) {
                                            throw new java.io.IOException("bad zip: local file header offset >= central directory offset");
                                        } else {
                                            if (c5.c.k(v13_6.a)) {
                                                v1_17.add(v13_6);
                                            }
                                            v14_9++;
                                            v5_0 = v18_5;
                                            v4_0 = v19_3;
                                        }
                                    }
                                    v19_3 = v4_0;
                                    v18_5 = v5_0;
                                    try {
                                        v2_8.close();
                                        v0_41 = 0;
                                    } catch (Throwable v0_41) {
                                    }
                                }
                            }
                        } else {
                            v19_3 = v4_0;
                            v18_5 = v5_0;
                            v4_10 = 0;
                        }
                    }
                    if (v4_10 != null) {
                        v6_2.add(v4_10);
                    }
                    v5_0 = v18_5;
                    v4_11 = v19_3;
                }
                return i7.i.e0(v8_1, v6_2);
        }
    }
}
