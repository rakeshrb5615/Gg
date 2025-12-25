package d3;
public final class b {
    public final r.j a;
    public final r.j b;

    public b()
    {
        this.a = new r.j(0);
        this.b = new r.j(0);
        return;
    }

    public static d3.b a(android.content.Context p3, int p4)
    {
        d3.b v3_6 = android.animation.AnimatorInflater.loadAnimator(p3, p4);
        if (!(v3_6 instanceof android.animation.AnimatorSet)) {
            if (v3_6 == null) {
                return 0;
            } else {
                java.util.ArrayList v1_5 = new java.util.ArrayList();
                v1_5.add(v3_6);
                return d3.b.b(v1_5);
            }
        } else {
            return d3.b.b(((android.animation.AnimatorSet) v3_6).getChildAnimations());
        }
    }

    public static d3.b b(java.util.ArrayList p13)
    {
        String v0_1 = new d3.b();
        String v1_1 = p13.size();
        int v3 = 0;
        while (v3 < v1_1) {
            r.j v4_0 = ((android.animation.Animator) p13.get(v3));
            if (!(v4_0 instanceof android.animation.ObjectAnimator)) {
                String v0_3 = new StringBuilder("Animator must be an ObjectAnimator: ");
                v0_3.append(v4_0);
                throw new IllegalArgumentException(v0_3.toString());
            } else {
                r.j v4_1 = ((android.animation.ObjectAnimator) v4_0);
                v0_1.b.put(v4_1.getPropertyName(), v4_1.getValues());
                String v5_2 = v4_1.getPropertyName();
                int v7_1 = v4_1.getStartDelay();
                long v9 = v4_1.getDuration();
                android.animation.TimeInterpolator v11 = v4_1.getInterpolator();
                d3.c v6_2 = new d3.c();
                v6_2.d = 0;
                v6_2.e = 1;
                v6_2.a = v7_1;
                v6_2.b = v9;
                v6_2.c = v11;
                v6_2.d = v4_1.getRepeatCount();
                v6_2.e = v4_1.getRepeatMode();
                v0_1.a.put(v5_2, v6_2);
                v3++;
            }
        }
        return v0_1;
    }

    public final boolean equals(Object p2)
    {
        if (this != p2) {
            if ((p2 instanceof d3.b)) {
                return this.a.equals(((d3.b) p2).a);
            } else {
                return 0;
            }
        } else {
            return 1;
        }
    }

    public final int hashCode()
    {
        return this.a.hashCode();
    }

    public final String toString()
    {
        String v0_1 = new StringBuilder("\n");
        v0_1.append(d3.b.getName());
        v0_1.append(123);
        v0_1.append(Integer.toHexString(System.identityHashCode(this)));
        v0_1.append(" timings: ");
        v0_1.append(this.a);
        v0_1.append("}\n");
        return v0_1.toString();
    }
}
