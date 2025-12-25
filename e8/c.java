package e8;
public final class c extends d8.a0 implements d8.k0 {
    public final android.os.Handler c;
    public final boolean d;
    public final e8.c e;

    public c(android.os.Handler p2, boolean p3)
    {
        e8.c v3_2;
        this.c = p2;
        this.d = p3;
        if (p3 == null) {
            v3_2 = new e8.c(p2, 1);
        } else {
            v3_2 = this;
        }
        this.e = v3_2;
        return;
    }

    public final d8.p0 c(long p4, d8.b2 p6, l7.h p7)
    {
        if (p4 > 4611686018427387903) {
            p4 = 4611686018427387903;
        }
        if (!this.c.postDelayed(p6, p4)) {
            this.y(p7, p6);
            return d8.t1.a;
        } else {
            return new a1.a1(1, this, p6);
        }
    }

    public final boolean equals(Object p3)
    {
        if ((!(p3 instanceof e8.c)) || ((((e8.c) p3).c != this.c) || (((e8.c) p3).d != this.d))) {
            return 0;
        } else {
            return 1;
        }
    }

    public final void f(long p5, d8.n p7)
    {
        b5.l v0_1 = new b5.l(5, p7, this);
        if (p5 > 4611686018427387903) {
            p5 = 4611686018427387903;
        }
        if (!this.c.postDelayed(v0_1, p5)) {
            this.y(p7.e, v0_1);
            return;
        } else {
            p7.t(new a6.j(1, this, v0_1));
            return;
        }
    }

    public final int hashCode()
    {
        int v1_1;
        int vtmp1 = System.identityHashCode(this.c);
        if (!this.d) {
            v1_1 = 1237;
        } else {
            v1_1 = 1231;
        }
        return (vtmp1 ^ v1_1);
    }

    public final void i(l7.h p2, Runnable p3)
    {
        if (!this.c.post(p3)) {
            this.y(p2, p3);
        }
        return;
    }

    public final boolean s(l7.h p2)
    {
        if ((this.d) && (kotlin.jvm.internal.j.a(android.os.Looper.myLooper(), this.c.getLooper()))) {
            return 0;
        } else {
            return 1;
        }
    }

    public final String toString()
    {
        String v0_2;
        String v0_0 = i8.n.a;
        if (this != v0_0) {
            try {
                String v0_3 = v0_0.e;
            } catch (UnsupportedOperationException) {
                v0_3 = 0;
            }
            if (this != v0_3) {
                v0_2 = 0;
            } else {
                v0_2 = "Dispatchers.Main.immediate";
            }
        } else {
            v0_2 = "Dispatchers.Main";
        }
        if (v0_2 == null) {
            v0_2 = this.c.toString();
            if (this.d) {
                v0_2 = g2.g.d(v0_2, ".immediate");
            }
        }
        return v0_2;
    }

    public final void y(l7.h p4, Runnable p5)
    {
        d8.e1 v1_4 = new StringBuilder("The task was rejected, the handler underlying the dispatcher \'");
        v1_4.append(this);
        v1_4.append("\' was closed");
        k8.d v0_2 = new java.util.concurrent.CancellationException(v1_4.toString());
        d8.e1 v1_3 = ((d8.e1) p4.get(d8.b0.b));
        if (v1_3 != null) {
            v1_3.cancel(v0_2);
        }
        k8.d.c.i(p4, p5);
        return;
    }
}
