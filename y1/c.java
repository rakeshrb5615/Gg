package y1;
public abstract class c {
    public static final a6.e a;
    public static final byte[] b;
    public static final byte[] c;
    public static final byte[] d;
    public static final byte[] e;
    public static final byte[] f;
    public static final byte[] g;
    public static final byte[] h;
    public static final byte[] i;
    public static final byte[] j;

    static synthetic c()
    {
        y1.c.a = new a6.e();
        byte[] v1_6 = new byte[4];
        v1_6 = {112, 114, 111, 0};
        y1.c.b = v1_6;
        byte[] v1_7 = new byte[4];
        v1_7 = {112, 114, 109, 0};
        y1.c.c = v1_7;
        byte[] v1_0 = new byte[4];
        v1_0 = {48, 49, 53, 0};
        y1.c.d = v1_0;
        byte[] v1_1 = new byte[4];
        v1_1 = {48, 49, 48, 0};
        y1.c.e = v1_1;
        byte[] v1_2 = new byte[4];
        v1_2 = {48, 48, 57, 0};
        y1.c.f = v1_2;
        byte[] v1_3 = new byte[4];
        v1_3 = {48, 48, 53, 0};
        y1.c.g = v1_3;
        byte[] v1_4 = new byte[4];
        v1_4 = {48, 48, 49, 0};
        y1.c.h = v1_4;
        byte[] v1_5 = new byte[4];
        v1_5 = {48, 48, 49, 0};
        y1.c.i = v1_5;
        byte[] v0_2 = new byte[4];
        v0_2 = {48, 48, 50, 0};
        y1.c.j = v0_2;
        return;
    }

    public static byte[] a(byte[] p3)
    {
        java.util.zip.Deflater v0_1 = new java.util.zip.Deflater(1);
        Throwable v1_3 = new java.io.ByteArrayOutputStream();
        try {
            java.util.zip.DeflaterOutputStream v2_1 = new java.util.zip.DeflaterOutputStream(v1_3, v0_1);
            try {
                v2_1.write(p3);
            } catch (byte[] v3_3) {
                try {
                    v2_1.close();
                } catch (Throwable v1_1) {
                    v3_3.addSuppressed(v1_1);
                }
                throw v3_3;
            }
            v2_1.close();
            v0_1.end();
            return v1_3.toByteArray();
        } catch (byte[] v3_2) {
            v0_1.end();
            throw v3_2;
        }
    }

    public static byte[] b(y1.a[] p8, byte[] p9)
    {
        int v1 = 0;
        String v2_2 = 0;
        int v3 = 0;
        while (v2_2 < p8.length) {
            int v4_2 = p8[v2_2];
            v3 += (((((v4_2.g * 2) + 7) & -8) / 8) + (((v4_2.e * 2) + (y1.c.d(p9, v4_2.a, v4_2.b).getBytes(java.nio.charset.StandardCharsets.UTF_8).length + 16)) + v4_2.f));
            v2_2++;
        }
        java.io.ByteArrayOutputStream v0_2 = new java.io.ByteArrayOutputStream(v3);
        if (!java.util.Arrays.equals(p9, y1.c.f)) {
            String v2_0 = p8.length;
            int v4_0 = 0;
            while (v4_0 < v2_0) {
                int v5_0 = p8[v4_0];
                y1.c.q(v0_2, v5_0, y1.c.d(p9, v5_0.a, v5_0.b));
                v4_0++;
            }
            IllegalStateException v9_1 = p8.length;
            while (v1 < v9_1) {
                y1.c.p(v0_2, p8[v1]);
                v1++;
            }
        } else {
            String v2_3 = p8.length;
            while (v1 < v2_3) {
                int v4_1 = p8[v1];
                y1.c.q(v0_2, v4_1, y1.c.d(p9, v4_1.a, v4_1.b));
                y1.c.p(v0_2, v4_1);
                v1++;
            }
        }
        if (v0_2.size() != v3) {
            String v8_3 = new StringBuilder("The bytes saved do not match expectation. actual=");
            v8_3.append(v0_2.size());
            v8_3.append(" expected=");
            v8_3.append(v3);
            throw new IllegalStateException(v8_3.toString());
        } else {
            return v0_2.toByteArray();
        }
    }

    public static boolean c(java.io.File p6)
    {
        if (!p6.isDirectory()) {
            p6.delete();
            return 1;
        } else {
            java.io.File[] v6_1 = p6.listFiles();
            if (v6_1 != null) {
                int v3 = 0;
                int v4 = 1;
                while (v3 < v6_1.length) {
                    if ((!y1.c.c(v6_1[v3])) || (v4 == 0)) {
                        v4 = 0;
                    } else {
                        v4 = 1;
                    }
                    v3++;
                }
                return v4;
            } else {
                return 0;
            }
        }
    }

    public static String d(byte[] p6, String p7, String p8)
    {
        boolean v1_0;
        boolean v0_0 = y1.c.h;
        byte[] v2 = y1.c.g;
        String v3 = "!";
        if ((!java.util.Arrays.equals(p6, v0_0)) && (!java.util.Arrays.equals(p6, v2))) {
            v1_0 = "!";
        } else {
            v1_0 = ":";
        }
        if (p7.length() > 0) {
            if (!p8.equals("classes.dex")) {
                if ((!p8.contains("!")) && (!p8.contains(":"))) {
                    if (!p8.endsWith(".apk")) {
                        StringBuilder v7_1 = u.e.b(p7);
                        if ((java.util.Arrays.equals(p6, v0_0)) || (java.util.Arrays.equals(p6, v2))) {
                            v3 = ":";
                        }
                        return v1.a.n(v7_1, v3, p8);
                    }
                } else {
                    if (!"!".equals(v1_0)) {
                        if (":".equals(v1_0)) {
                            return p8.replace("!", ":");
                        }
                    } else {
                        return p8.replace(":", "!");
                    }
                }
            } else {
                return p7;
            }
        } else {
            if (!"!".equals(v1_0)) {
                if (":".equals(v1_0)) {
                    return p8.replace("!", ":");
                }
            } else {
                return p8.replace(":", "!");
            }
        }
        return p8;
    }

