package v3;
public final class m implements v3.d {
    public final float a;

    public m(float p1)
    {
        this.a = p1;
        return;
    }

    public final float a(android.graphics.RectF p2)
    {
        return (Math.min(p2.width(), p2.height()) * this.a);
    }

    public final boolean equals(Object p4)
    {
        if (this != p4) {
            if ((p4 instanceof v3.m)) {
                if (this.a != ((v3.m) p4).a) {
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
        v0_1.append(((int) (this.a * 1120403456)));
        v0_1.append("%");
        return v0_1.toString();
    }
}
