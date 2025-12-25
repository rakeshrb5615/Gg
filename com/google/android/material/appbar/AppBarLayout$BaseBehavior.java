package com.google.android.material.appbar;
public class AppBarLayout$BaseBehavior extends e3.a {
    public boolean b;
    public int c;
    public int d;
    public int e;
    public android.view.VelocityTracker f;

    public AppBarLayout$BaseBehavior()
    {
        this.c = -1;
        this.e = -1;
        return;
    }

    public AppBarLayout$BaseBehavior(android.content.Context p1, android.util.AttributeSet p2)
    {
        this.c = -1;
        this.e = -1;
        return;
    }

    public final boolean j(androidx.coordinatorlayout.widget.CoordinatorLayout p4, android.view.View p5, android.view.MotionEvent p6)
    {
        if (this.e < 0) {
            this.e = android.view.ViewConfiguration.get(p4.getContext()).getScaledTouchSlop();
        }
        if ((p6.getActionMasked() != 2) || (!this.b)) {
            if (p6.getActionMasked() == 0) {
                this.c = -1;
                p6.getX();
                p6.getY();
                throw new ClassCastException();
            } else {
                int v4_11 = this.f;
                if (v4_11 != 0) {
                    v4_11.addMovement(p6);
                }
            }
        } else {
            int v4_3 = this.c;
            if (v4_3 != -1) {
                int v4_4 = p6.findPointerIndex(v4_3);
                if (v4_4 != -1) {
                    int v4_6 = ((int) p6.getY(v4_4));
                    if (Math.abs((v4_6 - this.d)) <= this.e) {
                    } else {
                        this.d = v4_6;
                        return 1;
                    }
                }
            }
        }
        return 0;
    }

    public final boolean k(androidx.coordinatorlayout.widget.CoordinatorLayout p1, android.view.View p2, int p3)
    {
        throw new ClassCastException();
    }

    public final boolean l(androidx.coordinatorlayout.widget.CoordinatorLayout p1, android.view.View p2, int p3, int p4, int p5)
    {
        throw new ClassCastException();
    }

    public final synthetic void n(androidx.coordinatorlayout.widget.CoordinatorLayout p1, android.view.View p2, android.view.View p3, int p4, int p5, int[] p6, int p7)
    {
        throw new ClassCastException();
    }

    public final void o(androidx.coordinatorlayout.widget.CoordinatorLayout p1, android.view.View p2, int p3, int p4, int p5, int[] p6)
    {
        throw new ClassCastException();
    }

    public final void q(android.view.View p1, android.os.Parcelable p2)
    {
        throw new ClassCastException();
    }

    public final android.os.Parcelable r(android.view.View p1)
    {
        throw new ClassCastException();
    }

    public final boolean s(android.view.View p1, int p2, int p3)
    {
        throw new ClassCastException();
    }

    public final void t(android.view.View p1, android.view.View p2, int p3)
    {
        throw new ClassCastException();
    }

    public final boolean u(android.view.View p6, android.view.MotionEvent p7)
    {
        int v0_0 = p7.getActionMasked();
        if (v0_0 == 1) {
            int v0_7 = this.f;
            if (v0_7 != 0) {
                v0_7.addMovement(p7);
                this.f.computeCurrentVelocity(1000);
                this.f.getYVelocity(this.c);
                p6.getClass();
                throw new ClassCastException();
            } else {
                this.b = 0;
                this.c = -1;
                int v6_6 = this.f;
                if (v6_6 == 0) {
                    int v6_14 = this.f;
                    if (v6_14 != 0) {
                        v6_14.addMovement(p7);
                    }
                    if (this.b) {
                        return 1;
                    }
                } else {
                    v6_6.recycle();
                    this.f = 0;
                }
            }
        } else {
            if (v0_0 == 2) {
                int v0_4 = p7.findPointerIndex(this.c);
                if (v0_4 != -1) {
                    this.d = ((int) p7.getY(v0_4));
                    p6.getClass();
                    throw new ClassCastException();
                }
            } else {
                if (v0_0 == 3) {
                } else {
                    if (v0_0 == 6) {
                        int v6_10;
                        if (p7.getActionIndex() != 0) {
                            v6_10 = 0;
                        } else {
                            v6_10 = 1;
                        }
                        this.c = p7.getPointerId(v6_10);
                        this.d = ((int) (p7.getY(v6_10) + 1056964608));
                    }
                }
            }
        }
        return 0;
    }
}
