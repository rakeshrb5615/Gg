package a2;
public final class s1 {
    public final java.util.ArrayList a;
    public int b;
    public int c;
    public int d;
    public final int e;
    public final synthetic androidx.recyclerview.widget.StaggeredGridLayoutManager f;

    public s1(androidx.recyclerview.widget.StaggeredGridLayoutManager p1, int p2)
    {
        this.f = p1;
        this.a = new java.util.ArrayList();
        this.b = -2147483648;
        this.c = -2147483648;
        this.d = 0;
        this.e = p2;
        return;
    }

    public final void a()
    {
        int v0_0 = this.a;
        int v0_3 = ((android.view.View) v0_0.get((v0_0.size() - 1)));
        a2.p1 v1_3 = ((a2.p1) v0_3.getLayoutParams());
        this.c = this.f.r.b(v0_3);
        v1_3.getClass();
        return;
    }

    public final void b()
    {
        this.a.clear();
        this.b = -2147483648;
        this.c = -2147483648;
        this.d = 0;
        return;
    }

    public final int c()
    {
        int v1_1 = this.a;
        if (!this.f.w) {
            return this.e(0, v1_1.size());
        } else {
            return this.e((v1_1.size() - 1), -1);
        }
    }

    public final int d()
    {
        int v1_1 = this.a;
        if (!this.f.w) {
            return this.e((v1_1.size() - 1), -1);
        } else {
            return this.e(0, v1_1.size());
        }
    }

    public final int e(int p12, int p13)
    {
        int v5;
        androidx.recyclerview.widget.StaggeredGridLayoutManager v0 = this.f;
        int v1_1 = v0.r.k();
        int v2_1 = v0.r.g();
        if (p13 <= p12) {
            v5 = -1;
        } else {
            v5 = 1;
        }
        while (p12 != p13) {
            int v10;
            android.view.View v6_2 = ((android.view.View) this.a.get(p12));
            int v7_1 = v0.r.e(v6_2);
            int v8_1 = v0.r.b(v6_2);
            int v9 = 0;
            if (v7_1 > v2_1) {
                v10 = 0;
            } else {
                v10 = 1;
            }
            if (v8_1 >= v1_1) {
                v9 = 1;
            }
            if ((v10 == 0) || ((v9 == 0) || ((v7_1 >= v1_1) && (v8_1 <= v2_1)))) {
                p12 += v5;
            } else {
                return a2.t0.G(v6_2);
            }
        }
        return -1;
    }

    public final int f(int p3)
    {
        int v0_0 = this.c;
        if (v0_0 == -2147483648) {
            if (this.a.size() != 0) {
                this.a();
                return this.c;
            } else {
                return p3;
            }
        } else {
            return v0_0;
        }
    }

    public final android.view.View g(int p7, int p8)
    {
        androidx.recyclerview.widget.StaggeredGridLayoutManager v1 = this.f;
        java.util.ArrayList v2 = this.a;
        int v3 = 0;
        if (p8 != -1) {
            int v8_1 = (v2.size() - 1);
            while (v8_1 >= 0) {
                int v0_2 = ((android.view.View) v2.get(v8_1));
                if (((v1.w) && (a2.t0.G(v0_2) >= p7)) || (((!v1.w) && (a2.t0.G(v0_2) <= p7)) || (!v0_2.hasFocusable()))) {
                    break;
                }
                v8_1--;
                v3 = v0_2;
            }
            return v3;
        } else {
            int v8_2 = v2.size();
            int v0_3 = 0;
            while (v0_3 < v8_2) {
                boolean v4_6 = ((android.view.View) v2.get(v0_3));
                if (((v1.w) && (a2.t0.G(v4_6) <= p7)) || (((!v1.w) && (a2.t0.G(v4_6) >= p7)) || (!v4_6.hasFocusable()))) {
                    break;
                }
                v0_3++;
                v3 = v4_6;
            }
            return v3;
        }
    }

    public final int h(int p3)
    {
        a2.p1 v0_0 = this.b;
        if (v0_0 == -2147483648) {
            a2.p1 v0_3 = this.a;
            if (v0_3.size() != 0) {
                int v3_1 = ((android.view.View) v0_3.get(0));
                a2.p1 v0_2 = ((a2.p1) v3_1.getLayoutParams());
                this.b = this.f.r.e(v3_1);
                v0_2.getClass();
                return this.b;
            } else {
                return p3;
            }
        } else {
            return v0_0;
        }
    }
}
