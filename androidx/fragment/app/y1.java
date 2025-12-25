package androidx.fragment.app;
public final class y1 {
    public int a;
    public int b;
    public final androidx.fragment.app.e0 c;
    public final java.util.ArrayList d;
    public final java.util.LinkedHashSet e;
    public boolean f;
    public boolean g;
    public final androidx.fragment.app.j1 h;

    public y1(int p3, int p4, androidx.fragment.app.j1 p5, m0.d p6)
    {
        g2.g.j(p3, "finalState");
        g2.g.j(p4, "lifecycleImpact");
        androidx.fragment.app.e0 v0_2 = p5.c;
        kotlin.jvm.internal.j.d(v0_2, "fragmentStateManager.fragment");
        g2.g.j(p3, "finalState");
        g2.g.j(p4, "lifecycleImpact");
        kotlin.jvm.internal.j.e(v0_2, "fragment");
        this.a = p3;
        this.b = p4;
        this.c = v0_2;
        this.d = new java.util.ArrayList();
        this.e = new java.util.LinkedHashSet();
        p6.a(new androidx.fragment.app.z1(this));
        this.h = p5;
        return;
    }

    public final void a()
    {
        if (!this.f) {
            this.f = 1;
            if (!this.e.isEmpty()) {
                java.util.Iterator v1_3 = this.e;
                kotlin.jvm.internal.j.e(v1_3, "<this>");
                java.util.Iterator v1_0 = new java.util.LinkedHashSet(v1_3).iterator();
                while (v1_0.hasNext()) {
                    m0.d v2_4 = ((m0.d) v1_0.next());
                    if (!v2_4.a) {
                        v2_4.a = 1;
                        v2_4.c = 1;
                        m0.c v3_1 = v2_4.b;
                        if (v3_1 != null) {
                            try {
                                v3_1.onCancel();
                            } catch (Throwable v0_2) {
                                v2_4.c = 0;
                                v2_4.notifyAll();
                                throw v0_2;
                            }
                            v2_4.c = 0;
                            v2_4.notifyAll();
                        }
                        try {
                        } catch (Throwable v0_4) {
                            throw v0_4;
                        }
                    } else {
                    }
                }
            } else {
                this.b();
                return;
            }
        }
        return;
    }

    public final void b()
    {
        if (!this.g) {
            if (androidx.fragment.app.b1.H(2)) {
                java.util.ArrayList v0_8 = new StringBuilder("SpecialEffectsController: ");
                v0_8.append(this);
                v0_8.append(" has called complete.");
                android.util.Log.v("FragmentManager", v0_8.toString());
            }
            this.g = 1;
            java.util.ArrayList v0_3 = this.d;
            int v1_2 = v0_3.size();
            int v2 = 0;
            while (v2 < v1_2) {
                Runnable v3_0 = v0_3.get(v2);
                v2++;
                ((Runnable) v3_0).run();
            }
        }
        this.h.k();
        return;
    }

    public final void c(int p7, int p8)
    {
        g2.g.j(p7, "finalState");
        g2.g.j(p8, "lifecycleImpact");
        String v8_8 = u.e.c(p8);
        androidx.fragment.app.e0 v1 = this.c;
        if (v8_8 == null) {
            if (this.a != 1) {
                if (androidx.fragment.app.b1.H(2)) {
                    String v8_4 = new StringBuilder("SpecialEffectsController: For fragment ");
                    v8_4.append(v1);
                    v8_4.append(" mFinalState = ");
                    v8_4.append(v1.a.y(this.a));
                    v8_4.append(" -> ");
                    v8_4.append(v1.a.y(p7));
                    v8_4.append(46);
                    android.util.Log.v("FragmentManager", v8_4.toString());
                }
                this.a = p7;
            }
        } else {
            if (v8_8 == 1) {
                if (this.a == 1) {
                    if (androidx.fragment.app.b1.H(2)) {
                        String v7_4 = new StringBuilder("SpecialEffectsController: For fragment ");
                        v7_4.append(v1);
                        v7_4.append(" mFinalState = REMOVED -> VISIBLE. mLifecycleImpact = ");
                        v7_4.append(v1.a.x(this.b));
                        v7_4.append(" to ADDING.");
                        android.util.Log.v("FragmentManager", v7_4.toString());
                    }
                    this.a = 2;
                    this.b = 2;
                    return;
                }
            } else {
                if (v8_8 == 2) {
                    if (androidx.fragment.app.b1.H(2)) {
                        String v7_8 = new StringBuilder("SpecialEffectsController: For fragment ");
                        v7_8.append(v1);
                        v7_8.append(" mFinalState = ");
                        v7_8.append(v1.a.y(this.a));
                        v7_8.append(" -> REMOVED. mLifecycleImpact  = ");
                        v7_8.append(v1.a.x(this.b));
                        v7_8.append(" to REMOVING.");
                        android.util.Log.v("FragmentManager", v7_8.toString());
                    }
                    this.a = 1;
                    this.b = 3;
                    return;
                }
            }
        }
        return;
    }

    public final void d()
    {
        float v0_0 = this.b;
        String v5_4 = this.h;
        if (v0_0 != 2) {
            if (v0_0 == 3) {
                float v0_4 = v5_4.c;
                kotlin.jvm.internal.j.d(v0_4, "fragmentStateManager.fragment");
                android.view.View v4_0 = v0_4.requireView();
                kotlin.jvm.internal.j.d(v4_0, "fragment.requireView()");
                if (androidx.fragment.app.b1.H(2)) {
                    StringBuilder v3_2 = new StringBuilder("Clearing focus ");
                    v3_2.append(v4_0.findFocus());
                    v3_2.append(" on view ");
                    v3_2.append(v4_0);
                    v3_2.append(" for Fragment ");
                    v3_2.append(v0_4);
                    android.util.Log.v("FragmentManager", v3_2.toString());
                }
                v4_0.clearFocus();
            }
            return;
        } else {
            float v0_2 = v5_4.c;
            kotlin.jvm.internal.j.d(v0_2, "fragmentStateManager.fragment");
            android.view.View v4_2 = v0_2.mView.findFocus();
            if (v4_2 != null) {
                v0_2.setFocusedView(v4_2);
                if (androidx.fragment.app.b1.H(2)) {
                    StringBuilder v3_6 = new StringBuilder("requestFocus: Saved focused view ");
                    v3_6.append(v4_2);
                    v3_6.append(" for Fragment ");
                    v3_6.append(v0_2);
                    android.util.Log.v("FragmentManager", v3_6.toString());
                }
            }
            String v1_3 = this.c.requireView();
            kotlin.jvm.internal.j.d(v1_3, "this.fragment.requireView()");
            if (v1_3.getParent() == null) {
                v5_4.b();
                v1_3.setAlpha(0);
            }
            if ((v1_3.getAlpha() == 0) && (v1_3.getVisibility() == 0)) {
                v1_3.setVisibility(4);
            }
            v1_3.setAlpha(v0_2.getPostOnViewCreatedAlpha());
            return;
        }
    }

    public final String toString()
    {
        String v0_3 = v1.a.q("Operation {", Integer.toHexString(System.identityHashCode(this)), "} {finalState = ");
        v0_3.append(v1.a.y(this.a));
        v0_3.append(" lifecycleImpact = ");
        v0_3.append(v1.a.x(this.b));
        v0_3.append(" fragment = ");
        v0_3.append(this.c);
        v0_3.append(125);
        return v0_3.toString();
    }
}
