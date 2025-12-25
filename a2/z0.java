package a2;
public final class z0 {
    public final java.util.ArrayList a;
    public java.util.ArrayList b;
    public final java.util.ArrayList c;
    public final java.util.List d;
    public int e;
    public int f;
    public a2.y0 g;
    public final synthetic androidx.recyclerview.widget.RecyclerView h;

    public z0(androidx.recyclerview.widget.RecyclerView p2)
    {
        this.h = p2;
        int v2_4 = new java.util.ArrayList();
        this.a = v2_4;
        this.b = 0;
        this.c = new java.util.ArrayList();
        this.d = java.util.Collections.unmodifiableList(v2_4);
        this.e = 2;
        this.f = 2;
        return;
    }

    public final void a(a2.k1 p5, boolean p6)
    {
        androidx.recyclerview.widget.RecyclerView.l(p5);
        android.view.View v0 = p5.a;
        String v1_0 = this.h;
        java.util.ArrayList v2_3 = v1_0.r0;
        if (v2_3 != null) {
            java.util.ArrayList v2_1;
            java.util.ArrayList v2_6 = v2_3.e;
            if (v2_6 == null) {
                v2_1 = 0;
            } else {
                v2_1 = ((q0.b) v2_6.e.remove(v0));
            }
            q0.q0.n(v0, v2_1);
        }
        if (p6 != null) {
            String v6_1 = v1_0.t;
            if (v6_1.size() > 0) {
                v6_1.get(0).getClass();
                throw new ClassCastException();
            } else {
                String v6_2 = v1_0.r;
                if (v6_2 != null) {
                    v6_2.e(p5);
                }
                if (v1_0.k0 != null) {
                    v1_0.m.D(p5);
                }
                if (androidx.recyclerview.widget.RecyclerView.G0) {
                    String v6_7 = new StringBuilder("dispatchViewRecycled: ");
                    v6_7.append(p5);
                    android.util.Log.d("RecyclerView", v6_7.toString());
                }
            }
        }
        p5.s = 0;
        p5.r = 0;
        String v6_9 = this.c();
        v6_9.getClass();
        String v1_3 = p5.f;
        java.util.ArrayList v2_5 = v6_9.a(v1_3).a;
        if (((a2.x0) v6_9.a.get(v1_3)).b > v2_5.size()) {
            if ((androidx.recyclerview.widget.RecyclerView.F0) && (v2_5.contains(p5))) {
                throw new IllegalArgumentException("this scrap item already exists");
            } else {
                p5.m();
                v2_5.add(p5);
                return;
            }
        } else {
            w0.a.a(v0);
            return;
        }
    }

    public final int b(int p5)
    {
        a2.b v0_0 = this.h;
        if ((p5 < 0) || (p5 >= v0_0.k0.b())) {
            int v5_1 = v1.a.p("invalid position ", p5, ". State item count is ");
            v5_1.append(v0_0.k0.b());
            v5_1.append(v0_0.B());
            throw new IndexOutOfBoundsException(v5_1.toString());
        } else {
            if (v0_0.k0.g) {
                return v0_0.e.g(p5, 0);
            } else {
                return p5;
            }
        }
    }

    public final a2.y0 c()
    {
        if (this.g == null) {
            a2.y0 v0_3 = new a2.y0();
            v0_3.a = new android.util.SparseArray();
            v0_3.b = 0;
            v0_3.c = java.util.Collections.newSetFromMap(new java.util.IdentityHashMap());
            this.g = v0_3;
            this.e();
        }
        return this.g;
    }

    public final android.view.View d(int p3)
    {
        return this.l(p3, 9223372036854775807).a;
    }

    public final void e()
    {
        java.util.Set v0_0 = this.g;
        if (v0_0 != null) {
            boolean v1_0 = this.h;
            a2.i0 v2 = v1_0.r;
            if ((v2 != null) && (v1_0.x)) {
                v0_0.c.add(v2);
            }
        }
        return;
    }

    public final void f(a2.i0 p5, boolean p6)
    {
        java.util.ArrayList v0_0 = this.g;
        if (v0_0 != null) {
            android.util.SparseArray v1 = v0_0.a;
            java.util.ArrayList v0_6 = v0_0.c;
            v0_6.remove(p5);
            if ((v0_6.size() == 0) && (p6 == 0)) {
                int v6_1 = 0;
                while (v6_1 < v1.size()) {
                    java.util.ArrayList v0_5 = ((a2.x0) v1.get(v1.keyAt(v6_1))).a;
                    int v2 = 0;
                    while (v2 < v0_5.size()) {
                        w0.a.a(((a2.k1) v0_5.get(v2)).a);
                        v2++;
                    }
                    v6_1++;
                }
            }
        }
        return;
    }

