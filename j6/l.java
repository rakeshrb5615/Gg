package j6;
public final synthetic class l implements java.lang.Runnable {
    public final synthetic int a;
    public final synthetic com.google.firebase.messaging.FirebaseMessaging b;

    public synthetic l(com.google.firebase.messaging.FirebaseMessaging p1, int p2)
    {
        this.a = p2;
        this.b = p1;
        return;
    }

    public final void run()
    {
        switch (this.a) {
            case 0:
                com.google.firebase.messaging.FirebaseMessaging v0_2 = this.b;
                if ((v0_2.e.b()) && ((v0_2.g(v0_2.d())) && (!v0_2.i))) {
                    v0_2.f(0);
                }
                return;
            default:
                com.google.firebase.messaging.FirebaseMessaging v0_1 = this.b;
                long v1_4 = v0_1.b;
                f2.b0.f(v1_4);
                java.util.concurrent.ScheduledThreadPoolExecutor v2_0 = v0_1.c;
                j6.m v3_0 = v0_1.e();
                if (com.google.android.gms.common.util.PlatformVersion.isAtLeastQ()) {
                    int v4_1 = c4.b.C(v1_4);
                    if ((!v4_1.contains("proxy_retention")) || (v4_1.getBoolean("proxy_retention", 0) != v3_0)) {
                        ((com.google.android.gms.cloudmessaging.Rpc) v2_0.c).setRetainProxiedNotifications(v3_0).addOnSuccessListener(new x1.d(), new i2.o(v1_4, v3_0));
                    }
                }
                if (v0_1.e()) {
                    ((com.google.android.gms.cloudmessaging.Rpc) v2_0.c).getProxiedNotificationData().addOnSuccessListener(v0_1.f, new j6.m(v0_1, 1));
                }
                return;
        }
    }
}
