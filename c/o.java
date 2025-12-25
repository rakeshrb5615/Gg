package c;
public final synthetic class o implements u7.a {
    public final synthetic int a;
    public final synthetic c.p b;

    public synthetic o(c.p p1, int p2)
    {
        this.a = p2;
        this.b = p1;
        return;
    }

    public final Object invoke()
    {
        switch (this.a) {
            case 0:
                s1.a v0_4 = new s1.a();
                this.b.getOnBackPressedDispatcher().b.a(v0_4);
                return v0_4;
            default:
                return new c.v(new androidx.lifecycle.g0(this.b, 2));
        }
    }
}
