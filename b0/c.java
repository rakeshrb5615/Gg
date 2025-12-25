package b0;
public final class c implements android.view.ViewGroup$OnHierarchyChangeListener {
    public final synthetic androidx.coordinatorlayout.widget.CoordinatorLayout a;

    public c(androidx.coordinatorlayout.widget.CoordinatorLayout p1)
    {
        this.a = p1;
        return;
    }

    public final void onChildViewAdded(android.view.View p2, android.view.View p3)
    {
        android.view.ViewGroup$OnHierarchyChangeListener v0_1 = this.a.w;
        if (v0_1 != null) {
            v0_1.onChildViewAdded(p2, p3);
        }
        return;
    }

    public final void onChildViewRemoved(android.view.View p3, android.view.View p4)
    {
        androidx.coordinatorlayout.widget.CoordinatorLayout v1 = this.a;
        v1.p(2);
        android.view.ViewGroup$OnHierarchyChangeListener v0_1 = v1.w;
        if (v0_1 != null) {
            v0_1.onChildViewRemoved(p3, p4);
        }
        return;
    }
}
