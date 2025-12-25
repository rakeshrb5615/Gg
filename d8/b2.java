package d8;
public final class b2 extends i8.q implements java.lang.Runnable {
    public final long e;

    public b2(long p2, n7.c p4)
    {
        super(p4, p4.getContext());
        super.e = p2;
        return;
    }

    public final String C()
    {
        String v0_1 = new StringBuilder();
        v0_1.append(super.C());
        v0_1.append("(timeMillis=");
        v0_1.append(this.e);
        v0_1.append(41);
        return v0_1.toString();
    }

    public final void run()
    {
        d8.f0.i(this.c);
        String v0_3 = new StringBuilder("Timed out waiting for ");
        v0_3.append(this.e);
        v0_3.append(" ms");
        this.i(new d8.a2(v0_3.toString(), this));
        return;
    }
}
