package n;
public final class e3 implements android.view.View$OnClickListener {
    public final m.a a;
    public final synthetic n.f3 b;

    public e3(n.f3 p4)
    {
        this.b = p4;
        android.content.Context v1_1 = p4.a.getContext();
        CharSequence v4_1 = p4.h;
        m.a v0_1 = new m.a();
        v0_1.e = 4096;
        v0_1.g = 4096;
        v0_1.l = 0;
        v0_1.m = 0;
        v0_1.n = 0;
        v0_1.o = 0;
        v0_1.p = 16;
        v0_1.i = v1_1;
        v0_1.a = v4_1;
        this.a = v0_1;
        return;
    }

    public final void onClick(android.view.View p3)
    {
        int v3_0 = this.b;
        android.view.Window$Callback v0 = v3_0.k;
        if ((v0 != null) && (v3_0.l)) {
            v0.onMenuItemSelected(0, this.a);
        }
        return;
    }
}
