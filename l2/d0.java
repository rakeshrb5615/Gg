package l2;
public class d0 extends androidx.fragment.app.e0 {
    public android.graphics.drawable.Drawable A;
    public android.graphics.drawable.Drawable B;
    public android.graphics.drawable.Drawable C;
    public i2.l D;
    public String E;
    public String F;
    public String G;
    public i2.o0 H;
    public int I;
    public int J;
    public int K;
    public int L;
    public int M;
    public int N;
    public int O;
    public int P;
    public int Q;
    public int R;
    public androidx.fragment.app.j0 a;
    public android.content.Context b;
    public i2.n c;
    public android.view.ViewGroup d;
    public android.view.ViewGroup e;
    public android.view.ViewGroup f;
    public android.view.ViewGroup m;
    public android.view.ViewGroup n;
    public android.view.ViewGroup o;
    public android.widget.Button p;
    public android.widget.Button q;
    public android.widget.Button r;
    public android.widget.Button s;
    public android.widget.Button t;
    public android.widget.TextView u;
    public android.widget.TextView v;
    public android.widget.TextView w;
    public android.widget.TextView x;
    public android.widget.Button y;
    public android.widget.Button z;

    public d0()
    {
        return;
    }

    public static void h(android.view.View p1, boolean p2)
    {
        int v2_1;
        p1.setEnabled((p2 ^ 1));
        if (p2 == 0) {
            v2_1 = 0;
        } else {
            v2_1 = 8;
        }
        p1.setVisibility(v2_1);
        return;
    }

