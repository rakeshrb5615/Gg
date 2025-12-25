package d8;
public abstract class i1 extends i8.j implements d8.p0, d8.b1 {
    public d8.r1 d;

    public final void a()
    {
        java.util.concurrent.atomic.AtomicReferenceFieldUpdater v0_0 = this.i();
        do {
            i8.j v1_1 = d8.r1.a;
            i8.j v2_4 = v1_1.get(v0_0);
            if (!(v2_4 instanceof d8.i1)) {
                if ((!(v2_4 instanceof d8.b1)) || (((d8.b1) v2_4).c() == null)) {
                    return;
                }
                do {
                    java.util.concurrent.atomic.AtomicReferenceFieldUpdater v0_2 = i8.j.a;
                    i8.j v1_0 = v0_2.get(this);
                    if (!(v1_0 instanceof i8.o)) {
                        if (v1_0 != this) {
                            kotlin.jvm.internal.j.c(v1_0, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
                            i8.j v2_3 = ((i8.j) v1_0);
                            Object v3_0 = i8.j.c;
                            i8.o v4_1 = ((i8.o) v3_0.get(v2_3));
                            if (v4_1 == null) {
                                v4_1 = new i8.o(v2_3);
                                v3_0.set(v2_3, v4_1);
                            }
                            while (!v0_2.compareAndSet(this, v1_0, v4_1)) {
                            }
                            v2_3.e();
                            return;
                        } else {
                            return;
                        }
                    }
                } while(v0_2.get(this) == v1_0);
            } else {
                if (v2_4 != this) {
                    return;
                }
            }
            return;
        } while(!v1_1.compareAndSet(v0_0, v2_4, d8.f0.j));
        if (v1_1.get(v0_0) != v2_4) {
        } else {
            while (!v1_1.compareAndSet(v0_0, v2_4, d8.f0.j)) {
            }
        }
        return;
    }

    public final d8.s1 c()
    {
        return 0;
    }

    public d8.e1 getParent()
    {
        return this.i();
    }

    public final d8.r1 i()
    {
        int v0_0 = this.d;
        if (v0_0 == 0) {
            kotlin.jvm.internal.j.i("job");
            throw 0;
        } else {
            return v0_0;
        }
    }

    public final boolean isActive()
    {
        return 1;
    }

    public abstract boolean j();

    public abstract void k();

    public final String toString()
    {
        String v0_1 = new StringBuilder();
        v0_1.append(this.getClass().getSimpleName());
        v0_1.append(64);
        v0_1.append(d8.f0.j(this));
        v0_1.append("[job@");
        v0_1.append(d8.f0.j(this.i()));
        v0_1.append(93);
        return v0_1.toString();
    }
}
