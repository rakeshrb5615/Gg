package a2;
public abstract class p0 {
    public a2.h0 a;
    public java.util.ArrayList b;
    public long c;
    public long d;
    public long e;
    public long f;

    public static void b(a2.k1 p2)
    {
        if ((!p2.f()) && ((p2.j & 4) == 0)) {
            androidx.recyclerview.widget.RecyclerView v0_2 = p2.r;
            if (v0_2 != null) {
                v0_2.J(p2);
            }
        }
        return;
    }

    public abstract boolean a();

    public final void c(a2.k1 p11)
    {
        String v0_0 = this.a;
        if (v0_0 != null) {
            String v0_1 = v0_0.a;
            int v1_0 = 1;
            p11.n(1);
            android.view.View v2 = p11.a;
            if ((p11.h != null) && (p11.i == null)) {
                p11.h = 0;
            }
            p11.i = 0;
            if ((p11.j & 16) == 0) {
                String v3_2 = v0_1.c;
                v0_1.j0();
                String v4_0 = v0_1.f;
                a2.c v5_1 = ((a2.c) v4_0.d);
                a2.h0 v6_1 = ((a2.h0) v4_0.c);
                int v7_0 = v4_0.b;
                if (v7_0 != 1) {
                    if (v7_0 == 2) {
                        throw new IllegalStateException("Cannot call removeViewIfHidden within removeViewIfHidden");
                    } else {
                        try {
                            v4_0.b = 2;
                            int v7_2 = v6_1.a.indexOfChild(v2);
                        } catch (boolean v11_3) {
                            v4_0.b = 0;
                            throw v11_3;
                        }
                        if (v7_2 != -1) {
                            if (!v5_1.d(v7_2)) {
                                v4_0.b = 0;
                                v1_0 = 0;
                                if (v1_0 != 0) {
                                    String v4_1 = androidx.recyclerview.widget.RecyclerView.M(v2);
                                    v3_2.m(v4_1);
                                    v3_2.j(v4_1);
                                    if (androidx.recyclerview.widget.RecyclerView.G0) {
                                        String v3_6 = new StringBuilder("after removing animated view: ");
                                        v3_6.append(v2);
                                        v3_6.append(", ");
                                        v3_6.append(v0_1);
                                        android.util.Log.d("RecyclerView", v3_6.toString());
                                    }
                                }
                                v0_1.l0((v1_0 ^ 1));
                                if ((v1_0 == 0) && (p11.j())) {
                                    v0_1.removeDetachedView(v2, 0);
                                    return;
                                }
                                return;
                            } else {
                                v5_1.f(v7_2);
                                v4_0.A(v2);
                                v6_1.i(v7_2);
                            }
                        } else {
                            v4_0.A(v2);
                        }
                        v4_0.b = 0;
                    }
                } else {
                    if (((android.view.View) v4_0.f) != v2) {
                        throw new IllegalStateException("Cannot call removeViewIfHidden within removeView(At) for a different view");
                    }
                }
            }
        }
        return;
    }

    public abstract void d();

    public abstract void e();

    public abstract boolean f();
}
