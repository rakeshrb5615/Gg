package androidx.datastore.preferences.protobuf;
public final class y0 implements java.util.Iterator {
    public int a;
    public boolean b;
    public java.util.Iterator c;
    public final synthetic androidx.datastore.preferences.protobuf.w0 d;

    public y0(androidx.datastore.preferences.protobuf.w0 p1)
    {
        this.d = p1;
        this.a = -1;
        return;
    }

    public final java.util.Iterator a()
    {
        if (this.c == null) {
            this.c = this.d.b.entrySet().iterator();
        }
        return this.c;
    }

    public final boolean hasNext()
    {
        androidx.datastore.preferences.protobuf.w0 v2 = this.d;
        if (((this.a + 1) >= v2.a.size()) && ((v2.b.isEmpty()) || (!this.a().hasNext()))) {
            return 0;
        } else {
            return 1;
        }
    }

    public final Object next()
    {
        this.b = 1;
        int v1_2 = (this.a + 1);
        this.a = v1_2;
        java.util.Map$Entry v0_7 = this.d;
        if (v1_2 >= v0_7.a.size()) {
            return ((java.util.Map$Entry) this.a().next());
        } else {
            return ((java.util.Map$Entry) v0_7.a.get(this.a));
        }
    }

    public final void remove()
    {
        if (!this.b) {
            throw new IllegalStateException("remove() was called before next()");
        } else {
            this.b = 0;
            java.util.Iterator v0_5 = this.d;
            v0_5.c();
            if (this.a >= v0_5.a.size()) {
                this.a().remove();
                return;
            } else {
                int v1_1 = this.a;
                this.a = (v1_1 - 1);
                v0_5.i(v1_1);
                return;
            }
        }
    }
}
