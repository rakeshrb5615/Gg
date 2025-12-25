package q4;
public final class f {
    public static final Object k;
    public static final r.e l;
    public final android.content.Context a;
    public final String b;
    public final q4.j c;
    public final a5.j d;
    public final java.util.concurrent.atomic.AtomicBoolean e;
    public final java.util.concurrent.atomic.AtomicBoolean f;
    public final a5.r g;
    public final c6.b h;
    public final java.util.concurrent.CopyOnWriteArrayList i;
    public final java.util.concurrent.CopyOnWriteArrayList j;

    static f()
    {
        q4.f.k = new Object();
        q4.f.l = new r.e(0);
        return;
    }

    public f(android.content.Context p9, String p10, q4.j p11)
    {
        this.e = new java.util.concurrent.atomic.AtomicBoolean(0);
        this.f = new java.util.concurrent.atomic.AtomicBoolean();
        this.i = new java.util.concurrent.CopyOnWriteArrayList();
        this.j = new java.util.concurrent.CopyOnWriteArrayList();
        this.a = ((android.content.Context) com.google.android.gms.common.internal.Preconditions.checkNotNull(p9));
        this.b = com.google.android.gms.common.internal.Preconditions.checkNotEmpty(p10);
        this.c = ((q4.j) com.google.android.gms.common.internal.Preconditions.checkNotNull(p11));
        android.os.Trace.beginSection("Firebase");
        android.os.Trace.beginSection("ComponentDiscovery");
        Class v3_17 = new java.util.ArrayList();
        Class[] v4_9 = 0;
        try {
            String v5_1 = p9.getPackageManager();
        } catch (android.content.pm.PackageManager$NameNotFoundException) {
            android.util.Log.w("ComponentDiscovery", "Application info not found.");
            a5.h v0_12;
            if (v4_9 != null) {
                v0_12 = new java.util.ArrayList();
                java.util.ArrayList v2_8 = v4_9.keySet().iterator();
                while (v2_8.hasNext()) {
                    String v5_7 = ((String) v2_8.next());
                    if (("com.google.firebase.components.ComponentRegistrar".equals(v4_9.get(v5_7))) && (v5_7.startsWith("com.google.firebase.components:"))) {
                        v0_12.add(v5_7.substring(31));
                    }
                }
            } else {
                android.util.Log.w("ComponentDiscovery", "Could not retrieve metadata, returning empty list of registrars.");
                v0_12 = java.util.Collections.EMPTY_LIST;
            }
            a5.h v0_15 = v0_12.iterator();
            while (v0_15.hasNext()) {
                v3_17.add(new a5.e(((String) v0_15.next()), 0));
            }
            android.os.Trace.endSection();
            android.os.Trace.beginSection("Runtime");
            a5.h v0_19 = new java.util.ArrayList();
            java.util.ArrayList v2_12 = new java.util.ArrayList();
            v0_19.addAll(v3_17);
            v0_19.add(new a5.e(new com.google.firebase.FirebaseCommonRegistrar(), 1));
            v0_19.add(new a5.e(new com.google.firebase.concurrent.ExecutorsRegistrar(), 1));
            Class[] v4_4 = new Class[0];
            v2_12.add(a5.c.c(p9, android.content.Context, v4_4));
            Class[] v4_5 = new Class[0];
            v2_12.add(a5.c.c(this, q4.f, v4_5));
            Class[] v4_6 = new Class[0];
            v2_12.add(a5.c.c(p11, q4.j, v4_6));
            a5.r v11_3 = new a6.e();
            if ((((android.os.UserManager) p9.getSystemService(android.os.UserManager)).isUserUnlocked()) && (com.google.firebase.provider.FirebaseInitProvider.b.get())) {
                Class[] v1_0 = new Class[0];
                v2_12.add(a5.c.c(com.google.firebase.provider.FirebaseInitProvider.a, q4.a, v1_0));
            }
            java.util.concurrent.CopyOnWriteArrayList v10_3 = new a5.j(v0_19, v2_12, v11_3);
            this.d = v10_3;
            android.os.Trace.endSection();
            this.g = new a5.r(new a5.h(2, this, p9));
            this.h = v10_3.f(a6.d);
            q4.c v9_4 = new q4.c(this);
            this.a();
            if (this.e.get()) {
                com.google.android.gms.common.api.internal.BackgroundDetector.getInstance().isInBackground();
            }
            this.i.add(v9_4);
            android.os.Trace.endSection();
            return;
        }
        if (v5_1 != null) {
            String v5_2 = v5_1.getServiceInfo(new android.content.ComponentName(p9, com.google.firebase.components.ComponentDiscoveryService), 128);
            if (v5_2 != null) {
                v4_9 = v5_2.metaData;
            } else {
                String v5_4 = new StringBuilder();
                v5_4.append(com.google.firebase.components.ComponentDiscoveryService);
                v5_4.append(" has no service info.");
                android.util.Log.w("ComponentDiscovery", v5_4.toString());
            }
        } else {
            android.util.Log.w("ComponentDiscovery", "Context has no PackageManager.");
        }
    }

