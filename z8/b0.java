package z8;
public final class b0 extends z8.z0 {
    public final reflect.Method d;
    public final int e;
    public final z8.m f;

    public b0(reflect.Method p1, int p2, z8.m p3)
    {
        this.d = p1;
        this.e = p2;
        this.f = p3;
        return;
    }

    public final void a(z8.n0 p6, Object p7)
    {
        int v1 = this.e;
        reflect.Method v2 = this.d;
        if (p7 == null) {
            String v7_3 = new Object[0];
            throw z8.z0.n(v2, v1, "Body parameter value must not be null.", v7_3);
        } else {
            try {
                p6.k = ((okhttp3.RequestBody) this.f.e(p7));
                return;
            } catch (IllegalArgumentException v6_1) {
                StringBuilder v3_3 = new StringBuilder("Unable to convert ");
                v3_3.append(p7);
                v3_3.append(" to RequestBody");
                Object[] v0_1 = new Object[0];
                throw z8.z0.o(v2, v6_1, v1, v3_3.toString(), v0_1);
            }
        }
    }
}
