package q4;
public final class e extends android.content.BroadcastReceiver {
    public static final java.util.concurrent.atomic.AtomicReference b;
    public final android.content.Context a;

    static e()
    {
        q4.e.b = new java.util.concurrent.atomic.AtomicReference();
        return;
    }

    public e(android.content.Context p1)
    {
        this.a = p1;
        return;
    }

    public final void onReceive(android.content.Context p2, android.content.Intent p3)
    {
        Throwable v3_4 = ((r.d) q4.f.l.values()).iterator();
        while (v3_4.hasNext()) {
            ((q4.f) v3_4.next()).g();
        }
        this.a.unregisterReceiver(this);
        return;
    }
}
