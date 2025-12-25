package f2;
public final class a0 {
    public final java.util.HashMap a;
    public final android.view.View b;
    public final java.util.ArrayList c;

    public a0(android.view.View p2)
    {
        this.a = new java.util.HashMap();
        this.c = new java.util.ArrayList();
        this.b = p2;
        return;
    }

    public final boolean equals(Object p3)
    {
        if ((!(p3 instanceof f2.a0)) || ((this.b != ((f2.a0) p3).b) || (!this.a.equals(((f2.a0) p3).a)))) {
            return 0;
        } else {
            return 1;
        }
    }

    public final int hashCode()
    {
        return (this.a.hashCode() + (this.b.hashCode() * 31));
    }

    public final String toString()
    {
        String v0_5 = new StringBuilder("TransitionValues@");
        v0_5.append(Integer.toHexString(this.hashCode()));
        v0_5.append(":\n");
        String v0_1 = v0_5.toString();
        String v1_2 = new StringBuilder();
        v1_2.append(v0_1);
        v1_2.append("    view = ");
        v1_2.append(this.b);
        v1_2.append("\n");
        String v1_4 = g2.g.d(v1_2.toString(), "    values:");
        java.util.HashMap v2_1 = this.a;
        java.util.Iterator v3_1 = v2_1.keySet().iterator();
        while (v3_1.hasNext()) {
            String v4_2 = ((String) v3_1.next());
            StringBuilder v5_1 = new StringBuilder();
            v5_1.append(v1_4);
            v5_1.append("    ");
            v5_1.append(v4_2);
            v5_1.append(": ");
            v5_1.append(v2_1.get(v4_2));
            v5_1.append("\n");
            v1_4 = v5_1.toString();
        }
        return v1_4;
    }
}
