package m;
public class w {
    public final android.content.Context a;
    public final m.m b;
    public final boolean c;
    public final int d;
    public android.view.View e;
    public int f;
    public boolean g;
    public m.x h;
    public m.u i;
    public android.widget.PopupWindow$OnDismissListener j;
    public final m.v k;

    public w(android.content.Context p1, m.m p2, android.view.View p3, boolean p4, int p5, int p6)
    {
        this.f = 8388611;
        this.k = new m.v(this);
        this.a = p1;
        this.b = p2;
        this.e = p3;
        this.c = p4;
        this.d = p5;
        return;
    }

    public final m.u a()
    {
        if (this.i == null) {
            m.d0 v0_4;
            int v1_0 = this.a;
            m.d0 v0_9 = ((android.view.WindowManager) v1_0.getSystemService("window")).getDefaultDisplay();
            android.view.View v2_0 = new android.graphics.Point();
            v0_9.getRealSize(v2_0);
            if (Math.min(v2_0.x, v2_0.y) < v1_0.getResources().getDimensionPixelSize(2131165206)) {
                v0_4 = new m.d0(this.a, this.b, this.e, this.d, this.c);
            } else {
                v0_4 = new m.g(v1_0, this.e, this.d, this.c);
            }
            v0_4.l(this.b);
            v0_4.r(this.k);
            v0_4.n(this.e);
            v0_4.j(this.h);
            v0_4.o(this.g);
            v0_4.p(this.f);
            this.i = v0_4;
        }
        return this.i;
    }

    public final boolean b()
    {
        int v0_0 = this.i;
        if ((v0_0 == 0) || (!v0_0.b())) {
            return 0;
        } else {
            return 1;
        }
    }

    public void c()
    {
        this.i = 0;
        android.widget.PopupWindow$OnDismissListener v0_1 = this.j;
        if (v0_1 != null) {
            v0_1.onDismiss();
        }
        return;
    }

    public final void d(int p4, int p5, boolean p6, boolean p7)
    {
        m.u v0 = this.a();
        v0.s(p7);
        if (p6 != 0) {
            if ((android.view.Gravity.getAbsoluteGravity(this.f, this.e.getLayoutDirection()) & 7) == 5) {
                p4 -= this.e.getWidth();
            }
            v0.q(p4);
            v0.t(p5);
            int v6_10 = ((int) ((this.a.getResources().getDisplayMetrics().density * 1111490560) / 1073741824));
            v0.a = new android.graphics.Rect((p4 - v6_10), (p5 - v6_10), (p4 + v6_10), (p5 + v6_10));
        }
        v0.c();
        return;
    }
}
