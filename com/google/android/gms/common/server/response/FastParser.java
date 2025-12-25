package com.google.android.gms.common.server.response;
public class FastParser {
    private static final char[] zaa;
    private static final char[] zab;
    private static final char[] zac;
    private static final char[] zad;
    private static final char[] zae;
    private static final char[] zaf;
    private static final com.google.android.gms.common.server.response.zai zag;
    private static final com.google.android.gms.common.server.response.zai zah;
    private static final com.google.android.gms.common.server.response.zai zai;
    private static final com.google.android.gms.common.server.response.zai zaj;
    private static final com.google.android.gms.common.server.response.zai zak;
    private static final com.google.android.gms.common.server.response.zai zal;
    private static final com.google.android.gms.common.server.response.zai zam;
    private static final com.google.android.gms.common.server.response.zai zan;
    private final char[] zao;
    private final char[] zap;
    private final char[] zaq;
    private final StringBuilder zar;
    private final StringBuilder zas;
    private final java.util.Stack zat;

    static FastParser()
    {
        int v1_0 = new char[3];
        v1_0 = {117, 108, 108};
        com.google.android.gms.common.server.response.FastParser.zaa = v1_0;
        com.google.android.gms.common.server.response.zah v0_17 = new char[3];
        v0_17 = {114, 117, 101};
        com.google.android.gms.common.server.response.FastParser.zab = v0_17;
        int v1_2 = new char[4];
        v1_2 = {114, 117, 101, 34};
        com.google.android.gms.common.server.response.FastParser.zac = v1_2;
        com.google.android.gms.common.server.response.zah v0_1 = new char[4];
        v0_1 = {97, 108, 115, 101};
        com.google.android.gms.common.server.response.FastParser.zad = v0_1;
        com.google.android.gms.common.server.response.zah v0_3 = new char[5];
        v0_3 = {97, 108, 115, 101, 34};
        com.google.android.gms.common.server.response.FastParser.zae = v0_3;
        com.google.android.gms.common.server.response.zah v0_5 = new char[1];
        v0_5[0] = 10;
        com.google.android.gms.common.server.response.FastParser.zaf = v0_5;
        com.google.android.gms.common.server.response.FastParser.zag = new com.google.android.gms.common.server.response.zaa();
        com.google.android.gms.common.server.response.FastParser.zah = new com.google.android.gms.common.server.response.zab();
        com.google.android.gms.common.server.response.FastParser.zai = new com.google.android.gms.common.server.response.zac();
        com.google.android.gms.common.server.response.FastParser.zaj = new com.google.android.gms.common.server.response.zad();
        com.google.android.gms.common.server.response.FastParser.zak = new com.google.android.gms.common.server.response.zae();
        com.google.android.gms.common.server.response.FastParser.zal = new com.google.android.gms.common.server.response.zaf();
        com.google.android.gms.common.server.response.FastParser.zam = new com.google.android.gms.common.server.response.zag();
        com.google.android.gms.common.server.response.FastParser.zan = new com.google.android.gms.common.server.response.zah();
        return;
    }

    public FastParser()
    {
        java.util.Stack v0_5 = new char[1];
        this.zao = v0_5;
        int v1_0 = new char[32];
        this.zap = v1_0;
        StringBuilder v2_2 = new char[1024];
        this.zaq = v2_2;
        this.zar = new StringBuilder(32);
        this.zas = new StringBuilder(1024);
        this.zat = new java.util.Stack();
        return;
    }

    private static final String zaA(java.io.BufferedReader p8, char[] p9, StringBuilder p10, char[] p11)
    {
        p10.setLength(0);
        p8.mark(p9.length);
        int v1_1 = 0;
        int v2 = 0;
        while(true) {
            int v3_1 = p8.read(p9);
            if (v3_1 == -1) {
                break;
            }
            char v4_0 = 0;
            while (v4_0 < v3_1) {
                String v5 = p9[v4_0];
                if ((Character.isISOControl(v5)) && ((p11 == null) || (p11[0] != v5))) {
                    throw new com.google.android.gms.common.server.response.FastParser$ParseException("Unexpected control character while reading string");
                } else {
                    char v6_2 = (v4_0 + 1);
                    if (v5 != 34) {
                        if (v5 != 92) {
                            v1_1 = 0;
                        } else {
                            v1_1 ^= 1;
                            v2 = 1;
                        }
                    } else {
                        if (v1_1 != 0) {
                        } else {
                            p10.append(p9, 0, v4_0);
                            p8.reset();
                            p8.skip(((long) v6_2));
                            if (v2 == 0) {
                                return p10.toString();
                            } else {
                                return com.google.android.gms.common.util.JsonUtils.unescapeString(p10.toString());
                            }
                        }
                    }
                    v4_0 = v6_2;
                }
            }
            p10.append(p9, 0, v3_1);
            p8.mark(p9.length);
        }
        throw new com.google.android.gms.common.server.response.FastParser$ParseException("Unexpected EOF while parsing string");
    }

