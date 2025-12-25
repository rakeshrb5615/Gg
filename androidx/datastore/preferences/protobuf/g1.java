package androidx.datastore.preferences.protobuf;
public abstract class g1 {
    public final sun.misc.Unsafe a;

    public g1(sun.misc.Unsafe p1)
    {
        this.a = p1;
        return;
    }

    public final int a(Class p2)
    {
        return this.a.arrayBaseOffset(p2);
    }

    public final int b(Class p2)
    {
        return this.a.arrayIndexScale(p2);
    }

    public abstract boolean c();

    public abstract double d();

    public abstract float e();

    public final int f(long p2, Object p4)
    {
        return this.a.getInt(p4, p2);
    }

    public final long g(long p2, Object p4)
    {
        return this.a.getLong(p4, p2);
    }

    public final Object h(long p2, Object p4)
    {
        return this.a.getObject(p4, p2);
    }

    public final long i(reflect.Field p3)
    {
        return this.a.objectFieldOffset(p3);
    }

    public abstract void j();

    public abstract void k();

    public abstract void l();

    public abstract void m();

    public final void n(Object p2, long p3, int p5)
    {
        this.a.putInt(p2, p3, p5);
        return;
    }

    public final void o(Object p7, long p8, long p10)
    {
        this.a.putLong(p7, p8, p10);
        return;
    }

    public final void p(Object p2, long p3, Object p5)
    {
        this.a.putObject(p2, p3, p5);
        return;
    }

    public boolean q()
    {
        Class v2_0 = this.a;
        if (v2_0 != null) {
            try {
                Class v2_1 = v2_0.getClass();
                v2_1.getMethod("objectFieldOffset", new Class[] {reflect.Field}));
                v2_1.getMethod("arrayBaseOffset", new Class[] {Class}));
                v2_1.getMethod("arrayIndexScale", new Class[] {Class}));
                Class v4_2 = Long.TYPE;
                v2_1.getMethod("getInt", new Class[] {Object, v4_2}));
                v2_1.getMethod("putInt", new Class[] {Object, v4_2, Integer.TYPE}));
                v2_1.getMethod("getLong", new Class[] {Object, v4_2}));
                v2_1.getMethod("putLong", new Class[] {Object, v4_2, v4_2}));
                v2_1.getMethod("getObject", new Class[] {Object, v4_2}));
                v2_1.getMethod("putObject", new Class[] {Object, v4_2, Object}));
                return 1;
            } catch (Throwable v0_9) {
                androidx.datastore.preferences.protobuf.h1.a(v0_9);
                return 0;
            }
        } else {
            return 0;
        }
    }

    public abstract boolean r();
}