    public static void e(android.content.pm.PackageInfo p2, java.io.File p3)
    {
        try {
            Throwable v3_3 = new java.io.DataOutputStream(new java.io.FileOutputStream(new java.io.File(p3, "profileinstaller_profileWrittenFor_lastUpdateTime.dat")));
            try {
                v3_3.writeLong(p2.lastUpdateTime);
            } catch (Throwable v2_1) {
                try {
                    v3_3.close();
                } catch (Throwable v3_1) {
                    v2_1.addSuppressed(v3_1);
                }
                throw v2_1;
            }
            v3_3.close();
            return;
        } catch (java.io.IOException) {
            return;
        }
    }

    public static byte[] f(java.io.InputStream p3, int p4)
    {
        byte[] v0 = new byte[p4];
        int v1 = 0;
        while (v1 < p4) {
            int v2_1 = p3.read(v0, v1, (p4 - v1));
            if (v2_1 < 0) {
                throw new IllegalStateException(g2.g.c(p4, "Not enough bytes to read: "));
            } else {
                v1 += v2_1;
            }
        }
        return v0;
    }

    public static int[] g(java.io.ByteArrayInputStream p5, int p6)
    {
        int[] v0 = new int[p6];
        int v1 = 0;
        int v2 = 0;
        while (v1 < p6) {
            v2 += ((int) y1.c.m(p5, 2));
            v0[v1] = v2;
            v1++;
        }
        return v0;
    }

    public static byte[] h(java.io.FileInputStream p8, int p9, int p10)
    {
        java.util.zip.Inflater v0_1 = new java.util.zip.Inflater();
        try {
            byte[] v1 = new byte[p10];
            byte[] v2_1 = new byte[2048];
            int v4 = 0;
            int v5 = 0;
        } catch (String v8_11) {
            v0_1.end();
            throw v8_11;
        }
        while ((!v0_1.finished()) && ((!v0_1.needsDictionary()) && (v4 < p9))) {
            int v6_1 = p8.read(v2_1);
            if (v6_1 < 0) {
                String v8_7 = new StringBuilder();
                v8_7.append("Invalid zip data. Stream ended after $totalBytesRead bytes. Expected ");
                v8_7.append(p9);
                v8_7.append(" bytes");
                throw new IllegalStateException(v8_7.toString());
            } else {
                v0_1.setInput(v2_1, 0, v6_1);
                try {
                    v5 += v0_1.inflate(v1, v5, (p10 - v5));
                    v4 += v6_1;
                } catch (String v8_9) {
                    throw new IllegalStateException(v8_9.getMessage());
                }
            }
        }
        if (v4 != p9) {
            String v8_2 = new StringBuilder();
            v8_2.append("Didn\'t read enough bytes during decompression. expected=");
            v8_2.append(p9);
            v8_2.append(" actual=");
            v8_2.append(v4);
            throw new IllegalStateException(v8_2.toString());
        } else {
            if (!v0_1.finished()) {
                throw new IllegalStateException("Inflater did not finish");
            } else {
                v0_1.end();
                return v1;
            }
        }
    }

    public static y1.a[] i(java.io.FileInputStream p6, byte[] p7, byte[] p8, y1.a[] p9)
    {
        int v0_0 = y1.c.i;
        if (!java.util.Arrays.equals(p7, v0_0)) {
            if (!java.util.Arrays.equals(p7, y1.c.j)) {
                throw new IllegalStateException("Unsupported meta version");
            } else {
                Throwable v7_2 = ((int) y1.c.m(p6, 2));
                byte[] vtmp8 = y1.c.h(p6, ((int) y1.c.m(p6, 4)), ((int) y1.c.m(p6, 4)));
                if (p6.read() > 0) {
                    throw new IllegalStateException("Content found after the end of file");
                } else {
                    Throwable v6_7 = new java.io.ByteArrayInputStream(vtmp8);
                    try {
                        Throwable v7_3 = y1.c.k(v6_7, p8, v7_2, p9);
                        v6_7.close();
                        return v7_3;
                    } catch (Throwable v7_4) {
                        try {
                            v6_7.close();
                        } catch (Throwable v6_8) {
                            v7_4.addSuppressed(v6_8);
                        }
                        throw v7_4;
                    }
                }
            }
        } else {
            if (java.util.Arrays.equals(y1.c.d, p8)) {
                throw new IllegalStateException("Requires new Baseline Profile Metadata. Please rebuild the APK with Android Gradle Plugin 7.2 Canary 7 or higher");
            } else {
                if (!java.util.Arrays.equals(p7, v0_0)) {
                    throw new IllegalStateException("Unsupported meta version");
                } else {
                    Throwable v7_9 = ((int) y1.c.m(p6, 1));
                    byte[] vtmp13 = y1.c.h(p6, ((int) y1.c.m(p6, 4)), ((int) y1.c.m(p6, 4)));
                    if (p6.read() > 0) {
                        throw new IllegalStateException("Content found after the end of file");
                    } else {
                        Throwable v6_17 = new java.io.ByteArrayInputStream(vtmp13);
                        try {
                            Throwable v7_10 = y1.c.j(v6_17, v7_9, p9);
                            v6_17.close();
                            return v7_10;
                        } catch (Throwable v7_11) {
                            try {
                                v6_17.close();
                            } catch (Throwable v6_18) {
                                v7_11.addSuppressed(v6_18);
                            }
                            throw v7_11;
                        }
                    }
                }
            }
        }
    }

