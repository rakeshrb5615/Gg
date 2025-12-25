package okhttp3;
public final class Dispatcher {
    public java.util.concurrent.ThreadPoolExecutor a;
    public final java.util.ArrayDeque b;
    public final java.util.ArrayDeque c;
    public final java.util.ArrayDeque d;

    public Dispatcher()
    {
        this.b = new java.util.ArrayDeque();
        this.c = new java.util.ArrayDeque();
        this.d = new java.util.ArrayDeque();
        return;
    }

    public static void c(okhttp3.Dispatcher p11, okhttp3.internal.connection.RealCall$AsyncCall p12, okhttp3.internal.connection.RealCall$AsyncCall p13, int p14)
    {
        if ((p14 & 1) != 0) {
            p12 = 0;
        }
        if ((p14 & 4) != 0) {
            p13 = 0;
        }
        p11.getClass();
        boolean v14_3 = ((java.util.concurrent.ThreadPoolExecutor) p11.a()).isShutdown();
        if (p13 != null) {
            p13.b.decrementAndGet();
            if (!p11.c.remove(p13)) {
                throw new IllegalStateException("Call wasn\'t in-flight!");
            } else {
            }
        }
        if (p12 != null) {
            p11.b.add(p12);
            okhttp3.Dispatcher$promoteAndExecute$Effects v0_9 = p11.b(p12.c.b.a.d);
            if (v0_9 != null) {
                p12.b = v0_9.b;
            }
        }
        if ((p13 != null) && ((v14_3) || (p11.c.isEmpty()))) {
            p11.d.isEmpty();
        }
        okhttp3.Dispatcher$promoteAndExecute$Effects v0_14;
        if (!v14_3) {
            okhttp3.EventListener v13_7 = new java.util.ArrayList();
            okhttp3.Dispatcher$promoteAndExecute$Effects v0_12 = p11.b.iterator();
            kotlin.jvm.internal.j.d(v0_12, "iterator(...)");
            while (v0_12.hasNext()) {
                int v2_4 = ((okhttp3.internal.connection.RealCall$AsyncCall) v0_12.next());
                if (p11.c.size() >= 64) {
                    break;
                }
                if (v2_4.b.get() < 5) {
                    v0_12.remove();
                    v2_4.b.incrementAndGet();
                    v13_7.add(v2_4);
                    p11.c.add(v2_4);
                }
            }
            v0_14 = new okhttp3.Dispatcher$promoteAndExecute$Effects(v13_7);
        } else {
            okhttp3.EventListener v13_9 = i7.i.j0(p11.b);
            p11.b.clear();
            v0_14 = new okhttp3.Dispatcher$promoteAndExecute$Effects(v13_9);
        }
        okhttp3.EventListener v13_11 = v0_14.a.size();
        int v2_0 = 1;
        int v4_0 = 0;
        while (v4_0 < v13_11) {
            n0.a v5_1 = ((okhttp3.internal.connection.RealCall$AsyncCall) v0_14.a.get(v4_0));
            if (v5_1 != p12) {
                okhttp3.Dispatcher v6_0 = v5_1.c;
                v6_0.d.l(v6_0, p11);
            } else {
                v2_0 = 0;
            }
            if (!v14_3) {
                okhttp3.Dispatcher v6_1 = p11.a();
                v5_1.getClass();
                okhttp3.internal.connection.RealCall v7_1 = v5_1.c;
                kotlin.jvm.internal.j.e(v7_1.a.a, "<this>");
                try {
                    ((java.util.concurrent.ThreadPoolExecutor) v6_1).execute(v5_1);
                } catch (okhttp3.Dispatcher v6_3) {
                    java.io.InterruptedIOException v9_2 = new java.io.InterruptedIOException("executor rejected");
                    v9_2.initCause(v6_3);
                    okhttp3.Dispatcher v6_4 = v5_1.c;
                    v6_4.j(v9_2);
                    v5_1.a.h(v6_4, v9_2);
                    okhttp3.Dispatcher v6_6 = v7_1.a.a;
                    v6_6.getClass();
                    okhttp3.Dispatcher.c(v6_6, 0, v5_1, 3);
                } catch (Throwable v11_1) {
                    okhttp3.Dispatcher v12_2 = v7_1.a.a;
                    v12_2.getClass();
                    okhttp3.Dispatcher.c(v12_2, 0, v5_1, 3);
                    throw v11_1;
                }
            } else {
                v5_1.getClass();
                okhttp3.Dispatcher v6_8 = new java.io.InterruptedIOException("executor rejected");
                v6_8.initCause(0);
                okhttp3.internal.connection.RealCall v7_3 = v5_1.c;
                v7_3.j(v6_8);
                v5_1.a.h(v7_3, v6_8);
            }
            v4_0++;
        }
        if ((v2_0 != 0) && (p12 != null)) {
            okhttp3.Dispatcher v12_5 = p12.c;
            v12_5.d.m(v12_5, p11);
        }
        return;
    }

    public final declared_synchronized java.util.concurrent.ExecutorService a()
    {
        if (this.a == null) {
            java.util.concurrent.SynchronousQueue v7_1 = new java.util.concurrent.SynchronousQueue();
            java.util.concurrent.ThreadPoolExecutor v0_5 = new StringBuilder();
            v0_5.append(okhttp3.internal._UtilJvmKt.b);
            v0_5.append(" Dispatcher");
            java.util.concurrent.ThreadPoolExecutor v0_1 = v0_5.toString();
            kotlin.jvm.internal.j.e(v0_1, "name");
            this.a = new java.util.concurrent.ThreadPoolExecutor(0, 2147483647, 60, java.util.concurrent.TimeUnit.SECONDS, v7_1, new okhttp3.internal.b(v0_1, 0));
        }
        java.util.concurrent.ThreadPoolExecutor v0_3 = this.a;
        kotlin.jvm.internal.j.b(v0_3);
        return v0_3;
    }

    public final okhttp3.internal.connection.RealCall$AsyncCall b(String p5)
    {
        java.util.Iterator v0_2 = this.c.iterator();
        kotlin.jvm.internal.j.d(v0_2, "iterator(...)");
        while (v0_2.hasNext()) {
            boolean v2_6 = ((okhttp3.internal.connection.RealCall$AsyncCall) v0_2.next());
            if (kotlin.jvm.internal.j.a(v2_6.c.b.a.d, p5)) {
                return v2_6;
            }
        }
        java.util.Iterator v0_1 = this.b.iterator();
        kotlin.jvm.internal.j.d(v0_1, "iterator(...)");
        while (v0_1.hasNext()) {
            okhttp3.internal.connection.RealCall$AsyncCall v1_2 = ((okhttp3.internal.connection.RealCall$AsyncCall) v0_1.next());
            if (kotlin.jvm.internal.j.a(v1_2.c.b.a.d, p5)) {
                return v1_2;
            }
        }
        return 0;
    }
}
