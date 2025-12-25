package i8;
public class j {
    public static final synthetic java.util.concurrent.atomic.AtomicReferenceFieldUpdater a;
    public static final synthetic java.util.concurrent.atomic.AtomicReferenceFieldUpdater b;
    public static final synthetic java.util.concurrent.atomic.AtomicReferenceFieldUpdater c;
    private volatile synthetic Object _next$volatile;
    private volatile synthetic Object _prev$volatile;
    private volatile synthetic Object _removedRef$volatile;

    static j()
    {
        i8.j.a = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(i8.j, Object, "_next$volatile");
        i8.j.b = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(i8.j, Object, "_prev$volatile");
        i8.j.c = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(i8.j, Object, "_removedRef$volatile");
        return;
    }

    public j()
    {
        this._next$volatile = this;
        this._prev$volatile = this;
        return;
    }

    public final boolean d(i8.j p5, int p6)
    {
        do {
            i8.j v0_0 = this.e();
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater v1_1 = i8.j.b;
            if (v0_0 == null) {
                v0_0 = ((i8.j) v1_1.get(this));
                while (v0_0.h()) {
                    v0_0 = ((i8.j) v1_1.get(v0_0));
                }
            }
            if (!(v0_0 instanceof i8.h)) {
                v1_1.set(p5, v0_0);
                java.util.concurrent.atomic.AtomicReferenceFieldUpdater v1_0 = i8.j.a;
                v1_0.set(p5, this);
                while (!v1_0.compareAndSet(v0_0, this, p5)) {
                }
                p5.f(this);
                return 1;
            } else {
                if (((((i8.h) v0_0).d & p6) != 0) || (!v0_0.d(p5, p6))) {
                    return 0;
                } else {
                    return 1;
                }
            }
        } while(v1_0.get(v0_0) == this);
    }

    public final i8.j e()
    {
        do {
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater v0 = i8.j.b;
            i8.j v1_1 = ((i8.j) v0.get(this));
            i8.j v3_0 = v1_1;
            i8.j v4_3 = 0;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater v5 = i8.j.a;
            i8.j v6_2 = v5.get(v3_0);
            if (v6_2 != this) {
                if (!this.h()) {
                    if (!(v6_2 instanceof i8.o)) {
                        kotlin.jvm.internal.j.c(v6_2, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
                        v4_3 = v3_0;
                        v3_0 = ((i8.j) v6_2);
                        while(true) {
                            v3_0 = ((i8.j) v0.get(v3_0));
                        }
                    } else {
                        if (v4_3 == null) {
                        }
                    }
                } else {
                    return 0;
                }
            } else {
                if (v1_1 == v3_0) {
                    return v3_0;
                }
                while (!v0.compareAndSet(this, v1_1, v3_0)) {
                }
                return v3_0;
            }
            while (!v5.compareAndSet(v4_3, v3_0, ((i8.o) v6_2).a)) {
                if (v5.get(v4_3) != v3_0) {
                }
            }
            v3_0 = v4_3;
            do {
            } while(v5.get(v4_3) != v3_0);
        } while(v0.get(this) == v1_1);
    }

    public final void f(i8.j p4)
    {
        do {
            boolean v0_0 = i8.j.b;
            i8.j v1_1 = ((i8.j) v0_0.get(p4));
            if (i8.j.a.get(this) != p4) {
                break;
            }
            while (!v0_0.compareAndSet(p4, v1_1, this)) {
                if (v0_0.get(p4) != v1_1) {
                }
                return;
            }
        } while(!this.h());
        return;
    }

    public final i8.j g()
    {
        String v1_2;
        i8.j v0_2 = i8.j.a.get(this);
        if (!(v0_2 instanceof i8.o)) {
            v1_2 = 0;
        } else {
            v1_2 = ((i8.o) v0_2);
        }
        if (v1_2 != null) {
            String v1_4 = v1_2.a;
            if (v1_4 != null) {
                return v1_4;
            }
        }
        kotlin.jvm.internal.j.c(v0_2, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
        return ((i8.j) v0_2);
    }

    public boolean h()
    {
        return (i8.j.a.get(this) instanceof i8.o);
    }

    public String toString()
    {
        String v0_1 = new StringBuilder();
        v0_1.append(new i8.i(this, d8.f0, "classSimpleName", "getClassSimpleName(Ljava/lang/Object;)Ljava/lang/String;", 1));
        v0_1.append(64);
        v0_1.append(d8.f0.j(this));
        return v0_1.toString();
    }
}
