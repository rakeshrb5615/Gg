package com.google.android.gms.measurement.internal;
public final class zzjh {

    public static void zza(android.os.Bundle p4, Object p5)
    {
        if (!(p5 instanceof Double)) {
            if (!(p5 instanceof Long)) {
                p4.putString("value", p5.toString());
                return;
            } else {
                p4.putLong("value", ((Long) p5).longValue());
                return;
            }
        } else {
            p4.putDouble("value", ((Double) p5).doubleValue());
            return;
        }
    }

    public static Object zzb(android.os.Bundle p3, String p4, Class p5, Object p6)
    {
        String v3_1 = p3.get(p4);
        if (v3_1 != null) {
            if (!p5.isAssignableFrom(v3_1.getClass())) {
                throw new IllegalStateException(v1.a.n(v1.a.r("Invalid conditional user property field type. \'", p4, "\' expected [", p5.getCanonicalName(), "] but was ["), v3_1.getClass().getCanonicalName(), "]"));
            } else {
                return v3_1;
            }
        } else {
            return p6;
        }
    }
}
