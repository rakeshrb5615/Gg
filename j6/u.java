package j6;
public final class u extends android.content.BroadcastReceiver {
    public j6.v a;
    public android.content.Context b;

    public final void a()
    {
        if (android.util.Log.isLoggable("FirebaseMessaging", 3)) {
            android.util.Log.d("FirebaseMessaging", "Connectivity change received registered");
        }
        android.content.IntentFilter v0_4 = new android.content.IntentFilter("android.net.conn.CONNECTIVITY_CHANGE");
        android.content.Context v1_1 = this.a;
        if (v1_1 != null) {
            android.content.Context v1_3 = v1_1.c.b;
            this.b = v1_3;
            v1_3.registerReceiver(this, v0_4);
        }
        return;
    }

    public final void onReceive(android.content.Context p3, android.content.Intent p4)
    {
        int v3_0 = this.a;
        if ((v3_0 != 0) && (v3_0.a())) {
            if (android.util.Log.isLoggable("FirebaseMessaging", 3)) {
                android.util.Log.d("FirebaseMessaging", "Connectivity changed. Starting background sync.");
            }
            int v3_2 = this.a;
            v3_2.c.getClass();
            com.google.firebase.messaging.FirebaseMessaging.b(v3_2, 0);
            int v3_3 = this.b;
            if (v3_3 != 0) {
                v3_3.unregisterReceiver(this);
            }
            this.a = 0;
            return;
        } else {
            return;
        }
    }
}
