package androidx.fragment.app;
public final class FragmentContainerView extends android.widget.FrameLayout {
    public final java.util.ArrayList a;
    public final java.util.ArrayList b;
    public android.view.View$OnApplyWindowInsetsListener c;
    public boolean d;

    public FragmentContainerView(android.content.Context p4, android.util.AttributeSet p5)
    {
        kotlin.jvm.internal.j.e(p4, "context");
        super(p4, p5, 0);
        super.a = new java.util.ArrayList();
        super.b = new java.util.ArrayList();
        super.d = 1;
        if (p5 != null) {
            String v5_1;
            String v1_1 = p5.getClassAttribute();
            UnsupportedOperationException v4_1 = p4.obtainStyledAttributes(p5, j1.a.b, 0, 0);
            if (v1_1 != null) {
                v5_1 = "class";
            } else {
                v1_1 = v4_1.getString(0);
                v5_1 = "android:name";
            }
            v4_1.recycle();
            if ((v1_1 != null) && (!super.isInEditMode())) {
                StringBuilder v0_3 = new StringBuilder("FragmentContainerView must be within a FragmentActivity to use ");
                v0_3.append(v5_1);
                v0_3.append("=\"");
                v0_3.append(v1_1);
                v0_3.append(34);
                throw new UnsupportedOperationException(v0_3.toString());
            }
        }
        return;
    }

    public FragmentContainerView(android.content.Context p8, android.util.AttributeSet p9, androidx.fragment.app.b1 p10)
    {
        kotlin.jvm.internal.j.e(p8, "context");
        kotlin.jvm.internal.j.e(p9, "attrs");
        super(p8, p9);
        super.a = new java.util.ArrayList();
        super.b = new java.util.ArrayList();
        super.d = 1;
        android.view.ViewParent v1_0 = p9.getClassAttribute();
        int v3 = 0;
        int v2_1 = p8.obtainStyledAttributes(p9, j1.a.b, 0, 0);
        if (v1_0 == null) {
            v1_0 = v2_1.getString(0);
        }
        String v4 = v2_1.getString(1);
        v2_1.recycle();
        int v2_2 = super.getId();
        String v5_0 = p10.A(v2_2);
        if ((v1_0 != null) && (v5_0 == null)) {
            if (v2_2 != -1) {
                String v5_2 = p10.E();
                p8.getClassLoader();
                android.view.ViewParent v1_1 = androidx.fragment.app.e0.instantiate(v5_2.a.t.b, v1_0, 0);
                kotlin.jvm.internal.j.d(v1_1, "fm.fragmentFactory.insta\u2026ontext.classLoader, name)");
                v1_1.mFragmentId = v2_2;
                v1_1.mContainerId = v2_2;
                v1_1.mTag = v4;
                v1_1.mFragmentManager = p10;
                v1_1.mHost = p10.t;
                v1_1.onInflate(p8, p9, 0);
                String v8_2 = new androidx.fragment.app.a(p10);
                v8_2.p = 1;
                v1_1.mContainer = super;
                v8_2.c(super.getId(), v1_1, v4, 1);
                if (v8_2.g) {
                    throw new IllegalStateException("This transaction is already being added to the back stack");
                } else {
                    v8_2.h = 0;
                    v8_2.q.y(v8_2, 1);
                }
            } else {
                String v8_7;
                if (v4 == null) {
                    v8_7 = "";
                } else {
                    v8_7 = " with tag ".concat(v4);
                }
                throw new IllegalStateException(v1.a.l("FragmentContainerView must have an android:id to add Fragment ", v1_0, v8_7));
            }
        }
        String v8_6 = p10.c.d();
        IllegalStateException v9_5 = v8_6.size();
        while (v3 < v9_5) {
            String v10_1 = v8_6.get(v3);
            v3++;
            String v10_2 = ((androidx.fragment.app.j1) v10_1);
            androidx.fragment.app.e0 v0_5 = v10_2.c;
            if (v0_5.mContainerId == super.getId()) {
                android.view.ViewParent v1_3 = v0_5.mView;
                if ((v1_3 != null) && (v1_3.getParent() == null)) {
                    v0_5.mContainer = super;
                    v10_2.b();
                }
            }
        }
        return;
    }

