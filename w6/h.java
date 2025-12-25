package w6;
public abstract enum class h extends java.lang.Enum {
    public static final enum w6.a a;
    public static final synthetic w6.h[] b;

    static h()
    {
        int v0_1 = new w6.a();
        w6.h.a = v0_1;
        w6.b v1_1 = new w6.b();
        w6.c v2_1 = new w6.c();
        w6.d v3_1 = new w6.d();
        w6.e v4_0 = new w6.e();
        w6.f v5_1 = new w6.f();
        w6.g v6_1 = new w6.g();
        w6.h[] v7_1 = new w6.h[7];
        v7_1[0] = v0_1;
        v7_1[1] = v1_1;
        v7_1[2] = v2_1;
        v7_1[3] = v3_1;
        v7_1[4] = v4_0;
        v7_1[5] = v5_1;
        v7_1[6] = v6_1;
        w6.h.b = v7_1;
        return;
    }

    public static String a(String p5, char p6)
    {
        StringBuilder v0_1 = new StringBuilder();
        int v1 = p5.length();
        int v2 = 0;
        while (v2 < v1) {
            char v3 = p5.charAt(v2);
            if ((Character.isUpperCase(v3)) && (v0_1.length() != 0)) {
                v0_1.append(p6);
            }
            v0_1.append(v3);
            v2++;
        }
        return v0_1.toString();
    }

    public static String c(String p5)
    {
        char v0_0 = p5.length();
        int v2_0 = 0;
        while (v2_0 < v0_0) {
            int v3_1 = p5.charAt(v2_0);
            if (!Character.isLetter(v3_1)) {
                v2_0++;
            } else {
                if (Character.isUpperCase(v3_1)) {
                    break;
                }
                char v0_2 = Character.toUpperCase(v3_1);
                if (v2_0 != 0) {
                    StringBuilder v4_1 = new StringBuilder();
                    v4_1.append(p5.substring(0, v2_0));
                    v4_1.append(v0_2);
                    v4_1.append(p5.substring((v2_0 + 1)));
                    return v4_1.toString();
                } else {
                    String v1_3 = new StringBuilder();
                    v1_3.append(v0_2);
                    v1_3.append(p5.substring(1));
                    return v1_3.toString();
                }
            }
        }
        return p5;
    }

    public static w6.h valueOf(String p1)
    {
        return ((w6.h) Enum.valueOf(w6.h, p1));
    }

    public static w6.h[] values()
    {
        return ((w6.h[]) w6.h.b.clone());
    }

    public abstract String b();
}
