package androidx.datastore.preferences.protobuf;
public final class i1 extends a.a {
    public final synthetic int b;

    public synthetic i1(int p1)
    {
        this.b = p1;
        return;
    }

    public final String o(byte[] p11, int p12, int p13)
    {
        switch (this.b) {
            case 0:
                if (((p12 | p13) | ((p11.length - p12) - p13)) < 0) {
                    throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", new Object[] {Integer.valueOf(p11.length), Integer.valueOf(p12), Integer.valueOf(p13)})));
                } else {
                    ArrayIndexOutOfBoundsException v0_5 = (p12 + p13);
                    Integer v13_3 = new char[p13];
                    int v2_0 = 0;
                    while (p12 < v0_5) {
                        char v3_11 = p11[p12];
                        if (v3_11 < 0) {
                            break;
                        }
                        p12++;
                        int v4_7 = (v2_0 + 1);
                        v13_3[v2_0] = ((char) v3_11);
                        v2_0 = v4_7;
                    }
                    while (p12 < v0_5) {
                        char v3_9 = (p12 + 1);
                        int v4_8 = p11[p12];
                        if (v4_8 < 0) {
                            if (v4_8 >= -32) {
                                if (v4_8 >= -16) {
                                    if (v3_9 >= (v0_5 - 2)) {
                                        throw androidx.datastore.preferences.protobuf.z.a();
                                    } else {
                                        char v3_12 = p11[v3_9];
                                        androidx.datastore.preferences.protobuf.z v6_3 = (p12 + 3);
                                        int v5_6 = p11[(p12 + 2)];
                                        p12 += 4;
                                        androidx.datastore.preferences.protobuf.z v6_4 = p11[v6_3];
                                        int v7_1 = (v2_0 + 1);
                                        if ((q4.b.D(v3_12)) || (((((v3_12 + 112) + (v4_8 << 28)) >> 30) != 0) || ((q4.b.D(v5_6)) || (q4.b.D(v6_4))))) {
                                            throw androidx.datastore.preferences.protobuf.z.a();
                                        } else {
                                            char v3_17 = (((((v3_12 & 63) << 12) | ((v4_8 & 7) << 18)) | ((v5_6 & 63) << 6)) | (v6_4 & 63));
                                            v13_3[v2_0] = ((char) ((v3_17 >> 10) + 55232));
                                            v13_3[v7_1] = ((char) ((v3_17 & 1023) + 56320));
                                            v2_0 += 2;
                                        }
                                    }
                                } else {
                                    if (v3_9 >= (v0_5 - 1)) {
                                        throw androidx.datastore.preferences.protobuf.z.a();
                                    } else {
                                        androidx.datastore.preferences.protobuf.z v6_6 = (p12 + 2);
                                        char v3_21 = p11[v3_9];
                                        p12 += 3;
                                        androidx.datastore.preferences.protobuf.z v6_7 = p11[v6_6];
                                        int v7_0 = (v2_0 + 1);
                                        if (((q4.b.D(v3_21)) || ((v4_8 == -32) && (v3_21 < -96))) || (((v4_8 == -19) && (v3_21 >= -96)) || (q4.b.D(v6_7)))) {
                                            throw androidx.datastore.preferences.protobuf.z.a();
                                        } else {
                                            v13_3[v2_0] = ((char) ((((v3_21 & 63) << 6) | ((v4_8 & 15) << 12)) | (v6_7 & 63)));
                                            v2_0 = v7_0;
                                        }
                                    }
                                }
                            } else {
                                if (v3_9 >= v0_5) {
                                    throw androidx.datastore.preferences.protobuf.z.a();
                                } else {
                                    p12 += 2;
                                    char v3_5 = p11[v3_9];
                                    int v5_2 = (v2_0 + 1);
                                    if ((v4_8 < -62) || (q4.b.D(v3_5))) {
                                        throw androidx.datastore.preferences.protobuf.z.a();
                                    } else {
                                        v13_3[v2_0] = ((char) ((v3_5 & 63) | ((v4_8 & 31) << 6)));
                                        v2_0 = v5_2;
                                    }
                                }
                            }
                        } else {
                            int v12_2 = (v2_0 + 1);
                            v13_3[v2_0] = ((char) v4_8);
                            while (v3_9 < v0_5) {
                                int v2_1 = p11[v3_9];
                                if (v2_1 < 0) {
                                    break;
                                }
                                v3_9++;
                                int v4_6 = (v12_2 + 1);
                                v13_3[v12_2] = ((char) v2_1);
                                v12_2 = v4_6;
                            }
                            v2_0 = v12_2;
                            p12 = v3_9;
                        }
                    }
                    return new String(v13_3, 0, v2_0);
                }
            default:
                int v1_0 = androidx.datastore.preferences.protobuf.x.a;
                ArrayIndexOutOfBoundsException v0_2 = new String(p11, p12, p13, v1_0);
                if ((v0_2.indexOf(65533) >= 0) && (!java.util.Arrays.equals(v0_2.getBytes(v1_0), java.util.Arrays.copyOfRange(p11, p12, (p13 + p12))))) {
                    throw androidx.datastore.preferences.protobuf.z.a();
                } else {
                    return v0_2;
                }
        }
    }

