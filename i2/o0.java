package i2;
public final class o0 {
    public static final String A;
    public static String B;
    public static String C;
    public static String D;
    public static String E;
    public static String F;
    public static String G;
    public static String H;
    public static String I;
    public static String J;
    public static String K;
    public static String L;
    public static String M;
    public static String N;
    public static i2.o0 t;
    public static String u;
    public static String v;
    public static String w;
    public static String x;
    public static String y;
    public static final String z;
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final String k;
    public final String l;
    public final String m;
    public final String n;
    public final String o;
    public final String p;
    public final String q;
    public final android.content.SharedPreferences r;
    public final android.content.SharedPreferences$Editor s;

    static o0()
    {
        i2.o0.z = q4.b.l("CqrqbUwCORuQDGr1lsyYVg==");
        i2.o0.A = q4.b.l("/6alv3nBW6W2pZA2TQyc2w==");
        return;
    }

    public o0(android.content.Context p3)
    {
        p3.getApplicationContext();
        String v0_13 = i2.p0.b;
        this.a = v0_13[1];
        this.e = v0_13[9];
        this.f = v0_13[2];
        this.c = v0_13[3];
        this.b = v0_13[4];
        this.d = v0_13[5];
        this.g = v0_13[6];
        this.h = v0_13[7];
        this.m = v0_13[8];
        this.n = v0_13[13];
        this.k = v0_13[14];
        this.l = v0_13[10];
        this.p = v0_13[12];
        this.o = v0_13[11];
        this.i = v0_13[15];
        this.j = v0_13[16];
        i2.o0.u = q4.b.l("l86ZE/I0dN9y+JeaU1MSdg==");
        i2.o0.w = q4.b.l("IOf/RvD2VhtBdlvpNwBtug==");
        i2.o0.v = q4.b.l("F7NzFi6+XgyIOHA7OEyMcQ==");
        i2.o0.x = q4.b.l("DILGpo2Ndc+wEqKSXS6zSQ==");
        i2.o0.y = q4.b.l("TFgybHM6y14LAQhtEYwGdQ==");
        i2.o0.C = q4.b.l("MmuH1dH+6I0q1S/MGBIspA==");
        i2.o0.D = q4.b.l("cc5dMs5Ad/qA2xwkuOuHsg==");
        i2.o0.E = q4.b.l("/Z65e80DbOUw+nBuMJNRBA==");
        i2.o0.B = q4.b.l("Ns7VlFcRrYADwlGpyPY5/w==");
        i2.o0.F = q4.b.l("Us93BuUfXJhPv/OCHkA1Sg==");
        i2.o0.G = q4.b.l("lYgmyIXj0dx8M60k39mYUA==");
        i2.o0.H = q4.b.l("qjyNrUof2/cuocPmzyqX5Q==");
        i2.o0.I = q4.b.l("5mDerQy43uvCMWmouJcpkQ==");
        i2.o0.J = q4.b.l("3FG6+dRgoxtR+05fd4I5rA==");
        i2.o0.K = q4.b.l("sSnHh3mpaPFHdBPH4oSL8A==");
        i2.o0.L = q4.b.l("9NZb3/8XzTYX1m0d2JG9Hg==");
        i2.o0.M = q4.b.l("2h38ClSNRu8fxkrluG/FYw==");
        i2.o0.N = q4.b.l("DBHIc0CBco+qcQcFzHnH0g==");
        this.q = p3.getString(2131952437);
        android.content.SharedPreferences$Editor v3_1 = j5.t1.z(p3);
        this.r = v3_1;
        this.s = v3_1.edit();
        return;
    }

    public static void a(android.content.Context p4)
    {
        try {
            StringBuilder v2_1 = new StringBuilder();
            v2_1.append(p4.getFilesDir().getParent());
            v2_1.append("/shared_prefs/pksp.xml");
            int v1_1 = new java.io.File(v2_1.toString());
        } catch (Exception) {
            return;
        }
        if (v1_1.exists()) {
            v1_1.delete();
        }
        String v0_4 = java.security.KeyStore.getInstance("AndroidKeyStore");
        v0_4.load(0);
        v0_4.deleteEntry("pmk");
        p4.getSharedPreferences("psp", 0).edit().clear().apply();
        return;
    }

    public static declared_synchronized i2.o0 c(android.content.Context p3)
    {
        if (i2.o0.t == null) {
            try {
                i2.o0.t = new i2.o0(p3.getApplicationContext());
            } catch (Exception v3_1) {
                throw new RuntimeException("Security error initializing.", v3_1);
            } catch (Exception v3_6) {
                throw new RuntimeException(v3_6);
            }
        }
        return i2.o0.t;
    }

