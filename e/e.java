package e;
public final synthetic class e implements u7.a {
    public final synthetic int a;

    public synthetic e()
    {
        this.a = 0;
        return;
    }

    public synthetic e(s8.m p1)
    {
        this.a = 1;
        return;
    }

    public final Object invoke()
    {
        switch (this.a) {
            case 0:
                return Integer.valueOf((w7.e.a.a().nextInt(2147418112) + 65536));
            default:
                q8.d[] v0_4 = new java.util.ArrayList(0);
                if (v0_4.isEmpty()) {
                    v0_4 = 0;
                }
                q8.d[] v0_6;
                if (v0_4 == null) {
                    v0_6 = s8.k.a;
                } else {
                    q8.d[] v1_1 = new q8.d[0];
                    v0_6 = ((q8.d[]) v0_4.toArray(v1_1));
                    if (v0_6 == null) {
                    }
                }
                return v0_6;
        }
    }
}
