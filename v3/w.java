package v3;
public final class w extends v3.x {
    public float b;
    public float c;

    public final void a(android.graphics.Matrix p3, android.graphics.Path p4)
    {
        float v0_0 = this.a;
        p3.invert(v0_0);
        p4.transform(v0_0);
        p4.lineTo(this.b, this.c);
        p4.transform(p3);
        return;
    }
}
