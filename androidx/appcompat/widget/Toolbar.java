package androidx.appcompat.widget;
public class Toolbar extends android.view.ViewGroup implements q0.l {
    public int A;
    public int B;
    public final int C;
    public CharSequence D;
    public CharSequence E;
    public android.content.res.ColorStateList F;
    public android.content.res.ColorStateList G;
    public boolean H;
    public boolean I;
    public final java.util.ArrayList J;
    public final java.util.ArrayList K;
    public final int[] L;
    public final q0.o M;
    public java.util.ArrayList N;
    public final n.y2 O;
    public n.f3 P;
    public n.k Q;
    public n.a3 R;
    public boolean S;
    public android.window.OnBackInvokedCallback T;
    public android.window.OnBackInvokedDispatcher U;
    public boolean V;
    public final a2.l W;
    public androidx.appcompat.widget.ActionMenuView a;
    public n.b1 b;
    public n.b1 c;
    public n.y d;
    public n.z e;
    public final android.graphics.drawable.Drawable f;
    public final CharSequence m;
    public n.y n;
    public android.view.View o;
    public android.content.Context p;
    public int q;
    public int r;
    public int s;
    public final int t;
    public final int u;
    public int v;
    public int w;
    public int x;
    public int y;
    public n.p2 z;

    public Toolbar(android.content.Context p2, android.util.AttributeSet p3)
    {
        this(p2, p3, 0);
        return;
    }

    public Toolbar(android.content.Context p9, android.util.AttributeSet p10, int p11)
    {
        super(p9, p10, 2130970000);
        super.C = 8388627;
        super.J = new java.util.ArrayList();
        super.K = new java.util.ArrayList();
        androidx.appcompat.widget.Toolbar v0_0 = new int[2];
        super.L = v0_0;
        super.M = new q0.o(new n.x2(super, 1));
        super.N = new java.util.ArrayList();
        super.O = new n.y2(super);
        super.W = new a2.l(super, 6);
        int v2_3 = g.a.x;
        b8.g v7 = b8.g.p(super.getContext(), p10, v2_3, 2130970000);
        q0.q0.m(super, p9, v2_3, p10, ((android.content.res.TypedArray) v7.c), 2130970000);
        int v9_3 = ((android.content.res.TypedArray) v7.c);
        super.r = v9_3.getResourceId(28, 0);
        super.s = v9_3.getResourceId(19, 0);
        super.C = v9_3.getInteger(0, 8388627);
        super.t = v9_3.getInteger(2, 48);
        android.view.MenuInflater v10_39 = v9_3.getDimensionPixelOffset(22, 0);
        if (v9_3.hasValue(27)) {
            v10_39 = v9_3.getDimensionPixelOffset(27, v10_39);
        }
        super.y = v10_39;
        super.x = v10_39;
        super.w = v10_39;
        super.v = v10_39;
        android.view.MenuInflater v10_41 = v9_3.getDimensionPixelOffset(25, -1);
        if (v10_41 >= null) {
            super.v = v10_41;
        }
        android.view.MenuInflater v10_43 = v9_3.getDimensionPixelOffset(24, -1);
        if (v10_43 >= null) {
            super.w = v10_43;
        }
        android.view.MenuInflater v10_45 = v9_3.getDimensionPixelOffset(26, -1);
        if (v10_45 >= null) {
            super.x = v10_45;
        }
        android.view.MenuInflater v10_47 = v9_3.getDimensionPixelOffset(23, -1);
        if (v10_47 >= null) {
            super.y = v10_47;
        }
        super.u = v9_3.getDimensionPixelSize(13, -1);
        android.view.MenuInflater v10_1 = v9_3.getDimensionPixelOffset(9, -2147483648);
        int v2_1 = v9_3.getDimensionPixelOffset(5, -2147483648);
        int v3_1 = v9_3.getDimensionPixelSize(7, 0);
        int v4_1 = v9_3.getDimensionPixelSize(8, 0);
        super.d();
        n.p2 v5_1 = super.z;
        v5_1.h = 0;
        if (v3_1 != -2147483648) {
            v5_1.e = v3_1;
            v5_1.a = v3_1;
        }
        if (v4_1 != -2147483648) {
            v5_1.f = v4_1;
            v5_1.b = v4_1;
        }
        if ((v10_1 != -2147483648) || (v2_1 != -2147483648)) {
            v5_1.a(v10_1, v2_1);
        }
        super.A = v9_3.getDimensionPixelOffset(10, -2147483648);
        super.B = v9_3.getDimensionPixelOffset(6, -2147483648);
        super.f = v7.i(4);
        super.m = v9_3.getText(3);
        android.view.MenuInflater v10_11 = v9_3.getText(21);
        if (!android.text.TextUtils.isEmpty(v10_11)) {
            super.setTitle(v10_11);
        }
        android.view.MenuInflater v10_13 = v9_3.getText(18);
        if (!android.text.TextUtils.isEmpty(v10_13)) {
            super.setSubtitle(v10_13);
        }
        super.p = super.getContext();
        super.setPopupTheme(v9_3.getResourceId(17, 0));
        android.view.MenuInflater v10_18 = v7.i(16);
        if (v10_18 != null) {
            super.setNavigationIcon(v10_18);
        }
        android.view.MenuInflater v10_20 = v9_3.getText(15);
        if (!android.text.TextUtils.isEmpty(v10_20)) {
            super.setNavigationContentDescription(v10_20);
        }
        android.view.MenuInflater v10_22 = v7.i(11);
        if (v10_22 != null) {
            super.setLogo(v10_22);
        }
        android.view.MenuInflater v10_24 = v9_3.getText(12);
        if (!android.text.TextUtils.isEmpty(v10_24)) {
            super.setLogoDescription(v10_24);
        }
        if (v9_3.hasValue(29)) {
            super.setTitleTextColor(v7.h(29));
        }
        if (v9_3.hasValue(20)) {
            super.setSubtitleTextColor(v7.h(20));
        }
        if (v9_3.hasValue(14)) {
            super.getMenuInflater().inflate(v9_3.getResourceId(14, 0), super.getMenu());
        }
        v7.r();
        return;
    }

    private java.util.ArrayList getCurrentMenuItems()
    {
        java.util.ArrayList v0_1 = new java.util.ArrayList();
        android.view.Menu v1 = this.getMenu();
        int v2 = 0;
        while (v2 < v1.size()) {
            v0_1.add(v1.getItem(v2));
            v2++;
        }
        return v0_1;
    }

    private android.view.MenuInflater getMenuInflater()
    {
        return new l.h(this.getContext());
    }

    public static n.b3 h()
    {
        n.b3 v0_1 = new n.b3(-2, -2);
        v0_1.b = 0;
        v0_1.a = 8388627;
        return v0_1;
    }

    public static n.b3 i(android.view.ViewGroup$LayoutParams p2)
    {
        n.b3 v0_0 = (p2 instanceof n.b3);
        if (v0_0 == null) {
            if (v0_0 == null) {
                if (!(p2 instanceof android.view.ViewGroup$MarginLayoutParams)) {
                    n.b3 v0_9 = new n.b3(p2);
                    v0_9.b = 0;
                    return v0_9;
                } else {
                    n.b3 v0_2 = new n.b3(((android.view.ViewGroup$MarginLayoutParams) p2));
                    v0_2.b = 0;
                    v0_2.leftMargin = ((android.view.ViewGroup$MarginLayoutParams) p2).leftMargin;
                    v0_2.topMargin = ((android.view.ViewGroup$MarginLayoutParams) p2).topMargin;
                    v0_2.rightMargin = ((android.view.ViewGroup$MarginLayoutParams) p2).rightMargin;
                    v0_2.bottomMargin = ((android.view.ViewGroup$MarginLayoutParams) p2).bottomMargin;
                    return v0_2;
                }
            } else {
                n.b3 v0_4 = new n.b3(((n.b3) p2));
                v0_4.b = 0;
                return v0_4;
            }
        } else {
            n.b3 v0_6 = new n.b3(((n.b3) p2));
            v0_6.b = 0;
            v0_6.b = ((n.b3) p2).b;
            return v0_6;
        }
    }

