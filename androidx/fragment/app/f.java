package androidx.fragment.app;
public final synthetic class f implements m0.c {
    public final synthetic android.view.View a;
    public final synthetic androidx.fragment.app.n b;
    public final synthetic androidx.fragment.app.h c;
    public final synthetic androidx.fragment.app.y1 d;

    public synthetic f(android.view.View p1, androidx.fragment.app.h p2, androidx.fragment.app.n p3, androidx.fragment.app.y1 p4)
    {
        this.a = p1;
        this.b = p3;
        this.c = p2;
        this.d = p4;
        return;
    }

    public final void onCancel()
    {
        String v1_0 = this.b;
        kotlin.jvm.internal.j.e(v1_0, "this$0");
        androidx.fragment.app.h v2 = this.c;
        kotlin.jvm.internal.j.e(v2, "$animationInfo");
        androidx.fragment.app.y1 v3 = this.d;
        kotlin.jvm.internal.j.e(v3, "$operation");
        String v0_8 = this.a;
        v0_8.clearAnimation();
        v1_0.a.endViewTransition(v0_8);
        v2.a();
        if (androidx.fragment.app.b1.H(2)) {
            String v0_4 = new StringBuilder("Animation from operation ");
            v0_4.append(v3);
            v0_4.append(" has been cancelled.");
            android.util.Log.v("FragmentManager", v0_4.toString());
        }
        return;
    }
}