    public static bridge synthetic double zaa(com.google.android.gms.common.server.response.FastParser p0, java.io.BufferedReader p1)
    {
        return p0.zaj(p1);
    }

    public static bridge synthetic float zab(com.google.android.gms.common.server.response.FastParser p0, java.io.BufferedReader p1)
    {
        return p0.zak(p1);
    }

    public static bridge synthetic int zac(com.google.android.gms.common.server.response.FastParser p0, java.io.BufferedReader p1)
    {
        return p0.zal(p1);
    }

    public static bridge synthetic long zad(com.google.android.gms.common.server.response.FastParser p0, java.io.BufferedReader p1)
    {
        return p0.zan(p1);
    }

    public static bridge synthetic String zae(com.google.android.gms.common.server.response.FastParser p0, java.io.BufferedReader p1)
    {
        return p0.zao(p1);
    }

    public static bridge synthetic java.math.BigDecimal zaf(com.google.android.gms.common.server.response.FastParser p0, java.io.BufferedReader p1)
    {
        return p0.zas(p1);
    }

    public static bridge synthetic java.math.BigInteger zag(com.google.android.gms.common.server.response.FastParser p0, java.io.BufferedReader p1)
    {
        return p0.zat(p1);
    }

    public static bridge synthetic boolean zah(com.google.android.gms.common.server.response.FastParser p0, java.io.BufferedReader p1, boolean p2)
    {
        return p0.zay(p1, 0);
    }

    private final char zai(java.io.BufferedReader p4)
    {
        if (p4.read(this.zao) != -1) {
            while (Character.isWhitespace(this.zao[0])) {
                if (p4.read(this.zao) == -1) {
                }
            }
            return this.zao[0];
        }
        return 0;
    }

    private final double zaj(java.io.BufferedReader p4)
    {
        int v4_1 = this.zam(p4, this.zaq);
        if (v4_1 != 0) {
            return Double.parseDouble(new String(this.zaq, 0, v4_1));
        } else {
            return 0;
        }
    }

    private final float zak(java.io.BufferedReader p4)
    {
        float v4_2 = this.zam(p4, this.zaq);
        if (v4_2 != 0) {
            return Float.parseFloat(new String(this.zaq, 0, v4_2));
        } else {
            return 0;
        }
    }

    private final int zal(java.io.BufferedReader p12)
    {
        com.google.android.gms.common.server.response.FastParser$ParseException v12_1 = this.zam(p12, this.zaq);
        if (v12_1 != null) {
            char[] v1 = this.zaq;
            if (v12_1 <= null) {
                throw new com.google.android.gms.common.server.response.FastParser$ParseException("No number to parse");
            } else {
                int v4;
                String v2_0 = v1[0];
                if (v2_0 != 45) {
                    v4 = -2147483647;
                } else {
                    v4 = -2147483648;
                }
                String v2_1;
                if (v2_0 != 45) {
                    v2_1 = 0;
                } else {
                    v2_1 = 1;
                }
                int v0_1;
                int v7_0;
                if (v2_1 >= v12_1) {
                    v7_0 = 0;
                    v0_1 = v2_1;
                } else {
                    v0_1 = (v2_1 + 1);
                    int v7_2 = Character.digit(v1[v2_1], 10);
                    if (v7_2 < 0) {
                        throw new com.google.android.gms.common.server.response.FastParser$ParseException("Unexpected non-digit character");
                    } else {
                        v7_0 = (- v7_2);
                    }
                }
                while (v0_1 < v12_1) {
                    int v8 = (v0_1 + 1);
                    int v0_5 = Character.digit(v1[v0_1], 10);
                    if (v0_5 < 0) {
                        throw new com.google.android.gms.common.server.response.FastParser$ParseException("Unexpected non-digit character");
                    } else {
                        if (v7_0 < -214748364) {
                            throw new com.google.android.gms.common.server.response.FastParser$ParseException("Number too large");
                        } else {
                            int v7_3 = (v7_0 * 10);
                            if (v7_3 < (v4 + v0_5)) {
                                throw new com.google.android.gms.common.server.response.FastParser$ParseException("Number too large");
                            } else {
                                v7_0 = (v7_3 - v0_5);
                                v0_1 = v8;
                            }
                        }
                    }
                }
                if (v2_1 == null) {
                    return (- v7_0);
                } else {
                    if (v0_1 <= 1) {
                        throw new com.google.android.gms.common.server.response.FastParser$ParseException("No digits to parse");
                    } else {
                        return v7_0;
                    }
                }
            }
        } else {
            return 0;
        }
    }

