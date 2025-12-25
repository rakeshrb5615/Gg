package i5;
public final class n {
    public boolean a;
    public final Object b;
    public java.io.Serializable c;
    public final synthetic Object d;

    public n(com.google.firebase.messaging.FirebaseMessaging p1, x5.c p2)
    {
        this.d = p1;
        this.b = p2;
        return;
    }

    public n(m5.c p2, boolean p3)
    {
        java.util.concurrent.atomic.AtomicMarkableReference v3_1;
        this.d = p2;
        this.c = new java.util.concurrent.atomic.AtomicReference(0);
        this.a = p3;
        if (p3 == null) {
            v3_1 = 1024;
        } else {
            v3_1 = 8192;
        }
        this.b = new java.util.concurrent.atomic.AtomicMarkableReference(new i5.d(v3_1), 0);
        return;
    }

    public declared_synchronized void a()
    {
        if (!this.a) {
            int v0_3 = this.c();
            this.c = v0_3;
            if (v0_3 == 0) {
                a5.p v1_1 = ((a5.p) ((x5.c) this.b));
                v1_1.a(v1_1.c, new a5.t(22));
            }
            this.a = 1;
            return;
        } else {
            return;
        }
    }

    public declared_synchronized boolean b()
    {
        boolean v0_1;
        this.a();
        boolean v0_3 = ((Boolean) this.c);
        if (!v0_3) {
            v0_1 = ((com.google.firebase.messaging.FirebaseMessaging) this.d).a.j();
        } else {
            v0_1 = v0_3.booleanValue();
        }
        return v0_1;
    }

    public Boolean c()
    {
        android.os.Bundle v1_4 = ((com.google.firebase.messaging.FirebaseMessaging) this.d).a;
        v1_4.a();
        android.os.Bundle v1_6 = v1_4.a;
        boolean v2_4 = v1_6.getSharedPreferences("com.google.firebase.messaging", 0);
        if (!v2_4.contains("auto_init")) {
            try {
                boolean v2_0 = v1_6.getPackageManager();
            } catch (android.content.pm.PackageManager$NameNotFoundException) {
                return 0;
            }
            if (!v2_0) {
                return 0;
            } else {
                android.os.Bundle v1_3 = v2_0.getApplicationInfo(v1_6.getPackageName(), 128);
                if (v1_3 == null) {
                    return 0;
                } else {
                    boolean v2_1 = v1_3.metaData;
                    if ((!v2_1) || (!v2_1.containsKey("firebase_messaging_auto_init_enabled"))) {
                        return 0;
                    } else {
                        return Boolean.valueOf(v1_3.metaData.getBoolean("firebase_messaging_auto_init_enabled"));
                    }
                }
            }
        } else {
            return Boolean.valueOf(v2_4.getBoolean("auto_init", 0));
        }
    }
}
