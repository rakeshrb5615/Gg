package y0;
public final class e {
    public static final a2.g0 v;
    public int a;
    public final int b;
    public int c;
    public float[] d;
    public float[] e;
    public float[] f;
    public float[] g;
    public int[] h;
    public int[] i;
    public int[] j;
    public int k;
    public android.view.VelocityTracker l;
    public final float m;
    public final float n;
    public final int o;
    public final android.widget.OverScroller p;
    public final w0.a q;
    public android.view.View r;
    public boolean s;
    public final androidx.coordinatorlayout.widget.CoordinatorLayout t;
    public final a2.l u;

    static e()
    {
        y0.e.v = new a2.g0(1);
        return;
    }

    public e(android.content.Context p3, androidx.coordinatorlayout.widget.CoordinatorLayout p4, w0.a p5)
    {
        this.c = -1;
        this.u = new a2.l(this, 9);
        if (p5 == null) {
            throw new IllegalArgumentException("Callback may not be null");
        } else {
            this.t = p4;
            this.q = p5;
            String v4_1 = android.view.ViewConfiguration.get(p3);
            this.o = ((int) ((p3.getResources().getDisplayMetrics().density * 1101004800) + 1056964608));
            this.b = v4_1.getScaledTouchSlop();
            this.m = ((float) v4_1.getScaledMaximumFlingVelocity());
            this.n = ((float) v4_1.getScaledMinimumFlingVelocity());
            this.p = new android.widget.OverScroller(p3, y0.e.v);
            return;
        }
    }

    public final void a()
    {
        this.c = -1;
        int v0_5 = this.d;
        if (v0_5 != 0) {
            java.util.Arrays.fill(v0_5, 0);
            java.util.Arrays.fill(this.e, 0);
            java.util.Arrays.fill(this.f, 0);
            java.util.Arrays.fill(this.g, 0);
            java.util.Arrays.fill(this.h, 0);
            java.util.Arrays.fill(this.i, 0);
            java.util.Arrays.fill(this.j, 0);
            this.k = 0;
        }
        int v0_6 = this.l;
        if (v0_6 != 0) {
            v0_6.recycle();
            this.l = 0;
        }
        return;
    }

    public final void b(android.view.View p3, int p4)
    {
        androidx.coordinatorlayout.widget.CoordinatorLayout v1 = this.t;
        if (p3.getParent() != v1) {
            String v4_3 = new StringBuilder("captureChildView: parameter must be a descendant of the ViewDragHelper\'s tracked parent view (");
            v4_3.append(v1);
            v4_3.append(")");
            throw new IllegalArgumentException(v4_3.toString());
        } else {
            this.r = p3;
            this.c = p4;
            this.q.f(p3, p4);
            this.n(1);
            return;
        }
    }

    public final boolean c(android.view.View p4, float p5, float p6)
    {
        if (p4 != 0) {
            float v4_10;
            int v1_2 = this.q;
            if (v1_2.d(p4) <= 0) {
                v4_10 = 0;
            } else {
                v4_10 = 1;
            }
            int v1_1;
            if (v1_2.e() <= 0) {
                v1_1 = 0;
            } else {
                v1_1 = 1;
            }
            if ((v4_10 == 0) || (v1_1 == 0)) {
                if (v4_10 == 0) {
                    if ((v1_1 == 0) || (Math.abs(p6) <= ((float) this.b))) {
                        return 0;
                    }
                } else {
                    if (Math.abs(p5) <= ((float) this.b)) {
                        return 0;
                    }
                }
            } else {
                if (((p6 * p6) + (p5 * p5)) <= ((float) (this.b * this.b))) {
                    return 0;
                }
            }
            return 1;
        }
        return 0;
    }

    public final void d(int p5)
    {
        int[] v0_0 = this.d;
        if (v0_0 != null) {
            int v1 = this.k;
            int v2_1 = (1 << p5);
            if ((v1 & v2_1) != 0) {
                v0_0[p5] = 0;
                this.e[p5] = 0;
                this.f[p5] = 0;
                this.g[p5] = 0;
                this.h[p5] = 0;
                this.i[p5] = 0;
                this.j[p5] = 0;
                this.k = ((~ v2_1) & v1);
            }
        }
        return;
    }

