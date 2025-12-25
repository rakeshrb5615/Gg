package com.google.android.material.datepicker;
public final class k extends q0.b {
    public final synthetic int d;
    public final synthetic Object e;

    public synthetic k(Object p1, int p2)
    {
        this.d = p2;
        this.e = p1;
        return;
    }

    public void c(android.view.View p2, android.view.accessibility.AccessibilityEvent p3)
    {
        switch (this.d) {
            case 3:
                super.c(p2, p3);
                p3.setChecked(((com.google.android.material.internal.CheckableImageButton) this.e).d);
                return;
            default:
                super.c(p2, p3);
                return;
        }
    }

    public final void d(android.view.View p9, r0.c p10)
    {
        com.google.android.material.internal.NavigationMenuItemView v4_2 = this.e;
        int v5_1 = this.a;
        switch (this.d) {
            case 0:
                k4.i v9_11;
                v5_1.onInitializeAccessibilityNodeInfo(p9, p10.a);
                com.google.android.material.internal.NavigationMenuItemView v4_4 = ((com.google.android.material.datepicker.n) v4_2);
                if (v4_4.r.getVisibility() != 0) {
                    v9_11 = v4_4.getString(2131952166);
                } else {
                    v9_11 = v4_4.getString(2131952168);
                }
                p10.b(new r0.b(16, v9_11));
                return;
            case 1:
                int v0_4 = p10.a;
                v5_1.onInitializeAccessibilityNodeInfo(p9, v0_4);
                if (!((h3.i) v4_2).q) {
                    v0_4.setDismissable(0);
                } else {
                    p10.a(1048576);
                    v0_4.setDismissable(1);
                }
                return;
            case 2:
                v5_1.onInitializeAccessibilityNodeInfo(p9, p10.a);
                com.google.android.material.internal.NavigationMenuItemView v4_1 = ((com.google.android.material.button.MaterialButtonToggleGroup) v4_2);
                int v2_1 = -1;
                if ((p9 instanceof com.google.android.material.button.MaterialButton)) {
                    int v0_3 = 0;
                    int v5_0 = 0;
                    while (v0_3 < v4_1.getChildCount()) {
                        if (v4_1.getChildAt(v0_3) != p9) {
                            if (((v4_1.getChildAt(v0_3) instanceof com.google.android.material.button.MaterialButton)) && (v4_1.getChildAt(v0_3).getVisibility() != 8)) {
                                v5_0++;
                            }
                            v0_3++;
                        } else {
                            v2_1 = v5_0;
                            break;
                        }
                    }
                }
                p10.j(k4.i.c(((com.google.android.material.button.MaterialButton) p9).u, 0, 1, v2_1, 1));
                return;
            case 3:
                android.view.accessibility.AccessibilityNodeInfo v10_1 = p10.a;
                v5_1.onInitializeAccessibilityNodeInfo(p9, v10_1);
                com.google.android.material.internal.NavigationMenuItemView v4_0 = ((com.google.android.material.internal.CheckableImageButton) v4_2);
                v10_1.setCheckable(v4_0.e);
                v10_1.setChecked(v4_0.d);
                return;
            case 4:
                android.view.accessibility.AccessibilityNodeInfo v10_2 = p10.a;
                v5_1.onInitializeAccessibilityNodeInfo(p9, v10_2);
                v10_2.setCheckable(((com.google.android.material.internal.NavigationMenuItemView) v4_2).D);
                return;
            default:
                int v0_8 = p10.a;
                v5_1.onInitializeAccessibilityNodeInfo(p9, v0_8);
                p10.a(1048576);
                v0_8.setDismissable(1);
                return;
        }
    }

    public boolean g(android.view.View p3, int p4, android.os.Bundle p5)
    {
        switch (this.d) {
            case 1:
                int v3_2;
                if (p4 != 1048576) {
                    v3_2 = super.g(p3, p4, p5);
                } else {
                    h3.i v0_3 = ((h3.i) this.e);
                    if (!v0_3.q) {
                    } else {
                        v0_3.cancel();
                        v3_2 = 1;
                    }
                }
                return v3_2;
            case 5:
                int v3_1;
                if (p4 != 1048576) {
                    v3_1 = super.g(p3, p4, p5);
                } else {
                    ((y3.j) ((y3.h) this.e)).a(3);
                    v3_1 = 1;
                }
                return v3_1;
            default:
                return super.g(p3, p4, p5);
        }
    }
}
