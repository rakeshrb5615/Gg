package s1;
public final class k implements android.window.OnBackAnimationCallback {
    public final synthetic s1.l a;

    public k(s1.l p1)
    {
        this.a = p1;
        return;
    }

    public final void onBackCancelled()
    {
        IllegalStateException v0_0 = this.a;
        g8.y v1_0 = v0_0.a;
        if (v1_0 == null) {
            throw new IllegalStateException("This input is not added to any dispatcher.");
        } else {
            if (!v0_0.b) {
                v1_0.c(v0_0, 0);
            }
            g8.y v1_1 = v1_0.b;
            v1_1.getClass();
            if ((v0_0.equals(v1_1.h)) && (-1 == v1_1.g)) {
                s1.g v2_3 = v1_1.f;
                if (v2_3 == null) {
                    v2_3 = v1_1.c(-1);
                }
                v1_1.f = 0;
                v1_1.g = 0;
                v1_1.h = 0;
                if (v2_3 != null) {
                    v2_3.d.getClass();
                }
                g8.y v1_2 = v1_1.a;
                v1_2.getClass();
                v1_2.e(0, s1.g.b);
            }
            v0_0.b = 0;
            return;
        }
    }

    public final void onBackInvoked()
    {
        this.a.a();
        return;
    }

    public final void onBackProgressed(android.window.BackEvent p4)
    {
        kotlin.jvm.internal.j.e(p4, "backEvent");
        int v4_1 = s1.i.a(p4);
        g8.y v0_6 = this.a;
        s1.h v1_3 = v0_6.a;
        if (v1_3 == null) {
            throw new IllegalStateException("This input is not added to any dispatcher.");
        } else {
            if (v0_6.b) {
                s1.h v1_0 = v1_3.b;
                v1_0.getClass();
                if ((v0_6.equals(v1_0.h)) && (-1 == v1_0.g)) {
                    g8.y v0_3 = v1_0.f;
                    if (v0_3 == null) {
                        v0_3 = v1_0.c(-1);
                    }
                    if (v0_3 != null) {
                        v0_3.d.getClass();
                    }
                    g8.y v0_5 = v1_0.a;
                    s1.h v1_2 = new s1.h(v4_1);
                    v0_5.getClass();
                    v0_5.e(0, v1_2);
                }
            }
            return;
        }
    }

    public final void onBackStarted(android.window.BackEvent p4)
    {
        kotlin.jvm.internal.j.e(p4, "backEvent");
        int v4_2 = s1.i.a(p4);
        String v0_1 = this.a;
        s1.c v1 = v0_1.a;
        if (v1 == null) {
            throw new IllegalStateException("This input is not added to any dispatcher.");
        } else {
            if (!v0_1.b) {
                v1.c(v0_1, v4_2);
                v0_1.b = 1;
            }
            return;
        }
    }
}
