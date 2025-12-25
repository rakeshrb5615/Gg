package m5;
public final class a {
    public static final java.nio.charset.Charset e;
    public static final int f;
    public static final k5.a g;
    public static final g5.i h;
    public static final g5.h i;
    public final java.util.concurrent.atomic.AtomicInteger a;
    public final m5.c b;
    public final o5.d c;
    public final g5.k d;

    static a()
    {
        m5.a.e = java.nio.charset.Charset.forName("UTF-8");
        m5.a.f = 15;
        m5.a.g = new k5.a();
        m5.a.h = new g5.i(2);
        m5.a.i = new g5.h(2);
        return;
    }

    public a(m5.c p3, o5.d p4, g5.k p5)
    {
        this.a = new java.util.concurrent.atomic.AtomicInteger(0);
        this.b = p3;
        this.c = p4;
        this.d = p5;
        return;
    }

    public static void a(java.util.List p1)
    {
        java.util.Iterator v1_1 = p1.iterator();
        while (v1_1.hasNext()) {
            ((java.io.File) v1_1.next()).delete();
        }
        return;
    }

    public static String e(java.io.File p4)
    {
        Throwable v0_1 = new byte[8192];
        java.nio.charset.Charset v1_2 = new java.io.ByteArrayOutputStream();
        java.io.FileInputStream v2_1 = new java.io.FileInputStream(p4);
        while(true) {
            String v4_3 = v2_1.read(v0_1);
            if (v4_3 <= null) {
                break;
            }
            v1_2.write(v0_1, 0, v4_3);
        }
        String v4_1 = new String(v1_2.toByteArray(), m5.a.e);
        v2_1.close();
        return v4_1;
    }

    public static void f(java.io.File p2, String p3)
    {
        java.io.OutputStreamWriter v0_1 = new java.io.OutputStreamWriter(new java.io.FileOutputStream(p2), m5.a.e);
        try {
            v0_1.write(p3);
            v0_1.close();
            return;
        } catch (Throwable v2_2) {
            try {
                v0_1.close();
            } catch (Throwable v3_1) {
                v2_2.addSuppressed(v3_1);
            }
            throw v2_2;
        }
    }

    public final java.util.ArrayList b()
    {
        java.util.ArrayList v0_1 = new java.util.ArrayList();
        java.util.List v1_1 = this.b;
        v0_1.addAll(m5.c.e(((java.io.File) v1_1.m).listFiles()));
        v0_1.addAll(m5.c.e(((java.io.File) v1_1.n).listFiles()));
        g5.i v2_4 = m5.a.h;
        java.util.Collections.sort(v0_1, v2_4);
        java.util.List v1_4 = m5.c.e(((java.io.File) v1_1.f).listFiles());
        java.util.Collections.sort(v1_4, v2_4);
        v0_1.addAll(v1_4);
        return v0_1;
    }

    public final java.util.NavigableSet c()
    {
        return new java.util.TreeSet(m5.c.e(((java.io.File) this.b.e).list())).descendingSet();
    }

    public final void d(j5.j2 p6, String p7, boolean p8)
    {
        java.io.File v8_1;
        java.io.File v0_0 = this.b;
        int v1_3 = this.c.b().a.a;
        m5.a.g.getClass();
        java.util.Iterator v6_1 = k5.a.a.q(p6);
        String vtmp7 = String.format(java.util.Locale.US, "%010d", new Object[] {Integer.valueOf(this.a.getAndIncrement())}));
        if (p8 == null) {
            v8_1 = "";
        } else {
            v8_1 = "_";
        }
        try {
            m5.a.f(v0_0.b(p7, v1.a.l("event", vtmp7, v8_1)), v6_1);
        } catch (java.util.Iterator v6_2) {
            java.io.File v8_5 = new StringBuilder("Could not persist event for session ");
            v8_5.append(p7);
            android.util.Log.w("FirebaseCrashlytics", v8_5.toString(), v6_2);
        }
        java.util.Iterator v6_4 = new g5.h(3);
        v0_0.getClass();
        java.io.File v8_9 = new java.io.File(((java.io.File) v0_0.e), p7);
        v8_9.mkdirs();
        java.util.Iterator v6_6 = m5.c.e(v8_9.listFiles(v6_4));
        java.util.Collections.sort(v6_6, new g5.i(3));
        int v7_3 = v6_6.size();
        java.util.Iterator v6_7 = v6_6.iterator();
        while (v6_7.hasNext()) {
            java.io.File v8_12 = v6_7.next();
            if (v7_3 <= v1_3) {
                break;
            }
            m5.c.d(((java.io.File) v8_12));
            v7_3--;
        }
        return;
    }
}