    public static java.util.ArrayList c()
    {
        Throwable v0_1 = new java.util.ArrayList();
        java.util.Iterator v2_3 = ((r.d) q4.f.l.values()).iterator();
        while (v2_3.hasNext()) {
            String v3_2 = ((q4.f) v2_3.next());
            v3_2.a();
            v0_1.add(v3_2.b);
        }
        java.util.Collections.sort(v0_1);
        return v0_1;
    }

    public static q4.f d()
    {
        IllegalStateException v2_3 = ((q4.f) q4.f.l.get("[DEFAULT]"));
        if (v2_3 == null) {
            StringBuilder v3_0 = new StringBuilder("Default FirebaseApp is not initialized in this process ");
            v3_0.append(com.google.android.gms.common.util.ProcessUtils.getMyProcessName());
            v3_0.append(". Make sure to call FirebaseApp.initializeApp(Context) first.");
            throw new IllegalStateException(v3_0.toString());
        } else {
            ((a6.d) v2_3.h.get()).a();
            return v2_3;
        }
    }

    public static q4.f e(String p5)
    {
        StringBuilder v3_5 = ((q4.f) q4.f.l.get(p5.trim()));
        if (v3_5 == null) {
            String v1_3;
            StringBuilder v3_0 = q4.f.c();
            if (!v3_0.isEmpty()) {
                StringBuilder v4_2 = new StringBuilder("Available app names: ");
                v4_2.append(android.text.TextUtils.join(", ", v3_0));
                v1_3 = v4_2.toString();
            } else {
                v1_3 = "";
            }
            StringBuilder v3_2 = new StringBuilder("FirebaseApp with name ");
            v3_2.append(p5);
            v3_2.append(" doesn\'t exist. ");
            v3_2.append(v1_3);
            throw new IllegalStateException(v3_2.toString());
        } else {
            ((a6.d) v3_5.h.get()).a();
            return v3_5;
        }
    }

    public static q4.f h(android.content.Context p3)
    {
        if (!q4.f.l.containsKey("[DEFAULT]")) {
            String v1_3 = q4.j.a(p3);
            if (v1_3 != null) {
                return q4.f.i(p3, v1_3);
            } else {
                android.util.Log.w("FirebaseApp", "Default FirebaseApp failed to initialize because no default options were found. This usually means that com.google.gms:google-services was not applied to your gradle project.");
                return 0;
            }
        } else {
            return q4.f.d();
        }
    }

