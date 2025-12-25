package j7;
public final class a implements java.util.ListIterator, v7.a {
    public final synthetic int a;
    public int b;
    public int c;
    public int d;
    public final i7.e e;

    public a(j7.b p2, int p3)
    {
        this.a = 0;
        this.e = p2;
        this.b = p3;
        this.c = -1;
        this.d = j7.b.d(p2);
        return;
    }

    public a(j7.c p2, int p3)
    {
        this.a = 1;
        this.e = p2;
        this.b = p3;
        this.c = -1;
        this.d = j7.c.d(p2);
        return;
    }

    public final void add(Object p4)
    {
        switch (this.a) {
            case 0:
                this.b();
                j7.b v0_4 = ((j7.b) this.e);
                int v1_1 = this.b;
                this.b = (v1_1 + 1);
                v0_4.add(v1_1, p4);
                this.c = -1;
                this.d = j7.b.d(v0_4);
                return;
            default:
                this.c();
                j7.b v0_2 = ((j7.c) this.e);
                int v1_0 = this.b;
                this.b = (v1_0 + 1);
                v0_2.add(v1_0, p4);
                this.c = -1;
                this.d = j7.c.d(v0_2);
                return;
        }
    }

    public void b()
    {
        if (j7.c.d(((j7.b) this.e).e) != this.d) {
            throw new java.util.ConcurrentModificationException();
        } else {
            return;
        }
    }

    public void c()
    {
        if (j7.c.d(((j7.c) this.e)) != this.d) {
            throw new java.util.ConcurrentModificationException();
        } else {
            return;
        }
    }

    public final boolean hasNext()
    {
        switch (this.a) {
            case 0:
                int v0_4;
                if (this.b >= ((j7.b) this.e).c) {
                    v0_4 = 0;
                } else {
                    v0_4 = 1;
                }
                return v0_4;
            default:
                int v0_2;
                if (this.b >= ((j7.c) this.e).b) {
                    v0_2 = 0;
                } else {
                    v0_2 = 1;
                }
                return v0_2;
        }
    }

    public final boolean hasPrevious()
    {
        switch (this.a) {
            case 0:
                int v0_3;
                if (this.b <= 0) {
                    v0_3 = 0;
                } else {
                    v0_3 = 1;
                }
                return v0_3;
            default:
                int v0_1;
                if (this.b <= 0) {
                    v0_1 = 0;
                } else {
                    v0_1 = 1;
                }
                return v0_1;
        }
    }

    public final Object next()
    {
        switch (this.a) {
            case 0:
                this.b();
                java.util.NoSuchElementException v0_5 = this.b;
                int v1_6 = ((j7.b) this.e);
                if (v0_5 >= v1_6.c) {
                    throw new java.util.NoSuchElementException();
                } else {
                    this.b = (v0_5 + 1);
                    this.c = v0_5;
                    return v1_6.a[(v1_6.b + v0_5)];
                }
            default:
                this.c();
                java.util.NoSuchElementException v0_2 = this.b;
                int v1_3 = ((j7.c) this.e);
                if (v0_2 >= v1_3.b) {
                    throw new java.util.NoSuchElementException();
                } else {
                    this.b = (v0_2 + 1);
                    this.c = v0_2;
                    return v1_3.a[v0_2];
                }
        }
    }

    public final int nextIndex()
    {
        switch (this.a) {
            case 0:
                return this.b;
            default:
                return this.b;
        }
    }

    public final Object previous()
    {
        switch (this.a) {
            case 0:
                this.b();
                java.util.NoSuchElementException v0_6 = this.b;
                if (v0_6 <= null) {
                    throw new java.util.NoSuchElementException();
                } else {
                    java.util.NoSuchElementException v0_10 = (v0_6 - 1);
                    this.b = v0_10;
                    this.c = v0_10;
                    int v1_1 = ((j7.b) this.e);
                    return v1_1.a[(v1_1.b + v0_10)];
                }
            default:
                this.c();
                java.util.NoSuchElementException v0_2 = this.b;
                if (v0_2 <= null) {
                    throw new java.util.NoSuchElementException();
                } else {
                    java.util.NoSuchElementException v0_5 = (v0_2 - 1);
                    this.b = v0_5;
                    this.c = v0_5;
                    return ((j7.c) this.e).a[v0_5];
                }
        }
    }

    public final int previousIndex()
    {
        int v0_1;
        switch (this.a) {
            case 0:
                v0_1 = this.b;
                break;
            default:
                v0_1 = this.b;
        }
        return (v0_1 - 1);
    }

    public final void remove()
    {
        switch (this.a) {
            case 0:
                IllegalStateException v0_8 = ((j7.b) this.e);
                this.b();
                String v1_4 = this.c;
                if (v1_4 == -1) {
                    throw new IllegalStateException("Call next() or previous() before removing element from the iterator.");
                } else {
                    v0_8.c(v1_4);
                    this.b = this.c;
                    this.c = -1;
                    this.d = j7.b.d(v0_8);
                    return;
                }
            default:
                IllegalStateException v0_5 = ((j7.c) this.e);
                this.c();
                String v1_1 = this.c;
                if (v1_1 == -1) {
                    throw new IllegalStateException("Call next() or previous() before removing element from the iterator.");
                } else {
                    v0_5.c(v1_1);
                    this.b = this.c;
                    this.c = -1;
                    this.d = j7.c.d(v0_5);
                    return;
                }
        }
    }

    public final void set(Object p3)
    {
        switch (this.a) {
            case 0:
                this.b();
                String v0_3 = this.c;
                if (v0_3 == -1) {
                    throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.");
                } else {
                    ((j7.b) this.e).set(v0_3, p3);
                    return;
                }
            default:
                this.c();
                String v0_1 = this.c;
                if (v0_1 == -1) {
                    throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.");
                } else {
                    ((j7.c) this.e).set(v0_1, p3);
                    return;
                }
        }
    }
}
