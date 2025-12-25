package androidx.lifecycle;
public abstract class k0 {

    public static void a(android.app.Activity p1, androidx.lifecycle.n p2)
    {
        kotlin.jvm.internal.j.e(p2, "event");
        if ((p1 instanceof androidx.lifecycle.u)) {
            androidx.lifecycle.w v1_2 = ((androidx.lifecycle.u) p1).getLifecycle();
            if ((v1_2 instanceof androidx.lifecycle.w)) {
                ((androidx.lifecycle.w) v1_2).e(p2);
            }
        }
        return;
    }

    public static void b(android.app.Activity p3)
    {
        if (android.os.Build$VERSION.SDK_INT >= 29) {
            androidx.lifecycle.m0$a.Companion.getClass();
            androidx.lifecycle.l0.a(p3);
        }
        android.app.FragmentManager v3_1 = p3.getFragmentManager();
        if (v3_1.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
            v3_1.beginTransaction().add(new androidx.lifecycle.m0(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
            v3_1.executePendingTransactions();
        }
        return;
    }
}
