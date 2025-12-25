package h;
public final class m0 extends l.a implements m.k {
    public final android.content.Context c;
    public final m.m d;
    public k2.c e;
    public ref.WeakReference f;
    public final synthetic h.n0 m;

    public m0(h.n0 p1, android.content.Context p2, k2.c p3)
    {
        this.m = p1;
        this.c = p2;
        this.e = p3;
        m.m v1_2 = new m.m(p2);
        v1_2.l = 1;
        this.d = v1_2;
        v1_2.e = this;
        return;
    }

    public final void a()
    {
        h.n0 v0 = this.m;
        if (v0.n == this) {
            if (!v0.u) {
                this.e.w(this);
            } else {
                v0.o = this;
                v0.p = this.e;
            }
            this.e = 0;
            v0.W(0);
            androidx.appcompat.widget.ActionBarOverlayLayout v2_1 = v0.k;
            if (v2_1.q == null) {
                v2_1.e();
            }
            v0.h.setHideOnContentScrollEnabled(v0.z);
            v0.n = 0;
            return;
        } else {
            return;
        }
    }

    public final boolean b(m.m p1, android.view.MenuItem p2)
    {
        int v1_0 = this.e;
        if (v1_0 == 0) {
            return 0;
        } else {
            return ((j6.s) v1_0.b).m(this, p2);
        }
    }

    public final android.view.View c()
    {
        int v0_0 = this.f;
        if (v0_0 == 0) {
            return 0;
        } else {
            return ((android.view.View) v0_0.get());
        }
    }

    public final m.m d()
    {
        return this.d;
    }

    public final android.view.MenuInflater e()
    {
        return new l.h(this.c);
    }

    public final void f(m.m p1)
    {
        if (this.e != null) {
            this.i();
            n.k v1_3 = this.m.k.d;
            if (v1_3 != null) {
                v1_3.l();
            }
        }
        return;
    }

    public final CharSequence g()
    {
        return this.m.k.getSubtitle();
    }

    public final CharSequence h()
    {
        return this.m.k.getTitle();
    }

    public final void i()
    {
        if (this.m.n == this) {
            m.m v0_2 = this.d;
            v0_2.w();
            try {
                this.e.y(this, v0_2);
                v0_2.v();
                return;
            } catch (Throwable v1_1) {
                v0_2.v();
                throw v1_1;
            }
        } else {
            return;
        }
    }

    public final boolean j()
    {
        return this.m.k.y;
    }

    public final void k(android.view.View p2)
    {
        this.m.k.setCustomView(p2);
        this.f = new ref.WeakReference(p2);
        return;
    }

    public final void l(int p2)
    {
        this.m(this.m.f.getResources().getString(p2));
        return;
    }

    public final void m(CharSequence p2)
    {
        this.m.k.setSubtitle(p2);
        return;
    }

    public final void n(int p2)
    {
        this.o(this.m.f.getResources().getString(p2));
        return;
    }

    public final void o(CharSequence p2)
    {
        this.m.k.setTitle(p2);
        return;
    }

    public final void p(boolean p2)
    {
        this.b = p2;
        this.m.k.setTitleOptional(p2);
        return;
    }
}
