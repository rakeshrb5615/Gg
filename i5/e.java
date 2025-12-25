package i5;
public final class e implements i5.j {
    public static final v3.f c;
    public final Object a;
    public Object b;

    static e()
    {
        i5.e.c = new v3.f();
        return;
    }

    public e(m5.c p1)
    {
        this.a = p1;
        this.b = i5.e.c;
        return;
    }

    public e(byte[] p1, int[] p2)
    {
        this.a = p1;
        this.b = p2;
        return;
    }

    public void b(i5.i p5, int p6)
    {
        int[] v0_1 = ((int[]) this.b);
        try {
            p5.read(((byte[]) this.a), v0_1[0], p6);
            v0_1[0] = (v0_1[0] + p6);
            p5.close();
            return;
        } catch (Throwable v6_1) {
            p5.close();
            throw v6_1;
        }
    }
}