    public static y1.a[] j(java.io.ByteArrayInputStream p8, int p9, y1.a[] p10)
    {
        int v1 = 0;
        if (p8.available() != 0) {
            if (p9 != p10.length) {
                throw new IllegalStateException("Mismatched number of dex files found in metadata");
            } else {
                String[] v0_1 = new String[p9];
                int[] v2 = new int[p9];
                y1.a v3_0 = 0;
                while (v3_0 < p9) {
                    String v5_2 = ((int) y1.c.m(p8, 2));
                    v2[v3_0] = ((int) y1.c.m(p8, 2));
                    v0_1[v3_0] = new String(y1.c.f(p8, v5_2), java.nio.charset.StandardCharsets.UTF_8);
                    v3_0++;
                }
                while (v1 < p9) {
                    y1.a v3_1 = p10[v1];
                    if (!v3_1.b.equals(v0_1[v1])) {
                        throw new IllegalStateException("Order of dexfiles in metadata did not match baseline");
                    } else {
                        int[] v4_2 = v2[v1];
                        v3_1.e = v4_2;
                        v3_1.h = y1.c.g(p8, v4_2);
                        v1++;
                    }
                }
                return p10;
            }
        } else {
            IllegalStateException v8_3 = new y1.a[0];
            return v8_3;
        }
    }

    public static y1.a[] k(java.io.ByteArrayInputStream p10, byte[] p11, int p12, y1.a[] p13)
    {
        if (p10.available() != 0) {
            if (p12 != p13.length) {
                throw new IllegalStateException("Mismatched number of dex files found in metadata");
            } else {
                int v0_1 = 0;
                while (v0_1 < p12) {
                    y1.c.m(p10, 2);
                    boolean v4_1 = new String(y1.c.f(p10, ((int) y1.c.m(p10, 2))), java.nio.charset.StandardCharsets.UTF_8);
                    long v5_1 = y1.c.m(p10, 4);
                    int v2_2 = ((int) y1.c.m(p10, 2));
                    y1.a v7 = 0;
                    if (p13.length > 0) {
                        boolean v3_6 = v4_1.indexOf("!");
                        if (v3_6) {
                            v3_6 = v4_1.indexOf(":");
                        }
                        boolean v3_8;
                        if (v3_6) {
                            v3_8 = v4_1;
                        } else {
                            v3_8 = v4_1.substring((v3_6 + 1));
                        }
                        int v8 = 0;
                        while (v8 < p13.length) {
                            if (!p13[v8].b.equals(v3_8)) {
                                v8++;
                            } else {
                                v7 = p13[v8];
                                break;
                            }
                        }
                    }
                    if (v7 == null) {
                        throw new IllegalStateException("Missing profile key: ".concat(v4_1));
                    } else {
                        v7.d = v5_1;
                        boolean v3_10 = y1.c.g(p10, v2_2);
                        if (java.util.Arrays.equals(p11, y1.c.h)) {
                            v7.e = v2_2;
                            v7.h = v3_10;
                        }
                        v0_1++;
                    }
                }
                return p13;
            }
        } else {
            String v10_4 = new y1.a[0];
            return v10_4;
        }
    }

    public static y1.a[] l(java.io.FileInputStream p5, byte[] p6, String p7)
    {
        if (!java.util.Arrays.equals(p6, y1.c.e)) {
            throw new IllegalStateException("Unsupported version");
        } else {
            Throwable v6_1 = ((int) y1.c.m(p5, 1));
            byte[] v0_4 = y1.c.h(p5, ((int) y1.c.m(p5, 4)), ((int) y1.c.m(p5, 4)));
            if (p5.read() > 0) {
                throw new IllegalStateException("Content found after the end of file");
            } else {
                Throwable v5_5 = new java.io.ByteArrayInputStream(v0_4);
                try {
                    Throwable v6_4 = y1.c.n(v5_5, p7, v6_1);
                    v5_5.close();
                    return v6_4;
                } catch (Throwable v6_5) {
                    try {
                        v5_5.close();
                    } catch (Throwable v5_6) {
                        v6_5.addSuppressed(v5_6);
                    }
                    throw v6_5;
                }
            }
        }
    }

    public static long m(java.io.InputStream p6, int p7)
    {
        byte[] v6_1 = y1.c.f(p6, p7);
        long v0 = 0;
        int v2 = 0;
        while (v2 < p7) {
            v0 += (((long) (v6_1[v2] & 255)) << (v2 * 8));
            v2++;
        }
        return v0;
    }

