package f2;
public final class e0 extends f2.d0 {

    public final float G(android.view.View p1)
    {
        return p1.getTransitionAlpha();
    }

    public final void S(android.view.View p1, float p2)
    {
        p1.setTransitionAlpha(p2);
        return;
    }

    public final void T(android.view.View p1, int p2)
    {
        p1.setTransitionVisibility(p2);
        return;
    }

    public final void W(android.view.View p1, int p2, int p3, int p4, int p5)
    {
        p1.setLeftTopRightBottom(p2, p3, p4, p5);
        return;
    }

    public final void X(android.view.View p1, android.graphics.Matrix p2)
    {
        p1.transformMatrixToGlobal(p2);
        return;
    }

    public final void Y(android.view.View p1, android.graphics.Matrix p2)
    {
        p1.transformMatrixToLocal(p2);
        return;
    }
}
