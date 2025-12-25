package androidx.datastore.preferences.protobuf;
public final class f1 extends androidx.datastore.preferences.protobuf.g1 {

    public final boolean c(long p2, Object p4)
    {
        return this.a.getBoolean(p4, p2);
    }

    public final double d(long p2, Object p4)
    {
        return this.a.getDouble(p4, p2);
    }

    public final float e(long p2, Object p4)
    {
        return this.a.getFloat(p4, p2);
    }

    public final void j(Object p2, long p3, boolean p5)
    {
        this.a.putBoolean(p2, p3, p5);
        return;
    }

    public final void k(Object p2, long p3, byte p5)
    {
        this.a.putByte(p2, p3, p5);
        return;
    }

    public final void l(Object p7, long p8, double p10)
    {
        this.a.putDouble(p7, p8, p10);
        return;
    }

    public final void m(Object p2, long p3, float p5)
    {
        this.a.putFloat(p2, p3, p5);
        return;
    }

    public final boolean q()
    {
        if (super.q()) {
            try {
                Class v1_2 = this.a.getClass();
                Class v4 = Long.TYPE;
                v1_2.getMethod("getByte", new Class[] {Object, v4}));
                v1_2.getMethod("putByte", new Class[] {Object, v4, Byte.TYPE}));
                v1_2.getMethod("getBoolean", new Class[] {Object, v4}));
                v1_2.getMethod("putBoolean", new Class[] {Object, v4, Boolean.TYPE}));
                v1_2.getMethod("getFloat", new Class[] {Object, v4}));
                v1_2.getMethod("putFloat", new Class[] {Object, v4, Float.TYPE}));
                v1_2.getMethod("getDouble", new Class[] {Object, v4}));
                v1_2.getMethod("putDouble", new Class[] {Object, v4, Double.TYPE}));
                return 1;
            } catch (Throwable v0_3) {
                androidx.datastore.preferences.protobuf.h1.a(v0_3);
                return 0;
            }
        } else {
            return 0;
        }
    }

    public final boolean r()
    {
        Class v3_3 = this.a;
        if (v3_3 != null) {
            try {
                Class v3_4 = v3_3.getClass();
                v3_4.getMethod("objectFieldOffset", new Class[] {reflect.Field}));
                Class v5_0 = Long.TYPE;
                v3_4.getMethod("getLong", new Class[] {Object, v5_0}));
            } catch (Throwable v0_1) {
                androidx.datastore.preferences.protobuf.h1.a(v0_1);
            }
            if (androidx.datastore.preferences.protobuf.h1.g() != null) {
                try {
                    Class v3_2 = this.a.getClass();
                    v3_2.getMethod("getByte", new Class[] {v5_0}));
                    v3_2.getMethod("putByte", new Class[] {v5_0, Byte.TYPE}));
                    v3_2.getMethod("getInt", new Class[] {v5_0}));
                    v3_2.getMethod("putInt", new Class[] {v5_0, Integer.TYPE}));
                    v3_2.getMethod("getLong", new Class[] {v5_0}));
                    v3_2.getMethod("putLong", new Class[] {v5_0, v5_0}));
                    v3_2.getMethod("copyMemory", new Class[] {v5_0, v5_0, v5_0}));
                    v3_2.getMethod("copyMemory", new Class[] {Object, v5_0, Object, v5_0, v5_0}));
                    return 1;
                } catch (Throwable v0_3) {
                    androidx.datastore.preferences.protobuf.h1.a(v0_3);
                    return 0;
                }
            }
        }
        return 0;
    }
}
