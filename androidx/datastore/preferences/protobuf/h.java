package androidx.datastore.preferences.protobuf;
public final class h extends androidx.datastore.preferences.protobuf.j {
    public final byte[] c;
    public int d;
    public int e;
    public int f;
    public final int g;
    public int h;
    public int i;

    public h(byte[] p1, int p2, int p3, boolean p4)
    {
        this.i = 2147483647;
        this.c = p1;
        this.d = (p3 + p2);
        this.f = p2;
        this.g = p2;
        return;
    }

    public final long A()
    {
        androidx.datastore.preferences.protobuf.z v0_0 = this.f;
        if ((this.d - v0_0) < 8) {
            throw androidx.datastore.preferences.protobuf.z.e();
        } else {
            this.f = (v0_0 + 8);
            byte[] v1_1 = this.c;
            return (((((long) v1_1[(v0_0 + 7)]) & 255) << 56) | (((((((((long) v1_1[v0_0]) & 255) | ((((long) v1_1[(v0_0 + 1)]) & 255) << 8)) | ((((long) v1_1[(v0_0 + 2)]) & 255) << 16)) | ((((long) v1_1[(v0_0 + 3)]) & 255) << 24)) | ((((long) v1_1[(v0_0 + 4)]) & 255) << 32)) | ((((long) v1_1[(v0_0 + 5)]) & 255) << 40)) | ((((long) v1_1[(v0_0 + 6)]) & 255) << 48)));
        }
    }

