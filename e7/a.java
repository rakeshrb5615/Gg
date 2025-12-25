package e7;
public class a implements java.io.Closeable {
    public final okhttp3.ResponseBody$BomAwareReader a;
    public final char[] b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int m;
    public long n;
    public int o;
    public String p;
    public int[] q;
    public int r;
    public String[] s;
    public int[] t;
    public int u;

    static a()
    {
        v3.f.a = new v3.f();
        return;
    }

    public a(okhttp3.ResponseBody$BomAwareReader p5)
    {
        this.u = 2;
        int[] v0_4 = new char[1024];
        this.b = v0_4;
        this.c = 0;
        this.d = 0;
        this.e = 0;
        this.f = 0;
        this.m = 0;
        int[] v2 = new int[32];
        this.q = v2;
        this.r = 1;
        v2[0] = 6;
        int[] v0_1 = new String[32];
        this.s = v0_1;
        int[] v0_2 = new int[32];
        this.t = v0_2;
        this.a = p5;
        return;
    }

    public final String A(boolean p5)
    {
        String v0_1 = new StringBuilder("$");
        int v1_1 = 0;
        while(true) {
            int v2_6 = this.r;
            if (v1_1 >= v2_6) {
                break;
            }
            int v3_0 = this.q[v1_1];
            switch (v3_0) {
                case 1:
                case 2:
                    int v3_2 = this.t[v1_1];
                    if ((p5 != null) && ((v3_2 > 0) && (v1_1 == (v2_6 - 1)))) {
                        v3_2--;
                    }
                    v0_1.append(91);
                    v0_1.append(v3_2);
                    v0_1.append(93);
                    break;
                case 3:
                case 4:
                case 5:
                    v0_1.append(46);
                    int v2_2 = this.s[v1_1];
                    if (v2_2 == 0) {
                    } else {
                        v0_1.append(v2_2);
                    }
                    break;
                case 6:
                case 7:
                case 8:
                    break;
                case 6:
                case 7:
                case 8:
                    break;
                case 6:
                case 7:
                case 8:
                    break;
                default:
                    throw new AssertionError(g2.g.c(v3_0, "Unknown scope value: "));
            }
            v1_1++;
        }
        return v0_1.toString();
    }

    public final boolean B()
    {
        int v0_0 = this.m;
        if (v0_0 == 0) {
            v0_0 = this.s();
        }
        if ((v0_0 == 2) || ((v0_0 == 4) || (v0_0 == 17))) {
            return 0;
        } else {
            return 1;
        }
    }

    public final boolean C(char p2)
    {
        if ((p2 != 9) && ((p2 != 10) && ((p2 != 12) && ((p2 != 13) && (p2 != 32))))) {
            if (p2 != 35) {
                if (p2 == 44) {
                    return 0;
                } else {
                    if ((p2 != 47) && (p2 != 61)) {
                        if ((p2 == 123) || ((p2 == 125) || (p2 == 58))) {
                            return 0;
                        } else {
                            if (p2 != 59) {
                                switch (p2) {
                                    case 92:
                                    default:
                                        return 1;
                                }
                            }
                        }
                    }
                }
            }
            this.i();
        }
        return 0;
    }

    public final String D()
    {
        String v0_1 = (this.e + 1);
        int v1_2 = ((this.c - this.f) + 1);
        StringBuilder v2_2 = new StringBuilder(" at line ");
        v2_2.append(v0_1);
        v2_2.append(" column ");
        v2_2.append(v1_2);
        v2_2.append(" path ");
        v2_2.append(this.A(0));
        return v2_2.toString();
    }

    public final boolean E()
    {
        IllegalStateException v0_0 = this.m;
        if (v0_0 == null) {
            v0_0 = this.s();
        }
        if (v0_0 != 5) {
            if (v0_0 != 6) {
                throw this.W("a boolean");
            } else {
                this.m = 0;
                IllegalStateException v0_3 = this.t;
                int v1_1 = (this.r - 1);
                v0_3[v1_1] = (v0_3[v1_1] + 1);
                return 0;
            }
        } else {
            this.m = 0;
            IllegalStateException v0_4 = this.t;
            int v1_3 = (this.r - 1);
            v0_4[v1_3] = (v0_4[v1_3] + 1);
            return 1;
        }
    }

    public final double F()
    {
        IllegalStateException v0_0 = this.m;
        if (v0_0 == null) {
            v0_0 = this.s();
        }
        if (v0_0 != 15) {
            if (v0_0 != 16) {
                if ((v0_0 != 8) && (v0_0 != 9)) {
                    if (v0_0 != 10) {
                        if (v0_0 != 11) {
                            throw this.W("a double");
                        }
                    } else {
                        this.p = this.N();
                    }
                } else {
                    IllegalStateException v0_4;
                    if (v0_0 != 8) {
                        v0_4 = 34;
                    } else {
                        v0_4 = 39;
                    }
                    this.p = this.L(v0_4);
                }
            } else {
                this.p = new String(this.b, this.c, this.o);
                this.c = (this.c + this.o);
            }
            this.m = 11;
            IllegalStateException v0_11 = Double.parseDouble(this.p);
            if ((this.u != 1) && ((Double.isNaN(v0_11)) || (Double.isInfinite(v0_11)))) {
                StringBuilder v2_2 = new StringBuilder("JSON forbids NaN and infinities: ");
                v2_2.append(v0_11);
                this.V(v2_2.toString());
                throw 0;
            } else {
                this.p = 0;
                this.m = 0;
                StringBuilder v2_3 = this.t;
                boolean v4_4 = (this.r - 1);
                v2_3[v4_4] = (v2_3[v4_4] + 1);
                return v0_11;
            }
        } else {
            this.m = 0;
            IllegalStateException v0_13 = this.t;
            int v1_6 = (this.r - 1);
            v0_13[v1_6] = (v0_13[v1_6] + 1);
            return ((double) this.n);
        }
    }

