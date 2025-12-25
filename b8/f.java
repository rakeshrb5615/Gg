package b8;
public final class f extends i7.a {
    public final synthetic b8.g a;

    public f(b8.g p1)
    {
        this.a = p1;
        return;
    }

    public final int b()
    {
        return (((java.util.regex.Matcher) this.a.b).groupCount() + 1);
    }

    public final b8.d c(int p4)
    {
        String v0_3 = ((java.util.regex.Matcher) this.a.b);
        y7.e v1_1 = w3.a.f(v0_3.start(p4), v0_3.end(p4));
        if (v1_1.a < 0) {
            return 0;
        } else {
            int v4_2 = v0_3.group(p4);
            kotlin.jvm.internal.j.d(v4_2, "group(...)");
            return new b8.d(v4_2, v1_1);
        }
    }

    public final bridge boolean contains(Object p2)
    {
        boolean v0;
        if (p2) {
            v0 = (p2 instanceof b8.d);
        } else {
            v0 = 1;
        }
        if (v0) {
            return super.contains(((b8.d) p2));
        } else {
            return 0;
        }
    }

    public final boolean isEmpty()
    {
        return 0;
    }

    public final java.util.Iterator iterator()
    {
        return new a8.l(new a8.e(new a8.i(new y7.e(0, (this.size() - 1), 1), 3), new a6.i(this, 2), 1));
    }
}
