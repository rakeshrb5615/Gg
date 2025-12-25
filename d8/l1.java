package d8;
public final class l1 implements d8.b1 {
    public static final synthetic java.util.concurrent.atomic.AtomicIntegerFieldUpdater b;
    public static final synthetic java.util.concurrent.atomic.AtomicReferenceFieldUpdater c;
    public static final synthetic java.util.concurrent.atomic.AtomicReferenceFieldUpdater d;
    private volatile synthetic Object _exceptionsHolder$volatile;
    private volatile synthetic int _isCompleting$volatile;
    private volatile synthetic Object _rootCause$volatile;
    public final d8.s1 a;

    static l1()
    {
        d8.l1.b = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(d8.l1, "_isCompleting$volatile");
        d8.l1.c = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(d8.l1, Object, "_rootCause$volatile");
        d8.l1.d = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(d8.l1, Object, "_exceptionsHolder$volatile");
        return;
    }

    public l1(d8.s1 p1, Throwable p2)
    {
        this.a = p1;
        this._isCompleting$volatile = 0;
        this._rootCause$volatile = p2;
        return;
    }

    public final void a(Throwable p5)
    {
        String v0_0 = this.b();
        if (v0_0 != null) {
            if (p5 != v0_0) {
                String v0_7 = d8.l1.d;
                java.util.ArrayList v1_1 = v0_7.get(this);
                if (v1_1 != null) {
                    if (!(v1_1 instanceof Throwable)) {
                        if (!(v1_1 instanceof java.util.ArrayList)) {
                            String v0_3 = new StringBuilder("State is ");
                            v0_3.append(v1_1);
                            throw new IllegalStateException(v0_3.toString().toString());
                        } else {
                            ((java.util.ArrayList) v1_1).add(p5);
                            return;
                        }
                    } else {
                        if (p5 != v1_1) {
                            String v2_2 = new java.util.ArrayList(4);
                            v2_2.add(v1_1);
                            v2_2.add(p5);
                            v0_7.set(this, v2_2);
                            return;
                        }
                    }
                } else {
                    v0_7.set(this, p5);
                    return;
                }
            }
            return;
        } else {
            d8.l1.c.set(this, p5);
            return;
        }
    }

    public final Throwable b()
    {
        return ((Throwable) d8.l1.c.get(this));
    }

    public final d8.s1 c()
    {
        return this.a;
    }

    public final boolean d()
    {
        if (this.b() == null) {
            return 0;
        } else {
            return 1;
        }
    }

    public final java.util.ArrayList e(Throwable p5)
    {
        java.util.ArrayList v1_1;
        String v0_0 = d8.l1.d;
        java.util.ArrayList v1_0 = v0_0.get(this);
        if (v1_0 != null) {
            if (!(v1_0 instanceof Throwable)) {
                if (!(v1_0 instanceof java.util.ArrayList)) {
                    String v0_2 = new StringBuilder("State is ");
                    v0_2.append(v1_0);
                    throw new IllegalStateException(v0_2.toString().toString());
                } else {
                    v1_1 = ((java.util.ArrayList) v1_0);
                }
            } else {
                int v3_1 = new java.util.ArrayList(4);
                v3_1.add(v1_0);
                v1_1 = v3_1;
            }
        } else {
            v1_1 = new java.util.ArrayList(4);
        }
        boolean v2_1 = this.b();
        if (v2_1) {
            v1_1.add(0, v2_1);
        }
        if ((p5 != null) && (!p5.equals(v2_1))) {
            v1_1.add(p5);
        }
        v0_0.set(this, d8.f0.h);
        return v1_1;
    }

    public final boolean isActive()
    {
        if (this.b() != null) {
            return 0;
        } else {
            return 1;
        }
    }

    public final String toString()
    {
        int v1_2;
        String v0_1 = new StringBuilder("Finishing[cancelling=");
        v0_1.append(this.d());
        v0_1.append(", completing=");
        if (d8.l1.b.get(this) == 0) {
            v1_2 = 0;
        } else {
            v1_2 = 1;
        }
        v0_1.append(v1_2);
        v0_1.append(", rootCause=");
        v0_1.append(this.b());
        v0_1.append(", exceptions=");
        v0_1.append(d8.l1.d.get(this));
        v0_1.append(", list=");
        v0_1.append(this.a);
        v0_1.append(93);
        return v0_1.toString();
    }
}