    public final void a(android.view.View p2)
    {
        if (this.b.contains(p2)) {
            this.a.add(p2);
        }
        return;
    }

    public final void addView(android.view.View p3, int p4, android.view.ViewGroup$LayoutParams p5)
    {
        int v0_3;
        kotlin.jvm.internal.j.e(p3, "child");
        int v0_2 = p3.getTag(2131362085);
        if (!(v0_2 instanceof androidx.fragment.app.e0)) {
            v0_3 = 0;
        } else {
            v0_3 = ((androidx.fragment.app.e0) v0_2);
        }
        if (v0_3 == 0) {
            IllegalStateException v4_2 = new StringBuilder("Views added to a FragmentContainerView must be associated with a Fragment. View ");
            v4_2.append(p3);
            v4_2.append(" is not associated with a Fragment.");
            throw new IllegalStateException(v4_2.toString().toString());
        } else {
            super.addView(p3, p4, p5);
            return;
        }
    }

    public final android.view.WindowInsets dispatchApplyWindowInsets(android.view.WindowInsets p5)
    {
        boolean v0_2;
        kotlin.jvm.internal.j.e(p5, "insets");
        q0.s1 v1_0 = q0.s1.g(0, p5);
        int v2_3 = this.c;
        if (v2_3 == 0) {
            boolean v0_4 = v1_0.f();
            if (v0_4) {
                int v2_0 = q0.g0.b(this, v0_4);
                if (!v2_0.equals(v0_4)) {
                    v1_0 = q0.s1.g(this, v2_0);
                }
            }
            v0_2 = v1_0;
        } else {
            q0.s1 v1_1 = v2_3.onApplyWindowInsets(this, p5);
            kotlin.jvm.internal.j.d(v1_1, "onApplyWindowInsetsListe\u2026lyWindowInsets(v, insets)");
            v0_2 = q0.s1.g(0, v1_1);
        }
        if (!v0_2.a.m()) {
            q0.s1 v1_4 = this.getChildCount();
            int v2_2 = 0;
            while (v2_2 < v1_4) {
                q0.q0.c(this.getChildAt(v2_2), v0_2);
                v2_2++;
            }
        }
        return p5;
    }

    public final void dispatchDraw(android.graphics.Canvas p7)
    {
        kotlin.jvm.internal.j.e(p7, "canvas");
        if (this.d) {
            java.util.ArrayList v0_2 = this.a;
            int v1 = v0_2.size();
            int v2 = 0;
            while (v2 < v1) {
                android.view.View v3_0 = v0_2.get(v2);
                v2++;
                super.drawChild(p7, ((android.view.View) v3_0), this.getDrawingTime());
            }
        }
        super.dispatchDraw(p7);
        return;
    }

    public final boolean drawChild(android.graphics.Canvas p3, android.view.View p4, long p5)
    {
        kotlin.jvm.internal.j.e(p3, "canvas");
        kotlin.jvm.internal.j.e(p4, "child");
        if (this.d) {
            boolean v0_4 = this.a;
            if ((!v0_4.isEmpty()) && (v0_4.contains(p4))) {
                return 0;
            }
        }
        return super.drawChild(p3, p4, p5);
    }

    public final void endViewTransition(android.view.View p2)
    {
        kotlin.jvm.internal.j.e(p2, "view");
        this.b.remove(p2);
        if (this.a.remove(p2)) {
            this.d = 1;
        }
        super.endViewTransition(p2);
        return;
    }

