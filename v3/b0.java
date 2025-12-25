package v3;
public final class b0 {
    public int a;
    public v3.d b;
    public int[][] c;
    public v3.d[] d;

    public b0()
    {
        int[][] v1 = new int[][10];
        this.c = v1;
        v3.d[] v0_1 = new v3.d[10];
        this.d = v0_1;
        return;
    }

    public static v3.b0 b(v3.d p2)
    {
        v3.b0 v0_1 = new v3.b0();
        v0_1.a(android.util.StateSet.WILD_CARD, p2);
        return v0_1;
    }

    public final void a(int[] p6, v3.d p7)
    {
        int[][] v0_0 = this.a;
        if ((v0_0 == null) || (p6.length == 0)) {
            this.b = p7;
        }
        int v1_4 = this.c;
        if (v0_0 >= v1_4.length) {
            v3.d[] v2_2 = (v0_0 + 10);
            int[][] v3 = new int[][v2_2];
            System.arraycopy(v1_4, 0, v3, 0, v0_0);
            this.c = v3;
            int v1_0 = new v3.d[v2_2];
            System.arraycopy(this.d, 0, v1_0, 0, v0_0);
            this.d = v1_0;
        }
        int v1_1 = this.a;
        this.c[v1_1] = p6;
        this.d[v1_1] = p7;
        this.a = (v1_1 + 1);
        return;
    }

    public final v3.d c(int[] p6)
    {
        int v1 = 0;
        int v2_0 = 0;
        while(true) {
            int v4 = -1;
            if (v2_0 >= this.a) {
                break;
            }
            if (!android.util.StateSet.stateSetMatches(this.c[v2_0], p6)) {
                v2_0++;
            }
            if (v2_0 < 0) {
                while (v1 < this.a) {
                    if (!android.util.StateSet.stateSetMatches(this.c[v1], android.util.StateSet.WILD_CARD)) {
                        v1++;
                    } else {
                        v4 = v1;
                        break;
                    }
                }
                v2_0 = v4;
            }
            if (v2_0 >= 0) {
                return this.d[v2_0];
            } else {
                return this.b;
            }
        }
        v2_0 = -1;
    }

    public final void d(android.content.Context p12, android.content.res.XmlResourceParser p13, android.util.AttributeSet p14, android.content.res.Resources$Theme p15)
    {
        int v0_1 = (p13.getDepth() + 1);
        while(true) {
            int[] v2_6 = p13.next();
            if (v2_6 == 1) {
                break;
            }
            v3.d v3_5 = p13.getDepth();
            if ((v3_5 < v0_1) && (v2_6 == 3)) {
                break;
            }
            if ((v2_6 == 2) && ((v3_5 <= v0_1) && (p13.getName().equals("item")))) {
                int[] v2_3;
                int[] v2_2 = p12.getResources();
                v3.d v3_1 = c3.a.z;
                if (p15 != null) {
                    v2_3 = p15.obtainStyledAttributes(p14, v3_1, 0, 0);
                } else {
                    v2_3 = v2_2.obtainAttributes(p14, v3_1);
                }
                v3.d v3_4 = v3.p.c(v2_3, 5, new v3.a(0));
                v2_3.recycle();
                int[] v2_4 = p14.getAttributeCount();
                int[] v5_2 = new int[v2_4];
                int v6 = 0;
                int v7 = 0;
                while (v6 < v2_4) {
                    int v8 = p14.getAttributeNameResource(v6);
                    if (v8 != 2130968958) {
                        int v9_1 = (v7 + 1);
                        if (!p14.getAttributeBooleanValue(v6, 0)) {
                            v8 = (- v8);
                        }
                        v5_2[v7] = v8;
                        v7 = v9_1;
                    }
                    v6++;
                }
                this.a(android.util.StateSet.trimStateSet(v5_2, v7), v3_4);
            }
        }
        return;
    }
}
