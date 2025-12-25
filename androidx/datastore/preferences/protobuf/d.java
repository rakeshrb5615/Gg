package androidx.datastore.preferences.protobuf;
public final class d implements java.util.Iterator {
    public int a;
    public final int b;
    public final synthetic androidx.datastore.preferences.protobuf.g c;

    public d(androidx.datastore.preferences.protobuf.g p2)
    {
        this.c = p2;
        this.a = 0;
        this.b = p2.size();
        return;
    }

    public final boolean hasNext()
    {
        if (this.a >= this.b) {
            return 0;
        } else {
            return 1;
        }
    }

    public final Object next()
    {
        java.util.NoSuchElementException v0_0 = this.a;
        if (v0_0 >= this.b) {
            throw new java.util.NoSuchElementException();
        } else {
            this.a = (v0_0 + 1);
            return Byte.valueOf(this.c.f(v0_0));
        }
    }

    public final void remove()
    {
        throw new UnsupportedOperationException();
    }
}
