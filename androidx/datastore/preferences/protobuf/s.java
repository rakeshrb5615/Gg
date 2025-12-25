package androidx.datastore.preferences.protobuf;
public final class s implements androidx.datastore.preferences.protobuf.k0 {
    public static final androidx.datastore.preferences.protobuf.s b;
    public final synthetic int a;

    static s()
    {
        androidx.datastore.preferences.protobuf.s.b = new androidx.datastore.preferences.protobuf.s(0);
        return;
    }

    public synthetic s(int p1)
    {
        this.a = p1;
        return;
    }

    public final androidx.datastore.preferences.protobuf.t0 a(Class p4)
    {
        switch (this.a) {
            case 0:
                if (!androidx.datastore.preferences.protobuf.v.isAssignableFrom(p4)) {
                    throw new IllegalArgumentException("Unsupported message type: ".concat(p4.getName()));
                } else {
                    try {
                        return ((androidx.datastore.preferences.protobuf.t0) androidx.datastore.preferences.protobuf.v.d(p4.asSubclass(androidx.datastore.preferences.protobuf.v)).c(3));
                    } catch (Exception v0_7) {
                        throw new RuntimeException("Unable to get message info for ".concat(p4.getName()), v0_7);
                    }
                }
            default:
                throw new IllegalStateException("This should never be called.");
        }
    }

    public final boolean b(Class p2)
    {
        switch (this.a) {
            case 0:
                return androidx.datastore.preferences.protobuf.v.isAssignableFrom(p2);
            default:
                return 0;
        }
    }
}
