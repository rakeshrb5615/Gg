package d1;
public final class d extends androidx.datastore.preferences.protobuf.v {
    private static final d1.d DEFAULT_INSTANCE = None;
    private static volatile androidx.datastore.preferences.protobuf.q0 PARSER = None;
    public static final int PREFERENCES_FIELD_NUMBER = 1;
    private androidx.datastore.preferences.protobuf.h0 preferences_;

    static d()
    {
        d1.d v0_1 = new d1.d();
        d1.d.DEFAULT_INSTANCE = v0_1;
        androidx.datastore.preferences.protobuf.v.j(d1.d, v0_1);
        return;
    }

    public d()
    {
        this.preferences_ = androidx.datastore.preferences.protobuf.h0.b;
        return;
    }

    public static androidx.datastore.preferences.protobuf.h0 l(d1.d p2)
    {
        androidx.datastore.preferences.protobuf.h0 v0_0 = p2.preferences_;
        if (!v0_0.a) {
            p2.preferences_ = v0_0.d();
        }
        return p2.preferences_;
    }

    public static d1.b n()
    {
        return ((d1.b) ((androidx.datastore.preferences.protobuf.t) d1.d.DEFAULT_INSTANCE.c(5)));
    }

    public static d1.d o(java.io.FileInputStream p4)
    {
        String v1_1 = new androidx.datastore.preferences.protobuf.i(p4);
        String v4_6 = androidx.datastore.preferences.protobuf.n.a();
        androidx.datastore.preferences.protobuf.z v0_12 = d1.d.DEFAULT_INSTANCE.i();
        try {
            androidx.datastore.preferences.protobuf.u0 v2_1 = androidx.datastore.preferences.protobuf.r0.c;
            v2_1.getClass();
            androidx.datastore.preferences.protobuf.u0 v2_0 = v2_1.a(v0_12.getClass());
            a2.r v3_2 = ((a2.r) v1_1.b);
        } catch (String v4_8) {
            throw new androidx.datastore.preferences.protobuf.z(v4_8.getMessage());
        } catch (String v4_10) {
            if (v4_10.a) {
                v4_10 = new androidx.datastore.preferences.protobuf.z(v4_10.getMessage(), v4_10);
            }
            throw v4_10;
        } catch (String v4_4) {
            if (!(v4_4.getCause() instanceof androidx.datastore.preferences.protobuf.z)) {
                throw new androidx.datastore.preferences.protobuf.z(v4_4.getMessage(), v4_4);
            } else {
                throw ((androidx.datastore.preferences.protobuf.z) v4_4.getCause());
            }
            v2_0.a(v0_12, v3_2, v4_6);
            v2_0.e(v0_12);
            if (!androidx.datastore.preferences.protobuf.v.f(v0_12, 1)) {
                throw new androidx.datastore.preferences.protobuf.z(new androidx.datastore.preferences.protobuf.a1().getMessage());
            } else {
                return ((d1.d) v0_12);
            }
        } catch (String v4_1) {
            if (!(v4_1.getCause() instanceof androidx.datastore.preferences.protobuf.z)) {
                throw v4_1;
            } else {
                throw ((androidx.datastore.preferences.protobuf.z) v4_1.getCause());
            }
        }
        if (v3_2 == null) {
            v3_2 = new a2.r(v1_1);
        } else {
        }
    }

    public final Object c(int p4)
    {
        switch (u.e.c(p4)) {
            case 0:
                return Byte.valueOf(1);
            case 1:
                return 0;
            case 2:
                return new androidx.datastore.preferences.protobuf.t0(d1.d.DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[] {"preferences_", d1.c.a}));
            case 3:
                return new d1.d();
            case 4:
                return new d1.b(d1.d.DEFAULT_INSTANCE);
            case 5:
                return d1.d.DEFAULT_INSTANCE;
            case 6:
                androidx.datastore.preferences.protobuf.u v4_11 = d1.d.PARSER;
                if (v4_11 != null) {
                    return v4_11;
                } else {
                    androidx.datastore.preferences.protobuf.u v4_2 = d1.d.PARSER;
                    if (v4_2 == null) {
                        v4_2 = new androidx.datastore.preferences.protobuf.u();
                        d1.d.PARSER = v4_2;
                    }
                    return v4_2;
                }
            default:
                throw new UnsupportedOperationException();
        }
    }

    public final java.util.Map m()
    {
        return java.util.Collections.unmodifiableMap(this.preferences_);
    }
}