    public final void g()
    {
        a2.r v0_0 = this.c;
        int v1_3 = (v0_0.size() - 1);
        while (v1_3 >= 0) {
            this.h(v1_3);
            v1_3--;
        }
        v0_0.clear();
        if (androidx.recyclerview.widget.RecyclerView.K0) {
            a2.r v0_3 = this.h.j0;
            int v1_1 = ((int[]) v0_3.d);
            if (v1_1 != 0) {
                java.util.Arrays.fill(v1_1, -1);
            }
            v0_3.c = 0;
        }
        return;
    }

    public final void h(int p6)
    {
        if (androidx.recyclerview.widget.RecyclerView.G0) {
            java.util.ArrayList v0_3 = new StringBuilder("Recycling cached view at index ");
            v0_3.append(p6);
            android.util.Log.d("RecyclerView", v0_3.toString());
        }
        java.util.ArrayList v0_1 = this.c;
        a2.k1 v2_1 = ((a2.k1) v0_1.get(p6));
        if (androidx.recyclerview.widget.RecyclerView.G0) {
            String v3_2 = new StringBuilder("CachedViewHolder to be recycled: ");
            v3_2.append(v2_1);
            android.util.Log.d("RecyclerView", v3_2.toString());
        }
        this.a(v2_1, 1);
        v0_1.remove(p6);
        return;
    }

    public final void i(android.view.View p4)
    {
        a2.k1 v0 = androidx.recyclerview.widget.RecyclerView.M(p4);
        androidx.recyclerview.widget.RecyclerView v2 = this.h;
        if (v0.j()) {
            v2.removeDetachedView(p4, 0);
        }
        if (!v0.i()) {
            if (v0.p()) {
                v0.j = (v0.j & -33);
            }
        } else {
            v0.n.m(v0);
        }
        this.j(v0);
        if ((v2.P != null) && (!v0.g())) {
            v2.P.d(v0);
        }
        return;
    }

    public final void j(a2.k1 p13)
    {
        int v0_0 = this.h;
        int v1_0 = v0_0.j0;
        String v3_1 = p13.a;
        int v4 = 0;
        int v5_0 = 1;
        if ((!p13.i()) && (v3_1.getParent() == null)) {
            if (p13.j()) {
                StringBuilder v2_4 = new StringBuilder("Tmp detached view should be removed from RecyclerView before it can be recycled: ");
                v2_4.append(p13);
                throw new IllegalArgumentException(v1.a.h(v0_0, v2_4));
            } else {
                if (p13.o()) {
                    throw new IllegalArgumentException(v1.a.h(v0_0, new StringBuilder("Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle.")));
                } else {
                    if (((p13.j & 16) != 0) || (!v3_1.hasTransientState())) {
                        StringBuilder v2_11 = 0;
                    } else {
                        v2_11 = 1;
                    }
                    java.util.ArrayList v7 = this.c;
                    if ((androidx.recyclerview.widget.RecyclerView.F0) && (v7.contains(p13))) {
                        StringBuilder v2_13 = new StringBuilder("cached view received recycle internal? ");
                        v2_13.append(p13);
                        throw new IllegalArgumentException(v1.a.h(v0_0, v2_13));
                    } else {
                        if (!p13.g()) {
                            if (androidx.recyclerview.widget.RecyclerView.G0) {
                                int v1_12 = new StringBuilder("trying to recycle a non-recycleable holder. Hopefully, it will re-visit here. We are still removing it from animation lists");
                                v1_12.append(v0_0.B());
                                android.util.Log.d("RecyclerView", v1_12.toString());
                            }
                            v5_0 = 0;
                        } else {
                            if ((this.f > 0) && ((p13.j & 526) == 0)) {
                                int v6_0 = v7.size();
                                if ((v6_0 >= this.f) && (v6_0 > 0)) {
                                    this.h(0);
                                    v6_0--;
                                }
                                if ((androidx.recyclerview.widget.RecyclerView.K0) && (v6_0 > 0)) {
                                    if (((int[]) v1_0.d) != null) {
                                        int v10_1 = 0;
                                        while (v10_1 < (v1_0.c * 2)) {
                                            if (((int[]) v1_0.d)[v10_1] != p13.c) {
                                                v10_1 += 2;
                                            }
                                            v7.add(v6_0, p13);
                                            int v1_1 = 1;
                                            if (v1_1 != 0) {
                                                v5_0 = 0;
                                            } else {
                                                this.a(p13, 1);
                                            }
                                            v4 = v1_1;
                                            v0_0.m.D(p13);
                                            if ((v4 == 0) && ((v5_0 == 0) && (v2_11 != null))) {
                                                w0.a.a(v3_1);
                                                p13.s = 0;
                                                p13.r = 0;
                                            }
                                            return;
                                        }
                                    }
                                    int v6_1 = (v6_0 - 1);
                                    while (v6_1 >= 0) {
                                        int v8_0 = v7.get(v6_1);
                                        if (((int[]) v1_0.d) == null) {
                                            break;
                                        }
                                        int v10_0 = 0;
                                        while (v10_0 < (v1_0.c * 2)) {
                                            if (((int[]) v1_0.d)[v10_0] != ((a2.k1) v8_0).c) {
                                                v10_0 += 2;
                                            } else {
                                                v6_1--;
                                            }
                                        }
                                    }
                                    v6_0 = (v6_1 + 1);
                                }
                            } else {
                                v1_1 = 0;
                            }
                        }
                    }
                }
            }
        } else {
            StringBuilder v2_2 = new StringBuilder("Scrapped or attached views may not be recycled. isScrap:");
            v2_2.append(p13.i());
            v2_2.append(" isAttached:");
            if (v3_1.getParent() != null) {
                v4 = 1;
            }
            v2_2.append(v4);
            v2_2.append(v0_0.B());
            throw new IllegalArgumentException(v2_2.toString());
        }
    }

