package q0;
public final class e0 extends h1.c {
    public final synthetic int e;

    public e0(int p1, Class p2, int p3, int p4, int p5)
    {
        this.e = p5;
        this.a = p1;
        this.d = p2;
        this.c = p3;
        this.b = p4;
        return;
    }

    public final Object d(android.view.View p2)
    {
        switch (this.e) {
            case 0:
                return Boolean.valueOf(q0.l0.c(p2));
            case 1:
                return q0.l0.a(p2);
            case 2:
                return q0.n0.b(p2);
            default:
                return Boolean.valueOf(q0.l0.b(p2));
        }
    }

    public final void e(android.view.View p2, Object p3)
    {
        switch (this.e) {
            case 0:
                q0.l0.f(p2, ((Boolean) p3).booleanValue());
                return;
            case 1:
                q0.l0.e(p2, ((CharSequence) p3));
                return;
            case 2:
                q0.n0.c(p2, ((CharSequence) p3));
                return;
            default:
                q0.l0.d(p2, ((Boolean) p3).booleanValue());
                return;
        }
    }

    public final boolean h(Object p3, Object p4)
    {
        int v3_10;
        switch (this.e) {
            case 0:
                int v3_5;
                int v0_1 = 0;
                if ((((Boolean) p3) == null) || (!((Boolean) p3).booleanValue())) {
                    v3_5 = 0;
                } else {
                    v3_5 = 1;
                }
                if ((((Boolean) p4) == null) || (!((Boolean) p4).booleanValue())) {
                    int v4_3 = 0;
                } else {
                    v4_3 = 1;
                }
                if (v3_5 == v4_3) {
                    v0_1 = 1;
                }
                return (v0_1 ^ 1);
            case 1:
                v3_10 = android.text.TextUtils.equals(((CharSequence) p3), ((CharSequence) p4));
                break;
            case 2:
                v3_10 = android.text.TextUtils.equals(((CharSequence) p3), ((CharSequence) p4));
                break;
            default:
                int v3_9;
                int v0_2 = 0;
                if ((((Boolean) p3) == null) || (!((Boolean) p3).booleanValue())) {
                    v3_9 = 0;
                } else {
                    v3_9 = 1;
                }
                if ((((Boolean) p4) == null) || (!((Boolean) p4).booleanValue())) {
                    int v4_7 = 0;
                } else {
                    v4_7 = 1;
                }
                if (v3_9 == v4_7) {
                    v0_2 = 1;
                }
                return (v0_2 ^ 1);
        }
        return (v3_10 ^ 1);
    }
}
