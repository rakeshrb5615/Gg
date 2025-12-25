package i7;
public final class g extends i7.e {
    public static final Object[] d;
    public int a;
    public Object[] b;
    public int c;

    static g()
    {
        Object[] v0_1 = new Object[0];
        i7.g.d = v0_1;
        return;
    }

    public g()
    {
        this.b = i7.g.d;
        return;
    }

    public final void add(int p8, Object p9)
    {
        int v0_0 = this.c;
        if ((p8 < 0) || (p8 > v0_0)) {
            throw new IndexOutOfBoundsException(v1.a.i("index: ", p8, v0_0, ", size: "));
        } else {
            if (p8 != v0_0) {
                if (p8 != 0) {
                    this.j();
                    this.e((this.c + 1));
                    int v0_5 = this.i((this.a + p8));
                    Object[] v2_0 = this.c;
                    if (p8 >= ((v2_0 + 1) >> 1)) {
                        int v8_2 = this.i((v2_0 + this.a));
                        if (v0_5 >= v8_2) {
                            i7.h.Z(this.b, 1, this.b, 0, v8_2);
                            int v8_3 = this.b;
                            v8_3[0] = v8_3[(v8_3.length - 1)];
                            i7.h.Z(v8_3, (v0_5 + 1), v8_3, v0_5, (v8_3.length - 1));
                        } else {
                            i7.h.Z(this.b, (v0_5 + 1), this.b, v0_5, v8_2);
                        }
                        this.b[v0_5] = p9;
                    } else {
                        if (v0_5 == 0) {
                            int v0_6 = this.b;
                            kotlin.jvm.internal.j.e(v0_6, "<this>");
                            v0_5 = v0_6.length;
                        }
                        int v8_6;
                        int v0_7 = (v0_5 - 1);
                        Object[] v2_9 = this.a;
                        if (v2_9 != null) {
                            v8_6 = (v2_9 - 1);
                        } else {
                            Object[] v2_10 = this.b;
                            kotlin.jvm.internal.j.e(v2_10, "<this>");
                            v8_6 = (v2_10.length - 1);
                        }
                        Object[] v2_11 = this.a;
                        if (v0_7 < v2_11) {
                            int v3_5 = this.b;
                            i7.h.Z(v3_5, (v2_11 - 1), v3_5, v2_11, v3_5.length);
                            Object[] v2_12 = this.b;
                            v2_12[(v2_12.length - 1)] = v2_12[0];
                            i7.h.Z(v2_12, 0, v2_12, 1, (v0_7 + 1));
                        } else {
                            int v3_9 = this.b;
                            v3_9[v8_6] = v3_9[v2_11];
                            i7.h.Z(v3_9, v2_11, v3_9, (v2_11 + 1), (v0_7 + 1));
                        }
                        this.b[v0_7] = p9;
                        this.a = v8_6;
                    }
                    this.c = (this.c + 1);
                    return;
                } else {
                    this.addFirst(p9);
                    return;
                }
            } else {
                this.addLast(p9);
                return;
            }
        }
    }

    public final boolean add(Object p1)
    {
        this.addLast(p1);
        return 1;
    }

