package a8;
public final class l implements java.util.Iterator, v7.a {
    public final synthetic int a;
    public java.util.Iterator b;
    public final Object c;

    public l(a8.b p2)
    {
        this.a = 1;
        this.c = new java.util.ArrayList();
        this.b = p2;
        return;
    }

    public l(a8.e p2)
    {
        this.a = 0;
        this.c = p2;
        this.b = ((Iterable) ((a8.i) p2.b).b).iterator();
        return;
    }

    public final boolean hasNext()
    {
        switch (this.a) {
            case 0:
                return this.b.hasNext();
            default:
                return this.b.hasNext();
        }
    }

    public final Object next()
    {
        switch (this.a) {
            case 0:
                return ((a6.i) ((a8.e) this.c).c).invoke(this.b.next());
            default:
                int v2_2;
                java.util.NoSuchElementException v0_3 = this.b.next();
                String v1_1 = ((java.util.ArrayList) this.c);
                int v2_1 = ((android.view.View) v0_3);
                a8.b v4_0 = 0;
                if (!(v2_1 instanceof android.view.ViewGroup)) {
                    v2_2 = 0;
                } else {
                    v2_2 = ((android.view.ViewGroup) v2_1);
                }
                if (v2_2 != 0) {
                    v4_0 = new a8.b(v2_2, 3);
                }
                if ((v4_0 == null) || (!v4_0.hasNext())) {
                    while ((!this.b.hasNext()) && (!v1_1.isEmpty())) {
                        this.b = ((java.util.Iterator) i7.i.d0(v1_1));
                        kotlin.jvm.internal.j.e(v1_1, "<this>");
                        if (v1_1.isEmpty()) {
                            throw new java.util.NoSuchElementException("List is empty.");
                        } else {
                            v1_1.remove(a.a.y(v1_1));
                        }
                    }
                } else {
                    v1_1.add(this.b);
                    this.b = v4_0;
                }
                return v0_3;
        }
    }

    public final void remove()
    {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
                break;
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }
}
