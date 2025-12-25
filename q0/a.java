package q0;
public final class a extends android.view.View$AccessibilityDelegate {
    public final q0.b a;

    public a(q0.b p1)
    {
        this.a = p1;
        return;
    }

    public final boolean dispatchPopulateAccessibilityEvent(android.view.View p2, android.view.accessibility.AccessibilityEvent p3)
    {
        return this.a.a(p2, p3);
    }

    public final android.view.accessibility.AccessibilityNodeProvider getAccessibilityNodeProvider(android.view.View p2)
    {
        int v2_1 = this.a.b(p2);
        if (v2_1 == 0) {
            return 0;
        } else {
            return ((android.view.accessibility.AccessibilityNodeProvider) v2_1.b);
        }
    }

    public final void onInitializeAccessibilityEvent(android.view.View p2, android.view.accessibility.AccessibilityEvent p3)
    {
        this.a.c(p2, p3);
        return;
    }

    public final void onInitializeAccessibilityNodeInfo(android.view.View p8, android.view.accessibility.AccessibilityNodeInfo p9)
    {
        q0.b v1_0;
        r0.c v0_1 = new r0.c(p9);
        Object v2_0 = 0;
        if (android.os.Build$VERSION.SDK_INT < 28) {
            v1_0 = p8.getTag(2131362483);
            if (!Boolean.isInstance(v1_0)) {
                v1_0 = 0;
            }
        } else {
            v1_0 = Boolean.valueOf(q0.l0.c(p8));
        }
        q0.b v1_4;
        q0.b v1_2 = ((Boolean) v1_0);
        int v5_1 = 0;
        boolean v6_0 = 1;
        if ((v1_2 == null) || (!v1_2.booleanValue())) {
            v1_4 = 0;
        } else {
            v1_4 = 1;
        }
        q0.b v1_8;
        v0_1.m(v1_4);
        if (android.os.Build$VERSION.SDK_INT < 28) {
            v1_8 = p8.getTag(2131362477);
            if (!Boolean.isInstance(v1_8)) {
                v1_8 = 0;
            }
        } else {
            v1_8 = Boolean.valueOf(q0.l0.b(p8));
        }
        q0.b v1_10 = ((Boolean) v1_8);
        if ((v1_10 == null) || (!v1_10.booleanValue())) {
            v6_0 = 0;
        }
        v0_1.k(v6_0);
        v0_1.l(q0.q0.f(p8));
        q0.b v1_13 = android.os.Build$VERSION.SDK_INT;
        if (v1_13 < 30) {
            Object v4_1 = p8.getTag(2131362484);
            if (CharSequence.isInstance(v4_1)) {
                v2_0 = v4_1;
            }
        } else {
            v2_0 = q0.n0.b(p8);
        }
        Object v2_1 = ((CharSequence) v2_0);
        if (v1_13 < 30) {
            p9.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY", v2_1);
        } else {
            e0.b.j(p9, v2_1);
        }
        this.a.d(p8, v0_1);
        p9.getText();
        java.util.List v8_2 = ((java.util.List) p8.getTag(2131362475));
        if (v8_2 == null) {
            v8_2 = java.util.Collections.EMPTY_LIST;
        }
        while (v5_1 < v8_2.size()) {
            v0_1.b(((r0.b) v8_2.get(v5_1)));
            v5_1++;
        }
        return;
    }

    public final void onPopulateAccessibilityEvent(android.view.View p2, android.view.accessibility.AccessibilityEvent p3)
    {
        this.a.e(p2, p3);
        return;
    }

    public final boolean onRequestSendAccessibilityEvent(android.view.ViewGroup p2, android.view.View p3, android.view.accessibility.AccessibilityEvent p4)
    {
        return this.a.f(p2, p3, p4);
    }

    public final boolean performAccessibilityAction(android.view.View p2, int p3, android.os.Bundle p4)
    {
        return this.a.g(p2, p3, p4);
    }

    public final void sendAccessibilityEvent(android.view.View p2, int p3)
    {
        this.a.h(p2, p3);
        return;
    }

    public final void sendAccessibilityEventUnchecked(android.view.View p2, android.view.accessibility.AccessibilityEvent p3)
    {
        this.a.i(p2, p3);
        return;
    }
}
