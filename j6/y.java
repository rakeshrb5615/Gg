package j6;
public final synthetic class y implements java.util.concurrent.Callable {
    public final synthetic android.content.Context a;
    public final synthetic java.util.concurrent.ScheduledThreadPoolExecutor b;
    public final synthetic com.google.firebase.messaging.FirebaseMessaging c;
    public final synthetic h3.k d;
    public final synthetic a5.z e;

    public synthetic y(android.content.Context p1, java.util.concurrent.ScheduledThreadPoolExecutor p2, com.google.firebase.messaging.FirebaseMessaging p3, h3.k p4, a5.z p5)
    {
        this.a = p1;
        this.b = p2;
        this.c = p3;
        this.d = p4;
        this.e = p5;
        return;
    }

    public final Object call()
    {
        android.content.Context v5 = this.a;
        java.util.concurrent.ScheduledThreadPoolExecutor v6 = this.b;
        com.google.firebase.messaging.FirebaseMessaging v1 = this.c;
        h3.k v2 = this.d;
        a5.z v4 = this.e;
        j6.x v0_1;
        j6.x v0_11 = j6.x.b;
        if (v0_11 == null) {
            v0_1 = 0;
        } else {
            v0_1 = ((j6.x) v0_11.get());
        }
        if (v0_1 == null) {
            j6.x v0_3 = v5.getSharedPreferences("com.google.android.gms.appid", 0);
            j6.x v7_2 = new j6.x();
            v7_2.a = a2.b.c(v0_3, v6);
            j6.x.b = new ref.WeakReference(v7_2);
            v0_1 = v7_2;
        }
        return new j6.z(v1, v2, v0_1, v4, v5, v6);
    }
}
