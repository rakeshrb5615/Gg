package okhttp3;
public final class MediaType$Companion {

    private MediaType$Companion()
    {
        return;
    }

    public synthetic MediaType$Companion(int p1)
    {
        return;
    }

    public static okhttp3.MediaType a(String p14)
    {
        kotlin.jvm.internal.j.e(p14, "<this>");
        int v0_8 = okhttp3.MediaType.f.a(0, p14);
        if (v0_8 == 0) {
            StringBuilder v1_0 = new StringBuilder("No subtype found for: \"");
            v1_0.append(p14);
            v1_0.append(34);
            throw new IllegalArgumentException(v1_0.toString());
        } else {
            if (((b8.e) v0_8.d) == null) {
                v0_8.d = new b8.e(v0_8);
            }
            String v3_6 = ((b8.e) v0_8.d);
            kotlin.jvm.internal.j.b(v3_6);
            String v5_0 = java.util.Locale.ROOT;
            String v3_9 = ((String) v3_6.get(1)).toLowerCase(v5_0);
            kotlin.jvm.internal.j.d(v3_9, "toLowerCase(...)");
            if (((b8.e) v0_8.d) == null) {
                v0_8.d = new b8.e(v0_8);
            }
            int v7_19 = ((b8.e) v0_8.d);
            kotlin.jvm.internal.j.b(v7_19);
            String v5_1 = ((String) v7_19.get(2)).toLowerCase(v5_0);
            kotlin.jvm.internal.j.d(v5_1, "toLowerCase(...)");
            java.util.ArrayList v6_2 = new java.util.ArrayList();
            int v0_10 = ((java.util.regex.Matcher) v0_8.b);
            int v0_3 = w3.a.f(v0_10.start(), v0_10.end()).b;
            while(true) {
                int v0_13 = (v0_3 + 1);
                if (v0_13 >= p14.length()) {
                    StringBuilder v1_2 = new String[0];
                    return new okhttp3.MediaType(p14, v3_9, v5_1, ((String[]) v6_2.toArray(v1_2)));
                } else {
                    int v7_25 = okhttp3.MediaType.g.a(v0_13, p14);
                    if (v7_25 == 0) {
                        break;
                    }
                    int v10_1;
                    int v0_22 = ((java.util.regex.Matcher) v7_25.b);
                    int v7_0 = ((b8.f) v7_25.c);
                    int v10_0 = v7_0.c(1);
                    String v11 = 0;
                    if (v10_0 == 0) {
                        v10_1 = 0;
                    } else {
                        v10_1 = v10_0.a;
                    }
                    if (v10_1 != 0) {
                        int v12_0 = v7_0.c(2);
                        if (v12_0 != 0) {
                            v11 = v12_0.a;
                        }
                        if (v11 != null) {
                            int v13 = 0;
                            if ((v11.length() > 0) && (a.a.s(v11.charAt(0), 39, 0))) {
                                v13 = 1;
                            }
                            if ((v13 != 0) && ((v11.length() > 0) && ((a.a.s(v11.charAt(b8.i.t0(v11)), 39, 0)) && (v11.length() > 2)))) {
                                v11 = v11.substring(1, (v11.length() - int v4));
                                kotlin.jvm.internal.j.d(v11, "substring(...)");
                            }
                        } else {
                            int v7_11 = v7_0.c(3);
                            kotlin.jvm.internal.j.b(v7_11);
                            v11 = v7_11.a;
                        }
                        v6_2.add(v10_1);
                        v6_2.add(v11);
                        v0_3 = w3.a.f(v0_22.start(), v0_22.end()).b;
                    } else {
                        v0_3 = w3.a.f(v0_22.start(), v0_22.end()).b;
                    }
                }
            }
            StringBuilder v1_6 = new StringBuilder("Parameter is not formatted correctly: \"");
            int v0_17 = p14.substring(v0_13);
            kotlin.jvm.internal.j.d(v0_17, "substring(...)");
            v1_6.append(v0_17);
            v1_6.append("\" for: \"");
            v1_6.append(p14);
            v1_6.append(34);
            throw new IllegalArgumentException(v1_6.toString().toString());
        }
    }
}
