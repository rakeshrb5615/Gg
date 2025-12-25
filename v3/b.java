package v3;
public final class b implements v3.d {
    public final v3.d a;
    public final float b;

    public b(float p2, v3.d p3)
    {
        while ((p3 instanceof v3.b)) {
            p3 = ((v3.b) p3).a;
            p2 += ((v3.b) p3).b;
        }
        this.a = p3;
        this.b = p2;
        return;
    }

    public final float a(android.graphics.RectF p2)
    {
        return Math.max(0, (this.a.a(p2) + this.b));
    }

    public final boolean equals(Object p5)
    {
        if (this != p5) {
            if ((p5 instanceof v3.b)) {
                if ((!this.a.equals(((v3.b) p5).a)) || (this.b != ((v3.b) p5).b)) {
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
        return java.util.Arrays.hashCode(new Object[] {this.a, Float.valueOf(this.b)}));
    }
}
