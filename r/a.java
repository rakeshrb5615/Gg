package r;
public final class a implements java.util.Iterator, v7.a {
    public int a;
    public int b;
    public boolean c;
    public final synthetic int d;
    public final synthetic Object e;

    public a(int p1)
    {
        this.a = p1;
        return;
    }

    public a(r.e p1, int p2)
    {
        this.d = p2;
        switch (p2) {
            case 1:
                this.e = p1;
                this(p1.c);
                return;
            default:
                this.e = p1;
                this(p1.c);
                return;
        }
    }

    public a(r.f p2)
    {
        this.d = 2;
        this.e = p2;
        this(p2.c);
        return;
    }

    public final boolean hasNext()
    {
        if (this.b >= this.a) {
            return 0;
        } else {
            return 1;
        }
    }

    public final Object next()
    {
        if (!this.hasNext()) {
            throw new java.util.NoSuchElementException();
        } else {
            Object v0_1;
            Object v0_4 = this.b;
            switch (this.d) {
                case 0:
                    v0_1 = ((r.e) this.e).g(v0_4);
                    break;
                case 1:
                    v0_1 = ((r.e) this.e).j(v0_4);
                    break;
                default:
                    v0_1 = ((r.f) this.e).b[v0_4];
            }
            this.b = (this.b + 1);
            this.c = 1;
            return v0_1;
        }
    }

    public final void remove()
    {
        if (!this.c) {
            throw new IllegalStateException("Call next() before removing an element.");
        } else {
            int v0_7 = (this.b - 1);
            this.b = v0_7;
            switch (this.d) {
                case 0:
                    ((r.e) this.e).h(v0_7);
                    break;
                case 1:
                    ((r.e) this.e).h(v0_7);
                    break;
                default:
                    ((r.f) this.e).b(v0_7);
            }
            this.a = (this.a - 1);
            this.c = 0;
            return;
        }
    }
}
