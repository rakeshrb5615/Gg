package a2;
public final class n1 extends a2.w0 {
    public boolean a;
    public final synthetic a2.c0 b;

    public n1(a2.c0 p1)
    {
        this.b = p1;
        this.a = 0;
        return;
    }

    public final void a(androidx.recyclerview.widget.RecyclerView p1, int p2)
    {
        if ((p2 == 0) && (this.a)) {
            this.a = 0;
            this.b.l();
        }
        return;
    }

    public final void b(androidx.recyclerview.widget.RecyclerView p1, int p2, int p3)
    {
        if ((p2 == 0) && (p3 == 0)) {
            return;
        } else {
            this.a = 1;
            return;
        }
    }
}
