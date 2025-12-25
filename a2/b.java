package a2;
public final class b implements o2.f, t6.b, t2.b, a5.f {
    public final synthetic int a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;

    public synthetic b()
    {
        this.a = 7;
        return;
    }

    public b(a2.h0 p3)
    {
        this.a = 0;
        this.b = new p0.c(30);
        this.c = new java.util.ArrayList();
        this.d = new java.util.ArrayList();
        this.e = p3;
        this.f = new l6.c(this, 4);
        return;
    }

    public b(android.content.SharedPreferences p2, java.util.concurrent.ScheduledThreadPoolExecutor p3)
    {
        this.a = 1;
        this.e = new java.util.ArrayDeque();
        this.b = p2;
        this.c = "topic_operation_queue";
        this.d = ",";
        this.f = p3;
        return;
    }

    public synthetic b(Object p1, Object p2, Object p3, Object p4, Object p5, int p6)
    {
        this.a = p6;
        this.b = p1;
        this.c = p2;
        this.d = p3;
        this.e = p4;
        this.f = p5;
        return;
    }

    public b(java.util.Map p2)
    {
        this.a = 2;
        kotlin.jvm.internal.j.e(p2, "initialState");
        this.b = i7.r.s0(p2);
        this.c = new java.util.LinkedHashMap();
        this.d = new java.util.LinkedHashMap();
        this.e = new java.util.LinkedHashMap();
        this.f = new c.f(this, 1);
        return;
    }

    public static a2.b c(android.content.SharedPreferences p5, java.util.concurrent.ScheduledThreadPoolExecutor p6)
    {
        a2.b v0_1 = new a2.b(p5, p6);
        ((java.util.ArrayDeque) v0_1.e).clear();
        String[] v6_1 = ((android.content.SharedPreferences) v0_1.b).getString(((String) v0_1.c), "");
        if (!android.text.TextUtils.isEmpty(v6_1)) {
            if (v6_1.contains(((String) v0_1.d))) {
                String[] v6_2 = v6_1.split(((String) v0_1.d), -1);
                if (v6_2.length == 0) {
                    android.util.Log.e("FirebaseMessaging", "Corrupted queue. Please check the queue contents and item separator provided");
                }
                int v1_9 = v6_2.length;
                int v2_3 = 0;
                while (v2_3 < v1_9) {
                    String v3 = v6_2[v2_3];
                    if (!android.text.TextUtils.isEmpty(v3)) {
                        ((java.util.ArrayDeque) v0_1.e).add(v3);
                    }
                    v2_3++;
                }
                return v0_1;
            } else {
            }
        }
        return v0_1;
    }

    public boolean a(int p9)
    {
        java.util.ArrayList v0_1 = ((java.util.ArrayList) this.d);
        int v1 = v0_1.size();
        int v3 = 0;
        while (v3 < v1) {
            int v4_0 = ((a2.a) v0_1.get(v3));
            int v5_0 = v4_0.a;
            if (v5_0 != 8) {
                if (v5_0 == 1) {
                    int v5_1 = v4_0.b;
                    int v4_2 = (v4_0.c + v5_1);
                    while (v5_1 < v4_2) {
                        if (this.g(v5_1, (v3 + 1)) != p9) {
                            v5_1++;
                        } else {
                            return 1;
                        }
                    }
                }
            } else {
                if (this.g(v4_0.c, (v3 + 1)) == p9) {
                    return 1;
                }
            }
            v3++;
        }
        return 0;
    }

