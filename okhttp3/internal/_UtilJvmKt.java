package okhttp3.internal;
public final class _UtilJvmKt {
    public static final java.util.TimeZone a;
    public static final String b;

    static _UtilJvmKt()
    {
        String v0_2 = java.util.TimeZone.getTimeZone("GMT");
        kotlin.jvm.internal.j.b(v0_2);
        okhttp3.internal._UtilJvmKt.a = v0_2;
        String v0_1 = b8.i.D0(okhttp3.OkHttpClient.getName(), "okhttp3.");
        if (b8.p.l0(v0_1, "Client", 0)) {
            v0_1 = v0_1.substring(0, (v0_1.length() - 6));
            kotlin.jvm.internal.j.d(v0_1, "substring(...)");
        }
        okhttp3.internal._UtilJvmKt.b = v0_1;
        return;
    }

    public static final boolean a(okhttp3.HttpUrl p2, okhttp3.HttpUrl p3)
    {
        kotlin.jvm.internal.j.e(p2, "<this>");
        kotlin.jvm.internal.j.e(p3, "other");
        if ((!kotlin.jvm.internal.j.a(p2.d, p3.d)) || ((p2.e != p3.e) || (!kotlin.jvm.internal.j.a(p2.a, p3.a)))) {
            return 0;
        } else {
            return 1;
        }
    }

    public static final void b(java.net.Socket p2)
    {
        kotlin.jvm.internal.j.e(p2, "<this>");
        try {
            p2.close();
        } catch (RuntimeException v2_1) {
            throw v2_1;
        } catch (Exception) {
        } catch (RuntimeException v2_2) {
            if (!kotlin.jvm.internal.j.a(v2_2.getMessage(), "bio == null")) {
                throw v2_2;
            } else {
                return;
            }
        }
        return;
    }

    public static final varargs String c(String p2, Object[] p3)
    {
        kotlin.jvm.internal.j.e(p2, "format");
        Object[] v3_1 = java.util.Arrays.copyOf(p3, p3.length);
        return String.format(java.util.Locale.US, p2, java.util.Arrays.copyOf(v3_1, v3_1.length));
    }

    public static final long d(okhttp3.Response p3)
    {
        String v3_2 = p3.f.b("Content-Length");
        long v0_1 = -1;
        try {
            if (v3_2 != null) {
                v0_1 = Long.parseLong(v3_2);
            }
        } catch (NumberFormatException) {
        }
        return v0_1;
    }

    public static final java.nio.charset.Charset e(x8.i p1, java.nio.charset.Charset p2)
    {
        kotlin.jvm.internal.j.e(p1, "<this>");
        kotlin.jvm.internal.j.e(p2, "default");
        java.nio.charset.Charset v1_10 = p1.m(okhttp3.internal._UtilCommonKt.b);
        if (v1_10 == -1) {
            return p2;
        } else {
            if (v1_10 == null) {
                return b8.a.a;
            } else {
                if (v1_10 == 1) {
                    return b8.a.b;
                } else {
                    if (v1_10 == 2) {
                        java.nio.charset.Charset v1_3 = b8.a.e;
                        if (v1_3 == null) {
                            v1_3 = java.nio.charset.Charset.forName("UTF-32LE");
                            kotlin.jvm.internal.j.d(v1_3, "forName(...)");
                            b8.a.e = v1_3;
                        }
                        return v1_3;
                    } else {
                        if (v1_10 == 3) {
                            return b8.a.c;
                        } else {
                            if (v1_10 != 4) {
                                throw new AssertionError();
                            } else {
                                java.nio.charset.Charset v1_8 = b8.a.f;
                                if (v1_8 == null) {
                                    v1_8 = java.nio.charset.Charset.forName("UTF-32BE");
                                    kotlin.jvm.internal.j.d(v1_8, "forName(...)");
                                    b8.a.f = v1_8;
                                }
                                return v1_8;
                            }
                        }
                    }
                }
            }
        }
    }

