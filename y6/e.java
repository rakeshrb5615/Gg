package y6;
public final class e implements w6.a0, java.lang.Cloneable {
    public static final y6.e c;
    public final java.util.List a;
    public final java.util.List b;

    static e()
    {
        y6.e.c = new y6.e();
        return;
    }

    public e()
    {
        java.util.List v0 = java.util.Collections.EMPTY_LIST;
        this.a = v0;
        this.b = v0;
        return;
    }

    public final w6.z a(w6.m p9, d7.a p10)
    {
        Class v0 = p10.a;
        boolean v5 = this.b(v0, 1);
        boolean v4 = this.b(v0, 0);
        if ((v5) || (v4)) {
            return new y6.d(this, v4, v5, p9, p10);
        } else {
            return 0;
        }
    }

    public final boolean b(Class p2, boolean p3)
    {
        if ((p3) || ((Enum.isAssignableFrom(p2)) || ((reflect.Modifier.isStatic(p2.getModifiers())) || ((!p2.isAnonymousClass()) && (!p2.isLocalClass()))))) {
            ClassCastException v2_2;
            if (!p3) {
                v2_2 = this.b;
            } else {
                v2_2 = this.a;
            }
            ClassCastException v2_3 = v2_2.iterator();
            if (v2_3.hasNext()) {
                throw v1.a.e(v2_3);
            } else {
                return 0;
            }
        } else {
            return 1;
        }
    }

    public final Object clone()
    {
        try {
            return ((y6.e) super.clone());
        } catch (CloneNotSupportedException v0_2) {
            throw new AssertionError(v0_2);
        }
    }
}
