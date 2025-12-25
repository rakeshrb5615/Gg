package androidx.fragment.app;
public final synthetic class f0 implements b2.d {
    public final synthetic int a;
    public final synthetic Object b;

    public synthetic f0(Object p1, int p2)
    {
        this.a = p2;
        this.b = p1;
        return;
    }

    public final android.os.Bundle a()
    {
        switch (this.a) {
            case 0:
                android.os.Bundle v0_5 = ((androidx.fragment.app.j0) this.b);
                v0_5.markFragmentsCreated();
                v0_5.mFragmentLifecycleRegistry.e(androidx.lifecycle.n.ON_STOP);
                return new android.os.Bundle();
            default:
                return ((androidx.fragment.app.b1) this.b).T();
        }
    }
}
