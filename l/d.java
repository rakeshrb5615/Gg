package l;
public final class d extends l.a implements m.k {
    public android.content.Context c;
    public androidx.appcompat.widget.ActionBarContextView d;
    public k2.c e;
    public ref.WeakReference f;
    public boolean m;
    public m.m n;

    public final void a()
    {
        if (!this.m) {
            this.m = 1;
            this.e.w(this);
            return;
        } else {
            return;
        }
    }

    public final boolean b(m.m p1, android.view.MenuItem p2)
    {
        return ((j6.s) this.e.b).m(this, p2);
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
        return this.n;
    }

    public final android.view.MenuInflater e()
    {
        return new l.h(this.d.getContext());
    }

    public final void f(m.m p1)
    {
        this.i();
        n.k v1_1 = this.d.d;
        if (v1_1 != null) {
            v1_1.l();
        }
        return;
    }

    public final CharSequence g()
    {
        return this.d.getSubtitle();
    }

    public final CharSequence h()
    {
        return this.d.getTitle();
    }

    public final void i()
    {
        this.e.y(this, this.n);
        return;
    }

    public final boolean j()
    {
        return this.d.y;
    }

    public final void k(android.view.View p2)
    {
        int v0_1;
        this.d.setCustomView(p2);
        if (p2 == null) {
            v0_1 = 0;
        } else {
            v0_1 = new ref.WeakReference(p2);
        }
        this.f = v0_1;
        return;
    }

    public final void l(int p2)
    {
        this.m(this.c.getString(p2));
        return;
    }

    public final void m(CharSequence p2)
    {
        this.d.setSubtitle(p2);
        return;
    }

    public final void n(int p2)
    {
        this.o(this.c.getString(p2));
        return;
    }

    public final void o(CharSequence p2)
    {
        this.d.setTitle(p2);
        return;
    }

    public final void p(boolean p2)
    {
        this.b = p2;
        this.d.setTitleOptional(p2);
        return;
    }
}