    public final boolean addAll(int p9, java.util.Collection p10)
    {
        kotlin.jvm.internal.j.e(p10, "elements");
        Object[] v0_4 = this.c;
        if ((p9 < 0) || (p9 > v0_4)) {
            throw new IndexOutOfBoundsException(v1.a.i("index: ", p9, v0_4, ", size: "));
        } else {
            if (!p10.isEmpty()) {
                if (p9 != this.c) {
                    this.j();
                    this.e((p10.size() + this.c));
                    Object[] v0_6 = this.i((this.c + this.a));
                    int v2_7 = this.i((this.a + p9));
                    int v3_0 = p10.size();
                    if (p9 >= ((this.c + 1) >> 1)) {
                        int v9_4 = (v2_7 + v3_0);
                        if (v2_7 >= v0_6) {
                            i7.h.Z(this.b, v3_0, this.b, 0, v0_6);
                            Object[] v0_7 = this.b;
                            if (v9_4 < v0_7.length) {
                                i7.h.Z(v0_7, 0, v0_7, (v0_7.length - v3_0), v0_7.length);
                                Object[] v0_8 = this.b;
                                i7.h.Z(v0_8, v9_4, v0_8, v2_7, (v0_8.length - v3_0));
                            } else {
                                i7.h.Z(v0_7, (v9_4 - v0_7.length), v0_7, v2_7, v0_7.length);
                            }
                        } else {
                            int v3_1 = (v3_0 + v0_6);
                            int v4_9 = this.b;
                            if (v3_1 > v4_9.length) {
                                if (v9_4 < v4_9.length) {
                                    int v3_3 = (v0_6 - (v3_1 - v4_9.length));
                                    i7.h.Z(v4_9, 0, v4_9, v3_3, v0_6);
                                    i7.h.Z(this.b, v9_4, this.b, v2_7, v3_3);
                                } else {
                                    i7.h.Z(v4_9, (v9_4 - v4_9.length), v4_9, v2_7, v0_6);
                                }
                            } else {
                                i7.h.Z(v4_9, v9_4, v4_9, v2_7, v0_6);
                            }
                        }
                        this.d(v2_7, p10);
                        return 1;
                    } else {
                        int v9_7 = this.a;
                        Object[] v0_10 = (v9_7 - v3_0);
                        if (v2_7 < v9_7) {
                            int v4_10 = this.b;
                            i7.h.Z(v4_10, v0_10, v4_10, v9_7, v4_10.length);
                            if (v3_0 < v2_7) {
                                int v9_8 = this.b;
                                i7.h.Z(v9_8, (v9_8.length - v3_0), v9_8, 0, v3_0);
                                i7.h.Z(this.b, 0, this.b, v3_0, v2_7);
                            } else {
                                int v9_11 = this.b;
                                i7.h.Z(v9_11, (v9_11.length - v3_0), v9_11, 0, v2_7);
                            }
                        } else {
                            if (v0_10 < null) {
                                int v4_15 = this.b;
                                v0_10 += v4_15.length;
                                int v7_0 = (v4_15.length - v0_10);
                                if (v7_0 < (v2_7 - v9_7)) {
                                    i7.h.Z(v4_15, v0_10, v4_15, v9_7, (v9_7 + v7_0));
                                    i7.h.Z(this.b, 0, this.b, (this.a + v7_0), v2_7);
                                } else {
                                    i7.h.Z(v4_15, v0_10, v4_15, v9_7, v2_7);
                                }
                            } else {
                                i7.h.Z(this.b, v0_10, this.b, v9_7, v2_7);
                            }
                        }
                        this.a = v0_10;
                        this.d(this.g((v2_7 - v3_0)), p10);
                        return 1;
                    }
                } else {
                    return this.addAll(p10);
                }
            } else {
                return 0;
            }
        }
    }

    public final boolean addAll(java.util.Collection p3)
    {
        kotlin.jvm.internal.j.e(p3, "elements");
        if (!p3.isEmpty()) {
            this.j();
            this.e((p3.size() + this.b()));
            this.d(this.i((this.b() + this.a)), p3);
            return 1;
        } else {
            return 0;
        }
    }

    public final void addFirst(Object p3)
    {
        this.j();
        this.e((this.c + 1));
        int v0_3 = this.a;
        if (v0_3 == 0) {
            int v0_4 = this.b;
            kotlin.jvm.internal.j.e(v0_4, "<this>");
            v0_3 = v0_4.length;
        }
        int v0_1 = (v0_3 - 1);
        this.a = v0_1;
        this.b[v0_1] = p3;
        this.c = (this.c + 1);
        return;
    }

    public final void addLast(Object p4)
    {
        this.j();
        this.e((this.b() + 1));
        Object[] v0_2 = this.b;
        this.i((this.b() + this.a))[int v1_0] = p4;
        this.c = (this.b() + 1);
        return;
    }

    public final int b()
    {
        return this.c;
    }

