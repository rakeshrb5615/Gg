package y2;
public final class a {
    public static final y2.a f;
    public final long a;
    public final int b;
    public final int c;
    public final long d;
    public final int e;

    static a()
    {
        y2.a.f = new y2.a(200, 10000, 10485760, 604800000, 81920);
        return;
    }

    public a(int p1, int p2, long p3, long p5, int p7)
    {
        this.a = p3;
        this.b = p1;
        this.c = p2;
        this.d = p5;
        this.e = p7;
        return;
    }

    public final boolean equals(Object p8)
    {
        if (p8 != this) {
            if ((!(p8 instanceof y2.a)) || ((this.a != ((y2.a) p8).a) || ((this.b != ((y2.a) p8).b) || ((this.c != ((y2.a) p8).c) || ((this.d != ((y2.a) p8).d) || (this.e != ((y2.a) p8).e)))))) {
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
        int v0_0 = this.a;
        int v1_1 = 1000003;
        long v3_1 = this.d;
        return (((((((((((int) (v0_0 ^ (v0_0 >> 32))) ^ 1000003) * v1_1) ^ this.b) * v1_1) ^ this.c) * v1_1) ^ ((int) ((v3_1 >> 32) ^ v3_1))) * 1000003) ^ this.e);
    }

    public final String toString()
    {
        String v0_1 = new StringBuilder("EventStoreConfig{maxStorageSizeInBytes=");
        v0_1.append(this.a);
        v0_1.append(", loadBatchSize=");
        v0_1.append(this.b);
        v0_1.append(", criticalSectionEnterTimeoutMs=");
        v0_1.append(this.c);
        v0_1.append(", eventCleanUpAge=");
        v0_1.append(this.d);
        v0_1.append(", maxBlobByteSizePerRow=");
        v0_1.append(this.e);
        v0_1.append("}");
        return v0_1.toString();
    }
}
