package a2;
public final class k extends a2.p0 {
    public static android.animation.TimeInterpolator s;
    public boolean g;
    public java.util.ArrayList h;
    public java.util.ArrayList i;
    public java.util.ArrayList j;
    public java.util.ArrayList k;
    public java.util.ArrayList l;
    public java.util.ArrayList m;
    public java.util.ArrayList n;
    public java.util.ArrayList o;
    public java.util.ArrayList p;
    public java.util.ArrayList q;
    public java.util.ArrayList r;

    public static void h(java.util.ArrayList p2)
    {
        int v0_1 = (p2.size() - 1);
        while (v0_1 >= 0) {
            ((a2.k1) p2.get(v0_1)).a.animate().cancel();
            v0_1--;
        }
        return;
    }

    public final boolean a(a2.k1 p10, a2.k1 p11, a2.o0 p12, a2.o0 p13)
    {
        int v5;
        int v4;
        int v2 = p12.a;
        int v3 = p12.b;
        if (!p11.o()) {
            v4 = p13.a;
            v5 = p13.b;
        } else {
            v5 = p12.b;
            v4 = p12.a;
        }
        if (p10 != p11) {
            int v10_1 = p10.a;
            a2.i v12_2 = v10_1.getTranslationX();
            float v13_1 = v10_1.getTranslationY();
            float v6 = v10_1.getAlpha();
            this.l(p10);
            int v7_3 = ((int) (((float) (v4 - v2)) - v12_2));
            int v8_3 = ((int) (((float) (v5 - v3)) - v13_1));
            v10_1.setTranslationX(v12_2);
            v10_1.setTranslationY(v13_1);
            v10_1.setAlpha(v6);
            int v10_2 = p11.a;
            this.l(p11);
            v10_2.setTranslationX(((float) (- v7_3)));
            v10_2.setTranslationY(((float) (- v8_3)));
            v10_2.setAlpha(0);
            int v10_3 = this.k;
            a2.i v12_9 = new a2.i();
            v12_9.a = p10;
            v12_9.b = p11;
            v12_9.c = v2;
            v12_9.d = v3;
            v12_9.e = v4;
            v12_9.f = v5;
            v10_3.add(v12_9);
            return 1;
        } else {
            return this.g(p10, v2, v3, v4, v5);
        }
    }

    public final void d(a2.k1 p10)
    {
        java.util.ArrayList v0_0 = this.l;
        int v1_0 = this.m;
        boolean v2_0 = this.n;
        android.view.View v3 = p10.a;
        v3.animate().cancel();
        boolean v4_11 = this.j;
        int v5_0 = (v4_11.size() - 1);
        while (v5_0 >= 0) {
            if (((a2.j) v4_11.get(v5_0)).a == p10) {
                v3.setTranslationY(0);
                v3.setTranslationX(0);
                this.c(p10);
                v4_11.remove(v5_0);
            }
            v5_0--;
        }
        this.j(this.k, p10);
        if (this.h.remove(p10)) {
            v3.setAlpha(1065353216);
            this.c(p10);
        }
        if (this.i.remove(p10)) {
            v3.setAlpha(1065353216);
            this.c(p10);
        }
        boolean v4_6 = (v2_0.size() - 1);
        while (v4_6) {
            int v7_3 = ((java.util.ArrayList) v2_0.get(v4_6));
            this.j(v7_3, p10);
            if (v7_3.isEmpty()) {
                v2_0.remove(v4_6);
            }
            v4_6--;
        }
        boolean v2_2 = (v1_0.size() - 1);
        while (v2_2) {
            boolean v4_10 = ((java.util.ArrayList) v1_0.get(v2_2));
            int v7_1 = (v4_10.size() - 1);
            while (v7_1 >= 0) {
                if (((a2.j) v4_10.get(v7_1)).a != p10) {
                    v7_1--;
                } else {
                    v3.setTranslationY(0);
                    v3.setTranslationX(0);
                    this.c(p10);
                    v4_10.remove(v7_1);
                    if (!v4_10.isEmpty()) {
                        break;
                    }
                    v1_0.remove(v2_2);
                    break;
                }
            }
            v2_2--;
        }
        int v1_2 = (v0_0.size() - 1);
        while (v1_2 >= 0) {
            boolean v2_4 = ((java.util.ArrayList) v0_0.get(v1_2));
            if (v2_4.remove(p10)) {
                v3.setAlpha(1065353216);
                this.c(p10);
                if (v2_4.isEmpty()) {
                    v0_0.remove(v1_2);
                }
            }
            v1_2--;
        }
        this.q.remove(p10);
        this.o.remove(p10);
        this.r.remove(p10);
        this.p.remove(p10);
        this.i();
        return;
    }