    public final Object c(int p9)
    {
        Object[] v0_0 = this.c;
        if ((p9 < 0) || (p9 >= v0_0)) {
            throw new IndexOutOfBoundsException(v1.a.i("index: ", p9, v0_0, ", size: "));
        } else {
            if (p9 != a.a.y(this)) {
                if (p9 != 0) {
                    this.j();
                    Object[] v0_4 = this.i((this.a + p9));
                    int v1_0 = this.b;
                    Object v2_0 = v1_0[v0_4];
                    if (p9 >= (this.c >> 1)) {
                        int v9_2 = this.i((a.a.y(this) + this.a));
                        if (v0_4 > v9_2) {
                            int v1_4 = this.b;
                            i7.h.Z(v1_4, v0_4, v1_4, (v0_4 + 1), v1_4.length);
                            Object[] v0_5 = this.b;
                            v0_5[(v0_5.length - 1)] = v0_5[0];
                            i7.h.Z(v0_5, 0, v0_5, 1, (v9_2 + 1));
                        } else {
                            i7.h.Z(this.b, v0_4, this.b, (v0_4 + 1), (v9_2 + 1));
                        }
                        this.b[v9_2] = 0;
                    } else {
                        int v9_3 = this.a;
                        if (v0_4 < v9_3) {
                            i7.h.Z(v1_0, 1, v1_0, 0, v0_4);
                            int v9_4 = this.b;
                            v9_4[0] = v9_4[(v9_4.length - 1)];
                            Object[] v0_10 = this.a;
                            i7.h.Z(v9_4, (v0_10 + 1), v9_4, v0_10, (v9_4.length - 1));
                        } else {
                            i7.h.Z(v1_0, (v9_3 + 1), v1_0, v9_3, v0_4);
                        }
                        Object[] v0_11 = this.a;
                        this.b[v0_11] = 0;
                        this.a = this.f(v0_11);
                    }
                    this.c = (this.c - 1);
                    return v2_0;
                } else {
                    return this.removeFirst();
                }
            } else {
                return this.removeLast();
            }
        }
    }

    public final void clear()
    {
        if (!this.isEmpty()) {
            this.j();
            this.h(this.a, this.i((this.b() + this.a)));
        }
        this.a = 0;
        this.c = 0;
        return;
    }

    public final boolean contains(Object p2)
    {
        if (this.indexOf(p2) == -1) {
            return 0;
        } else {
            return 1;
        }
    }

    public final void d(int p5, java.util.Collection p6)
    {
        java.util.Iterator v0 = p6.iterator();
        int v1_2 = this.b.length;
        while ((p5 < v1_2) && (v0.hasNext())) {
            this.b[p5] = v0.next();
            p5++;
        }
        int v5_2 = this.a;
        int v1_1 = 0;
        while ((v1_1 < v5_2) && (v0.hasNext())) {
            this.b[v1_1] = v0.next();
            v1_1++;
        }
        this.c = (p6.size() + this.c);
        return;
    }

    public final void e(int p5)
    {
        if (p5 < null) {
            throw new IllegalStateException("Deque is too big.");
        } else {
            Object[] v0_3 = this.b;
            if (p5 > v0_3.length) {
                if (v0_3 != i7.g.d) {
                    int v1_0 = v0_3.length;
                    int v1_1 = (v1_0 + (v1_0 >> 1));
                    if ((v1_1 - p5) < 0) {
                        v1_1 = p5;
                    }
                    if ((v1_1 - 2147483639) > 0) {
                        if (p5 <= 2147483639) {
                            v1_1 = 2147483639;
                        } else {
                            v1_1 = 2147483647;
                        }
                    }
                    Object[] v5_2 = new Object[v1_1];
                    i7.h.Z(v0_3, 0, v5_2, this.a, v0_3.length);
                    Object[] v0_1 = this.b;
                    int v2_4 = this.a;
                    i7.h.Z(v0_1, (v0_1.length - v2_4), v5_2, 0, v2_4);
                    this.a = 0;
                    this.b = v5_2;
                    return;
                } else {
                    if (p5 < 10) {
                        p5 = 10;
                    }
                    Object[] v5_4 = new Object[p5];
                    this.b = v5_4;
                    return;
                }
            } else {
                return;
            }
        }
    }

    public final int f(int p3)
    {
        int v0_0 = this.b;
        kotlin.jvm.internal.j.e(v0_0, "<this>");
        if (p3 != (v0_0.length - 1)) {
            return (p3 + 1);
        } else {
            return 0;
        }
    }

