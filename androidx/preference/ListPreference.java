package androidx.preference;
public class ListPreference extends androidx.preference.DialogPreference {
    public final CharSequence[] n;
    public final String o;

    public ListPreference(android.content.Context p3, android.util.AttributeSet p4)
    {
        this(p3, p4, g0.b.b(p3, 2130969007, 16842897));
        return;
    }

    public ListPreference(android.content.Context p5, android.util.AttributeSet p6, int p7)
    {
        super(p5, p6, p7);
        int[] v0_2 = p5.obtainStyledAttributes(p6, t1.b.d, p7, 0);
        v3.f v2_0 = v0_2.getTextArray(2);
        if (v2_0 == null) {
            v2_0 = v0_2.getTextArray(0);
        }
        super.n = v2_0;
        if (v0_2.getTextArray(3) == null) {
            v0_2.getTextArray(1);
        }
        if (v0_2.getBoolean(4, v0_2.getBoolean(4, 0))) {
            if (v3.f.c == null) {
                v3.f.c = new v3.f();
            }
            super.m = v3.f.c;
            super.b();
        }
        v0_2.recycle();
        android.content.res.TypedArray v5_1 = p5.obtainStyledAttributes(p6, t1.b.f, p7, 0);
        String v6_2 = v5_1.getString(33);
        if (v6_2 == null) {
            v6_2 = v5_1.getString(7);
        }
        super.o = v6_2;
        v5_1.recycle();
        return;
    }

    public final CharSequence a()
    {
        String v0_0 = this.m;
        if (v0_0 == null) {
            String v0_3 = super.a();
            String v1_1 = this.o;
            if (v1_1 != null) {
                String v1_0 = String.format(v1_1, new Object[] {""}));
                if (!android.text.TextUtils.equals(v1_0, v0_3)) {
                    android.util.Log.w("ListPreference", "Setting a summary with a String formatting marker is no longer supported. You should use a SummaryProvider instead.");
                    return v1_0;
                }
            }
            return v0_3;
        } else {
            return v0_0.d(this);
        }
    }

    public final Object c(android.content.res.TypedArray p1, int p2)
    {
        return p1.getString(p2);
    }
}
