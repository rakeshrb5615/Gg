package t;
public final class a {
    public static final t.a c;
    public static final t.a d;
    public final boolean a;
    public final Throwable b;

    static a()
    {
        if (!t.h.d) {
            t.a.d = new t.a(0, 0);
            t.a.c = new t.a(1, 0);
            return;
        } else {
            t.a.d = 0;
            t.a.c = 0;
            return;
        }
    }

    public a(boolean p1, Throwable p2)
    {
        this.a = p1;
        this.b = p2;
        return;
    }
}