    public final int r(String p25, byte[] p26, int p27, int p28)
    {
        switch (this.b) {
            case 0:
                String v3_5 = p25.length();
                byte v4_12 = (p28 + p27);
                int v5_0 = 0;
                while (v5_0 < v3_5) {
                    int v7_6 = (v5_0 + p27);
                    if (v7_6 >= v4_12) {
                        break;
                    }
                    int v8_3 = p25.charAt(v5_0);
                    if (v8_3 >= 128) {
                        break;
                    }
                    p26[v7_6] = ((byte) v8_3);
                    v5_0++;
                }
                androidx.datastore.preferences.protobuf.j1 v0_1;
                if (v5_0 != v3_5) {
                    int v2_0 = (p27 + v5_0);
                    while (v5_0 < v3_5) {
                        int v7_10 = p25.charAt(v5_0);
                        if ((v7_10 >= 128) || (v2_0 >= v4_12)) {
                            if ((v7_10 >= 2048) || (v2_0 > (v4_12 - 2))) {
                                if (((v7_10 >= 55296) && (57343 >= v7_10)) || (v2_0 > (v4_12 - 3))) {
                                    if (v2_0 > (v4_12 - 4)) {
                                        if ((55296 <= v7_10) && (v7_10 <= 57343)) {
                                            int v1_7 = (v5_0 + 1);
                                            if ((v1_7 == p25.length()) || (!Character.isSurrogatePair(v7_10, p25.charAt(v1_7)))) {
                                                throw new androidx.datastore.preferences.protobuf.j1(v5_0, v3_5);
                                            }
                                        }
                                        int v1_9 = new StringBuilder("Failed writing ");
                                        v1_9.append(v7_10);
                                        v1_9.append(" at index ");
                                        v1_9.append(v2_0);
                                        throw new ArrayIndexOutOfBoundsException(v1_9.toString());
                                    } else {
                                        int v8_7 = (v5_0 + 1);
                                        if (v8_7 != p25.length()) {
                                            int v5_5 = p25.charAt(v8_7);
                                            if (!Character.isSurrogatePair(v7_10, v5_5)) {
                                                v5_0 = v8_7;
                                            } else {
                                                int v5_7 = Character.toCodePoint(v7_10, v5_5);
                                                int v7_11 = (v2_0 + 1);
                                                p26[v2_0] = ((byte) ((v5_7 >> 18) | 240));
                                                int v9_15 = (v2_0 + 2);
                                                p26[v7_11] = ((byte) (((v5_7 >> 12) & 63) | 128));
                                                int v7_12 = (v2_0 + 3);
                                                p26[v9_15] = ((byte) (((v5_7 >> 6) & 63) | 128));
                                                v2_0 += 4;
                                                p26[v7_12] = ((byte) ((v5_7 & 63) | 128));
                                                v5_0 = v8_7;
                                                v5_0++;
                                            }
                                        }
                                        throw new androidx.datastore.preferences.protobuf.j1((v5_0 - 1), v3_5);
                                    }
                                } else {
                                    int v8_0 = (v2_0 + 1);
                                    p26[v2_0] = ((byte) ((v7_10 >> 12) | 480));
                                    int v9_3 = (v2_0 + 2);
                                    p26[v8_0] = ((byte) (((v7_10 >> 6) & 63) | 128));
                                    v2_0 += 3;
                                    p26[v9_3] = ((byte) ((v7_10 & 63) | 128));
                                }
                            } else {
                                int v8_1 = (v2_0 + 1);
                                p26[v2_0] = ((byte) ((v7_10 >> 6) | 960));
                                v2_0 += 2;
                                p26[v8_1] = ((byte) ((v7_10 & 63) | 128));
                            }
                        } else {
                            int v8_2 = (v2_0 + 1);
                            p26[v2_0] = ((byte) v7_10);
                            v2_0 = v8_2;
                        }
                    }
                    v0_1 = v2_0;
                } else {
                    v0_1 = (p27 + v3_5);
                }
                return v0_1;
            default:
                int v5_2 = ((long) p27);
                int v7_9 = (((long) p28) + ((long) p27));
                int v9_7 = p25.length();
                if ((v9_7 > p28) || ((p26.length - p28) < p27)) {
                    String v3_1 = new StringBuilder("Failed writing ");
                    v3_1.append(p25.charAt((v9_7 - 1)));
                    v3_1.append(" at index ");
                    v3_1.append((p27 + p28));
                    throw new ArrayIndexOutOfBoundsException(v3_1.toString());
                } else {
                    int v2_1 = 0;
                    while(true) {
                        long v12_2 = 1;
                        byte v4_0 = 128;
                        if (v2_1 >= v9_7) {
                            break;
                        }
                        int v14_0 = p25.charAt(v2_1);
                        if (v14_0 >= 128) {
                            break;
                        }
                        long v12_10 = (1 + v5_2);
                        androidx.datastore.preferences.protobuf.h1.j(p26, v5_2, ((byte) v14_0));
                        v2_1++;
                        v5_2 = v12_10;
                    }
                    androidx.datastore.preferences.protobuf.j1 v0_5;
                    if (v2_1 != v9_7) {
                        while (v2_1 < v9_7) {
                            long v27_1;
                            int v6_4;
                            long v12_7;
                            int v14_1 = p25.charAt(v2_1);
                            if ((v14_1 >= v4_0) || (v5_2 >= v7_9)) {
                                if ((v14_1 >= 2048) || (v5_2 > (v7_9 - 2))) {
                                    v27_1 = v12_2;
                                    if (((v14_1 >= 55296) && (57343 >= v14_1)) || (v5_2 > (v7_9 - 3))) {
                                        long v20_1 = v5_2;
                                        if (v20_1 > (v7_9 - 4)) {
                                            byte v4_3 = v20_1;
                                            if ((55296 <= v14_1) && (v14_1 <= 57343)) {
                                                int v1_3 = (v2_1 + 1);
                                                if ((v1_3 == v9_7) || (!Character.isSurrogatePair(v14_1, p25.charAt(v1_3)))) {
                                                    throw new androidx.datastore.preferences.protobuf.j1(v2_1, v9_7);
                                                }
                                            }
                                            int v1_5 = new StringBuilder("Failed writing ");
                                            v1_5.append(v14_1);
                                            v1_5.append(" at index ");
                                            v1_5.append(v4_3);
                                            throw new ArrayIndexOutOfBoundsException(v1_5.toString());
                                        } else {
                                            int v6_3 = (v2_1 + 1);
                                            if (v6_3 != v9_7) {
                                                int v2_3 = p25.charAt(v6_3);
                                                if (!Character.isSurrogatePair(v14_1, v2_3)) {
                                                    v2_1 = v6_3;
                                                } else {
                                                    int v2_5 = Character.toCodePoint(v14_1, v2_3);
                                                    long v12_5 = (v20_1 + v27_1);
                                                    byte v4_4 = v20_1;
                                                    androidx.datastore.preferences.protobuf.h1.j(p26, v4_4, ((byte) ((v2_5 >> 18) | 240)));
                                                    int v14_5 = v2_5;
                                                    int v2_6 = (v4_4 + 2);
                                                    int v16_3 = v6_3;
                                                    v6_4 = 128;
                                                    androidx.datastore.preferences.protobuf.h1.j(p26, v12_5, ((byte) (((v14_5 >> 12) & 63) | 128)));
                                                    long v12_6 = (v4_4 + 3);
                                                    androidx.datastore.preferences.protobuf.h1.j(p26, v2_6, ((byte) (((v14_5 >> 6) & 63) | 128)));
                                                    int v2_7 = (v4_4 + 4);
                                                    androidx.datastore.preferences.protobuf.h1.j(p26, v12_6, ((byte) ((v14_5 & 63) | 128)));
                                                    v12_7 = v2_7;
                                                    v2_1 = v16_3;
                                                    v2_1++;
                                                    v4_0 = v6_4;
                                                    v5_2 = v12_7;
                                                    v12_2 = v27_1;
                                                }
                                            }
                                            throw new androidx.datastore.preferences.protobuf.j1((v2_1 - 1), v9_7);
                                        }
                                    } else {
                                        long v12_8 = (v5_2 + v27_1);
                                        androidx.datastore.preferences.protobuf.h1.j(p26, v5_2, ((byte) ((v14_1 >> 12) | 480)));
                                        long v20_2 = v5_2;
                                        byte v4_8 = (v20_2 + 2);
                                        androidx.datastore.preferences.protobuf.h1.j(p26, v12_8, ((byte) (((v14_1 >> 6) & 63) | 128)));
                                        v12_7 = (v20_2 + 3);
                                        androidx.datastore.preferences.protobuf.h1.j(p26, v4_8, ((byte) ((v14_1 & 63) | 128)));
                                        v6_4 = 128;
                                    }
                                } else {
                                    v27_1 = v12_2;
                                    long v12_9 = (v5_2 + v27_1);
                                    androidx.datastore.preferences.protobuf.h1.j(p26, v5_2, ((byte) ((v14_1 >> 6) | 960)));
                                    int v5_3 = (v5_2 + 2);
                                    androidx.datastore.preferences.protobuf.h1.j(p26, v12_9, ((byte) ((v14_1 & 63) | v4_0)));
                                    v12_7 = v5_3;
                                    v6_4 = v4_0;
                                }
                            } else {
                                byte v15_18 = (v5_2 + v12_2);
                                androidx.datastore.preferences.protobuf.h1.j(p26, v5_2, ((byte) v14_1));
                                v6_4 = v4_0;
                                v27_1 = v12_2;
                                v12_7 = v15_18;
                            }
                        }
                        v0_5 = ((int) v5_2);
                    } else {
                        v0_5 = ((int) v5_2);
                    }
                    return v0_5;
                }
        }
    }
}
