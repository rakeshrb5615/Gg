package s8;
public final class o implements q8.d, s8.b {
    public final q8.d a;
    public final String b;
    public final java.util.Set c;

    public o(q8.d p5)
    {
        java.util.HashSet v5_1;
        kotlin.jvm.internal.j.e(p5, "original");
        this.a = p5;
        java.util.HashSet v0_7 = new StringBuilder();
        v0_7.append(p5.b());
        v0_7.append(63);
        this.b = v0_7.toString();
        kotlin.jvm.internal.j.e(p5, "<this>");
        if (!(p5 instanceof s8.b)) {
            java.util.HashSet v0_5 = new java.util.HashSet(p5.d());
            int v1_1 = p5.d();
            int v2 = 0;
            while (v2 < v1_1) {
                v0_5.add(p5.e(v2));
                v2++;
            }
            v5_1 = v0_5;
        } else {
            v5_1 = ((s8.b) p5).f();
        }
        this.c = v5_1;
        return;
    }

    public final int a(String p2)
    {
        kotlin.jvm.internal.j.e(p2, "name");
        return this.a.a(p2);
    }

    public final String b()
    {
        return this.b;
    }

    public final q4.b c()
    {
        return this.a.c();
    }

    public final int d()
    {
        return this.a.d();
    }

    public final String e(int p2)
    {
        return this.a.e(p2);
    }

    public final boolean equals(Object p4)
    {
        if (this != p4) {
            if ((p4 instanceof s8.o)) {
                if (kotlin.jvm.internal.j.a(this.a, ((s8.o) p4).a)) {
                    return 1;
                } else {
                    return 0;
                }
            } else {
                return 0;
            }
        } else {
            return 1;
        }
    }

    public final java.util.Set f()
    {
        return this.c;
    }

    public final boolean g()
    {
        return 1;
    }

    public final java.util.List getAnnotations()
    {
        return this.a.getAnnotations();
    }

    public final java.util.List h(int p2)
    {
        return this.a.h(p2);
    }

    public final int hashCode()
    {
        return (this.a.hashCode() * 31);
    }

    public final q8.d i(int p2)
    {
        return this.a.i(p2);
    }

    public final boolean isInline()
    {
        return this.a.isInline();
    }

    public final boolean j(int p2)
    {
        return this.a.j(p2);
    }

    public final String toString()
    {
        String v0_1 = new StringBuilder();
        v0_1.append(this.a);
        v0_1.append(63);
        return v0_1.toString();
    }
}
