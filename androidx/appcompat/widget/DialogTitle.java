package androidx.appcompat.widget;
public class DialogTitle extends n.b1 {

    public DialogTitle(android.content.Context p1, android.util.AttributeSet p2)
    {
        super(p1, p2);
        return;
    }

    public final void onMeasure(int p7, int p8)
    {
        super.onMeasure(p7, p8);
        int v0_1 = this.getLayout();
        if (v0_1 != 0) {
            android.content.res.TypedArray v1_3 = v0_1.getLineCount();
            if ((v1_3 > null) && (v0_1.getEllipsisCount((v1_3 - 1)) > 0)) {
                this.setSingleLine(0);
                this.setMaxLines(2);
                android.content.res.TypedArray v1_2 = this.getContext().obtainStyledAttributes(0, g.a.w, 16842817, 16973892);
                float v2_1 = v1_2.getDimensionPixelSize(0, 0);
                if (v2_1 != 0) {
                    this.setTextSize(0, ((float) v2_1));
                }
                v1_2.recycle();
                super.onMeasure(p7, p8);
            }
        }
        return;
    }
}
