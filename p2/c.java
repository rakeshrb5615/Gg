package p2;
public final class c implements s2.e {
    public final j6.o a;
    public final android.net.ConnectivityManager b;
    public final android.content.Context c;
    public final java.net.URL d;
    public final a3.a e;
    public final a3.a f;
    public final int g;

    public c(android.content.Context p4, a3.a p5, a3.a p6)
    {
        String v0_1 = new v5.d();
        j6.o v1_4 = q2.c.a;
        v0_1.a(q2.w, v1_4);
        v0_1.a(q2.m, v1_4);
        j6.o v1_12 = q2.j.a;
        v0_1.a(q2.f0, v1_12);
        v0_1.a(q2.t, v1_12);
        j6.o v1_0 = q2.d.a;
        v0_1.a(q2.y, v1_0);
        v0_1.a(q2.n, v1_0);
        j6.o v1_1 = q2.b.a;
        v0_1.a(q2.a, v1_1);
        v0_1.a(q2.l, v1_1);
        j6.o v1_2 = q2.i.a;
        v0_1.a(q2.e0, v1_2);
        v0_1.a(q2.s, v1_2);
        j6.o v1_3 = q2.e.a;
        v0_1.a(q2.a0, v1_3);
        v0_1.a(q2.o, v1_3);
        j6.o v1_5 = q2.h.a;
        v0_1.a(q2.d0, v1_5);
        v0_1.a(q2.r, v1_5);
        j6.o v1_6 = q2.g.a;
        v0_1.a(q2.c0, v1_6);
        v0_1.a(q2.q, v1_6);
        j6.o v1_7 = q2.k.a;
        v0_1.a(q2.i0, v1_7);
        v0_1.a(q2.v, v1_7);
        j6.o v1_8 = q2.f.a;
        v0_1.a(q2.b0, v1_8);
        v0_1.a(q2.p, v1_8);
        v0_1.d = 1;
        this.a = new j6.o(v0_1, 19);
        this.c = p4;
        this.b = ((android.net.ConnectivityManager) p4.getSystemService("connectivity"));
        this.d = p2.c.b(p2.a.c);
        this.e = p6;
        this.f = p5;
        this.g = 130000;
        return;
    }

    public static java.net.URL b(String p3)
    {
        try {
            return new java.net.URL(p3);
        } catch (java.net.MalformedURLException v0_2) {
            throw new IllegalArgumentException(g2.g.l("Invalid url: ", p3), v0_2);
        }
    }

    public final r2.i a(r2.i p7)
    {
        String v0_11 = this.b.getActiveNetworkInfo();
        r2.i v7_3 = p7.c();
        String v2_10 = v7_3.f;
        if (v2_10 == null) {
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        } else {
            v2_10.put("sdk-version", String.valueOf(android.os.Build$VERSION.SDK_INT));
            v7_3.a("model", android.os.Build.MODEL);
            v7_3.a("hardware", android.os.Build.HARDWARE);
            v7_3.a("device", android.os.Build.DEVICE);
            v7_3.a("product", android.os.Build.PRODUCT);
            v7_3.a("os-uild", android.os.Build.ID);
            v7_3.a("manufacturer", android.os.Build.MANUFACTURER);
            v7_3.a("fingerprint", android.os.Build.FINGERPRINT);
            java.util.Calendar.getInstance();
            String v1_11 = java.util.TimeZone.getDefault().getOffset(java.util.Calendar.getInstance().getTimeInMillis());
            String v4_3 = v7_3.f;
            if (v4_3 == null) {
                throw new IllegalStateException("Property \"autoMetadata\" has not been set");
            } else {
                String v2_11;
                v4_3.put("tz-offset", String.valueOf(((long) (v1_11 / 1000))));
                if (v0_11 != null) {
                    v2_11 = v0_11.getType();
                } else {
                    v2_11 = -1;
                }
                String v4_4 = v7_3.f;
                if (v4_4 == null) {
                    throw new IllegalStateException("Property \"autoMetadata\" has not been set");
                } else {
                    String v0_12;
                    v4_4.put("net-type", String.valueOf(v2_11));
                    if (v0_11 != null) {
                        v0_12 = v0_11.getSubtype();
                        if (v0_12 != -1) {
                            if (((q2.g0) q2.g0.a.get(v0_12)) == null) {
                                v0_12 = 0;
                            }
                        } else {
                            v0_12 = 100;
                        }
                    }
                    String v4_8 = v7_3.f;
                    if (v4_8 == null) {
                        throw new IllegalStateException("Property \"autoMetadata\" has not been set");
                    } else {
                        v4_8.put("mobile-subtype", String.valueOf(v0_12));
                        v7_3.a("country", java.util.Locale.getDefault().getCountry());
                        v7_3.a("locale", java.util.Locale.getDefault().getLanguage());
                        String v3_1 = this.c;
                        String v0_6 = ((android.telephony.TelephonyManager) v3_1.getSystemService("phone")).getSimOperator();
                        if (v0_6 == null) {
                            v0_6 = "";
                        }
                        v7_3.a("mcc_mnc", v0_6);
                        try {
                            String v1_0 = v3_1.getPackageManager().getPackageInfo(v3_1.getPackageName(), 0).versionCode;
                        } catch (String v0_9) {
                            c4.b.w(v0_9, "CctTransportBackend", "Unable to find version code for package");
                        }
                        v7_3.a("application_build", Integer.toString(v1_0));
                        return v7_3.b();
                    }
                }
            }
        }
    }
}
