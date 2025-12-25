package a2;
public final class l1 extends q0.b {
    public final a2.m1 d;
    public final java.util.WeakHashMap e;

    public l1(a2.m1 p2)
    {
        this.e = new java.util.WeakHashMap();
        this.d = p2;
        return;
    }

    public final boolean a(android.view.View p2, android.view.accessibility.AccessibilityEvent p3)
    {
        android.view.View$AccessibilityDelegate v0_2 = ((q0.b) this.e.get(p2));
        if (v0_2 == null) {
            return this.a.dispatchPopulateAccessibilityEvent(p2, p3);
        } else {
            return v0_2.a(p2, p3);
        }
    }

    public final j6.o b(android.view.View p2)
    {
        q0.b v0_2 = ((q0.b) this.e.get(p2));
        if (v0_2 == null) {
            return super.b(p2);
        } else {
            return v0_2.b(p2);
        }
    }

    public final void c(android.view.View p2, android.view.accessibility.AccessibilityEvent p3)
    {
        q0.b v0_2 = ((q0.b) this.e.get(p2));
        if (v0_2 == null) {
            super.c(p2, p3);
            return;
        } else {
            v0_2.c(p2, p3);
            return;
        }
    }

    public final void d(android.view.View p5, r0.c p6)
    {
        android.view.accessibility.AccessibilityNodeInfo v0 = p6.a;
        q0.b v1_0 = this.d;
        q0.b v1_5 = v1_0.d;
        android.view.View$AccessibilityDelegate v3 = this.a;
        if ((v1_0.d.O()) || (v1_5.getLayoutManager() == null)) {
            v3.onInitializeAccessibilityNodeInfo(p5, v0);
            return;
        } else {
            v1_5.getLayoutManager().X(p5, p6);
            q0.b v1_4 = ((q0.b) this.e.get(p5));
            if (v1_4 == null) {
                v3.onInitializeAccessibilityNodeInfo(p5, v0);
                return;
            } else {
                v1_4.d(p5, p6);
                return;
            }
        }
    }

    public final void e(android.view.View p2, android.view.accessibility.AccessibilityEvent p3)
    {
        q0.b v0_2 = ((q0.b) this.e.get(p2));
        if (v0_2 == null) {
            super.e(p2, p3);
            return;
        } else {
            v0_2.e(p2, p3);
            return;
        }
    }

    public final boolean f(android.view.ViewGroup p2, android.view.View p3, android.view.accessibility.AccessibilityEvent p4)
    {
        android.view.View$AccessibilityDelegate v0_2 = ((q0.b) this.e.get(p2));
        if (v0_2 == null) {
            return this.a.onRequestSendAccessibilityEvent(p2, p3, p4);
        } else {
            return v0_2.f(p2, p3, p4);
        }
    }

    public final boolean g(android.view.View p3, int p4, android.os.Bundle p5)
    {
        androidx.recyclerview.widget.RecyclerView v0_0 = this.d;
        androidx.recyclerview.widget.RecyclerView v0_1 = v0_0.d;
        if ((v0_0.d.O()) || (v0_1.getLayoutManager() == null)) {
            return super.g(p3, p4, p5);
        } else {
            q0.b v1_3 = ((q0.b) this.e.get(p3));
            if (v1_3 == null) {
                if (super.g(p3, p4, p5)) {
                    return 1;
                }
            } else {
                if (v1_3.g(p3, p4, p5)) {
                    return 1;
                }
            }
            v0_1.getLayoutManager();
            return 0;
        }
    }

    public final void h(android.view.View p2, int p3)
    {
        q0.b v0_2 = ((q0.b) this.e.get(p2));
        if (v0_2 == null) {
            super.h(p2, p3);
            return;
        } else {
            v0_2.h(p2, p3);
            return;
        }
    }

    public final void i(android.view.View p2, android.view.accessibility.AccessibilityEvent p3)
    {
        q0.b v0_2 = ((q0.b) this.e.get(p2));
        if (v0_2 == null) {
            super.i(p2, p3);
            return;
        } else {
            v0_2.i(p2, p3);
            return;
        }
    }
}
