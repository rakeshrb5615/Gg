package com.google.android.gms.common.wrappers;
public class Wrappers {
    private static final com.google.android.gms.common.wrappers.Wrappers zzb;
    private com.google.android.gms.common.wrappers.PackageManagerWrapper zza;

    static Wrappers()
    {
        com.google.android.gms.common.wrappers.Wrappers.zzb = new com.google.android.gms.common.wrappers.Wrappers();
        return;
    }

    public Wrappers()
    {
        this.zza = 0;
        return;
    }

    public static com.google.android.gms.common.wrappers.PackageManagerWrapper packageManager(android.content.Context p1)
    {
        return com.google.android.gms.common.wrappers.Wrappers.zzb.zza(p1);
    }

    public final declared_synchronized com.google.android.gms.common.wrappers.PackageManagerWrapper zza(android.content.Context p2)
    {
        if (this.zza == null) {
            if (p2.getApplicationContext() != null) {
                p2 = p2.getApplicationContext();
            }
            this.zza = new com.google.android.gms.common.wrappers.PackageManagerWrapper(p2);
        }
        return this.zza;
    }
}
