package f2;
public abstract class c0 {
    public static final f2.d0 a;
    public static final f2.b b;

    static c0()
    {
        if (android.os.Build$VERSION.SDK_INT < 29) {
            f2.c0.a = new f2.d0();
        } else {
            f2.c0.a = new f2.e0();
        }
        f2.c0.b = new f2.b("translationAlpha", 5, Float);
        new f2.b("clipBounds", 6, android.graphics.Rect);
        return;
    }

    public static void a(android.view.View p6, int p7, int p8, int p9, int p10)
    {
        f2.c0.a.W(p6, p7, p8, p9, p10);
        return;
    }

    public static void b(android.view.View p1, int p2)
    {
        f2.c0.a.T(p1, p2);
        return;
    }
}
