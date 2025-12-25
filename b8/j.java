package b8;
public abstract class j extends c4.b {

    public static String k0(String p12)
    {
        kotlin.jvm.internal.j.e(p12, "<this>");
        if (b8.i.y0("|")) {
            throw new IllegalArgumentException("marginPrefix must be non-blank string.");
        } else {
            java.util.Iterator v1_2 = a8.h.X(new a8.i(p12, 2));
            String v12_1 = p12.length();
            v1_2.size();
            int v2_1 = a.a.y(v1_2);
            java.util.ArrayList v3_1 = new java.util.ArrayList();
            java.util.Iterator v1_3 = v1_2.iterator();
            String v5_0 = 0;
            while (v1_3.hasNext()) {
                String v6_1 = v1_3.next();
                int v7 = (v5_0 + 1);
                String v8 = 0;
                if (v5_0 < null) {
                    a.a.V();
                    throw 0;
                } else {
                    String v6_2 = ((String) v6_1);
                    if (((v5_0 != null) && (v5_0 != v2_1)) || (!b8.i.y0(v6_2))) {
                        String v5_2 = v6_2.length();
                        int v9 = 0;
                        while (v9 < v5_2) {
                            if (a.a.D(v6_2.charAt(v9))) {
                                v9++;
                            }
                            if ((v9 != -1) && (b8.p.o0(v6_2, "|", v9, 0))) {
                                v8 = v6_2.substring(("|".length() + v9));
                                kotlin.jvm.internal.j.d(v8, "substring(...)");
                            }
                            if (v8 == null) {
                                v8 = v6_2;
                            }
                        }
                        v9 = -1;
                    }
                    if (v8 != null) {
                        v3_1.add(v8);
                    }
                    v5_0 = v7;
                }
            }
            StringBuilder v0_3 = new StringBuilder(v12_1);
            i7.i.b0(v3_1, v0_3);
            return v0_3.toString();
        }
    }
}
