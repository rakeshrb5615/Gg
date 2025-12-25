package com.google.android.gms.common.internal;
public abstract class zzac extends com.google.android.gms.internal.common.zzb implements com.google.android.gms.common.internal.zzad {

    public static com.google.android.gms.common.internal.zzad zzb(android.os.IBinder p2)
    {
        if (p2 != 0) {
            com.google.android.gms.common.internal.zzab v0_1 = p2.queryLocalInterface("com.google.android.gms.common.internal.IGoogleCertificatesApi");
            if (!(v0_1 instanceof com.google.android.gms.common.internal.zzad)) {
                return new com.google.android.gms.common.internal.zzab(p2);
            } else {
                return ((com.google.android.gms.common.internal.zzad) v0_1);
            }
        } else {
            return 0;
        }
    }
}
