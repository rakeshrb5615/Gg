package com.google.android.material.datepicker;
final class MaterialCalendarGridView extends android.widget.GridView {
    public final boolean a;

    public MaterialCalendarGridView(android.content.Context p2, android.util.AttributeSet p3)
    {
        super(p2, p3, 0);
        com.google.android.material.datepicker.a0.c(0);
        if (com.google.android.material.datepicker.q.i(super.getContext(), 16843277)) {
            super.setNextFocusLeftId(2131361943);
            super.setNextFocusRightId(2131361979);
        }
        super.a = com.google.android.material.datepicker.q.i(super.getContext(), 2130969580);
        q0.q0.n(super, new com.google.android.material.datepicker.h(2));
        return;
    }

    public final com.google.android.material.datepicker.t a()
    {
        return ((com.google.android.material.datepicker.t) super.getAdapter());
    }

    public final android.widget.Adapter getAdapter()
    {
        return ((com.google.android.material.datepicker.t) super.getAdapter());
    }

    public final android.widget.ListAdapter getAdapter()
    {
        return ((com.google.android.material.datepicker.t) super.getAdapter());
    }

    public final void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        ((com.google.android.material.datepicker.t) super.getAdapter()).notifyDataSetChanged();
        return;
    }

    public final void onDraw(android.graphics.Canvas p4)
    {
        super.onDraw(p4);
        int v4_3 = ((com.google.android.material.datepicker.t) super.getAdapter());
        v4_3.getClass();
        int v0_0 = Math.max(v4_3.a(), this.getFirstVisiblePosition());
        int v1_1 = Math.min(v4_3.c(), this.getLastVisiblePosition());
        v4_3.b(v0_0);
        v4_3.b(v1_1);
        throw 0;
    }

    public final void onFocusChanged(boolean p1, int p2, android.graphics.Rect p3)
    {
        if (p1 == 0) {
            super.onFocusChanged(0, p2, p3);
            return;
        } else {
            if (p2 != 33) {
                if (p2 != 130) {
                    super.onFocusChanged(1, p2, p3);
                    return;
                } else {
                    this.setSelection(((com.google.android.material.datepicker.t) super.getAdapter()).a());
                    return;
                }
            } else {
                this.setSelection(((com.google.android.material.datepicker.t) super.getAdapter()).c());
                return;
            }
        }
    }

    public final boolean onKeyDown(int p4, android.view.KeyEvent p5)
    {
        if (super.onKeyDown(p4, p5)) {
            int v5_3 = this.getSelectedItemPosition();
            if ((v5_3 != -1) && ((v5_3 < ((com.google.android.material.datepicker.t) super.getAdapter()).a()) || (v5_3 > ((com.google.android.material.datepicker.t) super.getAdapter()).c()))) {
                if (19 != p4) {
                    return 0;
                } else {
                    this.setSelection(((com.google.android.material.datepicker.t) super.getAdapter()).a());
                    return 1;
                }
            } else {
                return 1;
            }
        } else {
            return 0;
        }
    }

    public final void onMeasure(int p2, int p3)
    {
        if (!this.a) {
            super.onMeasure(p2, p3);
            return;
        } else {
            super.onMeasure(p2, android.view.View$MeasureSpec.makeMeasureSpec(16777215, -2147483648));
            this.getLayoutParams().height = this.getMeasuredHeight();
            return;
        }
    }

    public final bridge synthetic void setAdapter(android.widget.Adapter p1)
    {
        this.setAdapter(((android.widget.ListAdapter) p1));
        return;
    }

    public final void setAdapter(android.widget.ListAdapter p3)
    {
        if (!(p3 instanceof com.google.android.material.datepicker.t)) {
            throw new IllegalArgumentException(String.format("%1$s must have its Adapter set to a %2$s", new Object[] {com.google.android.material.datepicker.MaterialCalendarGridView.getCanonicalName(), com.google.android.material.datepicker.t.getCanonicalName()})));
        } else {
            super.setAdapter(p3);
            return;
        }
    }

    public final void setSelection(int p2)
    {
        if (p2 >= ((com.google.android.material.datepicker.t) super.getAdapter()).a()) {
            super.setSelection(p2);
            return;
        } else {
            super.setSelection(((com.google.android.material.datepicker.t) super.getAdapter()).a());
            return;
        }
    }
}
