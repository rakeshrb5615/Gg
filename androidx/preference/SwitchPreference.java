package androidx.preference;
public class SwitchPreference extends androidx.preference.TwoStatePreference {

    public SwitchPreference(android.content.Context p4, android.util.AttributeSet p5)
    {
        int v0_1 = g0.b.b(p4, 2130969830, 16843629);
        super(p4, p5, v0_1);
        android.content.res.TypedArray v4_1 = p4.obtainStyledAttributes(p5, t1.b.j, v0_1, 0);
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
