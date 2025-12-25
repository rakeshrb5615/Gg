package v3;
public final class a implements v3.d {
    public final float a;

    public a(float p1)
    {
        this.a = p1;
        return;
    }

    public final float a(android.graphics.RectF p1)
    {
        return this.a;
    }

    public final boolean equals(Object p4)
    {
        if (this != p4) {
            if ((p4 instanceof v3.a)) {
                if (this.a != ((v3.a) p4).a) {
                    return 0;
                } else {
                    return 1;
                }
            } else {
                return 0;
            }
        } else {
            return 1;
        }
    }

    public final int hashCode()
    {
        return java.util.Arrays.hashCode(new Object[] {Float.valueOf(this.a)}));
    }

    public final String toString()
    {
        String v0_1 = new StringBuilder();
        v0_1.append(this.a);
        v0_1.append("px");
        return v0_1.toString();
    }
}
