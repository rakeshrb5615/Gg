package d8;
public final class p extends d8.i1 {
    public final synthetic int e;
    public final d8.n f;

    public synthetic p(d8.n p1, int p2)
    {
        this.e = p2;
        this.f = p1;
        return;
    }

    public final boolean j()
    {
        switch (this.e) {
            case 0:
                return 1;
            default:
                return 0;
        }
    }

    public final void k(Throwable p7)
    {
        switch (this.e) {
            case 0:
                d8.n v0_0 = this.f;
                boolean v7_4 = v0_0.p(this.i());
                if (v0_0.v()) {
                    i8.f v1_1 = ((i8.f) v0_0.d);
                    java.util.concurrent.atomic.AtomicReferenceFieldUpdater v2 = i8.f.n;
                    do {
                        Object v3_0 = v2.get(v1_1);
                        Object v4_0 = i8.a.c;
                        if (!kotlin.jvm.internal.j.a(v3_0, v4_0)) {
                            if ((v3_0 instanceof Throwable)) {
                                return;
                            }
                            while (!v2.compareAndSet(v1_1, v3_0, 0)) {
                                if (v2.get(v1_1) != v3_0) {
                                }
                            }
                            v0_0.m(v7_4);
                            if (v0_0.v()) {
                                return;
                            } else {
                                v0_0.n();
                                return;
                            }
                        }
                        while (!v2.compareAndSet(v1_1, v4_0, v7_4)) {
                        }
                    } while(v2.get(v1_1) == v4_0);
                }
                return;
            default:
                this.f.resumeWith(h7.l.a);
                return;
        }
    }
}
