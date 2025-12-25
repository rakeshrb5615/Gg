package g1;
public final class p implements g1.h {
    public final android.content.Context a;
    public final n0.d b;
    public final c5.c c;
    public final Object d;
    public android.os.Handler e;
    public java.util.concurrent.ThreadPoolExecutor f;
    public java.util.concurrent.ThreadPoolExecutor g;
    public q4.b h;

    public p(android.content.Context p2, n0.d p3)
    {
        this.d = new Object();
        p0.e.d(p2, "Context cannot be null");
        this.a = p2.getApplicationContext();
        this.b = p3;
        this.c = g1.q.d;
        return;
    }

    public final void a(q4.b p10)
    {
        this.h = p10;
        if (this.h != null) {
            if (this.f == null) {
                androidx.lifecycle.g0 v1_1 = new java.util.concurrent.ThreadPoolExecutor(0, 1, 15, java.util.concurrent.TimeUnit.SECONDS, new java.util.concurrent.LinkedBlockingDeque(), new g1.a("emojiCompat"));
                v1_1.allowCoreThreadTimeOut(1);
                this.g = v1_1;
                this.f = v1_1;
            }
            this.f.execute(new androidx.lifecycle.g0(this, 5));
            return;
        } else {
            return;
        }
    }

    public final void b()
    {
        this.h = 0;
        java.util.concurrent.ThreadPoolExecutor v2_0 = this.e;
        if (v2_0 != null) {
            v2_0.removeCallbacks(0);
        }
        this.e = 0;
        java.util.concurrent.ThreadPoolExecutor v2_1 = this.g;
        if (v2_1 != null) {
            v2_1.shutdown();
        }
        this.f = 0;
        this.g = 0;
        return;
    }

    public final n0.i c()
    {
        try {
            String v1_0 = this.a;
            String v2_0 = this.b;
            this.c.getClass();
            RuntimeException v0_14 = new Object[] {v2_0});
            String v2_4 = new java.util.ArrayList(1);
            RuntimeException v0_1 = v0_14[0];
            java.util.Objects.requireNonNull(v0_1);
            v2_4.add(v0_1);
            RuntimeException v0_3 = n0.c.a(v1_0, java.util.Collections.unmodifiableList(v2_4));
            String v1_1 = v0_3.b;
        } catch (RuntimeException v0_4) {
            throw new RuntimeException("provider not found", v0_4);
        }
        if (v1_1 != null) {
            throw new RuntimeException(v1.a.j("fetchFonts failed (", v1_1, ")"));
        } else {
            RuntimeException v0_10 = ((n0.i[]) ((java.util.List) v0_3.c).get(0));
            if ((v0_10 == null) || (v0_10.length == 0)) {
                throw new RuntimeException("fetchFonts failed (empty result)");
            } else {
                return v0_10[0];
            }
        }
    }
}
