package androidx.preference;
public class SeekBarPreference extends androidx.preference.Preference {
    public final int n;
    public final int o;

    public SeekBarPreference(android.content.Context p5, android.util.AttributeSet p6)
    {
        super(p5, p6, 2130969699);
        android.content.res.TypedArray v5_1 = p5.obtainStyledAttributes(p6, t1.b.i, 2130969699, 0);
        int v6_7 = v5_1.getInt(3, 0);
        int v0_1 = v5_1.getInt(1, 100);
        if (v0_1 < v6_7) {
            v0_1 = v6_7;
        }
        if (v0_1 != super.n) {
            super.n = v0_1;
        }
        int v0_3 = v5_1.getInt(4, 0);
        if (v0_3 != super.o) {
            super.o = Math.min((super.n - v6_7), Math.abs(v0_3));
        }
        v5_1.getBoolean(2, 1);
        v5_1.getBoolean(5, 0);
        v5_1.getBoolean(6, 0);
        v5_1.recycle();
        return;
    }

    public final Object c(android.content.res.TypedArray p2, int p3)
    {
        return Integer.valueOf(p2.getInt(p3, 0));
    }
}
