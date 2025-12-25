package d8;
public abstract class f0 {
    public static final d4.l a;
    public static final d4.l b;
    public static final d4.l c;
    public static final d4.l d;
    public static final d4.l e;
    public static final d4.l f;
    public static final d4.l g;
    public static final d4.l h;
    public static final d8.r0 i;
    public static final d8.r0 j;

    static synthetic f0()
    {
        d8.f0.a = new d4.l("RESUME_TOKEN", 4, 0);
        d8.f0.b = new d4.l("REMOVED_TASK", 4, 0);
        d8.f0.c = new d4.l("CLOSED_EMPTY", 4, 0);
        d8.f0.d = new d4.l("COMPLETING_ALREADY", 4, 0);
        d8.f0.e = new d4.l("COMPLETING_WAITING_CHILDREN", 4, 0);
        d8.f0.f = new d4.l("COMPLETING_RETRY", 4, 0);
        d8.f0.g = new d4.l("TOO_LATE_TO_CANCEL", 4, 0);
        d8.f0.h = new d4.l("SEALED", 4, 0);
        d8.f0.i = new d8.r0(0);
        d8.f0.j = new d8.r0(1);
        return;
    }

    public static d8.u a()
    {
        d8.u v0_1 = new d8.u(1);
        v0_1.x(0);
        return v0_1;
    }

    public static final i8.c b(l7.h p2)
    {
        if (p2.get(d8.b0.b) == null) {
            p2 = p2.plus(new d8.g1());
        }
        return new i8.c(p2);
    }

    public static d8.j0 c(d8.c0 p3, u7.p p4)
    {
        d8.j0 v1_2 = new d8.j0(d8.f0.q(p3, l7.i.a), 1);
        v1_2.Q(d8.d0.a, v1_2, p4);
        return v1_2;
    }

    public static final Object d(d8.i0[] p8, n7.i p9)
    {
        if (p8.length != 0) {
            d8.c v0_3 = new d8.e(p8);
            d8.n v1_1 = new d8.n(1, q4.b.C(p9));
            v1_1.r();
            m7.a v9_1 = p8.length;
            d8.c[] v3 = new d8.c[v9_1];
            int v4 = 0;
            int v5 = 0;
            while (v5 < v9_1) {
                d8.p0 v6_0 = p8[v5];
                v6_0.start();
                d8.c v7_1 = new d8.c(v0_3, v1_1);
                v7_1.f = d8.f0.m(v6_0, 1, v7_1);
                v3[v5] = v7_1;
                v5++;
            }
            Object v8_2 = new d8.d(v3);
            while (v4 < v9_1) {
                d8.c v0_2 = v3[v4];
                v0_2.getClass();
                d8.c.n.set(v0_2, v8_2);
                v4++;
            }
            if ((d8.n.m.get(v1_1) instanceof d8.u1)) {
                v1_1.u(v8_2);
            } else {
                v8_2.b();
            }
            return v1_1.q();
        } else {
            return i7.n.a;
        }
    }

    public static final Object e(u7.p p2, l7.c p3)
    {
        return q4.b.S(new i8.q(p3, p3.getContext()), new i8.q(p3, p3.getContext()), p2);
    }

    public static final Object f(long p3, n7.c p5)
    {
        if (p3 > 0) {
            d8.n v0_3 = new d8.n(1, q4.b.C(p5));
            v0_3.r();
            if (p3 < 9223372036854775807) {
                d8.f0.i(v0_3.e).f(p3, v0_3);
            }
            Object v3_1 = v0_3.q();
            if (v3_1 == m7.a.a) {
                return v3_1;
            }
        }
        return h7.l.a;
    }

    public static final void g(l7.h p1)
    {
        java.util.concurrent.CancellationException v1_2 = ((d8.e1) p1.get(d8.b0.b));
        if ((v1_2 != null) && (!v1_2.isActive())) {
            throw v1_2.getCancellationException();
        } else {
            return;
        }
    }

