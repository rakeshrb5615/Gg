package q0;
public abstract class i1 {
    public final q0.s1 a;
    public h0.b[] b;

    public i1()
    {
        this(new q0.s1());
        return;
    }

    public i1(q0.s1 p1)
    {
        this.a = p1;
        return;
    }

    public final void a()
    {
        h0.b v0_0 = this.b;
        if (v0_0 != null) {
            int v1_1 = v0_0[0];
            h0.b v0_1 = v0_0[1];
            q0.s1 v3 = this.a;
            if (v0_1 == null) {
                v0_1 = v3.a.f(2);
            }
            if (v1_1 == 0) {
                v1_1 = v3.a.f(1);
            }
            this.g(h0.b.a(v1_1, v0_1));
            h0.b v0_4 = this.b[q4.b.B(16)];
            if (v0_4 != null) {
                this.f(v0_4);
            }
            h0.b v0_6 = this.b[q4.b.B(32)];
            if (v0_6 != null) {
                this.d(v0_6);
            }
            h0.b v0_8 = this.b[q4.b.B(64)];
            if (v0_8 != null) {
                this.h(v0_8);
            }
        }
        return;
    }

    public abstract q0.s1 b();

    public void c(int p4, h0.b p5)
    {
        if (this.b == null) {
            int v0_3 = new h0.b[10];
            this.b = v0_3;
        }
        int v0_1 = 1;
        while (v0_1 <= 512) {
            if ((p4 & v0_1) != 0) {
                this.b[q4.b.B(v0_1)] = p5;
            }
            v0_1 <<= 1;
        }
        return;
    }

    public void d(h0.b p1)
    {
        return;
    }

    public abstract void e();

    public void f(h0.b p1)
    {
        return;
    }

    public abstract void g();

    public void h(h0.b p1)
    {
        return;
    }
}
