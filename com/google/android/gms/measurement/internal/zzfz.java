package com.google.android.gms.measurement.internal;
public final class zzfz extends com.google.android.gms.internal.measurement.zzbl implements com.google.android.gms.measurement.internal.zzgb {

    public zzfz(android.os.IBinder p2)
    {
        super(p2, "com.google.android.gms.measurement.internal.IMeasurementService");
        return;
    }

    public final void zzA(com.google.android.gms.measurement.internal.zzr p2)
    {
        android.os.Parcel v0 = this.zza();
        com.google.android.gms.internal.measurement.zzbn.zzc(v0, p2);
        this.zzc(27, v0);
        return;
    }

    public final void zzB(com.google.android.gms.measurement.internal.zzr p2, com.google.android.gms.measurement.internal.zzoo p3, com.google.android.gms.measurement.internal.zzgh p4)
    {
        android.os.Parcel v0 = this.zza();
        com.google.android.gms.internal.measurement.zzbn.zzc(v0, p2);
        com.google.android.gms.internal.measurement.zzbn.zzc(v0, p3);
        com.google.android.gms.internal.measurement.zzbn.zzd(v0, p4);
        this.zzc(29, v0);
        return;
    }

    public final void zzC(com.google.android.gms.measurement.internal.zzr p2, com.google.android.gms.measurement.internal.zzaf p3)
    {
        android.os.Parcel v0 = this.zza();
        com.google.android.gms.internal.measurement.zzbn.zzc(v0, p2);
        com.google.android.gms.internal.measurement.zzbn.zzc(v0, p3);
        this.zzc(30, v0);
        return;
    }

    public final void zzD(com.google.android.gms.measurement.internal.zzr p2, android.os.Bundle p3, com.google.android.gms.measurement.internal.zzge p4)
    {
        android.os.Parcel v0 = this.zza();
        com.google.android.gms.internal.measurement.zzbn.zzc(v0, p2);
        com.google.android.gms.internal.measurement.zzbn.zzc(v0, p3);
        com.google.android.gms.internal.measurement.zzbn.zzd(v0, p4);
        this.zzc(31, v0);
        return;
    }

    public final void zze(com.google.android.gms.measurement.internal.zzbg p2, com.google.android.gms.measurement.internal.zzr p3)
    {
        android.os.Parcel v0 = this.zza();
        com.google.android.gms.internal.measurement.zzbn.zzc(v0, p2);
        com.google.android.gms.internal.measurement.zzbn.zzc(v0, p3);
        this.zzc(1, v0);
        return;
    }

    public final void zzf(com.google.android.gms.measurement.internal.zzpl p2, com.google.android.gms.measurement.internal.zzr p3)
    {
        android.os.Parcel v0 = this.zza();
        com.google.android.gms.internal.measurement.zzbn.zzc(v0, p2);
        com.google.android.gms.internal.measurement.zzbn.zzc(v0, p3);
        this.zzc(2, v0);
        return;
    }

    public final void zzg(com.google.android.gms.measurement.internal.zzr p2)
    {
        android.os.Parcel v0 = this.zza();
        com.google.android.gms.internal.measurement.zzbn.zzc(v0, p2);
        this.zzc(4, v0);
        return;
    }

    public final void zzh(com.google.android.gms.measurement.internal.zzbg p1, String p2, String p3)
    {
        throw 0;
    }

    public final void zzi(com.google.android.gms.measurement.internal.zzr p2)
    {
        android.os.Parcel v0 = this.zza();
        com.google.android.gms.internal.measurement.zzbn.zzc(v0, p2);
        this.zzc(6, v0);
        return;
    }

    public final java.util.List zzj(com.google.android.gms.measurement.internal.zzr p2, boolean p3)
    {
        android.os.Parcel v0 = this.zza();
        com.google.android.gms.internal.measurement.zzbn.zzc(v0, p2);
        v0.writeInt(p3);
        android.os.Parcel v2_2 = this.zzP(7, v0);
        java.util.ArrayList v3_2 = v2_2.createTypedArrayList(com.google.android.gms.measurement.internal.zzpl.CREATOR);
        v2_2.recycle();
        return v3_2;
    }

    public final byte[] zzk(com.google.android.gms.measurement.internal.zzbg p2, String p3)
    {
        android.os.Parcel v0 = this.zza();
        com.google.android.gms.internal.measurement.zzbn.zzc(v0, p2);
        v0.writeString(p3);
        android.os.Parcel v2_2 = this.zzP(9, v0);
        byte[] v3_1 = v2_2.createByteArray();
        v2_2.recycle();
        return v3_1;
    }

    public final void zzl(long p2, String p4, String p5, String p6)
    {
        android.os.Parcel v0 = this.zza();
        v0.writeLong(p2);
        v0.writeString(p4);
        v0.writeString(p5);
        v0.writeString(p6);
        this.zzc(10, v0);
        return;
    }

    public final String zzm(com.google.android.gms.measurement.internal.zzr p2)
    {
        String v0_0 = this.zza();
        com.google.android.gms.internal.measurement.zzbn.zzc(v0_0, p2);
        android.os.Parcel v2_2 = this.zzP(11, v0_0);
        String v0_1 = v2_2.readString();
        v2_2.recycle();
        return v0_1;
    }

