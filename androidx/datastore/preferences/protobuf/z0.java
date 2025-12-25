package androidx.datastore.preferences.protobuf;
public class z0 extends java.util.AbstractSet {
    public final synthetic int a;
    public final synthetic java.util.Map b;

    public synthetic z0(java.util.Map p1, int p2)
    {
        this.a = p2;
        this.b = p1;
        return;
    }

    public boolean add(Object p3)
    {
        switch (this.a) {
            case 0:
                int v3_2;
                if (this.contains(((java.util.Map$Entry) p3))) {
                    v3_2 = 0;
                } else {
                    ((androidx.datastore.preferences.protobuf.w0) this.b).h(((Comparable) ((java.util.Map$Entry) p3).getKey()), ((java.util.Map$Entry) p3).getValue());
                    v3_2 = 1;
                }
                return v3_2;
            default:
                return super.add(p3);
        }
    }

    public void clear()
    {
        switch (this.a) {
            case 0:
                ((androidx.datastore.preferences.protobuf.w0) this.b).clear();
                return;
            default:
                super.clear();
                return;
        }
    }

    public boolean contains(Object p3)
    {
        switch (this.a) {
            case 0:
                int v3_3;
                Object v0_3 = ((androidx.datastore.preferences.protobuf.w0) this.b).get(((java.util.Map$Entry) p3).getKey());
                int v3_1 = ((java.util.Map$Entry) p3).getValue();
                if ((v0_3 != v3_1) && ((v0_3 == null) || (!v0_3.equals(v3_1)))) {
                    v3_3 = 0;
                } else {
                    v3_3 = 1;
                }
                return v3_3;
            default:
                return super.contains(p3);
        }
    }

    public java.util.Iterator iterator()
    {
        switch (this.a) {
            case 0:
                return new androidx.datastore.preferences.protobuf.y0(((androidx.datastore.preferences.protobuf.w0) this.b));
            default:
                return new r.c(((r.e) this.b));
        }
    }

    public boolean remove(Object p2)
    {
        switch (this.a) {
            case 0:
                int v2_2;
                if (!this.contains(((java.util.Map$Entry) p2))) {
                    v2_2 = 0;
                } else {
                    ((androidx.datastore.preferences.protobuf.w0) this.b).remove(((java.util.Map$Entry) p2).getKey());
                    v2_2 = 1;
                }
                return v2_2;
            default:
                return super.remove(p2);
        }
    }

    public final int size()
    {
        switch (this.a) {
            case 0:
                return ((androidx.datastore.preferences.protobuf.w0) this.b).size();
            default:
                return ((r.e) this.b).c;
        }
    }
}
