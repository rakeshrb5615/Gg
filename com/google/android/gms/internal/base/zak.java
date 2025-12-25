package com.google.android.gms.internal.base;
public final class zak extends android.graphics.drawable.Drawable implements android.graphics.drawable.Drawable$Callback {
    private int zaa;
    private long zab;
    private int zac;
    private int zad;
    private int zae;
    private int zaf;
    private boolean zag;
    private boolean zah;
    private com.google.android.gms.internal.base.zaj zai;
    private android.graphics.drawable.Drawable zaj;
    private android.graphics.drawable.Drawable zak;
    private boolean zal;
    private boolean zam;
    private boolean zan;
    private int zao;

    public zak(android.graphics.drawable.Drawable p3, android.graphics.drawable.Drawable p4)
    {
        this(0);
        if (p3 == null) {
            p3 = com.google.android.gms.internal.base.zai.zaa();
        }
        this.zaj = p3;
        p3.setCallback(this);
        int v0_2 = this.zai;
        v0_2.zab = (p3.getChangingConfigurations() | v0_2.zab);
        if (p4 == 0) {
            p4 = com.google.android.gms.internal.base.zai.zaa();
        }
        this.zak = p4;
        p4.setCallback(this);
        com.google.android.gms.internal.base.zaj v3_3 = this.zai;
        v3_3.zab = (p4.getChangingConfigurations() | v3_3.zab);
        return;
    }

    public zak(com.google.android.gms.internal.base.zaj p3)
    {
        this.zaa = 0;
        this.zad = 255;
        this.zaf = 0;
        this.zag = 1;
        this.zai = new com.google.android.gms.internal.base.zaj(p3);
        return;
    }

    public final void draw(android.graphics.Canvas p8)
    {
        int v4_5;
        int v0_0 = this.zaa;
        int v2 = 0;
        if (v0_0 == 1) {
            this.zab = android.os.SystemClock.uptimeMillis();
            this.zaa = 2;
            v4_5 = 0;
        } else {
            if ((v0_0 != 2) || (this.zab < 0)) {
                v4_5 = 1;
            } else {
                int v0_6 = (((float) (android.os.SystemClock.uptimeMillis() - this.zab)) / ((float) this.zae));
                if (v0_6 < 1065353216) {
                    v4_5 = 0;
                } else {
                    v4_5 = 1;
                }
                if (v4_5 != 0) {
                    this.zaa = 0;
                }
                this.zaf = ((int) ((((float) this.zac) * Math.min(v0_6, 1065353216)) + 0));
            }
        }
        int v0_10 = this.zaf;
        float v1_6 = this.zag;
        android.graphics.drawable.Drawable v5 = this.zaj;
        android.graphics.drawable.Drawable v6 = this.zak;
        if (v4_5 == 0) {
            if (v1_6 != 0) {
                v5.setAlpha((this.zad - v0_10));
                v2 = 1;
            }
            v5.draw(p8);
            if (v2 != 0) {
                v5.setAlpha(this.zad);
            }
            if (v0_10 > 0) {
                v6.setAlpha(v0_10);
                v6.draw(p8);
                v6.setAlpha(this.zad);
            }
            this.invalidateSelf();
            return;
        } else {
            if (v1_6 == 0) {
                v2 = v0_10;
                v5.draw(p8);
                v0_10 = v2;
            } else {
                if (v0_10 == 0) {
                }
            }
            float v1_10 = this.zad;
            if (v0_10 == v1_10) {
                v6.setAlpha(v1_10);
                v6.draw(p8);
            }
            return;
        }
    }

    public final int getChangingConfigurations()
    {
        int v1_0 = this.zai;
        return ((super.getChangingConfigurations() | v1_0.zaa) | v1_0.zab);
    }

    public final android.graphics.drawable.Drawable$ConstantState getConstantState()
    {
        if (!this.zac()) {
            return 0;
        } else {
            this.zai.zaa = this.getChangingConfigurations();
            return this.zai;
        }
    }

    public final int getIntrinsicHeight()
    {
        return Math.max(this.zaj.getIntrinsicHeight(), this.zak.getIntrinsicHeight());
    }

    public final int getIntrinsicWidth()
    {
        return Math.max(this.zaj.getIntrinsicWidth(), this.zak.getIntrinsicWidth());
    }

    public final int getOpacity()
    {
        if (!this.zan) {
            this.zao = android.graphics.drawable.Drawable.resolveOpacity(this.zaj.getOpacity(), this.zak.getOpacity());
            this.zan = 1;
        }
        return this.zao;
    }

    public final void invalidateDrawable(android.graphics.drawable.Drawable p1)
    {
        p1 = this.getCallback();
        if (p1 != null) {
            p1.invalidateDrawable(this);
        }
        return;
    }

    public final android.graphics.drawable.Drawable mutate()
    {
        if ((this.zah) || (super.mutate() != this)) {
            return this;
        } else {
            if (!this.zac()) {
                throw new IllegalStateException("One or more children of this LayerDrawable does not have constant state; this drawable cannot be mutated.");
            } else {
                this.zaj.mutate();
                this.zak.mutate();
                this.zah = 1;
                return this;
            }
        }
    }

    public final void onBoundsChange(android.graphics.Rect p2)
    {
        this.zaj.setBounds(p2);
        this.zak.setBounds(p2);
        return;
    }

    public final void scheduleDrawable(android.graphics.drawable.Drawable p1, Runnable p2, long p3)
    {
        p1 = this.getCallback();
        if (p1 != null) {
            p1.scheduleDrawable(this, p2, p3);
        }
        return;
    }

    public final void setAlpha(int p3)
    {
        if (this.zaf == this.zad) {
            this.zaf = p3;
        }
        this.zad = p3;
        this.invalidateSelf();
        return;
    }

    public final void setColorFilter(android.graphics.ColorFilter p2)
    {
        this.zaj.setColorFilter(p2);
        this.zak.setColorFilter(p2);
        return;
    }

    public final void unscheduleDrawable(android.graphics.drawable.Drawable p1, Runnable p2)
    {
        p1 = this.getCallback();
        if (p1 != null) {
            p1.unscheduleDrawable(this, p2);
        }
        return;
    }

    public final android.graphics.drawable.Drawable zaa()
    {
        return this.zak;
    }

    public final void zab(int p1)
    {
        this.zac = this.zad;
        this.zaf = 0;
        this.zae = 250;
        this.zaa = 1;
        this.invalidateSelf();
        return;
    }

    public final boolean zac()
    {
        if (!this.zal) {
            int v1 = 0;
            if ((this.zaj.getConstantState() != null) && (this.zak.getConstantState() != null)) {
                v1 = 1;
            }
            this.zam = v1;
            this.zal = 1;
        }
        return this.zam;
    }
}
