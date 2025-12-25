package a2;
public final class m1 extends q0.b {
    public final androidx.recyclerview.widget.RecyclerView d;
    public final a2.l1 e;

    public m1(androidx.recyclerview.widget.RecyclerView p1)
    {
        this.d = p1;
        a2.l1 v1_1 = this.e;
        if (v1_1 == null) {
            this.e = new a2.l1(this);
            return;
        } else {
            this.e = v1_1;
            return;
        }
    }

    public final void c(android.view.View p2, android.view.accessibility.AccessibilityEvent p3)
    {
        super.c(p2, p3);
        if (((p2 instanceof androidx.recyclerview.widget.RecyclerView)) && ((!this.d.O()) && (((androidx.recyclerview.widget.RecyclerView) p2).getLayoutManager() != null))) {
            ((androidx.recyclerview.widget.RecyclerView) p2).getLayoutManager().U(p3);
        }
        return;
    }

    public final void d(android.view.View p3, r0.c p4)
    {
        this.a.onInitializeAccessibilityNodeInfo(p3, p4.a);
        a2.t0 v3_2 = this.d;
        if ((!v3_2.O()) && (v3_2.getLayoutManager() != null)) {
            a2.t0 v3_1 = v3_2.getLayoutManager();
            a2.g1 v0_1 = v3_1.b;
            v3_1.V(v0_1.c, v0_1.k0, p4);
        }
        return;
    }

    public final boolean g(android.view.View p2, int p3, android.os.Bundle p4)
    {
        if (!super.g(p2, p3, p4)) {
            boolean v2_6 = this.d;
            if ((v2_6.O()) || (v2_6.getLayoutManager() == null)) {
                return 0;
            } else {
                return v2_6.getLayoutManager().i0(p3, p4);
            }
        } else {
            return 1;
        }
    }
}
