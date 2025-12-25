package k;
public final class a implements android.text.method.TransformationMethod {
    public java.util.Locale a;

    public final CharSequence getTransformation(CharSequence p1, android.view.View p2)
    {
        if (p1 == 0) {
            return 0;
        } else {
            return p1.toString().toUpperCase(this.a);
        }
    }

    public final void onFocusChanged(android.view.View p1, CharSequence p2, boolean p3, int p4, android.graphics.Rect p5)
    {
        return;
    }
}
