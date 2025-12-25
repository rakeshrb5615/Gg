package androidx.preference;
public class CheckBoxPreference extends androidx.preference.TwoStatePreference {

    public CheckBoxPreference(android.content.Context p4, android.util.AttributeSet p5)
    {
        int v0_2 = g0.b.b(p4, 2130968766, 16842895);
        super(p4, p5, v0_2);
        android.content.res.TypedArray v4_1 = p4.obtainStyledAttributes(p5, t1.b.a, v0_2, 0);
        if (v4_1.getString(5) == null) {
            v4_1.getString(0);
        }
        if (v4_1.getString(4) == null) {
            v4_1.getString(1);
        }
        v4_1.getBoolean(3, v4_1.getBoolean(2, 0));
        v4_1.recycle();
        return;
    }
}
