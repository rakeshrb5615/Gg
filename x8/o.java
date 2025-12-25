package x8;
public abstract class o implements x8.h0 {
    public final x8.h0 a;

    public o(x8.h0 p2)
    {
        kotlin.jvm.internal.j.e(p2, "delegate");
        this.a = p2;
        return;
    }

    public final x8.j0 b()
    {
        return this.a.b();
    }

    public void close()
    {
        this.a.close();
        return;
    }

    public long t(x8.g p2, long p3)
    {
        kotlin.jvm.internal.j.e(p2, "sink");
        return this.a.t(p2, p3);
    }

    public final String toString()
    {
        String v0_1 = new StringBuilder();
        v0_1.append(this.getClass().getSimpleName());
        v0_1.append(40);
        v0_1.append(this.a);
        v0_1.append(41);
        return v0_1.toString();
    }
}
