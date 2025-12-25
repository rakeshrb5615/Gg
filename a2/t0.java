package a2;
public abstract class t0 {
    public a2.d a;
    public androidx.recyclerview.widget.RecyclerView b;
    public final k2.c c;
    public final k2.c d;
    public a2.b0 e;
    public boolean f;
    public boolean g;
    public final boolean h;
    public final boolean i;
    public int j;
    public boolean k;
    public int l;
    public int m;
    public int n;
    public int o;

    public t0()
    {
        int v0_5 = new a2.r0(this, 0);
        a2.r0 v1_2 = new a2.r0(this, 1);
        this.c = new k2.c(v0_5);
        this.d = new k2.c(v1_2);
        this.f = 0;
        this.g = 0;
        this.h = 1;
        this.i = 1;
        return;
    }

    public static int A(android.view.View p2)
    {
        int v0_2 = ((a2.u0) p2.getLayoutParams()).b;
        return ((p2.getMeasuredWidth() + v0_2.left) + v0_2.right);
    }

    public static int G(android.view.View p0)
    {
        return ((a2.u0) p0.getLayoutParams()).a.b();
    }

    public static a2.s0 H(android.content.Context p2, android.util.AttributeSet p3, int p4, int p5)
    {
        a2.s0 v0_1 = new a2.s0();
        android.content.res.TypedArray v2_1 = p2.obtainStyledAttributes(p3, z1.a.a, p4, p5);
        v0_1.a = v2_1.getInt(0, 1);
        v0_1.b = v2_1.getInt(10, 1);
        v0_1.c = v2_1.getBoolean(9, 0);
        v0_1.d = v2_1.getBoolean(11, 0);
        v2_1.recycle();
        return v0_1;
    }

    public static boolean M(int p3, int p4, int p5)
    {
        int v0 = android.view.View$MeasureSpec.getMode(p4);
        int v4_1 = android.view.View$MeasureSpec.getSize(p4);
        if ((p5 <= 0) || (p3 == p5)) {
            if (v0 == -2147483648) {
                if (v4_1 < p3) {
                    return 0;
                } else {
                    return 1;
                }
            } else {
                if (v0 == 0) {
                    return 1;
                } else {
                    if (v0 == 1073741824) {
                        if (v4_1 != p3) {
                            return 0;
                        } else {
                            return 1;
                        }
                    } else {
                        return 0;
                    }
                }
            }
        } else {
            return 0;
        }
    }

    public static void N(android.view.View p3, int p4, int p5, int p6, int p7)
    {
        int v0_2 = ((a2.u0) p3.getLayoutParams());
        int v1_1 = v0_2.b;
        p3.layout(((p4 + v1_1.left) + v0_2.leftMargin), ((p5 + v1_1.top) + v0_2.topMargin), ((p6 - v1_1.right) - v0_2.rightMargin), ((p7 - v1_1.bottom) - v0_2.bottomMargin));
        return;
    }

    public static int g(int p2, int p3, int p4)
    {
        int v0 = android.view.View$MeasureSpec.getMode(p2);
        int v2_1 = android.view.View$MeasureSpec.getSize(p2);
        if (v0 == -2147483648) {
            return Math.min(v2_1, Math.max(p3, p4));
        } else {
            if (v0 != 1073741824) {
                v2_1 = Math.max(p3, p4);
            }
            return v2_1;
        }
    }

    public static int w(boolean p4, int p5, int p6, int p7, int p8)
    {
        int v5_2 = Math.max(0, (p5 - p7));
        if (p4 == 0) {
            if (p8 < 0) {
                if (p8 != -1) {
                    if (p8 != -2) {
                        p6 = 0;
                        p8 = 0;
                    } else {
                        if ((p6 != -2147483648) && (p6 != 1073741824)) {
                            p8 = v5_2;
                            p6 = 0;
                        } else {
                            p8 = v5_2;
                            p6 = -2147483648;
                        }
                    }
                } else {
                    p8 = v5_2;
                }
            } else {
                p6 = 1073741824;
            }
        } else {
            if (p8 < 0) {
                if ((p8 == -1) && ((p6 == -2147483648) || ((p6 != 0) && (p6 == 1073741824)))) {
                }
            }
        }
        return android.view.View$MeasureSpec.makeMeasureSpec(p8, p6);
    }

