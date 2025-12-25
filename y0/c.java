package y0;
public final class c implements java.util.Comparator {
    public final android.graphics.Rect a;
    public final android.graphics.Rect b;
    public final boolean c;
    public final c5.c d;

    public c(boolean p2, c5.c p3)
    {
        this.a = new android.graphics.Rect();
        this.b = new android.graphics.Rect();
        this.c = p2;
        this.d = p3;
        return;
    }

    public final int compare(Object p4, Object p5)
    {
        this.d.getClass();
        android.graphics.Rect v0_1 = this.a;
        ((r0.c) p4).f(v0_1);
        int v4_6 = this.b;
        ((r0.c) p5).f(v4_6);
        int v5_5 = v0_1.top;
        int v1_2 = v4_6.top;
        if (v5_5 >= v1_2) {
            if (v5_5 <= v1_2) {
                int v5_1 = v0_1.left;
                int v1_0 = v4_6.left;
                boolean v2 = this.c;
                if (v5_1 >= v1_0) {
                    if (v5_1 <= v1_0) {
                        int v5_2 = v0_1.bottom;
                        int v1_1 = v4_6.bottom;
                        if (v5_2 >= v1_1) {
                            if (v5_2 <= v1_1) {
                                int v5_3 = v0_1.right;
                                int v4_2 = v4_6.right;
                                if (v5_3 >= v4_2) {
                                    if (v5_3 <= v4_2) {
                                        return 0;
                                    } else {
                                        if (v2) {
                                            return -1;
                                        }
                                    }
                                } else {
                                    if (!v2) {
                                        return -1;
                                    }
                                }
                            }
                        }
                    } else {
                        if (v2) {
                            return -1;
                        }
                    }
                } else {
                    if (!v2) {
                        return -1;
                    }
                }
            }
            return 1;
        }
        return -1;
    }
}
