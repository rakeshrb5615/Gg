package c;
public final class r {
    public final c.s a;
    public boolean b;
    public s1.c c;
    public final androidx.fragment.app.t0 d;

    public r(androidx.fragment.app.t0 p2, c.s p3)
    {
        kotlin.jvm.internal.j.e(p2, "onBackPressedCallback");
        boolean v0_1 = p2.b;
        this.a = p3;
        this.b = v0_1;
        this.d = p2;
        return;
    }

    public final void a()
    {
        s1.f v0_0 = this.c;
        if ((v0_0 != null) && (v0_0.c.remove(this))) {
            s1.f v0_1 = v0_0.b;
            v0_1.getClass();
            if (this.equals(v0_1.f)) {
                if (v0_1.g == -1) {
                    this.d.getClass();
                }
                v0_1.f = 0;
                v0_1.g = 0;
                v0_1.h = 0;
            }
            v0_1.d.remove(this);
            v0_1.e.remove(this);
            this.c = 0;
            v0_1.b();
        }
        return;
    }

    public final void b(boolean p2)
    {
        if (this.b != p2) {
            this.b = p2;
            s1.f v2_1 = this.c;
            if (v2_1 != null) {
                s1.f v2_2 = v2_1.b;
                if (v2_2 != null) {
                    v2_2.b();
                }
            }
        }
        return;
    }
}
