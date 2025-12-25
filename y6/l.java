package y6;
public final class l implements java.util.Iterator {
    public y6.n a;
    public y6.n b;
    public int c;
    public final synthetic y6.o d;
    public final synthetic int e;

    public l(y6.o p1, int p2)
    {
        this.e = p2;
        this.d = p1;
        this.a = p1.f.d;
        this.b = 0;
        this.c = p1.e;
        return;
    }

    public final Object a()
    {
        return this.b();
    }

    public final y6.n b()
    {
        java.util.ConcurrentModificationException v0_0 = this.a;
        y6.n v1_0 = this.d;
        if (v0_0 == v1_0.f) {
            throw new java.util.NoSuchElementException();
        } else {
            if (v1_0.e != this.c) {
                throw new java.util.ConcurrentModificationException();
            } else {
                this.a = v0_0.d;
                this.b = v0_0;
                return v0_0;
            }
        }
    }

    public final boolean hasNext()
    {
        if (this.a == this.d.f) {
            return 0;
        } else {
            return 1;
        }
    }

    public Object next()
    {
        switch (this.e) {
            case 1:
                return this.b().f;
            default:
                return this.a();
        }
    }

    public final void remove()
    {
        IllegalStateException v0_0 = this.b;
        if (v0_0 == null) {
            throw new IllegalStateException();
        } else {
            y6.o v2 = this.d;
            v2.d(v0_0, 1);
            this.b = 0;
            this.c = v2.e;
            return;
        }
    }
}
