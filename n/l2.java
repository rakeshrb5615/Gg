package n;
public final class l2 extends n.g2 implements n.h2 {
    public static final reflect.Method J;
    public j6.o I;

    static l2()
    {
        try {
            if (android.os.Build$VERSION.SDK_INT <= 28) {
                n.l2.J = android.widget.PopupWindow.getDeclaredMethod("setTouchModal", new Class[] {Boolean.TYPE}));
            }
        } catch (NoSuchMethodException) {
            android.util.Log.i("MenuPopupWindow", "Could not find method setTouchModal() on PopupWindow. Oh well.");
            return;
        }
        return;
    }

    public final void d(m.m p2, m.o p3)
    {
        j6.o v0 = this.I;
        if (v0 != null) {
            v0.d(p2, p3);
        }
        return;
    }

    public final void n(m.m p2, android.view.MenuItem p3)
    {
        j6.o v0 = this.I;
        if (v0 != null) {
            v0.n(p2, p3);
        }
        return;
    }

    public final n.t1 q(android.content.Context p2, boolean p3)
    {
        n.k2 v0_1 = new n.k2(p2, p3);
        v0_1.setHoverListener(this);
        return v0_1;
    }
}
