package okhttp3;
public final class Cookie$Companion {

    private Cookie$Companion()
    {
        return;
    }

    public synthetic Cookie$Companion(int p1)
    {
        return;
    }

    public static int a(String p4, int p5, int p6, boolean p7)
    {
        while (p5 < p6) {
            int v0_0;
            int v0_1 = p4.charAt(p5);
            if (((v0_1 >= 32) || (v0_1 == 9)) && (((v0_1 < 127) && ((48 > v0_1) || (v0_1 >= 58))) && (((97 > v0_1) || (v0_1 >= 123)) && (((65 > v0_1) || (v0_1 >= 91)) && (v0_1 != 58))))) {
                v0_0 = 0;
            } else {
                v0_0 = 1;
            }
            if (v0_0 != (p7 ^ 1)) {
                p5++;
            } else {
                return p5;
            }
        }
        return p6;
    }

    public static long b(int p14, String p15)
    {
        int v1_3 = okhttp3.Cookie$Companion.a(p15, 0, p14, 0);
        java.util.regex.Matcher v2_1 = okhttp3.Cookie.o.matcher(p15);
        int v4_1 = -1;
        int v5_1 = -1;
        int v6_1 = -1;
        int v7_0 = -1;
        int v8_0 = -1;
        int v9_0 = -1;
        while (v1_3 < p14) {
            int v12_2 = okhttp3.Cookie$Companion.a(p15, (v1_3 + 1), p14, 1);
            v2_1.region(v1_3, v12_2);
            if ((v5_1 != -1) || (!v2_1.usePattern(okhttp3.Cookie.o).matches())) {
                if ((v6_1 != -1) || (!v2_1.usePattern(okhttp3.Cookie.n).matches())) {
                    if (v7_0 == -1) {
                        boolean v10_9 = okhttp3.Cookie.m;
                        if (v2_1.usePattern(v10_9).matches()) {
                            int v7_1 = v2_1.group(1);
                            kotlin.jvm.internal.j.d(v7_1, "group(...)");
                            int v1_0 = java.util.Locale.US;
                            kotlin.jvm.internal.j.d(v1_0, "US");
                            int v1_1 = v7_1.toLowerCase(v1_0);
                            kotlin.jvm.internal.j.d(v1_1, "toLowerCase(...)");
                            int v7_3 = v10_9.pattern();
                            kotlin.jvm.internal.j.d(v7_3, "pattern(...)");
                            v7_0 = (b8.i.w0(v7_3, v1_1, 0, 6) / 4);
                            v1_3 = okhttp3.Cookie$Companion.a(p15, (v12_2 + 1), p14, 0);
                        }
                    }
                    if ((v4_1 == -1) && (v2_1.usePattern(okhttp3.Cookie.l).matches())) {
                        int v4_0 = v2_1.group(1);
                        kotlin.jvm.internal.j.d(v4_0, "group(...)");
                        v4_1 = Integer.parseInt(v4_0);
                    }
                } else {
                    int v6_0 = v2_1.group(1);
                    kotlin.jvm.internal.j.d(v6_0, "group(...)");
                    v6_1 = Integer.parseInt(v6_0);
                }
            } else {
                int v5_0 = v2_1.group(1);
                kotlin.jvm.internal.j.d(v5_0, "group(...)");
                v5_1 = Integer.parseInt(v5_0);
                int v8_1 = v2_1.group(2);
                kotlin.jvm.internal.j.d(v8_1, "group(...)");
                v8_0 = Integer.parseInt(v8_1);
                int v9_2 = v2_1.group(3);
                kotlin.jvm.internal.j.d(v9_2, "group(...)");
                v9_0 = Integer.parseInt(v9_2);
            }
        }
        if ((70 <= v4_1) && (v4_1 < 100)) {
            v4_1 += 1900;
        }
        if ((v4_1 >= 0) && (v4_1 < 70)) {
            v4_1 += 2000;
        }
        if (v4_1 < 1601) {
            throw new IllegalArgumentException("Failed requirement.");
        } else {
            if (v7_0 == -1) {
                throw new IllegalArgumentException("Failed requirement.");
            } else {
                if ((1 > v6_1) || (v6_1 >= 32)) {
                    throw new IllegalArgumentException("Failed requirement.");
                } else {
                    if ((v5_1 < 0) || (v5_1 >= 24)) {
                        throw new IllegalArgumentException("Failed requirement.");
                    } else {
                        if ((v8_0 < 0) || (v8_0 >= 60)) {
                            throw new IllegalArgumentException("Failed requirement.");
                        } else {
                            if ((v9_0 < 0) || (v9_0 >= 60)) {
                                throw new IllegalArgumentException("Failed requirement.");
                            } else {
                                long v14_19 = new java.util.GregorianCalendar(okhttp3.internal._UtilJvmKt.a);
                                v14_19.setLenient(0);
                                v14_19.set(1, v4_1);
                                v14_19.set(2, (v7_0 - 1));
                                v14_19.set(5, v6_1);
                                v14_19.set(11, v5_1);
                                v14_19.set(12, v8_0);
                                v14_19.set(13, v9_0);
                                v14_19.set(14, 0);
                                return v14_19.getTimeInMillis();
                            }
                        }
                    }
                }
            }
        }
    }
}
