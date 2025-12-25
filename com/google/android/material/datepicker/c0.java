package com.google.android.material.datepicker;
public final class c0 extends a2.i0 {
    public final com.google.android.material.datepicker.n d;

    public c0(com.google.android.material.datepicker.n p1)
    {
        this.d = p1;
        return;
    }

    public final int a()
    {
        return this.d.c.f;
    }

    public final void c(a2.k1 p5, int p6)
    {
        int v6_4;
        int v1_3 = (this.d.c.a.c + p6);
        int v5_4 = ((com.google.android.material.datepicker.b0) p5).u;
        v5_4.setText(String.format(java.util.Locale.getDefault(), "%d", new Object[] {Integer.valueOf(v1_3)})));
        int v6_2 = v5_4.getContext();
        if (com.google.android.material.datepicker.a0.b().get(1) != v1_3) {
            v6_4 = String.format(v6_2.getString(2131952149), new Object[] {Integer.valueOf(v1_3)}));
        } else {
            v6_4 = String.format(v6_2.getString(2131952148), new Object[] {Integer.valueOf(v1_3)}));
        }
        v5_4.setContentDescription(v6_4);
        // Both branches of the condition point to the same code.
        // if (com.google.android.material.datepicker.a0.b().get(1) != v1_3) {
            throw 0;
        // }
    }

    public final a2.k1 d(android.view.ViewGroup p4)
    {
        return new com.google.android.material.datepicker.b0(((android.widget.TextView) android.view.LayoutInflater.from(p4.getContext()).inflate(2131558505, p4, 0)));
    }
}
