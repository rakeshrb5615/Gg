package m4;
public final class b extends m4.s implements java.util.ListIterator {
    public final int a;
    public int b;
    public final m4.d c;

    public b(m4.d p2, int p3)
    {
        int v0 = p2.size();
        a.a.h(p3, v0);
        this.a = v0;
        this.b = p3;
        this.c = p2;
        return;
    }

    public final Object a(int p2)
    {
        return this.c.get(p2);
    }

    public final void add(Object p1)
    {
        throw new UnsupportedOperationException();
    }

    public final boolean hasNext()
    {
        if (this.b >= this.a) {
            return 0;
        } else {
            return 1;
        }
    }

    public final boolean hasPrevious()
    {
        if (this.b <= 0) {
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
            java.util.NoSuchElementException v0_4 = this.b;
            this.b = (v0_4 + 1);
            return this.a(v0_4);
        }
    }

    public final int nextIndex()
    {
        return this.b;
    }

    public final Object previous()
    {
        if (!this.hasPrevious()) {
            throw new java.util.NoSuchElementException();
        } else {
            java.util.NoSuchElementException v0_5 = (this.b - 1);
            this.b = v0_5;
            return this.a(v0_5);
        }
    }

    public final int previousIndex()
    {
        return (this.b - 1);
    }

    public final void set(Object p1)
    {
        throw new UnsupportedOperationException();
    }
}
