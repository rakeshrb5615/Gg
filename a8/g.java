package a8;
public final class g implements java.util.Iterator, l7.c, v7.a {
    public int a;
    public Object b;
    public java.util.Iterator c;
    public l7.c d;

    public final RuntimeException b()
    {
        IllegalStateException v0_0 = this.a;
        if (v0_0 == 4) {
            return new java.util.NoSuchElementException();
        } else {
            if (v0_0 == 5) {
                return new IllegalStateException("Iterator has failed.");
            } else {
                String v1_2 = new StringBuilder("Unexpected state of the iterator: ");
                v1_2.append(this.a);
                return new IllegalStateException(v1_2.toString());
            }
        }
    }

    public final void d(Object p1, n7.h p2)
    {
        this.b = p1;
        this.a = 3;
        this.d = p2;
        return;
    }

    public final l7.h getContext()
    {
        return l7.i.a;
    }

    public final boolean hasNext()
    {
        while(true) {
            RuntimeException v0_0 = this.a;
            if (v0_0 != null) {
                if (v0_0 != 1) {
                    break;
                }
                RuntimeException v0_5 = this.c;
                kotlin.jvm.internal.j.b(v0_5);
                if (!v0_5.hasNext()) {
                    this.c = 0;
                } else {
                    this.a = 2;
                    return 1;
                }
            }
            this.a = 5;
            RuntimeException v0_2 = this.d;
            kotlin.jvm.internal.j.b(v0_2);
            this.d = 0;
            v0_2.resumeWith(h7.l.a);
        }
        if ((v0_0 == 2) || (v0_0 == 3)) {
            return 1;
        } else {
            if (v0_0 != 4) {
                throw this.b();
            } else {
                return 0;
            }
        }
    }

    public final Object next()
    {
        RuntimeException v0_0 = this.a;
        if ((v0_0 == null) || (v0_0 == 1)) {
            if (!this.hasNext()) {
                throw new java.util.NoSuchElementException();
            } else {
                return this.next();
            }
        } else {
            if (v0_0 == 2) {
                this.a = 1;
                RuntimeException v0_2 = this.c;
                kotlin.jvm.internal.j.b(v0_2);
                return v0_2.next();
            } else {
                if (v0_0 != 3) {
                    throw this.b();
                } else {
                    this.a = 0;
                    RuntimeException v0_6 = this.b;
                    this.b = 0;
                    return v0_6;
                }
            }
        }
    }

    public final void remove()
    {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void resumeWith(Object p1)
    {
        c4.b.e0(p1);
        this.a = 4;
        return;
    }
}
