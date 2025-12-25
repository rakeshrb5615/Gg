package h;
public class e0 extends c.p implements h.j {
    public h.c0 e;
    public final h.d0 f;

    public e0(android.content.Context p5, int p6)
    {
        h.p v2_3;
        if (p6 != 0) {
            v2_3 = p6;
        } else {
            h.p v2_5 = new android.util.TypedValue();
            p5.getTheme().resolveAttribute(2130969009, v2_5, 1);
            v2_3 = v2_5.resourceId;
        }
        super(p5, v2_3);
        super.f = new h.d0(super);
        h.p v2_2 = super.c();
        if (p6 == 0) {
            int v6_2 = new android.util.TypedValue();
            p5.getTheme().resolveAttribute(2130969009, v6_2, 1);
            p6 = v6_2.resourceId;
        }
        ((h.c0) v2_2).a0 = p6;
        v2_2.h();
        return;
    }

    public final void addContentView(android.view.View p4, android.view.ViewGroup$LayoutParams p5)
    {
        this.b();
        h.c0 v0_1 = ((h.c0) this.c());
        v0_1.z();
        ((android.view.ViewGroup) v0_1.H.findViewById(16908290)).addView(p4, p5);
        v0_1.s.a(v0_1.r.getCallback());
        return;
    }

    public final h.p c()
    {
        if (this.e == null) {
            this.e = new h.c0(this.getContext(), this.getWindow(), this, this);
        }
        return this.e;
    }

    public final boolean d(android.view.KeyEvent p1)
    {
        return super.dispatchKeyEvent(p1);
    }

    public final void dismiss()
    {
        super.dismiss();
        this.c().i();
        return;
    }

    public final boolean dispatchKeyEvent(android.view.KeyEvent p3)
    {
        return q4.b.o(this.f, this.getWindow().getDecorView(), this, p3);
    }

    public final android.view.View findViewById(int p2)
    {
        android.view.Window v0_1 = ((h.c0) this.c());
        v0_1.z();
        return v0_1.r.findViewById(p2);
    }

    public final void invalidateOptionsMenu()
    {
        this.c().e();
        return;
    }

    public void onCreate(android.os.Bundle p2)
    {
        this.c().d();
        super.onCreate(p2);
        this.c().h();
        return;
    }

    public final void onStop()
    {
        super.onStop();
        l.j v0_1 = ((h.c0) this.c());
        v0_1.D();
        l.j v0_2 = v0_1.u;
        if (v0_2 != null) {
            v0_2.y = 0;
            l.j v0_3 = v0_2.x;
            if (v0_3 != null) {
                v0_3.a();
            }
        }
        return;
    }

    public void setContentView(int p2)
    {
        this.b();
        this.c().l(p2);
        return;
    }

    public void setContentView(android.view.View p2)
    {
        this.b();
        this.c().m(p2);
        return;
    }

    public void setContentView(android.view.View p2, android.view.ViewGroup$LayoutParams p3)
    {
        this.b();
        this.c().n(p2, p3);
        return;
    }

    public final void setTitle(int p3)
    {
        super.setTitle(p3);
        this.c().o(this.getContext().getString(p3));
        return;
    }

    public void setTitle(CharSequence p2)
    {
        super.setTitle(p2);
        this.c().o(p2);
        return;
    }
}
