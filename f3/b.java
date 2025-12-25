package f3;
public final class b implements android.view.View$OnAttachStateChangeListener {
    public final synthetic int a;
    public final synthetic Object b;

    public synthetic b(Object p1, int p2)
    {
        this.a = p2;
        this.b = p1;
        return;
    }

    private final void a(android.view.View p1)
    {
        return;
    }

    private final void b(android.view.View p1)
    {
        return;
    }

    private final void c(android.view.View p1)
    {
        return;
    }

    private final void d(android.view.View p1)
    {
        return;
    }

    public final void onViewAttachedToWindow(android.view.View p3)
    {
        switch (this.a) {
            case 0:
            case 1:
            case 2:
            case 3:
                break;
            case 0:
            case 1:
            case 2:
            case 3:
                break;
            case 0:
            case 1:
            case 2:
            case 3:
                break;
            case 0:
            case 1:
            case 2:
            case 3:
                break;
            default:
                android.view.accessibility.AccessibilityManager$TouchExplorationStateChangeListener v3_3 = ((z3.o) this.b);
                android.view.accessibility.AccessibilityManager v0 = v3_3.z;
                if ((v3_3.A == null) || ((v0 == null) || (!v3_3.isAttachedToWindow()))) {
                } else {
                    v0.addTouchExplorationStateChangeListener(v3_3.A);
                }
        }
        return;
    }

    public final void onViewDetachedFromWindow(android.view.View p3)
    {
        switch (this.a) {
            case 0:
                android.view.accessibility.AccessibilityManager v3_4 = ((com.google.android.material.behavior.HideBottomViewOnScrollBehavior) this.b);
                m.d v0_9 = v3_4.h;
                if (v0_9 != null) {
                    android.view.ViewTreeObserver v1_8 = v3_4.g;
                    if (v1_8 != null) {
                        v1_8.removeTouchExplorationStateChangeListener(v0_9);
                        v3_4.h = 0;
                    }
                }
                return;
            case 1:
                android.view.accessibility.AccessibilityManager v3_2 = ((com.google.android.material.behavior.HideViewOnScrollBehavior) this.b);
                m.d v0_7 = v3_2.c;
                if (v0_7 != null) {
                    android.view.ViewTreeObserver v1_6 = v3_2.b;
                    if (v1_6 != null) {
                        v1_6.removeTouchExplorationStateChangeListener(v0_7);
                        v3_2.c = 0;
                    }
                }
                return;
            case 2:
                m.d v0_3 = ((m.g) this.b);
                android.view.ViewTreeObserver v1_2 = v0_3.D;
                if (v1_2 != null) {
                    if (!v1_2.isAlive()) {
                        v0_3.D = p3.getViewTreeObserver();
                    }
                    v0_3.D.removeGlobalOnLayoutListener(v0_3.o);
                }
                p3.removeOnAttachStateChangeListener(this);
                return;
            case 3:
                m.d v0_6 = ((m.d0) this.b);
                android.view.ViewTreeObserver v1_7 = v0_6.u;
                if (v1_7 != null) {
                    if (!v1_7.isAlive()) {
                        v0_6.u = p3.getViewTreeObserver();
                    }
                    v0_6.u.removeGlobalOnLayoutListener(v0_6.o);
                }
                p3.removeOnAttachStateChangeListener(this);
                return;
            default:
                android.view.accessibility.AccessibilityManager v3_6 = ((z3.o) this.b);
                m.d v0_11 = v3_6.A;
                if (v0_11 != null) {
                    android.view.accessibility.AccessibilityManager v3_7 = v3_6.z;
                    if (v3_7 != null) {
                        v3_7.removeTouchExplorationStateChangeListener(v0_11);
                    }
                }
                return;
        }
    }
}
