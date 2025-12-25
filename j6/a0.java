package j6;
public final class a0 extends android.content.BroadcastReceiver {
    public j6.b0 a;
    public final synthetic j6.b0 b;

    public a0(j6.b0 p1, j6.b0 p2)
    {
        this.b = p1;
        this.a = p2;
        return;
    }

    public final void a()
    {
        if (android.util.Log.isLoggable("FirebaseMessaging", 3)) {
            android.util.Log.d("FirebaseMessaging", "Connectivity change received registered");
        }
        this.b.a.registerReceiver(this, new android.content.IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        return;
    }

    public final declared_synchronized void onReceive(android.content.Context p5, android.content.Intent p6)
    {
        j6.b0 v6_0 = this.a;
        if (v6_0 != null) {
            if (v6_0.d()) {
                if (android.util.Log.isLoggable("FirebaseMessaging", 3)) {
                    android.util.Log.d("FirebaseMessaging", "Connectivity changed. Starting background sync.");
                }
                j6.b0 v6_2 = this.a;
                v6_2.d.f.schedule(v6_2, 0, java.util.concurrent.TimeUnit.SECONDS);
                p5.unregisterReceiver(this);
                this.a = 0;
                return;
            } else {
                return;
            }
        } else {
            return;
        }
    }
}
