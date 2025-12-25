package androidx.datastore.preferences.protobuf;
public final class e1 extends androidx.datastore.preferences.protobuf.g1 {
    public final synthetic int b;

    public synthetic e1(sun.misc.Unsafe p1, int p2)
    {
        this.b = p2;
        super(p1);
        return;
    }

    public final boolean c(long p2, Object p4)
    {
        switch (this.b) {
            case 0:
                boolean v2_2;
                if (!androidx.datastore.preferences.protobuf.h1.g) {
                    v2_2 = androidx.datastore.preferences.protobuf.h1.c(p2, p4);
                } else {
                    v2_2 = androidx.datastore.preferences.protobuf.h1.b(p2, p4);
                }
                return v2_2;
            default:
                boolean v2_1;
                if (!androidx.datastore.preferences.protobuf.h1.g) {
                    v2_1 = androidx.datastore.preferences.protobuf.h1.c(p2, p4);
                } else {
                    v2_1 = androidx.datastore.preferences.protobuf.h1.b(p2, p4);
                }
                return v2_1;
        }
    }

    public final double d(long p2, Object p4)
    {
        switch (this.b) {
            case 0:
                return Double.longBitsToDouble(this.g(p2, p4));
            default:
                return Double.longBitsToDouble(this.g(p2, p4));
        }
    }

    public final float e(long p2, Object p4)
    {
        switch (this.b) {
            case 0:
                return Float.intBitsToFloat(this.f(p2, p4));
            default:
                return Float.intBitsToFloat(this.f(p2, p4));
        }
    }

    public final void j(Object p2, long p3, boolean p5)
    {
        switch (this.b) {
            case 0:
                if (!androidx.datastore.preferences.protobuf.h1.g) {
                    androidx.datastore.preferences.protobuf.h1.l(p2, p3, ((byte) p5));
                } else {
                    androidx.datastore.preferences.protobuf.h1.k(p2, p3, ((byte) p5));
                }
                return;
            default:
                if (!androidx.datastore.preferences.protobuf.h1.g) {
                    androidx.datastore.preferences.protobuf.h1.l(p2, p3, ((byte) p5));
                } else {
                    androidx.datastore.preferences.protobuf.h1.k(p2, p3, ((byte) p5));
                }
                return;
        }
    }

    public final void k(Object p2, long p3, byte p5)
    {
        switch (this.b) {
            case 0:
                if (!androidx.datastore.preferences.protobuf.h1.g) {
                    androidx.datastore.preferences.protobuf.h1.l(p2, p3, p5);
                } else {
                    androidx.datastore.preferences.protobuf.h1.k(p2, p3, p5);
                }
                return;
            default:
                if (!androidx.datastore.preferences.protobuf.h1.g) {
                    androidx.datastore.preferences.protobuf.h1.l(p2, p3, p5);
                } else {
                    androidx.datastore.preferences.protobuf.h1.k(p2, p3, p5);
                }
                return;
        }
    }

    public final void l(Object p7, long p8, double p10)
    {
        switch (this.b) {
            case 0:
                this.o(p7, p8, Double.doubleToLongBits(p10));
                return;
            default:
                this.o(p7, p8, Double.doubleToLongBits(p10));
                return;
        }
    }

    public final void m(Object p2, long p3, float p5)
    {
        switch (this.b) {
            case 0:
                this.n(p2, p3, Float.floatToIntBits(p5));
                return;
            default:
                this.n(p2, p3, Float.floatToIntBits(p5));
                return;
        }
    }

    public final boolean r()
    {
        switch (this.b) {
            case 0:
                return 0;
            default:
                return 0;
        }
    }
}
