package kotlin.jvm.internal;
public final class a implements kotlin.jvm.internal.g, java.io.Serializable {
    public final Object a;
    public final boolean b;
    public final int c;

    public a(Object p1)
    {
        this.a = p1;
        this.b = 0;
        this.c = 2;
        return;
    }

    public final boolean equals(Object p4)
    {
        if (this != p4) {
            if ((!(p4 instanceof kotlin.jvm.internal.a)) || ((this.b != ((kotlin.jvm.internal.a) p4).b) || ((this.c != ((kotlin.jvm.internal.a) p4).c) || ((!kotlin.jvm.internal.j.a(this.a, ((kotlin.jvm.internal.a) p4).a)) || (!java.util.concurrent.atomic.AtomicReference.equals(java.util.concurrent.atomic.AtomicReference)))))) {
                return 0;
            } else {
                return 1;
            }
        } else {
            return 1;
        }
    }

    public final int getArity()
    {
        return 2;
    }

    public final int hashCode()
    {
        int v0_5;
        int v0_0 = this.a;
        if (v0_0 == 0) {
            v0_5 = 0;
        } else {
            v0_5 = v0_0.hashCode();
        }
        int v0_4;
        int v1_1 = (((java.util.concurrent.atomic.AtomicReference.hashCode() + (v0_5 * 31)) * 31) + 113762);
        if (!this.b) {
            v0_4 = 1237;
        } else {
            v0_4 = 1231;
        }
        return ((((((((v1_1 * 31) + -869290769) * 31) + v0_4) * 31) + 2) * 31) + this.c);
    }

    public final String toString()
    {
        kotlin.jvm.internal.s.a.getClass();
        return kotlin.jvm.internal.t.a(this);
    }
}
