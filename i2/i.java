package i2;
public final class i {
    public int A;
    public final android.content.Context a;
    public final float b;
    public final float c;
    public int[] d;
    public int[] e;
    public int[] f;
    public final float g;
    public float h;
    public final i2.v0 i;
    public final int j;
    public final int k;
    public android.graphics.Bitmap[] l;
    public int[] m;
    public float[][] n;
    public float[][] o;
    public int[][] p;
    public int[][] q;
    public int[][] r;
    public int[][] s;
    public int[][][] t;
    public int[][][] u;
    public int[][][] v;
    public int[][][][] w;
    public int[][][][] x;
    public final java.util.Random y;
    public int[] z;

    public i(android.content.Context p2, float p3, i2.v0 p4, float p5, float p6)
    {
        this.z = 0;
        this.A = 0;
        this.a = p2;
        this.g = p3;
        this.i = p4;
        this.c = p5;
        this.b = p6;
        this.y = p4.O0;
        new android.graphics.Paint().setXfermode(new android.graphics.PorterDuffXfermode(android.graphics.PorterDuff$Mode.SRC_IN));
        this.j = e0.c.getColor(p2, 2131100675);
        this.k = e0.c.getColor(p2, 2131100676);
        return;
    }

    public final void a()
    {
        int v0_0 = this.l;
        if (v0_0 != 0) {
            int v1 = v0_0.length;
            int v2 = 0;
            while (v2 < v1) {
                android.graphics.Bitmap v3 = v0_0[v2];
                if ((v3 != null) && (!v3.isRecycled())) {
                    v3.recycle();
                }
                v2++;
            }
            this.l = 0;
        }
        return;
    }
}