    public final int G()
    {
        String v0_0 = this.m;
        if (v0_0 == null) {
            v0_0 = this.s();
        }
        if (v0_0 != 15) {
            try {
                if (v0_0 != 16) {
                    if ((v0_0 != 8) && ((v0_0 != 9) && (v0_0 != 10))) {
                        throw this.W("an int");
                    } else {
                        if (v0_0 != 10) {
                            String v0_4;
                            if (v0_0 != 8) {
                                v0_4 = 34;
                            } else {
                                v0_4 = 39;
                            }
                            this.p = this.L(v0_4);
                        } else {
                            this.p = this.N();
                        }
                        String v0_8 = Integer.parseInt(this.p);
                        this.m = 0;
                        int[] v1_3 = this.t;
                        int v4_2 = (this.r - 1);
                        v1_3[v4_2] = (v1_3[v4_2] + 1);
                        return v0_8;
                    }
                } else {
                    this.p = new String(this.b, this.c, this.o);
                    this.c = (this.c + this.o);
                    this.m = 11;
                    String v0_15 = Double.parseDouble(this.p);
                    int v4_4 = ((int) v0_15);
                    if (((double) v4_4) != v0_15) {
                        int[] v1_8 = new StringBuilder("Expected an int but was ");
                        v1_8.append(this.p);
                        v1_8.append(this.D());
                        throw new NumberFormatException(v1_8.toString());
                    } else {
                        this.p = 0;
                        this.m = 0;
                        String v0_20 = this.t;
                        int[] v1_11 = (this.r - 1);
                        v0_20[v1_11] = (v0_20[v1_11] + 1);
                        return v4_4;
                    }
                }
            } catch (NumberFormatException) {
            }
        } else {
            String v0_21 = this.n;
            int v4_5 = ((int) v0_21);
            if (v0_21 != ((long) v4_5)) {
                int[] v1_14 = new StringBuilder("Expected an int but was ");
                v1_14.append(this.n);
                v1_14.append(this.D());
                throw new NumberFormatException(v1_14.toString());
            } else {
                this.m = 0;
                String v0_1 = this.t;
                int[] v1_2 = (this.r - 1);
                v0_1[v1_2] = (v0_1[v1_2] + 1);
                return v4_5;
            }
        }
    }

    public final long H()
    {
        String v0_0 = this.m;
        if (v0_0 == null) {
            v0_0 = this.s();
        }
        if (v0_0 != 15) {
            try {
                if (v0_0 != 16) {
                    if ((v0_0 != 8) && ((v0_0 != 9) && (v0_0 != 10))) {
                        throw this.W("a long");
                    } else {
                        if (v0_0 != 10) {
                            String v0_3;
                            if (v0_0 != 8) {
                                v0_3 = 34;
                            } else {
                                v0_3 = 39;
                            }
                            this.p = this.L(v0_3);
                        } else {
                            this.p = this.N();
                        }
                        String v0_7 = Long.parseLong(this.p);
                        this.m = 0;
                        int[] v3_1 = this.t;
                        int v4_2 = (this.r - 1);
                        v3_1[v4_2] = (v3_1[v4_2] + 1);
                        return v0_7;
                    }
                } else {
                    this.p = new String(this.b, this.c, this.o);
                    this.c = (this.c + this.o);
                    this.m = 11;
                    String v0_14 = Double.parseDouble(this.p);
                    int[] v3_3 = ((long) v0_14);
                    if (((double) v3_3) != v0_14) {
                        String v1_4 = new StringBuilder("Expected a long but was ");
                        v1_4.append(this.p);
                        v1_4.append(this.D());
                        throw new NumberFormatException(v1_4.toString());
                    } else {
                        this.p = 0;
                        this.m = 0;
                        String v0_19 = this.t;
                        String v1_8 = (this.r - 1);
                        v0_19[v1_8] = (v0_19[v1_8] + 1);
                        return v3_3;
                    }
                }
            } catch (NumberFormatException) {
            }
        } else {
            this.m = 0;
            String v0_20 = this.t;
            String v1_10 = (this.r - 1);
            v0_20[v1_10] = (v0_20[v1_10] + 1);
            return this.n;
        }
    }

    public final String I()
    {
        IllegalStateException v0_0 = this.m;
        if (v0_0 == null) {
            v0_0 = this.s();
        }
        IllegalStateException v0_4;
        if (v0_0 != 14) {
            if (v0_0 != 12) {
                if (v0_0 != 13) {
                    throw this.W("a name");
                } else {
                    v0_4 = this.L(34);
                }
            } else {
                v0_4 = this.L(39);
            }
        } else {
            v0_4 = this.N();
        }
        this.m = 0;
        this.s[(this.r - 1)] = v0_4;
        return v0_4;
    }