    private final int zam(java.io.BufferedReader p11, char[] p12)
    {
        int v0_0 = this.zai(p11);
        if (v0_0 == 0) {
            throw new com.google.android.gms.common.server.response.FastParser$ParseException("Unexpected EOF");
        } else {
            if (v0_0 == 44) {
                throw new com.google.android.gms.common.server.response.FastParser$ParseException("Missing value");
            } else {
                if (v0_0 != 110) {
                    int v0_1;
                    p11.mark(1024);
                    if (v0_0 != 34) {
                        p12[0] = v0_0;
                        v0_1 = 1;
                        while ((v0_1 < 1024) && (p11.read(p12, v0_1, 1) != -1)) {
                            String v5_2 = p12[v0_1];
                            if ((v5_2 != 125) && ((v5_2 != 44) && ((!Character.isWhitespace(v5_2)) && (p12[v0_1] != 93)))) {
                                v0_1++;
                            } else {
                                p11.reset();
                                p11.skip(((long) (v0_1 - 1)));
                                p12[v0_1] = 0;
                                return v0_1;
                            }
                        }
                    } else {
                        v0_1 = 0;
                        int v2_0 = 0;
                        while ((v0_1 < 1024) && (p11.read(p12, v0_1, 1) != -1)) {
                            int v8_3 = p12[v0_1];
                            if (Character.isISOControl(v8_3)) {
                                throw new com.google.android.gms.common.server.response.FastParser$ParseException("Unexpected control character while reading string");
                            } else {
                                int v9_1 = (v0_1 + 1);
                                if (v8_3 != 34) {
                                    if (v8_3 != 92) {
                                        v2_0 = 0;
                                    } else {
                                        v2_0 ^= 1;
                                    }
                                } else {
                                    if (v2_0 == 0) {
                                        p11.reset();
                                        p11.skip(((long) v9_1));
                                        return v0_1;
                                    }
                                }
                                v0_1 = v9_1;
                            }
                        }
                    }
                    if (v0_1 != 1024) {
                        throw new com.google.android.gms.common.server.response.FastParser$ParseException("Unexpected EOF");
                    } else {
                        throw new com.google.android.gms.common.server.response.FastParser$ParseException("Absurdly long value");
                    }
                } else {
                    this.zax(p11, com.google.android.gms.common.server.response.FastParser.zaa);
                    return 0;
                }
            }
        }
    }

    private final long zan(java.io.BufferedReader p20)
    {
        com.google.android.gms.common.server.response.FastParser$ParseException v1_5 = this.zam(p20, this.zaq);
        if (v1_5 != null) {
            char[] v4 = this.zaq;
            if (v1_5 <= null) {
                throw new com.google.android.gms.common.server.response.FastParser$ParseException("No number to parse");
            } else {
                long v8;
                int v5 = 0;
                String v6_0 = v4[0];
                if (v6_0 != 45) {
                    v8 = -9223372036854775807;
                } else {
                    v8 = -9223372036854775808;
                }
                if (v6_0 == 45) {
                    v5 = 1;
                }
                int v2_2;
                long v11_0;
                int v7_1 = 10;
                if (v5 >= v1_5) {
                    v11_0 = 0;
                    v2_2 = v5;
                } else {
                    v2_2 = (v5 + 1);
                    int v3_1 = Character.digit(v4[v5], 10);
                    if (v3_1 < 0) {
                        throw new com.google.android.gms.common.server.response.FastParser$ParseException("Unexpected non-digit character");
                    } else {
                        v11_0 = ((long) (- v3_1));
                    }
                }
                while (v2_2 < v1_5) {
                    int v3_3 = (v2_2 + 1);
                    int v2_6 = Character.digit(v4[v2_2], v7_1);
                    if (v2_6 < 0) {
                        throw new com.google.android.gms.common.server.response.FastParser$ParseException("Unexpected non-digit character");
                    } else {
                        if (v11_0 < -922337203685477580) {
                            throw new com.google.android.gms.common.server.response.FastParser$ParseException("Number too large");
                        } else {
                            long v11_1 = (v11_0 * 10);
                            long v15_1 = v8;
                            int v7_2 = ((long) v2_6);
                            if (v11_1 < (v15_1 + v7_2)) {
                                throw new com.google.android.gms.common.server.response.FastParser$ParseException("Number too large");
                            } else {
                                v11_0 = (v11_1 - v7_2);
                                v2_2 = v3_3;
                                v8 = v15_1;
                                v7_1 = 10;
                            }
                        }
                    }
                }
                if (v5 == 0) {
                    return (- v11_0);
                } else {
                    if (v2_2 <= 1) {
                        throw new com.google.android.gms.common.server.response.FastParser$ParseException("No digits to parse");
                    } else {
                        return v11_0;
                    }
                }
            }
        } else {
            return 0;
        }
    }

