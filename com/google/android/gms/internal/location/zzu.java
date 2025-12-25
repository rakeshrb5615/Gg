package com.google.android.gms.internal.location;
public final class zzu extends com.google.android.gms.internal.location.zza implements com.google.android.gms.internal.location.zzv {

    public zzu(android.os.IBinder p2)
    {
        super(p2, "com.google.android.gms.location.internal.IGoogleLocationManagerService");
        return;
    }

    public final void zzA(android.location.Location p2)
    {
        android.os.Parcel v0 = this.zza();
        com.google.android.gms.internal.location.zzc.zzb(v0, p2);
        this.zzc(13, v0);
        return;
    }

    public final void zzB(android.location.Location p2, com.google.android.gms.common.api.internal.IStatusCallback p3)
    {
        android.os.Parcel v0 = this.zza();
        com.google.android.gms.internal.location.zzc.zzb(v0, p2);
        com.google.android.gms.internal.location.zzc.zzc(v0, p3);
        this.zzc(85, v0);
        return;
    }

    public final void zzC(com.google.android.gms.internal.location.zzr p2)
    {
        android.os.Parcel v0 = this.zza();
        com.google.android.gms.internal.location.zzc.zzc(v0, p2);
        this.zzc(67, v0);
        return;
    }

    public final void zzD(com.google.android.gms.location.LocationSettingsRequest p1, com.google.android.gms.internal.location.zzab p2, String p3)
    {
        p3 = this.zza();
        com.google.android.gms.internal.location.zzc.zzb(p3, p1);
        com.google.android.gms.internal.location.zzc.zzc(p3, p2);
        p3.writeString(0);
        this.zzc(63, p3);
        return;
    }

    public final void zzE(com.google.android.gms.internal.location.zzo p2)
    {
        android.os.Parcel v0 = this.zza();
        com.google.android.gms.internal.location.zzc.zzc(v0, p2);
        this.zzc(95, v0);
        return;
    }

    public final void zzF(com.google.android.gms.internal.location.zzj p2)
    {
        android.os.Parcel v0 = this.zza();
        com.google.android.gms.internal.location.zzc.zzb(v0, p2);
        this.zzc(75, v0);
        return;
    }

    public final void zzd(com.google.android.gms.location.GeofencingRequest p2, android.app.PendingIntent p3, com.google.android.gms.internal.location.zzt p4)
    {
        android.os.Parcel v0 = this.zza();
        com.google.android.gms.internal.location.zzc.zzb(v0, p2);
        com.google.android.gms.internal.location.zzc.zzb(v0, p3);
        com.google.android.gms.internal.location.zzc.zzc(v0, p4);
        this.zzc(57, v0);
        return;
    }

    public final void zze(com.google.android.gms.location.GeofencingRequest p2, android.app.PendingIntent p3, com.google.android.gms.common.api.internal.IStatusCallback p4)
    {
        android.os.Parcel v0 = this.zza();
        com.google.android.gms.internal.location.zzc.zzb(v0, p2);
        com.google.android.gms.internal.location.zzc.zzb(v0, p3);
        com.google.android.gms.internal.location.zzc.zzc(v0, p4);
        this.zzc(97, v0);
        return;
    }

    public final void zzf(com.google.android.gms.internal.location.zzem p2, com.google.android.gms.internal.location.zzt p3)
    {
        android.os.Parcel v0 = this.zza();
        com.google.android.gms.internal.location.zzc.zzb(v0, p2);
        com.google.android.gms.internal.location.zzc.zzc(v0, p3);
        this.zzc(74, v0);
        return;
    }

    public final void zzg(com.google.android.gms.internal.location.zzem p2, com.google.android.gms.common.api.internal.IStatusCallback p3)
    {
        android.os.Parcel v0 = this.zza();
        com.google.android.gms.internal.location.zzc.zzb(v0, p2);
        com.google.android.gms.internal.location.zzc.zzc(v0, p3);
        this.zzc(98, v0);
        return;
    }

