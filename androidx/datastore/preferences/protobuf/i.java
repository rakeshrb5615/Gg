package androidx.datastore.preferences.protobuf;
public final class i extends androidx.datastore.preferences.protobuf.j {
    public final java.io.FileInputStream c;
    public final byte[] d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;

    public i(java.io.FileInputStream p2)
    {
        this.j = 2147483647;
        this.c = p2;
        int v2_2 = new byte[4096];
        this.d = v2_2;
        this.e = 0;
        this.g = 0;
        this.i = 0;
        return;
    }

    public final byte[] A(int p8)
    {
        if (p8 != null) {
            if (p8 < null) {
                throw androidx.datastore.preferences.protobuf.z.d();
            } else {
                int v0_3 = this.i;
                byte[] v1_2 = this.g;
                int v2_8 = ((v0_3 + v1_2) + p8);
                if ((v2_8 - 2147483647) > 0) {
                    throw new androidx.datastore.preferences.protobuf.z("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
                } else {
                    int v3_1 = this.j;
                    if (v2_8 > v3_1) {
                        this.J(((v3_1 - v0_3) - v1_2));
                        throw androidx.datastore.preferences.protobuf.z.e();
                    } else {
                        int v0_2 = (this.e - v1_2);
                        byte[] v1_0 = (p8 - v0_2);
                        java.io.FileInputStream v4 = this.c;
                        try {
                            if ((v1_0 >= 4096) && (v1_0 > v4.available())) {
                                return 0;
                            } else {
                                byte[] v1_1 = new byte[p8];
                                System.arraycopy(this.d, this.g, v1_1, 0, v0_2);
                                this.i = (this.i + this.e);
                                this.g = 0;
                                this.e = 0;
                                while (v0_2 < p8) {
                                    try {
                                        int v2_6 = v4.read(v1_1, v0_2, (p8 - v0_2));
                                    } catch (androidx.datastore.preferences.protobuf.z v8_7) {
                                        v8_7.a = 1;
                                        throw v8_7;
                                    }
                                    if (v2_6 == -1) {
                                        throw androidx.datastore.preferences.protobuf.z.e();
                                    } else {
                                        this.i = (this.i + v2_6);
                                        v0_2 += v2_6;
                                    }
                                }
                                return v1_1;
                            }
                        } catch (androidx.datastore.preferences.protobuf.z v8_5) {
                            v8_5.a = 1;
                            throw v8_5;
                        }
                    }
                }
            }
        } else {
            return androidx.datastore.preferences.protobuf.x.b;
        }
    }

    public final java.util.ArrayList B(int p7)
    {
        java.util.ArrayList v0_1 = new java.util.ArrayList();
        while (p7 > null) {
            int v1_1 = Math.min(p7, 4096);
            byte[] v2 = new byte[v1_1];
            int v3 = 0;
            while (v3 < v1_1) {
                int v4_1 = this.c.read(v2, v3, (v1_1 - v3));
                if (v4_1 == -1) {
                    throw androidx.datastore.preferences.protobuf.z.e();
                } else {
                    this.i = (this.i + v4_1);
                    v3 += v4_1;
                }
            }
            p7 -= v1_1;
            v0_1.add(v2);
        }
        return v0_1;
    }

    public final int C()
    {
        int v0_0 = this.g;
        if ((this.e - v0_0) < 4) {
            this.I(4);
            v0_0 = this.g;
        }
        this.g = (v0_0 + 4);
        byte[] v1_3 = this.d;
        return (((v1_3[(v0_0 + 3)] & 255) << 24) | (((v1_3[v0_0] & 255) | ((v1_3[(v0_0 + 1)] & 255) << 8)) | ((v1_3[(v0_0 + 2)] & 255) << 16)));
    }

    public final long D()
    {
        long v0_0 = this.g;
        if ((this.e - v0_0) < 8) {
            this.I(8);
            v0_0 = this.g;
        }
        this.g = (v0_0 + 8);
        byte[] v1_3 = this.d;
        return (((((long) v1_3[(v0_0 + 7)]) & 255) << 56) | (((((((((long) v1_3[v0_0]) & 255) | ((((long) v1_3[(v0_0 + 1)]) & 255) << 8)) | ((((long) v1_3[(v0_0 + 2)]) & 255) << 16)) | ((((long) v1_3[(v0_0 + 3)]) & 255) << 24)) | ((((long) v1_3[(v0_0 + 4)]) & 255) << 32)) | ((((long) v1_3[(v0_0 + 5)]) & 255) << 40)) | ((((long) v1_3[(v0_0 + 6)]) & 255) << 48)));
    }

    public final int E()
    {
        byte v0_0 = this.g;
        int v1_0 = this.e;
        if (v1_0 != v0_0) {
            byte v2_5 = (v0_0 + 1);
            byte[] v3 = this.d;
            int v4_5 = v3[v0_0];
            if (v4_5 < 0) {
                if ((v1_0 - v2_5) >= 9) {
                    byte v0_1;
                    int v1_1 = (v0_0 + 2);
                    byte v2_2 = ((v3[v2_5] << 7) ^ v4_5);
                    if (v2_2 >= 0) {
                        int v4_0 = (v0_0 + 3);
                        int v1_4 = ((v3[v1_1] << 14) ^ v2_2);
                        if (v1_4 < 0) {
                            byte v2_3 = (v0_0 + 4);
                            int v1_5 = (v1_4 ^ (v3[v4_0] << 21));
                            if (v1_5 >= 0) {
                                v4_0 = (v0_0 + 5);
                                byte v2_4 = v3[v2_3];
                                int v1_7 = ((v1_5 ^ (v2_4 << 28)) ^ 266354560);
                                if (v2_4 < 0) {
                                    v2_3 = (v0_0 + 6);
                                    if (v3[v4_0] < 0) {
                                        v4_0 = (v0_0 + 7);
                                        if (v3[v2_3] >= 0) {
                                            v0_1 = v1_7;
                                            v1_1 = v4_0;
                                            this.g = v1_1;
                                            return v0_1;
                                        } else {
                                            v2_3 = (v0_0 + 8);
                                            if (v3[v4_0] < 0) {
                                                v4_0 = (v0_0 + 9);
                                                if (v3[v2_3] >= 0) {
                                                } else {
                                                    if (v3[v4_0] >= 0) {
                                                        v1_1 = (v0_0 + 10);
                                                        v0_1 = v1_7;
                                                        this.g = v1_1;
                                                        return v0_1;
                                                    } else {
                                                        return ((int) this.G());
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    v0_1 = v1_7;
                                    v1_1 = v2_3;
                                    this.g = v1_1;
                                    return v0_1;
                                }
                            } else {
                                v0_1 = (-2080896 ^ v1_5);
                            }
                        } else {
                            v0_1 = (v1_4 ^ 16256);
                        }
                    } else {
                        v0_1 = (v2_2 ^ -128);
                    }
                    this.g = v1_1;
                    return v0_1;
                }
            } else {
                this.g = v2_5;
                return v4_5;
            }
        }
        return ((int) this.G());
    }

    public final long F()
    {
        int v0_0 = this.g;
        int v1_0 = this.e;
        if (v1_0 != v0_0) {
            long v2_6 = (v0_0 + 1);
            byte[] v3 = this.d;
            long v4_6 = v3[v0_0];
            if (v4_6 < 0) {
                if ((v1_0 - v2_6) >= 9) {
                    long v2_14;
                    int v1_1 = (v0_0 + 2);
                    long v2_2 = ((v3[v2_6] << 7) ^ v4_6);
                    if (v2_2 >= 0) {
                        long v4_0 = (v0_0 + 3);
                        int v1_4 = ((v3[v1_1] << 14) ^ v2_2);
                        if (v1_4 < 0) {
                            int v0_3;
                            long v2_3 = (v0_0 + 4);
                            int v1_5 = (v1_4 ^ (v3[v4_0] << 21));
                            if (v1_5 >= 0) {
                                long v2_15;
                                v1_1 = (v0_0 + 5);
                                long v4_4 = (((long) v1_5) ^ (((long) v3[v2_3]) << 28));
                                if (v4_4 < 0) {
                                    int v0_2;
                                    v2_3 = (v0_0 + 6);
                                    long v4_5 = (v4_4 ^ (((long) v3[v1_1]) << 35));
                                    if (v4_5 >= 0) {
                                        v1_1 = (v0_0 + 7);
                                        v4_4 = (v4_5 ^ (((long) v3[v2_3]) << 42));
                                        if (v4_4 < 0) {
                                            v2_3 = (v0_0 + 8);
                                            v4_5 = (v4_4 ^ (((long) v3[v1_1]) << 49));
                                            if (v4_5 >= 0) {
                                                v1_1 = (v0_0 + 9);
                                                long v4_8 = ((v4_5 ^ (((long) v3[v2_3]) << 56)) ^ 71499008037633920);
                                                if (v4_8 < 0) {
                                                    if (((long) v3[v1_1]) >= 0) {
                                                        v1_1 = (v0_0 + 10);
                                                    } else {
                                                        return this.G();
                                                    }
                                                }
                                                v2_14 = v4_8;
                                                this.g = v1_1;
                                                return v2_14;
                                            } else {
                                                v0_2 = -558586000294016;
                                            }
                                        } else {
                                            v2_15 = 4363953127296;
                                            v2_14 = (v2_15 ^ v4_4);
                                            this.g = v1_1;
                                            return v2_14;
                                        }
                                    } else {
                                        v0_2 = -34093383808;
                                    }
                                    v0_3 = (v0_2 ^ v4_5);
                                    v1_1 = v2_3;
                                    v2_14 = v0_3;
                                    this.g = v1_1;
                                    return v2_14;
                                } else {
                                    v2_15 = 266354560;
                                }
                            } else {
                                v0_3 = ((long) (-2080896 ^ v1_5));
                            }
                        } else {
                            v2_14 = ((long) (v1_4 ^ 16256));
                            v1_1 = v4_0;
                        }
                    } else {
                        v2_14 = ((long) (v2_2 ^ -128));
                    }
                    this.g = v1_1;
                    return v2_14;
                }
            } else {
                this.g = v2_6;
                return ((long) v4_6);
            }
        }
        return this.G();
    }

    public final long G()
    {
        long v0_0 = 0;
        int v2 = 0;
        while (v2 < 64) {
            if (this.g == this.e) {
                this.I(1);
            }
            int v3_1 = this.g;
            this.g = (v3_1 + 1);
            int v3_2 = this.d[v3_1];
            v0_0 |= (((long) (v3_2 & 127)) << v2);
            if ((v3_2 & 128) != 0) {
                v2 += 7;
            } else {
                return v0_0;
            }
        }
        throw androidx.datastore.preferences.protobuf.z.c();
    }

    public final void H()
    {
        int v0_2 = (this.e + this.f);
        this.e = v0_2;
        int v1_3 = (this.i + v0_2);
        int v2 = this.j;
        if (v1_3 <= v2) {
            this.f = 0;
            return;
        } else {
            int v1_1 = (v1_3 - v2);
            this.f = v1_1;
            this.e = (v0_2 - v1_1);
            return;
        }
    }

    public final void I(int p3)
    {
        if (this.K(p3)) {
            return;
        } else {
            if (p3 <= ((2147483647 - this.i) - this.g)) {
                throw androidx.datastore.preferences.protobuf.z.e();
            } else {
                throw new androidx.datastore.preferences.protobuf.z("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
            }
        }
    }

    public final void J(int p10)
    {
        int v1_0 = this.g;
        int v0_1 = (this.e - v1_0);
        if ((p10 > v0_1) || (p10 < null)) {
            int v2_3 = this.c;
            if (p10 < null) {
                throw androidx.datastore.preferences.protobuf.z.d();
            } else {
                int v3_0 = this.i;
                int v4 = (v3_0 + v1_0);
                int v6_0 = this.j;
                if ((v4 + p10) > v6_0) {
                    this.J(((v6_0 - v3_0) - v1_0));
                    throw androidx.datastore.preferences.protobuf.z.e();
                } else {
                    this.i = v4;
                    this.e = 0;
                    this.g = 0;
                    while (v0_1 < p10) {
                        int v3_2 = ((long) (p10 - v0_1));
                        long v5_1 = v2_3.skip(v3_2);
                        long v7_1 = v5_1 cmp 0;
                        if ((v7_1 < 0) || (v5_1 > v3_2)) {
                            int v1_4 = new StringBuilder();
                            v1_4.append(v2_3.getClass());
                            v1_4.append("#skip returned invalid result: ");
                            v1_4.append(v5_1);
                            v1_4.append("\nThe InputStream implementation is buggy.");
                            throw new IllegalStateException(v1_4.toString());
                        } else {
                            if (v7_1 == 0) {
                                break;
                            }
                            v0_1 += ((int) v5_1);
                        }
                    }
                    this.i = (this.i + v0_1);
                    this.H();
                    if (v0_1 < p10) {
                        int v0_2 = this.e;
                        int v2_7 = (v0_2 - this.g);
                        this.g = v0_2;
                        this.I(1);
                        while(true) {
                            int v0_3 = (p10 - v2_7);
                            int v3_4 = this.e;
                            if (v0_3 <= v3_4) {
                                break;
                            }
                            v2_7 += v3_4;
                            this.g = v3_4;
                            this.I(1);
                        }
                        this.g = v0_3;
                    }
                    return;
                }
            }
        } else {
            this.g = (v1_0 + p10);
            return;
        }
    }

    public final boolean K(int p8)
    {
        int v0_0 = this.c;
        int v1_0 = this.g;
        int v3_3 = this.e;
        if ((v1_0 + p8) <= v3_3) {
            throw new IllegalStateException(v1.a.j("refillBuffer() called when ", p8, " bytes were already available in buffer"));
        } else {
            int v2_0 = this.i;
            if ((p8 <= ((2147483647 - v2_0) - v1_0)) && (((v2_0 + v1_0) + p8) <= this.j)) {
                int v2_4 = this.d;
                if (v1_0 > 0) {
                    if (v3_3 > v1_0) {
                        System.arraycopy(v2_4, v1_0, v2_4, 0, (v3_3 - v1_0));
                    }
                    this.i = (this.i + v1_0);
                    this.e = (this.e - v1_0);
                    this.g = 0;
                }
                int v1_1 = this.e;
                try {
                    int v1_2 = v0_0.read(v2_4, v1_1, Math.min((v2_4.length - v1_1), ((2147483647 - this.i) - v1_1)));
                } catch (boolean v8_1) {
                    v8_1.a = 1;
                    throw v8_1;
                }
                if ((v1_2 == 0) || ((v1_2 < -1) || (v1_2 > v2_4.length))) {
                    int v2_7 = new StringBuilder();
                    v2_7.append(v0_0.getClass());
                    v2_7.append("#read(byte[]) returned invalid result: ");
                    v2_7.append(v1_2);
                    v2_7.append("\nThe InputStream implementation is buggy.");
                    throw new IllegalStateException(v2_7.toString());
                } else {
                    if (v1_2 > 0) {
                        this.e = (this.e + v1_2);
                        this.H();
                        if (this.e < p8) {
                            return this.K(p8);
                        } else {
                            return 1;
                        }
                    }
                }
            }
            return 0;
        }
    }

    public final void a(int p2)
    {
        if (this.h != p2) {
            throw new androidx.datastore.preferences.protobuf.z("Protocol message end-group tag did not match expected tag.");
        } else {
            return;
        }
    }

    public final int b()
    {
        return (this.i + this.g);
    }

    public final boolean c()
    {
        if ((this.g != this.e) || (this.K(1))) {
            return 0;
        } else {
            return 1;
        }
    }

    public final void d(int p1)
    {
        this.j = p1;
        this.H();
        return;
    }

    public final int e(int p3)
    {
        if (p3 < null) {
            throw androidx.datastore.preferences.protobuf.z.d();
        } else {
            String v0_3 = ((this.i + this.g) + p3);
            if (v0_3 < null) {
                throw new androidx.datastore.preferences.protobuf.z("Failed to parse the message.");
            } else {
                androidx.datastore.preferences.protobuf.z v3_2 = this.j;
                if (v0_3 > v3_2) {
                    throw androidx.datastore.preferences.protobuf.z.e();
                } else {
                    this.j = v0_3;
                    this.H();
                    return v3_2;
                }
            }
        }
    }

    public final boolean f()
    {
        if (this.F() == 0) {
            return 0;
        } else {
            return 1;
        }
    }

    public final androidx.datastore.preferences.protobuf.g g()
    {
        byte[] v0_0 = this.E();
        int v2_1 = this.g;
        int v3_1 = this.d;
        if ((v0_0 > (this.e - v2_1)) || (v0_0 <= null)) {
            if (v0_0 != null) {
                if (v0_0 < null) {
                    throw androidx.datastore.preferences.protobuf.z.d();
                } else {
                    androidx.datastore.preferences.protobuf.g v1_0 = this.A(v0_0);
                    if (v1_0 == null) {
                        androidx.datastore.preferences.protobuf.g v1_1 = this.g;
                        java.util.ArrayList v4_0 = this.e;
                        int v5 = (v4_0 - v1_1);
                        this.i = (this.i + v4_0);
                        this.g = 0;
                        this.e = 0;
                        java.util.ArrayList v4_2 = this.B((v0_0 - v5));
                        byte[] v0_2 = new byte[v0_0];
                        System.arraycopy(v3_1, v1_1, v0_2, 0, v5);
                        androidx.datastore.preferences.protobuf.g v1_3 = v4_2.size();
                        int v3_0 = 0;
                        while (v3_0 < v1_3) {
                            int v6_2 = v4_2.get(v3_0);
                            v3_0++;
                            int v6_3 = ((byte[]) v6_2);
                            System.arraycopy(v6_3, 0, v0_2, v5, v6_3.length);
                            v5 += v6_3.length;
                        }
                        return new androidx.datastore.preferences.protobuf.g(v0_2);
                    } else {
                        return androidx.datastore.preferences.protobuf.g.c(v1_0, 0, v1_0.length);
                    }
                }
            } else {
                return androidx.datastore.preferences.protobuf.g.c;
            }
        } else {
            androidx.datastore.preferences.protobuf.g v1_7 = androidx.datastore.preferences.protobuf.g.c(v3_1, v2_1, v0_0);
            this.g = (this.g + v0_0);
            return v1_7;
        }
    }

    public final double h()
    {
        return Double.longBitsToDouble(this.D());
    }

    public final int i()
    {
        return this.E();
    }

    public final int j()
    {
        return this.C();
    }

    public final long k()
    {
        return this.D();
    }

    public final float l()
    {
        return Float.intBitsToFloat(this.C());
    }

    public final int m()
    {
        return this.E();
    }

    public final long n()
    {
        return this.F();
    }

    public final int o()
    {
        return this.C();
    }

    public final long p()
    {
        return this.D();
    }

    public final int q()
    {
        int v0_0 = this.E();
        return ((- (v0_0 & 1)) ^ (v0_0 >> 1));
    }

    public final long r()
    {
        long v0_0 = this.F();
        return ((- (v0_0 & 1)) ^ (v0_0 >> 1));
    }

    public final String s()
    {
        byte[] v0_0 = this.E();
        String v1_2 = this.d;
        if (v0_0 > null) {
            int v3_1 = this.g;
            if (v0_0 <= (this.e - v3_1)) {
                java.nio.charset.Charset v2_5 = new String(v1_2, v3_1, v0_0, androidx.datastore.preferences.protobuf.x.a);
                this.g = (this.g + v0_0);
                return v2_5;
            }
        }
        if (v0_0 != null) {
            if (v0_0 < null) {
                throw androidx.datastore.preferences.protobuf.z.d();
            } else {
                if (v0_0 > this.e) {
                    return new String(this.z(v0_0), androidx.datastore.preferences.protobuf.x.a);
                } else {
                    this.I(v0_0);
                    java.nio.charset.Charset v2_3 = new String(v1_2, this.g, v0_0, androidx.datastore.preferences.protobuf.x.a);
                    this.g = (this.g + v0_0);
                    return v2_3;
                }
            }
        } else {
            return "";
        }
    }

    public final String t()
    {
        androidx.datastore.preferences.protobuf.z v0_0 = this.E();
        int v1 = this.g;
        a.a v2_2 = this.e;
        byte[] v4 = this.d;
        if ((v0_0 > (v2_2 - v1)) || (v0_0 <= null)) {
            if (v0_0 != null) {
                if (v0_0 < null) {
                    throw androidx.datastore.preferences.protobuf.z.d();
                } else {
                    v1 = 0;
                    if (v0_0 > v2_2) {
                        v4 = this.z(v0_0);
                    } else {
                        this.I(v0_0);
                        this.g = v0_0;
                    }
                }
            } else {
                return "";
            }
        } else {
            this.g = (v1 + v0_0);
        }
        return androidx.datastore.preferences.protobuf.k1.a.o(v4, v1, v0_0);
    }

    public final int u()
    {
        if (!this.c()) {
            androidx.datastore.preferences.protobuf.z v0_3 = this.E();
            this.h = v0_3;
            if ((v0_3 >> 3) == 0) {
                throw new androidx.datastore.preferences.protobuf.z("Protocol message contained an invalid tag (zero).");
            } else {
                return v0_3;
            }
        } else {
            this.h = 0;
            return 0;
        }
    }

    public final int v()
    {
        return this.E();
    }

    public final long w()
    {
        return this.F();
    }

    public final boolean x(int p6)
    {
        byte[] v0_0 = (p6 & 7);
        int v1 = 0;
        if (v0_0 == null) {
            byte[] v0_2 = this.d;
            if ((this.e - this.g) < 10) {
                while (v1 < 10) {
                    if (this.g == this.e) {
                        this.I(1);
                    }
                    androidx.datastore.preferences.protobuf.y v6_3 = this.g;
                    this.g = (v6_3 + 1);
                    if (v0_2[v6_3] < 0) {
                        v1++;
                    }
                }
                throw androidx.datastore.preferences.protobuf.z.c();
            } else {
                while (v1 < 10) {
                    androidx.datastore.preferences.protobuf.y v6_6 = this.g;
                    this.g = (v6_6 + 1);
                    if (v0_2[v6_6] < 0) {
                        v1++;
                    }
                }
                throw androidx.datastore.preferences.protobuf.z.c();
            }
            return 1;
        } else {
            if (v0_0 == 1) {
                this.J(8);
                return 1;
            } else {
                if (v0_0 == 2) {
                    this.J(this.E());
                    return 1;
                } else {
                    if (v0_0 == 3) {
                        this.y();
                        this.a((((p6 >> 3) << 3) | 4));
                        return 1;
                    } else {
                        if (v0_0 == 4) {
                            return 0;
                        } else {
                            if (v0_0 != 5) {
                                throw androidx.datastore.preferences.protobuf.z.b();
                            } else {
                                this.J(4);
                                return 1;
                            }
                        }
                    }
                }
            }
        }
    }

    public final byte[] z(int p8)
    {
        int v0_0 = this.A(p8);
        if (v0_0 == 0) {
            int v0_2 = this.g;
            int v1_0 = this.e;
            int v2 = (v1_0 - v0_2);
            this.i = (this.i + v1_0);
            this.g = 0;
            this.e = 0;
            java.util.ArrayList v3_1 = this.B((p8 - v2));
            byte[] v8_1 = new byte[p8];
            System.arraycopy(this.d, v0_2, v8_1, 0, v2);
            int v0_1 = v3_1.size();
            int v4_1 = 0;
            while (v4_1 < v0_1) {
                int v5_0 = v3_1.get(v4_1);
                v4_1++;
                int v5_1 = ((byte[]) v5_0);
                System.arraycopy(v5_1, 0, v8_1, v2, v5_1.length);
                v2 += v5_1.length;
            }
            return v8_1;
        } else {
            return v0_0;
        }
    }
}
