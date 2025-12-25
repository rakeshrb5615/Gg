package com.google.android.material.datepicker;
public final class n extends com.google.android.material.datepicker.x {
    public int b;
    public com.google.android.material.datepicker.b c;
    public com.google.android.material.datepicker.s d;
    public int e;
    public com.google.android.material.datepicker.c f;
    public androidx.recyclerview.widget.RecyclerView m;
    public androidx.recyclerview.widget.RecyclerView n;
    public android.view.View o;
    public android.view.View p;
    public android.view.View q;
    public android.view.View r;
    public com.google.android.material.button.MaterialButton s;
    public android.view.accessibility.AccessibilityManager t;

    public n()
    {
        return;
    }

    public final void f(com.google.android.material.datepicker.s p7)
    {
        com.google.android.material.datepicker.g v0_6 = ((com.google.android.material.datepicker.w) this.n.getAdapter());
        int v1_2 = v0_6.d.a.d(p7);
        int v2_7 = this.t;
        if ((v2_7 == 0) || (!v2_7.isEnabled())) {
            int v2_3;
            com.google.android.material.datepicker.g v0_4 = (v1_2 - v0_6.d.a.d(this.d));
            int v3 = 0;
            if (Math.abs(v0_4) <= 3) {
                v2_3 = 0;
            } else {
                v2_3 = 1;
            }
            if (v0_4 > null) {
                v3 = 1;
            }
            this.d = p7;
            if ((v2_3 == 0) || (v3 == 0)) {
                if (v2_3 == 0) {
                    this.n.post(new com.google.android.material.datepicker.g(this, v1_2, 0));
                } else {
                    this.n.f0((v1_2 + 3));
                    this.n.post(new com.google.android.material.datepicker.g(this, v1_2, 0));
                }
            } else {
                this.n.f0((v1_2 - 3));
                this.n.post(new com.google.android.material.datepicker.g(this, v1_2, 0));
            }
        } else {
            this.d = p7;
            this.n.f0(v1_2);
        }
        this.h(v1_2);
        return;
    }

    public final void g(int p5)
    {
        this.e = p5;
        if (p5 != 2) {
            if (p5 == 1) {
                this.q.setVisibility(8);
                this.r.setVisibility(0);
                this.o.setVisibility(0);
                this.p.setVisibility(0);
                this.f(this.d);
            }
            return;
        } else {
            this.m.getLayoutManager().q0((this.d.c - ((com.google.android.material.datepicker.c0) this.m.getAdapter()).d.c.a.c));
            this.q.setVisibility(0);
            this.r.setVisibility(8);
            this.o.setVisibility(8);
            this.p.setVisibility(8);
            return;
        }
    }

    public final void h(int p6)
    {
        int v1_1;
        int v3 = 0;
        if ((p6 + 1) >= this.n.getAdapter().a()) {
            v1_1 = 0;
        } else {
            v1_1 = 1;
        }
        this.p.setEnabled(v1_1);
        if ((p6 - 1) >= 0) {
            v3 = 1;
        }
        this.o.setEnabled(v3);
        return;
    }

    public final void onCreate(android.os.Bundle p2)
    {
        super.onCreate(p2);
        if (p2 == null) {
            p2 = this.getArguments();
        }
        this.b = p2.getInt("THEME_RES_ID_KEY");
        if (p2.getParcelable("GRID_SELECTOR_KEY") != null) {
            throw new ClassCastException();
        } else {
            this.c = ((com.google.android.material.datepicker.b) p2.getParcelable("CALENDAR_CONSTRAINTS_KEY"));
            if (p2.getParcelable("DAY_VIEW_DECORATOR_KEY") != null) {
                throw new ClassCastException();
            } else {
                this.d = ((com.google.android.material.datepicker.s) p2.getParcelable("CURRENT_MONTH_KEY"));
                return;
            }
        }
    }

