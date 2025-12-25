package androidx.fragment.app;
public final synthetic class t implements java.lang.Runnable {
    public final synthetic int a;
    public final synthetic Object b;

    public synthetic t(Object p1, int p2)
    {
        this.a = p2;
        this.b = p1;
        return;
    }

    public final void run()
    {
        switch (this.a) {
            case 0:
                androidx.fragment.app.e0 v0_4 = ((androidx.fragment.app.e0) this.b);
                v0_4.mViewLifecycleOwner.e.a(v0_4.mSavedViewRegistryState);
                v0_4.mSavedViewRegistryState = 0;
                return;
            default:
                androidx.fragment.app.n1.a(4, ((java.util.ArrayList) this.b));
                return;
        }
    }
}