    private final String zao(java.io.BufferedReader p4)
    {
        return this.zap(p4, this.zap, this.zar, 0);
    }

    private final String zap(java.io.BufferedReader p3, char[] p4, StringBuilder p5, char[] p6)
    {
        char v0 = this.zai(p3);
        if (v0 == 34) {
            return com.google.android.gms.common.server.response.FastParser.zaA(p3, p4, p5, p6);
        } else {
            if (v0 != 110) {
                throw new com.google.android.gms.common.server.response.FastParser$ParseException("Expected string");
            } else {
                this.zax(p3, com.google.android.gms.common.server.response.FastParser.zaa);
                return 0;
            }
        }
    }

    private final String zaq(java.io.BufferedReader p5)
    {
        this.zat.push(Integer.valueOf(2));
        String v0_6 = this.zai(p5);
        if (v0_6 == 34) {
            this.zat.push(Integer.valueOf(3));
            String v0_3 = com.google.android.gms.common.server.response.FastParser.zaA(p5, this.zap, this.zar, 0);
            this.zaw(3);
            if (this.zai(p5) != 58) {
                throw new com.google.android.gms.common.server.response.FastParser$ParseException("Expected key/value separator");
            } else {
                return v0_3;
            }
        } else {
            if (v0_6 == 93) {
                this.zaw(2);
                this.zaw(1);
                this.zaw(5);
                return 0;
            } else {
                if (v0_6 != 125) {
                    StringBuilder v1_4 = new StringBuilder("Unexpected token: ");
                    v1_4.append(v0_6);
                    throw new com.google.android.gms.common.server.response.FastParser$ParseException(v1_4.toString());
                } else {
                    this.zaw(2);
                    return 0;
                }
            }
        }
    }

    private final String zar(java.io.BufferedReader p15)
    {
        p15.mark(1024);
        int v0_12 = this.zai(p15);
        int v6 = 1;
        if (v0_12 == 34) {
            if (p15.read(this.zao) == -1) {
                throw new com.google.android.gms.common.server.response.FastParser$ParseException("Unexpected EOF while parsing string");
            } else {
                int v0_11 = this.zao[0];
                int v10_0 = 0;
                do {
                    if (v0_11 == 34) {
                        if (v10_0 == 0) {
                            int v0_7 = this.zai(p15);
                            if (v0_7 == 44) {
                                this.zaw(2);
                                return this.zaq(p15);
                            } else {
                                if (v0_7 != 125) {
                                    StringBuilder v1_6 = new StringBuilder("Unexpected token ");
                                    v1_6.append(v0_7);
                                    throw new com.google.android.gms.common.server.response.FastParser$ParseException(v1_6.toString());
                                } else {
                                    this.zaw(2);
                                    return 0;
                                }
                            }
                        } else {
                            v10_0 = 1;
                            v0_11 = 34;
                        }
                    }
                    if (v0_11 != 92) {
                        v10_0 = 0;
                    } else {
                        v10_0 ^= 1;
                    }
                    if (p15.read(this.zao) == -1) {
                        throw new com.google.android.gms.common.server.response.FastParser$ParseException("Unexpected EOF while parsing string");
                    } else {
                        v0_11 = this.zao[0];
                    }
                } while(Character.isISOControl(v0_11));
                throw new com.google.android.gms.common.server.response.FastParser$ParseException("Unexpected control character while reading string");
            }
        } else {
            if (v0_12 == 44) {
                throw new com.google.android.gms.common.server.response.FastParser$ParseException("Missing value");
            } else {
                if (v0_12 == 91) {
                    this.zat.push(Integer.valueOf(5));
                    p15.mark(32);
                    if (this.zai(p15) != 93) {
                        p15.reset();
                        int v0_21 = 0;
                        int v11_2 = 0;
                        while (v6 > 0) {
                            int v12 = this.zai(p15);
                            if (v12 == 0) {
                                throw new com.google.android.gms.common.server.response.FastParser$ParseException("Unexpected EOF while parsing array");
                            } else {
                                if (Character.isISOControl(v12)) {
                                    throw new com.google.android.gms.common.server.response.FastParser$ParseException("Unexpected control character while reading array");
                                } else {
                                    if (v12 == 34) {
                                        if (v11_2 == 0) {
                                            v0_21 ^= 1;
                                        }
                                        v12 = 34;
                                    }
                                    if (v12 == 91) {
                                        if (v0_21 == 0) {
                                            v6++;
                                        }
                                        v12 = 91;
                                    }
                                    if ((v12 == 93) && (v0_21 == 0)) {
                                        v6--;
                                    }
                                    if ((v12 != 92) || (v0_21 == 0)) {
                                        v11_2 = 0;
                                    } else {
                                        v11_2 ^= 1;
                                    }
                                }
                            }
                        }
                        this.zaw(5);
                    } else {
                        this.zaw(5);
                    }
                } else {
                    if (v0_12 == 123) {
                        this.zat.push(Integer.valueOf(1));
                        p15.mark(32);
                        int v0_2 = this.zai(p15);
                        if (v0_2 != 125) {
                            if (v0_2 != 34) {
                                StringBuilder v1_3 = new StringBuilder("Unexpected token ");
                                v1_3.append(v0_2);
                                throw new com.google.android.gms.common.server.response.FastParser$ParseException(v1_3.toString());
                            } else {
                                p15.reset();
                                this.zaq(p15);
                                while (this.zar(p15) != null) {
                                }
                                this.zaw(1);
                            }
                        } else {
                            this.zaw(1);
                        }
                    } else {
                        p15.reset();
                        this.zam(p15, this.zaq);
                    }
                }
            }
        }
    }

