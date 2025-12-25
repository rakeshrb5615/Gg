package z;
public final class k {
    public static final android.util.SparseIntArray j;
    public int a;
    public int b;
    public int c;
    public float d;
    public float e;
    public float f;
    public int g;
    public String h;
    public int i;

    static k()
    {
        android.util.SparseIntArray v0_1 = new android.util.SparseIntArray();
        z.k.j = v0_1;
        v0_1.append(3, 1);
        v0_1.append(5, 2);
        v0_1.append(9, 3);
        v0_1.append(2, 4);
        v0_1.append(1, 5);
        v0_1.append(0, 6);
        v0_1.append(4, 7);
        v0_1.append(8, 8);
        v0_1.append(7, 9);
        v0_1.append(6, 10);
        return;
    }

    public final void a(android.content.Context p8, android.util.AttributeSet p9)
    {
        android.content.res.TypedArray v8_1 = p8.obtainStyledAttributes(p9, z.r.f);
        int v9_1 = v8_1.getIndexCount();
        int v1 = 0;
        while (v1 < v9_1) {
            int v2_0 = v8_1.getIndex(v1);
            switch (z.k.j.get(v2_0)) {
                case 1:
                    this.e = v8_1.getFloat(v2_0, this.e);
                    break;
                case 2:
                    this.c = v8_1.getInt(v2_0, this.c);
                    break;
                case 3:
                    if (v8_1.peekValue(v2_0).type != 3) {
                        v8_1.getInteger(v2_0, 0);
                    } else {
                        v8_1.getString(v2_0);
                    }
                    break;
                case 4:
                    v8_1.getInt(v2_0, 0);
                    break;
                case 5:
                    this.a = z.n.f(v8_1, v2_0, this.a);
                    break;
                case 6:
                    this.b = v8_1.getInteger(v2_0, this.b);
                    break;
                case 7:
                    this.d = v8_1.getFloat(v2_0, this.d);
                    break;
                case 8:
                    this.g = v8_1.getInteger(v2_0, this.g);
                    break;
                case 9:
                    this.f = v8_1.getFloat(v2_0, this.f);
                    break;
                case 10:
                    int v3_3 = v8_1.peekValue(v2_0).type;
                    if (v3_3 != 1) {
                        if (v3_3 != 3) {
                            v8_1.getInteger(v2_0, this.i);
                        } else {
                            int v3_5 = v8_1.getString(v2_0);
                            this.h = v3_5;
                            if (v3_5.indexOf("/") <= 0) {
                            } else {
                                this.i = v8_1.getResourceId(v2_0, -1);
                            }
                        }
                    } else {
                        this.i = v8_1.getResourceId(v2_0, -1);
                    }
                    break;
                default:
            }
            v1++;
        }
        v8_1.recycle();
        return;
    }
}
