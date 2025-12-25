package v3;
public final class f0 {
    public int a;
    public j6.o b;
    public int[][] c;
    public j6.o[] d;

    public final void a(android.content.Context p12, android.content.res.XmlResourceParser p13, android.util.AttributeSet p14, android.content.res.Resources$Theme p15)
    {
        int v0_1 = (p13.getDepth() + 1);
        while(true) {
            j6.o[] v2_4 = p13.next();
            if (v2_4 != 1) {
                j6.o v3_10 = p13.getDepth();
                if ((v3_10 >= v0_1) || (v2_4 != 3)) {
                    if ((v2_4 == 2) && ((v3_10 <= v0_1) && (p13.getName().equals("item")))) {
                        j6.o[] v2_3;
                        j6.o[] v2_2 = p12.getResources();
                        j6.o v3_1 = c3.a.D;
                        if (p15 != null) {
                            v2_3 = p15.obtainStyledAttributes(p14, v3_1, 0, 0);
                        } else {
                            v2_3 = v2_2.obtainAttributes(p14, v3_1);
                        }
                        j6.o[] v6_2;
                        j6.o v3_2 = v2_3.peekValue(0);
                        if (v3_2 != null) {
                            j6.o[] v6_0 = v3_2.type;
                            if (v6_0 != 5) {
                                if (v6_0 != 6) {
                                    v6_2 = 0;
                                } else {
                                    v6_2 = new v3.e0(1, v3_2.getFraction(1065353216, 1065353216));
                                }
                            } else {
                                v6_2 = new v3.e0(2, ((float) android.util.TypedValue.complexToDimensionPixelSize(v3_2.data, v2_3.getResources().getDisplayMetrics())));
                            }
                        }
                        v2_3.recycle();
                        j6.o[] v2_5 = p14.getAttributeCount();
                        j6.o v3_7 = new int[v2_5];
                        int[][] v4_1 = 0;
                        j6.o[] v7_0 = 0;
                        while (v4_1 < v2_5) {
                            int[][] v8_0 = p14.getAttributeNameResource(v4_1);
                            if (v8_0 != 2130970074) {
                                int v9_1 = (v7_0 + 1);
                                if (!p14.getAttributeBooleanValue(v4_1, 0)) {
                                    v8_0 = (- v8_0);
                                }
                                v3_7[v7_0] = v8_0;
                                v7_0 = v9_1;
                            }
                            v4_1++;
                        }
                        j6.o[] v2_6 = android.util.StateSet.trimStateSet(v3_7, v7_0);
                        j6.o v3_9 = new j6.o(18, 0);
                        v3_9.b = v6_2;
                        int[][] v4_6 = this.a;
                        if ((v4_6 == null) || (v2_6.length == 0)) {
                            this.b = v3_9;
                        }
                        j6.o[] v6_5 = this.c;
                        if (v4_6 >= v6_5.length) {
                            j6.o[] v7_6 = (v4_6 + 10);
                            int[][] v8_1 = new int[][v7_6];
                            System.arraycopy(v6_5, 0, v8_1, 0, v4_6);
                            this.c = v8_1;
                            j6.o[] v6_6 = new j6.o[v7_6];
                            System.arraycopy(this.d, 0, v6_6, 0, v4_6);
                            this.d = v6_6;
                        }
                        int v5_1 = this.a;
                        this.c[v5_1] = v2_6;
                        this.d[v5_1] = v3_9;
                        this.a = (v5_1 + 1);
                    }
                }
            }
            return;
        }
    }
}
