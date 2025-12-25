package androidx.lifecycle;
public final class i0$a extends androidx.lifecycle.h {
    final synthetic androidx.lifecycle.j0 this$0;

    public i0$a(androidx.lifecycle.j0 p1)
    {
        this.this$0 = p1;
        return;
    }

    public void onActivityPostResumed(android.app.Activity p2)
    {
        kotlin.jvm.internal.j.e(p2, "activity");
        this.this$0.a();
        return;
    }

    public void onActivityPostStarted(android.app.Activity p3)
    {
        kotlin.jvm.internal.j.e(p3, "activity");
        androidx.lifecycle.j0 v3_1 = this.this$0;
        int v0_4 = (v3_1.a + 1);
        v3_1.a = v0_4;
        if ((v0_4 == 1) && (v3_1.d)) {
            v3_1.f.e(androidx.lifecycle.n.ON_START);
            v3_1.d = 0;
        }
        return;
    }
}
