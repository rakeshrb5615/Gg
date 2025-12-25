package j6;
public final class j {
    public static final Object c;
    public static j6.f0 d;
    public final Object a;
    public final Object b;

    static j()
    {
        j6.j.c = new Object();
        return;
    }

    public j(android.content.Context p1)
    {
        this.a = p1;
        this.b = new x1.d();
        return;
    }

    public j(j6.o p6)
    {
        this.a = p6.A("gcm.n.title");
        p6.x("gcm.n.title");
        String v0_16 = p6.w("gcm.n.title");
        boolean v1_1 = 0;
        if (v0_16 != null) {
            String[] v2_1 = new String[v0_16.length];
            String v3_0 = 0;
            while (v3_0 < v0_16.length) {
                v2_1[v3_0] = String.valueOf(v0_16[v3_0]);
                v3_0++;
            }
        }
        this.b = p6.A("gcm.n.body");
        p6.x("gcm.n.body");
        String v0_2 = p6.w("gcm.n.body");
        if (v0_2 != null) {
            String[] v2_4 = new String[v0_2.length];
            while (v1_1 < v0_2.length) {
                v2_4[v1_1] = String.valueOf(v0_2[v1_1]);
                v1_1++;
            }
        }
        p6.A("gcm.n.icon");
        if (android.text.TextUtils.isEmpty(p6.A("gcm.n.sound2"))) {
            p6.A("gcm.n.sound");
        }
        p6.A("gcm.n.tag");
        p6.A("gcm.n.color");
        p6.A("gcm.n.click_action");
        p6.A("gcm.n.android_channel_id");
        String v0_13 = p6.A("gcm.n.link_android");
        if (android.text.TextUtils.isEmpty(v0_13)) {
            v0_13 = p6.A("gcm.n.link");
        }
        if (!android.text.TextUtils.isEmpty(v0_13)) {
            android.net.Uri.parse(v0_13);
        }
        p6.A("gcm.n.image");
        p6.A("gcm.n.ticker");
        p6.t("gcm.n.notification_priority");
        p6.t("gcm.n.visibility");
        p6.t("gcm.n.notification_count");
        p6.s("gcm.n.sticky");
        p6.s("gcm.n.local_only");
        p6.s("gcm.n.default_sound");
        p6.s("gcm.n.default_vibrate_timings");
        p6.s("gcm.n.default_light_settings");
        p6.y();
        p6.v();
        p6.B();
        return;
    }

    public j(java.util.concurrent.ExecutorService p3)
    {
        this.b = new r.e(0);
        this.a = p3;
        return;
    }

    public static com.google.android.gms.tasks.Task a(android.content.Context p4, android.content.Intent p5, boolean p6)
    {
        if (android.util.Log.isLoggable("FirebaseMessaging", 3)) {
            android.util.Log.d("FirebaseMessaging", "Binding to service");
        }
        if (j6.j.d == null) {
            j6.j.d = new j6.f0(p4);
        }
        int v1_3 = j6.j.d;
        if (p6 == null) {
            return v1_3.b(p5).continueWith(new x1.d(), new a5.t(21));
        } else {
            if (!j6.s.g().k(p4)) {
                v1_3.b(p5);
            } else {
                if (j6.c0.c == null) {
                    a5.a v0_5 = new com.google.android.gms.stats.WakeLock(p4, 1, "wake:com.google.firebase.iid.WakeLockHolder");
                    j6.c0.c = v0_5;
                    v0_5.setReferenceCounted(1);
                }
                com.google.android.gms.tasks.Task v4_5 = p5.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", 0);
                p5.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", 1);
                if (v4_5 == null) {
                    j6.c0.c.acquire(j6.c0.a);
                }
                v1_3.b(p5).addOnCompleteListener(new a5.a(p5, 11));
            }
            return com.google.android.gms.tasks.Tasks.forResult(Integer.valueOf(-1));
        }
    }

    public com.google.android.gms.tasks.Task b(android.content.Intent p8)
    {
        x1.d v1_2 = p8.getStringExtra("gcm.rawData64");
        int v2 = 0;
        if (v1_2 != null) {
            p8.putExtra("rawData", android.util.Base64.decode(v1_2, 0));
            p8.removeExtra("gcm.rawData64");
        }
        com.google.android.gms.tasks.Task v3_3;
        android.content.Context v0_2 = ((android.content.Context) this.a);
        x1.d v1_1 = ((x1.d) this.b);
        if ((!com.google.android.gms.common.util.PlatformVersion.isAtLeastO()) || (v0_2.getApplicationInfo().targetSdkVersion < 26)) {
            v3_3 = 0;
        } else {
            v3_3 = 1;
        }
        if ((p8.getFlags() & 268435456) != 0) {
            v2 = 1;
        }
        if ((v3_3 == null) || (v2 != 0)) {
            return com.google.android.gms.tasks.Tasks.call(v1_1, new j6.h(0, v0_2, p8)).continueWithTask(v1_1, new j6.i(v0_2, p8, v2));
        } else {
            return j6.j.a(v0_2, p8, v2);
        }
    }
}
