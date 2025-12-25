package a6;
public final class a {
    public final String a;
    public final java.util.ArrayList b;

    public a(String p1, java.util.ArrayList p2)
    {
        if (p1 == null) {
            throw new NullPointerException("Null userAgent");
        } else {
            this.a = p1;
            this.b = p2;
            return;
        }
    }

    public final boolean equals(Object p3)
    {
        if ((p3 != this) && ((!(p3 instanceof a6.a)) || ((!this.a.equals(((a6.a) p3).a)) || (!this.b.equals(((a6.a) p3).b))))) {
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
        String v0_2 = new StringBuilder("HeartBeatResult{userAgent=");
        v0_2.append(this.a);
        v0_2.append(", usedDates=");
        v0_2.append(this.b);
        v0_2.append("}");
        return v0_2.toString();
    }
}
