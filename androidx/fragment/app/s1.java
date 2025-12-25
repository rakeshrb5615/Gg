package androidx.fragment.app;
public final class s1 extends androidx.fragment.app.u1 {

    public static boolean s(android.transition.Transition p1)
    {
        if ((androidx.fragment.app.u1.h(p1.getTargetIds())) && ((androidx.fragment.app.u1.h(p1.getTargetNames())) && (androidx.fragment.app.u1.h(p1.getTargetTypes())))) {
            return 0;
        } else {
            return 1;
        }
    }

    public final void a(android.view.View p1, Object p2)
    {
        ((android.transition.Transition) p2).addTarget(p1);
        return;
    }

    public final void b(Object p4, java.util.ArrayList p5)
    {
        if (((android.transition.Transition) p4) != null) {
            int v1 = 0;
            if (!(((android.transition.Transition) p4) instanceof android.transition.TransitionSet)) {
                if ((!androidx.fragment.app.s1.s(((android.transition.Transition) p4))) && (androidx.fragment.app.u1.h(((android.transition.Transition) p4).getTargets()))) {
                    int v0_1 = p5.size();
                    while (v1 < v0_1) {
                        ((android.transition.Transition) p4).addTarget(((android.view.View) p5.get(v1)));
                        v1++;
                    }
                }
            } else {
                int v0_3 = ((android.transition.TransitionSet) ((android.transition.Transition) p4)).getTransitionCount();
                while (v1 < v0_3) {
                    this.b(((android.transition.TransitionSet) ((android.transition.Transition) p4)).getTransitionAt(v1), p5);
                    v1++;
                }
            }
        }
        return;
    }

    public final void c(android.view.ViewGroup p1, Object p2)
    {
        android.transition.TransitionManager.beginDelayedTransition(p1, ((android.transition.Transition) p2));
        return;
    }

    public final boolean e(Object p1)
    {
        return (p1 instanceof android.transition.Transition);
    }

    public final Object f(Object p1)
    {
        if (p1 == 0) {
            return 0;
        } else {
            return ((android.transition.Transition) p1).clone();
        }
    }

    public final Object i(Object p2, Object p3, Object p4)
    {
        int v2_1 = ((android.transition.Transition) p2);
        if ((((android.transition.Transition) p2) == null) || (((android.transition.Transition) p3) == null)) {
            if (((android.transition.Transition) p2) == null) {
                if (((android.transition.Transition) p3) == null) {
                    v2_1 = 0;
                } else {
                    v2_1 = ((android.transition.Transition) p3);
                }
            }
        } else {
            v2_1 = new android.transition.TransitionSet().addTransition(((android.transition.Transition) p2)).addTransition(((android.transition.Transition) p3)).setOrdering(1);
        }
        if (((android.transition.Transition) p4) == null) {
            return v2_1;
        } else {
            android.transition.TransitionSet v3_4 = new android.transition.TransitionSet();
            if (v2_1 != 0) {
                v3_4.addTransition(v2_1);
            }
            v3_4.addTransition(((android.transition.Transition) p4));
            return v3_4;
        }
    }

    public final Object j(Object p2, Object p3)
    {
        android.transition.TransitionSet v0_1 = new android.transition.TransitionSet();
        if (p2 != null) {
            v0_1.addTransition(((android.transition.Transition) p2));
        }
        v0_1.addTransition(((android.transition.Transition) p3));
        return v0_1;
    }

    public final void k(Object p2, android.view.View p3, java.util.ArrayList p4)
    {
        ((android.transition.Transition) p2).addListener(new androidx.fragment.app.p1(p3, p4));
        return;
    }

    public final void l(Object p7, Object p8, java.util.ArrayList p9, Object p10, java.util.ArrayList p11)
    {
        ((android.transition.Transition) p7).addListener(new androidx.fragment.app.q1(this, p8, p9, p10, p11));
        return;
    }

    public final void m(android.view.View p3, Object p4)
    {
        if (p3 != null) {
            android.graphics.Rect v0_1 = new android.graphics.Rect();
            androidx.fragment.app.u1.g(p3, v0_1);
            ((android.transition.Transition) p4).setEpicenterCallback(new androidx.fragment.app.o1(0, v0_1));
        }
        return;
    }

    public final void n(Object p3, android.graphics.Rect p4)
    {
        ((android.transition.Transition) p3).setEpicenterCallback(new androidx.fragment.app.o1(1, p4));
        return;
    }

    public final void o(Object p1, m0.d p2, androidx.fragment.app.d p3)
    {
        ((android.transition.Transition) p1).addListener(new androidx.fragment.app.r1(p3));
        return;
    }

    public final void p(Object p5, android.view.View p6, java.util.ArrayList p7)
    {
        java.util.List v0 = ((android.transition.TransitionSet) p5).getTargets();
        v0.clear();
        int v1 = p7.size();
        int v2 = 0;
        while (v2 < v1) {
            androidx.fragment.app.u1.d(v0, ((android.view.View) p7.get(v2)));
            v2++;
        }
        v0.add(p6);
        p7.add(p6);
        this.b(((android.transition.TransitionSet) p5), p7);
        return;
    }

    public final void q(Object p2, java.util.ArrayList p3, java.util.ArrayList p4)
    {
        if (((android.transition.TransitionSet) p2) != null) {
            ((android.transition.TransitionSet) p2).getTargets().clear();
            ((android.transition.TransitionSet) p2).getTargets().addAll(p4);
            this.t(((android.transition.TransitionSet) p2), p3, p4);
        }
        return;
    }

    public final Object r(Object p2)
    {
        if (p2 != null) {
            android.transition.TransitionSet v0_1 = new android.transition.TransitionSet();
            v0_1.addTransition(((android.transition.Transition) p2));
            return v0_1;
        } else {
            return 0;
        }
    }

    public final void t(Object p5, java.util.ArrayList p6, java.util.ArrayList p7)
    {
        int v1 = 0;
        if (!(((android.transition.Transition) p5) instanceof android.transition.TransitionSet)) {
            if (!androidx.fragment.app.s1.s(((android.transition.Transition) p5))) {
                android.view.View v0_7 = ((android.transition.Transition) p5).getTargets();
                if ((v0_7 != null) && ((v0_7.size() == p6.size()) && (v0_7.containsAll(p6)))) {
                    android.view.View v0_2;
                    if (p7 != 0) {
                        v0_2 = p7.size();
                    } else {
                        v0_2 = 0;
                    }
                    while (v1 < v0_2) {
                        ((android.transition.Transition) p5).addTarget(((android.view.View) p7.get(v1)));
                        v1++;
                    }
                    int v7_2 = (p6.size() - 1);
                    while (v7_2 >= 0) {
                        ((android.transition.Transition) p5).removeTarget(((android.view.View) p6.get(v7_2)));
                        v7_2--;
                    }
                }
            }
        } else {
            android.view.View v0_5 = ((android.transition.TransitionSet) ((android.transition.Transition) p5)).getTransitionCount();
            while (v1 < v0_5) {
                this.t(((android.transition.TransitionSet) ((android.transition.Transition) p5)).getTransitionAt(v1), p6, p7);
                v1++;
            }
        }
        return;
    }
}