    public final int b()
    {
        int v0_0 = this.r;
        boolean v1_2 = v0_0.getBoolean(i2.o0.A, 0);
        int v3_2 = v0_0.getBoolean(i2.o0.B, 0);
        int v4_0 = v0_0.getBoolean(i2.o0.F, 0);
        int v5_1 = v0_0.getBoolean(i2.o0.L, 0);
        int v6_1 = v0_0.getBoolean(i2.o0.C, 0);
        int v7_1 = v0_0.getBoolean(i2.o0.u, 0);
        int v8_1 = v0_0.getBoolean(i2.o0.w, 0);
        int v9_1 = v0_0.getBoolean(i2.o0.v, 0);
        int v10_1 = v0_0.getBoolean(i2.o0.x, 0);
        int v11_1 = v0_0.getBoolean(i2.o0.y, 0);
        int v12_1 = v0_0.getBoolean(i2.o0.D, 0);
        int v13_1 = v0_0.getBoolean(i2.o0.E, 0);
        int v0_2 = v0_0.getBoolean(i2.o0.z, 0);
        boolean[] v14_2 = new boolean[13];
        v14_2[0] = v1_2;
        v14_2[1] = v3_2;
        v14_2[2] = v4_0;
        v14_2[3] = v5_1;
        v14_2[4] = v6_1;
        v14_2[5] = v7_1;
        v14_2[6] = v8_1;
        v14_2[7] = v9_1;
        v14_2[8] = v10_1;
        v14_2[9] = v11_1;
        v14_2[10] = v12_1;
        v14_2[11] = v13_1;
        v14_2[12] = v0_2;
        int v0_1 = v14_2[0];
        if (v14_2[1]) {
            v0_1 |= 2;
        }
        if (v14_2[2]) {
            v0_1 |= 4;
        }
        if (v14_2[3]) {
            v0_1 |= 8;
        }
        if (v14_2[4]) {
            v0_1 |= 16;
        }
        if (v14_2[5]) {
            v0_1 |= 32;
        }
        if (v14_2[6]) {
            v0_1 |= 64;
        }
        if (v14_2[7]) {
            v0_1 |= 128;
        }
        if (v14_2[8]) {
            v0_1 |= 256;
        }
        if (v14_2[9]) {
            v0_1 |= 512;
        }
        if (v14_2[10]) {
            v0_1 |= 1024;
        }
        if (v14_2[11]) {
            v0_1 |= 2048;
        }
        if (v14_2[12]) {
            v0_1 |= 4096;
        }
        return v0_1;
    }

    public final int d()
    {
        int v1_0 = this.r;
        int v0_4 = v1_0.getBoolean(i2.o0.G, 0);
        int v3_2 = v1_0.getBoolean(i2.o0.H, 0);
        int v4_0 = v1_0.getBoolean(i2.o0.I, 0);
        int v5_1 = v1_0.getBoolean(i2.o0.J, 0);
        int v6_1 = v1_0.getBoolean(i2.o0.K, 0);
        int v1_1 = v1_0.getBoolean(i2.o0.L, 0);
        boolean[] v7_2 = new boolean[6];
        v7_2[0] = v0_4;
        v7_2[1] = v3_2;
        v7_2[2] = v4_0;
        v7_2[3] = v5_1;
        v7_2[4] = v6_1;
        v7_2[5] = v1_1;
        int v1_2 = v7_2[0];
        if (v7_2[1]) {
            v1_2 |= 2;
        }
        if (v7_2[2]) {
            v1_2 |= 4;
        }
        if (v7_2[3]) {
            v1_2 |= 8;
        }
        if (!v7_2[4]) {
            return v1_2;
        } else {
            return (v1_2 | 16);
        }
    }

    public final String e(String p4)
    {
        if (!p4.equals(this.e)) {
            if (!p4.equals(this.l)) {
                if (!p4.equals(this.o)) {
                    if (!p4.equals(this.p)) {
                        if (!p4.equals(this.i)) {
                            if (!p4.equals(this.j)) {
                                if (!p4.equals(this.f)) {
                                    if (!p4.equals(this.g)) {
                                        if (!p4.equals(this.h)) {
                                            if (!p4.equals(this.m)) {
                                                if (!p4.equals(this.n)) {
                                                    if (!p4.equals(this.k)) {
                                                        throw new IllegalArgumentException(v1.a.n(new StringBuilder(), this.q, p4));
                                                    } else {
                                                        return i2.o0.E;
                                                    }
                                                } else {
                                                    return i2.o0.D;
                                                }
                                            } else {
                                                return i2.o0.C;
                                            }
                                        } else {
                                            return i2.o0.F;
                                        }
                                    } else {
                                        return i2.o0.B;
                                    }
                                } else {
                                    return i2.o0.A;
                                }
                            } else {
                                return i2.o0.z;
                            }
                        } else {
                            return i2.o0.y;
                        }
                    } else {
                        return i2.o0.x;
                    }
                } else {
                    return i2.o0.v;
                }
            } else {
                return i2.o0.w;
            }
        } else {
            return i2.o0.u;
        }
    }

    public final String f(String p4)
    {
        if (!p4.equals(this.a)) {
            if (!p4.equals(this.b)) {
                if (!p4.equals(this.c)) {
                    if (!p4.equals(this.d)) {
                        throw new IllegalArgumentException(v1.a.n(new StringBuilder(), this.q, p4));
                    } else {
                        return i2.o0.J;
                    }
                } else {
                    return i2.o0.I;
                }
            } else {
                return i2.o0.H;
            }
        } else {
            return i2.o0.G;
        }
    }

    public final void g(String p2, boolean p3)
    {
        android.content.SharedPreferences$Editor v0 = this.s;
        v0.putBoolean(p2, p3);
        v0.apply();
        return;
    }
}