    public final void k(android.view.View p4)
    {
        IllegalArgumentException v4_1 = androidx.recyclerview.widget.RecyclerView.M(p4);
        androidx.recyclerview.widget.RecyclerView v1 = this.h;
        if (((v4_1.j & 12) == 0) && (v4_1.k())) {
            java.util.ArrayList v0_20 = v1.P;
            if ((v0_20 != null) && ((v4_1.c().isEmpty()) && ((((a2.k) v0_20).g) && (!v4_1.f())))) {
                if (this.b == null) {
                    this.b = new java.util.ArrayList();
                }
                v4_1.n = this;
                v4_1.o = 1;
                this.b.add(v4_1);
                return;
            }
        }
        if ((v4_1.f()) && ((!v4_1.h()) && (!v1.r.b))) {
            throw new IllegalArgumentException(v1.a.h(v1, new StringBuilder("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool.")));
        } else {
            v4_1.n = this;
            v4_1.o = 0;
            this.a.add(v4_1);
            return;
        }
    }

    public final a2.k1 l(int p29, long p30)
    {
        String v2_6 = this.h;
        boolean v3_8 = v2_6.k0;
        if ((p29 < 0) || (p29 >= v3_8.b())) {
            String v5_0 = new StringBuilder("Invalid item position ");
            v5_0.append(p29);
            v5_0.append("(");
            v5_0.append(p29);
            v5_0.append("). Item count:");
            v5_0.append(v3_8.b());
            v5_0.append(v2_6.B());
            throw new IndexOutOfBoundsException(v5_0.toString());
        } else {
            int v4_5;
            int v10_1;
            if (!v3_8.g) {
                v4_5 = 0;
                v10_1 = 0;
            } else {
                int v4_7 = this.b;
                if (v4_7 == 0) {
                    v10_1 = 0;
                } else {
                    int v4_9 = v4_7.size();
                    if (v4_9 != 0) {
                        java.util.WeakHashMap v9_0 = 0;
                        while (v9_0 < v4_9) {
                            v10_1 = ((a2.k1) this.b.get(v9_0));
                            if ((v10_1.p()) || (v10_1.b() != p29)) {
                                v9_0++;
                            } else {
                                v10_1.a(32);
                            }
                        }
                        if (!v2_6.r.b) {
                        } else {
                            java.util.WeakHashMap v9_4 = v2_6.e.g(p29, 0);
                            if ((v9_4 <= null) || (v9_4 >= v2_6.r.a())) {
                            } else {
                                java.util.WeakHashMap v9_9 = v2_6.r.b(v9_4);
                                long v11_0 = 0;
                                while (v11_0 < v4_9) {
                                    a2.k1 v12_2 = ((a2.k1) this.b.get(v11_0));
                                    if ((v12_2.p()) || (v12_2.e != v9_9)) {
                                        v11_0++;
                                    } else {
                                        v12_2.a(32);
                                        v10_1 = v12_2;
                                    }
                                }
                            }
                        }
                    }
                }
                if (v10_1 == 0) {
                    v4_5 = 0;
                } else {
                    v4_5 = 1;
                }
            }
            int v17;
            java.util.WeakHashMap v9_23 = this.a;
            long v11_7 = this.c;
            if (v10_1 != 0) {
                v17 = 1;
            } else {
                int v10_19 = v9_23.size();
                long v13_8 = 0;
                while (v13_8 < v10_19) {
                    android.view.ViewParent v14_10 = ((a2.k1) v9_23.get(v13_8));
                    if ((v14_10.p()) || ((v14_10.b() != p29) || ((v14_10.f()) || ((!v3_8.g) && (v14_10.h()))))) {
                        v13_8++;
                    } else {
                        v14_10.a(32);
                        v10_1 = v14_10;
                        v17 = 1;
                    }
                    if (v10_1 != 0) {
                        int v7_16;
                        if (!v10_1.h()) {
                            int v7_10 = v10_1.c;
                            if ((v7_10 < 0) || (v7_10 >= v2_6.r.a())) {
                                boolean v3_5 = new StringBuilder("Inconsistency detected. Invalid view holder adapter position");
                                v3_5.append(v10_1);
                                throw new IndexOutOfBoundsException(v1.a.h(v2_6, v3_5));
                            } else {
                                if (v3_8.g) {
                                    int v7_14 = v2_6.r;
                                    if ((!v7_14.b) || (v10_1.e == v7_14.b(v10_1.c))) {
                                        v7_16 = v17;
                                        if (v7_16 != 0) {
                                            v4_5 = v17;
                                        } else {
                                            v10_1.a(4);
                                            if (!v10_1.i()) {
                                                if (v10_1.p()) {
                                                    v10_1.j = (v10_1.j & -33);
                                                }
                                            } else {
                                                v2_6.removeDetachedView(v10_1.a, 0);
                                                v10_1.n.m(v10_1);
                                            }
                                            this.j(v10_1);
                                            v10_1 = 0;
                                        }
                                        long v22;
                                        long v25;
                                        if (v10_1 != 0) {
                                            v22 = 3;
                                            v25 = 4;
                                        } else {
                                            int v7_27 = v2_6.e.g(p29, 0);
                                            if (v7_27 >= 0) {
                                                v22 = 3;
                                                if (v7_27 < v2_6.r.a()) {
                                                    v2_6.r.getClass();
                                                    long v13_16 = v2_6.r;
                                                    if (!v13_16.b) {
                                                        v25 = 4;
                                                    } else {
                                                        long v13_17 = v13_16.b(v7_27);
                                                        int v10_13 = (v9_23.size() - 1);
                                                        while (v10_13 >= 0) {
                                                            v25 = 4;
                                                            boolean v15_10 = ((a2.k1) v9_23.get(v10_13));
                                                            int v24_0 = v7_27;
                                                            q0.b v8_1 = v15_10.a;
                                                            if ((v15_10.e == v13_17) && (!v15_10.p())) {
                                                                if (v15_10.f != 0) {
                                                                    v9_23.remove(v10_13);
                                                                    v2_6.removeDetachedView(v8_1, 0);
                                                                    int v7_33 = androidx.recyclerview.widget.RecyclerView.M(v8_1);
                                                                    v7_33.n = 0;
                                                                    v7_33.o = 0;
                                                                    v7_33.j = (v7_33.j & -33);
                                                                    this.j(v7_33);
                                                                } else {
                                                                    v15_10.a(32);
                                                                    if ((v15_10.h()) && (!v3_8.g)) {
                                                                        v15_10.j = ((v15_10.j & -15) | 2);
                                                                    }
                                                                    v10_1 = v15_10;
                                                                    if (v10_1 != 0) {
                                                                        v10_1.c = v24_0;
                                                                        v4_5 = v17;
                                                                    }
                                                                    if (v10_1 == 0) {
                                                                        if (androidx.recyclerview.widget.RecyclerView.G0) {
                                                                            String v5_13 = new StringBuilder("tryGetViewHolderForPositionByDeadline(");
                                                                            v5_13.append(p29);
                                                                            v5_13.append(") fetching from shared pool");
                                                                            android.util.Log.d("RecyclerView", v5_13.toString());
                                                                        }
                                                                        String v5_20;
                                                                        String v5_18 = ((a2.x0) this.c().a.get(0));
                                                                        if (v5_18 == null) {
                                                                            v5_20 = 0;
                                                                        } else {
                                                                            String v5_19 = v5_18.a;
                                                                            if (v5_19.isEmpty()) {
                                                                            } else {
                                                                                int v6_18 = (v5_19.size() - 1);
                                                                                while (v6_18 >= 0) {
                                                                                    if (((a2.k1) v5_19.get(v6_18)).d()) {
                                                                                        v6_18--;
                                                                                    } else {
                                                                                        v5_20 = ((a2.k1) v5_19.remove(v6_18));
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                        if (v5_20 != null) {
                                                                            v5_20.m();
                                                                        }
                                                                        v10_1 = v5_20;
                                                                    }
                                                                    if (v10_1 != 0) {
                                                                        String v5_26 = v10_1.a;
                                                                        if ((v4_5 != 0) && (!v3_8.g)) {
                                                                            int v7_51;
                                                                            int v6_22 = v10_1.j;
                                                                            if ((v6_22 & 8192) == 0) {
                                                                                v7_51 = 0;
                                                                            } else {
                                                                                v7_51 = v17;
                                                                            }
                                                                            if (v7_51 != 0) {
                                                                                v10_1.j = (v6_22 & -8193);
                                                                                if (v3_8.j) {
                                                                                    a2.p0.b(v10_1);
                                                                                    int v6_25 = v2_6.P;
                                                                                    v10_1.c();
                                                                                    v6_25.getClass();
                                                                                    int v6_27 = new a2.o0();
                                                                                    v6_27.a(v10_1);
                                                                                    v2_6.Y(v10_1, v6_27);
                                                                                }
                                                                            }
                                                                        }
                                                                        if ((!v3_8.g) || (!v10_1.e())) {
                                                                            if (v10_1.e()) {
                                                                                int v6_33;
                                                                                if ((v10_1.j & 2) == 0) {
                                                                                    v6_33 = 0;
                                                                                } else {
                                                                                    v6_33 = v17;
                                                                                }
                                                                                if ((v6_33 == 0) && (!v10_1.f())) {
                                                                                    int v7_53 = v17;
                                                                                    int v6_39 = 0;
                                                                                    IllegalStateException v0_30;
                                                                                    IllegalStateException v0_29 = v5_26.getLayoutParams();
                                                                                    if (v0_29 != null) {
                                                                                        if (v2_6.checkLayoutParams(v0_29)) {
                                                                                            v0_30 = ((a2.u0) v0_29);
                                                                                        } else {
                                                                                            v0_30 = ((a2.u0) v2_6.generateLayoutParams(v0_29));
                                                                                            v5_26.setLayoutParams(v0_30);
                                                                                        }
                                                                                    } else {
                                                                                        v0_30 = ((a2.u0) v2_6.generateDefaultLayoutParams());
                                                                                        v5_26.setLayoutParams(v0_30);
                                                                                    }
                                                                                    v0_30.a = v10_1;
                                                                                    if ((v4_5 == 0) || (v6_39 == 0)) {
                                                                                        v7_53 = 0;
                                                                                    }
                                                                                    v0_30.d = v7_53;
                                                                                    return v10_1;
                                                                                }
                                                                            }
                                                                            if ((androidx.recyclerview.widget.RecyclerView.F0) && (v10_1.h())) {
                                                                                boolean v3_10 = new StringBuilder("Removed holder should be bound and it should come here only in pre-layout. Holder: ");
                                                                                v3_10.append(v10_1);
                                                                                throw new IllegalStateException(v1.a.h(v2_6, v3_10));
                                                                            } else {
                                                                                int v6_38 = v2_6.e.g(p29, 0);
                                                                                v10_1.s = 0;
                                                                                v10_1.r = v2_6;
                                                                                java.util.WeakHashMap v9_10 = v10_1.f;
                                                                                long v11_1 = v2_6.getNanoTime();
                                                                                if (p30 != 9223372036854775807) {
                                                                                    long v13_23 = this.g.a(v9_10).d;
                                                                                    if ((v13_23 != 0) && ((v13_23 + v11_1) >= p30)) {
                                                                                        v6_39 = 0;
                                                                                        v7_53 = v17;
                                                                                    }
                                                                                }
                                                                                java.util.WeakHashMap v9_15;
                                                                                if (!v10_1.j()) {
                                                                                    v9_15 = 0;
                                                                                } else {
                                                                                    androidx.recyclerview.widget.RecyclerView.e(v2_6, v5_26, v2_6.getChildCount(), v5_26.getLayoutParams());
                                                                                    v9_15 = v17;
                                                                                }
                                                                                android.view.ViewParent v14_13;
                                                                                long v13_27 = v2_6.r;
                                                                                v13_27.getClass();
                                                                                if (v10_1.s != null) {
                                                                                    v14_13 = 0;
                                                                                } else {
                                                                                    v14_13 = v17;
                                                                                }
                                                                                if (v14_13 != null) {
                                                                                    v10_1.c = v6_38;
                                                                                    if (v13_27.b) {
                                                                                        v10_1.e = v13_27.b(v6_38);
                                                                                    }
                                                                                    v10_1.j = ((v10_1.j & -520) | 1);
                                                                                    if (m0.j.a()) {
                                                                                        android.os.Trace.beginSection(String.format("RV onBindViewHolder type=0x%X", new Object[] {Integer.valueOf(v10_1.f)})));
                                                                                    }
                                                                                }
                                                                                v10_1.s = v13_27;
                                                                                if (androidx.recyclerview.widget.RecyclerView.F0) {
                                                                                    if ((v5_26.getParent() == null) && (v5_26.isAttachedToWindow() != v10_1.j())) {
                                                                                        String v2_13 = new StringBuilder("Temp-detached state out of sync with reality. holder.isTmpDetached(): ");
                                                                                        v2_13.append(v10_1.j());
                                                                                        v2_13.append(", attached to window: ");
                                                                                        v2_13.append(v5_26.isAttachedToWindow());
                                                                                        v2_13.append(", holder: ");
                                                                                        v2_13.append(v10_1);
                                                                                        throw new IllegalStateException(v2_13.toString());
                                                                                    } else {
                                                                                        if ((v5_26.getParent() == null) && (v5_26.isAttachedToWindow())) {
                                                                                            String v2_16 = new StringBuilder("Attempting to bind attached holder with no parent (AKA temp detached): ");
                                                                                            v2_16.append(v10_1);
                                                                                            throw new IllegalStateException(v2_16.toString());
                                                                                        }
                                                                                    }
                                                                                }
                                                                                v10_1.c();
                                                                                v13_27.c(v10_1, v6_38);
                                                                                if (v14_13 != null) {
                                                                                    int v6_40 = v10_1.k;
                                                                                    if (v6_40 != 0) {
                                                                                        v6_40.clear();
                                                                                    }
                                                                                    v10_1.j = (v10_1.j & -1025);
                                                                                    int v6_43 = v5_26.getLayoutParams();
                                                                                    if ((v6_43 instanceof a2.u0)) {
                                                                                        ((a2.u0) v6_43).c = v17;
                                                                                    }
                                                                                    android.os.Trace.endSection();
                                                                                }
                                                                                if (v9_15 != null) {
                                                                                    androidx.recyclerview.widget.RecyclerView.f(v2_6, v5_26);
                                                                                }
                                                                                q0.b v8_15 = this.g;
                                                                                java.util.WeakHashMap v9_17 = v10_1.f;
                                                                                int v6_46 = (v2_6.getNanoTime() - v11_1);
                                                                                q0.b v8_16 = v8_15.a(v9_17);
                                                                                long v11_2 = v8_16.d;
                                                                                if (v11_2 != 0) {
                                                                                    v6_46 = ((v6_46 / v25) + ((v11_2 / v25) * v22));
                                                                                }
                                                                                int v6_50;
                                                                                v8_16.d = v6_46;
                                                                                int v6_48 = v2_6.F;
                                                                                if ((v6_48 == 0) || (!v6_48.isEnabled())) {
                                                                                    v6_50 = 0;
                                                                                } else {
                                                                                    v6_50 = 1;
                                                                                }
                                                                                if (v6_50 == 0) {
                                                                                    v7_53 = 1;
                                                                                } else {
                                                                                    v7_53 = 1;
                                                                                    if (v5_26.getImportantForAccessibility() == 0) {
                                                                                        v5_26.setImportantForAccessibility(1);
                                                                                    }
                                                                                    int v6_52 = v2_6.r0;
                                                                                    if (v6_52 != 0) {
                                                                                        int v6_53 = v6_52.e;
                                                                                        if (v6_53 != 0) {
                                                                                            q0.b v8_18;
                                                                                            q0.b v8_17 = q0.q0.e(v5_26);
                                                                                            if (v8_17 != null) {
                                                                                                if (!(v8_17 instanceof q0.a)) {
                                                                                                    v8_18 = new q0.b(v8_17);
                                                                                                } else {
                                                                                                    v8_18 = ((q0.a) v8_17).a;
                                                                                                }
                                                                                            } else {
                                                                                                v8_18 = 0;
                                                                                            }
                                                                                            if ((v8_18 != null) && (v8_18 != v6_53)) {
                                                                                                v6_53.e.put(v5_26, v8_18);
                                                                                            }
                                                                                        }
                                                                                        q0.q0.n(v5_26, v6_53);
                                                                                    }
                                                                                }
                                                                                if (v3_8.g) {
                                                                                    v10_1.g = p29;
                                                                                }
                                                                                v6_39 = v7_53;
                                                                            }
                                                                        } else {
                                                                            v10_1.g = p29;
                                                                        }
                                                                    } else {
                                                                        String v5_22 = v2_6.getNanoTime();
                                                                        if (p30 != 9223372036854775807) {
                                                                            int v7_43;
                                                                            int v7_40 = this.g.a(0).c;
                                                                            if ((v7_40 != 0) && ((v7_40 + v5_22) >= p30)) {
                                                                                v7_43 = 0;
                                                                            } else {
                                                                                v7_43 = v17;
                                                                            }
                                                                            if (v7_43 == 0) {
                                                                                return 0;
                                                                            }
                                                                        }
                                                                        int v7_44 = v2_6.r;
                                                                        v7_44.getClass();
                                                                        if (m0.j.a()) {
                                                                            android.os.Trace.beginSection(String.format("RV onCreateViewHolder type=0x%X", new Object[] {Integer.valueOf(0)})));
                                                                        }
                                                                        v10_1 = v7_44.d(v2_6);
                                                                        int v7_45 = v10_1.a;
                                                                        if (v7_45.getParent() != null) {
                                                                            throw new IllegalStateException("ViewHolder views must not be attached when created. Ensure that you are not passing \'true\' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)");
                                                                        } else {
                                                                            v10_1.f = 0;
                                                                            android.os.Trace.endSection();
                                                                            if (androidx.recyclerview.widget.RecyclerView.K0) {
                                                                                int v7_46 = androidx.recyclerview.widget.RecyclerView.G(v7_45);
                                                                                if (v7_46 != 0) {
                                                                                    v10_1.b = new ref.WeakReference(v7_46);
                                                                                }
                                                                            }
                                                                            java.util.WeakHashMap v9_8 = this.g;
                                                                            int v7_48 = (v2_6.getNanoTime() - v5_22);
                                                                            String v5_23 = v9_8.a(0);
                                                                            long v13_18 = v5_23.c;
                                                                            if (v13_18 != 0) {
                                                                                v7_48 = ((v7_48 / v25) + ((v13_18 / v25) * 3));
                                                                            }
                                                                            v5_23.c = v7_48;
                                                                            if (!androidx.recyclerview.widget.RecyclerView.G0) {
                                                                            } else {
                                                                                android.util.Log.d("RecyclerView", "tryGetViewHolderForPositionByDeadline created new ViewHolder");
                                                                            }
                                                                        }
                                                                    }
                                                                    String v5_2 = v7_27;
                                                                    int v6_3 = new StringBuilder("Inconsistency detected. Invalid item position ");
                                                                    v6_3.append(p29);
                                                                    v6_3.append("(offset:");
                                                                    v6_3.append(v5_2);
                                                                    v6_3.append(").state:");
                                                                    v6_3.append(v3_8.b());
                                                                    v6_3.append(v2_6.B());
                                                                    throw new IndexOutOfBoundsException(v6_3.toString());
                                                                }
                                                            }
                                                            v10_13--;
                                                            v7_27 = v24_0;
                                                        }
                                                        v24_0 = v7_27;
                                                        v25 = 4;
                                                        String v5_4 = (v11_7.size() - 1);
                                                        while (v5_4 >= null) {
                                                            int v6_5 = ((a2.k1) v11_7.get(v5_4));
                                                            if ((v6_5.e != v13_17) || (v6_5.d())) {
                                                                v5_4--;
                                                            } else {
                                                                if (v6_5.f != 0) {
                                                                    this.h(v5_4);
                                                                    break;
                                                                } else {
                                                                    v11_7.remove(v5_4);
                                                                    v10_1 = v6_5;
                                                                }
                                                            }
                                                        }
                                                        v10_1 = 0;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    v2_6.r.getClass();
                                    if (v10_1.f == 0) {
                                    }
                                }
                                v7_16 = 0;
                            }
                        } else {
                            if ((androidx.recyclerview.widget.RecyclerView.F0) && (!v3_8.g)) {
                                throw new IllegalStateException(v1.a.h(v2_6, new StringBuilder("should not receive a removed view unless it is pre layout")));
                            } else {
                                v7_16 = v3_8.g;
                            }
                        }
                    }
                }
                int v10_22 = ((java.util.ArrayList) v2_6.f.e);
                long v13_30 = v10_22.size();
                android.view.ViewParent v14_0 = 0;
                while (v14_0 < v13_30) {
                    boolean v15_0 = ((android.view.View) v10_22.get(v14_0));
                    int v16_0 = androidx.recyclerview.widget.RecyclerView.M(v15_0);
                    v17 = 1;
                    if ((v16_0.b() != p29) || ((v16_0.f()) || (v16_0.h()))) {
                        v14_0++;
                    }
                    if (!v15_0) {
                        int v7_3 = v11_7.size();
                        int v10_0 = 0;
                        while (v10_0 < v7_3) {
                            long v13_1 = ((a2.k1) v11_7.get(v10_0));
                            if ((v13_1.f()) || ((v13_1.b() != p29) || (v13_1.d()))) {
                                v10_0++;
                            } else {
                                v11_7.remove(v10_0);
                                if (androidx.recyclerview.widget.RecyclerView.G0) {
                                    int v7_6 = new StringBuilder("getScrapOrHiddenOrCachedHolderForPosition(");
                                    v7_6.append(p29);
                                    v7_6.append(") found match in cache: ");
                                    v7_6.append(v13_1);
                                    android.util.Log.d("RecyclerView", v7_6.toString());
                                }
                                v10_1 = v13_1;
                            }
                        }
                        v10_1 = 0;
                    } else {
                        int v7_8 = androidx.recyclerview.widget.RecyclerView.M(v15_0);
                        int v10_4 = v2_6.f;
                        long v13_3 = ((a2.c) v10_4.d);
                        android.view.ViewParent v14_7 = ((a2.h0) v10_4.c).a.indexOfChild(v15_0);
                        if (v14_7 < null) {
                            String v2_1 = new StringBuilder("view is not a child, cannot hide ");
                            v2_1.append(v15_0);
                            throw new IllegalArgumentException(v2_1.toString());
                        } else {
                            if (!v13_3.d(v14_7)) {
                                String v2_4 = new StringBuilder("trying to unhide a view that was not hidden");
                                v2_4.append(v15_0);
                                throw new RuntimeException(v2_4.toString());
                            } else {
                                int v10_10;
                                v13_3.a(v14_7);
                                v10_4.A(v15_0);
                                int v10_5 = v2_6.f;
                                long v13_5 = ((a2.c) v10_5.d);
                                int v10_9 = ((a2.h0) v10_5.c).a.indexOfChild(v15_0);
                                if ((v10_9 != -1) && (!v13_5.d(v10_9))) {
                                    v10_10 = (v10_9 - v13_5.b(v10_9));
                                } else {
                                    v10_10 = -1;
                                }
                                if (v10_10 == -1) {
                                    boolean v3_3 = new StringBuilder("layout index should not be -1 after unhiding a view:");
                                    v3_3.append(v7_8);
                                    throw new IllegalStateException(v1.a.h(v2_6, v3_3));
                                } else {
                                    v2_6.f.l(v10_10);
                                    this.k(v15_0);
                                    v7_8.a(8224);
                                    v10_1 = v7_8;
                                }
                            }
                        }
                    }
                }
                v17 = 1;
                v15_0 = 0;
            }
        }
    }

    public final void m(a2.k1 p2)
    {
        if (!p2.o) {
            this.a.remove(p2);
        } else {
            this.b.remove(p2);
        }
        p2.n = 0;
        p2.o = 0;
        p2.j = (p2.j & -33);
        return;
    }

    public final void n()
    {
        java.util.ArrayList v0_2;
        java.util.ArrayList v0_1 = this.h.s;
        if (v0_1 == null) {
            v0_2 = 0;
        } else {
            v0_2 = v0_1.j;
        }
        this.f = (this.e + v0_2);
        java.util.ArrayList v0_3 = this.c;
        int v1_1 = (v0_3.size() - 1);
        while ((v1_1 >= 0) && (v0_3.size() > this.f)) {
            this.h(v1_1);
            v1_1--;
        }
        return;
    }
}
