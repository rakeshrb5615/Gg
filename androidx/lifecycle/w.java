package androidx.lifecycle;
public final class w extends androidx.lifecycle.p {
    public final boolean a;
    public p.a b;
    public androidx.lifecycle.o c;
    public final ref.WeakReference d;
    public int e;
    public boolean f;
    public boolean g;
    public final java.util.ArrayList h;
    public final g8.y i;

    public w(androidx.lifecycle.u p3)
    {
        new java.util.concurrent.atomic.AtomicReference(0);
        this.a = 1;
        this.b = new p.a();
        androidx.lifecycle.o v0_4 = androidx.lifecycle.o.b;
        this.c = v0_4;
        this.h = new java.util.ArrayList();
        this.d = new ref.WeakReference(p3);
        this.i = new g8.y(v0_4);
        return;
    }

    public final void a(androidx.lifecycle.t p10)
    {
        this.d("addObserver");
        StringBuilder v1_2 = androidx.lifecycle.o.a;
        if (this.c != v1_2) {
            v1_2 = androidx.lifecycle.o.b;
        }
        String v2_15;
        String v0_9 = new androidx.lifecycle.v();
        String v2_24 = (p10 instanceof androidx.lifecycle.s);
        java.util.ArrayList v3_0 = (p10 instanceof g1.j);
        int v6 = 0;
        if ((v2_24 == null) || (v3_0 == null)) {
            if (v3_0 == null) {
                if (v2_24 == null) {
                    String v2_13 = p10.getClass();
                    if (androidx.lifecycle.x.b(v2_13) != 2) {
                        v2_15 = new androidx.lifecycle.g(p10);
                    } else {
                        String v2_16 = androidx.lifecycle.x.b.get(v2_13);
                        kotlin.jvm.internal.j.b(v2_16);
                        String v2_17 = ((java.util.List) v2_16);
                        if (v2_17.size() == 1) {
                            androidx.lifecycle.x.a(((reflect.Constructor) v2_17.get(0)), p10);
                            throw 0;
                        } else {
                            java.util.ArrayList v3_6 = v2_17.size();
                            int v8_2 = new androidx.lifecycle.i[v3_6];
                            if (v3_6 > null) {
                                androidx.lifecycle.x.a(((reflect.Constructor) v2_17.get(0)), p10);
                                throw 0;
                            } else {
                                v2_15 = new androidx.lifecycle.e(v8_2, 0);
                            }
                        }
                    }
                } else {
                    v2_15 = ((androidx.lifecycle.s) p10);
                }
            } else {
                v2_15 = new androidx.lifecycle.g(0, ((g1.j) p10), 0);
            }
        } else {
            v2_15 = new androidx.lifecycle.g(0, ((g1.j) p10), ((androidx.lifecycle.s) p10));
        }
        StringBuilder v1_4;
        v0_9.b = v2_15;
        v0_9.a = v1_2;
        StringBuilder v1_3 = this.b;
        String v2_22 = v1_3.a(p10);
        if (v2_22 == null) {
            String v2_23 = v1_3.e;
            java.util.ArrayList v3_12 = new p.c(p10, v0_9);
            v1_3.d = (v1_3.d + 1);
            int v8_7 = v1_3.b;
            if (v8_7 != 0) {
                v8_7.c = v3_12;
                v3_12.d = v8_7;
                v1_3.b = v3_12;
            } else {
                v1_3.a = v3_12;
                v1_3.b = v3_12;
            }
            v2_23.put(p10, v3_12);
            v1_4 = 0;
        } else {
            v1_4 = v2_22.b;
        }
        if (((androidx.lifecycle.v) v1_4) == null) {
            StringBuilder v1_8 = ((androidx.lifecycle.u) this.d.get());
            if (v1_8 != null) {
                if ((this.e != 0) || (this.f)) {
                    v6 = 1;
                }
                String v2_12 = this.c(p10);
                this.e = (this.e + 1);
                while ((v0_9.a.compareTo(v2_12) < 0) && (this.b.e.containsKey(p10))) {
                    String v2_8;
                    java.util.ArrayList v3_2 = this.h;
                    v3_2.add(v0_9.a);
                    int v8_0 = v0_9.a;
                    androidx.lifecycle.n.Companion.getClass();
                    kotlin.jvm.internal.j.e(v8_0, "state");
                    String v2_7 = v8_0.ordinal();
                    if (v2_7 == 1) {
                        v2_8 = androidx.lifecycle.n.ON_CREATE;
                    } else {
                        if (v2_7 == 2) {
                            v2_8 = androidx.lifecycle.n.ON_START;
                        } else {
                            if (v2_7 == 3) {
                                v2_8 = androidx.lifecycle.n.ON_RESUME;
                            } else {
                                v2_8 = 0;
                            }
                        }
                    }
                    if (v2_8 == null) {
                        StringBuilder v1_1 = new StringBuilder("no event up from ");
                        v1_1.append(v0_9.a);
                        throw new IllegalStateException(v1_1.toString());
                    } else {
                        v0_9.a(v1_8, v2_8);
                        v3_2.remove((v3_2.size() - 1));
                        v2_12 = this.c(p10);
                    }
                }
                if (v6 == 0) {
                    this.h();
                }
                this.e = (this.e - 1);
                return;
            }
        }
        return;
    }