    public final int g(int p2)
    {
        if (p2 < 0) {
            p2 += this.b.length;
        }
        return p2;
    }

    public final Object get(int p5)
    {
        Object[] v0_0 = this.b();
        if ((p5 < null) || (p5 >= v0_0)) {
            throw new IndexOutOfBoundsException(v1.a.i("index: ", p5, v0_0, ", size: "));
        } else {
            return this.b[this.i((this.a + p5))];
        }
    }

    public final void h(int p3, int p4)
    {
        if (p3 >= p4) {
            int v0_0 = this.b;
            i7.h.d0(v0_0, p3, v0_0.length);
            i7.h.d0(this.b, 0, p4);
            return;
        } else {
            i7.h.d0(this.b, p3, p4);
            return;
        }
    }

    public final int i(int p3)
    {
        int v0_0 = this.b;
        if (p3 >= v0_0.length) {
            p3 -= v0_0.length;
        }
        return p3;
    }

    public final int indexOf(Object p5)
    {
        int v5_3;
        int v0_1 = this.i((this.b() + this.a));
        int v1_2 = this.a;
        if (v1_2 >= v0_1) {
            if (v1_2 < v0_1) {
                return -1;
            }
            while (v1_2 < this.b.length) {
                if (!kotlin.jvm.internal.j.a(p5, this.b[v1_2])) {
                    v1_2++;
                } else {
                    v5_3 = this.a;
                }
            }
            int v1_0 = 0;
            while (v1_0 < v0_1) {
                if (!kotlin.jvm.internal.j.a(p5, this.b[v1_0])) {
                    v1_0++;
                } else {
                    v1_2 = (v1_0 + this.b.length);
                    v5_3 = this.a;
                }
            }
            return -1;
        } else {
            while (v1_2 < v0_1) {
                if (!kotlin.jvm.internal.j.a(p5, this.b[v1_2])) {
                    v1_2++;
                } else {
                    v5_3 = this.a;
                }
            }
            return -1;
        }
        return (v1_2 - v5_3);
    }

    public final boolean isEmpty()
    {
        if (this.b() != 0) {
            return 0;
        } else {
            return 1;
        }
    }

    public final void j()
    {
        this.modCount = (this.modCount + 1);
        return;
    }

    public final int lastIndexOf(Object p5)
    {
        int v0_3;
        int v5_1;
        int v0_5 = this.i((this.c + this.a));
        int v1_7 = this.a;
        if (v1_7 >= v0_5) {
            if (v1_7 <= v0_5) {
                return -1;
            } else {
                int v0_4 = (v0_5 - 1);
                while (-1 < v0_4) {
                    if (!kotlin.jvm.internal.j.a(p5, this.b[v0_4])) {
                        v0_4--;
                    } else {
                        v0_3 = (v0_4 + this.b.length);
                        v5_1 = this.a;
                    }
                }
                int v0_1 = this.b;
                kotlin.jvm.internal.j.e(v0_1, "<this>");
                v0_3 = (v0_1.length - 1);
                int v1_2 = this.a;
                if (v1_2 > v0_3) {
                    return -1;
                }
                while (!kotlin.jvm.internal.j.a(p5, this.b[v0_3])) {
                    if (v0_3 == v1_2) {
                        return -1;
                    } else {
                        v0_3--;
                    }
                }
                v5_1 = this.a;
            }
        } else {
            v0_3 = (v0_5 - 1);
            if (v1_7 > v0_3) {
                return -1;
            }
            while (!kotlin.jvm.internal.j.a(p5, this.b[v0_3])) {
                if (v0_3 == v1_7) {
                    return -1;
                } else {
                    v0_3--;
                }
            }
            v5_1 = this.a;
        }
        return (v0_3 - v5_1);
    }

    public final boolean remove(Object p2)
    {
        int v2_1 = this.indexOf(p2);
        if (v2_1 != -1) {
            this.c(v2_1);
            return 1;
        } else {
            return 0;
        }
    }