    public static y1.a[] n(java.io.ByteArrayInputStream p19, String p20, int p21)
    {
        java.util.BitSet v3_2 = 0;
        if (p19.available() != 0) {
            y1.a[] v2_1 = new y1.a[p21];
            int v4_1 = 0;
            while (v4_1 < p21) {
                int v14_1 = ((int) y1.c.m(p19, 2));
                int v7_2 = new int[v14_1];
                v2_1[v4_1] = new y1.a(p20, new String(y1.c.f(p19, ((int) y1.c.m(p19, 2))), java.nio.charset.StandardCharsets.UTF_8), y1.c.m(p19, 4), v14_1, ((int) y1.c.m(p19, 4)), ((int) y1.c.m(p19, 4)), v7_2, new java.util.TreeMap());
                v4_1++;
            }
            int v4_0 = 0;
            while (v4_0 < p21) {
                Integer v6_2 = v2_1[v4_0];
                int v9_3 = v6_2.g;
                java.util.TreeMap v10_1 = v6_2.i;
                int v7_4 = (p19.available() - v6_2.f);
                Integer v8_1 = v3_2;
                while (p19.available() > v7_4) {
                    v8_1 += ((int) y1.c.m(p19, 2));
                    v10_1.put(Integer.valueOf(v8_1), Integer.valueOf(1));
                    int v11_0 = ((int) y1.c.m(p19, 2));
                    while (v11_0 > 0) {
                        y1.c.m(p19, 2);
                        int v14_0 = ((int) y1.c.m(p19, 1));
                        if ((v14_0 != 6) && (v14_0 != 7)) {
                            while (v14_0 > 0) {
                                y1.c.m(p19, 1);
                                java.util.BitSet v15_0 = v3_2;
                                int v16_0 = v4_0;
                                java.util.BitSet v3_1 = ((int) y1.c.m(p19, 1));
                                while (v3_1 > null) {
                                    y1.c.m(p19, 2);
                                    v3_1--;
                                }
                                v14_0--;
                                v3_2 = v15_0;
                                v4_0 = v16_0;
                            }
                        }
                        v11_0--;
                    }
                }
                java.util.BitSet v15_4 = v3_2;
                int v16_3 = v4_0;
                if (p19.available() != v7_4) {
                    throw new IllegalStateException("Read too much data during profile line parse");
                } else {
                    v6_2.h = y1.c.g(p19, v6_2.e);
                    java.util.BitSet v3_11 = java.util.BitSet.valueOf(y1.c.f(p19, ((((v9_3 * 2) + 7) & -8) / 8)));
                    int v4_2 = v15_4;
                    while (v4_2 < v9_3) {
                        Integer v6_6;
                        if (!v3_11.get(v4_2)) {
                            v6_6 = v15_4;
                        } else {
                            v6_6 = 2;
                        }
                        if (v3_11.get((v4_2 + v9_3))) {
                            v6_6 |= 4;
                        }
                        if (v6_6 != null) {
                            int v7_9 = ((Integer) v10_1.get(Integer.valueOf(v4_2)));
                            if (v7_9 == 0) {
                                v7_9 = Integer.valueOf(v15_4);
                            }
                            v10_1.put(Integer.valueOf(v4_2), Integer.valueOf((v6_6 | v7_9.intValue())));
                        }
                        v4_2++;
                    }
                    v4_0 = (v16_3 + 1);
                    v3_2 = v15_4;
                }
            }
            return v2_1;
        } else {
            IllegalStateException v0_1 = new y1.a[0];
            return v0_1;
        }
    }

