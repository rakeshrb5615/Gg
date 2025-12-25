package p2;
public final class a implements r2.l {
    public static final String c;
    public static final java.util.Set d;
    public static final p2.a e;
    public static final p2.a f;
    public final String a;
    public final String b;

    static a()
    {
        p2.a v0_1 = q4.b.F("hts/frbslgiggolai.o/0clgbthfra=snpoo", "tp:/ieaeogn.ogepscmvc/o/ac?omtjo_rt3");
        p2.a.c = v0_1;
        String v1_2 = q4.b.F("hts/frbslgigp.ogepscmv/ieo/eaybtho", "tp:/ieaeogn-agolai.o/1frlglgc/aclg");
        String v2_0 = q4.b.F("AzSCki82AwsLzKd5O8zo", "IayckHiZRO1EFl1aGoK");
        p2.a.d = java.util.Collections.unmodifiableSet(new java.util.HashSet(java.util.Arrays.asList(new o2.c[] {new o2.c("proto"), new o2.c("json")}))));
        p2.a.e = new p2.a(v0_1, 0);
        p2.a.f = new p2.a(v1_2, v2_0);
        return;
    }

    public a(String p1, String p2)
    {
        this.a = p1;
        this.b = p2;
        return;
    }

    public static p2.a a(byte[] p3)
    {
        int v0_7 = new String(p3, java.nio.charset.Charset.forName("UTF-8"));
        if (!v0_7.startsWith("1$")) {
            throw new IllegalArgumentException("Version marker missing from extras");
        } else {
            int v0_3 = v0_7.substring(2).split(java.util.regex.Pattern.quote("\\"), 2);
            if (v0_3.length != 2) {
                throw new IllegalArgumentException("Extra is not a valid encoded LegacyFlgDestination");
            } else {
                IllegalArgumentException v3_6 = v0_3[0];
                if (v3_6.isEmpty()) {
                    throw new IllegalArgumentException("Missing endpoint in CCTDestination extras");
                } else {
                    int v0_6 = v0_3[1];
                    if (v0_6.isEmpty()) {
                        v0_6 = 0;
                    }
                    return new p2.a(v3_6, v0_6);
                }
            }
        }
    }
}
