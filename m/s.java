package m;
public final class s implements android.view.MenuItem$OnMenuItemClickListener {
    public final android.view.MenuItem$OnMenuItemClickListener a;
    public final synthetic m.t b;

    public s(m.t p1, android.view.MenuItem$OnMenuItemClickListener p2)
    {
        this.b = p1;
        this.a = p2;
        return;
    }

    public final boolean onMenuItemClick(android.view.MenuItem p2)
    {
        return this.a.onMenuItemClick(this.b.f(p2));
    }
}