    public final android.view.View onCreateView(android.view.LayoutInflater p11, android.view.ViewGroup p12, android.os.Bundle p13)
    {
        com.google.android.material.datepicker.f v2_15;
        com.google.android.material.datepicker.b v5_4;
        com.google.android.material.datepicker.h v13_7 = new android.view.ContextThemeWrapper(this.getContext(), this.b);
        this.f = new com.google.android.material.datepicker.c(v13_7);
        android.view.View v11_2 = p11.cloneInContext(v13_7);
        this.t = ((android.view.accessibility.AccessibilityManager) this.requireContext().getSystemService("accessibility"));
        int v0_23 = this.c.a;
        if (!com.google.android.material.datepicker.q.i(v13_7, 16843277)) {
            v2_15 = 2131558499;
            v5_4 = 0;
        } else {
            v2_15 = 2131558504;
            v5_4 = 1;
        }
        int v6_8;
        android.view.View v11_1 = v11_2.inflate(v2_15, p12, 0);
        androidx.recyclerview.widget.RecyclerView v12_10 = this.requireContext().getResources();
        int v7_0 = com.google.android.material.datepicker.t.d;
        v11_1.setMinimumHeight(((((v12_10.getDimensionPixelOffset(2131166086) + (v12_10.getDimensionPixelOffset(2131166088) + v12_10.getDimensionPixelSize(2131166087))) + v12_10.getDimensionPixelSize(2131166071)) + ((v12_10.getDimensionPixelOffset(2131166085) * (v7_0 - 1)) + (v12_10.getDimensionPixelSize(2131166066) * v7_0))) + v12_10.getDimensionPixelOffset(2131166063)));
        androidx.recyclerview.widget.RecyclerView v12_14 = ((android.widget.GridView) v11_1.findViewById(2131362222));
        q0.q0.n(v12_14, new com.google.android.material.datepicker.h(0));
        com.google.android.material.datepicker.f v2_27 = this.c.e;
        int v6_7 = new com.google.android.material.datepicker.e;
        if (v2_27 <= null) {
            v6_8 = v6_7();
        } else {
            v6_8 = v6_7(v2_27);
        }
        v12_14.setAdapter(v6_8);
        v12_14.setNumColumns(v0_23.d);
        v12_14.setEnabled(0);
        this.n = ((androidx.recyclerview.widget.RecyclerView) v11_1.findViewById(2131362225));
        this.getContext();
        this.n.setLayoutManager(new com.google.android.material.datepicker.i(this, v5_4, v5_4));
        this.n.setTag("MONTHS_VIEW_GROUP_TAG");
        androidx.recyclerview.widget.RecyclerView v12_1 = new com.google.android.material.datepicker.w(v13_7, this.c, new l6.c(this, 10));
        this.n.setAdapter(v12_1);
        int v0_3 = v13_7.getResources().getInteger(2131427390);
        int v3_2 = ((androidx.recyclerview.widget.RecyclerView) v11_1.findViewById(2131362228));
        this.m = v3_2;
        if (v3_2 != 0) {
            v3_2.setHasFixedSize(1);
            this.m.setLayoutManager(new androidx.recyclerview.widget.GridLayoutManager(v0_3));
            this.m.setAdapter(new com.google.android.material.datepicker.c0(this));
            int v0_5 = this.m;
            int v3_7 = new com.google.android.material.datepicker.j();
            com.google.android.material.datepicker.a0.c(0);
            com.google.android.material.datepicker.a0.c(0);
            v0_5.i(v3_7);
        }
        com.google.android.material.datepicker.b v5_3 = v12_1.d;
        if (v11_1.findViewById(2131362213) != null) {
            int v0_9 = ((com.google.android.material.button.MaterialButton) v11_1.findViewById(2131362213));
            this.s = v0_9;
            v0_9.setTag("SELECTOR_TOGGLE_TAG");
            q0.q0.n(this.s, new com.google.android.material.datepicker.k(this, 0));
            int v0_13 = v11_1.findViewById(2131362215);
            this.o = v0_13;
            v0_13.setTag("NAVIGATION_PREV_TAG");
            int v0_15 = v11_1.findViewById(2131362214);
            this.p = v0_15;
            v0_15.setTag("NAVIGATION_NEXT_TAG");
            this.q = v11_1.findViewById(2131362228);
            this.r = v11_1.findViewById(2131362221);
            this.g(1);
            this.s.setText(this.d.c());
            this.n.j(new com.google.android.material.datepicker.l(this, v12_1));
            this.s.setOnClickListener(new com.google.android.material.datepicker.m(this, 0));
            this.p.setOnClickListener(new com.google.android.material.datepicker.f(this, v12_1, 1));
            this.o.setOnClickListener(new com.google.android.material.datepicker.f(this, v12_1, 0));
            this.h(v5_3.a.d(this.d));
        }
        if (!com.google.android.material.datepicker.q.i(v13_7, 16843277)) {
            new a2.c0(1).a(this.n);
        }
        this.n.f0(v5_3.a.d(this.d));
        q0.q0.n(this.n, new com.google.android.material.datepicker.h(1));
        return v11_1;
    }

    public final void onSaveInstanceState(android.os.Bundle p4)
    {
        p4.putInt("THEME_RES_ID_KEY", this.b);
        p4.putParcelable("GRID_SELECTOR_KEY", 0);
        p4.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.c);
        p4.putParcelable("DAY_VIEW_DECORATOR_KEY", 0);
        p4.putParcelable("CURRENT_MONTH_KEY", this.d);
        return;
    }
}
