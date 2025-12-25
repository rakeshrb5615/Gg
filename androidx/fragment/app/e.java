package androidx.fragment.app;
public final synthetic class e implements m0.c {
    public final synthetic android.animation.Animator a;
    public final synthetic androidx.fragment.app.y1 b;

    public synthetic e(android.animation.Animator p1, androidx.fragment.app.y1 p2)
    {
        this.a = p1;
        this.b = p2;
        return;
    }

    public final void onCancel()
    {
        String v1_0 = this.b;
        kotlin.jvm.internal.j.e(v1_0, "$operation");
        this.a.end();
        if (androidx.fragment.app.b1.H(2)) {
            String v0_1 = new StringBuilder("Animator from operation ");
            v0_1.append(v1_0);
            v0_1.append(" has been canceled.");
            android.util.Log.v("FragmentManager", v0_1.toString());
        }
        return;
    }
}