    public final void zzn(com.google.android.gms.measurement.internal.zzah p2, com.google.android.gms.measurement.internal.zzr p3)
    {
        android.os.Parcel v0 = this.zza();
        com.google.android.gms.internal.measurement.zzbn.zzc(v0, p2);
        com.google.android.gms.internal.measurement.zzbn.zzc(v0, p3);
        this.zzc(12, v0);
        return;
    }

    public final void zzo(com.google.android.gms.measurement.internal.zzah p1)
    {
        throw 0;
    }

    public final java.util.List zzp(String p2, String p3, boolean p4, com.google.android.gms.measurement.internal.zzr p5)
    {
        android.os.Parcel v0 = this.zza();
        v0.writeString(p2);
        v0.writeString(p3);
        v0.writeInt(p4);
        com.google.android.gms.internal.measurement.zzbn.zzc(v0, p5);
        android.os.Parcel v2_2 = this.zzP(14, v0);
        java.util.ArrayList v3_2 = v2_2.createTypedArrayList(com.google.android.gms.measurement.internal.zzpl.CREATOR);
        v2_2.recycle();
        return v3_2;
    }

    public final java.util.List zzq(String p2, String p3, String p4, boolean p5)
    {
        android.os.Parcel v2_0 = this.zza();
        v2_0.writeString(0);
        v2_0.writeString(p3);
        v2_0.writeString(p4);
        v2_0.writeInt(p5);
        android.os.Parcel v2_1 = this.zzP(15, v2_0);
        java.util.ArrayList v3_2 = v2_1.createTypedArrayList(com.google.android.gms.measurement.internal.zzpl.CREATOR);
        v2_1.recycle();
        return v3_2;
    }

    public final java.util.List zzr(String p2, String p3, com.google.android.gms.measurement.internal.zzr p4)
    {
        android.os.Parcel v0 = this.zza();
        v0.writeString(p2);
        v0.writeString(p3);
        com.google.android.gms.internal.measurement.zzbn.zzc(v0, p4);
        android.os.Parcel v2_2 = this.zzP(16, v0);
        java.util.ArrayList v3_1 = v2_2.createTypedArrayList(com.google.android.gms.measurement.internal.zzah.CREATOR);
        v2_2.recycle();
        return v3_1;
    }

    public final java.util.List zzs(String p2, String p3, String p4)
    {
        android.os.Parcel v2_0 = this.zza();
        v2_0.writeString(0);
        v2_0.writeString(p3);
        v2_0.writeString(p4);
        android.os.Parcel v2_1 = this.zzP(17, v2_0);
        java.util.ArrayList v3_1 = v2_1.createTypedArrayList(com.google.android.gms.measurement.internal.zzah.CREATOR);
        v2_1.recycle();
        return v3_1;
    }

    public final void zzt(com.google.android.gms.measurement.internal.zzr p2)
    {
        android.os.Parcel v0 = this.zza();
        com.google.android.gms.internal.measurement.zzbn.zzc(v0, p2);
        this.zzc(18, v0);
        return;
    }

    public final void zzu(android.os.Bundle p2, com.google.android.gms.measurement.internal.zzr p3)
    {
        android.os.Parcel v0 = this.zza();
        com.google.android.gms.internal.measurement.zzbn.zzc(v0, p2);
        com.google.android.gms.internal.measurement.zzbn.zzc(v0, p3);
        this.zzc(19, v0);
        return;
    }

    public final void zzv(com.google.android.gms.measurement.internal.zzr p2)
    {
        android.os.Parcel v0 = this.zza();
        com.google.android.gms.internal.measurement.zzbn.zzc(v0, p2);
        this.zzc(20, v0);
        return;
    }

    public final com.google.android.gms.measurement.internal.zzao zzw(com.google.android.gms.measurement.internal.zzr p2)
    {
        com.google.android.gms.measurement.internal.zzao v0_0 = this.zza();
        com.google.android.gms.internal.measurement.zzbn.zzc(v0_0, p2);
        android.os.Parcel v2_2 = this.zzP(21, v0_0);
        com.google.android.gms.measurement.internal.zzao v0_3 = ((com.google.android.gms.measurement.internal.zzao) com.google.android.gms.internal.measurement.zzbn.zzb(v2_2, com.google.android.gms.measurement.internal.zzao.CREATOR));
        v2_2.recycle();
        return v0_3;
    }

    public final java.util.List zzx(com.google.android.gms.measurement.internal.zzr p1, android.os.Bundle p2)
    {
        throw 0;
    }

    public final void zzy(com.google.android.gms.measurement.internal.zzr p2)
    {
        android.os.Parcel v0 = this.zza();
        com.google.android.gms.internal.measurement.zzbn.zzc(v0, p2);
        this.zzc(25, v0);
        return;
    }

    public final void zzz(com.google.android.gms.measurement.internal.zzr p2)
    {
        android.os.Parcel v0 = this.zza();
        com.google.android.gms.internal.measurement.zzbn.zzc(v0, p2);
        this.zzc(26, v0);
        return;
    }
}
