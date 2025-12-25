package a2;
public final class g0 implements android.view.animation.Interpolator {
    public final synthetic int a;

    public synthetic g0(int p1)
    {
        this.a = p1;
        return;
    }

    public final float getInterpolation(float p3)
    {
        switch (this.a) {
            case 0:
            default:
                float v3_1 = (p3 - 1065353216);
                return (((((v3_1 * v3_1) * v3_1) * v3_1) * v3_1) + 1065353216);
        }
    }
}
