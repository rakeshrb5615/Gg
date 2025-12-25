package d4;
public final class l implements g1.n {
    public final synthetic int a;
    public String b;

    public synthetic l()
    {
        this.a = 2;
        return;
    }

    public l(String p4, int p5)
    {
        this.a = p5;
        switch (p5) {
            case 3:
                String v5_8 = android.os.Process.myUid();
                int v0_1 = android.os.Process.myPid();
                StringBuilder v1_3 = new StringBuilder("UID: [");
                v1_3.append(v5_8);
                v1_3.append("]  PID: [");
                v1_3.append(v0_1);
                v1_3.append("] ");
                this.b = v1_3.toString().concat(p4);
                return;
            default:
                String v5_4 = android.os.Process.myUid();
                int v0_0 = android.os.Process.myPid();
                StringBuilder v1_1 = new StringBuilder("UID: [");
                v1_1.append(v5_4);
                v1_1.append("]  PID: [");
                v1_1.append(v0_0);
                v1_1.append("] ");
                this.b = v1_1.toString().concat(p4);
                return;
        }
    }

    public synthetic l(String p1, int p2, boolean p3)
    {
        this.a = p2;
        this.b = p1;
        return;
    }

    public l(String p1, c5.c p2)
    {
        this.a = 5;
        if (p1 == null) {
            throw new IllegalArgumentException("url must not be null.");
        } else {
            this.b = p1;
            return;
        }
    }

    public static void a(b8.g p2, o5.f p3)
    {
        String v0_0 = p3.a;
        if (v0_0 != null) {
            p2.n("X-CRASHLYTICS-GOOGLE-APP-ID", v0_0);
        }
        p2.n("X-CRASHLYTICS-API-CLIENT-TYPE", "android");
        p2.n("X-CRASHLYTICS-API-CLIENT-VERSION", "20.0.3");
        p2.n("Accept", "application/json");
        String v0_2 = p3.b;
        if (v0_2 != null) {
            p2.n("X-CRASHLYTICS-DEVICE-MODEL", v0_2);
        }
        String v0_3 = p3.c;
        if (v0_3 != null) {
            p2.n("X-CRASHLYTICS-OS-BUILD-VERSION", v0_3);
        }
        String v0_4 = p3.d;
        if (v0_4 != null) {
            p2.n("X-CRASHLYTICS-OS-DISPLAY-VERSION", v0_4);
        }
        String v3_3 = p3.e.c().a;
        if (v3_3 != null) {
            p2.n("X-CRASHLYTICS-INSTALLATION-ID", v3_3);
        }
        return;
    }

    public static java.util.HashMap b(o5.f p3)
    {
        java.util.HashMap v0_1 = new java.util.HashMap();
        v0_1.put("build_version", p3.h);
        v0_1.put("display_version", p3.g);
        v0_1.put("source", Integer.toString(p3.i));
        String v3_1 = p3.f;
        if (!android.text.TextUtils.isEmpty(v3_1)) {
            v0_1.put("instance", v3_1);
        }
        return v0_1;
    }

    public static varargs String i(String p4, String p5, Object[] p6)
    {
        if (p6.length > 0) {
            try {
                p5 = String.format(java.util.Locale.US, p5, p6);
            } catch (StringBuilder v0_5) {
                android.util.Log.e("PlayCore", "Unable to format ".concat(String.valueOf(p5)), v0_5);
                String v6_1 = android.text.TextUtils.join(", ", p6);
                StringBuilder v0_3 = new StringBuilder();
                v0_3.append(p5);
                v0_3.append(" [");
                v0_3.append(v6_1);
                v0_3.append("]");
                p5 = v0_3.toString();
            }
        }
        return g2.g.e(p4, " : ", p5);
    }

    public static varargs String j(String p3, String p4, Object[] p5)
    {
        if (p5.length > 0) {
            try {
                p4 = String.format(java.util.Locale.US, p4, p5);
            } catch (StringBuilder v0_5) {
                android.util.Log.e("PlayCore", "Unable to format ".concat(p4), v0_5);
                String v5_1 = android.text.TextUtils.join(", ", p5);
                StringBuilder v0_3 = new StringBuilder();
                v0_3.append(p4);
                v0_3.append(" [");
                v0_3.append(v5_1);
                v0_3.append("]");
                p4 = v0_3.toString();
            }
        }
        return g2.g.e(p3, " : ", p4);
    }

    public org.json.JSONObject c(h.f p7)
    {
        String v0_0 = this.b;
        String v1_0 = p7.b;
        String v2_6 = new StringBuilder("Settings response code was: ");
        v2_6.append(v1_0);
        d5.d v3_1 = d5.d.a;
        v3_1.c(v2_6.toString());
        if ((v1_0 != 200) && ((v1_0 != 201) && ((v1_0 != 202) && (v1_0 != 203)))) {
            String v7_2 = new StringBuilder("Settings request failed; (status: ");
            v7_2.append(v1_0);
            v7_2.append(") from ");
            v7_2.append(v0_0);
            String v7_3 = v7_2.toString();
            if (v3_1.a(6)) {
                android.util.Log.e("FirebaseCrashlytics", v7_3, 0);
            }
            return 0;
        } else {
            String v7_5 = ((String) p7.c);
            try {
                return new org.json.JSONObject(v7_5);
            } catch (String v1_4) {
                String v2_8 = new StringBuilder("Failed to parse settings JSON from ");
                v2_8.append(v0_0);
                v3_1.d(v2_8.toString(), v1_4);
                String v0_6 = new StringBuilder("Settings response ");
                v0_6.append(v7_5);
                v3_1.d(v0_6.toString(), 0);
                return 0;
            }
        }
    }

    public varargs void d(String p3, Object[] p4)
    {
        if (android.util.Log.isLoggable("PlayCore", 3)) {
            android.util.Log.d("PlayCore", d4.l.j(this.b, p3, p4));
        }
        return;
    }

    public boolean e(CharSequence p1, int p2, int p3, g1.u p4)
    {
        if (!android.text.TextUtils.equals(p1.subSequence(p2, p3), this.b)) {
            return 1;
        } else {
            p4.c = ((p4.c & 3) | 4);
            return 0;
        }
    }

    public varargs void f(android.os.RemoteException p3, String p4, Object[] p5)
    {
        if (android.util.Log.isLoggable("PlayCore", 6)) {
            android.util.Log.e("PlayCore", d4.l.j(this.b, p4, p5), p3);
        }
        return;
    }

    public varargs void g(String p3, Object[] p4)
    {
        if (android.util.Log.isLoggable("PlayCore", 4)) {
            android.util.Log.i("PlayCore", d4.l.i(this.b, p3, p4));
        }
        return;
    }

    public Object getResult()
    {
        return this;
    }

    public varargs void h(String p3, Object[] p4)
    {
        switch (this.a) {
            case 0:
                if (android.util.Log.isLoggable("PlayCore", 4)) {
                    android.util.Log.i("PlayCore", d4.l.j(this.b, p3, p4));
                }
                return;
            default:
                if (android.util.Log.isLoggable("PlayCore", 5)) {
                    android.util.Log.w("PlayCore", d4.l.i(this.b, p3, p4));
                }
                return;
        }
    }

    public String toString()
    {
        switch (this.a) {
            case 4:
                String v0_4 = new StringBuilder("<");
                v0_4.append(this.b);
                v0_4.append(62);
                return v0_4.toString();
            default:
                return super.toString();
        }
    }
}
