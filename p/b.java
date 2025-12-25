package p;
public final class b extends p.e implements java.util.Iterator {
    public p.c a;
    public p.c b;
    public final synthetic int c;

    public b(p.c p1, p.c p2, int p3)
    {
        this.c = p3;
        this.a = p2;
        this.b = p1;
        return;
    }

    public final void a(p.c p4)
    {
        p.c v1 = 0;
        if ((this.a == p4) && (p4 == this.b)) {
            this.b = 0;
            this.a = 0;
        }
        p.c v0_4 = this.a;
        if (v0_4 == p4) {
            p.c v0_1;
            switch (this.c) {
                case 0:
                    v0_1 = v0_4.d;
                    break;
                default:
                    v0_1 = v0_4.c;
            }
            this.a = v0_1;
        }
        p.c v0_2 = this.b;
        if (v0_2 == p4) {
            p.c v4_1 = this.a;
            if ((v0_2 != v4_1) && (v4_1 != null)) {
                v1 = this.b(v0_2);
            }
            this.b = v1;
        }
        return;
    }

    public final p.c b(p.c p2)
    {
        switch (this.c) {
            case 0:
                return p2.c;
            default:
                return p2.d;
        }
    }

    public final boolean hasNext()
    {
        if (this.b == null) {
            return 0;
        } else {
            return 1;
        }
    }

    public final Object next()
    {
        p.c v1_1;
        p.c v0 = this.b;
        p.c v1_0 = this.a;
        if ((v0 != v1_0) && (v1_0 != null)) {
            v1_1 = this.b(v0);
        } else {
            v1_1 = 0;
        }
        this.b = v1_1;
        return v0;
    }
}