    public final void b(androidx.lifecycle.t p2)
    {
        kotlin.jvm.internal.j.e(p2, "observer");
        this.d("removeObserver");
        this.b.b(p2);
        return;
    }

    public final androidx.lifecycle.o c(androidx.lifecycle.t p4)
    {
        androidx.lifecycle.o v4_1;
        int v0_1 = this.b.e;
        androidx.lifecycle.o v2_1 = 0;
        if (!v0_1.containsKey(p4)) {
            v4_1 = 0;
        } else {
            v4_1 = ((p.c) v0_1.get(p4)).d;
        }
        androidx.lifecycle.o v4_2;
        if (v4_1 == null) {
            v4_2 = 0;
        } else {
            v4_2 = ((androidx.lifecycle.v) v4_1.b).a;
        }
        int v0_2 = this.h;
        if (!v0_2.isEmpty()) {
            v2_1 = ((androidx.lifecycle.o) v0_2.get((v0_2.size() - 1)));
        }
        int v0_4 = this.c;
        kotlin.jvm.internal.j.e(v0_4, "state1");
        if ((v4_2 == null) || (v4_2.compareTo(v0_4) >= 0)) {
            v4_2 = v0_4;
        }
        if ((v2_1 == null) || (v2_1.compareTo(v4_2) >= 0)) {
            return v4_2;
        } else {
            return v2_1;
        }
    }

    public final void d(String p3)
    {
        if (!this.a) {
            return;
        } else {
            o.a.V().f.getClass();
            if (android.os.Looper.getMainLooper().getThread() != Thread.currentThread()) {
                throw new IllegalStateException(v1.a.l("Method ", p3, " must be called on the main thread").toString());
            } else {
                return;
            }
        }
    }

    public final void e(androidx.lifecycle.n p2)
    {
        kotlin.jvm.internal.j.e(p2, "event");
        this.d("handleLifecycleEvent");
        this.f(p2.a());
        return;
    }

    public final void f(androidx.lifecycle.o p6)
    {
        if (this.c != p6) {
            int v0_3 = ((androidx.lifecycle.u) this.d.get());
            IllegalStateException v1_4 = this.c;
            kotlin.jvm.internal.j.e(v1_4, "current");
            if ((v1_4 == androidx.lifecycle.o.b) && (p6 == androidx.lifecycle.o.a)) {
                String v2_2 = new StringBuilder("State must be at least \'");
                v2_2.append(androidx.lifecycle.o.c);
                v2_2.append("\' to be moved to \'");
                v2_2.append(p6);
                v2_2.append("\' in component ");
                v2_2.append(v0_3);
                throw new IllegalStateException(v2_2.toString().toString());
            } else {
                String v2_3 = androidx.lifecycle.o.a;
                if ((v1_4 == v2_3) && (v1_4 != p6)) {
                    StringBuilder v3_4 = new StringBuilder("State is \'");
                    v3_4.append(v2_3);
                    v3_4.append("\' and cannot be moved to `");
                    v3_4.append(p6);
                    v3_4.append("` in component ");
                    v3_4.append(v0_3);
                    throw new IllegalStateException(v3_4.toString().toString());
                } else {
                    this.c = p6;
                    if ((!this.f) && (this.e == 0)) {
                        this.f = 1;
                        this.h();
                        this.f = 0;
                        if (this.c == v2_3) {
                            this.b = new p.a();
                        }
                    } else {
                        this.g = 1;
                        return;
                    }
                }
            }
        }
        return;
    }

    public final void g()
    {
        this.d("setCurrentState");
        this.f(androidx.lifecycle.o.c);
        return;
    }

