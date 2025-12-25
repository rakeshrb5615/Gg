package l;
public final class i extends c4.b {
    public final synthetic int c;
    public boolean d;
    public int e;
    public final synthetic Object f;

    public i(l.j p2)
    {
        this.c = 0;
        this.f = p2;
        this.d = 0;
        this.e = 0;
        return;
    }

    public i(n.f3 p2, int p3)
    {
        this.c = 1;
        this.f = p2;
        this.e = p3;
        this.d = 0;
        return;
    }

    public final void a()
    {
        switch (this.c) {
            case 0:
                int v0_8 = (this.e + 1);
                this.e = v0_8;
                int v1_2 = ((l.j) this.f);
                if (v0_8 == v1_2.a.size()) {
                    int v0_1 = v1_2.d;
                    if (v0_1 != 0) {
                        v0_1.a();
                    }
                    this.e = 0;
                    this.d = 0;
                    v1_2.e = 0;
                }
                return;
            default:
                if (!this.d) {
                    ((n.f3) this.f).a.setVisibility(this.e);
                }
                return;
        }
    }

    public void b()
    {
        switch (this.c) {
            case 1:
                this.d = 1;
                return;
            default:
                return;
        }
    }

    public final void c()
    {
        switch (this.c) {
            case 0:
                if (!this.d) {
                    this.d = 1;
                    q0.u0 v0_8 = ((l.j) this.f).d;
                    if (v0_8 != null) {
                        v0_8.c();
                    }
                }
                return;
            default:
                ((n.f3) this.f).a.setVisibility(0);
                return;
        }
    }
}
