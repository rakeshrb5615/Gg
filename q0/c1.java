package q0;
public final class c1 {
    public q0.b1 a;

    public c1(int p3, android.view.animation.Interpolator p4, long p5)
    {
        if (android.os.Build$VERSION.SDK_INT < 30) {
            this.a = new q0.x0(p3, p4, p5);
            return;
        } else {
            this.a = new q0.a1(q0.y0.b(p3, p4, p5));
            return;
        }
    }
}
