package androidx.preference;
public abstract class TwoStatePreference extends androidx.preference.Preference {

    public TwoStatePreference(android.content.Context p2, android.util.AttributeSet p3)
    {
        super(p2, p3, 0);
        return;
    }

    public final Object c(android.content.res.TypedArray p2, int p3)
    {
        return Boolean.valueOf(p2.getBoolean(p3, 0));
    }
}
