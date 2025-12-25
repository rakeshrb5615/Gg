package d1;
public final class h extends androidx.datastore.preferences.protobuf.v {
    public static final int BOOLEAN_FIELD_NUMBER = 1;
    public static final int BYTES_FIELD_NUMBER = 8;
    private static final d1.h DEFAULT_INSTANCE = None;
    public static final int DOUBLE_FIELD_NUMBER = 7;
    public static final int FLOAT_FIELD_NUMBER = 2;
    public static final int INTEGER_FIELD_NUMBER = 3;
    public static final int LONG_FIELD_NUMBER = 4;
    private static volatile androidx.datastore.preferences.protobuf.q0 PARSER = None;
    public static final int STRING_FIELD_NUMBER = 5;
    public static final int STRING_SET_FIELD_NUMBER = 6;
    private int valueCase_;
    private Object value_;

    static h()
    {
        d1.h v0_1 = new d1.h();
        d1.h.DEFAULT_INSTANCE = v0_1;
        androidx.datastore.preferences.protobuf.v.j(d1.h, v0_1);
        return;
    }

    public h()
    {
        this.valueCase_ = 0;
        return;
    }

    public static d1.g D()
    {
        return ((d1.g) ((androidx.datastore.preferences.protobuf.t) d1.h.DEFAULT_INSTANCE.c(5)));
    }

    public static void l(d1.h p1, long p2)
    {
        p1.valueCase_ = 4;
        p1.value_ = Long.valueOf(p2);
        return;
    }

    public static void m(d1.h p1, String p2)
    {
        p1.getClass();
        p1.valueCase_ = 5;
        p1.value_ = p2;
        return;
    }

    public static void n(d1.h p0, d1.f p1)
    {
        p0.getClass();
        p0.value_ = p1;
        p0.valueCase_ = 6;
        return;
    }

    public static void o(d1.h p1, double p2)
    {
        p1.valueCase_ = 7;
        p1.value_ = Double.valueOf(p2);
        return;
    }

    public static void p(d1.h p1, androidx.datastore.preferences.protobuf.g p2)
    {
        p1.getClass();
        p1.valueCase_ = 8;
        p1.value_ = p2;
        return;
    }

    public static void q(d1.h p1, boolean p2)
    {
        p1.valueCase_ = 1;
        p1.value_ = Boolean.valueOf(p2);
        return;
    }

    public static void r(d1.h p1, float p2)
    {
        p1.valueCase_ = 2;
        p1.value_ = Float.valueOf(p2);
        return;
    }

    public static void s(d1.h p1, int p2)
    {
        p1.valueCase_ = 3;
        p1.value_ = Integer.valueOf(p2);
        return;
    }

    public static d1.h v()
    {
        return d1.h.DEFAULT_INSTANCE;
    }

    public final String A()
    {
        if (this.valueCase_ != 5) {
            return "";
        } else {
            return ((String) this.value_);
        }
    }

    public final d1.f B()
    {
        if (this.valueCase_ != 6) {
            return d1.f.m();
        } else {
            return ((d1.f) this.value_);
        }
    }

    public final int C()
    {
        switch (this.valueCase_) {
            case 0:
                return 9;
            case 1:
                return 1;
            case 2:
                return 2;
            case 3:
                return 3;
            case 4:
                return 4;
            case 5:
                return 5;
            case 6:
                return 6;
            case 7:
                return 7;
            case 8:
                return 8;
            default:
                return 0;
        }
    }

    public final Object c(int p4)
    {
        switch (u.e.c(p4)) {
            case 0:
                return Byte.valueOf(1);
            case 1:
                return 0;
            case 2:
                return new androidx.datastore.preferences.protobuf.t0(d1.h.DEFAULT_INSTANCE, "\u0001\u0008\u0001\u0000\u0001\u0008\u0008\u0000\u0000\u0000\u0001:\u0000\u00024\u0000\u00037\u0000\u00045\u0000\u0005;\u0000\u0006<\u0000\u00073\u0000\u0008=\u0000", new Object[] {"value_", "valueCase_", d1.f}));
            case 3:
                return new d1.h();
            case 4:
                return new d1.g(d1.h.DEFAULT_INSTANCE);
            case 5:
                return d1.h.DEFAULT_INSTANCE;
            case 6:
                androidx.datastore.preferences.protobuf.u v4_11 = d1.h.PARSER;
                if (v4_11 != null) {
                    return v4_11;
                } else {
                    androidx.datastore.preferences.protobuf.u v4_2 = d1.h.PARSER;
                    if (v4_2 == null) {
                        v4_2 = new androidx.datastore.preferences.protobuf.u();
                        d1.h.PARSER = v4_2;
                    }
                    return v4_2;
                }
            default:
                throw new UnsupportedOperationException();
        }
    }

    public final boolean t()
    {
        if (this.valueCase_ != 1) {
            return 0;
        } else {
            return ((Boolean) this.value_).booleanValue();
        }
    }

    public final androidx.datastore.preferences.protobuf.g u()
    {
        if (this.valueCase_ != 8) {
            return androidx.datastore.preferences.protobuf.g.c;
        } else {
            return ((androidx.datastore.preferences.protobuf.g) this.value_);
        }
    }

    public final double w()
    {
        if (this.valueCase_ != 7) {
            return 0;
        } else {
            return ((Double) this.value_).doubleValue();
        }
    }

    public final float x()
    {
        if (this.valueCase_ != 2) {
            return 0;
        } else {
            return ((Float) this.value_).floatValue();
        }
    }

    public final int y()
    {
        if (this.valueCase_ != 3) {
            return 0;
        } else {
            return ((Integer) this.value_).intValue();
        }
    }

    public final long z()
    {
        if (this.valueCase_ != 4) {
            return 0;
        } else {
            return ((Long) this.value_).longValue();
        }
    }
}
