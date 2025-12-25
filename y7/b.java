package y7;
public final class b implements java.util.Iterator, v7.a {
    public final synthetic int a;
    public final int b;
    public final int c;
    public boolean d;
    public int e;

    public b(char p3, char p4, int p5)
    {
        int v0 = 0;
        this.a = 0;
        this.b = p5;
        this.c = p4;
        if (p5 <= 0) {
            if (kotlin.jvm.internal.j.f(p3, p4) >= 0) {
                v0 = 1;
            }
        } else {
            if (kotlin.jvm.internal.j.f(p3, p4) <= 0) {
            }
        }
        this.d = v0;
        if (v0 == 0) {
            p3 = p4;
        }
        this.e = p3;
        return;
    }

    public b(int p3, int p4, int p5)
    {
        this.a = 1;
        this.b = p5;
        this.c = p4;
        int v0_1 = 0;
        if (p5 <= 0) {
            if (p3 >= p4) {
                v0_1 = 1;
            }
        } else {
            if (p3 <= p4) {
            }
        }
        this.d = v0_1;
        if (v0_1 == 0) {
            p3 = p4;
        }
        this.e = p3;
        return;
    }

    public final boolean hasNext()
    {
        switch (this.a) {
            case 0:
                return this.d;
            default:
                return this.d;
        }
    }

    public final Object next()
    {
        switch (this.a) {
            case 0:
                Character v0_5 = this.e;
                if (v0_5 != this.c) {
                    this.e = (this.b + v0_5);
                } else {
                    if (!this.d) {
                        throw new java.util.NoSuchElementException();
                    } else {
                        this.d = 0;
                    }
                }
                return Character.valueOf(((char) v0_5));
            default:
                return Integer.valueOf(this.nextInt());
        }
    }

    public int nextInt()
    {
        java.util.NoSuchElementException v0_0 = this.e;
        if (v0_0 != this.c) {
            this.e = (this.b + v0_0);
            return v0_0;
        } else {
            if (!this.d) {
                throw new java.util.NoSuchElementException();
            } else {
                this.d = 0;
                return v0_0;
            }
        }
    }

    public final void remove()
    {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
                break;
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }
}
