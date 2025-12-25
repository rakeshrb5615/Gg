package androidx.preference;
public class SwitchPreferenceCompat extends androidx.preference.TwoStatePreference {

    public SwitchPreferenceCompat(android.content.Context p4, android.util.AttributeSet p5)
    {
        super(p4, p5, 2130969829);
        android.content.res.TypedArray v4_1 = p4.obtainStyledAttributes(p5, t1.b.k, 2130969829, 0);
        if (v4_1.getString(7) == null) {
            v4_1.getString(0);
        }
        if (v4_1.getString(6) == null) {
            v4_1.getString(1);
        }
        if (v4_1.getString(9) == null) {
            v4_1.getString(3);
        }
        if (v4_1.getString(8) == null) {
            v4_1.getString(4);
        }
        v4_1.getBoolean(5, v4_1.getBoolean(2, 0));
        v4_1.recycle();
        return;
    }
}
