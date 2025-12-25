package com.google.android.gms.internal.location;
public final class zzei extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable$Creator CREATOR;
    private final int zza;
    private final com.google.android.gms.internal.location.zzeg zzb;
    private final com.google.android.gms.location.zzz zzc;
    private final com.google.android.gms.location.zzw zzd;
    private final android.app.PendingIntent zze;
    private final com.google.android.gms.internal.location.zzr zzf;
    private final String zzg;

    static zzei()
    {
        com.google.android.gms.internal.location.zzei.CREATOR = new com.google.android.gms.internal.location.zzej();
        return;
    }

    public zzei(int p1, com.google.android.gms.internal.location.zzeg p2, android.os.IBinder p3, android.os.IBinder p4, android.app.PendingIntent p5, android.os.IBinder p6, String p7)
    {
        boolean v2_3;
        this.zza = p1;
        this.zzb = p2;
        com.google.android.gms.internal.location.zzp v1_4 = 0;
        if (p3 == null) {
            v2_3 = 0;
        } else {
            v2_3 = com.google.android.gms.location.zzy.zzb(p3);
        }
        boolean v2_1;
        this.zzc = v2_3;
        this.zze = p5;
        if (p4 == null) {
            v2_1 = 0;
        } else {
            v2_1 = com.google.android.gms.location.zzv.zzb(p4);
        }
        this.zzd = v2_1;
        if (p6 != null) {
            com.google.android.gms.internal.location.zzp v1_2 = p6.queryLocalInterface("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
            if (!(v1_2 instanceof com.google.android.gms.internal.location.zzr)) {
                v1_4 = new com.google.android.gms.internal.location.zzp(p6);
            } else {
                v1_4 = ((com.google.android.gms.internal.location.zzr) v1_2);
            }
        }
        this.zzf = v1_4;
        this.zzg = p7;
        return;
    }

    public final void writeToParcel(android.os.Parcel p6, int p7)
    {
        String v0_1;
        String v0_0 = this.zza;
        int v1 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(p6);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(p6, 1, v0_0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(p6, 2, this.zzb, p7, 0);
        String v0_6 = this.zzc;
        android.os.IBinder v2_0 = 0;
        if (v0_6 != null) {
            v0_1 = v0_6.asBinder();
        } else {
            v0_1 = 0;
        }
        int v7_2;
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeIBinder(p6, 3, v0_1, 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(p6, 4, this.zze, p7, 0);
        int v7_1 = this.zzd;
        if (v7_1 != 0) {
            v7_2 = v7_1.asBinder();
        } else {
            v7_2 = 0;
        }
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeIBinder(p6, 5, v7_2, 0);
        int v7_3 = this.zzf;
        if (v7_3 != 0) {
            v2_0 = v7_3.asBinder();
        }
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeIBinder(p6, 6, v2_0, 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(p6, 8, this.zzg, 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(p6, v1);
        return;
    }
}
