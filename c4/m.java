package c4;
public final class m {
    public final android.content.Context a;

    public m(android.content.Context p1)
    {
        this.a = p1;
        return;
    }

    public static long a(java.io.File p5)
    {
        if (p5.isDirectory()) {
            java.io.File[] v5_1 = p5.listFiles();
            long v0_1 = 0;
            if (v5_1 != null) {
                int v2 = 0;
                while (v2 < v5_1.length) {
                    v0_1 += c4.m.a(v5_1[v2]);
                    v2++;
                }
            }
            return v0_1;
        } else {
            return p5.length();
        }
    }
}
