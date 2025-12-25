package g2;
public final class f extends g2.h implements android.graphics.drawable.Animatable {
    public final g2.d b;
    public final android.content.Context c;
    public f2.o d;
    public java.util.ArrayList e;
    public final g2.c f;

    public f(android.content.Context p1, int p2)
    {
        this.d = 0;
        this.e = 0;
        this.f = new g2.c(this);
        this.c = p1;
        this.b = new g2.d();
        return;
    }

    public final void applyTheme(android.content.res.Resources$Theme p2)
    {
        android.graphics.drawable.Drawable v0 = this.a;
        if (v0 != null) {
            v0.applyTheme(p2);
        }
        return;
    }

    public final boolean canApplyTheme()
    {
        int v0_0 = this.a;
        if (v0_0 == 0) {
            return 0;
        } else {
            return v0_0.canApplyTheme();
        }
    }

    public final void draw(android.graphics.Canvas p3)
    {
        g2.d v0_0 = this.a;
        if (v0_0 == null) {
            g2.d v0_1 = this.b;
            v0_1.a.draw(p3);
            if (v0_1.b.isStarted()) {
                this.invalidateSelf();
            }
            return;
        } else {
            v0_0.draw(p3);
            return;
        }
    }

    public final int getAlpha()
    {
        int v0_0 = this.a;
        if (v0_0 == 0) {
            return this.b.a.getAlpha();
        } else {
            return v0_0.getAlpha();
        }
    }

    public final int getChangingConfigurations()
    {
        int v0_0 = this.a;
        if (v0_0 == 0) {
            int v0_1 = super.getChangingConfigurations();
            this.b.getClass();
            return v0_1;
        } else {
            return v0_0.getChangingConfigurations();
        }
    }

    public final android.graphics.ColorFilter getColorFilter()
    {
        android.graphics.ColorFilter v0_0 = this.a;
        if (v0_0 == null) {
            return this.b.a.getColorFilter();
        } else {
            return v0_0.getColorFilter();
        }
    }

    public final android.graphics.drawable.Drawable$ConstantState getConstantState()
    {
        if (this.a == null) {
            return 0;
        } else {
            return new g2.e(this.a.getConstantState());
        }
    }

    public final int getIntrinsicHeight()
    {
        int v0_0 = this.a;
        if (v0_0 == 0) {
            return this.b.a.getIntrinsicHeight();
        } else {
            return v0_0.getIntrinsicHeight();
        }
    }

    public final int getIntrinsicWidth()
    {
        int v0_0 = this.a;
        if (v0_0 == 0) {
            return this.b.a.getIntrinsicWidth();
        } else {
            return v0_0.getIntrinsicWidth();
        }
    }

    public final int getOpacity()
    {
        int v0_0 = this.a;
        if (v0_0 == 0) {
            return this.b.a.getOpacity();
        } else {
            return v0_0.getOpacity();
        }
    }

    public final void inflate(android.content.res.Resources p2, org.xmlpull.v1.XmlPullParser p3, android.util.AttributeSet p4)
    {
        this.inflate(p2, p3, p4, 0);
        return;
    }

    public final void inflate(android.content.res.Resources p9, org.xmlpull.v1.XmlPullParser p10, android.util.AttributeSet p11, android.content.res.Resources$Theme p12)
    {
        android.content.res.TypedArray v0_0 = this.a;
        if (v0_0 == null) {
            android.content.res.TypedArray v0_1 = p10.getEventType();
            int v1_1 = (p10.getDepth() + 1);
            while(true) {
                r.e v3_1 = this.b;
                if ((v0_1 == 1) || ((p10.getDepth() < v1_1) && (v0_1 == 3))) {
                    if (v3_1.b == null) {
                        v3_1.b = new android.animation.AnimatorSet();
                    }
                    v3_1.b.playTogether(v3_1.c);
                    return;
                } else {
                    if (v0_1 == 2) {
                        android.content.res.TypedArray v0_2 = p10.getName();
                        if (!"animated-vector".equals(v0_2)) {
                            if ("target".equals(v0_2)) {
                                android.content.res.TypedArray v0_5 = p9.obtainAttributes(p11, g2.a.f);
                                String v4_6 = v0_5.getString(0);
                                android.animation.Animator v6_0 = v0_5.getResourceId(1, 0);
                                if (v6_0 != null) {
                                    r.e v7_0 = this.c;
                                    if (v7_0 == null) {
                                        break;
                                    }
                                    android.animation.Animator v6_1 = android.animation.AnimatorInflater.loadAnimator(v7_0, v6_0);
                                    v6_1.setTarget(v3_1.a.b.b.o.get(v4_6));
                                    if (v3_1.c == null) {
                                        v3_1.c = new java.util.ArrayList();
                                        v3_1.d = new r.e(0);
                                    }
                                    v3_1.c.add(v6_1);
                                    v3_1.d.put(v6_1, v4_6);
                                }
                                v0_5.recycle();
                            }
                        } else {
                            android.content.res.TypedArray v0_7 = g0.b.g(p9, p12, p11, g2.a.e);
                            String v4_7 = v0_7.getResourceId(0, 0);
                            if (v4_7 != null) {
                                android.animation.Animator v6_3 = new g2.q();
                                v6_3.a = p9.getDrawable(v4_7, p12);
                                new g2.p(v6_3.a.getConstantState());
                                v6_3.f = 0;
                                v6_3.setCallback(this.f);
                                String v4_11 = v3_1.a;
                                if (v4_11 != null) {
                                    v4_11.setCallback(0);
                                }
                                v3_1.a = v6_3;
                            }
                            v0_7.recycle();
                        }
                    }
                    v0_1 = p10.next();
                }
            }
            v0_5.recycle();
            throw new IllegalStateException("Context can\'t be null when inflating animators");
        } else {
            v0_0.inflate(p9, p10, p11, p12);
            return;
        }
    }

