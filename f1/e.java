package f1;
public final class e extends q4.b {
    public final synthetic int f;

    public synthetic e(int p1)
    {
        this.f = p1;
        super(5);
        return;
    }

    public final void R(v3.a0 p2, float p3)
    {
        switch (this.f) {
            case 0:
                ((android.view.View) p2).setAlpha(p3);
                return;
            case 1:
                ((android.view.View) p2).setScaleX(p3);
                return;
            case 2:
                ((android.view.View) p2).setScaleY(p3);
                return;
            case 3:
                ((android.view.View) p2).setRotation(p3);
                return;
            case 4:
                ((android.view.View) p2).setRotationX(p3);
                return;
            default:
                ((android.view.View) p2).setRotationY(p3);
                return;
        }
    }

    public final float y(v3.a0 p2)
    {
        switch (this.f) {
            case 0:
                return ((android.view.View) p2).getAlpha();
            case 1:
                return ((android.view.View) p2).getScaleX();
            case 2:
                return ((android.view.View) p2).getScaleY();
            case 3:
                return ((android.view.View) p2).getRotation();
            case 4:
                return ((android.view.View) p2).getRotationX();
            default:
                return ((android.view.View) p2).getRotationY();
        }
    }
}
