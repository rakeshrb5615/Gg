package a8;
public abstract class h extends a.a {

    public static java.util.List X(a8.f p2)
    {
        kotlin.jvm.internal.j.e(p2, "<this>");
        java.util.List v2_3 = p2.iterator();
        if (v2_3.hasNext()) {
            Object v0_4 = v2_3.next();
            if (v2_3.hasNext()) {
                java.util.ArrayList v1_2 = new java.util.ArrayList();
                v1_2.add(v0_4);
                while (v2_3.hasNext()) {
                    v1_2.add(v2_3.next());
                }
                return v1_2;
            } else {
                return a.a.G(v0_4);
            }
        } else {
            return i7.n.a;
        }
    }
}
