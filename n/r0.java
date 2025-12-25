package n;
public final class r0 extends android.widget.Spinner {
    public static final int[] o;
    public final n.p a;
    public final android.content.Context b;
    public final n.i0 c;
    public android.widget.SpinnerAdapter d;
    public final boolean e;
    public final n.q0 f;
    public int m;
    public final android.graphics.Rect n;

    static r0()
    {
        n.r0.o = new int[] {16843505});
        return;
    }

    public r0(android.content.Context p13, android.util.AttributeSet p14)
    {
        super(p13, p14, 2130969761);
        super.n = new android.graphics.Rect();
        n.t2.a(super, super.getContext());
        CharSequence[] v1_6 = g.a.u;
        b8.g v2 = b8.g.p(p13, p14, v1_6, 2130969761);
        android.widget.ArrayAdapter v3_1 = ((android.content.res.TypedArray) v2.c);
        super.a = new n.p(super);
        int v4_3 = v3_1.getResourceId(4, 0);
        if (v4_3 == 0) {
            super.b = p13;
        } else {
            super.b = new l.c(p13, v4_3);
        }
        int v4_4 = -1;
        int v6_2 = 0;
        try {
            String v7_1 = p13.obtainStyledAttributes(p14, n.r0.o, 2130969761, 0);
            try {
                if (!v7_1.hasValue(0)) {
                    v7_1.recycle();
                    if (v4_4 == 0) {
                        CharSequence[] v1_3 = new n.k0(super);
                        super.f = v1_3;
                        v1_3.c = v3_1.getString(2);
                    } else {
                        if (v4_4 == 1) {
                            int v4_7 = new n.o0(super, super.b, p14);
                            CharSequence[] v1_5 = b8.g.p(super.b, p14, v1_6, 2130969761);
                            super.m = ((android.content.res.TypedArray) v1_5.c).getLayoutDimension(3, -2);
                            v4_7.h(v1_5.i(1));
                            v4_7.I = v3_1.getString(2);
                            v1_5.r();
                            super.f = v4_7;
                            super.c = new n.i0(super, super, v4_7);
                        }
                    }
                    CharSequence[] v1_9 = v3_1.getTextArray(0);
                    if (v1_9 != null) {
                        android.widget.ArrayAdapter v3_3 = new android.widget.ArrayAdapter(p13, 17367048, v1_9);
                        v3_3.setDropDownViewResource(2131558550);
                        super.setAdapter(v3_3);
                    }
                    v2.r();
                    super.e = 1;
                    n.p v13_3 = super.d;
                    if (v13_3 != null) {
                        super.setAdapter(v13_3);
                        super.d = 0;
                    }
                    super.a.q(p14, 2130969761);
                    return;
                } else {
                    v4_4 = v7_1.getInt(0, 0);
                }
            } catch (int v8_0) {
                android.util.Log.i("AppCompatSpinner", "Could not read android:spinnerMode", v8_0);
                if (v7_1 == null) {
                } else {
                }
            }
        } catch (int v8_0) {
            v7_1 = 0;
        } catch (n.p v13_1) {
            if (v6_2 != 0) {
                v6_2.recycle();
            }
            throw v13_1;
        } catch (n.p v13_1) {
            v6_2 = v7_1;
        }
    }

    public final int a(android.widget.SpinnerAdapter p11, android.graphics.drawable.Drawable p12)
    {
        int v0 = 0;
        if (p11 != 0) {
            int v1_1 = android.view.View$MeasureSpec.makeMeasureSpec(this.getMeasuredWidth(), 0);
            int v2_1 = android.view.View$MeasureSpec.makeMeasureSpec(this.getMeasuredHeight(), 0);
            int v3_1 = Math.max(0, this.getSelectedItemPosition());
            int v4_1 = Math.min(p11.getCount(), (v3_1 + 15));
            int v6 = Math.max(0, (v3_1 - (15 - (v4_1 - v3_1))));
            android.view.View v7 = 0;
            int v3_4 = 0;
            while (v6 < v4_1) {
                int v8_0 = p11.getItemViewType(v6);
                if (v8_0 != v0) {
                    v7 = 0;
                    v0 = v8_0;
                }
                v7 = p11.getView(v6, v7, this);
                if (v7.getLayoutParams() == null) {
                    v7.setLayoutParams(new android.view.ViewGroup$LayoutParams(-2, -2));
                }
                v7.measure(v1_1, v2_1);
                v3_4 = Math.max(v3_4, v7.getMeasuredWidth());
                v6++;
            }
            if (p12 == 0) {
                return v3_4;
            } else {
                int v11_1 = this.n;
                p12.getPadding(v11_1);
                return ((v11_1.left + v11_1.right) + v3_4);
            }
        } else {
            return 0;
        }
    }

    public final void drawableStateChanged()
    {
        super.drawableStateChanged();
        n.p v0 = this.a;
        if (v0 != null) {
            v0.a();
        }
        return;
    }

    public int getDropDownHorizontalOffset()
    {
        int v0_0 = this.f;
        if (v0_0 == 0) {
            return super.getDropDownHorizontalOffset();
        } else {
            return v0_0.a();
        }
    }

    public int getDropDownVerticalOffset()
    {
        int v0_0 = this.f;
        if (v0_0 == 0) {
            return super.getDropDownVerticalOffset();
        } else {
            return v0_0.m();
        }
    }

    public int getDropDownWidth()
    {
        if (this.f == null) {
            return super.getDropDownWidth();
        } else {
            return this.m;
        }
    }

    public final n.q0 getInternalPopup()
    {
        return this.f;
    }

    public android.graphics.drawable.Drawable getPopupBackground()
    {
        android.graphics.drawable.Drawable v0_0 = this.f;
        if (v0_0 == null) {
            return super.getPopupBackground();
        } else {
            return v0_0.e();
        }
    }

    public android.content.Context getPopupContext()
    {
        return this.b;
    }

    public CharSequence getPrompt()
    {
        CharSequence v0_0 = this.f;
        if (v0_0 == null) {
            return super.getPrompt();
        } else {
            return v0_0.o();
        }
    }

    public android.content.res.ColorStateList getSupportBackgroundTintList()
    {
        int v0_0 = this.a;
        if (v0_0 == 0) {
            return 0;
        } else {
            return v0_0.o();
        }
    }

    public android.graphics.PorterDuff$Mode getSupportBackgroundTintMode()
    {
        int v0_0 = this.a;
        if (v0_0 == 0) {
            return 0;
        } else {
            return v0_0.p();
        }
    }

    public final void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        n.q0 v0 = this.f;
        if ((v0 != null) && (v0.b())) {
            v0.dismiss();
        }
        return;
    }

    public final void onMeasure(int p3, int p4)
    {
        super.onMeasure(p3, p4);
        if ((this.f != null) && (android.view.View$MeasureSpec.getMode(p3) == -2147483648)) {
            this.setMeasuredDimension(Math.min(Math.max(this.getMeasuredWidth(), this.a(this.getAdapter(), this.getBackground())), android.view.View$MeasureSpec.getSize(p3)), this.getMeasuredHeight());
        }
        return;
    }

    public final void onRestoreInstanceState(android.os.Parcelable p3)
    {
        super.onRestoreInstanceState(((n.p0) p3).getSuperState());
        if (((n.p0) p3).a) {
            android.view.ViewTreeObserver v3_3 = this.getViewTreeObserver();
            if (v3_3 != null) {
                v3_3.addOnGlobalLayoutListener(new m.d(this, 2));
            }
        }
        return;
    }

    public final android.os.Parcelable onSaveInstanceState()
    {
        int v1_0;
        n.p0 v0_1 = new n.p0(super.onSaveInstanceState());
        int v1_2 = this.f;
        if ((v1_2 == 0) || (!v1_2.b())) {
            v1_0 = 0;
        } else {
            v1_0 = 1;
        }
        v0_1.a = v1_0;
        return v0_1;
    }

    public final boolean onTouchEvent(android.view.MotionEvent p2)
    {
        boolean v0_0 = this.c;
        if ((!v0_0) || (!v0_0.onTouch(this, p2))) {
            return super.onTouchEvent(p2);
        } else {
            return 1;
        }
    }

    public final boolean performClick()
    {
        int v0_0 = this.f;
        if (v0_0 == 0) {
            return super.performClick();
        } else {
            if (!v0_0.b()) {
                v0_0.l(this.getTextDirection(), this.getTextAlignment());
            }
            return 1;
        }
    }

    public bridge synthetic void setAdapter(android.widget.Adapter p1)
    {
        this.setAdapter(((android.widget.SpinnerAdapter) p1));
        return;
    }

    public void setAdapter(android.widget.SpinnerAdapter p5)
    {
        if (this.e) {
            super.setAdapter(p5);
            n.q0 v0_1 = this.f;
            if (v0_1 != null) {
                android.content.res.Resources$Theme v1_1 = this.b;
                if (v1_1 == null) {
                    v1_1 = this.getContext();
                }
                android.content.res.Resources$Theme v1_0 = v1_1.getTheme();
                n.l0 v2_0 = new n.l0();
                v2_0.a = p5;
                if ((p5 instanceof android.widget.ListAdapter)) {
                    v2_0.b = ((android.widget.ListAdapter) p5);
                }
                if ((v1_0 != null) && ((p5 instanceof android.widget.ThemedSpinnerAdapter))) {
                    n.j0.a(((android.widget.ThemedSpinnerAdapter) p5), v1_0);
                }
                v0_1.p(v2_0);
            }
            return;
        } else {
            this.d = p5;
            return;
        }
    }

    public void setBackgroundDrawable(android.graphics.drawable.Drawable p1)
    {
        super.setBackgroundDrawable(p1);
        n.p v1_1 = this.a;
        if (v1_1 != null) {
            v1_1.r();
        }
        return;
    }

    public void setBackgroundResource(int p2)
    {
        super.setBackgroundResource(p2);
        n.p v0 = this.a;
        if (v0 != null) {
            v0.s(p2);
        }
        return;
    }

    public void setDropDownHorizontalOffset(int p2)
    {
        n.q0 v0 = this.f;
        if (v0 == null) {
            super.setDropDownHorizontalOffset(p2);
            return;
        } else {
            v0.j(p2);
            v0.k(p2);
            return;
        }
    }

    public void setDropDownVerticalOffset(int p2)
    {
        n.q0 v0 = this.f;
        if (v0 == null) {
            super.setDropDownVerticalOffset(p2);
            return;
        } else {
            v0.i(p2);
            return;
        }
    }

    public void setDropDownWidth(int p2)
    {
        if (this.f == null) {
            super.setDropDownWidth(p2);
            return;
        } else {
            this.m = p2;
            return;
        }
    }

    public void setPopupBackgroundDrawable(android.graphics.drawable.Drawable p2)
    {
        n.q0 v0 = this.f;
        if (v0 == null) {
            super.setPopupBackgroundDrawable(p2);
            return;
        } else {
            v0.h(p2);
            return;
        }
    }

    public void setPopupBackgroundResource(int p2)
    {
        this.setPopupBackgroundDrawable(j5.t1.A(this.getPopupContext(), p2));
        return;
    }

    public void setPrompt(CharSequence p2)
    {
        n.q0 v0 = this.f;
        if (v0 == null) {
            super.setPrompt(p2);
            return;
        } else {
            v0.g(p2);
            return;
        }
    }

    public void setSupportBackgroundTintList(android.content.res.ColorStateList p2)
    {
        n.p v0 = this.a;
        if (v0 != null) {
            v0.u(p2);
        }
        return;
    }

    public void setSupportBackgroundTintMode(android.graphics.PorterDuff$Mode p2)
    {
        n.p v0 = this.a;
        if (v0 != null) {
            v0.v(p2);
        }
        return;
    }
}
