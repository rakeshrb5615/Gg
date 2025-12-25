package w;
public final class c {
    public java.util.HashSet a;
    public int b;
    public boolean c;
    public final w.d d;
    public final int e;
    public w.c f;
    public int g;
    public int h;
    public u.f i;

    public c(w.d p2, int p3)
    {
        this.a = 0;
        this.g = 0;
        this.h = -2147483648;
        this.d = p2;
        this.e = p3;
        return;
    }

    public final void a(w.c p3, int p4)
    {
        this.b(p3, p4, -2147483648, 0);
        return;
    }

    public final boolean b(w.c p2, int p3, int p4, boolean p5)
    {
        if (p2 != null) {
            if ((p5 != null) || (this.i(p2))) {
                this.f = p2;
                if (p2.a == null) {
                    p2.a = new java.util.HashSet();
                }
                java.util.HashSet v2_2 = this.f.a;
                if (v2_2 != null) {
                    v2_2.add(this);
                }
                this.g = p3;
                this.h = p4;
                return 1;
            } else {
                return 0;
            }
        } else {
            this.j();
            return 1;
        }
    }

    public final void c(int p3, java.util.ArrayList p4, x.n p5)
    {
        java.util.Iterator v0_0 = this.a;
        if (v0_0 != null) {
            java.util.Iterator v0_1 = v0_0.iterator();
            while (v0_1.hasNext()) {
                x.h.b(((w.c) v0_1.next()).d, p3, p4, p5);
            }
        }
        return;
    }

    public final int d()
    {
        if (this.c) {
            return this.b;
        } else {
            return 0;
        }
    }

    public final int e()
    {
        if (this.d.g0 != 8) {
            int v0_4 = this.h;
            if (v0_4 != -2147483648) {
                int v2_2 = this.f;
                if ((v2_2 != 0) && (v2_2.d.g0 == 8)) {
                    return v0_4;
                }
            }
            return this.g;
        } else {
            return 0;
        }
    }

    public final w.c f()
    {
        w.c v0_0 = this.e;
        w.d v2 = this.d;
        switch (u.e.c(v0_0)) {
            case 0:
            case 5:
            case 6:
            case 7:
            case 8:
                return 0;
            case 1:
                return v2.K;
            case 2:
                return v2.L;
            case 3:
                return v2.I;
            case 4:
                return v2.J;
            default:
                throw new AssertionError(g2.g.m(v0_0));
        }
    }

    public final boolean g()
    {
        int v0_0 = this.a;
        if (v0_0 != 0) {
            int v0_2 = v0_0.iterator();
            while (v0_2.hasNext()) {
                if (((w.c) v0_2.next()).f().h()) {
                    return 1;
                }
            }
            return 0;
        } else {
            return 0;
        }
    }

    public final boolean h()
    {
        if (this.f == null) {
            return 0;
        } else {
            return 1;
        }
    }

    public final boolean i(w.c p11)
    {
        if (p11) {
            boolean v1_0 = p11.d;
            boolean v11_1 = p11.e;
            int v3 = this.e;
            if (v11_1 != v3) {
                switch (u.e.c(v3)) {
                    case 0:
                    case 7:
                    case 8:
                        break;
                    case 1:
                    case 3:
                        if ((v11_1 != 2) && (v11_1 != 4)) {
                            String v2_3 = 0;
                        } else {
                            v2_3 = 1;
                        }
                        if (!(v1_0 instanceof w.h)) {
                            return v2_3;
                        } else {
                            if ((v2_3 == null) && (v11_1 != 8)) {
                            }
                        }
                    case 2:
                    case 4:
                        if ((v11_1 != 3) && (v11_1 != 5)) {
                            String v2_2 = 0;
                        } else {
                            v2_2 = 1;
                        }
                        if (!(v1_0 instanceof w.h)) {
                            return v2_2;
                        } else {
                            if ((v2_2 == null) && (v11_1 != 9)) {
                            }
                        }
                    case 5:
                        if ((v11_1 == 2) || (v11_1 == 4)) {
                        }
                        break;
                    case 6:
                        if ((v11_1 != 6) && ((v11_1 != 8) && (v11_1 != 9))) {
                        }
                        break;
                    case 0:
                    case 7:
                    case 8:
                        break;
                    case 0:
                    case 7:
                    case 8:
                        break;
                    default:
                        throw new AssertionError(g2.g.m(v3));
                }
                return 0;
            } else {
                if ((v3 == 6) && ((!v1_0.E) || (!this.d.E))) {
                    return 0;
                }
            }
            return 1;
        }
        return 0;
    }

    public final void j()
    {
        w.c v0_0 = this.f;
        if (v0_0 != null) {
            w.c v0_3 = v0_0.a;
            if (v0_3 != null) {
                v0_3.remove(this);
                if (this.f.a.size() == 0) {
                    this.f.a = 0;
                }
            }
        }
        this.a = 0;
        this.f = 0;
        this.g = 0;
        this.h = -2147483648;
        this.c = 0;
        this.b = 0;
        return;
    }

    public final void k()
    {
        u.f v0_0 = this.i;
        if (v0_0 != null) {
            v0_0.c();
            return;
        } else {
            this.i = new u.f(1);
            return;
        }
    }

    public final void l(int p1)
    {
        this.b = p1;
        this.c = 1;
        return;
    }

    public final String toString()
    {
        String v0_1 = new StringBuilder();
        v0_1.append(this.d.h0);
        v0_1.append(":");
        v0_1.append(g2.g.m(this.e));
        return v0_1.toString();
    }
}
