package w6;
public final class k extends w6.z {
    public final synthetic int a;
    public final synthetic w6.z b;

    public synthetic k(w6.z p1, int p2)
    {
        this.a = p2;
        this.b = p1;
        return;
    }

    public final Object b(e7.a p6)
    {
        switch (this.a) {
            case 0:
                return new java.util.concurrent.atomic.AtomicLong(((Number) this.b.b(p6)).longValue());
            default:
                java.util.concurrent.atomic.AtomicLong v0_2 = new java.util.ArrayList();
                p6.c();
                while (p6.B()) {
                    v0_2.add(Long.valueOf(((Number) this.b.b(p6)).longValue()));
                }
                p6.x();
                int v6_1 = v0_2.size();
                java.util.concurrent.atomic.AtomicLongArray v1_2 = new java.util.concurrent.atomic.AtomicLongArray(v6_1);
                int v2 = 0;
                while (v2 < v6_1) {
                    v1_2.set(v2, ((Long) v0_2.get(v2)).longValue());
                    v2++;
                }
                return v1_2;
        }
    }

    public final void c(e7.b p5, Object p6)
    {
        switch (this.a) {
            case 0:
                this.b.c(p5, Long.valueOf(((java.util.concurrent.atomic.AtomicLong) p6).get()));
                return;
            default:
                p5.f();
                w6.z v0_1 = ((java.util.concurrent.atomic.AtomicLongArray) p6).length();
                int v1 = 0;
                while (v1 < v0_1) {
                    this.b.c(p5, Long.valueOf(((java.util.concurrent.atomic.AtomicLongArray) p6).get(v1)));
                    v1++;
                }
                p5.x();
                return;
        }
    }
}
