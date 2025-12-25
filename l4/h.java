package l4;
public final synthetic class h implements l4.f, a5.f, com.google.android.gms.tasks.SuccessContinuation, o2.e {
    public final synthetic int a;

    public synthetic h(int p1)
    {
        this.a = p1;
        return;
    }

    public static bridge synthetic int a(android.graphics.Insets p0)
    {
        return p0.left;
    }

    public static bridge synthetic android.view.WindowInsets b()
    {
        return android.view.WindowInsets.CONSUMED;
    }

    public static bridge synthetic int c(android.graphics.Insets p0)
    {
        return p0.top;
    }

    public static bridge synthetic int d(android.graphics.Insets p0)
    {
        return p0.right;
    }

    public static bridge synthetic int f(android.graphics.Insets p0)
    {
        return p0.bottom;
    }

    public Object apply(Object p2)
    {
        n5.a.b.getClass();
        return k5.a.a.q(((j5.n2) p2)).getBytes(java.nio.charset.Charset.forName("UTF-8"));
    }

    public Object e(a5.z p5)
    {
        Throwable v5_2 = p5.c(a5.x.a(l6.a));
        l6.c v1_2 = l6.c.c;
        if (v1_2 == null) {
            v1_2 = l6.c.c;
            if (v1_2 == null) {
                v1_2 = new l6.c(0);
                l6.c.c = v1_2;
            }
        }
        return new l6.b(v5_2, v1_2);
    }

    public Object get()
    {
        throw new IllegalStateException();
    }

    public com.google.android.gms.tasks.Task then(Object p1)
    {
        return com.google.android.gms.tasks.Tasks.forResult(0);
    }
}
