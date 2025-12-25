package b8;
public final class b implements java.util.Iterator, v7.a {
    public final synthetic int a;
    public int b;
    public int c;
    public int d;
    public Object e;
    public final synthetic Object f;

    public b(a8.e p4)
    {
        this.a = 0;
        this.f = p4;
        this.b = -1;
        int v4_2 = ((CharSequence) p4.b).length();
        if (v4_2 < 0) {
            throw new IllegalArgumentException(v1.a.j("Cannot coerce value to an empty range: maximum ", v4_2, " is less than minimum 0."));
        } else {
            if (v4_2 >= 0) {
                v4_2 = 0;
            }
            this.c = v4_2;
            this.d = v4_2;
            return;
        }
    }

    public b(i7.s p2)
    {
        this.a = 1;
        this.f = p2;
        this.c = p2.d;
        this.d = p2.c;
        return;
    }

    public void b()
    {
        int v0_1 = ((a8.e) this.f);
        int v1_4 = ((CharSequence) v0_1.b);
        y7.e v2_4 = this.d;
        int v3 = 0;
        if (v2_4 >= null) {
            if (v2_4 <= v1_4.length()) {
                int v0_5 = ((h7.f) ((b8.q) v0_1.c).invoke(v1_4, Integer.valueOf(this.d)));
                if (v0_5 != 0) {
                    int v1_3 = ((Number) v0_5.a).intValue();
                    int v0_8 = ((Number) v0_5.b).intValue();
                    this.e = w3.a.f(this.c, v1_3);
                    int v1_5 = (v1_3 + v0_8);
                    this.c = v1_5;
                    if (v0_8 == 0) {
                        v3 = 1;
                    }
                    this.d = (v1_5 + v3);
                } else {
                    this.e = new y7.e(this.c, b8.i.t0(v1_4), 1);
                    this.d = -1;
                }
            } else {
                this.e = new y7.e(this.c, b8.i.t0(v1_4), 1);
                this.d = -1;
            }
            this.b = 1;
            return;
        } else {
            this.b = 0;
            this.e = 0;
            return;
        }
    }

    public boolean c()
    {
        this.b = 3;
        int v0_3 = this.c;
        if (v0_3 != 0) {
            int v2_2 = ((i7.s) this.f);
            int v4_2 = this.d;
            this.e = v2_2.a[v4_2];
            this.b = 1;
            this.d = ((v4_2 + 1) % v2_2.b);
            this.c = (v0_3 - 1);
        } else {
            this.b = 2;
        }
        if (this.b != 1) {
            return 0;
        } else {
            return 1;
        }
    }

    public final boolean hasNext()
    {
        switch (this.a) {
            case 0:
                if (this.b == -1) {
                    this.b();
                }
                String v1_4 = 1;
                if (this.b != 1) {
                    v1_4 = 0;
                }
                return v1_4;
            default:
                String v1_0;
                IllegalArgumentException v0_1 = this.b;
                if (v0_1 == null) {
                    v1_0 = this.c();
                } else {
                    v1_0 = 1;
                    if (v0_1 != 1) {
                        if (v0_1 != 2) {
                            throw new IllegalArgumentException("hasNext called when the iterator is in the FAILED state.");
                        } else {
                            v1_0 = 0;
                        }
                    }
                }
                return v1_0;
        }
    }

    public final Object next()
    {
        switch (this.a) {
            case 0:
                if (this.b == -1) {
                    this.b();
                }
                if (this.b == 0) {
                    throw new java.util.NoSuchElementException();
                } else {
                    Object v0_2 = ((y7.e) this.e);
                    kotlin.jvm.internal.j.c(v0_2, "null cannot be cast to non-null type kotlin.ranges.IntRange");
                    this.e = 0;
                    this.b = -1;
                    return v0_2;
                }
            default:
                Object v0_8;
                Object v0_3 = this.b;
                if (v0_3 != 1) {
                    if ((v0_3 == 2) || (!this.c())) {
                        throw new java.util.NoSuchElementException();
                    } else {
                        this.b = 0;
                        v0_8 = this.e;
                    }
                } else {
                    this.b = 0;
                    v0_8 = this.e;
                }
                return v0_8;
        }
    }

    public final void remove()
    {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
                break;
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }
}
