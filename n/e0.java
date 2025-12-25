package n;
public final class e0 extends android.widget.RatingBar {
    public final n.c0 a;

    public e0(android.content.Context p2, android.util.AttributeSet p3)
    {
        super(p2, p3, 2130969665);
        n.t2.a(super, super.getContext());
        n.c0 v2_3 = new n.c0(super);
        super.a = v2_3;
        v2_3.b(p3, 2130969665);
        return;
    }

    public final declared_synchronized void onMeasure(int p2, int p3)
    {
        super.onMeasure(p2, p3);
        int v3_5 = ((android.graphics.Bitmap) this.a.c);
        if (v3_5 != 0) {
            this.setMeasuredDimension(android.view.View.resolveSizeAndState((v3_5.getWidth() * this.getNumStars()), p2, 0), this.getMeasuredHeight());
        }
        return;
    }
}
