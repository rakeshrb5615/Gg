package com.google.android.gms.internal.play_billing;
public final synthetic class zzcn implements java.security.PrivilegedExceptionAction {

    public synthetic zzcn()
    {
        return;
    }

    public final Object run()
    {
        String v1_0 = sun.misc.Unsafe.getDeclaredFields();
        int v2 = v1_0.length;
        int v3 = 0;
        while (v3 < v2) {
            Object v4_0 = v1_0[v3];
            v4_0.setAccessible(1);
            Object v4_1 = v4_0.get(0);
            if (!sun.misc.Unsafe.isInstance(v4_1)) {
                v3++;
            } else {
                return ((sun.misc.Unsafe) sun.misc.Unsafe.cast(v4_1));
            }
        }
        throw new NoSuchFieldError("the Unsafe");
    }
}
