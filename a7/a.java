package a7;
public abstract class a {
    public static final java.util.TimeZone a;

    static a()
    {
        a7.a.a = java.util.TimeZone.getTimeZone("UTC");
        return;
    }

    public static boolean a(String p1, int p2, char p3)
    {
        if ((p2 >= p1.length()) || (p1.charAt(p2) != p3)) {
            return 0;
        } else {
            return 1;
        }
    }

    public static java.util.Date b(String p17, java.text.ParsePosition p18)
    {
        String v0_19 = p18.getIndex();
        int v3_2 = (v0_19 + 4);
        String v4_15 = a7.a.c(v0_19, v3_2, p17);
        if (a7.a.a(p17, v3_2, 45)) {
            v3_2 = (v0_19 + 5);
        }
        String v0_7 = (v3_2 + 2);
        int v6_0 = a7.a.c(v3_2, v0_7, p17);
        if (a7.a.a(p17, v0_7, 45)) {
            v0_7 = (v3_2 + 3);
        }
        int v3_0 = (v0_7 + 2);
        int v8_1 = a7.a.c(v0_7, v3_0, p17);
        String v9_8 = a7.a.a(p17, v3_0, 84);
        if ((v9_8 != null) || (p17.length() > v3_0)) {
            String v0_3;
            int v15_2;
            int v7_0;
            int v5_1;
            if (v9_8 == null) {
                v0_3 = 0;
                v5_1 = 0;
                v7_0 = 0;
                v15_2 = 0;
            } else {
                String v9_9 = (v0_7 + 5);
                int v3_16 = a7.a.c((v0_7 + 3), v9_9, p17);
                if (a7.a.a(p17, v9_9, 58)) {
                    v9_9 = (v0_7 + 6);
                }
                String v0_20 = (v9_9 + 2);
                int v16_1 = a7.a.c(v9_9, v0_20, p17);
                if (a7.a.a(p17, v0_20, 58)) {
                    v0_20 = (v9_9 + 3);
                }
                if (p17.length() > v0_20) {
                    String v9_12 = p17.charAt(v0_20);
                    if ((v9_12 != 90) && ((v9_12 != 43) && (v9_12 != 45))) {
                        String v9_13 = (v0_20 + 2);
                        v15_2 = a7.a.c(v0_20, v9_13, p17);
                        if ((v15_2 > 59) && (v15_2 < 63)) {
                            v15_2 = 59;
                        }
                        if (!a7.a.a(p17, v9_13, 46)) {
                            v0_3 = v3_16;
                            v3_0 = v9_13;
                            v5_1 = v16_1;
                            v7_0 = 0;
                            if (p17.length() <= v3_0) {
                                throw new IllegalArgumentException("No time zone indicator");
                            } else {
                                int v3_6;
                                String v9_1 = p17.charAt(v3_0);
                                int v11_0 = a7.a.a;
                                if (v9_1 != 90) {
                                    if ((v9_1 != 43) && (v9_1 != 45)) {
                                        int v3_4 = new StringBuilder();
                                        v3_4.append("Invalid time zone indicator \'");
                                        v3_4.append(v9_1);
                                        v3_4.append("\'");
                                        throw new IndexOutOfBoundsException(v3_4.toString());
                                    } else {
                                        String v9_2 = p17.substring(v3_0);
                                        if (v9_2.length() < 5) {
                                            boolean v12_3 = new StringBuilder();
                                            v12_3.append(v9_2);
                                            v12_3.append("00");
                                            v9_2 = v12_3.toString();
                                        } else {
                                        }
                                        v3_6 = (v3_0 + v9_2.length());
                                        if (!v9_2.equals("+0000")) {
                                            if (!v9_2.equals("+00:00")) {
                                                int v11_2 = new StringBuilder();
                                                v11_2.append("GMT");
                                                v11_2.append(v9_2);
                                                String v9_4 = v11_2.toString();
                                                v11_0 = java.util.TimeZone.getTimeZone(v9_4);
                                                boolean v12_10 = v11_0.getID();
                                                if (!v12_10.equals(v9_4)) {
                                                    if (!v12_10.replace(":", "").equals(v9_4)) {
                                                        int v3_8 = new StringBuilder();
                                                        v3_8.append("Mismatching time zone indicator: ");
                                                        v3_8.append(v9_4);
                                                        v3_8.append(" given, resolves to ");
                                                        v3_8.append(v11_0.getID());
                                                        throw new IndexOutOfBoundsException(v3_8.toString());
                                                    } else {
                                                    }
                                                }
                                            } else {
                                            }
                                        }
                                    }
                                } else {
                                    v3_6 = (v3_0 + 1);
                                }
                                String v9_6 = new java.util.GregorianCalendar(v11_0);
                                v9_6.setLenient(0);
                                v9_6.set(1, v4_15);
                                v9_6.set(2, (v6_0 - 1));
                                v9_6.set(5, v8_1);
                                v9_6.set(11, v0_3);
                                v9_6.set(12, v5_1);
                                v9_6.set(13, v15_2);
                                v9_6.set(14, v7_0);
                                p18.setIndex(v3_6);
                                return v9_6.getTime();
                            }
                        } else {
                            String v9_14 = (v0_20 + 3);
                            int v11_9 = (v0_20 + 4);
                            while (v11_9 < p17.length()) {
                                int v7_2 = p17.charAt(v11_9);
                                if (v7_2 >= 48) {
                                    if (v7_2 <= 57) {
                                        v11_9++;
                                    } else {
                                    }
                                }
                                int v5_0 = v11_9;
                                String v0_1 = Math.min(v5_0, (v0_20 + 6));
                                v7_0 = a7.a.c(v9_14, v0_1, p17);
                                String v0_2 = (v0_1 - v9_14);
                                if (v0_2 == 1) {
                                    v7_0 *= 100;
                                } else {
                                    if (v0_2 == 2) {
                                        v7_0 *= 10;
                                    } else {
                                    }
                                }
                                v0_3 = v3_16;
                                v3_0 = v5_0;
                                v5_1 = v16_1;
                            }
                            v5_0 = p17.length();
                        }
                    }
                }
                v3_0 = v0_20;
                v0_3 = v3_16;
                v5_1 = v16_1;
            }
        } else {
            String v0_16 = new java.util.GregorianCalendar(v4_15, (v6_0 - 1), v8_1);
            v0_16.setLenient(0);
            p18.setIndex(v3_0);
            return v0_16.getTime();
        }
    }

