package s1;
public abstract class e {
    public s1.c a;
    public boolean b;

    public final void a()
    {
        androidx.fragment.app.a1 v0_0 = this.a;
        if (v0_0 == null) {
            throw new IllegalStateException("This input is not added to any dispatcher.");
        } else {
            if (!this.b) {
                v0_0.c(this, 0);
            }
            s1.g v1_0 = v0_0.b;
            androidx.fragment.app.a1 v0_1 = v0_0.a;
            v1_0.getClass();
            if ((this.equals(v1_0.h)) && (-1 == v1_0.g)) {
                int v3_3 = v1_0.f;
                if (v3_3 == 0) {
                    v3_3 = v1_0.c(-1);
                }
                v1_0.f = 0;
                v1_0.g = 0;
                v1_0.h = 0;
                if (v3_3 != 0) {
                    androidx.fragment.app.a1 v0_3 = v3_3.d;
                    switch (v0_3.d) {
                        case 0:
                            androidx.fragment.app.a1 v0_5 = ((androidx.fragment.app.b1) v0_3.e);
                            v0_5.x(1);
                            if (!v0_5.h.b) {
                                v0_5.g.c.a();
                            } else {
                                v0_5.N();
                            }
                            break;
                        default:
                            int v6_1;
                            int v3_9 = ((com.chilllive.chillwallpaperproject.MainActivity) v0_3.e);
                            androidx.fragment.app.b1 v5_1 = v3_9.getSupportFragmentManager();
                            int v6_0 = v5_1.d;
                            if (v6_0 == 0) {
                                v6_1 = 0;
                            } else {
                                v6_1 = v6_0.size();
                            }
                            if (v6_1 <= 0) {
                                v0_3.a(0);
                                v3_9.finish();
                            } else {
                                if (v6_1 == 1) {
                                    v3_9.X = 1;
                                    androidx.fragment.app.a1 v0_11 = v3_9.findViewById(2131362494);
                                    v0_11.setVisibility(0);
                                    v0_11.animate().alpha(1065353216).setDuration(400).start();
                                }
                                v5_1.v(new androidx.fragment.app.a1(v5_1, -1, 0), 0);
                            }
                    }
                } else {
                    ((c.v) v0_1.b).a.run();
                }
                androidx.fragment.app.a1 v0_20 = v1_0.a;
                v0_20.getClass();
                v0_20.e(0, s1.g.b);
            }
            this.b = 0;
            return;
        }
    }

    public void b(boolean p1)
    {
        return;
    }
}
