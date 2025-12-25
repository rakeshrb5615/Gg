package i8;
public class u {
    public static final synthetic java.util.concurrent.atomic.AtomicIntegerFieldUpdater b;
    private volatile synthetic int _size$volatile;
    public d8.u0[] a;

    static u()
    {
        i8.u.b = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(i8.u, "_size$volatile");
        return;
    }

    public final void a(d8.u0 p5)
    {
        p5.d(((d8.v0) this));
        d8.u0[] v0_3 = this.a;
        java.util.concurrent.atomic.AtomicIntegerFieldUpdater v1 = i8.u.b;
        if (v0_3 != null) {
            if (v1.get(this) >= v0_3.length) {
                d8.u0[] v0_2 = java.util.Arrays.copyOf(v0_3, (v1.get(this) * 2));
                kotlin.jvm.internal.j.d(v0_2, "copyOf(...)");
                v0_3 = ((d8.u0[]) v0_2);
                this.a = v0_3;
            }
        } else {
            v0_3 = new d8.u0[4];
            this.a = v0_3;
        }
        String v2_3 = v1.get(this);
        v1.set(this, (v2_3 + 1));
        v0_3[v2_3] = p5;
        p5.b = v2_3;
        this.c(v2_3);
        return;
    }

    public final d8.u0 b(int p9)
    {
        d8.u0[] v0 = this.a;
        kotlin.jvm.internal.j.b(v0);
        int v1_0 = i8.u.b;
        v1_0.set(this, (v1_0.get(this) + -1));
        if (p9 < v1_0.get(this)) {
            this.d(p9, v1_0.get(this));
            int v2_2 = ((p9 - 1) / 2);
            if (p9 > 0) {
                int v4_0 = v0[p9];
                kotlin.jvm.internal.j.b(v4_0);
                d8.u0 v5_0 = v0[v2_2];
                kotlin.jvm.internal.j.b(v5_0);
                if (v4_0.compareTo(v5_0) < 0) {
                    this.d(p9, v2_2);
                    this.c(v2_2);
                    int v9_2 = v0[v1_0.get(this)];
                    kotlin.jvm.internal.j.b(v9_2);
                    v9_2.d(0);
                    v9_2.b = -1;
                    v0[v1_0.get(this)] = 0;
                    return v9_2;
                }
            }
            while(true) {
                int v2_3 = (p9 * 2);
                int v4_2 = (v2_3 + 1);
                if (v4_2 >= v1_0.get(this)) {
                    break;
                }
                d8.u0 v5_2 = this.a;
                kotlin.jvm.internal.j.b(v5_2);
                int v2_4 = (v2_3 + 2);
                if (v2_4 >= v1_0.get(this)) {
                    v2_4 = v4_2;
                } else {
                    int v6_1 = v5_2[v2_4];
                    kotlin.jvm.internal.j.b(v6_1);
                    d8.u0 v7 = v5_2[v4_2];
                    kotlin.jvm.internal.j.b(v7);
                    if (v6_1.compareTo(v7) >= 0) {
                    }
                }
                int v4_3 = v5_2[p9];
                kotlin.jvm.internal.j.b(v4_3);
                d8.u0 v5_3 = v5_2[v2_4];
                kotlin.jvm.internal.j.b(v5_3);
                if (v4_3.compareTo(v5_3) <= 0) {
                    break;
                }
                this.d(p9, v2_4);
                p9 = v2_4;
            }
        }
        v9_2 = v0[v1_0.get(this)];
        kotlin.jvm.internal.j.b(v9_2);
        v9_2.d(0);
        v9_2.b = -1;
        v0[v1_0.get(this)] = 0;
        return v9_2;
    }

    public final void c(int p4)
    {
        while (p4 > 0) {
            int v0_0 = this.a;
            kotlin.jvm.internal.j.b(v0_0);
            int v1_1 = ((p4 - 1) / 2);
            d8.u0 v2 = v0_0[v1_1];
            kotlin.jvm.internal.j.b(v2);
            int v0_2 = v0_0[p4];
            kotlin.jvm.internal.j.b(v0_2);
            if (v2.compareTo(v0_2) <= 0) {
                break;
            }
            this.d(p4, v1_1);
            p4 = v1_1;
        }
        return;
    }

    public final void d(int p4, int p5)
    {
        d8.u0[] v0 = this.a;
        kotlin.jvm.internal.j.b(v0);
        d8.u0 v1 = v0[p5];
        kotlin.jvm.internal.j.b(v1);
        d8.u0 v2 = v0[p4];
        kotlin.jvm.internal.j.b(v2);
        v0[p4] = v1;
        v0[p5] = v2;
        v1.b = p4;
        v2.b = p5;
        return;
    }
}