    public static int k(android.view.View p1)
    {
        int v1_2 = ((android.view.ViewGroup$MarginLayoutParams) p1.getLayoutParams());
        return (v1_2.getMarginEnd() + v1_2.getMarginStart());
    }

    public static int l(android.view.View p1)
    {
        int v1_2 = ((android.view.ViewGroup$MarginLayoutParams) p1.getLayoutParams());
        return (v1_2.topMargin + v1_2.bottomMargin);
    }

    public final void a(int p9, java.util.ArrayList p10)
    {
        android.view.View v0_3;
        int v1_0 = 0;
        if (this.getLayoutDirection() != 1) {
            v0_3 = 0;
        } else {
            v0_3 = 1;
        }
        int v3_1 = this.getChildCount();
        int v9_1 = android.view.Gravity.getAbsoluteGravity(p9, this.getLayoutDirection());
        p10.clear();
        if (v0_3 == null) {
            while (v1_0 < v3_1) {
                android.view.View v0_1 = this.getChildAt(v1_0);
                int v6_1 = ((n.b3) v0_1.getLayoutParams());
                if ((v6_1.b == 0) && (this.s(v0_1))) {
                    int v6_2 = v6_1.a;
                    int v7_2 = this.getLayoutDirection();
                    int v6_4 = (android.view.Gravity.getAbsoluteGravity(v6_2, v7_2) & 7);
                    if ((v6_4 != 1) && ((v6_4 != 3) && (v6_4 != 5))) {
                        if (v7_2 != 1) {
                            v6_4 = 3;
                        } else {
                            v6_4 = 5;
                        }
                    }
                    if (v6_4 == v9_1) {
                        p10.add(v0_1);
                    }
                }
                v1_0++;
            }
        } else {
            int v3_0 = (v3_1 - 1);
            while (v3_0 >= 0) {
                android.view.View v0_2 = this.getChildAt(v3_0);
                int v1_2 = ((n.b3) v0_2.getLayoutParams());
                if ((v1_2.b == 0) && (this.s(v0_2))) {
                    int v1_3 = v1_2.a;
                    int v6_7 = this.getLayoutDirection();
                    int v1_5 = (android.view.Gravity.getAbsoluteGravity(v1_3, v6_7) & 7);
                    if ((v1_5 != 1) && ((v1_5 != 3) && (v1_5 != 5))) {
                        if (v6_7 != 1) {
                            v1_5 = 3;
                        } else {
                            v1_5 = 5;
                        }
                    }
                    if (v1_5 == v9_1) {
                        p10.add(v0_2);
                    }
                }
                v3_0--;
            }
        }
        return;
    }

    public final void addMenuProvider(q0.p p3)
    {
        q0.o v0 = this.M;
        v0.b.add(p3);
        v0.a.run();
        return;
    }

    public final void b(android.view.View p3, boolean p4)
    {
        n.b3 v0_1;
        n.b3 v0_0 = p3.getLayoutParams();
        if (v0_0 != null) {
            if (this.checkLayoutParams(v0_0)) {
                v0_1 = ((n.b3) v0_0);
            } else {
                v0_1 = androidx.appcompat.widget.Toolbar.i(v0_0);
            }
        } else {
            v0_1 = androidx.appcompat.widget.Toolbar.h();
        }
        v0_1.b = 1;
        if ((p4 == null) || (this.o == null)) {
            this.addView(p3, v0_1);
            return;
        } else {
            p3.setLayoutParams(v0_1);
            this.K.add(p3);
            return;
        }
    }

    public final void c()
    {
        if (this.n == null) {
            n.y v0_5 = new n.y(this.getContext(), 0, 2130969999);
            this.n = v0_5;
            v0_5.setImageDrawable(this.f);
            this.n.setContentDescription(this.m);
            n.y v0_2 = androidx.appcompat.widget.Toolbar.h();
            v0_2.a = ((this.t & 112) | 8388611);
            v0_2.b = 2;
            this.n.setLayoutParams(v0_2);
            this.n.setOnClickListener(new com.google.android.material.datepicker.m(this, 4));
        }
        return;
    }

    public final boolean checkLayoutParams(android.view.ViewGroup$LayoutParams p2)
    {
        if ((!super.checkLayoutParams(p2)) || (!(p2 instanceof n.b3))) {
            return 0;
        } else {
            return 1;
        }
    }

    public final void d()
    {
        if (this.z == null) {
            n.p2 v0_2 = new n.p2();
            v0_2.a = 0;
            v0_2.b = 0;
            v0_2.c = -2147483648;
            v0_2.d = -2147483648;
            v0_2.e = 0;
            v0_2.f = 0;
            v0_2.g = 0;
            v0_2.h = 0;
            this.z = v0_2;
        }
        return;
    }

    public final void e()
    {
        this.f();
        m.m v0_0 = this.a;
        if (v0_0.v == null) {
            m.m v0_2 = ((m.m) v0_0.getMenu());
            if (this.R == null) {
                this.R = new n.a3(this);
            }
            this.a.setExpandedActionViewsExclusive(1);
            v0_2.b(this.R, this.p);
            this.t();
        }
        return;
    }

    public final void f()
    {
        if (this.a == null) {
            androidx.appcompat.widget.ActionMenuView v0_6 = new androidx.appcompat.widget.ActionMenuView(this.getContext(), 0);
            this.a = v0_6;
            v0_6.setPopupTheme(this.q);
            this.a.setOnMenuItemClickListener(this.O);
            androidx.appcompat.widget.ActionMenuView v0_2 = this.a;
            int v1_2 = new n.y2(this);
            v0_2.getClass();
            v0_2.A = v1_2;
            androidx.appcompat.widget.ActionMenuView v0_3 = androidx.appcompat.widget.Toolbar.h();
            v0_3.a = ((this.t & 112) | 8388613);
            this.a.setLayoutParams(v0_3);
            this.b(this.a, 0);
        }
        return;
    }

    public final void g()
    {
        if (this.d == null) {
            this.d = new n.y(this.getContext(), 0, 2130969999);
            n.b3 v0_1 = androidx.appcompat.widget.Toolbar.h();
            v0_1.a = ((this.t & 112) | 8388611);
            this.d.setLayoutParams(v0_1);
        }
        return;
    }

    public final bridge synthetic android.view.ViewGroup$LayoutParams generateDefaultLayoutParams()
    {
        return androidx.appcompat.widget.Toolbar.h();
    }

    public final android.view.ViewGroup$LayoutParams generateLayoutParams(android.util.AttributeSet p5)
    {
        int v1_1 = this.getContext();
        n.b3 v0_1 = new n.b3(v1_1, p5);
        v0_1.a = 0;
        android.content.res.TypedArray v5_1 = v1_1.obtainStyledAttributes(p5, g.a.b);
        v0_1.a = v5_1.getInt(0, 0);
        v5_1.recycle();
        v0_1.b = 0;
        return v0_1;
    }

    public final bridge synthetic android.view.ViewGroup$LayoutParams generateLayoutParams(android.view.ViewGroup$LayoutParams p1)
    {
        return androidx.appcompat.widget.Toolbar.i(p1);
    }

