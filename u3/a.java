package u3;
public final class a {
    public static final int[] i;
    public static final float[] j;
    public static final int[] k;
    public static final float[] l;
    public final android.graphics.Paint a;
    public final android.graphics.Paint b;
    public final android.graphics.Paint c;
    public final int d;
    public final int e;
    public final int f;
    public final android.graphics.Path g;
    public final android.graphics.Paint h;

    static a()
    {
        int[] v1_0 = new int[3];
        u3.a.i = v1_0;
        float[] v0_1 = new float[3];
        v0_1 = {0, 1056964608, 1065353216};
        u3.a.j = v0_1;
        int[] v1_1 = new int[4];
        u3.a.k = v1_1;
        float[] v0_3 = new float[4];
        v0_3 = {0, 0, 1056964608, 1065353216};
        u3.a.l = v0_3;
        return;
    }

    public a()
    {
        this.g = new android.graphics.Path();
        android.graphics.Paint v0_5 = new android.graphics.Paint();
        this.h = v0_5;
        android.graphics.Paint v1_5 = new android.graphics.Paint();
        this.a = v1_5;
        this.d = h0.a.h(-16777216, 68);
        this.e = h0.a.h(-16777216, 20);
        this.f = h0.a.h(-16777216, 0);
        v1_5.setColor(this.d);
        v0_5.setColor(0);
        android.graphics.Paint v0_3 = new android.graphics.Paint(4);
        this.b = v0_3;
        v0_3.setStyle(android.graphics.Paint$Style.FILL);
        this.c = new android.graphics.Paint(v0_3);
        return;
    }
}