    public void b()
    {
        a2.h0 v0_1 = ((a2.h0) this.e);
        java.util.ArrayList v1_2 = ((java.util.ArrayList) this.d);
        int v2_1 = v1_2.size();
        int v3_1 = 0;
        while (v3_1 < v2_1) {
            ((a2.h0) this.e).a(((a2.a) v1_2.get(v3_1)));
            v3_1++;
        }
        this.k(v1_2);
        java.util.ArrayList v1_0 = ((java.util.ArrayList) this.c);
        int v2_0 = v1_0.size();
        int v3_0 = 0;
        while (v3_0 < v2_0) {
            int v4_1 = ((a2.a) v1_0.get(v3_0));
            int v5_0 = v4_1.a;
            if (v5_0 == 1) {
                v0_1.a(v4_1);
                v0_1.d(v4_1.b, v4_1.c);
            } else {
                if (v5_0 == 2) {
                    v0_1.a(v4_1);
                    int v4_3 = v4_1.c;
                    androidx.recyclerview.widget.RecyclerView v7_1 = v0_1.a;
                    v7_1.S(v4_1.b, 1, v4_3);
                    v7_1.n0 = 1;
                    int v5_3 = v7_1.k0;
                    v5_3.c = (v5_3.c + v4_3);
                } else {
                    if (v5_0 == 4) {
                        v0_1.a(v4_1);
                        v0_1.c(v4_1.b, v4_1.c);
                    } else {
                        if (v5_0 == 8) {
                            v0_1.a(v4_1);
                            v0_1.e(v4_1.b, v4_1.c);
                        }
                    }
                }
            }
            v3_0++;
        }
        this.k(v1_0);
        return;
    }

    public void d(a2.a p13)
    {
        IllegalArgumentException v0_1 = ((p0.c) this.b);
        int v1_1 = p13.a;
        if ((v1_1 == 1) || (v1_1 == 8)) {
            throw new IllegalArgumentException("should not dispatch add or move for pre layout");
        } else {
            int v4_1;
            int v1_0 = this.n(p13.b, v1_1);
            int v3_1 = p13.b;
            int v4_0 = p13.a;
            if (v4_0 == 2) {
                v4_1 = 0;
            } else {
                if (v4_0 != 4) {
                    int v1_3 = new StringBuilder("op should be remove or update.");
                    v1_3.append(p13);
                    throw new IllegalArgumentException(v1_3.toString());
                } else {
                    v4_1 = 1;
                }
            }
            int v7 = 1;
            String v8 = 1;
            while (v7 < p13.c) {
                int v9_3 = this.n(((v4_1 * v7) + p13.b), p13.a);
                int v10_2 = p13.a;
                if (v10_2 == 2) {
                    if (v9_3 != v1_0) {
                        int v1_4 = this.i(v10_2, v1_0, v8);
                        this.f(v1_4, v3_1);
                        v0_1.c(v1_4);
                        if (p13.a == 4) {
                            v3_1 += v8;
                        }
                        v8 = 1;
                        v1_0 = v9_3;
                    } else {
                        v8++;
                    }
                } else {
                    if ((v10_2 != 4) || (v9_3 != (v1_0 + 1))) {
                    }
                }
                v7++;
            }
            v0_1.c(p13);
            if (v8 > null) {
                a2.a v13_3 = this.i(p13.a, v1_0, v8);
                this.f(v13_3, v3_1);
                v0_1.c(v13_3);
            }
            return;
        }
    }

    public Object e(a5.z p8)
    {
        return com.google.firebase.auth.FirebaseAuthRegistrar.lambda$getComponents$0(((a5.x) this.b), ((a5.x) this.c), ((a5.x) this.d), ((a5.x) this.e), ((a5.x) this.f), p8);
    }

    public void f(a2.a p4, int p5)
    {
        int v0_1 = ((a2.h0) this.e);
        v0_1.a(p4);
        int v1_0 = p4.a;
        if (v1_0 == 2) {
            IllegalArgumentException v4_4 = p4.c;
            int v0_4 = v0_1.a;
            v0_4.S(p5, 1, v4_4);
            v0_4.n0 = 1;
            String v5_1 = v0_4.k0;
            v5_1.c = (v5_1.c + v4_4);
            return;
        } else {
            if (v1_0 != 4) {
                throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
            } else {
                v0_1.c(p5, p4.c);
                return;
            }
        }
    }

