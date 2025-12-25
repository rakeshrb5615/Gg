package com.google.android.material.internal;
public class CheckableImageButton extends n.y implements android.widget.Checkable {
    public static final int[] m;
    public boolean d;
    public boolean e;
    public boolean f;

    static CheckableImageButton()
    {
        com.google.android.material.internal.CheckableImageButton.m = new int[] {16842912});
        return;
    }

    public CheckableImageButton(android.content.Context p2, android.util.AttributeSet p3)
    {
        super(p2, p3, 2130969254);
        super.e = 1;
        super.f = 1;
        q0.q0.n(super, new com.google.android.material.datepicker.k(super, 3));
        return;
    }

    public final boolean isChecked()
    {
        return this.d;
    }

    public final int[] onCreateDrawableState(int p2)
    {
        if (!this.d) {
            return super.onCreateDrawableState(p2);
        } else {
            return android.view.View.mergeDrawableStates(super.onCreateDrawableState((p2 + 1)), com.google.android.material.internal.CheckableImageButton.m);
        }
    }

    public final void onRestoreInstanceState(android.os.Parcelable p2)
    {
        if ((p2 instanceof q3.a)) {
            super.onRestoreInstanceState(((q3.a) p2).a);
            this.setChecked(((q3.a) p2).c);
            return;
        } else {
            super.onRestoreInstanceState(p2);
            return;
        }
    }

    public final android.os.Parcelable onSaveInstanceState()
    {
        q3.a v1_1 = new q3.a(super.onSaveInstanceState());
        v1_1.c = this.d;
        return v1_1;
    }

    public void setCheckable(boolean p2)
    {
        if (this.e != p2) {
            this.e = p2;
            this.sendAccessibilityEvent(0);
        }
        return;
    }

    public void setChecked(boolean p2)
    {
        if ((this.e) && (this.d != p2)) {
            this.d = p2;
            this.refreshDrawableState();
            this.sendAccessibilityEvent(2048);
        }
        return;
    }

    public void setPressable(boolean p1)
    {
        this.f = p1;
        return;
    }

    public void setPressed(boolean p2)
    {
        if (this.f) {
            super.setPressed(p2);
        }
        return;
    }

    public final void toggle()
    {
        this.setChecked((this.d ^ 1));
        return;
    }
}
