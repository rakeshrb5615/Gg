package x8;
public final class x extends i7.d implements java.util.RandomAccess {
    public final x8.j[] a;
    public final int[] b;

    public x(x8.j[] p1, int[] p2)
    {
        this.a = p1;
        this.b = p2;
        return;
    }

    public final int b()
    {
        return this.a.length;
    }

    public final bridge boolean contains(Object p2)
    {
        if ((p2 instanceof x8.j)) {
            return super.contains(((x8.j) p2));
        } else {
            return 0;
        }
    }

    public final Object get(int p2)
    {
        return this.a[p2];
    }

    public final bridge int indexOf(Object p2)
    {
        if ((p2 instanceof x8.j)) {
            return super.indexOf(((x8.j) p2));
        } else {
            return -1;
        }
    }

    public final bridge int lastIndexOf(Object p2)
    {
        if ((p2 instanceof x8.j)) {
            return super.lastIndexOf(((x8.j) p2));
        } else {
            return -1;
        }
    }
}
