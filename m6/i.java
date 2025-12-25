package m6;
public final class i implements com.google.android.gms.common.api.internal.BackgroundDetector$BackgroundStateChangeListener {
    public static final java.util.concurrent.atomic.AtomicReference a;

    static i()
    {
        m6.i.a = new java.util.concurrent.atomic.AtomicReference();
        return;
    }

    public final void onBackgroundStateChanged(boolean p4)
    {
        Class v0 = m6.j;
        java.util.Iterator v1_2 = m6.j.l.values().iterator();
        while (v1_2.hasNext()) {
            ((m6.b) v1_2.next()).b(p4);
        }
        return;
    }
}
