package i7;
public final class m implements java.util.ListIterator, v7.a {
    public static final i7.m a;

    static m()
    {
        i7.m.a = new i7.m();
        return;
    }

    public final bridge synthetic void add(Object p2)
    {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean hasNext()
    {
        return 0;
    }

    public final boolean hasPrevious()
    {
        return 0;
    }

    public final Object next()
    {
        throw new java.util.NoSuchElementException();
    }

    public final int nextIndex()
    {
        return 0;
    }

    public final Object previous()
    {
        throw new java.util.NoSuchElementException();
    }

    public final int previousIndex()
    {
        return -1;
    }

    public final void remove()
    {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final bridge synthetic void set(Object p2)
    {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