    public final boolean isAutoMirrored()
    {
        boolean v0_0 = this.a;
        if (!v0_0) {
            return this.b.a.isAutoMirrored();
        } else {
            return v0_0.isAutoMirrored();
        }
    }

    public final boolean isRunning()
    {
        boolean v0_0 = this.a;
        if (!v0_0) {
            return this.b.b.isRunning();
        } else {
            return ((android.graphics.drawable.AnimatedVectorDrawable) v0_0).isRunning();
        }
    }

    public final boolean isStateful()
    {
        boolean v0_0 = this.a;
        if (!v0_0) {
            return this.b.a.isStateful();
        } else {
            return v0_0.isStateful();
        }
    }

    public final android.graphics.drawable.Drawable mutate()
    {
        android.graphics.drawable.Drawable v0 = this.a;
        if (v0 != null) {
            v0.mutate();
        }
        return this;
    }

    public final void onBoundsChange(android.graphics.Rect p2)
    {
        g2.q v0_0 = this.a;
        if (v0_0 == null) {
            this.b.a.setBounds(p2);
            return;
        } else {
            v0_0.setBounds(p2);
            return;
        }
    }

    public final boolean onLevelChange(int p2)
    {
        g2.q v0_0 = this.a;
        if (v0_0 == null) {
            return this.b.a.setLevel(p2);
        } else {
            return v0_0.setLevel(p2);
        }
    }

    public final boolean onStateChange(int[] p2)
    {
        g2.q v0_0 = this.a;
        if (v0_0 == null) {
            return this.b.a.setState(p2);
        } else {
            return v0_0.setState(p2);
        }
    }

    public final void setAlpha(int p2)
    {
        g2.q v0_0 = this.a;
        if (v0_0 == null) {
            this.b.a.setAlpha(p2);
            return;
        } else {
            v0_0.setAlpha(p2);
            return;
        }
    }

    public final void setAutoMirrored(boolean p2)
    {
        g2.q v0_0 = this.a;
        if (v0_0 == null) {
            this.b.a.setAutoMirrored(p2);
            return;
        } else {
            v0_0.setAutoMirrored(p2);
            return;
        }
    }

    public final void setColorFilter(android.graphics.ColorFilter p2)
    {
        g2.q v0_0 = this.a;
        if (v0_0 == null) {
            this.b.a.setColorFilter(p2);
            return;
        } else {
            v0_0.setColorFilter(p2);
            return;
        }
    }

    public final void setTint(int p2)
    {
        g2.q v0_0 = this.a;
        if (v0_0 == null) {
            this.b.a.setTint(p2);
            return;
        } else {
            q4.b.Q(v0_0, p2);
            return;
        }
    }

    public final void setTintList(android.content.res.ColorStateList p2)
    {
        g2.q v0_0 = this.a;
        if (v0_0 == null) {
            this.b.a.setTintList(p2);
            return;
        } else {
            v0_0.setTintList(p2);
            return;
        }
    }

    public final void setTintMode(android.graphics.PorterDuff$Mode p2)
    {
        g2.q v0_0 = this.a;
        if (v0_0 == null) {
            this.b.a.setTintMode(p2);
            return;
        } else {
            v0_0.setTintMode(p2);
            return;
        }
    }

    public final boolean setVisible(boolean p2, boolean p3)
    {
        g2.q v0_0 = this.a;
        if (v0_0 == null) {
            this.b.a.setVisible(p2, p3);
            return super.setVisible(p2, p3);
        } else {
            return v0_0.setVisible(p2, p3);
        }
    }

    public final void start()
    {
        android.animation.AnimatorSet v0_0 = this.a;
        if (v0_0 == null) {
            android.animation.AnimatorSet v0_2 = this.b;
            if (!v0_2.b.isStarted()) {
                v0_2.b.start();
                this.invalidateSelf();
                return;
            } else {
                return;
            }
        } else {
            ((android.graphics.drawable.AnimatedVectorDrawable) v0_0).start();
            return;
        }
    }

    public final void stop()
    {
        android.animation.AnimatorSet v0_0 = this.a;
        if (v0_0 == null) {
            this.b.b.end();
            return;
        } else {
            ((android.graphics.drawable.AnimatedVectorDrawable) v0_0).stop();
            return;
        }
    }
}
