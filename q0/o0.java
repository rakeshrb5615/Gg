package q0;
public abstract class o0 {

    public static String[] a(android.view.View p0)
    {
        return p0.getReceiveContentMimeTypes();
    }

    public static q0.g b(android.view.View p1, q0.g p2)
    {
        q0.c v0_2 = p2.a.d();
        java.util.Objects.requireNonNull(v0_2);
        int v1_2 = p1.performReceiveContent(v0_2);
        if (v1_2 != 0) {
            if (v1_2 != v0_2) {
                return new q0.g(new q0.c(v1_2));
            } else {
                return p2;
            }
        } else {
            return 0;
        }
    }
}
