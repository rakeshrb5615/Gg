package com.google.android.material.datepicker;
public final class f implements android.view.View$OnClickListener {
    public final synthetic int a;
    public final synthetic com.google.android.material.datepicker.w b;
    public final synthetic com.google.android.material.datepicker.n c;

    public synthetic f(com.google.android.material.datepicker.n p1, com.google.android.material.datepicker.w p2, int p3)
    {
        this.a = p3;
        this.c = p1;
        this.b = p2;
        return;
    }

    public final void onClick(android.view.View p4)
    {
        switch (this.a) {
            case 0:
                com.google.android.material.datepicker.n v4_1 = this.c;
                com.google.android.material.datepicker.s v0_13 = (((androidx.recyclerview.widget.LinearLayoutManager) v4_1.n.getLayoutManager()).O0() - 1);
                java.util.Calendar v1_4 = com.google.android.material.datepicker.a0.a(this.b.d.a.a);
                v1_4.add(2, v0_13);
                v4_1.f(new com.google.android.material.datepicker.s(v1_4));
                return;
            default:
                com.google.android.material.datepicker.n v4_2 = this.c;
                com.google.android.material.datepicker.s v0_6 = (((androidx.recyclerview.widget.LinearLayoutManager) v4_2.n.getLayoutManager()).N0() + 1);
                java.util.Calendar v1_9 = com.google.android.material.datepicker.a0.a(this.b.d.a.a);
                v1_9.add(2, v0_6);
                v4_2.f(new com.google.android.material.datepicker.s(v1_9));
                return;
        }
    }
}
