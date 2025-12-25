package androidx.datastore.preferences.protobuf;
public final class g0 {
    public final androidx.datastore.preferences.protobuf.f0 a;

    public g0(androidx.datastore.preferences.protobuf.p1 p2, androidx.datastore.preferences.protobuf.p1 p3, d1.h p4)
    {
        this.a = new androidx.datastore.preferences.protobuf.f0(p2, p3, p4);
        return;
    }

    public static int a(androidx.datastore.preferences.protobuf.f0 p13, Object p14, Object p15)
    {
        int v0_0 = p13.a;
        int v1_2 = 1;
        long v2_1 = androidx.datastore.preferences.protobuf.l.r0(1);
        androidx.datastore.preferences.protobuf.m1 v3 = androidx.datastore.preferences.protobuf.p1.d;
        if (v0_0 == v3) {
            v2_1 *= 2;
        }
        int v0_5;
        int v14_1;
        int v14_17;
        switch (v0_0.ordinal()) {
            case 0:
                ((Double) p14).getClass();
                v14_1 = 8;
                break;
            case 1:
                ((Float) p14).getClass();
                v14_1 = 4;
                break;
            case 2:
                v14_1 = androidx.datastore.preferences.protobuf.l.t0(((Long) p14).longValue());
                break;
            case 3:
                v14_1 = androidx.datastore.preferences.protobuf.l.t0(((Long) p14).longValue());
                break;
            case 4:
                v14_1 = androidx.datastore.preferences.protobuf.l.t0(((long) ((Integer) p14).intValue()));
                break;
            case 5:
                ((Long) p14).getClass();
                break;
            case 6:
                ((Integer) p14).getClass();
                break;
            case 7:
                ((Boolean) p14).getClass();
                v14_1 = 1;
                break;
            case 8:
                if (!(p14 instanceof androidx.datastore.preferences.protobuf.g)) {
                    v14_1 = androidx.datastore.preferences.protobuf.l.q0(((String) p14));
                } else {
                    v14_17 = ((androidx.datastore.preferences.protobuf.g) p14).size();
                    v0_5 = androidx.datastore.preferences.protobuf.l.s0(v14_17);
                    v14_1 = (v14_17 + v0_5);
                }
                break;
            case 9:
                v14_1 = ((androidx.datastore.preferences.protobuf.v) ((androidx.datastore.preferences.protobuf.a) p14)).a(0);
                break;
            case 10:
                v14_17 = ((androidx.datastore.preferences.protobuf.v) ((androidx.datastore.preferences.protobuf.a) p14)).a(0);
                v0_5 = androidx.datastore.preferences.protobuf.l.s0(v14_17);
                break;
            case 11:
                if (!(p14 instanceof androidx.datastore.preferences.protobuf.g)) {
                    v14_17 = ((byte[]) p14).length;
                    v0_5 = androidx.datastore.preferences.protobuf.l.s0(v14_17);
                } else {
                    v14_17 = ((androidx.datastore.preferences.protobuf.g) p14).size();
                    v0_5 = androidx.datastore.preferences.protobuf.l.s0(v14_17);
                }
                break;
            case 12:
                v14_1 = androidx.datastore.preferences.protobuf.l.s0(((Integer) p14).intValue());
                break;
            case 13:
                v14_1 = androidx.datastore.preferences.protobuf.l.t0(((long) ((Integer) p14).intValue()));
                break;
            case 14:
                ((Integer) p14).getClass();
                break;
            case 15:
                ((Long) p14).getClass();
                break;
            case 16:
                int v14_7 = ((Integer) p14).intValue();
                v14_1 = androidx.datastore.preferences.protobuf.l.s0(((v14_7 >> 31) ^ (v14_7 << 1)));
                break;
            case 17:
                long v9_0 = ((Long) p14).longValue();
                v14_1 = androidx.datastore.preferences.protobuf.l.t0(((v9_0 >> 63) ^ (v9_0 << 1)));
                break;
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
        int v14_4 = (v14_1 + v2_1);
        int v13_1 = p13.b;
        int v0_2 = androidx.datastore.preferences.protobuf.l.r0(2);
        if (v13_1 == v3) {
            v0_2 *= 2;
        }
        int v13_9;
        int v15_9;
        switch (v13_1.ordinal()) {
            case 0:
                ((Double) p15).getClass();
                v1_2 = 8;
                break;
            case 1:
                ((Float) p15).getClass();
                v1_2 = 4;
                break;
            case 2:
                v1_2 = androidx.datastore.preferences.protobuf.l.t0(((Long) p15).longValue());
                break;
            case 3:
                v1_2 = androidx.datastore.preferences.protobuf.l.t0(((Long) p15).longValue());
                break;
            case 4:
                v1_2 = androidx.datastore.preferences.protobuf.l.t0(((long) ((Integer) p15).intValue()));
                break;
            case 5:
                ((Long) p15).getClass();
                break;
            case 6:
                ((Integer) p15).getClass();
                break;
            case 7:
                ((Boolean) p15).getClass();
                break;
            case 8:
                if (!(p15 instanceof androidx.datastore.preferences.protobuf.g)) {
                    v1_2 = androidx.datastore.preferences.protobuf.l.q0(((String) p15));
                } else {
                    v13_9 = ((androidx.datastore.preferences.protobuf.g) p15).size();
                    v15_9 = androidx.datastore.preferences.protobuf.l.s0(v13_9);
                    v1_2 = (v15_9 + v13_9);
                }
                break;
            case 9:
                v1_2 = ((androidx.datastore.preferences.protobuf.v) ((androidx.datastore.preferences.protobuf.a) p15)).a(0);
                break;
            case 10:
                v13_9 = ((androidx.datastore.preferences.protobuf.v) ((androidx.datastore.preferences.protobuf.a) p15)).a(0);
                v15_9 = androidx.datastore.preferences.protobuf.l.s0(v13_9);
                break;
            case 11:
                if (!(p15 instanceof androidx.datastore.preferences.protobuf.g)) {
                    v13_9 = ((byte[]) p15).length;
                    v15_9 = androidx.datastore.preferences.protobuf.l.s0(v13_9);
                } else {
                    v13_9 = ((androidx.datastore.preferences.protobuf.g) p15).size();
                    v15_9 = androidx.datastore.preferences.protobuf.l.s0(v13_9);
                }
                break;
            case 12:
                v1_2 = androidx.datastore.preferences.protobuf.l.s0(((Integer) p15).intValue());
                break;
            case 13:
                v1_2 = androidx.datastore.preferences.protobuf.l.t0(((long) ((Integer) p15).intValue()));
                break;
            case 14:
                ((Integer) p15).getClass();
                break;
            case 15:
                ((Long) p15).getClass();
                break;
            case 16:
                int v13_3 = ((Integer) p15).intValue();
                v1_2 = androidx.datastore.preferences.protobuf.l.s0(((v13_3 >> 31) ^ (v13_3 << 1)));
                break;
            case 17:
                long v2_0 = ((Long) p15).longValue();
                v1_2 = androidx.datastore.preferences.protobuf.l.t0(((v2_0 >> 63) ^ (v2_0 << 1)));
                break;
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
        return ((v1_2 + v0_2) + v14_4);
    }
}