    public final void zzh(long p1, boolean p3, android.app.PendingIntent p4)
    {
        p3 = this.zza();
        p3.writeLong(p1);
        p3.writeInt(1);
        com.google.android.gms.internal.location.zzc.zzb(p3, p4);
        this.zzc(5, p3);
        return;
    }

    public final void zzi(com.google.android.gms.location.zzb p2, android.app.PendingIntent p3, com.google.android.gms.common.api.internal.IStatusCallback p4)
    {
        android.os.Parcel v0 = this.zza();
        com.google.android.gms.internal.location.zzc.zzb(v0, p2);
        com.google.android.gms.internal.location.zzc.zzb(v0, p3);
        com.google.android.gms.internal.location.zzc.zzc(v0, p4);
        this.zzc(70, v0);
        return;
    }

    public final void zzj(com.google.android.gms.location.ActivityTransitionRequest p2, android.app.PendingIntent p3, com.google.android.gms.common.api.internal.IStatusCallback p4)
    {
        android.os.Parcel v0 = this.zza();
        com.google.android.gms.internal.location.zzc.zzb(v0, p2);
        com.google.android.gms.internal.location.zzc.zzb(v0, p3);
        com.google.android.gms.internal.location.zzc.zzc(v0, p4);
        this.zzc(72, v0);
        return;
    }

    public final void zzk(android.app.PendingIntent p2, com.google.android.gms.common.api.internal.IStatusCallback p3)
    {
        android.os.Parcel v0 = this.zza();
        com.google.android.gms.internal.location.zzc.zzb(v0, p2);
        com.google.android.gms.internal.location.zzc.zzc(v0, p3);
        this.zzc(73, v0);
        return;
    }

    public final void zzl(android.app.PendingIntent p2)
    {
        android.os.Parcel v0 = this.zza();
        com.google.android.gms.internal.location.zzc.zzb(v0, p2);
        this.zzc(6, v0);
        return;
    }

    public final void zzm(android.app.PendingIntent p2, com.google.android.gms.location.SleepSegmentRequest p3, com.google.android.gms.common.api.internal.IStatusCallback p4)
    {
        android.os.Parcel v0 = this.zza();
        com.google.android.gms.internal.location.zzc.zzb(v0, p2);
        com.google.android.gms.internal.location.zzc.zzb(v0, p3);
        com.google.android.gms.internal.location.zzc.zzc(v0, p4);
        this.zzc(79, v0);
        return;
    }

    public final void zzn(android.app.PendingIntent p2, com.google.android.gms.common.api.internal.IStatusCallback p3)
    {
        android.os.Parcel v0 = this.zza();
        com.google.android.gms.internal.location.zzc.zzb(v0, p2);
        com.google.android.gms.internal.location.zzc.zzc(v0, p3);
        this.zzc(69, v0);
        return;
    }

    public final void zzo(com.google.android.gms.location.zzad p2, com.google.android.gms.internal.location.zzee p3)
    {
        android.os.Parcel v0 = this.zza();
        com.google.android.gms.internal.location.zzc.zzb(v0, p2);
        com.google.android.gms.internal.location.zzc.zzb(v0, p3);
        this.zzc(91, v0);
        return;
    }

    public final com.google.android.gms.location.LocationAvailability zzp(String p2)
    {
        com.google.android.gms.location.LocationAvailability v0_0 = this.zza();
        v0_0.writeString(p2);
        android.os.Parcel v2_2 = this.zzb(34, v0_0);
        com.google.android.gms.location.LocationAvailability v0_3 = ((com.google.android.gms.location.LocationAvailability) com.google.android.gms.internal.location.zzc.zza(v2_2, com.google.android.gms.location.LocationAvailability.CREATOR));
        v2_2.recycle();
        return v0_3;
    }

