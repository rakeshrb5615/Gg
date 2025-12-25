package androidx.preference;
public class Preference implements java.lang.Comparable {
    public final android.content.Context a;
    public final int b;
    public final CharSequence c;
    public final CharSequence d;
    public final String e;
    public final Object f;
    public t1.a m;

    public Preference(android.content.Context p3, android.util.AttributeSet p4)
    {
        this(p3, p4, g0.b.b(p3, 2130969647, 16842894));
        return;
    }

    public Preference(android.content.Context p4, android.util.AttributeSet p5, int p6)
    {
        this.b = 2147483647;
        this.a = p4;
        android.content.res.TypedArray v4_1 = p4.obtainStyledAttributes(p5, t1.b.f, p6, 0);
        v4_1.getResourceId(23, v4_1.getResourceId(0, 0));
        int v5_10 = v4_1.getString(26);
        if (v5_10 == 0) {
            v5_10 = v4_1.getString(6);
        }
        this.e = v5_10;
        int v5_13 = v4_1.getText(34);
        if (v5_13 == 0) {
            v5_13 = v4_1.getText(4);
        }
        this.c = v5_13;
        int v5_16 = v4_1.getText(33);
        if (v5_16 == 0) {
            v5_16 = v4_1.getText(7);
        }
        this.d = v5_16;
        this.b = v4_1.getInt(28, v4_1.getInt(8, 2147483647));
        if (v4_1.getString(22) == null) {
            v4_1.getString(13);
        }
        v4_1.getResourceId(27, v4_1.getResourceId(3, 2131558527));
        v4_1.getResourceId(35, v4_1.getResourceId(9, 0));
        v4_1.getBoolean(21, v4_1.getBoolean(2, 1));
        int v5_32 = v4_1.getBoolean(30, v4_1.getBoolean(5, 1));
        v4_1.getBoolean(29, v4_1.getBoolean(1, 1));
        if (v4_1.getString(19) == null) {
            v4_1.getString(10);
        }
        v4_1.getBoolean(16, v4_1.getBoolean(16, v5_32));
        v4_1.getBoolean(17, v4_1.getBoolean(17, v5_32));
        if (!v4_1.hasValue(18)) {
            if (v4_1.hasValue(11)) {
                this.f = this.c(v4_1, 11);
            }
        } else {
            this.f = this.c(v4_1, 18);
        }
        v4_1.getBoolean(31, v4_1.getBoolean(12, 1));
        if (v4_1.hasValue(32)) {
            v4_1.getBoolean(32, v4_1.getBoolean(14, 1));
        }
        v4_1.getBoolean(24, v4_1.getBoolean(15, 0));
        v4_1.getBoolean(25, v4_1.getBoolean(25, 1));
        v4_1.getBoolean(20, v4_1.getBoolean(20, 0));
        v4_1.recycle();
        return;
    }

    public CharSequence a()
    {
        CharSequence v0_0 = this.m;
        if (v0_0 == null) {
            return this.d;
        } else {
            return v0_0.d(this);
        }
    }

    public void b()
    {
        return;
    }

    public Object c(android.content.res.TypedArray p1, int p2)
    {
        return 0;
    }

    public final int compareTo(Object p3)
    {
        String v0_0 = ((androidx.preference.Preference) p3).b;
        int v3_6 = ((androidx.preference.Preference) p3).c;
        int v1_1 = this.b;
        if (v1_1 == v0_0) {
            String v0_2 = this.c;
            if (v0_2 != v3_6) {
                if (v0_2 != null) {
                    if (v3_6 != 0) {
                        return v0_2.toString().compareToIgnoreCase(v3_6.toString());
                    } else {
                        return -1;
                    }
                } else {
                    return 1;
                }
            } else {
                return 0;
            }
        } else {
            return (v1_1 - v0_0);
        }
    }

    public final String toString()
    {
        String v0_1 = new StringBuilder();
        int v1_2 = this.c;
        if (!android.text.TextUtils.isEmpty(v1_2)) {
            v0_1.append(v1_2);
            v0_1.append(32);
        }
        int v1_0 = this.a();
        if (!android.text.TextUtils.isEmpty(v1_0)) {
            v0_1.append(v1_0);
            v0_1.append(32);
        }
        if (v0_1.length() > 0) {
            v0_1.setLength((v0_1.length() - 1));
        }
        return v0_1.toString();
    }
}
