package com.google.android.gms.internal.ads_identifier;
public abstract class zze extends com.google.android.gms.internal.ads_identifier.zzb implements com.google.android.gms.internal.ads_identifier.zzf {

    public static com.google.android.gms.internal.ads_identifier.zzf zza(android.os.IBinder p2)
    {
        if (p2 != 0) {
            com.google.android.gms.internal.ads_identifier.zzd v0_1 = p2.queryLocalInterface("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
            if (!(v0_1 instanceof com.google.android.gms.internal.ads_identifier.zzf)) {
                return new com.google.android.gms.internal.ads_identifier.zzd(p2);
            } else {
                return ((com.google.android.gms.internal.ads_identifier.zzf) v0_1);
            }
        } else {
            return 0;
        }
    }
}
