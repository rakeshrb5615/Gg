package c;
public class p extends android.app.Dialog implements androidx.lifecycle.u, c.w, b2.g {
    public androidx.lifecycle.w a;
    public final b2.f b;
    public final h7.j c;
    public final h7.j d;

    public p(android.content.Context p2, int p3)
    {
        kotlin.jvm.internal.j.e(p2, "context");
        super(p2, p3);
        super.b = new b2.f(new c2.a(super, new a8.j(super, 2)));
        super.c = a.a.F(new c.o(super, 0));
        super.d = a.a.F(new c.o(super, 1));
        return;
    }

    public static void a(c.p p0)
    {
        super.onBackPressed();
        return;
    }

    public void addContentView(android.view.View p2, android.view.ViewGroup$LayoutParams p3)
    {
        kotlin.jvm.internal.j.e(p2, "view");
        this.b();
        super.addContentView(p2, p3);
        return;
    }

    public final void b()
    {
        android.view.View v0_0 = this.getWindow();
        kotlin.jvm.internal.j.b(v0_0);
        android.view.View v0_7 = v0_0.getDecorView();
        kotlin.jvm.internal.j.d(v0_7, "getDecorView(...)");
        v0_7.setTag(2131362596, this);
        android.view.View v0_1 = this.getWindow();
        kotlin.jvm.internal.j.b(v0_1);
        android.view.View v0_2 = v0_1.getDecorView();
        kotlin.jvm.internal.j.d(v0_2, "getDecorView(...)");
        v0_2.setTag(2131362598, this);
        android.view.View v0_3 = this.getWindow();
        kotlin.jvm.internal.j.b(v0_3);
        android.view.View v0_4 = v0_3.getDecorView();
        kotlin.jvm.internal.j.d(v0_4, "getDecorView(...)");
        v0_4.setTag(2131362599, this);
        android.view.View v0_5 = this.getWindow();
        kotlin.jvm.internal.j.b(v0_5);
        android.view.View v0_6 = v0_5.getDecorView();
        kotlin.jvm.internal.j.d(v0_6, "getDecorView(...)");
        v0_6.setTag(2131362597, this);
        return;
    }

    public final androidx.lifecycle.p getLifecycle()
    {
        androidx.lifecycle.w v0_0 = this.a;
        if (v0_0 == null) {
            v0_0 = new androidx.lifecycle.w(this);
            this.a = v0_0;
        }
        return v0_0;
    }

    public final c.v getOnBackPressedDispatcher()
    {
        return ((c.v) this.d.getValue());
    }

    public final b2.e getSavedStateRegistry()
    {
        return this.b.b;
    }

    public final void onBackPressed()
    {
        ((s1.a) this.c.getValue()).a();
        return;
    }

    public void onCreate(android.os.Bundle p4)
    {
        super.onCreate(p4);
        if (android.os.Build$VERSION.SDK_INT >= 33) {
            androidx.lifecycle.n v0_3 = this.getOnBackPressedDispatcher();
            android.window.OnBackInvokedDispatcher v1_1 = this.getOnBackInvokedDispatcher();
            kotlin.jvm.internal.j.d(v1_1, "getOnBackInvokedDispatcher(...)");
            v0_3.b(v1_1);
        }
        this.b.a(p4);
        androidx.lifecycle.w v4_1 = this.a;
        if (v4_1 == null) {
            v4_1 = new androidx.lifecycle.w(this);
            this.a = v4_1;
        }
        v4_1.e(androidx.lifecycle.n.ON_CREATE);
        return;
    }

    public final android.os.Bundle onSaveInstanceState()
    {
        android.os.Bundle v0 = super.onSaveInstanceState();
        kotlin.jvm.internal.j.d(v0, "onSaveInstanceState(...)");
        this.b.b(v0);
        return v0;
    }

    public void onStart()
    {
        super.onStart();
        androidx.lifecycle.w v0_0 = this.a;
        if (v0_0 == null) {
            v0_0 = new androidx.lifecycle.w(this);
            this.a = v0_0;
        }
        v0_0.e(androidx.lifecycle.n.ON_RESUME);
        return;
    }

    public void onStop()
    {
        int v0_0 = this.a;
        if (v0_0 == 0) {
            v0_0 = new androidx.lifecycle.w(this);
            this.a = v0_0;
        }
        v0_0.e(androidx.lifecycle.n.ON_DESTROY);
        this.a = 0;
        super.onStop();
        return;
    }

    public void setContentView(int p1)
    {
        this.b();
        super.setContentView(p1);
        return;
    }

    public void setContentView(android.view.View p2)
    {
        kotlin.jvm.internal.j.e(p2, "view");
        this.b();
        super.setContentView(p2);
        return;
    }

    public void setContentView(android.view.View p2, android.view.ViewGroup$LayoutParams p3)
    {
        kotlin.jvm.internal.j.e(p2, "view");
        this.b();
        super.setContentView(p2, p3);
        return;
    }
}
