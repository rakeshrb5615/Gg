package androidx.fragment.app;
public abstract class n1 {
    public static final androidx.fragment.app.s1 a;
    public static final androidx.fragment.app.u1 b;

    static n1()
    {
        androidx.fragment.app.n1.a = new androidx.fragment.app.s1();
        try {
        } catch (Exception) {
        }
        androidx.fragment.app.n1.b = ((androidx.fragment.app.u1) f2.m.getDeclaredConstructor(0).newInstance(0));
        return;
    }

    public static final void a(int p3, java.util.ArrayList p4)
    {
        int v0 = p4.size();
        int v1 = 0;
        while (v1 < v0) {
            android.view.View v2_0 = p4.get(v1);
            v1++;
            ((android.view.View) v2_0).setVisibility(p3);
        }
        return;
    }
}
