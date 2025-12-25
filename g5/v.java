package g5;
public final class v {
    public final q4.f a;
    public final Object b;
    public final com.google.android.gms.tasks.TaskCompletionSource c;
    public final boolean d;
    public final Boolean e;
    public final com.google.android.gms.tasks.TaskCompletionSource f;

    public v(q4.f p7)
    {
        Boolean v7_3;
        this.b = new Object();
        this.c = new com.google.android.gms.tasks.TaskCompletionSource();
        this.d = 0;
        this.f = new com.google.android.gms.tasks.TaskCompletionSource();
        p7.a();
        android.os.Bundle v1_1 = p7.a;
        this.a = p7;
        Boolean v7_2 = v1_1.getSharedPreferences("com.google.firebase.crashlytics", 0);
        if (!v7_2.contains("firebase_crashlytics_collection_enabled")) {
            v7_3 = 0;
        } else {
            this.d = 0;
            v7_3 = Boolean.valueOf(v7_2.getBoolean("firebase_crashlytics_collection_enabled", 1));
        }
        if (v7_3 == null) {
            try {
                Boolean v7_7;
                boolean v2_1 = v1_1.getPackageManager();
            } catch (Boolean v7_6) {
                android.util.Log.e("FirebaseCrashlytics", "Could not read data collection permission from manifest", v7_6);
                v7_7 = 0;
                if (v7_7 != null) {
                    this.d = 1;
                    v7_3 = Boolean.valueOf(Boolean.TRUE.equals(v7_7));
                } else {
                    this.d = 0;
                    v7_3 = 0;
                }
            }
            if (!v2_1) {
            } else {
                android.os.Bundle v1_3 = v2_1.getApplicationInfo(v1_1.getPackageName(), 128);
                if (v1_3 == null) {
                } else {
                    boolean v2_2 = v1_3.metaData;
                    if ((!v2_2) || (!v2_2.containsKey("firebase_crashlytics_collection_enabled"))) {
                    } else {
                        v7_7 = Boolean.valueOf(v1_3.metaData.getBoolean("firebase_crashlytics_collection_enabled"));
                    }
                }
            }
        }
        this.e = v7_3;
        if (this.a()) {
            this.c.trySetResult(0);
        }
        return;
    }

    public final declared_synchronized boolean a()
    {
        int v0_3;
        int v0_0 = this.e;
        if (v0_0 == 0) {
            try {
                v0_3 = this.a.j();
            } catch (IllegalStateException) {
                v0_3 = 0;
            }
        } else {
            v0_3 = v0_0.booleanValue();
        }
        this.b(v0_3);
        return v0_3;
    }

    public final void b(boolean p4)
    {
        String v4_1;
        if (p4 == null) {
            v4_1 = "DISABLED";
        } else {
            v4_1 = "ENABLED";
        }
        int v0_5;
        if (this.e != null) {
            if (!this.d) {
                v0_5 = "API";
            } else {
                v0_5 = "firebase_crashlytics_collection_enabled manifest flag";
            }
        } else {
            v0_5 = "global Firebase setting";
        }
        String v1_1 = new StringBuilder("Crashlytics automatic data collection ");
        v1_1.append(v4_1);
        v1_1.append(" by ");
        v1_1.append(v0_5);
        v1_1.append(".");
        String v4_4 = v1_1.toString();
        if (android.util.Log.isLoggable("FirebaseCrashlytics", 3)) {
            android.util.Log.d("FirebaseCrashlytics", v4_4, 0);
        }
        return;
    }
}
