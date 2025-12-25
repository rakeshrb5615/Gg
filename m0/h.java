package m0;
public final class h {
    public static final m0.h b;
    public final m0.i a;

    static h()
    {
        m0.h v0_1 = new java.util.Locale[0];
        m0.h.b = new m0.h(new m0.i(new android.os.LocaleList(v0_1)));
        return;
    }

    public h(m0.i p1)
    {
        this.a = p1;
        return;
    }

    public static m0.h a(String p5)
    {
        if ((p5 != null) && (!p5.isEmpty())) {
            android.os.LocaleList v5_4 = p5.split(",", -1);
            m0.h v0_4 = v5_4.length;
            m0.i v1_3 = new java.util.Locale[v0_4];
            int v2 = 0;
            while (v2 < v0_4) {
                v1_3[v2] = java.util.Locale.forLanguageTag(v5_4[v2]);
                v2++;
            }
            return new m0.h(new m0.i(new android.os.LocaleList(v1_3)));
        } else {
            return m0.h.b;
        }
    }

    public final boolean b()
    {
        return this.a.a.isEmpty();
    }

    public final boolean equals(Object p2)
    {
        if ((!(p2 instanceof m0.h)) || (!this.a.equals(((m0.h) p2).a))) {
            return 0;
        } else {
            return 1;
        }
    }

    public final int hashCode()
    {
        return this.a.a.hashCode();
    }

    public final String toString()
    {
        return this.a.a.toString();
    }
}
