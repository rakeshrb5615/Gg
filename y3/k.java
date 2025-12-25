package y3;
public final class k implements android.os.Handler$Callback {
    public final synthetic j6.s a;

    public k(j6.s p1)
    {
        this.a = p1;
        return;
    }

    public final boolean handleMessage(android.os.Message p4)
    {
        if (p4.what == 0) {
            j6.s v0_1 = this.a;
            int v4_5 = ((y3.l) p4.obj);
            try {
                if ((((y3.l) v0_1.d) == v4_5) || (((y3.l) v0_1.e) == v4_5)) {
                    v0_1.c(v4_5, 2);
                }
            } catch (int v4_2) {
                throw v4_2;
            }
            return 1;
        } else {
            return 0;
        }
    }
}
