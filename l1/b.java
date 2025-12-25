package l1;
public abstract class b implements android.view.animation.Interpolator {
    public final float[] a;
    public final float b;

    public b(float[] p2)
    {
        this.a = p2;
        this.b = (1065353216 / ((float) (p2.length - 1)));
        return;
    }

    public final float getInterpolation(float p5)
    {
        if (p5 < 1065353216) {
            if (p5 > 0) {
                float v0_3 = this.a;
                int v1_3 = Math.min(((int) (((float) (v0_3.length - 1)) * p5)), (v0_3.length - 2));
                float v3 = this.b;
                return g2.g.b(v0_3[(v1_3 + 1)], v0_3[v1_3], ((p5 - (((float) v1_3) * v3)) / v3), v0_3[v1_3]);
            } else {
                return 0;
            }
        } else {
            return 1065353216;
        }
    }
}
