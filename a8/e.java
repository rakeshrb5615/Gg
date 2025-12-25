package a8;
public final class e implements a8.f {
    public final synthetic int a;
    public final Object b;
    public final h7.a c;

    public e(CharSequence p2, b8.q p3)
    {
        this.a = 2;
        kotlin.jvm.internal.j.e(p2, "input");
        this.b = p2;
        this.c = p3;
        return;
    }

    public synthetic e(Object p1, u7.l p2, int p3)
    {
        this.a = p3;
        this.b = p1;
        this.c = p2;
        return;
    }

    public final java.util.Iterator iterator()
    {
        switch (this.a) {
            case 0:
                return new a8.d(this);
            case 1:
                return new a8.l(this);
            default:
                return new b8.b(this);
        }
    }
}
