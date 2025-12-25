package i7;
public final class s extends i7.d implements java.util.RandomAccess {
    public final Object[] a;
    public final int b;
    public int c;
    public int d;

    public s(Object[] p3, int p4)
    {
        this.a = p3;
        if (p4 < null) {
            throw new IllegalArgumentException(g2.g.c(p4, "ring buffer filled size should not be negative but it is ").toString());
        } else {
            if (p4 > p3.length) {
                IllegalArgumentException v4_1 = v1.a.p("ring buffer filled size: ", p4, " cannot be larger than the buffer size: ");
                v4_1.append(p3.length);
                throw new IllegalArgumentException(v4_1.toString().toString());
            } else {
                this.b = p3.length;
                this.d = p4;
                return;
            }
        }
    }

    public final int b()
    {
        return this.d;
    }

    public final void c()
    {
        if (20 > this.d) {
            int v0_7 = new StringBuilder("n shouldn\'t be greater than the buffer size: n = 20, size = ");
            v0_7.append(this.d);
            throw new IllegalArgumentException(v0_7.toString().toString());
        } else {
            int v0_2 = this.c;
            int v3 = this.b;
            int v2_1 = ((v0_2 + 20) % v3);
            Object[] v4 = this.a;
            if (v0_2 <= v2_1) {
                i7.h.d0(v4, v0_2, v2_1);
            } else {
                i7.h.d0(v4, v0_2, v3);
                i7.h.d0(v4, 0, v2_1);
            }
            this.c = v2_1;
            this.d = (this.d - 20);
            return;
        }
    }

    public final Object get(int p5)
    {
        int v0_0 = this.b();
        if ((p5 < null) || (p5 >= v0_0)) {
            throw new IndexOutOfBoundsException(v1.a.i("index: ", p5, v0_0, ", size: "));
        } else {
            return this.a[((this.c + p5) % this.b)];
        }
    }

    public final java.util.Iterator iterator()
    {
        return new b8.b(this);
    }

    public final Object[] toArray()
    {
        Object[] v0_1 = new Object[this.b()];
        return this.toArray(v0_1);
    }

    public final Object[] toArray(Object[] p7)
    {
        kotlin.jvm.internal.j.e(p7, "array");
        int v1_4 = this.d;
        if (p7.length < v1_4) {
            p7 = java.util.Arrays.copyOf(p7, v1_4);
            kotlin.jvm.internal.j.d(p7, "copyOf(...)");
        }
        int v0_3 = this.d;
        int v1_0 = this.c;
        int v2 = 0;
        int v3 = 0;
        while(true) {
            Object v4_0 = this.a;
            if ((v3 >= v0_3) || (v1_0 >= this.b)) {
                break;
            }
            p7[v3] = v4_0[v1_0];
            v3++;
            v1_0++;
        }
        while (v3 < v0_3) {
            p7[v3] = v4_0[v2];
            v3++;
            v2++;
        }
        if (v0_3 < p7.length) {
            p7[v0_3] = 0;
        }
        return p7;
    }
}