    public final void zzq(com.google.android.gms.location.LastLocationRequest p2, com.google.android.gms.internal.location.zzee p3)
    {
        android.os.Parcel v0 = this.zza();
        com.google.android.gms.internal.location.zzc.zzb(v0, p2);
        com.google.android.gms.internal.location.zzc.zzb(v0, p3);
        this.zzc(90, v0);
        return;
    }

    public final void zzr(com.google.android.gms.location.LastLocationRequest p2, com.google.android.gms.internal.location.zzz p3)
    {
        android.os.Parcel v0 = this.zza();
        com.google.android.gms.internal.location.zzc.zzb(v0, p2);
        com.google.android.gms.internal.location.zzc.zzc(v0, p3);
        this.zzc(82, v0);
        return;
    }

    public final android.location.Location zzs()
    {
        android.os.Parcel v0_1 = this.zzb(7, this.zza());
        android.location.Location v1_3 = ((android.location.Location) com.google.android.gms.internal.location.zzc.zza(v0_1, android.location.Location.CREATOR));
        v0_1.recycle();
        return v1_3;
    }

    public final com.google.android.gms.common.internal.ICancelToken zzt(com.google.android.gms.location.CurrentLocationRequest p2, com.google.android.gms.internal.location.zzee p3)
    {
        android.os.Parcel v0 = this.zza();
        com.google.android.gms.internal.location.zzc.zzb(v0, p2);
        com.google.android.gms.internal.location.zzc.zzb(v0, p3);
        android.os.Parcel v2_2 = this.zzb(92, v0);
        com.google.android.gms.common.internal.ICancelToken v3_1 = com.google.android.gms.common.internal.ICancelToken$Stub.asInterface(v2_2.readStrongBinder());
        v2_2.recycle();
        return v3_1;
    }

    public final com.google.android.gms.common.internal.ICancelToken zzu(com.google.android.gms.location.CurrentLocationRequest p2, com.google.android.gms.internal.location.zzz p3)
    {
        android.os.Parcel v0 = this.zza();
        com.google.android.gms.internal.location.zzc.zzb(v0, p2);
        com.google.android.gms.internal.location.zzc.zzc(v0, p3);
        android.os.Parcel v2_2 = this.zzb(87, v0);
        com.google.android.gms.common.internal.ICancelToken v3_1 = com.google.android.gms.common.internal.ICancelToken$Stub.asInterface(v2_2.readStrongBinder());
        v2_2.recycle();
        return v3_1;
    }

    public final void zzv(com.google.android.gms.internal.location.zzei p2)
    {
        android.os.Parcel v0 = this.zza();
        com.google.android.gms.internal.location.zzc.zzb(v0, p2);
        this.zzc(59, v0);
        return;
    }

    public final void zzw(com.google.android.gms.internal.location.zzee p2, com.google.android.gms.location.LocationRequest p3, com.google.android.gms.common.api.internal.IStatusCallback p4)
    {
        android.os.Parcel v0 = this.zza();
        com.google.android.gms.internal.location.zzc.zzb(v0, p2);
        com.google.android.gms.internal.location.zzc.zzb(v0, p3);
        com.google.android.gms.internal.location.zzc.zzc(v0, p4);
        this.zzc(88, v0);
        return;
    }

    public final void zzx(com.google.android.gms.internal.location.zzee p2, com.google.android.gms.common.api.internal.IStatusCallback p3)
    {
        android.os.Parcel v0 = this.zza();
        com.google.android.gms.internal.location.zzc.zzb(v0, p2);
        com.google.android.gms.internal.location.zzc.zzc(v0, p3);
        this.zzc(89, v0);
        return;
    }

    public final void zzy(boolean p3)
    {
        android.os.Parcel v0 = this.zza();
        v0.writeInt(p3);
        this.zzc(12, v0);
        return;
    }

    public final void zzz(boolean p3, com.google.android.gms.common.api.internal.IStatusCallback p4)
    {
        android.os.Parcel v0 = this.zza();
        v0.writeInt(p3);
        com.google.android.gms.internal.location.zzc.zzc(v0, p4);
        this.zzc(84, v0);
        return;
    }
}
