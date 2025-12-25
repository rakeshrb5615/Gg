package j6;
public final class k implements android.app.Application$ActivityLifecycleCallbacks {
    public final java.util.ArrayDeque a;

    public k()
    {
        this.a = new java.util.ArrayDeque(10);
        return;
    }

    public final void onActivityCreated(android.app.Activity p6, android.os.Bundle p7)
    {
        String v6_1 = p6.getIntent();
        if (v6_1 != null) {
            String v0_6 = this.a;
            android.os.Bundle v1 = 0;
            String v6_12 = v6_1.getExtras();
            if (v6_12 == null) {
                String v0_4;
                if (v1 != null) {
                    v0_4 = "1".equals(v1.getString("google.c.a.e"));
                } else {
                    v0_4 = 0;
                }
                if (v0_4 != null) {
                    if (v1 != null) {
                        if (!"1".equals(v1.getString("google.c.a.tc"))) {
                            if (android.util.Log.isLoggable("FirebaseMessaging", 3)) {
                                android.util.Log.d("FirebaseMessaging", "Received event with track-conversion=false. Do not set user property");
                            }
                        } else {
                            String v6_9 = ((u4.b) q4.f.d().b(u4.b));
                            if (android.util.Log.isLoggable("FirebaseMessaging", 3)) {
                                android.util.Log.d("FirebaseMessaging", "Received event with track-conversion=true. Setting user property and reengagement event");
                            }
                            if (v6_9 == null) {
                                android.util.Log.w("FirebaseMessaging", "Unable to set user property for conversion tracking:  analytics library is missing");
                            } else {
                                String v7_2 = v1.getString("google.c.a.c_id");
                                String v6_11 = ((u4.c) v6_9);
                                if ((v4.a.a("fcm")) && (v4.a.c("fcm", "_ln"))) {
                                    v6_11.a.setUserProperty("fcm", "_ln", v7_2);
                                }
                                android.os.Bundle v2_6 = new android.os.Bundle();
                                v2_6.putString("source", "Firebase");
                                v2_6.putString("medium", "notification");
                                v2_6.putString("campaign", v7_2);
                                v6_11.a("fcm", "_cmp", v2_6);
                            }
                        }
                    }
                    a.a.K(v1, "_no");
                }
            } else {
                android.os.Bundle v2_0 = v6_12.getString("google.message_id");
                if (v2_0 == null) {
                    v2_0 = v6_12.getString("message_id");
                }
                if (!android.text.TextUtils.isEmpty(v2_0)) {
                    if (!v0_6.contains(v2_0)) {
                        v0_6.add(v2_0);
                    } else {
                        return;
                    }
                }
                v1 = v6_12.getBundle("gcm.n.analytics_data");
            }
        }
        return;
    }

    public final void onActivityDestroyed(android.app.Activity p1)
    {
        return;
    }

    public final void onActivityPaused(android.app.Activity p1)
    {
        return;
    }

    public final void onActivityResumed(android.app.Activity p1)
    {
        return;
    }

    public final void onActivitySaveInstanceState(android.app.Activity p1, android.os.Bundle p2)
    {
        return;
    }

    public final void onActivityStarted(android.app.Activity p1)
    {
        return;
    }

    public final void onActivityStopped(android.app.Activity p1)
    {
        return;
    }
}
