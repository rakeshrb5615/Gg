package w6;
public final enum class v extends w6.x {

    public v()
    {
        super("LONG_OR_DOUBLE", 2);
        return;
    }

    public static Double b(String p6, e7.a p7)
    {
        a5.o v3_2 = Double.valueOf(p6);
        if (v3_2.isInfinite()) {
            if (p7.u != 1) {
                StringBuilder v5_1 = new StringBuilder("JSON forbids NaN and infinities: ");
                v5_1.append(v3_2);
                v5_1.append("; at path ");
                v5_1.append(p7.A(1));
                throw new androidx.datastore.preferences.protobuf.k(v5_1.toString());
            }
        } else {
            if (v3_2.isNaN()) {
            }
        }
        return v3_2;
    }

    public final Number a(e7.a p4)
    {
        String v0 = p4.M();
        if (v0.indexOf(46) < 0) {
            try {
                Double v4_3 = Long.valueOf(Long.parseLong(v0));
                return v4_3;
            } catch (NumberFormatException) {
                return w6.v.b(v0, v4_3);
            }
        } else {
            return w6.v.b(v0, p4);
        }
    }
}