    public static int z(android.view.View p2)
    {
        int v0_2 = ((a2.u0) p2.getLayoutParams()).b;
        return ((p2.getMeasuredHeight() + v0_2.top) + v0_2.bottom);
    }

    public abstract void A0();

    public final int B()
    {
        int v0_1;
        int v0_0 = this.b;
        if (v0_0 == 0) {
            v0_1 = 0;
        } else {
            v0_1 = v0_0.getAdapter();
        }
        if (v0_1 == 0) {
            return 0;
        } else {
            return v0_1.a();
        }
    }

    public final void B0(a2.b0 p4)
    {
        String v0_0 = this.e;
        if ((v0_0 != null) && ((p4 != v0_0) && (v0_0.e))) {
            v0_0.i();
        }
        this.e = p4;
        String v0_6 = this.b;
        int v1_7 = v0_6.h0;
        v1_7.m.removeCallbacks(v1_7);
        v1_7.c.abortAnimation();
        if (p4.h) {
            int v1_3 = new StringBuilder("An instance of ");
            v1_3.append(p4.getClass().getSimpleName());
            v1_3.append(" was started more than once. Each instance of");
            v1_3.append(p4.getClass().getSimpleName());
            v1_3.append(" is intended to only be used once. You should create a new instance for each use.");
            android.util.Log.w("RecyclerView", v1_3.toString());
        }
        p4.b = v0_6;
        p4.c = this;
        int v1_6 = p4.a;
        if (v1_6 == -1) {
            throw new IllegalArgumentException("Invalid target position");
        } else {
            v0_6.k0.a = v1_6;
            p4.e = 1;
            p4.d = 1;
            p4.f = v0_6.s.q(v1_6);
            p4.b.h0.b();
            p4.h = 1;
            return;
        }
    }

    public final int C()
    {
        int v0_0 = this.b;
        if (v0_0 == 0) {
            return 0;
        } else {
            return v0_0.getPaddingBottom();
        }
    }

    public boolean C0()
    {
        return 0;
    }

    public final int D()
    {
        int v0_0 = this.b;
        if (v0_0 == 0) {
            return 0;
        } else {
            return v0_0.getPaddingLeft();
        }
    }

    public final int E()
    {
        int v0_0 = this.b;
        if (v0_0 == 0) {
            return 0;
        } else {
            return v0_0.getPaddingRight();
        }
    }

    public final int F()
    {
        int v0_0 = this.b;
        if (v0_0 == 0) {
            return 0;
        } else {
            return v0_0.getPaddingTop();
        }
    }

    public int I(a2.z0 p1, a2.g1 p2)
    {
        int v1_0 = this.b;
        if ((v1_0 == 0) || ((v1_0.r == null) || (!this.e()))) {
            return 1;
        } else {
            return this.b.r.a();
        }
    }

    public final void J(android.view.View p7, android.graphics.Rect p8)
    {
        int v0_6 = ((a2.u0) p7.getLayoutParams()).b;
        p8.set((- v0_6.left), (- v0_6.top), (p7.getWidth() + v0_6.right), (p7.getHeight() + v0_6.bottom));
        if (this.b != null) {
            int v0_4 = p7.getMatrix();
            if ((v0_4 != 0) && (!v0_4.isIdentity())) {
                int v1_2 = this.b.q;
                v1_2.set(p8);
                v0_4.mapRect(v1_2);
                p8.set(((int) Math.floor(((double) v1_2.left))), ((int) Math.floor(((double) v1_2.top))), ((int) Math.ceil(((double) v1_2.right))), ((int) Math.ceil(((double) v1_2.bottom))));
            }
        }
        p8.offset(p7.getLeft(), p7.getTop());
        return;
    }

    public abstract boolean K();

    public boolean L()
    {
        return 0;
    }