    public final int e(int p5, int p6, int p7)
    {
        if (p5 != 0) {
            int v5_6;
            int v0_2 = this.t.getWidth();
            float v1_0 = ((float) (v0_2 / 2));
            float v2_7 = ((((float) Math.sin(((double) ((Math.min(1065353216, (((float) Math.abs(p5)) / ((float) v0_2))) - 1056964608) * 1055999547)))) * v1_0) + v1_0);
            int v6_1 = Math.abs(p6);
            if (v6_1 <= 0) {
                v5_6 = ((int) (((((float) Math.abs(p5)) / ((float) p7)) + 1065353216) * 1132462080));
            } else {
                v5_6 = (Math.round((Math.abs((v2_7 / ((float) v6_1))) * 1148846080)) * 4);
            }
            return Math.min(v5_6, 600);
        } else {
            return 0;
        }
    }

    public final boolean f()
    {
        if (this.a == 2) {
            androidx.coordinatorlayout.widget.CoordinatorLayout v0_1 = this.p;
            int v3_0 = v0_1.computeScrollOffset();
            int v4_1 = v0_1.getCurrX();
            int v5 = v0_1.getCurrY();
            int v6_2 = (v4_1 - this.r.getLeft());
            android.view.View v7_2 = (v5 - this.r.getTop());
            if (v6_2 != 0) {
                this.r.offsetLeftAndRight(v6_2);
            }
            if (v7_2 != null) {
                this.r.offsetTopAndBottom(v7_2);
            }
            if ((v6_2 != 0) || (v7_2 != null)) {
                this.q.h(this.r, v4_1, v5);
            }
            if ((v3_0 != 0) && ((v4_1 == v0_1.getFinalX()) && (v5 == v0_1.getFinalY()))) {
                v0_1.abortAnimation();
                v3_0 = 0;
            }
            if (v3_0 == 0) {
                this.t.post(this.u);
            }
        }
        if (this.a != 2) {
            return 0;
        } else {
            return 1;
        }
    }

    public final android.view.View g(int p5, int p6)
    {
        androidx.coordinatorlayout.widget.CoordinatorLayout v0 = this.t;
        int v1_1 = (v0.getChildCount() - 1);
        while (v1_1 >= 0) {
            this.q.getClass();
            android.view.View v2_0 = v0.getChildAt(v1_1);
            if ((p5 < v2_0.getLeft()) || ((p5 >= v2_0.getRight()) || ((p6 < v2_0.getTop()) || (p6 >= v2_0.getBottom())))) {
                v1_1--;
            } else {
                return v2_0;
            }
        }
        return 0;
    }

    public final boolean h(int p11, int p12, int p13, int p14)
    {
        int v2 = this.r.getLeft();
        int v3 = this.r.getTop();
        int v4 = (p11 - v2);
        int v5 = (p12 - v3);
        android.widget.OverScroller v1 = this.p;
        if ((v4 != 0) || (v5 != 0)) {
            float v12_1 = this.r;
            float v0_2 = ((int) this.n);
            int v6_1 = ((int) this.m);
            int v7_0 = Math.abs(p13);
            if (v7_0 >= v0_2) {
                if (v7_0 > v6_1) {
                    if (p13 <= 0) {
                        p13 = (- v6_1);
                    } else {
                        p13 = v6_1;
                    }
                }
            } else {
                p13 = 0;
            }
            int v7_1 = Math.abs(p14);
            if (v7_1 >= v0_2) {
                if (v7_1 > v6_1) {
                    if (p14 <= 0) {
                        p14 = (- v6_1);
                    } else {
                        p14 = v6_1;
                    }
                }
            } else {
                p14 = 0;
            }
            int v11_2;
            int v6_3;
            int v11_1 = Math.abs(v4);
            float v0_4 = Math.abs(v5);
            int v6_2 = Math.abs(p13);
            int v7_2 = Math.abs(p14);
            int v8 = (v6_2 + v7_2);
            int v9 = (v11_1 + v0_4);
            if (p13 == 0) {
                v11_2 = ((float) v11_1);
                v6_3 = ((float) v9);
            } else {
                v11_2 = ((float) v6_2);
                v6_3 = ((float) v8);
            }
            float v0_5;
            int v6_4;
            if (p14 == 0) {
                v0_5 = ((float) v0_4);
                v6_4 = ((float) v9);
            } else {
                v0_5 = ((float) v7_2);
                v6_4 = ((float) v8);
            }
            int v6_5 = this.q;
            v1.startScroll(v2, v3, v4, v5, ((int) ((((float) this.e(v5, p14, v6_5.e())) * (v0_5 / v6_4)) + (((float) this.e(v4, p13, v6_5.d(v12_1))) * (v11_2 / v6_3)))));
            this.n(2);
            return 1;
        } else {
            v1.abortAnimation();
            this.n(0);
            return 0;
        }
    }

