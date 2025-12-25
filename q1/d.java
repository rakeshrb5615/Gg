package q1;
public final class d implements androidx.lifecycle.e0 {
    public final androidx.loader.content.e a;
    public final q1.a b;
    public boolean c;

    public d(androidx.loader.content.e p2, q1.a p3)
    {
        this.c = 0;
        this.a = p2;
        this.b = p3;
        return;
    }

    public final void a(Object p3)
    {
        this.b.onLoadFinished(this.a, p3);
        this.c = 1;
        return;
    }

    public final String toString()
    {
        return this.b.toString();
    }
}
