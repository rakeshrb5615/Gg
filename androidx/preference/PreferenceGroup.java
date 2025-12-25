package androidx.preference;
public abstract class PreferenceGroup extends androidx.preference.Preference {

    public PreferenceGroup(android.content.Context p2, android.util.AttributeSet p3)
    {
        this(p2, p3, 0, 0);
        return;
    }

    public PreferenceGroup(android.content.Context p2, android.util.AttributeSet p3, int p4, int p5)
    {
        super(p2, p3, p4);
        new android.os.Handler(android.os.Looper.getMainLooper());
        new java.util.ArrayList();
        android.content.res.TypedArray v2_1 = p2.obtainStyledAttributes(p3, t1.b.g, p4, 0);
        v2_1.getBoolean(2, v2_1.getBoolean(2, 1));
        if ((v2_1.hasValue(1)) && ((v2_1.getInt(1, v2_1.getInt(1, 2147483647)) != 2147483647) && (android.text.TextUtils.isEmpty(super.e)))) {
            android.util.Log.e("PreferenceGroup", super.getClass().getSimpleName().concat(" should have a key defined if it contains an expandable preference"));
        }
        v2_1.recycle();
        return;
    }
}
