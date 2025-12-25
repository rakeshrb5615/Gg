package l;
public final class j {
    public final java.util.ArrayList a;
    public long b;
    public android.view.animation.Interpolator c;
    public q0.u0 d;
    public boolean e;
    public final l.i f;

    public j()
    {
        this.b = -1;
        this.f = new l.i(this);
        this.a = new java.util.ArrayList();
        return;
    }

    public final void a()
    {
        if (this.e) {
            java.util.ArrayList v0_1 = this.a;
            int v1 = v0_1.size();
            int v3 = 0;
            while (v3 < v1) {
                q0.t0 v4_0 = v0_1.get(v3);
                v3++;
                ((q0.t0) v4_0).b();
            }
            this.e = 0;
            return;
        } else {
            return;
        }
    }

    public final void b()
    {
        if (!this.e) {
            int v0_1 = this.a;
            int v1 = v0_1.size();
            int v2 = 0;
            while (v2 < v1) {
                android.view.ViewPropertyAnimator v3_0 = v0_1.get(v2);
                v2++;
                android.view.ViewPropertyAnimator v3_1 = ((q0.t0) v3_0);
                l.i v4_0 = this.b;
                if (v4_0 >= 0) {
                    v3_1.c(v4_0);
                }
                l.i v4_1 = this.c;
                if (v4_1 != null) {
                    android.view.ViewPropertyAnimator v5_2 = ((android.view.View) v3_1.a.get());
                    if (v5_2 != null) {
                        v5_2.animate().setInterpolator(v4_1);
                    }
                }
                if (this.d != null) {
                    v3_1.d(this.f);
                }
                android.view.ViewPropertyAnimator v3_4 = ((android.view.View) v3_1.a.get());
                if (v3_4 != null) {
                    v3_4.animate().start();
                }
            }
            this.e = 1;
            return;
        } else {
            return;
        }
    }
}