    public final int J(boolean p10)
    {
        int v0_0 = this.c;
        int v1_0 = this.d;
        do {
            if (v0_0 == v1_0) {
                this.c = v0_0;
                if (this.z(1)) {
                    v0_0 = this.c;
                    v1_0 = this.d;
                } else {
                    if (p10 != 0) {
                        int v0_1 = new StringBuilder("End of input");
                        v0_1.append(this.D());
                        throw new java.io.EOFException(v0_1.toString());
                    } else {
                        return -1;
                    }
                }
            }
            char v3_0 = (v0_0 + 1);
            char[] v4 = this.b;
            char v5 = v4[v0_0];
            if (v5 != 10) {
                if ((v5 != 32) && ((v5 != 13) && (v5 != 9))) {
                    if (v5 != 47) {
                        if (v5 != 35) {
                            this.c = v3_0;
                            return v5;
                        } else {
                            this.c = v3_0;
                            this.i();
                            this.S();
                            v0_0 = this.c;
                            v1_0 = this.d;
                        }
                    } else {
                        this.c = v3_0;
                        if (v3_0 != v1_0) {
                            this.i();
                            int v0_5 = this.c;
                            int v1_4 = v4[v0_5];
                            if (v1_4 == 42) {
                                this.c = (v0_5 + 1);
                                while (((this.c + 2) <= this.d) || (this.z(2))) {
                                    int v0_11 = this.c;
                                    if (v4[v0_11] != 10) {
                                        int v0_12 = 0;
                                        while (v0_12 < 2) {
                                        }
                                        v0_0 = (this.c + 2);
                                        v1_0 = this.d;
                                    } else {
                                        this.e = (this.e + 1);
                                        this.f = (v0_11 + 1);
                                    }
                                    this.c = (this.c + 1);
                                }
                                this.V("Unterminated comment");
                                throw 0;
                            } else {
                                if (v1_4 == 47) {
                                    this.c = (v0_5 + 1);
                                    this.S();
                                    v0_0 = this.c;
                                    v1_0 = this.d;
                                }
                            }
                        } else {
                            this.c = v0_0;
                            int v0_4 = this.z(2);
                            this.c = (this.c + 1);
                            if (v0_4 != 0) {
                            }
                        }
                        return v5;
                    }
                }
            } else {
                this.e = (this.e + 1);
                this.f = v3_0;
            }
            v0_0 = v3_0;
        } while(v4[(this.c + v0_12)] == "*/".charAt(v0_12));
        v0_12++;
    }

    public final void K()
    {
        IllegalStateException v0_0 = this.m;
        if (v0_0 == null) {
            v0_0 = this.s();
        }
        if (v0_0 != 7) {
            throw this.W("null");
        } else {
            this.m = 0;
            IllegalStateException v0_2 = this.t;
            int v1_1 = (this.r - 1);
            v0_2[v1_1] = (v0_2[v1_1] + 1);
            return;
        }
    }

    public final String L(char p12)
    {
        StringBuilder v1_0 = 0;
        while(true) {
            int v2_0 = this.c;
            int v3_0 = this.d;
            int v4_3 = v3_0;
            int v3_1 = v2_0;
            char[] v7 = this.b;
            if (v2_0 >= v4_3) {
                if (v1_0 == null) {
                    v1_0 = new StringBuilder(Math.max(((v2_0 - v3_1) * 2), 16));
                }
                v1_0.append(v7, v3_1, (v2_0 - v3_1));
                this.c = v2_0;
                if (!this.z(1)) {
                    this.V("Unterminated string");
                    throw 0;
                } else {
                }
            } else {
                int v8_0 = (v2_0 + 1);
                int v2_2 = v7[v2_0];
                if ((this.u == 3) && (v2_2 < 32)) {
                    this.V("Unescaped control characters (\\u0000-\\u001F) are not allowed in strict mode");
                    throw 0;
                } else {
                    if (v2_2 == p12) {
                        break;
                    }
                    if (v2_2 != 92) {
                        if (v2_2 == 10) {
                            this.e = (this.e + 1);
                            this.f = v8_0;
                        }
                        v2_0 = v8_0;
                        while(true) {
                        }
                    } else {
                        this.c = v8_0;
                        int v8_1 = (v8_0 - v3_1);
                        int v2_5 = (v8_1 - 1);
                        if (v1_0 == null) {
                            v1_0 = new StringBuilder(Math.max((v8_1 * 2), 16));
                        }
                        v1_0.append(v7, v3_1, v2_5);
                        v1_0.append(this.Q());
                        v2_0 = this.c;
                        v3_0 = this.d;
                        while(true) {
                        }
                    }
                }
            }
        }
        this.c = v8_0;
        int v8_4 = ((v8_0 - v3_1) - 1);
        if (v1_0 != null) {
            v1_0.append(v7, v3_1, v8_4);
            return v1_0.toString();
        } else {
            return new String(v7, v3_1, v8_4);
        }
    }