    public CharSequence getCollapseContentDescription()
    {
        int v0_0 = this.n;
        if (v0_0 == 0) {
            return 0;
        } else {
            return v0_0.getContentDescription();
        }
    }

    public android.graphics.drawable.Drawable getCollapseIcon()
    {
        int v0_0 = this.n;
        if (v0_0 == 0) {
            return 0;
        } else {
            return v0_0.getDrawable();
        }
    }

    public int getContentInsetEnd()
    {
        int v0_0 = this.z;
        if (v0_0 == 0) {
            return 0;
        } else {
            if (!v0_0.g) {
                return v0_0.b;
            } else {
                return v0_0.a;
            }
        }
    }

    public int getContentInsetEndWithActions()
    {
        int v0_0 = this.B;
        if (v0_0 == -2147483648) {
            return this.getContentInsetEnd();
        } else {
            return v0_0;
        }
    }

    public int getContentInsetLeft()
    {
        int v0_0 = this.z;
        if (v0_0 == 0) {
            return 0;
        } else {
            return v0_0.a;
        }
    }

    public int getContentInsetRight()
    {
        int v0_0 = this.z;
        if (v0_0 == 0) {
            return 0;
        } else {
            return v0_0.b;
        }
    }

    public int getContentInsetStart()
    {
        int v0_0 = this.z;
        if (v0_0 == 0) {
            return 0;
        } else {
            if (!v0_0.g) {
                return v0_0.a;
            } else {
                return v0_0.b;
            }
        }
    }

    public int getContentInsetStartWithNavigation()
    {
        int v0_0 = this.A;
        if (v0_0 == -2147483648) {
            return this.getContentInsetStart();
        } else {
            return v0_0;
        }
    }

    public int getCurrentContentInsetEnd()
    {
        int v0_0 = this.a;
        if (v0_0 != 0) {
            int v0_3 = v0_0.v;
            if ((v0_3 != 0) && (v0_3.hasVisibleItems())) {
                return Math.max(this.getContentInsetEnd(), Math.max(this.B, 0));
            }
        }
        return this.getContentInsetEnd();
    }

    public int getCurrentContentInsetLeft()
    {
        if (this.getLayoutDirection() != 1) {
            return this.getCurrentContentInsetStart();
        } else {
            return this.getCurrentContentInsetEnd();
        }
    }

    public int getCurrentContentInsetRight()
    {
        if (this.getLayoutDirection() != 1) {
            return this.getCurrentContentInsetEnd();
        } else {
            return this.getCurrentContentInsetStart();
        }
    }

    public int getCurrentContentInsetStart()
    {
        if (this.getNavigationIcon() == null) {
            return this.getContentInsetStart();
        } else {
            return Math.max(this.getContentInsetStart(), Math.max(this.A, 0));
        }
    }

    public android.graphics.drawable.Drawable getLogo()
    {
        int v0_0 = this.e;
        if (v0_0 == 0) {
            return 0;
        } else {
            return v0_0.getDrawable();
        }
    }

    public CharSequence getLogoDescription()
    {
        int v0_0 = this.e;
        if (v0_0 == 0) {
            return 0;
        } else {
            return v0_0.getContentDescription();
        }
    }

    public android.view.Menu getMenu()
    {
        this.e();
        return this.a.getMenu();
    }

    public android.view.View getNavButtonView()
    {
        return this.d;
    }

    public CharSequence getNavigationContentDescription()
    {
        int v0_0 = this.d;
        if (v0_0 == 0) {
            return 0;
        } else {
            return v0_0.getContentDescription();
        }
    }

    public android.graphics.drawable.Drawable getNavigationIcon()
    {
        int v0_0 = this.d;
        if (v0_0 == 0) {
            return 0;
        } else {
            return v0_0.getDrawable();
        }
    }

    public n.k getOuterActionMenuPresenter()
    {
        return this.Q;
    }

    public android.graphics.drawable.Drawable getOverflowIcon()
    {
        this.e();
        return this.a.getOverflowIcon();
    }

    public android.content.Context getPopupContext()
    {
        return this.p;
    }

    public int getPopupTheme()
    {
        return this.q;
    }

    public CharSequence getSubtitle()
    {
        return this.E;
    }

    public final android.widget.TextView getSubtitleTextView()
    {
        return this.c;
    }

    public CharSequence getTitle()
    {
        return this.D;
    }

    public int getTitleMarginBottom()
    {
        return this.y;
    }

    public int getTitleMarginEnd()
    {
        return this.w;
    }

    public int getTitleMarginStart()
    {
        return this.v;
    }

    public int getTitleMarginTop()
    {
        return this.x;
    }

    public final android.widget.TextView getTitleTextView()
    {
        return this.b;
    }

    public n.k1 getWrapper()
    {
        if (this.P == null) {
            android.content.Context v2_2;
            n.f3 v0_3 = new n.f3();
            v0_3.n = 0;
            v0_3.a = this;
            v0_3.h = this.getTitle();
            v0_3.i = this.getSubtitle();
            if (v0_3.h == null) {
                v2_2 = 0;
            } else {
                v2_2 = 1;
            }
            v0_3.g = v2_2;
            v0_3.f = this.getNavigationIcon();
            String v6 = 0;
            android.content.Context v2_7 = b8.g.p(this.getContext(), 0, g.a.a, 2130968584);
            android.content.res.TypedArray v4_2 = ((android.content.res.TypedArray) v2_7.c);
            v0_3.o = v2_7.i(15);
            android.content.Context v5_12 = v4_2.getText(27);
            if (!android.text.TextUtils.isEmpty(v5_12)) {
                v0_3.g = 1;
                v0_3.h = v5_12;
                if ((v0_3.b & 8) != 0) {
                    this.setTitle(v5_12);
                    if (v0_3.g) {
                        q0.q0.o(this.getRootView(), v5_12);
                    }
                }
            }
            int v3_18 = v4_2.getText(25);
            if (!android.text.TextUtils.isEmpty(v3_18)) {
                v0_3.i = v3_18;
                if ((v0_3.b & 8) != 0) {
                    this.setSubtitle(v3_18);
                }
            }
            int v3_20 = v2_7.i(20);
            if (v3_20 != 0) {
                v0_3.e = v3_20;
                v0_3.c();
            }
            int v3_22 = v2_7.i(17);
            if (v3_22 != 0) {
                v0_3.d = v3_22;
                v0_3.c();
            }
            if (v0_3.f == null) {
                int v3_24 = v0_3.o;
                if (v3_24 != 0) {
                    v0_3.f = v3_24;
                    if ((v0_3.b & 4) == 0) {
                        this.setNavigationIcon(0);
                    } else {
                        this.setNavigationIcon(v3_24);
                    }
                }
            }
            v0_3.a(v4_2.getInt(10, 0));
            int v3_28 = v4_2.getResourceId(9, 0);
            if (v3_28 != 0) {
                int v3_29 = android.view.LayoutInflater.from(this.getContext()).inflate(v3_28, this, 0);
                android.content.Context v5_20 = v0_3.c;
                if ((v5_20 != null) && ((v0_3.b & 16) != 0)) {
                    this.removeView(v5_20);
                }
                v0_3.c = v3_29;
                if ((v3_29 != 0) && ((v0_3.b & 16) != 0)) {
                    this.addView(v3_29);
                }
                v0_3.a((v0_3.b | 16));
            }
            int v3_3 = v4_2.getLayoutDimension(13, 0);
            if (v3_3 > 0) {
                android.content.Context v5_2 = this.getLayoutParams();
                v5_2.height = v3_3;
                this.setLayoutParams(v5_2);
            }
            int v3_5 = v4_2.getDimensionPixelOffset(7, -1);
            android.content.Context v5_4 = v4_2.getDimensionPixelOffset(3, -1);
            if ((v3_5 >= 0) || (v5_4 >= null)) {
                int v3_6 = Math.max(v3_5, 0);
                android.content.Context v5_5 = Math.max(v5_4, 0);
                this.d();
                this.z.a(v3_6, v5_5);
            }
            int v3_9 = v4_2.getResourceId(28, 0);
            if (v3_9 != 0) {
                android.content.Context v5_6 = this.getContext();
                this.r = v3_9;
                n.b1 v7_4 = this.b;
                if (v7_4 != null) {
                    v7_4.setTextAppearance(v5_6, v3_9);
                }
            }
            int v3_11 = v4_2.getResourceId(26, 0);
            if (v3_11 != 0) {
                android.content.Context v5_7 = this.getContext();
                this.s = v3_11;
                n.b1 v7_5 = this.c;
                if (v7_5 != null) {
                    v7_5.setTextAppearance(v5_7, v3_11);
                }
            }
            int v1_0 = v4_2.getResourceId(22, 0);
            if (v1_0 != 0) {
                this.setPopupTheme(v1_0);
            }
            v2_7.r();
            if (2131951626 != v0_3.n) {
                v0_3.n = 2131951626;
                if (android.text.TextUtils.isEmpty(this.getNavigationContentDescription())) {
                    int v1_4 = v0_3.n;
                    if (v1_4 != 0) {
                        v6 = this.getContext().getString(v1_4);
                    }
                    v0_3.j = v6;
                    v0_3.b();
                }
            }
            v0_3.j = this.getNavigationContentDescription();
            this.setNavigationOnClickListener(new n.e3(v0_3));
            this.P = v0_3;
        }
        return this.P;
    }

