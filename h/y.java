package h;
public final class y extends h.z {
    public final synthetic int c;
    public final synthetic h.c0 d;
    public final Object e;

    public y(h.c0 p2, android.content.Context p3)
    {
        this.c = 0;
        this.d = p2;
        super(p2);
        super.e = ((android.os.PowerManager) p3.getApplicationContext().getSystemService("power"));
        return;
    }

    public y(h.c0 p2, b8.g p3)
    {
        this.c = 1;
        this.d = p2;
        super(p2);
        super.e = p3;
        return;
    }

    public final android.content.IntentFilter d()
    {
        switch (this.c) {
            case 0:
                android.content.IntentFilter v0_2 = new android.content.IntentFilter();
                v0_2.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
                return v0_2;
            default:
                android.content.IntentFilter v0_4 = new android.content.IntentFilter();
                v0_4.addAction("android.intent.action.TIME_SET");
                v0_4.addAction("android.intent.action.TIMEZONE_CHANGED");
                v0_4.addAction("android.intent.action.TIME_TICK");
                return v0_4;
        }
    }

    public final int e()
    {
        switch (this.c) {
            case 0:
                int v0_18;
                if (!h.t.a(((android.os.PowerManager) this.e))) {
                    v0_18 = 1;
                } else {
                    v0_18 = 2;
                }
                return v0_18;
            default:
                int v0_1;
                int v0_3 = ((b8.g) this.e);
                int v2_1 = ((h.k0) v0_3.d);
                long v3_5 = ((android.location.LocationManager) v0_3.c);
                int v5 = 1;
                if (v2_1.b <= System.currentTimeMillis()) {
                    android.location.Location v9_0;
                    boolean v4_3 = ((android.content.Context) v0_3.b);
                    long v8_3 = 0;
                    if (a.a.k(v4_3, "android.permission.ACCESS_COARSE_LOCATION") != 0) {
                        v9_0 = 0;
                    } else {
                        try {
                            int v0_11;
                            if (!v3_5.isProviderEnabled("network")) {
                                v0_11 = 0;
                            } else {
                                v0_11 = v3_5.getLastKnownLocation("network");
                            }
                        } catch (int v0_9) {
                            android.util.Log.d("TwilightManager", "Failed to get last known location", v0_9);
                        }
                        v9_0 = v0_11;
                    }
                    try {
                        if ((a.a.k(v4_3, "android.permission.ACCESS_FINE_LOCATION") == 0) && (v3_5.isProviderEnabled("gps"))) {
                            v8_3 = v3_5.getLastKnownLocation("gps");
                        }
                    } catch (int v0_15) {
                        android.util.Log.d("TwilightManager", "Failed to get last known location", v0_15);
                    }
                    if ((v8_3 == 0) || (v9_0 == null)) {
                        if (v8_3 != 0) {
                            v9_0 = v8_3;
                        }
                    } else {
                        if (v8_3.getTime() > v9_0.getTime()) {
                        }
                    }
                    v0_1 = 0;
                    if (v9_0 == null) {
                        android.util.Log.i("TwilightManager", "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values.");
                        int v2_4 = java.util.Calendar.getInstance().get(11);
                        if ((v2_4 < 6) || (v2_4 >= 22)) {
                            v0_1 = 1;
                        }
                    } else {
                        long v15 = System.currentTimeMillis();
                        if (h.j0.d == null) {
                            h.j0.d = new h.j0();
                        }
                        h.j0 v17_1 = h.j0.d;
                        v17_1.a(v9_0.getLatitude(), v9_0.getLongitude(), (v15 - 86400000));
                        long v10_2 = v17_1;
                        v10_2.a(v9_0.getLatitude(), v9_0.getLongitude(), v15);
                        if (v10_2.c == 1) {
                            v0_1 = 1;
                        }
                        long v6_2;
                        long v6_1 = v10_2.b;
                        long v11_0 = v10_2.a;
                        v10_2.a(v9_0.getLatitude(), v9_0.getLongitude(), (v15 + 86400000));
                        if ((v6_1 != -1) && (v11_0 != -1)) {
                            if (v15 <= v11_0) {
                                if (v15 > v6_1) {
                                    v6_1 = v11_0;
                                }
                            } else {
                                v6_1 = v10_2.b;
                            }
                            v6_2 = (v6_1 + 60000);
                        } else {
                            v6_2 = (v15 + 43200000);
                        }
                        v2_1.a = v0_1;
                        v2_1.b = v6_2;
                    }
                } else {
                    v0_1 = v2_1.a;
                }
                if (v0_1 != 0) {
                    v5 = 2;
                }
                return v5;
        }
    }

    public final void g()
    {
        switch (this.c) {
            case 0:
                this.d.q(1, 1);
                return;
            default:
                this.d.q(1, 1);
                return;
        }
    }
}