    public static boolean o(java.io.ByteArrayOutputStream p19, byte[] p20, y1.a[] p21)
    {
        java.io.ByteArrayOutputStream v3_9 = y1.c.d;
        long v6_21 = 0;
        if (!java.util.Arrays.equals(p20, v3_9)) {
            java.io.ByteArrayOutputStream v3_0 = y1.c.e;
            if (!java.util.Arrays.equals(p20, v3_0)) {
                java.io.ByteArrayOutputStream v3_1 = y1.c.g;
                if (!java.util.Arrays.equals(p20, v3_1)) {
                    java.io.ByteArrayOutputStream v3_3 = y1.c.f;
                    if (!java.util.Arrays.equals(p20, v3_3)) {
                        java.io.ByteArrayOutputStream v3_8 = y1.c.h;
                        if (!java.util.Arrays.equals(p20, v3_8)) {
                            return 0;
                        } else {
                            y1.c.v(p19, p21.length);
                            Throwable v1_19 = p21.length;
                            byte[] v8_11 = 0;
                            while (v8_11 < v1_19) {
                                int v4_13 = p21[v8_11];
                                int v7_9 = v4_13.i;
                                long v6_20 = y1.c.d(v3_8, v4_13.a, v4_13.b);
                                long v9_20 = java.nio.charset.StandardCharsets.UTF_8;
                                y1.c.v(p19, v6_20.getBytes(v9_20).length);
                                y1.c.v(p19, v7_9.size());
                                y1.c.v(p19, v4_13.h.length);
                                y1.c.u(p19, v4_13.c, 4);
                                p19.write(v6_20.getBytes(v9_20));
                                long v6_25 = v7_9.keySet().iterator();
                                while (v6_25.hasNext()) {
                                    y1.c.v(p19, ((Integer) v6_25.next()).intValue());
                                }
                                int v4_15 = v4_13.h;
                                long v6_26 = v4_15.length;
                                int v7_12 = 0;
                                while (v7_12 < v6_26) {
                                    y1.c.v(p19, v4_15[v7_12]);
                                    v7_12++;
                                }
                                v8_11++;
                            }
                        }
                    } else {
                        Throwable v1_25 = y1.c.b(p21, v3_3);
                        y1.c.u(p19, ((long) p21.length), 1);
                        y1.c.u(p19, ((long) v1_25.length), 4);
                        Throwable v1_26 = y1.c.a(v1_25);
                        y1.c.u(p19, ((long) v1_26.length), 4);
                        p19.write(v1_26);
                        return 1;
                    }
                } else {
                    y1.c.u(p19, ((long) p21.length), 1);
                    Throwable v1_28 = p21.length;
                    int v4_1 = 0;
                    while (v4_1 < v1_28) {
                        long v6_28 = p21[v4_1];
                        int v7_2 = (v6_28.i.size() * 4);
                        byte[] v8_1 = y1.c.d(v3_1, v6_28.a, v6_28.b);
                        long v9_1 = java.nio.charset.StandardCharsets.UTF_8;
                        y1.c.v(p19, v8_1.getBytes(v9_1).length);
                        y1.c.v(p19, v6_28.h.length);
                        y1.c.u(p19, ((long) v7_2), 4);
                        y1.c.u(p19, v6_28.c, 4);
                        p19.write(v8_1.getBytes(v9_1));
                        int v7_6 = v6_28.i.keySet().iterator();
                        while (v7_6.hasNext()) {
                            y1.c.v(p19, ((Integer) v7_6.next()).intValue());
                            y1.c.v(p19, 0);
                        }
                        long v6_0 = v6_28.h;
                        int v7_7 = v6_0.length;
                        byte[] v8_3 = 0;
                        while (v8_3 < v7_7) {
                            y1.c.v(p19, v6_0[v8_3]);
                            v8_3++;
                        }
                        v4_1++;
                    }
                }
            } else {
                Throwable v1_1 = y1.c.b(p21, v3_0);
                y1.c.u(p19, ((long) p21.length), 1);
                y1.c.u(p19, ((long) v1_1.length), 4);
                Throwable v1_2 = y1.c.a(v1_1);
                y1.c.u(p19, ((long) v1_2.length), 4);
                p19.write(v1_2);
                return 1;
            }
        } else {
            Throwable v1_4 = new java.util.ArrayList(3);
            byte[] v8_9 = new java.util.ArrayList(3);
            long v9_4 = new java.io.ByteArrayOutputStream();
            y1.c.v(v9_4, p21.length);
            long v10_7 = 2;
            int v11_0 = 0;
            byte[] v12_0 = 2;
            while (v11_0 < p21.length) {
                String v13_2 = p21[v11_0];
                y1.c.u(v9_4, v13_2.c, 4);
                y1.c.u(v9_4, v13_2.d, 4);
                y1.c.u(v9_4, ((long) v13_2.g), 4);
                String v13_4 = y1.c.d(v3_9, v13_2.a, v13_2.b);
                byte[] v12_11 = (v12_0 + 14);
                String v14_6 = java.nio.charset.StandardCharsets.UTF_8;
                int v15_10 = v13_4.getBytes(v14_6).length;
                y1.c.v(v9_4, v15_10);
                v12_0 = (v12_11 + v15_10);
                v9_4.write(v13_4.getBytes(v14_6));
                v11_0++;
            }
            java.io.ByteArrayOutputStream v3_2 = v9_4.toByteArray();
            if (v12_0 != v3_2.length) {
                int v0_2 = new StringBuilder();
                v0_2.append("Expected size ");
                v0_2.append(v12_0);
                v0_2.append(", does not match actual size ");
                v0_2.append(v3_2.length);
                throw new IllegalStateException(v0_2.toString());
            } else {
                int v11_3 = new y1.h(1, v3_2, 0);
                v9_4.close();
                v1_4.add(v11_3);
                java.io.ByteArrayOutputStream v3_5 = new java.io.ByteArrayOutputStream();
                v9_4 = 0;
                int v11_4 = 0;
                while (v9_4 < p21.length) {
                    byte[] v12_9 = p21[v9_4];
                    y1.c.v(v3_5, v9_4);
                    int v11_6 = (v11_4 + 4);
                    y1.c.v(v3_5, v12_9.e);
                    v11_4 = (v11_6 + (v12_9.e * v10_7));
                    byte[] v12_10 = v12_9.h;
                    int v15_8 = v12_10.length;
                    long v16_2 = v6_21;
                    long v20_1 = v10_7;
                    long v10_20 = v16_2;
                    while (v10_20 < v15_8) {
                        int v17 = v12_10[v10_20];
                        y1.c.v(v3_5, (v17 - v16_2));
                        v10_20++;
                        v16_2 = v17;
                    }
                    v9_4++;
                    v10_7 = v20_1;
                    v6_21 = 0;
                }
                long v6_1 = v3_5.toByteArray();
                if (v11_4 != v6_1.length) {
                    int v0_5 = new StringBuilder();
                    v0_5.append("Expected size ");
                    v0_5.append(v11_4);
                    v0_5.append(", does not match actual size ");
                    v0_5.append(v6_1.length);
                    throw new IllegalStateException(v0_5.toString());
                } else {
                    long v9_7 = new y1.h(3, v6_1, 1);
                    v3_5.close();
                    v1_4.add(v9_7);
                    java.io.ByteArrayOutputStream v3_7 = new java.io.ByteArrayOutputStream();
                    int v4_5 = 0;
                    long v6_2 = 0;
                    try {
                        while (v4_5 < p21.length) {
                            long v9_17 = p21[v4_5];
                            long v10_12 = v9_17.i.entrySet().iterator();
                            int v11_5 = 0;
                            while (v10_12.hasNext()) {
                                v11_5 |= ((Integer) ((java.util.Map$Entry) v10_12.next()).getValue()).intValue();
                            }
                            long v10_14 = new java.io.ByteArrayOutputStream();
                            try {
                                y1.c.r(v10_14, v11_5, v9_17);
                                byte[] v12_3 = v10_14.toByteArray();
                            } catch (int v0_11) {
                                Throwable v1_20 = v0_11;
                                try {
                                    v10_14.close();
                                } catch (int v0_12) {
                                    v1_20.addSuppressed(v0_12);
                                }
                                throw v1_20;
                            }
                            v10_14.close();
                            long v10_16 = new java.io.ByteArrayOutputStream();
                            try {
                                y1.c.s(v10_16, v9_17);
                                long v9_18 = v10_16.toByteArray();
                            } catch (int v0_13) {
                                Throwable v1_21 = v0_13;
                                try {
                                    v10_16.close();
                                } catch (int v0_14) {
                                    v1_21.addSuppressed(v0_14);
                                }
                                throw v1_21;
                            }
                            v10_16.close();
                            y1.c.v(v3_7, v4_5);
                            long v10_19 = ((v12_3.length + 2) + v9_18.length);
                            long v6_19 = (v6_2 + 6);
                            long v16_1 = v8_9;
                            y1.c.u(v3_7, ((long) v10_19), 4);
                            y1.c.v(v3_7, v11_5);
                            v3_7.write(v12_3);
                            v3_7.write(v9_18);
                            v6_2 = (v6_19 + v10_19);
                            v4_5++;
                            v8_9 = v16_1;
                        }
                    } catch (int v0_15) {
                        Throwable v1_22 = v0_15;
                        try {
                            v3_7.close();
                        } catch (int v0_16) {
                            v1_22.addSuppressed(v0_16);
                        }
                        throw v1_22;
                    }
                    long v16_0 = v8_9;
                    long v2_7 = v3_7.toByteArray();
                    if (v6_2 != v2_7.length) {
                        int v0_8 = new StringBuilder();
                        v0_8.append("Expected size ");
                        v0_8.append(v6_2);
                        v0_8.append(", does not match actual size ");
                        v0_8.append(v2_7.length);
                        throw new IllegalStateException(v0_8.toString());
                    } else {
                        int v4_8 = new y1.h(4, v2_7, 1);
                        v3_7.close();
                        v1_4.add(v4_8);
                        long v2_11 = (((((long) 4) + ((long) 4)) + 4) + ((long) (v1_4.size() * 16)));
                        y1.c.u(p19, ((long) v1_4.size()), 4);
                        int v4_12 = 0;
                        while (v4_12 < v1_4.size()) {
                            long v9_11;
                            long v6_9 = ((y1.h) v1_4.get(v4_12));
                            int v7_8 = v6_9.a;
                            byte[] v8_10 = v6_9.b;
                            if (v7_8 == 1) {
                                v9_11 = 0;
                            } else {
                                if (v7_8 == 2) {
                                    v9_11 = 1;
                                } else {
                                    if (v7_8 == 3) {
                                        v9_11 = 2;
                                    } else {
                                        if (v7_8 == 4) {
                                            v9_11 = 3;
                                        } else {
                                            if (v7_8 != 5) {
                                                throw 0;
                                            } else {
                                                v9_11 = 4;
                                            }
                                        }
                                    }
                                }
                            }
                            long v9_16;
                            long v6_14;
                            y1.c.u(p19, v9_11, 4);
                            y1.c.u(p19, v2_11, 4);
                            if (!v6_9.c) {
                                v9_16 = v16_0;
                                v9_16.add(v8_10);
                                y1.c.u(p19, ((long) v8_10.length), 4);
                                y1.c.u(p19, 0, 4);
                                v6_14 = v8_10.length;
                            } else {
                                long v6_16 = ((long) v8_10.length);
                                byte[] v8_12 = y1.c.a(v8_10);
                                v9_16 = v16_0;
                                v9_16.add(v8_12);
                                y1.c.u(p19, ((long) v8_12.length), 4);
                                y1.c.u(p19, v6_16, 4);
                                v6_14 = v8_12.length;
                            }
                            v2_11 += ((long) v6_14);
                            v4_12++;
                            v16_0 = v9_16;
                        }
                        long v9_9 = v16_0;
                        long v6_7 = 0;
                        while (v6_7 < v9_9.size()) {
                            p19.write(((byte[]) v9_9.get(v6_7)));
                            v6_7++;
                        }
                    }
                }
            }
        }
        return 1;
    }

