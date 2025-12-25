package m;
public final class r implements android.view.MenuItem$OnActionExpandListener {
    public final android.view.MenuItem$OnActionExpandListener a;
    public final synthetic m.t b;

    public r(m.t p1, android.view.MenuItem$OnActionExpandListener p2)
    {
        this.b = p1;
        this.a = p2;
        return;
    }

    public final boolean onMenuItemActionCollapse(android.view.MenuItem p2)
    {
        return this.a.onMenuItemActionCollapse(this.b.f(p2));
    }

    public final boolean onMenuItemActionExpand(android.view.MenuItem p2)
    {
        return this.a.onMenuItemActionExpand(this.b.f(p2));
    }
}