    public int g(int p7, int p8)
    {
        java.util.ArrayList v0_1 = ((java.util.ArrayList) this.d);
        int v1 = v0_1.size();
        while (p8 < v1) {
            int v2_4 = ((a2.a) v0_1.get(p8));
            int v3_1 = v2_4.a;
            if (v3_1 != 8) {
                int v4_1 = v2_4.b;
                if (v4_1 <= p7) {
                    if (v3_1 != 2) {
                        if (v3_1 == 1) {
                            p7 += v2_4.c;
                        }
                    } else {
                        int v2_1 = v2_4.c;
                        if (p7 >= (v4_1 + v2_1)) {
                            p7 -= v2_1;
                        } else {
                            return -1;
                        }
                    }
                }
            } else {
                int v3_0 = v2_4.b;
                if (v3_0 != p7) {
                    if (v3_0 < p7) {
                        p7--;
                    }
                    if (v2_4.c <= p7) {
                        p7++;
                    }
                } else {
                    p7 = v2_4.c;
                }
            }
            p8++;
        }
        return p7;
    }

    public Object get()
    {
        switch (this.a) {
            case 4:
                return new r6.s0(((q4.f) ((k4.i) this.b).b), ((d6.d) ((g7.a) this.c).get()), ((u6.k) ((g7.a) this.d).get()), ((r6.l) ((t6.c) this.e).get()), ((l7.h) ((g7.a) this.f).get()));
            case 5:
                return new u6.c(((r6.g1) ((g7.a) this.b).get()), ((d6.d) ((g7.a) this.c).get()), ((r6.b) ((g7.a) this.d).get()), ((u6.e) ((g7.a) this.e).get()), ((u6.o) ((t6.c) this.f).get()));
            default:
                return new w2.a(((java.util.concurrent.Executor) ((g7.a) this.b).get()), ((s2.d) ((g7.a) this.c).get()), ((b8.g) ((b8.g) this.d).get()), ((y2.d) ((g7.a) this.e).get()), ((z2.c) ((g7.a) this.f).get()));
        }
    }

    public boolean h()
    {
        if (((java.util.ArrayList) this.c).size() <= 0) {
            return 0;
        } else {
            return 1;
        }
    }

    public a2.a i(int p2, int p3, int p4)
    {
        a2.a v0_5 = ((a2.a) ((p0.c) this.b).a());
        if (v0_5 != null) {
            v0_5.a = p2;
            v0_5.b = p3;
            v0_5.c = p4;
            return v0_5;
        } else {
            a2.a v0_3 = new a2.a();
            v0_3.a = p2;
            v0_3.b = p3;
            v0_3.c = p4;
            return v0_3;
        }
    }

    public void j(a2.a p5)
    {
        IllegalArgumentException v0_1 = ((a2.h0) this.e);
        ((java.util.ArrayList) this.d).add(p5);
        StringBuilder v1_7 = p5.a;
        if (v1_7 == 1) {
            v0_1.d(p5.b, p5.c);
            return;
        } else {
            if (v1_7 == 2) {
                IllegalArgumentException v0_2 = v0_1.a;
                v0_2.S(p5.b, 0, p5.c);
                v0_2.n0 = 1;
                return;
            } else {
                if (v1_7 == 4) {
                    v0_1.c(p5.b, p5.c);
                    return;
                } else {
                    if (v1_7 != 8) {
                        StringBuilder v1_5 = new StringBuilder("Unknown update op type for ");
                        v1_5.append(p5);
                        throw new IllegalArgumentException(v1_5.toString());
                    } else {
                        v0_1.e(p5.b, p5.c);
                        return;
                    }
                }
            }
        }
    }

    public void k(java.util.ArrayList p5)
    {
        int v0 = p5.size();
        int v1 = 0;
        while (v1 < v0) {
            a2.a v2_1 = ((a2.a) p5.get(v1));
            v2_1.getClass();
            ((p0.c) this.b).c(v2_1);
            v1++;
        }
        p5.clear();
        return;
    }

