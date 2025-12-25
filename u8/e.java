package u8;
public final synthetic class e extends kotlin.jvm.internal.i implements u7.p {

    public final Object invoke(Object p3, Object p4)
    {
        Boolean v3_4;
        int v4_2 = ((Number) p4).intValue();
        kotlin.jvm.internal.j.e(((q8.d) p3), "p0");
        u8.f v0_2 = ((u8.f) this.receiver);
        v0_2.getClass();
        if ((((q8.d) p3).j(v4_2)) || (!((q8.d) p3).i(v4_2).g())) {
            v3_4 = 0;
        } else {
            v3_4 = 1;
        }
        v0_2.b = v3_4;
        return Boolean.valueOf(v3_4);
    }
}