    public final void f()
    {
        int v1_0 = this.H;
        if (v1_0 != 0) {
            android.view.ViewGroup v2_0;
            int v1_1 = v1_0.b();
            if ((v1_1 & 128) == 0) {
                v2_0 = 0;
            } else {
                v2_0 = 1;
            }
            int v5_1;
            if ((v1_1 & 1) == 0) {
                v5_1 = 0;
            } else {
                v5_1 = 1;
            }
            String v6_29;
            if ((v1_1 & 32) == 0) {
                v6_29 = 0;
            } else {
                v6_29 = 1;
            }
            int v7_1;
            if ((v1_1 & 64) == 0) {
                v7_1 = 0;
            } else {
                v7_1 = 1;
            }
            if (((v1_1 & 512) == 0) && ((v1_1 & 4096) == 0)) {
                int v8_2 = 0;
            } else {
                v8_2 = 1;
            }
            int v9_1;
            if ((v1_1 & 256) == 0) {
                v9_1 = 0;
            } else {
                v9_1 = 1;
            }
            int v10_3;
            if ((v1_1 & 16) == 0) {
                v10_3 = 0;
            } else {
                v10_3 = 1;
            }
            int v11_2;
            if ((v1_1 & 1024) == 0) {
                v11_2 = 0;
            } else {
                v11_2 = 1;
            }
            int v12_1;
            if ((v1_1 & 2048) == 0) {
                v12_1 = 0;
            } else {
                v12_1 = 1;
            }
            int v13_1;
            if ((v1_1 & 2) == 0) {
                v13_1 = 0;
            } else {
                v13_1 = 1;
            }
            int v1_3;
            if ((v1_1 & 4) == 0) {
                v1_3 = 0;
            } else {
                v1_3 = 1;
            }
            l2.d0.h(this.m, 1);
            if (v6_29 != null) {
                android.view.ViewGroup v15_15;
                l2.d0.h(this.e, 0);
                l2.d0.h(this.v, 1);
                l2.d0.h(this.t, 1);
                l2.d0.h(this.p, 1);
                l2.d0.h(this.m, 1);
                this.p.setText(this.E);
                this.x.setVisibility(8);
                if (v5_1 == 0) {
                    v15_15 = this.F;
                } else {
                    v15_15 = this.G;
                }
                this.u.setText(v15_15);
            }
            if ((v7_1 != 0) || (v5_1 != 0)) {
                android.view.ViewGroup v15_3;
                l2.d0.h(this.e, 0);
                l2.d0.h(this.s, 1);
                l2.d0.h(this.t, 0);
                l2.d0.h(this.v, 1);
                l2.d0.h(this.p, 1);
                l2.d0.h(this.r, 1);
                l2.d0.h(this.q, v5_1);
                l2.d0.h(this.n, 0);
                ((android.widget.TextView) this.f.findViewById(2131362565)).setText(this.getString(2131952444));
                this.w.setText(this.getString(2131952434));
                this.p.setText(this.E);
                if (v5_1 == 0) {
                    v15_3 = this.F;
                } else {
                    v15_3 = this.G;
                }
                this.u.setText(v15_3);
                this.x.setVisibility(8);
            }
            if (v2_0 != null) {
                l2.d0.h(this.f, 0);
                l2.d0.h(this.e, 0);
                l2.d0.h(this.v, 1);
                l2.d0.h(this.p, 1);
                this.x.setVisibility(8);
                this.q.setVisibility(8);
                ((android.widget.TextView) this.f.findViewById(2131362565)).setText(this.getString(2131952436));
                this.o.setVisibility(8);
                if (v5_1 != 0) {
                    this.t.setVisibility(0);
                    this.s.setVisibility(8);
                }
            }
            if ((v9_1 != 0) || (v8_2 != 0)) {
                l2.d0.h(this.e, 1);
                l2.d0.h(this.m, 1);
                l2.d0.h(this.s, 1);
                l2.d0.h(this.q, 1);
                l2.d0.h(this.t, 1);
                l2.d0.h(this.f, 0);
                this.q.setVisibility(8);
                ((android.widget.TextView) this.f.findViewById(2131362565)).setText(this.getString(2131952435));
                ((android.widget.TextView) this.f.findViewById(2131362563)).setVisibility(8);
                this.o.setVisibility(8);
            }
            if (v5_1 != 0) {
                this.w.setText(this.getString(2131951721));
                l2.d0.h(this.o, 1);
            }
            String v6_38 = ((android.widget.TextView) this.n.findViewById(2131362568));
            int v3_2 = ((android.widget.Button) this.n.findViewById(2131362579));
            android.widget.Button v14_5 = ((android.widget.Button) this.n.findViewById(2131362580));
            android.view.ViewGroup v4_2 = ((android.widget.Button) this.n.findViewById(2131362578));
            if ((v10_3 == 0) && ((v11_2 == 0) && (v12_1 == 0))) {
                v6_38.setText(this.getString(2131951702));
            } else {
                int v10_0;
                if (v10_3 == 0) {
                    v10_0 = 1;
                } else {
                    v10_0 = 1;
                    l2.d0.h(v3_2, 1);
                }
                if (v11_2 != 0) {
                    l2.d0.h(v3_2, v10_0);
                    l2.d0.h(v14_5, v10_0);
                }
                if (v12_1 != 0) {
                    l2.d0.h(v3_2, v10_0);
                    l2.d0.h(v14_5, v10_0);
                    l2.d0.h(v4_2, v10_0);
                    v6_38.setText(this.getString(2131952443));
                    if (v5_1 != 0) {
                        l2.d0.h(this.m, v10_0);
                        l2.d0.h(this.f, v10_0);
                    }
                }
                ((android.widget.TextView) this.n.findViewById(2131362568)).setText(this.getString(2131952443));
            }
            if ((v8_2 == 0) && (v9_1 == 0)) {
                int v10_1 = 1;
            } else {
                v10_1 = 1;
                l2.d0.h(this.n, 1);
            }
            if (v2_0 != null) {
                l2.d0.h(v3_2, v10_1);
                l2.d0.h(v14_5, v10_1);
            }
            if ((v13_1 == 0) && ((v1_3 == 0) && ((v12_1 == 0) && ((v9_1 == 0) && ((v5_1 == 0) && (v7_1 == 0)))))) {
                int v3_3 = 0;
            } else {
                v3_3 = v10_1;
            }
            l2.d0.h(this.o, v3_3);
            return;
        } else {
            return;
        }
    }

