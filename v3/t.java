package v3;
public final class t extends v3.y {
    public final v3.v c;

    public t(v3.v p1)
    {
        this.c = p1;
        return;
    }

    public final void a(android.graphics.Matrix p23, u3.a p24, int p25, android.graphics.Canvas p26)
    {
        int v9_1;
        android.graphics.RectF v4_6 = this.c;
        float v5 = v4_6.f;
        float v6 = v4_6.g;
        int v7_0 = new android.graphics.RectF(v4_6.b, v4_6.c, v4_6.d, v4_6.e);
        android.graphics.Paint v8_0 = p24.b;
        if (v6 >= 0) {
            v9_1 = 0;
        } else {
            v9_1 = 1;
        }
        float v16_0;
        android.graphics.Path v12 = p24.g;
        int[] v19 = u3.a.k;
        if (v9_1 == 0) {
            v12.rewind();
            v16_0 = 0;
            v12.moveTo(v7_0.centerX(), v7_0.centerY());
            v12.arcTo(v7_0, v5, v6);
            v12.close();
            v7_0.inset(((float) (- p25)), ((float) (- p25)));
            v19[0] = 0;
            v19[1] = p24.d;
            v19[2] = p24.e;
            v19[3] = p24.f;
        } else {
            v19[0] = 0;
            v19[1] = p24.f;
            v19[2] = p24.e;
            v19[3] = p24.d;
            v16_0 = 0;
        }
        float v18 = (v7_0.width() / 1073741824);
        if (v18 > v16_0) {
            android.graphics.Region$Op v1_3 = (1065353216 - (((float) p25) / v18));
            float v13_3 = (((1065353216 - v1_3) / 1073741824) + v1_3);
            float[] v20 = u3.a.l;
            v20[1] = v1_3;
            v20[2] = v13_3;
            v8_0.setShader(new android.graphics.RadialGradient(v7_0.centerX(), v7_0.centerY(), v18, v19, v20, android.graphics.Shader$TileMode.CLAMP));
            p26.save();
            p26.concat(p23);
            p26.scale(1065353216, (v7_0.height() / v7_0.width()));
            if (v9_1 == 0) {
                p26.clipPath(v12, android.graphics.Region$Op.DIFFERENCE);
                p26.drawPath(v12, p24.h);
            }
            p26.drawArc(v7_0, v5, v6, 1, v8_0);
            p26.restore();
            return;
        } else {
            return;
        }
    }
}
