package t0;
public final class a {
    public int a;
    public int b;
    public float c;
    public float d;
    public long e;
    public long f;
    public long g;
    public float h;
    public int i;

    public final float a(long p9)
    {
        float v0_0 = this.e;
        if (p9 >= v0_0) {
            long v4 = this.g;
            if ((v4 >= 0) && (p9 >= v4)) {
                float v0_1 = this.h;
                return ((t0.d.b((((float) (p9 - v4)) / ((float) this.i)), 0, 1065353216) * v0_1) + (1065353216 - v0_1));
            } else {
                return (t0.d.b((((float) (p9 - v0_0)) / ((float) this.a)), 0, 1065353216) * 1056964608);
            }
        } else {
            return 0;
        }
    }
}