    public void O(int p5)
    {
        androidx.recyclerview.widget.RecyclerView v0 = this.b;
        if (v0 != null) {
            int v1_1 = v0.f.r();
            int v2 = 0;
            while (v2 < v1_1) {
                v0.f.q(v2).offsetLeftAndRight(p5);
                v2++;
            }
        }
        return;
    }

    public void P(int p5)
    {
        androidx.recyclerview.widget.RecyclerView v0 = this.b;
        if (v0 != null) {
            int v1_1 = v0.f.r();
            int v2 = 0;
            while (v2 < v1_1) {
                v0.f.q(v2).offsetTopAndBottom(p5);
                v2++;
            }
        }
        return;
    }

    public void Q()
    {
        return;
    }

    public void R(androidx.recyclerview.widget.RecyclerView p1)
    {
        return;
    }

    public abstract void S();

    public abstract android.view.View T();

    public void U(android.view.accessibility.AccessibilityEvent p4)
    {
        boolean v0_0 = this.b;
        int v1 = v0_0.k0;
        if ((v0_0) && (p4 != null)) {
            v1 = 1;
            if ((!v0_0.canScrollVertically(1)) && ((!this.b.canScrollVertically(-1)) && ((!this.b.canScrollHorizontally(-1)) && (!this.b.canScrollHorizontally(1))))) {
                v1 = 0;
            }
            p4.setScrollable(v1);
            boolean v0_7 = this.b.r;
            if (v0_7) {
                p4.setItemCount(v0_7.a());
            }
        }
        return;
    }

    public void V(a2.z0 p6, a2.g1 p7, r0.c p8)
    {
        android.view.accessibility.AccessibilityNodeInfo v0 = p8.a;
        if ((this.b.canScrollVertically(-1)) || (this.b.canScrollHorizontally(-1))) {
            p8.a(8192);
            v0.setScrollable(1);
            p8.h(67108864, 1);
        }
        if ((this.b.canScrollVertically(1)) || (this.b.canScrollHorizontally(1))) {
            p8.a(4096);
            v0.setScrollable(1);
            p8.h(67108864, 1);
        }
        v0.setCollectionInfo(android.view.accessibility.AccessibilityNodeInfo$CollectionInfo.obtain(this.I(p6, p7), this.x(p6, p7), 0, 0));
        return;
    }

    public void W(a2.z0 p2, a2.g1 p3, android.view.View p4, r0.c p5)
    {
        k4.i v2_2;
        if (!this.e()) {
            v2_2 = 0;
        } else {
            v2_2 = a2.t0.G(p4);
        }
        int v4_1;
        if (!this.d()) {
            v4_1 = 0;
        } else {
            v4_1 = a2.t0.G(p4);
        }
        p5.j(k4.i.c(0, v2_2, 1, v4_1, 1));
        return;
    }

    public final void X(android.view.View p3, r0.c p4)
    {
        a2.g1 v0_0 = androidx.recyclerview.widget.RecyclerView.M(p3);
        if ((v0_0 != null) && ((!v0_0.h()) && (!((java.util.ArrayList) this.a.e).contains(v0_0.a)))) {
            a2.g1 v0_2 = this.b;
            this.W(v0_2.c, v0_2.k0, p3, p4);
        }
        return;
    }

    public void Y(int p1, int p2)
    {
        return;
    }

    public void Z()
    {
        return;
    }

    public void a0(int p1, int p2)
    {
        return;
    }

