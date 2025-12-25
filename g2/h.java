package g2;
public abstract class h extends android.graphics.drawable.Drawable {
    public android.graphics.drawable.Drawable a;

    public void applyTheme(android.content.res.Resources$Theme p2)
    {
        android.graphics.drawable.Drawable v0 = this.a;
        if (v0 != null) {
            v0.applyTheme(p2);
        }
        return;
    }

    public final void clearColorFilter()
    {
        android.graphics.drawable.Drawable v0 = this.a;
        if (v0 == null) {
            super.clearColorFilter();
            return;
        } else {
            v0.clearColorFilter();
            return;
        }
    }

    public final android.graphics.drawable.Drawable getCurrent()
    {
        android.graphics.drawable.Drawable v0_0 = this.a;
        if (v0_0 == null) {
            return super.getCurrent();
        } else {
            return v0_0.getCurrent();
        }
    }

    public final int getMinimumHeight()
    {
        int v0_0 = this.a;
        if (v0_0 == 0) {
            return super.getMinimumHeight();
        } else {
            return v0_0.getMinimumHeight();
        }
    }

    public final int getMinimumWidth()
    {
        int v0_0 = this.a;
        if (v0_0 == 0) {
            return super.getMinimumWidth();
        } else {
            return v0_0.getMinimumWidth();
        }
    }

    public final boolean getPadding(android.graphics.Rect p2)
    {
        android.graphics.drawable.Drawable v0 = this.a;
        if (v0 == null) {
            return super.getPadding(p2);
        } else {
            return v0.getPadding(p2);
        }
    }

    public final int[] getState()
    {
        int[] v0_0 = this.a;
        if (v0_0 == null) {
            return super.getState();
        } else {
            return v0_0.getState();
        }
    }

    public final android.graphics.Region getTransparentRegion()
    {
        android.graphics.Region v0_0 = this.a;
        if (v0_0 == null) {
            return super.getTransparentRegion();
        } else {
            return v0_0.getTransparentRegion();
        }
    }

    public final void jumpToCurrentState()
    {
        android.graphics.drawable.Drawable v0 = this.a;
        if (v0 != null) {
            v0.jumpToCurrentState();
        }
        return;
    }

    public boolean onLevelChange(int p2)
    {
        android.graphics.drawable.Drawable v0 = this.a;
        if (v0 == null) {
            return super.onLevelChange(p2);
        } else {
            return v0.setLevel(p2);
        }
    }

    public final void setChangingConfigurations(int p2)
    {
        android.graphics.drawable.Drawable v0 = this.a;
        if (v0 == null) {
            super.setChangingConfigurations(p2);
            return;
        } else {
            v0.setChangingConfigurations(p2);
            return;
        }
    }

    public final void setColorFilter(int p2, android.graphics.PorterDuff$Mode p3)
    {
        android.graphics.drawable.Drawable v0 = this.a;
        if (v0 == null) {
            super.setColorFilter(p2, p3);
            return;
        } else {
            v0.setColorFilter(p2, p3);
            return;
        }
    }

    public final void setFilterBitmap(boolean p2)
    {
        android.graphics.drawable.Drawable v0 = this.a;
        if (v0 != null) {
            v0.setFilterBitmap(p2);
        }
        return;
    }

    public final void setHotspot(float p2, float p3)
    {
        android.graphics.drawable.Drawable v0 = this.a;
        if (v0 != null) {
            v0.setHotspot(p2, p3);
        }
        return;
    }

    public final void setHotspotBounds(int p2, int p3, int p4, int p5)
    {
        android.graphics.drawable.Drawable v0 = this.a;
        if (v0 != null) {
            v0.setHotspotBounds(p2, p3, p4, p5);
        }
        return;
    }

    public final boolean setState(int[] p2)
    {
        android.graphics.drawable.Drawable v0 = this.a;
        if (v0 == null) {
            return super.setState(p2);
        } else {
            return v0.setState(p2);
        }
    }
}
