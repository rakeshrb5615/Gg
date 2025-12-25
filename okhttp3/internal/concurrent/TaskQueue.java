package okhttp3.internal.concurrent;
public final class TaskQueue {
    public final okhttp3.internal.concurrent.TaskRunner a;
    public final String b;
    public boolean c;
    public okhttp3.internal.concurrent.Task d;
    public final java.util.ArrayList e;
    public boolean f;

    public TaskQueue(okhttp3.internal.concurrent.TaskRunner p2, String p3)
    {
        kotlin.jvm.internal.j.e(p3, "name");
        this.a = p2;
        this.b = p3;
        this.e = new java.util.ArrayList();
        return;
    }

    public static void b(okhttp3.internal.concurrent.TaskQueue p1, String p2, u7.a p3, int p4)
    {
        int v4_2;
        if ((p4 & 4) == 0) {
            v4_2 = 0;
        } else {
            v4_2 = 1;
        }
        p1.getClass();
        kotlin.jvm.internal.j.e(p2, "name");
        kotlin.jvm.internal.j.e(p3, "block");
        p1.c(new okhttp3.internal.concurrent.TaskQueue$execute$1(p2, v4_2, p3), 0);
        return;
    }

    public final boolean a()
    {
        java.util.ArrayList v0_0 = this.d;
        if ((v0_0 != null) && (v0_0.b)) {
            this.f = 1;
        }
        java.util.ArrayList v0_2 = this.e;
        int v2_0 = (v0_2.size() - 1);
        int v3_0 = 0;
        while (-1 < v2_0) {
            if (((okhttp3.internal.concurrent.Task) v0_2.get(v2_0)).b) {
                int v3_2 = this.a.b;
                if (v3_2.isLoggable(java.util.logging.Level.FINE)) {
                    okhttp3.internal.concurrent.TaskLoggerKt.a(v3_2, ((okhttp3.internal.concurrent.Task) v0_2.get(v2_0)), this, "canceled");
                }
                v0_2.remove(v2_0);
                v3_0 = 1;
            }
            v2_0--;
        }
        return v3_0;
    }

    public final void c(okhttp3.internal.concurrent.Task p3, long p4)
    {
        kotlin.jvm.internal.j.e(p3, "task");
        try {
            if (!this.c) {
                if (this.d(p3, p4, 0)) {
                    this.a.c(this);
                }
                return;
            } else {
                if (!p3.b) {
                    java.util.logging.Logger v4_3 = this.a.b;
                    if (v4_3.isLoggable(java.util.logging.Level.FINE)) {
                        okhttp3.internal.concurrent.TaskLoggerKt.a(v4_3, p3, this, "schedule failed (queue is shutdown)");
                    }
                    throw new java.util.concurrent.RejectedExecutionException();
                } else {
                    java.util.logging.Logger v4_5 = this.a.b;
                    if (v4_5.isLoggable(java.util.logging.Level.FINE)) {
                        okhttp3.internal.concurrent.TaskLoggerKt.a(v4_5, p3, this, "schedule canceled (queue is shutdown)");
                    }
                    return;
                }
            }
        } catch (java.util.concurrent.RejectedExecutionException v3_3) {
            throw v3_3;
        }
    }

    public final boolean d(okhttp3.internal.concurrent.Task p12, long p13, boolean p15)
    {
        int v0_1 = this.a.b;
        kotlin.jvm.internal.j.e(p12, "task");
        long v1_2 = p12.c;
        if (v1_2 != this) {
            if (v1_2 != 0) {
                throw new IllegalStateException("task is in multiple queues");
            } else {
                p12.c = this;
            }
        }
        long v1_0 = System.nanoTime();
        int v3_0 = (v1_0 + p13);
        java.util.ArrayList v5 = this.e;
        boolean v6_0 = v5.indexOf(p12);
        if (v6_0 == -1) {
            p12.d = v3_0;
            if (v0_1.isLoggable(java.util.logging.Level.FINE)) {
                String v15_2;
                if (p15 == null) {
                    v15_2 = "scheduled after ".concat(okhttp3.internal.concurrent.TaskLoggerKt.b((v3_0 - v1_0)));
                } else {
                    v15_2 = "run again after ".concat(okhttp3.internal.concurrent.TaskLoggerKt.b((v3_0 - v1_0)));
                }
                okhttp3.internal.concurrent.TaskLoggerKt.a(v0_1, p12, this, v15_2);
            }
            String v15_4 = v5.size();
            int v0_2 = 0;
            int v3_5 = 0;
            while (v3_5 < v15_4) {
                long v4_0 = v5.get(v3_5);
                v3_5++;
                if ((((okhttp3.internal.concurrent.Task) v4_0).d - v1_0) <= p13) {
                    v0_2++;
                }
                if (v0_2 == -1) {
                    v0_2 = v5.size();
                }
                v5.add(v0_2, p12);
                if (v0_2 == 0) {
                    return 1;
                }
            }
            v0_2 = -1;
        } else {
            if (p12.d > v3_0) {
                v5.remove(v6_0);
            } else {
                if (v0_1.isLoggable(java.util.logging.Level.FINE)) {
                    okhttp3.internal.concurrent.TaskLoggerKt.a(v0_1, p12, this, "already scheduled");
                    return 0;
                }
            }
        }
        return 0;
    }

    public final void e()
    {
        okhttp3.internal.concurrent.TaskRunner v1 = okhttp3.internal._UtilJvmKt.a;
        try {
            this.c = 1;
        } catch (okhttp3.internal.concurrent.TaskRunner v1_2) {
            throw v1_2;
        }
        if (this.a()) {
            this.a.c(this);
        }
        return;
    }

    public final String toString()
    {
        return this.b;
    }
}