    public final void b(android.view.View p10, int p11, boolean p12)
    {
        String v0_0 = androidx.recyclerview.widget.RecyclerView.M(p10);
        if ((p12 == null) && (!v0_0.h())) {
            this.b.m.C(v0_0);
        } else {
            StringBuilder v12_6 = ((r.j) this.b.m.b);
            a2.u0 v2_4 = ((a2.u1) v12_6.get(v0_0));
            if (v2_4 == null) {
                v2_4 = a2.u1.a();
                v12_6.put(v0_0, v2_4);
            }
            v2_4.a = (v2_4.a | 1);
        }
        StringBuilder v12_10 = ((a2.u0) p10.getLayoutParams());
        if ((!v0_0.p()) && (!v0_0.i())) {
            a2.k1 v6_2 = -1;
            if (p10.getParent() != this.b) {
                this.a.a(p10, p11, 0);
                v12_10.c = 1;
                IllegalArgumentException v11_5 = this.e;
                if ((v11_5 != null) && (v11_5.e)) {
                    v11_5.b.getClass();
                    boolean v1_12 = androidx.recyclerview.widget.RecyclerView.M(p10);
                    if (v1_12) {
                        v6_2 = v1_12.b();
                    }
                    if (v6_2 == v11_5.a) {
                        v11_5.f = p10;
                        if (androidx.recyclerview.widget.RecyclerView.G0) {
                            android.util.Log.d("RecyclerView", "smooth scroll target view has been attached");
                        }
                    }
                }
            } else {
                a2.u0 v2_14;
                a2.u0 v2_9 = this.a;
                android.view.View v5_2 = ((a2.c) v2_9.d);
                a2.u0 v2_13 = ((a2.h0) v2_9.c).a.indexOfChild(p10);
                if ((v2_13 != -1) && (!v5_2.d(v2_13))) {
                    v2_14 = (v2_13 - v5_2.b(v2_13));
                } else {
                    v2_14 = -1;
                }
                if (p11 == -1) {
                    p11 = this.a.r();
                }
                if (v2_14 == -1) {
                    StringBuilder v12_15 = new StringBuilder("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:");
                    v12_15.append(this.b.indexOfChild(p10));
                    throw new IllegalStateException(v1.a.h(this.b, v12_15));
                } else {
                    if (v2_14 != p11) {
                        a2.d v10_17 = this.b.s;
                        android.view.View v5_4 = v10_17.u(v2_14);
                        if (v5_4 == null) {
                            StringBuilder v12_3 = new StringBuilder("Cannot move a child from non-existing index:");
                            v12_3.append(v2_14);
                            v12_3.append(v10_17.b.toString());
                            throw new IllegalArgumentException(v12_3.toString());
                        } else {
                            v10_17.u(v2_14);
                            v10_17.a.l(v2_14);
                            a2.u0 v2_1 = ((a2.u0) v5_4.getLayoutParams());
                            a2.k1 v6_1 = androidx.recyclerview.widget.RecyclerView.M(v5_4);
                            if (!v6_1.h()) {
                                v10_17.b.m.C(v6_1);
                            } else {
                                int v7_4 = ((r.j) v10_17.b.m.b);
                                a2.u1 v8_1 = ((a2.u1) v7_4.get(v6_1));
                                if (v8_1 == null) {
                                    v8_1 = a2.u1.a();
                                    v7_4.put(v6_1, v8_1);
                                }
                                v8_1.a = (1 | v8_1.a);
                            }
                            v10_17.a.c(v5_4, p11, v2_1, v6_1.h());
                        }
                    }
                }
            }
        } else {
            if (!v0_0.i()) {
                v0_0.j = (v0_0.j & -33);
            } else {
                v0_0.n.m(v0_0);
            }
            this.a.c(p10, p11, p10.getLayoutParams(), 0);
        }
        if (v12_10.d) {
            if (androidx.recyclerview.widget.RecyclerView.G0) {
                a2.d v10_8 = new StringBuilder("consuming pending invalidate on child ");
                v10_8.append(v12_10.a);
                android.util.Log.d("RecyclerView", v10_8.toString());
            }
            v0_0.a.invalidate();
            v12_10.d = 0;
        }
        return;
    }

    public void b0(int p1, int p2)
    {
        return;
    }

    public void c(String p2)
    {
        androidx.recyclerview.widget.RecyclerView v0 = this.b;
        if (v0 != null) {
            v0.k(p2);
        }
        return;
    }

    public void c0(int p1, int p2)
    {
        return;
    }

    public abstract boolean d();

    public abstract void d0();

    public abstract boolean e();

    public abstract void e0();

    public boolean f(a2.u0 p1)
    {
        if (p1 == 0) {
            return 0;
        } else {
            return 1;
        }
    }

    public void f0(android.os.Parcelable p1)
    {
        return;
    }

    public android.os.Parcelable g0()
    {
        return 0;
    }

