package androidx.fragment.app;
public final class a0 extends androidx.fragment.app.c0 {
    public final synthetic androidx.fragment.app.z a;
    public final synthetic java.util.concurrent.atomic.AtomicReference b;
    public final synthetic f.a c;
    public final synthetic e.b d;
    public final synthetic androidx.fragment.app.e0 e;

    public a0(androidx.fragment.app.e0 p1, androidx.fragment.app.z p2, java.util.concurrent.atomic.AtomicReference p3, f.a p4, e.b p5)
    {
        this.e = p1;
        this.a = p2;
        this.b = p3;
        this.c = p4;
        this.d = p5;
        return;
    }

    public final void a()
    {
        e.i v2_1;
        e.h v0_0 = this.e;
        java.util.concurrent.atomic.AtomicReference v1_0 = v0_0.generateActivityResultKey();
        e.i v2_3 = this.a;
        switch (v2_3.a) {
            case 0:
                e.i v2_5 = ((androidx.fragment.app.e0) v2_3.b);
                e.j v3_3 = v2_5.mHost;
                if (!(v3_3 instanceof e.j)) {
                    v2_1 = v2_5.requireActivity().getActivityResultRegistry();
                } else {
                    v2_1 = ((e.j) v3_3).getActivityResultRegistry();
                }
                break;
            default:
                v2_1 = ((e.i) v2_3.b);
        }
        this.b.set(v2_1.c(v1_0, v0_0, this.c, this.d));
        return;
    }
}