    public final boolean removeAll(java.util.Collection p11)
    {
        kotlin.jvm.internal.j.e(p11, "elements");
        int v1 = 0;
        if ((!this.isEmpty()) && (this.b.length != 0)) {
            int v4_2;
            int v0_1 = this.i((this.c + this.a));
            Object[] v2_2 = this.a;
            if (v2_2 >= v0_1) {
                int v4_1 = this.b.length;
                int v6_0 = 0;
                Object v5_0 = v2_2;
                while (v2_2 < v4_1) {
                    int v8_0 = this.b;
                    Object v9 = v8_0[v2_2];
                    v8_0[v2_2] = 0;
                    if (p11.contains(v9)) {
                        v6_0 = 1;
                    } else {
                        int v8_1 = (v5_0 + 1);
                        this.b[v5_0] = v9;
                        v5_0 = v8_1;
                    }
                    v2_2++;
                }
                v4_2 = this.i(v5_0);
                while (v1 < v0_1) {
                    Object[] v2_4 = this.b;
                    Object v5_1 = v2_4[v1];
                    v2_4[v1] = 0;
                    if (p11.contains(v5_1)) {
                        v6_0 = 1;
                    } else {
                        this.b[v4_2] = v5_1;
                        v4_2 = this.f(v4_2);
                    }
                    v1++;
                }
                v1 = v6_0;
            } else {
                v4_2 = v2_2;
                while (v2_2 < v0_1) {
                    Object v5_3 = this.b[v2_2];
                    if (p11.contains(v5_3)) {
                        v1 = 1;
                    } else {
                        Object[] v7_3 = (v4_2 + 1);
                        this.b[v4_2] = v5_3;
                        v4_2 = v7_3;
                    }
                    v2_2++;
                }
                i7.h.d0(this.b, v4_2, v0_1);
            }
            if (v1 != 0) {
                this.j();
                this.c = this.g((v4_2 - this.a));
            }
        }
        return v1;
    }

    public final Object removeFirst()
    {
        if (this.isEmpty()) {
            throw new java.util.NoSuchElementException("ArrayDeque is empty.");
        } else {
            this.j();
            java.util.NoSuchElementException v0_6 = this.b;
            String v1_1 = this.a;
            Object v2 = v0_6[v1_1];
            v0_6[v1_1] = 0;
            this.a = this.f(v1_1);
            this.c = (this.b() - 1);
            return v2;
        }
    }

    public final Object removeLast()
    {
        if (this.isEmpty()) {
            throw new java.util.NoSuchElementException("ArrayDeque is empty.");
        } else {
            this.j();
            java.util.NoSuchElementException v0_1 = this.i((a.a.y(this) + this.a));
            String v1_2 = this.b;
            Object v2 = v1_2[v0_1];
            v1_2[v0_1] = 0;
            this.c = (this.b() - 1);
            return v2;
        }
    }

    public final void removeRange(int p8, int p9)
    {
        j5.t1.e(p8, p9, this.c);
        int v0_1 = (p9 - p8);
        if (v0_1 != 0) {
            if (v0_1 != this.c) {
                if (v0_1 != 1) {
                    this.j();
                    if (p8 >= (this.c - p9)) {
                        int v1_2 = this.i((this.a + p9));
                        int v8_1 = this.i((this.a + p8));
                        int v2_3 = this.c;
                        while(true) {
                            v2_3 -= p9;
                            if (v2_3 <= 0) {
                                break;
                            }
                            int v9_5 = this.b;
                            p9 = Math.min(v2_3, Math.min((v9_5.length - v1_2), (v9_5.length - v8_1)));
                            int v4_0 = (v1_2 + p9);
                            i7.h.Z(this.b, v8_1, this.b, v1_2, v4_0);
                            v1_2 = this.i(v4_0);
                            v8_1 = this.i((v8_1 + p9));
                        }
                        int v8_3 = this.i((this.c + this.a));
                        this.h(this.g((v8_3 - v0_1)), v8_3);
                    } else {
                        int v2_5 = this.i((this.a + (p8 - 1)));
                        int v9_10 = this.i((this.a + (p9 - 1)));
                        while (p8 > 0) {
                            int v1_7 = (v2_5 + 1);
                            Object[] v3_7 = Math.min(p8, Math.min(v1_7, (v9_10 + 1)));
                            int v9_12 = (v9_10 - v3_7);
                            int v2_6 = (v2_5 - v3_7);
                            i7.h.Z(this.b, (v9_12 + 1), this.b, (v2_6 + 1), v1_7);
                            v2_5 = this.g(v2_6);
                            v9_10 = this.g(v9_12);
                            p8 -= v3_7;
                        }
                        int v8_7 = this.i((this.a + v0_1));
                        this.h(this.a, v8_7);
                        this.a = v8_7;
                    }
                    this.c = (this.c - v0_1);
                    return;
                } else {
                    this.c(p8);
                    return;
                }
            } else {
                this.clear();
                return;
            }
        } else {
            return;
        }
    }

