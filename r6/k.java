package r6;
public final class k {
    public final r6.j a;
    public final r6.j b;
    public final double c;

    public k(r6.j p1, r6.j p2, double p3)
    {
        this.a = p1;
        this.b = p2;
        this.c = p3;
        return;
    }

    public final boolean equals(Object p8)
    {
        if (this != p8) {
            if ((p8 instanceof r6.k)) {
                if (this.a == ((r6.k) p8).a) {
                    if (this.b == ((r6.k) p8).b) {
                        if (Double.compare(this.c, ((r6.k) p8).c) == 0) {
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
                return 0;
            }
        } else {
            return 1;
        }
    }

    public final int hashCode()
    {
        return (Double.hashCode(this.c) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31));
    }

    public final String toString()
    {
        String v0_2 = new StringBuilder("DataCollectionStatus(performance=");
        v0_2.append(this.a);
        v0_2.append(", crashlytics=");
        v0_2.append(this.b);
        v0_2.append(", sessionSamplingRate=");
        v0_2.append(this.c);
        v0_2.append(41);
        return v0_2.toString();
    }
}
