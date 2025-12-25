package y2;
public final class b {
    public final long a;
    public final r2.j b;
    public final r2.i c;

    public b(long p1, r2.j p3, r2.i p4)
    {
        this.a = p1;
        this.b = p3;
        this.c = p4;
        return;
    }

    public final boolean equals(Object p8)
    {
        if (p8 != this) {
            if ((!(p8 instanceof y2.b)) || ((this.a != ((y2.b) p8).a) || ((!this.b.equals(((y2.b) p8).b)) || (!this.c.equals(((y2.b) p8).c))))) {
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
        int v1_0 = this.a;
        return (((((((int) ((v1_0 >> 32) ^ v1_0)) ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode());
    }

    public final String toString()
    {
        String v0_2 = new StringBuilder("PersistedEvent{id=");
        v0_2.append(this.a);
        v0_2.append(", transportContext=");
        v0_2.append(this.b);
        v0_2.append(", event=");
        v0_2.append(this.c);
        v0_2.append("}");
        return v0_2.toString();
    }
}
