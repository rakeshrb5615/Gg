package com.google.android.gms.location;
public final class zzas extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable$Creator CREATOR;
    private final int zza;
    private final int zzb;
    private final int zzc;
    private final int zzd;

    static zzas()
    {
        com.google.android.gms.location.zzas.CREATOR = new com.google.android.gms.location.zzat();
        return;
    }

    public zzas(int p7, int p8, int p9, int p10)
    {
        String v3_2;
        int v1 = 1;
        if ((p7 < 0) || (p7 > 23)) {
            v3_2 = 0;
        } else {
            v3_2 = 1;
        }
        String v4_0;
        com.google.android.gms.common.internal.Preconditions.checkState(v3_2, "Start hour must be in range [0, 23].");
        if ((p8 < 0) || (p8 > 59)) {
            v4_0 = 0;
        } else {
            v4_0 = 1;
        }
        String v0_1;
        com.google.android.gms.common.internal.Preconditions.checkState(v4_0, "Start minute must be in range [0, 59].");
        if ((p9 < 0) || (p9 > 23)) {
            v0_1 = 0;
        } else {
            v0_1 = 1;
        }
        String v0_2;
        com.google.android.gms.common.internal.Preconditions.checkState(v0_1, "End hour must be in range [0, 23].");
        if ((p10 < 0) || (p10 > 59)) {
            v0_2 = 0;
        } else {
            v0_2 = 1;
        }
        com.google.android.gms.common.internal.Preconditions.checkState(v0_2, "End minute must be in range [0, 59].");
        if ((((p7 + p8) + p9) + p10) <= 0) {
            v1 = 0;
        }
        com.google.android.gms.common.internal.Preconditions.checkState(v1, "Parameters can\'t be all 0.");
        this.zza = p7;
        this.zzb = p8;
        this.zzc = p9;
        this.zzd = p10;
        return;
    }

    public final boolean equals(Object p5)
    {
        if (this != p5) {
            if ((p5 instanceof com.google.android.gms.location.zzas)) {
                if ((this.zza != ((com.google.android.gms.location.zzas) p5).zza) || ((this.zzb != ((com.google.android.gms.location.zzas) p5).zzb) || ((this.zzc != ((com.google.android.gms.location.zzas) p5).zzc) || (this.zzd != ((com.google.android.gms.location.zzas) p5).zzd)))) {
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
        return com.google.android.gms.common.internal.Objects.hashCode(new Object[] {Integer.valueOf(this.zza), Integer.valueOf(this.zzb), Integer.valueOf(this.zzc), Integer.valueOf(this.zzd)}));
    }

    public final String toString()
    {
        String v0_0 = this.zza;
        int v2 = this.zzb;
        int v4 = this.zzc;
        int v6 = this.zzd;
        StringBuilder v3_1 = new StringBuilder((((((((String.valueOf(v0_0).length() + 50) + String.valueOf(v2).length()) + 10) + String.valueOf(v4).length()) + 12) + String.valueOf(v6).length()) + 1));
        v3_1.append("UserPreferredSleepWindow [startHour=");
        v3_1.append(v0_0);
        v3_1.append(", startMinute=");
        v3_1.append(v2);
        v3_1.append(", endHour=");
        v3_1.append(v4);
        v3_1.append(", endMinute=");
        v3_1.append(v6);
        v3_1.append("]");
        return v3_1.toString();
    }

    public final void writeToParcel(android.os.Parcel p3, int p4)
    {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p3);
        int v4_0 = this.zza;
        int v0 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(p3);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(p3, 1, v4_0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(p3, 2, this.zzb);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(p3, 3, this.zzc);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(p3, 4, this.zzd);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(p3, v0);
        return;
    }
}
