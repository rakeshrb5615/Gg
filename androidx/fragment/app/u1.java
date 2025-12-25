package androidx.fragment.app;
public abstract class u1 {

    public static void d(java.util.List p8, android.view.View p9)
    {
        int v0 = p8.size();
        android.view.ViewGroup v2_4 = 0;
        while (v2_4 < v0) {
            if (p8.get(v2_4) != p9) {
                v2_4++;
            }
            return;
        }
        if (q0.i0.e(p9) != null) {
            p8.add(p9);
        }
        int v9_1 = v0;
        while (v9_1 < p8.size()) {
            android.view.ViewGroup v2_2 = ((android.view.View) p8.get(v9_1));
            if ((v2_2 instanceof android.view.ViewGroup)) {
                android.view.ViewGroup v2_3 = ((android.view.ViewGroup) v2_2);
                int v3_1 = v2_3.getChildCount();
                int v4 = 0;
                while (v4 < v3_1) {
                    android.view.View v5 = v2_3.getChildAt(v4);
                    int v6_0 = 0;
                    while (v6_0 < v0) {
                        if (p8.get(v6_0) != v5) {
                            v6_0++;
                        }
                        v4++;
                    }
                    if (q0.i0.e(v5) != null) {
                        p8.add(v5);
                    }
                }
            }
            v9_1++;
        }
        return;
    }

    public static void g(android.view.View p4, android.graphics.Rect p5)
    {
        if (p4.isAttachedToWindow()) {
            int v0_3 = new android.graphics.RectF();
            v0_3.set(0, 0, ((float) p4.getWidth()), ((float) p4.getHeight()));
            p4.getMatrix().mapRect(v0_3);
            v0_3.offset(((float) p4.getLeft()), ((float) p4.getTop()));
            int v1_3 = p4.getParent();
            while ((v1_3 instanceof android.view.View)) {
                int v1_10 = ((android.view.View) v1_3);
                v0_3.offset(((float) (- v1_10.getScrollX())), ((float) (- v1_10.getScrollY())));
                v1_10.getMatrix().mapRect(v0_3);
                v0_3.offset(((float) v1_10.getLeft()), ((float) v1_10.getTop()));
                v1_3 = v1_10.getParent();
            }
            int v1_5 = new int[2];
            p4.getRootView().getLocationOnScreen(v1_5);
            v0_3.offset(((float) v1_5[0]), ((float) v1_5[1]));
            p5.set(Math.round(v0_3.left), Math.round(v0_3.top), Math.round(v0_3.right), Math.round(v0_3.bottom));
            return;
        } else {
            return;
        }
    }

    public static boolean h(java.util.List p0)
    {
        if ((p0 != 0) && (!p0.isEmpty())) {
            return 0;
        } else {
            return 1;
        }
    }

    public abstract void a();

    public abstract void b();

    public abstract void c();

    public abstract boolean e();

    public abstract Object f();

    public abstract Object i();

    public abstract Object j();

    public abstract void k();

    public abstract void l();

    public abstract void m();

    public abstract void n();

    public abstract void o();

    public abstract void p();

    public abstract void q();

    public abstract Object r();
}
