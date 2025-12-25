package k4;
public final class m {
    public final int a;
    public final long b;

    public m(int p1, long p2)
    {
        this.a = p1;
        this.b = p2;
        return;
    }

    public final boolean equals(Object p5)
    {
        if ((p5 != this) && ((!(p5 instanceof k4.m)) || ((this.a != ((k4.m) p5).a) || (this.b != ((k4.m) p5).b)))) {
            return 0;
        } else {
            return 1;
        }
    }

    public final int hashCode()
    {
        long v1 = this.b;
        return (((int) ((v1 >> 32) ^ v1)) ^ ((this.a ^ 1000003) * 1000003));
    }

    public final String toString()
    {
        String v0_2 = new StringBuilder("EventRecord{eventType=");
        v0_2.append(this.a);
        v0_2.append(", eventTimestamp=");
        v0_2.append(this.b);
        v0_2.append("}");
        return v0_2.toString();
    }
}
