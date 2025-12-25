package a2;
public final class e implements java.lang.Runnable {
    public final synthetic int a;
    public final synthetic java.util.ArrayList b;
    public final synthetic a2.k c;

    public synthetic e(a2.k p1, java.util.ArrayList p2, int p3)
    {
        this.a = p3;
        this.c = p1;
        this.b = p2;
        return;
    }

    public final void run()
    {
        switch (this.a) {
            case 0:
                java.util.ArrayList v0_3 = this.b;
                java.util.ArrayList v1_3 = v0_3.size();
                int v2_2 = 0;
                while(true) {
                    a2.k1 v4_3 = this.c;
                    if (v2_2 >= v1_3) {
                        break;
                    }
                    android.view.ViewPropertyAnimator v3_29 = v0_3.get(v2_2);
                    v2_2++;
                    android.view.ViewPropertyAnimator v3_30 = ((a2.j) v3_29);
                    a2.i v5_3 = v3_30.a;
                    android.view.ViewPropertyAnimator v6_4 = v3_30.b;
                    android.view.View v7_7 = v3_30.c;
                    int v8_7 = v3_30.d;
                    android.view.ViewPropertyAnimator v3_31 = v3_30.e;
                    v4_3.getClass();
                    android.view.View v7_8 = v5_3.a;
                    android.view.ViewPropertyAnimator v6_5 = (v8_7 - v6_4);
                    int v8_8 = (v3_31 - v7_7);
                    if (v6_5 != null) {
                        v7_8.animate().translationX(0);
                    }
                    if (v8_8 != 0) {
                        v7_8.animate().translationY(0);
                    }
                    android.view.ViewPropertyAnimator v9_2 = v7_8.animate();
                    v4_3.p.add(v5_3);
                    v9_2.setDuration(v4_3.e).setListener(new a2.g(v4_3, v5_3, v6_5, v7_8, v8_8, v9_2)).start();
                }
                v0_3.clear();
                v4_3.m.remove(v0_3);
                return;
            case 1:
                java.util.ArrayList v0_2 = this.b;
                java.util.ArrayList v1_2 = v0_2.size();
                int v2_1 = 0;
                while(true) {
                    a2.k1 v4_2 = this.c;
                    if (v2_1 >= v1_2) {
                        break;
                    }
                    android.view.View v7_4;
                    android.view.ViewPropertyAnimator v3_6 = v0_2.get(v2_1);
                    v2_1++;
                    a2.i v5_2 = ((a2.i) v3_6);
                    android.view.ViewPropertyAnimator v9_3 = v4_2.r;
                    android.view.ViewPropertyAnimator v10_2 = v4_2.f;
                    android.view.ViewPropertyAnimator v3_8 = v5_2.a;
                    android.view.ViewPropertyAnimator v6_1 = 0;
                    if (v3_8 != null) {
                        v7_4 = v3_8.a;
                    } else {
                        v7_4 = 0;
                    }
                    android.view.ViewPropertyAnimator v3_10 = v5_2.b;
                    if (v3_10 != null) {
                        v6_1 = v3_10.a;
                    }
                    android.view.View v12 = v6_1;
                    if (v7_4 != null) {
                        android.view.ViewPropertyAnimator v6_2 = v7_4.animate().setDuration(v10_2);
                        v9_3.add(v5_2.a);
                        v6_2.translationX(((float) (v5_2.e - v5_2.c)));
                        v6_2.translationY(((float) (v5_2.f - v5_2.d)));
                        v6_2.alpha(0).setListener(new a2.h(v4_2, v5_2, v6_2, v7_4, 0)).start();
                    }
                    if (v12 != null) {
                        android.view.ViewPropertyAnimator v6_3 = v12.animate();
                        v9_3.add(v5_2.b);
                        v6_3.translationX(0).translationY(0).setDuration(v10_2).alpha(1065353216).setListener(new a2.h(v4_2, v5_2, v6_3, v12, 1)).start();
                    }
                }
                v0_2.clear();
                v4_2.n.remove(v0_2);
                return;
            default:
                java.util.ArrayList v0_1 = this.b;
                java.util.ArrayList v1_0 = v0_1.size();
                int v2_0 = 0;
                while(true) {
                    android.view.ViewPropertyAnimator v3_5 = this.c;
                    if (v2_0 >= v1_0) {
                        break;
                    }
                    a2.k1 v4_0 = v0_1.get(v2_0);
                    v2_0++;
                    a2.k1 v4_1 = ((a2.k1) v4_0);
                    v3_5.getClass();
                    a2.i v5_0 = v4_1.a;
                    android.view.ViewPropertyAnimator v6_0 = v5_0.animate();
                    v3_5.o.add(v4_1);
                    v6_0.alpha(1065353216).setDuration(v3_5.c).setListener(new a2.f(v3_5, v4_1, v5_0, v6_0)).start();
                }
                v0_1.clear();
                v3_5.l.remove(v0_1);
                return;
        }
    }
}
