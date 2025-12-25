package androidx.fragment.app;
public final class w extends androidx.fragment.app.c0 {
    public final synthetic androidx.fragment.app.e0 a;

    public w(androidx.fragment.app.e0 p1)
    {
        this.a = p1;
        return;
    }

    public final void a()
    {
        int v1_1;
        b2.f v0_0 = this.a;
        v0_0.mSavedStateRegistryController.a.a();
        androidx.lifecycle.q0.d(v0_0);
        int v1_3 = v0_0.mSavedFragmentState;
        if (v1_3 == 0) {
            v1_1 = 0;
        } else {
            v1_1 = v1_3.getBundle("registryState");
        }
        v0_0.mSavedStateRegistryController.a(v1_1);
        return;
    }
}
