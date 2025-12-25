package l3;
public final class d extends y0.b {
    public final synthetic com.google.android.material.chip.Chip q;

    public d(com.google.android.material.chip.Chip p1, com.google.android.material.chip.Chip p2)
    {
        this.q = p1;
        super(p2);
        return;
    }

    public final int n(float p3, float p4)
    {
        android.graphics.RectF v0_0 = this.q;
        if ((!v0_0.d()) || (!com.google.android.material.chip.Chip.a(v0_0).contains(p3, p4))) {
            return 0;
        } else {
            return 1;
        }
    }

    public final void o(java.util.ArrayList p3)
    {
        p3.add(Integer.valueOf(0));
        Integer v0_5 = this.q;
        if (v0_5.d()) {
            boolean v1_2 = v0_5.e;
            if ((v1_2) && ((v1_2.Z) && (v0_5.n != null))) {
                p3.add(Integer.valueOf(1));
            }
        }
        return;
    }

    public final boolean s(int p2, int p3, android.os.Bundle p4)
    {
        int v0 = 0;
        if (p3 == 16) {
            com.google.android.material.chip.Chip v3_1 = this.q;
            if (p2 != null) {
                if (p2 == 1) {
                    v3_1.playSoundEffect(0);
                    l3.d v2_4 = v3_1.n;
                    if (v2_4 != null) {
                        v2_4.onClick(v3_1);
                        v0 = 1;
                    }
                    if (v3_1.y) {
                        v3_1.x.x(1, 1);
                    }
                }
            } else {
                return v3_1.performClick();
            }
        }
        return v0;
    }

    public final void t(r0.c p4)
    {
        CharSequence v2_4;
        android.view.accessibility.AccessibilityNodeInfo v0 = p4.a;
        com.google.android.material.chip.Chip v1 = this.q;
        CharSequence v2_2 = v1.e;
        if ((v2_2 == null) || (!v2_2.f0)) {
            v2_4 = 0;
        } else {
            v2_4 = 1;
        }
        v0.setCheckable(v2_4);
        v0.setClickable(v1.isClickable());
        p4.i(v1.getAccessibilityClassName());
        v0.setText(v1.getText());
        return;
    }

    public final void u(int p6, r0.c p7)
    {
        android.view.accessibility.AccessibilityNodeInfo v0 = p7.a;
        int v2_0 = "";
        if (p6 != 1) {
            v0.setContentDescription("");
            v0.setBoundsInParent(com.google.android.material.chip.Chip.C);
            return;
        } else {
            String v6_5 = this.q;
            String v1_1 = v6_5.getCloseIconContentDescription();
            if (v1_1 == null) {
                String v1_2 = v6_5.getText();
                android.content.Context v3 = v6_5.getContext();
                if (!android.text.TextUtils.isEmpty(v1_2)) {
                    v2_0 = v1_2;
                }
                v0.setContentDescription(v3.getString(2131952129, new Object[] {v2_0})).trim());
            } else {
                v0.setContentDescription(v1_1);
            }
            v0.setBoundsInParent(com.google.android.material.chip.Chip.b(v6_5));
            p7.b(r0.b.e);
            v0.setEnabled(v6_5.isEnabled());
            p7.i(android.widget.Button.getName());
            return;
        }
    }

    public final void v(int p5, boolean p6)
    {
        com.google.android.material.chip.Chip v0 = this.q;
        if (p5 == 1) {
            v0.s = p6;
        }
        l3.f v5_1 = v0.e;
        boolean v3 = 0;
        if (v5_1.a0 != null) {
            int[] v6_1;
            if (!v0.s) {
                v6_1 = l3.f.U0;
            } else {
                v6_1 = new int[2];
                v6_1[0] = 16842919;
                v6_1[1] = 16842910;
            }
            v3 = v5_1.U(v6_1);
        }
        if (v3) {
            v0.refreshDrawableState();
        }
        return;
    }
}
