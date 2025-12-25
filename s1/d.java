package s1;
public final class d {
    public final java.util.List a;
    public final int b;

    public d()
    {
        this(i7.n.a, -1);
        return;
    }

    public d(java.util.List p4, int p5)
    {
        this.a = p4;
        this.b = p5;
        if ((!p4.isEmpty()) || (p5 != -1)) {
            if (!p4.isEmpty()) {
                y7.e v0_0 = p4.size();
                if ((p5 >= null) && (p5 < v0_0)) {
                    return;
                }
            }
            IllegalArgumentException v5_1 = v1.a.p("Invalid \'NavigationEventHistory\' state:  \'currentIndex\' must be within the bounds of \'mergedHistory\' (or -1 if empty). Received: currentIndex = \'", p5, "\', bounds = \'");
            v5_1.append(new y7.e(0, (p4.size() - 1), 1));
            v5_1.append("\'.");
            throw new IllegalArgumentException(v5_1.toString().toString());
        }
        return;
    }

    public final boolean equals(Object p5)
    {
        if (this != p5) {
            if ((p5) && (s1.d == p5.getClass())) {
                if (this.b == ((s1.d) p5).b) {
                    if (kotlin.jvm.internal.j.a(this.a, ((s1.d) p5).a)) {
                        return 1;
                    } else {
                        return 0;
                    }
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
        return (this.a.hashCode() + (this.b * 31));
    }

    public final String toString()
    {
        String v0_2 = new StringBuilder("NavigationEventHistory(currentIndex=");
        v0_2.append(this.b);
        v0_2.append(", mergedHistory=");
        v0_2.append(this.a);
        v0_2.append(41);
        return v0_2.toString();
    }
}
