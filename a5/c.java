package a5;
public final class c {
    public final String a;
    public final java.util.Set b;
    public final java.util.Set c;
    public final int d;
    public final int e;
    public final a5.f f;
    public final java.util.Set g;

    public c(String p1, java.util.Set p2, java.util.Set p3, int p4, int p5, a5.f p6, java.util.Set p7)
    {
        this.a = p1;
        this.b = java.util.Collections.unmodifiableSet(p2);
        this.c = java.util.Collections.unmodifiableSet(p3);
        this.d = p4;
        this.e = p5;
        this.f = p6;
        this.g = java.util.Collections.unmodifiableSet(p7);
        return;
    }

    public static a5.b a(a5.x p2)
    {
        a5.x[] v1_1 = new a5.x[0];
        return new a5.b(p2, v1_1);
    }

    public static a5.b b(Class p2)
    {
        Class[] v1_1 = new Class[0];
        return new a5.b(p2, v1_1);
    }

    public static varargs a5.c c(Object p10, Class p11, Class[] p12)
    {
        java.util.HashSet v0_1 = new java.util.HashSet();
        java.util.HashSet v1_1 = new java.util.HashSet();
        java.util.HashSet v9_1 = new java.util.HashSet();
        v0_1.add(a5.x.a(p11));
        int v11_3 = p12.length;
        a5.c v2_0 = 0;
        while (v2_0 < v11_3) {
            int v3_1 = p12[v2_0];
            q4.b.f(v3_1, "Null interface");
            v0_1.add(a5.x.a(v3_1));
            v2_0++;
        }
        return new a5.c(0, new java.util.HashSet(v0_1), new java.util.HashSet(v1_1), 0, 0, new a5.a(p10, 0), v9_1);
    }

    public final String toString()
    {
        String v0_1 = new StringBuilder("Component<");
        v0_1.append(java.util.Arrays.toString(this.b.toArray()));
        v0_1.append(">{");
        v0_1.append(this.d);
        v0_1.append(", type=");
        v0_1.append(this.e);
        v0_1.append(", deps=");
        v0_1.append(java.util.Arrays.toString(this.c.toArray()));
        v0_1.append("}");
        return v0_1.toString();
    }
}
