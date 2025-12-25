package i5;
public final class h {
    public static final i5.h c;
    public final int a;
    public final int b;

    static h()
    {
        i5.h.c = new i5.h(0, 0);
        return;
    }

    public h(int p1, int p2)
    {
        this.a = p1;
        this.b = p2;
        return;
    }

    public final String toString()
    {
        String v0_1 = new StringBuilder();
        v0_1.append(i5.h.getSimpleName());
        v0_1.append("[position = ");
        v0_1.append(this.a);
        v0_1.append(", length = ");
        v0_1.append(this.b);
        v0_1.append("]");
        return v0_1.toString();
    }
}
