package com.google.android.gms.measurement.internal;
public final class zzbe extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable implements java.lang.Iterable {
    public static final android.os.Parcelable$Creator CREATOR;
    private final android.os.Bundle zza;

    static zzbe()
    {
        com.google.android.gms.measurement.internal.zzbe.CREATOR = new com.google.android.gms.measurement.internal.zzbf();
        return;
    }

    public zzbe(android.os.Bundle p1)
    {
        this.zza = p1;
        return;
    }

    public final java.util.Iterator iterator()
    {
        return new com.google.android.gms.measurement.internal.zzbd(this);
    }

    public final String toString()
    {
        return this.zza.toString();
    }

    public final void writeToParcel(android.os.Parcel p4, int p5)
    {
        p5 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(p4);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBundle(p4, 2, this.zzf(), 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(p4, p5);
        return;
    }

    public final Object zza(String p2)
    {
        return this.zza.get(p2);
    }

    public final Long zzb(String p3)
    {
        return Long.valueOf(this.zza.getLong(p3));
    }

    public final Double zzc(String p3)
    {
        return Double.valueOf(this.zza.getDouble("value"));
    }

    public final String zzd(String p2)
    {
        return this.zza.getString(p2);
    }

    public final int zze()
    {
        return this.zza.size();
    }

    public final android.os.Bundle zzf()
    {
        return new android.os.Bundle(this.zza);
    }

    public final synthetic android.os.Bundle zzg()
    {
        return this.zza;
    }
}
