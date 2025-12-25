package a8;
public final class d implements java.util.Iterator, v7.a {
    public Object a;
    public int b;
    public final synthetic a8.e c;

    public d(a8.e p1)
    {
        this.c = p1;
        this.b = -2;
        return;
    }

    public final void b()
    {
        int v0_3;
        a8.e v2 = this.c;
        if (this.b != -2) {
            int v0_6 = ((u7.l) v2.c);
            Object v1_1 = this.a;
            kotlin.jvm.internal.j.b(v1_1);
            v0_3 = v0_6.invoke(v1_1);
        } else {
            v0_3 = ((u7.a) v2.b).invoke();
        }
        int v0_4;
        this.a = v0_3;
        if (v0_3 != 0) {
            v0_4 = 1;
        } else {
            v0_4 = 0;
        }
        this.b = v0_4;
        return;
    }

    public final boolean hasNext()
    {
        if (this.b < 0) {
            this.b();
        }
        if (this.b != 1) {
            return 0;
        } else {
            return 1;
        }
    }

    public final Object next()
    {
        if (this.b < 0) {
            this.b();
        }
        if (this.b == 0) {
            throw new java.util.NoSuchElementException();
        } else {
            java.util.NoSuchElementException v0_4 = this.a;
            kotlin.jvm.internal.j.c(v0_4, "null cannot be cast to non-null type T of kotlin.sequences.GeneratorSequence");
            this.b = -1;
            return v0_4;
        }
    }

    public final void remove()
    {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
