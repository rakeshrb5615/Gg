package q0;
public final class f0 implements android.view.ViewTreeObserver$OnGlobalLayoutListener, android.view.View$OnAttachStateChangeListener {
    public final java.util.WeakHashMap a;

    public f0()
    {
        this.a = new java.util.WeakHashMap();
        return;
    }

    public final void onGlobalLayout()
    {
        if (android.os.Build$VERSION.SDK_INT < 28) {
            java.util.Iterator v0_3 = this.a.entrySet().iterator();
            while (v0_3.hasNext()) {
                int v4_2;
                java.util.Map$Entry v1_2 = ((java.util.Map$Entry) v0_3.next());
                Boolean v2_1 = ((android.view.View) v1_2.getKey());
                boolean vtmp7 = ((Boolean) v1_2.getValue()).booleanValue();
                if ((!v2_1.isShown()) || (v2_1.getWindowVisibility() != 0)) {
                    v4_2 = 0;
                } else {
                    v4_2 = 1;
                }
                if (vtmp7 != v4_2) {
                    int v3_3;
                    if (v4_2 == 0) {
                        v3_3 = 32;
                    } else {
                        v3_3 = 16;
                    }
                    q0.q0.i(v2_1, v3_3);
                    v1_2.setValue(Boolean.valueOf(v4_2));
                }
            }
        }
        return;
    }

    public final void onViewAttachedToWindow(android.view.View p1)
    {
        p1.getViewTreeObserver().addOnGlobalLayoutListener(this);
        return;
    }

    public final void onViewDetachedFromWindow(android.view.View p1)
    {
        return;
    }
}
