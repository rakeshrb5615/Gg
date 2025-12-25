package y6;
public final class o extends java.util.AbstractMap implements java.io.Serializable {
    public static final a2.q o;
    public final java.util.Comparator a;
    public final boolean b;
    public y6.n c;
    public int d;
    public int e;
    public final y6.n f;
    public y6.m m;
    public y6.m n;

    static o()
    {
        y6.o.o = new a2.q(4);
        return;
    }

    public o(boolean p2)
    {
        this.d = 0;
        this.e = 0;
        this.a = y6.o.o;
        this.b = p2;
        this.f = new y6.n(p2);
        return;
    }

    public final y6.n b(Object p13, boolean p14)
    {
        int v5_1;
        y6.n v0_0 = this.c;
        a2.q v2 = y6.o.o;
        java.util.Comparator v3 = this.a;
        if (v0_0 == null) {
            v5_1 = 0;
        } else {
            int v4_0;
            if (v3 != v2) {
                v4_0 = 0;
            } else {
                v4_0 = ((Comparable) p13);
            }
            while(true) {
                int v5_0 = v0_0.f;
                if (v4_0 == 0) {
                    v5_1 = v3.compare(p13, v5_0);
                } else {
                    v5_1 = v4_0.compareTo(v5_0);
                }
                if (v5_1 != 0) {
                    y6.n v6_0;
                    if (v5_1 >= 0) {
                        v6_0 = v0_0.c;
                    } else {
                        v6_0 = v0_0.b;
                    }
                    if (v6_0 == null) {
                        break;
                    }
                    v0_0 = v6_0;
                } else {
                    return v0_0;
                }
            }
        }
        y6.n v8 = v0_0;
        if (p14 != null) {
            y6.n v6_2;
            y6.n v10 = this.f;
            if (v8 != null) {
                v6_2 = new y6.n(this.b, v8, p13, v10, v10.e);
                if (v5_1 >= 0) {
                    v8.c = v6_2;
                } else {
                    v8.b = v6_2;
                }
                this.c(v8, 1);
            } else {
                if ((v3 == v2) && (!(p13 instanceof Comparable))) {
                    throw new ClassCastException(p13.getClass().getName().concat(" is not Comparable"));
                } else {
                    v6_2 = new y6.n(this.b, v8, p13, v10, v10.e);
                    this.c = v6_2;
                }
            }
            this.d = (this.d + 1);
            this.e = (this.e + 1);
            return v6_2;
        } else {
            return 0;
        }
    }

    public final void c(y6.n p8, boolean p9)
    {
        while (p8 != null) {
            int v3_5;
            int v0_0 = p8.b;
            y6.n v1_1 = p8.c;
            int v2_0 = 0;
            if (v0_0 == 0) {
                v3_5 = 0;
            } else {
                v3_5 = v0_0.o;
            }
            int v4;
            if (v1_1 == null) {
                v4 = 0;
            } else {
                v4 = v1_1.o;
            }
            int v5 = (v3_5 - v4);
            if (v5 != -2) {
                if (v5 != 2) {
                    if (v5 != 0) {
                        p8.o = (Math.max(v3_5, v4) + 1);
                        if (!p9) {
                            break;
                        }
                    } else {
                        p8.o = (v3_5 + 1);
                        if (p9) {
                            break;
                        }
                    }
                } else {
                    int v3_2;
                    y6.n v1_2 = v0_0.b;
                    int v3_1 = v0_0.c;
                    if (v3_1 == 0) {
                        v3_2 = 0;
                    } else {
                        v3_2 = v3_1.o;
                    }
                    if (v1_2 != null) {
                        v2_0 = v1_2.o;
                    }
                    int v2_1 = (v2_0 - v3_2);
                    if ((v2_1 != 1) && ((v2_1 != 0) || (p9))) {
                        this.f(v0_0);
                        this.g(p8);
                    } else {
                        this.g(p8);
                    }
                    if (p9) {
                        break;
                    }
                }
            } else {
                int v3_4;
                int v0_3 = v1_1.b;
                int v3_3 = v1_1.c;
                if (v3_3 == 0) {
                    v3_4 = 0;
                } else {
                    v3_4 = v3_3.o;
                }
                if (v0_3 != 0) {
                    v2_0 = v0_3.o;
                }
                int v2_2 = (v2_0 - v3_4);
                if ((v2_2 != -1) && ((v2_2 != 0) || (p9))) {
                    this.g(v1_1);
                    this.f(p8);
                } else {
                    this.f(p8);
                }
                if (p9) {
                    break;
                }
            }
            p8 = p8.a;
        }
        return;
    }

    public final void clear()
    {
        this.c = 0;
        this.d = 0;
        this.e = (this.e + 1);
        y6.n v0_4 = this.f;
        v0_4.e = v0_4;
        v0_4.d = v0_4;
        return;
    }

    public final boolean containsKey(Object p3)
    {
        y6.n v1 = 0;
        try {
            if (p3 != 0) {
                v1 = this.b(p3, 0);
            }
        } catch (ClassCastException) {
        }
        if (v1 == null) {
            return 0;
        } else {
            return 1;
        }
    }

