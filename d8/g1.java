package d8;
public class g1 extends d8.r1 {
    public final boolean c;

    public g1()
    {
        d8.r1 v3_0;
        int v0 = 1;
        super(1);
        super.x(0);
        java.util.concurrent.atomic.AtomicReferenceFieldUpdater v2 = d8.r1.b;
        d8.r1 v3_6 = ((d8.q) v2.get(super));
        if (!(v3_6 instanceof d8.r)) {
            v3_0 = 0;
        } else {
            v3_0 = ((d8.r) v3_6);
        }
        if (v3_0 == null) {
            v0 = 0;
        } else {
            d8.r1 v3_1 = v3_0.i();
            while (!v3_1.s()) {
                d8.r1 v3_4;
                d8.r1 v3_3 = ((d8.q) v2.get(v3_1));
                if (!(v3_3 instanceof d8.r)) {
                    v3_4 = 0;
                } else {
                    v3_4 = ((d8.r) v3_3);
                }
                if (v3_4 == null) {
                } else {
                    v3_1 = v3_4.i();
                }
            }
        }
        super.c = v0;
        return;
    }

    public final boolean s()
    {
        return this.c;
    }

    public final boolean t()
    {
        return 1;
    }
}
