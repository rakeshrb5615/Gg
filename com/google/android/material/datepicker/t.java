package com.google.android.material.datepicker;
public final class t extends android.widget.BaseAdapter {
    public static final int d;
    public static final int e;
    public final com.google.android.material.datepicker.s a;
    public com.google.android.material.datepicker.c b;
    public final com.google.android.material.datepicker.b c;

    static t()
    {
        com.google.android.material.datepicker.t.d = com.google.android.material.datepicker.a0.c(0).getMaximum(4);
        com.google.android.material.datepicker.t.e = ((com.google.android.material.datepicker.a0.c(0).getMaximum(7) + com.google.android.material.datepicker.a0.c(0).getMaximum(5)) - 1);
        return;
    }

    public t(com.google.android.material.datepicker.s p1, com.google.android.material.datepicker.b p2)
    {
        this.a = p1;
        this.c = p2;
        throw 0;
    }

    public final int a()
    {
        int v0_1 = this.c.e;
        com.google.android.material.datepicker.s v1 = this.a;
        java.util.Calendar v2 = v1.a;
        int v3_2 = v2.get(7);
        if (v0_1 <= 0) {
            v0_1 = v2.getFirstDayOfWeek();
        }
        int v3_0 = (v3_2 - v0_1);
        if (v3_0 < 0) {
            v3_0 += v1.d;
        }
        return v3_0;
    }

    public final Long b(int p3)
    {
        if ((p3 >= this.a()) && (p3 <= this.c())) {
            Long v3_4 = ((p3 - this.a()) + 1);
            long v0_3 = com.google.android.material.datepicker.a0.a(this.a.a);
            v0_3.set(5, v3_4);
            return Long.valueOf(v0_3.getTimeInMillis());
        } else {
            return 0;
        }
    }

    public final int c()
    {
        return ((this.a() + this.a.e) - 1);
    }

    public final int getCount()
    {
        return com.google.android.material.datepicker.t.e;
    }

    public final bridge synthetic Object getItem(int p1)
    {
        return this.b(p1);
    }

    public final long getItemId(int p3)
    {
        return ((long) (p3 / this.a.d));
    }

    public final android.view.View getView(int p5, android.view.View p6, android.view.ViewGroup p7)
    {
        android.widget.TextView v0_0 = p7.getContext();
        if (this.b == null) {
            this.b = new com.google.android.material.datepicker.c(v0_0);
        }
        android.widget.TextView v0_3 = ((android.widget.TextView) p6);
        if (p6 == null) {
            v0_3 = ((android.widget.TextView) android.view.LayoutInflater.from(p7.getContext()).inflate(2131558496, p7, 0));
        }
        String v6_5 = (p5 - this.a());
        if (v6_5 < null) {
            v0_3.setVisibility(8);
            v0_3.setEnabled(0);
        } else {
            java.util.Locale v7_1 = this.a;
            if (v6_5 < v7_1.e) {
                String v6_6 = (v6_5 + 1);
                v0_3.setTag(v7_1);
                v0_3.setText(String.format(v0_3.getResources().getConfiguration().locale, "%d", new Object[] {Integer.valueOf(v6_6)})));
                v0_3.setVisibility(0);
                v0_3.setEnabled(1);
            }
        }
        if ((this.b(p5) != null) && (v0_3 != null)) {
            v0_3.getContext();
            com.google.android.material.datepicker.a0.b().getTimeInMillis();
            throw 0;
        } else {
            return v0_3;
        }
    }

    public final boolean hasStableIds()
    {
        return 1;
    }
}
