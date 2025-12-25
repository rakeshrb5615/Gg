package j6;
public final class w {
    public static final java.util.regex.Pattern d;
    public final String a;
    public final String b;
    public final String c;

    static w()
    {
        j6.w.d = java.util.regex.Pattern.compile("[a-zA-Z0-9-_.~%]{1,900}");
        return;
    }

    public w(String p3, String p4)
    {
        String v0_2;
        if ((p4 == null) || (!p4.startsWith("/topics/"))) {
            v0_2 = p4;
        } else {
            String v0_7 = new StringBuilder("Format /topics/topic-name is deprecated. Only \'topic-name\' should be used in ");
            v0_7.append(p3);
            v0_7.append(".");
            android.util.Log.w("FirebaseMessaging", v0_7.toString());
            v0_2 = p4.substring(8);
        }
        if ((v0_2 == null) || (!j6.w.d.matcher(v0_2).matches())) {
            throw new IllegalArgumentException(v1.a.l("Invalid topic name: ", v0_2, " does not match the allowed format [a-zA-Z0-9-_.~%]{1,900}."));
        } else {
            this.a = v0_2;
            this.b = p3;
            this.c = g2.g.e(p3, "!", p4);
            return;
        }
    }

    public final boolean equals(Object p4)
    {
        if ((p4 instanceof j6.w)) {
            if ((!this.a.equals(((j6.w) p4).a)) || (!this.b.equals(((j6.w) p4).b))) {
                return 0;
            } else {
                return 1;
            }
        } else {
            return 0;
        }
    }

    public final int hashCode()
    {
        return com.google.android.gms.common.internal.Objects.hashCode(new Object[] {this.b, this.a}));
    }
}
