package com.google.android.material.datepicker;
public final class v extends a2.k1 {
    public final android.widget.TextView u;
    public final com.google.android.material.datepicker.MaterialCalendarGridView v;

    public v(android.widget.LinearLayout p9, boolean p10)
    {
        super(p9);
        android.widget.TextView v0_2 = ((android.widget.TextView) p9.findViewById(2131362216));
        super.u = v0_2;
        new q0.e0(2131362477, Boolean, 0, 28, 3).g(v0_2, Boolean.TRUE);
        super.v = ((com.google.android.material.datepicker.MaterialCalendarGridView) p9.findViewById(2131362211));
        if (!p10) {
            v0_2.setVisibility(8);
        }
        return;
    }
}
