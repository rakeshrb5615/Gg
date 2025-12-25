package androidx.datastore.preferences.protobuf;
public final class r0 {
    public static final androidx.datastore.preferences.protobuf.r0 c;
    public final androidx.datastore.preferences.protobuf.e0 a;
    public final java.util.concurrent.ConcurrentHashMap b;

    static r0()
    {
        androidx.datastore.preferences.protobuf.r0.c = new androidx.datastore.preferences.protobuf.r0();
        return;
    }

    public r0()
    {
        this.b = new java.util.concurrent.ConcurrentHashMap();
        this.a = new androidx.datastore.preferences.protobuf.e0();
        return;
    }

    public final androidx.datastore.preferences.protobuf.u0 a(Class p10)
    {
        androidx.datastore.preferences.protobuf.x.a(p10, "messageType");
        String v0_1 = this.b;
        boolean v1_7 = ((androidx.datastore.preferences.protobuf.u0) v0_1.get(p10));
        if (v1_7) {
            return v1_7;
        } else {
            boolean v1_11 = this.a;
            v1_11.getClass();
            if (!androidx.datastore.preferences.protobuf.v.isAssignableFrom(p10)) {
                androidx.datastore.preferences.protobuf.m0 v3_2 = androidx.datastore.preferences.protobuf.v0.a;
                if ((v3_2 != null) && (!v3_2.isAssignableFrom(p10))) {
                    throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
                }
            }
            androidx.datastore.preferences.protobuf.m0 v3_0;
            androidx.datastore.preferences.protobuf.m0 v3_4 = ((androidx.datastore.preferences.protobuf.d0) v1_11.a).a(p10);
            androidx.datastore.preferences.protobuf.o0 v4_0 = v3_4.a;
            if ((v3_4.d & 2) != 2) {
                if (!androidx.datastore.preferences.protobuf.v.isAssignableFrom(p10)) {
                    boolean v1_5 = 0;
                    if (u.e.c(v3_4.a()) != 1) {
                        v1_5 = androidx.datastore.preferences.protobuf.p.b;
                        if (!v1_5) {
                            throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                        }
                    }
                    if (!(v3_4 instanceof androidx.datastore.preferences.protobuf.t0)) {
                        Class vtmp16 = v3_4.getClass();
                        throw new ClassCastException();
                    } else {
                        v3_0 = androidx.datastore.preferences.protobuf.m0.w(v3_4, androidx.datastore.preferences.protobuf.p0.a, androidx.datastore.preferences.protobuf.c0.a, androidx.datastore.preferences.protobuf.v0.b, v1_5, androidx.datastore.preferences.protobuf.j0.a);
                    }
                } else {
                    boolean v1_9 = 0;
                    if (u.e.c(v3_4.a()) != 1) {
                        v1_9 = androidx.datastore.preferences.protobuf.p.a;
                    }
                    if (!(v3_4 instanceof androidx.datastore.preferences.protobuf.t0)) {
                        Class vtmp14 = v3_4.getClass();
                        throw new ClassCastException();
                    } else {
                        v3_0 = androidx.datastore.preferences.protobuf.m0.w(v3_4, androidx.datastore.preferences.protobuf.p0.b, androidx.datastore.preferences.protobuf.c0.b, androidx.datastore.preferences.protobuf.v0.c, v1_9, androidx.datastore.preferences.protobuf.j0.b);
                    }
                }
            } else {
                if (!androidx.datastore.preferences.protobuf.v.isAssignableFrom(p10)) {
                    androidx.datastore.preferences.protobuf.o v2_2 = androidx.datastore.preferences.protobuf.p.b;
                    if (v2_2 == null) {
                        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                    } else {
                        v3_0 = new androidx.datastore.preferences.protobuf.n0(androidx.datastore.preferences.protobuf.v0.b, v2_2, v4_0);
                    }
                } else {
                    v3_0 = new androidx.datastore.preferences.protobuf.n0(androidx.datastore.preferences.protobuf.v0.c, androidx.datastore.preferences.protobuf.p.a, v4_0);
                }
            }
            ClassCastException v10_2 = ((androidx.datastore.preferences.protobuf.u0) v0_1.putIfAbsent(p10, v3_0));
            if (v10_2 == null) {
                return v3_0;
            } else {
                return v10_2;
            }
        }
    }
}
