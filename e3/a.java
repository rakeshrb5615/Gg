package e3;
public abstract class a extends b0.a {
    public e3.b a;

    public boolean k(androidx.coordinatorlayout.widget.CoordinatorLayout p2, android.view.View p3, int p4)
    {
        this.v(p2, p3, p4);
        if (this.a == null) {
            this.a = new e3.b(p3);
        }
        int v2_8 = this.a;
        android.view.View v3_5 = ((android.view.View) v2_8.c);
        v2_8.a = v3_5.getTop();
        v2_8.b = v3_5.getLeft();
        int v2_2 = this.a;
        android.view.View v3_3 = ((android.view.View) v2_2.c);
        v3_3.offsetTopAndBottom((0 - (v3_3.getTop() - v2_2.a)));
        v3_3.offsetLeftAndRight((0 - (v3_3.getLeft() - v2_2.b)));
        return 1;
    }

    public void v(androidx.coordinatorlayout.widget.CoordinatorLayout p1, android.view.View p2, int p3)
    {
        p1.q(p2, p3);
        return;
    }
}