    public static final l7.h h(l7.h p3, l7.h p4, boolean p5)
    {
        d8.x v5_0 = Boolean.FALSE;
        int v0_7 = ((Boolean) p3.fold(v5_0, new d8.x(0))).booleanValue();
        d8.x v5_3 = ((Boolean) p4.fold(v5_0, new d8.x(0))).booleanValue();
        if ((v0_7 != 0) || (v5_3 != null)) {
            l7.i v1_3 = l7.i.a;
            l7.h v3_2 = ((l7.h) p3.fold(v1_3, new d8.x(1)));
            if (v5_3 != null) {
                p4 = ((l7.h) p4).fold(v1_3, new d8.x(2));
            }
            return v3_2.plus(((l7.h) p4));
        } else {
            return p3.plus(p4);
        }
    }

    public static final d8.k0 i(l7.h p1)
    {
        d8.k0 v1_2;
        d8.k0 v1_1 = p1.get(l7.d.a);
        if (!(v1_1 instanceof d8.k0)) {
            v1_2 = 0;
        } else {
            v1_2 = ((d8.k0) v1_1);
        }
        if (v1_2 == null) {
            v1_2 = d8.h0.a;
        }
        return v1_2;
    }

    public static final String j(Object p0)
    {
        return Integer.toHexString(System.identityHashCode(p0));
    }

    public static final d8.n k(l7.c p6)
    {
        if ((p6 instanceof i8.f)) {
            String v1_2 = i8.a.c;
            int v2_2 = i8.f.n;
            while(true) {
                d8.n v3_0;
                d8.n v3_1 = v2_2.get(((i8.f) p6));
                d8.n v4_1 = 0;
                if (v3_1 != null) {
                    if (!(v3_1 instanceof d8.n)) {
                        break;
                    }
                    while (!v2_2.compareAndSet(((i8.f) p6), v3_1, v1_2)) {
                        if (v2_2.get(((i8.f) p6)) != v3_1) {
                        }
                    }
                    v3_0 = ((d8.n) v3_1);
                } else {
                    v2_2.set(((i8.f) p6), v1_2);
                    v3_0 = 0;
                }
                if (v3_0 != null) {
                    String v0_7 = d8.n.m;
                    String v1_1 = v0_7.get(v3_0);
                    if ((!(v1_1 instanceof d8.v)) || (((d8.v) v1_1).d == null)) {
                        d8.n.f.set(v3_0, 536870911);
                        v0_7.set(v3_0, d8.b.a);
                        v4_1 = v3_0;
                    } else {
                        v3_0.n();
                    }
                    if (v4_1 != null) {
                        return v4_1;
                    }
                }
                return new d8.n(2, p6);
            }
            if ((v3_1 != v1_2) && (!(v3_1 instanceof Throwable))) {
                String v0_2 = new StringBuilder("Inconsistent state ");
                v0_2.append(v3_1);
                throw new IllegalStateException(v0_2.toString().toString());
            }
        } else {
            return new d8.n(1, p6);
        }
    }

    public static final void l(Throwable p3, l7.h p4)
    {
        try {
            Throwable v0_2 = ((e8.b) p4.get(d8.b0.a));
        } catch (Throwable v0_3) {
            if (p3 != v0_3) {
                RuntimeException v1_1 = new RuntimeException("Exception while trying to handle coroutine exception", v0_3);
                q4.b.a(v1_1, p3);
                p3 = v1_1;
            }
            i8.a.d(p3, p4);
            return;
        }
        if (v0_2 == null) {
            i8.a.d(p3, p4);
            return;
        } else {
            v0_2.i(p3);
            return;
        }
    }

    public static final d8.p0 m(d8.e1 p8, boolean p9, d8.i1 p10)
    {
        if (!(p8 instanceof d8.r1)) {
            return p8.invokeOnCompletion(p10.j(), p9, new d8.h1(1, p10, d8.i1, "invoke", "invoke(Ljava/lang/Throwable;)V", 0));
        } else {
            return ((d8.r1) p8).y(p9, p10);
        }
    }

