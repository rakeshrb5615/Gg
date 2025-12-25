package r6;
public final class q implements t6.b {
    public final synthetic int a;

    static q()
    {
        return;
    }

    public synthetic q(int p1)
    {
        this.a = p1;
        return;
    }

    public static a1.g0 b(a1.f1 p6, l6.c p7, i8.c p8, u7.a p9)
    {
        i7.n v0 = i7.n.a;
        try {
            System.loadLibrary("datastore_shared_counter");
            a1.j0 v3_2 = new a1.l0(p6, new a1.d0(p8, 1), p9);
            java.util.List v6_3 = a.a.G(new a1.d(v0, 0, 0));
            return new a1.g0(v3_2, v6_3, p7, p8);
        } catch (SecurityException) {
            return new a1.g0(new a1.l0(v6_3, a1.j0.a, 0), a.a.G(new a1.d(v0, 0, 0)), p7, p8);
        }
    }

    public static void c(java.io.File p4)
    {
        String v4_1 = p4.getParentFile();
        if (v4_1 != null) {
            if ((v4_1.exists()) && ((!v4_1.isDirectory()) && ((kotlin.jvm.internal.j.a(v4_1.getName(), "firebaseSessions")) && (!v4_1.delete())))) {
                StringBuilder v1_2 = new StringBuilder("Failed to delete conflicting file: ");
                v1_2.append(v4_1);
                throw new java.io.IOException(v1_2.toString());
            } else {
                if (!v4_1.isDirectory()) {
                    try {
                        StringBuilder v1_4 = new java.nio.file.attribute.FileAttribute[0];
                        java.nio.file.Files.createDirectories(v4_1.toPath(), v1_4);
                        return;
                    } catch (java.io.IOException v0_7) {
                        String v2_2 = new StringBuilder("Failed to create directory: ");
                        v2_2.append(v4_1);
                        throw new java.io.IOException(v2_2.toString(), v0_7);
                    }
                }
            }
        }
        return;
    }

    public Object a(d6.d p9, n7.c p10)
    {
        String v0_2;
        if (!(p10 instanceof r6.v)) {
            v0_2 = new r6.v(this, p10);
        } else {
            v0_2 = ((r6.v) p10);
            m7.a v1_2 = ((r6.v) p10).d;
            if ((v1_2 & -2147483648) == 0) {
            } else {
                ((r6.v) p10).d = (v1_2 - -2147483648);
            }
        }
        Exception v9_1;
        r6.w v10_1 = v0_2.b;
        m7.a v1_1 = m7.a.a;
        String v2_0 = v0_2.d;
        Object v6 = "";
        try {
            if (v2_0 == null) {
                c4.b.e0(v10_1);
                v9_1 = ((d6.c) p9).d();
                try {
                    kotlin.jvm.internal.j.d(v9_1, "getToken(...)");
                    v0_2.a = ((d6.c) p9);
                    v0_2.d = 1;
                    v9_1 = j5.t1.b(v9_1, v0_2);
                } catch (Exception v9_2) {
                    r6.w v10_4 = v9_2;
                    v9_1 = ((d6.c) p9);
                    android.util.Log.w("FirebaseSessions", "Error getting authentication token.", v10_4);
                    r6.w v10_7 = v9_1;
                    v9_1 = "";
                    r6.w v10_9 = ((d6.c) v10_7).c();
                    kotlin.jvm.internal.j.d(v10_9, "getId(...)");
                    v0_2.a = v9_1;
                    v0_2.d = 2;
                    v10_1 = j5.t1.b(v10_9, v0_2);
                    if (v10_1 != v1_1) {
                        r6.w v10_12 = ((String) v10_1);
                        if (v10_12 != null) {
                            v6 = v10_12;
                        }
                    } else {
                        return v1_1;
                    }
                }
                if (v9_1 != v1_1) {
                    v10_1 = v9_1;
                    v9_1 = ((d6.c) p9);
                    v10_7 = v9_1;
                    v9_1 = ((d6.a) v10_1).a;
                }
            } else {
                if (v2_0 == 1) {
                    v9_1 = ((d6.d) v0_2.a);
                    c4.b.e0(v10_1);
                } else {
                    if (v2_0 != 2) {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    } else {
                        v9_1 = ((String) v0_2.a);
                        c4.b.e0(v10_1);
                    }
                }
            }
        } catch (r6.w v10_4) {
        } catch (r6.w v10_11) {
            android.util.Log.w("FirebaseSessions", "Error getting Firebase installation id .", v10_11);
        }
        return new r6.w(v6, v9_1);
    }

    public Object get()
    {
        switch (this.a) {
            case 1:
                return r6.g1.a;
            default:
                return r6.h1.a;
        }
    }
}
