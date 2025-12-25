package n4;
public final class a {
    public final String a;
    public final char[] b;
    public final int c;
    public final int d;
    public final byte[] e;

    public a(String p9, char[] p10)
    {
        int v1_0 = new byte[128];
        java.util.Arrays.fill(v1_0, -1);
        int v3 = 0;
        int v4_0 = 0;
        while(true) {
            byte v6_0 = 1;
            if (v4_0 >= p10.length) {
                this.a = p9;
                this.b = p10;
                try {
                    ArithmeticException v9_4 = a.a.I(p10.length);
                    this.c = v9_4;
                    java.math.RoundingMode v10_4 = Integer.numberOfTrailingZeros(v9_4);
                    int v0_3 = (1 << (3 - v10_4));
                    this.d = (v9_4 >> v10_4);
                    this.e = v1_0;
                    ArithmeticException v9_6 = new boolean[v0_3];
                } catch (ArithmeticException v9_7) {
                    int v1_2 = new StringBuilder("Illegal alphabet length ");
                    v1_2.append(v10_4.length);
                    throw new IllegalArgumentException(v1_2.toString(), v9_7);
                }
                while (v3 < this.d) {
                    java.math.RoundingMode v10_8 = (v3 * 8);
                    int v0_6 = this.c;
                    int v1_3 = java.math.RoundingMode.CEILING;
                    v1_3.getClass();
                    if (v0_6 == 0) {
                        throw new ArithmeticException("/ by zero");
                    } else {
                        int v2_2 = (v10_8 / v0_6);
                        int v4_2 = (v10_8 - (v0_6 * v2_2));
                        if (v4_2 != 0) {
                            java.math.RoundingMode v10_12 = (((v10_8 ^ v0_6) >> 31) | 1);
                            switch (o4.a.a[v1_3.ordinal()]) {
                                case 1:
                                    if (v4_2 != 0) {
                                        throw new ArithmeticException("mode was UNNECESSARY, but rounding was necessary");
                                    }
                                    break;
                                case 2:
                                    break;
                                case 3:
                                    if (v10_12 < null) {
                                        v2_2 += v10_12;
                                    }
                                    break;
                                case 5:
                                    if (v10_12 > null) {
                                    }
                                    break;
                                case 6:
                                case 7:
                                case 8:
                                    int v1_6 = Math.abs(v4_2);
                                    int v1_7 = (v1_6 - (Math.abs(v0_6) - v1_6));
                                    if (v1_7 != 0) {
                                        if (v1_7 > 0) {
                                        }
                                    } else {
                                        p10 = java.math.RoundingMode.HALF_EVEN;
                                    }
                                    break;
                                default:
                                    throw new AssertionError();
                            }
                        }
                        v9_6[v2_2] = 1;
                        v3++;
                    }
                }
                return;
            } else {
                StringBuilder v7_0;
                int[] v5_2 = p10[v4_0];
                if (v5_2 >= 128) {
                    v7_0 = 0;
                } else {
                    v7_0 = 1;
                }
                if (v7_0 == null) {
                    break;
                }
                if (v1_0[v5_2] != -1) {
                    v6_0 = 0;
                }
                if (v6_0 == 0) {
                    throw new IllegalArgumentException(c4.b.L("Duplicate character: %s", new Object[] {Character.valueOf(v5_2)})));
                } else {
                    v1_0[v5_2] = ((byte) v4_0);
                    v4_0++;
                }
            }
        }
        throw new IllegalArgumentException(c4.b.L("Non-ASCII character: %s", new Object[] {Character.valueOf(v5_2)})));
    }

    public final boolean equals(Object p2)
    {
        if ((!(p2 instanceof n4.a)) || (!java.util.Arrays.equals(this.b, ((n4.a) p2).b))) {
            return 0;
        } else {
            return 1;
        }
    }

    public final int hashCode()
    {
        return (java.util.Arrays.hashCode(this.b) + 1237);
    }

    public final String toString()
    {
        return this.a;
    }
}
