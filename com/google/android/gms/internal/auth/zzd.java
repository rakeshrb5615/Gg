package com.google.android.gms.internal.auth;
public final class zzd extends com.google.android.gms.internal.auth.zza implements com.google.android.gms.internal.auth.zzf {

    public zzd(android.os.IBinder p2)
    {
        super(p2, "com.google.android.auth.IAuthManagerService");
        return;
    }

    public final android.os.Bundle zzd(String p2, android.os.Bundle p3)
    {
        android.os.Parcel v0 = this.zza();
        v0.writeString(p2);
        com.google.android.gms.internal.auth.zzc.zzd(v0, p3);
        android.os.Parcel v2_2 = this.zzb(2, v0);
        android.os.Bundle v3_1 = ((android.os.Bundle) com.google.android.gms.internal.auth.zzc.zza(v2_2, android.os.Bundle.CREATOR));
        v2_2.recycle();
        return v3_1;
    }

    public final android.os.Bundle zze(android.accounts.Account p2, String p3, android.os.Bundle p4)
    {
        android.os.Parcel v0 = this.zza();
        com.google.android.gms.internal.auth.zzc.zzd(v0, p2);
        v0.writeString(p3);
        com.google.android.gms.internal.auth.zzc.zzd(v0, p4);
        android.os.Parcel v2_2 = this.zzb(5, v0);
        android.os.Bundle v3_2 = ((android.os.Bundle) com.google.android.gms.internal.auth.zzc.zza(v2_2, android.os.Bundle.CREATOR));
        v2_2.recycle();
        return v3_2;
    }

    public final android.os.Bundle zzf(android.accounts.Account p2)
    {
        android.os.Bundle v0_0 = this.zza();
        com.google.android.gms.internal.auth.zzc.zzd(v0_0, p2);
        android.os.Parcel v2_2 = this.zzb(7, v0_0);
        android.os.Bundle v0_3 = ((android.os.Bundle) com.google.android.gms.internal.auth.zzc.zza(v2_2, android.os.Bundle.CREATOR));
        v2_2.recycle();
        return v0_3;
    }

    public final android.os.Bundle zzg(String p2)
    {
        android.os.Bundle v0_0 = this.zza();
        v0_0.writeString(p2);
        android.os.Parcel v2_2 = this.zzb(8, v0_0);
        android.os.Bundle v0_3 = ((android.os.Bundle) com.google.android.gms.internal.auth.zzc.zza(v2_2, android.os.Bundle.CREATOR));
        v2_2.recycle();
        return v0_3;
    }

    public final com.google.android.gms.auth.AccountChangeEventsResponse zzh(com.google.android.gms.auth.AccountChangeEventsRequest p2)
    {
        com.google.android.gms.auth.AccountChangeEventsResponse v0_0 = this.zza();
        com.google.android.gms.internal.auth.zzc.zzd(v0_0, p2);
        android.os.Parcel v2_2 = this.zzb(3, v0_0);
        com.google.android.gms.auth.AccountChangeEventsResponse v0_3 = ((com.google.android.gms.auth.AccountChangeEventsResponse) com.google.android.gms.internal.auth.zzc.zza(v2_2, com.google.android.gms.auth.AccountChangeEventsResponse.CREATOR));
        v2_2.recycle();
        return v0_3;
    }
}