    private final java.math.BigDecimal zas(java.io.BufferedReader p5)
    {
        int v5_2 = this.zam(p5, this.zaq);
        if (v5_2 != 0) {
            return new java.math.BigDecimal(new String(this.zaq, 0, v5_2));
        } else {
            return 0;
        }
    }

    private final java.math.BigInteger zat(java.io.BufferedReader p5)
    {
        int v5_2 = this.zam(p5, this.zaq);
        if (v5_2 != 0) {
            return new java.math.BigInteger(new String(this.zaq, 0, v5_2));
        } else {
            return 0;
        }
    }

    private final java.util.ArrayList zau(java.io.BufferedReader p5, com.google.android.gms.common.server.response.zai p6)
    {
        java.util.ArrayList v0_0 = this.zai(p5);
        if (v0_0 != 110) {
            if (v0_0 != 91) {
                throw new com.google.android.gms.common.server.response.FastParser$ParseException("Expected start of array");
            } else {
                this.zat.push(Integer.valueOf(5));
                java.util.ArrayList v0_3 = new java.util.ArrayList();
                while(true) {
                    p5.mark(1024);
                    Object v2_2 = this.zai(p5);
                    if (v2_2 == null) {
                        break;
                    }
                    if (v2_2 != 44) {
                        if (v2_2 == 93) {
                            this.zaw(5);
                            return v0_3;
                        } else {
                            p5.reset();
                            v0_3.add(p6.zaa(this, p5));
                        }
                    }
                }
                throw new com.google.android.gms.common.server.response.FastParser$ParseException("Unexpected EOF");
            }
        } else {
            this.zax(p5, com.google.android.gms.common.server.response.FastParser.zaa);
            return 0;
        }
    }

    private final java.util.ArrayList zav(java.io.BufferedReader p10, com.google.android.gms.common.server.response.FastJsonResponse$Field p11)
    {
        Integer v1_1 = Integer.valueOf(1);
        java.util.ArrayList v2_1 = new java.util.ArrayList();
        java.util.Stack v3_5 = this.zai(p10);
        if (v3_5 == 93) {
            this.zaw(5);
            return v2_1;
        } else {
            if (v3_5 == 110) {
                this.zax(p10, com.google.android.gms.common.server.response.FastParser.zaa);
                this.zaw(5);
                return 0;
            } else {
                if (v3_5 != 123) {
                    String v11_3 = new StringBuilder("Unexpected token: ");
                    v11_3.append(v3_5);
                    throw new com.google.android.gms.common.server.response.FastParser$ParseException(v11_3.toString());
                } else {
                    this.zat.push(v1_1);
                    try {
                        while(true) {
                            java.util.Stack v3_1 = p11.zad();
                            this.zat.push(v1_1);
                        }
                        throw new com.google.android.gms.common.server.response.FastParser$ParseException("Expected start of next object in array");
                    } catch (com.google.android.gms.common.server.response.FastParser$ParseException v10_5) {
                        throw new com.google.android.gms.common.server.response.FastParser$ParseException("Error instantiating inner object", v10_5);
                    } catch (com.google.android.gms.common.server.response.FastParser$ParseException v10_4) {
                        throw new com.google.android.gms.common.server.response.FastParser$ParseException("Error instantiating inner object", v10_4);
                    }
                    if (!this.zaz(p10, v3_1)) {
                        return v2_1;
                    } else {
                        v2_1.add(v3_1);
                        java.util.Stack v3_2 = this.zai(p10);
                        if (v3_2 == 44) {
                            if (this.zai(p10) == 123) {
                            }
                        } else {
                            if (v3_2 != 93) {
                                String v11_11 = new StringBuilder("Unexpected token: ");
                                v11_11.append(v3_2);
                                throw new com.google.android.gms.common.server.response.FastParser$ParseException(v11_11.toString());
                            } else {
                                this.zaw(5);
                                return v2_1;
                            }
                        }
                    }
                }
            }
        }
    }

