package com.google.android.material.textfield;
public class TextInputEditText extends n.w {
    public final android.graphics.Rect m;
    public boolean n;

    public TextInputEditText(android.content.Context p8, android.util.AttributeSet p9)
    {
        super(a4.a.a(p8, p9, 2130969050, 0), p9);
        super.m = new android.graphics.Rect();
        int[] v5 = new int[0];
        q3.k.a(p8, p9, 2130969050, 2132018133);
        int[] v2 = c3.a.E;
        q3.k.b(p8, p9, v2, 2130969050, 2132018133, v5);
        android.content.res.TypedArray v8_1 = p8.obtainStyledAttributes(p9, v2, 2130969050, 2132018133);
        super.setTextInputLayoutFocusedRectEnabled(v8_1.getBoolean(0, 0));
        v8_1.recycle();
        return;
    }

    private CharSequence getHintFromLayout()
    {
        int v0_0 = this.getTextInputLayout();
        if (v0_0 == 0) {
            return 0;
        } else {
            return v0_0.getHint();
        }
    }

    private com.google.android.material.textfield.TextInputLayout getTextInputLayout()
    {
        android.view.ViewParent v0_0 = this.getParent();
        while ((v0_0 instanceof android.view.View)) {
            if (!(v0_0 instanceof com.google.android.material.textfield.TextInputLayout)) {
                v0_0 = v0_0.getParent();
            } else {
                return ((com.google.android.material.textfield.TextInputLayout) v0_0);
            }
        }
        return 0;
    }

    public final void getFocusedRect(android.graphics.Rect p3)
    {
        super.getFocusedRect(p3);
        int v0_0 = this.getTextInputLayout();
        if ((v0_0 != 0) && ((this.n) && (p3 != null))) {
            android.graphics.Rect v1_1 = this.m;
            v0_0.getFocusedRect(v1_1);
            p3.bottom = v1_1.bottom;
        }
        return;
    }

    public final boolean getGlobalVisibleRect(android.graphics.Rect p3, android.graphics.Point p4)
    {
        int v0_0 = this.getTextInputLayout();
        if ((v0_0 == 0) || (!this.n)) {
            return super.getGlobalVisibleRect(p3, p4);
        } else {
            boolean v3_2 = v0_0.getGlobalVisibleRect(p3, p4);
            if ((v3_2) && (p4 != null)) {
                p4.offset((- this.getScrollX()), (- this.getScrollY()));
            }
            return v3_2;
        }
    }

    public CharSequence getHint()
    {
        CharSequence v0_0 = this.getTextInputLayout();
        if ((v0_0 == null) || (!v0_0.L)) {
            return super.getHint();
        } else {
            return v0_0.getHint();
        }
    }

    public final void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        boolean v0_2 = this.getTextInputLayout();
        if ((v0_2) && ((v0_2.L) && (super.getHint() == null))) {
            boolean v0_0;
            boolean v0_5 = android.os.Build.MANUFACTURER;
            if (!v0_5) {
                v0_0 = "";
            } else {
                v0_0 = v0_5.toLowerCase(java.util.Locale.ENGLISH);
            }
            if (v0_0.equals("meizu")) {
                this.setHint("");
            }
        }
        return;
    }

    public final android.view.inputmethod.InputConnection onCreateInputConnection(android.view.inputmethod.EditorInfo p3)
    {
        android.view.inputmethod.InputConnection v0 = super.onCreateInputConnection(p3);
        if ((v0 != null) && (p3.hintText == null)) {
            p3.hintText = this.getHintFromLayout();
        }
        return v0;
    }

    public final void onInitializeAccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo p1)
    {
        super.onInitializeAccessibilityNodeInfo(p1);
        this.getTextInputLayout();
        return;
    }

    public final boolean requestRectangleOnScreen(android.graphics.Rect p5)
    {
        android.graphics.Rect v0_0 = this.getTextInputLayout();
        if ((v0_0 == null) || ((!this.n) || (!p5))) {
            return super.requestRectangleOnScreen(p5);
        } else {
            android.graphics.Rect v0_3 = this.m;
            v0_3.set(p5.left, p5.top, p5.right, (p5.bottom + (v0_0.getHeight() - this.getHeight())));
            return super.requestRectangleOnScreen(v0_3);
        }
    }

    public void setTextInputLayoutFocusedRectEnabled(boolean p1)
    {
        this.n = p1;
        return;
    }
}
