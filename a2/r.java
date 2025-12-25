package a2;
public final class r {
    public int a;
    public int b;
    public int c;
    public Object d;

    public r(androidx.datastore.preferences.protobuf.j p2)
    {
        this.c = 0;
        this.d = p2;
        p2.b = this;
        return;
    }

    public void a(int p6, int p7)
    {
        if (p6 < 0) {
            throw new IllegalArgumentException("Layout positions must be non-negative");
        } else {
            if (p7 < null) {
                throw new IllegalArgumentException("Pixel distance must be non-negative");
            } else {
                int[] v0_0 = this.c;
                int v1_0 = (v0_0 * 2);
                int v2_1 = ((int[]) this.d);
                if (v2_1 != 0) {
                    if (v1_0 >= v2_1.length) {
                        int[] v0_2 = new int[(v0_0 * 4)];
                        this.d = v0_2;
                        System.arraycopy(v2_1, 0, v0_2, 0, v2_1.length);
                    }
                } else {
                    int[] v0_3 = new int[4];
                    this.d = v0_3;
                    java.util.Arrays.fill(v0_3, -1);
                }
                int[] v0_5 = ((int[]) this.d);
                v0_5[v1_0] = p6;
                v0_5[(v1_0 + 1)] = p7;
                this.c = (this.c + 1);
                return;
            }
        }
    }

    public void b(androidx.recyclerview.widget.RecyclerView p5, boolean p6)
    {
        this.c = 0;
        a2.t0 v0_2 = ((int[]) this.d);
        if (v0_2 != null) {
            java.util.Arrays.fill(v0_2, -1);
        }
        a2.t0 v0_3 = p5.s;
        if ((p5.r != null) && ((v0_3 != null) && (v0_3.i))) {
            if (!p6) {
                if (!p5.O()) {
                    v0_3.h(this.a, this.b, p5.k0, this);
                }
            } else {
                if (!p5.e.h()) {
                    v0_3.i(p5.r.a(), this);
                }
            }
            int v1_7 = this.c;
            if (v1_7 > v0_3.j) {
                v0_3.j = v1_7;
                v0_3.k = p6;
                p5.c.n();
            }
        }
        return;
    }

    public int c()
    {
        int v0_0 = this.c;
        if (v0_0 == 0) {
            this.a = ((androidx.datastore.preferences.protobuf.j) this.d).u();
        } else {
            this.a = v0_0;
            this.c = 0;
        }
        int v0_1 = this.a;
        if ((v0_1 != 0) && (v0_1 != this.b)) {
            return (v0_1 >> 3);
        } else {
            return 2147483647;
        }
    }

    public void d(Object p3, androidx.datastore.preferences.protobuf.u0 p4, androidx.datastore.preferences.protobuf.n p5)
    {
        int v0 = this.b;
        this.b = (((this.a >> 3) << 3) | 4);
        try {
            p4.a(p3, this, p5);
        } catch (androidx.datastore.preferences.protobuf.z v3_3) {
            this.b = v0;
            throw v3_3;
        }
        if (this.a != this.b) {
            throw new androidx.datastore.preferences.protobuf.z("Failed to parse the message.");
        } else {
            this.b = v0;
            return;
        }
    }

