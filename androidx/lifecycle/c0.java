package androidx.lifecycle;
public abstract class c0 {
    public static final Object k;
    public final Object a;
    public final p.f b;
    public int c;
    public boolean d;
    public volatile Object e;
    public volatile Object f;
    public int g;
    public boolean h;
    public boolean i;
    public final androidx.lifecycle.y j;

    static c0()
    {
        androidx.lifecycle.c0.k = new Object();
        return;
    }

    public c0()
    {
        this.a = new Object();
        this.b = new p.f();
        this.c = 0;
        int v0_6 = androidx.lifecycle.c0.k;
        this.f = v0_6;
        this.j = new androidx.lifecycle.y(this);
        this.e = v0_6;
        this.g = -1;
        return;
    }

    public static void a(String p3)
    {
        o.a.V().f.getClass();
        if (android.os.Looper.getMainLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException(v1.a.l("Cannot invoke ", p3, " on a background thread"));
        } else {
            return;
        }
    }

    public final void b(androidx.lifecycle.b0 p3)
    {
        if (p3.b) {
            if (p3.e()) {
                int v1 = this.g;
                if (p3.c < v1) {
                    p3.c = v1;
                    p3.a.a(this.e);
                    return;
                }
            } else {
                p3.a(0);
                return;
            }
        }
        return;
    }

    public final void c(androidx.lifecycle.b0 p5)
    {
        if (!this.h) {
            this.h = 1;
            do {
                this.i = 0;
                if (p5 == 0) {
                    boolean v1_9 = this.b;
                    v1_9.getClass();
                    p.d v2_0 = new p.d(v1_9);
                    v1_9.c.put(v2_0, Boolean.FALSE);
                    while (v2_0.hasNext()) {
                        this.b(((androidx.lifecycle.b0) ((java.util.Map$Entry) v2_0.next()).getValue()));
                        if (this.i) {
                            break;
                        }
                    }
                } else {
                    this.b(p5);
                    p5 = 0;
                }
            } while(this.i);
            this.h = 0;
            return;
        } else {
            this.i = 1;
            return;
        }
    }

    public final void d(androidx.lifecycle.u p4, androidx.lifecycle.e0 p5)
    {
        androidx.lifecycle.c0.a("observe");
        if (((androidx.lifecycle.w) p4.getLifecycle()).c != androidx.lifecycle.o.a) {
            String v5_4;
            androidx.lifecycle.a0 v0_5 = new androidx.lifecycle.a0(this, p4, p5);
            boolean v1_0 = this.b;
            p.c v2_0 = v1_0.a(p5);
            if (v2_0 == null) {
                p.c v2_2 = new p.c(p5, v0_5);
                v1_0.d = (v1_0.d + 1);
                String v5_3 = v1_0.b;
                if (v5_3 != null) {
                    v5_3.c = v2_2;
                    v2_2.d = v5_3;
                    v1_0.b = v2_2;
                } else {
                    v1_0.a = v2_2;
                    v1_0.b = v2_2;
                }
                v5_4 = 0;
            } else {
                v5_4 = v2_0.b;
            }
            String v5_5 = ((androidx.lifecycle.b0) v5_4);
            if ((v5_5 != null) && (!v5_5.d(p4))) {
                throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
            } else {
                if (v5_5 == null) {
                    p4.getLifecycle().a(v0_5);
                    return;
                }
            }
        }
        return;
    }

    public void e()
    {
        return;
    }

    public void f()
    {
        return;
    }

    public void g(androidx.lifecycle.e0 p2)
    {
        androidx.lifecycle.c0.a("removeObserver");
        androidx.lifecycle.b0 v2_2 = ((androidx.lifecycle.b0) this.b.b(p2));
        if (v2_2 != null) {
            v2_2.b();
            v2_2.a(0);
            return;
        } else {
            return;
        }
    }

    public abstract void h();
}
