package androidx.datastore.preferences.protobuf;
public final class b0 {

    public static androidx.datastore.preferences.protobuf.w a(long p2, Object p4)
    {
        androidx.datastore.preferences.protobuf.s0 v0_1 = ((androidx.datastore.preferences.protobuf.w) androidx.datastore.preferences.protobuf.h1.c.h(p2, p4));
        if (!((androidx.datastore.preferences.protobuf.b) v0_1).a) {
            int v1_0;
            androidx.datastore.preferences.protobuf.s0 v0_3 = ((androidx.datastore.preferences.protobuf.s0) v0_1);
            int v1_4 = v0_3.c;
            if (v1_4 != 0) {
                v1_0 = (v1_4 * 2);
            } else {
                v1_0 = 10;
            }
            v0_1 = v0_3.c(v1_0);
            androidx.datastore.preferences.protobuf.h1.o(p4, p2, v0_1);
        }
        return v0_1;
    }
}
