package okhttp3.internal.publicsuffix;
public final class PublicSuffixDatabase {
    public static final okhttp3.internal.publicsuffix.PublicSuffixDatabase$Companion b;
    public static final x8.j c;
    public static final java.util.List d;
    public static final okhttp3.internal.publicsuffix.PublicSuffixDatabase e;
    public final okhttp3.internal.publicsuffix.AssetPublicSuffixList a;

    static PublicSuffixDatabase()
    {
        okhttp3.internal.publicsuffix.PublicSuffixDatabase.b = new okhttp3.internal.publicsuffix.PublicSuffixDatabase$Companion(0);
        okhttp3.internal.publicsuffix.AssetPublicSuffixList v2_4 = new byte[1];
        v2_4[0] = 42;
        okhttp3.internal.publicsuffix.PublicSuffixDatabase v0_1 = java.util.Arrays.copyOf(v2_4, 1);
        kotlin.jvm.internal.j.d(v0_1, "copyOf(...)");
        okhttp3.internal.publicsuffix.PublicSuffixDatabase.c = new x8.j(v0_1);
        okhttp3.internal.publicsuffix.PublicSuffixDatabase.d = a.a.G("*");
        kotlin.jvm.internal.j.e(okhttp3.internal.publicsuffix.PublicSuffixList.a, "<this>");
        okhttp3.internal.publicsuffix.PublicSuffixDatabase.e = new okhttp3.internal.publicsuffix.PublicSuffixDatabase(new okhttp3.internal.publicsuffix.AssetPublicSuffixList(0));
        return;
    }

    public PublicSuffixDatabase(okhttp3.internal.publicsuffix.AssetPublicSuffixList p1)
    {
        this.a = p1;
        return;
    }

    public static java.util.List b(String p4)
    {
        int v1_0 = new char[1];
        int v2 = 0;
        v1_0[0] = 46;
        java.util.List v4_1 = b8.i.E0(p4, v1_0);
        if (kotlin.jvm.internal.j.a(i7.i.d0(v4_1), "")) {
            int v1_3 = (v4_1.size() - 1);
            if (v1_3 >= 0) {
                v2 = v1_3;
            }
            v4_1 = i7.i.f0(v2, v4_1);
        }
        return v4_1;
    }

