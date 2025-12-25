package androidx.datastore.preferences.protobuf;
public final class c1 {

    public static androidx.datastore.preferences.protobuf.b1 a(Object p5)
    {
        androidx.datastore.preferences.protobuf.b1 v0_0 = ((androidx.datastore.preferences.protobuf.v) p5).unknownFields;
        if (v0_0 == androidx.datastore.preferences.protobuf.b1.f) {
            int[] v2 = new int[8];
            Object[] v1_2 = new Object[8];
            v0_0 = new androidx.datastore.preferences.protobuf.b1(0, v2, v1_2, 1);
            ((androidx.datastore.preferences.protobuf.v) p5).unknownFields = v0_0;
        }
        return v0_0;
    }

    public static boolean b(int p8, a2.r p9, Object p10)
    {
        int v0_1 = ((androidx.datastore.preferences.protobuf.j) p9.d);
        int v1_0 = p9.a;
        int v2_0 = (v1_0 >> 3);
        int v1_1 = (v1_0 & 7);
        if (v1_1 == 0) {
            p9.y(0);
            ((androidx.datastore.preferences.protobuf.b1) p10).c((v2_0 << 3), Long.valueOf(v0_1.n()));
            return 1;
        } else {
            if (v1_1 == 1) {
                p9.y(1);
                ((androidx.datastore.preferences.protobuf.b1) p10).c(((v2_0 << 3) | 1), Long.valueOf(v0_1.k()));
                return 1;
            } else {
                if (v1_1 == 2) {
                    ((androidx.datastore.preferences.protobuf.b1) p10).c(((v2_0 << 3) | 2), p9.g());
                    return 1;
                } else {
                    if (v1_1 == 3) {
                        boolean v6_1 = new int[8];
                        int v1_3 = new Object[8];
                        int v0_6 = new androidx.datastore.preferences.protobuf.b1(0, v6_1, v1_3, 1);
                        int v1_4 = (v2_0 << 3);
                        int v8_6 = (p8 + 1);
                        if (v8_6 >= 100) {
                            throw new androidx.datastore.preferences.protobuf.z("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
                        }
                        while (p9.c() != 2147483647) {
                            if (!androidx.datastore.preferences.protobuf.c1.b(v8_6, p9, v0_6)) {
                                break;
                            }
                        }
                        if ((v1_4 | 4) != p9.a) {
                            throw new androidx.datastore.preferences.protobuf.z("Protocol message end-group tag did not match expected tag.");
                        } else {
                            if (v0_6.e) {
                                v0_6.e = 0;
                            }
                            ((androidx.datastore.preferences.protobuf.b1) p10).c((v1_4 | 3), v0_6);
                            return 1;
                        }
                    } else {
                        if (v1_1 == 4) {
                            return 0;
                        } else {
                            if (v1_1 != 5) {
                                throw androidx.datastore.preferences.protobuf.z.b();
                            } else {
                                p9.y(5);
                                ((androidx.datastore.preferences.protobuf.b1) p10).c((5 | (v2_0 << 3)), Integer.valueOf(v0_1.j()));
                                return 1;
                            }
                        }
                    }
                }
            }
        }
    }
}
