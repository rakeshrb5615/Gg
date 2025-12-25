package q4;
public final class g implements a5.f {
    public static final q4.g b;
    public static final q4.g c;
    public static final q4.g d;
    public static final q4.g e;
    public final synthetic int a;

    static synthetic g()
    {
        q4.g.b = new q4.g(0);
        q4.g.c = new q4.g(1);
        q4.g.d = new q4.g(2);
        q4.g.e = new q4.g(3);
        return;
    }

    public synthetic g(int p1)
    {
        this.a = p1;
        return;
    }

    public final Object e(a5.z p4)
    {
        switch (this.a) {
            case 0:
                java.util.concurrent.Executor v4_4 = p4.e(new a5.x(w4.a, java.util.concurrent.Executor));
                kotlin.jvm.internal.j.d(v4_4, "get(...)");
                return new d8.z0(((java.util.concurrent.Executor) v4_4));
            case 1:
                java.util.concurrent.Executor v4_2 = p4.e(new a5.x(w4.c, java.util.concurrent.Executor));
                kotlin.jvm.internal.j.d(v4_2, "get(...)");
                return new d8.z0(((java.util.concurrent.Executor) v4_2));
            case 2:
                java.util.concurrent.Executor v4_8 = p4.e(new a5.x(w4.b, java.util.concurrent.Executor));
                kotlin.jvm.internal.j.d(v4_8, "get(...)");
                return new d8.z0(((java.util.concurrent.Executor) v4_8));
            default:
                java.util.concurrent.Executor v4_6 = p4.e(new a5.x(w4.d, java.util.concurrent.Executor));
                kotlin.jvm.internal.j.d(v4_6, "get(...)");
                return new d8.z0(((java.util.concurrent.Executor) v4_6));
        }
    }
}
