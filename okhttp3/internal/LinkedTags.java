package okhttp3.internal;
final class LinkedTags extends okhttp3.internal.Tags {
    public final z7.c a;
    public final Object b;
    public final okhttp3.internal.Tags c;

    public LinkedTags(z7.c p2, Object p3, okhttp3.internal.Tags p4)
    {
        kotlin.jvm.internal.j.e(p2, "key");
        kotlin.jvm.internal.j.e(p3, "value");
        kotlin.jvm.internal.j.e(p4, "next");
        super(0);
        super.a = p2;
        super.b = p3;
        super.c = p4;
        return;
    }

    public final Object a(kotlin.jvm.internal.e p2)
    {
        if (!p2.equals(this.a)) {
            return this.c.a(p2);
        } else {
            return q4.b.u(p2).cast(this.b);
        }
    }

    public final okhttp3.internal.Tags b(kotlin.jvm.internal.e p5, Object p6)
    {
        okhttp3.internal.LinkedTags v0_0 = this.a;
        okhttp3.internal.LinkedTags v2_0 = this.c;
        if (!p5.equals(v0_0)) {
            okhttp3.internal.Tags v1_2 = v2_0.b(p5, 0);
            if (v1_2 != v2_0) {
                v2_0 = new okhttp3.internal.LinkedTags(v0_0, this.b, v1_2);
            } else {
                v2_0 = this;
            }
        }
        if (p6 == null) {
            return v2_0;
        } else {
            return new okhttp3.internal.LinkedTags(p5, p6, v2_0);
        }
    }

    public final String toString()
    {
        String v0_1;
        String v0_5 = a8.h.X(new a8.e(new a8.j(this, 0), new okhttp3.internal.a(0), 0));
        if (v0_5.size() > 1) {
            v0_1 = i7.i.m0(v0_5);
            java.util.Collections.reverse(v0_1);
        } else {
            v0_1 = i7.i.j0(v0_5);
        }
        return i7.i.c0(v0_1, 0, "{", "}", new okhttp3.internal.a(1), 25);
    }
}
