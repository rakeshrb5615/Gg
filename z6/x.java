package z6;
public class x extends w6.z {

    public x()
    {
        return;
    }

    public final Object b(e7.a p5)
    {
        w6.p v0_1 = new java.util.ArrayList();
        p5.c();
        while (p5.B()) {
            try {
                v0_1.add(Integer.valueOf(p5.G()));
            } catch (NumberFormatException v5_1) {
                throw new w6.p(v5_1);
            }
        }
        p5.x();
        NumberFormatException v5_2 = v0_1.size();
        java.util.concurrent.atomic.AtomicIntegerArray v1_0 = new java.util.concurrent.atomic.AtomicIntegerArray(v5_2);
        int v2 = 0;
        while (v2 < v5_2) {
            v1_0.set(v2, ((Integer) v0_1.get(v2)).intValue());
            v2++;
        }
        return v1_0;
    }

    public final void c(e7.b p5, Object p6)
    {
        p5.f();
        int v0 = ((java.util.concurrent.atomic.AtomicIntegerArray) p6).length();
        int v1 = 0;
        while (v1 < v0) {
            p5.G(((long) ((java.util.concurrent.atomic.AtomicIntegerArray) p6).get(v1)));
            v1++;
        }
        p5.x();
        return;
    }
}
