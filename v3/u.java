package v3;
public final class u extends v3.y {
    public final v3.w c;
    public final float d;
    public final float e;

    public u(v3.w p1, float p2, float p3)
    {
        this.c = p1;
        this.d = p2;
        this.e = p3;
        return;
    }

    public final void a(android.graphics.Matrix p18, u3.a p19, int p20, android.graphics.Canvas p21)
    {
        android.graphics.Matrix v4_5 = this.c;
        float v6_3 = this.e;
        float v7_1 = this.d;
        android.graphics.RectF v8_1 = new android.graphics.RectF(0, 0, ((float) Math.hypot(((double) (v4_5.c - v6_3)), ((double) (v4_5.b - v7_1)))), 0);
        android.graphics.Matrix v4_4 = this.a;
        v4_4.set(p18);
        v4_4.preTranslate(v7_1, v6_3);
        v4_4.preRotate(this.b());
        p19.getClass();
        v8_1.bottom = (v8_1.bottom + ((float) p20));
        v8_1.offset(0, ((float) (- p20)));
        int[] v14 = u3.a.i;
        v14[0] = p19.f;
        v14[1] = p19.e;
        v14[2] = p19.d;
        android.graphics.Paint v1_1 = p19.c;
        float v10 = v8_1.left;
        v1_1.setShader(new android.graphics.LinearGradient(v10, v8_1.top, v10, v8_1.bottom, v14, u3.a.j, android.graphics.Shader$TileMode.CLAMP));
        p21.save();
        p21.concat(v4_4);
        p21.drawRect(v8_1, v1_1);
        p21.restore();
        return;
    }

    public final float b()
    {
        float v0_0 = this.c;
        return ((float) Math.toDegrees(Math.atan(((double) ((v0_0.c - this.e) / (v0_0.b - this.d))))));
    }
}
