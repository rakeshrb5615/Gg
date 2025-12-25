package l2;
public final synthetic class f implements e.b, x3.f {
    public final synthetic l2.a0 a;

    public synthetic f(l2.a0 p1)
    {
        this.a = p1;
        return;
    }

    public void onActivityResult(Object p4)
    {
        int v0_0 = this.a;
        v0_0.getClass();
        if (!((Boolean) p4).booleanValue()) {
            android.widget.Toast.makeText(v0_0.Y1, 2131952235, 0).show();
            v0_0.u();
            return;
        } else {
            v0_0.v1.a(1);
            return;
        }
    }
}
