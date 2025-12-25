package f2;
public final class x extends f2.t {
    public final synthetic int a;
    public f2.s b;

    public synthetic x()
    {
        this.a = 1;
        return;
    }

    public x(f2.s p2)
    {
        this.a = 0;
        this.b = p2;
        return;
    }

    public void a(f2.s p2)
    {
        switch (this.a) {
            case 1:
                f2.y v2_2 = ((f2.y) this.b);
                if (!v2_2.K) {
                    v2_2.K();
                    v2_2.K = 1;
                }
                return;
            default:
                return;
        }
    }

    public final void f(f2.s p3)
    {
        switch (this.a) {
            case 0:
                this.b.D();
                p3.A(this);
                return;
            default:
                f2.s v0_3 = ((f2.y) this.b);
                int v1_2 = (v0_3.J - 1);
                v0_3.J = v1_2;
                if (v1_2 == 0) {
                    v0_3.K = 0;
                    v0_3.p();
                }
                p3.A(this);
                return;
        }
    }
}
