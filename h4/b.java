package h4;
public final class b extends h4.a {
    public final android.app.PendingIntent a;
    public final boolean b;

    public b(android.app.PendingIntent p1, boolean p2)
    {
        if (p1 == null) {
            throw new NullPointerException("Null pendingIntent");
        } else {
            this.a = p1;
            this.b = p2;
            return;
        }
    }

    public final boolean equals(Object p5)
    {
        if (p5 != this) {
            if ((!(p5 instanceof h4.a)) || ((!this.a.equals(((h4.b) ((h4.a) p5)).a)) || (this.b != ((h4.b) ((h4.a) p5)).b))) {
                return 0;
            } else {
                return 1;
            }
        } else {
            return 1;
        }
    }

    public final int hashCode()
    {
        int v2_1;
        int vtmp1 = this.a.hashCode();
        if (1 == this.b) {
            v2_1 = 1231;
        } else {
            v2_1 = 1237;
        }
        return (((vtmp1 ^ 1000003) * 1000003) ^ v2_1);
    }

    public final String toString()
    {
        String v0_3 = v1.a.q("ReviewInfo{pendingIntent=", this.a.toString(), ", isNoOp=");
        v0_3.append(this.b);
        v0_3.append("}");
        return v0_3.toString();
    }
}
