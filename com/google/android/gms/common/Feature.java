package com.google.android.gms.common;
public class Feature extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable$Creator CREATOR;
    private final String zza;
    private final int zzb;
    private final long zzc;

    static Feature()
    {
        com.google.android.gms.common.Feature.CREATOR = new com.google.android.gms.common.zzb();
        return;
    }

    public Feature(String p1, int p2, long p3)
    {
        this.zza = p1;
        this.zzb = p2;
        this.zzc = p3;
        return;
    }

    public Feature(String p1, long p2)
    {
        this.zza = p1;
        this.zzc = p2;
        this.zzb = -1;
        return;
    }

    public final boolean equals(Object p7)
    {
        if (((!(p7 instanceof com.google.android.gms.common.Feature)) || (((this.getName() == null) || (!this.getName().equals(((com.google.android.gms.common.Feature) p7).getName()))) && ((this.getName() != null) || (((com.google.android.gms.common.Feature) p7).getName() != null)))) || (this.getVersion() != ((com.google.android.gms.common.Feature) p7).getVersion())) {
            return 0;
        } else {
            return 1;
        }
    }

    public String getName()
    {
        return this.zza;
    }

    public long getVersion()
    {
        long v0_0 = this.zzc;
        if (v0_0 == -1) {
            v0_0 = ((long) this.zzb);
        }
        return v0_0;
    }

    public final int hashCode()
    {
        return com.google.android.gms.common.internal.Objects.hashCode(new Object[] {this.getName(), Long.valueOf(this.getVersion())}));
    }

    public final String toString()
    {
        String v0_0 = com.google.android.gms.common.internal.Objects.toStringHelper(this);
        v0_0.add("name", this.getName());
        v0_0.add("version", Long.valueOf(this.getVersion()));
        return v0_0.toString();
    }

    public final void writeToParcel(android.os.Parcel p4, int p5)
    {
        p5 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(p4);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(p4, 1, this.getName(), 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(p4, 2, this.zzb);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(p4, 3, this.getVersion());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(p4, p5);
        return;
    }
}
