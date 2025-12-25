package i1;
public final class j implements android.text.method.TransformationMethod {
    public final android.text.method.TransformationMethod a;

    public j(android.text.method.TransformationMethod p1)
    {
        this.a = p1;
        return;
    }

    public final CharSequence getTransformation(CharSequence p3, android.view.View p4)
    {
        if (!p4.isInEditMode()) {
            int v0_3 = this.a;
            if (v0_3 != 0) {
                p3 = v0_3.getTransformation(p3, p4);
            }
            if ((p3 != null) && (g1.i.a().b() == 1)) {
                g1.i v4_2 = g1.i.a();
                v4_2.getClass();
                p3 = v4_2.e(p3, 0, p3.length());
            }
            return p3;
        } else {
            return p3;
        }
    }

    public final void onFocusChanged(android.view.View p7, CharSequence p8, boolean p9, int p10, android.graphics.Rect p11)
    {
        android.text.method.TransformationMethod v0 = this.a;
        if (v0 != null) {
            v0.onFocusChanged(p7, p8, p9, p10, p11);
        }
        return;
    }
}