    public void e(Object p5, androidx.datastore.preferences.protobuf.u0 p6, androidx.datastore.preferences.protobuf.n p7)
    {
        androidx.datastore.preferences.protobuf.j v0_1 = ((androidx.datastore.preferences.protobuf.j) this.d);
        int v1_1 = v0_1.v();
        if (v0_1.a >= 100) {
            throw new androidx.datastore.preferences.protobuf.z("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        } else {
            int v1_0 = v0_1.e(v1_1);
            v0_1.a = (v0_1.a + 1);
            p6.a(p5, this, p7);
            v0_1.a(0);
            v0_1.a = (v0_1.a - 1);
            v0_1.d(v1_0);
            return;
        }
    }

    public void f(androidx.datastore.preferences.protobuf.w p5)
    {
        androidx.datastore.preferences.protobuf.j v0_1 = ((androidx.datastore.preferences.protobuf.j) this.d);
        int v1_4 = (this.a & 7);
        if (v1_4 != 0) {
            if (v1_4 != 2) {
                throw androidx.datastore.preferences.protobuf.z.b();
            } else {
                int v2_4 = (v0_1.b() + v0_1.v());
                do {
                    ((androidx.datastore.preferences.protobuf.s0) p5).add(Boolean.valueOf(v0_1.f()));
                } while(v0_1.b() < v2_4);
                this.x(v2_4);
                return;
            }
        }
        do {
            ((androidx.datastore.preferences.protobuf.s0) p5).add(Boolean.valueOf(v0_1.f()));
            if (!v0_1.c()) {
                int v1_1 = v0_1.u();
            } else {
                return;
            }
        } while(v1_1 == this.a);
        this.c = v1_1;
        return;
    }

    public androidx.datastore.preferences.protobuf.g g()
    {
        this.y(2);
        return ((androidx.datastore.preferences.protobuf.j) this.d).g();
    }

    public void h(androidx.datastore.preferences.protobuf.w p4)
    {
        androidx.datastore.preferences.protobuf.j v0_1 = ((androidx.datastore.preferences.protobuf.j) this.d);
        if ((this.a & 7) != 2) {
            throw androidx.datastore.preferences.protobuf.z.b();
        }
        do {
            ((androidx.datastore.preferences.protobuf.s0) p4).add(this.g());
            if (!v0_1.c()) {
                int v1_2 = v0_1.u();
            } else {
                return;
            }
        } while(v1_2 == this.a);
        this.c = v1_2;
        return;
    }

    public void i(androidx.datastore.preferences.protobuf.w p6)
    {
        String v0_1 = ((androidx.datastore.preferences.protobuf.j) this.d);
        int v1_4 = (this.a & 7);
        if (v1_4 == 1) {
            do {
                ((androidx.datastore.preferences.protobuf.s0) p6).add(Double.valueOf(v0_1.h()));
                if (!v0_1.c()) {
                    int v1_1 = v0_1.u();
                }
            } while(v1_1 == this.a);
            this.c = v1_1;
            return;
        } else {
            if (v1_4 != 2) {
                throw androidx.datastore.preferences.protobuf.z.b();
            } else {
                int v1_3 = v0_1.v();
                if ((v1_3 & 7) != 0) {
                    throw new androidx.datastore.preferences.protobuf.z("Failed to parse the message.");
                } else {
                    int v2_6 = (v0_1.b() + v1_3);
                    do {
                        ((androidx.datastore.preferences.protobuf.s0) p6).add(Double.valueOf(v0_1.h()));
                    } while(v0_1.b() < v2_6);
                }
            }
        }
        return;
    }

    public void j(androidx.datastore.preferences.protobuf.w p5)
    {
        androidx.datastore.preferences.protobuf.j v0_1 = ((androidx.datastore.preferences.protobuf.j) this.d);
        int v1_4 = (this.a & 7);
        if (v1_4 != 0) {
            if (v1_4 != 2) {
                throw androidx.datastore.preferences.protobuf.z.b();
            } else {
                int v2_4 = (v0_1.b() + v0_1.v());
                do {
                    ((androidx.datastore.preferences.protobuf.s0) p5).add(Integer.valueOf(v0_1.i()));
                } while(v0_1.b() < v2_4);
                this.x(v2_4);
                return;
            }
        }
        do {
            ((androidx.datastore.preferences.protobuf.s0) p5).add(Integer.valueOf(v0_1.i()));
            if (!v0_1.c()) {
                int v1_1 = v0_1.u();
            } else {
                return;
            }
        } while(v1_1 == this.a);
        this.c = v1_1;
        return;
    }

    public Object k(androidx.datastore.preferences.protobuf.p1 p6, Class p7, androidx.datastore.preferences.protobuf.n p8)
    {
        androidx.datastore.preferences.protobuf.j v0_1 = ((androidx.datastore.preferences.protobuf.j) this.d);
        switch (p6.ordinal()) {
            case 0:
                this.y(1);
                return Double.valueOf(v0_1.h());
            case 1:
                this.y(5);
                return Float.valueOf(v0_1.l());
            case 2:
                this.y(0);
                return Long.valueOf(v0_1.n());
            case 3:
                this.y(0);
                return Long.valueOf(v0_1.w());
            case 4:
                this.y(0);
                return Integer.valueOf(v0_1.m());
            case 5:
                this.y(1);
                return Long.valueOf(v0_1.k());
            case 6:
                this.y(5);
                return Integer.valueOf(v0_1.j());
            case 7:
                this.y(0);
                return Boolean.valueOf(v0_1.f());
            case 8:
                this.y(2);
                return v0_1.t();
            case 9:
            default:
                throw new IllegalArgumentException("unsupported field type.");
                break;
            case 10:
                this.y(2);
                Long v6_21 = androidx.datastore.preferences.protobuf.r0.c.a(p7);
                androidx.datastore.preferences.protobuf.v v7_2 = v6_21.i();
                this.e(v7_2, v6_21, p8);
                v6_21.e(v7_2);
                return v7_2;
            case 11:
                return this.g();
            case 12:
                this.y(0);
                return Integer.valueOf(v0_1.v());
            case 13:
                this.y(0);
                return Integer.valueOf(v0_1.i());
            case 14:
                this.y(5);
                return Integer.valueOf(v0_1.o());
            case 15:
                this.y(1);
                return Long.valueOf(v0_1.p());
            case 16:
                this.y(0);
                return Integer.valueOf(v0_1.q());
            case 17:
                this.y(0);
                return Long.valueOf(v0_1.r());
        }
    }

    public void l(androidx.datastore.preferences.protobuf.w p5)
    {
        String v0_1 = ((androidx.datastore.preferences.protobuf.j) this.d);
        int v1_4 = (this.a & 7);
        if (v1_4 == 2) {
            int v1_9 = v0_1.v();
            if ((v1_9 & 3) != 0) {
                throw new androidx.datastore.preferences.protobuf.z("Failed to parse the message.");
            } else {
                int v2_1 = (v0_1.b() + v1_9);
                do {
                    ((androidx.datastore.preferences.protobuf.s0) p5).add(Integer.valueOf(v0_1.j()));
                } while(v0_1.b() < v2_1);
            }
        } else {
            if (v1_4 != 5) {
                throw androidx.datastore.preferences.protobuf.z.b();
            }
            do {
                ((androidx.datastore.preferences.protobuf.s0) p5).add(Integer.valueOf(v0_1.j()));
                if (!v0_1.c()) {
                    int v1_8 = v0_1.u();
                }
            } while(v1_8 == this.a);
            this.c = v1_8;
            return;
        }
        return;
    }

    public void m(androidx.datastore.preferences.protobuf.w p6)
    {
        String v0_1 = ((androidx.datastore.preferences.protobuf.j) this.d);
        int v1_4 = (this.a & 7);
        if (v1_4 == 1) {
            do {
                ((androidx.datastore.preferences.protobuf.s0) p6).add(Long.valueOf(v0_1.k()));
                if (!v0_1.c()) {
                    int v1_1 = v0_1.u();
                }
            } while(v1_1 == this.a);
            this.c = v1_1;
            return;
        } else {
            if (v1_4 != 2) {
                throw androidx.datastore.preferences.protobuf.z.b();
            } else {
                int v1_3 = v0_1.v();
                if ((v1_3 & 7) != 0) {
                    throw new androidx.datastore.preferences.protobuf.z("Failed to parse the message.");
                } else {
                    int v2_6 = (v0_1.b() + v1_3);
                    do {
                        ((androidx.datastore.preferences.protobuf.s0) p6).add(Long.valueOf(v0_1.k()));
                    } while(v0_1.b() < v2_6);
                }
            }
        }
        return;
    }

    public void n(androidx.datastore.preferences.protobuf.w p5)
    {
        String v0_1 = ((androidx.datastore.preferences.protobuf.j) this.d);
        int v1_4 = (this.a & 7);
        if (v1_4 == 2) {
            int v1_9 = v0_1.v();
            if ((v1_9 & 3) != 0) {
                throw new androidx.datastore.preferences.protobuf.z("Failed to parse the message.");
            } else {
                int v2_1 = (v0_1.b() + v1_9);
                do {
                    ((androidx.datastore.preferences.protobuf.s0) p5).add(Float.valueOf(v0_1.l()));
                } while(v0_1.b() < v2_1);
            }
        } else {
            if (v1_4 != 5) {
                throw androidx.datastore.preferences.protobuf.z.b();
            }
            do {
                ((androidx.datastore.preferences.protobuf.s0) p5).add(Float.valueOf(v0_1.l()));
                if (!v0_1.c()) {
                    int v1_8 = v0_1.u();
                }
            } while(v1_8 == this.a);
            this.c = v1_8;
            return;
        }
        return;
    }

    public void o(androidx.datastore.preferences.protobuf.w p5)
    {
        androidx.datastore.preferences.protobuf.j v0_1 = ((androidx.datastore.preferences.protobuf.j) this.d);
        int v1_4 = (this.a & 7);
        if (v1_4 != 0) {
            if (v1_4 != 2) {
                throw androidx.datastore.preferences.protobuf.z.b();
            } else {
                int v2_4 = (v0_1.b() + v0_1.v());
                do {
                    ((androidx.datastore.preferences.protobuf.s0) p5).add(Integer.valueOf(v0_1.m()));
                } while(v0_1.b() < v2_4);
                this.x(v2_4);
                return;
            }
        }
        do {
            ((androidx.datastore.preferences.protobuf.s0) p5).add(Integer.valueOf(v0_1.m()));
            if (!v0_1.c()) {
                int v1_1 = v0_1.u();
            } else {
                return;
            }
        } while(v1_1 == this.a);
        this.c = v1_1;
        return;
    }

    public void p(androidx.datastore.preferences.protobuf.w p6)
    {
        androidx.datastore.preferences.protobuf.j v0_1 = ((androidx.datastore.preferences.protobuf.j) this.d);
        int v1_4 = (this.a & 7);
        if (v1_4 != 0) {
            if (v1_4 != 2) {
                throw androidx.datastore.preferences.protobuf.z.b();
            } else {
                int v2_4 = (v0_1.b() + v0_1.v());
                do {
                    ((androidx.datastore.preferences.protobuf.s0) p6).add(Long.valueOf(v0_1.n()));
                } while(v0_1.b() < v2_4);
                this.x(v2_4);
                return;
            }
        }
        do {
            ((androidx.datastore.preferences.protobuf.s0) p6).add(Long.valueOf(v0_1.n()));
            if (!v0_1.c()) {
                int v1_1 = v0_1.u();
            } else {
                return;
            }
        } while(v1_1 == this.a);
        this.c = v1_1;
        return;
    }

    public void q(androidx.datastore.preferences.protobuf.w p5)
    {
        String v0_1 = ((androidx.datastore.preferences.protobuf.j) this.d);
        int v1_4 = (this.a & 7);
        if (v1_4 == 2) {
            int v1_9 = v0_1.v();
            if ((v1_9 & 3) != 0) {
                throw new androidx.datastore.preferences.protobuf.z("Failed to parse the message.");
            } else {
                int v2_1 = (v0_1.b() + v1_9);
                do {
                    ((androidx.datastore.preferences.protobuf.s0) p5).add(Integer.valueOf(v0_1.o()));
                } while(v0_1.b() < v2_1);
            }
        } else {
            if (v1_4 != 5) {
                throw androidx.datastore.preferences.protobuf.z.b();
            }
            do {
                ((androidx.datastore.preferences.protobuf.s0) p5).add(Integer.valueOf(v0_1.o()));
                if (!v0_1.c()) {
                    int v1_8 = v0_1.u();
                }
            } while(v1_8 == this.a);
            this.c = v1_8;
            return;
        }
        return;
    }

    public void r(androidx.datastore.preferences.protobuf.w p6)
    {
        String v0_1 = ((androidx.datastore.preferences.protobuf.j) this.d);
        int v1_4 = (this.a & 7);
        if (v1_4 == 1) {
            do {
                ((androidx.datastore.preferences.protobuf.s0) p6).add(Long.valueOf(v0_1.p()));
                if (!v0_1.c()) {
                    int v1_1 = v0_1.u();
                }
            } while(v1_1 == this.a);
            this.c = v1_1;
            return;
        } else {
            if (v1_4 != 2) {
                throw androidx.datastore.preferences.protobuf.z.b();
            } else {
                int v1_3 = v0_1.v();
                if ((v1_3 & 7) != 0) {
                    throw new androidx.datastore.preferences.protobuf.z("Failed to parse the message.");
                } else {
                    int v2_6 = (v0_1.b() + v1_3);
                    do {
                        ((androidx.datastore.preferences.protobuf.s0) p6).add(Long.valueOf(v0_1.p()));
                    } while(v0_1.b() < v2_6);
                }
            }
        }
        return;
    }

    public void s(androidx.datastore.preferences.protobuf.w p5)
    {
        androidx.datastore.preferences.protobuf.j v0_1 = ((androidx.datastore.preferences.protobuf.j) this.d);
        int v1_4 = (this.a & 7);
        if (v1_4 != 0) {
            if (v1_4 != 2) {
                throw androidx.datastore.preferences.protobuf.z.b();
            } else {
                int v2_4 = (v0_1.b() + v0_1.v());
                do {
                    ((androidx.datastore.preferences.protobuf.s0) p5).add(Integer.valueOf(v0_1.q()));
                } while(v0_1.b() < v2_4);
                this.x(v2_4);
                return;
            }
        }
        do {
            ((androidx.datastore.preferences.protobuf.s0) p5).add(Integer.valueOf(v0_1.q()));
            if (!v0_1.c()) {
                int v1_1 = v0_1.u();
            } else {
                return;
            }
        } while(v1_1 == this.a);
        this.c = v1_1;
        return;
    }

    public void t(androidx.datastore.preferences.protobuf.w p6)
    {
        androidx.datastore.preferences.protobuf.j v0_1 = ((androidx.datastore.preferences.protobuf.j) this.d);
        int v1_4 = (this.a & 7);
        if (v1_4 != 0) {
            if (v1_4 != 2) {
                throw androidx.datastore.preferences.protobuf.z.b();
            } else {
                int v2_4 = (v0_1.b() + v0_1.v());
                do {
                    ((androidx.datastore.preferences.protobuf.s0) p6).add(Long.valueOf(v0_1.r()));
                } while(v0_1.b() < v2_4);
                this.x(v2_4);
                return;
            }
        }
        do {
            ((androidx.datastore.preferences.protobuf.s0) p6).add(Long.valueOf(v0_1.r()));
            if (!v0_1.c()) {
                int v1_1 = v0_1.u();
            } else {
                return;
            }
        } while(v1_1 == this.a);
        this.c = v1_1;
        return;
    }

    public void u(androidx.datastore.preferences.protobuf.w p5, boolean p6)
    {
        androidx.datastore.preferences.protobuf.j v0_1 = ((androidx.datastore.preferences.protobuf.j) this.d);
        if ((this.a & 7) != 2) {
            throw androidx.datastore.preferences.protobuf.z.b();
        }
        do {
            int v1_0;
            if (!p6) {
                this.y(2);
                v1_0 = v0_1.s();
            } else {
                this.y(2);
                v1_0 = v0_1.t();
            }
            ((androidx.datastore.preferences.protobuf.s0) p5).add(v1_0);
            if (!v0_1.c()) {
                int v1_3 = v0_1.u();
            } else {
                return;
            }
        } while(v1_3 == this.a);
        this.c = v1_3;
        return;
    }

    public void v(androidx.datastore.preferences.protobuf.w p5)
    {
        androidx.datastore.preferences.protobuf.j v0_1 = ((androidx.datastore.preferences.protobuf.j) this.d);
        int v1_4 = (this.a & 7);
        if (v1_4 != 0) {
            if (v1_4 != 2) {
                throw androidx.datastore.preferences.protobuf.z.b();
            } else {
                int v2_4 = (v0_1.b() + v0_1.v());
                do {
                    ((androidx.datastore.preferences.protobuf.s0) p5).add(Integer.valueOf(v0_1.v()));
                } while(v0_1.b() < v2_4);
                this.x(v2_4);
                return;
            }
        }
        do {
            ((androidx.datastore.preferences.protobuf.s0) p5).add(Integer.valueOf(v0_1.v()));
            if (!v0_1.c()) {
                int v1_1 = v0_1.u();
            } else {
                return;
            }
        } while(v1_1 == this.a);
        this.c = v1_1;
        return;
    }

    public void w(androidx.datastore.preferences.protobuf.w p6)
    {
        androidx.datastore.preferences.protobuf.j v0_1 = ((androidx.datastore.preferences.protobuf.j) this.d);
        int v1_4 = (this.a & 7);
        if (v1_4 != 0) {
            if (v1_4 != 2) {
                throw androidx.datastore.preferences.protobuf.z.b();
            } else {
                int v2_4 = (v0_1.b() + v0_1.v());
                do {
                    ((androidx.datastore.preferences.protobuf.s0) p6).add(Long.valueOf(v0_1.w()));
                } while(v0_1.b() < v2_4);
                this.x(v2_4);
                return;
            }
        }
        do {
            ((androidx.datastore.preferences.protobuf.s0) p6).add(Long.valueOf(v0_1.w()));
            if (!v0_1.c()) {
                int v1_1 = v0_1.u();
            } else {
                return;
            }
        } while(v1_1 == this.a);
        this.c = v1_1;
        return;
    }

    public void x(int p2)
    {
        if (((androidx.datastore.preferences.protobuf.j) this.d).b() != p2) {
            throw androidx.datastore.preferences.protobuf.z.e();
        } else {
            return;
        }
    }

    public void y(int p2)
    {
        if ((this.a & 7) != p2) {
            throw androidx.datastore.preferences.protobuf.z.b();
        } else {
            return;
        }
    }

    public boolean z()
    {
        boolean v0_1 = ((androidx.datastore.preferences.protobuf.j) this.d);
        if (!v0_1.c()) {
            int v1_1 = this.a;
            if (v1_1 != this.b) {
                return v0_1.x(v1_1);
            }
        }
        return 0;
    }
}
