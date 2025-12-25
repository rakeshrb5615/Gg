package androidx.datastore.preferences.protobuf;
public final class n {
    public static volatile androidx.datastore.preferences.protobuf.n a;
    public static final androidx.datastore.preferences.protobuf.n b;

    static n()
    {
        androidx.datastore.preferences.protobuf.n.b = new androidx.datastore.preferences.protobuf.n();
        return;
    }

    public static androidx.datastore.preferences.protobuf.n a()
    {
        androidx.datastore.preferences.protobuf.n v0_0 = androidx.datastore.preferences.protobuf.n.a;
        if (v0_0 != null) {
            return v0_0;
        } else {
            androidx.datastore.preferences.protobuf.n v0_4 = androidx.datastore.preferences.protobuf.n.a;
            if (v0_4 == null) {
                Class v2 = androidx.datastore.preferences.protobuf.m.a;
                androidx.datastore.preferences.protobuf.n v3 = 0;
                try {
                    if (v2 != null) {
                        v3 = ((androidx.datastore.preferences.protobuf.n) v2.getDeclaredMethod("getEmptyRegistry", 0).invoke(0, 0));
                    }
                } catch (Exception) {
                }
                if (v3 == null) {
                    v0_4 = androidx.datastore.preferences.protobuf.n.b;
                } else {
                    v0_4 = v3;
                }
                androidx.datastore.preferences.protobuf.n.a = v0_4;
            }
            return v0_4;
        }
    }
}
