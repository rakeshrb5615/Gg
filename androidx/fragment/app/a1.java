package androidx.fragment.app;
public final class a1 implements androidx.fragment.app.z0 {
    public final int a;
    public final int b;
    public final synthetic androidx.fragment.app.b1 c;

    public a1(androidx.fragment.app.b1 p1, int p2, int p3)
    {
        this.c = p1;
        this.a = p2;
        this.b = p3;
        return;
    }

    public final boolean a(java.util.ArrayList p6, java.util.ArrayList p7)
    {
        androidx.fragment.app.b1 v0 = this.c;
        boolean v1_0 = v0.w;
        int v2 = this.a;
        if ((!v1_0) || ((v2 >= 0) || (!v1_0.getChildFragmentManager().O(-1, 0)))) {
            return v0.P(p6, p7, v2, this.b);
        } else {
            return 0;
        }
    }
}
