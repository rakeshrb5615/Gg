package y7;
public class d implements java.lang.Iterable, v7.a {
    public final int a;
    public final int b;
    public final int c;

    public d(int p2, int p3, int p4)
    {
        if (p4 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        } else {
            if (p4 == -2147483648) {
                throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
            } else {
                this.a = p2;
                this.b = c4.b.D(p2, p3, p4);
                this.c = p4;
                return;
            }
        }
    }

    public boolean equals(Object p3)
    {
        if ((!(p3 instanceof y7.d)) || (((!this.isEmpty()) || (!((y7.d) p3).isEmpty())) && ((this.a != ((y7.d) p3).a) || ((this.b != ((y7.d) p3).b) || (this.c != ((y7.d) p3).c))))) {
            return 0;
        } else {
            return 1;
        }
    }

    public int hashCode()
    {
        if (!this.isEmpty()) {
            return ((((this.a * 31) + this.b) * 31) + this.c);
        } else {
            return -1;
        }
    }

    public boolean isEmpty()
    {
        int v3 = this.b;
        int v4 = this.a;
        if (this.c <= 0) {
            if (v4 >= v3) {
                return 0;
            } else {
                return 1;
            }
        } else {
            if (v4 <= v3) {
                return 0;
            } else {
                return 1;
            }
        }
    }

    public final java.util.Iterator iterator()
    {
        return new y7.b(this.a, this.b, this.c);
    }

    public String toString()
    {
        StringBuilder v4_0;
        int v1 = this.b;
        String v2_1 = this.a;
        int v3 = this.c;
        StringBuilder v4_1 = new StringBuilder;
        if (v3 <= 0) {
            v4_0 = v4_1();
            v4_0.append(v2_1);
            v4_0.append(" downTo ");
            v4_0.append(v1);
            v4_0.append(" step ");
            v4_0.append((- v3));
        } else {
            v4_0 = v4_1();
            v4_0.append(v2_1);
            v4_0.append("..");
            v4_0.append(v1);
            v4_0.append(" step ");
            v4_0.append(v3);
        }
        return v4_0.toString();
    }
}
