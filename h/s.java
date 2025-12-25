package h;
public final class s extends c4.b {
    public final synthetic int c;
    public final synthetic Object d;

    public synthetic s(Object p1, int p2)
    {
        this.c = p2;
        this.d = p1;
        return;
    }

    public final void a()
    {
        java.util.WeakHashMap v2_2 = this.d;
        switch (this.c) {
            case 0:
                android.view.ViewGroup v0_1 = ((h.q) v2_2).b;
                v0_1.B.setAlpha(1065353216);
                v0_1.E.d(0);
                v0_1.E = 0;
                return;
            case 1:
                java.util.WeakHashMap v2_5 = ((h.c0) v2_2);
                v2_5.B.setAlpha(1065353216);
                v2_5.E.d(0);
                v2_5.E = 0;
                return;
            default:
                android.view.ViewGroup v0_3 = ((h.c0) ((k2.c) v2_2).c);
                v0_3.B.setVisibility(8);
                android.view.View v1_3 = v0_3.C;
                if (v1_3 == null) {
                    if ((v0_3.B.getParent() instanceof android.view.View)) {
                        q0.g0.c(((android.view.View) v0_3.B.getParent()));
                    }
                } else {
                    v1_3.dismiss();
                }
                v0_3.B.e();
                v0_3.E.d(0);
                v0_3.E = 0;
                q0.g0.c(v0_3.H);
                return;
        }
    }

    public void c()
    {
        h.c0 v2_1 = this.d;
        switch (this.c) {
            case 0:
                ((h.q) v2_1).b.B.setVisibility(0);
                return;
            case 1:
                h.c0 v2_2 = ((h.c0) v2_1);
                v2_2.B.setVisibility(0);
                if ((v2_2.B.getParent() instanceof android.view.View)) {
                    q0.g0.c(((android.view.View) v2_2.B.getParent()));
                }
                return;
            default:
                return;
        }
    }
}
