package h;
public class h0 {
    public static final Class[] b;
    public static final int[] c;
    public static final int[] d;
    public static final int[] e;
    public static final int[] f;
    public static final String[] g;
    public static final r.j h;
    public final Object[] a;

    static h0()
    {
        h.h0.b = new Class[] {android.content.Context, android.util.AttributeSet});
        h.h0.c = new int[] {16843375});
        h.h0.d = new int[] {16844160});
        h.h0.e = new int[] {16844156});
        h.h0.f = new int[] {16844148});
        h.h0.g = new String[] {"android.widget.", "android.view.", "android.webkit."});
        h.h0.h = new r.j(0);
        return;
    }

    public h0()
    {
        Object[] v0_1 = new Object[2];
        this.a = v0_1;
        return;
    }

    public n.o a(android.content.Context p2, android.util.AttributeSet p3)
    {
        return new n.o(p2, p3);
    }

    public n.q b(android.content.Context p3, android.util.AttributeSet p4)
    {
        return new n.q(p3, p4, 2130968740);
    }

    public n.r c(android.content.Context p3, android.util.AttributeSet p4)
    {
        return new n.r(p3, p4, 2130968770);
    }

    public n.d0 d(android.content.Context p2, android.util.AttributeSet p3)
    {
        return new n.d0(p2, p3);
    }

    public n.b1 e(android.content.Context p2, android.util.AttributeSet p3)
    {
        return new n.b1(p2, p3);
    }

    public final android.view.View f(android.content.Context p3, String p4, String p5)
    {
        r.j v0 = h.h0.h;
        reflect.Constructor v1_1 = ((reflect.Constructor) v0.get(p4));
        if (v1_1 == null) {
            try {
                Class[] v5_3;
                if (p5 == null) {
                    v5_3 = p4;
                } else {
                    v5_3 = p5.concat(p4);
                }
            } catch (Exception) {
                return 0;
            }
            v1_1 = Class.forName(v5_3, 0, p3.getClassLoader()).asSubclass(android.view.View).getConstructor(h.h0.b);
            v0.put(p4, v1_1);
        }
        v1_1.setAccessible(1);
        return ((android.view.View) v1_1.newInstance(this.a));
    }
}
