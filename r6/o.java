package r6;
public final class o {
    public final q4.f a;
    public final u6.k b;

    public o(q4.f p2, u6.k p3, l7.h p4, r6.w0 p5)
    {
        kotlin.jvm.internal.j.e(p2, "firebaseApp");
        kotlin.jvm.internal.j.e(p3, "settings");
        kotlin.jvm.internal.j.e(p4, "backgroundDispatcher");
        kotlin.jvm.internal.j.e(p5, "sessionsActivityLifecycleCallbacks");
        this.a = p2;
        this.b = p3;
        android.util.Log.d("FirebaseSessions", "Initializing Firebase Sessions 3.0.3.");
        p2.a();
        String v2_2 = p2.a.getApplicationContext();
        if (!(v2_2 instanceof android.app.Application)) {
            StringBuilder v3_4 = new StringBuilder("Failed to register lifecycle callbacks, unexpected context ");
            v3_4.append(v2_2.getClass());
            v3_4.append(46);
            android.util.Log.e("FirebaseSessions", v3_4.toString());
            return;
        } else {
            ((android.app.Application) v2_2).registerActivityLifecycleCallbacks(p5);
            d8.f0.p(d8.f0.b(p4), new a1.d(this, p5, 0, 10));
            return;
        }
    }
}
