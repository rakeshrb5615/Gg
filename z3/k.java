package z3;
public final class k extends z3.p {
    public final int e;
    public final int f;
    public final android.animation.TimeInterpolator g;
    public android.widget.AutoCompleteTextView h;
    public final com.google.android.material.datepicker.o i;
    public final z3.a j;
    public final z3.j k;
    public boolean l;
    public boolean m;
    public boolean n;
    public long o;
    public android.view.accessibility.AccessibilityManager p;
    public android.animation.ValueAnimator q;
    public android.animation.ValueAnimator r;

    public k(z3.o p4)
    {
        super(p4);
        super.i = new com.google.android.material.datepicker.o(super, 3);
        super.j = new z3.a(super, 1);
        super.k = new z3.j(super);
        super.o = 9223372036854775807;
        super.f = j5.t1.P(p4.getContext(), 2130969532, 67);
        super.e = j5.t1.P(p4.getContext(), 2130969532, 50);
        super.g = j5.t1.Q(p4.getContext(), 2130969541, d3.a.a);
        return;
    }

    public final void a()
    {
        if ((this.p.isTouchExplorationEnabled()) && ((this.h.getInputType() != 0) && (!this.d.hasFocus()))) {
            this.h.dismissDropDown();
        }
        this.h.post(new androidx.lifecycle.g0(this, 17));
        return;
    }

    public final int c()
    {
        return 2131951837;
    }

    public final int d()
    {
        return 2131231319;
    }

    public final android.view.View$OnFocusChangeListener e()
    {
        return this.j;
    }

    public final android.view.View$OnClickListener f()
    {
        return this.i;
    }

    public final android.view.accessibility.AccessibilityManager$TouchExplorationStateChangeListener h()
    {
        return this.k;
    }

    public final boolean i(int p1)
    {
        if (p1 == 0) {
            return 0;
        } else {
            return 1;
        }
    }

    public final boolean k()
    {
        return this.n;
    }

    public final void l(android.widget.EditText p3)
    {
        if (!(p3 instanceof android.widget.AutoCompleteTextView)) {
            throw new RuntimeException("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
        } else {
            this.h = ((android.widget.AutoCompleteTextView) p3);
            ((android.widget.AutoCompleteTextView) p3).setOnTouchListener(new z3.h(this));
            this.h.setOnDismissListener(new z3.i(this));
            this.h.setThreshold(0);
            com.google.android.material.textfield.TextInputLayout v1_4 = this.a;
            v1_4.setErrorIconDrawable(0);
            if ((p3.getInputType() == 0) && (this.p.isTouchExplorationEnabled())) {
                this.d.setImportantForAccessibility(2);
            }
            v1_4.setEndIconVisible(1);
            return;
        }
    }

    public final void m(r0.c p3)
    {
        android.view.accessibility.AccessibilityNodeInfo v0 = p3.a;
        if (this.h.getInputType() == 0) {
            p3.i(android.widget.Spinner.getName());
        }
        if (v0.isShowingHintText()) {
            v0.setHintText(0);
        }
        return;
    }

    public final void n(android.view.accessibility.AccessibilityEvent p4)
    {
        if (this.p.isEnabled()) {
            if (this.h.getInputType() == 0) {
                if (((p4.getEventType() != 32768) && (p4.getEventType() != 8)) || ((!this.n) || (this.h.isPopupShowing()))) {
                    long v0_6 = 0;
                } else {
                    v0_6 = 1;
                }
                if ((p4.getEventType() == 1) || (v0_6 != 0)) {
                    this.t();
                    this.m = 1;
                    this.o = android.os.SystemClock.uptimeMillis();
                }
            } else {
                return;
            }
        }
        return;
    }

    public final void q()
    {
        String v1_0 = new float[2];
        v1_0 = {0, 1065353216};
        String v1_8 = android.animation.ValueAnimator.ofFloat(v1_0);
        int v2_1 = this.g;
        v1_8.setInterpolator(v2_1);
        v1_8.setDuration(((long) this.f));
        v1_8.addUpdateListener(new i2.j(this, 4));
        this.r = v1_8;
        android.view.accessibility.AccessibilityManager v0_1 = new float[2];
        v0_1 = {1065353216, 0};
        android.view.accessibility.AccessibilityManager v0_2 = android.animation.ValueAnimator.ofFloat(v0_1);
        v0_2.setInterpolator(v2_1);
        v0_2.setDuration(((long) this.e));
        v0_2.addUpdateListener(new i2.j(this, 4));
        this.q = v0_2;
        v0_2.addListener(new f2.o(this, 10));
        this.p = ((android.view.accessibility.AccessibilityManager) this.c.getSystemService("accessibility"));
        return;
    }

    public final void r()
    {
        android.widget.AutoCompleteTextView v0_0 = this.h;
        if (v0_0 != null) {
            v0_0.setOnTouchListener(0);
            this.h.setOnDismissListener(0);
        }
        return;
    }

    public final void s(boolean p2)
    {
        if (this.n != p2) {
            this.n = p2;
            this.r.cancel();
            this.q.start();
        }
        return;
    }

    public final void t()
    {
        if (this.h != null) {
            android.widget.AutoCompleteTextView v0_10 = (android.os.SystemClock.uptimeMillis() - this.o);
            if ((v0_10 < 0) || (v0_10 > 300)) {
                this.m = 0;
            }
            if (this.m) {
                this.m = 0;
                return;
            } else {
                this.s((this.n ^ 1));
                if (!this.n) {
                    this.h.dismissDropDown();
                    return;
                } else {
                    this.h.requestFocus();
                    this.h.showDropDown();
                    return;
                }
            }
        } else {
            return;
        }
    }
}
