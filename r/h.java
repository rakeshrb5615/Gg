package r;
public abstract class h {
    public static final Object a;
    public static final Object b;

    static synthetic h()
    {
        r.h.a = new Object();
        r.h.b = new Object();
        return;
    }

    public static final void a(r.f p1, int p2)
    {
        int[] v0 = new int[p2];
        p1.a = v0;
        Object[] v2_1 = new Object[p2];
        p1.b = v2_1;
        return;
    }

    public static final int b(r.f p4, Object p5, int p6)
    {
        boolean v0_0 = p4.c;
        if (v0_0) {
            try {
                int v1_2 = s.a.a(v0_0, p6, p4.a);
            } catch (IndexOutOfBoundsException) {
                throw new java.util.ConcurrentModificationException();
            }
            if ((v1_2 >= 0) && (!kotlin.jvm.internal.j.a(p5, p4.b[v1_2]))) {
                int v2_2 = (v1_2 + 1);
                while ((v2_2 < v0_0) && (p4.a[v2_2] == p6)) {
                    if (!kotlin.jvm.internal.j.a(p5, p4.b[v2_2])) {
                        v2_2++;
                    } else {
                        return v2_2;
                    }
                }
                int v1_0 = (v1_2 - 1);
                while ((v1_0 >= 0) && (p4.a[v1_0] == p6)) {
                    if (!kotlin.jvm.internal.j.a(p5, p4.b[v1_0])) {
                        v1_0--;
                    } else {
                        return v1_0;
                    }
                }
                return (~ v2_2);
            } else {
                return v1_2;
            }
        } else {
            return -1;
        }
    }
}
