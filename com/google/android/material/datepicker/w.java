package com.google.android.material.datepicker;
public final class w extends a2.i0 {
    public final com.google.android.material.datepicker.b d;
    public final l6.c e;
    public final int f;

    public w(android.view.ContextThemeWrapper p5, com.google.android.material.datepicker.b p6, l6.c p7)
    {
        int v2_1 = p6.d;
        if (p6.a.a.compareTo(v2_1.a) > 0) {
            throw new IllegalArgumentException("firstPage cannot be after currentPage");
        } else {
            if (v2_1.a.compareTo(p6.b.a) > 0) {
                throw new IllegalArgumentException("currentPage cannot be after lastPage");
            } else {
                IllegalStateException v5_4;
                int v1_4 = (p5.getResources().getDimensionPixelSize(2131166066) * com.google.android.material.datepicker.t.d);
                if (!com.google.android.material.datepicker.q.i(p5, 16843277)) {
                    v5_4 = 0;
                } else {
                    v5_4 = p5.getResources().getDimensionPixelSize(2131166066);
                }
                this.f = (v1_4 + v5_4);
                this.d = p6;
                this.e = p7;
                if (this.a.a()) {
                    throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
                } else {
                    this.b = 1;
                    return;
                }
            }
        }
    }

    public final int a()
    {
        return this.d.m;
    }

    public final long b(int p4)
    {
        long v0_5 = com.google.android.material.datepicker.a0.a(this.d.a.a);
        v0_5.add(2, p4);
        v0_5.set(5, 1);
        long v0_2 = com.google.android.material.datepicker.a0.a(v0_5);
        v0_2.get(2);
        v0_2.get(1);
        v0_2.getMaximum(7);
        v0_2.getActualMaximum(5);
        v0_2.getTimeInMillis();
        return v0_2.getTimeInMillis();
    }

    public final void c(a2.k1 p4, int p5)
    {
        com.google.android.material.datepicker.b v0 = this.d;
        boolean v1_8 = com.google.android.material.datepicker.a0.a(v0.a.a);
        v1_8.add(2, p5);
        com.google.android.material.datepicker.s v5_2 = new com.google.android.material.datepicker.s(v1_8);
        ((com.google.android.material.datepicker.v) p4).u.setText(v5_2.c());
        int v4_4 = ((com.google.android.material.datepicker.MaterialCalendarGridView) ((com.google.android.material.datepicker.v) p4).v.findViewById(2131362211));
        if ((v4_4.a() == null) || (!v5_2.equals(v4_4.a().a))) {
            new com.google.android.material.datepicker.t(v5_2, v0);
            throw 0;
        } else {
            v4_4.invalidate();
            v4_4.a().getClass();
            throw 0;
        }
    }

    public final a2.k1 d(android.view.ViewGroup p4)
    {
        android.widget.LinearLayout v0_3 = ((android.widget.LinearLayout) android.view.LayoutInflater.from(p4.getContext()).inflate(2131558501, p4, 0));
        if (!com.google.android.material.datepicker.q.i(p4.getContext(), 16843277)) {
            return new com.google.android.material.datepicker.v(v0_3, 0);
        } else {
            v0_3.setLayoutParams(new a2.u0(-1, this.f));
            return new com.google.android.material.datepicker.v(v0_3, 1);
        }
    }
}
