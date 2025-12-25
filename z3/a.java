package z3;
public final synthetic class a implements android.view.View$OnFocusChangeListener {
    public final synthetic int a;
    public final synthetic z3.p b;

    public synthetic a(z3.p p1, int p2)
    {
        this.a = p2;
        this.b = p1;
        return;
    }

    public final void onFocusChange(android.view.View p1, boolean p2)
    {
        switch (this.a) {
            case 0:
                z3.d v1_2 = ((z3.d) this.b);
                v1_2.s(v1_2.t());
                return;
            default:
                z3.d v1_4 = ((z3.k) this.b);
                v1_4.l = p2;
                v1_4.p();
                if (p2 == 0) {
                    v1_4.s(0);
                    v1_4.m = 0;
                }
                return;
        }
    }
}
