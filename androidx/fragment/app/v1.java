package androidx.fragment.app;
public final class v1 implements androidx.lifecycle.j, b2.g, androidx.lifecycle.b1 {
    public final androidx.fragment.app.e0 a;
    public final androidx.lifecycle.a1 b;
    public final androidx.fragment.app.t c;
    public androidx.lifecycle.w d;
    public b2.f e;

    public v1(androidx.fragment.app.e0 p2, androidx.lifecycle.a1 p3, androidx.fragment.app.t p4)
    {
        this.d = 0;
        this.e = 0;
        this.a = p2;
        this.b = p3;
        this.c = p4;
        return;
    }

    public final void a(androidx.lifecycle.n p2)
    {
        this.d.e(p2);
        return;
    }

    public final void b()
    {
        if (this.d == null) {
            this.d = new androidx.lifecycle.w(this);
            androidx.fragment.app.t v0_5 = new c2.a(this, new a8.j(this, 2));
            this.e = new b2.f(v0_5);
            v0_5.a();
            this.c.run();
        }
        return;
    }

    public final o1.b getDefaultViewModelCreationExtras()
    {
        android.os.Bundle v0_0 = this.a;
        v3.f v1_1 = v0_0.requireContext().getApplicationContext();
        while ((v1_1 instanceof android.content.ContextWrapper)) {
            if (!(v1_1 instanceof android.app.Application)) {
                v1_1 = ((android.content.ContextWrapper) v1_1).getBaseContext();
            } else {
                v3.f v1_2 = ((android.app.Application) v1_1);
            }
            o1.c v2_1 = new o1.c(0);
            java.util.LinkedHashMap v3_1 = v2_1.a;
            if (v1_2 != null) {
                v3_1.put(androidx.lifecycle.w0.d, v1_2);
            }
            v3_1.put(androidx.lifecycle.q0.a, v0_0);
            v3_1.put(androidx.lifecycle.q0.b, this);
            if (v0_0.getArguments() != null) {
                v3_1.put(androidx.lifecycle.q0.c, v0_0.getArguments());
            }
            return v2_1;
        }
        v1_2 = 0;
    }

    public final androidx.lifecycle.p getLifecycle()
    {
        this.b();
        return this.d;
    }

    public final b2.e getSavedStateRegistry()
    {
        this.b();
        return this.e.b;
    }

    public final androidx.lifecycle.a1 getViewModelStore()
    {
        this.b();
        return this.b;
    }
}
