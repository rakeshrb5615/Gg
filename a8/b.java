package a8;
public class b implements java.util.Iterator, v7.a {
    public final synthetic int a;
    public int b;
    public final Object c;

    public b(a8.c p2)
    {
        this.a = 0;
        this.c = p2.a.iterator();
        this.b = p2.b;
        return;
    }

    public synthetic b(Object p1, int p2)
    {
        this.a = p2;
        this.c = p1;
        return;
    }

    public b(Object[] p2)
    {
        this.a = 2;
        kotlin.jvm.internal.j.e(p2, "array");
        this.c = p2;
        return;
    }

    public final boolean hasNext()
    {
        switch (this.a) {
            case 0:
                boolean v0_5 = ((java.util.Iterator) this.c);
                while ((this.b > 0) && (v0_5.hasNext())) {
                    v0_5.next();
                    this.b = (this.b - 1);
                }
                return v0_5.hasNext();
            case 1:
                boolean v0_2;
                if (this.b >= ((i7.d) this.c).b()) {
                    v0_2 = 0;
                } else {
                    v0_2 = 1;
                }
                return v0_2;
            case 2:
                boolean v0_9;
                if (this.b >= ((Object[]) this.c).length) {
                    v0_9 = 0;
                } else {
                    v0_9 = 1;
                }
                return v0_9;
            default:
                boolean v0_8;
                if (this.b >= ((android.view.ViewGroup) this.c).getChildCount()) {
                    v0_8 = 0;
                } else {
                    v0_8 = 1;
                }
                return v0_8;
        }
    }

    public final Object next()
    {
        switch (this.a) {
            case 0:
                Object v0_11 = ((java.util.Iterator) this.c);
                while ((this.b > 0) && (v0_11.hasNext())) {
                    v0_11.next();
                    this.b = (this.b - 1);
                }
                return v0_11.next();
            case 1:
                if (!this.hasNext()) {
                    throw new java.util.NoSuchElementException();
                } else {
                    Object v0_7 = ((i7.d) this.c);
                    int v1_4 = this.b;
                    this.b = (v1_4 + 1);
                    return v0_7.get(v1_4);
                }
            case 2:
                try {
                    Object v0_8 = ((Object[]) this.c);
                    int v1_7 = this.b;
                    this.b = (v1_7 + 1);
                    return v0_8[v1_7];
                } catch (Object v0_19) {
                    this.b = (this.b - 1);
                    throw new java.util.NoSuchElementException(v0_19.getMessage());
                }
            default:
                Object v0_14 = ((android.view.ViewGroup) this.c);
                int v1_10 = this.b;
                this.b = (v1_10 + 1);
                Object v0_15 = v0_14.getChildAt(v1_10);
                if (v0_15 == null) {
                    throw new IndexOutOfBoundsException();
                } else {
                    return v0_15;
                }
        }
    }

    public final void remove()
    {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
                break;
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
                break;
            case 2:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
                break;
            default:
                UnsupportedOperationException v0_4 = ((android.view.ViewGroup) this.c);
                String v1_2 = (this.b - 1);
                this.b = v1_2;
                v0_4.removeViewAt(v1_2);
                return;
        }
    }
}
