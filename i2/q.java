package i2;
public final class q {
    public final com.google.android.gms.location.FusedLocationProviderClient a;
    public double b;
    public double c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final String k;
    public final android.content.SharedPreferences l;
    public final android.content.SharedPreferences$Editor m;
    public final android.content.Context n;
    public final j2.j o;
    public final java.util.Locale p;
    public final c5.c q;

    public q(android.content.Context p4, j2.j p5)
    {
        this.p = new java.util.Locale$Builder().setLanguage("en").setRegion("US").build();
        new m2.a();
        this.q = new c5.c();
        this.n = p4;
        this.o = p5;
        android.content.SharedPreferences v5_1 = j5.t1.z(p4);
        this.l = v5_1;
        android.content.SharedPreferences$Editor v0_6 = v5_1.edit();
        this.m = v0_6;
        this.f = p4.getResources().getString(2131951927);
        this.e = p4.getResources().getString(2131951954);
        this.d = p4.getResources().getString(2131951926);
        this.g = p4.getResources().getString(2131952461);
        this.h = p4.getResources().getString(2131951921);
        this.i = p4.getResources().getString(2131951934);
        this.j = p4.getResources().getString(2131951970);
        this.k = p4.getResources().getString(2131951855);
        this.a = com.google.android.gms.location.LocationServices.getFusedLocationProviderClient(p4);
        if (v5_1.getFloat(this.d, 0) == 0) {
            v0_6.putFloat(this.d, 0);
            v0_6.apply();
        }
        return;
    }

    public final void a(boolean p18)
    {
        float v3_2 = this.n;
        if (com.google.android.gms.common.GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(v3_2) == 0) {
            c5.c v0_10 = ((android.location.LocationManager) v3_2.getSystemService("location"));
            double v7_0 = this.l;
            android.content.SharedPreferences$Editor v8 = this.m;
            if ((!v0_10.isProviderEnabled("gps")) && (!v0_10.isProviderEnabled("network"))) {
                try {
                    c5.c v0_27 = v7_0.getBoolean(this.k, 0);
                } catch (ClassCastException) {
                    v7_0.edit().remove(v0_27).apply();
                    v0_27 = 0;
                }
                if (v0_27 == null) {
                    if (p18) {
                        android.widget.Toast.makeText(v3_2, 2131952459, 0).show();
                        v8.putBoolean(this.e, 0);
                    }
                    v8.apply();
                } else {
                    this.d();
                    try {
                        c5.c v0_34 = v7_0.getFloat(this.i, 1148829696);
                    } catch (ClassCastException) {
                        v7_0.edit().remove(v0_34).apply();
                        v0_34 = 1148829696;
                    }
                    this.b = ((double) v0_34);
                    c5.c v0_36 = this.j;
                    try {
                        float v3_4 = v7_0.getFloat(v0_36, 1148829696);
                    } catch (ClassCastException) {
                        v7_0.edit().remove(v0_36).apply();
                    }
                    double v7_1 = ((double) v3_4);
                    this.c = v7_1;
                    this.o.f(this.b, v7_1, this.m);
                    this.o.c(this.b, this.c, (p18 ^ 1), this.q);
                    return;
                }
            } else {
                c5.c v0_41 = new java.text.SimpleDateFormat("dd/MM yyyy, HH:mm", this.p);
                String v6_5 = v7_0.getString(this.h, "No update");
                double v7_4 = v0_41.format(java.util.Calendar.getInstance().getTime());
                i2.o0.c(v3_2).b();
                if ((p18) && ((!v6_5.contains("No update")) && (!v6_5.contains("failed")))) {
                    android.content.SharedPreferences$Editor v9_1 = v0_41.parse(v6_5);
                    c5.c v0_1 = v0_41.parse(v7_4);
                    if (v9_1 == null) {
                        return;
                    } else {
                        if (v0_1 != null) {
                            if (((v0_1.getTime() - v9_1.getTime()) / 60000) >= 1) {
                                if (!v6_5.contains("Not")) {
                                    v8.putString("lastLocationRefresh", v7_4);
                                    v8.apply();
                                    if ((e0.c.checkSelfPermission(v3_2, "android.permission.ACCESS_FINE_LOCATION") == 0) || (e0.c.checkSelfPermission(v3_2, "android.permission.ACCESS_COARSE_LOCATION") == 0)) {
                                        if (com.google.android.gms.common.GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(v3_2) == 0) {
                                            if (com.google.android.gms.common.GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(v3_2) == 0) {
                                                try {
                                                    this.a.getLastLocation().addOnCompleteListener(new i2.o(this, p18));
                                                } catch (c5.c v0_21) {
                                                    this.b(v0_21);
                                                }
                                            } else {
                                                android.widget.Toast.makeText(v3_2, 2131952462, 0).show();
                                                return;
                                            }
                                        } else {
                                            android.widget.Toast.makeText(v3_2, 2131952462, 0).show();
                                            v8.apply();
                                            return;
                                        }
                                    }
                                    return;
                                } else {
                                }
                            }
                            android.widget.Toast.makeText(v3_2, this.g, 0).show();
                            return;
                        } else {
                            return;
                        }
                    }
                }
            }
            return;
        } else {
            android.widget.Toast.makeText(v3_2, 2131952462, 0).show();
            return;
        }
    }

    public final void b(com.google.android.gms.tasks.RuntimeExecutionException p3)
    {
        if (((p3.getCause() instanceof com.google.android.gms.common.api.ApiException)) && (((com.google.android.gms.common.api.ApiException) p3.getCause()).getStatusCode() == 16)) {
            android.widget.Toast.makeText(this.n, 2131952462, 0).show();
        }
        return;
    }

    public final void c(android.location.Location p17, boolean p18)
    {
        i2.q v0 = this;
        this.b = p17.getLatitude();
        this.c = p17.getLongitude();
        this.d();
        this.o.f(this.b, this.c, this.m);
        this.o.c(v0.b, v0.c, (p18 ^ 1), v0.q);
        return;
    }

    public final void d()
    {
        java.util.Locale v2 = this.p;
        android.content.SharedPreferences$Editor v3 = this.m;
        v3.putFloat(this.d, Float.parseFloat(new java.text.SimpleDateFormat("dd", v2).format(java.util.Calendar.getInstance().getTime())));
        v3.putString("locationUpdateTime", new java.text.SimpleDateFormat("dd/MM yyyy, HH:mm", v2).format(java.util.Calendar.getInstance().getTime()));
        v3.putString(this.f, new java.text.SimpleDateFormat("dd/MM yyyy, HH:mm", v2).format(java.util.Calendar.getInstance().getTime()));
        v3.apply();
        return;
    }
}