    public void l(o2.a p14, o2.h p15)
    {
        int v0_1 = ((r2.r) this.f);
        byte[] v2_4 = ((String) this.c);
        o2.e v3_1 = ((o2.e) this.e);
        if (v3_1 == null) {
            throw new NullPointerException("Null transformer");
        } else {
            o2.c v4_1 = ((o2.c) this.d);
            w2.b v5 = v0_1.c;
            r2.j v9 = ((r2.j) this.b).b(p14.b);
            r2.h v1_2 = new r2.h();
            v1_2.f = new java.util.HashMap();
            v1_2.d = Long.valueOf(v0_1.a.b());
            v1_2.e = Long.valueOf(v0_1.b.b());
            v1_2.a = v2_4;
            v1_2.c = new r2.m(v4_1, ((byte[]) v3_1.apply(p14.a)));
            v1_2.b = 0;
            java.util.concurrent.Executor v14_2 = p14.c;
            if (v14_2 != null) {
                v1_2.g = v14_2.a;
            }
            w2.a v8_1 = ((w2.a) v5);
            v8_1.b.execute(new i2.e(v8_1, v9, p15, v1_2.b(), 4));
            return;
        }
    }

    public void m(Object p2, String p3)
    {
        kotlin.jvm.internal.j.e(p3, "key");
        ((java.util.LinkedHashMap) this.b).put(p3, p2);
        java.util.LinkedHashMap v0_9 = ((g8.u) ((java.util.LinkedHashMap) this.d).get(p3));
        if (v0_9 != null) {
            ((g8.y) v0_9).d(p2);
        }
        g8.y v3_2 = ((g8.u) ((java.util.LinkedHashMap) this.e).get(p3));
        if (v3_2 != null) {
            ((g8.y) v3_2).d(p2);
        }
        return;
    }

    public int n(int p11, int p12)
    {
        p0.c v0_1 = ((p0.c) this.b);
        java.util.ArrayList v1_1 = ((java.util.ArrayList) this.d);
        int v2_3 = (v1_1.size() - 1);
        while (v2_3 >= 0) {
            int v5_2 = ((a2.a) v1_1.get(v2_3));
            int v6_0 = v5_2.a;
            if (v6_0 != 8) {
                int v4_0 = v5_2.b;
                if (v4_0 > p11) {
                    if (p12 != 1) {
                        if (p12 == 2) {
                            v5_2.b = (v4_0 - 1);
                        }
                    } else {
                        v5_2.b = (v4_0 + 1);
                    }
                } else {
                    if (v6_0 != 1) {
                        if (v6_0 == 2) {
                            p11 += v5_2.c;
                        }
                    } else {
                        p11 -= v5_2.c;
                    }
                }
            } else {
                int v8;
                int v9;
                int v4_5 = v5_2.b;
                int v6_1 = v5_2.c;
                if (v4_5 >= v6_1) {
                    v9 = v4_5;
                    v8 = v6_1;
                } else {
                    v8 = v4_5;
                    v9 = v6_1;
                }
                if ((p11 < v8) || (p11 > v9)) {
                    if (p11 < v4_5) {
                        if (p12 != 1) {
                            if (p12 == 2) {
                                v5_2.b = (v4_5 - 1);
                                v5_2.c = (v6_1 - 1);
                            }
                        } else {
                            v5_2.b = (v4_5 + 1);
                            v5_2.c = (v6_1 + 1);
                        }
                    }
                } else {
                    if (v8 != v4_5) {
                        if (p12 != 1) {
                            if (p12 == 2) {
                                v5_2.b = (v4_5 - 1);
                            }
                        } else {
                            v5_2.b = (v4_5 + 1);
                        }
                        p11--;
                    } else {
                        if (p12 != 1) {
                            if (p12 == 2) {
                                v5_2.c = (v6_1 - 1);
                            }
                        } else {
                            v5_2.c = (v6_1 + 1);
                        }
                        p11++;
                    }
                }
            }
            v2_3--;
        }
        int v12_2 = (v1_1.size() - 1);
        while (v12_2 >= 0) {
            int v2_1 = ((a2.a) v1_1.get(v12_2));
            if (v2_1.a != 8) {
                if (v2_1.c <= 0) {
                    v1_1.remove(v12_2);
                    v0_1.c(v2_1);
                }
            } else {
                int v3_2 = v2_1.c;
                if ((v3_2 == v2_1.b) || (v3_2 < 0)) {
                    v1_1.remove(v12_2);
                    v0_1.c(v2_1);
                }
            }
            v12_2--;
        }
        return p11;
    }
}
