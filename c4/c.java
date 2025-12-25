package c4;
public final class c {
    public final d4.l a;
    public final android.content.IntentFilter b;
    public final android.content.Context c;
    public final java.util.HashSet d;
    public d4.k e;

    public c(android.content.Context p4)
    {
        android.content.Context v0_2 = new d4.l("AppUpdateListenerRegistry", 0);
        android.content.IntentFilter v1_2 = new android.content.IntentFilter("com.google.android.play.core.install.ACTION_INSTALL_STATUS");
        this.d = new java.util.HashSet();
        this.e = 0;
        this.a = v0_2;
        this.b = v1_2;
        android.content.Context v0_1 = p4.getApplicationContext();
        if (v0_1 != null) {
            p4 = v0_1;
        }
        this.c = p4;
        return;
    }

    public final void a()
    {
        int v0_0 = this.d;
        android.content.Context v2 = this.c;
        if ((!v0_0.isEmpty()) && (this.e == null)) {
            d4.k v1_3 = new d4.k(this, 0);
            this.e = v1_3;
            android.content.IntentFilter v5 = this.b;
            if (android.os.Build$VERSION.SDK_INT < 33) {
                v2.registerReceiver(v1_3, v5);
            } else {
                v2.registerReceiver(v1_3, v5, 2);
            }
        }
        if (v0_0.isEmpty()) {
            int v0_2 = this.e;
            if (v0_2 != 0) {
                v2.unregisterReceiver(v0_2);
                this.e = 0;
            }
        }
        return;
    }
}
