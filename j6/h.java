package j6;
public final synthetic class h implements java.util.concurrent.Callable {
    public final synthetic int a;
    public final synthetic Object b;
    public final synthetic Object c;

    public synthetic h(int p1, Object p2, Object p3)
    {
        this.a = p1;
        this.b = p2;
        this.c = p3;
        return;
    }

    public final Object call()
    {
        switch (this.a) {
            case 0:
                int v0_20 = ((android.content.Context) this.b);
                String v1_12 = ((android.content.Intent) this.c);
                StringBuilder v2_7 = j6.s.g();
                v2_7.getClass();
                if (android.util.Log.isLoggable("FirebaseMessaging", 3)) {
                    android.util.Log.d("FirebaseMessaging", "Starting service");
                }
                ((java.util.ArrayDeque) v2_7.e).offer(v1_12);
                String v1_15 = new android.content.Intent("com.google.firebase.MESSAGING_EVENT");
                v1_15.setPackage(v0_20.getPackageName());
                String v5_1 = ((String) v2_7.b);
                if (v5_1 == null) {
                    String v5_5 = v0_20.getPackageManager().resolveService(v1_15, 0);
                    if (v5_5 == null) {
                        android.util.Log.e("FirebaseMessaging", "Failed to resolve target intent service, skipping classname enforcement");
                    } else {
                        String v5_6 = v5_5.serviceInfo;
                        if (v5_6 != null) {
                            if (v0_20.getPackageName().equals(v5_6.packageName)) {
                                String v7_2 = v5_6.name;
                                if (v7_2 != null) {
                                    if (!v7_2.startsWith(".")) {
                                        v2_7.b = v5_6.name;
                                    } else {
                                        Object v3_22 = new StringBuilder();
                                        v3_22.append(v0_20.getPackageName());
                                        v3_22.append(v5_6.name);
                                        v2_7.b = v3_22.toString();
                                    }
                                    v5_1 = ((String) v2_7.b);
                                    if (v5_1 != null) {
                                        if (android.util.Log.isLoggable("FirebaseMessaging", 3)) {
                                            android.util.Log.d("FirebaseMessaging", "Restricting intent to a specific service: ".concat(v5_1));
                                        }
                                        v1_15.setClassName(v0_20.getPackageName(), v5_1);
                                    }
                                    int v0_3;
                                    if (!v2_7.k(v0_20)) {
                                        v0_3 = v0_20.startService(v1_15);
                                        android.util.Log.d("FirebaseMessaging", "Missing wake lock permission, service start may be delayed");
                                        int v0_7;
                                        if (v0_3 != 0) {
                                            v0_7 = -1;
                                        } else {
                                            android.util.Log.e("FirebaseMessaging", "Error while delivering the message: ServiceIntent not found.");
                                            v0_7 = 404;
                                        }
                                    } else {
                                        v0_3 = j6.c0.b(v0_20, v1_15);
                                    }
                                    return Integer.valueOf(v0_7);
                                } else {
                                }
                            }
                            StringBuilder v8_2 = new StringBuilder("Error resolving target intent service, skipping classname enforcement. Resolved service was: ");
                            v8_2.append(v5_6.packageName);
                            v8_2.append("/");
                            v8_2.append(v5_6.name);
                            android.util.Log.e("FirebaseMessaging", v8_2.toString());
                        } else {
                        }
                    }
                    v5_1 = 0;
                }
            case 1:
                String v1_16 = ((m6.g) this.c);
                try {
                    int v0_1 = ((m6.b) this.b).g.a.edit();
                    v1_16.getClass();
                    v0_1.putLong("fetch_timeout_in_seconds", 60).putLong("minimum_fetch_interval_in_seconds", v1_16.a).commit();
                    return 0;
                } catch (int v0_18) {
                    throw v0_18;
                }
            default:
                String v1_5 = ((n6.f) this.c);
                int v0_13 = ((n6.d) this.b).b;
                try {
                    StringBuilder v2_6 = v0_13.a.openFileOutput(v0_13.b, 0);
                    try {
                        v2_6.write(v1_5.a.toString().getBytes("UTF-8"));
                    } catch (String v1_9) {
                        v2_6.close();
                        throw v1_9;
                    }
                    v2_6.close();
                    return 0;
                } catch (String v1_10) {
                    throw v1_10;
                }
        }
    }
}
