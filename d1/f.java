package d1;
public final class f extends androidx.datastore.preferences.protobuf.v {
    private static final d1.f DEFAULT_INSTANCE = None;
    private static volatile androidx.datastore.preferences.protobuf.q0 PARSER = None;
    public static final int STRINGS_FIELD_NUMBER = 1;
    private androidx.datastore.preferences.protobuf.w strings_;

    static f()
    {
        d1.f v0_1 = new d1.f();
        d1.f.DEFAULT_INSTANCE = v0_1;
        androidx.datastore.preferences.protobuf.v.j(d1.f, v0_1);
        return;
    }

    public f()
    {
        this.strings_ = androidx.datastore.preferences.protobuf.s0.d;
        return;
    }

    public static void l(d1.f p3, java.util.Set p4)
    {
        androidx.datastore.preferences.protobuf.s0 v0_0 = p3.strings_;
        if (!((androidx.datastore.preferences.protobuf.b) v0_0).a) {
            int v1_15;
            androidx.datastore.preferences.protobuf.s0 v0_6 = ((androidx.datastore.preferences.protobuf.s0) v0_0);
            int v1_14 = v0_6.c;
            if (v1_14 != 0) {
                v1_15 = (v1_14 * 2);
            } else {
                v1_15 = 10;
            }
            p3.strings_ = v0_6.c(v1_15);
        }
        NullPointerException v3_1 = p3.strings_;
        if ((v3_1 instanceof java.util.ArrayList)) {
            ((java.util.ArrayList) v3_1).ensureCapacity((p4.size() + ((androidx.datastore.preferences.protobuf.s0) v3_1).c));
        }
        NullPointerException v3_2 = ((androidx.datastore.preferences.protobuf.s0) v3_1);
        androidx.datastore.preferences.protobuf.s0 v0_5 = v3_2.c;
        String v4_1 = p4.iterator();
        while (v4_1.hasNext()) {
            int v1_7 = v4_1.next();
            if (v1_7 != 0) {
                v3_2.add(v1_7);
            } else {
                String v4_3 = new StringBuilder("Element at index ");
                v4_3.append((v3_2.c - v0_5));
                v4_3.append(" is null.");
                String v4_4 = v4_3.toString();
                int v1_13 = (v3_2.c - 1);
                while (v1_13 >= v0_5) {
                    v3_2.remove(v1_13);
                    v1_13--;
                }
                throw new NullPointerException(v4_4);
            }
        }
        return;
    }

    public static d1.f m()
    {
        return d1.f.DEFAULT_INSTANCE;
    }

    public static d1.e o()
    {
        return ((d1.e) ((androidx.datastore.preferences.protobuf.t) d1.f.DEFAULT_INSTANCE.c(5)));
    }

    public final Object c(int p4)
    {
        switch (u.e.c(p4)) {
            case 0:
                return Byte.valueOf(1);
            case 1:
                return 0;
            case 2:
                return new androidx.datastore.preferences.protobuf.t0(d1.f.DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[] {"strings_"}));
            case 3:
                return new d1.f();
            case 4:
                return new d1.e(d1.f.DEFAULT_INSTANCE);
            case 5:
                return d1.f.DEFAULT_INSTANCE;
            case 6:
                androidx.datastore.preferences.protobuf.u v4_11 = d1.f.PARSER;
                if (v4_11 != null) {
                    return v4_11;
                } else {
                    androidx.datastore.preferences.protobuf.u v4_2 = d1.f.PARSER;
                    if (v4_2 == null) {
                        v4_2 = new androidx.datastore.preferences.protobuf.u();
                        d1.f.PARSER = v4_2;
                    }
                    return v4_2;
                }
            default:
                throw new UnsupportedOperationException();
        }
    }

    public final androidx.datastore.preferences.protobuf.w n()
    {
        return this.strings_;
    }
}
