package n4;
public class d {
    public static final n4.c c;
    public final n4.a a;
    public final Character b;

    static d()
    {
        n4.d.c = new n4.c("base64()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/");
        new n4.c("base64Url()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_");
        new n4.d("base32()", "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567");
        new n4.d("base32Hex()", "0123456789ABCDEFGHIJKLMNOPQRSTUV");
        new n4.b(new n4.a("base16()", "0123456789ABCDEF".toCharArray()));
        return;
    }

    public d(String p3, String p4)
    {
        this(new n4.a(p3, p4.toCharArray()), Character.valueOf(61));
        return;
    }

    public d(n4.a p3, Character p4)
    {
        IllegalArgumentException v3_1;
        p3.getClass();
        this.a = p3;
        if (p4 == null) {
            v3_1 = 1;
        } else {
            String v0_2 = p4.charValue();
            IllegalArgumentException v3_4 = p3.e;
            if ((v0_2 >= v3_4.length) || (v3_4[v0_2] == -1)) {
            } else {
                v3_1 = 0;
            }
        }
        if (v3_1 == null) {
            throw new IllegalArgumentException(c4.b.L("Padding character %s was already in alphabet", new Object[] {p4})));
        } else {
            this.b = p4;
            return;
        }
    }

    public final boolean equals(Object p4)
    {
        if ((!(p4 instanceof n4.d)) || ((!this.a.equals(((n4.d) p4).a)) || (!java.util.Objects.equals(this.b, ((n4.d) p4).b)))) {
            return 0;
        } else {
            return 1;
        }
    }

    public final int hashCode()
    {
        return (this.a.hashCode() ^ java.util.Objects.hashCode(this.b));
    }

    public final String toString()
    {
        String v0_2 = new StringBuilder("BaseEncoding.");
        String v1_3 = this.a;
        v0_2.append(v1_3);
        if ((8 % v1_3.c) != 0) {
            String v1_5 = this.b;
            if (v1_5 != null) {
                v0_2.append(".withPadChar(\'");
                v0_2.append(v1_5);
                v0_2.append("\')");
            } else {
                v0_2.append(".omitPadding()");
            }
        }
        return v0_2.toString();
    }
}
