package b4;
public final class b extends v3.k implements q3.h {
    public CharSequence M;
    public final android.content.Context N;
    public final android.graphics.Paint$FontMetrics O;
    public final q3.i P;
    public final b4.a Q;
    public final android.graphics.Rect R;
    public int S;
    public int T;
    public int U;
    public int V;
    public boolean W;
    public int X;
    public int Y;
    public float Z;
    public float a0;
    public float b0;
    public float c0;
    public float d0;

    public b(android.content.Context p3, int p4)
    {
        super(p3, 0, 0, p4);
        super.O = new android.graphics.Paint$FontMetrics();
        android.text.TextPaint v4_5 = new q3.i(super);
        super.P = v4_5;
        super.Q = new b4.a(super, 0);
        super.R = new android.graphics.Rect();
        super.Z = 1065353216;
        super.a0 = 1065353216;
        super.b0 = 1056964608;
        super.c0 = 1056964608;
        super.d0 = 1065353216;
        super.N = p3;
        android.text.TextPaint v4_1 = v4_5.a;
        v4_1.density = p3.getResources().getDisplayMetrics().density;
        v4_1.setTextAlign(android.graphics.Paint$Align.CENTER);
        return;
    }

    public final void draw(android.graphics.Canvas p11)
    {
        android.graphics.Canvas v3_12;
        p11.save();
        int v0_0 = this.w();
        int v1_2 = ((float) (- ((Math.sqrt(4611686018427387904) * ((double) this.X)) - ((double) this.X))));
        p11.scale(this.Z, this.a0, ((((float) this.getBounds().width()) * this.b0) + ((float) this.getBounds().left)), ((((float) this.getBounds().height()) * this.c0) + ((float) this.getBounds().top)));
        p11.translate(v0_0, v1_2);
        super.draw(p11);
        if (this.M != null) {
            int v0_2 = this.getBounds();
            int v1_6 = ((float) v0_2.centerY());
            int v2_1 = this.P;
            android.text.TextPaint v9 = v2_1.a;
            android.graphics.Canvas v3_3 = this.O;
            v9.getFontMetrics(v3_3);
            int v1_8 = ((int) (v1_6 - ((v3_3.descent + v3_3.ascent) / 1073741824)));
            if (v2_1.f != null) {
                v9.drawableState = this.getState();
                v2_1.f.d(this.N, v2_1.a, v2_1.b);
                v9.setAlpha(((int) (this.d0 * 1132396544)));
            }
            CharSequence v4_10 = this.M;
            v3_12 = p11;
            p11.drawText(v4_10, 0, v4_10.length(), ((float) v0_2.centerX()), ((float) v1_8), v9);
        } else {
            v3_12 = p11;
        }
        v3_12.restore();
        return;
    }

    public final int getIntrinsicHeight()
    {
        return ((int) Math.max(this.P.a.getTextSize(), ((float) this.U)));
    }

    public final int getIntrinsicWidth()
    {
        float v1_0;
        int v0_5 = ((float) (this.S * 2));
        float v1_3 = this.M;
        if (v1_3 != 0) {
            v1_0 = this.P.a(v1_3.toString());
        } else {
            v1_0 = 0;
        }
        return ((int) Math.max((v0_5 + v1_0), ((float) this.T)));
    }

    public final void onBoundsChange(android.graphics.Rect p2)
    {
        super.onBoundsChange(p2);
        if (this.W) {
            v3.p v2_5 = this.b.a.f();
            v2_5.k = this.x();
            this.setShapeAppearanceModel(v2_5.a());
        }
        return;
    }

    public final float w()
    {
        int v0_5;
        int v0_0 = this.R;
        if ((((v0_0.right - this.getBounds().right) - this.Y) - this.V) >= 0) {
            if ((((v0_0.left - this.getBounds().left) - this.Y) + this.V) <= 0) {
                return 0;
            } else {
                v0_5 = (((v0_0.left - this.getBounds().left) - this.Y) + this.V);
            }
        } else {
            v0_5 = (((v0_0.right - this.getBounds().right) - this.Y) - this.V);
        }
        return ((float) v0_5);
    }

    public final v3.l x()
    {
        v3.l v1_2 = ((float) ((((double) this.getBounds().width()) - (Math.sqrt(4611686018427387904) * ((double) this.X))) / 4611686018427387904));
        return new v3.l(new v3.g(((float) this.X)), Math.min(Math.max((- this.w()), (- v1_2)), v1_2));
    }
}