    public final boolean retainAll(java.util.Collection p11)
    {
        kotlin.jvm.internal.j.e(p11, "elements");
        int v1 = 0;
        if ((!this.isEmpty()) && (this.b.length != 0)) {
            int v4_2;
            int v0_1 = this.i((this.c + this.a));
            Object[] v2_2 = this.a;
            if (v2_2 >= v0_1) {
                int v4_1 = this.b.length;
                int v6_0 = 0;
                Object v5_0 = v2_2;
                while (v2_2 < v4_1) {
                    int v8_0 = this.b;
                    Object v9 = v8_0[v2_2];
                    v8_0[v2_2] = 0;
                    if (!p11.contains(v9)) {
                        v6_0 = 1;
                    } else {
                        int v8_1 = (v5_0 + 1);
                        this.b[v5_0] = v9;
                        v5_0 = v8_1;
                    }
                    v2_2++;
                }
                v4_2 = this.i(v5_0);
                while (v1 < v0_1) {
                    Object[] v2_4 = this.b;
                    Object v5_1 = v2_4[v1];
                    v2_4[v1] = 0;
                    if (!p11.contains(v5_1)) {
                        v6_0 = 1;
                    } else {
                        this.b[v4_2] = v5_1;
                        v4_2 = this.f(v4_2);
                    }
                    v1++;
                }
                v1 = v6_0;
            } else {
                v4_2 = v2_2;
                while (v2_2 < v0_1) {
                    Object v5_3 = this.b[v2_2];
                    if (!p11.contains(v5_3)) {
                        v1 = 1;
                    } else {
                        Object[] v7_3 = (v4_2 + 1);
                        this.b[v4_2] = v5_3;
                        v4_2 = v7_3;
                    }
                    v2_2++;
                }
                i7.h.d0(this.b, v4_2, v0_1);
            }
            if (v1 != 0) {
                this.j();
                this.c = this.g((v4_2 - this.a));
            }
        }
        return v1;
    }

    public final Object set(int p4, Object p5)
    {
        Object[] v0_0 = this.b();
        if ((p4 < 0) || (p4 >= v0_0)) {
            throw new IndexOutOfBoundsException(v1.a.i("index: ", p4, v0_0, ", size: "));
        } else {
            int v4_1 = this.i((this.a + p4));
            Object[] v0_3 = this.b;
            Object v1_0 = v0_3[v4_1];
            v0_3[v4_1] = p5;
            return v1_0;
        }
    }

    public final Object[] toArray()
    {
        Object[] v0_1 = new Object[this.b()];
        return this.toArray(v0_1);
    }

    public final Object[] toArray(Object[] p6)
    {
        kotlin.jvm.internal.j.e(p6, "array");
        int v1_6 = this.c;
        if (p6.length < v1_6) {
            Object[] v6_1 = reflect.Array.newInstance(p6.getClass().getComponentType(), v1_6);
            kotlin.jvm.internal.j.c(v6_1, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.arrayOfNulls>");
            p6 = ((Object[]) v6_1);
        }
        int v0_3 = this.i((this.c + this.a));
        int v1_2 = this.a;
        if (v1_2 >= v0_3) {
            if (!this.isEmpty()) {
                int v1_4 = this.b;
                i7.h.Z(v1_4, 0, p6, this.a, v1_4.length);
                int v1_5 = this.b;
                i7.h.Z(v1_5, (v1_5.length - this.a), p6, 0, v0_3);
            }
        } else {
            i7.h.a0(this.b, v1_2, p6, v0_3, 2);
        }
        int v0_5 = this.c;
        if (v0_5 < p6.length) {
            p6[v0_5] = 0;
        }
        return p6;
    }
}
