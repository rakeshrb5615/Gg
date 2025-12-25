package com.google.android.gms.auth;
public class TokenData extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable implements com.google.android.gms.common.internal.ReflectedParcelable {
    public static final android.os.Parcelable$Creator CREATOR;
    final int zza;
    private final String zzb;
    private final Long zzc;
    private final boolean zzd;
    private final boolean zze;
    private final java.util.List zzf;
    private final String zzg;

    static TokenData()
    {
        com.google.android.gms.auth.TokenData.CREATOR = new com.google.android.gms.auth.zzm();
        return;
    }

    public TokenData(int p1, String p2, Long p3, boolean p4, boolean p5, java.util.List p6, String p7)
    {
        this.zza = p1;
        this.zzb = com.google.android.gms.common.internal.Preconditions.checkNotEmpty(p2);
        this.zzc = p3;
        this.zzd = p4;
        this.zze = p5;
        this.zzf = p6;
        this.zzg = p7;
        return;
    }

    public final boolean equals(Object p4)
    {
        if ((p4 instanceof com.google.android.gms.auth.TokenData)) {
            if ((!android.text.TextUtils.equals(this.zzb, ((com.google.android.gms.auth.TokenData) p4).zzb)) || ((!com.google.android.gms.common.internal.Objects.equal(this.zzc, ((com.google.android.gms.auth.TokenData) p4).zzc)) || ((this.zzd != ((com.google.android.gms.auth.TokenData) p4).zzd) || ((this.zze != ((com.google.android.gms.auth.TokenData) p4).zze) || ((!com.google.android.gms.common.internal.Objects.equal(this.zzf, ((com.google.android.gms.auth.TokenData) p4).zzf)) || (!com.google.android.gms.common.internal.Objects.equal(this.zzg, ((com.google.android.gms.auth.TokenData) p4).zzg))))))) {
                return 0;
            } else {
                return 1;
            }
        } else {
            return 0;
        }
    }

    public final int hashCode()
    {
        int v0_0 = this.zzb;
        Boolean.valueOf(this.zzd);
        Boolean.valueOf(this.zze);
        java.util.List v4 = this.zzf;
        return com.google.android.gms.common.internal.Objects.hashCode(new Object[] {v0_0, this.zzg}));
    }

    public final void writeToParcel(android.os.Parcel p4, int p5)
    {
        p5 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(p4);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(p4, 1, this.zza);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(p4, 2, this.zzb, 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLongObject(p4, 3, this.zzc, 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(p4, 4, this.zzd);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(p4, 5, this.zze);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeStringList(p4, 6, this.zzf, 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(p4, 7, this.zzg, 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(p4, p5);
        return;
    }

    public final String zza()
    {
        return this.zzb;
    }
}