    public static q4.f i(android.content.Context p6, q4.j p7)
    {
        if ((com.google.android.gms.common.util.PlatformVersion.isAtLeastIceCreamSandwich()) && ((p6.getApplicationContext() instanceof android.app.Application))) {
            com.google.android.gms.common.api.internal.BackgroundDetector v1_1 = ((android.app.Application) p6.getApplicationContext());
            r.e v2_0 = q4.d.a;
            if (v2_0.get() == null) {
                q4.f v3_2 = new q4.d();
                while (!v2_0.compareAndSet(0, v3_2)) {
                    if (v2_0.get() != null) {
                    }
                }
                com.google.android.gms.common.api.internal.BackgroundDetector.initialize(v1_1);
                com.google.android.gms.common.api.internal.BackgroundDetector.getInstance().addListener(v3_2);
            }
        }
        if (p6.getApplicationContext() != null) {
            p6 = p6.getApplicationContext();
        }
        r.e v2_1 = q4.f.l;
        q4.f v3_4 = (v2_1.containsKey("[DEFAULT]") ^ 1);
        Object v4_4 = new StringBuilder();
        v4_4.append("FirebaseApp name ");
        v4_4.append("[DEFAULT]");
        v4_4.append(" already exists!");
        com.google.android.gms.common.internal.Preconditions.checkState(v3_4, v4_4.toString());
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p6, "Application context cannot be null.");
        q4.f v3_7 = new q4.f(p6, "[DEFAULT]", p7);
        v2_1.put("[DEFAULT]", v3_7);
        v3_7.g();
        return v3_7;
    }

    public final void a()
    {
        com.google.android.gms.common.internal.Preconditions.checkState((this.f.get() ^ 1), "FirebaseApp was deleted");
        return;
    }

    public final Object b(Class p2)
    {
        this.a();
        return this.d.a(p2);
    }

    public final boolean equals(Object p2)
    {
        if ((p2 instanceof q4.f)) {
            ((q4.f) p2).a();
            return this.b.equals(((q4.f) p2).b);
        } else {
            return 0;
        }
    }

    public final String f()
    {
        String v0_1 = new StringBuilder();
        this.a();
        v0_1.append(com.google.android.gms.common.util.Base64Utils.encodeUrlSafeNoPadding(this.b.getBytes(java.nio.charset.Charset.defaultCharset())));
        v0_1.append("+");
        this.a();
        v0_1.append(com.google.android.gms.common.util.Base64Utils.encodeUrlSafeNoPadding(this.c.b.getBytes(java.nio.charset.Charset.defaultCharset())));
        return v0_1.toString();
    }

    public final void g()
    {
        if (((android.os.UserManager) this.a.getSystemService(android.os.UserManager)).isUserUnlocked()) {
            String v2_1 = new StringBuilder("Device unlocked: initializing all Firebase APIs for app ");
            this.a();
            v2_1.append(this.b);
            android.util.Log.i("FirebaseApp", v2_1.toString());
            a6.d v0_1 = this.d;
            this.a();
            String v2_4 = "[DEFAULT]".equals(this.b);
            java.util.HashMap v3_3 = v0_1.f;
            Object v4_0 = Boolean.valueOf(v2_4);
            while (!v3_3.compareAndSet(0, v4_0)) {
                if (v3_3.get() != null) {
                }
                ((a6.d) this.h.get()).a();
                return;
            }
            v0_1.i(new java.util.HashMap(v0_1.a), v2_4);
            ((a6.d) this.h.get()).a();
            return;
        } else {
            String v2_6 = new StringBuilder("Device in Direct Boot Mode: postponing initialization of Firebase APIs for app ");
            this.a();
            v2_6.append(this.b);
            android.util.Log.i("FirebaseApp", v2_6.toString());
            a6.d v0_8 = this.a;
            String v2_8 = q4.e.b;
            if (v2_8.get() == null) {
                java.util.HashMap v3_9 = new q4.e(v0_8);
                while (!v2_8.compareAndSet(0, v3_9)) {
                    if (v2_8.get() != null) {
                    }
                }
                v0_8.registerReceiver(v3_9, new android.content.IntentFilter("android.intent.action.USER_UNLOCKED"));
                return;
            }
            return;
        }
    }

    public final int hashCode()
    {
        return this.b.hashCode();
    }

    public final boolean j()
    {
        this.a();
        return ((h6.a) this.g.get()).a;
    }

    public final String toString()
    {
        return com.google.android.gms.common.internal.Objects.toStringHelper(this).add("name", this.b).add("options", this.c).toString();
    }
}
