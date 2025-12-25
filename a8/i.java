package a8;
public final class i implements a8.f {
    public final synthetic int a;
    public final synthetic Object b;

    public synthetic i(Object p1, int p2)
    {
        this.a = p2;
        this.b = p1;
        return;
    }

    public i(u7.p p2)
    {
        this.a = 0;
        this.b = ((n7.h) p2);
        return;
    }

    public final java.util.Iterator iterator()
    {
        switch (this.a) {
            case 0:
                b8.c v0_2 = ((n7.h) this.b);
                CharSequence v1_1 = new a8.g();
                v1_1.d = q4.b.k(v1_1, v1_1, v0_2);
                return v1_1;
            case 1:
                return ((java.util.Iterator) this.b);
            case 2:
                return new b8.c(((CharSequence) this.b));
            default:
                return ((Iterable) this.b).iterator();
        }
    }
}