    public final void g()
    {
        android.widget.Button v0_9 = this.D.o();
        int v1_3 = e0.c.getColor(this.b, 2131100814);
        int vtmp3 = e0.c.getColor(this.b, 2131100816);
        if (v0_9 == null) {
            v1_3 = vtmp3;
        }
        if (this.isAdded()) {
            if (this.D == null) {
                this.D = i2.l.l(this.requireContext().getApplicationContext());
            }
            int v2_1;
            if (v0_9 == null) {
                v2_1 = this.J;
            } else {
                v2_1 = this.I;
            }
            int v6_0;
            this.D.r(this.d, v2_1);
            android.view.View v3_1 = this.requireView();
            android.view.View vtmp9 = v3_1.findViewById(2131361944);
            if (v0_9 == null) {
                v6_0 = this.P;
            } else {
                v6_0 = this.K;
            }
            int v6_1;
            a.a.S(this.a, ((android.view.ViewGroup) vtmp9), v6_0);
            android.view.View vtmp10 = v3_1.findViewById(2131361947);
            if (v0_9 == null) {
                v6_1 = this.N;
            } else {
                v6_1 = this.M;
            }
            int v6_2;
            a.a.S(this.a, ((android.view.ViewGroup) vtmp10), v6_1);
            android.view.View vtmp11 = v3_1.findViewById(2131361948);
            if (v0_9 == null) {
                v6_2 = this.N;
            } else {
                v6_2 = this.M;
            }
            int v4_14;
            a.a.S(this.a, ((android.view.ViewGroup) vtmp11), v6_2);
            a.a.S(this.a, ((android.view.ViewGroup) v3_1.findViewById(2131361949)), v1_3);
            if (v0_9 == null) {
                v4_14 = this.P;
            } else {
                v4_14 = this.K;
            }
            int v4_16;
            this.A.setTint(v4_14);
            this.p.setBackground(this.A);
            if (v0_9 == null) {
                v4_16 = this.Q;
            } else {
                v4_16 = this.L;
            }
            android.widget.Button v0_10;
            this.B.setTint(v4_16);
            this.r.setBackground(this.B);
            if (v0_9 == null) {
                v0_10 = this.R;
            } else {
                v0_10 = this.O;
            }
            this.C.setTint(v0_10);
            this.z.setBackground(this.C);
            int v4_0 = 0;
            if (j5.t1.z(this.b).getInt(this.getString(2131952299), 0) == 8) {
                v4_0 = 1;
            }
            int v1_0;
            android.view.View vtmp16 = v3_1.findViewById(2131362455);
            if (v4_0 == 0) {
                v1_0 = v2_1;
            } else {
                v1_0 = this.J;
            }
            ((android.widget.TextView) vtmp16).setTextColor(v1_0);
            android.widget.Button v0_6 = ((android.widget.ImageView) v3_1.findViewById(2131362454));
            int v1_1 = v0_6.getDrawable();
            if (v1_1 != 0) {
                int v1_2 = v1_1.mutate();
                if (v4_0 != 0) {
                    v2_1 = this.J;
                }
                v1_2.setTint(v2_1);
                v0_6.setImageDrawable(v1_2);
            }
            this.s.setTextColor(-1);
            this.t.setTextColor(-1);
            return;
        } else {
            return;
        }
    }

    public final void onAttach(android.content.Context p2)
    {
        super.onAttach(p2);
        if (!(p2 instanceof i2.n)) {
            throw new ClassCastException(p2.toString());
        } else {
            this.c = ((i2.n) p2);
            return;
        }
    }

    public final android.view.View onCreateView(android.view.LayoutInflater p2, android.view.ViewGroup p3, android.os.Bundle p4)
    {
        android.view.View v2_1 = p2.inflate(2131558459, p3, 0);
        ((android.widget.LinearLayout) v2_1.findViewById(2131361983)).setOnClickListener(new com.google.android.material.datepicker.o(this, 1));
        return v2_1;
    }