    public void h(int p1, int p2, a2.g1 p3, a2.r p4)
    {
        return;
    }

    public void h0(int p1)
    {
        return;
    }

    public void i(int p1, a2.r p2)
    {
        return;
    }

    public boolean i0(int p10, android.os.Bundle p11)
    {
        int v0_5 = this.o;
        int v1_1 = this.n;
        int v2_2 = new android.graphics.Rect();
        if ((this.b.getMatrix().isIdentity()) && (this.b.getGlobalVisibleRect(v2_2))) {
            v0_5 = v2_2.height();
            v1_1 = v2_2.width();
        }
        int v1_3;
        int v0_1;
        if (p10 == 4096) {
            if (!this.b.canScrollVertically(1)) {
                v0_1 = 0;
            } else {
                v0_1 = ((v0_5 - this.F()) - this.C());
            }
            if (!this.b.canScrollHorizontally(1)) {
                v1_3 = 0;
            } else {
                v1_3 = ((v1_1 - this.D()) - this.E());
            }
        } else {
            if (p10 == 8192) {
                if (!this.b.canScrollVertically(-1)) {
                    v0_1 = 0;
                } else {
                    v0_1 = (- ((v0_5 - this.F()) - this.C()));
                }
                if (!this.b.canScrollHorizontally(-1)) {
                } else {
                    v1_3 = (- ((v1_1 - this.D()) - this.E()));
                }
            } else {
                v0_1 = 0;
                v1_3 = 0;
            }
        }
        if ((v0_1 != 0) || (v1_3 != 0)) {
            androidx.recyclerview.widget.RecyclerView v11_4;
            if (p11 == null) {
                v11_4 = 1065353216;
            } else {
                v11_4 = p11.getFloat("androidx.core.view.accessibility.action.ARGUMENT_SCROLL_AMOUNT_FLOAT", 1065353216);
                if (v11_4 < 0) {
                    if (androidx.recyclerview.widget.RecyclerView.F0) {
                        int v0_4 = new StringBuilder("attempting to use ACTION_ARGUMENT_SCROLL_AMOUNT_FLOAT with a negative value (");
                        v0_4.append(v11_4);
                        v0_4.append(")");
                        throw new IllegalArgumentException(v0_4.toString());
                    } else {
                        return 0;
                    }
                }
            }
            if (Float.compare(v11_4, 2139095040) != 0) {
                if ((Float.compare(1065353216, v11_4) != 0) && (Float.compare(0, v11_4) != 0)) {
                    v1_3 = ((int) (((float) v1_3) * v11_4));
                    v0_1 = ((int) (((float) v0_1) * v11_4));
                }
                this.b.h0(v1_3, 1, v0_1);
                return 1;
            } else {
                androidx.recyclerview.widget.RecyclerView v11_1 = this.b;
                int v0_2 = v11_1.r;
                if (v0_2 != 0) {
                    if (p10 == 4096) {
                        v11_1.i0((v0_2.a() - 1));
                        return 1;
                    } else {
                        if (p10 == 8192) {
                            v11_1.i0(0);
                            return 1;
                        } else {
                            return 1;
                        }
                    }
                }
            }
        }
        return 0;
    }

    public abstract int j();

    public final void j0(a2.z0 p3)
    {
        int v0_1 = (this.v() - 1);
        while (v0_1 >= 0) {
            if (!androidx.recyclerview.widget.RecyclerView.M(this.u(v0_1)).o()) {
                android.view.View v1_1 = this.u(v0_1);
                this.m0(v0_1);
                p3.i(v1_1);
            }
            v0_1--;
        }
        return;
    }

    public abstract int k();

