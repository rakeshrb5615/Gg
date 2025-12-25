package x2;
public final class b {
    public final a3.a a;
    public final java.util.HashMap b;

    public b(a3.a p1, java.util.HashMap p2)
    {
        this.a = p1;
        this.b = p2;
        return;
    }

    public final long a(o2.d p9, long p10, int p12)
    {
        double v2_2;
        long v10_1 = (p10 - this.a.b());
        long v9_3 = ((x2.c) this.b.get(p9));
        long v0_6 = v9_3.a;
        int v12_1 = (p12 - 1);
        if (v0_6 <= 1) {
            v2_2 = 2;
        } else {
            v2_2 = v0_6;
        }
        return Math.min(Math.max(((long) ((Math.pow(4613937818241073152, ((double) v12_1)) * ((double) v0_6)) * Math.max(4607182418800017408, (Math.log(4666723172467343360) / Math.log(((double) (v2_2 * ((long) v12_1)))))))), v10_1), v9_3.b);
    }

    public final boolean equals(Object p3)
    {
        if ((p3 != this) && ((!(p3 instanceof x2.b)) || ((!this.a.equals(((x2.b) p3).a)) || (!this.b.equals(((x2.b) p3).b))))) {
            return 0;
        } else {
            return 1;
        }
    }

    public final int hashCode()
    {
        return (((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode());
    }

    public final String toString()
    {
        String v0_2 = new StringBuilder("SchedulerConfig{clock=");
        v0_2.append(this.a);
        v0_2.append(", values=");
        v0_2.append(this.b);
        v0_2.append("}");
        return v0_2.toString();
    }
}
