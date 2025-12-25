package n;
public final class f3 implements n.k1 {
    public androidx.appcompat.widget.Toolbar a;
    public int b;
    public android.view.View c;
    public android.graphics.drawable.Drawable d;
    public android.graphics.drawable.Drawable e;
    public android.graphics.drawable.Drawable f;
    public boolean g;
    public CharSequence h;
    public CharSequence i;
    public CharSequence j;
    public android.view.Window$Callback k;
    public boolean l;
    public n.k m;
    public int n;
    public android.graphics.drawable.Drawable o;

    public final void a(int p5)
    {
        androidx.appcompat.widget.Toolbar v0 = this.a;
        android.view.View v1_1 = (this.b ^ p5);
        this.b = p5;
        if (v1_1 != null) {
            if ((v1_1 & 4) != 0) {
                if ((p5 & 4) != 0) {
                    this.b();
                }
                if ((this.b & 4) == 0) {
                    v0.setNavigationIcon(0);
                } else {
                    CharSequence v2_2 = this.f;
                    if (v2_2 == null) {
                        v2_2 = this.o;
                    }
                    v0.setNavigationIcon(v2_2);
                }
            }
            if ((v1_1 & 3) != 0) {
                this.c();
            }
            if ((v1_1 & 8) != 0) {
                if ((p5 & 8) == 0) {
                    v0.setTitle(0);
                    v0.setSubtitle(0);
                } else {
                    v0.setTitle(this.h);
                    v0.setSubtitle(this.i);
                }
            }
            if ((v1_1 & 16) != 0) {
                android.view.View v1_3 = this.c;
                if (v1_3 != null) {
                    if ((p5 & 16) == 0) {
                        v0.removeView(v1_3);
                    } else {
                        v0.addView(v1_3);
                        return;
                    }
                }
            }
        }
        return;
    }

    public final void b()
    {
        androidx.appcompat.widget.Toolbar v0 = this.a;
        if ((this.b & 4) != 0) {
            if (!android.text.TextUtils.isEmpty(this.j)) {
                v0.setNavigationContentDescription(this.j);
            } else {
                v0.setNavigationContentDescription(this.n);
                return;
            }
        }
        return;
    }

    public final void c()
    {
        android.graphics.drawable.Drawable v0_1;
        android.graphics.drawable.Drawable v0_0 = this.b;
        if ((v0_0 & 2) == 0) {
            v0_1 = 0;
        } else {
            if ((v0_0 & 1) == 0) {
                v0_1 = this.d;
            } else {
                v0_1 = this.e;
                if (v0_1 == null) {
                    v0_1 = this.d;
                }
            }
        }
        this.a.setLogo(v0_1);
        return;
    }
}
