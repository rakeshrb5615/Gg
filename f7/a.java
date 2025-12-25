package f7;
public final class a {
    public static final java.util.BitSet b;
    public final String a;

    static a()
    {
        java.util.BitSet v0_1 = new java.util.BitSet(127);
        v0_1.set(45);
        v0_1.set(95);
        v0_1.set(46);
        char v1_4 = 48;
        while (v1_4 <= 57) {
            v0_1.set(v1_4);
            v1_4 = ((char) (v1_4 + 1));
        }
        char v1_1 = 97;
        while (v1_1 <= 122) {
            v0_1.set(v1_1);
            v1_1 = ((char) (v1_1 + 1));
        }
        f7.a.b = v0_1;
        return;
    }

    public a(String p6, c5.c p7)
    {
        String v0_1 = p6.toLowerCase(java.util.Locale.ROOT);
        a.a.g(v0_1, "name");
        if (v0_1.isEmpty()) {
            throw new IllegalArgumentException("token must have at least 1 tchar");
        } else {
            if (v0_1.equals("connection")) {
                f7.b.a.log(java.util.logging.Level.WARNING, "Metadata key is \'Connection\', which should not be used. That is used by HTTP/1 for connection-specific headers which are not to be forwarded. There is probably an HTTP/1 conversion bug. Simply removing the Connection header is not enough; you should remove all headers it references as well. See RFC 7230 section 6.1", new RuntimeException("exception to show backtrace"));
            }
            int v1_3 = 0;
            while (v1_3 < v0_1.length()) {
                char v2_2 = v0_1.charAt(v1_3);
                if (!f7.a.b.get(v2_2)) {
                    throw new IllegalArgumentException(c4.b.L("Invalid character \'%s\' in key name \'%s\'", new Object[] {Character.valueOf(v2_2), v0_1})));
                } else {
                    v1_3++;
                }
            }
            this.a = v0_1;
            v0_1.getBytes(l4.b.a);
            if (p6.endsWith("-bin")) {
                throw new IllegalArgumentException(c4.b.L("ASCII header is named %s.  Only binary headers may end with %s", new Object[] {p6, "-bin"})));
            } else {
                a.a.g(p7, "marshaller");
                return;
            }
        }
    }

    public static void a(String p1, c5.c p2)
    {
        new f7.a(p1, p2);
        return;
    }

    public final boolean equals(Object p3)
    {
        if (this != p3) {
            if ((p3) && (f7.a == p3.getClass())) {
                return this.a.equals(((f7.a) p3).a);
            } else {
                return 0;
            }
        } else {
            return 1;
        }
    }

    public final int hashCode()
    {
        return this.a.hashCode();
    }

    public final String toString()
    {
        return v1.a.n(new StringBuilder("Key{name=\'"), this.a, "\'}");
    }
}