    public final boolean i(int p4)
    {
        if ((this.k & (1 << p4)) == 0) {
            String v0_4 = new StringBuilder("Ignoring pointerId=");
            v0_4.append(p4);
            v0_4.append(" because ACTION_DOWN was not received for this pointer before ACTION_MOVE. It likely happened because  ViewDragHelper did not receive all the events in the event stream.");
            android.util.Log.e("ViewDragHelper", v0_4.toString());
            return 0;
        } else {
            return 1;
        }
    }

    public final void j(android.view.MotionEvent p10)
    {
        android.view.View v0_0 = p10.getActionMasked();
        int v1_11 = p10.getActionIndex();
        if (v0_0 == null) {
            this.a();
        }
        if (this.l == null) {
            this.l = android.view.VelocityTracker.obtain();
        }
        this.l.addMovement(p10);
        int v2_8 = 0;
        if (v0_0 == null) {
            android.view.View v0_6 = p10.getX();
            int v1_4 = p10.getY();
            int v10_10 = p10.getPointerId(0);
            int v2_10 = this.g(((int) v0_6), ((int) v1_4));
            this.l(v0_6, v1_4, v10_10);
            this.q(v2_10, v10_10);
            return;
        } else {
            if (v0_0 == 1) {
                if (this.a == 1) {
                    this.k();
                }
                this.a();
                return;
            } else {
                android.view.View v5_6 = this.q;
                if (v0_0 == 2) {
                    if (this.a != 1) {
                        android.view.View v0_11 = p10.getPointerCount();
                        while (v2_8 < v0_11) {
                            int v1_12 = p10.getPointerId(v2_8);
                            if (this.i(v1_12)) {
                                boolean v4_14 = p10.getX(v2_8);
                                android.view.View v5_7 = p10.getY(v2_8);
                                android.view.View v6_8 = (v4_14 - this.d[v1_12]);
                                float v7_4 = (v5_7 - this.e[v1_12]);
                                Math.abs(v6_8);
                                Math.abs(v7_4);
                                float vtmp33 = Math.abs(v7_4);
                                float vtmp34 = Math.abs(v6_8);
                                float vtmp35 = Math.abs(v6_8);
                                float vtmp36 = Math.abs(v7_4);
                                float vtmp37 = Math.abs(v7_4);
                                float vtmp38 = Math.abs(v6_8);
                                if (this.a == 1) {
                                    break;
                                }
                                boolean v4_16 = this.g(((int) v4_14), ((int) v5_7));
                                if ((this.c(v4_16, v6_8, v7_4)) && (this.q(v4_16, v1_12))) {
                                    break;
                                }
                            }
                            v2_8++;
                        }
                        this.m(p10);
                        return;
                    } else {
                        if (this.i(this.c)) {
                            android.view.View v0_15 = p10.findPointerIndex(this.c);
                            int v3_0 = this.c;
                            int v1_1 = ((int) (p10.getX(v0_15) - this.f[v3_0]));
                            android.view.View v0_3 = ((int) (p10.getY(v0_15) - this.g[v3_0]));
                            int v2_7 = (this.r.getLeft() + v1_1);
                            int v3_3 = (this.r.getTop() + v0_3);
                            boolean v4_1 = this.r.getLeft();
                            android.view.View v6_1 = this.r.getTop();
                            if (v1_1 != 0) {
                                v2_7 = v5_6.b(this.r, v2_7);
                                this.r.offsetLeftAndRight((v2_7 - v4_1));
                            }
                            if (v0_3 != null) {
                                v3_3 = v5_6.c(this.r, v3_3);
                                this.r.offsetTopAndBottom((v3_3 - v6_1));
                            }
                            if ((v1_1 != 0) || (v0_3 != null)) {
                                v5_6.h(this.r, v2_7, v3_3);
                            }
                            this.m(p10);
                            return;
                        }
                    }
                } else {
                    if (v0_0 == 3) {
                        if (this.a == 1) {
                            this.s = 1;
                            v5_6.i(this.r, 0, 0);
                            this.s = 0;
                            if (this.a == 1) {
                                this.n(0);
                            }
                        }
                        this.a();
                        return;
                    } else {
                        if (v0_0 == 5) {
                            android.view.View v0_7 = p10.getPointerId(v1_11);
                            boolean v4_7 = p10.getX(v1_11);
                            int v10_4 = p10.getY(v1_11);
                            this.l(v4_7, v10_4, v0_7);
                            if (this.a != 0) {
                                int v1_3 = ((int) v4_7);
                                int v10_5 = ((int) v10_4);
                                boolean v4_8 = this.r;
                                if ((v4_8) && ((v1_3 >= v4_8.getLeft()) && ((v1_3 < v4_8.getRight()) && ((v10_5 >= v4_8.getTop()) && (v10_5 < v4_8.getBottom()))))) {
                                    v2_8 = 1;
                                }
                                if (v2_8 != 0) {
                                    this.q(this.r, v0_7);
                                    return;
                                }
                            } else {
                                this.q(this.g(((int) v4_7), ((int) v10_4)), v0_7);
                                return;
                            }
                        } else {
                            if (v0_0 == 6) {
                                android.view.View v0_8 = p10.getPointerId(v1_11);
                                if ((this.a == 1) && (v0_8 == this.c)) {
                                    int v1_10 = p10.getPointerCount();
                                    while (v2_8 < v1_10) {
                                        boolean v4_10 = p10.getPointerId(v2_8);
                                        if (v4_10 != this.c) {
                                            android.view.View v6_5 = this.r;
                                            if ((this.g(((int) p10.getX(v2_8)), ((int) p10.getY(v2_8))) == v6_5) && (this.q(v6_5, v4_10))) {
                                                int v10_11 = this.c;
                                                if (v10_11 == -1) {
                                                    this.k();
                                                }
                                                this.d(v0_8);
                                                return;
                                            }
                                        }
                                        v2_8++;
                                    }
                                    v10_11 = -1;
                                }
                                this.d(v0_8);
                                return;
                            }
                        }
                    }
                }
                return;
            }
        }
    }

