package com.google.android.gms.measurement.internal;
public final class zzpl extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable$Creator CREATOR;
    public final int zza;
    public final String zzb;
    public final long zzc;
    public final Long zzd;
    public final String zze;
    public final String zzf;
    public final Double zzg;

    static zzpl()
    {
        com.google.android.gms.measurement.internal.zzpl.CREATOR = new com.google.android.gms.measurement.internal.zzpm();
        return;
    }

    public zzpl(int p1, String p2, long p3, Long p5, Float p6, String p7, String p8, Double p9)
    {
        this.zza = p1;
        this.zzb = p2;
        this.zzc = p3;
        this.zzd = p5;
        if (p1 == 1) {
            if (p6 == null) {
                p9 = 0;
            } else {
                p9 = Double.valueOf(p6.doubleValue());
            }
        }
        this.zzg = p9;
        this.zze = p7;
        this.zzf = p8;
        return;
    }

    public zzpl(com.google.android.gms.measurement.internal.zzpn p7)
    {
        this(p7.zzc, p7.zzd, p7.zze, p7.zzb);
        return;
    }

    public zzpl(String p2, long p3, Object p5, String p6)
    {
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(p2);
        this.zza = 2;
        this.zzb = p2;
        this.zzc = p3;
        this.zzf = p6;
        if (p5 != null) {
            if (!(p5 instanceof Long)) {
                if (!(p5 instanceof String)) {
                    if (!(p5 instanceof Double)) {
                        throw new IllegalArgumentException("User attribute given of un-supported type");
                    } else {
                        this.zzd = 0;
                        this.zzg = ((Double) p5);
                        this.zze = 0;
                        return;
                    }
                } else {
                    this.zzd = 0;
                    this.zzg = 0;
                    this.zze = ((String) p5);
                    return;
                }
            } else {
                this.zzd = ((Long) p5);
                this.zzg = 0;
                this.zze = 0;
                return;
            }
        } else {
            this.zzd = 0;
            this.zzg = 0;
            this.zze = 0;
            return;
        }
    }

    public final void writeToParcel(android.os.Parcel p1, int p2)
    {
        com.google.android.gms.measurement.internal.zzpm.zza(this, p1, p2);
        return;
    }

    public final Object zza()
    {
        int v0_0 = this.zzd;
        if (v0_0 == 0) {
            int v0_1 = this.zzg;
            if (v0_1 == 0) {
                int v0_2 = this.zze;
                if (v0_2 == 0) {
                    return 0;
                } else {
                    return v0_2;
                }
            } else {
                return v0_1;
            }
        } else {
            return v0_0;
        }
    }
}