    public static final Object n(java.util.List p4, n7.c p5)
    {
        d8.g v0_2;
        if (!(p5 instanceof d8.g)) {
            v0_2 = new d8.g(p5);
        } else {
            v0_2 = ((d8.g) p5);
            m7.a v1_2 = ((d8.g) p5).c;
            if ((v1_2 & -2147483648) == 0) {
            } else {
                ((d8.g) p5).c = (v1_2 - -2147483648);
            }
        }
        h7.l v4_1;
        Object v5_1 = v0_2.b;
        m7.a v1_1 = m7.a.a;
        int v2_0 = v0_2.c;
        if (v2_0 == 0) {
            c4.b.e0(v5_1);
            v4_1 = p4.iterator();
        } else {
            if (v2_0 != 1) {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            } else {
                v4_1 = v0_2.a;
                c4.b.e0(v5_1);
            }
        }
        while (v4_1.hasNext()) {
            Object v5_5 = ((d8.e1) v4_1.next());
            v0_2.a = v4_1;
            v0_2.c = 1;
            if (v5_5.join(v0_2) == v1_1) {
                return v1_1;
            }
        }
        return h7.l.a;
    }

    public static final Object o(d8.e1[] p6, n7.c p7)
    {
        d8.f v0_2;
        if (!(p7 instanceof d8.f)) {
            v0_2 = new d8.f(p7);
        } else {
            v0_2 = ((d8.f) p7);
            m7.a v1_2 = ((d8.f) p7).e;
            if ((v1_2 & -2147483648) == 0) {
            } else {
                ((d8.f) p7).e = (v1_2 - -2147483648);
            }
        }
        int v2_1;
        h7.l v6_1;
        String v7_3;
        String v7_1 = v0_2.d;
        m7.a v1_1 = m7.a.a;
        int v2_0 = v0_2.e;
        if (v2_0 == 0) {
            c4.b.e0(v7_1);
            v2_1 = 0;
            v7_3 = p6;
            v6_1 = p6.length;
        } else {
            if (v2_0 != 1) {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            } else {
                v6_1 = v0_2.c;
                v2_1 = v0_2.b;
                Object v4_1 = ((d8.e1[]) v0_2.a);
                c4.b.e0(v7_1);
                v7_3 = v4_1;
                v2_1++;
            }
        }
        if (v2_1 >= v6_1) {
            return h7.l.a;
        } else {
            Object v4_2 = v7_3[v2_1];
            v0_2.a = v7_3;
            v0_2.b = v2_1;
            v0_2.c = v6_1;
            v0_2.e = 1;
            if (v4_2.join(v0_2) != v1_1) {
            } else {
                return v1_1;
            }
        }
    }

    public static d8.w1 p(d8.c0 p3, u7.p p4)
    {
        d8.w1 v1_2 = new d8.w1(d8.f0.q(p3, l7.i.a), 1);
        v1_2.Q(d8.d0.a, v1_2, p4);
        return v1_2;
    }

    public static final l7.h q(d8.c0 p1, l7.h p2)
    {
        l7.h v1_2 = d8.f0.h(p1.a(), p2, 1);
        k8.e v2_1 = d8.n0.a;
        if ((v1_2 != v2_1) && (v1_2.get(l7.d.a) == null)) {
            v1_2 = v1_2.plus(v2_1);
        }
        return v1_2;
    }

    public static final Object r(Object p1)
    {
        if ((p1 instanceof d8.w)) {
            p1 = c4.b.p(((d8.w) p1).a);
        }
        return p1;
    }

