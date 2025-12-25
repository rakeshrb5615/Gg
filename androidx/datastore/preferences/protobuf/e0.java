package androidx.datastore.preferences.protobuf;
public final class e0 {
    public static final androidx.datastore.preferences.protobuf.s b;
    public final Object a;

    static e0()
    {
        androidx.datastore.preferences.protobuf.e0.b = new androidx.datastore.preferences.protobuf.s(1);
        return;
    }

    public e0()
    {
        try {
            java.nio.charset.Charset v1_1 = ((androidx.datastore.preferences.protobuf.k0) Class.forName("androidx.datastore.preferences.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", 0).invoke(0, 0));
        } catch (Exception) {
            v1_1 = androidx.datastore.preferences.protobuf.e0.b;
        }
        androidx.datastore.preferences.protobuf.k0[] v2_1 = new androidx.datastore.preferences.protobuf.k0[2];
        v2_1[0] = androidx.datastore.preferences.protobuf.s.b;
        v2_1[1] = v1_1;
        androidx.datastore.preferences.protobuf.d0 v0_1 = new androidx.datastore.preferences.protobuf.d0();
        v0_1.a = v2_1;
        this.a = v0_1;
        return;
    }

    public e0(androidx.datastore.preferences.protobuf.l p2)
    {
        androidx.datastore.preferences.protobuf.x.a(p2, "output");
        this.a = p2;
        p2.c = this;
        return;
    }

    public void a(int p3, Object p4, androidx.datastore.preferences.protobuf.u0 p5)
    {
        androidx.datastore.preferences.protobuf.l v0_1 = ((androidx.datastore.preferences.protobuf.l) this.a);
        v0_1.K0(p3, 3);
        p5.c(((androidx.datastore.preferences.protobuf.a) p4), v0_1.c);
        v0_1.K0(p3, 4);
        return;
    }
}
