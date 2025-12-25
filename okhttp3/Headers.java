package okhttp3;
public final class Headers implements java.lang.Iterable, v7.a {
    public static final okhttp3.Headers$Companion b;
    public static final okhttp3.Headers c;
    public final String[] a;

    static Headers()
    {
        okhttp3.Headers.b = new okhttp3.Headers$Companion(0);
        String[] v1_1 = new String[0];
        okhttp3.Headers.c = new okhttp3.Headers(v1_1);
        return;
    }

    public Headers(String[] p2)
    {
        kotlin.jvm.internal.j.e(p2, "namesAndValues");
        this.a = p2;
        return;
    }

    public final String b(String p5)
    {
        String[] v1 = this.a;
        kotlin.jvm.internal.j.e(v1, "namesAndValues");
        int v0_1 = (v1.length - 2);
        int v2_1 = c4.b.D(v0_1, 0, -2);
        if (v2_1 <= v0_1) {
            while (!p5.equalsIgnoreCase(v1[v0_1])) {
                if (v0_1 != v2_1) {
                    v0_1 -= 2;
                }
            }
            return v1[(v0_1 + 1)];
        }
        return 0;
    }

    public final String c(int p4)
    {
        IndexOutOfBoundsException v0_3 = ((String) i7.h.f0((p4 * 2), this.a));
        if (v0_3 == null) {
            StringBuilder v1_2 = new StringBuilder("name[");
            v1_2.append(p4);
            v1_2.append(93);
            throw new IndexOutOfBoundsException(v1_2.toString());
        } else {
            return v0_3;
        }
    }

    public final okhttp3.Headers$Builder d()
    {
        okhttp3.Headers$Builder v0_1 = new okhttp3.Headers$Builder();
        java.util.ArrayList v2 = v0_1.a;
        kotlin.jvm.internal.j.e(v2, "<this>");
        String[] v3 = this.a;
        kotlin.jvm.internal.j.e(v3, "elements");
        v2.addAll(i7.h.V(v3));
        return v0_1;
    }

    public final String e(int p4)
    {
        IndexOutOfBoundsException v0_4 = ((String) i7.h.f0(((p4 * 2) + 1), this.a));
        if (v0_4 == null) {
            StringBuilder v1_0 = new StringBuilder("value[");
            v1_0.append(p4);
            v1_0.append(93);
            throw new IndexOutOfBoundsException(v1_0.toString());
        } else {
            return v0_4;
        }
    }

    public final boolean equals(Object p2)
    {
        if ((!(p2 instanceof okhttp3.Headers)) || (!java.util.Arrays.equals(this.a, ((okhttp3.Headers) p2).a))) {
            return 0;
        } else {
            return 1;
        }
    }

    public final int hashCode()
    {
        return java.util.Arrays.hashCode(this.a);
    }

    public final java.util.Iterator iterator()
    {
        a8.b v0_0 = this.size();
        h7.f[] v1 = new h7.f[v0_0];
        int v2 = 0;
        while (v2 < v0_0) {
            v1[v2] = new h7.f(this.c(v2), this.e(v2));
            v2++;
        }
        return new a8.b(v1);
    }

    public final int size()
    {
        return (this.a.length / 2);
    }

    public final String toString()
    {
        String v0_1 = new StringBuilder();
        int v1 = this.size();
        int v2 = 0;
        while (v2 < v1) {
            String v3_0 = this.c(v2);
            String v4 = this.e(v2);
            v0_1.append(v3_0);
            v0_1.append(": ");
            if (okhttp3.internal._UtilCommonKt.j(v3_0)) {
                v4 = "\u2588\u2588";
            }
            v0_1.append(v4);
            v0_1.append("\n");
            v2++;
        }
        return v0_1.toString();
    }
}
