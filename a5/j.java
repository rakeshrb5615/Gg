package a5;
public final class j implements a5.d {
    public static final a5.g h;
    public final java.util.HashMap a;
    public final java.util.HashMap b;
    public final java.util.HashMap c;
    public final java.util.HashSet d;
    public final a5.p e;
    public final java.util.concurrent.atomic.AtomicReference f;
    public final a6.e g;

    static j()
    {
        a5.j.h = new a5.g(0);
        return;
    }

    public j(java.util.ArrayList p8, java.util.ArrayList p9, a6.e p10)
    {
        this.a = new java.util.HashMap();
        this.b = new java.util.HashMap();
        this.c = new java.util.HashMap();
        this.d = new java.util.HashSet();
        this.f = new java.util.concurrent.atomic.AtomicReference();
        int v0_16 = new a5.p();
        this.e = v0_16;
        this.g = p10;
        Runnable v10_2 = new java.util.ArrayList();
        v10_2.add(a5.c.c(v0_16, a5.p, new Class[] {x5.c, x5.b})));
        int v1_1 = 0;
        a5.c v2_9 = new Class[0];
        v10_2.add(a5.c.c(this, a5.j, v2_9));
        int v0_22 = p9.size();
        a5.c v2_6 = 0;
        while (v2_6 < v0_22) {
            a5.r v3_5 = p9.get(v2_6);
            v2_6++;
            a5.r v3_6 = ((a5.c) v3_5);
            if (v3_6 != null) {
                v10_2.add(v3_6);
            }
        }
        java.util.HashMap v9_2 = new java.util.ArrayList();
        int v0_23 = p8.size();
        a5.c v2_5 = 0;
        while (v2_5 < v0_23) {
            a5.r v3_4 = p8.get(v2_5);
            v2_5++;
            v9_2.add(v3_4);
        }
        boolean v8_3 = new java.util.ArrayList();
        java.util.HashMap v9_3 = v9_2.iterator();
        while (v9_3.hasNext()) {
            try {
                int v0_11 = ((com.google.firebase.components.ComponentRegistrar) ((c6.b) v9_3.next()).get());
            } catch (int v0_12) {
                v9_3.remove();
                android.util.Log.w("ComponentDiscovery", "Invalid component registrar.", v0_12);
            }
            if (v0_11 != 0) {
                v10_2.addAll(this.g.f(v0_11));
                v9_3.remove();
            }
        }
        java.util.HashMap v9_4 = v10_2.iterator();
        while (v9_4.hasNext()) {
            int v0_5 = ((a5.c) v9_4.next()).b.toArray();
            a5.c v2_2 = v0_5.length;
            a5.r v3_2 = 0;
            while (v3_2 < v2_2) {
                java.util.HashMap v4_3 = v0_5[v3_2];
                if (v4_3.toString().contains("kotlinx.coroutines.CoroutineDispatcher")) {
                    if (!this.d.contains(v4_3.toString())) {
                        this.d.add(v4_3.toString());
                    } else {
                        v9_4.remove();
                        break;
                    }
                }
                v3_2++;
            }
        }
        if (!this.a.isEmpty()) {
            java.util.HashMap v9_8 = new java.util.ArrayList(this.a.keySet());
            v9_8.addAll(v10_2);
            j5.t1.n(v9_8);
        } else {
            j5.t1.n(v10_2);
        }
        java.util.HashMap v9_9 = v10_2.size();
        int v0_0 = 0;
        while (v0_0 < v9_9) {
            a5.c v2_0 = v10_2.get(v0_0);
            v0_0++;
            a5.c v2_1 = ((a5.c) v2_0);
            this.a.put(v2_1, new a5.r(new a5.h(0, this, v2_1)));
        }
        v8_3.addAll(this.k(v10_2));
        v8_3.addAll(this.l());
        this.j();
        java.util.HashMap v9_12 = v8_3.size();
        while (v1_1 < v9_12) {
            Runnable v10_3 = v8_3.get(v1_1);
            v1_1++;
            ((Runnable) v10_3).run();
        }
        boolean v8_6 = ((Boolean) this.f.get());
        if (v8_6) {
            this.i(this.a, v8_6.booleanValue());
        }
        return;
    }

    public final declared_synchronized c6.b b(a5.x p2)
    {
        q4.b.f(p2, "Null interface requested.");
        return ((c6.b) this.b.get(p2));
    }

    public final declared_synchronized c6.b d(a5.x p2)
    {
        a5.g v2_2 = ((a5.s) this.c.get(p2));
        if (v2_2 == null) {
            return a5.j.h;
        } else {
            return v2_2;
        }
    }

    public final a5.v g(a5.x p3)
    {
        a5.v v3_1 = this.b(p3);
        if (v3_1 != null) {
            if (!(v3_1 instanceof a5.v)) {
                return new a5.v(0, v3_1);
            } else {
                return ((a5.v) v3_1);
            }
        } else {
            return new a5.v(a5.v.c, a5.v.d);
        }
    }

    public final void i(java.util.HashMap p4, boolean p5)
    {
        ClassCastException v4_4 = p4.entrySet().iterator();
        while (v4_4.hasNext()) {
            int v0_1 = ((java.util.Map$Entry) v4_4.next());
            int v1_1 = ((a5.c) v0_1.getKey());
            int v0_2 = v0_1.getValue();
            int v1_2 = v1_1.d;
            if ((v1_2 == 1) || ((v1_2 == 2) && (p5))) {
                ((c6.b) v0_2).get();
            }
        }
        ClassCastException v4_5 = this.e;
        boolean v5_1 = v4_5.b;
        if (!v5_1) {
            v5_1 = 0;
        } else {
            v4_5.b = 0;
        }
        if (v5_1) {
            ClassCastException v4_2 = v5_1.iterator();
            if (v4_2.hasNext()) {
                throw v1.a.e(v4_2);
            }
        }
        return;
    }

    public final void j()
    {
        a5.n v0_0 = this.b;
        String v1_0 = this.c;
        String v2_4 = this.a.keySet().iterator();
        while (v2_4.hasNext()) {
            a5.c v3_1 = ((a5.c) v2_4.next());
            java.util.Iterator v4_1 = v3_1.c.iterator();
            while (v4_1.hasNext()) {
                a5.t v6_1;
                a5.v v5_2 = ((a5.m) v4_1.next());
                if (v5_2.b != 2) {
                    v6_1 = 0;
                } else {
                    v6_1 = 1;
                }
                a5.x v9 = v5_2.a;
                if ((v6_1 == null) || (v1_0.containsKey(v9))) {
                    if (!v0_0.containsKey(v9)) {
                        a5.v v5_3 = v5_2.b;
                        if (v5_3 == 1) {
                            String v1_2 = new StringBuilder("Unsatisfied dependency for component ");
                            v1_2.append(v3_1);
                            v1_2.append(": ");
                            v1_2.append(v9);
                            throw new a5.n(v1_2.toString());
                        } else {
                            if (v5_3 != 2) {
                                v0_0.put(v9, new a5.v(a5.v.c, a5.v.d));
                            }
                        }
                    }
                } else {
                    a5.t v6_6 = new a5.s();
                    v6_6.b = 0;
                    v6_6.a = java.util.Collections.newSetFromMap(new java.util.concurrent.ConcurrentHashMap());
                    v6_6.a.addAll(java.util.Collections.EMPTY_SET);
                    v1_0.put(v9, v6_6);
                }
            }
        }
        return;
    }

    public final java.util.ArrayList k(java.util.ArrayList p9)
    {
        java.util.ArrayList v0_1 = new java.util.ArrayList();
        int v1 = p9.size();
        int v2 = 0;
        while (v2 < v1) {
            java.util.Iterator v3_3 = p9.get(v2);
            v2++;
            java.util.Iterator v3_0 = ((a5.c) v3_3);
            if (v3_0.e == 0) {
                c6.b v4_3 = ((c6.b) this.a.get(v3_0));
                java.util.Iterator v3_2 = v3_0.b.iterator();
                while (v3_2.hasNext()) {
                    a5.v v5_2 = ((a5.x) v3_2.next());
                    a5.i v6_0 = this.b;
                    if (v6_0.containsKey(v5_2)) {
                        v0_1.add(new a5.i(0, ((a5.v) ((c6.b) v6_0.get(v5_2))), v4_3));
                    } else {
                        v6_0.put(v5_2, v4_3);
                    }
                }
            }
        }
        return v0_1;
    }

    public final java.util.ArrayList l()
    {
        java.util.HashMap v0 = this.c;
        java.util.ArrayList v1_1 = new java.util.ArrayList();
        java.util.Iterator v2_3 = new java.util.HashMap();
        java.util.Iterator v3_11 = this.a.entrySet().iterator();
        while (v3_11.hasNext()) {
            a5.s v4_9 = ((java.util.Map$Entry) v3_11.next());
            c6.b v5_6 = ((a5.c) v4_9.getKey());
            if (v5_6.e != 0) {
                a5.s v4_11 = ((c6.b) v4_9.getValue());
                c6.b v5_8 = v5_6.b.iterator();
                while (v5_8.hasNext()) {
                    a5.i v6_10 = ((a5.x) v5_8.next());
                    if (!v2_3.containsKey(v6_10)) {
                        v2_3.put(v6_10, new java.util.HashSet());
                    }
                    ((java.util.Set) v2_3.get(v6_10)).add(v4_11);
                }
            }
        }
        java.util.Iterator v2_1 = v2_3.entrySet().iterator();
        while (v2_1.hasNext()) {
            java.util.Iterator v3_2 = ((java.util.Map$Entry) v2_1.next());
            if (v0.containsKey(v3_2.getKey())) {
                a5.s v4_5 = ((a5.s) v0.get(v3_2.getKey()));
                java.util.Iterator v3_5 = ((java.util.Set) v3_2.getValue()).iterator();
                while (v3_5.hasNext()) {
                    v1_1.add(new a5.i(1, v4_5, ((c6.b) v3_5.next())));
                }
            } else {
                a5.s v4_7 = ((a5.x) v3_2.getKey());
                java.util.Iterator v3_9 = ((java.util.Set) ((java.util.Collection) v3_2.getValue()));
                c6.b v5_4 = new a5.s();
                v5_4.b = 0;
                v5_4.a = java.util.Collections.newSetFromMap(new java.util.concurrent.ConcurrentHashMap());
                v5_4.a.addAll(v3_9);
                v0.put(v4_7, v5_4);
            }
        }
        return v1_1;
    }
}