    public static int c(int p5, int p6, String p7)
    {
        if ((p5 < null) || ((p6 > p7.length()) || (p5 > p6))) {
            throw new NumberFormatException(p7);
        } else {
            StringBuilder v2_0;
            int v3_0;
            if (p5 >= p6) {
                v3_0 = 0;
                v2_0 = p5;
            } else {
                v2_0 = (p5 + 1);
                int v3_2 = Character.digit(p7.charAt(p5), 10);
                if (v3_2 < 0) {
                    StringBuilder v2_2 = new StringBuilder("Invalid number: ");
                    v2_2.append(p7.substring(p5, p6));
                    throw new NumberFormatException(v2_2.toString());
                } else {
                    v3_0 = (- v3_2);
                }
            }
            while (v2_0 < p6) {
                int v4 = (v2_0 + 1);
                StringBuilder v2_4 = Character.digit(p7.charAt(v2_0), 10);
                if (v2_4 < null) {
                    StringBuilder v2_6 = new StringBuilder("Invalid number: ");
                    v2_6.append(p7.substring(p5, p6));
                    throw new NumberFormatException(v2_6.toString());
                } else {
                    v3_0 = ((v3_0 * 10) - v2_4);
                    v2_0 = v4;
                }
            }
            return (- v3_0);
        }
    }
}
