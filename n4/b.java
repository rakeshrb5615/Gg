package n4;
public final class b extends n4.d {
    public final char[] d;

    public b(n4.a p5)
    {
        super(p5, 0);
        int v0_3 = new char[512];
        super.d = v0_3;
        IllegalArgumentException v5_2 = p5.b;
        if (v5_2.length != 16) {
            throw new IllegalArgumentException();
        } else {
            int v0_1 = 0;
            while (v0_1 < 256) {
                char[] v1_1 = super.d;
                v1_1[v0_1] = v5_2[(v0_1 >> 4)];
                v1_1[(v0_1 | 256)] = v5_2[(v0_1 & 15)];
                v0_1++;
            }
            return;
        }
    }
}
