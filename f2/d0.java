package f2;
public class d0 extends j5.t1 {
    public static boolean f = True;
    public static boolean g = True;
    public static boolean h = True;
    public static boolean i = True;

    public void T(android.view.View p3, int p4)
    {
        if (android.os.Build$VERSION.SDK_INT != 28) {
            if (f2.d0.i) {
                try {
                    f2.b0.l(p3, p4);
                    return;
                } catch (NoSuchMethodError) {
                    f2.d0.i = 0;
                }
            }
            return;
        } else {
            super.T(p3, p4);
            return;
        }
    }

    public void W(android.view.View p2, int p3, int p4, int p5, int p6)
    {
        if (f2.d0.h) {
            try {
                f2.b0.j(p2, p3, p4, p5, p6);
                return;
            } catch (NoSuchMethodError) {
                f2.d0.h = 0;
            }
        }
        return;
    }

    public void X(android.view.View p2, android.graphics.Matrix p3)
    {
        if (f2.d0.f) {
            try {
                f2.b0.n(p2, p3);
                return;
            } catch (NoSuchMethodError) {
                f2.d0.f = 0;
            }
        }
        return;
    }

    public void Y(android.view.View p2, android.graphics.Matrix p3)
    {
        if (f2.d0.g) {
            try {
                f2.b0.o(p2, p3);
                return;
            } catch (NoSuchMethodError) {
                f2.d0.g = 0;
            }
        }
        return;
    }
}
