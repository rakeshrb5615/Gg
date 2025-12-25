package z3;
public final class y extends q0.b {
    public final com.google.android.material.textfield.TextInputLayout d;

    public y(com.google.android.material.textfield.TextInputLayout p1)
    {
        this.d = p1;
        return;
    }

    public final void d(android.view.View p18, r0.c p19)
    {
        n.b1 v4_0;
        z3.p v2_0 = p19.a;
        this.a.onInitializeAccessibilityNodeInfo(p18, v2_0);
        com.google.android.material.textfield.TextInputLayout v3_1 = this.d;
        n.b1 v4_3 = v3_1.getEditText();
        if (v4_3 == null) {
            v4_0 = 0;
        } else {
            v4_0 = v4_3.getText();
        }
        int v14_1;
        String v5_0 = v3_1.getHint();
        CharSequence v6 = v3_1.getError();
        String v7_0 = v3_1.getPlaceholderText();
        int v8 = v3_1.getCounterMaxLength();
        CharSequence v9 = v3_1.getCounterOverflowDescription();
        boolean v10 = android.text.TextUtils.isEmpty(v4_0);
        StringBuilder v11_0 = android.text.TextUtils.isEmpty(v5_0);
        String v12_0 = v3_1.B0;
        boolean v13 = android.text.TextUtils.isEmpty(v6);
        if ((v13) && (android.text.TextUtils.isEmpty(v9))) {
            v14_1 = 0;
        } else {
            v14_1 = 1;
        }
        String v5_1;
        if (v11_0 != null) {
            v5_1 = "";
        } else {
            v5_1 = v5_0.toString();
        }
        StringBuilder v11_1 = v3_1.b;
        n.b1 v15 = v11_1.b;
        if (v15.getVisibility() != 0) {
            v2_0.setTraversalAfter(v11_1.d);
        } else {
            v2_0.setLabelFor(v15);
            v2_0.setTraversalAfter(v15);
        }
        if (v10) {
            if (android.text.TextUtils.isEmpty(v5_1)) {
                if (v7_0 != null) {
                    v2_0.setText(v7_0);
                }
            } else {
                v2_0.setText(v5_1);
                if ((v12_0 == null) && (v7_0 != null)) {
                    StringBuilder v11_5 = new StringBuilder();
                    v11_5.append(v5_1);
                    v11_5.append(", ");
                    v11_5.append(v7_0);
                    v2_0.setText(v11_5.toString());
                }
            }
        } else {
            v2_0.setText(v4_0);
        }
        if (!android.text.TextUtils.isEmpty(v5_1)) {
            v2_0.setHintText(v5_1);
            v2_0.setShowingHintText(v10);
        }
        if ((v4_0 == null) || (v4_0.length() != v8)) {
            v8 = -1;
        }
        v2_0.setMaxTextLength(v8);
        if (v14_1 != 0) {
            if (v13) {
                v6 = v9;
            }
            v2_0.setError(v6);
        }
        n.b1 v4_5 = v3_1.q.y;
        if (v4_5 != null) {
            v2_0.setLabelFor(v4_5);
        }
        v3_1.c.b().m(p19);
        return;
    }

    public final void e(android.view.View p1, android.view.accessibility.AccessibilityEvent p2)
    {
        super.e(p1, p2);
        this.d.c.b().n(p2);
        return;
    }
}
