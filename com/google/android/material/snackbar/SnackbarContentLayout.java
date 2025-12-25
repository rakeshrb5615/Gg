package com.google.android.material.snackbar;
public class SnackbarContentLayout extends android.widget.LinearLayout implements y3.i {
    public android.widget.TextView a;
    public android.widget.Button b;
    public final android.animation.TimeInterpolator c;
    public int d;

    public SnackbarContentLayout(android.content.Context p2, android.util.AttributeSet p3)
    {
        super(p2, p3);
        super.c = j5.t1.Q(p2, 2130969539, d3.a.b);
        return;
    }

    public final boolean a(int p4, int p5, int p6)
    {
        android.widget.TextView v4_2;
        if (p4 == this.getOrientation()) {
            v4_2 = 0;
        } else {
            this.setOrientation(p4);
            v4_2 = 1;
        }
        if ((this.a.getPaddingTop() == p5) && (this.a.getPaddingBottom() == p6)) {
            return v4_2;
        } else {
            android.widget.TextView v4_1 = this.a;
            if (!v4_1.isPaddingRelative()) {
                v4_1.setPadding(v4_1.getPaddingLeft(), p5, v4_1.getPaddingRight(), p6);
                return 1;
            } else {
                v4_1.setPaddingRelative(v4_1.getPaddingStart(), p5, v4_1.getPaddingEnd(), p6);
                return 1;
            }
        }
    }

    public android.widget.Button getActionView()
    {
        return this.b;
    }

    public android.widget.TextView getMessageView()
    {
        return this.a;
    }

    public final void onFinishInflate()
    {
        super.onFinishInflate();
        this.a = ((android.widget.TextView) this.findViewById(2131362424));
        this.b = ((android.widget.Button) this.findViewById(2131362423));
        return;
    }

    public final void onMeasure(int p8, int p9)
    {
        super.onMeasure(p8, p9);
        if (this.getOrientation() != 1) {
            int v3_4;
            boolean v0_1 = this.getResources().getDimensionPixelSize(2131165325);
            int v2_1 = this.getResources().getDimensionPixelSize(2131165324);
            int v3_2 = this.a.getLayout();
            if ((v3_2 == 0) || (v3_2.getLineCount() <= 1)) {
                v3_4 = 0;
            } else {
                v3_4 = 1;
            }
            if ((v3_4 == 0) || ((this.d <= 0) || (this.b.getMeasuredWidth() <= this.d))) {
                if (v3_4 == 0) {
                    v0_1 = v2_1;
                }
                if (!this.a(0, v0_1, v0_1)) {
                    return;
                }
            } else {
                if (!this.a(1, v0_1, (v0_1 - v2_1))) {
                    return;
                }
            }
            super.onMeasure(p8, p9);
        }
        return;
    }

    public void setMaxInlineActionWidth(int p1)
    {
        this.d = p1;
        return;
    }
}
