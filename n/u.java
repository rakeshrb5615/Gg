package n;
public final class u {
    public static final android.graphics.PorterDuff$Mode b;
    public static n.u c;
    public n.n2 a;

    static u()
    {
        n.u.b = android.graphics.PorterDuff$Mode.SRC_IN;
        return;
    }

    public static declared_synchronized n.u a()
    {
        if (n.u.c == null) {
            n.u.d();
        }
        return n.u.c;
    }

    public static declared_synchronized android.graphics.PorterDuffColorFilter c(int p1, android.graphics.PorterDuff$Mode p2)
    {
        return n.n2.e(p1, p2);
    }

    public static declared_synchronized void d()
    {
        if (n.u.c == null) {
            n.n2 v1_4 = new n.u();
            n.u.c = v1_4;
            v1_4.a = n.n2.b();
            n.u.c.a.e = new a5.z();
        }
        return;
    }

    public static void e(android.graphics.drawable.Drawable p4, n.v2 p5, int[] p6)
    {
        int v0_1 = p4.getState();
        if (p4.mutate() != p4) {
            android.util.Log.d("ResourceManagerInternal", "Mutated drawable is not the same instance as the input.");
            return;
        } else {
            if (((p4 instanceof android.graphics.drawable.LayerDrawable)) && (p4.isStateful())) {
                android.graphics.PorterDuffColorFilter v1_2 = new int[0];
                p4.setState(v1_2);
                p4.setState(v0_1);
            }
            int v0_0 = p5.d;
            if ((v0_0 == 0) && (!p5.c)) {
                p4.clearColorFilter();
                return;
            } else {
                int v0_2;
                android.graphics.PorterDuffColorFilter v1_4 = 0;
                if (v0_0 == 0) {
                    v0_2 = 0;
                } else {
                    v0_2 = p5.a;
                }
                android.graphics.PorterDuff$Mode v5_1;
                if (!p5.c) {
                    v5_1 = n.n2.f;
                } else {
                    v5_1 = p5.b;
                }
                if ((v0_2 != 0) && (v5_1 != null)) {
                    v1_4 = n.n2.e(v0_2.getColorForState(p6, 0), v5_1);
                }
                p4.setColorFilter(v1_4);
                return;
            }
        }
    }

    public final declared_synchronized android.graphics.drawable.Drawable b(android.content.Context p2, int p3)
    {
        return this.a.c(p2, p3);
    }
}