    public final void k0(a2.z0 p8)
    {
        java.util.ArrayList v0 = p8.a;
        int v1 = v0.size();
        int v2 = (v1 - 1);
        while (v2 >= 0) {
            a2.k1 v3_2 = ((a2.k1) v0.get(v2)).a;
            int v4_0 = androidx.recyclerview.widget.RecyclerView.M(v3_2);
            if (!v4_0.o()) {
                v4_0.n(0);
                if (v4_0.j()) {
                    this.b.removeDetachedView(v3_2, 0);
                }
                int v6_3 = this.b.P;
                if (v6_3 != 0) {
                    v6_3.d(v4_0);
                }
                v4_0.n(1);
                a2.k1 v3_3 = androidx.recyclerview.widget.RecyclerView.M(v3_2);
                v3_3.n = 0;
                v3_3.o = 0;
                v3_3.j = (v3_3.j & -33);
                p8.j(v3_3);
            }
            v2--;
        }
        v0.clear();
        androidx.recyclerview.widget.RecyclerView v8_2 = p8.b;
        if (v8_2 != null) {
            v8_2.clear();
        }
        if (v1 > 0) {
            this.b.invalidate();
        }
        return;
    }

    public abstract int l();

    public final void l0(android.view.View p7, a2.z0 p8)
    {
        a2.d v0 = this.a;
        a2.h0 v1_1 = ((a2.h0) v0.c);
        int v2_1 = v0.b;
        if (v2_1 == 1) {
            throw new IllegalStateException("Cannot call removeView(At) within removeView(At)");
        } else {
            if (v2_1 == 2) {
                throw new IllegalStateException("Cannot call removeView(At) within removeViewIfHidden");
            } else {
                v0.b = 1;
                v0.f = p7;
                int v3_1 = v1_1.a.indexOfChild(p7);
                if (v3_1 >= 0) {
                    if (((a2.c) v0.d).f(v3_1)) {
                        v0.A(p7);
                    }
                    v1_1.i(v3_1);
                }
                v0.b = 0;
                v0.f = 0;
                p8.i(p7);
                return;
            }
        }
    }

    public abstract int m();

    public final void m0(int p7)
    {
        if (this.u(p7) == null) {
            return;
        } else {
            String v0_3 = this.a;
            a2.h0 v1_1 = ((a2.h0) v0_3.c);
            int v2_1 = v0_3.b;
            if (v2_1 == 1) {
                throw new IllegalStateException("Cannot call removeView(At) within removeView(At)");
            } else {
                if (v2_1 == 2) {
                    throw new IllegalStateException("Cannot call removeView(At) within removeViewIfHidden");
                } else {
                    Throwable v7_5 = v0_3.s(p7);
                    android.view.View v5_1 = v1_1.a.getChildAt(v7_5);
                    if (v5_1 != null) {
                        v0_3.b = 1;
                        v0_3.f = v5_1;
                        if (((a2.c) v0_3.d).f(v7_5)) {
                            v0_3.A(v5_1);
                        }
                        v1_1.i(v7_5);
                    }
                    v0_3.b = 0;
                    v0_3.f = 0;
                    return;
                }
            }
        }
    }

    public abstract int n();

