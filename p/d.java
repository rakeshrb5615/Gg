package p;
public final class d extends p.e implements java.util.Iterator {
    public p.c a;
    public boolean b;
    public final synthetic p.f c;

    public d(p.f p1)
    {
        this.c = p1;
        this.b = 1;
        return;
    }

    public final void a(p.c p2)
    {
        p.c v0 = this.a;
        if (p2 == v0) {
            int v2_2;
            int v2_1 = v0.d;
            this.a = v2_1;
            if (v2_1 != 0) {
                v2_2 = 0;
            } else {
                v2_2 = 1;
            }
            this.b = v2_2;
        }
        return;
    }

    public final boolean hasNext()
    {
        if (!this.b) {
            p.c v0_3 = this.a;
            if ((v0_3 == null) || (v0_3.c == null)) {
                return 0;
            } else {
                return 1;
            }
        } else {
            if (this.c.a == null) {
                return 0;
            } else {
                return 1;
            }
        }
    }

    public final Object next()
    {
        if (!this.b) {
            int v0_4;
            int v0_3 = this.a;
            if (v0_3 == 0) {
                v0_4 = 0;
            } else {
                v0_4 = v0_3.c;
            }
            this.a = v0_4;
        } else {
            this.b = 0;
            this.a = this.c.a;
        }
        return this.a;
    }
}