    public final int j(android.view.View p7, int p8)
    {
        int v8_3;
        n.b3 v0_1 = ((n.b3) p7.getLayoutParams());
        int v7_4 = p7.getMeasuredHeight();
        if (p8 <= 0) {
            v8_3 = 0;
        } else {
            v8_3 = ((v7_4 - p8) / 2);
        }
        int v2_1 = (v0_1.a & 112);
        if ((v2_1 != 16) && ((v2_1 != 48) && (v2_1 != 80))) {
            v2_1 = (this.C & 112);
        }
        if (v2_1 == 48) {
            return (this.getPaddingTop() - v8_3);
        } else {
            if (v2_1 == 80) {
                return ((((this.getHeight() - this.getPaddingBottom()) - v7_4) - v0_1.bottomMargin) - v8_3);
            } else {
                int v8_1 = this.getPaddingTop();
                int v2_4 = this.getPaddingBottom();
                int v3_1 = this.getHeight();
                int v4_4 = ((((v3_1 - v8_1) - v2_4) - v7_4) / 2);
                int v5_1 = v0_1.topMargin;
                if (v4_4 >= v5_1) {
                    int v3_5 = ((((v3_1 - v2_4) - v7_4) - v4_4) - v8_1);
                    int v7_5 = v0_1.bottomMargin;
                    if (v3_5 < v7_5) {
                        v4_4 = Math.max(0, (v4_4 - (v7_5 - v3_5)));
                    }
                } else {
                    v4_4 = v5_1;
                }
                return (v8_1 + v4_4);
            }
        }
    }

    public final void m()
    {
        java.util.ArrayList v0_0 = this.N;
        java.util.ArrayList v1_0 = v0_0.size();
        android.view.MenuInflater v2_1 = 0;
        while (v2_1 < v1_0) {
            java.util.Iterator v3_3 = v0_0.get(v2_1);
            v2_1++;
            this.getMenu().removeItem(((android.view.MenuItem) v3_3).getItemId());
        }
        java.util.ArrayList v0_2 = this.getMenu();
        java.util.ArrayList v1_1 = this.getCurrentMenuItems();
        android.view.MenuInflater v2_0 = this.getMenuInflater();
        java.util.Iterator v3_2 = this.M.b.iterator();
        while (v3_2.hasNext()) {
            ((androidx.fragment.app.u0) ((q0.p) v3_2.next())).a.j(v0_2, v2_0);
        }
        java.util.ArrayList v0_1 = this.getCurrentMenuItems();
        v0_1.removeAll(v1_1);
        this.N = v0_1;
        return;
    }

    public final boolean n(android.view.View p2)
    {
        if ((p2.getParent() != this) && (!this.K.contains(p2))) {
            return 0;
        } else {
            return 1;
        }
    }

    public final int o(android.view.View p5, int p6, int p7, int[] p8)
    {
        n.b3 v0_1 = ((n.b3) p5.getLayoutParams());
        int v1_3 = (v0_1.leftMargin - p8[0]);
        int v3_2 = (Math.max(0, v1_3) + p6);
        p8[0] = Math.max(0, (- v1_3));
        int v6_3 = this.j(p5, p7);
        int v7_1 = p5.getMeasuredWidth();
        p5.layout(v3_2, v6_3, (v3_2 + v7_1), (p5.getMeasuredHeight() + v6_3));
        return ((v7_1 + v0_1.rightMargin) + v3_2);
    }

