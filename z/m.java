package z;
public final class m {
    public static final android.util.SparseIntArray n;
    public float a;
    public float b;
    public float c;
    public float d;
    public float e;
    public float f;
    public float g;
    public int h;
    public float i;
    public float j;
    public float k;
    public boolean l;
    public float m;

    static m()
    {
        android.util.SparseIntArray v0_1 = new android.util.SparseIntArray();
        z.m.n = v0_1;
        v0_1.append(6, 1);
        v0_1.append(7, 2);
        v0_1.append(8, 3);
        v0_1.append(4, 4);
        v0_1.append(5, 5);
        v0_1.append(0, 6);
        v0_1.append(1, 7);
        v0_1.append(2, 8);
        v0_1.append(3, 9);
        v0_1.append(9, 10);
        v0_1.append(10, 11);
        v0_1.append(11, 12);
        return;
    }

    public final void a(android.content.Context p4, android.util.AttributeSet p5)
    {
        android.content.res.TypedArray v4_1 = p4.obtainStyledAttributes(p5, z.r.i);
        int v5_1 = v4_1.getIndexCount();
        int v0_1 = 0;
        while (v0_1 < v5_1) {
            int v1_0 = v4_1.getIndex(v0_1);
            switch (z.m.n.get(v1_0)) {
                case 1:
                    this.a = v4_1.getFloat(v1_0, this.a);
                    break;
                case 2:
                    this.b = v4_1.getFloat(v1_0, this.b);
                    break;
                case 3:
                    this.c = v4_1.getFloat(v1_0, this.c);
                    break;
                case 4:
                    this.d = v4_1.getFloat(v1_0, this.d);
                    break;
                case 5:
                    this.e = v4_1.getFloat(v1_0, this.e);
                    break;
                case 6:
                    this.f = v4_1.getDimension(v1_0, this.f);
                    break;
                case 7:
                    this.g = v4_1.getDimension(v1_0, this.g);
                    break;
                case 8:
                    this.i = v4_1.getDimension(v1_0, this.i);
                    break;
                case 9:
                    this.j = v4_1.getDimension(v1_0, this.j);
                    break;
                case 10:
                    this.k = v4_1.getDimension(v1_0, this.k);
                    break;
                case 11:
                    this.l = 1;
                    this.m = v4_1.getDimension(v1_0, this.m);
                    break;
                case 12:
                    this.h = z.n.f(v4_1, v1_0, this.h);
                    break;
                default:
            }
            v0_1++;
        }
        v4_1.recycle();
        return;
    }
}
