package com.google.android.gms.internal.play_billing;
public abstract synthetic class a {

    public static synthetic boolean a(sun.misc.Unsafe p1, Object p2, long p3, Object p5, Object p6)
    {
        while (!p1.compareAndSwapObject(p2, p3, p5, p6)) {
            if (p1.getObject(p2, p3) != p5) {
                return 0;
            }
        }
        return 1;
    }
}