    public static final void s(d8.n p2, l7.c p3, boolean p4)
    {
        boolean v2_3;
        l7.h v0_2 = d8.n.m.get(p2);
        int v1_2 = p2.f(v0_2);
        if (v1_2 == 0) {
            v2_3 = p2.g(v0_2);
        } else {
            v2_3 = c4.b.p(v1_2);
        }
        if (!p4) {
            p3.resumeWith(v2_3);
            return;
        } else {
            int v1_1;
            kotlin.jvm.internal.j.c(p3, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTaskKt.resume>");
            boolean v4_2 = ((i8.f) p3).e;
            Object v3_2 = ((i8.f) p3).m;
            l7.h v0_1 = v4_2.getContext();
            Object v3_3 = i8.a.l(v0_1, v3_2);
            if (v3_3 == i8.a.d) {
                v1_1 = 0;
            } else {
                v1_1 = d8.f0.w(v4_2, v0_1, v3_3);
            }
            try {
                v4_2.resumeWith(v2_3);
            } catch (boolean v2_1) {
                if (v1_1 == 0) {
                    i8.a.g(v0_1, v3_3);
                } else {
                    if (v1_1.R()) {
                    }
                }
                throw v2_1;
            }
            if ((v1_1 != 0) && (!v1_1.R())) {
                return;
            } else {
                i8.a.g(v0_1, v3_3);
                return;
            }
        }
    }

    public static Object t(u7.p p5)
    {
        int v0_0 = Thread.currentThread();
        int v1_3 = d8.z1.a();
        int v2_0 = d8.f0.h(l7.i.a, v1_3, 1);
        d8.h v3_3 = d8.n0.a;
        if ((v2_0 != v3_3) && (v2_0.get(l7.d.a) == null)) {
            v2_0 = v2_0.plus(v3_3);
        }
        d8.h v3_1 = new d8.h(v2_0, v0_0, v1_3);
        v3_1.Q(d8.d0.a, v3_1, p5);
        int v0_2 = v3_1.e;
        if (v0_2 != 0) {
            v0_2.A(0);
        }
        while (!Thread.interrupted()) {
            int v1_4;
            if (v0_2 == 0) {
                v1_4 = 9223372036854775807;
            } else {
                v1_4 = v0_2.B();
            }
            if (v3_1.isCompleted()) {
                if (v0_2 != 0) {
                    v0_2.y(0);
                }
                int v0_4;
                Throwable v5_4 = d8.f0.v(d8.r1.a.get(v3_1));
                if (!(v5_4 instanceof d8.w)) {
                    v0_4 = 0;
                } else {
                    v0_4 = ((d8.w) v5_4);
                }
                if (v0_4 != 0) {
                    throw v0_4.a;
                } else {
                    return v5_4;
                }
            } else {
                java.util.concurrent.locks.LockSupport.parkNanos(v3_1, v1_4);
            }
        }
        int v1_2 = new InterruptedException();
        v3_1.i(v1_2);
        throw v1_2;
    }

    public static final String u(l7.c p3)
    {
        if (!(p3 instanceof i8.f)) {
            try {
                String v1_6 = new StringBuilder();
                v1_6.append(p3);
                v1_6.append(64);
                v1_6.append(d8.f0.j(p3));
                String v1_0 = v1_6.toString();
            } catch (String v1_1) {
                v1_0 = c4.b.p(v1_1);
            }
            if (h7.h.a(v1_0) != null) {
                String v1_3 = new StringBuilder();
                v1_3.append(p3.getClass().getName());
                v1_3.append(64);
                v1_3.append(d8.f0.j(p3));
                v1_0 = v1_3.toString();
            }
            return ((String) v1_0);
        } else {
            return ((i8.f) p3).toString();
        }
    }

    public static final Object v(Object p1)
    {
        d8.b1 v0_1;
        if (!(p1 instanceof d8.c1)) {
            v0_1 = 0;
        } else {
            v0_1 = ((d8.c1) p1);
        }
        if (v0_1 != null) {
            d8.b1 v0_3 = v0_1.a;
            if (v0_3 != null) {
                return v0_3;
            }
        }
        return p1;
    }

    public static final d8.d2 w(l7.c p2, l7.h p3, Object p4)
    {
        d8.d2 v1_0 = 0;
        if (((p2 instanceof n7.d)) && (p3.get(d8.e2.a) != null)) {
            n7.d v2_1 = ((n7.d) p2);
            while (!(v2_1 instanceof d8.l0)) {
                v2_1 = v2_1.getCallerFrame();
                if (v2_1 == null) {
                    break;
                }
                if ((v2_1 instanceof d8.d2)) {
                    v1_0 = ((d8.d2) v2_1);
                    break;
                }
            }
            if (v1_0 != null) {
                v1_0.S(p3, p4);
            }
        }
        return v1_0;
    }

    public static final Object x(l7.h p4, u7.p p5, l7.c p6)
    {
        Throwable v4_1;
        d8.l0 v0_0 = p6.getContext();
        if (((Boolean) p4.fold(Boolean.FALSE, new d8.x(0))).booleanValue()) {
            v4_1 = d8.f0.h(v0_0, p4, 0);
        } else {
            v4_1 = v0_0.plus(p4);
        }
        Throwable v4_6;
        d8.f0.g(v4_1);
        if (v4_1 != v0_0) {
            l7.d v1_1 = l7.d.a;
            if (!kotlin.jvm.internal.j.a(v4_1.get(v1_1), v0_0.get(v1_1))) {
                d8.l0 v0_4 = new d8.l0(p6, v4_1);
                try {
                    i8.a.h(h7.l.a, q4.b.C(q4.b.k(v0_4, v0_4, p5)));
                    Throwable v4_4 = d8.l0.e;
                } catch (Throwable v4_5) {
                    v0_4.resumeWith(c4.b.p(v4_5));
                    throw v4_5;
                }
                do {
                    String v5_3 = v4_4.get(v0_4);
                    if (v5_3 == null) {
                    } else {
                        if (v5_3 != 2) {
                            throw new IllegalStateException("Already suspended");
                        } else {
                            v4_6 = d8.f0.v(d8.r1.a.get(v0_4));
                            if ((v4_6 instanceof d8.w)) {
                                throw ((d8.w) v4_6).a;
                            }
                        }
                    }
                } while(!v4_4.compareAndSet(v0_4, 0, 1));
                v4_6 = m7.a.a;
            } else {
                d8.l0 v0_6 = new d8.d2(p6, v4_1);
                l7.h v6_1 = v0_6.c;
                Throwable v4_15 = i8.a.l(v6_1, 0);
                try {
                    String v5_8 = q4.b.S(v0_6, v0_6, p5);
                    i8.a.g(v6_1, v4_15);
                    v4_6 = v5_8;
                } catch (String v5_9) {
                    i8.a.g(v6_1, v4_6);
                    throw v5_9;
                }
            }
        } else {
            v4_6 = q4.b.S(new i8.q(p6, v4_1), new i8.q(p6, v4_1), p5);
        }
        return v4_6;
    }

    public static final Object y(long p3, u7.p p5, n7.c p6)
    {
        if (p3 <= 0) {
            throw new d8.a2("Timed out immediately", 0);
        } else {
            d8.b2 v0_3 = new d8.b2(p3, p6);
            d8.f0.m(v0_3, 1, new d8.q0(d8.f0.i(v0_3.d.getContext()).c(v0_3.e, v0_3, v0_3.c), 0));
            try {
                kotlin.jvm.internal.u.a(2, p5);
                Throwable v3_7 = p5.invoke(v0_3, v0_3);
            } catch (Throwable v3_8) {
                v3_7 = new d8.w(0, v3_8);
            }
            boolean v4_5 = m7.a.a;
            if (v3_7 != v4_5) {
                d8.e1 v5_2 = v0_3.B(v3_7);
                if (v5_2 != d8.f0.e) {
                    if (!(v5_2 instanceof d8.w)) {
                        v3_7 = d8.f0.v(v5_2);
                    } else {
                        boolean v4_8 = ((d8.w) v5_2).a;
                        if ((!(v4_8 instanceof d8.a2)) || (((d8.a2) v4_8).a != v0_3)) {
                            throw v4_8;
                        } else {
                            if ((v3_7 instanceof d8.w)) {
                                throw ((d8.w) v3_7).a;
                            }
                        }
                    }
                    v4_5 = v3_7;
                }
            }
            return v4_5;
        }
    }
}
