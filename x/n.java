package x;
public final class n {
    public static int f;
    public java.util.ArrayList a;
    public int b;
    public int c;
    public java.util.ArrayList d;
    public int e;

    public final void a(java.util.ArrayList p6)
    {
        int v0_1 = this.a.size();
        if ((this.e != -1) && (v0_1 > 0)) {
            int v1_0 = 0;
            while (v1_0 < p6.size()) {
                x.n v2_1 = ((x.n) p6.get(v1_0));
                if (this.e == v2_1.b) {
                    this.c(this.c, v2_1);
                }
                v1_0++;
            }
        }
        if (v0_1 == 0) {
            p6.remove(this);
        }
        return;
    }

    public final int b(u.c p9, int p10)
    {
        int v0_0 = this.a;
        int v2 = 0;
        if (v0_0.size() != 0) {
            w.e v1_4 = ((w.e) ((w.d) v0_0.get(0)).T);
            p9.t();
            v1_4.b(p9, 0);
            java.util.ArrayList v3_0 = 0;
            while (v3_0 < v0_0.size()) {
                ((w.d) v0_0.get(v3_0)).b(p9, 0);
                v3_0++;
            }
            if ((p10 == 0) && (v1_4.z0 > 0)) {
                w.j.a(v1_4, p9, v0_0, 0);
            }
            if ((p10 == 1) && (v1_4.A0 > 0)) {
                w.j.a(v1_4, p9, v0_0, 1);
            }
            try {
                p9.p();
            } catch (java.util.ArrayList v3_3) {
                w.c v5_1 = new StringBuilder();
                v5_1.append(v3_3.toString());
                v5_1.append("\n");
                v5_1.append(java.util.Arrays.toString(v3_3.getStackTrace()).replace("[", "   at ").replace(",", "\n   at").replace("]", ""));
                System.err.println(v5_1.toString());
            }
            this.d = new java.util.ArrayList();
            while (v2 < v0_0.size()) {
                java.util.ArrayList v3_14 = ((w.d) v0_0.get(v2));
                a6.e v4_5 = new a6.e();
                new ref.WeakReference(v3_14);
                u.c.n(v3_14.I);
                u.c.n(v3_14.J);
                u.c.n(v3_14.K);
                u.c.n(v3_14.L);
                u.c.n(v3_14.M);
                this.d.add(v4_5);
                v2++;
            }
            int v10_2;
            int v0_2;
            if (p10 != 0) {
                v10_2 = u.c.n(v1_4.J);
                v0_2 = u.c.n(v1_4.L);
                p9.t();
            } else {
                v10_2 = u.c.n(v1_4.I);
                v0_2 = u.c.n(v1_4.K);
                p9.t();
            }
            return (v0_2 - v10_2);
        } else {
            return 0;
        }
    }

    public final void c(int p8, x.n p9)
    {
        int v0 = p9.b;
        java.util.ArrayList v1 = this.a;
        int v2 = v1.size();
        int v3 = 0;
        while (v3 < v2) {
            w.d v4_1 = v1.get(v3);
            v3++;
            w.d v4_0 = ((w.d) v4_1);
            java.util.ArrayList v5 = p9.a;
            if (!v5.contains(v4_0)) {
                v5.add(v4_0);
            }
            if (p8 != 0) {
                v4_0.o0 = v0;
            } else {
                v4_0.n0 = v0;
            }
        }
        this.e = v0;
        return;
    }

    public final String toString()
    {
        String v1_0;
        String v0_1 = new StringBuilder();
        String v1_4 = this.c;
        if (v1_4 != null) {
            if (v1_4 != 1) {
                if (v1_4 != 2) {
                    v1_0 = "Unknown";
                } else {
                    v1_0 = "Both";
                }
            } else {
                v1_0 = "Vertical";
            }
        } else {
            v1_0 = "Horizontal";
        }
        v0_1.append(v1_0);
        v0_1.append(" [");
        v0_1.append(this.b);
        v0_1.append("] <");
        String v0_2 = v0_1.toString();
        String v1_5 = this.a;
        int v2_0 = v1_5.size();
        int v3 = 0;
        while (v3 < v2_0) {
            w.d v4_0 = v1_5.get(v3);
            v3++;
            w.d v4_1 = ((w.d) v4_0);
            StringBuilder v5_1 = new StringBuilder();
            v5_1.append(v0_2);
            v5_1.append(" ");
            v5_1.append(v4_1.h0);
            v0_2 = v5_1.toString();
        }
        return g2.g.d(v0_2, " >");
    }
}
