package com.google.android.gms.internal.auth;
public abstract class zze extends com.google.android.gms.internal.auth.zzb implements com.google.android.gms.internal.auth.zzf {

    public static com.google.android.gms.internal.auth.zzf zzb(android.os.IBinder p2)
    {
        if (p2 != 0) {
            com.google.android.gms.internal.auth.zzd v0_1 = p2.queryLocalInterface("com.google.android.auth.IAuthManagerService");
            if (!(v0_1 instanceof com.google.android.gms.internal.auth.zzf)) {
                return new com.google.android.gms.internal.auth.zzd(p2);
            } else {
                return ((com.google.android.gms.internal.auth.zzf) v0_1);
            }
        } else {
            return 0;
        }
    }
}
