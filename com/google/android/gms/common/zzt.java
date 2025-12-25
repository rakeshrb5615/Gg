package com.google.android.gms.common;
public final class zzt extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable$Creator CREATOR;
    private final String zza;
    private final com.google.android.gms.common.zzj zzb;
    private final boolean zzc;
    private final boolean zzd;

    static zzt()
    {
        com.google.android.gms.common.zzt.CREATOR = new com.google.android.gms.common.zzu();
        return;
    }

    public zzt(String p3, android.os.IBinder p4, boolean p5, boolean p6)
    {
        this.zza = p3;
        com.google.android.gms.common.zzk v3_2 = 0;
        if (p4 != null) {
            try {
                byte[] v4_3;
                byte[] v4_5 = com.google.android.gms.common.internal.zzw.zzg(p4).zzd();
            } catch (byte[] v4_1) {
                android.util.Log.e("GoogleCertificatesQuery", "Could not unwrap certificate", v4_1);
            }
            if (v4_5 != null) {
                v4_3 = ((byte[]) com.google.android.gms.dynamic.ObjectWrapper.unwrap(v4_5));
            } else {
                v4_3 = 0;
            }
            if (v4_3 == null) {
                android.util.Log.e("GoogleCertificatesQuery", "Could not unwrap certificate");
            } else {
                v3_2 = new com.google.android.gms.common.zzk(v4_3);
            }
        }
        this.zzb = v3_2;
        this.zzc = p5;
        this.zzd = p6;
        return;
    }

    public zzt(String p1, com.google.android.gms.common.zzj p2, boolean p3, boolean p4)
    {
        this.zza = p1;
        this.zzb = p2;
        this.zzc = p3;
        this.zzd = p4;
        return;
    }

    public final void writeToParcel(android.os.Parcel p4, int p5)
    {
        int v5_0 = this.zza;
        int v0 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(p4);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(p4, 1, v5_0, 0);
        int v5_1 = this.zzb;
        if (v5_1 == 0) {
            android.util.Log.w("GoogleCertificatesQuery", "certificate binder is null");
            v5_1 = 0;
        }
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeIBinder(p4, 2, v5_1, 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(p4, 3, this.zzc);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(p4, 4, this.zzd);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(p4, v0);
        return;
    }
}
