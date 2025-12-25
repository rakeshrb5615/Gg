package z6;
public class y0 extends w6.z {

    public y0()
    {
        return;
    }

    public final Object b(e7.a p2)
    {
        try {
            return new java.util.concurrent.atomic.AtomicInteger(p2.G());
        } catch (NumberFormatException v2_2) {
            throw new w6.p(v2_2);
        }
    }

    public final void c(e7.b p3, Object p4)
    {
        p3.G(((long) ((java.util.concurrent.atomic.AtomicInteger) p4).get()));
        return;
    }
}
