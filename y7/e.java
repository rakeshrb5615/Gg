package y7;
public final class e extends y7.d {
    public static final y7.e d;

    static e()
    {
        y7.e.d = new y7.e(1, 0, 1);
        return;
    }

    public final boolean equals(Object p3)
    {
        if ((!(p3 instanceof y7.e)) || (((!this.isEmpty()) || (!((y7.e) p3).isEmpty())) && ((this.a != ((y7.e) p3).a) || (this.b != ((y7.e) p3).b)))) {
            return 0;
        } else {
            return 1;
        }
    }

    public final int hashCode()
    {
        if (!this.isEmpty()) {
            return ((this.a * 31) + this.b);
        } else {
            return -1;
        }
    }

    public final boolean isEmpty()
    {
        if (this.a <= this.b) {
            return 0;
        } else {
            return 1;
        }
    }

    public final String toString()
    {
        String v0_1 = new StringBuilder();
        v0_1.append(this.a);
        v0_1.append("..");
        v0_1.append(this.b);
        return v0_1.toString();
    }
}
