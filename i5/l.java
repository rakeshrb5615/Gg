package i5;
public final class l implements i5.c {
    public static final java.nio.charset.Charset c;
    public final java.io.File a;
    public i5.k b;

    static l()
    {
        i5.l.c = java.nio.charset.Charset.forName("UTF-8");
        return;
    }

    public l(java.io.File p1)
    {
        this.a = p1;
        return;
    }

    public final void a()
    {
        g5.g.b(this.b, "There was a problem closing the Crashlytics log file.");
        this.b = 0;
        return;
    }

    public final String b()
    {
        h.f v4_3;
        if (this.a.exists()) {
            this.c();
            String v0_7 = this.b;
            if (v0_7 != null) {
                byte v3_0 = new int[] {0});
                String v0_2 = new byte[v0_7.C()];
                try {
                    this.b.i(new i5.e(v0_2, v3_0));
                } catch (h.f v4_1) {
                    android.util.Log.e("FirebaseCrashlytics", "A problem occurred while reading the Crashlytics log file.", v4_1);
                }
                v4_3 = new h.f(v0_2, v3_0[0], 2);
            } else {
                v4_3 = 0;
            }
        }
        byte v3_2;
        if (v4_3 != null) {
            String v0_4 = v4_3.b;
            v3_2 = new byte[v0_4];
            System.arraycopy(((byte[]) v4_3.c), 0, v3_2, 0, v0_4);
        } else {
            v3_2 = 0;
        }
        if (v3_2 == 0) {
            return 0;
        } else {
            return new String(v3_2, i5.l.c);
        }
    }

    public final void c()
    {
        String v0_0 = this.a;
        if (this.b == null) {
            try {
                this.b = new i5.k(v0_0);
                return;
            } catch (java.io.IOException v1_3) {
                String v2_0 = new StringBuilder("Could not open log file: ");
                v2_0.append(v0_0);
                android.util.Log.e("FirebaseCrashlytics", v2_0.toString(), v1_3);
            }
        }
        return;
    }

    public final void g(long p5, String p7)
    {
        this.c();
        if (this.b != null) {
            if (p7 == null) {
                p7 = "null";
            }
            if (p7.length() > 16384) {
                StringBuilder v2_1 = new StringBuilder("...");
                v2_1.append(p7.substring((p7.length() - 16384)));
                p7 = v2_1.toString();
            }
            this.b.c(String.format(java.util.Locale.US, "%d %s%n", new Object[] {Long.valueOf(p5), p7.replaceAll("\r", " ").replaceAll("\n", " ")})).getBytes(i5.l.c));
            while ((!this.b.s()) && (this.b.C() > 65536)) {
                this.b.z();
            }
        }
        return;
    }
}
