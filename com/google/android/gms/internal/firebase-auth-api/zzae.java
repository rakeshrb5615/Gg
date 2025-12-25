package com.google.android.gms.internal.firebase-auth-api;
final class zzae {

    public static int zza(int p2, String p3)
    {
        if (p2 < null) {
            StringBuilder v1_1 = new StringBuilder();
            v1_1.append(p3);
            v1_1.append(" cannot be negative but was: ");
            v1_1.append(p2);
            throw new IllegalArgumentException(v1_1.toString());
        } else {
            return p2;
        }
    }

    public static void zza(Object p2, Object p3)
    {
        if (p2 == null) {
            throw new NullPointerException("null key in entry: null=".concat(String.valueOf(p3)));
        } else {
            if (p3 == null) {
                throw new NullPointerException(v1.a.l("null value in entry: ", String.valueOf(p2), "=null"));
            } else {
                return;
            }
        }
    }
}