    public final String a(String p14)
    {
        String v0_0 = java.net.IDN.toUnicode(p14);
        kotlin.jvm.internal.j.b(v0_0);
        String v0_7 = okhttp3.internal.publicsuffix.PublicSuffixDatabase.b(v0_0);
        java.util.Iterator v1_8 = this.a;
        Object v2_25 = v1_8.b;
        int v5 = 0;
        if ((v2_25.get()) || (!v2_25.compareAndSet(0, 1))) {
            try {
                v1_8.c.await();
            } catch (InterruptedException) {
                Thread.currentThread().interrupt();
            }
        } else {
            Object v2_18 = 0;
            try {
                while(true) {
                    v1_8.c();
                    Thread.interrupted();
                    v2_18 = 1;
                }
            } catch (java.io.InterruptedIOException) {
            } catch (String v3_5) {
                v1_8.f = v3_5;
                if (v2_18 != null) {
                    Thread.currentThread().interrupt();
                }
            } catch (String v14_10) {
                if (v2_18 != null) {
                    Thread.currentThread().interrupt();
                }
                throw v14_10;
            }
            if (v2_18 != null) {
            }
        }
        if (v1_8.d == null) {
            String v0_9 = new StringBuilder("Unable to load ");
            v0_9.append(v1_8.g);
            v0_9.append(" resource.");
            String v14_12 = new IllegalStateException(v0_9.toString());
            v14_12.initCause(v1_8.f);
            throw v14_12;
        } else {
            Object v2_24 = v0_7.size();
            String v3_6 = new x8.j[v2_24];
            int v6_2 = 0;
            while (v6_2 < v2_24) {
                v3_6[v6_2] = v3.f.i(((String) v0_7.get(v6_2)));
                v6_2++;
            }
            int v6_3 = 0;
            while(true) {
                int v9_0;
                okhttp3.internal.publicsuffix.PublicSuffixDatabase$Companion v8 = okhttp3.internal.publicsuffix.PublicSuffixDatabase.b;
                if (v6_3 >= v2_24) {
                    break;
                }
                v9_0 = okhttp3.internal.publicsuffix.PublicSuffixDatabase$Companion.a(v8, v1_8.a(), v3_6, v6_3);
                if (v9_0 == 0) {
                    v6_3++;
                }
                String v12_0;
                if (v2_24 <= 1) {
                    v12_0 = 0;
                } else {
                    int v6_5 = ((x8.j[]) v3_6.clone());
                    String v10_1 = (v6_5.length - 1);
                    int v11 = 0;
                    while (v11 < v10_1) {
                        v6_5[v11] = okhttp3.internal.publicsuffix.PublicSuffixDatabase.c;
                        v12_0 = okhttp3.internal.publicsuffix.PublicSuffixDatabase$Companion.a(v8, v1_8.a(), v6_5, v11);
                        if (v12_0 == null) {
                            v11++;
                        }
                    }
                }
                String v10_2;
                if (v12_0 == null) {
                    v10_2 = 0;
                } else {
                    Object v2_26 = (v2_24 - 1);
                    int v6_6 = 0;
                    while (v6_6 < v2_26) {
                        String v10_3 = v1_8.e;
                        if (v10_3 == null) {
                            kotlin.jvm.internal.j.i("exceptionBytes");
                            throw 0;
                        } else {
                            v10_2 = okhttp3.internal.publicsuffix.PublicSuffixDatabase$Companion.a(v8, v10_3, v3_6, v6_6);
                            if (v10_2 == null) {
                                v6_6++;
                            }
                        }
                    }
                }
                java.util.Iterator v1_1;
                if (v10_2 == null) {
                    if ((v9_0 != 0) || (v12_0 != null)) {
                        String v3_0;
                        Object v2_0 = i7.n.a;
                        if (v9_0 == 0) {
                            v3_0 = v2_0;
                        } else {
                            String v3_1 = new char[1];
                            v3_1[0] = 46;
                            v3_0 = b8.i.E0(v9_0, v3_1);
                        }
                        if (v12_0 == null) {
                            v1_1 = v2_0;
                        } else {
                            Object v2_1 = new char[1];
                            v2_1[0] = 46;
                            v1_1 = b8.i.E0(v12_0, v2_1);
                        }
                        if (v3_0.size() > v1_1.size()) {
                            v1_1 = v3_0;
                        }
                    } else {
                        v1_1 = okhttp3.internal.publicsuffix.PublicSuffixDatabase.d;
                    }
                } else {
                    Object v2_4 = "!".concat(v10_2);
                    String v3_2 = new char[1];
                    v3_2[0] = 46;
                    v1_1 = b8.i.E0(v2_4, v3_2);
                }
                if ((v0_7.size() != v1_1.size()) || (((String) v1_1.get(0)).charAt(0) == 33)) {
                    String v0_1;
                    java.util.Iterator v1_3;
                    if (((String) v1_1.get(0)).charAt(0) != 33) {
                        v0_1 = v0_7.size();
                        v1_3 = (v1_1.size() + 1);
                    } else {
                        v0_1 = v0_7.size();
                        v1_3 = v1_1.size();
                    }
                    String v0_2 = (v0_1 - v1_3);
                    java.util.Iterator v1_5 = new a8.i(okhttp3.internal.publicsuffix.PublicSuffixDatabase.b(p14), 3);
                    if (v0_2 < null) {
                        throw new IllegalArgumentException(v1.a.j("Requested element count ", v0_2, " is less than zero.").toString());
                    } else {
                        if (v0_2 != null) {
                            v1_5 = new a8.c(v1_5, v0_2);
                        }
                        String v14_8 = new StringBuilder();
                        v14_8.append("");
                        java.util.Iterator v1_7 = v1_5.iterator();
                        while (v1_7.hasNext()) {
                            Object v2_17 = v1_7.next();
                            v5++;
                            if (v5 > 1) {
                                v14_8.append(".");
                            }
                            c4.b.d(v14_8, v2_17, 0);
                        }
                        v14_8.append("");
                        return v14_8.toString();
                    }
                } else {
                    return 0;
                }
            }
            v9_0 = 0;
        }
    }
}
