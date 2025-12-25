package com.google.android.gms.auth;
final class zzi implements com.google.android.gms.auth.zzk {
    final synthetic com.google.android.gms.auth.AccountChangeEventsRequest zza;

    public zzi(com.google.android.gms.auth.AccountChangeEventsRequest p1)
    {
        this.zza = p1;
        return;
    }

    public final bridge synthetic Object zza(android.os.IBinder p2)
    {
        java.util.List v2_2 = com.google.android.gms.internal.auth.zze.zzb(p2).zzh(this.zza);
        com.google.android.gms.auth.zzl.zzd(v2_2);
        return v2_2.getEvents();
    }
}
