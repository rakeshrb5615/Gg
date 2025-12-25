package r;
public final class k implements java.lang.Cloneable {
    public synthetic int[] a;
    public synthetic Object[] b;
    public synthetic int c;

    public k()
    {
        int v1 = 4;
        while(true) {
            int v3_0 = 40;
            if (v1 < 32) {
                int v2_3 = ((1 << v1) - 12);
                if (40 <= v2_3) {
                    break;
                }
                v1++;
            }
            int v3_1 = (v3_0 / 4);
            Object[] v0_1 = new int[v3_1];
            this.a = v0_1;
            Object[] v0_2 = new Object[v3_1];
            this.b = v0_2;
            return;
        }
        v3_0 = v2_3;
        v3_1 = (v3_0 / 4);
        v0_1 = new int[v3_1];
        this.a = v0_1;
        v0_2 = new Object[v3_1];
        this.b = v0_2;
        return;
    }

    public final void a(int p7, Object p8)
    {
        int v0_0 = this.c;
        if ((v0_0 == 0) || (p7 > this.a[(v0_0 - 1)])) {
            if (v0_0 >= this.a.length) {
                int v1_1 = ((v0_0 + 1) * 4);
                int v4_0 = 4;
                while (v4_0 < 32) {
                    int v5_2 = ((1 << v4_0) - 12);
                    if (v1_1 > v5_2) {
                        v4_0++;
                    } else {
                        v1_1 = v5_2;
                        break;
                    }
                }
                int v1_3 = (v1_1 / 4);
                Object[] v3_2 = java.util.Arrays.copyOf(this.a, v1_3);
                kotlin.jvm.internal.j.d(v3_2, "copyOf(...)");
                this.a = v3_2;
                int v1_4 = java.util.Arrays.copyOf(this.b, v1_3);
                kotlin.jvm.internal.j.d(v1_4, "copyOf(...)");
                this.b = v1_4;
            }
            this.a[v0_0] = p7;
            this.b[v0_0] = p8;
            this.c = (v0_0 + 1);
            return;
        } else {
            this.d(p7, p8);
            return;
        }
    }

    public final Object b(int p3)
    {
        int v3_2 = s.a.a(this.c, p3, this.a);
        if (v3_2 >= 0) {
            int v3_3 = this.b[v3_2];
            if (v3_3 != r.h.b) {
                return v3_3;
            }
        }
        return 0;
    }

    public final Object clone()
    {
        r.k v0_0 = super.clone();
        kotlin.jvm.internal.j.c(v0_0, "null cannot be cast to non-null type androidx.collection.SparseArrayCompat<E of androidx.collection.SparseArrayCompat>");
        r.k v0_1 = ((r.k) v0_0);
        v0_1.a = ((int[]) this.a.clone());
        v0_1.b = ((Object[]) this.b.clone());
        return v0_1;
    }

    public final void d(int p7, Object p8)
    {
        int v0_1 = s.a.a(this.c, p7, this.a);
        if (v0_1 < 0) {
            int v0_2 = (~ v0_1);
            int v1_9 = this.c;
            if (v0_2 < v1_9) {
                Object[] v2_9 = this.b;
                if (v2_9[v0_2] == r.h.b) {
                    this.a[v0_2] = p7;
                    v2_9[v0_2] = p8;
                    return;
                }
            }
            if (v1_9 >= this.a.length) {
                int v1_2 = ((v1_9 + 1) * 4);
                int v4_1 = 4;
                while (v4_1 < 32) {
                    int v5_2 = ((1 << v4_1) - 12);
                    if (v1_2 > v5_2) {
                        v4_1++;
                    } else {
                        v1_2 = v5_2;
                        break;
                    }
                }
                int v1_3 = (v1_2 / 4);
                Object[] v2_4 = java.util.Arrays.copyOf(this.a, v1_3);
                kotlin.jvm.internal.j.d(v2_4, "copyOf(...)");
                this.a = v2_4;
                int v1_4 = java.util.Arrays.copyOf(this.b, v1_3);
                kotlin.jvm.internal.j.d(v1_4, "copyOf(...)");
                this.b = v1_4;
            }
            int v1_5 = this.c;
            if ((v1_5 - v0_2) != 0) {
                int v4_3 = (v0_2 + 1);
                i7.h.X(v4_3, v0_2, v1_5, this.a, this.a);
                i7.h.Z(this.b, v4_3, this.b, v0_2, this.c);
            }
            this.a[v0_2] = p7;
            this.b[v0_2] = p8;
            this.c = (this.c + 1);
            return;
        } else {
            this.b[v0_1] = p8;
            return;
        }
    }

    public final Object e(int p3)
    {
        Object[] v0 = this.b;
        if (p3 >= v0.length) {
            throw new ArrayIndexOutOfBoundsException();
        } else {
            return v0[p3];
        }
    }

    public final String toString()
    {
        String v0_0 = this.c;
        if (v0_0 > null) {
            String v1_2 = new StringBuilder((v0_0 * 28));
            v1_2.append(123);
            String v0_6 = this.c;
            int v2 = 0;
            while (v2 < v0_6) {
                if (v2 > 0) {
                    v1_2.append(", ");
                }
                v1_2.append(this.a[v2]);
                v1_2.append(61);
                String v3_4 = this.e(v2);
                if (v3_4 == this) {
                    v1_2.append("(this Map)");
                } else {
                    v1_2.append(v3_4);
                }
                v2++;
            }
            v1_2.append(125);
            String v0_2 = v1_2.toString();
            kotlin.jvm.internal.j.d(v0_2, "toString(...)");
            return v0_2;
        } else {
            return "{}";
        }
    }
}
