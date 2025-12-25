package q0;
public final class a1 extends q0.b1 {
    public final android.view.WindowInsetsAnimation e;

    public a1(android.view.WindowInsetsAnimation p5)
    {
        super(0, 0, 0);
        super.e = p5;
        return;
    }

    public static h0.b e(android.view.WindowInsetsAnimation$Bounds p0)
    {
        return h0.b.c(p0.getUpperBound());
    }

    public static h0.b f(android.view.WindowInsetsAnimation$Bounds p0)
    {
        return h0.b.c(p0.getLowerBound());
    }

    public static void g(android.view.View p1, h3.k p2)
    {
        p1.setWindowInsetsAnimationCallback(new q0.z0(p2));
        return;
    }

    public final long a()
    {
        return this.e.getDurationMillis();
    }

    public final float b()
    {
        return this.e.getInterpolatedFraction();
    }

    public final int c()
    {
        return this.e.getTypeMask();
    }

    public final void d(float p2)
    {
        this.e.setFraction(p2);
        return;
    }
}
