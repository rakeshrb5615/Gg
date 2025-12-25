package n5;
public final class a {
    public static final k5.a b;
    public static final String c;
    public static final String d;
    public static final l4.h e;
    public final n5.c a;

    static a()
    {
        n5.a.b = new k5.a();
        n5.a.c = n5.a.a("hts/cahyiseot-agolai.o/1frlglgc/aclg", "tp:/rsltcrprsp.ogepscmv/ieo/eaybtho");
        n5.a.d = n5.a.a("AzSBpY4F0rHiHFdinTvM", "IayrSTFL9eJ69YeSUO2");
        n5.a.e = new l4.h(7);
        return;
    }

    public a(n5.c p1)
    {
        this.a = p1;
        return;
    }

    public static String a(String p3, String p4)
    {
        StringBuilder v0_3 = (p3.length() - p4.length());
        if ((v0_3 < null) || (v0_3 > 1)) {
            throw new IllegalArgumentException("Invalid input received");
        } else {
            StringBuilder v0_2 = new StringBuilder((p4.length() + p3.length()));
            int v1_1 = 0;
            while (v1_1 < p3.length()) {
                v0_2.append(p3.charAt(v1_1));
                if (p4.length() > v1_1) {
                    v0_2.append(p4.charAt(v1_1));
                }
                v1_1++;
            }
            return v0_2.toString();
        }
    }
}
