package a6;
public final class e implements a3.a, com.google.android.gms.tasks.SuccessContinuation, m.x, q0.x, t2.b, y1.b {

    public static a6.e c(android.content.Context p6, int p7)
    {
        int v2_1;
        if (p7 == 0) {
            v2_1 = 0;
        } else {
            v2_1 = 1;
        }
        p0.e.b("Cannot create a CalendarItemStyle with a styleResId of 0", v2_1);
        int v7_5 = p6.obtainStyledAttributes(p7, c3.a.n);
        android.graphics.Rect v5_1 = new android.graphics.Rect(v7_5.getDimensionPixelOffset(0, 0), v7_5.getDimensionPixelOffset(2, 0), v7_5.getDimensionPixelOffset(1, 0), v7_5.getDimensionPixelOffset(3, 0));
        j5.t1.v(p6, v7_5, 4);
        j5.t1.v(p6, v7_5, 9);
        j5.t1.v(p6, v7_5, 7);
        v7_5.getDimensionPixelSize(8, 0);
        v3.p.a(p6, v7_5.getResourceId(5, 0), v7_5.getResourceId(6, 0), new v3.a(((float) 0))).a();
        v7_5.recycle();
        a6.e v6_3 = new a6.e();
        p0.e.c(v5_1.left);
        p0.e.c(v5_1.top);
        p0.e.c(v5_1.right);
        p0.e.c(v5_1.bottom);
        return v6_3;
    }

    public static x8.y d(String p1)
    {
        kotlin.jvm.internal.j.e(p1, "<this>");
        x8.g v0_2 = new x8.g();
        v0_2.S(p1);
        return y8.c.d(v0_2, 0);
    }

    public static android.graphics.Path e(float p1, float p2, float p3, float p4)
    {
        android.graphics.Path v0_1 = new android.graphics.Path();
        v0_1.moveTo(p1, p2);
        v0_1.lineTo(p3, p4);
        return v0_1;
    }

    public void a(m.m p1, boolean p2)
    {
        return;
    }

    public long b()
    {
        return android.os.SystemClock.elapsedRealtime();
    }

    public java.util.List f(com.google.firebase.components.ComponentRegistrar p11)
    {
        java.util.ArrayList v0_1 = new java.util.ArrayList();
        java.util.Iterator v11_2 = p11.getComponents().iterator();
        while (v11_2.hasNext()) {
            a5.c v1_1 = ((a5.c) v11_2.next());
            String v3 = v1_1.a;
            if (v3 != null) {
                v1_1 = new a5.c(v3, v1_1.b, v1_1.c, v1_1.d, v1_1.e, new a5.u(9, v3, v1_1), v1_1.g);
            }
            v0_1.add(v1_1);
        }
        return v0_1;
    }

    public Object get()
    {
        return new m0.f(java.util.concurrent.Executors.newSingleThreadExecutor(), 3);
    }

    public boolean h(m.m p1)
    {
        return 0;
    }

    public void i()
    {
        return;
    }

    public void j(int p1, Object p2)
    {
        return;
    }

    public void onScrollLimit(int p1, int p2, int p3, boolean p4)
    {
        return;
    }

    public void onScrollProgress(int p1, int p2, int p3, int p4)
    {
        return;
    }

    public com.google.android.gms.tasks.Task then(Object p1)
    {
        return com.google.android.gms.tasks.Tasks.forResult(Boolean.TRUE);
    }
}
