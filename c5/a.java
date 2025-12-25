package c5;
public final synthetic class a implements f5.a, e5.a, c6.a {
    public final synthetic c5.b a;

    public synthetic a(c5.b p1)
    {
        this.a = p1;
        return;
    }

    public void a(c6.b p9)
    {
        c5.b v0 = this.a;
        b8.g v1_0 = d5.d.a;
        v1_0.b("AnalyticsConnector now available.");
        Throwable v9_8 = ((u4.b) p9.get());
        java.util.ArrayList v2_4 = new l6.c(v9_8, 14);
        k2.c v3_1 = new k2.c(6, 0);
        Throwable v9_1 = ((u4.c) v9_8);
        int v5_2 = v9_1.b("clx", v3_1);
        if (v5_2 == 0) {
            if (android.util.Log.isLoggable("FirebaseCrashlytics", 3)) {
                android.util.Log.d("FirebaseCrashlytics", "Could not register AnalyticsConnectorListener with Crashlytics origin.", 0);
            }
            v5_2 = v9_1.b("crash", v3_1);
            if (v5_2 != 0) {
                android.util.Log.w("FirebaseCrashlytics", "A new version of the Google Analytics for Firebase SDK is now available. For improved performance and compatibility with Crashlytics, please update to the latest version.", 0);
            }
        }
        if (v5_2 == 0) {
            v1_0.d("Could not register Firebase Analytics listener; a listener is already registered.", 0);
            return;
        } else {
            v1_0.b("Registered Firebase Analytics listener.");
            Throwable v9_6 = new l6.c(13, 0);
            b8.g v1_3 = new b8.g(v2_4);
            java.util.ArrayList v2_2 = ((java.util.ArrayList) v0.a);
            int v4_3 = v2_2.size();
            int v5_5 = 0;
            while (v5_5 < v4_3) {
                g5.q v6_1 = v2_2.get(v5_5);
                v5_5++;
                v9_6.b(((g5.q) v6_1));
            }
            v3_1.c = v9_6;
            v3_1.b = v1_3;
            v0.c = v9_6;
            v0.b = v1_3;
            return;
        }
    }

    public void b(g5.q p3)
    {
        c5.b v0 = this.a;
        if ((((f5.a) v0.c) instanceof f5.b)) {
            ((java.util.ArrayList) v0.a).add(p3);
        }
        ((f5.a) v0.c).b(p3);
        return;
    }

    public void g(android.os.Bundle p2)
    {
        ((e5.a) this.a.b).g(p2);
        return;
    }
}