    private final void zaw(int p5)
    {
        if (this.zat.isEmpty()) {
            throw new com.google.android.gms.common.server.response.FastParser$ParseException(v1.a.j("Expected state ", p5, " but had empty stack"));
        } else {
            com.google.android.gms.common.server.response.FastParser$ParseException v0_4 = ((Integer) this.zat.pop()).intValue();
            if (v0_4 != p5) {
                throw new com.google.android.gms.common.server.response.FastParser$ParseException(v1.a.i("Expected state ", p5, v0_4, " but had "));
            } else {
                return;
            }
        }
    }

    private final void zax(java.io.BufferedReader p7, char[] p8)
    {
        int v1 = 0;
        while(true) {
            int v2_0 = p8.length;
            if (v1 >= v2_0) {
                return;
            } else {
                int v2_2 = p7.read(this.zap, 0, (v2_0 - v1));
                if (v2_2 == -1) {
                    break;
                }
                int v3_0 = 0;
                while (v3_0 < v2_2) {
                    if (p8[(v3_0 + v1)] != this.zap[v3_0]) {
                        throw new com.google.android.gms.common.server.response.FastParser$ParseException("Unexpected character");
                    } else {
                        v3_0++;
                    }
                }
                v1 += v2_2;
            }
        }
        throw new com.google.android.gms.common.server.response.FastParser$ParseException("Unexpected EOF");
    }

    private final boolean zay(java.io.BufferedReader p5, boolean p6)
    {
        char v0 = this.zai(p5);
        if (v0 == 34) {
            if (p6 != null) {
                throw new com.google.android.gms.common.server.response.FastParser$ParseException("No boolean value found in string");
            } else {
                return this.zay(p5, 1);
            }
        } else {
            if (v0 == 102) {
                char[] v6_1;
                if (p6 == null) {
                    v6_1 = com.google.android.gms.common.server.response.FastParser.zad;
                } else {
                    v6_1 = com.google.android.gms.common.server.response.FastParser.zae;
                }
                this.zax(p5, v6_1);
                return 0;
            } else {
                if (v0 == 110) {
                    this.zax(p5, com.google.android.gms.common.server.response.FastParser.zaa);
                    return 0;
                } else {
                    if (v0 != 116) {
                        char[] v6_4 = new StringBuilder("Unexpected token: ");
                        v6_4.append(v0);
                        throw new com.google.android.gms.common.server.response.FastParser$ParseException(v6_4.toString());
                    } else {
                        char[] v6_6;
                        if (p6 == null) {
                            v6_6 = com.google.android.gms.common.server.response.FastParser.zab;
                        } else {
                            v6_6 = com.google.android.gms.common.server.response.FastParser.zac;
                        }
                        this.zax(p5, v6_6);
                        return 1;
                    }
                }
            }
        }
    }

