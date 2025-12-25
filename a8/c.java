package a8;
public final class c implements a8.f {
    public final a8.f a;
    public final int b;

    public c(a8.f p2, int p3)
    {
        kotlin.jvm.internal.j.e(p2, "sequence");
        this.a = p2;
        this.b = p3;
        if (p3 < null) {
            String v2_4 = new StringBuilder("count must be non-negative, but was ");
            v2_4.append(p3);
            v2_4.append(46);
            throw new IllegalArgumentException(v2_4.toString().toString());
        } else {
            return;
        }
    }

    public final java.util.Iterator iterator()
    {
        return new a8.b(this);
    }
}
