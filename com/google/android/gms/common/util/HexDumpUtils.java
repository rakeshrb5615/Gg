package com.google.android.gms.common.util;
public final class HexDumpUtils {

    public HexDumpUtils()
    {
        return;
    }

    public static String dump(byte[] p10, int p11, int p12, boolean p13)
    {
        if (p10 != null) {
            int v0_0 = p10.length;
            if ((v0_0 != 0) && ((p11 >= 0) && ((p12 > 0) && ((p11 + p12) <= v0_0)))) {
                int v0_2;
                if (!p13) {
                    v0_2 = 57;
                } else {
                    v0_2 = 75;
                }
                StringBuilder v2_1 = new StringBuilder((((p12 + 15) / 16) * v0_2));
                int v1_3 = p12;
                int v4_0 = 0;
                int v5_0 = 0;
                while (v1_3 > 0) {
                    if (v4_0 != 0) {
                        if (v4_0 == 8) {
                            v2_1.append(" -");
                        }
                    } else {
                        if (p12 >= 65536) {
                            v2_1.append(String.format("%08X:", new Object[] {Integer.valueOf(p11)})));
                        } else {
                            v2_1.append(String.format("%04X:", new Object[] {Integer.valueOf(p11)})));
                        }
                        v5_0 = p11;
                    }
                    v2_1.append(String.format(" %02X", new Object[] {Integer.valueOf((p10[p11] & 255))})));
                    v1_3--;
                    v4_0++;
                    if ((p13) && ((v4_0 == 16) || (v1_3 == 0))) {
                        int v7_8 = (16 - v4_0);
                        if (v7_8 > 0) {
                            int v8_1 = 0;
                            while (v8_1 < v7_8) {
                                v2_1.append("   ");
                                v8_1++;
                            }
                        }
                        if (v7_8 >= 8) {
                            v2_1.append("  ");
                        }
                        v2_1.append("  ");
                        int v6_1 = 0;
                        while (v6_1 < v4_0) {
                            int v7_11 = ((char) p10[(v5_0 + v6_1)]);
                            if ((v7_11 < 32) || (v7_11 > 126)) {
                                v7_11 = 46;
                            }
                            v2_1.append(v7_11);
                            v6_1++;
                        }
                    }
                    if ((v4_0 == 16) || (v1_3 == 0)) {
                        v2_1.append(10);
                        v4_0 = 0;
                    }
                    p11++;
                }
                return v2_1.toString();
            }
        }
        return 0;
    }
}
