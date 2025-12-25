package s1;
public abstract class i {

    public static final s1.b a(android.window.BackEvent p7)
    {
        long v5_0;
        float v3 = p7.getTouchX();
        float v4 = p7.getTouchY();
        float v2 = p7.getProgress();
        int v1 = p7.getSwipeEdge();
        if (android.os.Build$VERSION.SDK_INT < 36) {
            v5_0 = 0;
        } else {
            v5_0 = p7.getFrameTimeMillis();
        }
        return new s1.b(v1, v2, v3, v4, v5_0);
    }
}
