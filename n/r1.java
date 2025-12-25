package n;
public final class r1 extends android.graphics.drawable.Drawable implements android.graphics.drawable.Drawable$Callback {
    public android.graphics.drawable.Drawable a;
    public boolean b;

    public final void a(android.graphics.Canvas p2)
    {
        this.a.draw(p2);
        return;
    }

    public final void b(float p2, float p3)
    {
        this.a.setHotspot(p2, p3);
        return;
    }

    public final void c(int p2, int p3, int p4, int p5)
    {
        this.a.setHotspotBounds(p2, p3, p4, p5);
        return;
    }

    public final boolean d(boolean p2, boolean p3)
    {
        if ((!super.setVisible(p2, p3)) && (!this.a.setVisible(p2, p3))) {
            return 0;
        } else {
            return 1;
        }
    }

    public final void draw(android.graphics.Canvas p2)
    {
        if (this.b) {
            this.a(p2);
        }
        return;
    }

    public final int getChangingConfigurations()
    {
        return this.a.getChangingConfigurations();
    }

    public final android.graphics.drawable.Drawable getCurrent()
    {
        return this.a.getCurrent();
    }

    public int getIntrinsicHeight()
    {
        return this.a.getIntrinsicHeight();
    }

    public int getIntrinsicWidth()
    {
        return this.a.getIntrinsicWidth();
    }

    public final int getMinimumHeight()
    {
        return this.a.getMinimumHeight();
    }

    public final int getMinimumWidth()
    {
        return this.a.getMinimumWidth();
    }

    public final int getOpacity()
    {
        return this.a.getOpacity();
    }

    public final boolean getPadding(android.graphics.Rect p2)
    {
        return this.a.getPadding(p2);
    }

    public final int[] getState()
    {
        return this.a.getState();
    }

    public final android.graphics.Region getTransparentRegion()
    {
        return this.a.getTransparentRegion();
    }

    public final void invalidateDrawable(android.graphics.drawable.Drawable p1)
    {
        this.invalidateSelf();
        return;
    }

    public final boolean isAutoMirrored()
    {
        return this.a.isAutoMirrored();
    }

    public final boolean isStateful()
    {
        return this.a.isStateful();
    }

    public final void jumpToCurrentState()
    {
        this.a.jumpToCurrentState();
        return;
    }

    public final void onBoundsChange(android.graphics.Rect p2)
    {
        this.a.setBounds(p2);
        return;
    }

    public final boolean onLevelChange(int p2)
    {
        return this.a.setLevel(p2);
    }

    public final void scheduleDrawable(android.graphics.drawable.Drawable p1, Runnable p2, long p3)
    {
        this.scheduleSelf(p2, p3);
        return;
    }

    public final void setAlpha(int p2)
    {
        this.a.setAlpha(p2);
        return;
    }

    public final void setAutoMirrored(boolean p2)
    {
        this.a.setAutoMirrored(p2);
        return;
    }

    public final void setChangingConfigurations(int p2)
    {
        this.a.setChangingConfigurations(p2);
        return;
    }

    public final void setColorFilter(android.graphics.ColorFilter p2)
    {
        this.a.setColorFilter(p2);
        return;
    }

    public final void setDither(boolean p2)
    {
        this.a.setDither(p2);
        return;
    }

    public final void setFilterBitmap(boolean p2)
    {
        this.a.setFilterBitmap(p2);
        return;
    }

    public final void setHotspot(float p2, float p3)
    {
        if (this.b) {
            this.b(p2, p3);
        }
        return;
    }

    public final void setHotspotBounds(int p2, int p3, int p4, int p5)
    {
        if (this.b) {
            this.c(p2, p3, p4, p5);
        }
        return;
    }

    public final boolean setState(int[] p2)
    {
        if (!this.b) {
            return 0;
        } else {
            return this.a.setState(p2);
        }
    }

    public final void setTint(int p2)
    {
        this.a.setTint(p2);
        return;
    }

    public final void setTintList(android.content.res.ColorStateList p2)
    {
        this.a.setTintList(p2);
        return;
    }

    public final void setTintMode(android.graphics.PorterDuff$Mode p2)
    {
        this.a.setTintMode(p2);
        return;
    }

    public final boolean setVisible(boolean p2, boolean p3)
    {
        if (!this.b) {
            return 0;
        } else {
            return this.d(p2, p3);
        }
    }

    public final void unscheduleDrawable(android.graphics.drawable.Drawable p1, Runnable p2)
    {
        this.unscheduleSelf(p2);
        return;
    }
}
