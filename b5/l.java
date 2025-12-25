package b5;
public final class l implements java.lang.Runnable {
    public final synthetic int a;
    public Object b;
    public final Object c;

    public synthetic l(int p1, Object p2, Object p3)
    {
        this.a = p1;
        this.b = p2;
        this.c = p3;
        return;
    }

    public l(b5.m p2)
    {
        this.a = 0;
        this.c = p2;
        return;
    }

    public l(i8.g p2, Runnable p3)
    {
        this.a = 6;
        this.c = p2;
        this.b = p3;
        return;
    }

    public l(z4.i p2, String p3)
    {
        this.a = 10;
        this.c = p2;
        this.b = com.google.android.gms.common.internal.Preconditions.checkNotEmpty(p3);
        return;
    }

    public void a()
    {
        Throwable v0_0 = 0;
        int v1_0 = 0;
        try {
            while(true) {
                if (v0_0 != null) {
                    java.util.logging.Logger v4_4 = ((Runnable) ((b5.m) this.c).b.poll());
                    this.b = v4_4;
                    if (v4_4 == null) {
                        break;
                    }
                    v1_0 |= Thread.interrupted();
                    try {
                        ((Runnable) this.b).run();
                    } catch (RuntimeException v3_2) {
                        String v6_3 = new StringBuilder();
                        v6_3.append("Exception while executing runnable ");
                        v6_3.append(((Runnable) this.b));
                        b5.m.f.log(java.util.logging.Level.SEVERE, v6_3.toString(), v3_2);
                    } catch (Throwable v0_1) {
                        this.b = 0;
                        throw v0_1;
                    }
                    this.b = 0;
                } else {
                    Throwable v0_8 = ((b5.m) this.c);
                    if (v0_8.c != 4) {
                        v0_8.d = (v0_8.d + 1);
                        v0_8.c = 4;
                        v0_0 = 1;
                    } else {
                        if (v1_0 != 0) {
                            Thread.currentThread().interrupt();
                        }
                    }
                }
                return;
            }
        } catch (Throwable v0_6) {
            if (v1_0 != 0) {
                Thread.currentThread().interrupt();
            }
            throw v0_6;
        }
        ((b5.m) this.c).c = 1;
        if (v1_0 != 0) {
        }
        return;
    }

    public final void run()
    {
        switch (this.a) {
            case 0:
                try {
                    this.a();
                    return;
                } catch (Throwable v0_9) {
                    ((b5.m) this.c).c = 1;
                    throw v0_9;
                }
            case 1:
                ((d0.b) this.b).a = this.c;
                return;
            case 2:
                ((android.app.Application) this.b).unregisterActivityLifecycleCallbacks(((d0.b) this.c));
                return;
            case 3:
                Throwable v0_33 = this.c;
                boolean v1_31 = this.b;
                String v2_13 = d0.c.d;
                if (v2_13 == null) {
                    d0.c.e.invoke(v1_31, new Object[] {v0_33, Boolean.FALSE}));
                    return;
                } else {
                    v2_13.invoke(v1_31, new Object[] {v0_33, Boolean.FALSE, "AppCompat recreation"}));
                    return;
                }
            case 4:
                ((d8.n) this.c).B(((d8.z0) this.b));
                return;
            case 5:
                ((d8.n) this.b).B(((e8.c) this.c));
                return;
            case 6:
                Throwable v0_27 = ((i8.g) this.c);
                boolean v1_25 = v0_27.d;
                String v2_12 = 0;
                try {
                    do {
                        ((Runnable) this.b).run();
                    } while((v2_12 < 16) || (!v1_25.s(v0_27)));
                    v1_25.i(v0_27, this);
                    return;
                } catch (boolean v3_8) {
                    d8.f0.l(v3_8, l7.i.a);
                }
                boolean v3_9 = v0_27.y();
                if (v3_9) {
                    this.b = v3_9;
                    v2_12++;
                    if ((v2_12 >= 16) && (v1_25.s(v0_27))) {
                    }
                }
                return;
            case 7:
                Throwable v0_25 = ((g0.b) ((l6.c) this.b).b);
                if (v0_25 != null) {
                    v0_25.i(((android.graphics.Typeface) this.c));
                }
                return;
            case 8:
                ((n0.f) this.b).accept(this.c);
                return;
            case 9:
                Throwable v0_18 = ((p4.a) this.c);
                try {
                    v0_18.onSuccess(a.a.v(((p4.b) this.b)));
                } catch (boolean v1_20) {
                    v0_18.onFailure(v1_20.getCause());
                } catch (boolean v1_19) {
                    v0_18.onFailure(v1_19);
                } catch (boolean v1_19) {
                }
                return;
            case 10:
                Throwable v0_28 = com.google.firebase.auth.FirebaseAuth.getInstance(q4.f.e(((String) this.b)));
                boolean v1_26 = v0_28.f;
                if (v1_26) {
                    String v2_5 = ((z4.e) v1_26).a;
                    v2_5.zzg();
                    Throwable v0_15 = v0_28.e.zza(v0_28.a, v1_26, v2_5.zzd(), new y4.g(v0_28, 1));
                    boolean v3_5 = new Object[0];
                    z4.i.e.v("Token refreshing started", v3_5);
                    v0_15.addOnFailureListener(new j6.o(this, 23));
                }
                return;
            default:
                q4.b.C(((z8.v) this.b)).resumeWith(c4.b.p(((Throwable) this.c)));
                return;
        }
    }

    public String toString()
    {
        switch (this.a) {
            case 0:
                String v0_7;
                String v0_4 = ((Runnable) this.b);
                if (v0_4 == null) {
                    String v2_6;
                    String v0_6 = new StringBuilder("SequentialExecutorWorker{state=");
                    String v2_5 = ((b5.m) this.c).c;
                    if (v2_5 == 1) {
                        v2_6 = "IDLE";
                    } else {
                        if (v2_5 == 2) {
                            v2_6 = "QUEUING";
                        } else {
                            if (v2_5 == 3) {
                                v2_6 = "QUEUED";
                            } else {
                                if (v2_5 == 4) {
                                    v2_6 = "RUNNING";
                                } else {
                                    v2_6 = "null";
                                }
                            }
                        }
                    }
                    v0_6.append(v2_6);
                    v0_6.append("}");
                    v0_7 = v0_6.toString();
                } else {
                    String v2_8 = new StringBuilder("SequentialExecutorWorker{running=");
                    v2_8.append(v0_4);
                    v2_8.append("}");
                    v0_7 = v2_8.toString();
                }
                return v0_7;
            case 9:
                String v0_9 = new b8.g(this.getClass().getSimpleName());
                p4.a v1_4 = ((p4.a) this.c);
                String v2_1 = new k2.c(29, 0);
                ((k2.c) v0_9.d).c = v2_1;
                v0_9.d = v2_1;
                v2_1.b = v1_4;
                return v0_9.toString();
            default:
                return super.toString();
        }
    }
}
