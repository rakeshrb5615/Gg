package okhttp3.internal.concurrent;
public final class TaskRunner implements okhttp3.internal.concurrent.Lockable {
    public static final java.util.logging.Logger q;
    public static final okhttp3.internal.concurrent.TaskRunner r;
    public final okhttp3.internal.concurrent.TaskRunner$RealBackend a;
    public final java.util.logging.Logger b;
    public int c;
    public boolean d;
    public long e;
    public int f;
    public int m;
    public final java.util.ArrayList n;
    public final java.util.ArrayList o;
    public final okhttp3.internal.concurrent.TaskRunner$runnable$1 p;

    static TaskRunner()
    {
        new okhttp3.internal.concurrent.TaskRunner$Companion(0);
        okhttp3.internal.concurrent.TaskRunner v0_5 = java.util.logging.Logger.getLogger(okhttp3.internal.concurrent.TaskRunner.getName());
        kotlin.jvm.internal.j.d(v0_5, "getLogger(...)");
        okhttp3.internal.concurrent.TaskRunner.q = v0_5;
        String v2_1 = new StringBuilder();
        v2_1.append(okhttp3.internal._UtilJvmKt.b);
        v2_1.append(" TaskRunner");
        String v2_2 = v2_1.toString();
        kotlin.jvm.internal.j.e(v2_2, "name");
        okhttp3.internal.concurrent.TaskRunner.r = new okhttp3.internal.concurrent.TaskRunner(new okhttp3.internal.concurrent.TaskRunner$RealBackend(new okhttp3.internal.b(v2_2, 1)));
        return;
    }

    public TaskRunner(okhttp3.internal.concurrent.TaskRunner$RealBackend p3)
    {
        java.util.logging.Logger v1 = okhttp3.internal.concurrent.TaskRunner.q;
        kotlin.jvm.internal.j.e(v1, "logger");
        this.a = p3;
        this.b = v1;
        this.c = 10000;
        this.n = new java.util.ArrayList();
        this.o = new java.util.ArrayList();
        this.p = new okhttp3.internal.concurrent.TaskRunner$runnable$1(this);
        return;
    }

    public static final void a(okhttp3.internal.concurrent.TaskRunner p4, okhttp3.internal.concurrent.Task p5, long p6, boolean p8)
    {
        okhttp3.internal.concurrent.TaskQueue v0 = p5.c;
        kotlin.jvm.internal.j.b(v0);
        if (v0.d != p5) {
            throw new IllegalStateException("Check failed.");
        } else {
            int v1_3 = v0.f;
            v0.f = 0;
            v0.d = 0;
            p4.n.remove(v0);
            if ((p6 != -1) && ((v1_3 == 0) && (!v0.c))) {
                v0.d(p5, p6, 1);
            }
            if (!v0.e.isEmpty()) {
                p4.o.add(v0);
                if (!p8) {
                    p4.e();
                }
            }
            return;
        }
    }

    public final okhttp3.internal.concurrent.Task b()
    {
        while(true) {
            int v15;
            Throwable v0_1 = this.o;
            if (!v0_1.isEmpty()) {
                okhttp3.internal.concurrent.TaskQueue v4_0 = System.nanoTime();
                int v2_12 = v0_1.size();
                long v7_0 = 9223372036854775807;
                int v10 = 0;
                long v9_0 = 0;
                while (v10 < v2_12) {
                    okhttp3.internal.concurrent.Task v14_0 = v0_1.get(v10);
                    v10++;
                    okhttp3.internal.concurrent.Task v14_4 = ((okhttp3.internal.concurrent.Task) ((okhttp3.internal.concurrent.TaskQueue) v14_0).e.get(0));
                    long v16 = v4_0;
                    v15 = 0;
                    boolean v3_2 = Math.max(0, (v14_4.d - v16));
                    if (v3_2 <= 0) {
                        if (v9_0 == 0) {
                            v9_0 = v14_4;
                        } else {
                            int v2_1 = 1;
                            boolean v3_3 = this.n;
                            if (v9_0 == 0) {
                                if (!this.d) {
                                    this.d = 1;
                                    this.e = (v16 + v7_0);
                                    try {
                                        int v2_4 = v7_0 cmp 0;
                                    } catch (Throwable v0_2) {
                                        this.d = 0;
                                        throw v0_2;
                                    }
                                    if (v2_4 <= 0) {
                                        this.d = 0;
                                    } else {
                                        long v9_1 = (v7_0 / 1000000);
                                        if ((v9_1 <= 0) && (v2_4 <= 0)) {
                                        } else {
                                            this.wait(v9_1, ((int) (v7_0 - (1000000 * v9_1))));
                                        }
                                    }
                                } else {
                                    if (v7_0 < (this.e - v16)) {
                                        this.notify();
                                    }
                                }
                            } else {
                                v9_0.d = -1;
                                okhttp3.internal.concurrent.TaskQueue v4_9 = v9_0.c;
                                kotlin.jvm.internal.j.b(v4_9);
                                v4_9.e.remove(v9_0);
                                v0_1.remove(v4_9);
                                v4_9.d = v9_0;
                                v3_3.add(v4_9);
                                if ((v2_1 != 0) || ((!this.d) && (!v0_1.isEmpty()))) {
                                    this.e();
                                }
                                return v9_0;
                            }
                            return v15;
                        }
                    } else {
                        v7_0 = Math.min(v3_2, v7_0);
                    }
                    v4_0 = v16;
                }
                v16 = v4_0;
                v15 = 0;
                v2_1 = 0;
            } else {
                v15 = 0;
            }
            return v15;
        }
    }

    public final void c(okhttp3.internal.concurrent.TaskQueue p3)
    {
        kotlin.jvm.internal.j.e(p3, "taskQueue");
        if (p3.d == null) {
            java.util.ArrayList v1 = this.o;
            if (p3.e.isEmpty()) {
                v1.remove(p3);
            } else {
                kotlin.jvm.internal.j.e(v1, "<this>");
                if (!v1.contains(p3)) {
                    v1.add(p3);
                }
            }
        }
        if (!this.d) {
            this.e();
            return;
        } else {
            this.notify();
            return;
        }
    }

    public final okhttp3.internal.concurrent.TaskQueue d()
    {
        try {
            Throwable v0_0 = this.c;
            this.c = (v0_0 + 1);
            return new okhttp3.internal.concurrent.TaskQueue(this, g2.g.c(v0_0, "Q"));
        } catch (Throwable v0_2) {
            throw v0_2;
        }
    }

    public final void e()
    {
        java.util.concurrent.ThreadPoolExecutor v0_0 = this.f;
        if (v0_0 <= this.m) {
            this.f = (v0_0 + 1);
            okhttp3.internal.concurrent.TaskRunner$runnable$1 v1_1 = this.p;
            kotlin.jvm.internal.j.e(v1_1, "runnable");
            this.a.a.execute(v1_1);
            return;
        } else {
            return;
        }
    }
}
