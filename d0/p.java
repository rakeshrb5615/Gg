package d0;
public final class p {
    public final android.content.Context a;
    public final java.util.ArrayList b;
    public final java.util.ArrayList c;
    public final java.util.ArrayList d;
    public CharSequence e;
    public CharSequence f;
    public android.app.PendingIntent g;
    public androidx.core.graphics.drawable.IconCompat h;
    public int i;
    public int j;
    public boolean k;
    public d0.q l;
    public boolean m;
    public android.os.Bundle n;
    public int o;
    public int p;
    public String q;
    public final boolean r;
    public final android.app.Notification s;
    public final java.util.ArrayList t;

    public p(android.content.Context p4, String p5)
    {
        this.b = new java.util.ArrayList();
        this.c = new java.util.ArrayList();
        this.d = new java.util.ArrayList();
        this.k = 1;
        this.m = 0;
        this.o = 0;
        this.p = 0;
        android.app.Notification v2_1 = new android.app.Notification();
        this.s = v2_1;
        this.a = p4;
        this.q = p5;
        v2_1.when = System.currentTimeMillis();
        v2_1.audioStreamType = -1;
        this.j = 0;
        this.t = new java.util.ArrayList();
        this.r = 1;
        return;
    }

    public static CharSequence b(CharSequence p2)
    {
        if (p2 != null) {
            if (p2.length() > 5120) {
                p2 = p2.subSequence(0, 5120);
            }
            return p2;
        } else {
            return p2;
        }
    }

    public final android.app.Notification a()
    {
        android.app.Notification v0_1 = new j6.s(this);
        android.os.Bundle v1_3 = ((d0.p) v0_1.d);
        String v2_1 = v1_3.l;
        if (v2_1 != null) {
            v2_1.a(v0_1);
        }
        android.app.Notification v0_2 = ((android.app.Notification$Builder) v0_1.c).build();
        if (v2_1 != null) {
            v1_3.l.getClass();
        }
        if (v2_1 != null) {
            android.os.Bundle v1_1 = v0_2.extras;
            if (v1_1 != null) {
                v1_1.putString("androidx.core.app.extra.COMPAT_TEMPLATE", v2_1.b());
            }
        }
        return v0_2;
    }

    public final void c(android.graphics.Bitmap p8)
    {
        android.graphics.Bitmap v8_1;
        if (p8 != null) {
            if (android.os.Build$VERSION.SDK_INT < 27) {
                int v0_10 = this.a.getResources();
                int v1_0 = v0_10.getDimensionPixelSize(2131165280);
                int v0_1 = v0_10.getDimensionPixelSize(2131165279);
                if ((p8.getWidth() > v1_0) || (p8.getHeight() > v0_1)) {
                    int v0_4 = Math.min((((double) v1_0) / ((double) Math.max(1, p8.getWidth()))), (((double) v0_1) / ((double) Math.max(1, p8.getHeight()))));
                    p8 = android.graphics.Bitmap.createScaledBitmap(p8, ((int) Math.ceil((((double) p8.getWidth()) * v0_4))), ((int) Math.ceil((((double) p8.getHeight()) * v0_4))), 1);
                }
            }
            Class vtmp5 = p8.getClass();
            int v0_9 = new androidx.core.graphics.drawable.IconCompat(1);
            v0_9.b = p8;
            v8_1 = v0_9;
        } else {
            v8_1 = 0;
        }
        this.h = v8_1;
        return;
    }

    public final void d(d0.q p2)
    {
        if (this.l != p2) {
            this.l = p2;
            if (p2.a != this) {
                p2.a = this;
                this.d(p2);
            }
        }
        return;
    }
}
