package l2;
public final synthetic class r implements x3.g {
    public final synthetic l2.a0 a;
    public final synthetic String[] b;
    public final synthetic int c;

    public synthetic r(l2.a0 p1, String[] p2, int p3)
    {
        this.a = p1;
        this.b = p2;
        this.c = p3;
        return;
    }

    public final void a(float p4)
    {
        this.a.v.edit().putInt(this.b[this.c], ((int) p4)).apply();
        return;
    }
}