    public boolean n0(androidx.recyclerview.widget.RecyclerView p9, android.view.View p10, android.graphics.Rect p11, boolean p12, boolean p13)
    {
        int v0_0 = this.D();
        int v1_0 = this.F();
        int v2_2 = (this.n - this.E());
        int v3_0 = (this.o - this.C());
        int v4_3 = ((p10.getLeft() + p11.left) - p10.getScrollX());
        android.graphics.Rect v5_4 = ((p10.getTop() + p11.top) - p10.getScrollY());
        int v10_3 = (p11.width() + v4_3);
        int v11_2 = (p11.height() + v5_4);
        int v4_4 = (v4_3 - v0_0);
        int v6_1 = Math.min(0, v4_4);
        android.graphics.Rect v5_5 = (v5_4 - v1_0);
        int v1_1 = Math.min(0, v5_5);
        int v10_4 = (v10_3 - v2_2);
        int v2_1 = Math.max(0, v10_4);
        int v11_4 = Math.max(0, (v11_2 - v3_0));
        if (this.b.getLayoutDirection() != 1) {
            if (v6_1 == 0) {
                v6_1 = Math.min(v4_4, v2_1);
            }
            v2_1 = v6_1;
        } else {
            if (v2_1 == 0) {
                v2_1 = Math.max(v6_1, v10_4);
            }
        }
        if (v1_1 == 0) {
            v1_1 = Math.min(v5_5, v11_4);
        }
        int v10_5 = new int[] {v2_1, v1_1});
        int v11_5 = v10_5[0];
        int v10_6 = v10_5[1];
        if (p13 == 0) {
            if ((v11_5 != 0) || (v10_6 != 0)) {
                if (!p12) {
                    p9.h0(v11_5, 0, v10_6);
                    return 1;
                } else {
                    p9.scrollBy(v11_5, v10_6);
                    return 1;
                }
            }
        } else {
            int v13_1 = p9.getFocusedChild();
            if (v13_1 != 0) {
                int v1_2 = this.D();
                int v2_3 = this.F();
                int v3_5 = (this.n - this.E());
                int v4_7 = (this.o - this.C());
                android.graphics.Rect v5_8 = this.b.o;
                this.y(v13_1, v5_8);
                if (((v5_8.left - v11_5) < v3_5) && (((v5_8.right - v11_5) > v1_2) && (((v5_8.top - v10_6) < v4_7) && ((v5_8.bottom - v10_6) > v2_3)))) {
                }
            }
        }
        return 0;
    }

    public abstract int o();

    public final void o0()
    {
        androidx.recyclerview.widget.RecyclerView v0 = this.b;
        if (v0 != null) {
            v0.requestLayout();
        }
        return;
    }

    public final void p(a2.z0 p5)
    {
        int v0_1 = (this.v() - 1);
        while (v0_1 >= 0) {
            k2.c v1_6 = this.u(v0_1);
            String v2_1 = androidx.recyclerview.widget.RecyclerView.M(v1_6);
            if (!v2_1.o()) {
                if ((!v2_1.f()) || ((v2_1.h()) || (this.b.r.b))) {
                    this.u(v0_1);
                    this.a.l(v0_1);
                    p5.k(v1_6);
                    this.b.m.C(v2_1);
                } else {
                    this.m0(v0_1);
                    p5.j(v2_1);
                }
            } else {
                if (androidx.recyclerview.widget.RecyclerView.G0) {
                    k2.c v1_4 = new StringBuilder("ignoring view ");
                    v1_4.append(v2_1);
                    android.util.Log.d("RecyclerView", v1_4.toString());
                }
            }
            v0_1--;
        }
        return;
    }

    public abstract int p0();

    public android.view.View q(int p6)
    {
        int v0 = this.v();
        int v1 = 0;
        while (v1 < v0) {
            android.view.View v2 = this.u(v1);
            boolean v3_1 = androidx.recyclerview.widget.RecyclerView.M(v2);
            if ((!v3_1) || ((v3_1.b() != p6) || ((v3_1.o()) || ((!this.b.k0.g) && (v3_1.h()))))) {
                v1++;
            } else {
                return v2;
            }
        }
        return 0;
    }

    public abstract void q0();

    public abstract a2.u0 r();

    public abstract int r0();

    public a2.u0 s(android.content.Context p2, android.util.AttributeSet p3)
    {
        return new a2.u0(p2, p3);
    }

    public final void s0(androidx.recyclerview.widget.RecyclerView p3)
    {
        this.t0(android.view.View$MeasureSpec.makeMeasureSpec(p3.getWidth(), 1073741824), android.view.View$MeasureSpec.makeMeasureSpec(p3.getHeight(), 1073741824));
        return;
    }

    public a2.u0 t(android.view.ViewGroup$LayoutParams p2)
    {
        if (!(p2 instanceof a2.u0)) {
            if (!(p2 instanceof android.view.ViewGroup$MarginLayoutParams)) {
                return new a2.u0(p2);
            } else {
                return new a2.u0(((android.view.ViewGroup$MarginLayoutParams) p2));
            }
        } else {
            return new a2.u0(((a2.u0) p2));
        }
    }

    public final void t0(int p2, int p3)
    {
        this.n = android.view.View$MeasureSpec.getSize(p2);
        boolean v2_4 = android.view.View$MeasureSpec.getMode(p2);
        this.l = v2_4;
        if ((!v2_4) && (!androidx.recyclerview.widget.RecyclerView.J0)) {
            this.n = 0;
        }
        this.o = android.view.View$MeasureSpec.getSize(p3);
        boolean v2_2 = android.view.View$MeasureSpec.getMode(p3);
        this.m = v2_2;
        if ((!v2_2) && (!androidx.recyclerview.widget.RecyclerView.J0)) {
            this.o = 0;
        }
        return;
    }

    public final android.view.View u(int p2)
    {
        a2.d v0 = this.a;
        if (v0 == null) {
            return 0;
        } else {
            return v0.q(p2);
        }
    }

    public void u0(android.graphics.Rect p4, int p5, int p6)
    {
        androidx.recyclerview.widget.RecyclerView.g(this.b, a2.t0.g(p5, (this.E() + (this.D() + p4.width())), this.b.getMinimumWidth()), a2.t0.g(p6, (this.C() + (this.F() + p4.height())), this.b.getMinimumHeight()));
        return;
    }

    public final int v()
    {
        int v0_0 = this.a;
        if (v0_0 == 0) {
            return 0;
        } else {
            return v0_0.r();
        }
    }

    public final void v0(int p9, int p10)
    {
        android.graphics.Rect v0_0 = this.v();
        if (v0_0 != null) {
            int v1 = -2147483648;
            int v4 = 2147483647;
            int v5 = 0;
            int v2_0 = -2147483648;
            int v3_0 = 2147483647;
            while (v5 < v0_0) {
                android.graphics.Rect v7_1 = this.b.o;
                this.y(this.u(v5), v7_1);
                int v6_1 = v7_1.left;
                if (v6_1 < v3_0) {
                    v3_0 = v6_1;
                }
                int v6_2 = v7_1.right;
                if (v6_2 > v1) {
                    v1 = v6_2;
                }
                int v6_3 = v7_1.top;
                if (v6_3 < v4) {
                    v4 = v6_3;
                }
                int v6_4 = v7_1.bottom;
                if (v6_4 > v2_0) {
                    v2_0 = v6_4;
                }
                v5++;
            }
            this.b.o.set(v3_0, v4, v1, v2_0);
            this.u0(this.b.o, p9, p10);
            return;
        } else {
            this.b.q(p9, p10);
            return;
        }
    }

    public final void w0(androidx.recyclerview.widget.RecyclerView p2)
    {
        if (p2 != 0) {
            this.b = p2;
            this.a = p2.f;
            this.n = p2.getWidth();
            this.o = p2.getHeight();
        } else {
            this.b = 0;
            this.a = 0;
            this.n = 0;
            this.o = 0;
        }
        this.l = 1073741824;
        this.m = 1073741824;
        return;
    }

    public int x(a2.z0 p1, a2.g1 p2)
    {
        int v1_0 = this.b;
        if ((v1_0 == 0) || ((v1_0.r == null) || (!this.d()))) {
            return 1;
        } else {
            return this.b.r.a();
        }
    }

    public final boolean x0(android.view.View p3, int p4, int p5, a2.u0 p6)
    {
        if ((!p3.isLayoutRequested()) && ((this.h) && ((a2.t0.M(p3.getWidth(), p4, p6.width)) && (a2.t0.M(p3.getHeight(), p5, p6.height))))) {
            return 0;
        } else {
            return 1;
        }
    }

    public void y(android.view.View p7, android.graphics.Rect p8)
    {
        int v0_2 = ((a2.u0) p7.getLayoutParams());
        int v1_1 = v0_2.b;
        p8.set(((p7.getLeft() - v1_1.left) - v0_2.leftMargin), ((p7.getTop() - v1_1.top) - v0_2.topMargin), ((p7.getRight() + v1_1.right) + v0_2.rightMargin), ((p7.getBottom() + v1_1.bottom) + v0_2.bottomMargin));
        return;
    }

    public boolean y0()
    {
        return 0;
    }

    public final boolean z0(android.view.View p3, int p4, int p5, a2.u0 p6)
    {
        if ((this.h) && ((a2.t0.M(p3.getMeasuredWidth(), p4, p6.width)) && (a2.t0.M(p3.getMeasuredHeight(), p5, p6.height)))) {
            return 0;
        } else {
            return 1;
        }
    }
}
