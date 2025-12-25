package androidx.appcompat.widget;
public class SwitchCompat extends android.widget.CompoundButton {
    public static final f2.b a0;
    public static final int[] b0;
    public final int A;
    public float B;
    public float C;
    public final android.view.VelocityTracker D;
    public final int E;
    public float F;
    public int G;
    public int H;
    public int I;
    public int J;
    public int K;
    public int L;
    public int M;
    public boolean N;
    public final android.text.TextPaint O;
    public final android.content.res.ColorStateList P;
    public android.text.StaticLayout Q;
    public android.text.StaticLayout R;
    public final k.a S;
    public android.animation.ObjectAnimator T;
    public n.x U;
    public n.s2 V;
    public final android.graphics.Rect W;
    public android.graphics.drawable.Drawable a;
    public android.content.res.ColorStateList b;
    public android.graphics.PorterDuff$Mode c;
    public boolean d;
    public boolean e;
    public android.graphics.drawable.Drawable f;
    public android.content.res.ColorStateList m;
    public android.graphics.PorterDuff$Mode n;
    public boolean o;
    public boolean p;
    public int q;
    public int r;
    public int s;
    public boolean t;
    public CharSequence u;
    public CharSequence v;
    public CharSequence w;
    public CharSequence x;
    public boolean y;
    public int z;

