package a2;
public final class y {
    public boolean a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public java.util.List k;
    public boolean l;

    public final void a(android.view.View p8)
    {
        int v0_1 = this.k.size();
        android.view.View v1 = 0;
        int v2 = 2147483647;
        int v3 = 0;
        while (v3 < v0_1) {
            android.view.View v4_1 = ((a2.k1) this.k.get(v3)).a;
            int v5_1 = ((a2.u0) v4_1.getLayoutParams());
            if ((v4_1 != p8) && (!v5_1.a.h())) {
                int v5_5 = ((v5_1.a.b() - this.d) * this.e);
                if ((v5_5 >= 0) && (v5_5 < v2)) {
                    v1 = v4_1;
                    if (v5_5 == 0) {
                        break;
                    }
                    v2 = v5_5;
                }
            }
            v3++;
        }
        if (v1 != null) {
            this.d = ((a2.u0) v1.getLayoutParams()).a.b();
            return;
        } else {
            this.d = -1;
            return;
        }
    }

    public final android.view.View b(a2.z0 p5)
    {
        int v0_0 = this.k;
        if (v0_0 == 0) {
            int v5_3 = p5.d(this.d);
            this.d = (this.d + this.e);
            return v5_3;
        } else {
            int v5_1 = v0_0.size();
            int v0_1 = 0;
            while (v0_1 < v5_1) {
                android.view.View v1_3 = ((a2.k1) this.k.get(v0_1)).a;
                int v2_1 = ((a2.u0) v1_3.getLayoutParams());
                if ((v2_1.a.h()) || (this.d != v2_1.a.b())) {
                    v0_1++;
                } else {
                    this.a(v1_3);
                    return v1_3;
                }
            }
            return 0;
        }
    }
}
