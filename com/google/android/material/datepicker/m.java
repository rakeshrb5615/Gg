package com.google.android.material.datepicker;
public final class m implements android.view.View$OnClickListener {
    public final synthetic int a;
    public final synthetic Object b;

    public synthetic m(Object p1, int p2)
    {
        this.a = p2;
        this.b = p1;
        return;
    }

    public final void onClick(android.view.View p4)
    {
        switch (this.a) {
            case 0:
                String v4_8 = ((com.google.android.material.datepicker.n) this.b);
                boolean v0_6 = v4_8.e;
                if (v0_6 != 2) {
                    if (v0_6 == 1) {
                        v4_8.g(2);
                        v4_8.m.announceForAccessibility(v4_8.getString(2131952170));
                    }
                } else {
                    v4_8.g(1);
                    v4_8.n.announceForAccessibility(v4_8.getString(2131952169));
                }
                return;
            case 1:
                String v4_4 = ((h.e) this.b);
                v4_4.v.obtainMessage(1, v4_4.b).sendToTarget();
                return;
            case 2:
                String v4_16 = ((h3.i) this.b);
                if ((v4_16.q) && (v4_16.isShowing())) {
                    if (!v4_16.s) {
                        boolean v0_3 = v4_16.getContext().obtainStyledAttributes(new int[] {16843611}));
                        v4_16.r = v0_3.getBoolean(0, 1);
                        v0_3.recycle();
                        v4_16.s = 1;
                    }
                    if (v4_16.r) {
                        v4_16.cancel();
                    }
                }
                return;
            case 3:
                ((l.a) this.b).a();
                return;
            default:
                String v4_15;
                String v4_14 = ((androidx.appcompat.widget.Toolbar) this.b).R;
                if (v4_14 != null) {
                    v4_15 = v4_14.b;
                } else {
                    v4_15 = 0;
                }
                if (v4_15 != null) {
                    v4_15.collapseActionView();
                }
                return;
        }
    }
}
