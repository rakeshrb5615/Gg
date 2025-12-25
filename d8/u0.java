package d8;
public abstract class u0 implements java.lang.Runnable, java.lang.Comparable, d8.p0 {
    private volatile Object _heap;
    public long a;
    public int b;

    public u0(long p1)
    {
        this.a = p1;
        this.b = -1;
        return;
    }

    public final void a()
    {
        int v0_0 = this._heap;
        Throwable v1_0 = d8.f0.b;
        if (v0_0 != v1_0) {
            int v0_2;
            i8.u v3_1 = 0;
            if (!(v0_0 instanceof d8.v0)) {
                v0_2 = 0;
            } else {
                v0_2 = ((d8.v0) v0_0);
            }
            if (v0_2 != 0) {
                int v2_2 = this._heap;
                if ((v2_2 instanceof i8.u)) {
                    v3_1 = ((i8.u) v2_2);
                }
                if (v3_1 != null) {
                    v0_2.b(this.b);
                } else {
                }
            }
            this._heap = v1_0;
            return;
        } else {
            return;
        }
    }

    public final int c(long p9, d8.v0 p11, d8.w0 p12)
    {
        try {
            if (this._heap != d8.f0.b) {
                int v0_2;
                int v0_1 = p11.a;
                if (v0_1 == 0) {
                    v0_2 = 0;
                } else {
                    v0_2 = v0_1[0];
                }
                long v12_2;
                if (d8.w0.o.get(p12) == 0) {
                    v12_2 = 0;
                } else {
                    v12_2 = 1;
                }
                if (v12_2 == 0) {
                    if (v0_2 != 0) {
                        long v4_0 = v0_2.a;
                        if ((v4_0 - p9) < 0) {
                            p9 = v4_0;
                        } else {
                        }
                        if ((p9 - p11.c) > 0) {
                            p11.c = p9;
                        }
                    } else {
                        p11.c = p9;
                    }
                    long v4_3 = p11.c;
                    if ((this.a - v4_3) < 0) {
                        this.a = v4_3;
                    }
                    p11.a(this);
                    return 0;
                } else {
                    return 1;
                }
            } else {
                return 2;
            }
        } catch (long v9_5) {
            throw v9_5;
        }
    }

    public final int compareTo(Object p5)
    {
        int v5_4 = (this.a - ((d8.u0) p5).a) cmp 0;
        if (v5_4 <= 0) {
            if (v5_4 >= 0) {
                return 0;
            } else {
                return -1;
            }
        } else {
            return 1;
        }
    }

    public final void d(d8.v0 p3)
    {
        if (this._heap == d8.f0.b) {
            throw new IllegalArgumentException("Failed requirement.");
        } else {
            this._heap = p3;
            return;
        }
    }

    public String toString()
    {
        String v0_1 = new StringBuilder("Delayed[nanos=");
        v0_1.append(this.a);
        v0_1.append(93);
        return v0_1.toString();
    }
}
