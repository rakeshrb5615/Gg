package f1;
public final class g {
    public static final f1.e m;
    public static final f1.e n;
    public static final f1.e o;
    public static final f1.e p;
    public static final f1.e q;
    public static final f1.e r;
    public float a;
    public float b;
    public final v3.a0 c;
    public final q4.b d;
    public boolean e;
    public long f;
    public final float g;
    public final java.util.ArrayList h;
    public final java.util.ArrayList i;
    public f1.h j;
    public float k;
    public boolean l;

    static g()
    {
        f1.g.m = new f1.e(1);
        f1.g.n = new f1.e(2);
        f1.g.o = new f1.e(3);
        f1.g.p = new f1.e(4);
        f1.g.q = new f1.e(5);
        f1.g.r = new f1.e(0);
        return;
    }

    public g(v3.a0 p5, q4.b p6)
    {
        this.a = 0;
        this.b = 2139095039;
        this.e = 0;
        this.f = 0;
        this.h = new java.util.ArrayList();
        this.i = new java.util.ArrayList();
        this.c = p5;
        this.d = p6;
        if ((p6 != f1.g.o) && ((p6 != f1.g.p) && (p6 != f1.g.q))) {
            if (p6 != f1.g.r) {
                if ((p6 != f1.g.m) && (p6 != f1.g.n)) {
                    this.g = 1065353216;
                } else {
                    this.g = 990057071;
                }
            } else {
                this.g = 998244352;
            }
        } else {
            this.g = 1036831949;
        }
        this.j = 0;
        this.k = 2139095039;
        this.l = 0;
        return;
    }

    public static f1.d b()
    {
        f1.d v0_0 = f1.d.i;
        if (v0_0.get() == null) {
            v0_0.set(new f1.d(new k2.c(12)));
        }
        return ((f1.d) v0_0.get());
    }

    public final void a(float p7)
    {
        if (!this.e) {
            if (this.j == null) {
                this.j = new f1.h(p7);
            }
            String v0_17 = this.j;
            v0_17.i = ((double) p7);
            if (((double) ((float) ((double) p7))) > ((double) 2139095039)) {
                throw new UnsupportedOperationException("Final position of the spring cannot be greater than the max value.");
            } else {
                if (((double) ((float) ((double) p7))) < ((double) -8388609)) {
                    throw new UnsupportedOperationException("Final position of the spring cannot be less than the min value.");
                } else {
                    v3.a0 v1_5 = Math.abs(((double) (this.g * 1061158912)));
                    v0_17.d = v1_5;
                    v0_17.e = (v1_5 * 4633992910331707392);
                    String v0_6 = f1.g.b().e;
                    v0_6.getClass();
                    if (Thread.currentThread() != ((android.os.Looper) v0_6.c).getThread()) {
                        throw new android.util.AndroidRuntimeException("Animations may only be started on the same thread as the animation handler");
                    } else {
                        String v0_12 = this.e;
                        if ((v0_12 != null) || (v0_12 != null)) {
                            return;
                        } else {
                            this.e = 1;
                            String v0_15 = this.d.y(this.c);
                            this.b = v0_15;
                            if ((v0_15 > 2139095039) || (v0_15 < -8388609)) {
                                throw new IllegalArgumentException("Starting value need to be in between min value and max value");
                            } else {
                                f1.g.b().a(this);
                                return;
                            }
                        }
                    }
                }
            }
        } else {
            this.k = p7;
            return;
        }
    }

    public final void c(float p3)
    {
        this.d.R(this.c, p3);
        int v3_5 = 0;
        while(true) {
            java.util.ArrayList v0_1 = this.i;
            if (v3_5 >= v0_1.size()) {
                break;
            }
            if (v0_1.get(v3_5) != null) {
                v0_1.get(v3_5).getClass();
                throw new ClassCastException();
            } else {
                v3_5++;
            }
        }
        int v3_1 = (v0_1.size() - 1);
        while (v3_1 >= 0) {
            if (v0_1.get(v3_1) == null) {
                v0_1.remove(v3_1);
            }
            v3_1--;
        }
        return;
    }

    public final void d()
    {
        if (this.j.b <= 0) {
            throw new UnsupportedOperationException("Spring animations can only come to an end when there is damping");
        } else {
            int v0_3 = f1.g.b().e;
            v0_3.getClass();
            if (Thread.currentThread() != ((android.os.Looper) v0_3.c).getThread()) {
                throw new android.util.AndroidRuntimeException("Animations may only be started on the same thread as the animation handler");
            } else {
                if (this.e) {
                    this.l = 1;
                }
                return;
            }
        }
    }
}
