package c;
public final class a {
    public final float a;
    public final float b;
    public final float c;
    public final int d;
    public final long e;

    public a(android.window.BackEvent p7)
    {
        long v4_1;
        kotlin.jvm.internal.j.e(p7, "backEvent");
        float v0_1 = p7.getTouchX();
        float v1 = p7.getTouchY();
        float v2 = p7.getProgress();
        int v3 = p7.getSwipeEdge();
        if (android.os.Build$VERSION.SDK_INT < 36) {
            v4_1 = 0;
        } else {
            v4_1 = p7.getFrameTimeMillis();
        }
        this.a = v0_1;
        this.b = v1;
        this.c = v2;
        this.d = v3;
        this.e = v4_1;
        return;
    }

    public final String toString()
    {
        String v0_1 = new StringBuilder("BackEventCompat(touchX=");
        v0_1.append(this.a);
        v0_1.append(", touchY=");
        v0_1.append(this.b);
        v0_1.append(", progress=");
        v0_1.append(this.c);
        v0_1.append(", swipeEdge=");
        v0_1.append(this.d);
        v0_1.append(", frameTimeMillis=");
        v0_1.append(this.e);
        v0_1.append(41);
        return v0_1.toString();
    }
}
