package i7;
public final class b extends a8.b implements java.util.ListIterator {
    public final synthetic i7.d d;

    public b(i7.d p4, int p5)
    {
        this.d = p4;
        super(p4, 1);
        String v4_2 = p4.b();
        if ((p5 < 0) || (p5 > v4_2)) {
            throw new IndexOutOfBoundsException(v1.a.i("index: ", p5, v4_2, ", size: "));
        } else {
            super.b = p5;
            return;
        }
    }

    public final void add(Object p2)
    {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean hasPrevious()
    {
        if (this.b <= 0) {
            return 0;
        } else {
            return 1;
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
            return this.d.get(v0_5);
        }
    }

    public final int previousIndex()
    {
        return (this.b - 1);
    }

    public final void set(Object p2)
    {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
