package z;
public final class l {
    public int a;
    public int b;
    public float c;
    public float d;

    public final void a(android.content.Context p4, android.util.AttributeSet p5)
    {
        android.content.res.TypedArray v4_1 = p4.obtainStyledAttributes(p5, z.r.g);
        int v5_1 = v4_1.getIndexCount();
        int v0_1 = 0;
        while (v0_1 < v5_1) {
            float v1_0 = v4_1.getIndex(v0_1);
            if (v1_0 != 1) {
                if (v1_0 != 0) {
                    if (v1_0 != 4) {
                        if (v1_0 == 3) {
                            this.d = v4_1.getFloat(v1_0, this.d);
                        }
                    } else {
                        this.b = v4_1.getInt(v1_0, this.b);
                    }
                } else {
                    float v1_3 = v4_1.getInt(v1_0, this.a);
                    this.a = v1_3;
                    this.a = z.n.d[v1_3];
                }
            } else {
                this.c = v4_1.getFloat(v1_0, this.c);
            }
            v0_1++;
        }
        v4_1.recycle();
        return;
    }
}
