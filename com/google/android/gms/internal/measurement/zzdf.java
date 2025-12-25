package com.google.android.gms.internal.measurement;
public final class zzdf extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable$Creator CREATOR;
    public final int zza;
    public final String zzb;
    public final android.content.Intent zzc;

    static zzdf()
    {
        com.google.android.gms.internal.measurement.zzdf.CREATOR = new com.google.android.gms.internal.measurement.zzdg();
        return;
    }

    public zzdf(int p1, String p2, android.content.Intent p3)
    {
        this.zza = p1;
        this.zzb = p2;
        this.zzc = p3;
        return;
    }

    public static com.google.android.gms.internal.measurement.zzdf zza(android.app.Activity p3)
    {
        return new com.google.android.gms.internal.measurement.zzdf(p3.hashCode(), p3.getClass().getCanonicalName(), p3.getIntent());
    }

    public final boolean equals(Object p5)
    {
        if (this != p5) {
            if ((p5 instanceof com.google.android.gms.internal.measurement.zzdf)) {
                if ((this.zza != ((com.google.android.gms.internal.measurement.zzdf) p5).zza) || ((!java.util.Objects.equals(this.zzb, ((com.google.android.gms.internal.measurement.zzdf) p5).zzb)) || (!java.util.Objects.equals(this.zzc, ((com.google.android.gms.internal.measurement.zzdf) p5).zzc)))) {
                    return 0;
                } else {
                    return 1;
                }
            } else {
                return 0;
            }
        } else {
            return 1;
        }
    }

    public final int hashCode()
    {
        return this.zza;
    }

    public final void writeToParcel(android.os.Parcel p5, int p6)
    {
        int v0_0 = this.zza;
        int v1 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(p5);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(p5, 1, v0_0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(p5, 2, this.zzb, 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(p5, 3, this.zzc, p6, 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(p5, v1);
        return;
    }
}