    public final void k()
    {
        float v2_0 = this.m;
        this.l.computeCurrentVelocity(1000, v2_0);
        int v0_2 = this.l.getXVelocity(this.c);
        float v1_7 = Math.abs(v0_2);
        w0.a v3_0 = this.n;
        if (v1_7 >= v3_0) {
            if (v1_7 > v2_0) {
                if (v0_2 <= 0) {
                    v0_2 = (- v2_0);
                } else {
                    v0_2 = v2_0;
                }
            }
        } else {
            v0_2 = 0;
        }
        float v1_3 = this.l.getYVelocity(this.c);
        android.view.View v4_2 = Math.abs(v1_3);
        if (v4_2 >= v3_0) {
            if (v4_2 <= v2_0) {
                v2_0 = v1_3;
            } else {
                if (v1_3 <= 0) {
                    v2_0 = (- v2_0);
                }
            }
        } else {
            v2_0 = 0;
        }
        this.s = 1;
        this.q.i(this.r, v0_2, v2_0);
        this.s = 0;
        if (this.a == 1) {
            this.n(0);
        }
        return;
    }

    public final void l(float p11, float p12, int p13)
    {
        int[] v0_0 = this.d;
        int v1 = 0;
        if ((v0_0 == null) || (v0_0.length <= p13)) {
            androidx.coordinatorlayout.widget.CoordinatorLayout v2_4 = (p13 + 1);
            int v3_2 = new float[v2_4];
            int v4_1 = new float[v2_4];
            int v5_1 = new float[v2_4];
            float[] v6 = new float[v2_4];
            int[] v7 = new int[v2_4];
            int[] v8 = new int[v2_4];
            androidx.coordinatorlayout.widget.CoordinatorLayout v2_0 = new int[v2_4];
            if (v0_0 != null) {
                System.arraycopy(v0_0, 0, v3_2, 0, v0_0.length);
                int[] v0_1 = this.e;
                System.arraycopy(v0_1, 0, v4_1, 0, v0_1.length);
                int[] v0_2 = this.f;
                System.arraycopy(v0_2, 0, v5_1, 0, v0_2.length);
                int[] v0_3 = this.g;
                System.arraycopy(v0_3, 0, v6, 0, v0_3.length);
                int[] v0_4 = this.h;
                System.arraycopy(v0_4, 0, v7, 0, v0_4.length);
                int[] v0_5 = this.i;
                System.arraycopy(v0_5, 0, v8, 0, v0_5.length);
                int[] v0_6 = this.j;
                System.arraycopy(v0_6, 0, v2_0, 0, v0_6.length);
            }
            this.d = v3_2;
            this.e = v4_1;
            this.f = v5_1;
            this.g = v6;
            this.h = v7;
            this.i = v8;
            this.j = v2_0;
        }
        int[] v0_7 = this.d;
        this.f[p13] = p11;
        v0_7[p13] = p11;
        int[] v0_8 = this.e;
        this.g[p13] = p12;
        v0_8[p13] = p12;
        androidx.coordinatorlayout.widget.CoordinatorLayout v2_5 = this.t;
        int v4_0 = this.o;
        if (((int) p11) < (v2_5.getLeft() + v4_0)) {
            v1 = 1;
        }
        if (((int) p12) < (v2_5.getTop() + v4_0)) {
            v1 |= 4;
        }
        if (((int) p11) > (v2_5.getRight() - v4_0)) {
            v1 |= 2;
        }
        if (((int) p12) > (v2_5.getBottom() - v4_0)) {
            v1 |= 8;
        }
        this.h[p13] = v1;
        this.k = (this.k | (1 << p13));
        return;
    }