    public final void d(y6.n p7, boolean p8)
    {
        if (p8 != 0) {
            int v8_1 = p7.e;
            v8_1.d = p7.d;
            p7.d.e = v8_1;
        }
        int v8_4 = p7.b;
        y6.n v0_1 = p7.c;
        int v1_2 = p7.a;
        int v2 = 0;
        if ((v8_4 == 0) || (v0_1 == null)) {
            if (v8_4 == 0) {
                if (v0_1 == null) {
                    this.e(p7, 0);
                } else {
                    this.e(p7, v0_1);
                    p7.c = 0;
                }
            } else {
                this.e(p7, v8_4);
                p7.b = 0;
            }
            this.c(v1_2, 0);
            this.d = (this.d - 1);
            this.e = (this.e + 1);
            return;
        } else {
            y6.n v0_2;
            if (v8_4.o <= v0_1.o) {
                int v8_2 = v0_1.b;
                while(true) {
                    y6.n v5_0 = v0_1;
                    v0_1 = v8_2;
                    if (v0_1 == null) {
                        break;
                    }
                    v8_2 = v0_1.b;
                }
                v0_2 = v5_0;
            } else {
                y6.n v0_3 = v8_4.c;
                while(true) {
                    v0_2 = v8_4;
                    v8_4 = v0_3;
                    if (v8_4 == 0) {
                        break;
                    }
                    v0_3 = v8_4.c;
                }
            }
            int v1_1;
            this.d(v0_2, 0);
            int v8_5 = p7.b;
            if (v8_5 == 0) {
                v1_1 = 0;
            } else {
                v1_1 = v8_5.o;
                v0_2.b = v8_5;
                v8_5.a = v0_2;
                p7.b = 0;
            }
            int v8_6 = p7.c;
            if (v8_6 != 0) {
                v2 = v8_6.o;
                v0_2.c = v8_6;
                v8_6.a = v0_2;
                p7.c = 0;
            }
            v0_2.o = (Math.max(v1_1, v2) + 1);
            this.e(p7, v0_2);
            return;
        }
    }

    public final void e(y6.n p3, y6.n p4)
    {
        y6.n v0 = p3.a;
        p3.a = 0;
        if (p4 != null) {
            p4.a = v0;
        }
        if (v0 == null) {
            this.c = p4;
            return;
        } else {
            if (v0.b != p3) {
                v0.c = p4;
                return;
            } else {
                v0.b = p4;
                return;
            }
        }
    }

    public final java.util.Set entrySet()
    {
        y6.m v0_0 = this.m;
        if (v0_0 == null) {
            v0_0 = new y6.m(this, 0);
            this.m = v0_0;
        }
        return v0_0;
    }

    public final void f(y6.n p6)
    {
        int v0_0 = p6.b;
        y6.n v1 = p6.c;
        int v2_1 = v1.b;
        y6.n v3 = v1.c;
        p6.c = v2_1;
        if (v2_1 != 0) {
            v2_1.a = p6;
        }
        int v0_1;
        this.e(p6, v1);
        v1.b = p6;
        p6.a = v1;
        int v4 = 0;
        if (v0_0 == 0) {
            v0_1 = 0;
        } else {
            v0_1 = v0_0.o;
        }
        int v2_0;
        if (v2_1 == 0) {
            v2_0 = 0;
        } else {
            v2_0 = v2_1.o;
        }
        int v0_3 = (Math.max(v0_1, v2_0) + 1);
        p6.o = v0_3;
        if (v3 != null) {
            v4 = v3.o;
        }
        v1.o = (Math.max(v0_3, v4) + 1);
        return;
    }

    public final void g(y6.n p6)
    {
        y6.n v0 = p6.b;
        int v1_0 = p6.c;
        y6.n v2 = v0.b;
        int v3_1 = v0.c;
        p6.b = v3_1;
        if (v3_1 != 0) {
            v3_1.a = p6;
        }
        int v1_1;
        this.e(p6, v0);
        v0.c = p6;
        p6.a = v0;
        int v4 = 0;
        if (v1_0 == 0) {
            v1_1 = 0;
        } else {
            v1_1 = v1_0.o;
        }
        int v3_0;
        if (v3_1 == 0) {
            v3_0 = 0;
        } else {
            v3_0 = v3_1.o;
        }
        int v1_3 = (Math.max(v1_1, v3_0) + 1);
        p6.o = v1_3;
        if (v2 != null) {
            v4 = v2.o;
        }
        v0.o = (Math.max(v1_3, v4) + 1);
        return;
    }

    public final Object get(Object p3)
    {
        try {
            Object v3_1;
            if (p3 == null) {
                v3_1 = 0;
            } else {
                v3_1 = this.b(p3, 0);
            }
        } catch (ClassCastException) {
        }
        if (v3_1 == null) {
            return 0;
        } else {
            return v3_1.n;
        }
    }

    public final java.util.Set keySet()
    {
        y6.m v0_0 = this.n;
        if (v0_0 == null) {
            v0_0 = new y6.m(this, 1);
            this.n = v0_0;
        }
        return v0_0;
    }

    public final Object put(Object p2, Object p3)
    {
        if (p2 == null) {
            throw new NullPointerException("key == null");
        } else {
            if ((p3 == null) && (!this.b)) {
                throw new NullPointerException("value == null");
            } else {
                NullPointerException v2_3 = this.b(p2, 1);
                Object v0_1 = v2_3.n;
                v2_3.n = p3;
                return v0_1;
            }
        }
    }

    public final Object remove(Object p3)
    {
        try {
            Object v3_2;
            if (p3 == null) {
                v3_2 = 0;
            } else {
                v3_2 = this.b(p3, 0);
            }
        } catch (ClassCastException) {
        }
        if (v3_2 != null) {
            this.d(v3_2, 1);
        }
        if (v3_2 == null) {
            return 0;
        } else {
            return v3_2.n;
        }
    }

    public final int size()
    {
        return this.d;
    }
}
