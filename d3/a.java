package d3;
public abstract class a {
    public static final android.view.animation.LinearInterpolator a;
    public static final l1.a b;
    public static final l1.a c;
    public static final l1.a d;
    public static final android.view.animation.DecelerateInterpolator e;

    static a()
    {
        d3.a.a = new android.view.animation.LinearInterpolator();
        d3.a.b = new l1.a(1);
        d3.a.c = new l1.a(0);
        d3.a.d = new l1.a(l1.a.e);
        d3.a.e = new android.view.animation.DecelerateInterpolator();
        return;
    }

    public static float a(float p0, float p1, float p2)
    {
        return g2.g.b(p1, p0, p2, p0);
    }

    public static float b(float p1, float p2, float p3, float p4, float p5)
    {
        if (p5 > p3) {
            if (p5 < p4) {
                return d3.a.a(p1, p2, ((p5 - p3) / (p4 - p3)));
            } else {
                return p2;
            }
        } else {
            return p1;
        }
    }

    public static int c(int p0, int p1, float p2)
    {
        return (Math.round((p2 * ((float) (p1 - p0)))) + p0);
    }
}
