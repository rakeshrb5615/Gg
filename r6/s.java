package r6;
public final class s implements t6.b {
    public final synthetic int a;
    public final k4.i b;
    public final g7.a c;

    public synthetic s(k4.i p1, t6.c p2, int p3)
    {
        this.a = p3;
        this.b = p1;
        this.c = p2;
        return;
    }

    public s(t6.c p2, k4.i p3)
    {
        this.a = 2;
        this.c = p2;
        this.b = p3;
        return;
    }

    public final Object get()
    {
        switch (this.a) {
            case 0:
                android.content.Context v0_3 = ((android.content.Context) this.b.b);
                r6.h1 v1_2 = ((l7.h) this.c.get());
                kotlin.jvm.internal.j.e(v0_3, "appContext");
                kotlin.jvm.internal.j.e(v1_2, "blockingDispatcher");
                return r6.q.b(u6.i.a, new l6.c(new d8.y(1), 7), d8.f0.b(v1_2), new r6.p(v0_3, 0));
            case 1:
                return new r6.c0(((android.content.Context) this.b.b), ((r6.h1) this.c.get()));
            default:
                return new u6.e(((r6.b) this.c.get()), ((l7.h) this.b.b));
        }
    }
}