    public final String M()
    {
        IllegalStateException v0_0 = this.m;
        if (v0_0 == null) {
            v0_0 = this.s();
        }
        IllegalStateException v0_4;
        if (v0_0 != 10) {
            if (v0_0 != 8) {
                if (v0_0 != 9) {
                    if (v0_0 != 11) {
                        if (v0_0 != 15) {
                            if (v0_0 != 16) {
                                throw this.W("a string");
                            } else {
                                v0_4 = new String(this.b, this.c, this.o);
                                this.c = (this.c + this.o);
                            }
                        } else {
                            v0_4 = Long.toString(this.n);
                        }
                    } else {
                        v0_4 = this.p;
                        this.p = 0;
                    }
                } else {
                    v0_4 = this.L(34);
                }
            } else {
                v0_4 = this.L(39);
            }
        } else {
            v0_4 = this.N();
        }
        this.m = 0;
        int v1_9 = this.t;
        int v2_3 = (this.r - 1);
        v1_9[v2_3] = (v1_9[v2_3] + 1);
        return v0_4;
    }

    public final String N()
    {
        String v0_0 = 0;
        int v1 = 0;
        do {
            int v2_0 = 0;
            int v3_8 = this.c;
            char[] v6 = this.b;
            if ((v3_8 + v2_0) >= this.d) {
                if (v2_0 >= v6.length) {
                    if (v0_0 == null) {
                        v0_0 = new StringBuilder(Math.max(v2_0, 16));
                    }
                    v0_0.append(v6, this.c, v2_0);
                    this.c = (this.c + v2_0);
                } else {
                    if (!this.z((v2_0 + 1))) {
                        v1 = v2_0;
                        break;
                    } else {
                        do {
                        } while(!this.z((v2_0 + 1)));
                    }
                }
            } else {
                int v3_9 = v6[(v3_8 + v2_0)];
                if ((v3_9 == 9) || ((v3_9 == 10) || ((v3_9 == 12) || ((v3_9 == 13) || (v3_9 == 32))))) {
                } else {
                    if (v3_9 != 35) {
                        if (v3_9 == 44) {
                        } else {
                            if ((v3_9 != 47) && (v3_9 != 61)) {
                                if ((v3_9 == 123) || ((v3_9 == 125) || (v3_9 == 58))) {
                                } else {
                                    if (v3_9 != 59) {
                                        switch (v3_9) {
                                            case 92:
                                                break;
                                            default:
                                                v2_0++;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    this.i();
                }
            }
        } while(this.z(1));
        String v0_2;
        if (v0_0 != null) {
            v0_0.append(v6, this.c, v1);
            v0_2 = v0_0.toString();
        } else {
            v0_2 = new String(v6, this.c, v1);
        }
        this.c = (this.c + v1);
        return v0_2;
    }

    public final int O()
    {
        int v0_0 = this.m;
        if (v0_0 == 0) {
            v0_0 = this.s();
        }
        switch (v0_0) {
            case 1:
                return 3;
            case 2:
                return 4;
            case 3:
                return 1;
            case 4:
                return 2;
            case 5:
            case 6:
                return 8;
            case 7:
                return 9;
            case 8:
            case 9:
            case 10:
            case 11:
                return 6;
            case 12:
            case 13:
            case 14:
                return 5;
            case 15:
            case 16:
                return 7;
            case 17:
                return 10;
            default:
                throw new AssertionError();
        }
    }

    public final void P(int p4)
    {
        int[] v0_0 = this.r;
        if ((v0_0 - 1) >= 255) {
            int[] v0_7 = new StringBuilder("Nesting limit 255 reached");
            v0_7.append(this.D());
            throw new androidx.datastore.preferences.protobuf.k(v0_7.toString());
        } else {
            int v1_1 = this.q;
            if (v0_0 == v1_1.length) {
                int[] v0_2 = (v0_0 * 2);
                this.q = java.util.Arrays.copyOf(v1_1, v0_2);
                this.t = java.util.Arrays.copyOf(this.t, v0_2);
                this.s = ((String[]) java.util.Arrays.copyOf(this.s, v0_2));
            }
            int[] v0_5 = this.q;
            int v1_6 = this.r;
            this.r = (v1_6 + 1);
            v0_5[v1_6] = p4;
            return;
        }
    }

    public final char Q()
    {
        if ((this.c == this.d) && (!this.z(1))) {
            this.V("Unterminated escape sequence");
            throw 0;
        } else {
            int v0_2 = this.c;
            String v1_2 = (v0_2 + 1);
            this.c = v1_2;
            char[] v5 = this.b;
            int v6_0 = v5[v0_2];
            if (v6_0 == 10) {
                if (this.u == 3) {
                    this.V("Cannot escape a newline character in strict mode");
                    throw 0;
                } else {
                    this.e = (this.e + 1);
                    this.f = v1_2;
                    if (this.u == 3) {
                        this.V("Invalid escaped character \"\'\" in strict mode");
                        throw 0;
                    }
                }
            } else {
                if (v6_0 != 34) {
                    if (v6_0 == 39) {
                    } else {
                        if ((v6_0 != 47) && (v6_0 != 92)) {
                            if (v6_0 == 98) {
                                return 8;
                            } else {
                                if (v6_0 == 102) {
                                    return 12;
                                } else {
                                    if (v6_0 == 110) {
                                        return 10;
                                    } else {
                                        if (v6_0 == 114) {
                                            return 13;
                                        } else {
                                            if (v6_0 == 116) {
                                                return 9;
                                            } else {
                                                if (v6_0 != 117) {
                                                    this.V("Invalid escape sequence");
                                                    throw 0;
                                                } else {
                                                    if (((v0_2 + 5) > this.d) && (!this.z(4))) {
                                                        this.V("Unterminated escape sequence");
                                                        throw 0;
                                                    } else {
                                                        int v0_3 = this.c;
                                                        int v3_1 = (v0_3 + 4);
                                                        int v4_0 = 0;
                                                        while (v0_3 < v3_1) {
                                                            int v7_0;
                                                            int v7_3 = v5[v0_3];
                                                            if ((v7_3 < 48) || (v7_3 > 57)) {
                                                                if ((v7_3 < 97) || (v7_3 > 102)) {
                                                                    if ((v7_3 < 65) || (v7_3 > 70)) {
                                                                        this.V("Malformed Unicode escape \\u".concat(new String(v5, this.c, 4)));
                                                                        throw 0;
                                                                    } else {
                                                                        v7_0 = (v7_3 - 55);
                                                                    }
                                                                } else {
                                                                    v7_0 = (v7_3 - 87);
                                                                }
                                                            } else {
                                                                v7_0 = (v7_3 - 48);
                                                            }
                                                            v4_0 = (v7_0 + (v4_0 << 4));
                                                            v0_3++;
                                                        }
                                                        this.c = (this.c + 4);
                                                        return ((char) v4_0);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return v6_0;
        }
    }

    public final void R(char p6)
    {
        do {
            int v0_0 = this.c;
            int v1 = this.d;
            if (v0_0 >= v1) {
                this.c = v0_0;
            } else {
                int v3 = (v0_0 + 1);
                int v0_1 = this.b[v0_0];
                if (v0_1 != p6) {
                    if (v0_1 != 92) {
                        if (v0_1 == 10) {
                            this.e = (this.e + 1);
                            this.f = v3;
                        }
                        v0_0 = v3;
                        while (v0_0 < v1) {
                        }
                    } else {
                        this.c = v3;
                        this.Q();
                        v0_0 = this.c;
                        v1 = this.d;
                    }
                } else {
                    this.c = v3;
                    return;
                }
            }
        } while(!this.z(1));
        this.V("Unterminated string");
        throw 0;
    }

    public final void S()
    {
        if ((int v0_1 == 13) || ((this.c >= this.d) && (!this.z(1)))) {
            return;
        } else {
            int v0_5 = this.c;
            int v1_2 = (v0_5 + 1);
            this.c = v1_2;
            v0_1 = this.b[v0_5];
            if (v0_1 != 10) {
            } else {
                this.e = (this.e + 1);
                this.f = v1_2;
                return;
            }
        }
    }

    public final void T()
    {
        do {
            int v0_0 = 0;
            int v1_0 = this.c;
            if ((v1_0 + v0_0) < this.d) {
                int v1_2 = this.b[(v1_0 + v0_0)];
                if ((v1_2 != 9) && ((v1_2 != 10) && ((v1_2 != 12) && ((v1_2 != 13) && (v1_2 != 32))))) {
                    if (v1_2 != 35) {
                        if (v1_2 == 44) {
                            this.c = (this.c + v0_0);
                            return;
                        } else {
                            if ((v1_2 != 47) && (v1_2 != 61)) {
                                if ((v1_2 == 123) || ((v1_2 == 125) || (v1_2 == 58))) {
                                    this.c = (this.c + v0_0);
                                    return;
                                } else {
                                    if (v1_2 != 59) {
                                        switch (v1_2) {
                                            case 92:
                                            default:
                                                v0_0++;
                                                while(true) {
                                                }
                                                this.c = (v1_0 + v0_0);
                                        }
                                    }
                                }
                            }
                        }
                    }
                    this.i();
                }
                this.c = (this.c + v0_0);
                return;
            }
        } while(this.z(1));
        return;
    }

    public final void U()
    {
        int v1_0 = 0;
        do {
            int v2_3 = this.m;
            if (v2_3 == 0) {
                v2_3 = this.s();
            }
            switch (v2_3) {
                case 1:
                    this.P(3);
                    v1_0++;
                    break;
                case 2:
                    if (v1_0 == 0) {
                        this.s[(this.r - 1)] = 0;
                    }
                    this.r = (this.r - 1);
                    v1_0--;
                    break;
                case 3:
                    this.P(1);
                    break;
                case 4:
                    this.r = (this.r - 1);
                    break;
                case 5:
                case 6:
                case 7:
                case 11:
                case 15:
                default:
                    break;
                case 8:
                    this.R(39);
                    break;
                case 9:
                    this.R(34);
                    break;
                case 10:
                    this.T();
                    break;
                case 12:
                    this.R(39);
                    if (v1_0 != 0) {
                    } else {
                        this.s[(this.r - 1)] = "<skipped>";
                    }
                    break;
                case 13:
                    this.R(34);
                    if (v1_0 != 0) {
                    } else {
                        this.s[(this.r - 1)] = "<skipped>";
                    }
                    break;
                case 14:
                    this.T();
                    if (v1_0 != 0) {
                    } else {
                        this.s[(this.r - 1)] = "<skipped>";
                    }
                    break;
                case 16:
                    this.c = (this.c + this.o);
                    break;
                case 17:
                    return;
            }
            this.m = 0;
        } while(v1_0 > 0);
        int[] v0_1 = this.t;
        int v1_2 = (this.r - 1);
        v0_1[v1_2] = (v0_1[v1_2] + 1);
        return;
    }

    public final void V(String p4)
    {
        String v4_2 = u.e.b(p4);
        v4_2.append(this.D());
        v4_2.append("\nSee ");
        v4_2.append("https://github.com/google/gson/blob/main/Troubleshooting.md#".concat("malformed-json"));
        throw new androidx.datastore.preferences.protobuf.k(v4_2.toString());
    }

    public final IllegalStateException W(String p5)
    {
        String v0_2;
        if (this.O() != 9) {
            v0_2 = "unexpected-json-structure";
        } else {
            v0_2 = "adapter-not-null-safe";
        }
        String v5_1 = v1.a.q("Expected ", p5, " but was ");
        v5_1.append(v1.a.z(this.O()));
        v5_1.append(this.D());
        v5_1.append("\nSee ");
        v5_1.append("https://github.com/google/gson/blob/main/Troubleshooting.md#".concat(v0_2));
        return new IllegalStateException(v5_1.toString());
    }

    public final void c()
    {
        IllegalStateException v0_0 = this.m;
        if (v0_0 == null) {
            v0_0 = this.s();
        }
        if (v0_0 != 3) {
            throw this.W("BEGIN_ARRAY");
        } else {
            this.P(1);
            this.t[(this.r - 1)] = 0;
            this.m = 0;
            return;
        }
    }

    public final void close()
    {
        this.m = 0;
        this.q[0] = 8;
        this.r = 1;
        this.a.close();
        return;
    }

    public final void f()
    {
        IllegalStateException v0_0 = this.m;
        if (v0_0 == null) {
            v0_0 = this.s();
        }
        if (v0_0 != 1) {
            throw this.W("BEGIN_OBJECT");
        } else {
            this.P(3);
            this.m = 0;
            return;
        }
    }

    public final void i()
    {
        if (this.u != 1) {
            this.V("Use JsonReader.setStrictness(Strictness.LENIENT) to accept malformed JSON");
            throw 0;
        } else {
            return;
        }
    }

    public final int s()
    {
        long v1_12;
        long v1_0 = this.q;
        int v2_23 = (this.r - 1);
        int v4_16 = v1_0[v2_23];
        char[] v6 = this.b;
        if (v4_16 != 1) {
            if (v4_16 != 2) {
                if ((v4_16 != 3) && (v4_16 != 5)) {
                    if (v4_16 != 4) {
                        if (v4_16 != 6) {
                            if (v4_16 != 7) {
                                v1_12 = 0;
                                if (v4_16 == 8) {
                                    throw new IllegalStateException("JsonReader is closed");
                                }
                            } else {
                                v1_12 = 0;
                                if (this.J(0) != -1) {
                                    this.i();
                                    this.c = (this.c - 1);
                                } else {
                                    this.m = 17;
                                    return 17;
                                }
                            }
                        } else {
                            if (this.u == 1) {
                                this.J(1);
                                long v1_36 = this.c;
                                this.c = (v1_36 - 1);
                                if (((v1_36 + 4) <= this.d) || (this.z(5))) {
                                    long v1_39 = this.c;
                                    if ((v6[v1_39] == 41) && ((v6[(v1_39 + 1)] == 93) && ((v6[(v1_39 + 2)] == 125) && ((v6[(v1_39 + 3)] == 39) && (v6[(v1_39 + 4)] == 10))))) {
                                        this.c = (v1_39 + 5);
                                    }
                                }
                            }
                            this.q[(this.r - 1)] = 7;
                            v1_12 = 0;
                        }
                    } else {
                        v1_0[v2_23] = 5;
                        long v1_42 = this.J(1);
                        if (v1_42 == 58) {
                        } else {
                            if (v1_42 != 61) {
                                this.V("Expected \':\'");
                                throw 0;
                            } else {
                                this.i();
                                if ((this.c >= this.d) && (!this.z(1))) {
                                } else {
                                    long v1_46 = this.c;
                                    if (v6[v1_46] != 62) {
                                    } else {
                                        this.c = (v1_46 + 1);
                                    }
                                }
                            }
                        }
                    }
                } else {
                    v1_0[v2_23] = 4;
                    if (v4_16 == 5) {
                        long v1_2 = this.J(1);
                        if (v1_2 != 44) {
                            if (v1_2 == 59) {
                                this.i();
                            } else {
                                if (v1_2 != 125) {
                                    this.V("Unterminated object");
                                    throw 0;
                                } else {
                                    this.m = 2;
                                    return 2;
                                }
                                int v2_2 = this.J(1);
                                if (v2_2 == 34) {
                                    this.m = 9;
                                    return 9;
                                } else {
                                    if (v2_2 == 39) {
                                        this.i();
                                        this.m = 8;
                                        return 8;
                                    } else {
                                        if ((v2_2 != 44) && (v2_2 != 59)) {
                                            if (v2_2 == 91) {
                                                this.m = 3;
                                                return 3;
                                            } else {
                                                if (v2_2 == 93) {
                                                    if (v4_16 == 1) {
                                                        this.m = 4;
                                                        return 4;
                                                    }
                                                } else {
                                                    if (v2_2 == 123) {
                                                        this.m = 1;
                                                        return 1;
                                                    } else {
                                                        int v4_9;
                                                        int v5_5;
                                                        int v2_8;
                                                        int v2_6 = (this.c - 1);
                                                        this.c = v2_6;
                                                        int v2_7 = v6[v2_6];
                                                        if ((v2_7 != 116) && (v2_7 != 84)) {
                                                            if ((v2_7 != 102) && (v2_7 != 70)) {
                                                                if ((v2_7 != 110) && (v2_7 != 78)) {
                                                                    v5_5 = v1_12;
                                                                } else {
                                                                    v2_8 = "null";
                                                                    v4_9 = "NULL";
                                                                    v5_5 = 7;
                                                                    int v7_2;
                                                                    if (this.u == 3) {
                                                                        v7_2 = v1_12;
                                                                    } else {
                                                                        v7_2 = 1;
                                                                    }
                                                                    int v10_0 = v2_8.length();
                                                                    long v12_0 = v1_12;
                                                                    while (v12_0 < v10_0) {
                                                                        if (((this.c + v12_0) < this.d) || (this.z((v12_0 + 1)))) {
                                                                            long v13_10 = v6[(this.c + v12_0)];
                                                                            if ((v13_10 != v2_8.charAt(v12_0)) && ((v7_2 == 0) || (v13_10 != v4_9.charAt(v12_0)))) {
                                                                            } else {
                                                                                v12_0++;
                                                                            }
                                                                        }
                                                                    }
                                                                    if ((((this.c + v10_0) >= this.d) && (!this.z((v10_0 + 1)))) || (!this.C(v6[(this.c + v10_0)]))) {
                                                                        this.c = (this.c + v10_0);
                                                                        this.m = v5_5;
                                                                    }
                                                                }
                                                            } else {
                                                                v2_8 = "false";
                                                                v4_9 = "FALSE";
                                                                v5_5 = 6;
                                                            }
                                                        } else {
                                                            v2_8 = "true";
                                                            v4_9 = "TRUE";
                                                            v5_5 = 5;
                                                        }
                                                        if (v5_5 == 0) {
                                                            int v4_11 = this.d;
                                                            int v5_6 = v1_12;
                                                            int v7_3 = v5_6;
                                                            long v17 = v7_3;
                                                            int v14_4 = this.c;
                                                            int v10_1 = 1;
                                                            long v1_20 = 0;
                                                            while(true) {
                                                                int v9_1;
                                                                if ((v14_4 + v7_3) != v4_11) {
                                                                    long v12_4 = v6[(v14_4 + v7_3)];
                                                                    if (v12_4 == 43) {
                                                                        if (v5_6 != 5) {
                                                                            v9_1 = 0;
                                                                            if (v9_1 == 0) {
                                                                                if (!this.C(v6[this.c])) {
                                                                                    this.V("Expected value");
                                                                                    throw 0;
                                                                                } else {
                                                                                    this.i();
                                                                                    this.m = 10;
                                                                                    return 10;
                                                                                }
                                                                            } else {
                                                                                return v9_1;
                                                                            }
                                                                            if ((v4_16 != 1) && (v4_16 != 2)) {
                                                                                this.V("Unexpected value");
                                                                                throw 0;
                                                                            } else {
                                                                                this.i();
                                                                                this.c = (this.c - 1);
                                                                                this.m = 7;
                                                                                return 7;
                                                                            }
                                                                        } else {
                                                                            v5_6 = 6;
                                                                        }
                                                                    } else {
                                                                        if ((v12_4 == 69) || (v12_4 == 101)) {
                                                                            if ((v5_6 != 2) && (v5_6 != 4)) {
                                                                            } else {
                                                                                v5_6 = 5;
                                                                            }
                                                                        } else {
                                                                            if (v12_4 == 45) {
                                                                                if (v5_6 != 0) {
                                                                                    if (v5_6 != 5) {
                                                                                    }
                                                                                } else {
                                                                                    v5_6 = 1;
                                                                                    v17 = 1;
                                                                                }
                                                                            } else {
                                                                                if (v12_4 == 46) {
                                                                                    if (v5_6 != 2) {
                                                                                    } else {
                                                                                        v5_6 = 3;
                                                                                    }
                                                                                } else {
                                                                                    if ((v12_4 < 48) || (v12_4 > 57)) {
                                                                                        break;
                                                                                    }
                                                                                    if ((v5_6 != 1) && (v5_6 != 0)) {
                                                                                        if (v5_6 != 2) {
                                                                                            if (v5_6 != 3) {
                                                                                                if ((v5_6 == 5) || (v5_6 == 6)) {
                                                                                                    v5_6 = 7;
                                                                                                }
                                                                                            } else {
                                                                                                v5_6 = 4;
                                                                                            }
                                                                                        } else {
                                                                                            if (v1_20 != 0) {
                                                                                                long v1_24;
                                                                                                long v22_2 = ((10 * v1_20) - ((long) (v12_4 - 48)));
                                                                                                long v12_9 = v1_20 cmp -922337203685477580;
                                                                                                if ((v12_9 <= 0) && ((v12_9 != 0) || (v22_2 >= v1_20))) {
                                                                                                    v1_24 = 0;
                                                                                                } else {
                                                                                                    v1_24 = 1;
                                                                                                }
                                                                                                v10_1 &= v1_24;
                                                                                                v1_20 = v22_2;
                                                                                            }
                                                                                        }
                                                                                    } else {
                                                                                        v1_20 = ((long) (- (v12_4 - 48)));
                                                                                        v5_6 = 2;
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                    v7_3++;
                                                                } else {
                                                                    if (v7_3 != v6.length) {
                                                                        if (this.z((v7_3 + 1))) {
                                                                            v14_4 = this.c;
                                                                            v4_11 = this.d;
                                                                        } else {
                                                                            long v13_22 = 2;
                                                                            if (v5_6 == 2) {
                                                                                if (((v10_1 == 0) || ((v1_20 == -9223372036854775808) && (v17 == 0))) || ((v1_20 == 0) && (v17 != 0))) {
                                                                                    v13_22 = 2;
                                                                                } else {
                                                                                    if (v17 == 0) {
                                                                                        v1_20 = (- v1_20);
                                                                                    }
                                                                                    this.n = v1_20;
                                                                                    this.c = (this.c + v7_3);
                                                                                    v9_1 = 15;
                                                                                    this.m = 15;
                                                                                }
                                                                            }
                                                                            if ((v5_6 != v13_22) && ((v5_6 != 4) && (v5_6 != 7))) {
                                                                            } else {
                                                                                this.o = v7_3;
                                                                                v9_1 = 16;
                                                                                this.m = 16;
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                            if (this.C(v12_4)) {
                                                            }
                                                        } else {
                                                            return v5_5;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    long v1_3 = this.J(1);
                    if (v1_3 == 34) {
                        this.m = 13;
                        return 13;
                    } else {
                        if (v1_3 == 39) {
                            this.i();
                            this.m = 12;
                            return 12;
                        } else {
                            if (v1_3 == 125) {
                                if (v4_16 == 5) {
                                    this.V("Expected name");
                                    throw 0;
                                } else {
                                    this.m = 2;
                                    return 2;
                                }
                            } else {
                                this.i();
                                this.c = (this.c - 1);
                                if (!this.C(((char) v1_3))) {
                                    this.V("Expected name");
                                    throw 0;
                                } else {
                                    this.m = 14;
                                    return 14;
                                }
                            }
                        }
                    }
                }
            } else {
                long v1_10 = this.J(1);
                if (v1_10 == 44) {
                } else {
                    if (v1_10 == 59) {
                        this.i();
                    } else {
                        if (v1_10 != 93) {
                            this.V("Unterminated array");
                            throw 0;
                        } else {
                            this.m = 4;
                            return 4;
                        }
                    }
                }
            }
        } else {
            v1_0[v2_23] = 2;
        }
    }

    public final String toString()
    {
        String v0_1 = new StringBuilder();
        v0_1.append(e7.a.getSimpleName());
        v0_1.append(this.D());
        return v0_1.toString();
    }

    public final void x()
    {
        IllegalStateException v0_0 = this.m;
        if (v0_0 == null) {
            v0_0 = this.s();
        }
        if (v0_0 != 4) {
            throw this.W("END_ARRAY");
        } else {
            IllegalStateException v0_1 = this.r;
            this.r = (v0_1 - 1);
            int[] v1_1 = this.t;
            IllegalStateException v0_2 = (v0_1 - 2);
            v1_1[v0_2] = (v1_1[v0_2] + 1);
            this.m = 0;
            return;
        }
    }

    public final void y()
    {
        IllegalStateException v0_0 = this.m;
        if (v0_0 == null) {
            v0_0 = this.s();
        }
        if (v0_0 != 2) {
            throw this.W("END_OBJECT");
        } else {
            IllegalStateException v0_1 = this.r;
            int[] v2_0 = (v0_1 - 1);
            this.r = v2_0;
            this.s[v2_0] = 0;
            int[] v2_1 = this.t;
            IllegalStateException v0_2 = (v0_1 - 2);
            v2_1[v0_2] = (v2_1[v0_2] + 1);
            this.m = 0;
            return;
        }
    }

    public final boolean z(int p8)
    {
        int v1_0 = this.c;
        this.f = (this.f - v1_0);
        int v0_7 = this.d;
        char[] v3 = this.b;
        if (v0_7 == v1_0) {
            this.d = 0;
        } else {
            int v0_8 = (v0_7 - v1_0);
            this.d = v0_8;
            System.arraycopy(v3, v1_0, v3, 0, v0_8);
        }
        this.c = 0;
        do {
            int v0_1 = this.d;
            int v0_2 = this.a.read(v3, v0_1, (v3.length - v0_1));
            if (v0_2 == -1) {
                return 0;
            } else {
                int v1_5 = (this.d + v0_2);
                this.d = v1_5;
                if (this.e == 0) {
                    int v0_5 = this.f;
                    if ((v0_5 == 0) && ((v1_5 > 0) && (v3[0] == 65279))) {
                        this.c = (this.c + 1);
                        this.f = (v0_5 + 1);
                        p8++;
                    }
                }
            }
        } while(v1_5 < p8);
        return 1;
    }
}
