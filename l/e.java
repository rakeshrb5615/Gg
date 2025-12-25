package l;
public final class e extends android.view.ActionMode {
    public final android.content.Context a;
    public final l.a b;

    public e(android.content.Context p1, l.a p2)
    {
        this.a = p1;
        this.b = p2;
        return;
    }

    public final void finish()
    {
        this.b.a();
        return;
    }

    public final android.view.View getCustomView()
    {
        return this.b.c();
    }

    public final android.view.Menu getMenu()
    {
        return new m.b0(this.a, this.b.d());
    }

    public final android.view.MenuInflater getMenuInflater()
    {
        return this.b.e();
    }

    public final CharSequence getSubtitle()
    {
        return this.b.g();
    }

    public final Object getTag()
    {
        return this.b.a;
    }

    public final CharSequence getTitle()
    {
        return this.b.h();
    }

    public final boolean getTitleOptionalHint()
    {
        return this.b.b;
    }

    public final void invalidate()
    {
        this.b.i();
        return;
    }

    public final boolean isTitleOptional()
    {
        return this.b.j();
    }

    public final void setCustomView(android.view.View p2)
    {
        this.b.k(p2);
        return;
    }

    public final void setSubtitle(int p2)
    {
        this.b.l(p2);
        return;
    }

    public final void setSubtitle(CharSequence p2)
    {
        this.b.m(p2);
        return;
    }

    public final void setTag(Object p2)
    {
        this.b.a = p2;
        return;
    }

    public final void setTitle(int p2)
    {
        this.b.n(p2);
        return;
    }

    public final void setTitle(CharSequence p2)
    {
        this.b.o(p2);
        return;
    }

    public final void setTitleOptionalHint(boolean p2)
    {
        this.b.p(p2);
        return;
    }
}
