package com.google.android.material.datepicker;
public final class i extends androidx.recyclerview.widget.LinearLayoutManager {
    public final synthetic int E;
    public final synthetic com.google.android.material.datepicker.n F;

    public i(com.google.android.material.datepicker.n p1, int p2, int p3)
    {
        this.F = p1;
        this.E = p3;
        super(p2);
        return;
    }

    public final void A0(androidx.recyclerview.widget.RecyclerView p2, int p3)
    {
        com.google.android.material.datepicker.y v0_1 = new com.google.android.material.datepicker.y(p2.getContext());
        v0_1.a = p3;
        this.B0(v0_1);
        return;
    }

    public final void D0(a2.g1 p4, int[] p5)
    {
        com.google.android.material.datepicker.n v2 = this.F;
        if (this.E != 0) {
            p5[0] = v2.n.getHeight();
            p5[1] = v2.n.getHeight();
            return;
        } else {
            p5[0] = v2.n.getWidth();
            p5[1] = v2.n.getWidth();
            return;
        }
    }
}
