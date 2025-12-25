package androidx.lifecycle;
public final class i0 extends androidx.lifecycle.h {
    final synthetic androidx.lifecycle.j0 this$0;

    public i0(androidx.lifecycle.j0 p1)
    {
        this.this$0 = p1;
        return;
    }

    public void onActivityCreated(android.app.Activity p2, android.os.Bundle p3)
    {
        kotlin.jvm.internal.j.e(p2, "activity");
        if (android.os.Build$VERSION.SDK_INT < 29) {
            androidx.lifecycle.m0 v2_1 = p2.getFragmentManager().findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag");
            kotlin.jvm.internal.j.c(v2_1, "null cannot be cast to non-null type androidx.lifecycle.ReportFragment");
            ((androidx.lifecycle.m0) v2_1).a = this.this$0.n;
        }
        return;
    }

    public void onActivityPaused(android.app.Activity p4)
    {
        kotlin.jvm.internal.j.e(p4, "activity");
        androidx.lifecycle.g0 v4_1 = this.this$0;
        android.os.Handler v0_2 = (v4_1.b - 1);
        v4_1.b = v0_2;
        if (v0_2 == null) {
            android.os.Handler v0_3 = v4_1.e;
            kotlin.jvm.internal.j.b(v0_3);
            v0_3.postDelayed(v4_1.m, 700);
        }
        return;
    }

    public void onActivityPreCreated(android.app.Activity p2, android.os.Bundle p3)
    {
        kotlin.jvm.internal.j.e(p2, "activity");
        androidx.lifecycle.h0.a(p2, new androidx.lifecycle.i0$a(this.this$0));
        return;
    }

    public void onActivityStopped(android.app.Activity p3)
    {
        kotlin.jvm.internal.j.e(p3, "activity");
        androidx.lifecycle.j0 v3_1 = this.this$0;
        int v0_3 = (v3_1.a - 1);
        v3_1.a = v0_3;
        if ((v0_3 == 0) && (v3_1.c)) {
            v3_1.f.e(androidx.lifecycle.n.ON_STOP);
            v3_1.d = 1;
        }
        return;
    }
}
