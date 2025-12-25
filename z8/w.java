package z8;
public final class w extends x8.o {
    public final synthetic z8.x b;

    public w(z8.x p1, x8.i p2)
    {
        this.b = p1;
        super(p2);
        return;
    }

    public final long t(x8.g p1, long p2)
    {
        try {
            return super.t(p1, p2);
        } catch (java.io.IOException v1_2) {
            this.b.f = v1_2;
            throw v1_2;
        }
    }
}
