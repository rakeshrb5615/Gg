package a2;
public final class q implements java.util.Comparator {
    public final synthetic int a;

    public synthetic q(int p1)
    {
        this.a = p1;
        return;
    }

    public final int compare(Object p7, Object p8)
    {
        int v1_0 = 1;
        switch (this.a) {
            case 0:
                boolean v4_0;
                int v0_2 = ((a2.s) p7).d;
                if (v0_2 != 0) {
                    v4_0 = 0;
                } else {
                    v4_0 = 1;
                }
                int v5_1;
                if (((a2.s) p8).d != null) {
                    v5_1 = 0;
                } else {
                    v5_1 = 1;
                }
                if (v4_0 == v5_1) {
                    int v0_3 = ((a2.s) p7).a;
                    if (v0_3 == ((a2.s) p8).a) {
                        v1_0 = (((a2.s) p8).b - ((a2.s) p7).b);
                        if (v1_0 == 0) {
                            v1_0 = (((a2.s) p7).c - ((a2.s) p8).c);
                            if (v1_0 == 0) {
                                v1_0 = 0;
                            }
                        }
                    } else {
                        if (v0_3 != 0) {
                            v1_0 = -1;
                        }
                    }
                } else {
                    if (v0_2 != 0) {
                    }
                }
                return v1_0;
            case 1:
                int v7_8 = q0.i0.f(((android.view.View) p7));
                int v8_6 = q0.i0.f(((android.view.View) p8));
                if (v7_8 <= v8_6) {
                    if (v7_8 >= v8_6) {
                        v1_0 = 0;
                    }
                } else {
                    v1_0 = -1;
                }
                return v1_0;
            case 2:
                return (((android.view.View) p7).getTop() - ((android.view.View) p8).getTop());
            case 3:
                return (((u.f) p7).b - ((u.f) p8).b);
            case 4:
                return ((Comparable) p7).compareTo(((Comparable) p8));
            default:
                int v7_14 = ((y8.j) p7).a;
                int v8_11 = ((y8.j) p8).a;
                if (v7_14 != v8_11) {
                    if (v7_14 != 0) {
                        if (v8_11 != 0) {
                            v1_0 = v7_14.compareTo(v8_11);
                        }
                    } else {
                        v1_0 = -1;
                    }
                } else {
                    v1_0 = 0;
                }
                return v1_0;
        }
    }
}
