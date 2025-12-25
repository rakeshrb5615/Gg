package c5;
public class c implements a3.a, e5.a, j2.i, o5.e, p5.a, t1.a, x5.a, y1.b {
    public static c5.c a;
    public static c5.c b;
    public static final synthetic c5.c c;

    public static synthetic c()
    {
        c5.c.c = new c5.c();
        return;
    }

    public c(android.view.View p1)
    {
        return;
    }

    public static final void e(x8.d p8)
    {
        if (x8.d.i == null) {
            x8.d.i = new x8.d();
            h.f v0_6 = new x8.c("Okio Watchdog");
            v0_6.setDaemon(1);
            v0_6.start();
        }
        long v2_0 = System.nanoTime();
        x8.d[] v4_0 = p8.c;
        h.f v0_1 = p8.a;
        int v6_1 = v4_0 cmp 0;
        if ((v6_1 == 0) || (v0_1 == null)) {
            if (v6_1 == 0) {
                if (v0_1 == null) {
                    throw new AssertionError();
                } else {
                    p8.g = p8.c();
                }
            } else {
                p8.g = (v2_0 + v4_0);
            }
        } else {
            p8.g = (Math.min(v4_0, (p8.c() - v2_0)) + v2_0);
        }
        h.f v0_2 = x8.d.h;
        long v2_4 = (v0_2.b + 1);
        v0_2.b = v2_4;
        x8.d[] v3_1 = ((x8.d[]) v0_2.c);
        if (v2_4 == v3_1.length) {
            x8.d[] v4_5 = new x8.d[(v2_4 * 2)];
            i7.h.a0(v3_1, 0, v4_5, 0, 14);
            v0_2.c = v4_5;
        }
        v0_2.e(v2_4, p8);
        if (p8.f == 1) {
            x8.d.k.signal();
        }
        return;
    }

    public static final boolean k(x8.y p5)
    {
        x8.j v0_0 = p5.a;
        int v1_0 = x8.j.k(v0_0, y8.c.a);
        if (v1_0 == -1) {
            v1_0 = x8.j.k(p5.a, y8.c.b);
        }
        if (v1_0 == -1) {
            if ((p5.d() != null) && (v0_0.d() == 2)) {
                v0_0 = x8.j.d;
            }
        } else {
            v0_0 = x8.j.p(v0_0, (v1_0 + 1), 0, 2);
        }
        return (b8.p.l0(v0_0.r(), ".class", 1) ^ 1);
    }

    public static x8.d l()
    {
        x8.d v0_0 = x8.d.h;
        java.util.concurrent.TimeUnit v1_4 = ((x8.d[]) v0_0.c)[1];
        if (v1_4 != null) {
            long v6_0 = (v1_4.g - System.nanoTime());
            if (v6_0 <= 0) {
                v0_0.g(v1_4);
                v1_4.e = 2;
                return v1_4;
            } else {
                x8.d.k.await(v6_0, java.util.concurrent.TimeUnit.NANOSECONDS);
                return 0;
            }
        } else {
            long v4_1 = System.nanoTime();
            x8.d.k.await(x8.d.l, java.util.concurrent.TimeUnit.MILLISECONDS);
            if ((((x8.d[]) v0_0.c)[1] != null) || ((System.nanoTime() - v4_1) < x8.d.m)) {
                return 0;
            } else {
                return x8.d.i;
            }
        }
    }

    public static o5.c m(c5.c p10)
    {
        return new o5.c((System.currentTimeMillis() + ((long) 3600000)), new o5.b(8), new o5.a(1, 0, 0), 4621819117588971520, 4608083138725491507, 60);
    }

    public void a()
    {
        return;
    }

    public long b()
    {
        return System.currentTimeMillis();
    }

    public o5.c c(c5.c p1, org.json.JSONObject p2)
    {
        return c5.c.m(p1);
    }

    public CharSequence d(androidx.preference.Preference p3)
    {
        if (!android.text.TextUtils.isEmpty(0)) {
            return 0;
        } else {
            return ((androidx.preference.EditTextPreference) p3).a.getString(2131952196);
        }
    }

    public StackTraceElement[] f(StackTraceElement[] p4)
    {
        if (p4.length > 1024) {
            StackTraceElement[] v0_1 = new StackTraceElement[1024];
            System.arraycopy(p4, 0, v0_1, 0, 512);
            System.arraycopy(p4, (p4.length - 512), v0_1, 512, 512);
            return v0_1;
        } else {
            return p4;
        }
    }

    public void g(android.os.Bundle p3)
    {
        if (android.util.Log.isLoggable("FirebaseCrashlytics", 3)) {
            android.util.Log.d("FirebaseCrashlytics", "Skipping logging Crashlytics event to Firebase, no Firebase Analytics", 0);
        }
        return;
    }

    public void h(String p1)
    {
        return;
    }

    public void i()
    {
        android.util.Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
        return;
    }

    public void j(int p4, Object p5)
    {
        String v0;
        switch (p4) {
            case 1:
                v0 = "RESULT_INSTALL_SUCCESS";
                break;
            case 2:
                v0 = "RESULT_ALREADY_INSTALLED";
                break;
            case 3:
                v0 = "RESULT_UNSUPPORTED_ART_VERSION";
                break;
            case 4:
                v0 = "RESULT_NOT_WRITABLE";
                break;
            case 5:
                v0 = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                break;
            case 6:
                v0 = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                break;
            case 7:
                v0 = "RESULT_IO_EXCEPTION";
                break;
            case 8:
                v0 = "RESULT_PARSE_EXCEPTION";
                break;
            case 9:
            default:
                v0 = "";
                break;
            case 10:
                v0 = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                break;
            case 11:
                v0 = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                break;
        }
        if ((p4 == 6) || ((p4 == 7) || (p4 == 8))) {
            android.util.Log.e("ProfileInstaller", v0, ((Throwable) p5));
            return;
        } else {
            android.util.Log.d("ProfileInstaller", v0);
            return;
        }
    }
}
