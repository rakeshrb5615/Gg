package j7;
public final class g extends java.util.AbstractSet implements java.util.Set, v7.a {
    public final synthetic int a;
    public final j7.f b;

    public synthetic g(j7.f p1, int p2)
    {
        this.a = p2;
        this.b = p1;
        return;
    }

    public final boolean add(Object p2)
    {
        switch (this.a) {
            case 0:
                kotlin.jvm.internal.j.e(((java.util.Map$Entry) p2), "element");
                throw new UnsupportedOperationException();
                break;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public final boolean addAll(java.util.Collection p2)
    {
        switch (this.a) {
            case 0:
                kotlin.jvm.internal.j.e(p2, "elements");
                throw new UnsupportedOperationException();
                break;
            default:
                kotlin.jvm.internal.j.e(p2, "elements");
                throw new UnsupportedOperationException();
        }
    }

    public final void clear()
    {
        switch (this.a) {
            case 0:
                this.b.clear();
                return;
            default:
                this.b.clear();
                return;
        }
    }

    public final boolean contains(Object p2)
    {
        switch (this.a) {
            case 0:
                boolean v2_3;
                if ((p2 instanceof java.util.Map$Entry)) {
                    v2_3 = this.b.f(((java.util.Map$Entry) p2));
                } else {
                    v2_3 = 0;
                }
                return v2_3;
            default:
                return this.b.containsKey(p2);
        }
    }

    public boolean containsAll(java.util.Collection p2)
    {
        switch (this.a) {
            case 0:
                kotlin.jvm.internal.j.e(p2, "elements");
                return this.b.e(p2);
            default:
                return super.containsAll(p2);
        }
    }

    public final boolean isEmpty()
    {
        switch (this.a) {
            case 0:
                return this.b.isEmpty();
            default:
                return this.b.isEmpty();
        }
    }

    public final java.util.Iterator iterator()
    {
        switch (this.a) {
            case 0:
                j7.f v0_1 = this.b;
                v0_1.getClass();
                return new j7.d(v0_1, 0);
            default:
                j7.f v0_2 = this.b;
                v0_2.getClass();
                return new j7.d(v0_2, 1);
        }
    }

    public final boolean remove(Object p5)
    {
        switch (this.a) {
            case 0:
                int v1 = 0;
                if ((p5 instanceof java.util.Map$Entry)) {
                    j7.f v0_3 = this.b;
                    v0_3.getClass();
                    v0_3.c();
                    int v2_1 = v0_3.h(((java.util.Map$Entry) p5).getKey());
                    if (v2_1 >= 0) {
                        Object v3_0 = v0_3.b;
                        kotlin.jvm.internal.j.b(v3_0);
                        if (kotlin.jvm.internal.j.a(v3_0[v2_1], ((java.util.Map$Entry) p5).getValue())) {
                            v0_3.l(v2_1);
                            v1 = 1;
                        }
                    }
                }
                return v1;
            default:
                boolean v5_4;
                j7.f v0_2 = this.b;
                v0_2.c();
                boolean v5_3 = v0_2.h(p5);
                if (v5_3) {
                    v0_2.l(v5_3);
                    v5_4 = 1;
                } else {
                    v5_4 = 0;
                }
                return v5_4;
        }
    }

    public final boolean removeAll(java.util.Collection p2)
    {
        switch (this.a) {
            case 0:
                kotlin.jvm.internal.j.e(p2, "elements");
                this.b.c();
                return super.removeAll(p2);
            default:
                kotlin.jvm.internal.j.e(p2, "elements");
                this.b.c();
                return super.removeAll(p2);
        }
    }

    public final boolean retainAll(java.util.Collection p2)
    {
        switch (this.a) {
            case 0:
                kotlin.jvm.internal.j.e(p2, "elements");
                this.b.c();
                return super.retainAll(p2);
            default:
                kotlin.jvm.internal.j.e(p2, "elements");
                this.b.c();
                return super.retainAll(p2);
        }
    }

    public final int size()
    {
        int v0_2;
        switch (this.a) {
            case 0:
                v0_2 = this.b.o;
                break;
            default:
                v0_2 = this.b.o;
        }
        return v0_2;
    }
}