    public final void h()
    {
        IllegalStateException v0_7 = ((androidx.lifecycle.u) this.d.get());
        if (v0_7 == null) {
            throw new IllegalStateException("LifecycleOwner of this LifecycleRegistry is already garbage collected. It is too late to change lifecycle state.");
        }
        do {
            String v1_34 = this.b;
            if (v1_34.d != 0) {
                String v1_2 = v1_34.a;
                kotlin.jvm.internal.j.b(v1_2);
                String v1_9 = ((androidx.lifecycle.v) v1_2.b).a;
                StringBuilder v2_6 = this.b.b;
                kotlin.jvm.internal.j.b(v2_6);
                StringBuilder v2_9 = ((androidx.lifecycle.v) v2_6.b).a;
                if ((v1_9 != v2_9) || (this.c != v2_9)) {
                    this.g = 0;
                    String v1_14 = this.c;
                    StringBuilder v2_11 = this.b.a;
                    kotlin.jvm.internal.j.b(v2_11);
                    java.util.ArrayList v7 = this.h;
                    if (v1_14.compareTo(((androidx.lifecycle.v) v2_11.b).a) < 0) {
                        String v1_16 = this.b;
                        p.d v8_1 = new p.b(v1_16.b, v1_16.a, 1);
                        v1_16.c.put(v8_1, Boolean.FALSE);
                        while ((v8_1.hasNext()) && (!this.g)) {
                            String v1_4 = ((java.util.Map$Entry) v8_1.next());
                            kotlin.jvm.internal.j.b(v1_4);
                            androidx.lifecycle.t v9_1 = ((androidx.lifecycle.t) v1_4.getKey());
                            String v1_6 = ((androidx.lifecycle.v) v1_4.getValue());
                            while ((v1_6.a.compareTo(this.c) > 0) && ((!this.g) && (this.b.e.containsKey(v9_1)))) {
                                int v10_15;
                                androidx.lifecycle.o v11_2 = v1_6.a;
                                androidx.lifecycle.n.Companion.getClass();
                                kotlin.jvm.internal.j.e(v11_2, "state");
                                int v10_14 = v11_2.ordinal();
                                if (v10_14 == 2) {
                                    v10_15 = androidx.lifecycle.n.ON_DESTROY;
                                } else {
                                    if (v10_14 == 3) {
                                        v10_15 = androidx.lifecycle.n.ON_STOP;
                                    } else {
                                        if (v10_14 == 4) {
                                            v10_15 = androidx.lifecycle.n.ON_PAUSE;
                                        } else {
                                            v10_15 = 0;
                                        }
                                    }
                                }
                                if (v10_15 == 0) {
                                    StringBuilder v2_4 = new StringBuilder("no event down from ");
                                    v2_4.append(v1_6.a);
                                    throw new IllegalStateException(v2_4.toString());
                                } else {
                                    v7.add(v10_15.a());
                                    v1_6.a(v0_7, v10_15);
                                    v7.remove((v7.size() - 1));
                                }
                            }
                        }
                    }
                    String v1_21 = this.b.b;
                }
            }
            this.g = 0;
            this.i.d(this.c);
            return;
        } while((this.g) || ((v1_21 == null) || (this.c.compareTo(((androidx.lifecycle.v) v1_21.b).a) <= 0)));
        String v1_27 = this.b;
        v1_27.getClass();
        p.d v8_5 = new p.d(v1_27);
        v1_27.c.put(v8_5, Boolean.FALSE);
        while ((v8_5.hasNext()) && (!this.g)) {
            String v1_32 = ((java.util.Map$Entry) v8_5.next());
            androidx.lifecycle.t v9_6 = ((androidx.lifecycle.t) v1_32.getKey());
            String v1_35 = ((androidx.lifecycle.v) v1_32.getValue());
            while ((v1_35.a.compareTo(this.c) < 0) && ((!this.g) && (this.b.e.containsKey(v9_6)))) {
                int v10_4;
                v7.add(v1_35.a);
                androidx.lifecycle.o v11_0 = v1_35.a;
                androidx.lifecycle.n.Companion.getClass();
                kotlin.jvm.internal.j.e(v11_0, "state");
                int v10_3 = v11_0.ordinal();
                if (v10_3 == 1) {
                    v10_4 = androidx.lifecycle.n.ON_CREATE;
                } else {
                    if (v10_3 == 2) {
                        v10_4 = androidx.lifecycle.n.ON_START;
                    } else {
                        if (v10_3 == 3) {
                            v10_4 = androidx.lifecycle.n.ON_RESUME;
                        } else {
                            v10_4 = 0;
                        }
                    }
                }
                if (v10_4 == 0) {
                    StringBuilder v2_2 = new StringBuilder("no event up from ");
                    v2_2.append(v1_35.a);
                    throw new IllegalStateException(v2_2.toString());
                } else {
                    v1_35.a(v0_7, v10_4);
                    v7.remove((v7.size() - 1));
                }
            }
        }
    }
}
