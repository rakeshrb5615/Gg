package com.google.android.material.datepicker;
public final class l extends a2.w0 {
    public final synthetic com.google.android.material.datepicker.w a;
    public final synthetic com.google.android.material.datepicker.n b;

    public l(com.google.android.material.datepicker.n p1, com.google.android.material.datepicker.w p2)
    {
        this.b = p1;
        this.a = p2;
        return;
    }

    public final void b(androidx.recyclerview.widget.RecyclerView p6, int p7, int p8)
    {
        String v7_4;
        int v6_1 = this.a.d;
        p8 = this.b;
        if (p7 >= null) {
            v7_4 = ((androidx.recyclerview.widget.LinearLayoutManager) p8.n.getLayoutManager()).O0();
        } else {
            v7_4 = ((androidx.recyclerview.widget.LinearLayoutManager) p8.n.getLayoutManager()).N0();
        }
        com.google.android.material.button.MaterialButton v0_2 = com.google.android.material.datepicker.a0.a(v6_1.a.a);
        v0_2.add(2, v7_4);
        com.google.android.material.datepicker.s v2_1 = new com.google.android.material.datepicker.s(v0_2);
        p8.d = v2_1;
        com.google.android.material.button.MaterialButton v0_3 = p8.s;
        long v3_2 = com.google.android.material.datepicker.a0.a(v6_1.a.a);
        v3_2.add(2, v7_4);
        v3_2.set(5, 1);
        long v3_3 = com.google.android.material.datepicker.a0.a(v3_2);
        v3_3.get(2);
        v3_3.get(1);
        v3_3.getMaximum(7);
        v3_3.getActualMaximum(5);
        v3_3.getTimeInMillis();
        long v3_4 = v3_3.getTimeInMillis();
        String v7_8 = android.icu.text.DateFormat.getInstanceForSkeleton("yMMMM", java.util.Locale.getDefault());
        v7_8.setTimeZone(android.icu.util.TimeZone.getTimeZone("UTC"));
        v7_8.setContext(android.icu.text.DisplayContext.CAPITALIZATION_FOR_STANDALONE);
        v0_3.setText(v7_8.format(new java.util.Date(v3_4)));
        p8.h(v6_1.a.d(v2_1));
        return;
    }
}