    public static void p(java.io.ByteArrayOutputStream p8, y1.a p9)
    {
        y1.c.s(p8, p9);
        int v0 = p9.g;
        byte[] v1_2 = p9.h;
        int v2_3 = v1_2.length;
        byte v3_3 = 0;
        byte v4_3 = 0;
        while (v3_3 < v2_3) {
            int v5_1 = v1_2[v3_3];
            y1.c.v(p8, (v5_1 - v4_3));
            v3_3++;
            v4_3 = v5_1;
        }
        byte[] v1_1 = new byte[((((v0 * 2) + 7) & -8) / 8)];
        java.util.Iterator v9_3 = p9.i.entrySet().iterator();
        while (v9_3.hasNext()) {
            int v2_2 = ((java.util.Map$Entry) v9_3.next());
            byte v3_2 = ((Integer) v2_2.getKey()).intValue();
            int v2_6 = ((Integer) v2_2.getValue()).intValue();
            if ((v2_6 & 2) != 0) {
                byte v4_1 = (v3_2 / 8);
                v1_1[v4_1] = ((byte) (v1_1[v4_1] | (1 << (v3_2 % 8))));
            }
            if ((v2_6 & 4) != 0) {
                byte v3_4 = (v3_2 + v0);
                int v2_8 = (v3_4 / 8);
                v1_1[v2_8] = ((byte) ((1 << (v3_4 % 8)) | v1_1[v2_8]));
            }
        }
        p8.write(v1_1);
        return;
    }

    public static void q(java.io.ByteArrayOutputStream p4, y1.a p5, String p6)
    {
        java.nio.charset.Charset v0 = java.nio.charset.StandardCharsets.UTF_8;
        y1.c.v(p4, p6.getBytes(v0).length);
        y1.c.v(p4, p5.e);
        y1.c.u(p4, ((long) p5.f), 4);
        y1.c.u(p4, p5.c, 4);
        y1.c.u(p4, ((long) p5.g), 4);
        p4.write(p6.getBytes(v0));
        return;
    }

    public static void r(java.io.ByteArrayOutputStream p10, int p11, y1.a p12)
    {
        int v0 = p12.g;
        byte[] v1_6 = new byte[((((Integer.bitCount((p11 & -2)) * v0) + 7) & -8) / 8)];
        java.util.Iterator v12_2 = p12.i.entrySet().iterator();
        while (v12_2.hasNext()) {
            int v2_2 = ((java.util.Map$Entry) v12_2.next());
            int v3_2 = ((Integer) v2_2.getKey()).intValue();
            int v2_5 = ((Integer) v2_2.getValue()).intValue();
            int v5 = 0;
            int v6 = 1;
            while (v6 <= 4) {
                if ((v6 != 1) && ((v6 & p11) != 0)) {
                    if ((v6 & v2_5) == v6) {
                        byte v7_4 = ((v5 * v0) + v3_2);
                        int v8 = (v7_4 / 8);
                        v1_6[v8] = ((byte) ((1 << (v7_4 % 8)) | v1_6[v8]));
                    }
                    v5++;
                }
                v6 <<= 1;
            }
        }
        p10.write(v1_6);
        return;
    }

    public static void s(java.io.ByteArrayOutputStream p4, y1.a p5)
    {
        java.util.Iterator v5_3 = p5.i.entrySet().iterator();
        int v1_1 = 0;
        while (v5_3.hasNext()) {
            int v2_1 = ((java.util.Map$Entry) v5_3.next());
            int v3_2 = ((Integer) v2_1.getKey()).intValue();
            if ((((Integer) v2_1.getValue()).intValue() & 1) != 0) {
                y1.c.v(p4, (v3_2 - v1_1));
                y1.c.v(p4, 0);
                v1_1 = v3_2;
            }
        }
        return;
    }

