package androidx.datastore.preferences.protobuf;
public final class q {
    public static final synthetic int c;
    public final androidx.datastore.preferences.protobuf.w0 a;
    public boolean b;

    static q()
    {
        new androidx.datastore.preferences.protobuf.q(0);
        return;
    }

    public q()
    {
        this.a = androidx.datastore.preferences.protobuf.w0.g();
        return;
    }

    public q(int p1)
    {
        p1 = androidx.datastore.preferences.protobuf.w0.g();
        this.a = p1;
        this.a();
        this.a();
        return;
    }

    public static void b(androidx.datastore.preferences.protobuf.l p2, androidx.datastore.preferences.protobuf.p1 p3, int p4, Object p5)
    {
        if (p3 != androidx.datastore.preferences.protobuf.p1.d) {
            p2.K0(p4, p3.b);
            switch (p3.ordinal()) {
                case 0:
                    p2.E0(Double.doubleToRawLongBits(((Double) p5).doubleValue()));
                    return;
                case 1:
                    p2.C0(Float.floatToRawIntBits(((Float) p5).floatValue()));
                    return;
                case 2:
                    p2.O0(((Long) p5).longValue());
                    return;
                case 3:
                    p2.O0(((Long) p5).longValue());
                    return;
                case 4:
                    p2.G0(((Integer) p5).intValue());
                    return;
                case 5:
                    p2.E0(((Long) p5).longValue());
                    return;
                case 6:
                    p2.C0(((Integer) p5).intValue());
                    return;
                case 7:
                    p2.w0(((byte) ((Boolean) p5).booleanValue()));
                    return;
                case 8:
                    if (!(p5 instanceof androidx.datastore.preferences.protobuf.g)) {
                        p2.J0(((String) p5));
                        return;
                    } else {
                        p2.A0(((androidx.datastore.preferences.protobuf.g) p5));
                        return;
                    }
                case 9:
                    ((androidx.datastore.preferences.protobuf.a) p5).b(p2);
                    return;
                case 10:
                    p2.getClass();
                    p2.M0(((androidx.datastore.preferences.protobuf.v) ((androidx.datastore.preferences.protobuf.a) p5)).a(0));
                    ((androidx.datastore.preferences.protobuf.a) p5).b(p2);
                    return;
                case 11:
                    if (!(p5 instanceof androidx.datastore.preferences.protobuf.g)) {
                        int v3_19 = ((byte[]) p5).length;
                        p2.M0(v3_19);
                        p2.x0(((byte[]) p5), 0, v3_19);
                        return;
                    } else {
                        p2.A0(((androidx.datastore.preferences.protobuf.g) p5));
                        return;
                    }
                case 12:
                    p2.M0(((Integer) p5).intValue());
                    return;
                case 13:
                    p2.G0(((Integer) p5).intValue());
                    return;
                case 14:
                    p2.C0(((Integer) p5).intValue());
                    return;
                case 15:
                    p2.E0(((Long) p5).longValue());
                    return;
                case 16:
                    int v3_11 = ((Integer) p5).intValue();
                    p2.M0(((v3_11 >> 31) ^ (v3_11 << 1)));
                    return;
                case 17:
                    int v3_28 = ((Long) p5).longValue();
                    p2.O0(((v3_28 >> 63) ^ (v3_28 << 1)));
                    return;
                default:
                    return;
            }
        } else {
            p2.K0(p4, 3);
            ((androidx.datastore.preferences.protobuf.a) p5).b(p2);
            p2.K0(p4, 4);
            return;
        }
    }

    public final void a()
    {
        if (!this.b) {
            ClassCastException v0_3 = this.a;
            java.util.Map v1_10 = v0_3.a.size();
            int v3 = 0;
            while (v3 < v1_10) {
                androidx.datastore.preferences.protobuf.v v4_0 = v0_3.d(v3);
                if ((v4_0.getValue() instanceof androidx.datastore.preferences.protobuf.v)) {
                    androidx.datastore.preferences.protobuf.v v4_2 = ((androidx.datastore.preferences.protobuf.v) v4_0.getValue());
                    v4_2.getClass();
                    androidx.datastore.preferences.protobuf.u0 v5_2 = androidx.datastore.preferences.protobuf.r0.c;
                    v5_2.getClass();
                    v5_2.a(v4_2.getClass()).e(v4_2);
                    v4_2.h();
                }
                v3++;
            }
            if (!v0_3.c) {
                if (v0_3.a.size() > 0) {
                    v0_3.d(0).getKey().getClass();
                    throw new ClassCastException();
                } else {
                    java.util.Map v1_3 = v0_3.e().iterator();
                    if (v1_3.hasNext()) {
                        ((java.util.Map$Entry) v1_3.next()).getKey().getClass();
                        throw new ClassCastException();
                    }
                }
            }
            if (!v0_3.c) {
                java.util.Map v1_9;
                if (!v0_3.b.isEmpty()) {
                    v1_9 = java.util.Collections.unmodifiableMap(v0_3.b);
                } else {
                    v1_9 = java.util.Collections.EMPTY_MAP;
                }
                java.util.Map v1_14;
                v0_3.b = v1_9;
                if (!v0_3.e.isEmpty()) {
                    v1_14 = java.util.Collections.unmodifiableMap(v0_3.e);
                } else {
                    v1_14 = java.util.Collections.EMPTY_MAP;
                }
                v0_3.e = v1_14;
                v0_3.c = 1;
            }
            this.b = 1;
            return;
        } else {
            return;
        }
    }

    public final Object clone()
    {
        ClassCastException v0_1 = new androidx.datastore.preferences.protobuf.q();
        Object v1_1 = this.a;
        if (v1_1.a.size() > 0) {
            ClassCastException v0_2 = v1_1.d(0);
            if (v0_2.getKey() != null) {
                throw new ClassCastException();
            } else {
                v0_2.getValue();
                throw 0;
            }
        } else {
            Object v1_3 = v1_1.e().iterator();
            if (v1_3.hasNext()) {
                ClassCastException v0_6 = ((java.util.Map$Entry) v1_3.next());
                if (v0_6.getKey() != null) {
                    throw new ClassCastException();
                } else {
                    v0_6.getValue();
                    throw 0;
                }
            } else {
                return v0_1;
            }
        }
    }

    public final boolean equals(Object p2)
    {
        if (this != p2) {
            if ((p2 instanceof androidx.datastore.preferences.protobuf.q)) {
                return this.a.equals(((androidx.datastore.preferences.protobuf.q) p2).a);
            } else {
                return 0;
            }
        } else {
            return 1;
        }
    }

    public final int hashCode()
    {
        return this.a.hashCode();
    }
}
