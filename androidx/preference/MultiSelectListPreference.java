package androidx.preference;
public class MultiSelectListPreference extends androidx.preference.DialogPreference {

    public MultiSelectListPreference(android.content.Context p4, android.util.AttributeSet p5)
    {
        int v0_1 = g0.b.b(p4, 2130969007, 16842897);
        super(p4, p5, v0_1);
        new java.util.HashSet();
        android.content.res.TypedArray v4_1 = p4.obtainStyledAttributes(p5, t1.b.e, v0_1, 0);
        if (v4_1.getTextArray(2) == null) {
            v4_1.getTextArray(0);
        }
        if (v4_1.getTextArray(3) == null) {
            v4_1.getTextArray(1);
        }
        v4_1.recycle();
        return;
    }

    public final Object c(android.content.res.TypedArray p4, int p5)
    {
        CharSequence[] v4_1 = p4.getTextArray(p5);
        java.util.HashSet v5_2 = new java.util.HashSet();
        int v0 = v4_1.length;
        int v1 = 0;
        while (v1 < v0) {
            v5_2.add(v4_1[v1].toString());
            v1++;
        }
        return v5_2;
    }
}
