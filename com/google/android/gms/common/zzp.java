package com.google.android.gms.common;
public final class zzp extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable$Creator CREATOR;
    private final String zza;
    private final boolean zzb;
    private final boolean zzc;
    private final android.content.Context zzd;
    private final boolean zze;
    private final boolean zzf;
    private final boolean zzg;

    static zzp()
    {
        com.google.android.gms.common.zzp.CREATOR = new com.google.android.gms.common.zzq();
        return;
    }

    public zzp(String p1, boolean p2, boolean p3, android.os.IBinder p4, boolean p5, boolean p6, boolean p7)
    {
        this.zza = p1;
        this.zzb = p2;
        this.zzc = p3;
        this.zzd = ((android.content.Context) com.google.android.gms.dynamic.ObjectWrapper.unwrap(com.google.android.gms.dynamic.IObjectWrapper$Stub.asInterface(p4)));
        this.zze = p5;
        this.zzf = p6;
        this.zzg = p7;
        return;
    }

    public final void writeToParcel(android.os.Parcel p4, int p5)
    {
        int v5_0 = this.zza;
        int v0 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(p4);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(p4, 1, v5_0, 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(p4, 2, this.zzb);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(p4, 3, this.zzc);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeIBinder(p4, 4, com.google.android.gms.dynamic.ObjectWrapper.wrap(this.zzd), 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(p4, 5, this.zze);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(p4, 6, this.zzf);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(p4, 8, this.zzg);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(p4, v0);
        return;
    }
}
