package q3;
public abstract class c {
    public static final ThreadLocal a;
    public static final ThreadLocal b;

    static c()
    {
        q3.c.a = new ThreadLocal();
        q3.c.b = new ThreadLocal();
        return;
    }

    public static void a(android.view.ViewParent p2, android.view.View p3, android.graphics.Matrix p4)
    {
        float v0_0 = p3.getParent();
        if (((v0_0 instanceof android.view.View)) && (v0_0 != p2)) {
            float v0_6 = ((android.view.View) v0_0);
            q3.c.a(p2, v0_6, p4);
            p4.preTranslate(((float) (- v0_6.getScrollX())), ((float) (- v0_6.getScrollY())));
        }
        p4.preTranslate(((float) p3.getLeft()), ((float) p3.getTop()));
        if (!p3.getMatrix().isIdentity()) {
            p4.preConcat(p3.getMatrix());
        }
        return;
    }

    public static void b(android.view.ViewGroup p3, android.view.View p4, android.graphics.Rect p5)
    {
        int v0_0 = q3.c.a;
        int v1_4 = ((android.graphics.Matrix) v0_0.get());
        if (v1_4 != 0) {
            v1_4.reset();
        } else {
            v1_4 = new android.graphics.Matrix();
            v0_0.set(v1_4);
        }
        q3.c.a(p3, p4, v1_4);
        int v3_1 = q3.c.b;
        int v4_2 = ((android.graphics.RectF) v3_1.get());
        if (v4_2 == 0) {
            v4_2 = new android.graphics.RectF();
            v3_1.set(v4_2);
        }
        v4_2.set(p5);
        v1_4.mapRect(v4_2);
        p5.set(((int) (v4_2.left + 1056964608)), ((int) (v4_2.top + 1056964608)), ((int) (v4_2.right + 1056964608)), ((int) (v4_2.bottom + 1056964608)));
        return;
    }
}
