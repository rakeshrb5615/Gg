package androidx.datastore.preferences.protobuf;
public final class i0 {

    public static androidx.datastore.preferences.protobuf.h0 a(Object p1, Object p2)
    {
        androidx.datastore.preferences.protobuf.h0 v1_1 = ((androidx.datastore.preferences.protobuf.h0) p1);
        if (!((androidx.datastore.preferences.protobuf.h0) p2).isEmpty()) {
            if (!((androidx.datastore.preferences.protobuf.h0) p1).a) {
                v1_1 = ((androidx.datastore.preferences.protobuf.h0) p1).d();
            }
            v1_1.b();
            if (!((androidx.datastore.preferences.protobuf.h0) p2).isEmpty()) {
                v1_1.putAll(((androidx.datastore.preferences.protobuf.h0) p2));
            }
        }
        return v1_1;
    }
}
