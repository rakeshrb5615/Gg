package com.google.android.gms.internal.location;
public final class zzeg extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable$Creator CREATOR;
    com.google.android.gms.location.LocationRequest zza;

    static zzeg()
    {
        com.google.android.gms.internal.location.zzeg.CREATOR = new com.google.android.gms.internal.location.zzeh();
        return;
    }

    public zzeg(com.google.android.gms.location.LocationRequest p3, java.util.List p4, boolean p5, boolean p6, boolean p7, boolean p8, String p9, long p10)
    {
        com.google.android.gms.location.LocationRequest$Builder v9_1 = new com.google.android.gms.location.LocationRequest$Builder(p3);
        if (p4 != 0) {
            com.google.android.gms.location.LocationRequest v3_1;
            if (!p4.isEmpty()) {
                v3_1 = new android.os.WorkSource();
                int v4_1 = p4.iterator();
                while (v4_1.hasNext()) {
                    String v0_2 = ((com.google.android.gms.common.internal.ClientIdentity) v4_1.next());
                    com.google.android.gms.common.util.WorkSourceUtil.add(v3_1, v0_2.uid, v0_2.packageName);
                }
            } else {
                v3_1 = 0;
            }
            v9_1.zzc(v3_1);
        }
        if (p5) {
            v9_1.setGranularity(1);
        }
        if (p6) {
            v9_1.zza(2);
        }
        if (p7) {
            v9_1.zzb(1);
        }
        if (p8) {
            v9_1.setWaitForAccurateLocation(1);
        }
        if (p10 != 9223372036854775807) {
            v9_1.setMaxUpdateAgeMillis(p10);
        }
        this.zza = v9_1.build();
        return;
    }

    public static com.google.android.gms.internal.location.zzeg zza(String p10, com.google.android.gms.location.LocationRequest p11)
    {
        return new com.google.android.gms.internal.location.zzeg(p11, 0, 0, 0, 0, 0, 0, 9223372036854775807);
    }

    public final boolean equals(Object p2)
    {
        if (!(p2 instanceof com.google.android.gms.internal.location.zzeg)) {
            return 0;
        } else {
            return com.google.android.gms.common.internal.Objects.equal(this.zza, ((com.google.android.gms.internal.location.zzeg) p2).zza);
        }
    }

    public final int hashCode()
    {
        return this.zza.hashCode();
    }

    public final String toString()
    {
        return this.zza.toString();
    }

    public final void writeToParcel(android.os.Parcel p5, int p6)
    {
        int v0 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(p5);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(p5, 1, this.zza, p6, 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(p5, v0);
        return;
    }
}
