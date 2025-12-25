package androidx.fragment.app;
public final class x extends androidx.fragment.app.m0 {
    public final synthetic androidx.fragment.app.e0 a;

    public x(androidx.fragment.app.e0 p1)
    {
        this.a = p1;
        return;
    }

    public final android.view.View b(int p4)
    {
        String v0_0 = this.a;
        StringBuilder v1_0 = v0_0.mView;
        if (v1_0 == null) {
            StringBuilder v1_2 = new StringBuilder("Fragment ");
            v1_2.append(v0_0);
            v1_2.append(" does not have a view");
            throw new IllegalStateException(v1_2.toString());
        } else {
            return v1_0.findViewById(p4);
        }
    }

    public final boolean c()
    {
        if (this.a.mView == null) {
            return 0;
        } else {
            return 1;
        }
    }
}
