package androidx.fragment.app;
public final class j extends androidx.fragment.app.i {
    public final Object c;
    public final boolean d;
    public final Object e;

    public j(androidx.fragment.app.y1 p3, m0.d p4, boolean p5, boolean p6)
    {
        Object v4_1;
        androidx.fragment.app.e0 v0 = p3.c;
        super(p3, p4);
        if (p3.a != 2) {
            if (!p5) {
                v4_1 = v0.getExitTransition();
            } else {
                v4_1 = v0.getReturnTransition();
            }
        } else {
            if (!p5) {
                v4_1 = v0.getEnterTransition();
            } else {
                v4_1 = v0.getReenterTransition();
            }
        }
        Object v3_2;
        super.c = v4_1;
        if (p3.a != 2) {
            v3_2 = 1;
        } else {
            if (!p5) {
                v3_2 = v0.getAllowEnterTransitionOverlap();
            } else {
                v3_2 = v0.getAllowReturnTransitionOverlap();
            }
        }
        Object v3_3;
        super.d = v3_2;
        if (!p6) {
            v3_3 = 0;
        } else {
            if (!p5) {
                v3_3 = v0.getSharedElementEnterTransition();
            } else {
                v3_3 = v0.getSharedElementReturnTransition();
            }
        }
        super.e = v3_3;
        return;
    }

    public final androidx.fragment.app.u1 c()
    {
        String v0_0 = this.c;
        IllegalArgumentException v1_1 = this.d(v0_0);
        Object v2 = this.e;
        String v3_4 = this.d(v2);
        if ((v1_1 != null) && ((v3_4 != null) && (v1_1 != v3_4))) {
            IllegalArgumentException v1_0 = new StringBuilder("Mixing framework transitions and AndroidX transitions is not allowed. Fragment ");
            v1_0.append(this.a.c);
            v1_0.append(" returned Transition ");
            v1_0.append(v0_0);
            v1_0.append(" which uses a different Transition  type than its shared element transition ");
            v1_0.append(v2);
            throw new IllegalArgumentException(v1_0.toString().toString());
        } else {
            if (v1_1 != null) {
                return v1_1;
            } else {
                return v3_4;
            }
        }
    }

    public final androidx.fragment.app.u1 d(Object p4)
    {
        if (p4 != null) {
            if (!(p4 instanceof android.transition.Transition)) {
                IllegalArgumentException v0_2 = androidx.fragment.app.n1.b;
                if ((v0_2 == null) || (!v0_2.e(p4))) {
                    StringBuilder v1_1 = new StringBuilder("Transition ");
                    v1_1.append(p4);
                    v1_1.append(" for fragment ");
                    v1_1.append(this.a.c);
                    v1_1.append(" is not a valid framework Transition or AndroidX Transition");
                    throw new IllegalArgumentException(v1_1.toString());
                } else {
                    return v0_2;
                }
            } else {
                return androidx.fragment.app.n1.a;
            }
        } else {
            return 0;
        }
    }
}