    public static final boolean f(x8.h0 p12, int p13)
    {
        long v6_0;
        int v0_0 = java.util.concurrent.TimeUnit.MILLISECONDS;
        kotlin.jvm.internal.j.e(v0_0, "timeUnit");
        long v1_2 = System.nanoTime();
        if (!p12.b().e()) {
            v6_0 = 9223372036854775807;
        } else {
            v6_0 = (p12.b().c() - v1_2);
        }
        p12.b().d((Math.min(v6_0, v0_0.toNanos(((long) p13))) + v1_2));
        try {
            long v13_2 = new x8.g();
        } catch (java.io.InterruptedIOException) {
            if (v6_0 != 9223372036854775807) {
                p12.b().d((v1_2 + v6_0));
            } else {
                p12.b().a();
            }
            return 0;
        } catch (long v13_3) {
            if (v6_0 != 9223372036854775807) {
                p12.b().d((v1_2 + v6_0));
            } else {
                p12.b().a();
            }
            throw v13_3;
        }
        while (p12.t(v13_2, 8192) != -1) {
            v13_2.s();
        }
        if (v6_0 != 9223372036854775807) {
            p12.b().d((v1_2 + v6_0));
            return 1;
        } else {
            p12.b().a();
            return 1;
        }
    }

    public static final okhttp3.Headers g(java.util.List p3)
    {
        okhttp3.Headers$Builder v0_1 = new okhttp3.Headers$Builder();
        okhttp3.Headers v3_1 = p3.iterator();
        while (v3_1.hasNext()) {
            String v1_1 = ((okhttp3.internal.http2.Header) v3_1.next());
            v0_1.b(v1_1.a.r(), v1_1.b.r());
        }
        return v0_1.c();
    }

    public static final String h(okhttp3.HttpUrl p4, boolean p5)
    {
        kotlin.jvm.internal.j.e(p4, "<this>");
        int v0_1 = p4.e;
        String v1_1 = p4.d;
        if (b8.i.s0(v1_1, ":")) {
            StringBuilder v2_0 = new StringBuilder("[");
            v2_0.append(v1_1);
            v2_0.append(93);
            v1_1 = v2_0.toString();
        }
        if (p5 == 0) {
            String v4_1 = p4.a;
            okhttp3.HttpUrl.j.getClass();
            if (v0_1 == okhttp3.HttpUrl$Companion.a(v4_1)) {
                return v1_1;
            }
        }
        String v4_4 = new StringBuilder();
        v4_4.append(v1_1);
        v4_4.append(58);
        v4_4.append(v0_1);
        return v4_4.toString();
    }

    public static final java.util.List i(java.util.List p2)
    {
        kotlin.jvm.internal.j.e(p2, "<this>");
        if (!p2.isEmpty()) {
            if (p2.size() != 1) {
                java.util.List v2_1 = p2.toArray();
                kotlin.jvm.internal.j.d(v2_1, "toArray(...)");
                java.util.List v2_3 = java.util.Collections.unmodifiableList(i7.h.V(v2_1));
                kotlin.jvm.internal.j.d(v2_3, "unmodifiableList(...)");
                return v2_3;
            } else {
                java.util.List v2_5 = java.util.Collections.singletonList(p2.get(0));
                kotlin.jvm.internal.j.d(v2_5, "singletonList(...)");
                return v2_5;
            }
        } else {
            return i7.n.a;
        }
    }

    public static final java.util.List j(Object[] p2)
    {
        if ((p2 != null) && (p2.length != 0)) {
            if (p2.length != 1) {
                java.util.List v2_2 = java.util.Collections.unmodifiableList(i7.h.V(((Object[]) p2.clone())));
                kotlin.jvm.internal.j.d(v2_2, "unmodifiableList(...)");
                return v2_2;
            } else {
                java.util.List v2_4 = java.util.Collections.singletonList(p2[0]);
                kotlin.jvm.internal.j.d(v2_4, "singletonList(...)");
                return v2_4;
            }
        } else {
            return i7.n.a;
        }
    }
}