    private final boolean zaz(java.io.BufferedReader p18, com.google.android.gms.common.server.response.FastJsonResponse p19)
    {
        void v1_0 = this;
        Integer v5 = Integer.valueOf(1);
        java.util.Map v6 = p19.getFieldMappings();
        int v7_0 = this.zaq(p18);
        if (v7_0 == 0) {
            this.zaw(1);
            return 0;
        }
        while (v7_0 != 0) {
            int v7_2 = ((com.google.android.gms.common.server.response.FastJsonResponse$Field) v6.get(v7_0));
            if (v7_2 != 0) {
                int v7_3;
                v1_0.zat.push(Integer.valueOf(4));
                com.google.android.gms.common.server.response.FastJsonResponse v9_6 = v7_2.zaa;
                switch (v9_6) {
                    case 0:
                        if (!v7_2.zab) {
                            p19.zau(v7_2, this.zal(p18));
                            v7_3 = 4;
                        } else {
                            p19.zav(v7_2, v1_0.zau(p18, com.google.android.gms.common.server.response.FastParser.zag));
                        }
                    case 1:
                        if (!v7_2.zab) {
                            p19.zae(v7_2, this.zat(p18));
                        } else {
                            p19.zag(v7_2, v1_0.zau(p18, com.google.android.gms.common.server.response.FastParser.zam));
                        }
                        break;
                    case 2:
                        if (!v7_2.zab) {
                            p19.zax(v7_2, this.zan(p18));
                        } else {
                            p19.zay(v7_2, v1_0.zau(p18, com.google.android.gms.common.server.response.FastParser.zah));
                        }
                        break;
                    case 3:
                        if (!v7_2.zab) {
                            p19.zaq(v7_2, this.zak(p18));
                        } else {
                            p19.zas(v7_2, v1_0.zau(p18, com.google.android.gms.common.server.response.FastParser.zai));
                        }
                        break;
                    case 4:
                        if (!v7_2.zab) {
                            p19.zam(v7_2, this.zaj(p18));
                        } else {
                            p19.zao(v7_2, v1_0.zau(p18, com.google.android.gms.common.server.response.FastParser.zaj));
                        }
                        break;
                    case 5:
                        if (!v7_2.zab) {
                            p19.zaa(v7_2, this.zas(p18));
                        } else {
                            p19.zac(v7_2, v1_0.zau(p18, com.google.android.gms.common.server.response.FastParser.zan));
                        }
                        break;
                    case 6:
                        if (!v7_2.zab) {
                            p19.zai(v7_2, v1_0.zay(p18, 0));
                        } else {
                            p19.zaj(v7_2, v1_0.zau(p18, com.google.android.gms.common.server.response.FastParser.zak));
                        }
                        break;
                    case 7:
                        if (!v7_2.zab) {
                            p19.zaA(v7_2, this.zao(p18));
                        } else {
                            p19.zaC(v7_2, v1_0.zau(p18, com.google.android.gms.common.server.response.FastParser.zal));
                        }
                        break;
                    case 8:
                        p19.zal(v7_2, com.google.android.gms.common.util.Base64Utils.decode(v1_0.zap(p18, v1_0.zaq, v1_0.zas, com.google.android.gms.common.server.response.FastParser.zaf)));
                        break;
                    case 9:
                        p19.zal(v7_2, com.google.android.gms.common.util.Base64Utils.decodeUrlSafe(v1_0.zap(p18, v1_0.zaq, v1_0.zas, com.google.android.gms.common.server.response.FastParser.zaf)));
                        break;
                    case 10:
                        com.google.android.gms.common.server.response.FastJsonResponse v9_1;
                        com.google.android.gms.common.server.response.FastJsonResponse v9_16 = this.zai(p18);
                        if (v9_16 != 110) {
                            if (v9_16 != 123) {
                                throw new com.google.android.gms.common.server.response.FastParser$ParseException("Expected start of a map object");
                            } else {
                                v1_0.zat.push(v5);
                                v9_1 = new java.util.HashMap();
                                do {
                                    StringBuilder v12_8 = this.zai(p18);
                                    if (v12_8 == null) {
                                        throw new com.google.android.gms.common.server.response.FastParser$ParseException("Unexpected EOF");
                                    } else {
                                        if (v12_8 == 34) {
                                            int v10_1 = com.google.android.gms.common.server.response.FastParser.zaA(p18, v1_0.zap, v1_0.zar, 0);
                                            if (this.zai(p18) != 58) {
                                                throw new com.google.android.gms.common.server.response.FastParser$ParseException("No map value found for key ".concat(String.valueOf(v10_1)));
                                            } else {
                                                if (this.zai(p18) != 34) {
                                                    throw new com.google.android.gms.common.server.response.FastParser$ParseException("Expected String value for key ".concat(String.valueOf(v10_1)));
                                                } else {
                                                    v9_1.put(v10_1, com.google.android.gms.common.server.response.FastParser.zaA(p18, v1_0.zap, v1_0.zar, 0));
                                                    char v8_4 = this.zai(p18);
                                                }
                                            }
                                        } else {
                                            if (v12_8 == 125) {
                                                v1_0 = v1_0.zaw(1);
                                            }
                                        }
                                    }
                                } while(v8_4 == 44);
                                if (v8_4 != 125) {
                                    String v2_6 = new StringBuilder("Unexpected character while parsing string map: ");
                                    v2_6.append(v8_4);
                                    throw new com.google.android.gms.common.server.response.FastParser$ParseException(v2_6.toString());
                                } else {
                                    v1_0 = v1_0.zaw(1);
                                }
                            }
                        } else {
                            v1_0 = v1_0.zax(p18, com.google.android.gms.common.server.response.FastParser.zaa);
                            v9_1 = 0;
                        }
                        p19.zaB(v7_2, v9_1);
                        break;
                    case 11:
                        if (!v7_2.zab) {
                            com.google.android.gms.common.server.response.FastJsonResponse v9_8 = this.zai(p18);
                            if (v9_8 != 110) {
                                v1_0.zat.push(v5);
                                if (v9_8 != 123) {
                                    throw new com.google.android.gms.common.server.response.FastParser$ParseException("Expected start of object");
                                } else {
                                    try {
                                        com.google.android.gms.common.server.response.FastJsonResponse v9_9 = v7_2.zad();
                                        v1_0.zaz(p18, v9_9);
                                        p19.addConcreteTypeInternal(v7_2, v7_2.zae, v9_9);
                                    } catch (com.google.android.gms.common.server.response.FastParser$ParseException v0_16) {
                                        throw new com.google.android.gms.common.server.response.FastParser$ParseException("Error instantiating inner object", v0_16);
                                    } catch (com.google.android.gms.common.server.response.FastParser$ParseException v0_15) {
                                        throw new com.google.android.gms.common.server.response.FastParser$ParseException("Error instantiating inner object", v0_15);
                                    }
                                }
                            } else {
                                v1_0 = v1_0.zax(p18, com.google.android.gms.common.server.response.FastParser.zaa);
                                p19.addConcreteTypeInternal(v7_2, v7_2.zae, 0);
                            }
                        } else {
                            com.google.android.gms.common.server.response.FastJsonResponse v9_12 = this.zai(p18);
                            if (v9_12 != 110) {
                                v1_0.zat.push(Integer.valueOf(5));
                                if (v9_12 != 91) {
                                    throw new com.google.android.gms.common.server.response.FastParser$ParseException("Expected array start");
                                } else {
                                    p19.addConcreteTypeArrayInternal(v7_2, v7_2.zae, v1_0.zav(p18, v7_2));
                                }
                            } else {
                                v1_0 = v1_0.zax(p18, com.google.android.gms.common.server.response.FastParser.zaa);
                                p19.addConcreteTypeArrayInternal(v7_2, v7_2.zae, 0);
                            }
                        }
                        v7_3 = 4;
                        break;
                    default:
                        throw new com.google.android.gms.common.server.response.FastParser$ParseException(g2.g.c(v9_6, "Invalid field type "));
                }
                v1_0 = v1_0.zaw(v7_3).zaw(2);
                int v7_5 = this.zai(p18);
                if (v7_5 == 44) {
                    v7_0 = this.zaq(p18);
                } else {
                    if (v7_5 != 125) {
                        String v2_10 = new StringBuilder("Expected end of object or field separator, but found: ");
                        v2_10.append(v7_5);
                        throw new com.google.android.gms.common.server.response.FastParser$ParseException(v2_10.toString());
                    } else {
                        v7_0 = 0;
                    }
                }
            } else {
                v7_0 = this.zar(p18);
            }
        }
        v1_0.zaw(1);
        return 1;
    }

