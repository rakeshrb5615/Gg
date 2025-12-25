package g1;
public final class v extends android.text.style.ReplacementSpan {
    public final android.graphics.Paint$FontMetricsInt a;
    public final g1.u b;
    public short c;
    public float d;
    public android.text.TextPaint e;

    public v(g1.u p2)
    {
        this.a = new android.graphics.Paint$FontMetricsInt();
        this.c = -1;
        this.d = 1065353216;
        p0.e.d(p2, "rasterizer cannot be null");
        this.b = p2;
        return;
    }

    public final void draw(android.graphics.Canvas p19, CharSequence p20, int p21, int p22, float p23, int p24, int p25, int p26, android.graphics.Paint p27)
    {
        android.graphics.Typeface v4_0 = 0;
        if (!(p20 instanceof android.text.Spanned)) {
            if ((p27 instanceof android.text.TextPaint)) {
                v4_0 = ((android.text.TextPaint) p27);
            }
        } else {
            int v1_3 = ((android.text.style.CharacterStyle[]) ((android.text.Spanned) p20).getSpans(p21, p22, android.text.style.CharacterStyle));
            if (v1_3.length != 0) {
                int v5_1 = 0;
                if ((v1_3.length != 1) || (v1_3[0] != this)) {
                    j6.s v3_4 = this.e;
                    if (v3_4 == null) {
                        v3_4 = new android.text.TextPaint();
                        this.e = v3_4;
                    }
                    v4_0 = v3_4;
                    v4_0.set(p27);
                    while (v5_1 < v1_3.length) {
                        j6.s v3_8 = v1_3[v5_1];
                        if (!(v3_8 instanceof android.text.style.MetricAffectingSpan)) {
                            v3_8.updateDrawState(v4_0);
                        }
                        v5_1++;
                    }
                    android.graphics.Paint v10 = v4_0;
                    if ((v10 != null) && (v10.bgColor != 0)) {
                        float v8 = (p23 + ((float) this.c));
                        int v1_10 = v10.getColor();
                        j6.s v3_9 = v10.getStyle();
                        v10.setColor(v10.bgColor);
                        v10.setStyle(android.graphics.Paint$Style.FILL);
                        p19.drawRect(p23, ((float) p24), v8, ((float) p26), v10);
                        v10.setStyle(v3_9);
                        v10.setColor(v1_10);
                    }
                    g1.i.a().getClass();
                    if (v10 == null) {
                        v10 = p27;
                    }
                    Object v2_1 = this.b;
                    j6.s v3_10 = v2_1.b;
                    android.graphics.Typeface v4_5 = ((android.graphics.Typeface) v3_10.e);
                    int v5_3 = v10.getTypeface();
                    v10.setTypeface(v4_5);
                    p19.drawText(((char[]) v3_10.c), (v2_1.a * 2), 2, p23, ((float) p25), v10);
                    v10.setTypeface(v5_3);
                    return;
                }
            }
            if ((p27 instanceof android.text.TextPaint)) {
                v4_0 = ((android.text.TextPaint) p27);
            }
        }
    }

    public final int getSize(android.graphics.Paint p5, CharSequence p6, int p7, int p8, android.graphics.Paint$FontMetricsInt p9)
    {
        java.nio.ByteBuffer v8_1;
        int v6_0 = this.a;
        p5.getFontMetricsInt(v6_0);
        short v5_14 = (((float) Math.abs((v6_0.descent - v6_0.ascent))) * 1065353216);
        int v7_0 = this.b;
        java.nio.ByteBuffer v8_0 = v7_0.b();
        int v1_0 = v8_0.b(14);
        short v2 = 0;
        if (v1_0 == 0) {
            v8_1 = 0;
        } else {
            v8_1 = ((java.nio.ByteBuffer) v8_0.d).getShort((v1_0 + v8_0.a));
        }
        this.d = (v5_14 / ((float) v8_1));
        short v5_3 = v7_0.b();
        java.nio.ByteBuffer v8_4 = v5_3.b(14);
        if (v8_4 != null) {
            ((java.nio.ByteBuffer) v5_3.d).getShort((v8_4 + v5_3.a));
        }
        short v5_5 = v7_0.b();
        int v7_3 = v5_5.b(12);
        if (v7_3 != 0) {
            v2 = ((java.nio.ByteBuffer) v5_5.d).getShort((v7_3 + v5_5.a));
        }
        short v5_11 = ((short) ((int) (((float) v2) * this.d)));
        this.c = v5_11;
        if (p9 != null) {
            p9.ascent = v6_0.ascent;
            p9.descent = v6_0.descent;
            p9.top = v6_0.top;
            p9.bottom = v6_0.bottom;
        }
        return v5_11;
    }
}
