package q0;
public final class h0 implements android.view.View$OnApplyWindowInsetsListener {
    public q0.s1 a;
    public final synthetic android.view.View b;
    public final synthetic q0.t c;

    public h0(android.view.View p1, q0.t p2)
    {
        this.b = p1;
        this.c = p2;
        this.a = 0;
        return;
    }

    public android.view.WindowInsets onApplyWindowInsets(android.view.View p6, android.view.WindowInsets p7)
    {
        java.util.WeakHashMap v0 = q0.s1.g(p6, p7);
        int v1 = android.os.Build$VERSION.SDK_INT;
        q0.t v2 = this.c;
        if (v1 < 30) {
            q0.i0.a(p7, this.b);
            if (v0.equals(this.a)) {
                return v2.i(p6, v0).f();
            }
        }
        this.a = v0;
        q0.s1 v7_2 = v2.i(p6, v0);
        if (v1 < 30) {
            q0.g0.c(p6);
            return v7_2.f();
        } else {
            return v7_2.f();
        }
    }
}
