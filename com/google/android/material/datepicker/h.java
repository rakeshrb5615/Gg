package com.google.android.material.datepicker;
public final class h extends q0.b {
    public final synthetic int d;

    public synthetic h(int p1)
    {
        this.d = p1;
        return;
    }

    public void c(android.view.View p2, android.view.accessibility.AccessibilityEvent p3)
    {
        switch (this.d) {
            case 3:
                int v0_1;
                super.c(p2, p3);
                p3.setClassName(android.widget.ScrollView.getName());
                if (((androidx.core.widget.NestedScrollView) p2).getScrollRange() <= 0) {
                    v0_1 = 0;
                } else {
                    v0_1 = 1;
                }
                p3.setScrollable(v0_1);
                p3.setScrollX(((androidx.core.widget.NestedScrollView) p2).getScrollX());
                p3.setScrollY(((androidx.core.widget.NestedScrollView) p2).getScrollY());
                p3.setMaxScrollX(((androidx.core.widget.NestedScrollView) p2).getScrollX());
                p3.setMaxScrollY(((androidx.core.widget.NestedScrollView) p2).getScrollRange());
                return;
            default:
                super.c(p2, p3);
                return;
        }
    }

    public final void d(android.view.View p4, r0.c p5)
    {
        switch (this.d) {
            case 0:
                android.view.accessibility.AccessibilityNodeInfo v5_3 = p5.a;
                this.a.onInitializeAccessibilityNodeInfo(p4, v5_3);
                v5_3.setCollectionInfo(0);
                return;
            case 1:
                android.view.accessibility.AccessibilityNodeInfo v5_2 = p5.a;
                this.a.onInitializeAccessibilityNodeInfo(p4, v5_2);
                v5_2.setScrollable(0);
                return;
            case 2:
                android.view.accessibility.AccessibilityNodeInfo v5_1 = p5.a;
                this.a.onInitializeAccessibilityNodeInfo(p4, v5_1);
                v5_1.setCollectionInfo(0);
                return;
            case 3:
                r0.b v0_2 = p5.a;
                this.a.onInitializeAccessibilityNodeInfo(p4, v0_2);
                p5.i(android.widget.ScrollView.getName());
                if (((androidx.core.widget.NestedScrollView) p4).isEnabled()) {
                    int v1_1 = ((androidx.core.widget.NestedScrollView) p4).getScrollRange();
                    if (v1_1 > 0) {
                        v0_2.setScrollable(1);
                        if (((androidx.core.widget.NestedScrollView) p4).getScrollY() > 0) {
                            p5.b(r0.b.g);
                            p5.b(r0.b.l);
                        }
                        if (((androidx.core.widget.NestedScrollView) p4).getScrollY() < v1_1) {
                            p5.b(r0.b.f);
                            p5.b(r0.b.m);
                        }
                    }
                }
                return;
            default:
                android.view.accessibility.AccessibilityNodeInfo v5_4 = p5.a;
                this.a.onInitializeAccessibilityNodeInfo(p4, v5_4);
                v5_4.setVisibleToUser(0);
                return;
        }
    }

    public boolean g(android.view.View p5, int p6, android.os.Bundle p7)
    {
        switch (this.d) {
            case 3:
                int v0_1 = 1;
                if (!super.g(p5, p6, p7)) {
                    if (((androidx.core.widget.NestedScrollView) p5).isEnabled()) {
                        int v7_1 = ((androidx.core.widget.NestedScrollView) p5).getHeight();
                        int v2_1 = new android.graphics.Rect();
                        if ((((androidx.core.widget.NestedScrollView) p5).getMatrix().isIdentity()) && (((androidx.core.widget.NestedScrollView) p5).getGlobalVisibleRect(v2_1))) {
                            v7_1 = v2_1.height();
                        }
                        if (p6 != 4096) {
                            if ((p6 == 8192) || (p6 == 16908344)) {
                                int v6_5 = Math.max((((androidx.core.widget.NestedScrollView) p5).getScrollY() - ((v7_1 - ((androidx.core.widget.NestedScrollView) p5).getPaddingBottom()) - ((androidx.core.widget.NestedScrollView) p5).getPaddingTop())), 0);
                                if (v6_5 == ((androidx.core.widget.NestedScrollView) p5).getScrollY()) {
                                    v0_1 = 0;
                                    return v0_1;
                                } else {
                                    ((androidx.core.widget.NestedScrollView) p5).u((0 - ((androidx.core.widget.NestedScrollView) p5).getScrollX()), 1, (v6_5 - ((androidx.core.widget.NestedScrollView) p5).getScrollY()));
                                    return v0_1;
                                }
                            } else {
                                if (p6 != 16908346) {
                                }
                            }
                        }
                        int v6_11 = Math.min((((androidx.core.widget.NestedScrollView) p5).getScrollY() + ((v7_1 - ((androidx.core.widget.NestedScrollView) p5).getPaddingBottom()) - ((androidx.core.widget.NestedScrollView) p5).getPaddingTop())), ((androidx.core.widget.NestedScrollView) p5).getScrollRange());
                        if (v6_11 != ((androidx.core.widget.NestedScrollView) p5).getScrollY()) {
                            ((androidx.core.widget.NestedScrollView) p5).u((0 - ((androidx.core.widget.NestedScrollView) p5).getScrollX()), 1, (v6_11 - ((androidx.core.widget.NestedScrollView) p5).getScrollY()));
                            return v0_1;
                        }
                    }
                }
                return v0_1;
            default:
                return super.g(p5, p6, p7);
        }
    }
}
