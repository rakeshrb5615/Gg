package q0;
public abstract class j0 {

    public static q0.s1 a(android.view.View p2)
    {
        q0.s1 v0_0 = p2.getRootWindowInsets();
        if (v0_0 != null) {
            q0.s1 v0_1 = q0.s1.g(0, v0_0);
            q0.p1 v1_1 = v0_1.a;
            v1_1.p(v0_1);
            v1_1.d(p2.getRootView());
            return v0_1;
        } else {
            return 0;
        }
    }

    public static void b(android.view.View p0, int p1, int p2)
    {
        p0.setScrollIndicators(p1, p2);
        return;
    }
}