    public final androidx.fragment.app.e0 getFragment()
    {
        IllegalStateException v0_0 = this;
        while(true) {
            String v2_0;
            String v1_0 = 0;
            if (v0_0 == null) {
                break;
            }
            String v2_9 = v0_0.getTag(2131362085);
            if (!(v2_9 instanceof androidx.fragment.app.e0)) {
                v2_0 = 0;
            } else {
                v2_0 = ((androidx.fragment.app.e0) v2_9);
            }
            if (v2_0 == null) {
                IllegalStateException v0_1 = v0_0.getParent();
                if (!(v0_1 instanceof android.view.View)) {
                    v0_0 = 0;
                } else {
                    v0_0 = ((android.view.View) v0_1);
                }
            }
            IllegalStateException v0_6;
            if (v2_0 == null) {
                IllegalStateException v0_2 = this.getContext();
                while ((v0_2 instanceof android.content.ContextWrapper)) {
                    if (!(v0_2 instanceof androidx.fragment.app.j0)) {
                        v0_2 = ((android.content.ContextWrapper) v0_2).getBaseContext();
                    } else {
                        v1_0 = ((androidx.fragment.app.j0) v0_2);
                        break;
                    }
                }
                if (v1_0 == null) {
                    String v1_3 = new StringBuilder("View ");
                    v1_3.append(this);
                    v1_3.append(" is not within a subclass of FragmentActivity.");
                    throw new IllegalStateException(v1_3.toString());
                } else {
                    v0_6 = v1_0.getSupportFragmentManager();
                }
            } else {
                if (!v2_0.isAdded()) {
                    String v1_6 = new StringBuilder("The Fragment ");
                    v1_6.append(v2_0);
                    v1_6.append(" that owns View ");
                    v1_6.append(this);
                    v1_6.append(" has already been destroyed. Nested fragments should always use the child FragmentManager.");
                    throw new IllegalStateException(v1_6.toString());
                } else {
                    v0_6 = v2_0.getChildFragmentManager();
                }
            }
            return v0_6.A(this.getId());
        }
        v2_0 = 0;
    }

    public final android.view.WindowInsets onApplyWindowInsets(android.view.WindowInsets p2)
    {
        kotlin.jvm.internal.j.e(p2, "insets");
        return p2;
    }

    public final void removeAllViewsInLayout()
    {
        int v0_1 = (this.getChildCount() - 1);
        while (-1 < v0_1) {
            android.view.View v1_1 = this.getChildAt(v0_1);
            kotlin.jvm.internal.j.d(v1_1, "view");
            this.a(v1_1);
            v0_1--;
        }
        super.removeAllViewsInLayout();
        return;
    }

    public final void removeView(android.view.View p2)
    {
        kotlin.jvm.internal.j.e(p2, "view");
        this.a(p2);
        super.removeView(p2);
        return;
    }

    public final void removeViewAt(int p3)
    {
        android.view.View v0 = this.getChildAt(p3);
        kotlin.jvm.internal.j.d(v0, "view");
        this.a(v0);
        super.removeViewAt(p3);
        return;
    }

    public final void removeViewInLayout(android.view.View p2)
    {
        kotlin.jvm.internal.j.e(p2, "view");
        this.a(p2);
        super.removeViewInLayout(p2);
        return;
    }

    public final void removeViews(int p5, int p6)
    {
        int v0 = (p5 + p6);
        int v1 = p5;
        while (v1 < v0) {
            android.view.View v2 = this.getChildAt(v1);
            kotlin.jvm.internal.j.d(v2, "view");
            this.a(v2);
            v1++;
        }
        super.removeViews(p5, p6);
        return;
    }

    public final void removeViewsInLayout(int p5, int p6)
    {
        int v0 = (p5 + p6);
        int v1 = p5;
        while (v1 < v0) {
            android.view.View v2 = this.getChildAt(v1);
            kotlin.jvm.internal.j.d(v2, "view");
            this.a(v2);
            v1++;
        }
        super.removeViewsInLayout(p5, p6);
        return;
    }

    public final void setDrawDisappearingViewsLast(boolean p1)
    {
        this.d = p1;
        return;
    }

    public void setLayoutTransition(android.animation.LayoutTransition p2)
    {
        throw new UnsupportedOperationException("FragmentContainerView does not support Layout Transitions or animateLayoutChanges=\"true\".");
    }

    public void setOnApplyWindowInsetsListener(android.view.View$OnApplyWindowInsetsListener p2)
    {
        kotlin.jvm.internal.j.e(p2, "listener");
        this.c = p2;
        return;
    }

    public final void startViewTransition(android.view.View p2)
    {
        kotlin.jvm.internal.j.e(p2, "view");
        if (p2.getParent() == this) {
            this.b.add(p2);
        }
        super.startViewTransition(p2);
        return;
    }
}