    static SwitchCompat()
    {
        androidx.appcompat.widget.SwitchCompat.a0 = new f2.b("thumbPos", 7, Float);
        androidx.appcompat.widget.SwitchCompat.b0 = new int[] {16842912});
        return;
    }

    public SwitchCompat(android.content.Context p2, android.util.AttributeSet p3)
    {
        this(p2, p3, 2130969831);
        return;
    }

    public SwitchCompat(android.content.Context p13, android.util.AttributeSet p14, int p15)
    {
        super(p13, p14, p15);
        super.b = 0;
        super.c = 0;
        super.d = 0;
        super.e = 0;
        super.m = 0;
        super.n = 0;
        super.o = 0;
        super.p = 0;
        super.D = android.view.VelocityTracker.obtain();
        int v2_1 = 1;
        super.N = 1;
        super.W = new android.graphics.Rect();
        n.t2.a(super, super.getContext());
        android.text.TextPaint v3_4 = new android.text.TextPaint(1);
        super.O = v3_4;
        v3_4.density = super.getResources().getDisplayMetrics().density;
        int v7_2 = g.a.v;
        b8.g v4_3 = b8.g.p(p13, p14, v7_2, p15);
        int v9_10 = ((android.content.res.TypedArray) v4_3.c);
        q0.q0.m(super, p13, v7_2, p14, v9_10, p15);
        int v14_11 = v4_3.i(2);
        super.a = v14_11;
        if (v14_11 != 0) {
            v14_11.setCallback(super);
        }
        int v14_13 = v4_3.i(11);
        super.f = v14_13;
        if (v14_13 != 0) {
            v14_13.setCallback(super);
        }
        super.setTextOnInternal(v9_10.getText(0));
        super.setTextOffInternal(v9_10.getText(1));
        super.y = v9_10.getBoolean(3, 1);
        super.q = v9_10.getDimensionPixelSize(8, 0);
        super.r = v9_10.getDimensionPixelSize(5, 0);
        super.s = v9_10.getDimensionPixelSize(6, 0);
        super.t = v9_10.getBoolean(4, 0);
        android.content.res.TypedArray v15_21 = v4_3.h(9);
        if (v15_21 != null) {
            super.b = v15_21;
            super.d = 1;
        }
        android.content.res.TypedArray v15_24 = n.n1.c(v9_10.getInt(10, -1), 0);
        if (super.c != v15_24) {
            super.c = v15_24;
            super.e = 1;
        }
        if ((super.d) || (super.e)) {
            super.a();
        }
        android.content.res.TypedArray v15_2 = v4_3.h(12);
        if (v15_2 != null) {
            super.m = v15_2;
            super.o = 1;
        }
        android.content.res.TypedArray v15_5 = n.n1.c(v9_10.getInt(13, -1), 0);
        if (super.n != v15_5) {
            super.n = v15_5;
            super.p = 1;
        }
        if ((super.o) || (super.p)) {
            super.b();
        }
        android.content.res.TypedArray v15_9 = v9_10.getResourceId(7, 0);
        if (v15_9 != null) {
            int v9_3;
            android.content.res.TypedArray v15_10 = p13.obtainStyledAttributes(v15_9, g.a.w);
            if (!v15_10.hasValue(3)) {
                v9_3 = v15_10.getColorStateList(3);
            } else {
                int v9_2 = v15_10.getResourceId(3, 0);
                if (v9_2 == 0) {
                } else {
                    v9_3 = e0.c.getColorStateList(p13, v9_2);
                    if (v9_3 == 0) {
                    }
                }
            }
            if (v9_3 == 0) {
                super.P = super.getTextColors();
            } else {
                super.P = v9_3;
            }
            int v9_5 = v15_10.getDimensionPixelSize(0, 0);
            if (v9_5 != 0) {
                int v9_6 = ((float) v9_5);
                if (v9_6 != v3_4.getTextSize()) {
                    v3_4.setTextSize(v9_6);
                    super.requestLayout();
                }
            }
            int v14_1;
            int v9_7 = v15_10.getInt(1, -1);
            int v7_0 = v15_10.getInt(2, -1);
            if (v9_7 == 1) {
                v14_1 = android.graphics.Typeface.SANS_SERIF;
            } else {
                if (v9_7 == 2) {
                    v14_1 = android.graphics.Typeface.SERIF;
                } else {
                    if (v9_7 == 3) {
                        v14_1 = android.graphics.Typeface.MONOSPACE;
                    } else {
                        v14_1 = 0;
                    }
                }
            }
            int v9_8 = 0;
            if (v7_0 <= 0) {
                v3_4.setFakeBoldText(0);
                v3_4.setTextSkewX(0);
                super.setSwitchTypeface(v14_1);
            } else {
                int v14_2;
                if (v14_1 != 0) {
                    v14_2 = android.graphics.Typeface.create(v14_1, v7_0);
                } else {
                    v14_2 = android.graphics.Typeface.defaultFromStyle(v7_0);
                }
                int v14_3;
                super.setSwitchTypeface(v14_2);
                if (v14_2 == 0) {
                    v14_3 = 0;
                } else {
                    v14_3 = v14_2.getStyle();
                }
                int v14_5 = ((~ v14_3) & v7_0);
                if ((v14_5 & 1) == 0) {
                    v2_1 = 0;
                }
                v3_4.setFakeBoldText(v2_1);
                if ((2 & v14_5) != 0) {
                    v9_8 = -1098907648;
                }
                v3_4.setTextSkewX(v9_8);
            }
            if (!v15_10.getBoolean(14, 0)) {
                super.S = 0;
            } else {
                int v14_6 = super.getContext();
                int v13_5 = new k.a();
                v13_5.a = v14_6.getResources().getConfiguration().locale;
                super.S = v13_5;
            }
            super.setTextOnInternal(super.u);
            super.setTextOffInternal(super.w);
            v15_10.recycle();
        }
        new n.x0(super).f(p14, p15);
        v4_3.r();
        int v13_10 = android.view.ViewConfiguration.get(p13);
        super.A = v13_10.getScaledTouchSlop();
        super.E = v13_10.getScaledMinimumFlingVelocity();
        super.getEmojiTextViewHelper().b(p14, p15);
        super.refreshDrawableState();
        super.setChecked(super.isChecked());
        return;
    }

    private n.x getEmojiTextViewHelper()
    {
        if (this.U == null) {
            this.U = new n.x(this);
        }
        return this.U;
    }

    private boolean getTargetCheckedState()
    {
        if (this.F <= 1056964608) {
            return 0;
        } else {
            return 1;
        }
    }

    private int getThumbOffset()
    {
        int v0_4;
        if (this.getLayoutDirection() != 1) {
            v0_4 = this.F;
        } else {
            v0_4 = (1065353216 - this.F);
        }
        return ((int) ((v0_4 * ((float) this.getThumbScrollRange())) + 1056964608));
    }

    private int getThumbScrollRange()
    {
        int v0_0 = this.f;
        if (v0_0 == 0) {
            return 0;
        } else {
            int v0_1;
            int v1_2 = this.W;
            v0_0.getPadding(v1_2);
            int v0_4 = this.a;
            if (v0_4 == 0) {
                v0_1 = n.n1.c;
            } else {
                v0_1 = n.n1.b(v0_4);
            }
            return (((((this.G - this.I) - v1_2.left) - v1_2.right) - v0_1.left) - v0_1.right);
        }
    }

    private void setTextOffInternal(CharSequence p3)
    {
        this.w = p3;
        android.text.method.TransformationMethod v0_4 = ((a.a) this.getEmojiTextViewHelper().b.b).W(this.S);
        if (v0_4 != null) {
            p3 = v0_4.getTransformation(p3, this);
        }
        this.x = p3;
        this.R = 0;
        if (this.y) {
            this.d();
        }
        return;
    }

    private void setTextOnInternal(CharSequence p3)
    {
        this.u = p3;
        android.text.method.TransformationMethod v0_4 = ((a.a) this.getEmojiTextViewHelper().b.b).W(this.S);
        if (v0_4 != null) {
            p3 = v0_4.getTransformation(p3, this);
        }
        this.v = p3;
        this.Q = 0;
        if (this.y) {
            this.d();
        }
        return;
    }

    public final void a()
    {
        android.graphics.drawable.Drawable v0_0 = this.a;
        if ((v0_0 != null) && ((this.d) || (this.e))) {
            android.graphics.drawable.Drawable v0_6 = v0_0.mutate();
            this.a = v0_6;
            if (this.d) {
                v0_6.setTintList(this.b);
            }
            if (this.e) {
                this.a.setTintMode(this.c);
            }
            if (this.a.isStateful()) {
                this.a.setState(this.getDrawableState());
            }
        }
        return;
    }

    public final void b()
    {
        android.graphics.drawable.Drawable v0_0 = this.f;
        if ((v0_0 != null) && ((this.o) || (this.p))) {
            android.graphics.drawable.Drawable v0_6 = v0_0.mutate();
            this.f = v0_6;
            if (this.o) {
                v0_6.setTintList(this.m);
            }
            if (this.p) {
                this.f.setTintMode(this.n);
            }
            if (this.f.isStateful()) {
                this.f.setState(this.getDrawableState());
            }
        }
        return;
    }

    public final void c()
    {
        this.setTextOnInternal(this.u);
        this.setTextOffInternal(this.w);
        this.requestLayout();
        return;
    }

    public final void d()
    {
        if ((this.V == null) && ((((a.a) this.U.b.b).B()) && (g1.i.k != null))) {
            g1.i v0_1 = g1.i.a();
            n.s2 v1_0 = v0_1.b();
            if ((v1_0 == 3) || (v1_0 == null)) {
                n.s2 v1_2 = new n.s2(this);
                this.V = v1_2;
                v0_1.f(v1_2);
            }
        }
        return;
    }

    public final void draw(android.graphics.Canvas p11)
    {
        int v5_0;
        int v0_0 = this.J;
        int v1 = this.K;
        int v2_0 = this.L;
        int v3 = this.M;
        int v4_0 = (this.getThumbOffset() + v0_0);
        int v5_4 = this.a;
        if (v5_4 == 0) {
            v5_0 = n.n1.c;
        } else {
            v5_0 = n.n1.b(v5_4);
        }
        int v6_0 = this.f;
        android.graphics.Rect v7 = this.W;
        if (v6_0 != 0) {
            int v6_2;
            int v5_2;
            v6_0.getPadding(v7);
            int v6_1 = v7.left;
            v4_0 += v6_1;
            if (v5_0 == 0) {
                v6_2 = v1;
                v5_2 = v3;
            } else {
                int v8_0 = v5_0.left;
                if (v8_0 > v6_1) {
                    v0_0 += (v8_0 - v6_1);
                }
                int v6_3 = v5_0.top;
                int v8_2 = v7.top;
                if (v6_3 <= v8_2) {
                    v6_2 = v1;
                } else {
                    v6_2 = ((v6_3 - v8_2) + v1);
                }
                int v8_3 = v5_0.right;
                int v9 = v7.right;
                if (v8_3 > v9) {
                    v2_0 -= (v8_3 - v9);
                }
                int v5_1 = v5_0.bottom;
                int v8_5 = v7.bottom;
                if (v5_1 <= v8_5) {
                } else {
                    v5_2 = (v3 - (v5_1 - v8_5));
                }
            }
            this.f.setBounds(v0_0, v6_2, v2_0, v5_2);
        }
        int v0_1 = this.a;
        if (v0_1 != 0) {
            v0_1.getPadding(v7);
            int v0_3 = (v4_0 - v7.left);
            int v4_3 = ((v4_0 + this.I) + v7.right);
            this.a.setBounds(v0_3, v1, v4_3, v3);
            int v2_4 = this.getBackground();
            if (v2_4 != 0) {
                v2_4.setHotspotBounds(v0_3, v1, v4_3, v3);
            }
        }
        super.draw(p11);
        return;
    }

    public final void drawableHotspotChanged(float p2, float p3)
    {
        super.drawableHotspotChanged(p2, p3);
        android.graphics.drawable.Drawable v0_0 = this.a;
        if (v0_0 != null) {
            v0_0.setHotspot(p2, p3);
        }
        android.graphics.drawable.Drawable v0_1 = this.f;
        if (v0_1 != null) {
            v0_1.setHotspot(p2, p3);
        }
        return;
    }

    public final void drawableStateChanged()
    {
        int v1_0;
        super.drawableStateChanged();
        boolean v0_1 = this.getDrawableState();
        int v1_1 = this.a;
        if ((v1_1 == 0) || (!v1_1.isStateful())) {
            v1_0 = 0;
        } else {
            v1_0 = v1_1.setState(v0_1);
        }
        android.graphics.drawable.Drawable v2_0 = this.f;
        if ((v2_0 != null) && (v2_0.isStateful())) {
            v1_0 |= v2_0.setState(v0_1);
        }
        if (v1_0 != 0) {
            this.invalidate();
        }
        return;
    }

    public int getCompoundPaddingLeft()
    {
        if (this.getLayoutDirection() != 1) {
            return super.getCompoundPaddingLeft();
        } else {
            int v0_0 = (super.getCompoundPaddingLeft() + this.G);
            if (!android.text.TextUtils.isEmpty(this.getText())) {
                v0_0 += this.s;
            }
            return v0_0;
        }
    }

    public int getCompoundPaddingRight()
    {
        if (this.getLayoutDirection() != 1) {
            int v0_0 = (super.getCompoundPaddingRight() + this.G);
            if (!android.text.TextUtils.isEmpty(this.getText())) {
                v0_0 += this.s;
            }
            return v0_0;
        } else {
            return super.getCompoundPaddingRight();
        }
    }

    public android.view.ActionMode$Callback getCustomSelectionActionModeCallback()
    {
        return c4.b.h0(super.getCustomSelectionActionModeCallback());
    }

    public boolean getShowText()
    {
        return this.y;
    }

    public boolean getSplitTrack()
    {
        return this.t;
    }

    public int getSwitchMinWidth()
    {
        return this.r;
    }

    public int getSwitchPadding()
    {
        return this.s;
    }

    public CharSequence getTextOff()
    {
        return this.w;
    }

    public CharSequence getTextOn()
    {
        return this.u;
    }

    public android.graphics.drawable.Drawable getThumbDrawable()
    {
        return this.a;
    }

    public final float getThumbPosition()
    {
        return this.F;
    }

    public int getThumbTextPadding()
    {
        return this.q;
    }

    public android.content.res.ColorStateList getThumbTintList()
    {
        return this.b;
    }

    public android.graphics.PorterDuff$Mode getThumbTintMode()
    {
        return this.c;
    }

    public android.graphics.drawable.Drawable getTrackDrawable()
    {
        return this.f;
    }

    public android.content.res.ColorStateList getTrackTintList()
    {
        return this.m;
    }

    public android.graphics.PorterDuff$Mode getTrackTintMode()
    {
        return this.n;
    }

    public final void jumpDrawablesToCurrentState()
    {
        super.jumpDrawablesToCurrentState();
        int v0_0 = this.a;
        if (v0_0 != 0) {
            v0_0.jumpToCurrentState();
        }
        int v0_4 = this.f;
        if (v0_4 != 0) {
            v0_4.jumpToCurrentState();
        }
        int v0_5 = this.T;
        if ((v0_5 != 0) && (v0_5.isStarted())) {
            this.T.end();
            this.T = 0;
        }
        return;
    }

    public int[] onCreateDrawableState(int p2)
    {
        int[] v2_2 = super.onCreateDrawableState((p2 + 1));
        if (this.isChecked()) {
            android.view.View.mergeDrawableStates(v2_2, androidx.appcompat.widget.SwitchCompat.b0);
        }
        return v2_2;
    }

    public final void onDraw(android.graphics.Canvas p10)
    {
        super.onDraw(p10);
        int v0_0 = this.f;
        android.text.StaticLayout v1_0 = this.W;
        if (v0_0 == 0) {
            v1_0.setEmpty();
        } else {
            v0_0.getPadding(v1_0);
        }
        float v2_5 = (this.K + v1_0.top);
        float v3_0 = (this.M - v1_0.bottom);
        int v4_1 = this.a;
        if (v0_0 != 0) {
            if ((!this.t) || (v4_1 == 0)) {
                v0_0.draw(p10);
            } else {
                int v5_1 = n.n1.b(v4_1);
                v4_1.copyBounds(v1_0);
                v1_0.left = (v1_0.left + v5_1.left);
                v1_0.right = (v1_0.right - v5_1.right);
                int v5_3 = p10.save();
                p10.clipRect(v1_0, android.graphics.Region$Op.DIFFERENCE);
                v0_0.draw(p10);
                p10.restoreToCount(v5_3);
            }
        }
        int v0_1 = p10.save();
        if (v4_1 != 0) {
            v4_1.draw(p10);
        }
        android.text.StaticLayout v1_2;
        if (!this.getTargetCheckedState()) {
            v1_2 = this.R;
        } else {
            v1_2 = this.Q;
        }
        if (v1_2 != null) {
            int v5_4 = this.getDrawableState();
            android.text.TextPaint v6_5 = this.O;
            int v7_1 = this.P;
            if (v7_1 != 0) {
                v6_5.setColor(v7_1.getColorForState(v5_4, 0));
            }
            int v5_5;
            v6_5.drawableState = v5_4;
            if (v4_1 == 0) {
                v5_5 = this.getWidth();
            } else {
                int v4_2 = v4_1.getBounds();
                v5_5 = (v4_2.left + v4_2.right);
            }
            p10.translate(((float) ((v5_5 / 2) - (v1_2.getWidth() / 2))), ((float) (((v2_5 + v3_0) / 2) - (v1_2.getHeight() / 2))));
            v1_2.draw(p10);
        }
        p10.restoreToCount(v0_1);
        return;
    }

    public final void onInitializeAccessibilityEvent(android.view.accessibility.AccessibilityEvent p2)
    {
        super.onInitializeAccessibilityEvent(p2);
        p2.setClassName("android.widget.Switch");
        return;
    }

    public final void onInitializeAccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo p4)
    {
        super.onInitializeAccessibilityNodeInfo(p4);
        p4.setClassName("android.widget.Switch");
        if (android.os.Build$VERSION.SDK_INT < 30) {
            CharSequence v0_1;
            if (!this.isChecked()) {
                v0_1 = this.w;
            } else {
                v0_1 = this.u;
            }
            if (!android.text.TextUtils.isEmpty(v0_1)) {
                int v1_1 = p4.getText();
                if (!android.text.TextUtils.isEmpty(v1_1)) {
                    StringBuilder v2_2 = new StringBuilder();
                    v2_2.append(v1_1);
                    v2_2.append(32);
                    v2_2.append(v0_1);
                    p4.setText(v2_2);
                } else {
                    p4.setText(v0_1);
                    return;
                }
            }
        }
        return;
    }

    public final void onLayout(boolean p3, int p4, int p5, int p6, int p7)
    {
        int v7_3;
        this = super.onLayout(p3, p4, p5, p6, p7);
        int v5_1 = 0;
        if (this.a == null) {
            v7_3 = 0;
        } else {
            int v4_14 = this.f;
            int v6_8 = this.W;
            if (v4_14 == 0) {
                v6_8.setEmpty();
            } else {
                v4_14.getPadding(v6_8);
            }
            int v4_2 = n.n1.b(this.a);
            v7_3 = Math.max(0, (v4_2.left - v6_8.left));
            v5_1 = Math.max(0, (v4_2.right - v6_8.right));
        }
        int v4_12;
        int v6_4;
        if (this.getLayoutDirection() != 1) {
            v6_4 = ((this.getWidth() - this.getPaddingRight()) - v5_1);
            v4_12 = (((v6_4 - this.G) + v7_3) + v5_1);
        } else {
            v4_12 = (this.getPaddingLeft() + v7_3);
            v6_4 = (((this.G + v4_12) - v7_3) - v5_1);
        }
        int v7_10;
        int v5_8;
        int v5_3 = (this.getGravity() & 112);
        if (v5_3 == 16) {
            int v5_6 = this.H;
            int v7_9 = ((((this.getHeight() + this.getPaddingTop()) - this.getPaddingBottom()) / 2) - (v5_6 / 2));
            v7_10 = (v5_6 + v7_9);
            v5_8 = v7_9;
        } else {
            if (v5_3 == 80) {
                v7_10 = (this.getHeight() - this.getPaddingBottom());
                v5_8 = (v7_10 - this.H);
            } else {
                v5_8 = this.getPaddingTop();
                v7_10 = (this.H + v5_8);
            }
        }
        this.J = v4_12;
        this.K = v5_8;
        this.M = v7_10;
        this.L = v6_4;
        return;
    }

    public final void onMeasure(int p11, int p12)
    {
        int v1_0 = 0;
        if (this.y) {
            int v4_0 = this.O;
            if (this.Q == null) {
                int v5_4;
                CharSequence v3_5 = this.v;
                if (v3_5 == null) {
                    v5_4 = 0;
                } else {
                    v5_4 = ((int) Math.ceil(((double) android.text.Layout.getDesiredWidth(v3_5, v4_0))));
                }
                this.Q = new android.text.StaticLayout(v3_5, v4_0, v5_4, android.text.Layout$Alignment.ALIGN_NORMAL, 1065353216, 0, 1);
            }
            if (this.R == null) {
                int v5_5;
                CharSequence v3_0 = this.x;
                if (v3_0 == null) {
                    v5_5 = 0;
                } else {
                    v5_5 = ((int) Math.ceil(((double) android.text.Layout.getDesiredWidth(v3_0, v4_0))));
                }
                this.R = new android.text.StaticLayout(v3_0, v4_0, v5_5, android.text.Layout$Alignment.ALIGN_NORMAL, 1065353216, 0, 1);
            }
        }
        int v0_9;
        CharSequence v3_1;
        int v0_8 = this.a;
        int v2_3 = this.W;
        if (v0_8 == 0) {
            v0_9 = 0;
            v3_1 = 0;
        } else {
            v0_8.getPadding(v2_3);
            v0_9 = ((this.a.getIntrinsicWidth() - v2_3.left) - v2_3.right);
            v3_1 = this.a.getIntrinsicHeight();
        }
        int v5_8;
        if (!this.y) {
            v5_8 = 0;
        } else {
            v5_8 = ((this.q * 2) + Math.max(this.Q.getWidth(), this.R.getWidth()));
        }
        this.I = Math.max(v5_8, v0_9);
        int v0_14 = this.f;
        if (v0_14 == 0) {
            v2_3.setEmpty();
        } else {
            v0_14.getPadding(v2_3);
            v1_0 = this.f.getIntrinsicHeight();
        }
        int v0_16 = v2_3.left;
        int v2_5 = v2_3.right;
        int v4_5 = this.a;
        if (v4_5 != 0) {
            int v4_6 = n.n1.b(v4_5);
            v0_16 = Math.max(v0_16, v4_6.left);
            v2_5 = Math.max(v2_5, v4_6.right);
        }
        int v0_1;
        if (!this.N) {
            v0_1 = this.r;
        } else {
            v0_1 = Math.max(this.r, (((this.I * 2) + v0_16) + v2_5));
        }
        int v1_1 = Math.max(v1_0, v3_1);
        this.G = v0_1;
        this.H = v1_1;
        super.onMeasure(p11, p12);
        if (this.getMeasuredHeight() < v1_1) {
            this.setMeasuredDimension(this.getMeasuredWidthAndState(), v1_1);
        }
        return;
    }

    public final void onPopulateAccessibilityEvent(android.view.accessibility.AccessibilityEvent p2)
    {
        CharSequence v0_1;
        super.onPopulateAccessibilityEvent(p2);
        if (!this.isChecked()) {
            v0_1 = this.w;
        } else {
            v0_1 = this.u;
        }
        if (v0_1 != null) {
            p2.getText().add(v0_1);
        }
        return;
    }

    public final boolean onTouchEvent(android.view.MotionEvent p10)
    {
        float v0_0 = this.D;
        v0_0.addMovement(p10);
        float v1_11 = p10.getActionMasked();
        float v2_5 = this.A;
        if (v1_11 == 0) {
            float v0_10 = p10.getX();
            float v1_0 = p10.getY();
            if ((this.isEnabled()) && (this.a != null)) {
                float v4_4 = this.getThumbOffset();
                boolean v6_1 = this.W;
                this.a.getPadding(v6_1);
                float v7_4 = ((this.J + v4_4) - v2_5);
                if ((v0_10 > ((float) v7_4)) && ((v0_10 < ((float) ((((this.I + v7_4) + v6_1.left) + v6_1.right) + v2_5))) && ((v1_0 > ((float) (this.K - v2_5))) && (v1_0 < ((float) (this.M + v2_5)))))) {
                    this.z = 1;
                    this.B = v0_10;
                    this.C = v1_0;
                }
            }
        } else {
            float v5_0 = 0;
            if (v1_11 != 1) {
                if (v1_11 == 2) {
                    float v0_8 = this.z;
                    if (v0_8 == 1) {
                        float v0_9 = p10.getX();
                        float v1_12 = p10.getY();
                        float v2_10 = ((float) v2_5);
                        if ((Math.abs((v0_9 - this.B)) <= v2_10) && (Math.abs((v1_12 - this.C)) <= v2_10)) {
                            return super.onTouchEvent(p10);
                        } else {
                            this.z = 2;
                            this.getParent().requestDisallowInterceptTouchEvent(1);
                            this.B = v0_9;
                            this.C = v1_12;
                            return 1;
                        }
                    } else {
                        if (v0_8 == 2) {
                            float v1_1;
                            android.view.ViewParent v10_3 = p10.getX();
                            float v0_11 = this.getThumbScrollRange();
                            float v1_14 = (v10_3 - this.B);
                            if (v0_11 == 0) {
                                if (v1_14 <= 0) {
                                    v1_1 = -1082130432;
                                } else {
                                    v1_1 = 1065353216;
                                }
                            } else {
                                v1_1 = (v1_14 / ((float) v0_11));
                            }
                            if (this.getLayoutDirection() == 1) {
                                v1_1 = (- v1_1);
                            }
                            float v0_1 = this.F;
                            float v1_2 = (v1_1 + v0_1);
                            if (v1_2 >= 0) {
                                if (v1_2 <= 1065353216) {
                                    v5_0 = v1_2;
                                } else {
                                    v5_0 = 1065353216;
                                }
                            }
                            if (v5_0 != v0_1) {
                                this.B = v10_3;
                                this.setThumbPosition(v5_0);
                            }
                            return 1;
                        }
                    }
                } else {
                    if (v1_11 != 3) {
                        return super.onTouchEvent(p10);
                    }
                }
            }
            if (this.z != 2) {
                this.z = 0;
                v0_0.clear();
            } else {
                float v1_6;
                this.z = 0;
                if ((p10.getAction() != 1) || (!this.isEnabled())) {
                    v1_6 = 0;
                } else {
                    v1_6 = 1;
                }
                float v0_3;
                boolean v6_0 = this.isChecked();
                if (v1_6 == 0) {
                    v0_3 = v6_0;
                } else {
                    v0_0.computeCurrentVelocity(1000);
                    float v0_4 = v0_0.getXVelocity();
                    if (Math.abs(v0_4) <= ((float) this.E)) {
                        v0_3 = this.getTargetCheckedState();
                    } else {
                        if (this.getLayoutDirection() != 1) {
                            if (v0_4 <= 0) {
                                v0_3 = 0;
                                if (v0_3 != v6_0) {
                                    this.playSoundEffect(0);
                                }
                                this.setChecked(v0_3);
                                float v0_7 = android.view.MotionEvent.obtain(p10);
                                v0_7.setAction(3);
                                super.onTouchEvent(v0_7);
                                v0_7.recycle();
                                super.onTouchEvent(p10);
                                return 1;
                            }
                        } else {
                            if (v0_4 >= 0) {
                            }
                        }
                        v0_3 = 1;
                    }
                }
            }
        }
        return super.onTouchEvent(p10);
    }

    public void setAllCaps(boolean p2)
    {
        super.setAllCaps(p2);
        this.getEmojiTextViewHelper().c(p2);
        return;
    }

    public void setChecked(boolean p8)
    {
        super.setChecked(p8);
        android.animation.ObjectAnimator v8_1 = this.isChecked();
        if (v8_1 == null) {
            if (android.os.Build$VERSION.SDK_INT >= 30) {
                android.animation.ObjectAnimator v0_0 = this.w;
                if (v0_0 == null) {
                    v0_0 = this.getResources().getString(2131951631);
                }
                new q0.e0(2131362484, CharSequence, 64, 30, 2).g(this, v0_0);
            }
        } else {
            if (android.os.Build$VERSION.SDK_INT >= 30) {
                android.animation.ObjectAnimator v0_5 = this.u;
                if (v0_5 == null) {
                    v0_5 = this.getResources().getString(2131951632);
                }
                new q0.e0(2131362484, CharSequence, 64, 30, 2).g(this, v0_5);
            }
        }
        int v1_0 = 0;
        if ((this.getWindowToken() == null) || (!this.isLaidOut())) {
            android.animation.ObjectAnimator v0_11 = this.T;
            if (v0_11 != null) {
                v0_11.cancel();
            }
            if (v8_1 != null) {
                v1_0 = 1065353216;
            }
            this.setThumbPosition(v1_0);
            return;
        } else {
            if (v8_1 != null) {
                v1_0 = 1065353216;
            }
            android.animation.ObjectAnimator v0_12 = new float[1];
            v0_12[0] = v1_0;
            android.animation.ObjectAnimator v0_13 = android.animation.ObjectAnimator.ofFloat(this, androidx.appcompat.widget.SwitchCompat.a0, v0_12);
            this.T = v0_13;
            v0_13.setDuration(250);
            this.T.setAutoCancel(1);
            this.T.start();
            return;
        }
    }

    public void setCustomSelectionActionModeCallback(android.view.ActionMode$Callback p1)
    {
        super.setCustomSelectionActionModeCallback(c4.b.i0(p1, this));
        return;
    }

    public void setEmojiCompatEnabled(boolean p2)
    {
        this.getEmojiTextViewHelper().d(p2);
        this.setTextOnInternal(this.u);
        this.setTextOffInternal(this.w);
        this.requestLayout();
        return;
    }

    public final void setEnforceSwitchWidth(boolean p1)
    {
        this.N = p1;
        this.invalidate();
        return;
    }

    public void setFilters(android.text.InputFilter[] p2)
    {
        super.setFilters(this.getEmojiTextViewHelper().a(p2));
        return;
    }

    public void setShowText(boolean p2)
    {
        if (this.y != p2) {
            this.y = p2;
            this.requestLayout();
            if (p2) {
                this.d();
            }
        }
        return;
    }

    public void setSplitTrack(boolean p1)
    {
        this.t = p1;
        this.invalidate();
        return;
    }

    public void setSwitchMinWidth(int p1)
    {
        this.r = p1;
        this.requestLayout();
        return;
    }

    public void setSwitchPadding(int p1)
    {
        this.s = p1;
        this.requestLayout();
        return;
    }

    public void setSwitchTypeface(android.graphics.Typeface p3)
    {
        android.text.TextPaint v0 = this.O;
        if (((v0.getTypeface() != null) && (!v0.getTypeface().equals(p3))) || ((v0.getTypeface() == null) && (p3 != null))) {
            v0.setTypeface(p3);
            this.requestLayout();
            this.invalidate();
        }
        return;
    }

    public void setTextOff(CharSequence p7)
    {
        this.setTextOffInternal(p7);
        this.requestLayout();
        if ((!this.isChecked()) && (android.os.Build$VERSION.SDK_INT >= 30)) {
            String v7_2 = this.w;
            if (v7_2 == null) {
                v7_2 = this.getResources().getString(2131951631);
            }
            new q0.e0(2131362484, CharSequence, 64, 30, 2).g(this, v7_2);
        }
        return;
    }

    public void setTextOn(CharSequence p7)
    {
        this.setTextOnInternal(p7);
        this.requestLayout();
        if ((this.isChecked()) && (android.os.Build$VERSION.SDK_INT >= 30)) {
            String v7_2 = this.u;
            if (v7_2 == null) {
                v7_2 = this.getResources().getString(2131951632);
            }
            new q0.e0(2131362484, CharSequence, 64, 30, 2).g(this, v7_2);
        }
        return;
    }

    public void setThumbDrawable(android.graphics.drawable.Drawable p3)
    {
        android.graphics.drawable.Drawable v0 = this.a;
        if (v0 != null) {
            v0.setCallback(0);
        }
        this.a = p3;
        if (p3 != null) {
            p3.setCallback(this);
        }
        this.requestLayout();
        return;
    }

    public void setThumbPosition(float p1)
    {
        this.F = p1;
        this.invalidate();
        return;
    }

    public void setThumbResource(int p2)
    {
        this.setThumbDrawable(j5.t1.A(this.getContext(), p2));
        return;
    }

    public void setThumbTextPadding(int p1)
    {
        this.q = p1;
        this.requestLayout();
        return;
    }

    public void setThumbTintList(android.content.res.ColorStateList p1)
    {
        this.b = p1;
        this.d = 1;
        this.a();
        return;
    }

    public void setThumbTintMode(android.graphics.PorterDuff$Mode p1)
    {
        this.c = p1;
        this.e = 1;
        this.a();
        return;
    }

    public void setTrackDrawable(android.graphics.drawable.Drawable p3)
    {
        android.graphics.drawable.Drawable v0 = this.f;
        if (v0 != null) {
            v0.setCallback(0);
        }
        this.f = p3;
        if (p3 != null) {
            p3.setCallback(this);
        }
        this.requestLayout();
        return;
    }

    public void setTrackResource(int p2)
    {
        this.setTrackDrawable(j5.t1.A(this.getContext(), p2));
        return;
    }

    public void setTrackTintList(android.content.res.ColorStateList p1)
    {
        this.m = p1;
        this.o = 1;
        this.b();
        return;
    }

    public void setTrackTintMode(android.graphics.PorterDuff$Mode p1)
    {
        this.n = p1;
        this.p = 1;
        this.b();
        return;
    }

    public final void toggle()
    {
        this.setChecked((this.isChecked() ^ 1));
        return;
    }

    public final boolean verifyDrawable(android.graphics.drawable.Drawable p2)
    {
        if ((!super.verifyDrawable(p2)) && ((p2 != this.a) && (p2 != this.f))) {
            return 0;
        } else {
            return 1;
        }
    }
}
