package q4;
public final class d implements com.google.android.gms.common.api.internal.BackgroundDetector$BackgroundStateChangeListener {
    public static final java.util.concurrent.atomic.AtomicReference a;

    static d()
    {
        q4.d.a = new java.util.concurrent.atomic.AtomicReference();
        return;
    }

    public final void onBackgroundStateChanged(boolean p8)
    {
        java.util.ArrayList v1_1 = new java.util.ArrayList(q4.f.l.values());
        int v2_2 = v1_1.size();
        int v3 = 0;
        while (v3 < v2_2) {
            java.util.Iterator v4_0 = v1_1.get(v3);
            v3++;
            java.util.Iterator v4_1 = ((q4.f) v4_0);
            if (v4_1.e.get()) {
                android.util.Log.d("FirebaseApp", "Notifying background state change listeners.");
                java.util.Iterator v4_3 = v4_1.i.iterator();
                while (v4_3.hasNext()) {
                    a6.d v5_4 = v4_3.next();
                    if (p8 == null) {
                        ((a6.d) ((q4.c) v5_4).a.h.get()).a();
                    }
                }
            }
        }
        return;
    }
}
