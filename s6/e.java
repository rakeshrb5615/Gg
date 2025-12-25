package s6;
public final class e {
    public final String a;

    public e(String p2)
    {
        kotlin.jvm.internal.j.e(p2, "sessionId");
        this.a = p2;
        return;
    }

    public final boolean equals(Object p4)
    {
        if (this != p4) {
            if ((p4 instanceof s6.e)) {
                if (kotlin.jvm.internal.j.a(this.a, ((s6.e) p4).a)) {
                    return 1;
                } else {
                    return 0;
                }
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
        String v0_1 = new StringBuilder("SessionDetails(sessionId=");
        v0_1.append(this.a);
        v0_1.append(41);
        return v0_1.toString();
    }
}
