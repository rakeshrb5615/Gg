package okhttp3.internal.concurrent;
public final class TaskRunner$runnable$1 implements java.lang.Runnable {
    public final synthetic okhttp3.internal.concurrent.TaskRunner a;

    public TaskRunner$runnable$1(okhttp3.internal.concurrent.TaskRunner p1)
    {
        this.a = p1;
        return;
    }

    public final void run()
    {
        Thread v0_0 = this.a;
        try {
            v0_0.m = (v0_0.m + 1);
            okhttp3.internal.concurrent.Task v1_2 = v0_0.b();
        } catch (okhttp3.internal.concurrent.Task v1_6) {
            throw v1_6;
        }
        if (v1_2 != null) {
            Thread v0_1 = Thread.currentThread();
            String v3 = v0_1.getName();
            try {
                while(true) {
                    String v9_0;
                    v0_1.setName(v1_2.a);
                    okhttp3.internal.concurrent.TaskRunner v6_2 = this.a.b;
                    okhttp3.internal.concurrent.Task v7_0 = v1_2.c;
                    kotlin.jvm.internal.j.b(v7_0);
                    String v8_1 = v6_2.isLoggable(java.util.logging.Level.FINE);
                    v1_2 = okhttp3.internal.concurrent.Task v7_1;
                }
                v0_1.setName(v3);
                return;
            } catch (Throwable v2_3) {
                try {
                } catch (okhttp3.internal.concurrent.Task v1_5) {
                    v0_1.setName(v3);
                    throw v1_5;
                }
                okhttp3.internal.concurrent.TaskRunner.a(this.a, v1_2, -1, 0);
                if (!(v2_3 instanceof InterruptedException)) {
                    throw v2_3;
                } else {
                    Thread.currentThread().interrupt();
                    v0_1.setName(v3);
                    return;
                }
            }
            if (v8_1 == null) {
                v9_0 = -1;
            } else {
                v9_0 = System.nanoTime();
                okhttp3.internal.concurrent.TaskLoggerKt.a(v6_2, v1_2, v7_0, "starting");
            }
            long v11_1 = v1_2.a();
            if (v8_1 != null) {
                long v13_1 = (System.nanoTime() - v9_0);
                String v8_6 = new StringBuilder();
                v8_6.append("finished run in ");
                v8_6.append(okhttp3.internal.concurrent.TaskLoggerKt.b(v13_1));
                okhttp3.internal.concurrent.TaskLoggerKt.a(v6_2, v1_2, v7_0, v8_6.toString());
            }
            okhttp3.internal.concurrent.TaskRunner v6_3 = this.a;
            try {
                okhttp3.internal.concurrent.TaskRunner.a(v6_3, v1_2, v11_1, 1);
                v7_1 = v6_3.b();
            } catch (Throwable v2_2) {
                throw v2_2;
            }
            if (v7_1 != null) {
            }
            v0_1.setName(v3);
            return;
        } else {
            return;
        }
    }
}
