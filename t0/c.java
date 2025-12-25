package t0;
public abstract class c {

    public static android.widget.EdgeEffect a(android.content.Context p1, android.util.AttributeSet p2)
    {
        try {
            return new android.widget.EdgeEffect(p1, p2);
        } catch (Throwable) {
            return new android.widget.EdgeEffect(p1);
        }
    }

    public static float b(android.widget.EdgeEffect p0)
    {
        try {
            return p0.getDistance();
        } catch (Throwable) {
            return 0;
        }
    }

    public static float c(android.widget.EdgeEffect p0, float p1, float p2)
    {
        try {
            int v0_1 = p0.onPullDistance(p1, p2);
            return v0_1;
        } catch (Throwable) {
            v0_1.onPull(p1, p2);
            return 0;
        }
    }
}
