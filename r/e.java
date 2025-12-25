package r;
public final class e extends r.j implements java.util.Map {
    public androidx.datastore.preferences.protobuf.z0 d;
    public r.b e;
    public r.d f;

    public e()
    {
        super(0);
        return;
    }

    public e(r.j p5)
    {
        int v0 = 0;
        super(0);
        int v1 = p5.c;
        super.c((super.c + v1));
        if (super.c != 0) {
            while (v0 < v1) {
                super.put(p5.g(v0), p5.j(v0));
                v0++;
            }
        } else {
            if (v1 > 0) {
                i7.h.X(0, 0, v1, p5.a, super.a);
                i7.h.Z(p5.b, 0, super.b, 0, (v1 << 1));
                super.c = v1;
                return;
            }
        }
        return;
    }

    public final java.util.Set entrySet()
    {
        androidx.datastore.preferences.protobuf.z0 v0_0 = this.d;
        if (v0_0 == null) {
            v0_0 = new androidx.datastore.preferences.protobuf.z0(this, 1);
            this.d = v0_0;
        }
        return v0_0;
    }

    public final boolean k(java.util.Collection p2)
    {
        int v2_1 = p2.iterator();
        while (v2_1.hasNext()) {
            if (!super.containsKey(v2_1.next())) {
                return 0;
            }
        }
        return 1;
    }

    public final java.util.Set keySet()
    {
        r.b v0_0 = this.e;
        if (v0_0 == null) {
            v0_0 = new r.b(this);
            this.e = v0_0;
        }
        return v0_0;
    }

    public final boolean l(java.util.Collection p3)
    {
        int v0 = this.c;
        int v3_2 = p3.iterator();
        while (v3_2.hasNext()) {
            super.remove(v3_2.next());
        }
        if (v0 == this.c) {
            return 0;
        } else {
            return 1;
        }
    }

    public final boolean m(java.util.Collection p4)
    {
        int v0 = this.c;
        int v1 = (v0 - 1);
        while (v1 >= 0) {
            if (!p4.contains(this.g(v1))) {
                this.h(v1);
            }
            v1--;
        }
        if (v0 == this.c) {
            return 0;
        } else {
            return 1;
        }
    }

    public final void putAll(java.util.Map p3)
    {
        this.c((p3.size() + this.c));
        java.util.Iterator v3_2 = p3.entrySet().iterator();
        while (v3_2.hasNext()) {
            Object v0_3 = ((java.util.Map$Entry) v3_2.next());
            this.put(v0_3.getKey(), v0_3.getValue());
        }
        return;
    }

    public final java.util.Collection values()
    {
        r.d v0_0 = this.f;
        if (v0_0 == null) {
            v0_0 = new r.d(this);
            this.f = v0_0;
        }
        return v0_0;
    }
}
