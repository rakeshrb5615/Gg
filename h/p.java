package h;
public abstract class p {
    public static final h.n a;
    public static final int b;
    public static m0.h c;
    public static m0.h d;
    public static Boolean e;
    public static boolean f;
    public static final r.f m;
    public static final Object n;
    public static final Object o;

    static p()
    {
        h.p.a = new h.n(new h.o(0));
        h.p.b = -100;
        h.p.c = 0;
        h.p.d = 0;
        h.p.e = 0;
        h.p.f = 0;
        h.p.m = new r.f(0);
        h.p.n = new Object();
        h.p.o = new Object();
        return;
    }

    public static void a()
    {
        h.c0 v0_0 = h.p.m;
        v0_0.getClass();
        r.a v1_1 = new r.a(v0_0);
        while (v1_1.hasNext()) {
            h.c0 v0_3 = ((h.p) ((ref.WeakReference) v1_1.next()).get());
            if (v0_3 != null) {
                h.c0 v0_4 = ((h.c0) v0_3);
                h.n v2_0 = v0_4.q;
                if (h.p.g(v2_0)) {
                    h.k v3_1 = h.p.c;
                    if ((v3_1 != null) && (!v3_1.equals(h.p.d))) {
                        h.p.a.execute(new h.k(v2_0, 1));
                    }
                }
                v0_4.q(1, 1);
            }
        }
        return;
    }

    public static Object c()
    {
        Object v0_0 = h.p.m;
        v0_0.getClass();
        String v1_2 = new r.a(v0_0);
        while (v1_2.hasNext()) {
            Object v0_4 = ((h.p) ((ref.WeakReference) v1_2.next()).get());
            if (v0_4 != null) {
                Object v0_6 = ((h.c0) v0_4).q;
                if (v0_6 != null) {
                    return v0_6.getSystemService("locale");
                }
            }
        }
        return 0;
    }

    public static boolean g(android.content.Context p4)
    {
        if (h.p.e == null) {
            try {
                Boolean v4_2 = p4.getPackageManager().getServiceInfo(new android.content.ComponentName(p4, androidx.appcompat.app.AppLocalesMetadataHolderService), (h.i0.a() | 128)).metaData;
            } catch (android.content.pm.PackageManager$NameNotFoundException) {
                android.util.Log.d("AppCompatDelegate", "Checking for metadata for AppLocalesMetadataHolderService : Service not found");
                h.p.e = Boolean.FALSE;
            }
            if (v4_2 != null) {
                h.p.e = Boolean.valueOf(v4_2.getBoolean("autoStoreLocales"));
            }
        }
        return h.p.e.booleanValue();
    }

    public static void j(h.c0 p3)
    {
        h.p v1_0 = h.p.m;
        v1_0.getClass();
        r.a v2_1 = new r.a(v1_0);
        while (v2_1.hasNext()) {
            h.p v1_4 = ((h.p) ((ref.WeakReference) v2_1.next()).get());
            if ((v1_4 == p3) || (v1_4 == null)) {
                v2_1.remove();
            }
        }
        return;
    }

    public static void p(android.content.Context p3)
    {
        if (h.p.g(p3)) {
            if (android.os.Build$VERSION.SDK_INT < 33) {
                String v1_9 = h.p.c;
                if (v1_9 != null) {
                    if (!v1_9.equals(h.p.d)) {
                        String v1_1 = h.p.c;
                        h.p.d = v1_1;
                        d0.d.d(p3, v1_1.a.a.toLanguageTags());
                    }
                } else {
                    if (h.p.d == null) {
                        h.p.d = m0.h.a(d0.d.e(p3));
                    }
                    if (!h.p.d.b()) {
                        h.p.c = h.p.d;
                    } else {
                        return;
                    }
                }
                return;
            } else {
                if (!h.p.f) {
                    h.p.a.execute(new h.k(p3, 0));
                }
            }
        }
        return;
    }

    public abstract void d();

    public abstract void e();

    public abstract void h();

    public abstract void i();

    public abstract boolean k();

    public abstract void l();

    public abstract void m();

    public abstract void n();

    public abstract void o();
}
