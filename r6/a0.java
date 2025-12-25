package r6;
public final class a0 {
    public static final r6.z Companion;
    public final int a;
    public final String b;

    static a0()
    {
        r6.a0.Companion = new r6.z();
        return;
    }

    public synthetic a0(int p3, int p4, String p5)
    {
        if (3 != (p3 & 3)) {
            s8.k.a(p3, 3, r6.y.a.d());
            throw 0;
        } else {
            this.a = p4;
            this.b = p5;
            return;
        }
    }

    public a0(int p2, String p3)
    {
        kotlin.jvm.internal.j.e(p3, "uuid");
        this.a = p2;
        this.b = p3;
        return;
    }

    public final boolean equals(Object p5)
    {
        if (this != p5) {
            if ((p5 instanceof r6.a0)) {
                if (this.a == ((r6.a0) p5).a) {
                    if (kotlin.jvm.internal.j.a(this.b, ((r6.a0) p5).b)) {
                        return 1;
                    } else {
                        return 0;
                    }
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

    public final int hashCode()
    {
        return (this.b.hashCode() + (Integer.hashCode(this.a) * 31));
    }

    public final String toString()
    {
        String v0_2 = new StringBuilder("ProcessData(pid=");
        v0_2.append(this.a);
        v0_2.append(", uuid=");
        v0_2.append(this.b);
        v0_2.append(41);
        return v0_2.toString();
    }
}
