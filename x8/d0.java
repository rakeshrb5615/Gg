package x8;
public abstract class d0 {
    public static final x8.c0 a;
    public static final int b;
    public static final java.util.concurrent.atomic.AtomicReference[] c;

    static d0()
    {
        int v6 = 0;
        java.util.concurrent.atomic.AtomicReference[] v1_1 = new byte[0];
        x8.d0.a = new x8.c0(v1_1, 0, 0, 0, 0);
        int v0_5 = Integer.highestOneBit(((Runtime.getRuntime().availableProcessors() * 2) - 1));
        x8.d0.b = v0_5;
        java.util.concurrent.atomic.AtomicReference[] v1_0 = new java.util.concurrent.atomic.AtomicReference[v0_5];
        while (v6 < v0_5) {
            v1_0[v6] = new java.util.concurrent.atomic.AtomicReference();
            v6++;
        }
        x8.d0.c = v1_0;
        return;
    }

    public static final void a(x8.c0 p6)
    {
        kotlin.jvm.internal.j.e(p6, "segment");
        if ((p6.f != null) || (p6.g != null)) {
            throw new IllegalArgumentException("Failed requirement.");
        } else {
            if (!p6.d) {
                java.util.concurrent.atomic.AtomicReference v0_7 = x8.d0.c[((int) (Thread.currentThread().getId() & (((long) x8.d0.b) - 1)))];
                int v1_1 = x8.d0.a;
                x8.c0 v2_4 = ((x8.c0) v0_7.getAndSet(v1_1));
                if (v2_4 != v1_1) {
                    int v3_0;
                    if (v2_4 == null) {
                        v3_0 = 0;
                    } else {
                        v3_0 = v2_4.c;
                    }
                    if (v3_0 < 65536) {
                        p6.f = v2_4;
                        p6.b = 0;
                        p6.c = (v3_0 + 8192);
                        v0_7.set(p6);
                        return;
                    } else {
                        v0_7.set(v2_4);
                        return;
                    }
                }
            }
            return;
        }
    }

    public static final x8.c0 b()
    {
        int v0_1 = x8.d0.c[((int) (Thread.currentThread().getId() & (((long) x8.d0.b) - 1)))];
        int v1_1 = x8.d0.a;
        x8.c0 v2_1 = ((x8.c0) v0_1.getAndSet(v1_1));
        if (v2_1 != v1_1) {
            if (v2_1 != null) {
                v0_1.set(v2_1.f);
                v2_1.f = 0;
                v2_1.c = 0;
                return v2_1;
            } else {
                v0_1.set(0);
                return new x8.c0();
            }
        } else {
            return new x8.c0();
        }
    }
}
