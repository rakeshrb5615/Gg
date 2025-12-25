package q0;
public abstract class b1 {
    public final int a;
    public float b;
    public final android.view.animation.Interpolator c;
    public final long d;

    public b1(int p1, android.view.animation.Interpolator p2, long p3)
    {
        this.a = p1;
        this.c = p2;
        this.d = p3;
        return;
    }

    public long a()
    {
        return this.d;
    }

    public float b()
    {
        float v0_0 = this.c;
        if (v0_0 == 0) {
            return this.b;
        } else {
            return v0_0.getInterpolation(this.b);
        }
    }

    public int c()
    {
        return this.a;
    }

    public void d(float p1)
    {
        this.b = p1;
        return;
    }
}
