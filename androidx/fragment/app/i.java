package androidx.fragment.app;
public abstract class i {
    public final androidx.fragment.app.y1 a;
    public final m0.d b;

    public i(androidx.fragment.app.y1 p1, m0.d p2)
    {
        this.a = p1;
        this.b = p2;
        return;
    }

    public final void a()
    {
        androidx.fragment.app.y1 v0 = this.a;
        boolean v1_0 = v0.e;
        if ((v1_0.remove(this.b)) && (v1_0.isEmpty())) {
            v0.b();
        }
        return;
    }

    public final boolean b()
    {
        int v0_0 = this.a;
        String v1_2 = v0_0.c.mView;
        kotlin.jvm.internal.j.d(v1_2, "operation.fragment.mView");
        int v4 = 4;
        if ((v1_2.getAlpha() != 0) || (v1_2.getVisibility() != 0)) {
            String v1_1 = v1_2.getVisibility();
            if (v1_1 == null) {
                v4 = 2;
            } else {
                if (v1_1 != 4) {
                    if (v1_1 != 8) {
                        throw new IllegalArgumentException(g2.g.c(v1_1, "Unknown visibility "));
                    } else {
                        v4 = 3;
                    }
                }
            }
        }
        int v0_3 = v0_0.a;
        if ((v4 != v0_3) && ((v4 == 2) || (v0_3 == 2))) {
            return 0;
        } else {
            return 1;
        }
    }
}
