package androidx.datastore.preferences.protobuf;
public final class d0 implements androidx.datastore.preferences.protobuf.k0 {
    public androidx.datastore.preferences.protobuf.k0[] a;

    public final androidx.datastore.preferences.protobuf.t0 a(Class p6)
    {
        UnsupportedOperationException v0_0 = this.a;
        int v2 = 0;
        while (v2 < v0_0.length) {
            androidx.datastore.preferences.protobuf.k0 v3 = v0_0[v2];
            if (!v3.b(p6)) {
                v2++;
            } else {
                return v3.a(p6);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(p6.getName()));
    }

    public final boolean b(Class p6)
    {
        androidx.datastore.preferences.protobuf.k0[] v0 = this.a;
        int v3 = 0;
        while (v3 < v0.length) {
            if (!v0[v3].b(p6)) {
                v3++;
            } else {
                return 1;
            }
        }
        return 0;
    }
}
