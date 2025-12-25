package a2;
public final class t1 {
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;

    public final boolean a()
    {
        int v0_0 = this.a;
        int v2 = 2;
        if ((v0_0 & 7) == 0) {
            if ((v0_0 & 112) != 0) {
                int v1_5;
                int v1_4 = this.d;
                int v5_0 = this.c;
                if (v1_4 <= v5_0) {
                    if (v1_4 != v5_0) {
                        v1_5 = 4;
                    } else {
                        v1_5 = 2;
                    }
                } else {
                    v1_5 = 1;
                }
                if (((v1_5 << 4) & v0_0) == 0) {
                    return 0;
                }
            }
            if ((v0_0 & 1792) != 0) {
                int v1_10;
                int v1_9 = this.e;
                int v5_1 = this.b;
                if (v1_9 <= v5_1) {
                    if (v1_9 != v5_1) {
                        v1_10 = 4;
                    } else {
                        v1_10 = 2;
                    }
                } else {
                    v1_10 = 1;
                }
                if (((v1_10 << 8) & v0_0) == 0) {
                    return 0;
                }
            }
            if ((v0_0 & 28672) != 0) {
                int v1_14 = this.e;
                int v5_2 = this.c;
                if (v1_14 <= v5_2) {
                    if (v1_14 != v5_2) {
                        v2 = 4;
                    }
                } else {
                    v2 = 1;
                }
                if ((v0_0 & (v2 << 12)) == 0) {
                    return 0;
                }
            }
            return 1;
        } else {
            int v1_1;
            int v1_16 = this.d;
            int v5_3 = this.b;
            if (v1_16 <= v5_3) {
                if (v1_16 != v5_3) {
                    v1_1 = 4;
                } else {
                    v1_1 = 2;
                }
            } else {
                v1_1 = 1;
            }
            if ((v1_1 & v0_0) != 0) {
            }
        }
        return 0;
    }
}
