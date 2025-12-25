package q0;
public abstract class i0 {

    public static void a(android.view.WindowInsets p1, android.view.View p2)
    {
        android.view.View$OnApplyWindowInsetsListener v0_2 = ((android.view.View$OnApplyWindowInsetsListener) p2.getTag(2131362489));
        if (v0_2 != null) {
            v0_2.onApplyWindowInsets(p2, p1);
        }
        return;
    }

    public static q0.s1 b(android.view.View p1, q0.s1 p2, android.graphics.Rect p3)
    {
        android.view.WindowInsets v0 = p2.f();
        if (v0 == null) {
            p3.setEmpty();
            return p2;
        } else {
            return q0.s1.g(p1, p1.computeSystemWindowInsets(v0, p3));
        }
    }

    public static android.content.res.ColorStateList c(android.view.View p0)
    {
        return p0.getBackgroundTintList();
    }

    public static android.graphics.PorterDuff$Mode d(android.view.View p0)
    {
        return p0.getBackgroundTintMode();
    }

    public static String e(android.view.View p0)
    {
        return p0.getTransitionName();
    }

    public static float f(android.view.View p0)
    {
        return p0.getZ();
    }

    public static void g(android.view.View p0, android.content.res.ColorStateList p1)
    {
        p0.setBackgroundTintList(p1);
        return;
    }

    public static void h(android.view.View p0, android.graphics.PorterDuff$Mode p1)
    {
        p0.setBackgroundTintMode(p1);
        return;
    }

    public static void i(android.view.View p0, float p1)
    {
        p0.setElevation(p1);
        return;
    }

    public static void j(android.view.View p2, q0.t p3)
    {
        int v0_0;
        if (p3 == null) {
            v0_0 = 0;
        } else {
            v0_0 = new q0.h0(p2, p3);
        }
        if (android.os.Build$VERSION.SDK_INT < 30) {
            p2.setTag(2131362480, v0_0);
        }
        if (p2.getTag(2131362479) == null) {
            if (v0_0 == 0) {
                p2.setOnApplyWindowInsetsListener(((android.view.View$OnApplyWindowInsetsListener) p2.getTag(2131362489)));
                return;
            } else {
                p2.setOnApplyWindowInsetsListener(v0_0);
                return;
            }
        } else {
            return;
        }
    }

    public static void k(android.view.View p0, String p1)
    {
        p0.setTransitionName(p1);
        return;
    }

    public static void l(android.view.View p0)
    {
        p0.stopNestedScroll();
        return;
    }
}
