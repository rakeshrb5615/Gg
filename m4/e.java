package m4;
public final class e {
    public final Object a;
    public final Object b;
    public final Object c;

    public e(Object p1, Object p2, Object p3)
    {
        this.a = p1;
        this.b = p2;
        this.c = p3;
        return;
    }

    public final IllegalArgumentException a()
    {
        String v1_2 = new StringBuilder("Multiple entries with same key: ");
        Object v2_2 = this.a;
        v1_2.append(v2_2);
        v1_2.append("=");
        v1_2.append(this.b);
        v1_2.append(" and ");
        v1_2.append(v2_2);
        v1_2.append("=");
        v1_2.append(this.c);
        return new IllegalArgumentException(v1_2.toString());
    }
}
