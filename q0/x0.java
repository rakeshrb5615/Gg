package q0;
public final class x0 extends q0.b1 {
    public static final android.view.animation.PathInterpolator e;
    public static final l1.a f;
    public static final android.view.animation.DecelerateInterpolator g;
    public static final android.view.animation.AccelerateInterpolator h;

    static x0()
    {
        q0.x0.e = new android.view.animation.PathInterpolator(0, 1066192077, 0, 1065353216);
        q0.x0.f = new l1.a(0);
        q0.x0.g = new android.view.animation.DecelerateInterpolator(1069547520);
        q0.x0.h = new android.view.animation.AccelerateInterpolator(1069547520);
        return;
    }

    public static void e(android.view.View p2)
    {
        int v0_0 = q0.x0.j(p2);
        if (v0_0 == 0) {
            if ((p2 instanceof android.view.ViewGroup)) {
                int v0_1 = 0;
                while (v0_1 < ((android.view.ViewGroup) p2).getChildCount()) {
                    q0.x0.e(((android.view.ViewGroup) p2).getChildAt(v0_1));
                    v0_1++;
                }
            }
            return;
        } else {
            ((android.view.View) v0_0.d).setTranslationY(0);
            return;
        }
    }

    public static void f(android.view.View p2, q0.s1 p3, boolean p4)
    {
        int v0_0 = q0.x0.j(p2);
        if (v0_0 != 0) {
            v0_0.c = p3;
            if (p4 == 0) {
                android.view.View v1_4 = ((int[]) v0_0.e);
                ((android.view.View) v0_0.d).getLocationOnScreen(v1_4);
                p4 = 1;
                v0_0.a = v1_4[1];
            }
        }
        if ((p2 instanceof android.view.ViewGroup)) {
            int v0_2 = 0;
            while (v0_2 < ((android.view.ViewGroup) p2).getChildCount()) {
                q0.x0.f(((android.view.ViewGroup) p2).getChildAt(v0_2), p3, p4);
                v0_2++;
            }
        }
        return;
    }

    public static void g(android.view.View p2, q0.s1 p3, java.util.List p4)
    {
        int v0_0 = q0.x0.j(p2);
        if (v0_0 == 0) {
            if ((p2 instanceof android.view.ViewGroup)) {
                int v0_1 = 0;
                while (v0_1 < ((android.view.ViewGroup) p2).getChildCount()) {
                    q0.x0.g(((android.view.ViewGroup) p2).getChildAt(v0_1), p3, p4);
                    v0_1++;
                }
            }
            return;
        } else {
            v0_0.e(p3, p4);
            return;
        }
    }

    public static void h(android.view.View p2, n0.a p3)
    {
        int v0_0 = q0.x0.j(p2);
        if (v0_0 == 0) {
            if ((p2 instanceof android.view.ViewGroup)) {
                int v0_1 = 0;
                while (v0_1 < ((android.view.ViewGroup) p2).getChildCount()) {
                    q0.x0.h(((android.view.ViewGroup) p2).getChildAt(v0_1), p3);
                    v0_1++;
                }
            }
            return;
        } else {
            android.view.ViewGroup v2_2 = ((android.view.View) v0_0.d);
            float v3_2 = ((int[]) v0_0.e);
            v2_2.getLocationOnScreen(v3_2);
            android.view.View v1_3 = (v0_0.a - v3_2[1]);
            v0_0.b = v1_3;
            v2_2.setTranslationY(((float) v1_3));
            return;
        }
    }

    public static android.view.WindowInsets i(android.view.View p1, android.view.WindowInsets p2)
    {
        if (p1.getTag(2131362480) == null) {
            return p1.onApplyWindowInsets(p2);
        } else {
            return p2;
        }
    }

    public static h3.k j(android.view.View p1)
    {
        int v1_1 = p1.getTag(2131362489);
        if (!(v1_1 instanceof q0.w0)) {
            return 0;
        } else {
            return ((q0.w0) v1_1).a;
        }
    }
}
