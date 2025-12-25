package v3;
public final class c implements v3.d {
    public final float a;

    public c(float p1)
    {
        this.a = p1;
        return;
    }

    public final float a(android.graphics.RectF p3)
    {
        return c4.b.g(this.a, 0, Math.min((p3.width() / 1073741824), (p3.height() / 1073741824)));
    }

    public final boolean equals(Object p4)
    {
        if (this != p4) {
            if ((p4 instanceof v3.c)) {
                if (this.a != ((v3.c) p4).a) {
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
}
