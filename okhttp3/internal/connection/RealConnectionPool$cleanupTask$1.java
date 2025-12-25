package okhttp3.internal.connection;
public final class RealConnectionPool$cleanupTask$1 extends okhttp3.internal.concurrent.Task {
    public final synthetic okhttp3.internal.connection.RealConnectionPool e;

    public RealConnectionPool$cleanupTask$1(okhttp3.internal.connection.RealConnectionPool p1, String p2)
    {
        this.e = p1;
        super(p2, 1);
        return;
    }

    public final long a()
    {
        Throwable v0_0 = this.e;
        okhttp3.internal.concurrent.TaskRunner v2_0 = System.nanoTime();
        long v4_1 = ((v2_0 - v0_0.b) + 1);
        long v6_0 = v0_0.e.iterator();
        kotlin.jvm.internal.j.d(v6_0, "iterator(...)");
        long v8_0 = 9223372036854775807;
        int v10 = 0;
        int v11 = 0;
        okhttp3.internal.connection.RealConnection v12 = 0;
        okhttp3.internal.connection.RealConnection v13 = 0;
        while (v6_0.hasNext()) {
            okhttp3.internal.connection.RealConnection v14_2 = ((okhttp3.internal.connection.RealConnection) v6_0.next());
            kotlin.jvm.internal.j.b(v14_2);
            try {
                if (v0_0.a(v14_2, v2_0) <= 0) {
                    long v16_1 = v8_0;
                    long v7_1 = v14_2.x;
                    if (v7_1 < v4_1) {
                        v4_1 = v7_1;
                        v12 = v14_2;
                    }
                    v10++;
                    if (v7_1 >= v16_1) {
                        v8_0 = v16_1;
                    } else {
                        v8_0 = v7_1;
                        v13 = v14_2;
                    }
                } else {
                    v11++;
                }
            } catch (Throwable v0_4) {
                throw v0_4;
            }
        }
        int v15_0;
        long v16_0 = v8_0;
        if (v12 == null) {
            if (v10 <= 5) {
                v4_1 = -1;
                v15_0 = 0;
            } else {
                v15_0 = v13;
                v4_1 = v16_0;
            }
        } else {
            v15_0 = v12;
        }
        if (v15_0 == 0) {
            if (v13 == null) {
                if (v11 <= 0) {
                    return -1;
                } else {
                    return v0_0.b;
                }
            } else {
                return ((v16_0 + v0_0.b) - v2_0);
            }
        } else {
            try {
                if (v15_0.w.isEmpty()) {
                    if (v15_0.x == v4_1) {
                        v15_0.q = 1;
                        v0_0.e.remove(v15_0);
                        okhttp3.internal._UtilJvmKt.b(v15_0.e);
                        v0_0.a.getClass();
                        if (!v0_0.e.isEmpty()) {
                            return 0;
                        } else {
                            Throwable v0_2 = v0_0.c;
                            try {
                                if (v0_2.a()) {
                                    v0_2.a.c(v0_2);
                                }
                            } catch (Throwable v0_3) {
                                throw v0_3;
                            }
                            return 0;
                        }
                    } else {
                        return 0;
                    }
                } else {
                    return 0;
                }
            } catch (Throwable v0_1) {
                throw v0_1;
            }
        }
    }
}
