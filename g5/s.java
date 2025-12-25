package g5;
public final class s {
    public final android.content.Context a;
    public final g5.v b;
    public final k2.c c;
    public final long d;
    public k2.c e;
    public k2.c f;
    public g5.n g;
    public final g5.y h;
    public final m5.c i;
    public final c5.a j;
    public final c5.a k;
    public final g5.k l;
    public final d5.b m;
    public final l6.c n;
    public final h5.f o;

    public s(q4.f p1, g5.y p2, d5.b p3, g5.v p4, c5.a p5, c5.a p6, m5.c p7, g5.k p8, l6.c p9, h5.f p10)
    {
        this.b = p4;
        p1.a();
        this.a = p1.a;
        this.h = p2;
        this.m = p3;
        this.j = p5;
        this.k = p6;
        this.i = p7;
        this.l = p8;
        this.n = p9;
        this.o = p10;
        this.d = System.currentTimeMillis();
        this.c = new k2.c(17);
        return;
    }

    public final void a(o5.d p5)
    {
        h5.f.a();
        h5.f.a();
        this.e.k();
        if (android.util.Log.isLoggable("FirebaseCrashlytics", 2)) {
            android.util.Log.v("FirebaseCrashlytics", "Initialization marker file was created.", 0);
        }
        this.j.b(new g5.q(this));
        this.g.f();
        if (!p5.b().b.a) {
            if (android.util.Log.isLoggable("FirebaseCrashlytics", 3)) {
                android.util.Log.d("FirebaseCrashlytics", "Collection of crash reports disabled in Crashlytics settings.", 0);
            }
            throw new RuntimeException("Collection of crash reports disabled in Crashlytics settings.");
        } else {
            if (!this.g.d(p5)) {
                android.util.Log.w("FirebaseCrashlytics", "Previous sessions could not be finalized.", 0);
            }
            this.g.g(((com.google.android.gms.tasks.TaskCompletionSource) ((java.util.concurrent.atomic.AtomicReference) p5.i).get()).getTask());
            this.c();
            return;
        }
    }

    public final void b(o5.d p5)
    {
        Thread v5_5 = this.o.a.a.submit(new g5.o(this, p5, 1));
        if (android.util.Log.isLoggable("FirebaseCrashlytics", 3)) {
            android.util.Log.d("FirebaseCrashlytics", "Crashlytics detected incomplete initialization on previous app launch. Will initialize synchronously.", 0);
        }
        try {
            v5_5.get(3, java.util.concurrent.TimeUnit.SECONDS);
            return;
        } catch (Thread v5_3) {
            android.util.Log.e("FirebaseCrashlytics", "Crashlytics was interrupted during initialization.", v5_3);
            Thread.currentThread().interrupt();
            return;
        } catch (Thread v5_2) {
            android.util.Log.e("FirebaseCrashlytics", "Crashlytics encountered a problem during initialization.", v5_2);
            return;
        } catch (Thread v5_1) {
            android.util.Log.e("FirebaseCrashlytics", "Crashlytics timed out during initialization.", v5_1);
            return;
        }
    }

    public final void c()
    {
        h5.f.a();
        try {
            String v1_2 = this.e;
            String v2_4 = ((m5.c) v1_2.c);
            String v1_5 = ((String) v1_2.b);
            v2_4.getClass();
        } catch (String v1_1) {
            android.util.Log.e("FirebaseCrashlytics", "Problem encountered deleting Crashlytics initialization marker.", v1_1);
            return;
        }
        if (new java.io.File(((java.io.File) v2_4.d), v1_5).delete()) {
            return;
        } else {
            android.util.Log.w("FirebaseCrashlytics", "Initialization marker file was not properly removed.", 0);
            return;
        }
    }
}
