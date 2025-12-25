package okhttp3.internal.http2;
public final class Settings {
    public int a;
    public final int[] b;

    static Settings()
    {
        new okhttp3.internal.http2.Settings$Companion(0);
        return;
    }

    public Settings()
    {
        int[] v0_1 = new int[10];
        this.b = v0_1;
        return;
    }

    public final int a()
    {
        if ((this.a & 16) == 0) {
            return 65535;
        } else {
            return this.b[4];
        }
    }

    public final void b(okhttp3.internal.http2.Settings p6)
    {
        kotlin.jvm.internal.j.e(p6, "other");
        int v1 = 0;
        while (v1 < 10) {
            int v2_0 = 1;
            if (((1 << v1) & p6.a) == 0) {
                v2_0 = 0;
            }
            if (v2_0 != 0) {
                this.c(v1, p6.b[v1]);
            }
            v1++;
        }
        return;
    }

    public final void c(int p4, int p5)
    {
        if (p4 >= 0) {
            int[] v0 = this.b;
            if (p4 < v0.length) {
                this.a = ((1 << p4) | this.a);
                v0[p4] = p5;
            }
        }
        return;
    }
}
