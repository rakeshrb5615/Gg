package i8;
public final class m {
    public static final synthetic java.util.concurrent.atomic.AtomicReferenceFieldUpdater e;
    public static final synthetic java.util.concurrent.atomic.AtomicLongFieldUpdater f;
    public static final d4.l g;
    private volatile synthetic Object _next$volatile;
    private volatile synthetic long _state$volatile;
    public final int a;
    public final boolean b;
    public final int c;
    public final synthetic java.util.concurrent.atomic.AtomicReferenceArray d;

    static m()
    {
        i8.m.e = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(i8.m, Object, "_next$volatile");
        i8.m.f = java.util.concurrent.atomic.AtomicLongFieldUpdater.newUpdater(i8.m, "_state$volatile");
        i8.m.g = new d4.l("REMOVE_FROZEN", 4, 0);
        return;
    }

    public m(int p3, boolean p4)
    {
        this.a = p3;
        this.b = p4;
        int v4_1 = (p3 - 1);
        this.c = v4_1;
        this.d = new java.util.concurrent.atomic.AtomicReferenceArray(p3);
        if (v4_1 > 1073741823) {
            throw new IllegalStateException("Check failed.");
        } else {
            if ((p3 & v4_1) != 0) {
                throw new IllegalStateException("Check failed.");
            } else {
                return;
            }
        }
    }

    public final int a(Object p15)
    {
        do {
            int v0_0 = i8.m.f;
            int v3_0 = v0_0.get(this);
            if ((3458764513820540928 & v3_0) == 0) {
                int v1_0 = ((int) (1073741823 & v3_0));
                int v9_0 = ((int) ((1152921503533105152 & v3_0) >> 30));
                int v10 = this.c;
                if (((v9_0 + 2) & v10) != (v1_0 & v10)) {
                    java.util.concurrent.atomic.AtomicReferenceArray v11 = this.d;
                    if ((this.b) || (v11.get((v9_0 & v10)) == null)) {
                        if (!i8.m.f.compareAndSet(this, v3_0, ((-1152921503533105153 & v3_0) | (((long) ((v9_0 + 1) & 1073741823)) << 30)))) {
                            break;
                        }
                        v11.set((v9_0 & v10), p15);
                        int v1_9 = this;
                        while ((v0_0.get(v1_9) & 1152921504606846976) != 0) {
                            v1_9 = v1_9.c();
                            java.util.concurrent.atomic.AtomicReferenceArray v2_5 = v1_9.d;
                            int v3_2 = (v1_9.c & v9_0);
                            int v4_1 = v2_5.get(v3_2);
                            if ((!(v4_1 instanceof i8.l)) || (((i8.l) v4_1).a != v9_0)) {
                                v1_9 = 0;
                            } else {
                                v2_5.set(v3_2, p15);
                            }
                            if (v1_9 == 0) {
                                break;
                            }
                        }
                        return 0;
                    } else {
                        java.util.concurrent.atomic.AtomicReferenceArray v2_6 = this.a;
                    }
                }
            } else {
                if ((2305843009213693952 & v3_0) != 0) {
                    return 2;
                }
            }
            return 1;
        } while((v2_6 >= 1024) && (((v9_0 - v1_0) & 1073741823) <= (v2_6 >> 1)));
    }

    public final boolean b()
    {
        do {
            boolean v0_0 = i8.m.f;
            long v2 = v0_0.get(this);
            if ((v2 & 2305843009213693952) == 0) {
                if ((1152921504606846976 & v2) == 0) {
                } else {
                    return 0;
                }
            } else {
                return 1;
            }
        } while(!v0_0.compareAndSet(this, v2, (2305843009213693952 | v2)));
        return 1;
    }

    public final i8.m c()
    {
        do {
            i8.m v1_0;
            java.util.concurrent.atomic.AtomicLongFieldUpdater v0 = i8.m.f;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater v2_1 = v0.get(this);
            if ((v2_1 & 1152921504606846976) == 0) {
                java.util.concurrent.atomic.AtomicReferenceFieldUpdater v4_2 = (1152921504606846976 | v2_1);
                v1_0 = this;
            } else {
                v1_0 = this;
            }
            do {
                java.util.concurrent.atomic.AtomicReferenceFieldUpdater v4_0 = i8.m.e;
                i8.m v5_1 = ((i8.m) v4_0.get(this));
                if (v5_1 == null) {
                    i8.m v5_3 = new i8.m((v1_0.a * 2), v1_0.b);
                    Object v6_4 = ((int) (1073741823 & v2_1));
                    int v7_4 = ((int) ((1152921503533105152 & v2_1) >> 30));
                    while(true) {
                        i8.l v8_0 = v1_0.c;
                        int v9_1 = (v6_4 & v8_0);
                        if (v9_1 == (v8_0 & v7_4)) {
                            break;
                        }
                        i8.l v8_3 = v1_0.d.get(v9_1);
                        if (v8_3 == null) {
                            v8_3 = new i8.l(v6_4);
                        }
                        v5_3.d.set((v5_3.c & v6_4), v8_3);
                        v6_4++;
                    }
                    v0.set(v5_3, (-1152921504606846977 & v2_1));
                    while (!v4_0.compareAndSet(this, 0, v5_3)) {
                    }
                } else {
                    return v5_1;
                }
            } while(v4_0.get(this) == null);
        } while(!v0.compareAndSet(this, v2_1, v4_2));
    }

    public final Object d()
    {
        int v1_0 = this;
        do {
            java.util.concurrent.atomic.AtomicLongFieldUpdater v6 = i8.m.f;
            int v2_0 = v6.get(v1_0);
            if ((v2_0 & 1152921504606846976) == 0) {
                int v0_0 = ((int) (v2_0 & 1073741823));
                boolean v5_0 = v1_0.c;
                int v13_1 = (v0_0 & v5_0);
                if ((((int) ((1152921503533105152 & v2_0) >> 30)) & v5_0) != v13_1) {
                    java.util.concurrent.atomic.AtomicReferenceArray v15 = v1_0.d;
                    long v4_6 = v15.get(v13_1);
                    boolean v5_1 = v1_0.b;
                    if (v4_6 != 0) {
                        if (!(v4_6 instanceof i8.l)) {
                            long v7_3 = ((long) ((v0_0 + 1) & 1073741823));
                            Object v18_2 = v4_6;
                            if (!i8.m.f.compareAndSet(v1_0, v2_0, ((v2_0 & -1073741824) | v7_3))) {
                                v1_0 = this;
                            } else {
                                v15.set(v13_1, 0);
                                return v18_2;
                            }
                        }
                    } else {
                        if (v5_1) {
                        }
                    }
                }
                return 0;
            } else {
                return i8.m.g;
            }
        } while(!v5_1);
        while(true) {
            long v24 = v6.get(v1_0);
            if ((v24 & 1152921504606846976) == 0) {
                i8.m v23 = v1_0;
                int v2_5 = v23;
                if (!i8.m.f.compareAndSet(v23, v24, ((v24 & -1073741824) | v7_3))) {
                    v1_0 = v2_5;
                } else {
                    v2_5.d.set((((int) (v24 & 1073741823)) & v2_5.c), 0);
                    v1_0 = 0;
                }
            } else {
                v1_0 = v1_0.c();
            }
            if (v1_0 == 0) {
                break;
            }
        }
        return v18_2;
    }
}
