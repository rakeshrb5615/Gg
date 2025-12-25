package v3;
public final class v extends v3.x {
    public static final android.graphics.RectF h;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public float f;
    public float g;

    static v()
    {
        v3.v.h = new android.graphics.RectF();
        return;
    }

    public v(float p1, float p2, float p3, float p4)
    {
        this.b = p1;
        this.c = p2;
        this.d = p3;
        this.e = p4;
        return;
    }

    public final void a(android.graphics.Matrix p6, android.graphics.Path p7)
    {
        float v0_0 = this.a;
        p6.invert(v0_0);
        p7.transform(v0_0);
        android.graphics.RectF v2 = v3.v.h;
        v2.set(this.b, this.c, this.d, this.e);
        p7.arcTo(v2, this.f, this.g, 0);
        p7.transform(p6);
        return;
    }
}
