package androidx.appcompat.widget;
public class ActivityChooserView$InnerLayout extends android.widget.LinearLayout {
    public static final int[] a;

    static ActivityChooserView$InnerLayout()
    {
        androidx.appcompat.widget.ActivityChooserView$InnerLayout.a = new int[] {16842964});
        return;
    }

    public ActivityChooserView$InnerLayout(android.content.Context p3, android.util.AttributeSet p4)
    {
        android.graphics.drawable.Drawable v3_1;
        super(p3, p4);
        android.content.res.TypedArray v4_1 = p3.obtainStyledAttributes(p4, androidx.appcompat.widget.ActivityChooserView$InnerLayout.a);
        if (!v4_1.hasValue(0)) {
            v3_1 = v4_1.getDrawable(0);
        } else {
            int v1_1 = v4_1.getResourceId(0, 0);
            if (v1_1 == 0) {
            } else {
                v3_1 = j5.t1.A(p3, v1_1);
            }
        }
        super.setBackgroundDrawable(v3_1);
        v4_1.recycle();
        return;
    }
}