    public final void m(android.view.MotionEvent p7)
    {
        int v0 = p7.getPointerCount();
        int v1 = 0;
        while (v1 < v0) {
            int v2 = p7.getPointerId(v1);
            if (this.i(v2)) {
                float[] v3_0 = p7.getX(v1);
                float v4 = p7.getY(v1);
                this.f[v2] = v3_0;
                this.g[v2] = v4;
            }
            v1++;
        }
        return;
    }

    public final void n(int p3)
    {
        this.t.removeCallbacks(this.u);
        if (this.a != p3) {
            this.a = p3;
            this.q.g(p3);
            if (this.a == 0) {
                this.r = 0;
            }
        }
        return;
    }

    public final boolean o(int p4, int p5)
    {
        if (!this.s) {
            throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
        } else {
            return this.h(p4, p5, ((int) this.l.getXVelocity(this.c)), ((int) this.l.getYVelocity(this.c)));
        }
    }

    public final boolean p(android.view.MotionEvent p18)
    {
        int v2_4 = p18.getActionMasked();
        int v3_8 = p18.getActionIndex();
        if (v2_4 == 0) {
            this.a();
        }
        if (this.l == null) {
            this.l = android.view.VelocityTracker.obtain();
        }
        this.l.addMovement(p18);
        if (v2_4 == 0) {
            int v2_1 = p18.getX();
            int v3_4 = p18.getY();
            android.view.View v1_7 = p18.getPointerId(0);
            this.l(v2_1, v3_4, v1_7);
            int v2_3 = this.g(((int) v2_1), ((int) v3_4));
            if ((v2_3 == this.r) && (this.a == 2)) {
                this.q(v2_3, v1_7);
            }
        } else {
            if (v2_4 != 1) {
                if (v2_4 == 2) {
                    if ((this.d != null) && (this.e != null)) {
                        int v2_8 = p18.getPointerCount();
                        int v3_0 = 0;
                        while (v3_0 < v2_8) {
                            boolean v4_5 = p18.getPointerId(v3_0);
                            if (this.i(v4_5)) {
                                int v8_3;
                                android.view.View v7_4 = p18.getX(v3_0);
                                int v8_0 = p18.getY(v3_0);
                                int v9_4 = (v7_4 - this.d[v4_5]);
                                float v10_2 = (v8_0 - this.e[v4_5]);
                                android.view.View v7_6 = this.g(((int) v7_4), ((int) v8_0));
                                if ((v7_6 == null) || (!this.c(v7_6, v9_4, v10_2))) {
                                    v8_3 = 0;
                                } else {
                                    v8_3 = 1;
                                }
                                if (v8_3 != 0) {
                                    int v11_2 = v7_6.getLeft();
                                    int v13_0 = this.q;
                                    int v12_2 = v13_0.b(v7_6, (((int) v9_4) + v11_2));
                                    int v14 = v7_6.getTop();
                                    int v15_2 = v13_0.c(v7_6, (((int) v10_2) + v14));
                                    int v16 = v13_0.d(v7_6);
                                    int v13_1 = v13_0.e();
                                    if (((v16 == 0) || ((v16 > 0) && (v12_2 == v11_2))) && ((v13_1 == 0) || ((v13_1 > 0) && (v15_2 == v14)))) {
                                        break;
                                    }
                                }
                                Math.abs(v9_4);
                                Math.abs(v10_2);
                                float vtmp30 = Math.abs(v10_2);
                                float vtmp31 = Math.abs(v9_4);
                                float vtmp32 = Math.abs(v9_4);
                                float vtmp33 = Math.abs(v10_2);
                                float vtmp34 = Math.abs(v10_2);
                                float vtmp35 = Math.abs(v9_4);
                                if ((this.a == 1) || ((v8_3 != 0) && (this.q(v7_6, v4_5)))) {
                                    break;
                                }
                            }
                            v3_0++;
                        }
                        this.m(p18);
                        if (this.a != 1) {
                            return 0;
                        } else {
                            return 1;
                        }
                    }
                } else {
                    if (v2_4 != 3) {
                        if (v2_4 == 5) {
                            int v2_0 = p18.getPointerId(v3_8);
                            android.view.View v7_2 = p18.getX(v3_8);
                            android.view.View v1_1 = p18.getY(v3_8);
                            this.l(v7_2, v1_1, v2_0);
                            int v3_1 = this.a;
                            if ((v3_1 != 0) && (v3_1 == 2)) {
                                android.view.View v1_3 = this.g(((int) v7_2), ((int) v1_1));
                                if (v1_3 == this.r) {
                                    this.q(v1_3, v2_0);
                                }
                            }
                        } else {
                            if (v2_4 == 6) {
                                this.d(p18.getPointerId(v3_8));
                            }
                        }
                    }
                }
            }
            this.a();
        }
    }

    public final boolean q(android.view.View p3, int p4)
    {
        if ((p3 != this.r) || (this.c != p4)) {
            if ((p3 == 0) || (!this.q.j(p3, p4))) {
                return 0;
            } else {
                this.c = p4;
                this.b(p3, p4);
                return 1;
            }
        } else {
            return 1;
        }
    }
}
