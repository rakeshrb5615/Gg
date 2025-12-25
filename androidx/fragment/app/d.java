package androidx.fragment.app;
public final synthetic class d implements java.lang.Runnable {
    public final synthetic int a;
    public final synthetic Object b;
    public final synthetic Object c;

    public synthetic d(androidx.fragment.app.j p2, androidx.fragment.app.y1 p3)
    {
        this.a = 2;
        this.b = p2;
        this.c = p3;
        return;
    }

    public synthetic d(androidx.fragment.app.u1 p1, android.view.View p2, android.graphics.Rect p3)
    {
        this.a = 1;
        this.b = p2;
        this.c = p3;
        return;
    }

    public synthetic d(java.util.ArrayList p1, androidx.fragment.app.y1 p2, androidx.fragment.app.n p3)
    {
        this.a = 0;
        this.b = p1;
        this.c = p2;
        return;
    }

    public final void run()
    {
        switch (this.a) {
            case 0:
                android.view.View v0_13 = ((java.util.ArrayList) this.b);
                int v1_1 = ((androidx.fragment.app.y1) this.c);
                if (v0_13.contains(v1_1)) {
                    v0_13.remove(v1_1);
                    android.view.View v0_2 = v1_1.c.mView;
                    int v1_2 = v1_1.a;
                    kotlin.jvm.internal.j.d(v0_2, "view");
                    v1.a.a(v0_2, v1_2);
                }
                return;
            case 1:
                androidx.fragment.app.u1.g(((android.view.View) this.b), ((android.graphics.Rect) this.c));
                return;
            default:
                android.view.View v0_5 = ((androidx.fragment.app.j) this.b);
                int v1_4 = ((androidx.fragment.app.y1) this.c);
                kotlin.jvm.internal.j.e(v0_5, "$transitionInfo");
                kotlin.jvm.internal.j.e(v1_4, "$operation");
                v0_5.a();
                if (androidx.fragment.app.b1.H(2)) {
                    android.view.View v0_10 = new StringBuilder("Transition for operation ");
                    v0_10.append(v1_4);
                    v0_10.append(" has completed");
                    android.util.Log.v("FragmentManager", v0_10.toString());
                }
                return;
        }
    }
}
