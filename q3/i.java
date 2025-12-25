package q3;
public final class i {
    public final android.text.TextPaint a;
    public final l3.b b;
    public float c;
    public boolean d;
    public final ref.WeakReference e;
    public s3.d f;

    public i(q3.h p4)
    {
        this.a = new android.text.TextPaint(1);
        this.b = new l3.b(this, 1);
        this.d = 1;
        this.e = new ref.WeakReference(0);
        this.e = new ref.WeakReference(p4);
        return;
    }

    public final float a(String p4)
    {
        if (this.d) {
            float v2_1;
            android.text.TextPaint v1 = this.a;
            if (p4 != 0) {
                v2_1 = v1.measureText(p4, 0, p4.length());
            } else {
                v2_1 = 0;
            }
            this.c = v2_1;
            if (p4 != 0) {
                Math.abs(v1.getFontMetrics().ascent);
            }
            this.d = 0;
            return this.c;
        } else {
            return this.c;
        }
    }

    public final void b(s3.d p4, android.content.Context p5)
    {
        if (this.f != p4) {
            this.f = p4;
            if (p4 != 0) {
                android.text.TextPaint v0_1 = this.a;
                l3.b v1 = this.b;
                p4.e(p5, v0_1, v1);
                int[] v2_0 = ((q3.h) this.e.get());
                if (v2_0 != null) {
                    v0_1.drawableState = v2_0.getState();
                }
                p4.d(p5, v0_1, v1);
                this.d = 1;
            }
            int v4_4 = ((q3.h) this.e.get());
            if (v4_4 != 0) {
                v4_4.a();
                v4_4.onStateChange(v4_4.getState());
            }
        }
        return;
    }
}
