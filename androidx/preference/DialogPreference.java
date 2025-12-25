package androidx.preference;
public abstract class DialogPreference extends androidx.preference.Preference {

    public DialogPreference(android.content.Context p3, android.util.AttributeSet p4)
    {
        this(p3, p4, g0.b.b(p3, 2130969007, 16842897));
        return;
    }

    public DialogPreference(android.content.Context p3, android.util.AttributeSet p4, int p5)
    {
        super(p3, p4, p5);
        android.content.res.TypedArray v3_1 = p3.obtainStyledAttributes(p4, t1.b.b, p5, 0);
        if (v3_1.getString(9) == null) {
            v3_1.getString(0);
        }
        if (v3_1.getString(8) == null) {
            v3_1.getString(1);
        }
        if (v3_1.getDrawable(6) == null) {
            v3_1.getDrawable(2);
        }
        if (v3_1.getString(11) == null) {
            v3_1.getString(3);
        }
        if (v3_1.getString(10) == null) {
            v3_1.getString(4);
        }
        v3_1.getResourceId(7, v3_1.getResourceId(5, 0));
        v3_1.recycle();
        return;
    }
}
