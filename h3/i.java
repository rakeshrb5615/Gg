package h3;
public final class i extends h.e0 {
    public com.google.android.material.bottomsheet.BottomSheetBehavior m;
    public android.widget.FrameLayout n;
    public androidx.coordinatorlayout.widget.CoordinatorLayout o;
    public android.widget.FrameLayout p;
    public boolean q;
    public boolean r;
    public boolean s;
    public h3.h t;
    public boolean u;
    public b8.g v;
    public h3.g w;

    public final void cancel()
    {
        if (this.m == null) {
            this.e();
        }
        super.cancel();
        return;
    }

    public final void e()
    {
        if (this.n == null) {
            b8.g v0_13 = ((android.widget.FrameLayout) android.view.View.inflate(this.getContext(), 2131558436, 0));
            this.n = v0_13;
            this.o = ((androidx.coordinatorlayout.widget.CoordinatorLayout) v0_13.findViewById(2131361993));
            b8.g v0_5 = ((android.widget.FrameLayout) this.n.findViewById(2131362011));
            this.p = v0_5;
            b8.g v0_6 = com.google.android.material.bottomsheet.BottomSheetBehavior.A(v0_5);
            this.m = v0_6;
            com.google.android.material.bottomsheet.BottomSheetBehavior v1_2 = this.w;
            b8.g v0_7 = v0_6.Y;
            if (!v0_7.contains(v1_2)) {
                v0_7.add(v1_2);
            }
            this.m.F(this.q);
            this.v = new b8.g(this.m, this.p);
        }
        return;
    }

    public final android.widget.FrameLayout f(android.view.View p5, int p6, android.view.ViewGroup$LayoutParams p7)
    {
        this.e();
        androidx.coordinatorlayout.widget.CoordinatorLayout v0_2 = ((androidx.coordinatorlayout.widget.CoordinatorLayout) this.n.findViewById(2131361993));
        if ((p6 != null) && (p5 == null)) {
            p5 = this.getLayoutInflater().inflate(p6, v0_2, 0);
        }
        if (this.u) {
            q0.i0.j(this.n, new l6.c(this, 24));
        }
        this.p.removeAllViews();
        if (p7 != 0) {
            this.p.addView(p5, p7);
        } else {
            this.p.addView(p5);
        }
        v0_2.findViewById(2131362545).setOnClickListener(new com.google.android.material.datepicker.m(this, 2));
        q0.q0.n(this.p, new com.google.android.material.datepicker.k(this, 1));
        this.p.setOnTouchListener(new h3.f(0));
        return this.n;
    }

    public final void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        r3.b v0_0 = this.getWindow();
        if (v0_0 != null) {
            if ((!this.u) || (android.graphics.Color.alpha(v0_0.getNavigationBarColor()) >= 255)) {
                h3.h v2_1 = 0;
            } else {
                v2_1 = 1;
            }
            androidx.coordinatorlayout.widget.CoordinatorLayout v4_1 = this.n;
            if (v4_1 != null) {
                v4_1.setFitsSystemWindows((v2_1 ^ 1));
            }
            androidx.coordinatorlayout.widget.CoordinatorLayout v4_2 = this.o;
            if (v4_2 != null) {
                v4_2.setFitsSystemWindows((v2_1 ^ 1));
            }
            j5.t1.R(v0_0, (v2_1 ^ 1));
            h3.h v2_3 = this.t;
            if (v2_3 != null) {
                v2_3.e(v0_0);
            }
        }
        r3.b v0_1 = this.v;
        if (v0_1 != null) {
            h3.h v2_5 = ((android.view.View) v0_1.d);
            r3.c v3_1 = ((r3.c) v0_1.b);
            if (!this.q) {
                if (v3_1 != null) {
                    v3_1.c(v2_5);
                }
            } else {
                if (v3_1 != null) {
                    v3_1.b(((r3.b) v0_1.c), v2_5, 0);
                    return;
                }
            }
        }
        return;
    }

    public final void onCreate(android.os.Bundle p2)
    {
        super.onCreate(p2);
        android.view.Window v2_1 = this.getWindow();
        if (v2_1 != null) {
            v2_1.setStatusBarColor(0);
            v2_1.addFlags(-2147483648);
            v2_1.setLayout(-1, -1);
        }
        return;
    }

    public final void onDetachedFromWindow()
    {
        android.view.View v0_0 = this.t;
        if (v0_0 != null) {
            v0_0.e(0);
        }
        android.view.View v0_2 = this.v;
        if (v0_2 != null) {
            r3.c v1_2 = ((r3.c) v0_2.b);
            if (v1_2 != null) {
                v1_2.c(((android.view.View) v0_2.d));
            }
        }
        return;
    }

    public final void onStart()
    {
        super.onStart();
        com.google.android.material.bottomsheet.BottomSheetBehavior v0 = this.m;
        if ((v0 != null) && (v0.N == 5)) {
            v0.H(4);
        }
        return;
    }

    public final void setCancelable(boolean p4)
    {
        super.setCancelable(p4);
        if (this.q != p4) {
            this.q = p4;
            android.view.View v0_3 = this.m;
            if (v0_3 != null) {
                v0_3.F(p4);
            }
            if (this.getWindow() != null) {
                r3.b v4_1 = this.v;
                if (v4_1 != null) {
                    android.view.View v0_2 = ((android.view.View) v4_1.d);
                    r3.c v1_1 = ((r3.c) v4_1.b);
                    if (!this.q) {
                        if (v1_1 != null) {
                            v1_1.c(v0_2);
                        }
                    } else {
                        if (v1_1 != null) {
                            v1_1.b(((r3.b) v4_1.c), v0_2, 0);
                            return;
                        }
                    }
                }
            }
        }
        return;
    }

    public final void setCanceledOnTouchOutside(boolean p3)
    {
        super.setCanceledOnTouchOutside(p3);
        if ((p3) && (!this.q)) {
            this.q = 1;
        }
        this.r = p3;
        this.s = 1;
        return;
    }

    public final void setContentView(int p2)
    {
        super.setContentView(this.f(0, p2, 0));
        return;
    }

    public final void setContentView(android.view.View p3)
    {
        super.setContentView(this.f(p3, 0, 0));
        return;
    }

    public final void setContentView(android.view.View p2, android.view.ViewGroup$LayoutParams p3)
    {
        super.setContentView(this.f(p2, 0, p3));
        return;
    }
}
