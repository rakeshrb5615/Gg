package b0;
public abstract class g {
    public static final ThreadLocal a;
    public static final ThreadLocal b;

    static g()
    {
        b0.g.a = new ThreadLocal();
        b0.g.b = new ThreadLocal();
        return;
    }

    public static void a(androidx.coordinatorlayout.widget.CoordinatorLayout p2, android.view.View p3, android.graphics.Matrix p4)
    {
        float v0_0 = p3.getParent();
        if (((v0_0 instanceof android.view.View)) && (v0_0 != p2)) {
            float v0_6 = ((android.view.View) v0_0);
            b0.g.a(p2, v0_6, p4);
            p4.preTranslate(((float) (- v0_6.getScrollX())), ((float) (- v0_6.getScrollY())));
        }
        p4.preTranslate(((float) p3.getLeft()), ((float) p3.getTop()));
        if (!p3.getMatrix().isIdentity()) {
            p4.preConcat(p3.getMatrix());
        }
        return;
    }
}
