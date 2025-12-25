package okhttp3.internal.http;
public final class CallServerInterceptor implements okhttp3.Interceptor {
    public static final okhttp3.internal.http.CallServerInterceptor a;

    static CallServerInterceptor()
    {
        okhttp3.internal.http.CallServerInterceptor.a = new okhttp3.internal.http.CallServerInterceptor();
        return;
    }

    private CallServerInterceptor()
    {
        return;
    }

    public final okhttp3.Response a(okhttp3.internal.http.RealInterceptorChain p24)
    {
        long v5_4;
        String v3_0 = p24.d;
        kotlin.jvm.internal.j.b(v3_0);
        okhttp3.internal.http.ExchangeCodec v9 = v3_0.d;
        long v10_1 = v3_0.b;
        StringBuilder v2_19 = v3_0.a;
        okhttp3.Request v11 = p24.e;
        String v0_22 = v11.c;
        okhttp3.Response v4_6 = v11.d;
        long v12 = System.currentTimeMillis();
        int v14 = 0;
        if ((!okhttp3.internal.http.HttpMethod.a(v11.b)) || (v4_6 == null)) {
            v5_4 = 0;
        } else {
            v5_4 = 1;
        }
        boolean v16 = "upgrade".equalsIgnoreCase(v0_22.b("Connection"));
        try {
            int v15_0;
            int v22;
            int v19;
            long v5_0;
            v10_1.w(v2_19);
            v9.b(v11);
            v10_1.v(v2_19, v11);
        } catch (String v0_18) {
            v22 = "Connection";
            v15_0 = "upgrade";
            v10_1.u(v2_19, v0_18);
            v3_0.f(v0_18);
            throw v0_18;
        } catch (String v0_2) {
            v5_0 = 0;
            v19 = 1;
            if ((v0_2 instanceof okhttp3.internal.http2.ConnectionShutdownException)) {
                throw v0_2;
            } else {
                if (!v3_0.e) {
                    throw v0_2;
                } else {
                    okhttp3.Response v4_0 = v0_2;
                    if (v5_0 == 0) {
                        v5_0 = v3_0.e(0);
                        kotlin.jvm.internal.j.b(v5_0);
                        if (v19 != 0) {
                            v10_1.B(v2_19);
                            v19 = 0;
                        }
                    }
                    v5_0.a = v11;
                    v5_0.e = v3_0.c().f;
                    v5_0.l = v12;
                    v5_0.m = System.currentTimeMillis();
                    String v0_8 = v5_0.a();
                    long v5_3 = v0_8.d;
                    while(true) {
                        long v6_1 = v0_8.m;
                        if ((v5_3 != 100) && ((102 > v5_3) || (v5_3 >= 200))) {
                            break;
                        }
                        String v0_16 = v3_0.e(0);
                        kotlin.jvm.internal.j.b(v0_16);
                        if (v19 != 0) {
                            v10_1.B(v2_19);
                        }
                        v0_16.a = v11;
                        v0_16.e = v3_0.c().f;
                        v0_16.l = v12;
                        v0_16.m = System.currentTimeMillis();
                        v0_8 = v0_16.a();
                        v5_3 = v0_8.d;
                    }
                    StringBuilder v2_1;
                    v10_1.A(v2_19, v0_8);
                    if (v5_3 != 101) {
                        v2_1 = 0;
                    } else {
                        v2_1 = 1;
                    }
                    if (v2_1 != null) {
                        int v7_5;
                        if (v3_0.c().p == null) {
                            v7_5 = 0;
                        } else {
                            v7_5 = 1;
                        }
                        if (v7_5 != 0) {
                            throw new java.net.ProtocolException("Unexpected 101 code on HTTP/2 connection");
                        } else {
                        }
                    }
                    int v7_6;
                    if (v2_1 == null) {
                        v7_6 = v22;
                    } else {
                        v7_6 = v22;
                        StringBuilder v2_3 = v0_8.f.b(v7_6);
                        if (v2_3 == null) {
                            v2_3 = 0;
                        }
                        if (v15_0.equalsIgnoreCase(v2_3)) {
                            v14 = 1;
                        }
                    }
                    if ((!v16) || (v14 == 0)) {
                        StringBuilder v2_5 = v3_0.d(v0_8);
                        String v0_11 = v0_8.c();
                        v0_11.g = v2_5;
                        v0_11.o = new okhttp3.internal.http.CallServerInterceptor$intercept$1();
                        String v0_12 = v0_11.a();
                    } else {
                        String v0_13 = v0_8.c();
                        v0_13.g = new okhttp3.internal.UnreadableResponseBody(v6_1.f(), v6_1.c());
                        v0_13.h = v3_0.g();
                        v0_12 = v0_13.a();
                    }
                    if ("close".equalsIgnoreCase(v0_12.a.c.b(v7_6))) {
                        v9.h().h();
                    } else {
                        StringBuilder v2_16 = v0_12.f.b(v7_6);
                        if (v2_16 == null) {
                            v2_16 = 0;
                        }
                        if ("close".equalsIgnoreCase(v2_16)) {
                        }
                    }
                    if (((v5_3 == 204) || (v5_3 == 205)) && (v0_12.m.c() > 0)) {
                        StringBuilder v2_18 = new StringBuilder();
                        v2_18.append("HTTP ");
                        v2_18.append(v5_3);
                        v2_18.append(" had non-zero Content-Length: ");
                        v2_18.append(v0_12.m.c());
                        throw new java.net.ProtocolException(v2_18.toString());
                    } else {
                        return v0_12;
                    }
                }
            }
        }
        if (v5_4 == 0) {
            v22 = "Connection";
            v15_0 = "upgrade";
            v2_19.h(v3_0, 1, 0, 0, 0, 0);
            v5_0 = 0;
            v19 = 1;
        } else {
            try {
                int v18;
                if (!"100-continue".equalsIgnoreCase(v0_22.b("Expect"))) {
                    v19 = 1;
                    v18 = 0;
                } else {
                    try {
                        v9.d();
                    } catch (String v0_21) {
                        v10_1.u(v2_19, v0_21);
                        v3_0.f(v0_21);
                        throw v0_21;
                    } catch (String v0_2) {
                        v22 = "Connection";
                        v19 = 1;
                        v5_0 = 0;
                        v15_0 = "upgrade";
                    }
                    v5_0 = v3_0.e(1);
                    try {
                        v10_1.B(v2_19);
                        v18 = v5_0;
                        v19 = 0;
                    } catch (String v0_2) {
                        v22 = "Connection";
                        v19 = 1;
                    }
                }
            } catch (String v0_2) {
                v22 = "Connection";
                v15_0 = "upgrade";
            }
            if (v18 != 0) {
                v22 = "Connection";
                v15_0 = "upgrade";
                try {
                    String v0_25;
                    v2_19.h(v3_0, 1, 0, 0, 0, 0);
                } catch (String v0_2) {
                    v5_0 = v18;
                }
                if (v3_0.c().p == null) {
                    v0_25 = 0;
                } else {
                    v0_25 = 1;
                }
                if (v0_25 == null) {
                    v9.h().h();
                }
            } else {
                try {
                    v4_6.getClass();
                    String v0_4 = x8.b.b(v3_0.b(v11));
                    v4_6.d(v0_4);
                    v0_4.close();
                    v22 = "Connection";
                    v15_0 = "upgrade";
                } catch (String v0_2) {
                    v22 = "Connection";
                    v15_0 = "upgrade";
                }
            }
            v5_0 = v18;
        }
        try {
            v9.a();
            v4_0 = 0;
        } catch (String v0_5) {
            try {
                v10_1.u(v2_19, v0_5);
                v3_0.f(v0_5);
                throw v0_5;
            } catch (String v0_2) {
            }
        }
    }
}
