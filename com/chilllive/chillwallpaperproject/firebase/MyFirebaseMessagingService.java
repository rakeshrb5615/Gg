package com.chilllive.chillwallpaperproject.firebase;
public class MyFirebaseMessagingService extends com.google.firebase.messaging.FirebaseMessagingService {

    public MyFirebaseMessagingService()
    {
        return;
    }

    public final void c(j6.q p7)
    {
        if (p7.x() != null) {
            android.os.Message v0_12 = ((String) p7.x().a);
            android.app.NotificationManager v7_1 = ((String) p7.x().b);
            d0.t v1_1 = new d0.p(this, "news_channel");
            v1_1.s.icon = 2131231060;
            v1_1.e = d0.p.b(v0_12);
            v1_1.f = d0.p.b(v7_1);
            v1_1.j = 1;
            android.app.NotificationManager v7_5 = new d0.x(this);
            if (e0.c.checkSelfPermission(this, "android.permission.POST_NOTIFICATIONS") == 0) {
                android.os.Message v0_4 = v1_1.a();
                d0.t v1_2 = v0_4.extras;
                if ((v1_2 == null) || (!v1_2.getBoolean("android.support.useSideChannel"))) {
                    v7_5.a.notify(0, 123, v0_4);
                } else {
                    d0.t v1_5 = new d0.t(this.getPackageName(), v0_4);
                    if (d0.x.f == null) {
                        d0.x.f = new d0.w(this.getApplicationContext());
                    }
                    d0.x.f.b.obtainMessage(0, v1_5).sendToTarget();
                    v7_5.a.cancel(0, 123);
                    return;
                }
            }
        }
        return;
    }

    public final void d(String p3)
    {
        this.getSharedPreferences("my_app_prefs", 0).edit().putString("fcm_token", p3).apply();
        return;
    }
}
