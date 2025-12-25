package s8;
public final class g implements q8.d {
    public final q8.d a;
    public final q8.d b;

    public g(q8.d p2, q8.d p3)
    {
        kotlin.jvm.internal.j.e(p2, "keyDesc");
        kotlin.jvm.internal.j.e(p3, "valueDesc");
        this.a = p2;
        this.b = p3;
        return;
    }

    public final int a(String p3)
    {
        kotlin.jvm.internal.j.e(p3, "name");
        IllegalArgumentException v0_1 = b8.p.q0(p3);
        if (v0_1 == null) {
            throw new IllegalArgumentException(p3.concat(" is not a valid map index"));
        } else {
            return v0_1.intValue();
        }
    }

    public final String b()
    {
        return "kotlin.collections.LinkedHashMap";
    }

    public final q4.b c()
    {
        return q8.f.h;
    }

    public final int d()
    {
        return 2;
    }

    public final String e(int p1)
    {
        return String.valueOf(p1);
    }

    public final boolean equals(Object p3)
    {
        if ((this == p3) || (((p3 instanceof s8.g)) && ((kotlin.jvm.internal.j.a(this.a, ((s8.g) p3).a)) && (kotlin.jvm.internal.j.a(this.b, ((s8.g) p3).b))))) {
            return 1;
        } else {
            return 0;
        }
    }

    public final boolean g()
    {
        return 0;
    }

    public final java.util.List getAnnotations()
    {
        return i7.n.a;
    }

    public final java.util.List h(int p3)
    {
        if (p3 < null) {
            throw new IllegalArgumentException(v1.a.j("Illegal index ", p3, ", kotlin.collections.LinkedHashMap expects only non-negative indices").toString());
        } else {
            return i7.n.a;
        }
    }

    public final int hashCode()
    {
        return (this.b.hashCode() + ((this.a.hashCode() + 710441009) * 31));
    }

    public final q8.d i(int p3)
    {
        if (p3 < null) {
            throw new IllegalArgumentException(v1.a.j("Illegal index ", p3, ", kotlin.collections.LinkedHashMap expects only non-negative indices").toString());
        } else {
            IllegalStateException v3_1 = (p3 % 2);
            if (v3_1 == null) {
                return this.a;
            } else {
                if (v3_1 != 1) {
                    throw new IllegalStateException("Unreached");
                } else {
                    return this.b;
                }
            }
        }
    }

    public final boolean isInline()
    {
        return 0;
    }

    public final boolean j(int p3)
    {
        if (p3 < null) {
            throw new IllegalArgumentException(v1.a.j("Illegal index ", p3, ", kotlin.collections.LinkedHashMap expects only non-negative indices").toString());
        } else {
            return 0;
        }
    }

    public final String toString()
    {
        String v0_2 = new StringBuilder("kotlin.collections.LinkedHashMap(");
        v0_2.append(this.a);
        v0_2.append(", ");
        v0_2.append(this.b);
        v0_2.append(41);
        return v0_2.toString();
    }
}
