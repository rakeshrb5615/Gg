package x8;
public abstract class n implements x8.f0 {
    public final x8.f0 a;

    public n(x8.f0 p2)
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

    public void flush()
    {
        this.a.flush();
        return;
    }

    public void k(x8.g p2, long p3)
    {
        this.a.k(p2, p3);
        return;
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
