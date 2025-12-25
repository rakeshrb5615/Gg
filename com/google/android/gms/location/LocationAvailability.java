package com.google.android.gms.location;
public final class LocationAvailability extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable implements com.google.android.gms.common.internal.ReflectedParcelable {
    public static final android.os.Parcelable$Creator CREATOR;
    public static final com.google.android.gms.location.LocationAvailability zza;
    public static final com.google.android.gms.location.LocationAvailability zzb;
    final int zzc;
    private final int zzd;
    private final int zze;
    private final long zzf;
    private final com.google.android.gms.location.zzal[] zzg;

    static LocationAvailability()
    {
        com.google.android.gms.location.LocationAvailability.zza = new com.google.android.gms.location.LocationAvailability(0, 1, 1, 0, 0, 1);
        com.google.android.gms.location.LocationAvailability.zzb = new com.google.android.gms.location.LocationAvailability(1000, 1, 1, 0, 0, 0);
        com.google.android.gms.location.LocationAvailability.CREATOR = new com.google.android.gms.location.zzab();
        return;
    }

    public LocationAvailability(int p1, int p2, int p3, long p4, com.google.android.gms.location.zzal[] p6, boolean p7)
    {
        p7 = 1000;
        if (p1 < 1000) {
            p7 = 0;
        }
        this.zzc = p7;
        this.zzd = p2;
        this.zze = p3;
        this.zzf = p4;
        this.zzg = p6;
        return;
    }

    public static com.google.android.gms.location.LocationAvailability extractLocationAvailability(android.content.Intent p2)
    {
        if (com.google.android.gms.location.LocationAvailability.hasLocationAvailability(p2)) {
            try {
                return ((com.google.android.gms.location.LocationAvailability) p2.getParcelableExtra("com.google.android.gms.location.EXTRA_LOCATION_AVAILABILITY"));
            } catch (ClassCastException) {
                return 0;
            }
        } else {
            return 0;
        }
    }

    public static boolean hasLocationAvailability(android.content.Intent p1)
    {
        if ((p1 == 0) || (!p1.hasExtra("com.google.android.gms.location.EXTRA_LOCATION_AVAILABILITY"))) {
            return 0;
        } else {
            return 1;
        }
    }

    public boolean equals(Object p7)
    {
        if ((!(p7 instanceof com.google.android.gms.location.LocationAvailability)) || ((this.zzd != ((com.google.android.gms.location.LocationAvailability) p7).zzd) || ((this.zze != ((com.google.android.gms.location.LocationAvailability) p7).zze) || ((this.zzf != ((com.google.android.gms.location.LocationAvailability) p7).zzf) || ((this.zzc != ((com.google.android.gms.location.LocationAvailability) p7).zzc) || (!java.util.Arrays.equals(this.zzg, ((com.google.android.gms.location.LocationAvailability) p7).zzg))))))) {
            return 0;
        } else {
            return 1;
        }
    }

    public int hashCode()
    {
        return com.google.android.gms.common.internal.Objects.hashCode(new Object[] {Integer.valueOf(this.zzc)}));
    }

    public boolean isLocationAvailable()
    {
        if (this.zzc >= 1000) {
            return 0;
        } else {
            return 1;
        }
    }

    public String toString()
    {
        String v0_0 = this.isLocationAvailable();
        StringBuilder v2_1 = new StringBuilder((String.valueOf(v0_0).length() + 22));
        v2_1.append("LocationAvailability[");
        v2_1.append(v0_0);
        v2_1.append("]");
        return v2_1.toString();
    }

    public void writeToParcel(android.os.Parcel p5, int p6)
    {
        boolean v0_0 = this.zzd;
        int v1 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(p5);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(p5, 1, v0_0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(p5, 2, this.zze);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(p5, 3, this.zzf);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(p5, 4, this.zzc);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeTypedArray(p5, 5, this.zzg, p6, 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(p5, 6, this.isLocationAvailable());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(p5, v1);
        return;
    }
}