    public void parse(java.io.InputStream p8, com.google.android.gms.common.server.response.FastJsonResponse p9)
    {
        java.io.BufferedReader v3_1 = new java.io.BufferedReader(new java.io.InputStreamReader(p8), 1024);
        this.zat.push(Integer.valueOf(0));
        com.google.android.gms.common.server.response.FastParser$ParseException v8_1 = this.zai(v3_1);
        if (v8_1 == null) {
            throw new com.google.android.gms.common.server.response.FastParser$ParseException("No data to parse");
        } else {
            if (v8_1 == 91) {
                this.zat.push(Integer.valueOf(5));
                com.google.android.gms.common.server.response.FastParser$ParseException v8_5 = p9.getFieldMappings();
                if (v8_5.size() != 1) {
                    throw new com.google.android.gms.common.server.response.FastParser$ParseException("Object array response class must have a single Field");
                } else {
                    com.google.android.gms.common.server.response.FastParser$ParseException v8_13 = ((com.google.android.gms.common.server.response.FastJsonResponse$Field) ((java.util.Map$Entry) v8_5.entrySet().iterator().next()).getValue());
                    p9.addConcreteTypeArrayInternal(v8_13, v8_13.zae, this.zav(v3_1, v8_13));
                }
            } else {
                if (v8_1 != 123) {
                    StringBuilder v4_3 = new StringBuilder("Unexpected token: ");
                    v4_3.append(v8_1);
                    throw new com.google.android.gms.common.server.response.FastParser$ParseException(v4_3.toString());
                } else {
                    this.zat.push(Integer.valueOf(1));
                    this.zaz(v3_1, p9);
                }
            }
            this.zaw(0);
            try {
                v3_1.close();
                return;
            } catch (java.io.IOException) {
                android.util.Log.w("FastParser", "Failed to close reader while parsing.");
                return;
            }
        }
    }
}
