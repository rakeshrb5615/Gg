package com.google.android.gms.internal.firebase-auth-api;
final class zzany implements java.security.PrivilegedExceptionAction {

    public zzany()
    {
        return;
    }

    public final synthetic Object run()
    {
        reflect.Field[] v1 = sun.misc.Unsafe.getDeclaredFields();
        int v2 = v1.length;
        int v3 = 0;
        while (v3 < v2) {
            boolean v5_1 = v1[v3];
            v5_1.setAccessible(1);
            Object v4_0 = v5_1.get(0);
            if (!sun.misc.Unsafe.isInstance(v4_0)) {
                v3++;
            } else {
                return ((sun.misc.Unsafe) sun.misc.Unsafe.cast(v4_0));
            }
        }
        return 0;
    }
}
