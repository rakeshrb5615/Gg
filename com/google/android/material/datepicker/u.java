package com.google.android.material.datepicker;
public final class u implements android.widget.AdapterView$OnItemClickListener {
    public final synthetic com.google.android.material.datepicker.MaterialCalendarGridView a;
    public final synthetic com.google.android.material.datepicker.w b;

    public u(com.google.android.material.datepicker.w p1, com.google.android.material.datepicker.MaterialCalendarGridView p2)
    {
        this.b = p1;
        this.a = p2;
        return;
    }

    public final void onItemClick(android.widget.AdapterView p1, android.view.View p2, int p3, long p4)
    {
        int v1_0 = this.a;
        l6.c v2_2 = v1_0.a();
        if ((p3 < v2_2.a()) || (p3 > v2_2.c())) {
            return;
        } else {
            if (v1_0.a().b(p3).longValue() >= ((com.google.android.material.datepicker.n) this.b.e.b).c.c.a) {
                throw 0;
            } else {
                return;
            }
        }
    }
}
