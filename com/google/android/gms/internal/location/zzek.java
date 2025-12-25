package com.google.android.gms.internal.location;
public final class zzek extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable implements com.google.android.gms.location.Geofence {
    public static final android.os.Parcelable$Creator CREATOR;
    private final String zza;
    private final long zzb;
    private final short zzc;
    private final double zzd;
    private final double zze;
    private final float zzf;
    private final int zzg;
    private final int zzh;
    private final int zzi;

    static zzek()
    {
        com.google.android.gms.internal.location.zzek.CREATOR = new com.google.android.gms.internal.location.zzel();
        return;
    }

    public zzek(String p3, int p4, short p5, double p6, double p8, float p10, long p11, int p13, int p14)
    {
        if ((p3 == null) || (p3.length() > 100)) {
            throw new IllegalArgumentException("requestId is null or too long: ".concat(String.valueOf(p3)));
        } else {
            if (p10 <= 0) {
                String v5_2 = new StringBuilder((String.valueOf(p10).length() + 16));
                v5_2.append("invalid radius: ");
                v5_2.append(p10);
                throw new IllegalArgumentException(v5_2.toString());
            } else {
                if ((p6 > 4636033603912859648) || (p6 < -4587338432941916160)) {
                    String v5_4 = new StringBuilder((String.valueOf(p6).length() + 18));
                    v5_4.append("invalid latitude: ");
                    v5_4.append(p6);
                    throw new IllegalArgumentException(v5_4.toString());
                } else {
                    if ((p8 > 4640537203540230144) || (p8 < -4582834833314545664)) {
                        String v5_6 = new StringBuilder((String.valueOf(p8).length() + 19));
                        v5_6.append("invalid longitude: ");
                        v5_6.append(p8);
                        throw new IllegalArgumentException(v5_6.toString());
                    } else {
                        int v0_11 = (p4 & 7);
                        if (v0_11 == 0) {
                            throw new IllegalArgumentException(v1.a.m(new StringBuilder((String.valueOf(p4).length() + 35)), "No supported transition specified: ", p4));
                        } else {
                            this.zzc = p5;
                            this.zza = p3;
                            this.zzd = p6;
                            this.zze = p8;
                            this.zzf = p10;
                            this.zzb = p11;
                            this.zzg = v0_11;
                            this.zzh = p13;
                            this.zzi = p14;
                            return;
                        }
                    }
                }
            }
        }
    }

    public final boolean equals(Object p8)
    {
        if (this != p8) {
            if ((!(p8 instanceof com.google.android.gms.internal.location.zzek)) || ((this.zzf != ((com.google.android.gms.internal.location.zzek) p8).zzf) || ((this.zzd != ((com.google.android.gms.internal.location.zzek) p8).zzd) || ((this.zze != ((com.google.android.gms.internal.location.zzek) p8).zze) || ((this.zzc != ((com.google.android.gms.internal.location.zzek) p8).zzc) || (this.zzg != ((com.google.android.gms.internal.location.zzek) p8).zzg)))))) {
                return 0;
            } else {
                return 1;
            }
        } else {
            return 1;
        }
    }

    public final long getExpirationTime()
    {
        return this.zzb;
    }

    public final double getLatitude()
    {
        return this.zzd;
    }

    public final int getLoiteringDelay()
    {
        return this.zzi;
    }

    public final double getLongitude()
    {
        return this.zze;
    }

    public final int getNotificationResponsiveness()
    {
        return this.zzh;
    }

    public final float getRadius()
    {
        return this.zzf;
    }

    public final String getRequestId()
    {
        return this.zza;
    }

    public final int getTransitionTypes()
    {
        return this.zzg;
    }

    public final int hashCode()
    {
        int v0_6 = Double.doubleToLongBits(this.zzd);
        int v0_9 = (v0_6 ^ (v0_6 >> 32));
        long v3_2 = Double.doubleToLongBits(this.zze);
        return (((((Float.floatToIntBits(this.zzf) + ((((((int) v0_9) + 31) * 31) + ((int) (v3_2 ^ (v3_2 >> 32)))) * 31)) * 31) + this.zzc) * 31) + this.zzg);
    }

    public final String toString()
    {
        String v0_8;
        String v0_0 = this.zzc;
        if (v0_0 == -1) {
            v0_8 = "INVALID";
        } else {
            if (v0_0 == 1) {
                v0_8 = "CIRCLE";
            } else {
                v0_8 = "UNKNOWN";
            }
        }
        String v2_3 = v0_8;
        this.zza.replaceAll("\\p{C}", "?");
        Integer.valueOf(this.zzg);
        Double.valueOf(this.zzd);
        Double.valueOf(this.zze);
        Float.valueOf(this.zzf);
        Integer.valueOf((this.zzh / 1000));
        Integer.valueOf(this.zzi);
        return String.format(java.util.Locale.US, "Geofence[%s id:%s transitions:%d %.6f, %.6f %.0fm, resp=%ds, dwell=%dms, @%d]", new Object[] {v2_3, Long.valueOf(this.zzb)}));
    }

    public final void writeToParcel(android.os.Parcel p4, int p5)
    {
        int v5_0 = this.zza;
        int v0 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(p4);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(p4, 1, v5_0, 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(p4, 2, this.zzb);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeShort(p4, 3, this.zzc);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeDouble(p4, 4, this.zzd);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeDouble(p4, 5, this.zze);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeFloat(p4, 6, this.zzf);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(p4, 7, this.zzg);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(p4, 8, this.zzh);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(p4, 9, this.zzi);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(p4, v0);
        return;
    }
}
