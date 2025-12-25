package m8;
public final class c extends m8.g implements m8.a {
    public static final synthetic java.util.concurrent.atomic.AtomicReferenceFieldUpdater g;
    private volatile synthetic Object owner$volatile;

    static c()
    {
        m8.c.g = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(m8.c, Object, "owner$volatile");
        return;
    }

    public c(boolean p1)
    {
        d4.l v1_1;
        super(p1);
        if (p1 == null) {
            v1_1 = m8.d.a;
        } else {
            v1_1 = 0;
        }
        super.owner$volatile = v1_1;
        return;
    }

    public final boolean c()
    {
        if (Math.max(m8.g.f.get(this), 0) != 0) {
            return 0;
        } else {
            return 1;
        }
    }

    public final Object d(n7.c p3)
    {
        h7.l v1 = h7.l.a;
        if (!this.e()) {
            h7.l v3_3 = d8.f0.k(q4.b.C(p3));
            try {
                this.a(new m8.b(this, v3_3));
                h7.l v3_1 = v3_3.q();
                Throwable v0_1 = m7.a.a;
            } catch (Throwable v0_2) {
                v3_1.y();
                throw v0_2;
            }
            if (v3_1 != v0_1) {
                v3_1 = v1;
            }
            if (v3_1 == v0_1) {
                return v3_1;
            }
        }
        return v1;
    }

    public final boolean e()
    {
        do {
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater v0_0 = m8.g.f;
            int v1_2 = v0_0.get(this);
            if (v1_2 <= 1) {
                if (v1_2 > 0) {
                    if (!v0_0.compareAndSet(this, v1_2, (v1_2 - 1))) {
                        break;
                    }
                    m8.c.g.set(this, 0);
                    return 1;
                } else {
                    return 0;
                }
            }
            do {
                int v1_1 = v0_0.get(this);
            } while((v1_1 > 1) && (!v0_0.compareAndSet(this, v1_1, 1)));
        } while((v1_1 <= 1) && (!v0_0.compareAndSet(this, v1_1, 1)));
    }

    public final void f(Object p5)
    {
        while (this.c()) {
            IllegalStateException v0_6 = m8.c.g;
            String v1_1 = v0_6.get(this);
            String v2_0 = m8.d.a;
            if (v1_1 != v2_0) {
                if ((v1_1 != p5) && (p5 != null)) {
                    IllegalStateException v0_2 = new StringBuilder("This mutex is locked by ");
                    v0_2.append(v1_1);
                    v0_2.append(", but ");
                    v0_2.append(p5);
                    v0_2.append(" is expected");
                    throw new IllegalStateException(v0_2.toString().toString());
                }
                while (!v0_6.compareAndSet(this, v1_1, v2_0)) {
                    if (v0_6.get(this) != v1_1) {
                    }
                }
                this.b();
                return;
            }
        }
        throw new IllegalStateException("This mutex is not locked");
    }

    public final String toString()
    {
        String v0_1 = new StringBuilder("Mutex@");
        v0_1.append(d8.f0.j(this));
        v0_1.append("[isLocked=");
        v0_1.append(this.c());
        v0_1.append(",owner=");
        v0_1.append(m8.c.g.get(this));
        v0_1.append(93);
        return v0_1.toString();
    }
}
