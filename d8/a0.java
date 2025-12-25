package d8;
public abstract class a0 extends l7.a implements l7.e {
    public static final d8.z b;

    static a0()
    {
        d8.a0.b = new d8.z(l7.d.a, new d8.y(0));
        return;
    }

    public a0()
    {
        super(l7.d.a);
        return;
    }

    public final l7.f get(l7.g p4)
    {
        kotlin.jvm.internal.j.e(p4, "key");
        if (!(p4 instanceof d8.z)) {
            if (l7.d.a == p4) {
                return this;
            }
        } else {
            l7.d v0_3 = this.a;
            if ((v0_3 != ((d8.z) p4)) && (((d8.z) p4).b != v0_3)) {
                return 0;
            } else {
                l7.f v4_3 = ((l7.f) ((d8.z) p4).a.invoke(this));
                if (v4_3 != null) {
                    return v4_3;
                }
            }
        }
        return 0;
    }

    public abstract void i();

    public final l7.h minusKey(l7.g p3)
    {
        kotlin.jvm.internal.j.e(p3, "key");
        if (!(p3 instanceof d8.z)) {
            if (l7.d.a != p3) {
                return this;
            }
        } else {
            l7.d v0_3 = this.a;
            if ((v0_3 != ((d8.z) p3)) && (((d8.z) p3).b != v0_3)) {
                return this;
            } else {
                if (((l7.f) ((d8.z) p3).a.invoke(this)) == null) {
                    return this;
                }
            }
        }
        return l7.i.a;
    }

    public boolean s(l7.h p1)
    {
        return ((this instanceof d8.c2) ^ 1);
    }

    public String toString()
    {
        String v0_1 = new StringBuilder();
        v0_1.append(this.getClass().getSimpleName());
        v0_1.append(64);
        v0_1.append(d8.f0.j(this));
        return v0_1.toString();
    }

    public d8.a0 x(int p2)
    {
        i8.a.a(p2);
        return new i8.g(this, p2);
    }
}
