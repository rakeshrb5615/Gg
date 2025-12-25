package d8;
public final class t0 extends d8.u0 {
    public final d8.b2 c;

    public t0(long p1, d8.b2 p3)
    {
        super(p1);
        super.c = p3;
        return;
    }

    public final void run()
    {
        this.c.run();
        return;
    }

    public final String toString()
    {
        String v0_1 = new StringBuilder();
        v0_1.append(super.toString());
        v0_1.append(this.c);
        return v0_1.toString();
    }
}
