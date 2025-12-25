package m5;
public final class c implements t6.b, t2.b {
    public final synthetic int a;
    public Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object m;
    public final Object n;

    public c(android.content.Context p5)
    {
        String v0_1;
        this.a = 0;
        String v0_10 = ((j5.z0) d5.e.a.b(p5)).a;
        this.b = v0_10;
        java.io.File v5_1 = p5.getFilesDir();
        this.c = v5_1;
        if (v0_10.isEmpty()) {
            v0_1 = ".com.google.firebase.crashlytics.files.v1";
        } else {
            String v0_2;
            java.io.File v1_2 = new StringBuilder(".crashlytics.v3");
            v1_2.append(java.io.File.separator);
            if (v0_10.length() <= 40) {
                v0_2 = v0_10.replaceAll("[^a-zA-Z0-9.]", "_");
            } else {
                v0_2 = g5.g.h(v0_10);
            }
            v1_2.append(v0_2);
            v0_1 = v1_2.toString();
        }
        java.io.File v1_4 = new java.io.File(v5_1, v0_1);
        m5.c.c(v1_4);
        this.d = v1_4;
        java.io.File v5_3 = new java.io.File(v1_4, "open-sessions");
        m5.c.c(v5_3);
        this.e = v5_3;
        java.io.File v5_5 = new java.io.File(v1_4, "reports");
        m5.c.c(v5_5);
        this.f = v5_5;
        java.io.File v5_7 = new java.io.File(v1_4, "priority-reports");
        m5.c.c(v5_7);
        this.m = v5_7;
        java.io.File v5_9 = new java.io.File(v1_4, "native-reports");
        m5.c.c(v5_9);
        this.n = v5_9;
        return;
    }

    public synthetic c(g7.a p1, g7.a p2, g7.a p3, g7.a p4, g7.a p5, g7.a p6, g7.a p7, int p8)
    {
        this.a = p8;
        this.b = p1;
        this.c = p2;
        this.d = p3;
        this.e = p4;
        this.f = p5;
        this.m = p6;
        this.n = p7;
        return;
    }

    public c(String p4, m5.c p5, h5.f p6)
    {
        this.a = 1;
        this.e = new i5.n(this, 0);
        this.f = new i5.n(this, 1);
        this.m = new h.f(3);
        this.n = new java.util.concurrent.atomic.AtomicMarkableReference(0, 0);
        this.b = p4;
        this.c = new i5.g(p5);
        this.d = p6;
        return;
    }

    public static declared_synchronized void c(java.io.File p6)
    {
        if (p6.exists()) {
            if (!p6.isDirectory()) {
                String v3_1 = new StringBuilder("Unexpected non-directory file: ");
                v3_1.append(p6);
                v3_1.append("; deleting file and creating new directory.");
                StringBuilder v1_2 = v3_1.toString();
                if (android.util.Log.isLoggable("FirebaseCrashlytics", 3)) {
                    android.util.Log.d("FirebaseCrashlytics", v1_2, 0);
                }
                p6.delete();
            } else {
                return;
            }
        }
        if (!p6.mkdirs()) {
            StringBuilder v1_5 = new StringBuilder("Could not create Crashlytics-specific directory: ");
            v1_5.append(p6);
            android.util.Log.e("FirebaseCrashlytics", v1_5.toString(), 0);
        }
        return;
    }

    public static boolean d(java.io.File p4)
    {
        java.io.File[] v0 = p4.listFiles();
        if (v0 != null) {
            int v1 = v0.length;
            int v2 = 0;
            while (v2 < v1) {
                m5.c.d(v0[v2]);
                v2++;
            }
        }
        return p4.delete();
    }

    public static java.util.List e(Object[] p0)
    {
        if (p0 != null) {
            return java.util.Arrays.asList(p0);
        } else {
            return java.util.Collections.EMPTY_LIST;
        }
    }

    public void a(String p3)
    {
        int v0_5 = new java.io.File(((java.io.File) this.c), p3);
        if ((v0_5.exists()) && (m5.c.d(v0_5))) {
            String v3_2 = new StringBuilder("Deleted previous Crashlytics file system: ");
            v3_2.append(v0_5.getPath());
            String v3_3 = v3_2.toString();
            if (android.util.Log.isLoggable("FirebaseCrashlytics", 3)) {
                android.util.Log.d("FirebaseCrashlytics", v3_3, 0);
            }
        }
        return;
    }

    public java.io.File b(String p4, String p5)
    {
        java.io.File v1_1 = new java.io.File(((java.io.File) this.e), p4);
        v1_1.mkdirs();
        return new java.io.File(v1_1, p5);
    }

    public void f(String p4)
    {
        h5.c v0_1 = ((i5.n) this.f);
        if (((i5.d) ((java.util.concurrent.atomic.AtomicMarkableReference) v0_1.b).getReference()).b(p4)) {
            androidx.lifecycle.g0 v4_2 = ((java.util.concurrent.atomic.AtomicMarkableReference) v0_1.b);
            v4_2.set(((i5.d) v4_2.getReference()), 1);
            androidx.lifecycle.g0 v4_4 = new androidx.lifecycle.g0(v0_1, 8);
            java.util.concurrent.atomic.AtomicReference v1_5 = ((java.util.concurrent.atomic.AtomicReference) v0_1.c);
            while (!v1_5.compareAndSet(0, v4_4)) {
                if (v1_5.get() != null) {
                    return;
                }
            }
            ((h5.f) ((m5.c) v0_1.d).d).b.a(v4_4);
            return;
        } else {
            return;
        }
    }

    public Object get()
    {
        switch (this.a) {
            case 2:
                return new r6.c1(((u6.k) ((g7.a) this.b).get()), ((r6.t0) ((g7.a) this.c).get()), ((r6.p0) ((g7.a) this.d).get()), ((r6.g1) ((g7.a) this.e).get()), ((a1.h) ((g7.a) this.f).get()), ((r6.c0) ((t6.c) this.m).get()), ((l7.h) ((g7.a) this.n).get()));
            default:
                Object v0_23 = ((android.content.Context) ((g7.a) this.b).get());
                r6.c1 v1_5 = ((s2.d) ((g7.a) this.c).get());
                u6.k v2_4 = ((y2.d) ((g7.a) this.d).get());
                r6.t0 v3_5 = ((b8.g) ((b8.g) this.e).get());
                r6.p0 v4_5 = ((java.util.concurrent.Executor) ((g7.a) this.f).get());
                r6.g1 v5_5 = ((z2.c) ((g7.a) this.m).get());
                a1.h v6_3 = new c5.c();
                r6.c0 v7_3 = new a6.e();
                l7.h v8_5 = ((y2.c) ((g7.a) this.n).get());
                o5.d v9_1 = new o5.d();
                v9_1.a = v0_23;
                v9_1.b = v1_5;
                v9_1.c = v2_4;
                v9_1.d = v3_5;
                v9_1.e = v4_5;
                v9_1.f = v5_5;
                v9_1.g = v6_3;
                v9_1.h = v7_3;
                v9_1.i = v8_5;
                return v9_1;
        }
    }
}
