package okhttp3;
public final class HttpUrl$Builder {
    public String a;
    public String b;
    public String c;
    public String d;
    public int e;
    public final java.util.ArrayList f;
    public java.util.ArrayList g;
    public String h;

    public HttpUrl$Builder()
    {
        this.b = "";
        this.c = "";
        this.e = -1;
        this.f = new java.util.ArrayList(new i7.f(new String[] {""}), 1));
        return;
    }

    public static java.util.ArrayList c(String p6)
    {
        java.util.ArrayList v0_1 = new java.util.ArrayList();
        int v1_0 = 0;
        while (v1_0 <= p6.length()) {
            int v2_0 = b8.i.v0(p6, 38, v1_0, 4);
            if (v2_0 == -1) {
                v2_0 = p6.length();
            }
            int v3_0 = b8.i.v0(p6, 61, v1_0, 4);
            if ((v3_0 != -1) && (v3_0 <= v2_0)) {
                int v1_1 = p6.substring(v1_0, v3_0);
                kotlin.jvm.internal.j.d(v1_1, "substring(...)");
                v0_1.add(v1_1);
                int v1_2 = p6.substring((v3_0 + 1), v2_0);
                kotlin.jvm.internal.j.d(v1_2, "substring(...)");
                v0_1.add(v1_2);
            } else {
                int v1_3 = p6.substring(v1_0, v2_0);
                kotlin.jvm.internal.j.d(v1_3, "substring(...)");
                v0_1.add(v1_3);
                v0_1.add(0);
            }
            v1_0 = (v2_0 + 1);
        }
        return v0_1;
    }

    public final okhttp3.HttpUrl a()
    {
        String v1_0 = this.a;
        if (v1_0 == null) {
            throw new IllegalStateException("scheme == null");
        } else {
            okhttp3.HttpUrl v0_0 = okhttp3.internal.url._UrlKt.d(0, 0, 7, this.b);
            String v3_0 = okhttp3.internal.url._UrlKt.d(0, 0, 7, this.c);
            String v4_2 = this.d;
            if (v4_2 == null) {
                throw new IllegalStateException("host == null");
            } else {
                java.util.ArrayList v6_0 = this.e;
                if (v6_0 == -1) {
                    int v7_1 = this.a;
                    kotlin.jvm.internal.j.b(v7_1);
                    okhttp3.HttpUrl.j.getClass();
                    v6_0 = okhttp3.HttpUrl$Companion.a(v7_1);
                }
                String v8_0 = this.f;
                int v7_3 = new java.util.ArrayList(i7.j.X(v8_0, 10));
                String v10_1 = v8_0.size();
                int v11_0 = 0;
                while (v11_0 < v10_1) {
                    int v12_1 = v8_0.get(v11_0);
                    v11_0++;
                    v7_3.add(okhttp3.internal.url._UrlKt.d(0, 0, 7, ((String) v12_1)));
                }
                int v11_1;
                String v8_1 = this.g;
                String v10_2 = 0;
                if (v8_1 == null) {
                    v11_1 = 0;
                } else {
                    v11_1 = new java.util.ArrayList(i7.j.X(v8_1, 10));
                    String v9_2 = v8_1.size();
                    int v12_0 = 0;
                    while (v12_0 < v9_2) {
                        String v13_2;
                        String v13_0 = v8_1.get(v12_0);
                        v12_0++;
                        String v13_1 = ((String) v13_0);
                        if (v13_1 == null) {
                            v13_2 = 0;
                        } else {
                            v13_2 = okhttp3.internal.url._UrlKt.d(0, 0, 3, v13_1);
                        }
                        v11_1.add(v13_2);
                    }
                }
                String v8_2 = this.h;
                if (v8_2 != null) {
                    v10_2 = okhttp3.internal.url._UrlKt.d(0, 0, 7, v8_2);
                }
                return new okhttp3.HttpUrl(v1_0, v0_0, v3_0, v4_2, v6_0, v7_3, v11_1, v10_2, this.toString());
            }
        }
    }

    public final void b(okhttp3.HttpUrl p18, String p19)
    {
        int v6_7;
        kotlin.jvm.internal.j.e(p19, "input");
        int v3_0 = okhttp3.internal._UtilCommonKt.g(0, IllegalArgumentException v2_1.length(), p19);
        String v5_1 = okhttp3.internal._UtilCommonKt.h(v3_0, p19.length(), p19);
        int v10_7 = -1;
        if ((v5_1 - v3_0) >= 2) {
            int v6_5 = p19.charAt(v3_0);
            if (((kotlin.jvm.internal.j.f(v6_5, 97) >= 0) && (kotlin.jvm.internal.j.f(v6_5, 122) <= 0)) || ((kotlin.jvm.internal.j.f(v6_5, 65) >= 0) && (kotlin.jvm.internal.j.f(v6_5, 90) <= 0))) {
                v6_7 = (v3_0 + 1);
                while (v6_7 < v5_1) {
                    char v13_8 = p19.charAt(v6_7);
                    if (((97 > v13_8) || (v13_8 >= 123)) && (((65 > v13_8) || (v13_8 >= 91)) && (((48 > v13_8) || (v13_8 >= 58)) && ((v13_8 != 43) && ((v13_8 != 45) && (v13_8 != 46)))))) {
                        if (v13_8 != 58) {
                            break;
                        }
                    } else {
                        v6_7++;
                    }
                }
                v6_7 = -1;
            }
        }
        char v13_1 = 1;
        if (v6_7 == -1) {
            if (p18 == null) {
                String v1_23;
                if (p19.length() <= 6) {
                    v1_23 = p19;
                } else {
                    v1_23 = b8.i.G0(6, p19).concat("...");
                }
                throw new IllegalArgumentException(g2.g.l("Expected URL scheme \'http\' or \'https\' but no scheme was found for ", v1_23));
            } else {
                this.a = p18.a;
            }
        } else {
            if (!b8.p.o0(p19, "https:", v3_0, 1)) {
                if (!b8.p.o0(p19, "http:", v3_0, 1)) {
                    int v3_25 = new StringBuilder("Expected URL scheme \'http\' or \'https\' but was \'");
                    IllegalArgumentException v2_10 = p19.substring(0, v6_7);
                    kotlin.jvm.internal.j.d(v2_10, "substring(...)");
                    v3_25.append(v2_10);
                    v3_25.append(39);
                    throw new IllegalArgumentException(v3_25.toString());
                } else {
                    this.a = "http";
                    v3_0 += 5;
                }
            } else {
                this.a = "https";
                v3_0 += 6;
            }
        }
        int v6_2 = v3_0;
        int v14_0 = 0;
        while(true) {
            int v7_0 = 47;
            int v16 = v13_1;
            if (v6_2 >= v5_1) {
                break;
            }
            char v13_0 = p19.charAt(v6_2);
            if ((v13_0 != 47) && (v13_0 != 92)) {
                break;
            }
            v14_0++;
            v6_2++;
            v13_1 = v16;
        }
        java.util.ArrayList v9_0 = this.f;
        int v8_0 = 35;
        if ((v14_0 < 2) && ((p18 != null) && (kotlin.jvm.internal.j.a(p18.a, this.a)))) {
            this.b = p18.e();
            this.c = p18.a();
            this.d = p18.d;
            this.e = p18.e;
            v9_0.clear();
            v9_0.addAll(p18.c());
            if ((v3_0 == v5_1) || (p19.charAt(v3_0) == 35)) {
                String v1_3;
                String v1_2 = p18.d();
                if (v1_2 == null) {
                    v1_3 = 0;
                } else {
                    v1_3 = okhttp3.HttpUrl$Builder.c(okhttp3.internal.url._UrlKt.a(v1_2, 0, 0, " \"\'<>#", 83));
                }
                this.g = v1_3;
            }
        } else {
            int v3_1 = (v3_0 + v14_0);
            String v1_5 = 0;
            int v11_2 = 0;
            do {
                String v15_2;
                int v14_2 = okhttp3.internal._UtilCommonKt.d(p19, v3_1, v5_1, "@/\\?#");
                if (v14_2 == v5_1) {
                    v15_2 = v10_7;
                } else {
                    v15_2 = p19.charAt(v14_2);
                }
                if ((v15_2 == v10_7) || ((v15_2 == v8_0) || ((v15_2 == v7_0) || ((v15_2 == 92) || (v15_2 == 63))))) {
                    String v1_6 = v3_1;
                    while (v1_6 < v14_2) {
                        int v4_2 = p19.charAt(v1_6);
                        if (v4_2 != 58) {
                            if (v4_2 == 91) {
                                do {
                                    v1_6++;
                                } while((v1_6 < v14_2) && (p19.charAt(v1_6) != 93));
                            }
                            v1_6++;
                        }
                        int v4_3 = (v1_6 + 1);
                        if (v4_3 >= v14_2) {
                            this.d = okhttp3.internal._HostnamesCommonKt.b(okhttp3.internal.url._UrlKt.d(v3_1, v1_6, 4, p19));
                            int v7_3 = this.a;
                            kotlin.jvm.internal.j.b(v7_3);
                            okhttp3.HttpUrl.j.getClass();
                            this.e = okhttp3.HttpUrl$Companion.a(v7_3);
                        } else {
                            this.d = okhttp3.internal._HostnamesCommonKt.b(okhttp3.internal.url._UrlKt.d(v3_1, v1_6, 4, p19));
                            try {
                                int v7_8 = Integer.parseInt(okhttp3.internal.url._UrlKt.a(p19, v4_3, v14_2, "", 120));
                            } catch (NumberFormatException) {
                                v7_8 = -1;
                                this.e = v7_8;
                                if (v7_8 == -1) {
                                    String v1_8 = new StringBuilder("Invalid URL port: \"");
                                    IllegalArgumentException v2_2 = p19.substring(v4_3, v14_2);
                                    kotlin.jvm.internal.j.d(v2_2, "substring(...)");
                                    v1_8.append(v2_2);
                                    v1_8.append(34);
                                    throw new IllegalArgumentException(v1_8.toString().toString());
                                }
                            }
                            if ((v16 > v7_8) || (v7_8 >= 65536)) {
                            }
                        }
                        if (this.d == null) {
                            int v4_10 = new StringBuilder("Invalid URL host: \"");
                            String v1_11 = p19.substring(v3_1, v1_6);
                            kotlin.jvm.internal.j.d(v1_11, "substring(...)");
                            v4_10.append(v1_11);
                            v4_10.append(34);
                            throw new IllegalArgumentException(v4_10.toString().toString());
                        } else {
                            v3_0 = v14_2;
                        }
                    }
                    v1_6 = v14_2;
                } else {
                }
            } while(v15_2 == 64);
        }
        String v1_15 = okhttp3.internal._UtilCommonKt.d(p19, v3_0, v5_1, "?#");
        if (v3_0 != v1_15) {
            int v4_11 = p19.charAt(v3_0);
            if ((v4_11 == 47) || (v4_11 == 92)) {
                v9_0.clear();
                v9_0.add("");
                v3_0++;
            } else {
                v9_0.set((v9_0.size() - 1), "");
            }
            while (v3_0 < v1_15) {
                int v10_11;
                int v4_15 = okhttp3.internal._UtilCommonKt.d(p19, v3_0, v1_15, "/\\");
                if (v4_15 >= v1_15) {
                    v10_11 = 0;
                } else {
                    v10_11 = 1;
                }
                int v3_3 = okhttp3.internal.url._UrlKt.a(p19, v3_0, v4_15, " \"<>^`{}|/\\?#", 112);
                if ((!v3_3.equals(".")) && (!v3_3.equalsIgnoreCase("%2e"))) {
                    if ((!v3_3.equals("..")) && ((!v3_3.equalsIgnoreCase("%2e.")) && ((!v3_3.equalsIgnoreCase(".%2e")) && (!v3_3.equalsIgnoreCase("%2e%2e"))))) {
                        if (((CharSequence) v9_0.get((v9_0.size() - 1))).length() != 0) {
                            v9_0.add(v3_3);
                        } else {
                            v9_0.set((v9_0.size() - 1), v3_3);
                        }
                        if (v10_11 != 0) {
                            v9_0.add("");
                        }
                    } else {
                        if ((((String) v9_0.remove((v9_0.size() - 1))).length() != 0) || (v9_0.isEmpty())) {
                            v9_0.add("");
                        } else {
                            v9_0.set((v9_0.size() - 1), "");
                        }
                    }
                }
                if (v10_11 == 0) {
                    v3_0 = v4_15;
                } else {
                    v3_0 = (v4_15 + 1);
                }
            }
        }
        if ((v1_15 < v5_1) && (p19.charAt(v1_15) == 63)) {
            int v4_17 = okhttp3.internal._UtilCommonKt.c(p19, 35, v1_15, v5_1);
            this.g = okhttp3.HttpUrl$Builder.c(okhttp3.internal.url._UrlKt.a(p19, (v1_15 + 1), v4_17, " \"\'<>#", 80));
            v1_15 = v4_17;
        }
        if ((v1_15 < v5_1) && (p19.charAt(v1_15) == 35)) {
            this.h = okhttp3.internal.url._UrlKt.a(p19, (v1_15 + 1), v5_1, "", 48);
        }
        return;
    }

    public final String toString()
    {
        String v0_1 = new StringBuilder();
        String v1_7 = this.a;
        if (v1_7 == null) {
            v0_1.append("//");
        } else {
            v0_1.append(v1_7);
            v0_1.append("://");
        }
        if ((this.b.length() > 0) || (this.c.length() > 0)) {
            v0_1.append(this.b);
            if (this.c.length() > 0) {
                v0_1.append(58);
                v0_1.append(this.c);
            }
            v0_1.append(64);
        }
        String v1_12 = this.d;
        if (v1_12 != null) {
            if (!b8.i.r0(v1_12, 58)) {
                v0_1.append(this.d);
            } else {
                v0_1.append(91);
                v0_1.append(this.d);
                v0_1.append(93);
            }
        }
        String v1_19 = this.e;
        if ((v1_19 != -1) || (this.a != null)) {
            if (v1_19 == -1) {
                int v3_2 = this.a;
                kotlin.jvm.internal.j.b(v3_2);
                okhttp3.HttpUrl.j.getClass();
                v1_19 = okhttp3.HttpUrl$Companion.a(v3_2);
            }
            int v3_3 = this.a;
            if (v3_3 != 0) {
                okhttp3.HttpUrl.j.getClass();
                if (v1_19 == okhttp3.HttpUrl$Companion.a(v3_3)) {
                    String v1_21 = this.f;
                    java.util.ArrayList v2_1 = v1_21.size();
                    int v4_0 = 0;
                    while (v4_0 < v2_1) {
                        v0_1.append(47);
                        v0_1.append(((String) v1_21.get(v4_0)));
                        v4_0++;
                    }
                    if (this.g != null) {
                        v0_1.append(63);
                        java.util.ArrayList v2_2 = this.g;
                        kotlin.jvm.internal.j.b(v2_2);
                        okhttp3.HttpUrl.j.getClass();
                        String v1_28 = w3.a.e(w3.a.f(0, v2_2.size()), 2);
                        int v3_0 = v1_28.a;
                        int v4_3 = v1_28.b;
                        String v1_29 = v1_28.c;
                        if (((v1_29 <= null) || (v3_0 > v4_3)) && ((v1_29 >= null) || (v4_3 > v3_0))) {
                            if (this.h != null) {
                                v0_1.append(35);
                                v0_1.append(this.h);
                            }
                            return v0_1.toString();
                        }
                        while(true) {
                            int v5_5 = ((String) v2_2.get(v3_0));
                            String v6_2 = ((String) v2_2.get((v3_0 + 1)));
                            if (v3_0 > 0) {
                                v0_1.append(38);
                            }
                            v0_1.append(v5_5);
                            if (v6_2 != null) {
                                v0_1.append(61);
                                v0_1.append(v6_2);
                            }
                            if (v3_0 == v4_3) {
                                break;
                            }
                            v3_0 += v1_29;
                        }
                    }
                }
            }
            v0_1.append(58);
            v0_1.append(v1_19);
        }
    }
}
