package com.google.android.material.button;
public class MaterialButtonToggleGroup extends i3.e {
    public static final synthetic int w;
    public final java.util.LinkedHashSet q;
    public boolean r;
    public boolean s;
    public boolean t;
    public final int u;
    public java.util.HashSet v;

    public MaterialButtonToggleGroup(android.content.Context p8, android.util.AttributeSet p9)
    {
        super(a4.a.a(p8, p9, 2130969442, 2132018391), p9);
        super.q = new java.util.LinkedHashSet();
        super.r = 0;
        super.v = new java.util.HashSet();
        int[] v6 = new int[0];
        android.content.res.TypedArray v9_1 = q3.k.f(super.getContext(), p9, c3.a.l, 2130969442, 2132018391, v6);
        super.setSingleSelection(v9_1.getBoolean(7, 0));
        super.u = v9_1.getResourceId(2, -1);
        super.t = v9_1.getBoolean(4, 0);
        if (super.f == null) {
            super.f = v3.b0.b(new v3.a(0));
        }
        super.setEnabled(v9_1.getBoolean(0, 1));
        v9_1.recycle();
        super.setImportantForAccessibility(1);
        return;
    }

    private String getChildrenA11yClassName()
    {
        String v0_1;
        if (!this.s) {
            v0_1 = android.widget.ToggleButton;
        } else {
            v0_1 = android.widget.RadioButton;
        }
        return v0_1.getName();
    }

    private int getVisibleButtonCount()
    {
        int v0 = 0;
        int v1 = 0;
        while (v0 < this.getChildCount()) {
            if (((this.getChildAt(v0) instanceof com.google.android.material.button.MaterialButton)) && (this.getChildAt(v0).getVisibility() != 8)) {
                v1++;
            }
            v0++;
        }
        return v1;
    }

    private void setupButtonChild(com.google.android.material.button.MaterialButton p3)
    {
        p3.setMaxLines(1);
        p3.setEllipsize(android.text.TextUtils$TruncateAt.END);
        p3.setCheckable(1);
        p3.setA11yClassName(this.getChildrenA11yClassName());
        return;
    }

    public final void addView(android.view.View p2, int p3, android.view.ViewGroup$LayoutParams p4)
    {
        if ((p2 instanceof com.google.android.material.button.MaterialButton)) {
            super.addView(p2, p3, p4);
            this.setupButtonChild(((com.google.android.material.button.MaterialButton) p2));
            this.f(((com.google.android.material.button.MaterialButton) p2).getId(), ((com.google.android.material.button.MaterialButton) p2).u);
            q0.q0.n(((com.google.android.material.button.MaterialButton) p2), new com.google.android.material.datepicker.k(this, 2));
            return;
        } else {
            android.util.Log.e("MButtonToggleGroup", "Child views must be of type MaterialButton.");
            return;
        }
    }

    public final void f(int p3, boolean p4)
    {
        if (p3 != -1) {
            java.util.HashSet v0_3 = new java.util.HashSet(this.v);
            if ((p4 == 0) || (v0_3.contains(Integer.valueOf(p3)))) {
                if ((p4 == 0) && (v0_3.contains(Integer.valueOf(p3)))) {
                    if ((this.t) && (v0_3.size() <= 1)) {
                        this.g(v0_3);
                    } else {
                        v0_3.remove(Integer.valueOf(p3));
                    }
                }
            } else {
                if ((this.s) && (!v0_3.isEmpty())) {
                    v0_3.clear();
                }
                v0_3.add(Integer.valueOf(p3));
            }
            return;
        } else {
            int v4_8 = new StringBuilder("Button ID is not valid: ");
            v4_8.append(p3);
            android.util.Log.e("MButtonToggleGroup", v4_8.toString());
            return;
        }
    }

    public final void g(java.util.Set p8)
    {
        java.util.HashSet v0 = this.v;
        this.v = new java.util.HashSet(p8);
        int v2 = 0;
        while (v2 < this.getChildCount()) {
            int v3_2 = ((com.google.android.material.button.MaterialButton) this.getChildAt(v2)).getId();
            boolean v4_1 = p8.contains(Integer.valueOf(v3_2));
            java.util.Iterator v5_0 = this.findViewById(v3_2);
            if ((v5_0 instanceof com.google.android.material.button.MaterialButton)) {
                this.r = 1;
                ((com.google.android.material.button.MaterialButton) v5_0).setChecked(v4_1);
                this.r = 0;
            }
            if (v0.contains(Integer.valueOf(v3_2)) != p8.contains(Integer.valueOf(v3_2))) {
                boolean v4_5 = p8.contains(Integer.valueOf(v3_2));
                java.util.Iterator v5_5 = this.q.iterator();
                while (v5_5.hasNext()) {
                    ((i3.g) v5_5.next()).a(v3_2, v4_5);
                }
            }
            v2++;
        }
        this.invalidate();
        return;
    }

    public int getCheckedButtonId()
    {
        if ((!this.s) || (this.v.isEmpty())) {
            return -1;
        } else {
            return ((Integer) this.v.iterator().next()).intValue();
        }
    }

    public java.util.List getCheckedButtonIds()
    {
        java.util.ArrayList v0_1 = new java.util.ArrayList();
        int v1 = 0;
        while (v1 < this.getChildCount()) {
            Integer v2_0 = ((com.google.android.material.button.MaterialButton) this.getChildAt(v1)).getId();
            if (this.v.contains(Integer.valueOf(v2_0))) {
                v0_1.add(Integer.valueOf(v2_0));
            }
            v1++;
        }
        return v0_1;
    }

    public final void onFinishInflate()
    {
        super.onFinishInflate();
        int v1 = this.u;
        if (v1 != -1) {
            this.g(java.util.Collections.singleton(Integer.valueOf(v1)));
        }
        return;
    }

    public final void onInitializeAccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo p5)
    {
        int v1_1;
        super.onInitializeAccessibilityNodeInfo(p5);
        android.view.accessibility.AccessibilityNodeInfo$CollectionInfo v0_1 = this.getVisibleButtonCount();
        if (!this.s) {
            v1_1 = 2;
        } else {
            v1_1 = 1;
        }
        p5.setCollectionInfo(android.view.accessibility.AccessibilityNodeInfo$CollectionInfo.obtain(1, v0_1, 0, v1_1));
        return;
    }

    public void setSelectionRequired(boolean p1)
    {
        this.t = p1;
        return;
    }

    public void setSingleSelection(int p2)
    {
        this.setSingleSelection(this.getResources().getBoolean(p2));
        return;
    }

    public void setSingleSelection(boolean p3)
    {
        if (this.s != p3) {
            this.s = p3;
            this.g(new java.util.HashSet());
        }
        String v3_3 = this.getChildrenA11yClassName();
        int v0_1 = 0;
        while (v0_1 < this.getChildCount()) {
            ((com.google.android.material.button.MaterialButton) this.getChildAt(v0_1)).setA11yClassName(v3_3);
            v0_1++;
        }
        return;
    }
}