    public final void e()
    {
        ClassCastException v0_0 = this.n;
        int v1_0 = this.l;
        java.util.ArrayList v2_0 = this.m;
        int v3_2 = this.k;
        boolean v4_5 = this.i;
        a2.k1 v5_7 = this.h;
        int v6_3 = this.j;
        android.view.View v7_10 = (v6_3.size() - 1);
        while (v7_10 >= null) {
            android.view.View v9_4 = ((a2.j) v6_3.get(v7_10));
            android.view.View v10_1 = v9_4.a.a;
            v10_1.setTranslationY(0);
            v10_1.setTranslationX(0);
            this.c(v9_4.a);
            v6_3.remove(v7_10);
            v7_10--;
        }
        int v6_1 = (v5_7.size() - 1);
        while (v6_1 >= 0) {
            this.c(((a2.k1) v5_7.get(v6_1)));
            v5_7.remove(v6_1);
            v6_1--;
        }
        a2.k1 v5_5 = (v4_5.size() - 1);
        while (v5_5 >= null) {
            android.view.View v7_7 = ((a2.k1) v4_5.get(v5_5));
            v7_7.a.setAlpha(1065353216);
            this.c(v7_7);
            v4_5.remove(v5_5);
            v5_5--;
        }
        boolean v4_3 = (v3_2.size() - 1);
        while (v4_3) {
            a2.k1 v5_4 = ((a2.i) v3_2.get(v4_3));
            android.view.View v7_4 = v5_4.a;
            if (v7_4 != null) {
                this.k(v5_4, v7_4);
            }
            android.view.View v7_5 = v5_4.b;
            if (v7_5 != null) {
                this.k(v5_4, v7_5);
            }
            v4_3--;
        }
        v3_2.clear();
        if (this.f()) {
            int v3_0 = (v2_0.size() - 1);
            while (v3_0 >= 0) {
                boolean v4_2 = ((java.util.ArrayList) v2_0.get(v3_0));
                a2.k1 v5_2 = (v4_2.size() - 1);
                while (v5_2 >= null) {
                    android.view.View v7_1 = ((a2.j) v4_2.get(v5_2));
                    android.view.View v9_1 = v7_1.a.a;
                    v9_1.setTranslationY(0);
                    v9_1.setTranslationX(0);
                    this.c(v7_1.a);
                    v4_2.remove(v5_2);
                    if (v4_2.isEmpty()) {
                        v2_0.remove(v4_2);
                    }
                    v5_2--;
                }
                v3_0--;
            }
            java.util.ArrayList v2_2 = (v1_0.size() - 1);
            while (v2_2 >= null) {
                int v3_7 = ((java.util.ArrayList) v1_0.get(v2_2));
                boolean v4_0 = (v3_7.size() - 1);
                while (v4_0) {
                    a2.k1 v5_11 = ((a2.k1) v3_7.get(v4_0));
                    v5_11.a.setAlpha(1065353216);
                    this.c(v5_11);
                    v3_7.remove(v4_0);
                    if (v3_7.isEmpty()) {
                        v1_0.remove(v3_7);
                    }
                    v4_0--;
                }
                v2_2--;
            }
            int v1_2 = (v0_0.size() - 1);
            while (v1_2 >= 0) {
                java.util.ArrayList v2_4 = ((java.util.ArrayList) v0_0.get(v1_2));
                int v3_5 = (v2_4.size() - 1);
                while (v3_5 >= 0) {
                    boolean v4_7 = ((a2.i) v2_4.get(v3_5));
                    a2.k1 v5_8 = v4_7.a;
                    if (v5_8 != null) {
                        this.k(v4_7, v5_8);
                    }
                    a2.k1 v5_9 = v4_7.b;
                    if (v5_9 != null) {
                        this.k(v4_7, v5_9);
                    }
                    if (v2_4.isEmpty()) {
                        v0_0.remove(v2_4);
                    }
                    v3_5--;
                }
                v1_2--;
            }
            a2.k.h(this.q);
            a2.k.h(this.p);
            a2.k.h(this.o);
            a2.k.h(this.r);
            ClassCastException v0_5 = this.b;
            if (v0_5.size() > 0) {
                v0_5.get(0).getClass();
                throw new ClassCastException();
            } else {
                v0_5.clear();
                return;
            }
        } else {
            return;
        }
    }