    public final int B()
    {
        byte v0_0 = this.f;
        int v1_0 = this.d;
        if (v1_0 != v0_0) {
            byte v2_5 = (v0_0 + 1);
            byte[] v3 = this.c;
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
                                            this.f = v1_1;
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
                                                        this.f = v1_1;
                                                        return v0_1;
                                                    } else {
                                                        return ((int) this.D());
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    v0_1 = v1_7;
                                    v1_1 = v2_3;
                                    this.f = v1_1;
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
                    this.f = v1_1;
                    return v0_1;
                }
            } else {
                this.f = v2_5;
                return v4_5;
            }
        }
        return ((int) this.D());
    }

    public final long C()
    {
        int v0_0 = this.f;
        int v1_0 = this.d;
        if (v1_0 != v0_0) {
            long v2_6 = (v0_0 + 1);
            byte[] v3 = this.c;
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
                                                        return this.D();
                                                    }
                                                }
                                                v2_14 = v4_8;
                                                this.f = v1_1;
                                                return v2_14;
                                            } else {
                                                v0_2 = -558586000294016;
                                            }
                                        } else {
                                            v2_15 = 4363953127296;
                                            v2_14 = (v2_15 ^ v4_4);
                                            this.f = v1_1;
                                            return v2_14;
                                        }
                                    } else {
                                        v0_2 = -34093383808;
                                    }
                                    v0_3 = (v0_2 ^ v4_5);
                                    v1_1 = v2_3;
                                    v2_14 = v0_3;
                                    this.f = v1_1;
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
                    this.f = v1_1;
                    return v2_14;
                }
            } else {
                this.f = v2_6;
                return ((long) v4_6);
            }
        }
        return this.D();
    }

    public final long D()
    {
        androidx.datastore.preferences.protobuf.z v0_0 = 0;
        int v2 = 0;
        while (v2 < 64) {
            int v3_3 = this.f;
            if (v3_3 == this.d) {
                throw androidx.datastore.preferences.protobuf.z.e();
            } else {
                this.f = (v3_3 + 1);
                int v3_0 = this.c[v3_3];
                v0_0 |= (((long) (v3_0 & 127)) << v2);
                if ((v3_0 & 128) != 0) {
                    v2 += 7;
                } else {
                    return v0_0;
                }
            }
        }
        throw androidx.datastore.preferences.protobuf.z.c();
    }

    public final void E()
    {
        int v0_2 = (this.d + this.e);
        this.d = v0_2;
        int v1_3 = (v0_2 - this.g);
        int v2 = this.i;
        if (v1_3 <= v2) {
            this.e = 0;
            return;
        } else {
            int v1_1 = (v1_3 - v2);
            this.e = v1_1;
            this.d = (v0_2 - v1_1);
            return;
        }
    }

    public final void F(int p3)
    {
        if (p3 >= null) {
            int v1_1 = this.f;
            if (p3 <= (this.d - v1_1)) {
                this.f = (v1_1 + p3);
                return;
            }
        }
        if (p3 >= null) {
            throw androidx.datastore.preferences.protobuf.z.e();
        } else {
            throw androidx.datastore.preferences.protobuf.z.d();
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
        return (this.f - this.g);
    }

    public final boolean c()
    {
        if (this.f != this.d) {
            return 0;
        } else {
            return 1;
        }
    }

    public final void d(int p1)
    {
        this.i = p1;
        this.E();
        return;
    }

    public final int e(int p2)
    {
        if (p2 < null) {
            throw androidx.datastore.preferences.protobuf.z.d();
        } else {
            String v0_1 = (this.b() + p2);
            if (v0_1 < null) {
                throw new androidx.datastore.preferences.protobuf.z("Failed to parse the message.");
            } else {
                androidx.datastore.preferences.protobuf.z v2_2 = this.i;
                if (v0_1 > v2_2) {
                    throw androidx.datastore.preferences.protobuf.z.e();
                } else {
                    this.i = v0_1;
                    this.E();
                    return v2_2;
                }
            }
        }
    }

    public final boolean f()
    {
        if (this.C() == 0) {
            return 0;
        } else {
            return 1;
        }
    }

    public final androidx.datastore.preferences.protobuf.g g()
    {
        androidx.datastore.preferences.protobuf.z v0_0 = this.B();
        androidx.datastore.preferences.protobuf.g v1_0 = this.c;
        if (v0_0 > null) {
            int v3_1 = this.f;
            if (v0_0 <= (this.d - v3_1)) {
                androidx.datastore.preferences.protobuf.g v1_3 = androidx.datastore.preferences.protobuf.g.c(v1_0, v3_1, v0_0);
                this.f = (this.f + v0_0);
                return v1_3;
            }
        }
        if (v0_0 != null) {
            androidx.datastore.preferences.protobuf.z v0_3;
            if (v0_0 <= null) {
                if (v0_0 > null) {
                    throw androidx.datastore.preferences.protobuf.z.e();
                } else {
                    if (v0_0 != null) {
                        throw androidx.datastore.preferences.protobuf.z.d();
                    } else {
                        v0_3 = androidx.datastore.preferences.protobuf.x.b;
                    }
                }
            } else {
                int v3_0 = this.f;
                if (v0_0 > (this.d - v3_0)) {
                } else {
                    androidx.datastore.preferences.protobuf.z v0_4 = (v0_0 + v3_0);
                    this.f = v0_4;
                    v0_3 = java.util.Arrays.copyOfRange(v1_0, v3_0, v0_4);
                }
            }
            return new androidx.datastore.preferences.protobuf.g(v0_3);
        } else {
            return androidx.datastore.preferences.protobuf.g.c;
        }
    }

    public final double h()
    {
        return Double.longBitsToDouble(this.A());
    }

    public final int i()
    {
        return this.B();
    }

    public final int j()
    {
        return this.z();
    }

    public final long k()
    {
        return this.A();
    }

    public final float l()
    {
        return Float.intBitsToFloat(this.z());
    }

    public final int m()
    {
        return this.B();
    }

    public final long n()
    {
        return this.C();
    }

    public final int o()
    {
        return this.z();
    }

    public final long p()
    {
        return this.A();
    }

    public final int q()
    {
        int v0_0 = this.B();
        return ((- (v0_0 & 1)) ^ (v0_0 >> 1));
    }

    public final long r()
    {
        long v0_0 = this.C();
        return ((- (v0_0 & 1)) ^ (v0_0 >> 1));
    }

    public final String s()
    {
        androidx.datastore.preferences.protobuf.z v0_0 = this.B();
        if (v0_0 > null) {
            int v2_2 = this.f;
            if (v0_0 <= (this.d - v2_2)) {
                String v1_1 = new String(this.c, v2_2, v0_0, androidx.datastore.preferences.protobuf.x.a);
                this.f = (this.f + v0_0);
                return v1_1;
            }
        }
        if (v0_0 != null) {
            if (v0_0 >= null) {
                throw androidx.datastore.preferences.protobuf.z.e();
            } else {
                throw androidx.datastore.preferences.protobuf.z.d();
            }
        } else {
            return "";
        }
    }

    public final String t()
    {
        androidx.datastore.preferences.protobuf.z v0_0 = this.B();
        if (v0_0 > null) {
            int v2_2 = this.f;
            if (v0_0 <= (this.d - v2_2)) {
                String v1_1 = androidx.datastore.preferences.protobuf.k1.a.o(this.c, v2_2, v0_0);
                this.f = (this.f + v0_0);
                return v1_1;
            }
        }
        if (v0_0 != null) {
            if (v0_0 > null) {
                throw androidx.datastore.preferences.protobuf.z.e();
            } else {
                throw androidx.datastore.preferences.protobuf.z.d();
            }
        } else {
            return "";
        }
    }

    public final int u()
    {
        if (!this.c()) {
            androidx.datastore.preferences.protobuf.z v0_3 = this.B();
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
        return this.B();
    }

    public final long w()
    {
        return this.C();
    }

    public final boolean x(int p6)
    {
        byte[] v0_0 = (p6 & 7);
        int v1 = 0;
        if (v0_0 == null) {
            byte[] v0_2 = this.c;
            if ((this.d - this.f) < 10) {
                while (v1 < 10) {
                    androidx.datastore.preferences.protobuf.y v6_2 = this.f;
                    if (v6_2 == this.d) {
                        throw androidx.datastore.preferences.protobuf.z.e();
                    } else {
                        this.f = (v6_2 + 1);
                        if (v0_2[v6_2] < 0) {
                            v1++;
                        }
                    }
                }
                throw androidx.datastore.preferences.protobuf.z.c();
            } else {
                while (v1 < 10) {
                    androidx.datastore.preferences.protobuf.y v6_6 = this.f;
                    this.f = (v6_6 + 1);
                    if (v0_2[v6_6] < 0) {
                        v1++;
                    }
                }
                throw androidx.datastore.preferences.protobuf.z.c();
            }
            return 1;
        } else {
            if (v0_0 == 1) {
                this.F(8);
                return 1;
            } else {
                if (v0_0 == 2) {
                    this.F(this.B());
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
                                this.F(4);
                                return 1;
                            }
                        }
                    }
                }
            }
        }
    }

    public final int z()
    {
        androidx.datastore.preferences.protobuf.z v0_0 = this.f;
        if ((this.d - v0_0) < 4) {
            throw androidx.datastore.preferences.protobuf.z.e();
        } else {
            this.f = (v0_0 + 4);
            byte[] v1_1 = this.c;
            return (((v1_1[(v0_0 + 3)] & 255) << 24) | (((v1_1[v0_0] & 255) | ((v1_1[(v0_0 + 1)] & 255) << 8)) | ((v1_1[(v0_0 + 2)] & 255) << 16)));
        }
    }
}
