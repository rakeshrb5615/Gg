package z6;
public class h implements w6.a0 {

    public h()
    {
        return;
    }

    public final w6.z a(w6.m p2, d7.a p3)
    {
        Class v2_0 = p3.a;
        if ((Enum.isAssignableFrom(v2_0)) && (v2_0 != Enum)) {
            if (!v2_0.isEnum()) {
                v2_0 = v2_0.getSuperclass();
            }
            return new z6.i(v2_0);
        } else {
            return 0;
        }
    }
}
