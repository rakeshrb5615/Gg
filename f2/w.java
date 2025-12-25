package f2;
public abstract class w {
    public static final f2.a a;
    public static final ThreadLocal b;
    public static final java.util.ArrayList c;

    static w()
    {
        java.util.ArrayList v0_1 = new f2.a();
        v0_1.I = 0;
        v0_1.M(new f2.h(2));
        v0_1.M(new f2.f());
        v0_1.M(new f2.h(1));
        f2.w.a = v0_1;
        f2.w.b = new ThreadLocal();
        f2.w.c = new java.util.ArrayList();
        return;
    }

    public static void a(android.view.ViewGroup p4, f2.s p5)
    {
        f2.v v0_0 = f2.w.c;
        if ((v0_0.contains(p4)) || (!p4.isLaidOut())) {
            return;
        } else {
            v0_0.add(p4);
            if (p5 == null) {
                p5 = f2.w.a;
            }
            f2.s v5_1 = p5.m();
            f2.v v0_3 = ((java.util.ArrayList) f2.w.b().get(p4));
            if ((v0_3 != null) && (v0_3.size() > 0)) {
                int v1_2 = v0_3.size();
                int v2 = 0;
                while (v2 < v1_2) {
                    f2.s v3_0 = v0_3.get(v2);
                    v2++;
                    ((f2.s) v3_0).z(p4);
                }
            }
            v5_1.k(p4, 1);
            if (p4.getTag(2131362549) != null) {
                throw new ClassCastException();
            } else {
                p4.setTag(2131362549, 0);
                f2.v v0_7 = new f2.v();
                v0_7.a = v5_1;
                v0_7.b = p4;
                p4.addOnAttachStateChangeListener(v0_7);
                p4.getViewTreeObserver().addOnPreDrawListener(v0_7);
                return;
            }
        }
    }

    public static r.e b()
    {
        ThreadLocal v0 = f2.w.b;
        r.e v1_2 = ((ref.WeakReference) v0.get());
        if (v1_2 != null) {
            r.e v1_4 = ((r.e) v1_2.get());
            if (v1_4 != null) {
                return v1_4;
            }
        }
        r.e v1_0 = new r.e(0);
        v0.set(new ref.WeakReference(v1_0));
        return v1_0;
    }
}
