package androidx.datastore.preferences.protobuf;
public final class n0 implements androidx.datastore.preferences.protobuf.u0 {
    public final androidx.datastore.preferences.protobuf.a a;
    public final androidx.datastore.preferences.protobuf.c1 b;
    public final androidx.datastore.preferences.protobuf.o c;

    public n0(androidx.datastore.preferences.protobuf.c1 p1, androidx.datastore.preferences.protobuf.o p2, androidx.datastore.preferences.protobuf.a p3)
    {
        this.b = p1;
        p2.getClass();
        this.c = p2;
        this.a = p3;
        return;
    }

    public final void a(Object p1, a2.r p2, androidx.datastore.preferences.protobuf.n p3)
    {
        this.b.getClass();
        androidx.datastore.preferences.protobuf.c1.a(p1);
        this.c.getClass();
        p1.getClass();
        throw new ClassCastException();
    }

    public final void b(Object p2, Object p3)
    {
        androidx.datastore.preferences.protobuf.v0.k(this.b, p2, p3);
        return;
    }

    public final void c(Object p1, androidx.datastore.preferences.protobuf.e0 p2)
    {
        this.c.getClass();
        v1.a.t(p1);
        throw 0;
    }

    public final int d(androidx.datastore.preferences.protobuf.v p2)
    {
        this.b.getClass();
        return p2.unknownFields.hashCode();
    }

    public final void e(Object p3)
    {
        this.b.getClass();
        androidx.datastore.preferences.protobuf.o v0_3 = ((androidx.datastore.preferences.protobuf.v) p3).unknownFields;
        if (v0_3.e) {
            v0_3.e = 0;
        }
        this.c.getClass();
        v1.a.t(p3);
        throw 0;
    }

    public final boolean f(Object p2)
    {
        this.c.getClass();
        v1.a.t(p2);
        throw 0;
    }

    public final boolean g(androidx.datastore.preferences.protobuf.v p2, androidx.datastore.preferences.protobuf.v p3)
    {
        this.b.getClass();
        if (p2.unknownFields.equals(p3.unknownFields)) {
            return 1;
        } else {
            return 0;
        }
    }

    public final int h(androidx.datastore.preferences.protobuf.v p8)
    {
        this.b.getClass();
        androidx.datastore.preferences.protobuf.b1 v8_1 = p8.unknownFields;
        int v0_1 = v8_1.d;
        if (v0_1 == -1) {
            int v0_2 = 0;
            int v1_0 = 0;
            while (v0_2 < v8_1.a) {
                v1_0 += (androidx.datastore.preferences.protobuf.l.p0(3, ((androidx.datastore.preferences.protobuf.g) v8_1.c[v0_2])) + ((androidx.datastore.preferences.protobuf.l.s0((v8_1.b[v0_2] >> 3)) + androidx.datastore.preferences.protobuf.l.r0(2)) + (androidx.datastore.preferences.protobuf.l.r0(1) * 2)));
                v0_2++;
            }
            v8_1.d = v1_0;
            return v1_0;
        } else {
            return v0_1;
        }
    }

    public final androidx.datastore.preferences.protobuf.v i()
    {
        androidx.datastore.preferences.protobuf.v v0_0 = this.a;
        if (!(v0_0 instanceof androidx.datastore.preferences.protobuf.v)) {
            return ((androidx.datastore.preferences.protobuf.t) ((androidx.datastore.preferences.protobuf.v) v0_0).c(5)).b();
        } else {
            return ((androidx.datastore.preferences.protobuf.v) v0_0).i();
        }
    }
}
