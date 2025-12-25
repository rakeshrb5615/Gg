package g5;
public final class b {
    public final j5.b0 a;
    public final String b;
    public final java.io.File c;

    public b(j5.b0 p1, String p2, java.io.File p3)
    {
        this.a = p1;
        if (p2 == null) {
            throw new NullPointerException("Null sessionId");
        } else {
            this.b = p2;
            this.c = p3;
            return;
        }
    }

    public final boolean equals(Object p3)
    {
        if ((p3 != this) && ((!(p3 instanceof g5.b)) || ((!this.a.equals(((g5.b) p3).a)) || ((!this.b.equals(((g5.b) p3).b)) || (!this.c.equals(((g5.b) p3).c)))))) {
            return 0;
        } else {
            return 1;
        }
    }

    public final int hashCode()
    {
        return (((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode());
    }

    public final String toString()
    {
        String v0_2 = new StringBuilder("CrashlyticsReportWithSessionId{report=");
        v0_2.append(this.a);
        v0_2.append(", sessionId=");
        v0_2.append(this.b);
        v0_2.append(", reportFile=");
        v0_2.append(this.c);
        v0_2.append("}");
        return v0_2.toString();
    }
}