    public static void t(android.content.Context p18, java.util.concurrent.Executor p19, y1.b p20, boolean p21)
    {
        Throwable v0_60 = p18.getApplicationContext();
        Throwable v2_1 = v0_60.getPackageName();
        int v3_11 = v0_60.getApplicationInfo();
        Throwable v4_8 = v0_60.getAssets();
        int v6_4 = new java.io.File(v3_11.sourceDir).getName();
        try {
            android.content.pm.PackageInfo v10 = p18.getPackageManager().getPackageInfo(v2_1, 0);
            java.io.File v11 = p18.getFilesDir();
        } catch (Throwable v0_49) {
            p20.j(7, v0_49);
            y1.g.c(p18, 0);
            return;
        }
        if (p21) {
            int v7_0;
            int v9_9;
            Throwable v0_76 = new StringBuilder("Installing profile for ");
            v0_76.append(p18.getPackageName());
            android.util.Log.d("ProfileInstaller", v0_76.toString());
            int v7_19 = new java.io.File(new java.io.File("/data/misc/profiles/cur/0", v2_1), "primary.prof");
            int v3_13 = v4_8;
            Throwable v2_0 = new u8.i(v3_13, p19, p20, v6_4, v7_19);
            Throwable v4_10 = ((byte[]) v2_0.e);
            if (v4_10 != null) {
                if (!v7_19.exists()) {
                    try {
                        if (!v7_19.createNewFile()) {
                            v2_0.n(4, 0);
                            v7_0 = 1;
                            v9_9 = 0;
                            if ((v9_9 == 0) || (!p21)) {
                                int v9_10 = 0;
                            } else {
                                v9_10 = v7_0;
                            }
                            y1.g.c(p18, v9_10);
                            return;
                        }
                    } catch (java.io.IOException) {
                        v7_0 = 1;
                        v2_0.n(4, 0);
                    }
                } else {
                    if (!v7_19.canWrite()) {
                        v2_0.n(4, 0);
                    }
                }
                v2_0.b = 1;
                try {
                    int v7_1 = v2_0.m(v3_13, "dexopt/baseline.prof");
                } catch (Throwable v0_3) {
                    p20.j(6, v0_3);
                    v7_1 = 0;
                } catch (Throwable v0_2) {
                    p20.j(7, v0_2);
                }
                byte[] v15 = y1.c.b;
                if (v7_1 != 0) {
                    try {
                        if (!java.util.Arrays.equals(v15, y1.c.f(v7_1, 4))) {
                            throw new IllegalStateException("Invalid magic");
                        } else {
                            int v9_1 = y1.c.l(v7_1, y1.c.f(v7_1, 4), v2_0.a);
                            try {
                                v7_1.close();
                            } catch (Throwable v0_15) {
                                p20.j(7, v0_15);
                            }
                        }
                    } catch (Throwable v0_11) {
                        p20.j(7, v0_11);
                        try {
                            v7_1.close();
                        } catch (Throwable v0_14) {
                            p20.j(7, v0_14);
                        }
                        v9_1 = 0;
                    } catch (Throwable v0_10) {
                        p20.j(8, v0_10);
                    } catch (Throwable v0_12) {
                        Throwable v1_1 = v0_12;
                        try {
                            v7_1.close();
                        } catch (Throwable v0_13) {
                            p20.j(7, v0_13);
                        }
                        throw v1_1;
                    }
                    v2_0.g = v9_1;
                }
                Throwable v0_17 = ((y1.a[]) v2_0.g);
                if ((v0_17 != null) && (android.os.Build$VERSION.SDK_INT >= 31)) {
                    try {
                        Throwable v0_24;
                        int v3_1 = v2_0.m(v3_13, "dexopt/baseline.profm");
                    } catch (Throwable v0_27) {
                        p20.j(9, v0_27);
                        v0_24 = 0;
                        if (v0_24 != null) {
                            v2_0 = v0_24;
                        }
                    } catch (Throwable v0_26) {
                        p20.j(7, v0_26);
                    } catch (Throwable v0_25) {
                        v2_0.g = 0;
                        p20.j(8, v0_25);
                    }
                    if (v3_1 == 0) {
                        if (v3_1 == 0) {
                        } else {
                            v3_1.close();
                        }
                    } else {
                        try {
                            if (!java.util.Arrays.equals(y1.c.c, y1.c.f(v3_1, 4))) {
                                throw new IllegalStateException("Invalid magic");
                            } else {
                                v2_0.g = y1.c.i(v3_1, y1.c.f(v3_1, 4), v4_10, v0_17);
                                v3_1.close();
                                v0_24 = v2_0;
                            }
                        } catch (Throwable v0_22) {
                            Throwable v4_0 = v0_22;
                            try {
                                v3_1.close();
                            } catch (Throwable v0_23) {
                                v4_0.addSuppressed(v0_23);
                            }
                            throw v4_0;
                        }
                    }
                }
                int v3_4 = ((y1.b) v2_0.d);
                Throwable v0_30 = ((y1.a[]) v2_0.g);
                Throwable v4_2 = ((byte[]) v2_0.e);
                if ((v0_30 != null) && (v4_2 != null)) {
                    if (!v2_0.b) {
                        throw new IllegalStateException("This device doesn\'t support aot. Did you call deviceSupportsAotProfile()?");
                    } else {
                        try {
                            int v7_9 = new java.io.ByteArrayOutputStream();
                            try {
                                v7_9.write(v15);
                                v7_9.write(v4_2);
                            } catch (Throwable v0_36) {
                                Throwable v4_3 = v0_36;
                                try {
                                    v7_9.close();
                                } catch (Throwable v0_37) {
                                    v4_3.addSuppressed(v0_37);
                                }
                                throw v4_3;
                            }
                            if (y1.c.o(v7_9, v4_2, v0_30)) {
                                v2_0.h = v7_9.toByteArray();
                                v7_9.close();
                                v2_0.g = 0;
                            } else {
                                v3_4.j(5, 0);
                                v2_0.g = 0;
                                v7_9.close();
                            }
                        } catch (Throwable v0_39) {
                            v3_4.j(7, v0_39);
                        } catch (Throwable v0_38) {
                            v3_4.j(8, v0_38);
                        }
                    }
                }
                int v6_7;
                Throwable v0_41 = ((byte[]) v2_0.h);
                if (v0_41 != null) {
                    if (!v2_0.b) {
                        throw new IllegalStateException("This device doesn\'t support aot. Did you call deviceSupportsAotProfile()?");
                    } else {
                        try {
                            int v3_8 = new java.io.ByteArrayInputStream(v0_41);
                            try {
                                Throwable v4_5 = new java.io.FileOutputStream(((java.io.File) v2_0.f));
                                try {
                                    Throwable v5_2 = v4_5.getChannel();
                                    try {
                                        int v6_5 = v5_2.tryLock();
                                        try {
                                            if ((v6_5 == 0) || (!v6_5.isValid())) {
                                                v7_0 = 1;
                                                throw new java.io.IOException("Unable to acquire a lock on the underlying file channel.");
                                            } else {
                                                Throwable v0_56 = new byte[512];
                                                while(true) {
                                                    int v7_10 = v3_8.read(v0_56);
                                                    if (v7_10 <= 0) {
                                                        break;
                                                    }
                                                    v4_5.write(v0_56, 0, v7_10);
                                                }
                                                v7_0 = 1;
                                                v2_0.n(1, 0);
                                                v6_5.close();
                                                v5_2.close();
                                                v4_5.close();
                                                v3_8.close();
                                                v2_0.h = 0;
                                                v2_0.g = 0;
                                                v6_7 = 1;
                                                if (v6_7 != 0) {
                                                    y1.c.e(v10, v11);
                                                }
                                                v9_9 = v6_7;
                                            }
                                        } catch (Throwable v0_57) {
                                            v7_0 = 1;
                                        } catch (Throwable v0_57) {
                                        } catch (Throwable v0_51) {
                                            int v6_6 = v0_51;
                                            if (v5_2 != null) {
                                                try {
                                                    v5_2.close();
                                                } catch (Throwable v0_59) {
                                                    v6_6.addSuppressed(v0_59);
                                                }
                                            }
                                            throw v6_6;
                                        }
                                        int v9_7 = v0_57;
                                        if (v6_5 != 0) {
                                            try {
                                                v6_5.close();
                                            } catch (Throwable v0_58) {
                                                v9_7.addSuppressed(v0_58);
                                            }
                                        }
                                        throw v9_7;
                                    } catch (Throwable v0_51) {
                                        v7_0 = 1;
                                    } catch (Throwable v0_50) {
                                        Throwable v5_3 = v0_50;
                                        try {
                                            v4_5.close();
                                        } catch (Throwable v0_61) {
                                            v5_3.addSuppressed(v0_61);
                                        }
                                        throw v5_3;
                                    }
                                } catch (Throwable v0_50) {
                                    v7_0 = 1;
                                } catch (Throwable v0_48) {
                                    Throwable v4_6 = v0_48;
                                    try {
                                        v3_8.close();
                                    } catch (Throwable v0_63) {
                                        v4_6.addSuppressed(v0_63);
                                    }
                                    throw v4_6;
                                }
                            } catch (Throwable v0_48) {
                                v7_0 = 1;
                            } catch (Throwable v0_45) {
                                v2_0.n(6, v0_45);
                                v2_0.h = 0;
                                v2_0.g = 0;
                                v6_7 = 0;
                            } catch (Throwable v0_44) {
                                v2_0.n(7, v0_44);
                            }
                        } catch (Throwable v0_45) {
                            v7_0 = 1;
                        } catch (Throwable v0_44) {
                            v7_0 = 1;
                        } catch (Throwable v0_64) {
                            v2_0.h = 0;
                            v2_0.g = 0;
                            throw v0_64;
                        }
                    }
                } else {
                    v6_7 = 0;
                    v7_0 = 1;
                }
            } else {
                v2_0.n(3, Integer.valueOf(android.os.Build$VERSION.SDK_INT));
            }
        } else {
            Throwable v0_71;
            Throwable v0_65 = new java.io.File(v11, "profileinstaller_profileWrittenFor_lastUpdateTime.dat");
            try {
                if (v0_65.exists()) {
                    int v7_14 = new java.io.DataInputStream(new java.io.FileInputStream(v0_65));
                    try {
                        String v14_3 = v7_14.readLong();
                    } catch (Throwable v0_68) {
                        long v13_0 = v0_68;
                        try {
                            v7_14.close();
                        } catch (Throwable v0_69) {
                            v13_0.addSuppressed(v0_69);
                        }
                        throw v13_0;
                    }
                    v7_14.close();
                    if (v14_3 != v10.lastUpdateTime) {
                        v0_71 = 0;
                    } else {
                        v0_71 = 1;
                    }
                    if (v0_71 != null) {
                        p20.j(2, 0);
                    }
                } else {
                    v0_71 = 0;
                }
            } catch (java.io.IOException) {
            }
            if (v0_71 != null) {
                Throwable v0_73 = new StringBuilder("Skipping profile installation for ");
                v0_73.append(p18.getPackageName());
                android.util.Log.d("ProfileInstaller", v0_73.toString());
                y1.g.c(p18, 0);
            }
        }
        return;
    }

    public static void u(java.io.ByteArrayOutputStream p6, long p7, int p9)
    {
        byte[] v0 = new byte[p9];
        int v1 = 0;
        while (v1 < p9) {
            v0[v1] = ((byte) ((int) ((p7 >> (v1 * 8)) & 255)));
            v1++;
        }
        p6.write(v0);
        return;
    }

    public static void v(java.io.ByteArrayOutputStream p2, int p3)
    {
        y1.c.u(p2, ((long) p3), 2);
        return;
    }
}