    public final void onResume()
    {
        super.onResume();
        com.chilllive.chillwallpaperproject.MainActivity v0_0 = this.c;
        if (v0_0 != null) {
            ((com.chilllive.chillwallpaperproject.MainActivity) v0_0).X = 0;
        }
        this.f();
        this.g();
        return;
    }

    public final void onViewCreated(android.view.View p4, android.os.Bundle p5)
    {
        super.onViewCreated(p4, p5);
        this.a = this.requireActivity();
        this.b = this.requireContext();
        this.d = ((android.view.ViewGroup) p4.findViewById(2131362452));
        this.e = ((android.view.ViewGroup) p4.findViewById(2131361945));
        this.m = ((android.view.ViewGroup) p4.findViewById(2131361946));
        this.f = ((android.view.ViewGroup) p4.findViewById(2131361948));
        this.x = ((android.widget.TextView) p4.findViewById(2131362557));
        this.n = ((android.view.ViewGroup) p4.findViewById(2131362340));
        this.u = ((android.widget.TextView) p4.findViewById(2131362573));
        this.p = ((android.widget.Button) p4.findViewById(2131362575));
        this.r = ((android.widget.Button) p4.findViewById(2131362577));
        this.q = ((android.widget.Button) p4.findViewById(2131362576));
        this.s = ((android.widget.Button) p4.findViewById(2131362581));
        this.t = ((android.widget.Button) p4.findViewById(2131362582));
        this.y = ((android.widget.Button) p4.findViewById(2131362579));
        this.o = ((android.view.ViewGroup) p4.findViewById(2131362047));
        p4.findViewById(2131362586);
        this.z = ((android.widget.Button) p4.findViewById(2131361992));
        p4.findViewById(2131361982);
        this.v = ((android.widget.TextView) p4.findViewById(2131362562));
        p4.findViewById(2131362568);
        p4.findViewById(2131362571);
        this.w = ((android.widget.TextView) p4.findViewById(2131362564));
        p4.findViewById(2131362567);
        com.chilllive.chillwallpaperproject.MainActivity v5_10 = ((android.widget.ImageButton) p4.findViewById(2131361931));
        v5_10.setOnClickListener(new i2.b0(3, this, v5_10));
        this.B = this.r.getBackground().mutate();
        this.A = this.p.getBackground().mutate();
        this.y.getBackground().mutate();
        this.C = this.z.getBackground().mutate();
        com.chilllive.chillwallpaperproject.MainActivity v5_25 = i2.l.l(this.b);
        this.D = v5_25;
        v5_25.c(this.a, this.d, 0);
        this.H = i2.o0.c(this.b);
        this.getString(2131951701);
        this.E = this.getString(2131952448);
        this.getString(2131952208);
        this.getString(2131952210);
        this.getString(2131951718);
        this.F = this.getString(2131951719);
        this.G = this.getString(2131952207);
        this.getString(2131952257);
        this.getString(2131952256);
        this.I = e0.c.getColor(this.b, 2131099794);
        this.J = e0.c.getColor(this.b, 2131100822);
        this.K = e0.c.getColor(this.b, 2131100713);
        this.L = e0.c.getColor(this.b, 2131099803);
        this.O = e0.c.getColor(this.b, 2131100791);
        this.P = e0.c.getColor(this.b, 2131100714);
        this.Q = e0.c.getColor(this.b, 2131099804);
        this.R = e0.c.getColor(this.b, 2131100792);
        this.M = e0.c.getColor(this.b, 2131100730);
        this.N = e0.c.getColor(this.b, 2131100732);
        this.r.setOnClickListener(new l2.c0(this));
        this.p.setOnClickListener(new l2.c0(this));
        ((com.chilllive.chillwallpaperproject.MainActivity) this.requireActivity()).initializeBilling(p4);
        return;
    }
}
