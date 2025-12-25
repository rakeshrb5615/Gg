package androidx.preference.internal;
public class PreferenceImageView extends android.widget.ImageView {
    public int a;
    public int b;

    public PreferenceImageView(android.content.Context p4, android.util.AttributeSet p5)
    {
        super(p4, p5, 0);
        super.a = 2147483647;
        super.b = 2147483647;
        android.content.res.TypedArray v4_1 = p4.obtainStyledAttributes(p5, t1.b.h, 0, 0);
        super.setMaxWidth(v4_1.getDimensionPixelSize(3, 2147483647));
        super.setMaxHeight(v4_1.getDimensionPixelSize(2, 2147483647));
        v4_1.recycle();
        return;
    }

    public int getMaxHeight()
    {
        return this.b;
    }

    public int getMaxWidth()
    {
        return this.a;
    }

    public final void onMeasure(int p6, int p7)
    {
        int v0_0 = android.view.View$MeasureSpec.getMode(p6);
        if ((v0_0 == -2147483648) || (v0_0 == 0)) {
            int v3_1 = android.view.View$MeasureSpec.getSize(p6);
            int v4_1 = this.getMaxWidth();
            if ((v4_1 != 2147483647) && ((v4_1 < v3_1) || (v0_0 == 0))) {
                p6 = android.view.View$MeasureSpec.makeMeasureSpec(v4_1, -2147483648);
            }
        }
        int v0_1 = android.view.View$MeasureSpec.getMode(p7);
        if ((v0_1 == -2147483648) || (v0_1 == 0)) {
            int v3_0 = android.view.View$MeasureSpec.getSize(p7);
            int v4_0 = this.getMaxHeight();
            if ((v4_0 != 2147483647) && ((v4_0 < v3_0) || (v0_1 == 0))) {
                p7 = android.view.View$MeasureSpec.makeMeasureSpec(v4_0, -2147483648);
            }
        }
        super.onMeasure(p6, p7);
        return;
    }

    public void setMaxHeight(int p1)
    {
        this.b = p1;
        super.setMaxHeight(p1);
        return;
    }

    public void setMaxWidth(int p1)
    {
        this.a = p1;
        super.setMaxWidth(p1);
        return;
    }
}
