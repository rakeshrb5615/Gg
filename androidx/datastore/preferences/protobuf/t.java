package androidx.datastore.preferences.protobuf;
public abstract class t implements java.lang.Cloneable {
    public final androidx.datastore.preferences.protobuf.v a;
    public androidx.datastore.preferences.protobuf.v b;

    public t(androidx.datastore.preferences.protobuf.v p2)
    {
        this.a = p2;
        if (p2.g()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        } else {
            this.b = p2.i();
            return;
        }
    }

    public final androidx.datastore.preferences.protobuf.v a()
    {
        androidx.datastore.preferences.protobuf.a1 v0_0 = this.b();
        v0_0.getClass();
        if (!androidx.datastore.preferences.protobuf.v.f(v0_0, 1)) {
            throw new androidx.datastore.preferences.protobuf.a1();
        } else {
            return v0_0;
        }
    }

    public final androidx.datastore.preferences.protobuf.v b()
    {
        if (this.b.g()) {
            androidx.datastore.preferences.protobuf.v v0_4 = this.b;
            v0_4.getClass();
            androidx.datastore.preferences.protobuf.u0 v1_1 = androidx.datastore.preferences.protobuf.r0.c;
            v1_1.getClass();
            v1_1.a(v0_4.getClass()).e(v0_4);
            v0_4.h();
            return this.b;
        } else {
            return this.b;
        }
    }

    public final Object clone()
    {
        androidx.datastore.preferences.protobuf.t v0_2 = ((androidx.datastore.preferences.protobuf.t) this.a.c(5));
        v0_2.b = this.b();
        return v0_2;
    }

    public final void d()
    {
        if (!this.b.g()) {
            androidx.datastore.preferences.protobuf.v v0_3 = this.a.i();
            androidx.datastore.preferences.protobuf.v v1 = this.b;
            androidx.datastore.preferences.protobuf.u0 v2_1 = androidx.datastore.preferences.protobuf.r0.c;
            v2_1.getClass();
            v2_1.a(v0_3.getClass()).b(v0_3, v1);
            this.b = v0_3;
        }
        return;
    }
}
