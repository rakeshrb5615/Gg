package com.google.android.material.datepicker;
public final class e extends android.widget.BaseAdapter {
    public final java.util.Calendar a;
    public final int b;
    public final int c;

    public e()
    {
        int v0_2 = com.google.android.material.datepicker.a0.c(0);
        this.a = v0_2;
        this.b = v0_2.getMaximum(7);
        this.c = v0_2.getFirstDayOfWeek();
        return;
    }

    public e(int p3)
    {
        int v0_1 = com.google.android.material.datepicker.a0.c(0);
        this.a = v0_1;
        this.b = v0_1.getMaximum(7);
        this.c = p3;
        return;
    }

    public final int getCount()
    {
        return this.b;
    }

    public final Object getItem(int p3)
    {
        int v0 = this.b;
        if (p3 < v0) {
            Integer v3_1 = (p3 + this.c);
            if (v3_1 > v0) {
                v3_1 -= v0;
            }
            return Integer.valueOf(v3_1);
        } else {
            return 0;
        }
    }

    public final long getItemId(int p3)
    {
        return 0;
    }

    public final android.view.View getView(int p4, android.view.View p5, android.view.ViewGroup p6)
    {
        android.widget.TextView v0_1 = ((android.widget.TextView) p5);
        if (p5 == null) {
            v0_1 = ((android.widget.TextView) android.view.LayoutInflater.from(p6.getContext()).inflate(2131558497, p6, 0));
        }
        String v4_1 = (p4 + this.c);
        Object[] v5_3 = this.b;
        if (v4_1 > v5_3) {
            v4_1 -= v5_3;
        }
        Object[] v5_4 = this.a;
        v5_4.set(7, v4_1);
        v0_1.setText(v5_4.getDisplayName(7, 4, v0_1.getResources().getConfiguration().locale));
        v0_1.setContentDescription(String.format(p6.getContext().getString(2131952142), new Object[] {v5_4.getDisplayName(7, 2, java.util.Locale.getDefault())})));
        return v0_1;
    }
}
