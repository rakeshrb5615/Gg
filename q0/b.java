package q0;
public class b {
    public static final android.view.View$AccessibilityDelegate c;
    public final android.view.View$AccessibilityDelegate a;
    public final q0.a b;

    static b()
    {
        q0.b.c = new android.view.View$AccessibilityDelegate();
        return;
    }

    public b()
    {
        this(q0.b.c);
        return;
    }

    public b(android.view.View$AccessibilityDelegate p1)
    {
        this.a = p1;
        this.b = new q0.a(this);
        return;
    }

    public boolean a(android.view.View p2, android.view.accessibility.AccessibilityEvent p3)
    {
        return this.a.dispatchPopulateAccessibilityEvent(p2, p3);
    }

    public j6.o b(android.view.View p3)
    {
        int v3_1 = this.a.getAccessibilityNodeProvider(p3);
        if (v3_1 == 0) {
            return 0;
        } else {
            return new j6.o(v3_1, 11);
        }
    }

    public void c(android.view.View p2, android.view.accessibility.AccessibilityEvent p3)
    {
        this.a.onInitializeAccessibilityEvent(p2, p3);
        return;
    }

    public void d(android.view.View p2, r0.c p3)
    {
        this.a.onInitializeAccessibilityNodeInfo(p2, p3.a);
        return;
    }

    public void e(android.view.View p2, android.view.accessibility.AccessibilityEvent p3)
    {
        this.a.onPopulateAccessibilityEvent(p2, p3);
        return;
    }

    public boolean f(android.view.ViewGroup p2, android.view.View p3, android.view.accessibility.AccessibilityEvent p4)
    {
        return this.a.onRequestSendAccessibilityEvent(p2, p3, p4);
    }

    public boolean g(android.view.View p7, int p8, android.os.Bundle p9)
    {
        boolean v0_4 = ((java.util.List) p7.getTag(2131362475));
        if (!v0_4) {
            v0_4 = java.util.Collections.EMPTY_LIST;
        }
        int v1 = 0;
        Class v2_0 = 0;
        while(true) {
            boolean v0_3;
            android.text.style.ClickableSpan[] v4_0 = 0;
            if (v2_0 >= v0_4.size()) {
                v0_3 = 0;
            } else {
                ClassCastException v3_1 = ((r0.b) v0_4.get(v2_0));
                if (v3_1.a() == p8) {
                    break;
                }
                v2_0++;
            }
            if (!v0_3) {
                v0_3 = this.a.performAccessibilityAction(p7, p8, p9);
            }
            if ((!v0_3) && ((p8 == 2131361810) && (p9 != 0))) {
                android.text.style.ClickableSpan v8_2 = p9.getInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", -1);
                int v9_3 = ((android.util.SparseArray) p7.getTag(2131362476));
                if (v9_3 != 0) {
                    android.text.style.ClickableSpan v8_4 = ((ref.WeakReference) v9_3.get(v8_2));
                    if (v8_4 != null) {
                        android.text.style.ClickableSpan v8_6 = ((android.text.style.ClickableSpan) v8_4.get());
                        if (v8_6 != null) {
                            int v9_5 = p7.createAccessibilityNodeInfo().getText();
                            if ((v9_5 instanceof android.text.Spanned)) {
                                v4_0 = ((android.text.style.ClickableSpan[]) ((android.text.Spanned) v9_5).getSpans(0, v9_5.length(), android.text.style.ClickableSpan));
                            }
                            int v9_8 = 0;
                            while ((v4_0 != null) && (v9_8 < v4_0.length)) {
                                if (!v8_6.equals(v4_0[v9_8])) {
                                    v9_8++;
                                } else {
                                    v8_6.onClick(p7);
                                    v1 = 1;
                                    break;
                                }
                            }
                        }
                    }
                }
                v0_3 = v1;
            }
            return v0_3;
        }
        boolean v0_1 = v3_1.c;
        Class v2_1 = v3_1.d;
        if (v2_1 == null) {
        } else {
            if (v0_1) {
                if (v0_1.getDeclaredConstructor(0).newInstance(0) != null) {
                    throw new ClassCastException();
                } else {
                    throw 0;
                }
            }
            v0_3 = v2_1.a(p7);
        }
    }

    public void h(android.view.View p2, int p3)
    {
        this.a.sendAccessibilityEvent(p2, p3);
        return;
    }

    public void i(android.view.View p2, android.view.accessibility.AccessibilityEvent p3)
    {
        this.a.sendAccessibilityEventUnchecked(p2, p3);
        return;
    }
}
