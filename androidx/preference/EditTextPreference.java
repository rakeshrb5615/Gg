package androidx.preference;
public class EditTextPreference extends androidx.preference.DialogPreference {

    public EditTextPreference(android.content.Context p4, android.util.AttributeSet p5)
    {
        int v0_1 = g0.b.b(p4, 2130969049, 16842898);
        super(p4, p5, v0_1);
        android.content.res.TypedArray v4_1 = p4.obtainStyledAttributes(p5, t1.b.c, v0_1, 0);
        if (v4_1.getBoolean(0, v4_1.getBoolean(0, 0))) {
            if (c5.c.b == null) {
                c5.c.b = new c5.c();
            }
            super.m = c5.c.b;
        }
        v4_1.recycle();
        return;
    }

    public final Object c(android.content.res.TypedArray p1, int p2)
    {
        return p1.getString(p2);
    }
}
