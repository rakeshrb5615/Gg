package r;
public final class c implements java.util.Iterator, java.util.Map$Entry {
    public int a;
    public int b;
    public boolean c;
    public final synthetic r.e d;

    public c(r.e p1)
    {
        this.d = p1;
        this.a = (p1.c - 1);
        this.b = -1;
        return;
    }

    public final boolean equals(Object p4)
    {
        if (!this.c) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        } else {
            if ((p4 instanceof java.util.Map$Entry)) {
                r.e v2 = this.d;
                if ((kotlin.jvm.internal.j.a(((java.util.Map$Entry) p4).getKey(), v2.g(this.b))) && (kotlin.jvm.internal.j.a(((java.util.Map$Entry) p4).getValue(), v2.j(this.b)))) {
                    return 1;
                }
            }
            return 0;
        }
    }

    public final Object getKey()
    {
        if (!this.c) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        } else {
            return this.d.g(this.b);
        }
    }

    public final Object getValue()
    {
        if (!this.c) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        } else {
            return this.d.j(this.b);
        }
    }

    public final boolean hasNext()
    {
        if (this.b >= this.a) {
            return 0;
        } else {
            return 1;
        }
    }

    public final int hashCode()
    {
        if (!this.c) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        } else {
            int v0_1;
            String v1_2 = this.d;
            int v0_6 = v1_2.g(this.b);
            String v1_0 = v1_2.j(this.b);
            int v2_1 = 0;
            if (v0_6 != 0) {
                v0_1 = v0_6.hashCode();
            } else {
                v0_1 = 0;
            }
            if (v1_0 != null) {
                v2_1 = v1_0.hashCode();
            }
            return (v0_1 ^ v2_1);
        }
    }

    public final Object next()
    {
        if (!this.hasNext()) {
            throw new java.util.NoSuchElementException();
        } else {
            this.b = (this.b + 1);
            this.c = 1;
            return this;
        }
    }

    public final void remove()
    {
        if (!this.c) {
            throw new IllegalStateException();
        } else {
            this.d.h(this.b);
            this.b = (this.b - 1);
            this.a = (this.a - 1);
            this.c = 0;
            return;
        }
    }

    public final Object setValue(Object p3)
    {
        if (!this.c) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        } else {
            return this.d.i(this.b, p3);
        }
    }

    public final String toString()
    {
        String v0_1 = new StringBuilder();
        v0_1.append(this.getKey());
        v0_1.append("=");
        v0_1.append(this.getValue());
        return v0_1.toString();
    }
}
