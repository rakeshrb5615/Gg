package m4;
public final class h extends m4.s {
    public boolean a;
    public final synthetic Object b;

    public h(Object p1)
    {
        this.b = p1;
        return;
    }

    public final boolean hasNext()
    {
        return (this.a ^ 1);
    }

    public final Object next()
    {
        if (this.a) {
            throw new java.util.NoSuchElementException();
        } else {
            this.a = 1;
            return this.b;
        }
    }
}
