package s8;
public class m implements q8.d, s8.b {
    public final String a;
    public final s8.e b;
    public final int c;
    public int d;
    public final String[] e;
    public final java.util.List[] f;
    public final boolean[] g;
    public Object h;
    public final Object i;
    public final Object j;
    public final Object k;

    public m(String p3, s8.e p4, int p5)
    {
        this.a = p3;
        this.b = p4;
        this.c = p5;
        this.d = -1;
        h7.d v3_14 = new String[p5];
        int v0 = 0;
        while (v0 < p5) {
            v3_14[v0] = "[UNINITIALIZED]";
            v0++;
        }
        this.e = v3_14;
        h7.d v3_1 = this.c;
        java.util.List[] v5_1 = new java.util.List[v3_1];
        this.f = v5_1;
        h7.d v3_2 = new boolean[v3_1];
        this.g = v3_2;
        this.h = i7.o.a;
        this.i = a.a.E(new s8.l(this, 0));
        this.j = a.a.E(new e.e(this));
        this.k = a.a.E(new s8.l(this, 1));
        return;
    }

    public final int a(String p2)
    {
        kotlin.jvm.internal.j.e(p2, "name");
        int v2_3 = ((Integer) this.h.get(p2));
        if (v2_3 == 0) {
            return -3;
        } else {
            return v2_3.intValue();
        }
    }

    public final String b()
    {
        return this.a;
    }

    public final q4.b c()
    {
        return q8.f.f;
    }

    public final int d()
    {
        return this.c;
    }

    public final String e(int p2)
    {
        return this.e[p2];
    }

    public boolean equals(Object p6)
    {
        if (this != p6) {
            if (((p6 instanceof s8.m)) && ((this.a.equals(((q8.d) p6).b())) && (java.util.Arrays.equals(((q8.d[]) this.j.getValue()), ((q8.d[]) ((s8.m) p6).j.getValue()))))) {
                int v2_4 = this.c;
                if (v2_4 == ((q8.d) p6).d()) {
                    int v6_7 = 0;
                    while (v6_7 < v2_4) {
                        if ((kotlin.jvm.internal.j.a(this.i(v6_7).b(), ((q8.d) p6).i(v6_7).b())) && (kotlin.jvm.internal.j.a(this.i(v6_7).c(), ((q8.d) p6).i(v6_7).c()))) {
                            v6_7++;
                        }
                    }
                    return 1;
                }
            }
            return 0;
        }
        return 1;
    }

    public final java.util.Set f()
    {
        return this.h.keySet();
    }

    public final boolean g()
    {
        return 0;
    }

    public final java.util.List getAnnotations()
    {
        return i7.n.a;
    }

    public final java.util.List h(int p2)
    {
        i7.n v2_1 = this.f[p2];
        if (v2_1 == null) {
            v2_1 = i7.n.a;
        }
        return v2_1;
    }

    public int hashCode()
    {
        return ((Number) this.k.getValue()).intValue();
    }

    public final q8.d i(int p2)
    {
        return ((o8.a[]) this.i.getValue())[p2].d();
    }

    public boolean isInline()
    {
        return 0;
    }

    public final boolean j(int p2)
    {
        return this.g[p2];
    }

    public final void k(String p5, boolean p6)
    {
        int v0_1 = (this.d + 1);
        this.d = v0_1;
        String[] v1 = this.e;
        v1[v0_1] = p5;
        this.g[v0_1] = p6;
        this.f[v0_1] = 0;
        if (v0_1 == (this.c - 1)) {
            java.util.HashMap v5_4 = new java.util.HashMap();
            int v6_1 = v1.length;
            int v0_2 = 0;
            while (v0_2 < v6_1) {
                v5_4.put(v1[v0_2], Integer.valueOf(v0_2));
                v0_2++;
            }
            this.h = v5_4;
        }
        return;
    }

    public final String toString()
    {
        return i7.i.c0(w3.a.f(0, this.c), ", ", this.a.concat("("), ")", new a6.i(this, 6), 24);
    }
}
