package com.google.android.gms.internal.play_billing;
public final synthetic class zzcl {

    public static synthetic boolean zza(java.util.concurrent.atomic.AtomicReferenceFieldUpdater p1, Object p2, Object p3, Object p4)
    {
        while (!p1.compareAndSet(p2, p3, p4)) {
            if ((p1.get(p2) != p3) && (p1.get(p2) != p3)) {
                return 0;
            }
        }
        return 1;
    }
}
