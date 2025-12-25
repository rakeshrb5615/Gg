package com.google.android.recaptcha.internal;
final class zzkl {

    public static void zza(boolean p2, String p3, long p4, long p6)
    {
        if (p2 == null) {
            StringBuilder v0_1 = new StringBuilder("overflow: ");
            v0_1.append(p3);
            v0_1.append("(");
            v0_1.append(p4);
            v0_1.append(", ");
            v0_1.append(p6);
            v0_1.append(")");
            throw new ArithmeticException(v0_1.toString());
        } else {
            return;
        }
    }

    public static void zzb(boolean p1)
    {
        if (p1 == null) {
            throw new ArithmeticException("mode was UNNECESSARY, but rounding was necessary");
        } else {
            return;
        }
    }
}
