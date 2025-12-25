package a5;
public final synthetic class i implements java.lang.Runnable {
    public final synthetic int a;
    public final synthetic Object b;
    public final synthetic Object c;

    public synthetic i(int p1, Object p2, Object p3)
    {
        this.a = p1;
        this.c = p2;
        this.b = p3;
        return;
    }

    public final void run()
    {
        Throwable v1_0 = 0;
        String v2_0 = 1;
        switch (this.a) {
            case 0:
                Exception v0_30 = ((a5.v) this.c);
                String v2_12 = ((c6.b) this.b);
                if (v0_30.b != a5.v.d) {
                    throw new IllegalStateException("provide() can be called only once.");
                } else {
                    c6.a v3_6 = v0_30.a;
                    v0_30.a = 0;
                    v0_30.b = v2_12;
                    v3_6.a(v2_12);
                    return;
                }
            case 1:
                Exception v0_27 = ((a5.s) this.c);
                Throwable v1_22 = ((c6.b) this.b);
                if (v0_27.b != null) {
                    v0_27.b.add(v1_22.get());
                } else {
                    v0_27.a.add(v1_22);
                }
                return;
            case 2:
                Exception v0_24 = ((b5.a) this.c);
                Throwable v1_20 = ((Runnable) this.b);
                android.os.Process.setThreadPriority(v0_24.c);
                Exception v0_25 = v0_24.d;
                if (v0_25 != null) {
                    android.os.StrictMode.setThreadPolicy(v0_25);
                }
                v1_20.run();
                return;
            case 3:
                Throwable v1_17 = ((b5.i) ((l6.c) this.b).b);
                try {
                    v1_17.j(((java.util.concurrent.Callable) this.c).call());
                } catch (Exception v0_22) {
                    v1_17.k(v0_22);
                }
                return;
            case 4:
                Exception v0_18 = ((c.n) this.c);
                v0_18.getLifecycle().a(new c.d(0, ((c.v) this.b), v0_18));
                return;
            case 5:
                ((g0.b) this.c).i(((android.graphics.Typeface) this.b));
                return;
            case 6:
                ((g5.n) this.c).c(((String) this.b), Boolean.FALSE);
                return;
            case 7:
                Exception v0_10 = ((h.n) this.c);
                Throwable v1_5 = ((Runnable) this.b);
                v0_10.getClass();
                try {
                    v1_5.run();
                    v0_10.a();
                    return;
                } catch (Throwable v1_6) {
                    v0_10.a();
                    throw v1_6;
                }
            case 8:
                Exception v0_5 = ((i2.h) this.c);
                Throwable v1_3 = ((android.view.View) this.b);
                if (v0_5.getArguments() != null) {
                    Exception v0_7 = v0_5.getArguments().getInt("arg_background_color", -1);
                    String v2_3 = v1_3.getBackground();
                    if (!(v2_3 instanceof v3.k)) {
                        v1_3.setBackgroundColor(v0_7);
                    } else {
                        ((v3.k) v2_3).o(android.content.res.ColorStateList.valueOf(v0_7));
                    }
                }
                return;
            case 9:
                Exception v0_50 = ((i2.n0) this.c);
                int v4_5 = ((i2.v0) this.b);
                try {
                    v0_50.d();
                    long v6_19 = v4_5.b;
                    v0_50.c = v6_19;
                } catch (InterruptedException) {
                    v0_50.Z = 0;
                }
                if (v6_19 != 0) {
                    v6_19.onSurfaceCreated(0, 0);
                    long v6_20 = v0_50.getSurfaceHolder();
                    if (v6_20 != 0) {
                        v0_50.c.onSurfaceChanged(0, v6_20.getSurfaceFrame().width(), v6_20.getSurfaceFrame().height());
                        android.opengl.EGL14.eglSwapInterval(v0_50.V, 1);
                        v4_5.I1 = 1;
                        v4_5.K1 = 1;
                        if ((!v0_50.Z) || (Thread.currentThread().isInterrupted())) {
                            v0_50.c();
                            v0_50.Z = 0;
                            return;
                        } else {
                            if (v4_5.J1) {
                                v0_50.N = v2_0;
                            }
                            while(true) {
                                long v6_8 = ((Runnable) v0_50.Q.poll());
                                if (v6_8 == 0) {
                                    break;
                                }
                                v6_8.run();
                            }
                            long v6_9 = System.nanoTime();
                            if ((v0_50.a0) && (v6_9 >= (v0_50.c0 + 100000000))) {
                                long v8_5 = v0_50.b0;
                                if ((v6_9 - v8_5) < 10000000000) {
                                    long v8_8 = (((v8_5 + 10000000000) - System.nanoTime()) / 1000000);
                                    if (v8_8 > 0) {
                                        Thread.sleep(Math.min(v8_8, 30));
                                    }
                                } else {
                                }
                            }
                            v0_50.b0 = v6_9;
                            v0_50.c.onDrawFrame(v1_0);
                            android.opengl.EGL14.eglSwapBuffers(v0_50.V, v0_50.X);
                        }
                    } else {
                    }
                } else {
                }
            case 10:
                Exception v0_41 = ((i2.t0) this.c);
                String v2_15 = v0_41.i;
                v0_41.g = new java.util.ArrayList(((java.util.List) this.b));
                if (v0_41.f.size() != v0_41.g.size()) {
                    v0_41.f = new java.util.ArrayList(java.util.Collections.nCopies(v0_41.g.size(), Float.valueOf(1065353216)));
                }
                v0_41.a.b();
                v2_15.setAlpha(0);
                v2_15.animate().alpha(1065353216).setDuration(((long) 200)).start();
                return;
            case 11:
                Exception v0_37 = ((m5.c) this.c);
                ((i5.g) v0_37.c).i(((String) v0_37.b), ((java.util.List) this.b));
                return;
            case 12:
                Throwable v1_18 = ((com.google.android.gms.tasks.TaskCompletionSource) this.b);
                try {
                    v1_18.setResult(((j6.n) this.c).c());
                } catch (Exception v0_33) {
                    v1_18.setException(v0_33);
                }
                return;
            case 13:
                Throwable v1_40 = ((java.util.concurrent.CountDownLatch) this.b);
                try {
                    r2.r.a().d.c(((r2.j) ((n5.c) this.c).h.b).b(o2.d.c), 1);
                } catch (Exception) {
                }
                v1_40.countDown();
                return;
            default:
                ((com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService) this.c).jobFinished(((android.app.job.JobParameters) this.b), 0);
                return;
        }
    }
}
