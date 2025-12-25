package androidx.appcompat.view.menu;
public class ActionMenuItemView extends n.b1 implements m.z, android.view.View$OnClickListener, n.l {
    public m.o n;
    public CharSequence o;
    public android.graphics.drawable.Drawable p;
    public m.l q;
    public m.b r;
    public m.c s;
    public boolean t;
    public boolean u;
    public final int v;
    public int w;
    public final int x;

    public ActionMenuItemView(android.content.Context p4, android.util.AttributeSet p5)
    {
        super(p4, p5, 0);
        android.content.res.Resources v1 = p4.getResources();
        super.t = super.g();
        int v4_7 = p4.obtainStyledAttributes(p5, g.a.c, 0, 0);
        super.v = v4_7.getDimensionPixelSize(0, 0);
        v4_7.recycle();
        super.x = ((int) ((v1.getDisplayMetrics().density * 1107296256) + 1056964608));
        super.setOnClickListener(super);
        super.w = -1;
        super.setSaveEnabled(0);
        return;
    }

    public final void a(m.o p2)
    {
        boolean v0_1;
        this.n = p2;
        this.setIcon(p2.getIcon());
        this.setTitle(p2.getTitleCondensed());
        this.setId(p2.a);
        if (!p2.isVisible()) {
            v0_1 = 8;
        } else {
            v0_1 = 0;
        }
        this.setVisibility(v0_1);
        this.setEnabled(p2.isEnabled());
        if ((p2.hasSubMenu()) && (this.r == null)) {
            this.r = new m.b(this);
        }
        return;
    }

    public final boolean b()
    {
        return (android.text.TextUtils.isEmpty(this.getText()) ^ 1);
    }

    public final boolean c()
    {
        if ((android.text.TextUtils.isEmpty(this.getText())) || (this.n.getIcon() != null)) {
            return 0;
        } else {
            return 1;
        }
    }

    public final boolean g()
    {
        int v0_5 = this.getContext().getResources().getConfiguration();
        int v1_1 = v0_5.screenWidthDp;
        if (((v1_1 < 480) && ((v1_1 < 640) || (v0_5.screenHeightDp < 480))) && (v0_5.orientation != 2)) {
            return 0;
        } else {
            return 1;
        }
    }

    public CharSequence getAccessibilityClassName()
    {
        return android.widget.Button.getName();
    }

    public m.o getItemData()
    {
        return this.n;
    }

    public final void h()
    {
        boolean vtmp1 = android.text.TextUtils.isEmpty(this.o);
        CharSequence v1_0 = 1;
        if ((this.p != null) && (((this.n.y & 4) != 4) || ((!this.t) && (!this.u)))) {
            v1_0 = 0;
        }
        CharSequence v2_3;
        m.o v0_1 = ((vtmp1 ^ 1) & v1_0);
        CharSequence v1_1 = 0;
        if (v0_1 == null) {
            v2_3 = 0;
        } else {
            v2_3 = this.o;
        }
        this.setText(v2_3);
        CharSequence v2_5 = this.n.q;
        if (!android.text.TextUtils.isEmpty(v2_5)) {
            this.setContentDescription(v2_5);
        } else {
            CharSequence v2_7;
            if (v0_1 == null) {
                v2_7 = this.n.e;
            } else {
                v2_7 = 0;
            }
            this.setContentDescription(v2_7);
        }
        CharSequence v2_9 = this.n.r;
        if (!android.text.TextUtils.isEmpty(v2_9)) {
            n.g3.a(this, v2_9);
            return;
        } else {
            if (v0_1 == null) {
                v1_1 = this.n.e;
            }
            n.g3.a(this, v1_1);
            return;
        }
    }

    public final void onClick(android.view.View p2)
    {
        p2 = this.q;
        if (p2 != null) {
            p2.c(this.n);
        }
        return;
    }

    public final void onConfigurationChanged(android.content.res.Configuration p1)
    {
        super.onConfigurationChanged(p1);
        this.t = this.g();
        this.h();
        return;
    }

    public final void onMeasure(int p6, int p7)
    {
        int v0_1 = android.text.TextUtils.isEmpty(this.getText());
        if (v0_1 == 0) {
            int v1_1 = this.w;
            if (v1_1 >= 0) {
                super.setPadding(v1_1, this.getPaddingTop(), this.getPaddingRight(), this.getPaddingBottom());
            }
        }
        int v6_2;
        super.onMeasure(p6, p7);
        int v1_0 = android.view.View$MeasureSpec.getMode(p6);
        int v6_1 = android.view.View$MeasureSpec.getSize(p6);
        int v2_0 = this.getMeasuredWidth();
        int v4_1 = this.v;
        if (v1_0 != -2147483648) {
            v6_2 = v4_1;
        } else {
            v6_2 = Math.min(v6_1, v4_1);
        }
        if ((v1_0 != 1073741824) && ((v4_1 > 0) && (v2_0 < v6_2))) {
            super.onMeasure(android.view.View$MeasureSpec.makeMeasureSpec(v6_2, 1073741824), p7);
        }
        if ((v0_1 != 0) && (this.p != null)) {
            super.setPadding(((this.getMeasuredWidth() - this.p.getBounds().width()) / 2), this.getPaddingTop(), this.getPaddingRight(), this.getPaddingBottom());
        }
        return;
    }

    public final void onRestoreInstanceState(android.os.Parcelable p1)
    {
        super.onRestoreInstanceState(0);
        return;
    }

    public final boolean onTouchEvent(android.view.MotionEvent p2)
    {
        if (this.n.hasSubMenu()) {
            boolean v0_2 = this.r;
            if ((v0_2) && (v0_2.onTouch(this, p2))) {
                return 1;
            }
        }
        return super.onTouchEvent(p2);
    }

    public void setCheckable(boolean p1)
    {
        return;
    }

    public void setChecked(boolean p1)
    {
        return;
    }

    public void setExpandedFormat(boolean p2)
    {
        if (this.u != p2) {
            this.u = p2;
            m.m v2_1 = this.n;
            if (v2_1 != null) {
                m.m v2_2 = v2_1.n;
                v2_2.k = 1;
                v2_2.p(1);
            }
        }
        return;
    }

    public void setIcon(android.graphics.drawable.Drawable p5)
    {
        this.p = p5;
        if (p5 != null) {
            int v0_2 = p5.getIntrinsicWidth();
            int v1_0 = p5.getIntrinsicHeight();
            float v2 = this.x;
            if (v0_2 > v2) {
                v1_0 = ((int) (((float) v1_0) * (((float) v2) / ((float) v0_2))));
                v0_2 = v2;
            }
            if (v1_0 <= v2) {
                v2 = v1_0;
            } else {
                v0_2 = ((int) (((float) v0_2) * (((float) v2) / ((float) v1_0))));
            }
            p5.setBounds(0, 0, v0_2, v2);
        }
        this.setCompoundDrawables(p5, 0, 0, 0);
        this.h();
        return;
    }

    public void setItemInvoker(m.l p1)
    {
        this.q = p1;
        return;
    }

    public final void setPadding(int p1, int p2, int p3, int p4)
    {
        this.w = p1;
        super.setPadding(p1, p2, p3, p4);
        return;
    }

    public void setPopupCallback(m.c p1)
    {
        this.s = p1;
        return;
    }

    public void setTitle(CharSequence p1)
    {
        this.o = p1;
        this.h();
        return;
    }
}