    public final boolean f()
    {
        if ((this.i.isEmpty()) && ((this.k.isEmpty()) && ((this.j.isEmpty()) && ((this.h.isEmpty()) && ((this.p.isEmpty()) && ((this.q.isEmpty()) && ((this.o.isEmpty()) && ((this.r.isEmpty()) && ((this.m.isEmpty()) && ((this.l.isEmpty()) && (this.n.isEmpty()))))))))))) {
            return 0;
        } else {
            return 1;
        }
    }

    public final boolean g(a2.k1 p4, int p5, int p6, int p7, int p8)
    {
        java.util.ArrayList v0_0 = p4.a;
        int v5_1 = (p5 + ((int) v0_0.getTranslationX()));
        int v6_1 = (p6 + ((int) p4.a.getTranslationY()));
        this.l(p4);
        a2.j v1_0 = (p7 - v5_1);
        int v2 = (p8 - v6_1);
        if ((v1_0 != null) || (v2 != 0)) {
            if (v1_0 != null) {
                v0_0.setTranslationX(((float) (- v1_0)));
            }
            if (v2 != 0) {
                v0_0.setTranslationY(((float) (- v2)));
            }
            java.util.ArrayList v0_1 = this.j;
            a2.j v1_7 = new a2.j();
            v1_7.a = p4;
            v1_7.b = v5_1;
            v1_7.c = v6_1;
            v1_7.d = p7;
            v1_7.e = p8;
            v0_1.add(v1_7);
            return 1;
        } else {
            this.c(p4);
            return 0;
        }
    }

    public final void i()
    {
        if (this.f()) {
            return;
        } else {
            ClassCastException v0_4 = this.b;
            if (v0_4.size() > 0) {
                v0_4.get(0).getClass();
                throw new ClassCastException();
            } else {
                v0_4.clear();
                return;
            }
        }
    }

    public final void j(java.util.ArrayList p4, a2.k1 p5)
    {
        int v0_1 = (p4.size() - 1);
        while (v0_1 >= 0) {
            a2.i v1_1 = ((a2.i) p4.get(v0_1));
            if ((this.k(v1_1, p5)) && ((v1_1.a == null) && (v1_1.b == null))) {
                p4.remove(v1_1);
            }
            v0_1--;
        }
        return;
    }

    public final boolean k(a2.i p3, a2.k1 p4)
    {
        if (p3.b != p4) {
            if (p3.a != p4) {
                return 0;
            } else {
                p3.a = 0;
            }
        } else {
            p3.b = 0;
        }
        android.view.View v0_1 = p4.a;
        p4.a.setAlpha(1065353216);
        v0_1.setTranslationX(0);
        v0_1.setTranslationY(0);
        this.c(p4);
        return 1;
    }

    public final void l(a2.k1 p3)
    {
        if (a2.k.s == null) {
            a2.k.s = new android.animation.ValueAnimator().getInterpolator();
        }
        p3.a.animate().setInterpolator(a2.k.s);
        this.d(p3);
        return;
    }
}
