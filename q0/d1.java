package q0;
public final class d1 extends q0.i1 {
    public static reflect.Field e = None;
    public static boolean f = False;
    public static reflect.Constructor g = None;
    public static boolean h = False;
    public android.view.WindowInsets c;
    public h0.b d;

    public d1()
    {
        this.c = q0.d1.i();
        return;
    }

    public d1(q0.s1 p1)
    {
        super(p1);
        super.c = p1.f();
        return;
    }

    private static android.view.WindowInsets i()
    {
        if (!q0.d1.f) {
            try {
                q0.d1.e = android.view.WindowInsets.getDeclaredField("CONSUMED");
            } catch (ReflectiveOperationException v0_16) {
                android.util.Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets.CONSUMED field", v0_16);
            }
            q0.d1.f = 1;
        }
        ReflectiveOperationException v0_1 = q0.d1.e;
        if (v0_1 != null) {
            try {
                ReflectiveOperationException v0_3 = ((android.view.WindowInsets) v0_1.get(0));
            } catch (ReflectiveOperationException v0_4) {
                android.util.Log.i("WindowInsetsCompat", "Could not get value from WindowInsets.CONSUMED field", v0_4);
            }
            if (v0_3 != null) {
                return new android.view.WindowInsets(v0_3);
            }
        }
        if (!q0.d1.h) {
            try {
                q0.d1.g = android.view.WindowInsets.getConstructor(new Class[] {android.graphics.Rect}));
            } catch (ReflectiveOperationException v0_9) {
                android.util.Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets(Rect) constructor", v0_9);
            }
            q0.d1.h = 1;
        }
        ReflectiveOperationException v0_10 = q0.d1.g;
        if (v0_10 != null) {
            try {
                return ((android.view.WindowInsets) v0_10.newInstance(new Object[] {new android.graphics.Rect()})));
            } catch (ReflectiveOperationException v0_13) {
                android.util.Log.i("WindowInsetsCompat", "Could not invoke WindowInsets(Rect) constructor", v0_13);
            }
        }
        return 0;
    }

    public q0.s1 b()
    {
        this.a();
        q0.s1 v0_1 = q0.s1.g(0, this.c);
        q0.p1 v2 = v0_1.a;
        v2.o(this.b);
        v2.q(this.d);
        return v0_1;
    }

    public void e(h0.b p1)
    {
        this.d = p1;
        return;
    }

    public void g(h0.b p5)
    {
        android.view.WindowInsets v0 = this.c;
        if (v0 != null) {
            this.c = v0.replaceSystemWindowInsets(p5.a, p5.b, p5.c, p5.d);
        }
        return;
    }
}
