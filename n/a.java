package n;
public final class a implements q0.u0 {
    public boolean a;
    public int b;
    public final synthetic androidx.appcompat.widget.ActionBarContextView c;

    public a(androidx.appcompat.widget.ActionBarContextView p1)
    {
        this.c = p1;
        this.a = 0;
        return;
    }

    public final void a()
    {
        if (!this.a) {
            androidx.appcompat.widget.ActionBarContextView v1 = this.c;
            v1.f = 0;
            androidx.appcompat.widget.ActionBarContextView.b(v1, this.b);
            return;
        } else {
            return;
        }
    }

    public final void b()
    {
        this.a = 1;
        return;
    }

    public final void c()
    {
        androidx.appcompat.widget.ActionBarContextView.a(this.c);
        this.a = 0;
        return;
    }
}