    public void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        this.t();
        return;
    }

    public final void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        this.removeCallbacks(this.W);
        this.t();
        return;
    }

    public final boolean onHoverEvent(android.view.MotionEvent p6)
    {
        int v0 = p6.getActionMasked();
        if (v0 == 9) {
            this.I = 0;
        }
        if (!this.I) {
            int v6_1 = super.onHoverEvent(p6);
            if ((v0 == 9) && (v6_1 == 0)) {
                this.I = 1;
            }
        }
        if ((v0 != 10) && (v0 != 3)) {
            return 1;
        } else {
            this.I = 0;
            return 1;
        }
    }

    public void onLayout(boolean p20, int p21, int p22, int p23, int p24)
    {
        int v1_70;
        if (this.getLayoutDirection() != 1) {
            v1_70 = 0;
        } else {
            v1_70 = 1;
        }
        int v12_1;
        int v4_5 = this.getWidth();
        int v5_0 = this.getHeight();
        int v6 = this.getPaddingLeft();
        int v7 = this.getPaddingRight();
        int v8_0 = this.getPaddingTop();
        n.b1 v9_0 = this.getPaddingBottom();
        int v10_1 = (v4_5 - v7);
        int[] v11 = this.L;
        v11[1] = 0;
        v11[0] = 0;
        int v12_0 = this.getMinimumHeight();
        if (v12_0 < 0) {
            v12_1 = 0;
        } else {
            v12_1 = Math.min(v12_0, (p24 - p22));
        }
        int v14_7;
        int v13_9;
        if (!this.s(this.d)) {
            v13_9 = v6;
            v14_7 = v10_1;
        } else {
            if (v1_70 == 0) {
                v13_9 = this.o(this.d, v6, v12_1, v11);
            } else {
                v14_7 = this.p(this.d, v10_1, v12_1, v11);
                v13_9 = v6;
            }
        }
        if (this.s(this.n)) {
            if (v1_70 == 0) {
                v13_9 = this.o(this.n, v13_9, v12_1, v11);
            } else {
                v14_7 = this.p(this.n, v14_7, v12_1, v11);
            }
        }
        if (this.s(this.a)) {
            if (v1_70 == 0) {
                v14_7 = this.p(this.a, v14_7, v12_1, v11);
            } else {
                v13_9 = this.o(this.a, v13_9, v12_1, v11);
            }
        }
        int v15_19 = this.getCurrentContentInsetLeft();
        int v16_2 = this.getCurrentContentInsetRight();
        v11[0] = Math.max(0, (v15_19 - v13_9));
        v11[1] = Math.max(0, (v16_2 - (v10_1 - v14_7)));
        int v3_0 = Math.max(v13_9, v15_19);
        int v10_0 = Math.min(v14_7, (v10_1 - v16_2));
        if (this.s(this.o)) {
            if (v1_70 == 0) {
                v3_0 = this.o(this.o, v3_0, v12_1, v11);
            } else {
                v10_0 = this.p(this.o, v10_0, v12_1, v11);
            }
        }
        if (this.s(this.e)) {
            if (v1_70 == 0) {
                v3_0 = this.o(this.e, v3_0, v12_1, v11);
            } else {
                v10_0 = this.p(this.e, v10_0, v12_1, v11);
            }
        }
        int v1_0;
        int v13_4 = this.s(this.b);
        int v14_1 = this.s(this.c);
        if (v13_4 == 0) {
            p23 = v1_70;
            v1_0 = 0;
        } else {
            int v15_2 = ((n.b3) this.b.getLayoutParams());
            p23 = v1_70;
            v1_0 = ((this.b.getMeasuredHeight() + v15_2.topMargin) + v15_2.bottomMargin);
        }
        if (v14_1 != 0) {
            int v2_4 = ((n.b3) this.c.getLayoutParams());
            v1_0 = (((this.c.getMeasuredHeight() + v2_4.topMargin) + v2_4.bottomMargin) + v1_0);
        }
        if ((v13_4 != 0) || (v14_1 != 0)) {
            int v2_6;
            if (v13_4 == 0) {
                v2_6 = this.c;
            } else {
                v2_6 = this.b;
            }
            int v15_4;
            if (v14_1 == 0) {
                v15_4 = this.b;
            } else {
                v15_4 = this.c;
            }
            int v24_1;
            int v2_8 = ((n.b3) v2_6.getLayoutParams());
            int v15_6 = ((n.b3) v15_4.getLayoutParams());
            int v22_2 = v1_0;
            if (((v13_4 == 0) || (this.b.getMeasuredWidth() <= 0)) && ((v14_1 == 0) || (this.c.getMeasuredWidth() <= 0))) {
                v24_1 = 0;
            } else {
                v24_1 = 1;
            }
            int v8_1;
            int v1_13 = (this.C & 112);
            int v16_0 = v3_0;
            if (v1_13 == 48) {
                v8_1 = ((this.getPaddingTop() + v2_8.topMargin) + this.x);
            } else {
                if (v1_13 == 80) {
                    v8_1 = ((((v5_0 - v9_0) - v15_6.bottomMargin) - this.y) - v22_2);
                } else {
                    int v1_21 = ((((v5_0 - v8_0) - v9_0) - v22_2) / 2);
                    int v3_5 = (v2_8.topMargin + this.x);
                    if (v1_21 >= v3_5) {
                        int v5_7 = ((((v5_0 - v9_0) - v22_2) - v1_21) - v8_0);
                        int v3_6 = this.y;
                        if (v5_7 < (v2_8.bottomMargin + v3_6)) {
                            v1_21 = Math.max(0, (v1_21 - ((v15_6.bottomMargin + v3_6) - v5_7)));
                        }
                    } else {
                        v1_21 = v3_5;
                    }
                    v8_1 = (v8_0 + v1_21);
                }
            }
            if (p23 == 0) {
                int v1_24;
                if (v24_1 == 0) {
                    v1_24 = 0;
                } else {
                    v1_24 = this.v;
                }
                int v2_18;
                int v1_25 = (v1_24 - v11[0]);
                v3_0 = (Math.max(0, v1_25) + v16_0);
                v11[0] = Math.max(0, (- v1_25));
                if (v13_4 == 0) {
                    v2_18 = v3_0;
                } else {
                    int v1_30 = ((n.b3) this.b.getLayoutParams());
                    int v2_21 = (this.b.getMeasuredWidth() + v3_0);
                    int v5_10 = (this.b.getMeasuredHeight() + v8_1);
                    this.b.layout(v3_0, v8_1, v2_21, v5_10);
                    v2_18 = (v2_21 + this.w);
                    v8_1 = (v5_10 + v1_30.bottomMargin);
                }
                int v1_32;
                if (v14_1 == 0) {
                    v1_32 = v3_0;
                } else {
                    int v8_3 = (v8_1 + ((n.b3) this.c.getLayoutParams()).topMargin);
                    int v1_39 = (this.c.getMeasuredWidth() + v3_0);
                    this.c.layout(v3_0, v8_3, v1_39, (this.c.getMeasuredHeight() + v8_3));
                    v1_32 = (v1_39 + this.w);
                }
                if (v24_1 != 0) {
                    v3_0 = Math.max(v2_18, v1_32);
                }
            } else {
                int v1_40;
                if (v24_1 == 0) {
                    v1_40 = 0;
                } else {
                    v1_40 = this.v;
                }
                int v2_24;
                int v1_41 = (v1_40 - v11[1]);
                v10_0 -= Math.max(0, v1_41);
                v11[1] = Math.max(0, (- v1_41));
                if (v13_4 == 0) {
                    v2_24 = v10_0;
                } else {
                    int v1_46 = ((n.b3) this.b.getLayoutParams());
                    int v2_27 = (v10_0 - this.b.getMeasuredWidth());
                    int v3_12 = (this.b.getMeasuredHeight() + v8_1);
                    this.b.layout(v2_27, v8_1, v10_0, v3_12);
                    v2_24 = (v2_27 - this.w);
                    v8_1 = (v3_12 + v1_46.bottomMargin);
                }
                int v1_48;
                if (v14_1 == 0) {
                    v1_48 = v10_0;
                } else {
                    int v8_4 = (v8_1 + ((n.b3) this.c.getLayoutParams()).topMargin);
                    this.c.layout((v10_0 - this.c.getMeasuredWidth()), v8_4, v10_0, (this.c.getMeasuredHeight() + v8_4));
                    v1_48 = (v10_0 - this.w);
                }
                if (v24_1 != 0) {
                    v10_0 = Math.min(v2_24, v1_48);
                }
                v3_0 = v16_0;
            }
        }
        int v2_29 = this.J;
        this.a(3, v2_29);
        int v1_59 = v2_29.size();
        int v5_18 = v3_0;
        int v3_16 = 0;
        while (v3_16 < v1_59) {
            v5_18 = this.o(((android.view.View) v2_29.get(v3_16)), v5_18, v12_1, v11);
            v3_16++;
        }
        this.a(5, v2_29);
        int v1_61 = v2_29.size();
        int v3_17 = 0;
        while (v3_17 < v1_61) {
            v10_0 = this.p(((android.view.View) v2_29.get(v3_17)), v10_0, v12_1, v11);
            v3_17++;
        }
        this.a(1, v2_29);
        int v8_5 = v11[0];
        int v1_63 = v11[1];
        int v3_19 = v2_29.size();
        int v13_8 = v8_5;
        int v8_6 = 0;
        n.b1 v9_3 = 0;
        while (v8_6 < v3_19) {
            int v14_3 = ((android.view.View) v2_29.get(v8_6));
            int v15_9 = ((n.b3) v14_3.getLayoutParams());
            int v1_67 = (v15_9.leftMargin - v13_8);
            int v13_12 = (v15_9.rightMargin - v1_63);
            int v16_1 = Math.max(0, v1_67);
            int v17_1 = Math.max(0, v13_12);
            int v1_69 = Math.max(0, (- v1_67));
            int v13_14 = Math.max(0, (- v13_12));
            v9_3 += ((v14_3.getMeasuredWidth() + v16_1) + v17_1);
            v8_6++;
            v13_8 = v1_69;
            v1_63 = v13_14;
        }
        int v15_7 = 0;
        int v4_4 = (((((v4_5 - v6) - v7) / 2) + v6) - (v9_3 / 2));
        n.b1 v9_4 = (v9_3 + v4_4);
        if (v4_4 >= v5_18) {
            if (v9_4 <= v10_0) {
                v5_18 = v4_4;
            } else {
                v5_18 = (v4_4 - (v9_4 - v10_0));
            }
        }
        int v1_65 = v2_29.size();
        while (v15_7 < v1_65) {
            v5_18 = this.o(((android.view.View) v2_29.get(v15_7)), v5_18, v12_1, v11);
            v15_7++;
        }
        v2_29.clear();
        return;
    }

    public final void onMeasure(int p15, int p16)
    {
        int v8_2;
        int v6_2;
        int v7 = 0;
        if (this.getLayoutDirection() != 1) {
            v8_2 = 1;
            v6_2 = 0;
        } else {
            v6_2 = 1;
            v8_2 = 0;
        }
        int v9;
        int v2_7;
        int v10_0;
        if (!this.s(this.d)) {
            v2_7 = 0;
            v9 = 0;
            v10_0 = 0;
        } else {
            this.r(this.d, p15, 0, p16, this.u);
            v2_7 = (androidx.appcompat.widget.Toolbar.k(this.d) + this.d.getMeasuredWidth());
            v9 = Math.max(0, (androidx.appcompat.widget.Toolbar.l(this.d) + this.d.getMeasuredHeight()));
            v10_0 = android.view.View.combineMeasuredStates(0, this.d.getMeasuredState());
        }
        if (this.s(this.n)) {
            this.r(this.n, p15, 0, p16, this.u);
            v2_7 = (androidx.appcompat.widget.Toolbar.k(this.n) + this.n.getMeasuredWidth());
            v9 = Math.max(v9, (androidx.appcompat.widget.Toolbar.l(this.n) + this.n.getMeasuredHeight()));
            v10_0 = android.view.View.combineMeasuredStates(v10_0, this.n.getMeasuredState());
        }
        int v2_2;
        int v1_68 = this.getCurrentContentInsetStart();
        int v3_17 = Math.max(v1_68, v2_7);
        int v6_3 = this.L;
        v6_2[int v2_43] = Math.max(0, (v1_68 - v2_7));
        if (!this.s(this.a)) {
            v2_2 = 0;
        } else {
            this.r(this.a, p15, v3_17, p16, this.u);
            v2_2 = (androidx.appcompat.widget.Toolbar.k(this.a) + this.a.getMeasuredWidth());
            v9 = Math.max(v9, (androidx.appcompat.widget.Toolbar.l(this.a) + this.a.getMeasuredHeight()));
            v10_0 = android.view.View.combineMeasuredStates(v10_0, this.a.getMeasuredState());
        }
        int v1_7 = this.getCurrentContentInsetEnd();
        int v3_0 = (v3_17 + Math.max(v1_7, v2_2));
        v6_3[v8_2] = Math.max(0, (v1_7 - v2_2));
        if (this.s(this.o)) {
            v3_0 += this.q(this.o, p15, v3_0, p16, 0, v6_3);
            v9 = Math.max(v9, (androidx.appcompat.widget.Toolbar.l(this.o) + this.o.getMeasuredHeight()));
            v10_0 = android.view.View.combineMeasuredStates(v10_0, this.o.getMeasuredState());
        }
        if (this.s(this.e)) {
            v3_0 += this.q(this.e, p15, v3_0, p16, 0, v6_3);
            v9 = Math.max(v9, (androidx.appcompat.widget.Toolbar.l(this.e) + this.e.getMeasuredHeight()));
            v10_0 = android.view.View.combineMeasuredStates(v10_0, this.e.getMeasuredState());
        }
        int v8_0 = this.getChildCount();
        int v11_0 = 0;
        while (v11_0 < v8_0) {
            int v1_53 = this.getChildAt(v11_0);
            if ((((n.b3) v1_53.getLayoutParams()).b == 0) && (this.s(v1_53))) {
                v3_0 += this.q(v1_53, p15, v3_0, p16, 0, v6_3);
                v10_0 = android.view.View.combineMeasuredStates(v10_0, v1_53.getMeasuredState());
                v9 = Math.max(v9, (androidx.appcompat.widget.Toolbar.l(v1_53) + v1_53.getMeasuredHeight()));
            } else {
            }
            v11_0++;
        }
        int v10_1;
        int v13;
        int v11_1;
        int v12_0 = v3_0;
        int v5_2 = (this.x + this.y);
        int v8_1 = (this.v + this.w);
        if (!this.s(this.b)) {
            v11_1 = 0;
            v13 = v10_0;
            v10_1 = 0;
        } else {
            this.q(this.b, p15, (v12_0 + v8_1), p16, v5_2, v6_3);
            v11_1 = (androidx.appcompat.widget.Toolbar.l(this.b) + this.b.getMeasuredHeight());
            v13 = android.view.View.combineMeasuredStates(v10_0, this.b.getMeasuredState());
            v10_1 = (androidx.appcompat.widget.Toolbar.k(this.b) + this.b.getMeasuredWidth());
        }
        if (this.s(this.c)) {
            v10_1 = Math.max(v10_1, this.q(this.c, p15, (v12_0 + v8_1), p16, (v5_2 + v11_1), v6_3));
            v11_1 += (androidx.appcompat.widget.Toolbar.l(this.c) + this.c.getMeasuredHeight());
            v13 = android.view.View.combineMeasuredStates(v13, this.c.getMeasuredState());
        }
        int v3_7 = (v12_0 + v10_1);
        int v1_48 = Math.max(v9, v11_1);
        int v4_11 = ((this.getPaddingRight() + this.getPaddingLeft()) + v3_7);
        int v3_10 = ((this.getPaddingBottom() + this.getPaddingTop()) + v1_48);
        int v1_52 = android.view.View.resolveSizeAndState(Math.max(v4_11, this.getSuggestedMinimumWidth()), p15, (-16777216 & v13));
        int v2_30 = android.view.View.resolveSizeAndState(Math.max(v3_10, this.getSuggestedMinimumHeight()), p16, (v13 << 16));
        if (this.S) {
            int v3_13 = this.getChildCount();
            int v4_13 = 0;
            while (v4_13 < v3_13) {
                int v5_5 = this.getChildAt(v4_13);
                if ((!this.s(v5_5)) || ((v5_5.getMeasuredWidth() <= 0) || (v5_5.getMeasuredHeight() <= 0))) {
                    v4_13++;
                } else {
                    v7 = v2_30;
                    break;
                }
            }
        }
        this.setMeasuredDimension(v1_52, v7);
        return;
    }

    public final void onRestoreInstanceState(android.os.Parcelable p4)
    {
        if ((p4 instanceof n.d3)) {
            android.view.MenuItem v0_4;
            super.onRestoreInstanceState(((n.d3) p4).a);
            android.view.MenuItem v0_3 = this.a;
            if (v0_3 == null) {
                v0_4 = 0;
            } else {
                v0_4 = v0_3.v;
            }
            int v1 = ((n.d3) p4).c;
            if ((v1 != 0) && ((this.R != null) && (v0_4 != null))) {
                android.view.MenuItem v0_1 = v0_4.findItem(v1);
                if (v0_1 != null) {
                    v0_1.expandActionView();
                }
            }
            if (((n.d3) p4).d) {
                a2.l v4_3 = this.W;
                this.removeCallbacks(v4_3);
                this.post(v4_3);
            }
            return;
        } else {
            super.onRestoreInstanceState(p4);
            return;
        }
    }

    public final void onRtlPropertiesChanged(int p3)
    {
        super.onRtlPropertiesChanged(p3);
        this.d();
        n.p2 v0 = this.z;
        int v1_3 = 1;
        if (p3 != 1) {
            v1_3 = 0;
        }
        if (v1_3 != v0.g) {
            v0.g = v1_3;
            if (!v0.h) {
                v0.a = v0.e;
                v0.b = v0.f;
                return;
            } else {
                if (v1_3 == 0) {
                    int v1_0 = v0.c;
                    if (v1_0 == -2147483648) {
                        v1_0 = v0.e;
                    }
                    v0.a = v1_0;
                    int v1_1 = v0.d;
                    if (v1_1 == -2147483648) {
                        v1_1 = v0.f;
                    }
                    v0.b = v1_1;
                    return;
                } else {
                    int v1_2 = v0.d;
                    if (v1_2 == -2147483648) {
                        v1_2 = v0.e;
                    }
                    v0.a = v1_2;
                    int v1_4 = v0.c;
                    if (v1_4 == -2147483648) {
                        v1_4 = v0.f;
                    }
                    v0.b = v1_4;
                    return;
                }
            }
        } else {
            return;
        }
    }

    public final android.os.Parcelable onSaveInstanceState()
    {
        n.d3 v0_1 = new n.d3(super.onSaveInstanceState());
        int v1_5 = this.R;
        if (v1_5 != 0) {
            int v1_6 = v1_5.b;
            if (v1_6 != 0) {
                v0_1.c = v1_6.a;
            }
        }
        int v1_3;
        int v1_0 = this.a;
        if (v1_0 == 0) {
            v1_3 = 0;
        } else {
            int v1_1 = v1_0.z;
            if ((v1_1 == 0) || (!v1_1.f())) {
            } else {
                v1_3 = 1;
            }
        }
        v0_1.d = v1_3;
        return v0_1;
    }

    public final boolean onTouchEvent(android.view.MotionEvent p5)
    {
        int v0 = p5.getActionMasked();
        if (v0 == 0) {
            this.H = 0;
        }
        if (!this.H) {
            int v5_2 = super.onTouchEvent(p5);
            if ((v0 == 0) && (v5_2 == 0)) {
                this.H = 1;
            }
        }
        if ((v0 != 1) && (v0 != 3)) {
            return 1;
        } else {
            this.H = 0;
            return 1;
        }
    }

    public final int p(android.view.View p6, int p7, int p8, int[] p9)
    {
        n.b3 v0_1 = ((n.b3) p6.getLayoutParams());
        int v1_4 = (v0_1.rightMargin - p9[1]);
        int v7_1 = (p7 - Math.max(0, v1_4));
        p9[1] = Math.max(0, (- v1_4));
        int v8_1 = this.j(p6, p8);
        int v9_1 = p6.getMeasuredWidth();
        p6.layout((v7_1 - v9_1), v8_1, v7_1, (p6.getMeasuredHeight() + v8_1));
        return (v7_1 - (v9_1 + v0_1.leftMargin));
    }

    public final int q(android.view.View p8, int p9, int p10, int p11, int p12, int[] p13)
    {
        android.view.ViewGroup$MarginLayoutParams v0_1 = ((android.view.ViewGroup$MarginLayoutParams) p8.getLayoutParams());
        int v1_9 = (v0_1.leftMargin - p13[0]);
        int v3_0 = (v0_1.rightMargin - p13[1]);
        int v6_1 = (Math.max(0, v3_0) + Math.max(0, v1_9));
        p13[0] = Math.max(0, (- v1_9));
        p13[1] = Math.max(0, (- v3_0));
        p8.measure(android.view.ViewGroup.getChildMeasureSpec(p9, (((this.getPaddingRight() + this.getPaddingLeft()) + v6_1) + p10), v0_1.width), android.view.ViewGroup.getChildMeasureSpec(p11, ((((this.getPaddingBottom() + this.getPaddingTop()) + v0_1.topMargin) + v0_1.bottomMargin) + p12), v0_1.height));
        return (p8.getMeasuredWidth() + v6_1);
    }

    public final void r(android.view.View p4, int p5, int p6, int p7, int p8)
    {
        int v0_1 = ((android.view.ViewGroup$MarginLayoutParams) p4.getLayoutParams());
        int v5_1 = android.view.ViewGroup.getChildMeasureSpec(p5, ((((this.getPaddingRight() + this.getPaddingLeft()) + v0_1.leftMargin) + v0_1.rightMargin) + p6), v0_1.width);
        int v6_6 = android.view.ViewGroup.getChildMeasureSpec(p7, (((this.getPaddingBottom() + this.getPaddingTop()) + v0_1.topMargin) + v0_1.bottomMargin), v0_1.height);
        int v7_1 = android.view.View$MeasureSpec.getMode(v6_6);
        if ((v7_1 != 1073741824) && (p8 >= 0)) {
            if (v7_1 != 0) {
                p8 = Math.min(android.view.View$MeasureSpec.getSize(v6_6), p8);
            }
            v6_6 = android.view.View$MeasureSpec.makeMeasureSpec(p8, 1073741824);
        }
        p4.measure(v5_1, v6_6);
        return;
    }

    public final void removeMenuProvider(q0.p p2)
    {
        this.M.b(p2);
        return;
    }

    public final boolean s(android.view.View p2)
    {
        if ((p2 == 0) || ((p2.getParent() != this) || (p2.getVisibility() == 8))) {
            return 0;
        } else {
            return 1;
        }
    }

    public void setBackInvokedCallbackEnabled(boolean p2)
    {
        if (this.V != p2) {
            this.V = p2;
            this.t();
        }
        return;
    }

    public void setCollapseContentDescription(int p2)
    {
        int v2_1;
        if (p2 == 0) {
            v2_1 = 0;
        } else {
            v2_1 = this.getContext().getText(p2);
        }
        this.setCollapseContentDescription(v2_1);
        return;
    }

    public void setCollapseContentDescription(CharSequence p2)
    {
        if (!android.text.TextUtils.isEmpty(p2)) {
            this.c();
        }
        n.y v0_1 = this.n;
        if (v0_1 != null) {
            v0_1.setContentDescription(p2);
        }
        return;
    }

    public void setCollapseIcon(int p2)
    {
        this.setCollapseIcon(j5.t1.A(this.getContext(), p2));
        return;
    }

    public void setCollapseIcon(android.graphics.drawable.Drawable p2)
    {
        if (p2 == null) {
            n.y v2_1 = this.n;
            if (v2_1 != null) {
                v2_1.setImageDrawable(this.f);
            }
            return;
        } else {
            this.c();
            this.n.setImageDrawable(p2);
            return;
        }
    }

    public void setCollapsible(boolean p1)
    {
        this.S = p1;
        this.requestLayout();
        return;
    }

    public void setContentInsetEndWithActions(int p2)
    {
        if (p2 < null) {
            p2 = -2147483648;
        }
        if (p2 != this.B) {
            this.B = p2;
            if (this.getNavigationIcon() != null) {
                this.requestLayout();
            }
        }
        return;
    }

    public void setContentInsetStartWithNavigation(int p2)
    {
        if (p2 < null) {
            p2 = -2147483648;
        }
        if (p2 != this.A) {
            this.A = p2;
            if (this.getNavigationIcon() != null) {
                this.requestLayout();
            }
        }
        return;
    }

    public void setLogo(int p2)
    {
        this.setLogo(j5.t1.A(this.getContext(), p2));
        return;
    }

    public void setLogo(android.graphics.drawable.Drawable p5)
    {
        if (p5 == null) {
            java.util.ArrayList v0_0 = this.e;
            if ((v0_0 != null) && (this.n(v0_0))) {
                this.removeView(this.e);
                this.K.remove(this.e);
            }
        } else {
            if (this.e == null) {
                this.e = new n.z(this.getContext(), 0, 0);
            }
            if (!this.n(this.e)) {
                this.b(this.e, 1);
            }
        }
        java.util.ArrayList v0_7 = this.e;
        if (v0_7 != null) {
            v0_7.setImageDrawable(p5);
        }
        return;
    }

    public void setLogoDescription(int p2)
    {
        this.setLogoDescription(this.getContext().getText(p2));
        return;
    }

    public void setLogoDescription(CharSequence p5)
    {
        if ((!android.text.TextUtils.isEmpty(p5)) && (this.e == null)) {
            this.e = new n.z(this.getContext(), 0, 0);
        }
        n.z v0_2 = this.e;
        if (v0_2 != null) {
            v0_2.setContentDescription(p5);
        }
        return;
    }

    public void setNavigationContentDescription(int p2)
    {
        int v2_1;
        if (p2 == 0) {
            v2_1 = 0;
        } else {
            v2_1 = this.getContext().getText(p2);
        }
        this.setNavigationContentDescription(v2_1);
        return;
    }

    public void setNavigationContentDescription(CharSequence p2)
    {
        if (!android.text.TextUtils.isEmpty(p2)) {
            this.g();
        }
        n.y v0_1 = this.d;
        if (v0_1 != null) {
            v0_1.setContentDescription(p2);
            n.g3.a(this.d, p2);
        }
        return;
    }

    public void setNavigationIcon(int p2)
    {
        this.setNavigationIcon(j5.t1.A(this.getContext(), p2));
        return;
    }

    public void setNavigationIcon(android.graphics.drawable.Drawable p3)
    {
        if (p3 == null) {
            java.util.ArrayList v0_0 = this.d;
            if ((v0_0 != null) && (this.n(v0_0))) {
                this.removeView(this.d);
                this.K.remove(this.d);
            }
        } else {
            this.g();
            if (!this.n(this.d)) {
                this.b(this.d, 1);
            }
        }
        java.util.ArrayList v0_4 = this.d;
        if (v0_4 != null) {
            v0_4.setImageDrawable(p3);
        }
        return;
    }

    public void setNavigationOnClickListener(android.view.View$OnClickListener p2)
    {
        this.g();
        this.d.setOnClickListener(p2);
        return;
    }

    public void setOnMenuItemClickListener(n.c3 p1)
    {
        return;
    }

    public void setOverflowIcon(android.graphics.drawable.Drawable p2)
    {
        this.e();
        this.a.setOverflowIcon(p2);
        return;
    }

    public void setPopupTheme(int p3)
    {
        if (this.q != p3) {
            this.q = p3;
            if (p3 != null) {
                this.p = new android.view.ContextThemeWrapper(this.getContext(), p3);
            } else {
                this.p = this.getContext();
                return;
            }
        }
        return;
    }

    public void setSubtitle(int p2)
    {
        this.setSubtitle(this.getContext().getText(p2));
        return;
    }

    public void setSubtitle(CharSequence p4)
    {
        if (android.text.TextUtils.isEmpty(p4)) {
            java.util.ArrayList v0_5 = this.c;
            if ((v0_5 != null) && (this.n(v0_5))) {
                this.removeView(this.c);
                this.K.remove(this.c);
            }
        } else {
            if (this.c == null) {
                java.util.ArrayList v0_3 = this.getContext();
                n.b1 v1_2 = new n.b1(v0_3, 0);
                this.c = v1_2;
                v1_2.setSingleLine();
                this.c.setEllipsize(android.text.TextUtils$TruncateAt.END);
                n.b1 v1_4 = this.s;
                if (v1_4 != null) {
                    this.c.setTextAppearance(v0_3, v1_4);
                }
                java.util.ArrayList v0_4 = this.G;
                if (v0_4 != null) {
                    this.c.setTextColor(v0_4);
                }
            }
            if (!this.n(this.c)) {
                this.b(this.c, 1);
            }
        }
        java.util.ArrayList v0_9 = this.c;
        if (v0_9 != null) {
            v0_9.setText(p4);
        }
        this.E = p4;
        return;
    }

    public void setSubtitleTextColor(int p1)
    {
        this.setSubtitleTextColor(android.content.res.ColorStateList.valueOf(p1));
        return;
    }

    public void setSubtitleTextColor(android.content.res.ColorStateList p2)
    {
        this.G = p2;
        n.b1 v0 = this.c;
        if (v0 != null) {
            v0.setTextColor(p2);
        }
        return;
    }

    public void setTitle(int p2)
    {
        this.setTitle(this.getContext().getText(p2));
        return;
    }

    public void setTitle(CharSequence p4)
    {
        if (android.text.TextUtils.isEmpty(p4)) {
            java.util.ArrayList v0_5 = this.b;
            if ((v0_5 != null) && (this.n(v0_5))) {
                this.removeView(this.b);
                this.K.remove(this.b);
            }
        } else {
            if (this.b == null) {
                java.util.ArrayList v0_3 = this.getContext();
                n.b1 v1_2 = new n.b1(v0_3, 0);
                this.b = v1_2;
                v1_2.setSingleLine();
                this.b.setEllipsize(android.text.TextUtils$TruncateAt.END);
                n.b1 v1_4 = this.r;
                if (v1_4 != null) {
                    this.b.setTextAppearance(v0_3, v1_4);
                }
                java.util.ArrayList v0_4 = this.F;
                if (v0_4 != null) {
                    this.b.setTextColor(v0_4);
                }
            }
            if (!this.n(this.b)) {
                this.b(this.b, 1);
            }
        }
        java.util.ArrayList v0_9 = this.b;
        if (v0_9 != null) {
            v0_9.setText(p4);
        }
        this.D = p4;
        return;
    }

    public void setTitleMarginBottom(int p1)
    {
        this.y = p1;
        this.requestLayout();
        return;
    }

    public void setTitleMarginEnd(int p1)
    {
        this.w = p1;
        this.requestLayout();
        return;
    }

    public void setTitleMarginStart(int p1)
    {
        this.v = p1;
        this.requestLayout();
        return;
    }

    public void setTitleMarginTop(int p1)
    {
        this.x = p1;
        this.requestLayout();
        return;
    }

    public void setTitleTextColor(int p1)
    {
        this.setTitleTextColor(android.content.res.ColorStateList.valueOf(p1));
        return;
    }

    public void setTitleTextColor(android.content.res.ColorStateList p2)
    {
        this.F = p2;
        n.b1 v0 = this.b;
        if (v0 != null) {
            v0.setTextColor(p2);
        }
        return;
    }

    public final void t()
    {
        if (android.os.Build$VERSION.SDK_INT >= 33) {
            android.window.OnBackInvokedCallback v1_3;
            int v0_3 = n.z2.a(this);
            android.window.OnBackInvokedCallback v1_10 = this.R;
            if ((v1_10 == null) || ((v1_10.b == null) || ((v0_3 == 0) || ((!this.isAttachedToWindow()) || (!this.V))))) {
                v1_3 = 0;
            } else {
                v1_3 = 1;
            }
            if ((v1_3 == null) || (this.U != null)) {
                if (v1_3 == null) {
                    int v0_1 = this.U;
                    if (v0_1 != 0) {
                        n.z2.d(v0_1, this.T);
                        this.U = 0;
                    }
                }
            } else {
                if (this.T == null) {
                    this.T = n.z2.b(new n.x2(this, 0));
                }
                n.z2.c(v0_3, this.T);
                this.U = v0_3;
                return;
            }
        }
        return;
    }
}
