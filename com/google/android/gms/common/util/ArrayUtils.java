package com.google.android.gms.common.util;
public final class ArrayUtils {

    private ArrayUtils()
    {
        return;
    }

    public static varargs Object[] concat(Object[][] p6)
    {
        if (p6.length == 0) {
            return ((Object[]) reflect.Array.newInstance(p6.getClass(), 0));
        } else {
            Object[] v0_3 = 0;
            int v2_0 = 0;
            while (v0_3 < p6.length) {
                v2_0 += p6[v0_3].length;
                v0_3++;
            }
            Object[] v0_2 = java.util.Arrays.copyOf(p6[0], v2_0);
            int v2_2 = p6[0].length;
            int v3_1 = 1;
            while (v3_1 < p6.length) {
                Object v4_1 = p6[v3_1];
                int v5 = v4_1.length;
                System.arraycopy(v4_1, 0, v0_2, v2_2, v5);
                v2_2 += v5;
                v3_1++;
            }
            return v0_2;
        }
    }

    public static varargs byte[] concatByteArrays(byte[][] p6)
    {
        if (p6.length == 0) {
            byte[] v6_1 = new byte[0];
            return v6_1;
        } else {
            byte[] v0_2 = 0;
            int v2_2 = 0;
            while (v0_2 < p6.length) {
                v2_2 += p6[v0_2].length;
                v0_2++;
            }
            byte[] v0_1 = java.util.Arrays.copyOf(p6[0], v2_2);
            int v2_1 = p6[0].length;
            int v3_0 = 1;
            while (v3_0 < p6.length) {
                byte v4_1 = p6[v3_0];
                int v5 = v4_1.length;
                System.arraycopy(v4_1, 0, v0_1, v2_1, v5);
                v2_1 += v5;
                v3_0++;
            }
            return v0_1;
        }
    }

    public static boolean contains(int[] p3, int p4)
    {
        if (p3 != 0) {
            int v1 = 0;
            while (v1 < p3.length) {
                if (p3[v1] != p4) {
                    v1++;
                } else {
                    return 1;
                }
            }
        }
        return 0;
    }

    public static boolean contains(Object[] p4, Object p5)
    {
        int v1;
        if (p4 == 0) {
            v1 = 0;
        } else {
            v1 = p4.length;
        }
        int v2 = 0;
        while (v2 < v1) {
            if (!com.google.android.gms.common.internal.Objects.equal(p4[v2], p5)) {
                v2++;
            } else {
                if (v2 < 0) {
                    break;
                }
                return 1;
            }
        }
        return 0;
    }

    public static java.util.ArrayList newArrayList()
    {
        return new java.util.ArrayList();
    }

    public static varargs Object[] removeAll(Object[] p8, Object[] p9)
    {
        if (p8 != null) {
            if (p9 != 0) {
                int v1_2 = p9.length;
                if (v1_2 != 0) {
                    int v5_1;
                    int v3 = p8.length;
                    Object[] v2_1 = ((Object[]) reflect.Array.newInstance(p9.getClass().getComponentType(), v3));
                    int v4 = 0;
                    if (v1_2 != 1) {
                        int v1_0 = 0;
                        while (v4 < v3) {
                            int v5_2 = p8[v4];
                            if (!com.google.android.gms.common.util.ArrayUtils.contains(p9, v5_2)) {
                                int v6_1 = (v1_0 + 1);
                                v2_1[v1_0] = v5_2;
                                v1_0 = v6_1;
                            }
                            v4++;
                        }
                        v5_1 = v1_0;
                    } else {
                        int v1_1 = 0;
                        v5_1 = 0;
                        while (v1_1 < v3) {
                            int v6_2 = p8[v1_1];
                            if (!com.google.android.gms.common.internal.Objects.equal(p9[0], v6_2)) {
                                int v7_2 = (v5_1 + 1);
                                v2_1[v5_1] = v6_2;
                                v5_1 = v7_2;
                            }
                            v1_1++;
                        }
                    }
                    if (v2_1 != null) {
                        if (v5_1 != v2_1.length) {
                            return java.util.Arrays.copyOf(v2_1, v5_1);
                        } else {
                            return v2_1;
                        }
                    } else {
                        return 0;
                    }
                }
            }
            return java.util.Arrays.copyOf(p8, p8.length);
        } else {
            return 0;
        }
    }

    public static java.util.ArrayList toArrayList(Object[] p4)
    {
        int v0 = p4.length;
        java.util.ArrayList v1_1 = new java.util.ArrayList(v0);
        int v2 = 0;
        while (v2 < v0) {
            v1_1.add(p4[v2]);
            v2++;
        }
        return v1_1;
    }

    public static int[] toPrimitiveArray(java.util.Collection p4)
    {
        int v0 = 0;
        if ((p4 != null) && (!p4.isEmpty())) {
            int[] v1_2 = new int[p4.size()];
            java.util.Iterator v4_2 = p4.iterator();
            while (v4_2.hasNext()) {
                int v3 = (v0 + 1);
                v1_2[v0] = ((Integer) v4_2.next()).intValue();
                v0 = v3;
            }
            return v1_2;
        } else {
            java.util.Iterator v4_1 = new int[0];
            return v4_1;
        }
    }

    public static Integer[] toWrapperArray(int[] p4)
    {
        if (p4 != 0) {
            int v0 = p4.length;
            Integer[] v1 = new Integer[v0];
            int v2 = 0;
            while (v2 < v0) {
                v1[v2] = Integer.valueOf(p4[v2]);
                v2++;
            }
            return v1;
        } else {
            return 0;
        }
    }

    public static void writeArray(StringBuilder p4, double[] p5)
    {
        int v0 = p5.length;
        int v1 = 0;
        while (v1 < v0) {
            if (v1 != 0) {
                p4.append(",");
            }
            p4.append(p5[v1]);
            v1++;
        }
        return;
    }

    public static void writeArray(StringBuilder p3, float[] p4)
    {
        int v0 = p4.length;
        int v1 = 0;
        while (v1 < v0) {
            if (v1 != 0) {
                p3.append(",");
            }
            p3.append(p4[v1]);
            v1++;
        }
        return;
    }

    public static void writeArray(StringBuilder p3, int[] p4)
    {
        int v0 = p4.length;
        int v1 = 0;
        while (v1 < v0) {
            if (v1 != 0) {
                p3.append(",");
            }
            p3.append(p4[v1]);
            v1++;
        }
        return;
    }

    public static void writeArray(StringBuilder p4, long[] p5)
    {
        int v0 = p5.length;
        int v1 = 0;
        while (v1 < v0) {
            if (v1 != 0) {
                p4.append(",");
            }
            p4.append(p5[v1]);
            v1++;
        }
        return;
    }

    public static void writeArray(StringBuilder p3, Object[] p4)
    {
        int v0 = p4.length;
        int v1 = 0;
        while (v1 < v0) {
            if (v1 != 0) {
                p3.append(",");
            }
            p3.append(p4[v1]);
            v1++;
        }
        return;
    }

    public static void writeArray(StringBuilder p3, boolean[] p4)
    {
        int v0 = p4.length;
        int v1 = 0;
        while (v1 < v0) {
            if (v1 != 0) {
                p3.append(",");
            }
            p3.append(p4[v1]);
            v1++;
        }
        return;
    }

    public static void writeStringArray(StringBuilder p4, String[] p5)
    {
        int v0 = p5.length;
        int v1 = 0;
        while (v1 < v0) {
            if (v1 != 0) {
                p4.append(",");
            }
            p4.append("\"");
            p4.append(p5[v1]);
            p4.append("\"");
            v1++;
        }
        return;
    }
}
