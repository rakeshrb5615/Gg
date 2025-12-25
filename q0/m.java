package q0;
public final synthetic class m implements androidx.lifecycle.s {
    public final synthetic q0.o a;
    public final synthetic androidx.lifecycle.o b;
    public final synthetic q0.p c;

    public synthetic m(q0.o p1, androidx.lifecycle.o p2, q0.p p3)
    {
        this.a = p1;
        this.b = p2;
        this.c = p3;
        return;
    }

    public final void c(androidx.lifecycle.u p10, androidx.lifecycle.n p11)
    {
        androidx.lifecycle.n v3_0;
        int v10_0 = this.a;
        v10_0.getClass();
        Runnable v0 = v10_0.a;
        java.util.concurrent.CopyOnWriteArrayList v1 = v10_0.b;
        androidx.lifecycle.n.Companion.getClass();
        androidx.lifecycle.o v2_1 = this.b;
        androidx.lifecycle.n v3_2 = v2_1.ordinal();
        androidx.lifecycle.n v4 = 0;
        if (v3_2 == 2) {
            v3_0 = androidx.lifecycle.n.ON_CREATE;
        } else {
            if (v3_2 == 3) {
                v3_0 = androidx.lifecycle.n.ON_START;
            } else {
                if (v3_2 == 4) {
                    v3_0 = androidx.lifecycle.n.ON_RESUME;
                } else {
                    v3_0 = 0;
                }
            }
        }
        q0.p v8 = this.c;
        if (p11 != v3_0) {
            androidx.lifecycle.n v3_1 = androidx.lifecycle.n.ON_DESTROY;
            if (p11 != v3_1) {
                int v10_1 = v2_1.ordinal();
                if (v10_1 == 2) {
                    v4 = v3_1;
                } else {
                    if (v10_1 == 3) {
                        v4 = androidx.lifecycle.n.ON_STOP;
                    } else {
                        if (v10_1 == 4) {
                            v4 = androidx.lifecycle.n.ON_PAUSE;
                        }
                    }
                }
                if (p11 == v4) {
                    v1.remove(v8);
                    v0.run();
                }
                return;
            } else {
                v10_0.b(v8);
                return;
            }
        } else {
            v1.add(v8);
            v0.run();
            return;
        }
    }
}
