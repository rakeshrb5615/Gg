package com.google.android.gms.internal.location;
public final class zzj extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable$Creator CREATOR;
    final int zza;
    final com.google.android.gms.internal.location.zzh zzb;
    final com.google.android.gms.location.zzt zzc;
    final com.google.android.gms.internal.location.zzr zzd;

    static zzj()
    {
        com.google.android.gms.internal.location.zzj.CREATOR = new com.google.android.gms.internal.location.zzk();
        return;
    }

    public zzj(int p1, com.google.android.gms.internal.location.zzh p2, android.os.IBinder p3, android.os.IBinder p4)
    {
        boolean v2_2;
        this.zza = p1;
        this.zzb = p2;
        com.google.android.gms.internal.location.zzp v1_4 = 0;
        if (p3 != null) {
            v2_2 = com.google.android.gms.location.zzs.zzb(p3);
        } else {
            v2_2 = 0;
        }
        this.zzc = v2_2;
        if (p4 != null) {
            com.google.android.gms.internal.location.zzp v1_2 = p4.queryLocalInterface("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
            if (!(v1_2 instanceof com.google.android.gms.internal.location.zzr)) {
                v1_4 = new com.google.android.gms.internal.location.zzp(p4);
            } else {
                v1_4 = ((com.google.android.gms.internal.location.zzr) v1_2);
            }
        }
        this.zzd = v1_4;
        return;
    }

    public final void writeToParcel(android.os.Parcel p5, int p6)
    {
        int v6_1;
        int v0 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(p5);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(p5, 1, this.zza);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(p5, 2, this.zzb, p6, 0);
        int v6_4 = this.zzc;
        android.os.IBinder v1_0 = 0;
        if (v6_4 != 0) {
            v6_1 = v6_4.asBinder();
        } else {
            v6_1 = 0;
        }
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeIBinder(p5, 3, v6_1, 0);
        int v6_2 = this.zzd;
        if (v6_2 != 0) {
            v1_0 = v6_2.asBinder();
        }
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeIBinder(p5, 4, v1_0, 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(p5, v0);
        return;
    }
}
